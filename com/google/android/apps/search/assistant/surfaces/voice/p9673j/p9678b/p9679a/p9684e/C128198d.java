package com.google.android.apps.search.assistant.surfaces.voice.p9673j.p9678b.p9679a.p9684e;

import com.google.common.p4522b.C58528ij;
import p3186j$.util.Objects;
import p3186j$.util.Optional;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.j.b.a.e.d */
/* compiled from: PG */
public final /* synthetic */ class C128198d implements Predicate {

    /* renamed from: a */
    public final /* synthetic */ C58528ij f352670a;

    /* renamed from: b */
    public final /* synthetic */ boolean f352671b;

    public /* synthetic */ C128198d(C58528ij ijVar, boolean z) {
        this.f352670a = ijVar;
        this.f352671b = z;
    }

    public final /* synthetic */ Predicate and(Predicate predicate) {
        return Predicate.CC.$default$and(this, predicate);
    }

    public final /* synthetic */ Predicate negate() {
        return Predicate.CC.$default$negate(this);
    }

    /* renamed from: or */
    public final /* synthetic */ Predicate mo17950or(Predicate predicate) {
        return Predicate.CC.$default$or(this, predicate);
    }

    public final boolean test(Object obj) {
        C58528ij ijVar = this.f352670a;
        boolean z = this.f352671b;
        C128203i iVar = (C128203i) obj;
        Optional b = iVar.mo108360b();
        Objects.requireNonNull(ijVar);
        if (!((Boolean) b.map(new C128201g(ijVar)).orElse(true)).booleanValue() || (z && !iVar.mo108362d())) {
            return false;
        }
        return true;
    }
}
