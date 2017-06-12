package example.permission;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import rxkotlin.grace.permission.KtPermission;
import rxkotlin.grace.permission.launcher.LaunchTask;

/**
 * Created by hongyang on 17-6-8.
 */

public class Fragment2 extends android.support.v4.app.Fragment {

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        KtPermission permission = new KtPermission(getActivity());
        permission.requestCameraMicroPhoneStorage().launcher(new LaunchTask() {

            @Override
            public void launch(boolean b) {
                if (b){
                    /**
                     * success
                     */
                }
            }
        });
    }
}