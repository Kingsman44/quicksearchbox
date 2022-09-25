package com.google.android.apps.gsa.assistant.settings.devices.p522c;

import android.content.Intent;
import android.net.Uri;
import android.view.View;
import com.google.android.apps.gsa.shared.logger.p7054d.C89885b;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.assistant.settings.devices.c.ar */
/* compiled from: PG */
public final /* synthetic */ class C9663ar implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ C9664as f33407a;

    /* renamed from: b */
    public final /* synthetic */ String f33408b;

    public /* synthetic */ C9663ar(C9664as asVar, String str) {
        this.f33407a = asVar;
        this.f33408b = str;
    }

    public final void onClick(View view) {
        C9664as asVar = this.f33407a;
        String str = this.f33408b;
        C58976aa aaVar = C58975e.f156826a;
        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(str));
        intent.addCategory("android.intent.category.BROWSABLE");
        intent.addFlags(C89885b.S3REQUEST_VALUE);
        asVar.startActivity(intent);
    }
}
