package com.google.android.apps.gsa.search.core.p6519al.p6644cf.p6645a;

import com.google.android.apps.gsa.p8883x.C118826c;
import com.google.android.apps.gsa.search.core.p6519al.p6644cf.C85084a;
import com.google.android.apps.gsa.search.core.service.p6852g.C86724d;
import com.google.android.apps.gsa.search.core.service.p6852g.C86731k;
import com.google.android.apps.gsa.search.core.service.p6852g.C86732l;
import com.google.common.util.concurrent.C60870cx;

/* renamed from: com.google.android.apps.gsa.search.core.al.cf.a.b */
/* compiled from: PG */
public final class C85086b extends C86731k {

    /* renamed from: c */
    private final String f230753c;

    /* renamed from: d */
    private final String f230754d;

    /* renamed from: e */
    private final String f230755e;

    public C85086b(String str, String str2, String str3) {
        super("reauth", "reauth::verifyCredentialsNotifyClient", C86732l.FIRE_AND_FORGET, C86724d.IDLE);
        this.f230753c = str;
        this.f230754d = str2;
        this.f230755e = str3;
    }

    /* renamed from: g */
    public final C60870cx mo78371g(Object obj) {
        ((C85084a) obj).mo78695b(this.f230753c, this.f230754d, this.f230755e);
        return C118826c.f331423b;
    }
}
