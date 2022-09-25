package com.google.android.apps.gsa.staticplugins.nga.p8079r.p8080a.p8083c;

import com.google.common.base.C58817ah;
import com.google.speech.p5208h.C66677k;
import com.google.speech.p5208h.C66678l;
import com.google.speech.recognizer.p5233a.C67451at;

/* renamed from: com.google.android.apps.gsa.staticplugins.nga.r.a.c.z */
/* compiled from: PG */
public final /* synthetic */ class C103564z implements C58817ah {

    /* renamed from: a */
    public static final /* synthetic */ C103564z f288529a = new C103564z();

    private /* synthetic */ C103564z() {
    }

    public final Object apply(Object obj) {
        C103560v vVar = (C103560v) obj;
        C66677k kVar = (C66677k) C66678l.f181384f.createBuilder();
        C67451at n = vVar.f288522a.mo87202n();
        kVar.copyOnWrite();
        C66678l lVar = (C66678l) kVar.instance;
        lVar.f181389b = n.f183321p;
        lVar.f181388a |= 1;
        int f = vVar.f288522a.mo87195f();
        kVar.copyOnWrite();
        C66678l lVar2 = (C66678l) kVar.instance;
        lVar2.f181388a |= 2;
        lVar2.f181390c = (float) f;
        int bitCount = Integer.bitCount(vVar.f288522a.mo87190a());
        kVar.copyOnWrite();
        C66678l lVar3 = (C66678l) kVar.instance;
        lVar3.f181388a |= 4;
        lVar3.f181391d = bitCount;
        int e = vVar.f288522a.mo87194e();
        kVar.copyOnWrite();
        C66678l lVar4 = (C66678l) kVar.instance;
        lVar4.f181388a |= 8;
        lVar4.f181392e = e;
        return (C66678l) kVar.build();
    }
}
