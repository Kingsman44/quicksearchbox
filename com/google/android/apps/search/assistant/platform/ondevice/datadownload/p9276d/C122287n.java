package com.google.android.apps.search.assistant.platform.ondevice.datadownload.p9276d;

import p3186j$.time.Duration;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.apps.search.assistant.platform.ondevice.datadownload.d.n */
/* compiled from: PG */
public final /* synthetic */ class C122287n implements Predicate {

    /* renamed from: a */
    public final /* synthetic */ Duration f339089a;

    public /* synthetic */ C122287n(Duration duration) {
        this.f339089a = duration;
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
        Duration duration = this.f339089a;
        C122288o oVar = (C122288o) obj;
        C122288o oVar2 = C122288o.ZERO_TO_TWO_SECONDS;
        return oVar.f339102l.compareTo(duration) <= 0 && oVar.f339103m.compareTo(duration) > 0;
    }
}
