package com.google.android.apps.gsa.staticplugins.opa;

import com.google.android.apps.gsa.search.shared.service.C87673aa;
import com.google.android.apps.gsa.search.shared.service.C87677ae;
import com.google.android.apps.gsa.search.shared.service.C87682aj;
import com.google.android.apps.gsa.search.shared.service.C88486g;
import com.google.android.apps.gsa.search.shared.service.ClientConfig;
import com.google.android.apps.gsa.shared.util.C90757ba;
import com.google.android.apps.gsa.staticplugins.opa.util.C113884o;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.base.C58838bb;
import com.google.common.p4552o.amo;
import dagger.C68214a;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.mv */
/* compiled from: PG */
public final class C109717mv {

    /* renamed from: a */
    private final C87677ae f305674a;

    /* renamed from: b */
    private final C68214a f305675b;

    /* renamed from: c */
    private C58833ax f305676c = C58836b.f156633a;

    public C109717mv(C87677ae aeVar, C68214a aVar) {
        this.f305674a = aeVar;
        this.f305675b = aVar;
    }

    /* renamed from: a */
    public final C87673aa mo98047a() {
        C58838bb.m90884s(this.f305676c.mo56113h(), "SearchServiceClient has not been created");
        return (C87673aa) this.f305676c.mo56107c();
    }

    /* renamed from: b */
    public final void mo98048b(C90757ba baVar) {
        C58838bb.m90884s(!this.f305676c.mo56113h(), "SearchServiceClient has been created");
        C87677ae aeVar = this.f305674a;
        C88486g gVar = new C88486g();
        gVar.f239199a = 4411200389408L;
        gVar.f239201c = amo.OPA_ANDROID;
        gVar.f239204f = "opa";
        if (((C113884o) this.f305675b.mo27525b()).mo100742a()) {
            gVar.f239200b = 16;
        }
        this.f305676c = C58833ax.m90834k(aeVar.mo81958a((C87682aj) null, baVar, new ClientConfig(gVar)));
    }
}
