package com.google.android.apps.gsa.search.core.p6519al.p6562au.p6563a;

import com.google.android.apps.gsa.search.core.p6519al.p6562au.C84741a;
import com.google.android.apps.gsa.search.core.service.p6852g.C86724d;
import com.google.android.apps.gsa.search.core.service.p6852g.C86731k;
import com.google.android.apps.gsa.search.core.service.p6852g.C86732l;
import com.google.android.apps.gsa.shared.p6968aa.C89020ar;
import com.google.android.apps.gsa.shared.p6968aa.C89061q;
import com.google.android.apps.gsa.shared.p6968aa.C89068x;
import com.google.common.util.concurrent.C60870cx;

/* renamed from: com.google.android.apps.gsa.search.core.al.au.a.d */
/* compiled from: PG */
public final class C84745d extends C86731k {

    /* renamed from: c */
    private final C89020ar f230377c;

    /* renamed from: d */
    private final C89068x f230378d;

    /* renamed from: e */
    private final C89061q f230379e;

    public C84745d(C89020ar arVar, C89068x xVar, C89061q qVar) {
        super("http", "http::executeRequestUnbuffered", C86732l.CONTROLLED_BY_USER, C86724d.IDLE);
        this.f230377c = arVar;
        this.f230378d = xVar;
        this.f230379e = qVar;
    }

    /* renamed from: g */
    public final C60870cx mo78371g(Object obj) {
        return ((C84741a) obj).mo78456f(this.f230377c, this.f230378d, this.f230379e);
    }
}
