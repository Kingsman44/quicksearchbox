package com.google.android.libraries.lens.ondevice.p2024d;

import android.graphics.Bitmap;
import com.google.android.libraries.lens.ondevice.C24292d;
import com.google.android.libraries.lens.ondevice.p2018b.p2020b.C24280f;
import com.google.android.libraries.lens.ondevice.p2018b.p2021c.C24283a;
import com.google.android.libraries.lens.ondevice.p2018b.p2021c.C24286d;
import com.google.android.libraries.lens.ondevice.p2018b.p2021c.C24288f;
import com.google.android.libraries.lens.ondevice.p2034k.C24670f;
import com.google.android.libraries.lens.ondevice.p2034k.C24697g;
import com.google.common.util.concurrent.C60870cx;

/* renamed from: com.google.android.libraries.lens.ondevice.d.bz */
/* compiled from: PG */
public final class C24346bz implements C24419m {

    /* renamed from: a */
    private final C24670f f66720a;

    /* renamed from: b */
    private final C24697g f66721b;

    public C24346bz(C24670f fVar, C24697g gVar) {
        this.f66720a = fVar;
        this.f66721b = gVar;
    }

    /* renamed from: a */
    public final C24288f mo29871a(C24292d dVar, C24425s sVar, C24280f fVar) {
        Bitmap bitmap = (Bitmap) fVar.mo29810b().mo56107c();
        bitmap.getClass();
        C60870cx gq = new C24298ae(dVar, this.f66720a, this.f66721b, bitmap).f66404a.mo60297gq();
        C24283a aVar = new C24283a();
        aVar.f66336e = new C24286d(gq);
        aVar.mo29825b(gq);
        return aVar.mo29824a();
    }
}
