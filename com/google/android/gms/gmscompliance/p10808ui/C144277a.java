package com.google.android.gms.gmscompliance.p10808ui;

import android.content.Intent;
import android.view.View;

/* renamed from: com.google.android.gms.gmscompliance.ui.a */
/* compiled from: PG */
public final /* synthetic */ class C144277a implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ UncertifiedDeviceActivity f390724a;

    /* renamed from: b */
    public final /* synthetic */ Intent f390725b;

    public /* synthetic */ C144277a(UncertifiedDeviceActivity uncertifiedDeviceActivity, Intent intent) {
        this.f390724a = uncertifiedDeviceActivity;
        this.f390725b = intent;
    }

    public final void onClick(View view) {
        this.f390724a.startActivity(this.f390725b);
    }
}
