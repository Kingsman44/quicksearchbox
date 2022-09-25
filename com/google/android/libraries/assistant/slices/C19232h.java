package com.google.android.libraries.assistant.slices;

import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.view.View;

/* renamed from: com.google.android.libraries.assistant.slices.h */
/* compiled from: PG */
final class C19232h implements View.OnClickListener {

    /* renamed from: a */
    final /* synthetic */ PackageManager f53840a;

    /* renamed from: b */
    final /* synthetic */ ProviderInfo f53841b;

    /* renamed from: c */
    final /* synthetic */ AssistantSliceView f53842c;

    public C19232h(AssistantSliceView assistantSliceView, PackageManager packageManager, ProviderInfo providerInfo) {
        this.f53842c = assistantSliceView;
        this.f53840a = packageManager;
        this.f53841b = providerInfo;
    }

    public final void onClick(View view) {
        Intent launchIntentForPackage = this.f53840a.getLaunchIntentForPackage(this.f53841b.applicationInfo.packageName);
        launchIntentForPackage.getClass();
        this.f53842c.f53826p.startActivity(launchIntentForPackage);
    }
}
