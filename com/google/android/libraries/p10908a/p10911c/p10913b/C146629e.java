package com.google.android.libraries.p10908a.p10911c.p10913b;

import com.google.common.base.C58817ah;
import com.google.protobuf.C62971cq;
import com.google.protos.p4816ai.p4820d.p4821a.C63218j;
import com.google.protos.p4816ai.p4820d.p4821a.C63219k;
import com.google.protos.p4816ai.p4820d.p4821a.C63220l;
import java.util.Iterator;
import p5462h.p5473f.p5475b.C69648ae;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.libraries.a.c.b.e */
/* compiled from: PG */
final class C146629e implements C58817ah {

    /* renamed from: a */
    final /* synthetic */ C69648ae f396021a;

    /* renamed from: b */
    final /* synthetic */ int f396022b;

    public C146629e(C69648ae aeVar, int i) {
        this.f396021a = aeVar;
        this.f396022b = i;
    }

    public final /* bridge */ /* synthetic */ Object apply(Object obj) {
        C63220l lVar = (C63220l) obj;
        C69664n.m101061g(lVar, "proto");
        C62971cq cqVar = lVar.f170800a;
        C69664n.m101060f(cqVar, "proto.installationInfoList");
        int i = this.f396022b;
        Iterator it = cqVar.iterator();
        int i2 = 0;
        while (true) {
            if (it.hasNext()) {
                if (((C63218j) it.next()).f170796b == i) {
                    break;
                }
                i2++;
            } else {
                i2 = -1;
                break;
            }
        }
        if (i2 == -1) {
            return lVar;
        }
        this.f396021a.f186027a = (C63218j) lVar.f170800a.get(i2);
        C63219k kVar = (C63219k) lVar.toBuilder();
        kVar.copyOnWrite();
        C63220l lVar2 = (C63220l) kVar.instance;
        lVar2.mo59197a();
        lVar2.f170800a.remove(i2);
        return (C63220l) kVar.build();
    }
}
