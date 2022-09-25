package com.google.android.apps.gsa.search.core.p6519al.p6598bl.p6599a;

import com.google.android.apps.gsa.search.core.p6519al.p6598bl.C84885a;
import com.google.android.apps.gsa.search.core.service.p6852g.C86724d;
import com.google.android.apps.gsa.search.core.service.p6852g.C86731k;
import com.google.android.apps.gsa.search.core.service.p6852g.C86732l;
import com.google.android.apps.gsa.search.shared.service.ClientEventData;
import com.google.common.util.concurrent.C60870cx;

/* renamed from: com.google.android.apps.gsa.search.core.al.bl.a.l */
/* compiled from: PG */
public final class C84897l extends C86731k {

    /* renamed from: c */
    private final ClientEventData f230567c;

    public C84897l(ClientEventData clientEventData) {
        super("notification", "notification::parseReplyToNotificationResult", C86732l.CONTROLLED_BY_USER, C86724d.IDLE);
        this.f230567c = clientEventData;
    }

    /* renamed from: g */
    public final C60870cx mo78371g(Object obj) {
        return ((C84885a) obj).mo78567j(this.f230567c);
    }
}
