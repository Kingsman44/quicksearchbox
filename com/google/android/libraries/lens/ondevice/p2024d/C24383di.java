package com.google.android.libraries.lens.ondevice.p2024d;

import android.graphics.Bitmap;
import com.google.android.libraries.lens.ondevice.C24292d;
import com.google.android.libraries.lens.ondevice.p2018b.p2020b.C24280f;
import com.google.android.libraries.lens.ondevice.p2018b.p2021c.C24283a;
import com.google.android.libraries.lens.ondevice.p2018b.p2021c.C24286d;
import com.google.android.libraries.lens.ondevice.p2018b.p2021c.C24288f;
import com.google.android.libraries.lens.ondevice.p2034k.C24553ar;
import com.google.android.libraries.lens.ondevice.p2037n.C24768aa;
import com.google.android.libraries.lens.ondevice.p2037n.C24815z;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.util.concurrent.C60870cx;

/* renamed from: com.google.android.libraries.lens.ondevice.d.di */
/* compiled from: PG */
public final class C24383di implements C24419m {

    /* renamed from: a */
    private final C24553ar f66783a;

    public C24383di(C24553ar arVar) {
        this.f66783a = arVar;
    }

    /* renamed from: a */
    public final C24288f mo29871a(C24292d dVar, C24425s sVar, C24280f fVar) {
        ((C58970a) ((C58970a) C24384dj.f66784b.mo56224b()).mo56372aa(48775)).mo56386p("Running Split OCR Cascade");
        C24553ar arVar = this.f66783a;
        arVar.getClass();
        C24815z zVar = (C24815z) C24768aa.f67673g.createBuilder();
        zVar.copyOnWrite();
        C24768aa aaVar = (C24768aa) zVar.instance;
        aaVar.f67675a |= 1;
        aaVar.f67676b = true;
        ((C24768aa) zVar.build()).getClass();
        Bitmap bitmap = (Bitmap) fVar.mo29810b().mo56107c();
        bitmap.getClass();
        C24318ay ayVar = new C24318ay(dVar, arVar, bitmap);
        C60870cx gq = ayVar.f66552a.mo60297gq();
        C60870cx gq2 = ayVar.f66553b.mo60297gq();
        C24283a aVar = new C24283a();
        aVar.f66333b = new C24286d(gq);
        aVar.mo29852l(gq2);
        aVar.mo29825b(gq2);
        return aVar.mo29824a();
    }
}
