package com.google.android.apps.search.podcasts.settings;

import android.net.Uri;
import android.view.View;
import android.widget.TextView;
import androidx.browser.p059a.C0963k;

/* renamed from: com.google.android.apps.search.podcasts.settings.af */
/* compiled from: PG */
final class C141063af implements View.OnClickListener {

    /* renamed from: a */
    final /* synthetic */ TextView f382978a;

    public C141063af(TextView textView) {
        this.f382978a = textView;
    }

    public final void onClick(View view) {
        C0963k kVar = new C0963k();
        kVar.mo3588g(true);
        kVar.mo3582a().mo3590a(this.f382978a.getContext(), Uri.parse("https://support.google.com/websearch/?p=manage_podcasts"));
    }
}
