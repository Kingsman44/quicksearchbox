package com.google.android.apps.gsa.search.core.p6519al.p6678cw.p6679a;

import com.google.android.apps.gsa.p8883x.C118826c;
import com.google.android.apps.gsa.search.core.p6519al.p6678cw.C85232a;
import com.google.android.apps.gsa.search.core.service.p6852g.C86724d;
import com.google.android.apps.gsa.search.core.service.p6852g.C86731k;
import com.google.android.apps.gsa.search.core.service.p6852g.C86732l;
import com.google.common.util.concurrent.C60870cx;

/* renamed from: com.google.android.apps.gsa.search.core.al.cw.a.g */
/* compiled from: PG */
public final class C85239g extends C86731k {

    /* renamed from: c */
    private final long f231000c;

    /* renamed from: d */
    private final boolean f231001d;

    public C85239g(long j, boolean z) {
        super("service", "service::setKeepServiceStartedForSession", C86732l.FIRE_AND_FORGET, C86724d.IDLE);
        this.f231000c = j;
        this.f231001d = z;
    }

    /* renamed from: g */
    public final C60870cx mo78371g(Object obj) {
        ((C85232a) obj).mo78813h(this.f231000c, this.f231001d);
        return C118826c.f331423b;
    }
}
