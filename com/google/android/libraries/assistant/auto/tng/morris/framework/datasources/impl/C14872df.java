package com.google.android.libraries.assistant.auto.tng.morris.framework.datasources.impl;

import com.google.android.apps.search.assistant.platform.pcp.p9329f.C123744bk;
import com.google.android.apps.search.assistant.platform.pcp.p9329f.C123746bm;
import com.google.android.apps.search.assistant.platform.pcp.p9329f.C123770cj;
import com.google.android.libraries.assistant.auto.tng.morris.framework.datasources.C14782b;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;
import p3186j$.util.Optional;

/* renamed from: com.google.android.libraries.assistant.auto.tng.morris.framework.datasources.impl.df */
/* compiled from: PG */
public final /* synthetic */ class C14872df implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C14873dg f44757a;

    public /* synthetic */ C14872df(C14873dg dgVar) {
        this.f44757a = dgVar;
    }

    public final C60870cx apply(Object obj) {
        C14873dg dgVar = this.f44757a;
        for (C123744bk bkVar : ((C123746bm) obj).f341820a) {
            if (bkVar.f341810e == 8 && bkVar.f341808c == 4) {
                dgVar.f44759a = Optional.m71637of((C123770cj) bkVar.f341809d);
                return C60856cj.m92900i(C14782b.SUCCESS);
            }
        }
        return C60856cj.m92900i(C14782b.FAILED);
    }
}
