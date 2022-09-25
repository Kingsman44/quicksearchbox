package com.google.android.apps.search.googleapp.launcher.minusone;

import com.google.android.apps.search.googleapp.discover.streamui.C134744f;
import p3186j$.time.Duration;
import p3186j$.time.Instant;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.search.googleapp.launcher.minusone.j */
/* compiled from: PG */
final class C136655j implements Function {

    /* renamed from: a */
    final /* synthetic */ Instant f372010a;

    public C136655j(Instant instant) {
        this.f372010a = instant;
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final /* bridge */ /* synthetic */ Object apply(Object obj) {
        return Duration.between(((C134744f) obj).mo111948b(), this.f372010a);
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
