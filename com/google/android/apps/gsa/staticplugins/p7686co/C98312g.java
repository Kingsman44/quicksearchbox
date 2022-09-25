package com.google.android.apps.gsa.staticplugins.p7686co;

import android.content.Context;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.shared.p7130s.p7131a.C90476a;
import com.google.android.libraries.gcoreclient.p1759f.p1760a.C21507i;
import com.google.android.libraries.gcoreclient.p1759f.p1760a.C21511m;
import com.google.android.libraries.gcoreclient.p1759f.p1760a.C21521w;
import com.google.android.libraries.gcoreclient.p1759f.p1760a.C21524z;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.android.libraries.p1730f.p1731a.C21378h;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.apps.gsa.staticplugins.co.g */
/* compiled from: PG */
public final class C98312g {

    /* renamed from: a */
    private final C98478r f274439a;

    /* renamed from: b */
    private final Object f274440b = new Object();

    /* renamed from: c */
    private C98477q f274441c;

    /* renamed from: d */
    private String f274442d;

    public C98312g(C98478r rVar) {
        this.f274439a = rVar;
    }

    /* renamed from: a */
    public final C98477q mo91045a(String str) {
        C98477q qVar;
        String str2 = str;
        synchronized (this.f274440b) {
            if (this.f274441c == null || !str2.equals(this.f274442d)) {
                C98478r rVar = this.f274439a;
                Context context = (Context) rVar.f274986a.mo17428b();
                context.getClass();
                C22871g gVar = (C22871g) rVar.f274987b.mo17428b();
                gVar.getClass();
                str.getClass();
                C86124t tVar = (C86124t) rVar.f274988c.mo17428b();
                tVar.getClass();
                ((C21378h) rVar.f274989d.mo17428b()).getClass();
                C69464a aVar = rVar.f274990e;
                C69464a aVar2 = rVar.f274991f;
                C69464a aVar3 = rVar.f274992g;
                C69464a aVar4 = rVar.f274993h;
                C21521w wVar = (C21521w) rVar.f274994i.mo17428b();
                wVar.getClass();
                C21507i iVar = (C21507i) rVar.f274995j.mo17428b();
                iVar.getClass();
                ((C21524z) rVar.f274996k.mo17428b()).getClass();
                ((C21511m) rVar.f274997l.mo17428b()).getClass();
                C69464a aVar5 = rVar.f274998m;
                ((C90476a) rVar.f274999n.mo17428b()).getClass();
                this.f274441c = new C98477q(context, gVar, str, tVar, aVar, aVar2, aVar3, aVar4, wVar, iVar, aVar5);
                this.f274442d = str2;
            }
            qVar = this.f274441c;
        }
        return qVar;
    }
}
