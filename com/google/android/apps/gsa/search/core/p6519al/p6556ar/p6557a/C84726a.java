package com.google.android.apps.gsa.search.core.p6519al.p6556ar.p6557a;

import com.google.android.apps.gsa.handsfree.notifications.RemoteNotification;
import com.google.android.apps.gsa.p8883x.C118826c;
import com.google.android.apps.gsa.search.core.p6519al.p6556ar.C84725a;
import com.google.android.apps.gsa.search.core.service.p6852g.C86724d;
import com.google.android.apps.gsa.search.core.service.p6852g.C86731k;
import com.google.android.apps.gsa.search.core.service.p6852g.C86732l;
import com.google.common.util.concurrent.C60870cx;

/* renamed from: com.google.android.apps.gsa.search.core.al.ar.a.a */
/* compiled from: PG */
public final class C84726a extends C86731k {

    /* renamed from: c */
    private final RemoteNotification f230360c;

    public C84726a(RemoteNotification remoteNotification) {
        super("handsfree", "handsfree::handleTouchTriggeredMessage", C86732l.FIRE_AND_FORGET, C86724d.IDLE);
        this.f230360c = remoteNotification;
    }

    /* renamed from: g */
    public final C60870cx mo78371g(Object obj) {
        ((C84725a) obj).mo78444b(this.f230360c);
        return C118826c.f331423b;
    }
}
