package MrFreezze10117275.Tugas_AKB_10117275;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

/**
 * TANGGAL PENGERJAAN: 07 MEI 2020
 * NIM      : 10117275
 * NAMA     : MUHAMMAD FARIZ RAHMAN
 * KELAS    : IF-8
 */

public class SmsListRecycler extends RecyclerView.Adapter<SmsViewHolder> {

    private List<SmsData> data;

    public SmsListRecycler(List<SmsData> data) {
        this.data = data;
    }

    @Override
    public SmsViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.row_sms, parent, false);
        return new SmsViewHolder(parent.getContext(), view);
    }

    @Override
    public void onBindViewHolder(SmsViewHolder holder, int position) {
        SmsData smsData = data.get(position);
        holder.bind(smsData);
    }

    @Override
    public int getItemCount() {
        return data.size();
    }
}
