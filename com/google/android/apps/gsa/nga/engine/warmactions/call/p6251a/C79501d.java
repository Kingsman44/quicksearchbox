package com.google.android.apps.gsa.nga.engine.warmactions.call.p6251a;

import com.google.android.apps.gsa.nga.engine.warmactions.call.C79504ab;
import com.google.android.apps.gsa.nga.engine.warmactions.call.C79505ac;
import com.google.android.apps.gsa.nga.shared.p6331aq.p6333b.C81013d;
import com.google.common.p4522b.C58758qx;
import com.google.common.p4580v.C60950i;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;
import p3186j$.time.Duration;
import p3186j$.time.Instant;
import p3186j$.time.temporal.Temporal;
import p3186j$.util.Collection;
import p3186j$.util.Objects;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.nga.engine.warmactions.call.a.d */
/* compiled from: PG */
public final class C79501d implements C79499b, C79505ac, C79498a {

    /* renamed from: a */
    private final C60950i f218201a;

    /* renamed from: b */
    private final C81013d f218202b;

    /* renamed from: c */
    private final Set f218203c = C58758qx.m90653k();

    /* renamed from: d */
    private final AtomicReference f218204d = new AtomicReference(Instant.MAX);

    /* renamed from: e */
    private final AtomicReference f218205e = new AtomicReference(Optional.empty());

    /* renamed from: f */
    private final AtomicReference f218206f = new AtomicReference(Optional.empty());

    public C79501d(C60950i iVar, C81013d dVar) {
        this.f218201a = iVar;
        this.f218202b = dVar;
    }

    /* renamed from: a */
    public final void mo74096a() {
        this.f218204d.set(this.f218201a.mo57444a());
    }

    /* renamed from: b */
    public final Optional mo74099b() {
        return (Optional) this.f218206f.get();
    }

    /* renamed from: c */
    public final void mo74028c(C79504ab abVar) {
        Optional optional;
        if (abVar.mo74107f()) {
            this.f218203c.add(Long.valueOf(abVar.mo74104b()));
            this.f218205e.set(abVar.mo74105c());
            this.f218206f.set(abVar.mo74106d());
        } else {
            this.f218203c.remove(Long.valueOf(abVar.mo74104b()));
            this.f218205e.set(Optional.empty());
            this.f218206f.set(Optional.empty());
        }
        if (abVar.mo74103a() == 7) {
            Duration between = Duration.between((Temporal) this.f218204d.get(), this.f218201a.mo57444a());
            if (between.isNegative()) {
                optional = Optional.empty();
            } else {
                optional = Optional.m71637of(between);
            }
            C81013d dVar = this.f218202b;
            Objects.requireNonNull(dVar);
            optional.ifPresent(new C79500c(dVar));
            this.f218204d.set(Instant.MAX);
        }
    }

    /* renamed from: d */
    public final Optional mo74100d() {
        return (Optional) this.f218205e.get();
    }

    /* renamed from: e */
    public final Optional mo74101e() {
        return Collection.EL.stream(this.f218203c).findAny();
    }

    /* renamed from: f */
    public final boolean mo74102f() {
        return !this.f218203c.isEmpty();
    }
}
