package com.google.android.apps.gsa.assistant.settings.features.p553aj;

import android.content.Intent;
import android.net.Uri;
import android.view.View;
import com.google.android.apps.gsa.shared.logger.p7054d.C89885b;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.assistant.settings.features.aj.i */
/* compiled from: PG */
public final /* synthetic */ class C10150i implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ C10166y f34531a;

    /* renamed from: b */
    public final /* synthetic */ String f34532b;

    public /* synthetic */ C10150i(C10166y yVar, String str) {
        this.f34531a = yVar;
        this.f34532b = str;
    }

    public final void onClick(View view) {
        C10166y yVar = this.f34531a;
        String str = this.f34532b;
        C58976aa aaVar = C58975e.f156826a;
        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(str));
        intent.addCategory("android.intent.category.BROWSABLE");
        intent.addFlags(C89885b.S3REQUEST_VALUE);
        yVar.startActivity(intent);
    }
}
