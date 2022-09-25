package com.google.android.libraries.search.silk.p3162a.p3173k;

import com.google.android.libraries.lens.p2016f.C24238ac;
import com.google.common.base.C58916z;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;
import com.google.lens.sdk.LensApi;
import com.google.p4283bv.p4287b.p4288a.p4289a.p4310o.C56746a;
import com.google.p4283bv.p4287b.p4288a.p4289a.p4310o.C56758b;
import com.google.p4283bv.p4287b.p4288a.p4289a.p4310o.C56772p;

/* renamed from: com.google.android.libraries.search.silk.a.k.k */
/* compiled from: PG */
public final /* synthetic */ class C40616k implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ LensApi f106586a;

    public /* synthetic */ C40616k(LensApi lensApi) {
        this.f106586a = lensApi;
    }

    public final C60870cx apply(Object obj) {
        LensApi lensApi = this.f106586a;
        C56746a aVar = (C56746a) C56758b.f151481d.createBuilder();
        if (((Integer) obj).intValue() == 0) {
            aVar.copyOnWrite();
            C56758b bVar = (C56758b) aVar.instance;
            bVar.f151483a |= 1;
            bVar.f151484b = true;
            C56772p pVar = (C56772p) ((C58916z) C24238ac.f66306n.mo56069h()).f156756a.mo56068fP(lensApi.f169110b.mo29472a());
            aVar.copyOnWrite();
            C56758b bVar2 = (C56758b) aVar.instance;
            pVar.getClass();
            bVar2.f151485c = pVar;
            bVar2.f151483a |= 2;
        } else {
            aVar.copyOnWrite();
            C56758b bVar3 = (C56758b) aVar.instance;
            bVar3.f151483a = 1 | bVar3.f151483a;
            bVar3.f151484b = false;
        }
        lensApi.onPause();
        return C60856cj.m92900i((C56758b) aVar.build());
    }
}
