package com.google.android.apps.gsa.staticplugins.opa.tapas.p8475b.p8477b;

import com.google.android.libraries.gsa.p1876k.C22862b;
import com.google.assistant.p3781ad.p3789d.p3791b.p3792a.C48633bv;
import com.google.assistant.p3781ad.p3789d.p3791b.p3792a.C48635bx;
import com.google.assistant.p3781ad.p3789d.p3791b.p3792a.C48649j;
import com.google.assistant.p3781ad.p3789d.p3791b.p3792a.C48650k;
import com.google.assistant.p3781ad.p3789d.p3791b.p3792a.C48652m;
import com.google.common.p4522b.C58485gu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62947c;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C62995dn;
import java.util.HashMap;
import java.util.List;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.b.b.a */
/* compiled from: PG */
public final /* synthetic */ class C111083a implements C22862b {

    /* renamed from: a */
    public final /* synthetic */ C111090h f309312a;

    public /* synthetic */ C111083a(C111090h hVar) {
        this.f309312a = hVar;
    }

    /* renamed from: a */
    public final Object mo17947a() {
        C111090h hVar = this.f309312a;
        if (!hVar.mo99045c()) {
            C48633bv bvVar = (C48633bv) C48635bx.f125704d.createBuilder();
            long b = hVar.f309319a.mo26870b();
            bvVar.copyOnWrite();
            ((C48635bx) bvVar.instance).f125708c = b;
            return (C48635bx) bvVar.build();
        }
        C58485gu guVar = (C58485gu) hVar.f309320b.mo99849h().map(new C111084b(hVar)).orElse(C58485gu.m89845m());
        HashMap hashMap = new HashMap();
        int size = guVar.size();
        for (int i = 0; i < size; i++) {
            C48649j jVar = (C48649j) guVar.get(i);
            hashMap.put(jVar.f125737b, jVar);
        }
        C48633bv bvVar2 = (C48633bv) C48635bx.f125704d.createBuilder();
        long b2 = hVar.f309319a.mo26870b();
        bvVar2.copyOnWrite();
        ((C48635bx) bvVar2.instance).f125708c = b2;
        C48650k kVar = (C48650k) C48652m.f125740c.createBuilder();
        kVar.copyOnWrite();
        C48652m mVar = (C48652m) kVar.instance;
        C62995dn dnVar = mVar.f125743b;
        if (!dnVar.f170058b) {
            mVar.f125743b = dnVar.mo58980a();
        }
        mVar.f125743b.putAll(hashMap);
        kVar.copyOnWrite();
        C48652m mVar2 = (C48652m) kVar.instance;
        C62971cq cqVar = mVar2.f125742a;
        if (!cqVar.mo58948c()) {
            mVar2.f125742a = C62942bv.mutableCopy(cqVar);
        }
        C62947c.addAll((Iterable) guVar, (List) mVar2.f125742a);
        bvVar2.copyOnWrite();
        C48635bx bxVar = (C48635bx) bvVar2.instance;
        C48652m mVar3 = (C48652m) kVar.build();
        mVar3.getClass();
        bxVar.f125707b = mVar3;
        bxVar.f125706a = 25;
        return (C48635bx) bvVar2.build();
    }
}
