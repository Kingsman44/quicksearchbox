package com.google.android.apps.gsa.search.core.p6519al.p6644cf.p6645a;

import com.google.android.apps.gsa.search.core.p6519al.p6644cf.C85084a;
import com.google.android.apps.gsa.search.core.service.p6852g.C86724d;
import com.google.android.apps.gsa.search.core.service.p6852g.C86731k;
import com.google.android.apps.gsa.search.core.service.p6852g.C86732l;
import com.google.common.util.concurrent.C60870cx;

/* renamed from: com.google.android.apps.gsa.search.core.al.cf.a.c */
/* compiled from: PG */
public final class C85087c extends C86731k {

    /* renamed from: c */
    private final String f230756c;

    /* renamed from: d */
    private final String f230757d;

    /* renamed from: e */
    private final String f230758e;

    public C85087c(String str, String str2, String str3) {
        super("reauth", "reauth::verifyCredentials", C86732l.CONTROLLED_BY_USER, C86724d.IDLE);
        this.f230756c = str;
        this.f230757d = str2;
        this.f230758e = str3;
    }

    /* renamed from: g */
    public final C60870cx mo78371g(Object obj) {
        return ((C85084a) obj).mo78694a(this.f230756c, this.f230757d, this.f230758e);
    }
}
