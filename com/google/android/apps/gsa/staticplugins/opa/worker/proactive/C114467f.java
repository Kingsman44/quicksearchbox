package com.google.android.apps.gsa.staticplugins.opa.worker.proactive;

import com.google.android.gms.reminders.model.Task;
import com.google.common.p4526f.C59071e;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.worker.proactive.f */
/* compiled from: PG */
public final /* synthetic */ class C114467f implements Predicate {

    /* renamed from: a */
    public static final /* synthetic */ C114467f f317407a = new C114467f();

    private /* synthetic */ C114467f() {
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
        Task task = (Task) obj;
        C59071e eVar = C114469h.f317409a;
        return !task.mo122078o().booleanValue() && !task.mo122079p().booleanValue();
    }
}
