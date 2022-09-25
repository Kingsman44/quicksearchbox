package com.google.android.libraries.appactions.serviceengine.impl;

import android.content.Intent;
import com.evernote.android.state.BuildConfig;
import p3186j$.util.Optional;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.libraries.appactions.serviceengine.impl.o */
/* compiled from: PG */
public final /* synthetic */ class C147922o implements Predicate {

    /* renamed from: a */
    public final /* synthetic */ C147906ao f399000a;

    /* renamed from: b */
    public final /* synthetic */ Optional f399001b;

    public /* synthetic */ C147922o(C147906ao aoVar, Optional optional) {
        this.f399000a = aoVar;
        this.f399001b = optional;
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
        return this.f399000a.mo124570g((Intent) obj, (String) this.f399001b.orElse(BuildConfig.FLAVOR));
    }
}
