package com.google.android.apps.gsa.assistant.settings.devices.p522c;

import android.content.Intent;
import android.net.Uri;
import android.view.View;
import com.google.android.apps.gsa.search.core.p6513aj.C84556p;
import com.google.android.apps.gsa.shared.logger.p7054d.C89885b;
import com.google.android.googlequicksearchbox.R;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.assistant.settings.devices.c.ai */
/* compiled from: PG */
public final /* synthetic */ class C9654ai implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ C9664as f33394a;

    /* renamed from: b */
    public final /* synthetic */ String f33395b;

    /* renamed from: c */
    public final /* synthetic */ String f33396c;

    public /* synthetic */ C9654ai(C9664as asVar, String str, String str2) {
        this.f33394a = asVar;
        this.f33395b = str;
        this.f33396c = str2;
    }

    public final void onClick(View view) {
        C9664as asVar = this.f33394a;
        String str = this.f33395b;
        String str2 = this.f33396c;
        C58976aa aaVar = C58975e.f156826a;
        Intent a = C84556p.m135246a(R.string.assistant_ui_learn_more_link, Uri.parse(str2), false, str, "velvet");
        a.addFlags(C89885b.S3REQUEST_VALUE);
        asVar.startActivity(a);
    }
}
