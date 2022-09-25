package com.google.android.apps.gsa.staticplugins.p7816dl.p7821e.p7822a.p7823a;

import android.os.Bundle;
import com.google.android.apps.gsa.search.core.service.p6852g.C86724d;
import com.google.android.apps.gsa.search.core.service.p6852g.C86731k;
import com.google.android.apps.gsa.search.core.service.p6852g.C86732l;
import com.google.android.apps.gsa.staticplugins.p7816dl.p7821e.p7822a.C99719a;
import com.google.common.util.concurrent.C60870cx;

/* renamed from: com.google.android.apps.gsa.staticplugins.dl.e.a.a.f */
/* compiled from: PG */
public final class C99725f extends C86731k {

    /* renamed from: c */
    private final String f279062c;

    /* renamed from: d */
    private final boolean f279063d;

    /* renamed from: e */
    private final Bundle f279064e;

    /* renamed from: f */
    private final Bundle f279065f;

    public C99725f(String str, boolean z, Bundle bundle, Bundle bundle2) {
        super("pomo", "pomo::requestUpdate", C86732l.CONTROLLED_BY_USER, C86724d.IDLE);
        this.f279062c = str;
        this.f279063d = z;
        this.f279064e = bundle;
        this.f279065f = bundle2;
    }

    /* renamed from: g */
    public final C60870cx mo78371g(Object obj) {
        return ((C99719a) obj).mo91576c(this.f279062c, this.f279063d, this.f279064e, this.f279065f);
    }
}
