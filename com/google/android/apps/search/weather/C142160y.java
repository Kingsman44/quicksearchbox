package com.google.android.apps.search.weather;

import androidx.viewpager2.widget.ViewPager2;
import com.google.android.apps.search.weather.p10692j.p10693a.C142107a;
import com.google.android.googlequicksearchbox.R;
import com.google.apps.tiktok.p3674l.p3679c.C47388b;
import com.google.apps.tiktok.p3674l.p3679c.C47391d;
import com.google.apps.tiktok.p3674l.p3679c.C47392e;

/* renamed from: com.google.android.apps.search.weather.y */
/* compiled from: PG */
final class C142160y implements C47391d {

    /* renamed from: a */
    final /* synthetic */ C142155u f385661a;

    public C142160y(C142155u uVar) {
        this.f385661a = uVar;
    }

    /* renamed from: a */
    public final /* synthetic */ C47392e mo18069a(C47388b bVar) {
        C142107a aVar = (C142107a) bVar;
        ViewPager2 viewPager2 = (ViewPager2) this.f385661a.f385633c.requireView().findViewById(R.id.weather_tabs_pager);
        if (viewPager2 != null) {
            viewPager2.mo9218g(!aVar.f385526a);
        }
        return C47392e.f123115a;
    }
}
