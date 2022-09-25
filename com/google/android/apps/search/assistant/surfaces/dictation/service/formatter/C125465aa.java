package com.google.android.apps.search.assistant.surfaces.dictation.service.formatter;

import com.google.android.apps.gsa.nga.engine.dictation.C75369t;
import com.google.android.apps.gsa.nga.engine.dictation.q;
import com.google.common.p4526f.C59071e;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.apps.search.assistant.surfaces.dictation.service.formatter.aa */
/* compiled from: PG */
public final /* synthetic */ class C125465aa implements Predicate {

    /* renamed from: a */
    public static final /* synthetic */ C125465aa f345998a = new C125465aa();

    private /* synthetic */ C125465aa() {
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
        int i = ((q) obj).b;
        int a = C75369t.m121810a(i);
        if (a != 0 && a == 18) {
            return false;
        }
        int a2 = C75369t.m121810a(i);
        return a2 == 0 || a2 != 19;
    }
}
