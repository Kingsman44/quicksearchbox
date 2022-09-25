package com.google.android.apps.search.assistant.surfaces.voice.p9785ui.immersivecanvas.webapp.p9851a;

import com.google.android.libraries.p1730f.C21370a;
import com.google.apps.tiktok.concurrent.C46428ao;
import com.google.common.p4522b.C58480gp;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4526f.C59071e;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
import p3186j$.time.Duration;
import p3186j$.util.Objects;
import p3186j$.util.Optional;
import p3186j$.util.concurrent.atomic.DesugarAtomicReference;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.ui.immersivecanvas.webapp.a.i */
/* compiled from: PG */
public final class C129817i implements C129809a {

    /* renamed from: a */
    public static final C59071e f356194a = C59071e.m91332i("com.google.android.apps.search.assistant.surfaces.voice.ui.immersivecanvas.webapp.a.i");

    /* renamed from: c */
    private static final Duration f356195c = Duration.ofSeconds(10);

    /* renamed from: b */
    public final AtomicReference f356196b = new AtomicReference(new LinkedHashMap());

    /* renamed from: d */
    private final C21370a f356197d;

    /* renamed from: e */
    private final C46428ao f356198e;

    public C129817i(C21370a aVar, C46428ao aoVar) {
        this.f356197d = aVar;
        this.f356198e = aoVar;
    }

    /* renamed from: a */
    public final C58485gu mo109278a() {
        C58480gp e = C58485gu.m89837e();
        for (C129816h a : ((Map) this.f356196b.get()).values()) {
            Optional a2 = a.mo109284a();
            Objects.requireNonNull(e);
            a2.ifPresent(new C129810b(e));
        }
        return e.mo55394f();
    }

    /* renamed from: b */
    public final Optional mo109279b(String str) {
        C129816h hVar = (C129816h) ((Map) this.f356196b.get()).get(str);
        if (hVar != null) {
            return hVar.mo109284a();
        }
        return Optional.empty();
    }

    /* renamed from: c */
    public final String mo109280c(String str) {
        C129816h hVar = new C129816h(this, str, f356195c, this.f356197d, this.f356198e);
        DesugarAtomicReference.updateAndGet(this.f356196b, new C129812d(hVar));
        return hVar.f356188b;
    }

    /* renamed from: d */
    public final void mo109281d() {
        DesugarAtomicReference.updateAndGet(this.f356196b, C129811c.f356182a);
    }

    /* renamed from: e */
    public final void mo109282e(String str) {
        C129816h hVar = (C129816h) ((Map) this.f356196b.get()).get(str);
        if (hVar != null) {
            DesugarAtomicReference.updateAndGet(this.f356196b, new C129813e(str));
            hVar.f356187a.removeCallbacksAndMessages(hVar);
        }
    }
}
