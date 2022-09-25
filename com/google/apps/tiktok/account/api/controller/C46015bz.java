package com.google.apps.tiktok.account.api.controller;

import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.base.C58839bc;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60866ct;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import com.google.common.util.concurrent.C60931s;
import java.util.List;
import java.util.concurrent.Executor;

/* renamed from: com.google.apps.tiktok.account.api.controller.bz */
/* compiled from: PG */
final class C46015bz implements C60931s {

    /* renamed from: a */
    public final List f120863a;

    /* renamed from: b */
    public final int f120864b;

    /* renamed from: c */
    public final Executor f120865c;

    /* renamed from: d */
    public int f120866d = -1;

    /* renamed from: e */
    private final C58839bc f120867e;

    /* renamed from: f */
    private final C60931s f120868f;

    public C46015bz(List list, C58839bc bcVar, Executor executor) {
        this.f120863a = list;
        this.f120864b = list.size();
        this.f120867e = bcVar;
        this.f120865c = executor;
        this.f120868f = C47810es.m84966f(this);
    }

    public final C60870cx apply(Object obj) {
        if (this.f120867e.mo5941a(obj)) {
            return C60856cj.m92900i(obj);
        }
        return mo50156a();
    }

    /* renamed from: a */
    public final C60870cx mo50156a() {
        int i = this.f120866d + 1;
        this.f120866d = i;
        if (i < this.f120864b) {
            return C60922j.m93045h((C60870cx) this.f120863a.get(i), this.f120868f, this.f120865c);
        }
        return C60866ct.f164955a;
    }
}
