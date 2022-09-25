package com.google.android.libraries.search.assistant.performer.communication;

import android.telecom.Call;
import com.google.common.p4526f.C59071e;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.libraries.search.assistant.performer.communication.cp */
/* compiled from: PG */
public final /* synthetic */ class C35587cp implements Predicate {

    /* renamed from: a */
    public static final /* synthetic */ C35587cp f93414a = new C35587cp();

    private /* synthetic */ C35587cp() {
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
        C59071e eVar = C35591ct.f93419a;
        return ((Call) obj).getState() == 2;
    }
}
