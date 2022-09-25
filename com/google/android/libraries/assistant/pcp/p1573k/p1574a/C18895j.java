package com.google.android.libraries.assistant.pcp.p1573k.p1574a;

import android.content.pm.ResolveInfo;
import com.google.common.base.C58837ba;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.libraries.assistant.pcp.k.a.j */
/* compiled from: PG */
public final /* synthetic */ class C18895j implements Predicate {

    /* renamed from: a */
    public static final /* synthetic */ C18895j f53179a = new C18895j();

    private /* synthetic */ C18895j() {
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
        ResolveInfo resolveInfo = (ResolveInfo) obj;
        return resolveInfo.serviceInfo != null && !C58837ba.m90859h(resolveInfo.serviceInfo.packageName);
    }
}
