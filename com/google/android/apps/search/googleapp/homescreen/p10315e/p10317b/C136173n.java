package com.google.android.apps.search.googleapp.homescreen.p10315e.p10317b;

import android.content.Context;
import com.google.android.libraries.p1730f.C21370a;
import com.google.android.libraries.search.location.C38695am;
import com.google.android.libraries.storage.protostore.C42876ab;
import com.google.apps.tiktok.concurrent.C46463o;
import com.google.apps.tiktok.dataservice.C46689ag;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47633f;
import com.google.common.util.concurrent.C60817ay;
import com.google.common.util.concurrent.C60870cx;
import java.util.concurrent.Executor;
import p3186j$.time.Duration;

/* renamed from: com.google.android.apps.search.googleapp.homescreen.e.b.n */
/* compiled from: PG */
public final class C136173n implements C46689ag {

    /* renamed from: a */
    public final Context f370846a;

    /* renamed from: b */
    public final C42876ab f370847b;

    /* renamed from: c */
    public final Executor f370848c;

    /* renamed from: d */
    public final Executor f370849d;

    /* renamed from: e */
    public final C38695am f370850e;

    /* renamed from: f */
    public final C21370a f370851f;

    /* renamed from: g */
    private final Duration f370852g;

    public C136173n(long j, C42876ab abVar, Executor executor, Executor executor2, C38695am amVar, Context context, C21370a aVar) {
        this.f370852g = Duration.ofMinutes(j);
        this.f370847b = abVar;
        this.f370849d = executor;
        this.f370848c = executor2;
        this.f370850e = amVar;
        this.f370846a = context;
        this.f370851f = aVar;
    }

    /* renamed from: a */
    public final C46463o mo18086a() {
        return new C46463o(new C60817ay(C47633f.m84733g(this.f370847b.mo46042d()).mo51515h(new C136170k(this), this.f370849d)));
    }

    /* renamed from: b */
    public final C60870cx mo18087b() {
        return C47633f.m84733g(this.f370847b.mo46042d()).mo51516i(new C136172m(this), this.f370848c);
    }

    /* renamed from: c */
    public final /* synthetic */ Object mo18088c() {
        return "WEATHER_KEY";
    }

    /* renamed from: d */
    public final boolean mo112815d(Duration duration) {
        return Duration.ofMillis(this.f370851f.mo26870b()).minus(duration).compareTo(this.f370852g) >= 0;
    }
}
