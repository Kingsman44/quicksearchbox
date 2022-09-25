package com.google.android.apps.search.googleapp.customtabs.features.buttons.copylink;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.Intent;
import android.databinding.C0118a;
import android.net.Uri;
import android.widget.Toast;
import com.google.android.apps.search.googleapp.amp.p10138a.C133456e;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.p1623at.p1632e.C19559g;
import com.google.android.libraries.search.integrations.p3018c.C38505d;
import com.google.apps.tiktok.p3643g.C47102r;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47633f;
import com.google.common.base.C58837ba;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60866ct;
import com.google.common.util.concurrent.C60870cx;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.search.googleapp.customtabs.features.buttons.copylink.a */
/* compiled from: PG */
public final class C133825a implements C47102r {

    /* renamed from: a */
    private static final C59071e f364507a = C59071e.m91332i("com.google.android.apps.search.googleapp.customtabs.features.buttons.copylink.a");

    /* renamed from: b */
    private final Context f364508b;

    /* renamed from: c */
    private final ClipboardManager f364509c;

    public C133825a(Context context, ClipboardManager clipboardManager) {
        this.f364508b = context;
        this.f364509c = clipboardManager;
    }

    /* renamed from: b */
    public final C60870cx mo20087b(Intent intent, int i) {
        C19559g.m37304c();
        Uri data = intent.getData();
        if (data == null) {
            C0118a.m108p(f364507a.mo56225c(), "The URL to copy was not provided", 40142, C38505d.f101864b, 183045182);
            return C47633f.m84733g(C60866ct.f164955a);
        }
        Optional b = C133456e.m216615b(data);
        if (b.isPresent()) {
            data = (Uri) b.get();
        }
        this.f364509c.setPrimaryClip(ClipData.newRawUri(C58837ba.m90858g(intent.getStringExtra("android.intent.extra.SUBJECT")), data));
        Toast.makeText(this.f364508b, this.f364508b.getString(R.string.googleapp_custom_tabs_copy_link_toast_text), 1).show();
        return C47633f.m84733g(C60866ct.f164955a);
    }
}
