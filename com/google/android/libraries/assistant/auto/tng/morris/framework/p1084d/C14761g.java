package com.google.android.libraries.assistant.auto.tng.morris.framework.p1084d;

import com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14232bp;
import com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14334fj;
import com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14501lo;
import com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14502lp;
import com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14542nb;
import java.util.EnumSet;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.libraries.assistant.auto.tng.morris.framework.d.g */
/* compiled from: PG */
public final /* synthetic */ class C14761g implements Predicate {

    /* renamed from: a */
    public static final /* synthetic */ C14761g f44537a = new C14761g();

    private /* synthetic */ C14761g() {
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
        int b;
        C14501lo loVar;
        C14334fj fjVar;
        C14232bp bpVar = (C14232bp) obj;
        C14542nb a = C14542nb.m30637a(bpVar.f43074c);
        if (a == null) {
            a = C14542nb.UNRECOGNIZED;
        }
        if (a.equals(C14542nb.MEDIA)) {
            EnumSet of = EnumSet.of(C14334fj.MEDIA_EXPANDED, C14334fj.MEDIA_LOADING_EXPANDED);
            if (bpVar.f43072a == 3) {
                fjVar = C14334fj.m30610a(((Integer) bpVar.f43073b).intValue());
                if (fjVar == null) {
                    fjVar = C14334fj.UNRECOGNIZED;
                }
            } else {
                fjVar = C14334fj.UNSPECIFIED_MEDIA_TILE_SUB_TYPE;
            }
            if (of.contains(fjVar)) {
                return true;
            }
        }
        C14542nb a2 = C14542nb.m30637a(bpVar.f43074c);
        if (a2 == null) {
            a2 = C14542nb.UNRECOGNIZED;
        }
        if (a2.equals(C14542nb.NAVIGATION)) {
            EnumSet of2 = EnumSet.of(C14501lo.DESTINATION_SUGGESTION_EXPANDED, C14501lo.DESTINATION_SUGGESTION_EXPANDED_LOADING);
            if (bpVar.f43072a == 2) {
                loVar = C14501lo.m30628a(((Integer) bpVar.f43073b).intValue());
                if (loVar == null) {
                    loVar = C14501lo.UNRECOGNIZED;
                }
            } else {
                loVar = C14501lo.UNSPECIFIED_NAVIGATION_TILE_SUB_TYPE;
            }
            if (of2.contains(loVar)) {
                return true;
            }
        }
        C14542nb a3 = C14542nb.m30637a(bpVar.f43074c);
        if (a3 == null) {
            a3 = C14542nb.UNRECOGNIZED;
        }
        if (!a3.equals(C14542nb.ONGOING_CALL) || bpVar.f43072a != 4 || (b = C14502lp.m30630b(((Integer) bpVar.f43073b).intValue())) == 0 || b != 4) {
            return false;
        }
        return true;
    }
}
