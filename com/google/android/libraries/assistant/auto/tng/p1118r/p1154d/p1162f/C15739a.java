package com.google.android.libraries.assistant.auto.tng.p1118r.p1154d.p1162f;

import com.google.android.libraries.assistant.auto.tng.p1118r.p1154d.C15680a;
import com.google.android.libraries.assistant.auto.tng.p1118r.p1154d.C15683b;
import com.google.android.libraries.assistant.auto.tng.p1118r.p1154d.C15755h;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.util.concurrent.C60866ct;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import com.google.common.util.concurrent.C60931s;

/* renamed from: com.google.android.libraries.assistant.auto.tng.r.d.f.a */
/* compiled from: PG */
public final /* synthetic */ class C15739a implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C15750l f46927a;

    public /* synthetic */ C15739a(C15750l lVar) {
        this.f46927a = lVar;
    }

    public final C60870cx apply(Object obj) {
        C15750l lVar = this.f46927a;
        if (((Boolean) obj).booleanValue()) {
            return C60866ct.f164955a;
        }
        C15755h hVar = lVar.f46944e;
        ((C58970a) ((C58970a) C15755h.f46951a.mo56224b()).mo56372aa(46260)).mo56389s("#clearCache [cacheDir: %s]", hVar.f46955e);
        C60870cx a = hVar.f46956f.mo19398a(C47810es.m84977q(new C15680a(hVar)));
        C15683b bVar = new C15683b(hVar);
        return C60922j.m93045h(a, C47810es.m84966f(bVar), hVar.f46957g);
    }
}
