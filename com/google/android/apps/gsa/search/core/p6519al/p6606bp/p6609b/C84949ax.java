package com.google.android.apps.gsa.search.core.p6519al.p6606bp.p6609b;

import com.google.android.apps.gsa.p8883x.C118826c;
import com.google.android.apps.gsa.search.core.p6519al.p6606bp.C85005h;
import com.google.android.apps.gsa.search.core.service.p6852g.C86724d;
import com.google.android.apps.gsa.search.core.service.p6852g.C86731k;
import com.google.android.apps.gsa.search.core.service.p6852g.C86732l;
import com.google.android.apps.gsa.shared.search.Query;
import com.google.common.util.concurrent.C60870cx;

/* renamed from: com.google.android.apps.gsa.search.core.al.bp.b.ax */
/* compiled from: PG */
public final class C84949ax extends C86731k {

    /* renamed from: c */
    private final byte[] f230621c;

    /* renamed from: d */
    private final Query f230622d;

    public C84949ax(byte[] bArr, Query query) {
        super("opa", "opa::sendReconnectClientInput", C86732l.FIRE_AND_FORGET, C86724d.IDLE);
        this.f230621c = bArr;
        this.f230622d = query;
    }

    /* renamed from: g */
    public final C60870cx mo78371g(Object obj) {
        ((C85005h) obj).mo78610F(this.f230621c, this.f230622d);
        return C118826c.f331423b;
    }
}
