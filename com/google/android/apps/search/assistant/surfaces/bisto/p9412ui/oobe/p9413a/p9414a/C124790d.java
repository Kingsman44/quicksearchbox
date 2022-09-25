package com.google.android.apps.search.assistant.surfaces.bisto.p9412ui.oobe.p9413a.p9414a;

import com.google.android.apps.search.assistant.surfaces.bisto.p9412ui.oobe.p9413a.C124786a;
import com.google.android.gms.auth.UserRecoverableAuthException;
import com.google.apps.tiktok.tracing.C47558bi;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.apps.tiktok.tracing.C47831fm;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47633f;
import com.google.common.p4522b.C58759qy;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.apps.search.assistant.surfaces.bisto.ui.oobe.a.a.d */
/* compiled from: PG */
public final class C124790d implements C124786a {

    /* renamed from: a */
    private final Executor f344296a;

    /* renamed from: b */
    private final C124797k f344297b;

    public C124790d(C124797k kVar, Executor executor) {
        this.f344297b = kVar;
        this.f344296a = executor;
    }

    /* renamed from: a */
    public final C60870cx mo106645a() {
        C124797k kVar = this.f344297b;
        C58759qy qyVar = new C58759qy("https://www.googleapis.com/auth/assistant");
        C47558bi a = C47831fm.m85006a("Add authorization token");
        try {
            C60870cx h = C60922j.m93045h(kVar.f344314g.mo50246c(kVar.f344309b), C47810es.m84966f(new C124796j(kVar, qyVar)), kVar.f344312e);
            a.mo51417a(h);
            a.close();
            return C47633f.m84733g(h).mo51515h(C124787a.f344294a, this.f344296a).mo51513e(UserRecoverableAuthException.class, C124788b.f344295a, this.f344296a);
        } catch (Throwable th) {
            C124791e.m204573a(th, th);
        }
        throw th;
    }
}
