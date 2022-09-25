package com.google.android.apps.search.googleapp.accounts.p10126ui.features;

import android.support.p031v4.app.Fragment;
import android.view.View;
import androidx.lifecycle.C2333ah;
import com.google.android.googlequicksearchbox.R;

/* renamed from: com.google.android.apps.search.googleapp.accounts.ui.features.i */
/* compiled from: PG */
public final /* synthetic */ class C133321i implements C2333ah {

    /* renamed from: a */
    public final /* synthetic */ Fragment f363297a;

    public /* synthetic */ C133321i(Fragment fragment) {
        this.f363297a = fragment;
    }

    /* renamed from: hX */
    public final void mo774hX(Object obj) {
        Boolean bool = (Boolean) obj;
        View view = this.f363297a.getView();
        if (view != null) {
            View findViewById = view.findViewById(R.id.googleapp_account_menu_search_history_status_ve);
            int i = 8;
            if (bool != null && bool.booleanValue()) {
                i = 0;
            }
            findViewById.setVisibility(i);
        }
    }
}
