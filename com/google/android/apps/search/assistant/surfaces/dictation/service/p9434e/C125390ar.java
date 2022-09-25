package com.google.android.apps.search.assistant.surfaces.dictation.service.p9434e;

import com.google.android.apps.search.assistant.surfaces.dictation.service.p9453l.p9455b.C125901h;
import com.google.android.libraries.storage.protostore.C42876ab;
import com.google.common.p4526f.C59071e;
import com.google.common.p4580v.C60950i;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60866ct;
import com.google.common.util.concurrent.C60870cx;
import java.util.concurrent.Executor;
import p3186j$.time.Duration;
import p3186j$.time.Instant;

/* renamed from: com.google.android.apps.search.assistant.surfaces.dictation.service.e.ar */
/* compiled from: PG */
public final class C125390ar {

    /* renamed from: a */
    public static final C59071e f345828a = C59071e.m91332i("com.google.android.apps.search.assistant.surfaces.dictation.service.e.ar");

    /* renamed from: d */
    private static final Duration f345829d = Duration.ofHours(1);

    /* renamed from: b */
    public final C42876ab f345830b;

    /* renamed from: c */
    public final Executor f345831c;

    /* renamed from: e */
    private final C125901h f345832e;

    /* renamed from: f */
    private final C60950i f345833f;

    /* renamed from: g */
    private Instant f345834g = Instant.EPOCH;

    public C125390ar(C125901h hVar, C42876ab abVar, Executor executor, C60950i iVar) {
        this.f345832e = hVar;
        this.f345830b = abVar;
        this.f345831c = executor;
        this.f345833f = iVar;
    }

    /* renamed from: a */
    public final synchronized C60870cx mo106953a() {
        if (this.f345832e.mo107158c()) {
            return C60866ct.f164955a;
        }
        Instant a = this.f345833f.mo57444a();
        if (this.f345834g.plus(f345829d).isAfter(a)) {
            return C60866ct.f164955a;
        }
        this.f345834g = a;
        return this.f345830b.mo46039a(new C125386an(a), C60826bg.f164896a);
    }
}
