package com.google.android.apps.gsa.staticplugins.opa.tapas.p8475b.p8490n;

import com.google.android.apps.gsa.opa.C83581al;
import com.google.android.apps.gsa.staticplugins.opa.tapas.p8555l.p8563g.C112473ar;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.android.libraries.p1730f.C21370a;
import com.google.common.util.concurrent.C60870cx;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.b.n.b */
/* compiled from: PG */
public final class C111235b extends C112473ar {

    /* renamed from: a */
    public final C21370a f309547a;

    /* renamed from: b */
    private final C22871g f309548b;

    /* renamed from: c */
    private final C83581al f309549c;

    public C111235b(C22871g gVar, C83581al alVar, C21370a aVar) {
        this.f309548b = gVar;
        this.f309549c = alVar;
        this.f309547a = aVar;
    }

    /* renamed from: a */
    public final long mo99043a() {
        return TimeUnit.MINUTES.toMillis(5);
    }

    /* renamed from: b */
    public final C60870cx mo99044b() {
        return this.f309548b.mo28209i(this.f309549c.mo76934i(), "opaStore.getTapasUserRetention", new C111234a(this));
    }
}
