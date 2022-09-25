package com.google.android.libraries.assistant.auto.tng.morris.framework.datasources.impl;

import com.google.android.apps.search.assistant.platform.pcp.p9329f.C123744bk;
import com.google.android.apps.search.assistant.platform.pcp.p9329f.C123746bm;
import com.google.android.libraries.assistant.auto.tng.morris.framework.datasources.C14782b;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;

/* renamed from: com.google.android.libraries.assistant.auto.tng.morris.framework.datasources.impl.at */
/* compiled from: PG */
public final /* synthetic */ class C14805at implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C14806au f44602a;

    public /* synthetic */ C14805at(C14806au auVar) {
        this.f44602a = auVar;
    }

    public final C60870cx apply(Object obj) {
        C14806au auVar = this.f44602a;
        for (C123744bk bkVar : ((C123746bm) obj).f341820a) {
            auVar.f44603a.put(Integer.valueOf(bkVar.f341810e), bkVar);
        }
        return C60856cj.m92900i(C14782b.SUCCESS);
    }
}
