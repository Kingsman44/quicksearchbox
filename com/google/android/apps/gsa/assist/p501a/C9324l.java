package com.google.android.apps.gsa.assist.p501a;

import com.google.android.apps.gsa.shared.logger.p7051b.C89849ae;
import com.google.android.apps.gsa.shared.logger.p7051b.C89856f;
import com.google.android.apps.gsa.shared.logger.p7051b.C89857g;
import com.google.common.p4552o.C59582aj;
import com.google.common.p4552o.C59687cb;
import com.google.common.p4552o.C60603w;

/* renamed from: com.google.android.apps.gsa.assist.a.l */
/* compiled from: PG */
public final class C9324l {
    /* renamed from: a */
    public static C89857g m23779a(C89849ae aeVar, C9318f fVar) {
        C89856f fVar2 = new C89856f();
        fVar2.mo83701c("assistDataType", fVar.name());
        fVar2.f246201a = aeVar;
        C59582aj ajVar = (C59582aj) C59687cb.f160034bf.createBuilder();
        ajVar.copyOnWrite();
        C59687cb cbVar = (C59687cb) ajVar.instance;
        cbVar.f160118bc = ((C60603w) new C9323k().mo56070hd(fVar)).f164407f;
        cbVar.f160123d |= 8388608;
        fVar2.f246203c = (C59687cb) ajVar.build();
        return fVar2.mo83699a();
    }

    /* renamed from: b */
    public static boolean m23780b(C9318f fVar) {
        return fVar == C9318f.SCREENSHOT;
    }
}
