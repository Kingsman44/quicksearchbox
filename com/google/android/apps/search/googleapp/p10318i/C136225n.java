package com.google.android.apps.search.googleapp.p10318i;

import android.content.ComponentName;
import android.content.Intent;
import android.net.Uri;
import com.google.apps.tiktok.nav.C47493d;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.p4526f.p4527a.C58974d;

/* renamed from: com.google.android.apps.search.googleapp.i.n */
/* compiled from: PG */
public final class C136225n {

    /* renamed from: a */
    private static final C58974d f371001a = C58974d.m91136j();

    /* renamed from: b */
    private final C47493d f371002b;

    public C136225n(C47493d dVar) {
        this.f371002b = dVar;
    }

    /* renamed from: a */
    public final void mo112851a() {
        Intent putExtra = new Intent("android.intent.action.VIEW", new Uri.Builder().scheme("file").encodedAuthority("/android_asset").appendPath("puffygame").appendPath("puffy.html").build()).putExtra("WEBVIEW_ALLOW_FILE_URL_ACCESS", true).putExtra("WEBVIEW_DISABLE_HARDWARE_ACCELERATION", false).putExtra("full_screen", true).putExtra("hide_status_bar", true).putExtra("screen_orientation", 1);
        Uri.Builder appendPath = new Uri.Builder().scheme("dynact").authority("static").appendPath("inappwebpage").appendPath("inappwebpage");
        Uri data = putExtra.getData();
        data.getClass();
        Uri build = appendPath.appendQueryParameter("data", data.toString()).build();
        String action = putExtra.getAction();
        action.getClass();
        try {
            this.f371002b.mo51345a(new Intent(action, build).addFlags(putExtra.getFlags()).setComponent(new ComponentName("com.google.android.googlequicksearchbox", "com.google.android.apps.gsa.velour.dynamichosts.NoOrientationConfigVelvetDynamicHostActivity")).putExtra("com.google.android.libraries.velour.INNER_INTENT", putExtra));
        } catch (SecurityException e) {
            ((C58970a) ((C58970a) ((C58970a) f371001a.mo56225c()).mo56382g(e)).mo56372aa(40576)).mo56386p("Puffy can only be started from outside the Velvet APK if velvet_dev is installed.");
        }
    }
}
