package com.google.android.apps.search.weather;

import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.view.View;
import com.google.android.apps.search.weather.suggestions.C142147f;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.material.opensearchbar.C28559n;
import com.google.android.libraries.material.opensearchbar.OpenSearchView;
import com.google.android.material.tabs.TabLayout;

/* renamed from: com.google.android.apps.search.weather.r */
/* compiled from: PG */
public final /* synthetic */ class C142121r implements C28559n {

    /* renamed from: a */
    public final /* synthetic */ C142155u f385569a;

    /* renamed from: b */
    public final /* synthetic */ OpenSearchView f385570b;

    public /* synthetic */ C142121r(C142155u uVar, OpenSearchView openSearchView) {
        this.f385569a = uVar;
        this.f385570b = openSearchView;
    }

    /* renamed from: a */
    public final void mo18126a(int i, int i2) {
        C142155u uVar = this.f385569a;
        OpenSearchView openSearchView = this.f385570b;
        if (i == 3) {
            if (i2 != 4) {
                i = 3;
            } else {
                openSearchView.mo34102d();
                uVar.f385649s = true;
                return;
            }
        }
        if (i == 2) {
            if (i2 == 3) {
                C142147f a = uVar.mo117034a();
                if (a != null) {
                    C142155u.m230776d(a.getView());
                }
                uVar.f385633c.getActivity().getWindow().setStatusBarColor(0);
                uVar.f385649s = false;
            }
        } else if (i != 4) {
        } else {
            if (i2 == 1 || i2 == 2) {
                Drawable background = ((View) ((TabLayout) uVar.f385633c.requireView().findViewById(R.id.weather_tab_layout)).getParent()).getBackground();
                if (background instanceof ColorDrawable) {
                    uVar.f385633c.getActivity().getWindow().setStatusBarColor(((ColorDrawable) background).getColor());
                }
            }
        }
    }
}
