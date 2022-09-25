package com.google.android.apps.search.googleapp.homescreen.p10315e.p10317b;

import com.google.android.gms.awareness.snapshot.C142937a;
import com.google.android.gms.awareness.snapshot.internal.C142944g;
import com.google.android.gms.awareness.snapshot.internal.Snapshot;
import com.google.android.gms.awareness.snapshot.internal.WeatherImpl;
import com.google.common.base.C58817ah;

/* renamed from: com.google.android.apps.search.googleapp.homescreen.e.b.h */
/* compiled from: PG */
public final /* synthetic */ class C136167h implements C58817ah {

    /* renamed from: a */
    public static final /* synthetic */ C136167h f370840a = new C136167h();

    private /* synthetic */ C136167h() {
    }

    public final Object apply(Object obj) {
        WeatherImpl weatherImpl;
        Snapshot b = ((C142944g) ((C142937a) obj).f389625a).f387868a.mo117871b();
        if (b == null) {
            weatherImpl = null;
        } else {
            weatherImpl = b.f387856i;
        }
        if (weatherImpl != null) {
            return weatherImpl;
        }
        throw new IllegalStateException("Failed to fetch weather data");
    }
}
