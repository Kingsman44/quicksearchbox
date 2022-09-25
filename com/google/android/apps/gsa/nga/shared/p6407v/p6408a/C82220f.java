package com.google.android.apps.gsa.nga.shared.p6407v.p6408a;

import com.google.android.apps.gsa.nga.shared.p6407v.C82197a;
import com.google.android.apps.gsa.shared.logger.p7051b.C89859i;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.android.libraries.p1730f.C21370a;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import java.util.concurrent.atomic.AtomicReference;
import p3186j$.time.Duration;
import p3186j$.util.Optional;
import p3186j$.util.concurrent.atomic.DesugarAtomicReference;

/* renamed from: com.google.android.apps.gsa.nga.shared.v.a.f */
/* compiled from: PG */
public final class C82220f implements C82197a {

    /* renamed from: a */
    public static final C59071e f224699a = C59071e.m91332i("com.google.android.apps.gsa.nga.shared.v.a.f");

    /* renamed from: b */
    public final C89859i f224700b;

    /* renamed from: c */
    public final Optional f224701c;

    /* renamed from: d */
    private final C22871g f224702d;

    /* renamed from: e */
    private final C21370a f224703e;

    /* renamed from: f */
    private final AtomicReference f224704f;

    public C82220f(Optional optional, C22871g gVar, C21370a aVar, C89859i iVar) {
        C82223i iVar2 = new C82223i();
        iVar2.mo75560b(false);
        iVar2.mo75561c(false);
        this.f224704f = new AtomicReference(iVar2.mo75559a());
        this.f224703e = aVar;
        this.f224700b = iVar;
        this.f224702d = gVar;
        this.f224701c = optional;
    }

    /* renamed from: c */
    private final void m130553c(Duration duration) {
        ((C59052c) ((C59052c) f224699a.mo56224b()).mo56372aa(5916)).mo56386p("Input plate is visible");
        this.f224702d.mo28212l("[NGA] logVisibilityEvents", new C82198a(this, duration));
    }

    /* renamed from: a */
    public final void mo75538a(boolean z) {
        Duration ofNanos = Duration.ofNanos(this.f224703e.mo26872d());
        if (((C82219e) DesugarAtomicReference.updateAndGet(this.f224704f, new C82216b(z))).mo75565d()) {
            m130553c(ofNanos);
        }
    }

    /* renamed from: b */
    public final void mo75539b(boolean z) {
        Duration ofNanos = Duration.ofNanos(this.f224703e.mo26872d());
        if (((C82219e) DesugarAtomicReference.updateAndGet(this.f224704f, new C82217c(z))).mo75565d()) {
            m130553c(ofNanos);
        }
    }
}
