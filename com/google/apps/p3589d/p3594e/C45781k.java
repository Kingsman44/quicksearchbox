package com.google.apps.p3589d.p3594e;

import com.google.apps.p3589d.p3591b.C45712c;
import com.google.apps.p3589d.p3593d.C45742aj;
import com.google.apps.p3589d.p3593d.C45743b;
import com.google.apps.p3589d.p3593d.C45745d;
import com.google.apps.p3589d.p3593d.C45755n;
import com.google.apps.p3589d.p3593d.C45763v;

/* renamed from: com.google.apps.d.e.k */
/* compiled from: PG */
public final /* synthetic */ class C45781k implements C45742aj {

    /* renamed from: a */
    public final /* synthetic */ int f120375a;

    /* renamed from: b */
    public final /* synthetic */ C45790t f120376b;

    public /* synthetic */ C45781k(int i, C45790t tVar) {
        this.f120375a = i;
        this.f120376b = tVar;
    }

    /* renamed from: a */
    public final void mo49866a(C45763v vVar, C45755n nVar) {
        int i = this.f120375a;
        C45790t tVar = this.f120376b;
        int i2 = C45791u.f120394b;
        if (vVar.f120343b.mo49885c(i, i)) {
            C45763v vVar2 = nVar.f120315d;
            boolean z = vVar2 != vVar;
            boolean z2 = vVar2 == vVar;
            if (i == ((C45745d) vVar.f120343b).f120265a) {
                tVar.f120392a = z2;
                tVar.f120393b = z;
            }
            C45712c cVar = new C45712c(vVar.f120342a);
            while (cVar.hasNext()) {
                C45743b bVar = (C45743b) ((C45755n) cVar.next()).f120318g;
                if (bVar.f120261c == i || bVar.f120262d == i) {
                    tVar.f120392a = z2;
                    tVar.f120393b = !z2 && bVar.f120262d == i;
                }
            }
        }
    }
}
