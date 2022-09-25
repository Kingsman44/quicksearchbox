package com.google.android.apps.gsa.staticplugins.searchwidget;

import android.content.Intent;
import com.google.android.apps.gsa.p8883x.C118826c;
import com.google.android.apps.gsa.shared.util.p7159c.C90882ap;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.staticplugins.searchwidget.bq */
/* compiled from: PG */
final class C117249bq extends C90882ap {

    /* renamed from: a */
    final /* synthetic */ Intent f325487a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C117249bq(Intent intent) {
        super("WidgetIntentDone", 0);
        this.f325487a = intent;
    }

    public final /* bridge */ /* synthetic */ Object apply(Object obj) {
        Void voidR = (Void) obj;
        C59052c cVar = (C59052c) C117251bs.f325490a.mo56224b();
        cVar.mo56378ag(C58975e.f156826a, "SearchWidgetFlow");
        ((C59052c) cVar.mo56372aa(32755)).mo56389s("SearchWidgetWorker:handleIntent(%s) done", this.f325487a);
        return C118826c.f331422a;
    }
}
