package com.google.android.gms.car.p10750a.p10751a;

import android.os.Looper;
import androidx.p060c.C0978h;
import androidx.p060c.C0979i;
import com.google.android.gms.car.display.p10758a.C143188e;
import com.google.android.gms.car.p10750a.C143084d;
import com.google.android.gms.libs.p10836d.p10839c.C144861c;
import java.util.Set;

/* renamed from: com.google.android.gms.car.a.a.co */
/* compiled from: PG */
public final class C143045co extends C143188e {

    /* renamed from: a */
    private final Set f388121a = new C0979i(0);

    /* renamed from: b */
    private final C144861c f388122b = new C144861c(Looper.getMainLooper());

    /* renamed from: a */
    public final synchronized void mo117985a() {
        this.f388121a.clear();
    }

    /* renamed from: b */
    public final void mo117986b() {
        C0978h hVar = new C0978h((C0979i) this.f388121a);
        while (hVar.hasNext()) {
            this.f388122b.post(new C143044cn((C143084d) hVar.next()));
        }
    }
}
