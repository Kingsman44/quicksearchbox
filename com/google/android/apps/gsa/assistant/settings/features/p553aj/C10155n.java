package com.google.android.apps.gsa.assistant.settings.features.p553aj;

import android.content.Intent;
import android.net.Uri;
import android.view.View;
import com.google.android.apps.gsa.search.core.p6513aj.C84556p;
import com.google.android.apps.gsa.shared.logger.p7054d.C89885b;
import com.google.android.googlequicksearchbox.R;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.assistant.settings.features.aj.n */
/* compiled from: PG */
public final /* synthetic */ class C10155n implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ C10166y f34537a;

    /* renamed from: b */
    public final /* synthetic */ String f34538b;

    /* renamed from: c */
    public final /* synthetic */ String f34539c;

    public /* synthetic */ C10155n(C10166y yVar, String str, String str2) {
        this.f34537a = yVar;
        this.f34538b = str;
        this.f34539c = str2;
    }

    public final void onClick(View view) {
        C10166y yVar = this.f34537a;
        String str = this.f34538b;
        String str2 = this.f34539c;
        C58976aa aaVar = C58975e.f156826a;
        Intent a = C84556p.m135246a(R.string.assistant_ui_learn_more_link, Uri.parse(str2), false, str, "velvet");
        a.addFlags(C89885b.S3REQUEST_VALUE);
        yVar.startActivity(a);
    }
}
