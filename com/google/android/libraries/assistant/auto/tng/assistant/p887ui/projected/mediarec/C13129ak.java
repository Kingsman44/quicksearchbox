package com.google.android.libraries.assistant.auto.tng.assistant.p887ui.projected.mediarec;

import com.google.assistant.p3897e.p3921j.C52560wg;
import com.google.assistant.p3897e.p3921j.C52568wo;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.libraries.assistant.auto.tng.assistant.ui.projected.mediarec.ak */
/* compiled from: PG */
public final /* synthetic */ class C13129ak implements Predicate {

    /* renamed from: a */
    public final /* synthetic */ C52560wg f40711a;

    public /* synthetic */ C13129ak(C52560wg wgVar) {
        this.f40711a = wgVar;
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
        String str = (String) obj;
        C52568wo woVar = this.f40711a.f137950f;
        if (woVar == null) {
            woVar = C52568wo.f137992v;
        }
        return str.equals(woVar.f137998e);
    }
}
