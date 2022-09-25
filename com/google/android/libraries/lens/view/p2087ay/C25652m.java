package com.google.android.libraries.lens.view.p2087ay;

import com.google.android.libraries.lens.view.gleam.C26504ci;
import com.google.android.libraries.lens.view.p2069am.C25349y;
import com.google.common.base.C58832aw;
import java.util.EnumSet;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.libraries.lens.view.ay.m */
/* compiled from: PG */
public final /* synthetic */ class C25652m implements Predicate {

    /* renamed from: a */
    public static final /* synthetic */ C25652m f69772a = new C25652m();

    private /* synthetic */ C25652m() {
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
        C26504ci ciVar = (C26504ci) obj;
        if (ciVar.f72222p) {
            return false;
        }
        return (ciVar.f72228v && C58832aw.m90831a(ciVar.mo31760d(), C25349y.TEXT_GLEAM)) || !EnumSet.of(C25349y.UNKNOWN, C25349y.THINKING_GLEAM, C25349y.PRE_GLEAM, C25349y.TEXT_GLEAM).contains(ciVar.mo31760d());
    }
}
