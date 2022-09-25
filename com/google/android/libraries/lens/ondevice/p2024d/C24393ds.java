package com.google.android.libraries.lens.ondevice.p2024d;

import android.graphics.Bitmap;
import com.google.android.libraries.lens.ondevice.C24292d;
import com.google.android.libraries.lens.ondevice.nativeapi.OnDeviceEngineNativeApi;
import com.google.android.libraries.lens.ondevice.p2018b.p2020b.C24280f;
import com.google.android.libraries.lens.ondevice.p2018b.p2021c.C24283a;
import com.google.android.libraries.lens.ondevice.p2018b.p2021c.C24288f;
import com.google.android.libraries.lens.ondevice.p2034k.C24553ar;
import com.google.android.libraries.lens.ondevice.p2037n.C24768aa;
import com.google.android.libraries.lens.ondevice.p2037n.C24815z;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.util.concurrent.C60870cx;

/* renamed from: com.google.android.libraries.lens.ondevice.d.ds */
/* compiled from: PG */
public final class C24393ds implements C24419m {

    /* renamed from: a */
    private final C24553ar f66801a;

    /* renamed from: b */
    private final OnDeviceEngineNativeApi f66802b;

    public C24393ds(C24553ar arVar, OnDeviceEngineNativeApi onDeviceEngineNativeApi) {
        this.f66801a = arVar;
        this.f66802b = onDeviceEngineNativeApi;
    }

    /* renamed from: a */
    public final C24288f mo29871a(C24292d dVar, C24425s sVar, C24280f fVar) {
        ((C58970a) ((C58970a) C24394dt.f66803b.mo56224b()).mo56372aa(48777)).mo56386p("Running Translate Cascade");
        C24553ar arVar = this.f66801a;
        arVar.getClass();
        OnDeviceEngineNativeApi onDeviceEngineNativeApi = this.f66802b;
        C24815z zVar = (C24815z) C24768aa.f67673g.createBuilder();
        zVar.copyOnWrite();
        C24768aa aaVar = (C24768aa) zVar.instance;
        aaVar.f67675a |= 1;
        aaVar.f67676b = false;
        zVar.copyOnWrite();
        C24768aa aaVar2 = (C24768aa) zVar.instance;
        aaVar2.f67675a |= 2;
        aaVar2.f67677c = 0.0f;
        zVar.copyOnWrite();
        C24768aa aaVar3 = (C24768aa) zVar.instance;
        aaVar3.f67675a |= 4;
        aaVar3.f67678d = true;
        zVar.copyOnWrite();
        C24768aa aaVar4 = (C24768aa) zVar.instance;
        aaVar4.f67675a |= 8;
        aaVar4.f67679e = true;
        zVar.copyOnWrite();
        C24768aa aaVar5 = (C24768aa) zVar.instance;
        aaVar5.f67675a |= 16;
        aaVar5.f67680f = true;
        C24768aa aaVar6 = (C24768aa) zVar.build();
        aaVar6.getClass();
        Bitmap bitmap = (Bitmap) fVar.mo29810b().mo56107c();
        bitmap.getClass();
        C60870cx gq = new C24328bh(dVar, arVar, onDeviceEngineNativeApi, aaVar6, bitmap).f66623a.mo60297gq();
        C24283a aVar = new C24283a();
        aVar.mo29852l(gq);
        aVar.mo29825b(gq);
        return aVar.mo29824a();
    }
}
