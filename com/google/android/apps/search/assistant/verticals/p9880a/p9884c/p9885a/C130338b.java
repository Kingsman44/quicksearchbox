package com.google.android.apps.search.assistant.verticals.p9880a.p9884c.p9885a;

import android.content.ComponentName;
import com.google.android.apps.search.assistant.verticals.p9880a.p9884c.p9886b.C130352d;
import com.google.android.libraries.search.assistant.invocation.assistdata.api.AssistStateResult;
import com.google.android.libraries.search.assistant.invocation.p2655o.p2656a.C34053bp;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.p4526f.C59052c;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import com.google.common.util.concurrent.C60931s;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.search.assistant.verticals.a.c.a.b */
/* compiled from: PG */
public final /* synthetic */ class C130338b implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C130346j f357235a;

    /* renamed from: b */
    public final /* synthetic */ C34053bp f357236b;

    public /* synthetic */ C130338b(C130346j jVar, C34053bp bpVar) {
        this.f357235a = jVar;
        this.f357236b = bpVar;
    }

    public final C60870cx apply(Object obj) {
        C130346j jVar = this.f357235a;
        C34053bp bpVar = this.f357236b;
        AssistStateResult assistStateResult = (AssistStateResult) obj;
        if (assistStateResult == null) {
            ((C59052c) ((C59052c) C130346j.f357244a.mo56226d()).mo56372aa(39415)).mo56386p("Cannot get foreground activity since assist data is null.");
            return C60856cj.m92900i(C130345i.m212784a());
        }
        Optional e = C130352d.m212808e(assistStateResult.f89683b, assistStateResult.f89684c);
        if (e.isEmpty() || !C130352d.f357260c.contains(((ComponentName) e.get()).getPackageName())) {
            return C60856cj.m92900i(C130345i.m212784a());
        }
        C60870cx a = jVar.f357246c.mo105245a(bpVar).mo39113a();
        C130337a aVar = new C130337a((ComponentName) e.get());
        return C60922j.m93044g(a, C47810es.m84963c(aVar), jVar.f357245b);
    }
}
