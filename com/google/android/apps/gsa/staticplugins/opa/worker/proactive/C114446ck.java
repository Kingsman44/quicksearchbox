package com.google.android.apps.gsa.staticplugins.opa.worker.proactive;

import com.google.android.apps.gsa.search.core.p6805i.C86106b;
import com.google.android.libraries.gsa.p1876k.C22862b;
import com.google.android.libraries.search.assistant.proactive.p2775g.C36275ad;
import com.google.android.libraries.search.assistant.proactive.p2775g.C36281b;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47638k;
import com.google.common.base.C58837ba;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import java.util.concurrent.ExecutionException;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.worker.proactive.ck */
/* compiled from: PG */
public final /* synthetic */ class C114446ck implements C22862b {

    /* renamed from: a */
    public final /* synthetic */ C114464db f317333a;

    public /* synthetic */ C114446ck(C114464db dbVar) {
        this.f317333a = dbVar;
    }

    /* renamed from: a */
    public final Object mo17947a() {
        C114464db dbVar = this.f317333a;
        C60870cx a = ((C36281b) dbVar.f317397r.mo27525b()).mo40089a();
        C60870cx f = ((C36275ad) dbVar.f317396q.mo27525b()).mo40081f();
        String b = ((C86106b) dbVar.f317394o.mo27525b()).mo79727b();
        if (C58837ba.m90859h(b)) {
            return C60856cj.m92899h(new ExecutionException(new Exception("Failed to get device id.")));
        }
        C60870cx e = ((C36275ad) dbVar.f317396q.mo27525b()).mo40080e();
        return C47638k.m84751b(a, f, e).mo51520a(new C114455ct(dbVar, b, f, a, e), C60826bg.f164896a);
    }
}
