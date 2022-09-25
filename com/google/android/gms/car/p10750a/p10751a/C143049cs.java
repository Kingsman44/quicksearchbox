package com.google.android.gms.car.p10750a.p10751a;

import android.os.Looper;
import androidx.p060c.C0978h;
import androidx.p060c.C0979i;
import com.google.android.gms.car.C143151cg;
import com.google.android.gms.car.p10760f.C143308w;
import com.google.android.gms.libs.p10836d.p10839c.C144861c;
import java.util.Set;

/* renamed from: com.google.android.gms.car.a.a.cs */
/* compiled from: PG */
public final class C143049cs extends C143151cg {

    /* renamed from: a */
    private final Set f388128a = new C0979i(0);

    /* renamed from: b */
    private final C144861c f388129b = new C144861c(Looper.getMainLooper());

    /* renamed from: a */
    public final synchronized void mo117991a() {
        C0978h hVar = new C0978h((C0979i) this.f388128a);
        while (hVar.hasNext()) {
            this.f388129b.post(new C143048cr((C143308w) hVar.next()));
        }
    }

    /* renamed from: b */
    public final synchronized void mo117992b() {
        this.f388128a.clear();
    }

    /* renamed from: c */
    public final synchronized void mo117993c(C143308w wVar) {
        this.f388128a.add(wVar);
    }

    /* renamed from: d */
    public final synchronized void mo117994d(C143308w wVar) {
        this.f388128a.remove(wVar);
    }
}
