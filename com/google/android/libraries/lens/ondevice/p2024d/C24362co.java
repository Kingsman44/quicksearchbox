package com.google.android.libraries.lens.ondevice.p2024d;

import android.graphics.Bitmap;
import com.google.android.libraries.lens.ondevice.C24292d;
import com.google.android.libraries.lens.ondevice.p2018b.p2020b.C24280f;
import com.google.android.libraries.lens.ondevice.p2018b.p2021c.C24283a;
import com.google.android.libraries.lens.ondevice.p2018b.p2021c.C24288f;
import com.google.android.libraries.lens.ondevice.p2034k.C24553ar;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.util.concurrent.C60870cx;

/* renamed from: com.google.android.libraries.lens.ondevice.d.co */
/* compiled from: PG */
public final class C24362co implements C24419m {

    /* renamed from: a */
    private final C24553ar f66744a;

    public C24362co(C24553ar arVar) {
        this.f66744a = arVar;
    }

    /* renamed from: a */
    public final C24288f mo29871a(C24292d dVar, C24425s sVar, C24280f fVar) {
        ((C58970a) ((C58970a) C24363cp.f66745b.mo56224b()).mo56372aa(48764)).mo56386p("Running OCR Cascade");
        C24553ar arVar = this.f66744a;
        arVar.getClass();
        Bitmap bitmap = (Bitmap) fVar.mo29810b().mo56107c();
        bitmap.getClass();
        C60870cx gq = new C24308ao(dVar, arVar, bitmap).f66475a.mo60297gq();
        C24283a aVar = new C24283a();
        aVar.mo29852l(gq);
        aVar.mo29825b(gq);
        return aVar.mo29824a();
    }
}
