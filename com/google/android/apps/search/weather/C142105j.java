package com.google.android.apps.search.weather;

import com.google.android.googlequicksearchbox.R;
import com.google.android.material.tabs.C44909l;
import com.google.android.material.tabs.C44915r;
import com.google.android.material.tabs.TabLayout;

/* renamed from: com.google.android.apps.search.weather.j */
/* compiled from: PG */
public final /* synthetic */ class C142105j implements C44915r {

    /* renamed from: a */
    public static final /* synthetic */ C142105j f385525a = new C142105j();

    private /* synthetic */ C142105j() {
    }

    /* renamed from: a */
    public final void mo17416a(C44909l lVar, int i) {
        TabLayout tabLayout = lVar.f117226g;
        if (tabLayout != null) {
            lVar.mo48444d(tabLayout.getResources().getText(R.string.weather_today_tab_name));
            return;
        }
        throw new IllegalArgumentException("Tab not attached to a TabLayout");
    }
}
