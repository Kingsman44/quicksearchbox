package com.google.android.apps.search.assistant.surfaces.voice.p9785ui.common.renderer.deviceactionsetting.dataservice.impl;

import com.google.android.apps.search.assistant.surfaces.voice.p9785ui.common.renderer.deviceactionsetting.dataservice.C129183a;
import com.google.apps.tiktok.dataservice.C46783d;
import com.google.apps.tiktok.tracing.C47770dh;
import com.google.common.util.concurrent.C60866ct;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.ui.common.renderer.deviceactionsetting.dataservice.impl.b */
/* compiled from: PG */
final class C129188b extends C46783d {

    /* renamed from: a */
    final /* synthetic */ BrightnessDataServiceImpl f354880a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C129188b(BrightnessDataServiceImpl brightnessDataServiceImpl, C47770dh dhVar, Executor executor) {
        super(dhVar, "BrightnessDataServiceAsyncContentObserver", executor);
        this.f354880a = brightnessDataServiceImpl;
    }

    /* renamed from: a */
    public final void mo21781a(boolean z) {
        this.f354880a.f354872d.mo50787a(C60866ct.f164955a, C129183a.f354867a);
    }
}
