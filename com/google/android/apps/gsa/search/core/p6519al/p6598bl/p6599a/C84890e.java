package com.google.android.apps.gsa.search.core.p6519al.p6598bl.p6599a;

import com.google.android.apps.gsa.search.core.p6519al.p6598bl.C84885a;
import com.google.android.apps.gsa.search.core.service.p6852g.C86724d;
import com.google.android.apps.gsa.search.core.service.p6852g.C86731k;
import com.google.android.apps.gsa.search.core.service.p6852g.C86732l;
import com.google.android.apps.gsa.shared.notificationlistening.common.BundledMessageNotification;
import com.google.common.util.concurrent.C60870cx;

/* renamed from: com.google.android.apps.gsa.search.core.al.bl.a.e */
/* compiled from: PG */
public final class C84890e extends C86731k {

    /* renamed from: c */
    private final BundledMessageNotification f230560c;

    public C84890e(BundledMessageNotification bundledMessageNotification) {
        super("notification", "notification::markAsReadNotificationDirectly", C86732l.CONTROLLED_BY_USER, C86724d.IDLE);
        this.f230560c = bundledMessageNotification;
    }

    /* renamed from: g */
    public final C60870cx mo78371g(Object obj) {
        return ((C84885a) obj).mo78564g(this.f230560c);
    }
}
