package com.google.android.libraries.assistant.auto.tng.assistant.p887ui.projected.mediarec;

import com.google.assistant.p3897e.p3921j.C52560wg;
import com.google.assistant.p3897e.p3921j.C52568wo;
import java.util.Set;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.libraries.assistant.auto.tng.assistant.ui.projected.mediarec.ah */
/* compiled from: PG */
public final /* synthetic */ class C13126ah implements Predicate {

    /* renamed from: a */
    public final /* synthetic */ Set f40707a;

    public /* synthetic */ C13126ah(Set set) {
        this.f40707a = set;
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
        Set set = this.f40707a;
        C52568wo woVar = ((C52560wg) obj).f137950f;
        if (woVar == null) {
            woVar = C52568wo.f137992v;
        }
        return !set.contains(woVar.f137998e);
    }
}
