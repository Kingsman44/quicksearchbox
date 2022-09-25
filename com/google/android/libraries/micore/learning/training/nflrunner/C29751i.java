package com.google.android.libraries.micore.learning.training.nflrunner;

import com.google.common.p4552o.p4554b.p4555a.C59611ag;
import com.google.common.p4552o.p4554b.p4555a.C59619ao;
import com.google.common.p4552o.p4554b.p4555a.C59627g;
import com.google.common.p4552o.p4554b.p4555a.C59628h;
import com.google.common.p4552o.p4554b.p4555a.C59629i;
import com.google.common.p4552o.p4554b.p4555a.C59630j;
import com.google.protobuf.C62921ba;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62974ct;

/* renamed from: com.google.android.libraries.micore.learning.training.nflrunner.i */
/* compiled from: PG */
public final /* synthetic */ class C29751i implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C29755m f80595a;

    /* renamed from: b */
    public final /* synthetic */ byte[] f80596b;

    public /* synthetic */ C29751i(C29755m mVar, byte[] bArr) {
        this.f80595a = mVar;
        this.f80596b = bArr;
    }

    public final void run() {
        C29755m mVar = this.f80595a;
        try {
            C59611ag agVar = (C59611ag) ((C59619ao) C62942bv.parseFrom((C62942bv) C59619ao.f159847l, this.f80596b, C62921ba.m95368a())).toBuilder();
            long j = mVar.f80609l;
            agVar.copyOnWrite();
            C59619ao aoVar = (C59619ao) agVar.instance;
            aoVar.f159849a |= 16;
            aoVar.f159852d = j;
            synchronized (mVar.f80613p) {
                C59619ao aoVar2 = mVar.f80615r.f159877c;
                if (aoVar2 == null) {
                    aoVar2 = C59619ao.f159847l;
                }
                if (!aoVar2.f159857i.equals(((C59619ao) agVar.instance).f159857i)) {
                    C59627g gVar = (C59627g) mVar.f80615r.toBuilder();
                    C59619ao aoVar3 = mVar.f80615r.f159877c;
                    if (aoVar3 == null) {
                        aoVar3 = C59619ao.f159847l;
                    }
                    C59611ag agVar2 = (C59611ag) aoVar3.toBuilder();
                    String str = ((C59619ao) agVar.instance).f159857i;
                    agVar2.copyOnWrite();
                    C59619ao aoVar4 = (C59619ao) agVar2.instance;
                    str.getClass();
                    aoVar4.f159849a |= 4096;
                    aoVar4.f159857i = str;
                    gVar.copyOnWrite();
                    C59628h hVar = (C59628h) gVar.instance;
                    C59619ao aoVar5 = (C59619ao) agVar2.build();
                    aoVar5.getClass();
                    hVar.f159877c = aoVar5;
                    hVar.f159875a |= 4;
                    mVar.f80615r = (C59628h) gVar.build();
                }
                mVar.f80605h.mo34929a(agVar, mVar.f80608k, mVar.f80615r);
            }
            C59627g gVar2 = (C59627g) C59628h.f159873h.createBuilder();
            C59629i iVar = (C59629i) C59630j.f159882d.createBuilder();
            String str2 = mVar.f80600c;
            iVar.copyOnWrite();
            C59630j jVar = (C59630j) iVar.instance;
            str2.getClass();
            jVar.f159884a |= 1;
            jVar.f159885b = str2;
            gVar2.copyOnWrite();
            C59628h hVar2 = (C59628h) gVar2.instance;
            C59630j jVar2 = (C59630j) iVar.build();
            jVar2.getClass();
            hVar2.f159876b = jVar2;
            hVar2.f159875a |= 1;
            gVar2.copyOnWrite();
            C59628h hVar3 = (C59628h) gVar2.instance;
            C59619ao aoVar6 = (C59619ao) agVar.build();
            aoVar6.getClass();
            hVar3.f159877c = aoVar6;
            hVar3.f159875a |= 4;
            mVar.f80603f.mo120050c((C59628h) gVar2.build());
        } catch (C62974ct e) {
            throw new IllegalArgumentException(e);
        }
    }
}
