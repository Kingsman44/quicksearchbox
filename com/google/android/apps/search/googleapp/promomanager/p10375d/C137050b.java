package com.google.android.apps.search.googleapp.promomanager.p10375d;

import com.google.android.apps.search.googleapp.promomanager.p10374c.C137045n;
import com.google.android.apps.search.googleapp.promomanager.p10374c.C137046o;
import com.google.common.base.C58817ah;
import com.google.p4017at.p4086k.p4087a.p4093c.p4094a.C54522d;
import com.google.protobuf.C63042fg;
import com.google.protobuf.p4750c.C62950b;
import com.google.protos.p4895aw.p4896a.p4897a.p4898a.C63907au;

/* renamed from: com.google.android.apps.search.googleapp.promomanager.d.b */
/* compiled from: PG */
public final /* synthetic */ class C137050b implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ C137054f f372974a;

    /* renamed from: b */
    public final /* synthetic */ C54522d f372975b;

    public /* synthetic */ C137050b(C137054f fVar, C54522d dVar) {
        this.f372974a = fVar;
        this.f372975b = dVar;
    }

    public final Object apply(Object obj) {
        C137054f fVar = this.f372974a;
        C54522d dVar = this.f372975b;
        C137045n nVar = (C137045n) ((C137046o) obj).toBuilder();
        C63042fg b = C62950b.m95471b(fVar.f372984e);
        nVar.copyOnWrite();
        C137046o oVar = (C137046o) nVar.instance;
        b.getClass();
        oVar.f372965b = b;
        oVar.f372964a |= 1;
        nVar.copyOnWrite();
        C137046o oVar2 = (C137046o) nVar.instance;
        oVar2.f372964a &= -3;
        oVar2.f372966c = false;
        C63907au auVar = dVar.f143158a;
        if (auVar == null) {
            auVar = C63907au.f172809d;
        }
        nVar.copyOnWrite();
        C137046o oVar3 = (C137046o) nVar.instance;
        auVar.getClass();
        oVar3.f372967d = auVar;
        oVar3.f372964a |= 4;
        return (C137046o) nVar.build();
    }
}
