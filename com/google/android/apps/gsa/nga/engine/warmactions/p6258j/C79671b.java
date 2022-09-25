package com.google.android.apps.gsa.nga.engine.warmactions.p6258j;

import com.google.assistant.p3897e.p3917i.p3918a.C51419h;
import com.google.assistant.p3897e.p3917i.p3918a.C51473j;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.apps.gsa.nga.engine.warmactions.j.b */
/* compiled from: PG */
public final /* synthetic */ class C79671b implements Predicate {

    /* renamed from: a */
    public static final /* synthetic */ C79671b f218493a = new C79671b();

    private /* synthetic */ C79671b() {
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
        C51419h a = C51419h.m86180a(((C51473j) obj).f134097f);
        if (a == null) {
            a = C51419h.UNKNOWN_ALARM_STATUS;
        }
        return a.equals(C51419h.FIRING);
    }
}
