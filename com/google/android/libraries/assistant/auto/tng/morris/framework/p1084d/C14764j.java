package com.google.android.libraries.assistant.auto.tng.morris.framework.p1084d;

import com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14232bp;
import com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14542nb;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.libraries.assistant.auto.tng.morris.framework.d.j */
/* compiled from: PG */
public final /* synthetic */ class C14764j implements Predicate {

    /* renamed from: a */
    public static final /* synthetic */ C14764j f44540a = new C14764j();

    private /* synthetic */ C14764j() {
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
        C14542nb a = C14542nb.m30637a(((C14232bp) obj).f43074c);
        if (a == null) {
            a = C14542nb.UNRECOGNIZED;
        }
        return a.equals(C14542nb.MEDIA);
    }
}