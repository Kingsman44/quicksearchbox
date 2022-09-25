package com.google.android.apps.search.assistant.surfaces.voice.p9785ui.common.renderer.slicecard.appactions;

import android.content.Intent;
import android.content.pm.ProviderInfo;
import android.view.View;
import com.google.apps.tiktok.tracing.contrib.p3708i.p3712c.C47709i;
import com.google.common.p4526f.C59052c;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.ui.common.renderer.slicecard.appactions.a */
/* compiled from: PG */
public final /* synthetic */ class C129272a implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ C129273b f355069a;

    /* renamed from: b */
    public final /* synthetic */ ProviderInfo f355070b;

    public /* synthetic */ C129272a(C129273b bVar, ProviderInfo providerInfo) {
        this.f355069a = bVar;
        this.f355070b = providerInfo;
    }

    public final void onClick(View view) {
        C129273b bVar = this.f355069a;
        ProviderInfo providerInfo = this.f355070b;
        Intent launchIntentForPackage = bVar.f355073c.getLaunchIntentForPackage(providerInfo.applicationInfo.packageName);
        if (launchIntentForPackage != null) {
            C47709i.m84861a(bVar.f355072b, launchIntentForPackage);
        } else {
            ((C59052c) ((C59052c) C129273b.f355071a.mo56226d()).mo56372aa(38224)).mo56389s("Failed to resolve intent for launching %s", providerInfo.applicationInfo.packageName);
        }
    }
}
