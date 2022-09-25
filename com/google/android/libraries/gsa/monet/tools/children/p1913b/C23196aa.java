package com.google.android.libraries.gsa.monet.tools.children.p1913b;

import android.support.p033v7.p040e.C0430l;
import com.google.android.libraries.gsa.monet.p1886a.C22945j;
import com.google.android.libraries.gsa.monet.shared.p1891a.C23067b;
import java.util.List;

/* renamed from: com.google.android.libraries.gsa.monet.tools.children.b.aa */
/* compiled from: PG */
final class C23196aa implements C0430l {

    /* renamed from: a */
    private final C23203ah f63613a;

    /* renamed from: b */
    private final C22945j f63614b;

    /* renamed from: c */
    private final List f63615c;

    public C23196aa(C23203ah ahVar, C22945j jVar, List list) {
        this.f63613a = ahVar;
        this.f63614b = jVar;
        this.f63615c = list;
    }

    /* renamed from: a */
    public final void mo1392a(int i, int i2, Object obj) {
        throw new UnsupportedOperationException();
    }

    /* renamed from: b */
    public final void mo1393b(int i, int i2) {
        for (int i3 = 0; i3 < i2; i3++) {
            int i4 = i + i3;
            this.f63613a.mo28668g(i4, new C23221r(new C23226w((String) this.f63615c.get(i4), this.f63614b), this.f63614b));
        }
    }

    /* renamed from: c */
    public final void mo1394c(int i, int i2) {
        C23203ah ahVar = this.f63613a;
        C23067b.m43235h(i, ahVar.f63626a.size());
        C23067b.m43235h(i2, ahVar.f63626a.size());
        int f = ahVar.mo28667f((C23208e) ahVar.f63626a.get(i));
        C23208e eVar = (C23208e) ahVar.f63626a.remove(i);
        ahVar.f63626a.add(i2, eVar);
        int f2 = ahVar.mo28667f(eVar);
        if (f != f2) {
            int a = eVar.mo28662a();
            int i3 = 0;
            if (i2 > i) {
                while (i3 < eVar.mo28662a()) {
                    C23207d dVar = ahVar.f63627b;
                    dVar.getClass();
                    dVar.mo28659a(f, (f2 + a) - 1);
                    i3++;
                }
                return;
            }
            while (i3 < eVar.mo28662a()) {
                C23207d dVar2 = ahVar.f63627b;
                dVar2.getClass();
                dVar2.mo28659a(f + i3, f2 + i3);
                i3++;
            }
        }
    }

    /* renamed from: d */
    public final void mo1395d(int i, int i2) {
        for (int i3 = 0; i3 < i2; i3++) {
            this.f63613a.mo28669h(i);
        }
    }
}
