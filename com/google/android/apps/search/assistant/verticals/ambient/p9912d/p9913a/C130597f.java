package com.google.android.apps.search.assistant.verticals.ambient.p9912d.p9913a;

import com.google.android.apps.gsa.staticplugins.opa.ambient.p8207b.C106596h;
import com.google.android.apps.search.assistant.verticals.ambient.p9912d.C130591a;
import com.google.android.libraries.p1730f.C21370a;
import com.google.android.libraries.storage.protostore.C42876ab;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47632e;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47633f;
import com.google.assistant.p4016z.C53715bm;
import com.google.common.p4526f.p4527a.C58974d;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60888db;
import java.util.concurrent.atomic.AtomicReference;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.search.assistant.verticals.ambient.d.a.f */
/* compiled from: PG */
public final class C130597f implements C130591a {

    /* renamed from: a */
    public static final C58974d f357698a = C58974d.m91136j();

    /* renamed from: b */
    public static final AtomicReference f357699b = new AtomicReference();

    /* renamed from: c */
    public final C60888db f357700c;

    /* renamed from: d */
    public final C42876ab f357701d;

    /* renamed from: e */
    public final C21370a f357702e;

    /* renamed from: f */
    public final Optional f357703f;

    /* renamed from: g */
    private final C47632e f357704g = new C47632e();

    public C130597f(C60888db dbVar, C42876ab abVar, C21370a aVar, Optional optional) {
        this.f357700c = dbVar;
        this.f357701d = abVar;
        this.f357702e = aVar;
        this.f357703f = optional;
    }

    /* renamed from: a */
    public final C60870cx mo109736a(C53715bm bmVar, long j) {
        C60870cx b = this.f357704g.mo51512b(new C130592a(this, new C130593b(this, bmVar, j)), this.f357700c);
        if (this.f357703f.isPresent()) {
            C47633f.m84733g(b).mo51515h(new C130594c(this), this.f357700c);
        }
        return b;
    }

    /* renamed from: b */
    public final Optional mo109737b() {
        return Optional.ofNullable((C106596h) f357699b.get());
    }
}
