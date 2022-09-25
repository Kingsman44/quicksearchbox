package com.google.android.apps.gsa.staticplugins.p7374ag;

import com.google.android.apps.gsa.shared.logger.C89886e;
import com.google.android.apps.gsa.shared.logger.C89911f;
import com.google.android.apps.gsa.shared.logger.p7054d.C89885b;
import com.google.android.apps.gsa.shared.p7127q.C90457d;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;

/* renamed from: com.google.android.apps.gsa.staticplugins.ag.q */
/* compiled from: PG */
public final /* synthetic */ class C93837q implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C93809aa f262094a;

    public /* synthetic */ C93837q(C93809aa aaVar) {
        this.f262094a = aaVar;
    }

    public final C60870cx apply(Object obj) {
        C90457d dVar;
        C93809aa aaVar = this.f262094a;
        Throwable th = (Throwable) obj;
        if (th instanceof C90457d) {
            dVar = (C90457d) th;
        } else {
            dVar = new C90457d(th, (int) C89885b.COOKIE_MANAGER_EXCEPTION_VALUE);
        }
        if (aaVar.f262046l == null) {
            C59104x c = C93809aa.f262034a.mo56225c();
            c.mo56378ag(C58975e.f156826a, "WebViewCookiesAsync");
            ((C59052c) ((C59052c) ((C59052c) c).mo56382g(dVar)).mo56372aa(19071)).mo56386p("Unrecoverable error happened, cookies will be disabled");
            aaVar.f262046l = dVar;
            C89886e b = ((C89911f) aaVar.f262038d.mo27525b()).mo83756b(dVar);
            b.f246282c = 63134244;
            b.mo83721a();
        }
        return C60856cj.m92899h(dVar);
    }
}
