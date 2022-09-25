package com.google.android.apps.gsa.search.core.p6519al.p6678cw.p6679a;

import android.app.Notification;
import com.google.android.apps.gsa.p8883x.C118826c;
import com.google.android.apps.gsa.search.core.p6519al.p6678cw.C85232a;
import com.google.android.apps.gsa.search.core.service.p6852g.C86724d;
import com.google.android.apps.gsa.search.core.service.p6852g.C86731k;
import com.google.android.apps.gsa.search.core.service.p6852g.C86732l;
import com.google.common.util.concurrent.C60870cx;

/* renamed from: com.google.android.apps.gsa.search.core.al.cw.a.j */
/* compiled from: PG */
public final class C85242j extends C86731k {

    /* renamed from: c */
    private final int f231007c;

    /* renamed from: d */
    private final Notification f231008d;

    public C85242j(int i, Notification notification) {
        super("service", "service::startForegroundNotification", C86732l.FIRE_AND_FORGET, C86724d.IDLE);
        this.f231007c = i;
        this.f231008d = notification;
    }

    /* renamed from: g */
    public final C60870cx mo78371g(Object obj) {
        ((C85232a) obj).mo78816k(this.f231007c, this.f231008d);
        return C118826c.f331423b;
    }
}
