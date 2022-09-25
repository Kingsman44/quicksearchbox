package com.google.android.apps.gsa.staticplugins.gearhead.projected;

import android.content.Context;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.shared.p7066m.C90086ek;
import com.google.android.gms.car.C143121be;
import com.google.android.gms.car.C143125bi;
import com.google.android.libraries.assistant.auto.tng.p1008j.p1012b.p1013a.C13647b;
import com.google.android.libraries.search.assistant.p2485a.C32240a;
import com.google.apps.tiktok.concurrent.C46459k;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import dagger.C68214a;
import p3186j$.util.function.Consumer;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.apps.gsa.staticplugins.gearhead.projected.h */
/* compiled from: PG */
public final class C101378h implements C101347a {

    /* renamed from: a */
    public static final C59071e f282901a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.gearhead.projected.h");

    /* renamed from: b */
    public final C68214a f282902b;

    /* renamed from: c */
    public final C86124t f282903c;

    /* renamed from: d */
    public C143121be f282904d;

    /* renamed from: e */
    private final Context f282905e;

    /* renamed from: f */
    private final C32240a f282906f;

    /* renamed from: com.google.android.apps.gsa.staticplugins.gearhead.projected.h$a */
    /* compiled from: PG */
    public interface C101379a {
        /* renamed from: mp */
        C69464a mo92273mp();
    }

    public C101378h(C32240a aVar, Context context, C68214a aVar2, C86124t tVar) {
        this.f282906f = aVar;
        this.f282905e = context;
        this.f282902b = aVar2;
        this.f282903c = tVar;
    }

    /* renamed from: b */
    public static void m167685b(C60870cx cxVar, Consumer consumer) {
        C101372b bVar = new C101372b(consumer);
        C46459k.m82829b(C60922j.m93044g(cxVar, C47810es.m84963c(bVar), C60826bg.f164896a), "Failed to register/unregister DoubleDash manager.", new Object[0]);
    }

    /* renamed from: a */
    public final C143121be mo92252a(Runnable runnable) {
        C60870cx a = this.f282906f.f86461a.mo104411a(C101379a.class);
        Context context = this.f282905e;
        context.getClass();
        C143121be a2 = C143125bi.m232178a(context, new C101377g(this, a, runnable), new C101373c(this, a), new C101376f(this, a));
        this.f282904d = a2;
        return a2;
    }

    /* renamed from: c */
    public final void mo92272c(C60870cx cxVar) {
        if (this.f282903c.mo79746e(C90086ek.f250348bT)) {
            m167685b(cxVar, C101374d.f282894a);
        } else {
            ((C13647b) this.f282902b.mo27525b()).mo21201b();
        }
    }
}
