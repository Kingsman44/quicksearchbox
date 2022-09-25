package com.google.android.libraries.lens.ondevice.p2024d;

import android.graphics.Bitmap;
import com.google.android.libraries.lens.ondevice.C24292d;
import com.google.android.libraries.lens.ondevice.p2018b.p2020b.C24280f;
import com.google.android.libraries.lens.ondevice.p2018b.p2021c.C24283a;
import com.google.android.libraries.lens.ondevice.p2018b.p2021c.C24286d;
import com.google.android.libraries.lens.ondevice.p2018b.p2021c.C24288f;
import com.google.android.libraries.lens.ondevice.p2034k.C24754x;
import com.google.common.util.concurrent.C60870cx;

/* renamed from: com.google.android.libraries.lens.ondevice.d.bp */
/* compiled from: PG */
public final class C24336bp implements C24419m {

    /* renamed from: a */
    private final C24754x f66701a;

    public C24336bp(C24754x xVar) {
        this.f66701a = xVar;
    }

    /* renamed from: a */
    public final C24288f mo29871a(C24292d dVar, C24425s sVar, C24280f fVar) {
        Bitmap bitmap = (Bitmap) fVar.mo29810b().mo56107c();
        bitmap.getClass();
        C24754x xVar = this.f66701a;
        xVar.getClass();
        C60870cx gq = new C24430x(dVar, xVar, bitmap).f66894a.mo60297gq();
        C24283a aVar = new C24283a();
        aVar.f66335d = new C24286d(gq);
        aVar.mo29825b(gq);
        return aVar.mo29824a();
    }
}
