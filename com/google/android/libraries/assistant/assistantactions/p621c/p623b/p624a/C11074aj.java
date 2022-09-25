package com.google.android.libraries.assistant.assistantactions.p621c.p623b.p624a;

import android.net.Uri;
import com.google.common.base.C58890d;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.libraries.assistant.assistantactions.c.b.a.aj */
/* compiled from: PG */
public final /* synthetic */ class C11074aj implements Predicate {

    /* renamed from: a */
    public static final /* synthetic */ C11074aj f36355a = new C11074aj();

    private /* synthetic */ C11074aj() {
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
        String scheme = Uri.parse((String) obj).getScheme();
        return scheme == null || !C58890d.m90990e("content", scheme);
    }
}
