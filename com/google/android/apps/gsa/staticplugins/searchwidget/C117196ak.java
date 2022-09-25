package com.google.android.apps.gsa.staticplugins.searchwidget;

import com.google.android.apps.gsa.shared.p6995aq.C89260c;
import com.google.android.apps.gsa.shared.p6995aq.C89261d;
import com.google.common.base.C58817ah;

/* renamed from: com.google.android.apps.gsa.staticplugins.searchwidget.ak */
/* compiled from: PG */
public final /* synthetic */ class C117196ak implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ C117204as f325334a;

    public /* synthetic */ C117196ak(C117204as asVar) {
        this.f325334a = asVar;
    }

    public final Object apply(Object obj) {
        C117204as asVar = this.f325334a;
        C89260c cVar = (C89260c) ((C89261d) obj).toBuilder();
        long b = asVar.f325356j.mo26870b();
        cVar.copyOnWrite();
        C89261d dVar = (C89261d) cVar.instance;
        dVar.f242035a |= 1;
        dVar.f242036b = b;
        return (C89261d) cVar.build();
    }
}
