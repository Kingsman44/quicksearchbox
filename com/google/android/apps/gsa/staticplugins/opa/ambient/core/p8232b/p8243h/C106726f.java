package com.google.android.apps.gsa.staticplugins.opa.ambient.core.p8232b.p8243h;

import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60887da;
import com.google.common.util.concurrent.C60930r;
import com.google.common.util.concurrent.C60931s;
import java.util.concurrent.Callable;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.ambient.core.b.h.f */
/* compiled from: PG */
public final /* synthetic */ class C106726f implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ Callable f297437a;

    /* renamed from: b */
    public final /* synthetic */ C60887da f297438b;

    /* renamed from: c */
    public final /* synthetic */ C60930r f297439c;

    public /* synthetic */ C106726f(Callable callable, C60887da daVar, C60930r rVar) {
        this.f297437a = callable;
        this.f297438b = daVar;
        this.f297439c = rVar;
    }

    public final C60870cx apply(Object obj) {
        Callable callable = this.f297437a;
        C60887da daVar = this.f297438b;
        C60930r rVar = this.f297439c;
        if (!((Boolean) obj).booleanValue()) {
            return C60856cj.m92904m(C47810es.m84978r(callable), daVar);
        }
        return C60856cj.m92905n(C47810es.m84965e(rVar), daVar);
    }
}
