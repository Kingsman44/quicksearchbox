package com.google.android.apps.gsa.search.core.p6519al.p6552ap.p6553a;

import com.google.android.apps.gsa.p8883x.C118826c;
import com.google.android.apps.gsa.search.core.p6519al.p6552ap.C84718a;
import com.google.android.apps.gsa.search.core.service.p6852g.C86724d;
import com.google.android.apps.gsa.search.core.service.p6852g.C86731k;
import com.google.android.apps.gsa.search.core.service.p6852g.C86732l;
import com.google.common.util.concurrent.C60870cx;

/* renamed from: com.google.android.apps.gsa.search.core.al.ap.a.c */
/* compiled from: PG */
public final class C84721c extends C86731k {

    /* renamed from: c */
    private final String f230355c;

    /* renamed from: d */
    private final String f230356d;

    /* renamed from: e */
    private final String f230357e;

    /* renamed from: f */
    private final long f230358f;

    public C84721c(String str, String str2, String str3, long j) {
        super("googleanalytics", "googleanalytics::sendEventWithValue", C86732l.FIRE_AND_FORGET, C86724d.IDLE);
        this.f230355c = str;
        this.f230356d = str2;
        this.f230357e = str3;
        this.f230358f = j;
    }

    /* renamed from: g */
    public final C60870cx mo78371g(Object obj) {
        ((C84718a) obj).mo78441b(this.f230355c, this.f230356d, this.f230357e, this.f230358f);
        return C118826c.f331423b;
    }
}
