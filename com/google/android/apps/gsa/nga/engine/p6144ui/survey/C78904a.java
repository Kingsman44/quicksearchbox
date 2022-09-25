package com.google.android.apps.gsa.nga.engine.p6144ui.survey;

import com.google.android.apps.gsa.nga.engine.aq.e;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.apps.gsa.nga.engine.ui.survey.a */
/* compiled from: PG */
public final /* synthetic */ class C78904a implements Predicate {

    /* renamed from: a */
    public static final /* synthetic */ C78904a f217121a = new C78904a();

    private /* synthetic */ C78904a() {
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
        int i = ((e) obj).a;
        return ((i & 2) == 0 || (i & 1) == 0 || (i & 8) == 0) ? false : true;
    }
}
