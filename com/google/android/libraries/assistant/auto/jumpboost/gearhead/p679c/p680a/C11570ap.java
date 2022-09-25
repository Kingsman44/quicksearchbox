package com.google.android.libraries.assistant.auto.jumpboost.gearhead.p679c.p680a;

import android.content.Intent;
import com.google.android.gearhead.sdk.assistant.C142660f;
import com.google.android.libraries.assistant.auto.jumpboost.gearhead.p673a.C11525d;
import com.google.android.libraries.assistant.auto.jumpboost.gearhead.p679c.C11628d;
import com.google.apps.tiktok.concurrent.C46459k;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60904dr;
import com.google.common.util.concurrent.C60922j;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.libraries.assistant.auto.jumpboost.gearhead.c.a.ap */
/* compiled from: PG */
final class C11570ap implements C11628d {

    /* renamed from: a */
    public static final C59071e f37483a = C59071e.m91332i("com.google.android.libraries.assistant.auto.jumpboost.gearhead.c.a.ap");

    /* renamed from: b */
    public final Executor f37484b;

    /* renamed from: c */
    public final Executor f37485c;

    /* renamed from: d */
    public final C11525d f37486d;

    /* renamed from: e */
    public int f37487e = 0;

    /* renamed from: f */
    public boolean f37488f = false;

    /* renamed from: g */
    public C142660f f37489g = null;

    /* renamed from: h */
    public C58485gu f37490h = C58485gu.m89845m();

    public C11570ap(C11525d dVar, Executor executor) {
        this.f37486d = dVar;
        this.f37484b = executor;
        this.f37485c = new C60904dr(executor);
    }

    /* renamed from: a */
    public final C60870cx mo20063a() {
        C11569ao aoVar = new C11569ao(this);
        return C60856cj.m92904m(C47810es.m84978r(aoVar), this.f37485c);
    }

    /* renamed from: b */
    public final C60870cx mo20064b() {
        C60870cx c = mo20065c();
        C11557ac acVar = new C11557ac(this);
        return C60922j.m93045h(c, C47810es.m84966f(acVar), this.f37484b);
    }

    /* renamed from: c */
    public final C60870cx mo20065c() {
        C11560af afVar = new C11560af(this);
        return C60856cj.m92904m(C47810es.m84978r(afVar), this.f37485c);
    }

    /* renamed from: d */
    public final C60870cx mo20066d() {
        C60870cx c = mo20065c();
        C11568an anVar = new C11568an(this);
        return C60922j.m93045h(c, C47810es.m84966f(anVar), this.f37484b);
    }

    /* renamed from: e */
    public final C60870cx mo20067e(Intent intent) {
        C60870cx c = mo20065c();
        C11625z zVar = new C11625z(this, intent);
        return C60922j.m93045h(c, C47810es.m84966f(zVar), this.f37484b);
    }

    /* renamed from: f */
    public final C60870cx mo20068f() {
        C11559ae aeVar = new C11559ae(this);
        return C60856cj.m92904m(C47810es.m84978r(aeVar), this.f37485c);
    }

    /* renamed from: g */
    public final void mo20069g(int i) {
        C11562ah ahVar = new C11562ah(this, i);
        C46459k.m82829b(C60856cj.m92904m(C47810es.m84978r(ahVar), this.f37485c), "Failed to set apiVersion", new Object[0]);
    }

    /* renamed from: h */
    public final void mo20070h(C142660f fVar) {
        C11561ag agVar = new C11561ag(this, fVar);
        C46459k.m82829b(C60856cj.m92904m(C47810es.m84978r(agVar), this.f37485c), "Failed to update ICarAssistantClientCallbacks", new Object[0]);
    }

    /* renamed from: i */
    public final void mo20071i(boolean z) {
        C11558ad adVar = new C11558ad(this, z);
        C46459k.m82829b(C60856cj.m92904m(C47810es.m84978r(adVar), this.f37485c), "Failed to update isDodgeboostEnabled", new Object[0]);
    }

    /* renamed from: j */
    public final void mo20072j(C58485gu guVar) {
        C11563ai aiVar = new C11563ai(this, guVar);
        C46459k.m82829b(C60856cj.m92904m(C47810es.m84978r(aiVar), this.f37485c), "Failed to update PhExperimentTokens", new Object[0]);
    }
}
