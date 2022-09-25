package com.google.android.apps.gsa.staticplugins.opa.tapas.p8572q;

import androidx.lifecycle.LiveData;
import com.google.android.apps.gsa.assistant.shared.p.f;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.q.cz */
/* compiled from: PG */
public final /* synthetic */ class C113195cz implements Predicate {

    /* renamed from: a */
    public static final /* synthetic */ C113195cz f313528a = new C113195cz();

    private /* synthetic */ C113195cz() {
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
        return ((LiveData) obj).mo3842a() == f.b;
    }
}
