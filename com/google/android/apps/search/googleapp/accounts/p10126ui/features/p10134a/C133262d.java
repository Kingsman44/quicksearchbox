package com.google.android.apps.search.googleapp.accounts.p10126ui.features.p10134a;

import android.content.Intent;
import android.text.Html;
import android.widget.TextView;
import com.google.android.apps.search.googleapp.accounts.p10126ui.p10128b.C133231n;
import com.google.android.apps.search.googleapp.urlhandler.C139795f;
import com.google.android.material.bottomsheet.C44565p;
import com.google.apps.tiktok.dataservice.local.C46855i;
import com.google.apps.tiktok.tracing.contrib.p3708i.p3712c.C47709i;
import com.google.common.p4526f.C59071e;

/* renamed from: com.google.android.apps.search.googleapp.accounts.ui.features.a.d */
/* compiled from: PG */
public final class C133262d {

    /* renamed from: a */
    public static final C59071e f363201a = C59071e.m91332i("com.google.android.apps.search.googleapp.accounts.ui.features.a.d");

    /* renamed from: b */
    public final C133260b f363202b;

    /* renamed from: c */
    public final C133231n f363203c;

    /* renamed from: d */
    public final C139795f f363204d;

    /* renamed from: e */
    public final C46855i f363205e;

    /* renamed from: f */
    public C44565p f363206f;

    /* renamed from: g */
    private final String f363207g;

    public C133262d(C133260b bVar, String str, C133231n nVar, C139795f fVar, C46855i iVar) {
        this.f363202b = bVar;
        this.f363207g = str;
        this.f363203c = nVar;
        this.f363205e = iVar;
        this.f363204d = fVar;
    }

    /* renamed from: a */
    public final void mo111055a(TextView textView, int i) {
        if (textView != null) {
            textView.setText(Html.fromHtml(this.f363202b.getString(i)));
        }
    }

    /* renamed from: b */
    public final void mo111056b() {
        C47709i.m84861a(this.f363202b, new Intent("org.chromium.chrome.browser.incognito.OPEN_PRIVATE_TAB").setPackage(this.f363207g));
        this.f363202b.dismiss();
    }
}
