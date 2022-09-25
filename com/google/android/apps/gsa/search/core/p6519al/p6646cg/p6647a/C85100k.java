package com.google.android.apps.gsa.search.core.p6519al.p6646cg.p6647a;

import android.graphics.Bitmap;
import com.google.android.apps.gsa.p8883x.C118826c;
import com.google.android.apps.gsa.search.core.p6519al.p6646cg.C85089a;
import com.google.android.apps.gsa.search.core.service.p6852g.C86724d;
import com.google.android.apps.gsa.search.core.service.p6852g.C86731k;
import com.google.android.apps.gsa.search.core.service.p6852g.C86732l;
import com.google.common.util.concurrent.C60870cx;

/* renamed from: com.google.android.apps.gsa.search.core.al.cg.a.k */
/* compiled from: PG */
public final class C85100k extends C86731k {

    /* renamed from: c */
    private final String f230774c;

    /* renamed from: d */
    private final String f230775d;

    /* renamed from: e */
    private final Bitmap f230776e;

    public C85100k(String str, String str2, Bitmap bitmap) {
        super("recently", "recently::saveSrp", C86732l.FIRE_AND_FORGET, C86724d.IDLE);
        this.f230774c = str;
        this.f230775d = str2;
        this.f230776e = bitmap;
    }

    /* renamed from: g */
    public final C60870cx mo78371g(Object obj) {
        ((C85089a) obj).mo78707k(this.f230774c, this.f230775d, this.f230776e);
        return C118826c.f331423b;
    }
}
