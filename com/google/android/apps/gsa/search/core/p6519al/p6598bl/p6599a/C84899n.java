package com.google.android.apps.gsa.search.core.p6519al.p6598bl.p6599a;

import com.google.android.apps.gsa.search.core.p6519al.p6598bl.C84885a;
import com.google.android.apps.gsa.search.core.service.p6852g.C86724d;
import com.google.android.apps.gsa.search.core.service.p6852g.C86731k;
import com.google.android.apps.gsa.search.core.service.p6852g.C86732l;
import com.google.android.apps.gsa.shared.notificationlistening.common.BundledMessageNotification;
import com.google.common.util.concurrent.C60870cx;

/* renamed from: com.google.android.apps.gsa.search.core.al.bl.a.n */
/* compiled from: PG */
public final class C84899n extends C86731k {

    /* renamed from: c */
    private final BundledMessageNotification f230569c;

    /* renamed from: d */
    private final String f230570d;

    public C84899n(BundledMessageNotification bundledMessageNotification, String str) {
        super("notification", "notification::replyToNotificationDirectly", C86732l.CONTROLLED_BY_USER, C86724d.IDLE);
        this.f230569c = bundledMessageNotification;
        this.f230570d = str;
    }

    /* renamed from: g */
    public final C60870cx mo78371g(Object obj) {
        return ((C84885a) obj).mo78569l(this.f230569c, this.f230570d);
    }
}
