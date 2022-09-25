package com.google.android.apps.gsa.staticplugins.p7887eb;

import com.google.android.apps.gsa.shared.logger.p7051b.C89849ae;
import com.google.android.apps.gsa.shared.logger.p7051b.C89856f;
import com.google.android.apps.gsa.shared.logger.p7051b.C89859i;
import com.google.android.apps.gsa.shared.p7066m.C89972ak;
import com.google.common.base.C58817ah;
import com.google.common.p4552o.C59582aj;
import com.google.common.p4552o.C59687cb;
import p5451f.p5452a.p5453a.p5454a.C69408bc;
import p5451f.p5452a.p5453a.p5454a.C69420bo;

/* renamed from: com.google.android.apps.gsa.staticplugins.eb.ad */
/* compiled from: PG */
public final /* synthetic */ class C100343ad implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ C100353an f280600a;

    /* renamed from: b */
    public final /* synthetic */ int f280601b;

    /* renamed from: c */
    public final /* synthetic */ C69420bo f280602c;

    public /* synthetic */ C100343ad(C100353an anVar, int i, C69420bo boVar) {
        this.f280600a = anVar;
        this.f280601b = i;
        this.f280602c = boVar;
    }

    public final Object apply(Object obj) {
        C100353an anVar = this.f280600a;
        int i = this.f280601b;
        C69420bo boVar = this.f280602c;
        Boolean bool = (Boolean) obj;
        if (anVar.f280615b.mo79746e(C89972ak.f246530E)) {
            C89859i iVar = anVar.f280617f;
            C89856f fVar = new C89856f();
            fVar.f246201a = C89849ae.TIPMANAGER_TIP_CONDITION_EVALUATION;
            C59582aj ajVar = (C59582aj) C59687cb.f160034bf.createBuilder();
            ajVar.copyOnWrite();
            C59687cb cbVar = (C59687cb) ajVar.instance;
            cbVar.f160122c |= 67108864;
            cbVar.f160067aE = i;
            int a = C69408bc.m100750a(boVar.f185739b);
            if (a == 0) {
                a = 1;
            }
            ajVar.copyOnWrite();
            C59687cb cbVar2 = (C59687cb) ajVar.instance;
            cbVar2.f160122c |= 134217728;
            cbVar2.f160068aF = a - 1;
            boolean booleanValue = bool.booleanValue();
            ajVar.copyOnWrite();
            C59687cb cbVar3 = (C59687cb) ajVar.instance;
            cbVar3.f160122c |= 268435456;
            cbVar3.f160069aG = booleanValue;
            fVar.f246203c = (C59687cb) ajVar.build();
            iVar.mo74236a(fVar.mo83699a());
        }
        return bool;
    }
}
