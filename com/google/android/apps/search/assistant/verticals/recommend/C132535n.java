package com.google.android.apps.search.assistant.verticals.recommend;

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

/* renamed from: com.google.android.apps.search.assistant.verticals.recommend.n */
/* compiled from: PG */
public final class C132535n implements C43714a {

    /* renamed from: a */
    private static final C59071e f361705a = C59071e.m91332i("com.google.android.apps.search.assistant.verticals.recommend.n");

    /* renamed from: b */
    private final Context f361706b;

    /* renamed from: c */
    private final PackageManager f361707c;

    public C132535n(Context context, PackageManager packageManager) {
        this.f361706b = context;
        this.f361707c = packageManager;
    }

    /* renamed from: b */
    private static Intent m215458b(String str) {
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
    private final boolean m215459c(String str) {
        Intent intent = new Intent("android.intent.action.VIEW", new Uri.Builder().scheme("market").authority("details").appendQueryParameter("id", str).build());
        intent.addCategory("android.intent.category.BROWSABLE");
        intent.setPackage("com.android.vending");
        intent.addFlags(268435456);
        try {
            this.f361706b.startActivity(intent);
            return true;
        } catch (ActivityNotFoundException | SecurityException e) {
            ((C59052c) ((C59052c) ((C59052c) f361705a.mo56225c()).mo56382g(e)).mo56372aa(39681)).mo56386p("Could not launch intent fallback to Play");
            return false;
        }
    }

    /* renamed from: a */
    public final void mo32340a(C43367l lVar) {
        String str = lVar.f113296b;
        try {
            Intent b = m215458b(str);
            if (!this.f361707c.queryIntentActivities(b, 0).isEmpty()) {
                b.removeExtra("browser_fallback_url");
                b.addFlags(268435456);
                this.f361706b.startActivity(b);
            } else if ("intent".equals(Uri.parse(str).getScheme())) {
                String stringExtra = b.getStringExtra("browser_fallback_url");
                if (!TextUtils.isEmpty(stringExtra)) {
                    Intent b2 = m215458b(stringExtra);
                    if (!this.f361707c.queryIntentActivities(b2, 0).isEmpty()) {
                        b2.addFlags(268435456);
                        this.f361706b.startActivity(b2);
                        return;
                    }
                }
                String str2 = b.getPackage();
                if (str2 != null) {
                    if (m215459c(str2)) {
                        return;
                    }
                }
                ((C59052c) ((C59052c) f361705a.mo56226d()).mo56372aa(39680)).mo56386p("Failed to handle external navigation intent");
            } else {
                ((C59052c) ((C59052c) f361705a.mo56226d()).mo56372aa(39678)).mo56386p("Failed to find a matching activity for the given Uri.");
            }
        } catch (URISyntaxException e) {
            ((C59052c) ((C59052c) ((C59052c) f361705a.mo56225c()).mo56382g(e)).mo56372aa(39679)).mo56386p("Failed to parse URI for external navigation intent");
        }
    }
}
