package com.google.android.apps.gsa.nga.engine.p6144ui.p6228f.p6229a;

import android.content.Intent;
import android.os.Bundle;
import com.google.android.apps.gsa.nga.shared.p6334b.C81015a;
import com.google.android.apps.gsa.nga.shared.p6334b.C81016b;
import com.google.android.apps.gsa.nga.shared.p6369ui.assistlayer.p6377e.C81561d;
import com.google.android.apps.gsa.nga.shared.p6369ui.assistlayer.p6377e.C81567j;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;

/* renamed from: com.google.android.apps.gsa.nga.engine.ui.f.a.a */
/* compiled from: PG */
public final class C78897a {

    /* renamed from: a */
    private static final C59071e f217112a = C59071e.m91332i("com.google.android.apps.gsa.nga.engine.ui.f.a.a");

    /* renamed from: b */
    private final C81016b f217113b;

    public C78897a(C81016b bVar) {
        this.f217113b = bVar;
    }

    /* renamed from: a */
    public final void mo73677a(C81561d dVar) {
        ((C59052c) ((C59052c) f217112a.mo56224b()).mo56372aa(5435)).mo56389s("requestAssistUiClient %s", dVar);
        C81016b bVar = this.f217113b;
        C81015a aVar = new C81015a();
        Intent intent = aVar.f222056a;
        Bundle bundle = new Bundle();
        bundle.putString("key_type", ((C81567j) dVar).f223131a.name());
        intent.putExtra("nga_assist_ui_client", bundle);
        bVar.mo74800a(aVar.mo74793a());
    }
}
