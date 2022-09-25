package com.google.android.apps.gsa.nga.engine.p6144ui.answer;

import com.google.android.libraries.animation.C147768a;
import com.google.android.libraries.gsa.logoview.LogoView;
import p3186j$.time.Duration;

/* renamed from: com.google.android.apps.gsa.nga.engine.ui.answer.ay */
/* compiled from: PG */
public final /* synthetic */ class C78052ay implements C147768a {

    /* renamed from: a */
    public final /* synthetic */ LogoView f215008a;

    public /* synthetic */ C78052ay(LogoView logoView) {
        this.f215008a = logoView;
    }

    /* renamed from: a */
    public final void mo42047a(Object obj) {
        LogoView logoView = this.f215008a;
        Float f = (Float) obj;
        Duration duration = MicHandler.f214923a;
        logoView.setScaleX(f.floatValue());
        logoView.setScaleY(f.floatValue());
    }
}
