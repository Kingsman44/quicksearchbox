package com.google.android.apps.search.assistant.surfaces.dictation.service.formatter;

import com.google.android.apps.gsa.nga.engine.dictation.C75369t;
import com.google.android.apps.gsa.nga.engine.dictation.q;
import com.google.common.p4526f.C59071e;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.apps.search.assistant.surfaces.dictation.service.formatter.u */
/* compiled from: PG */
public final /* synthetic */ class C125515u implements Predicate {

    /* renamed from: a */
    public static final /* synthetic */ C125515u f346104a = new C125515u();

    private /* synthetic */ C125515u() {
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
        C59071e eVar = C125470af.f346003a;
        int a = C75369t.m121810a(((q) obj).b);
        return a != 0 && a == 19;
    }
}
