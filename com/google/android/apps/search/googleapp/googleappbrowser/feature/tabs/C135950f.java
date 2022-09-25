package com.google.android.apps.search.googleapp.googleappbrowser.feature.tabs;

import com.evernote.android.state.BuildConfig;
import com.google.android.apps.search.googleapp.p10117aa.C133125j;
import com.google.apps.tiktok.dataservice.local.C46852f;
import com.google.common.p4526f.C59052c;

/* renamed from: com.google.android.apps.search.googleapp.googleappbrowser.feature.tabs.f */
/* compiled from: PG */
final class C135950f implements C46852f {

    /* renamed from: a */
    final /* synthetic */ TabsFragmentPeer f370282a;

    public C135950f(TabsFragmentPeer tabsFragmentPeer) {
        this.f370282a = tabsFragmentPeer;
    }

    /* renamed from: h */
    public final void mo20960h(Throwable th) {
        ((C59052c) ((C59052c) ((C59052c) TabsFragmentPeer.f370252a.mo56225c()).mo56382g(th)).mo56372aa(40642)).mo56386p("Could not get the tab's query.");
    }

    /* renamed from: j */
    public final /* bridge */ /* synthetic */ void mo20961j(Object obj) {
        C133125j jVar = (C133125j) obj;
        this.f370282a.f370262k = jVar == null ? BuildConfig.FLAVOR : jVar.f362924d;
    }
}
