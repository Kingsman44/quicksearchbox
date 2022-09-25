package com.google.android.apps.search.googleapp.googleappbrowser.p10262c;

import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import com.google.common.util.concurrent.C60931s;
import p3186j$.util.function.Predicate;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.googleapp.googleappbrowser.c.r */
/* compiled from: PG */
final class C135558r implements C60931s {

    /* renamed from: a */
    final /* synthetic */ C135531ae f369252a;

    /* renamed from: b */
    final /* synthetic */ Predicate f369253b;

    public C135558r(C135531ae aeVar, Predicate predicate) {
        this.f369252a = aeVar;
        this.f369253b = predicate;
    }

    public final /* bridge */ /* synthetic */ C60870cx apply(Object obj) {
        Boolean bool = (Boolean) obj;
        C69664n.m101060f(bool, "isIncognito");
        if (bool.booleanValue()) {
            return C60856cj.m92900i(true);
        }
        C60870cx d = this.f369252a.f369207b.mo46042d();
        C135557q qVar = new C135557q(this.f369253b);
        return C60922j.m93044g(d, C47810es.m84963c(qVar), C60826bg.f164896a);
    }
}
