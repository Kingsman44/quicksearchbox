package com.google.android.libraries.lens.ondevice.p2024d;

import android.graphics.Bitmap;
import com.google.android.libraries.lens.ondevice.C24292d;
import com.google.android.libraries.lens.ondevice.p2018b.p2020b.C24280f;
import com.google.android.libraries.lens.ondevice.p2018b.p2021c.C24283a;
import com.google.android.libraries.lens.ondevice.p2018b.p2021c.C24288f;
import com.google.android.libraries.lens.ondevice.p2034k.C24668ey;
import com.google.android.libraries.lens.ondevice.p2034k.C24682fl;
import com.google.common.util.concurrent.C60870cx;

/* renamed from: com.google.android.libraries.lens.ondevice.d.c */
/* compiled from: PG */
public final class C24347c implements C24419m {

    /* renamed from: a */
    private final C24668ey f66722a;

    /* renamed from: b */
    private final C24682fl f66723b;

    public C24347c(C24668ey eyVar, C24682fl flVar) {
        this.f66722a = eyVar;
        this.f66723b = flVar;
    }

    /* renamed from: a */
    public final C24288f mo29871a(C24292d dVar, C24425s sVar, C24280f fVar) {
        Bitmap bitmap = (Bitmap) fVar.mo29810b().mo56107c();
        bitmap.getClass();
        C24668ey eyVar = this.f66722a;
        eyVar.getClass();
        C24682fl flVar = this.f66723b;
        flVar.getClass();
        C60870cx gq = new C24428v(dVar, eyVar, flVar, bitmap).f66877a.mo60297gq();
        C24283a aVar = new C24283a();
        aVar.mo29850j(gq);
        aVar.mo29825b(gq);
        return aVar.mo29824a();
    }
}
