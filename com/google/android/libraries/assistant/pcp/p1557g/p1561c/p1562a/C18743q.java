package com.google.android.libraries.assistant.pcp.p1557g.p1561c.p1562a;

import android.content.ComponentName;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.libraries.assistant.pcp.g.c.a.q */
/* compiled from: PG */
public final /* synthetic */ class C18743q implements Predicate {

    /* renamed from: a */
    public static final /* synthetic */ C18743q f52848a = new C18743q();

    private /* synthetic */ C18743q() {
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
        return "com.google.android.apps.youtube.music".equals(((ComponentName) obj).getPackageName());
    }
}
