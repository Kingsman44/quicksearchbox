package com.google.android.apps.gsa.search.core.p6519al.p6606bp.p6609b;

import android.content.Intent;
import com.google.android.apps.gsa.p8883x.C118826c;
import com.google.android.apps.gsa.search.core.p6519al.p6606bp.C85005h;
import com.google.android.apps.gsa.search.core.service.p6852g.C86724d;
import com.google.android.apps.gsa.search.core.service.p6852g.C86731k;
import com.google.android.apps.gsa.search.core.service.p6852g.C86732l;
import com.google.common.util.concurrent.C60870cx;

/* renamed from: com.google.android.apps.gsa.search.core.al.bp.b.ah */
/* compiled from: PG */
public final class C84933ah extends C86731k {

    /* renamed from: c */
    private final Intent f230606c;

    public C84933ah(Intent intent) {
        super("opa", "opa::onNotificationDismissed", C86732l.FIRE_AND_FORGET, C86724d.IDLE);
        this.f230606c = intent;
    }

    /* renamed from: g */
    public final C60870cx mo78371g(Object obj) {
        ((C85005h) obj).mo78605A(this.f230606c);
        return C118826c.f331423b;
    }
}
