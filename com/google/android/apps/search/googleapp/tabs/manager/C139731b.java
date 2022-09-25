package com.google.android.apps.search.googleapp.tabs.manager;

import android.view.View;
import com.google.android.apps.search.googleapp.tabs.manager.p10524a.C139715b;
import com.google.android.libraries.logging.p2185ve.C28442l;
import com.google.android.libraries.logging.p2185ve.C28485y;
import com.google.apps.tiktok.p3674l.p3679c.C47393f;

/* renamed from: com.google.android.apps.search.googleapp.tabs.manager.b */
/* compiled from: PG */
public final /* synthetic */ class C139731b implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ C139737d f379816a;

    /* renamed from: b */
    public final /* synthetic */ C139713a f379817b;

    public /* synthetic */ C139731b(C139737d dVar, C139713a aVar) {
        this.f379816a = dVar;
        this.f379817b = aVar;
    }

    public final void onClick(View view) {
        C139737d dVar = this.f379816a;
        C139713a aVar = this.f379817b;
        dVar.f379831f.mo33853c(C28442l.m53142h().mo33894a(), C28485y.m53234a(view));
        C47393f.m84237h(new C139715b(aVar.f379754a), view);
    }
}
