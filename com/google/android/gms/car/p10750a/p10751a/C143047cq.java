package com.google.android.gms.car.p10750a.p10751a;

import android.os.Looper;
import androidx.p060c.C0978h;
import androidx.p060c.C0979i;
import com.google.android.gms.car.display.CarDisplayId;
import com.google.android.gms.car.p10750a.C143085e;
import com.google.android.gms.car.p10763g.C143313a;
import com.google.android.gms.car.p10764h.C143316a;
import com.google.android.gms.libs.p10836d.p10839c.C144861c;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.UUID;

/* renamed from: com.google.android.gms.car.a.a.cq */
/* compiled from: PG */
public final class C143047cq extends C143313a {

    /* renamed from: a */
    private final Set f388124a = new C0979i(0);

    /* renamed from: b */
    private final Map f388125b = new HashMap();

    /* renamed from: c */
    private final C144861c f388126c = new C144861c(Looper.getMainLooper());

    /* renamed from: a */
    public final synchronized void mo117988a() {
        if (C143316a.m232515e("GH.MpCarDispUpdateLstnr", 3)) {
            C143316a.m232514d(3, "GH.MpCarDispUpdateLstnr", (Throwable) null, "Clearing local CarDisplayLayoutUpdateCompleteListener %s", this.f388124a);
        }
        this.f388124a.clear();
    }

    /* renamed from: b */
    public final synchronized void mo117989b(String str, CarDisplayId carDisplayId) {
        C0978h hVar = new C0978h((C0979i) this.f388124a);
        while (hVar.hasNext()) {
            this.f388125b.put(carDisplayId, UUID.fromString(str));
            this.f388126c.post(new C143046cp((C143085e) hVar.next()));
        }
    }
}
