package com.google.apps.p3589d.p3594e;

import com.google.apps.p3589d.p3591b.C45712c;
import com.google.apps.p3589d.p3591b.C45723n;
import com.google.apps.p3589d.p3593d.C45743b;
import com.google.apps.p3589d.p3593d.C45750i;
import com.google.apps.p3589d.p3593d.C45751j;
import com.google.apps.p3589d.p3593d.C45755n;
import com.google.apps.p3589d.p3593d.C45763v;

/* renamed from: com.google.apps.d.e.b */
/* compiled from: PG */
final class C45772b extends C45750i {

    /* renamed from: a */
    private final int f120360a;

    /* renamed from: b */
    private final C45755n f120361b;

    /* renamed from: c */
    private final C45755n f120362c;

    public C45772b(C45755n nVar, C45755n nVar2) {
        this.f120360a = ((C45743b) nVar.f120318g).f120260b;
        this.f120361b = nVar;
        this.f120362c = nVar2;
    }

    /* renamed from: a */
    public final C45763v mo49883a(C45763v vVar) {
        C45751j jVar = vVar.f120343b;
        int i = this.f120360a;
        if (!jVar.mo49885c(i, i)) {
            return vVar;
        }
        C45723n nVar = new C45723n(0);
        C45712c cVar = new C45712c(vVar.f120342a);
        while (cVar.hasNext()) {
            C45755n nVar2 = (C45755n) cVar.next();
            if (nVar2 == this.f120361b) {
                nVar.f120220a.add(this.f120362c);
            } else {
                C45743b bVar = (C45743b) nVar2.f120318g;
                int i2 = bVar.f120260b;
                int i3 = this.f120360a;
                if (i2 <= i3 && i3 <= bVar.f120262d) {
                    nVar2 = nVar2.mo49862a(this);
                }
                nVar.f120220a.add(nVar2);
            }
        }
        return C45763v.m81597e(nVar);
    }
}
