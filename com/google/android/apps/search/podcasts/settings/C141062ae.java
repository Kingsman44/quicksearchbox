package com.google.android.apps.search.podcasts.settings;

import android.net.Uri;
import android.view.View;
import android.widget.TextView;
import androidx.browser.p059a.C0963k;

/* renamed from: com.google.android.apps.search.podcasts.settings.ae */
/* compiled from: PG */
final class C141062ae implements View.OnClickListener {

    /* renamed from: a */
    final /* synthetic */ TextView f382977a;

    public C141062ae(TextView textView) {
        this.f382977a = textView;
    }

    public final void onClick(View view) {
        C0963k kVar = new C0963k();
        kVar.mo3588g(true);
        kVar.mo3582a().mo3590a(this.f382977a.getContext(), Uri.parse("https://myactivity.google.com/page?page=podcasts_preferences"));
    }
}
