package com.google.android.apps.search.assistant.surfaces.voice.p9785ui.host.p9829b;

import android.view.Window;
import com.google.android.apps.search.assistant.surfaces.voice.shared.p9733ui.p9742f.C128629h;
import com.google.common.base.C58852bp;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59094n;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.ui.host.b.ad */
/* compiled from: PG */
final class C129574ad implements C58852bp {

    /* renamed from: a */
    final /* synthetic */ Window f355647a;

    public C129574ad(Window window) {
        this.f355647a = window;
    }

    /* renamed from: a */
    public final /* synthetic */ void mo40846a(Object obj) {
        C59052c cVar = (C59052c) ((C59052c) C129575ae.f355648a.mo56225c()).mo56382g((Throwable) obj);
        cVar.mo56379ah(new C59094n(38359));
        cVar.mo56386p("Failed receive new assistant state. Put keepsScreenOn to false");
        C128629h.m209926a(this.f355647a, false);
    }
}
