package com.google.android.apps.search.podcasts.p10565f;

import android.content.Context;
import android.net.Uri;
import android.view.View;
import androidx.browser.p059a.C0963k;
import com.google.apps.tiktok.p3674l.p3679c.C47388b;
import com.google.apps.tiktok.p3674l.p3679c.C47391d;
import com.google.apps.tiktok.p3674l.p3679c.C47392e;

/* renamed from: com.google.android.apps.search.podcasts.f.j */
/* compiled from: PG */
public final class C140314j implements C47391d {

    /* renamed from: a */
    final /* synthetic */ View f381172a;

    public C140314j(View view) {
        this.f381172a = view;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ C47392e mo18069a(C47388b bVar) {
        C140290ak akVar = (C140290ak) bVar;
        Context context = this.f381172a.getContext();
        if (context != null) {
            C0963k kVar = new C0963k();
            kVar.mo3588g(true);
            kVar.mo3582a().mo3590a(context, Uri.parse(akVar.f381142a));
        }
        return C47392e.f123115a;
    }
}
