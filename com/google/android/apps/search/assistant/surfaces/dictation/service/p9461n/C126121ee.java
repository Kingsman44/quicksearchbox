package com.google.android.apps.search.assistant.surfaces.dictation.service.p9461n;

import com.google.android.apps.search.assistant.surfaces.dictation.p9427a.p9428a.C125044j;
import com.google.android.apps.search.assistant.surfaces.dictation.p9427a.p9428a.C125045k;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.apps.search.assistant.surfaces.dictation.service.n.ee */
/* compiled from: PG */
public final /* synthetic */ class C126121ee implements Predicate {

    /* renamed from: a */
    public static final /* synthetic */ C126121ee f347552a = new C126121ee();

    private /* synthetic */ C126121ee() {
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
        C125045k kVar = (C125045k) obj;
        C125044j a = C125044j.m204969a(kVar.f345014a);
        if (a == null) {
            a = C125044j.UNRECOGNIZED;
        }
        return a == C125044j.EMOJI_SUGGESTION && kVar.f345015b != null;
    }
}
