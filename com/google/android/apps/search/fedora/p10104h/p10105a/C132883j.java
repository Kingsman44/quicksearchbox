package com.google.android.apps.search.fedora.p10104h.p10105a;

import android.content.Context;
import com.google.android.apps.search.fedora.p10092a.C132719y;
import com.google.android.libraries.assistant.trainingcache.p1615a.p1616a.C19414r;
import com.google.android.libraries.assistant.trainingcache.p1615a.p1616a.C19417u;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47633f;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;
import p3186j$.util.Objects;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.search.fedora.h.a.j */
/* compiled from: PG */
public final class C132883j implements C19417u {

    /* renamed from: a */
    public final Context f362515a;

    /* renamed from: b */
    public final AtomicReference f362516b = new AtomicReference(Optional.empty());

    /* renamed from: c */
    private final Executor f362517c;

    /* renamed from: d */
    private final C132719y f362518d;

    /* renamed from: com.google.android.apps.search.fedora.h.a.j$a */
    /* compiled from: PG */
    public interface C132884a {
        /* renamed from: bF */
        C132875b mo110926bF();
    }

    public C132883j(Context context, C132719y yVar, Executor executor) {
        this.f362515a = context;
        this.f362518d = yVar;
        this.f362517c = executor;
    }

    /* renamed from: a */
    public final C60870cx mo24608a() {
        Objects.requireNonNull(this.f362518d);
        C132878e eVar = new C132878e();
        return C47633f.m84733g(C60856cj.m92905n(C47810es.m84965e(eVar), this.f362517c)).mo51515h(new C132879f(this), this.f362517c).mo51516i(new C132880g(this), this.f362517c);
    }

    /* renamed from: d */
    public final void mo24609d(C19414r rVar, boolean z) {
        ((Optional) this.f362516b.get()).ifPresent(new C132876c(rVar, z));
    }
}
