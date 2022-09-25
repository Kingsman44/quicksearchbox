package com.google.android.libraries.assistant.auto.tng.morris.framework.p1084d;

import com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14232bp;
import com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14334fj;
import com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14542nb;
import java.util.EnumSet;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.libraries.assistant.auto.tng.morris.framework.d.k */
/* compiled from: PG */
public final /* synthetic */ class C14765k implements Predicate {

    /* renamed from: a */
    public static final /* synthetic */ C14765k f44541a = new C14765k();

    private /* synthetic */ C14765k() {
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
        C14334fj fjVar;
        C14232bp bpVar = (C14232bp) obj;
        C14542nb a = C14542nb.m30637a(bpVar.f43074c);
        if (a == null) {
            a = C14542nb.UNRECOGNIZED;
        }
        if (!a.equals(C14542nb.MEDIA)) {
            return false;
        }
        EnumSet of = EnumSet.of(C14334fj.MEDIA_LOADING_EXPANDED, C14334fj.MEDIA_EXPANDED);
        if (bpVar.f43072a == 3) {
            fjVar = C14334fj.m30610a(((Integer) bpVar.f43073b).intValue());
            if (fjVar == null) {
                fjVar = C14334fj.UNRECOGNIZED;
            }
        } else {
            fjVar = C14334fj.UNSPECIFIED_MEDIA_TILE_SUB_TYPE;
        }
        return of.contains(fjVar);
    }
}
