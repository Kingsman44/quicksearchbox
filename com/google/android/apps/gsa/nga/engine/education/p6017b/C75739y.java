package com.google.android.apps.gsa.nga.engine.education.p6017b;

import android.util.Pair;
import com.google.android.apps.gsa.shared.p7066m.C90126fx;
import p3186j$.time.Duration;
import p3186j$.time.Instant;
import p3186j$.time.temporal.Temporal;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.gsa.nga.engine.education.b.y */
/* compiled from: PG */
public final /* synthetic */ class C75739y implements Function {

    /* renamed from: a */
    public final /* synthetic */ C75706ac f210213a;

    /* renamed from: b */
    public final /* synthetic */ Instant f210214b;

    public /* synthetic */ C75739y(C75706ac acVar, Instant instant) {
        this.f210213a = acVar;
        this.f210214b = instant;
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        C75706ac acVar = this.f210213a;
        Instant instant = this.f210214b;
        Pair pair = (Pair) obj;
        boolean z = false;
        if (((long) ((Integer) pair.first).intValue()) < acVar.f210154e.mo85399d(C90126fx.f251509kE) && Duration.between((Temporal) pair.second, instant).toMinutes() > acVar.f210154e.mo85399d(C90126fx.f251510kF)) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
