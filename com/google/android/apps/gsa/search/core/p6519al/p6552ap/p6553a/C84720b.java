package com.google.android.apps.gsa.search.core.p6519al.p6552ap.p6553a;

import com.google.android.apps.gsa.p8883x.C118826c;
import com.google.android.apps.gsa.search.core.p6519al.p6552ap.C84718a;
import com.google.android.apps.gsa.search.core.service.p6852g.C86724d;
import com.google.android.apps.gsa.search.core.service.p6852g.C86731k;
import com.google.android.apps.gsa.search.core.service.p6852g.C86732l;
import com.google.common.util.concurrent.C60870cx;

/* renamed from: com.google.android.apps.gsa.search.core.al.ap.a.b */
/* compiled from: PG */
public final class C84720b extends C86731k {

    /* renamed from: c */
    private final String f230352c;

    /* renamed from: d */
    private final String f230353d;

    /* renamed from: e */
    private final String f230354e;

    public C84720b(String str, String str2, String str3) {
        super("googleanalytics", "googleanalytics::sendEvent", C86732l.FIRE_AND_FORGET, C86724d.IDLE);
        this.f230352c = str;
        this.f230353d = str2;
        this.f230354e = str3;
    }

    /* renamed from: g */
    public final C60870cx mo78371g(Object obj) {
        ((C84718a) obj).mo78440a(this.f230352c, this.f230353d, this.f230354e);
        return C118826c.f331423b;
    }
}
