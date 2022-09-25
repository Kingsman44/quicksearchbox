package com.google.android.apps.gsa.nga.engine.p6144ui.answer;

import com.google.android.libraries.animation.C147768a;
import com.google.android.libraries.gsa.logoview.LogoView;
import p3186j$.time.Duration;

/* renamed from: com.google.android.apps.gsa.nga.engine.ui.answer.ax */
/* compiled from: PG */
public final /* synthetic */ class C78051ax implements C147768a {

    /* renamed from: a */
    public final /* synthetic */ LogoView f215007a;

    public /* synthetic */ C78051ax(LogoView logoView) {
        this.f215007a = logoView;
    }

    /* renamed from: a */
    public final void mo42047a(Object obj) {
        LogoView logoView = this.f215007a;
        Float f = (Float) obj;
        Duration duration = MicHandler.f214923a;
        logoView.setAlpha(f.floatValue());
        logoView.setVisibility(f.floatValue() == 0.0f ? 8 : 0);
    }
}
