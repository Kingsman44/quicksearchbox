package com.google.android.apps.gsa.search.core.p6519al.p6660cn.p6661a;

import com.google.android.apps.gsa.p8883x.C118826c;
import com.google.android.apps.gsa.search.core.p6519al.p6660cn.C85142a;
import com.google.android.apps.gsa.search.core.service.p6852g.C86724d;
import com.google.android.apps.gsa.search.core.service.p6852g.C86731k;
import com.google.android.apps.gsa.search.core.service.p6852g.C86732l;
import com.google.android.libraries.gsa.p1880l.C22876d;
import com.google.common.util.concurrent.C60870cx;

/* renamed from: com.google.android.apps.gsa.search.core.al.cn.a.e */
/* compiled from: PG */
public final class C85147e extends C86731k {

    /* renamed from: c */
    private final C22876d f230873c;

    /* renamed from: d */
    private final Throwable f230874d;

    public C85147e(C22876d dVar, Throwable th) {
        super("save", "save::provideFailedResponse", C86732l.FIRE_AND_FORGET, C86724d.IDLE);
        this.f230873c = dVar;
        this.f230874d = th;
    }

    /* renamed from: g */
    public final C60870cx mo78371g(Object obj) {
        ((C85142a) obj).mo78737f(this.f230873c, this.f230874d);
        return C118826c.f331423b;
    }
}
