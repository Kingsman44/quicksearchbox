package com.google.android.apps.gsa.staticplugins.hotwordenrollment.pages.p8007i;

import com.google.android.apps.gsa.search.shared.service.C87673aa;
import com.google.android.apps.gsa.search.shared.service.C88489j;
import com.google.android.apps.gsa.search.shared.service.p6935b.C87739bu;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88193sp;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88194sq;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88195sr;
import com.google.android.apps.gsa.shared.util.p7159c.C90891ay;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.staticplugins.hotwordenrollment.pages.i.ai */
/* compiled from: PG */
final class C102087ai extends C90891ay {

    /* renamed from: a */
    final /* synthetic */ String f284782a;

    /* renamed from: b */
    final /* synthetic */ String f284783b;

    /* renamed from: c */
    final /* synthetic */ C102088aj f284784c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C102087ai(C102088aj ajVar, String str, String str2) {
        super("Send reauth request");
        this.f284784c = ajVar;
        this.f284782a = str;
        this.f284783b = str2;
    }

    /* renamed from: gl */
    public final void mo17910gl(Throwable th) {
        this.f284784c.f284795k.mo87058b();
        C59104x d = C102088aj.f284785a.mo56226d();
        d.mo56378ag(C58975e.f156826a, "LocalEscScreenFragment");
        ((C59052c) ((C59052c) ((C59052c) d).mo56382g(th)).mo56372aa(20543)).mo56386p("Error getting authentication token");
    }

    /* renamed from: gm */
    public final /* bridge */ /* synthetic */ void mo17911gm(Object obj) {
        String str = (String) obj;
        if (str == null) {
            C59104x d = C102088aj.f284785a.mo56226d();
            d.mo56378ag(C58975e.f156826a, "LocalEscScreenFragment");
            ((C59052c) ((C59052c) d).mo56372aa(20544)).mo56386p("Error getting authentication token");
            return;
        }
        C88194sq sqVar = (C88194sq) C88195sr.f238409f.createBuilder();
        String str2 = this.f284782a;
        sqVar.copyOnWrite();
        C88195sr srVar = (C88195sr) sqVar.instance;
        str2.getClass();
        srVar.f238411a |= 8;
        srVar.f238415e = str2;
        String str3 = this.f284783b;
        sqVar.copyOnWrite();
        C88195sr srVar2 = (C88195sr) sqVar.instance;
        str3.getClass();
        srVar2.f238411a |= 2;
        srVar2.f238413c = str3;
        sqVar.copyOnWrite();
        C88195sr srVar3 = (C88195sr) sqVar.instance;
        srVar3.f238411a |= 4;
        srVar3.f238414d = str;
        C87673aa a = this.f284784c.mo92864a();
        C88489j jVar = new C88489j(C87739bu.REAUTH_CLIENT_EVENT);
        jVar.mo82014b(C88193sp.f238408a, (C88195sr) sqVar.build());
        a.mo81937i(jVar.mo82013a());
    }
}
