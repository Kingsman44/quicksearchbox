package com.google.android.apps.search.googleapp.customtabs.features.buttons.share;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.content.IntentSender;
import android.net.Uri;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.search.p2871b.C37215b;
import com.google.android.libraries.search.p2871b.p2872a.p2876d.C37182a;
import com.google.apps.tiktok.dataservice.local.C46855i;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;

/* renamed from: com.google.android.apps.search.googleapp.customtabs.features.buttons.share.o */
/* compiled from: PG */
public final class C133865o {

    /* renamed from: a */
    public static final C59071e f364599a = C59071e.m91332i("com.google.android.apps.search.googleapp.customtabs.features.buttons.share.o");

    /* renamed from: b */
    public final Activity f364600b;

    /* renamed from: c */
    private final C37215b f364601c;

    public C133865o(Activity activity, C37215b bVar, C133867q qVar, C46855i iVar) {
        this.f364600b = activity;
        this.f364601c = bVar;
        iVar.mo50829i(R.id.googleapp_share_broadcast_callback, new C133866p(qVar), new C133863m(this), new C133864n(this));
    }

    /* renamed from: a */
    public final void mo111435a(Uri uri, String str, IntentSender intentSender) {
        Intent intent = new Intent("android.intent.action.SEND");
        intent.addFlags(524288);
        if (str != null) {
            intent.putExtra("android.intent.extra.SUBJECT", str);
        }
        intent.putExtra("android.intent.extra.TEXT", uri.toString());
        intent.setType("text/plain");
        Intent createChooser = Intent.createChooser(intent, this.f364600b.getResources().getString(R.string.ga_custom_tabs_share_title), intentSender);
        this.f364601c.mo19974a(C37182a.f97743B);
        try {
            this.f364600b.startActivity(createChooser);
        } catch (ActivityNotFoundException e) {
            ((C59052c) ((C59052c) ((C59052c) f364599a.mo56226d()).mo56382g(e)).mo56372aa(40161)).mo56386p("Unable to start share dialog");
        }
    }
}
