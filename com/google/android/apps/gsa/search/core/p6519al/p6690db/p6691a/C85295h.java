package com.google.android.apps.gsa.search.core.p6519al.p6690db.p6691a;

import com.google.android.apps.gsa.search.core.p6519al.p6690db.C85299b;
import com.google.android.apps.gsa.search.core.service.p6852g.C86724d;
import com.google.android.apps.gsa.search.core.service.p6852g.C86731k;
import com.google.android.apps.gsa.search.core.service.p6852g.C86732l;
import com.google.common.util.concurrent.C60870cx;

/* renamed from: com.google.android.apps.gsa.search.core.al.db.a.h */
/* compiled from: PG */
public final class C85295h extends C86731k {

    /* renamed from: c */
    private final String f231061c;

    /* renamed from: d */
    private final boolean f231062d;

    public C85295h(String str, boolean z) {
        super("smartspace", "smartspace::setSmartspaceEnabled", C86732l.CONTROLLED_BY_USER, C86724d.IDLE);
        this.f231061c = str;
        this.f231062d = z;
    }

    /* renamed from: g */
    public final C60870cx mo78371g(Object obj) {
        return ((C85299b) obj).mo78854g(this.f231061c, this.f231062d);
    }
}
