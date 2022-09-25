package com.google.android.apps.gsa.search.core.p6519al.p6713dm.p6714a;

import com.google.android.apps.gsa.search.core.p6519al.p6713dm.C85393a;
import com.google.android.apps.gsa.search.core.service.p6852g.C86724d;
import com.google.android.apps.gsa.search.core.service.p6852g.C86731k;
import com.google.android.apps.gsa.search.core.service.p6852g.C86732l;
import com.google.android.apps.gsa.search.shared.service.ClientConfig;
import com.google.android.apps.gsa.shared.search.Query;
import com.google.common.util.concurrent.C60870cx;

/* renamed from: com.google.android.apps.gsa.search.core.al.dm.a.a */
/* compiled from: PG */
public final class C85394a extends C86731k {

    /* renamed from: c */
    private final ClientConfig f231191c;

    /* renamed from: d */
    private final int f231192d;

    /* renamed from: e */
    private final Query f231193e;

    /* renamed from: f */
    private final long f231194f;

    /* renamed from: g */
    private final boolean f231195g;

    public C85394a(ClientConfig clientConfig, int i, Query query, long j, boolean z) {
        super("uilaunch", "uilaunch::handleSwitchToResultsActivity", C86732l.CONTROLLED_BY_USER, C86724d.SEARCH_TEXT);
        this.f231191c = clientConfig;
        this.f231192d = i;
        this.f231193e = query;
        this.f231194f = j;
        this.f231195g = z;
    }

    /* renamed from: g */
    public final C60870cx mo78371g(Object obj) {
        return ((C85393a) obj).mo78916a(this.f231191c, this.f231192d, this.f231193e, this.f231194f, this.f231195g);
    }
}
