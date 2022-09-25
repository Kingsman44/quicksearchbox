package com.google.android.apps.search.assistant.verticals.p9880a.p9892h.p9895c;

import android.content.pm.PackageManager;
import com.google.android.apps.search.assistant.verticals.p9880a.p9883b.C130333h;
import com.google.android.apps.search.assistant.verticals.p9880a.p9883b.C130334i;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.p4522b.C58528ij;
import com.google.common.p4522b.C58529ik;
import com.google.common.p4522b.C58532in;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60888db;
import com.google.common.util.concurrent.C60922j;
import com.google.protos.p5124m.p5125a.C65603f;

/* renamed from: com.google.android.apps.search.assistant.verticals.a.h.c.n */
/* compiled from: PG */
public final class C130453n {

    /* renamed from: a */
    public static final C58532in f357413a;

    /* renamed from: b */
    public final C60888db f357414b;

    /* renamed from: c */
    public final PackageManager f357415c;

    /* renamed from: d */
    public final C58528ij f357416d;

    /* renamed from: e */
    public final C130443d f357417e;

    /* renamed from: f */
    private final C130333h f357418f;

    static {
        C58529ik ikVar = new C58529ik();
        ikVar.mo55495c("com.application.audible", "schema.org/Thing");
        ikVar.mo55495c("com.evernote", "schema.org/NoteDigitalDocument");
        ikVar.mo55495c("com.google.android.keep", "schema.org/NoteDigitalDocument");
        ikVar.mo55495c("com.google.android.apps.docs", "schema.org/TextDigitalDocument");
        f357413a = ikVar.mo55493a();
    }

    public C130453n(C60888db dbVar, PackageManager packageManager, C130443d dVar, C65603f fVar, C130333h hVar) {
        this.f357414b = dbVar;
        this.f357415c = packageManager;
        this.f357417e = dVar;
        this.f357416d = C58528ij.m90006F(fVar.f178307a);
        this.f357418f = hVar;
    }

    /* renamed from: a */
    public final C60870cx mo109704a(C58528ij ijVar) {
        C60870cx d = ((C130334i) this.f357418f).f357233a.mo46042d();
        C130450k kVar = new C130450k(ijVar);
        return C60922j.m93044g(d, C47810es.m84963c(kVar), this.f357414b);
    }

    /* renamed from: b */
    public final C60870cx mo109705b(C60870cx cxVar) {
        C130452m mVar = new C130452m(this);
        return C60922j.m93045h(cxVar, C47810es.m84966f(mVar), this.f357414b);
    }
}
