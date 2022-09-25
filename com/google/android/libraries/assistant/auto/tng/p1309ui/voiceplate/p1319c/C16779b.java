package com.google.android.libraries.assistant.auto.tng.p1309ui.voiceplate.p1319c;

import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import com.google.android.libraries.search.p2871b.p2872a.p2875c.C37179a;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.util.concurrent.C60856cj;

/* renamed from: com.google.android.libraries.assistant.auto.tng.ui.voiceplate.c.b */
/* compiled from: PG */
final class C16779b implements ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: a */
    final /* synthetic */ ViewGroup f49092a;

    /* renamed from: b */
    final /* synthetic */ C16781d f49093b;

    public C16779b(C16781d dVar, ViewGroup viewGroup) {
        this.f49093b = dVar;
        this.f49092a = viewGroup;
    }

    public final void onGlobalLayout() {
        this.f49093b.f49097b.mo19974a(C37179a.f97409H);
        this.f49092a.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        C16781d dVar = this.f49093b;
        C16778a aVar = new C16778a(this);
        dVar.f49098c = C60856cj.m92903l(C47810es.m84977q(aVar), dVar.f49096a);
    }
}
