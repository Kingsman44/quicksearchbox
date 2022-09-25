package com.google.android.apps.search.assistant.libraries.p8942a.p8943a;

import com.google.android.apps.search.assistant.libraries.p8942a.C119207d;
import com.google.common.util.concurrent.C60870cx;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
import p3186j$.time.Duration;
import p3186j$.util.Optional;
import p3186j$.util.function.BiFunction;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.search.assistant.libraries.a.a.j */
/* compiled from: PG */
public final /* synthetic */ class C119198j implements BiFunction {

    /* renamed from: a */
    public final /* synthetic */ C119201m f332415a;

    /* renamed from: b */
    public final /* synthetic */ String f332416b;

    /* renamed from: c */
    public final /* synthetic */ C119207d f332417c;

    /* renamed from: d */
    public final /* synthetic */ int f332418d;

    /* renamed from: e */
    public final /* synthetic */ Callable f332419e;

    public /* synthetic */ C119198j(C119201m mVar, String str, C119207d dVar, int i, Callable callable) {
        this.f332415a = mVar;
        this.f332416b = str;
        this.f332417c = dVar;
        this.f332418d = i;
        this.f332419e = callable;
    }

    public final /* synthetic */ BiFunction andThen(Function function) {
        return BiFunction.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj, Object obj2) {
        C119201m mVar = this.f332415a;
        String str = this.f332416b;
        C119207d dVar = this.f332417c;
        int i = this.f332418d;
        Callable callable = this.f332419e;
        String str2 = (String) obj;
        Optional.ofNullable((C60870cx) obj2).ifPresent(C119199k.f332420a);
        return mVar.f332430f.f332438g.mo29165e(new C119200l(str, dVar, i, callable), Duration.ofMillis(C119202n.f332435e.mo56909a(i + 1)).toMillis(), TimeUnit.MILLISECONDS);
    }
}
