package com.google.android.apps.search.assistant.verticals.p9880a.p9884c.p9885a;

import com.google.android.apps.search.assistant.verticals.p9880a.p9884c.C130348b;
import com.google.android.libraries.search.assistant.invocation.p2655o.p2656a.C34053bp;
import com.google.android.libraries.search.assistant.p2705n.p2706a.C34831e;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.p4526f.C59052c;
import com.google.common.util.concurrent.C60846c;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import com.google.common.util.concurrent.C60931s;

/* renamed from: com.google.android.apps.search.assistant.verticals.a.c.a.d */
/* compiled from: PG */
public final /* synthetic */ class C130340d implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C130346j f357238a;

    /* renamed from: b */
    public final /* synthetic */ C34053bp f357239b;

    public /* synthetic */ C130340d(C130346j jVar, C34053bp bpVar) {
        this.f357238a = jVar;
        this.f357239b = bpVar;
    }

    public final C60870cx apply(Object obj) {
        C130346j jVar = this.f357238a;
        C34053bp bpVar = this.f357239b;
        C130345i iVar = (C130345i) obj;
        int e = iVar.mo109674e();
        if (e == 0) {
            throw null;
        } else if (e == 1) {
            ((C59052c) ((C59052c) C130346j.f357244a.mo56226d()).mo56372aa(39416)).mo56386p("Cannot get foreground activity, return empty app control data.");
            return C60856cj.m92900i(C130348b.m212798a().mo109666a());
        } else {
            C60870cx e2 = jVar.f357246c.mo105245a(bpVar).mo39117e(iVar.mo109672c());
            C130342f fVar = C130342f.f357241a;
            Class<C34831e> cls = C34831e.class;
            C60870cx g = C60846c.m92878g(e2, cls, C47810es.m84963c(fVar), jVar.f357245b);
            C130344h hVar = new C130344h(iVar);
            return C60922j.m93044g(g, C47810es.m84963c(hVar), jVar.f357245b);
        }
    }
}
