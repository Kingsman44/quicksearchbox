package com.google.android.apps.gsa.search.core.p6519al.p6598bl.p6599a;

import com.google.android.apps.gsa.search.core.p6519al.p6598bl.C84885a;
import com.google.android.apps.gsa.search.core.service.p6852g.C86724d;
import com.google.android.apps.gsa.search.core.service.p6852g.C86731k;
import com.google.android.apps.gsa.search.core.service.p6852g.C86732l;
import com.google.common.util.concurrent.C60870cx;
import java.util.List;

/* renamed from: com.google.android.apps.gsa.search.core.al.bl.a.q */
/* compiled from: PG */
public final class C84902q extends C86731k {

    /* renamed from: c */
    private final List f230575c;

    public C84902q(List list) {
        super("notification", "notification::setAppNotifications", C86732l.CONTROLLED_BY_USER, C86724d.IDLE);
        this.f230575c = list;
    }

    /* renamed from: g */
    public final C60870cx mo78371g(Object obj) {
        return ((C84885a) obj).mo78571n(this.f230575c);
    }
}
