package com.google.android.apps.gsa.search.core.p6519al.p6606bp.p6609b;

import android.content.Intent;
import com.google.android.apps.gsa.p8883x.C118826c;
import com.google.android.apps.gsa.search.core.p6519al.p6606bp.C85005h;
import com.google.android.apps.gsa.search.core.service.p6852g.C86724d;
import com.google.android.apps.gsa.search.core.service.p6852g.C86731k;
import com.google.android.apps.gsa.search.core.service.p6852g.C86732l;
import com.google.common.util.concurrent.C60870cx;

/* renamed from: com.google.android.apps.gsa.search.core.al.bp.b.aj */
/* compiled from: PG */
public final class C84935aj extends C86731k {

    /* renamed from: c */
    private final Intent f230608c;

    public C84935aj(Intent intent) {
        super("opa", "opa::onOpaProactiveNotificationDismissed", C86732l.FIRE_AND_FORGET, C86724d.IDLE);
        this.f230608c = intent;
    }

    /* renamed from: g */
    public final C60870cx mo78371g(Object obj) {
        ((C85005h) obj).mo78607C(this.f230608c);
        return C118826c.f331423b;
    }
}
