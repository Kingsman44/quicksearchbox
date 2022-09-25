package com.google.android.apps.gsa.nga.shared.p6369ui.assistlayer.inputplate.chip;

import android.text.TextUtils;
import com.google.android.apps.gsa.nga.shared.p6315aj.p6316a.p6317a.C80784fe;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.apps.gsa.nga.shared.ui.assistlayer.inputplate.chip.o */
/* compiled from: PG */
public final /* synthetic */ class C81709o implements Predicate {

    /* renamed from: a */
    public final /* synthetic */ C81714t f223456a;

    public /* synthetic */ C81709o(C81714t tVar) {
        this.f223456a = tVar;
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
        C81714t tVar = this.f223456a;
        C80784fe feVar = (C80784fe) obj;
        if (!TextUtils.isEmpty(feVar.mo74609f())) {
            return true;
        }
        if (feVar.mo74604b() == null || !tVar.f223464c.isPresent()) {
            return false;
        }
        return true;
    }
}
