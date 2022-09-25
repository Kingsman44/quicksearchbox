package com.google.android.apps.gsa.staticplugins.opa.util.p8593a;

import android.content.SharedPreferences;
import com.google.android.apps.gsa.p8883x.C118826c;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import dagger.p5295b.C68283d;
import dagger.p5295b.p5296a.C68236af;
import dagger.p5295b.p5296a.C68247h;
import dagger.p5295b.p5297b.C68277d;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.util.a.i */
/* compiled from: PG */
public final class C113754i extends C68247h {

    /* renamed from: a */
    private final C68283d f315053a;

    public C113754i(C69464a aVar, C69464a aVar2, C68283d dVar) {
        super(aVar2, new C68277d(C113754i.class), aVar);
        this.f315053a = C68236af.m98549d(dVar);
    }

    /* renamed from: a */
    public final /* synthetic */ C60870cx mo20481a(Object obj) {
        ((SharedPreferences) obj).edit().putInt("assistant_interaction_count", 0).putLong("assistant_latest_interaction_timestamp_millis", -1).apply();
        return C60856cj.m92900i(C118826c.f331422a);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final C60870cx mo20482b() {
        return this.f315053a.mo60297gq();
    }
}
