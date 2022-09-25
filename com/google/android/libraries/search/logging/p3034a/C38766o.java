package com.google.android.libraries.search.logging.p3034a;

import com.google.android.libraries.search.logging.p3039b.C38833e;
import com.google.android.libraries.search.p2476a.p2483e.C32221c;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.p4522b.C58485gu;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60866ct;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import java.util.List;
import p3186j$.util.Optional;

/* renamed from: com.google.android.libraries.search.logging.a.o */
/* compiled from: PG */
public final class C38766o implements C38833e {

    /* renamed from: a */
    private final String f102337a;

    /* renamed from: b */
    private final Optional f102338b;

    public C38766o(String str, Optional optional) {
        this.f102337a = str;
        this.f102338b = optional;
    }

    /* renamed from: a */
    public final C60870cx mo41613a() {
        if (!this.f102338b.isPresent()) {
            return C60866ct.f164955a;
        }
        C60870cx c = ((C32221c) this.f102338b.get()).mo38003c();
        C38765n nVar = C38765n.f102336a;
        return C60922j.m93044g(c, C47810es.m84963c(nVar), C60826bg.f164896a);
    }

    /* renamed from: b */
    public final String mo41614b() {
        return null;
    }

    /* renamed from: c */
    public final String mo41615c() {
        return this.f102337a;
    }

    /* renamed from: d */
    public final /* synthetic */ List mo41616d() {
        return C58485gu.m89845m();
    }
}
