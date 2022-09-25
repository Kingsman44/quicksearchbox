package com.google.android.libraries.search.assistant.p2511d;

import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import com.google.common.util.concurrent.C60931s;
import p3186j$.util.Optional;

/* renamed from: com.google.android.libraries.search.assistant.d.af */
/* compiled from: PG */
public final /* synthetic */ class C32531af implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C32533ah f87136a;

    public /* synthetic */ C32531af(C32533ah ahVar) {
        this.f87136a = ahVar;
    }

    public final C60870cx apply(Object obj) {
        C32533ah ahVar = this.f87136a;
        Optional optional = (Optional) obj;
        if (!optional.isPresent()) {
            return ahVar.f87140c.mo38134b();
        }
        C60870cx a = ahVar.f87138a.mo38138a(optional.get());
        C32529ad adVar = new C32529ad(ahVar);
        return C60922j.m93045h(a, C47810es.m84966f(adVar), C60826bg.f164896a);
    }
}
