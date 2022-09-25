package com.google.android.apps.gsa.nga.shared.p6358n;

import com.google.assistant.p3897e.p3921j.C51809dy;
import com.google.common.util.concurrent.C60870cx;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.apps.gsa.nga.shared.n.a */
/* compiled from: PG */
public final /* synthetic */ class C81430a implements Predicate {

    /* renamed from: a */
    public final /* synthetic */ String f222839a = "tts.OUTPUT";

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
        String str = this.f222839a;
        C60870cx cxVar = C81442m.f222851a;
        return str.equals(((C51809dy) obj).f135936b);
    }
}
