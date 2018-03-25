package com.example.android.AnnisaAninditya_1202152334_studycase5;

import android.content.Context;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

/**
 * Created by ANNISANINDITYA on 3/24/2018.
 */


public class Adapter extends RecyclerView.Adapter<Adapter.holder> {
    private Context mcontex;
    private List<DataKegiatan> list;
    int color;

    public Adapter(Context cntx, List<DataKegiatan> list, int color){
        this.mcontex=cntx;
        this.list=list;
        this.color=color;
    }

    @Override
    public holder onCreateViewHolder(ViewGroup parent, int viewType) { // untuk menentukan viewholder untuk recycler view
        View view = LayoutInflater.from(mcontex).inflate(R.layout.cardview, parent, false);
        holder hldr = new holder(view);
        return hldr;
    }

    @Override
    public void onBindViewHolder(holder holder, int position) {
        DataKegiatan data = list.get(position);
        holder.ToDo.setText(data.getTodo());
        holder.Desc.setText(data.getDesc());
        holder.Priority.setText(data.getPrior());
        holder.card_view.setCardBackgroundColor(mcontex.getResources().getColor(this.color));
    }

    @Override
    public int getItemCount() { //mendapatkan jumlah list
        return list.size();
    }

    public DataKegiatan getData(int position){ //mendapatkan list dari adapter
        return list.get(position);
    }

    public void deleteData(int i){ //untuk menghapus list
        list.remove(i); //untuk menghapus item yang terpilih
        notifyItemRemoved(i); //memberikan notifikasi
        notifyItemRangeChanged(i, list.size());
    }

    class holder extends RecyclerView.ViewHolder{
        public TextView ToDo, Desc, Priority;
        public CardView card_view;
        public holder(View itemView){
            super(itemView);

            //view & cardview pada layout
            ToDo = itemView.findViewById(R.id.todo);
            Desc = itemView.findViewById(R.id.description);
            Priority = itemView.findViewById(R.id.number);
            card_view = itemView.findViewById(R.id.cardview);
        }
    }
}

