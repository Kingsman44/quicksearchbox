package com.google.android.libraries.assistant.assistantactions.p621c.p631d.p632a;

import com.google.android.apps.gsa.shared.logger.p7051b.C89849ae;
import com.google.android.apps.gsa.shared.logger.p7051b.C89859i;
import com.google.android.apps.gsa.shared.p7066m.C90015bu;
import com.google.android.apps.gsa.shared.p7066m.C90025cd;
import com.google.android.libraries.assistant.assistantactions.p621c.p631d.C11241b;
import com.google.android.libraries.gsa.actionusermodel.C22111cc;
import com.google.android.libraries.gsa.actionusermodel.C22112cd;
import com.google.android.libraries.gsa.actionusermodel.C22113ce;
import com.google.android.libraries.gsa.actionusermodel.C22114cf;
import com.google.android.libraries.gsa.actionusermodel.C22117ci;
import com.google.android.libraries.gsa.actionusermodel.C22118cj;
import com.google.common.p4522b.C58370cn;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60887da;
import com.google.common.util.concurrent.C60922j;
import com.google.p4152bb.p4153a.C55421x;
import com.google.p4184bj.p4193c.p4200e.C55998f;
import com.google.protos.p4985f.p4986a.C64708r;
import java.util.List;
import p3186j$.util.Collection;
import p3186j$.util.Optional;

/* renamed from: com.google.android.libraries.assistant.assistantactions.c.d.a.g */
/* compiled from: PG */
public final class C11235g implements C11241b {

    /* renamed from: a */
    private final C22118cj f36645a;

    /* renamed from: b */
    private final C60887da f36646b;

    public C11235g(C22118cj cjVar, C60887da daVar) {
        this.f36645a = cjVar;
        this.f36646b = daVar;
    }

    /* renamed from: a */
    public final C60870cx mo19657a(String str, C55421x xVar, List list, String str2) {
        C22118cj cjVar = this.f36645a;
        Optional of = Optional.m71637of(str2);
        ((C89859i) cjVar.f60948b.mo27525b()).mo83702b(C89849ae.AUM_RESOLVE_CONTACT_STARTED);
        C55421x xVar2 = xVar;
        String str3 = str;
        return C60922j.m93044g(cjVar.f60949c.mo28209i(cjVar.mo27361a().mo27339j(xVar2, str3, (List) Collection.EL.stream(list).map(C11231c.f36641a).collect(C58370cn.f155946a), of, cjVar.f60952f.mo79753s(C90015bu.f247851a), cjVar.f60952f.mo79746e(C90025cd.f248147e), (C64708r) null, cjVar.f60952f.mo79746e(C90025cd.f248158p), cjVar.f60952f.mo79746e(C90025cd.f248160r)), "send log event", new C22114cf(cjVar)), C11232d.f36642a, this.f36646b);
    }

    /* renamed from: b */
    public final C60870cx mo19658b(String str, C55421x xVar, String str2, String str3, String str4, List list, String str5) {
        C22118cj cjVar = this.f36645a;
        Optional of = Optional.m71637of(str5);
        ((C89859i) cjVar.f60948b.mo27525b()).mo83702b(C89849ae.AUM_RESOLVE_INSTANCE_STARTED);
        return C60922j.m93044g(cjVar.f60949c.mo28209i(cjVar.mo27361a().mo27336c(xVar, str, str2, str3, str4, list, of, cjVar.f60952f.mo79753s(C90015bu.f247851a), cjVar.f60952f.mo79746e(C90025cd.f248147e), (C64708r) null, cjVar.f60952f.mo79746e(C90025cd.f248158p), cjVar.f60952f.mo79746e(C90025cd.f248151i), cjVar.f60952f.mo79746e(C90025cd.f248160r)), "send log event", new C22111cc(cjVar)), C11230b.f36640a, this.f36646b);
    }

    /* renamed from: c */
    public final C60870cx mo19659c(String str, C55421x xVar, String str2, String str3, List list, String str4) {
        C22118cj cjVar = this.f36645a;
        Optional of = Optional.m71637of(str4);
        ((C89859i) cjVar.f60948b.mo27525b()).mo83702b(C89849ae.AUM_RESOLVE_INSTANCELABEL_STARTED);
        return C60922j.m93044g(cjVar.f60949c.mo28209i(cjVar.mo27361a().mo27337d(xVar, str, str2, str3, list, of, cjVar.f60952f.mo79753s(C90015bu.f247851a), cjVar.f60952f.mo79746e(C90025cd.f248147e), (C64708r) null, cjVar.f60952f.mo79746e(C90025cd.f248158p), cjVar.f60952f.mo79746e(C90025cd.f248151i), cjVar.f60952f.mo79746e(C90025cd.f248160r)), "send log event", new C22112cd(cjVar)), C11234f.f36644a, this.f36646b);
    }

    /* renamed from: d */
    public final C60870cx mo19660d(String str, C55421x xVar, String str2, List list, String str3) {
        C22118cj cjVar = this.f36645a;
        Optional of = Optional.m71637of(str3);
        ((C89859i) cjVar.f60948b.mo27525b()).mo83702b(C89849ae.AUM_RESOLVE_PROVIDER_STARTED);
        return C60922j.m93044g(cjVar.f60949c.mo28209i(cjVar.mo27361a().mo27338e(xVar, str, str2, list, of, cjVar.f60952f.mo79753s(C90015bu.f247851a), cjVar.f60952f.mo79746e(C90025cd.f248147e), (C64708r) null, cjVar.f60952f.mo79746e(C90025cd.f248158p), cjVar.f60952f.mo79746e(C90025cd.f248160r)), "send log event", new C22113ce(cjVar)), C11233e.f36643a, this.f36646b);
    }

    /* renamed from: e */
    public final void mo19661e(C55421x xVar, C55998f fVar, String str) {
        C22118cj cjVar = this.f36645a;
        cjVar.f60949c.mo28211k(cjVar.mo27361a().mo27335b(xVar, fVar, Optional.empty(), str, cjVar.f60952f.mo79746e(C90025cd.f248147e)), "logAction writeToGeller", new C22117ci(cjVar));
    }
}
