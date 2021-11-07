package org.tensorflow.lite.examples.classification.ui.home;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import org.tensorflow.lite.examples.classification.DetailsActivity;
import org.tensorflow.lite.examples.classification.R;
import org.tensorflow.lite.examples.classification.databinding.FragmentHomeBinding;

public class HomeFragment extends Fragment {

    private HomeViewModel homeViewModel;
    private FragmentHomeBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        homeViewModel = new ViewModelProvider(this).get(HomeViewModel.class);

        binding = FragmentHomeBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        final ImageView img1 = binding.imgHome1;
        final TextView txt1 = binding.txtHome1;
        final ImageView img2 = binding.imgHome2;
        final TextView txt2 = binding.txtHome2;
        final ImageView img3 = binding.imgHome3;
        final TextView txt3 = binding.txtHome3;
        final ImageView img4 = binding.imgHome4;
        final TextView txt4 = binding.txtHome4;

        img1.setImageResource(R.drawable.leffe);
        txt1.setText("Leffe");
        img2.setImageResource(R.drawable.duvel);
        txt2.setText("Duvel");
        img3.setImageResource(R.drawable.cara);
        txt3.setText("Cara");
        img4.setImageResource(R.drawable.jupiler);
        txt4.setText("Jupiler");

        img1.setOnClickListener(this::handlerImg1);
        img2.setOnClickListener(this::handlerImg2);
        img3.setOnClickListener(this::handlerImg3);
        img4.setOnClickListener(this::handlerImg4);

        return root;
    }

    public void handlerImg1(View view){
        String titel = "leffe";
        Intent intent = new Intent(this.getContext(), DetailsActivity.class);
        intent.putExtra("beer", titel);
        startActivity(intent);
    }


    public void handlerImg2(View view){
        String titel = "duvel";
        Intent intent = new Intent(this.getContext(), DetailsActivity.class);
        intent.putExtra("beer", titel);
        startActivity(intent);
    }

    public void handlerImg3(View view){
        String titel = "cara";
        Intent intent = new Intent(this.getContext(), DetailsActivity.class);
        intent.putExtra("beer", titel);
        startActivity(intent);

    }
    public void handlerImg4(View view){
        String titel = "jupiler";
        Intent intent = new Intent(this.getContext(), DetailsActivity.class);
        intent.putExtra("beer", titel);
        startActivity(intent);

    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}