package com.google.android.libraries.assistant.auto.tng.p1118r.p1154d.p1162f;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.assistant.auto.tng.p1118r.p1154d.C15688c;
import com.google.android.libraries.assistant.auto.tng.p1118r.p1154d.C15755h;
import com.google.android.libraries.assistant.soda.C19245ah;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47633f;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import com.google.common.util.concurrent.C60931s;

/* renamed from: com.google.android.libraries.assistant.auto.tng.r.d.f.b */
/* compiled from: PG */
public final /* synthetic */ class C15740b implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C15750l f46928a;

    public /* synthetic */ C15740b(C15750l lVar) {
        this.f46928a = lVar;
    }

    public final C60870cx apply(Object obj) {
        C15750l lVar = this.f46928a;
        String str = (String) obj;
        int a = C19245ah.m36693a((String) lVar.f46942c.mo22525a(str).mo56109e(BuildConfig.FLAVOR));
        C15755h hVar = lVar.f46944e;
        C60870cx d = hVar.f46952b.mo46042d();
        C15688c cVar = new C15688c(hVar, str, a);
        return C47633f.m84733g(C60922j.m93044g(d, C47810es.m84963c(cVar), hVar.f46957g)).mo51516i(new C15739a(lVar), lVar.f46940a).mo51516i(new C15741c(lVar, str, a), lVar.f46940a).mo51516i(new C15742d(lVar), lVar.f46940a).mo51516i(new C15743e(lVar), lVar.f46940a).mo51516i(new C15744f(lVar), lVar.f46940a).mo51515h(C15745g.f46935a, lVar.f46940a).mo51513e(Exception.class, C15746h.f46936a, lVar.f46940a);
    }
}
