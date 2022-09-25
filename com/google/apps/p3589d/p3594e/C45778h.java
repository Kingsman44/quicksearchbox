package com.google.apps.p3589d.p3594e;

import com.google.apps.p3589d.p3590a.C45700q;
import com.google.apps.p3589d.p3590a.C45703t;
import com.google.apps.p3589d.p3592c.C45729e;
import com.google.apps.p3589d.p3593d.C45749h;
import com.google.apps.p3589d.p3593d.C45763v;
import com.google.apps.p3589d.p3596g.C45824a;
import com.google.apps.p3589d.p3596g.C45834b;
import com.google.apps.p3589d.p3596g.C45841i;
import com.google.apps.p3589d.p3596g.C45848p;
import com.google.apps.p3589d.p3600k.C45943h;

/* renamed from: com.google.apps.d.e.h */
/* compiled from: PG */
public final /* synthetic */ class C45778h implements C45700q {

    /* renamed from: a */
    public final /* synthetic */ C45791u f120369a;

    /* renamed from: b */
    public final /* synthetic */ String f120370b;

    /* renamed from: c */
    public final /* synthetic */ C45943h f120371c;

    public /* synthetic */ C45778h(C45791u uVar, String str, C45943h hVar) {
        this.f120369a = uVar;
        this.f120370b = str;
        this.f120371c = hVar;
    }

    /* renamed from: a */
    public final void mo49795a() {
        C45791u uVar = this.f120369a;
        String str = this.f120370b;
        C45943h hVar = this.f120371c;
        C45749h hVar2 = uVar.f120407c;
        C45703t tVar = uVar.f120412h;
        try {
            C45848p pVar = new C45848p(str, new C45834b(false), uVar.mo49906h().f120342a);
            C45824a aVar = new C45824a(C45749h.m81558a(pVar.mo49993b()), pVar.f120535a.f120352a);
            C45729e eVar = aVar.f120494b;
            C45763v d = aVar.f120493a.mo49882d();
            if (d != null) {
                if (!d.f120342a.f120220a.isEmpty()) {
                    uVar.mo49800a(new C45786p(uVar, d, eVar));
                }
                hVar.f120733a = true;
                return;
            }
        } catch (C45841i unused) {
        }
        uVar.mo49917s(hVar2);
        uVar.mo49801b(tVar);
    }
}
