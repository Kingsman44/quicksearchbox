package com.google.android.gms.car.p10750a.p10751a;

import android.os.Looper;
import androidx.p060c.C0978h;
import androidx.p060c.C0979i;
import com.google.android.gms.car.display.p10758a.C143186c;
import com.google.android.gms.car.p10750a.C143083c;
import com.google.android.gms.libs.p10836d.p10839c.C144861c;
import java.util.Set;

/* renamed from: com.google.android.gms.car.a.a.cm */
/* compiled from: PG */
public final class C143043cm extends C143186c {

    /* renamed from: a */
    private final Set f388118a = new C0979i(0);

    /* renamed from: b */
    private final C144861c f388119b = new C144861c(Looper.getMainLooper());

    /* renamed from: a */
    public final synchronized void mo117982a() {
        this.f388118a.clear();
    }

    /* renamed from: b */
    public final synchronized void mo117983b() {
        C0978h hVar = new C0978h((C0979i) this.f388118a);
        while (hVar.hasNext()) {
            this.f388119b.post(new C143042cl((C143083c) hVar.next()));
        }
    }
}
