package com.google.android.apps.gsa.shared.p6990an.p6991a;

import com.google.android.apps.gsa.shared.util.p7159c.C90931ca;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.shared.an.a.g */
/* compiled from: PG */
public final class C89202g {

    /* renamed from: a */
    Object f241825a;

    /* renamed from: b */
    int f241826b = 0;

    /* renamed from: c */
    private final C89197b f241827c;

    public C89202g(C89198c cVar, C89206k kVar, C90931ca caVar, C22871g gVar, C22871g gVar2, C22871g gVar3) {
        C89197b bVar = new C89197b(cVar, kVar, caVar, gVar, gVar2, gVar3);
        this.f241827c = bVar;
    }

    /* renamed from: g */
    private final synchronized void m145076g(int i) {
        m145077h(i, (Object) null);
    }

    /* renamed from: h */
    private final synchronized void m145077h(int i, Object obj) {
        C58976aa aaVar = C58975e.f156826a;
        if (obj != null) {
            this.f241825a = obj;
        }
        switch (i) {
            case 10:
                C89197b bVar = this.f241827c;
                for (Object next : bVar.f241819a.mo82285a()) {
                    if (next instanceof C89200e) {
                        ((C89200e) next).mo82185d(bVar.f241819a);
                    }
                }
                C89197b bVar2 = this.f241827c;
                for (Object next2 : bVar2.f241819a.mo82285a()) {
                    if (next2 instanceof C89203h) {
                        C89203h hVar = (C89203h) next2;
                        hVar.mo78005hC(new C89205j(hVar.getClass().getName(), bVar2.f241820b));
                    }
                }
                C89197b bVar3 = this.f241827c;
                for (Object next3 : bVar3.f241819a.mo82285a()) {
                    if (next3 instanceof C89196a) {
                        C89196a aVar = (C89196a) next3;
                        aVar.mo82222f(bVar3.f241821c);
                        aVar.mo82226hG(bVar3.f241822d);
                        aVar.mo82225hF(bVar3.f241823e);
                        aVar.mo82223g(bVar3.f241824f);
                    }
                }
                this.f241827c.mo83154a(this.f241825a);
                this.f241826b = 2;
                return;
            case 11:
                this.f241827c.mo83154a(this.f241825a);
                return;
            case 12:
                for (Object next4 : this.f241827c.f241819a.mo82285a()) {
                    if (next4 instanceof C89207l) {
                        ((C89207l) next4).mo78004e();
                    }
                }
                break;
            case 13:
                break;
            case 14:
                for (Object next5 : this.f241827c.f241819a.mo82285a()) {
                    if (next5 instanceof C89204i) {
                        ((C89204i) next5).mo78006hE();
                    }
                }
                return;
            case 15:
                for (Object next6 : this.f241827c.f241819a.mo82285a()) {
                    if (next6 instanceof C89196a) {
                        ((C89196a) next6).mo82227i();
                    }
                }
                this.f241826b = 2;
                return;
            default:
                for (Object next7 : this.f241827c.f241819a.mo82285a()) {
                    if (next7 instanceof C89201f) {
                        ((C89201f) next7).mo82249a();
                    }
                }
                this.f241826b = 3;
                return;
        }
        for (Object next8 : this.f241827c.f241819a.mo82285a()) {
            if (next8 instanceof C89196a) {
                ((C89196a) next8).mo82224h();
            }
        }
        this.f241826b = 1;
    }

    /* renamed from: a */
    public final synchronized void mo83155a() {
        C58976aa aaVar = C58975e.f156826a;
        mo83160f();
        if (this.f241826b == 2) {
            m145076g(16);
        }
    }

    /* renamed from: b */
    public final synchronized void mo83156b(Object obj) {
        C58976aa aaVar = C58975e.f156826a;
        m145077h(11, obj);
    }

    /* renamed from: c */
    public final synchronized void mo83157c() {
        C58976aa aaVar = C58975e.f156826a;
        int i = this.f241826b;
        if (i == 1 || i == 2) {
            m145076g(14);
        }
    }

    /* renamed from: d */
    public final synchronized void mo83158d(Object obj) {
        C58976aa aaVar = C58975e.f156826a;
        if (this.f241826b == 0) {
            m145077h(10, obj);
        }
    }

    /* renamed from: e */
    public final synchronized void mo83159e() {
        C58976aa aaVar = C58975e.f156826a;
        if (this.f241826b == 2) {
            m145076g(12);
        }
    }

    /* renamed from: f */
    public final synchronized void mo83160f() {
        C58976aa aaVar = C58975e.f156826a;
        if (this.f241826b == 1) {
            m145076g(15);
        }
    }
}
