package com.google.android.apps.gsa.sidekick.main.entry;

import com.google.android.apps.gsa.sidekick.shared.util.C91953ad;
import com.google.android.apps.gsa.sidekick.shared.util.C91978bb;
import com.google.p375ai.p378b.C7718hj;
import com.google.p375ai.p378b.C7725hq;
import com.google.p375ai.p378b.C7726hr;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/* renamed from: com.google.android.apps.gsa.sidekick.main.entry.d */
/* compiled from: PG */
public final class C91348d extends C91953ad {

    /* renamed from: a */
    private final C91307al f254902a;

    /* renamed from: b */
    private final C7718hj f254903b;

    /* renamed from: c */
    private final Collection f254904c;

    public C91348d(C91307al alVar, C7718hj hjVar, Collection collection) {
        this.f254902a = alVar;
        this.f254903b = hjVar;
        this.f254904c = collection;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final C7726hr mo85622a(C7726hr hrVar) {
        if ((hrVar.f27010a & 2) == 0) {
            return hrVar;
        }
        C7718hj hjVar = hrVar.f27015f;
        if (hjVar == null) {
            hjVar = C7718hj.f26927af;
        }
        if (!hjVar.equals(this.f254903b)) {
            return hrVar;
        }
        C7725hq hqVar = (C7725hq) hrVar.toBuilder();
        ArrayList arrayList = new ArrayList(hrVar.f27013d);
        Iterator it = arrayList.iterator();
        ArrayList arrayList2 = new ArrayList();
        while (it.hasNext()) {
            C7718hj hjVar2 = (C7718hj) it.next();
            Iterator it2 = this.f254904c.iterator();
            while (true) {
                if (it2.hasNext()) {
                    if (C91978bb.m150941g((C7718hj) it2.next(), hjVar2)) {
                        it.remove();
                        arrayList2.add(hjVar2);
                        break;
                    }
                } else {
                    break;
                }
            }
        }
        if (hrVar.f27013d.size() != arrayList.size()) {
            hqVar.copyOnWrite();
            ((C7726hr) hqVar.instance).f27013d = C7726hr.emptyProtobufList();
            hqVar.mo16949b(arrayList);
        }
        if (!arrayList2.isEmpty() && this.f256451g) {
            C91307al alVar = this.f254902a;
            C7718hj hjVar3 = hrVar.f27015f;
            if (hjVar3 == null) {
                hjVar3 = C7718hj.f26927af;
            }
            alVar.mo85602c(hjVar3, arrayList2);
        }
        return (C7726hr) hqVar.build();
    }
}
