package com.google.android.apps.gsa.search.core.p6519al.p6735h.p6736a;

import com.google.android.apps.gsa.search.core.p6519al.p6735h.C85492i;
import com.google.android.apps.gsa.search.core.service.p6852g.C86724d;
import com.google.android.apps.gsa.search.core.service.p6852g.C86731k;
import com.google.android.apps.gsa.search.core.service.p6852g.C86732l;
import com.google.common.util.concurrent.C60870cx;

/* renamed from: com.google.android.apps.gsa.search.core.al.h.a.g */
/* compiled from: PG */
public final class C85484g extends C86731k {

    /* renamed from: c */
    private final byte[] f231313c;

    /* renamed from: d */
    private final boolean f231314d;

    /* renamed from: e */
    private final boolean f231315e;

    public C85484g(byte[] bArr, boolean z, boolean z2) {
        super("assistantclientsync", "assistantclientsync::startZeroStatePartialRefresh", C86732l.CONTROLLED_BY_USER, C86724d.IDLE);
        this.f231313c = bArr;
        this.f231314d = z;
        this.f231315e = z2;
    }

    /* renamed from: g */
    public final C60870cx mo78371g(Object obj) {
        return ((C85492i) obj).mo79002g(this.f231313c, this.f231314d, this.f231315e);
    }
}
