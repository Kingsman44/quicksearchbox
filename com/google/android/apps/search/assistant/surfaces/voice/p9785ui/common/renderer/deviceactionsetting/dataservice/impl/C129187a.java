package com.google.android.apps.search.assistant.surfaces.voice.p9785ui.common.renderer.deviceactionsetting.dataservice.impl;

import android.provider.Settings;
import com.google.apps.tiktok.concurrent.C46463o;
import com.google.apps.tiktok.concurrent.C46464p;
import com.google.common.util.concurrent.C60817ay;
import com.google.common.util.concurrent.C60856cj;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.ui.common.renderer.deviceactionsetting.dataservice.impl.a */
/* compiled from: PG */
public final /* synthetic */ class C129187a implements C46464p {

    /* renamed from: a */
    public final /* synthetic */ BrightnessDataServiceImpl f354879a;

    public /* synthetic */ C129187a(BrightnessDataServiceImpl brightnessDataServiceImpl) {
        this.f354879a = brightnessDataServiceImpl;
    }

    /* renamed from: a */
    public final C46463o mo18057a() {
        return new C46463o(new C60817ay(C60856cj.m92900i(Integer.valueOf(Settings.System.getInt(this.f354879a.f354870b.getContentResolver(), "screen_brightness", 0)))));
    }
}
