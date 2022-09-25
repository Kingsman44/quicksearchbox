package com.google.android.apps.search.googleapp.homescreen.p10315e.p10317b;

import com.google.android.libraries.search.p3090o.C39838p;
import com.google.apps.tiktok.dataservice.C46723bg;
import java.util.Locale;
import p5462h.C69747m;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.googleapp.homescreen.e.b.e */
/* compiled from: PG */
public final class C136164e {

    /* renamed from: a */
    public final C39838p f370831a;

    /* renamed from: b */
    public final C46723bg f370832b;

    public C136164e(C39838p pVar, C46723bg bgVar) {
        C69664n.m101061g(bgVar, "dataSources");
        this.f370831a = pVar;
        this.f370832b = bgVar;
        new C69747m(new C136163d(this));
    }

    /* renamed from: a */
    public static final C136160a m221267a() {
        int hashCode;
        String country = Locale.getDefault().getCountry();
        if (country == null || ((hashCode = country.hashCode()) == 2438 ? !country.equals("LR") : !(hashCode == 2464 ? country.equals("MM") : hashCode == 2718 && country.equals("US")))) {
            return C136160a.CELSIUS;
        }
        return C136160a.FAHRENHEIT;
    }
}
