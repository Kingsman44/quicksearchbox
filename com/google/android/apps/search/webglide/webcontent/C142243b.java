package com.google.android.apps.search.webglide.webcontent;

import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import androidx.browser.p059a.C0963k;
import androidx.browser.p059a.C0964l;
import com.evernote.android.state.BuildConfig;
import com.google.android.apps.search.googleapp.googleappbrowser.p10260a.C135457c;
import com.google.android.apps.search.googleapp.googleappbrowser.p10260a.C135462h;
import com.google.android.libraries.web.contrib.requestblock.C43714a;
import com.google.android.libraries.web.p3353c.C43367l;
import com.google.apps.tiktok.account.AccountId;
import com.google.common.p4522b.C58526ih;
import com.google.common.p4526f.C59052c;
import com.google.protobuf.C63077o;
import java.util.List;
import p3186j$.util.Collection;

/* renamed from: com.google.android.apps.search.webglide.webcontent.b */
/* compiled from: PG */
public final /* synthetic */ class C142243b implements C43714a {

    /* renamed from: a */
    public final /* synthetic */ ExternalUrlLauncher f385891a;

    public /* synthetic */ C142243b(ExternalUrlLauncher externalUrlLauncher) {
        this.f385891a = externalUrlLauncher;
    }

    /* renamed from: a */
    public final void mo32340a(C43367l lVar) {
        ExternalUrlLauncher externalUrlLauncher = this.f385891a;
        Uri parse = Uri.parse(lVar.f113296b);
        Intent intent = new Intent("android.intent.action.VIEW", parse);
        intent.addCategory("android.intent.category.BROWSABLE");
        List<ResolveInfo> queryIntentActivities = externalUrlLauncher.f385882c.queryIntentActivities(intent, 65536);
        if (!queryIntentActivities.isEmpty()) {
            List<ResolveInfo> queryIntentActivities2 = externalUrlLauncher.f385882c.queryIntentActivities(new Intent().setAction("android.intent.action.VIEW").addCategory("android.intent.category.BROWSABLE").setData(Uri.fromParts("http", BuildConfig.FLAVOR, (String) null)), 65536);
            C58526ih ihVar = new C58526ih();
            for (ResolveInfo resolveInfo : queryIntentActivities2) {
                ihVar.mo55373c(resolveInfo.activityInfo.packageName);
            }
            if (!Collection.EL.stream(queryIntentActivities).anyMatch(new C142244c(ihVar.mo55486f()))) {
                ((C59052c) ((C59052c) ExternalUrlLauncher.f385880a.mo56224b()).mo56372aa(42040)).mo56386p("Link is not an intent:// link and can't be opened in a browser, returning a generic intent for android to handle.");
                externalUrlLauncher.f385885f.mo41692g("NON_BROWSER");
                externalUrlLauncher.mo117078g(intent);
            } else if (externalUrlLauncher.f385886g.f385694c) {
                ((C59052c) ((C59052c) ExternalUrlLauncher.f385880a.mo56224b()).mo56372aa(42042)).mo56386p("External link can be handled by a browser, opening CCT if available.");
                externalUrlLauncher.f385885f.mo41692g("CCT");
                C0963k kVar = new C0963k();
                kVar.mo3588g(true);
                C0964l a = kVar.mo3582a();
                a.f3074a.setPackage("com.android.chrome");
                a.mo3590a(externalUrlLauncher.f385881b.requireContext(), parse);
            } else {
                ((C59052c) ((C59052c) ExternalUrlLauncher.f385880a.mo56224b()).mo56372aa(42041)).mo56386p("External link can be handled by a browser, opening GAB if available.");
                AccountId accountId = externalUrlLauncher.f385884e;
                Intent intent2 = new Intent("android.intent.action.VIEW");
                if (parse != null) {
                    intent2.setData(parse);
                }
                Intent c = C135457c.m219646c(intent2, accountId, C135462h.f369059n, "com.google.android.googlequicksearchbox");
                externalUrlLauncher.f385883d.mo47046b(C63077o.m96099a(true));
                externalUrlLauncher.f385885f.mo41692g("GAB");
                externalUrlLauncher.mo117078g(c);
            }
        } else {
            ((C59052c) ((C59052c) ExternalUrlLauncher.f385880a.mo56224b()).mo56372aa(42043)).mo56386p("No activities found that can handle this external link click.");
            externalUrlLauncher.f385885f.mo41692g("NO_DEFAULT_ACTIVITY_FOUND_TO_HANDLE_LINK");
            externalUrlLauncher.mo117078g(intent);
        }
    }
}
