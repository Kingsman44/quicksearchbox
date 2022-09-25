package com.google.android.apps.search.podcasts.settings;

import android.net.Uri;
import android.view.View;
import android.widget.TextView;
import androidx.browser.p059a.C0963k;

/* renamed from: com.google.android.apps.search.podcasts.settings.y */
/* compiled from: PG */
final class C141105y implements View.OnClickListener {

    /* renamed from: a */
    final /* synthetic */ TextView f383094a;

    public C141105y(TextView textView) {
        this.f383094a = textView;
    }

    public final void onClick(View view) {
        C0963k kVar = new C0963k();
        kVar.mo3588g(true);
        kVar.mo3582a().mo3590a(this.f383094a.getContext(), Uri.parse("https://support.google.com/websearch/?p=gp_filtered"));
    }
}
