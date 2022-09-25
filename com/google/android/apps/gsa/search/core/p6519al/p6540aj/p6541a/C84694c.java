package com.google.android.apps.gsa.search.core.p6519al.p6540aj.p6541a;

import android.content.Intent;
import com.google.android.apps.gsa.p8883x.C118826c;
import com.google.android.apps.gsa.search.core.p6519al.p6540aj.C84691a;
import com.google.android.apps.gsa.search.core.service.p6852g.C86724d;
import com.google.android.apps.gsa.search.core.service.p6852g.C86731k;
import com.google.android.apps.gsa.search.core.service.p6852g.C86732l;
import com.google.common.util.concurrent.C60870cx;

/* renamed from: com.google.android.apps.gsa.search.core.al.aj.a.c */
/* compiled from: PG */
public final class C84694c extends C86731k {

    /* renamed from: c */
    private final Intent f230331c;

    public C84694c(Intent intent) {
        super("externalquery", "externalquery::handleExternalActivityIntent", C86732l.FIRE_AND_FORGET, C86724d.SEARCH_TEXT);
        this.f230331c = intent;
    }

    /* renamed from: g */
    public final C60870cx mo78371g(Object obj) {
        ((C84691a) obj).mo78425f(this.f230331c);
        return C118826c.f331423b;
    }
}
