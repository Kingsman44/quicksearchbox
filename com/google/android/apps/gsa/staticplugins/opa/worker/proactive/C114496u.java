package com.google.android.apps.gsa.staticplugins.opa.worker.proactive;

import android.content.Context;
import com.google.android.apps.gsa.search.core.google.gaia.C86054o;
import com.google.android.libraries.search.location.C38697c;
import com.google.android.libraries.search.p3047m.p3050b.C39226b;
import com.google.assistant.p3897e.p3921j.aas;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.worker.proactive.u */
/* compiled from: PG */
public final class C114496u {

    /* renamed from: a */
    public static final C59071e f317466a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.opa.worker.proactive.u");

    /* renamed from: b */
    public static final C39226b f317467b = C39226b.TAG_CLASSIC_ASSISTANT_NOTIFICATIONS;

    /* renamed from: c */
    public final Context f317468c;

    /* renamed from: d */
    public final C86054o f317469d;

    /* renamed from: e */
    public final Executor f317470e;

    /* renamed from: f */
    public final C38697c f317471f;

    public C114496u(Context context, C86054o oVar, Executor executor, C38697c cVar) {
        this.f317468c = context;
        this.f317469d = oVar;
        this.f317470e = executor;
        this.f317471f = cVar;
    }

    /* renamed from: a */
    public final C60870cx mo101355a(String str) {
        if (this.f317469d.mo79668a() == null) {
            return C60856cj.m92899h(new NullPointerException("Account not found."));
        }
        return this.f317471f.mo41559b("com.google.android.apps.gsa.staticplugins.opa.worker.proactive.ContextFenceRegistration", str, f317467b);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final String mo101356b(aas aas) {
        return "opa_notification_fence_".concat(String.valueOf(aas.f134670h));
    }
}
