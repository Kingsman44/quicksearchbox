package com.google.android.apps.search.podcasts.library.download;

import android.view.View;
import com.google.android.apps.search.podcasts.p10600q.C140952k;
import com.google.apps.tiktok.dataservice.local.C46852f;
import com.google.apps.tiktok.dataservice.local.C46853g;

/* renamed from: com.google.android.apps.search.podcasts.library.download.i */
/* compiled from: PG */
final class C140578i implements C46852f {

    /* renamed from: a */
    final /* synthetic */ C140581l f381786a;

    public C140578i(C140581l lVar) {
        this.f381786a = lVar;
    }

    /* renamed from: h */
    public final /* synthetic */ void mo20960h(Throwable th) {
        throw new C46853g(th);
    }

    /* renamed from: j */
    public final /* bridge */ /* synthetic */ void mo20961j(Object obj) {
        this.f381786a.mo115756a((C140952k) obj);
        C140581l lVar = this.f381786a;
        View view = lVar.f381789a.getView();
        if (view != null) {
            lVar.mo115757b(view);
        }
    }
}
