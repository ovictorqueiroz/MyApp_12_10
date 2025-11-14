package br.com.etecia.myapp;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;

public class ViewPagerAdapterBikes extends FragmentStateAdapter {

    public ViewPagerAdapterBikes(@NonNull FragmentActivity fragmentActivity) {
        super(fragmentActivity);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        switch (position){
            case 0:
                return new BikeCorridaFragment();

            case 1:
                return  new BikeCorridaFragment();

            default:
                return new BikeUrbanaFragment();
        }
    }

    @Override
    public int getItemCount() {
        return 4;
    }
}
