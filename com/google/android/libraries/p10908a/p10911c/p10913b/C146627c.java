package com.google.android.libraries.p10908a.p10911c.p10913b;

import com.google.common.base.C58817ah;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protos.p4816ai.p4820d.p4821a.C63217i;
import com.google.protos.p4816ai.p4820d.p4821a.C63218j;
import com.google.protos.p4816ai.p4820d.p4821a.C63219k;
import com.google.protos.p4816ai.p4820d.p4821a.C63220l;
import java.util.Collection;
import p5462h.p5473f.p5475b.C69644aa;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.libraries.a.c.b.c */
/* compiled from: PG */
final class C146627c implements C58817ah {

    /* renamed from: a */
    final /* synthetic */ C69644aa f396017a;

    /* renamed from: b */
    final /* synthetic */ int f396018b;

    /* renamed from: c */
    final /* synthetic */ long f396019c;

    public C146627c(C69644aa aaVar, int i, long j) {
        this.f396017a = aaVar;
        this.f396018b = i;
        this.f396019c = j;
    }

    public final /* bridge */ /* synthetic */ Object apply(Object obj) {
        C63220l lVar = (C63220l) obj;
        C69664n.m101061g(lVar, "proto");
        C62971cq<C63218j> cqVar = lVar.f170800a;
        C69664n.m101060f(cqVar, "proto.installationInfoList");
        int i = this.f396018b;
        if (!(cqVar instanceof Collection) || !cqVar.isEmpty()) {
            for (C63218j jVar : cqVar) {
                if (jVar.f170796b == i) {
                    return lVar;
                }
            }
        }
        this.f396017a.f186023a = true;
        C63217i iVar = (C63217i) C63218j.f170793d.createBuilder();
        int i2 = this.f396018b;
        iVar.copyOnWrite();
        C63218j jVar2 = (C63218j) iVar.instance;
        jVar2.f170795a = 1 | jVar2.f170795a;
        jVar2.f170796b = i2;
        long j = this.f396019c;
        iVar.copyOnWrite();
        C63218j jVar3 = (C63218j) iVar.instance;
        jVar3.f170795a |= 2;
        jVar3.f170797c = j;
        C62942bv build = iVar.build();
        C69664n.m101060f(build, "newBuilder()\n           …p)\n              .build()");
        C63219k kVar = (C63219k) lVar.toBuilder();
        kVar.mo59196a((C63218j) build);
        return (C63220l) kVar.build();
    }
}
