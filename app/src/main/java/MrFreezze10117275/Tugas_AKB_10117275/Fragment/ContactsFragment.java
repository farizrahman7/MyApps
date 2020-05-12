package MrFreezze10117275.Tugas_AKB_10117275.Fragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import MrFreezze10117275.Tugas_AKB_10117275.R;


/**
 * TANGGAL PENGERJAAN: 07 MEI 2020
 * NIM      : 10117275
 * NAMA     : MUHAMMAD FARIZ RAHMAN
 * KELAS    : IF-8
 */

public class ContactsFragment extends Fragment {


    public ContactsFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_kontak, container, false);
    }

}
