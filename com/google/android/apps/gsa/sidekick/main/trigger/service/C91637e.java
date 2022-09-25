package com.google.android.apps.gsa.sidekick.main.trigger.service;

import com.google.android.apps.gsa.location.z;
import com.google.android.apps.gsa.search.core.p6513aj.C84539b;
import com.google.android.apps.gsa.shared.util.p7159c.C90932cb;
import com.google.android.apps.gsa.sidekick.main.p7202e.C91286b;
import com.google.android.libraries.search.location.C38716v;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.apps.gsa.sidekick.main.trigger.service.e */
/* compiled from: PG */
public final class C91637e {

    /* renamed from: a */
    public static final int f255585a = ((int) TimeUnit.MINUTES.toMillis(1));

    /* renamed from: b */
    public static final int f255586b = ((int) TimeUnit.SECONDS.toMillis(20));

    /* renamed from: c */
    public static final Object f255587c = new Object();

    /* renamed from: d */
    public final C84539b f255588d;

    /* renamed from: e */
    public final C91286b f255589e;

    /* renamed from: f */
    public final C38716v f255590f;

    public C91637e(C84539b bVar, z zVar, C90932cb cbVar, C38716v vVar) {
        this.f255588d = bVar;
        this.f255590f = vVar;
        this.f255589e = new C91286b(zVar, cbVar, true);
    }
}
