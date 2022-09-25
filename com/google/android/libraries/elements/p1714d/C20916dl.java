package com.google.android.libraries.elements.p1714d;

import com.google.android.libraries.elements.internal.C21359t;
import com.google.p370af.C7490c;
import com.youtube.p5283a.p5284a.C68042ae;
import com.youtube.p5283a.p5284a.C68074bj;
import com.youtube.p5283a.p5284a.C68085g;

/* renamed from: com.google.android.libraries.elements.d.dl */
/* compiled from: PG */
public final class C20916dl {
    /* renamed from: a */
    static C68074bj m39327a(C68042ae aeVar, Boolean bool) {
        int a;
        C7490c cVar = new C7490c(0);
        C68085g gVar = new C68085g();
        int a2 = aeVar.mo16913a(8);
        C68085g gVar2 = null;
        if (a2 != 0) {
            int i = a2 + aeVar.f24703a;
            gVar.mo16917e(i + aeVar.f24704b.getInt(i), aeVar.f24704b);
        } else {
            gVar = null;
        }
        int a3 = C21359t.m40376a(cVar, gVar);
        C68085g gVar3 = new C68085g();
        int a4 = aeVar.mo16913a(10);
        if (a4 != 0) {
            int i2 = a4 + aeVar.f24703a;
            gVar3.mo16917e(i2 + aeVar.f24704b.getInt(i2), aeVar.f24704b);
        } else {
            gVar3 = null;
        }
        int a5 = C21359t.m40376a(cVar, gVar3);
        C68085g gVar4 = new C68085g();
        int a6 = aeVar.mo16913a(4);
        if (a6 != 0) {
            int i3 = a6 + aeVar.f24703a;
            gVar4.mo16917e(i3 + aeVar.f24704b.getInt(i3), aeVar.f24704b);
            gVar2 = gVar4;
        }
        int a7 = C21359t.m40376a(cVar, gVar2);
        long j = 0;
        if (!bool.booleanValue() && (a = aeVar.mo16913a(6)) != 0) {
            j = 4294967295L & ((long) aeVar.f24704b.getInt(a + aeVar.f24703a));
        }
        cVar.mo16911t(C68074bj.m98366l(cVar, a7, j, a3, a5));
        cVar.mo16902j();
        return C68074bj.m98365k(cVar.f24688a);
    }
}
