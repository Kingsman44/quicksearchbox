package com.google.android.apps.gsa.staticplugins.collectpin;

import android.content.Intent;
import android.net.Uri;
import android.view.View;
import com.google.assistant.p3897e.p3921j.aoq;

/* renamed from: com.google.android.apps.gsa.staticplugins.collectpin.b */
/* compiled from: PG */
public final /* synthetic */ class C98488b implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ CollectPinActivity f275026a;

    /* renamed from: b */
    public final /* synthetic */ aoq f275027b;

    public /* synthetic */ C98488b(CollectPinActivity collectPinActivity, aoq aoq) {
        this.f275026a = collectPinActivity;
        this.f275027b = aoq;
    }

    public final void onClick(View view) {
        CollectPinActivity collectPinActivity = this.f275026a;
        collectPinActivity.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(this.f275027b.f135517h)));
        collectPinActivity.mo91134b();
    }
}
