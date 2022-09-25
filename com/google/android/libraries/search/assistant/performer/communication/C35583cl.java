package com.google.android.libraries.search.assistant.performer.communication;

import android.telecom.Call;
import com.google.common.p4526f.C59071e;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.libraries.search.assistant.performer.communication.cl */
/* compiled from: PG */
public final /* synthetic */ class C35583cl implements Predicate {

    /* renamed from: a */
    public static final /* synthetic */ C35583cl f93408a = new C35583cl();

    private /* synthetic */ C35583cl() {
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
