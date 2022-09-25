package com.google.android.apps.search.googleapp.stampviewer.webview.p10504e;

import com.google.android.libraries.web.contrib.errorpage.C43531s;
import com.google.android.libraries.web.contrib.errorpage.p3373a.C43512b;
import com.google.apps.tiktok.dataservice.local.C46852f;
import com.google.apps.tiktok.dataservice.local.C46853g;
import com.google.common.base.C58838bb;

/* renamed from: com.google.android.apps.search.googleapp.stampviewer.webview.e.h */
/* compiled from: PG */
public final /* synthetic */ class C139557h implements C46852f {

    /* renamed from: a */
    public final /* synthetic */ C139558i f379413a;

    public /* synthetic */ C139557h(C139558i iVar) {
        this.f379413a = iVar;
    }

    /* renamed from: h */
    public final /* synthetic */ void mo20960h(Throwable th) {
        throw new C46853g(th);
    }

    /* renamed from: j */
    public final void mo20961j(Object obj) {
        C139558i iVar = this.f379413a;
        C139551b bVar = (C139551b) obj;
        if (!bVar.f379401d || bVar.f379402e) {
            C43531s.C43532a aVar = iVar.f379415b.f113667g;
            C58838bb.m90866a(aVar, "#showCustomClientError cannot be called before #register.");
            aVar.mo46593d((C43512b) null);
            return;
        }
        C43531s.C43532a aVar2 = iVar.f379415b.f113667g;
        C58838bb.m90866a(aVar2, "#showCustomClientError cannot be called before #register.");
        aVar2.mo46593d(C43512b.f113627a);
    }
}
