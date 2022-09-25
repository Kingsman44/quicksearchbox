package com.google.android.apps.gsa.search.core.p6519al.p6526ac.p6527a;

import android.content.Intent;
import com.google.android.apps.gsa.p8883x.C118826c;
import com.google.android.apps.gsa.search.core.p6519al.p6526ac.C84624a;
import com.google.android.apps.gsa.search.core.service.p6852g.C86724d;
import com.google.android.apps.gsa.search.core.service.p6852g.C86731k;
import com.google.android.apps.gsa.search.core.service.p6852g.C86732l;
import com.google.common.util.concurrent.C60870cx;

/* renamed from: com.google.android.apps.gsa.search.core.al.ac.a.d */
/* compiled from: PG */
public final class C84628d extends C86731k {

    /* renamed from: c */
    private final Intent f230281c;

    public C84628d(Intent intent) {
        super("customtabs", "customtabs::launchClientIntent", C86732l.FIRE_AND_FORGET, C86724d.IDLE);
        this.f230281c = intent;
    }

    /* renamed from: g */
    public final C60870cx mo78371g(Object obj) {
        ((C84624a) obj).mo78393m(this.f230281c);
        return C118826c.f331423b;
    }
}
