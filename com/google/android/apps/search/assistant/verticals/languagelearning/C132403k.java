package com.google.android.apps.search.assistant.verticals.languagelearning;

import android.content.ActivityNotFoundException;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.libraries.web.contrib.requestblock.C43714a;
import com.google.android.libraries.web.p3353c.C43367l;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import java.net.URISyntaxException;

/* renamed from: com.google.android.apps.search.assistant.verticals.languagelearning.k */
/* compiled from: PG */
public final class C132403k implements C43714a {

    /* renamed from: a */
    private static final C59071e f361395a = C59071e.m91332i("com.google.android.apps.search.assistant.verticals.languagelearning.k");

    /* renamed from: b */
    private final Context f361396b;

    /* renamed from: c */
    private final PackageManager f361397c;

    public C132403k(Context context, PackageManager packageManager) {
        this.f361396b = context;
        this.f361397c = packageManager;
    }

    /* renamed from: b */
    private static Intent m215219b(String str) {
        Intent parseUri = Intent.parseUri(str, 1);
        parseUri.addCategory("android.intent.category.BROWSABLE");
        parseUri.setComponent((ComponentName) null);
        Intent selector = parseUri.getSelector();
        if (selector != null) {
            selector.addCategory("android.intent.category.BROWSABLE");
            selector.setComponent((ComponentName) null);
            selector.setSelector((Intent) null);
        }
        return parseUri;
    }

    /* renamed from: c */
    private final boolean m215220c(String str) {
        Intent intent = new Intent("android.intent.action.VIEW", new Uri.Builder().scheme("market").authority("details").appendQueryParameter("id", str).build());
        intent.addCategory("android.intent.category.BROWSABLE");
        intent.setPackage("com.android.vending");
        intent.addFlags(268435456);
        try {
            this.f361396b.startActivity(intent);
            return true;
        } catch (ActivityNotFoundException | SecurityException e) {
            ((C59052c) ((C59052c) ((C59052c) f361395a.mo56225c()).mo56382g(e)).mo56372aa(39621)).mo56386p("Could not launch intent fallback to Play");
            return false;
        }
    }

    /* renamed from: a */
    public final void mo32340a(C43367l lVar) {
        String str = lVar.f113296b;
        try {
            Intent b = m215219b(str);
            if (!this.f361397c.queryIntentActivities(b, 0).isEmpty()) {
                b.removeExtra("browser_fallback_url");
                b.addFlags(268435456);
                this.f361396b.startActivity(b);
            } else if ("intent".equals(Uri.parse(str).getScheme())) {
                String stringExtra = b.getStringExtra("browser_fallback_url");
                if (!TextUtils.isEmpty(stringExtra)) {
                    Intent b2 = m215219b(stringExtra);
                    if (!this.f361397c.queryIntentActivities(b2, 0).isEmpty()) {
                        b2.addFlags(268435456);
                        this.f361396b.startActivity(b2);
                        return;
                    }
                }
                String str2 = b.getPackage();
                if (str2 != null) {
                    if (m215220c(str2)) {
                        return;
                    }
                }
                ((C59052c) ((C59052c) f361395a.mo56226d()).mo56372aa(39620)).mo56386p("Failed to handle external navigation intent");
            } else {
                ((C59052c) ((C59052c) f361395a.mo56226d()).mo56372aa(39618)).mo56386p("Failed to find a matching activity for the given Uri.");
            }
        } catch (URISyntaxException e) {
            ((C59052c) ((C59052c) ((C59052c) f361395a.mo56225c()).mo56382g(e)).mo56372aa(39619)).mo56386p("Failed to parse URI for external navigation intent");
        }
    }
}
