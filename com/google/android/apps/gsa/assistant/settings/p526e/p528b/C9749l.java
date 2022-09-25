package com.google.android.apps.gsa.assistant.settings.p526e.p528b;

import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.text.TextUtils;
import android.webkit.JavascriptInterface;
import com.google.android.apps.gsa.assistant.settings.p526e.C9751c;
import com.google.android.apps.gsa.assistant.settings.shared.p5792c.C73740a;
import com.google.android.apps.gsa.shared.p7037e.C89720f;
import com.google.android.apps.gsa.shared.p7195y.C91189au;
import com.google.android.apps.gsa.shared.util.p7159c.C90873ag;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.common.base.C58833ax;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import java.net.URISyntaxException;

/* renamed from: com.google.android.apps.gsa.assistant.settings.e.b.l */
/* compiled from: PG */
public final class C9749l implements C73740a {

    /* renamed from: c */
    private static final C59071e f33655c = C59071e.m91332i("com.google.android.apps.gsa.assistant.settings.e.b.l");

    /* renamed from: a */
    public final C89720f f33656a;

    /* renamed from: b */
    public final C9751c f33657b;

    /* renamed from: d */
    private final C22871g f33658d;

    /* renamed from: e */
    private final C91189au f33659e;

    public C9749l(C22871g gVar, C91189au auVar, C89720f fVar, C9751c cVar) {
        this.f33658d = gVar;
        this.f33659e = auVar;
        this.f33656a = fVar;
        this.f33657b = cVar;
    }

    /* renamed from: a */
    public final String mo18002a() {
        return "homescreenShortcutInterface";
    }

    /* renamed from: b */
    public final /* synthetic */ void mo18003b() {
    }

    @JavascriptInterface
    public void startActivityViaIntentUri(String str) {
        try {
            Intent parseUri = Intent.parseUri(str, 1);
            String stringExtra = parseUri.getStringExtra("android.intent.extra.shortcut.ICON");
            String stringExtra2 = parseUri.getStringExtra("android.intent.extra.shortcut.INTENT");
            String stringExtra3 = parseUri.getStringExtra("android.intent.extra.shortcut.NAME");
            if (TextUtils.isEmpty(stringExtra) || TextUtils.isEmpty(stringExtra2) || TextUtils.isEmpty(stringExtra3)) {
                ((C59052c) ((C59052c) f33655c.mo56225c()).mo56372aa(1652)).mo56359L("iconUrl: %s, shortcutIntentUri: %s, name: %s shouldn't be empty.", stringExtra, stringExtra2, stringExtra3);
                return;
            }
            try {
                Intent parseUri2 = Intent.parseUri(stringExtra2, 0);
                parseUri2.setPackage("com.google.android.googlequicksearchbox");
                new C90873ag(this.f33658d.mo28209i(this.f33659e.mo85424l(Uri.parse(stringExtra), C58833ax.m90834k(Bitmap.CompressFormat.PNG)), "Decode app icon", C9746i.f33650a), this.f33658d, "HomescreenShortcutJavascriptInterface.startActivityViaIntentUri", new C9747j(this, stringExtra3, parseUri2)).mo85223a(C9748k.f33654a);
            } catch (URISyntaxException e) {
                ((C59052c) ((C59052c) ((C59052c) f33655c.mo56225c()).mo56382g(e)).mo56372aa(1653)).mo56389s("Could not parse Intent %s", stringExtra2);
            }
        } catch (URISyntaxException e2) {
            ((C59052c) ((C59052c) ((C59052c) f33655c.mo56225c()).mo56382g(e2)).mo56372aa(1654)).mo56386p("Unsupported uri scheme");
        }
    }
}
