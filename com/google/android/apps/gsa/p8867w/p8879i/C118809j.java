package com.google.android.apps.gsa.p8867w.p8879i;

import android.content.SharedPreferences;
import com.google.android.apps.gsa.p6427o.C83561e;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.common.util.concurrent.C60870cx;
import p3186j$.util.Objects;

/* renamed from: com.google.android.apps.gsa.w.i.j */
/* compiled from: PG */
public final class C118809j {

    /* renamed from: a */
    public final C22871g f331379a;

    /* renamed from: b */
    public final SharedPreferences f331380b;

    /* renamed from: c */
    private final C83561e f331381c;

    public C118809j(C22871g gVar, C83561e eVar, SharedPreferences sharedPreferences) {
        this.f331381c = eVar;
        this.f331379a = gVar;
        this.f331380b = sharedPreferences;
    }

    /* renamed from: a */
    public final C60870cx mo103975a() {
        C22871g gVar = this.f331379a;
        C83561e eVar = this.f331381c;
        Objects.requireNonNull(eVar);
        return gVar.mo28201a("Get IsGabPreferred", new C118807h(eVar));
    }
}
