package com.google.android.apps.gsa.staticplugins.opa.p8319bb.p8324e.p8325a;

import com.google.android.apps.gsa.search.core.p6519al.p6606bp.C85001d;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.shared.p7066m.C90014bt;
import com.google.android.apps.gsa.shared.util.p7159c.C90873ag;
import com.google.android.apps.gsa.staticplugins.accl.C92718b;
import com.google.android.apps.gsa.staticplugins.opa.p8300as.p8301a.C107502c;
import com.google.android.apps.gsa.staticplugins.opa.p8300as.p8301a.C107504e;
import com.google.android.apps.gsa.staticplugins.opa.p8319bb.C107944s;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.common.base.C58833ax;
import com.google.common.p4526f.C59071e;
import dagger.C68214a;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.bb.e.a.q */
/* compiled from: PG */
public final class C107842q implements C107839n {

    /* renamed from: a */
    public static final C59071e f300082a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.opa.bb.e.a.q");

    /* renamed from: b */
    private final C68214a f300083b;

    /* renamed from: c */
    private final C85001d f300084c;

    /* renamed from: d */
    private final C86124t f300085d;

    /* renamed from: e */
    private final C22871g f300086e;

    public C107842q(C68214a aVar, C85001d dVar, C86124t tVar, C22871g gVar) {
        this.f300083b = aVar;
        this.f300084c = dVar;
        this.f300085d = tVar;
        this.f300086e = gVar;
    }

    /* renamed from: a */
    public final /* synthetic */ void mo96296a() {
    }

    /* renamed from: b */
    public final void mo96297b(C107504e eVar, C58833ax axVar, C107944s sVar) {
        C107502c a = C107502c.m178394a(eVar.f299118b);
        if (a == null) {
            a = C107502c.UNDEFINED;
        }
        if (a == C107502c.OPA_UI_DISMISS_CLIENT_EVENT && this.f300085d.mo79746e(C90014bt.f247255dh)) {
            new C90873ag(this.f300084c.mo78598b(((C92718b) this.f300083b.mo27525b()).mo87449a(0)), this.f300086e, "logDismissedConversation", C107840o.f300080a).mo85223a(C107841p.f300081a);
        }
    }
}
