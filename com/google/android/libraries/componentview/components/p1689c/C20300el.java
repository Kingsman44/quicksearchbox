package com.google.android.libraries.componentview.components.p1689c;

import com.google.android.libraries.componentview.components.p1689c.p1690a.C20150bt;
import com.google.android.libraries.componentview.components.p1689c.p1690a.C20156bz;
import com.google.protobuf.C62971cq;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* renamed from: com.google.android.libraries.componentview.components.c.el */
/* compiled from: PG */
final class C20300el {

    /* renamed from: a */
    HashMap f57036a = new HashMap();

    /* renamed from: b */
    List f57037b = new ArrayList();

    /* renamed from: c */
    C20150bt f57038c;

    /* renamed from: d */
    C20150bt f57039d;

    /* renamed from: e */
    double f57040e;

    public C20300el(C20156bz bzVar) {
        C20150bt btVar = bzVar.f56542b;
        this.f57038c = btVar == null ? C20150bt.f56516e : btVar;
        C20150bt btVar2 = bzVar.f56544d;
        this.f57039d = btVar2 == null ? C20150bt.f56516e : btVar2;
        this.f57040e = bzVar.f56543c;
        if (bzVar.f56545e.size() != 0) {
            C62971cq<C20150bt> cqVar = bzVar.f56545e;
            if (this.f57038c.f56518a.isEmpty()) {
                this.f57038c = (C20150bt) cqVar.get(0);
            }
            if (this.f57039d.f56518a.isEmpty()) {
                this.f57039d = (C20150bt) cqVar.get(1);
            }
            for (C20150bt btVar3 : cqVar) {
                this.f57036a.put(btVar3.f56518a, btVar3);
                this.f57037b.add(btVar3.f56518a);
            }
        }
    }
}
