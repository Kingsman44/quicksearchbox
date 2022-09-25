package com.google.android.gms.gmscompliance.p10808ui;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

/* renamed from: com.google.android.gms.gmscompliance.ui.b */
/* compiled from: PG */
public final /* synthetic */ class C144278b implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ UncertifiedDeviceActivity f390726a;

    /* renamed from: b */
    public final /* synthetic */ Intent f390727b;

    /* renamed from: c */
    public final /* synthetic */ Bundle f390728c;

    public /* synthetic */ C144278b(UncertifiedDeviceActivity uncertifiedDeviceActivity, Intent intent, Bundle bundle) {
        this.f390726a = uncertifiedDeviceActivity;
        this.f390727b = intent;
        this.f390728c = bundle;
    }

    public final void onClick(View view) {
        this.f390726a.startActivity(this.f390727b, this.f390728c);
    }
}
