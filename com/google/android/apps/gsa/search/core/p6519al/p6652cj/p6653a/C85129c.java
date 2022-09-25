package com.google.android.apps.gsa.search.core.p6519al.p6652cj.p6653a;

import com.google.android.apps.gsa.p8883x.C118826c;
import com.google.android.apps.gsa.search.core.p6519al.p6652cj.C85126a;
import com.google.android.apps.gsa.search.core.service.p6852g.C86724d;
import com.google.android.apps.gsa.search.core.service.p6852g.C86731k;
import com.google.android.apps.gsa.search.core.service.p6852g.C86732l;
import com.google.common.util.concurrent.C60870cx;
import java.util.List;

/* renamed from: com.google.android.apps.gsa.search.core.al.cj.a.c */
/* compiled from: PG */
public final class C85129c extends C86731k {

    /* renamed from: c */
    private final List f230849c;

    /* renamed from: d */
    private final boolean f230850d;

    public C85129c(List list, boolean z) {
        super("remotenotification", "remotenotification::storeRemoteNotificationsInGlobalState", C86732l.FIRE_AND_FORGET, C86724d.IDLE);
        this.f230849c = list;
        this.f230850d = z;
    }

    /* renamed from: g */
    public final C60870cx mo78371g(Object obj) {
        ((C85126a) obj).mo78725b(this.f230849c, this.f230850d);
        return C118826c.f331423b;
    }
}
