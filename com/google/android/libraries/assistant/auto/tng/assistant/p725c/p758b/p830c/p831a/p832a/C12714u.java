package com.google.android.libraries.assistant.auto.tng.assistant.p725c.p758b.p830c.p831a.p832a;

import androidx.p104d.p105a.C2164c;
import androidx.p104d.p105a.C2169h;
import com.google.android.libraries.assistant.auto.tng.assistant.p725c.p758b.p759a.p760a.p761a.C12182h;
import com.google.android.libraries.assistant.auto.tng.assistant.p877d.p878a.p879a.C12989g;
import com.google.apps.tiktok.concurrent.C46415ab;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.util.concurrent.C60866ct;
import com.google.common.util.concurrent.C60870cx;
import com.google.p4449cd.p4456g.p4457a.C57975a;

/* renamed from: com.google.android.libraries.assistant.auto.tng.assistant.c.b.c.a.a.u */
/* compiled from: PG */
final class C12714u extends C57975a {

    /* renamed from: a */
    public final C60870cx f39801a;

    /* renamed from: b */
    public final C12989g f39802b;

    /* renamed from: c */
    public C2164c f39803c;

    /* renamed from: d */
    final /* synthetic */ C12715v f39804d;

    /* renamed from: e */
    private C60870cx f39805e = C60866ct.f164955a;

    public C12714u(C12715v vVar, C12989g gVar) {
        this.f39804d = vVar;
        this.f39802b = gVar;
        this.f39801a = C2169h.m6027a(new C12712s(this));
    }

    /* renamed from: c */
    public final /* bridge */ /* synthetic */ void mo20337c(Object obj) {
        C60870cx cxVar = this.f39805e;
        C12710q qVar = new C12710q(this, (C12182h) obj);
        this.f39805e = C46415ab.m82768b(cxVar, C47810es.m84965e(qVar), this.f39804d.f39806a);
    }

    /* renamed from: gQ */
    public final void mo20339gQ(boolean z) {
        if (z) {
            C2164c cVar = this.f39803c;
            if (cVar != null) {
                cVar.mo5438c();
                this.f39803c = null;
                return;
            }
            return;
        }
        this.f39805e.mo4106b(C47810es.m84977q(new C12713t(this)), this.f39804d.f39806a);
    }

    /* renamed from: gR */
    public final void mo20340gR(Throwable th) {
        this.f39805e.mo4106b(C47810es.m84977q(new C12711r(this, th)), this.f39804d.f39806a);
    }
}
