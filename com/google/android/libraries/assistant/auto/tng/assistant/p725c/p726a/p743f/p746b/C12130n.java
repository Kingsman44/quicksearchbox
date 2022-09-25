package com.google.android.libraries.assistant.auto.tng.assistant.p725c.p726a.p743f.p746b;

import com.google.speech.recognizer.p5233a.C67451at;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.libraries.assistant.auto.tng.assistant.c.a.f.b.n */
/* compiled from: PG */
public final /* synthetic */ class C12130n implements Predicate {

    /* renamed from: a */
    public final /* synthetic */ C67451at f38781a;

    public /* synthetic */ C12130n(C67451at atVar) {
        this.f38781a = atVar;
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
        C67451at atVar = this.f38781a;
        C12133q qVar = C12133q.AMR_MONO;
        return !((C12133q) obj).f38795k.equals(atVar);
    }
}
