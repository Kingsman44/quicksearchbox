package com.google.android.apps.gsa.staticplugins.p7686co;

import android.content.Context;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.shared.p7144t.C90615f;
import com.google.android.libraries.gcoreclient.p1759f.p1760a.C21502d;
import com.google.android.libraries.gcoreclient.p1759f.p1760a.C21503e;
import com.google.android.libraries.gcoreclient.p1759f.p1760a.C21507i;
import com.google.android.libraries.gcoreclient.p1759f.p1760a.C21508j;
import com.google.android.libraries.gcoreclient.p1759f.p1760a.C21509k;
import com.google.android.libraries.gcoreclient.p1759f.p1760a.C21521w;
import com.google.android.libraries.gcoreclient.p1759f.p1760a.C21523y;
import com.google.android.libraries.gcoreclient.p1763h.p1764a.C21547d;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.common.util.concurrent.C60870cx;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.apps.gsa.staticplugins.co.q */
/* compiled from: PG */
public final class C98477q extends C90615f {

    /* renamed from: a */
    public final C86124t f274978a;

    /* renamed from: b */
    public final C69464a f274979b;

    /* renamed from: c */
    public final C69464a f274980c;

    /* renamed from: d */
    public final C21521w f274981d;

    /* renamed from: e */
    public final C21507i f274982e;

    /* renamed from: f */
    private final String f274983f;

    /* renamed from: g */
    private final C69464a f274984g;

    /* renamed from: h */
    private final C69464a f274985h;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C98477q(Context context, C22871g gVar, String str, C86124t tVar, C69464a aVar, C69464a aVar2, C69464a aVar3, C69464a aVar4, C21521w wVar, C21507i iVar, C69464a aVar5) {
        super("GmsConManHelper", context, gVar, 30000, aVar);
        this.f274983f = str;
        this.f274978a = tVar;
        this.f274984g = aVar2;
        this.f274985h = aVar3;
        this.f274979b = aVar4;
        this.f274981d = wVar;
        this.f274982e = iVar;
        this.f274980c = aVar5;
    }

    /* renamed from: a */
    public final C60870cx mo91130a(C21523y yVar) {
        return mo84765i(new C98475o(this, yVar), "Execute UpdateFenceRegistration");
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final void mo84763c(C21547d dVar) {
        C21503e eVar = ((C21502d) this.f274984g.mo17428b()).f59923a;
        C21508j jVar = (C21508j) this.f274985h.mo17428b();
        jVar.f59924a = "com.google.android.apps.gsa.staticplugins.proactive.GmsContextManagerClientHelper";
        dVar.mo26981b(eVar, new C21509k(jVar.f59924a));
        dVar.mo26985f(this.f274983f);
    }
}
