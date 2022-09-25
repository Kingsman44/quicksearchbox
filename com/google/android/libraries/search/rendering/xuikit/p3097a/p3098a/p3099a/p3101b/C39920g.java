package com.google.android.libraries.search.rendering.xuikit.p3097a.p3098a.p3099a.p3101b;

import android.icu.util.Measure;
import android.icu.util.MeasureUnit;
import p3186j$.time.Duration;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.libraries.search.rendering.xuikit.a.a.a.b.g */
/* compiled from: PG */
public final /* synthetic */ class C39920g implements Predicate {

    /* renamed from: a */
    public static final /* synthetic */ C39920g f104944a = new C39920g();

    private /* synthetic */ C39920g() {
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
        Duration duration = C39924k.f104950a;
        return ((Measure) obj).getUnit().equals(MeasureUnit.MONTH);
    }
}
