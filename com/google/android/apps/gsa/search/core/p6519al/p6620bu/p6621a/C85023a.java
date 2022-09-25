package com.google.android.apps.gsa.search.core.p6519al.p6620bu.p6621a;

import com.google.android.apps.gsa.search.core.p6519al.p6620bu.C85022a;
import com.google.android.apps.gsa.search.core.service.p6852g.C86724d;
import com.google.android.apps.gsa.search.core.service.p6852g.C86731k;
import com.google.android.apps.gsa.search.core.service.p6852g.C86732l;
import com.google.common.util.concurrent.C60870cx;
import com.google.p375ai.p378b.C7891nu;

/* renamed from: com.google.android.apps.gsa.search.core.al.bu.a.a */
/* compiled from: PG */
public final class C85023a extends C86731k {

    /* renamed from: c */
    private final String f230692c;

    /* renamed from: d */
    private final C7891nu f230693d;

    public C85023a(String str, C7891nu nuVar) {
        super("optin", "optin::backgroundNowOptIn", C86732l.CONTROLLED_BY_USER, C86724d.IDLE);
        this.f230692c = str;
        this.f230693d = nuVar;
    }

    /* renamed from: g */
    public final C60870cx mo78371g(Object obj) {
        return ((C85022a) obj).mo78656a(this.f230692c, this.f230693d);
    }
}
