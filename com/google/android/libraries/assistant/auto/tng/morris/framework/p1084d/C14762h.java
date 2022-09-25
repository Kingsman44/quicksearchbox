package com.google.android.libraries.assistant.auto.tng.morris.framework.p1084d;

import com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14232bp;
import com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14501lo;
import com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14542nb;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.libraries.assistant.auto.tng.morris.framework.d.h */
/* compiled from: PG */
public final /* synthetic */ class C14762h implements Predicate {

    /* renamed from: a */
    public static final /* synthetic */ C14762h f44538a = new C14762h();

    private /* synthetic */ C14762h() {
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
        C14501lo loVar;
        C14232bp bpVar = (C14232bp) obj;
        C14542nb a = C14542nb.m30637a(bpVar.f43074c);
        if (a == null) {
            a = C14542nb.UNRECOGNIZED;
        }
        if (!a.equals(C14542nb.NAVIGATION)) {
            return false;
        }
        if (bpVar.f43072a == 2) {
            loVar = C14501lo.m30628a(((Integer) bpVar.f43073b).intValue());
            if (loVar == null) {
                loVar = C14501lo.UNRECOGNIZED;
            }
        } else {
            loVar = C14501lo.UNSPECIFIED_NAVIGATION_TILE_SUB_TYPE;
        }
        return loVar.equals(C14501lo.DESTINATION_SEARCH);
    }
}
