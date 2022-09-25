package com.google.android.apps.gsa.staticplugins.opa.tapas.p8475b.p8479d;

import com.google.android.apps.gsa.assistant.shared.n.l;
import com.google.android.apps.gsa.assistant.shared.n.p;
import com.google.android.apps.gsa.staticplugins.opa.tapas.p8555l.p8563g.C112473ar;
import com.google.android.libraries.p1730f.C21370a;
import com.google.assistant.p3861at.acu;
import com.google.assistant.p3861at.acv;
import com.google.common.base.C58833ax;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60838bs;
import com.google.common.util.concurrent.C60846c;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import java.util.concurrent.CancellationException;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.b.d.c */
/* compiled from: PG */
public final class C111113c extends C112473ar {

    /* renamed from: a */
    public static final C59071e f309359a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.opa.tapas.b.d.c");

    /* renamed from: b */
    public final C21370a f309360b;

    /* renamed from: c */
    private final l f309361c;

    public C111113c(l lVar, C21370a aVar) {
        this.f309361c = lVar;
        this.f309360b = aVar;
    }

    /* renamed from: b */
    public final C60870cx mo99044b() {
        p pVar = new p();
        acu acu = (acu) acv.f128920X.createBuilder();
        acu.copyOnWrite();
        acv acv = (acv) acu.instance;
        acv.f128945a |= 128;
        acv.f128952h = true;
        pVar.e((acv) acu.build());
        pVar.e = C58833ax.m90833j(getClass().getSimpleName());
        return C60846c.m92878g(C60922j.m93044g(C60838bs.m92859i(this.f309361c.a(pVar, 3, TimeUnit.SECONDS)), new C111111a(this), C60826bg.f164896a), CancellationException.class, C111112b.f309358a, C60826bg.f164896a);
    }
}
