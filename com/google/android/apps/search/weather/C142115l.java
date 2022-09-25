package com.google.android.apps.search.weather;

import android.view.View;
import androidx.core.graphics.C1924a;
import androidx.viewpager2.widget.C4313p;
import androidx.viewpager2.widget.ViewPager2;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.logging.p2185ve.C28442l;
import com.google.android.libraries.logging.p2185ve.C28485y;
import com.google.android.material.tabs.TabLayout;
import com.google.p4017at.p4060h.p4075e.p4076a.C54269e;
import com.google.p4017at.p4060h.p4075e.p4076a.C54272h;

/* renamed from: com.google.android.apps.search.weather.l */
/* compiled from: PG */
final class C142115l extends C4313p {

    /* renamed from: a */
    final /* synthetic */ C54272h f385548a;

    /* renamed from: b */
    final /* synthetic */ ViewPager2 f385549b;

    /* renamed from: c */
    final /* synthetic */ C142116m f385550c;

    public C142115l(C142116m mVar, C54272h hVar, ViewPager2 viewPager2) {
        this.f385550c = mVar;
        this.f385548a = hVar;
        this.f385549b = viewPager2;
    }

    /* renamed from: a */
    public final void mo9201a(int i) {
    }

    /* renamed from: b */
    public final void mo9202b(int i) {
        int e = C1924a.m5186e(((C54269e) this.f385548a.f142515b.get(i)).f142502c, -16777216, 0.2f);
        ((View) ((TabLayout) this.f385550c.f385552a.requireView().findViewById(R.id.weather_tab_layout)).getParent()).setBackgroundColor(e);
        this.f385550c.f385552a.getActivity().getWindow().setStatusBarColor(e);
        C142116m mVar = this.f385550c;
        if (mVar.f385554c != i) {
            mVar.f385553b.mo33853c(C28442l.m53142h().mo33894a(), C28485y.m53234a(this.f385549b));
        }
        this.f385550c.f385554c = i;
    }

    /* renamed from: d */
    public final void mo9233d(int i, float f, int i2) {
    }
}
