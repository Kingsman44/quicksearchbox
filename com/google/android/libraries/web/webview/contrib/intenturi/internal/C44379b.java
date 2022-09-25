package com.google.android.libraries.web.webview.contrib.intenturi.internal;

import android.content.ComponentName;
import android.content.Intent;
import android.net.Uri;
import com.google.android.libraries.web.base.C43255f;
import com.google.android.libraries.web.base.C43257h;
import com.google.android.libraries.web.base.C43262m;
import com.google.android.libraries.web.contrib.requestblock.C43714a;
import com.google.android.libraries.web.p3353c.C43367l;
import com.google.android.libraries.web.webview.contrib.intenturi.p3477a.C44375a;
import com.google.android.libraries.web.webview.contrib.intenturi.p3477a.C44376b;
import com.google.android.libraries.web.webview.contrib.intenturi.p3477a.C44377c;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59094n;
import java.net.URISyntaxException;
import p5462h.p5463a.C69496am;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.libraries.web.webview.contrib.intenturi.internal.b */
/* compiled from: PG */
final /* synthetic */ class C44379b implements C43714a {

    /* renamed from: a */
    final /* synthetic */ IntentUriWebFragmentObserver f115385a;

    public C44379b(IntentUriWebFragmentObserver intentUriWebFragmentObserver) {
        this.f115385a = intentUriWebFragmentObserver;
    }

    /* renamed from: a */
    public final void mo32340a(C43367l lVar) {
        C44376b bVar;
        IntentUriWebFragmentObserver intentUriWebFragmentObserver = this.f115385a;
        C44377c cVar = intentUriWebFragmentObserver.f115381c;
        Uri parse = Uri.parse(lVar.f113296b);
        C69664n.m101060f(parse, "parse(request.currentUrl)");
        C69496am amVar = C69496am.f185918a;
        C69664n.m101061g(parse, "uri");
        if (C44375a.m78360a(parse)) {
            Intent parseUri = Intent.parseUri(parse.toString(), 1);
            parseUri.addCategory("android.intent.category.BROWSABLE");
            parseUri.setComponent((ComponentName) null);
            Intent selector = parseUri.getSelector();
            if (selector != null) {
                selector.addCategory("android.intent.category.BROWSABLE");
                selector.setComponent((ComponentName) null);
                selector.setSelector((Intent) null);
            }
            C69664n.m101060f(parseUri, "parseUri(uri.toString(),…ctor = null\n      }\n    }");
            if (cVar.mo47271a(parseUri, amVar)) {
                bVar = C44376b.ORIGINAL_INTENT;
                C69664n.m101061g(bVar, "resolution");
            } else {
                String stringExtra = parseUri.getStringExtra("browser_fallback_url");
                if (stringExtra != null) {
                    Intent addCategory = new Intent("android.intent.action.VIEW", Uri.parse(stringExtra)).addCategory("android.intent.category.BROWSABLE");
                    C69664n.m101060f(addCategory, "Intent(Intent.ACTION_VIE…ntent.CATEGORY_BROWSABLE)");
                    if (cVar.mo47271a(addCategory, C69496am.f185918a)) {
                        bVar = C44376b.FALLBACK_URL;
                        C69664n.m101061g(bVar, "resolution");
                        parseUri = addCategory;
                    }
                }
                String str = parseUri.getPackage();
                if (str == null) {
                    parseUri = null;
                } else {
                    String stringExtra2 = parseUri.getStringExtra("market_referrer");
                    String packageName = cVar.f115377a.getPackageName();
                    C69664n.m101060f(packageName, "applicationContext.packageName");
                    if (stringExtra2 == null || stringExtra2.length() == 0) {
                        stringExtra2 = packageName;
                    }
                    Intent intent = new Intent("android.intent.action.VIEW", new Uri.Builder().scheme("market").authority("details").appendQueryParameter("id", str).appendQueryParameter("referrer", Uri.decode(stringExtra2)).build());
                    intent.addCategory("android.intent.category.BROWSABLE");
                    intent.setPackage("com.android.vending");
                    intent.addFlags(268435456);
                    parseUri = intent;
                }
                if (parseUri != null) {
                    bVar = C44376b.FALLBACK_PLAY_STORE;
                    C69664n.m101061g(bVar, "resolution");
                } else {
                    bVar = C44376b.NO_FALLBACK;
                    C69664n.m101061g(bVar, "resolution");
                    parseUri = null;
                }
            }
            int ordinal = bVar.ordinal();
            if (ordinal != 0) {
                if (ordinal == 1) {
                    C69664n.m101058d(parseUri);
                    Uri data = parseUri.getData();
                    C69664n.m101058d(data);
                    C43255f m = C43257h.m76306m(data.toString());
                    m.mo46348i(true);
                    C43257h k = m.mo46365k();
                    C43262m mVar = intentUriWebFragmentObserver.f115380b;
                    C69664n.m101060f(k, "loadUrlParams");
                    mVar.mo46333b(k);
                    return;
                } else if (ordinal != 2) {
                    if (ordinal == 3) {
                        C59052c cVar2 = (C59052c) IntentUriWebFragmentObserver.f115379a.mo56226d();
                        cVar2.mo56379ah(new C59094n(54221));
                        cVar2.mo56386p("No app available to handle the intent:// URI");
                        return;
                    }
                    return;
                }
            }
            C69664n.m101058d(parseUri);
            intentUriWebFragmentObserver.mo47272g(parseUri);
            return;
        }
        throw new URISyntaxException(parse.toString(), "The provided Uri must have the intent:// scheme");
    }
}
