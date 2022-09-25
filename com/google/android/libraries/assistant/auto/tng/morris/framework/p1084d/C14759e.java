package com.google.android.libraries.assistant.auto.tng.morris.framework.p1084d;

import com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14232bp;
import com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14501lo;
import com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14542nb;
import java.util.EnumSet;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.libraries.assistant.auto.tng.morris.framework.d.e */
/* compiled from: PG */
public final /* synthetic */ class C14759e implements Predicate {

    /* renamed from: a */
    public static final /* synthetic */ C14759e f44535a = new C14759e();

    private /* synthetic */ C14759e() {
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
        if (EnumSet.of(C14542nb.MEDIA, C14542nb.CALL, C14542nb.MESSAGE).contains(a)) {
            return true;
        }
        if (!a.equals(C14542nb.NAVIGATION)) {
            return false;
        }
        EnumSet of = EnumSet.of(C14501lo.DESTINATION_SUGGESTION_EXPANDED, C14501lo.DESTINATION_SUGGESTION_EXPANDED_LOADING);
        if (bpVar.f43072a == 2) {
            loVar = C14501lo.m30628a(((Integer) bpVar.f43073b).intValue());
            if (loVar == null) {
                loVar = C14501lo.UNRECOGNIZED;
            }
        } else {
            loVar = C14501lo.UNSPECIFIED_NAVIGATION_TILE_SUB_TYPE;
        }
        if (of.contains(loVar)) {
            return true;
        }
        return false;
    }
}
