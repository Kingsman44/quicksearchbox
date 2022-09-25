package com.google.android.apps.search.googleapp.search.settings.p10430f;

import com.google.apps.tiktok.account.AccountId;
import com.google.apps.tiktok.account.data.C46175b;
import com.google.apps.tiktok.dataservice.C46689ag;
import com.google.apps.tiktok.dataservice.C46719bc;
import com.google.apps.tiktok.dataservice.C46723bg;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47633f;
import com.google.common.util.concurrent.C60826bg;

/* renamed from: com.google.android.apps.search.googleapp.search.settings.f.d */
/* compiled from: PG */
public final class C137632d {

    /* renamed from: a */
    private final C46175b f374369a;

    /* renamed from: b */
    private final AccountId f374370b;

    /* renamed from: c */
    private final C46723bg f374371c;

    public C137632d(AccountId accountId, C46723bg bgVar, C46175b bVar) {
        this.f374369a = bVar;
        this.f374370b = accountId;
        this.f374371c = bgVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final C46689ag mo113869a() {
        return new C46719bc(this.f374371c, new C137631c(C47633f.m84733g(this.f374369a.mo50246c(this.f374370b)).mo51515h(C137630b.f374367a, C60826bg.f164896a)), "SearchCustomizationSetting");
    }
}
