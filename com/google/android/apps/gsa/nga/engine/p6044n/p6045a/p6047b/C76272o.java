package com.google.android.apps.gsa.nga.engine.p6044n.p6045a.p6047b;

import android.content.Intent;
import com.evernote.android.state.BuildConfig;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.apps.gsa.nga.engine.n.a.b.o */
/* compiled from: PG */
public final /* synthetic */ class C76272o implements Predicate {

    /* renamed from: a */
    public final /* synthetic */ C76273p f211297a;

    public /* synthetic */ C76272o(C76273p pVar) {
        this.f211297a = pVar;
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
        return this.f211297a.f211298a.mo72204e((Intent) obj, 1, BuildConfig.FLAVOR);
    }
}
