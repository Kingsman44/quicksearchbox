package com.google.android.apps.gsa.staticplugins.opa.webview.p8603a;

import com.google.android.apps.gsa.search.core.service.C86610af;
import com.google.android.apps.gsa.search.core.service.C86775r;
import com.google.android.apps.gsa.shared.logger.C89911f;
import com.google.android.apps.gsa.shared.logger.p7054d.C89885b;
import com.google.android.apps.gsa.shared.p7127q.C90452a;
import com.google.common.base.C58881cr;
import dagger.p5294a.C68220f;
import dagger.p5294a.C68221g;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.webview.a.k */
/* compiled from: PG */
public final class C114176k implements C68220f {

    /* renamed from: a */
    private final C69464a f316576a;

    /* renamed from: b */
    private final C69464a f316577b;

    public C114176k(C69464a aVar, C69464a aVar2) {
        this.f316576a = aVar;
        this.f316577b = aVar2;
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ Object mo17428b() {
        C58881cr crVar = (C58881cr) ((C68221g) this.f316577b).f184583a;
        C86775r rVar = ((C86610af) ((C68221g) this.f316576a).f184583a).f233977l;
        if (rVar != null) {
            return Long.valueOf(rVar.f234381c);
        }
        ((C89911f) crVar.mo6453a()).mo83756b(new C90452a(211, C89885b.OPA_LOCKHART_ATTACHED_CLIENT_MISSING_VALUE)).mo83721a();
        throw new IllegalStateException("AttachedClient is missing.");
    }
}
