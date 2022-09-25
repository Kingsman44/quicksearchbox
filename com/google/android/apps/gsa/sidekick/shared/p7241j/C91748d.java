package com.google.android.apps.gsa.sidekick.shared.p7241j;

import android.app.KeyguardManager;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import com.evernote.android.state.BuildConfig;
import com.google.android.apps.gsa.search.shared.multiuser.C87610m;
import com.google.android.apps.gsa.search.shared.multiuser.C87613p;
import com.google.android.apps.gsa.search.shared.multiuser.C87615r;
import com.google.android.apps.gsa.search.shared.multiuser.C87616s;
import com.google.android.apps.gsa.search.shared.multiuser.C87618u;
import com.google.android.apps.gsa.search.shared.service.C87677ae;
import com.google.android.apps.gsa.search.shared.service.C87682aj;
import com.google.android.apps.gsa.search.shared.service.C88486g;
import com.google.android.apps.gsa.search.shared.service.C88489j;
import com.google.android.apps.gsa.search.shared.service.ClientConfig;
import com.google.android.apps.gsa.search.shared.service.ClientEventData;
import com.google.android.apps.gsa.search.shared.service.p6935b.C87739bu;
import com.google.android.apps.gsa.shared.p7000au.p7002b.C89292b;
import com.google.android.apps.gsa.shared.p7025bh.p7026a.C89429a;
import com.google.android.apps.gsa.shared.util.C90721ae;
import com.google.android.apps.gsa.shared.util.C90722af;
import com.google.android.apps.gsa.shared.util.C90734ar;
import com.google.android.apps.gsa.shared.util.C90757ba;
import com.google.android.apps.gsa.shared.util.p7169g.C91038a;
import com.google.android.apps.p489g.p494d.C9141ad;
import com.google.android.apps.search.googleapp.googleappbrowser.p10260a.C135458d;
import com.google.android.apps.search.googleapp.googleappbrowser.p10260a.C135459e;
import com.google.android.apps.search.googleapp.googleappbrowser.p10260a.C135461g;
import com.google.android.apps.search.googleapp.googleappbrowser.p10260a.C135462h;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.common.base.C58881cr;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.p4552o.amo;
import java.net.URISyntaxException;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.google.android.apps.gsa.sidekick.shared.j.d */
/* compiled from: PG */
public final class C91748d {

    /* renamed from: a */
    private static final C59071e f255868a = C59071e.m91332i("com.google.android.apps.gsa.sidekick.shared.j.d");

    /* renamed from: b */
    private final C22871g f255869b;

    /* renamed from: c */
    private final C87618u f255870c;

    /* renamed from: d */
    private final C87677ae f255871d;

    /* renamed from: e */
    private final C58881cr f255872e;

    /* renamed from: f */
    private KeyguardManager f255873f;

    public C91748d(C22871g gVar, C87618u uVar, C58881cr crVar, C87677ae aeVar) {
        int i = C90722af.f253805a;
        this.f255869b = gVar;
        this.f255870c = uVar;
        this.f255872e = crVar;
        this.f255871d = aeVar;
    }

    /* renamed from: f */
    private final void m150301f(Context context, int i) {
        this.f255869b.mo28212l("Toast", new C91746b(context, i));
    }

    /* renamed from: a */
    public final void mo86237a(Context context, C9141ad adVar) {
        Intent intent = new Intent();
        intent.setClassName(context, "com.google.android.apps.gsa.staticplugins.backredirect.activity.BackRedirectActivity");
        intent.addFlags(268435456);
        intent.addFlags(32768);
        C90734ar.m148200c(intent, "com.google.android.apps.gsa.staticplugins.backredirect.activity.BackRedirectActivity", adVar);
        try {
            context.startActivity(intent);
        } catch (ActivityNotFoundException e) {
            C59104x c = f255868a.mo56225c();
            c.mo56378ag(C58975e.f156826a, "ActivityHelper");
            ((C59052c) ((C59052c) ((C59052c) c).mo56382g(e)).mo56372aa(11892)).mo56386p("URL handling activity not found");
        }
    }

    /* renamed from: b */
    public final boolean mo86238b(Context context, Uri uri, Bundle bundle, boolean z, boolean z2, boolean z3, String str, String str2) {
        Intent intent;
        C87616s sVar;
        try {
            if (C89429a.m145459q(uri)) {
                intent = Intent.parseUri(uri.toString(), 1);
                if (bundle != null) {
                    intent.putExtras(bundle);
                }
            } else {
                if (uri.getScheme() == null) {
                    C59104x d = f255868a.mo56226d();
                    d.mo56378ag(C58975e.f156826a, "ActivityHelper");
                    ((C59052c) ((C59052c) d).mo56372aa(11891)).mo56389s("Scheme not specified for uri: %s", uri);
                }
                intent = new Intent("android.intent.action.VIEW", uri);
            }
            intent.putExtra("android.intent.extra.REFERRER", C90721ae.f253801j);
            if (!str2.isEmpty()) {
                intent.putExtra("androidx.browser.customtabs.extra.TRANSLATE_LANGUAGE", str2);
            }
            if (z2 || C89292b.m145223a(context)) {
                intent.setFlags(268435456);
            }
            PackageManager packageManager = context.getPackageManager();
            if (!TextUtils.isEmpty(str)) {
                Iterator<ResolveInfo> it = packageManager.queryIntentActivities(intent, 0).iterator();
                while (true) {
                    if (it.hasNext()) {
                        if (str.equals(it.next().activityInfo.packageName)) {
                            intent.setPackage(str);
                            break;
                        }
                    } else {
                        break;
                    }
                }
            } else {
                String authority = uri.getAuthority();
                String path = uri.getPath();
                if ("maps.google.com".equals(authority) && path != null && path.startsWith("/maps/") && ((Boolean) this.f255872e.mo6453a()).booleanValue()) {
                    String a = C91038a.m148714a(intent, packageManager);
                    if (!TextUtils.isEmpty(a)) {
                        intent.setPackage(a);
                    }
                }
            }
            if (z3) {
                intent.addCategory("android.intent.category.BROWSABLE");
                intent.addCategory("android.intent.category.DEFAULT");
            }
            if (z) {
                try {
                    C87618u uVar = this.f255870c;
                    sVar = new C87616s(uVar);
                    if (sVar.mo81749b()) {
                        C87615r rVar = new C87615r(sVar);
                        C87613p a2 = uVar.mo81753a();
                        if (a2 != null) {
                            a2.mo81746a(new C87610m(intent), rVar);
                        } else {
                            throw new RemoteException("Not connected");
                        }
                    }
                    return true;
                } catch (RemoteException | RuntimeException e) {
                    sVar.mo81748a();
                    throw e;
                } catch (RemoteException unused) {
                    C58976aa aaVar = C58975e.f156826a;
                    return false;
                }
            } else {
                try {
                    boolean p = C89429a.m145458p(uri);
                    List<String> queryParameters = uri.getQueryParameters("gsas");
                    if (!p || !queryParameters.isEmpty()) {
                        if (this.f255873f == null) {
                            this.f255873f = (KeyguardManager) context.getSystemService("keyguard");
                        }
                        boolean isKeyguardLocked = this.f255873f.isKeyguardLocked();
                        C58976aa aaVar2 = C58975e.f156826a;
                        if (!isKeyguardLocked) {
                            context.startActivity(intent);
                        }
                    } else {
                        intent.addCategory("android.intent.category.BROWSABLE");
                        intent.putExtra("com.google.android.apps.gsa.customtabs.SOURCE", 3);
                        C135459e eVar = (C135459e) C135462h.f369059n.createBuilder();
                        C135461g gVar = C135461g.NOW;
                        eVar.copyOnWrite();
                        C135462h hVar = (C135462h) eVar.instance;
                        hVar.f369064d = gVar.f369058p;
                        hVar.f369061a |= 4;
                        C135458d.m219649b((C135462h) eVar.build(), intent);
                        C58976aa aaVar3 = C58975e.f156826a;
                        C88489j jVar = new C88489j(C87739bu.BROWSABLE_INTENT_LAUNCHED_IN_CLIENT);
                        jVar.mo82015c(intent);
                        ClientEventData a3 = jVar.mo82013a();
                        C88486g gVar2 = new C88486g();
                        gVar2.f239199a = 4294967298L;
                        gVar2.f239200b = 0;
                        gVar2.f239201c = amo.DYNAMIC_ACTIVITY;
                        gVar2.f239204f = "customtabs";
                        this.f255869b.mo28211k(this.f255869b.mo28207g("getFutureForClientEvent", new C91745a(this.f255871d.mo81958a((C87682aj) null, (C90757ba) null, new ClientConfig(gVar2)), a3)), "ActivityHelper#CctClientEvent", new C91747c());
                    }
                    return true;
                } catch (ActivityNotFoundException unused2) {
                    return false;
                }
            }
        } catch (URISyntaxException e2) {
            C59104x d2 = f255868a.mo56226d();
            d2.mo56378ag(C58975e.f156826a, "ActivityHelper");
            ((C59052c) ((C59052c) ((C59052c) d2).mo56382g(e2)).mo56372aa(11899)).mo56386p("Error parsing uri as intent");
            return false;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0089, code lost:
        r5 = f255868a.mo56226d();
        r5.mo56378ag(com.google.common.p4526f.p4527a.C58975e.f156826a, "ActivityHelper");
        ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r5).mo56372aa(11895)).mo56389s("Failed to parse intent for broadcast %s", r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x009b, code lost:
        return;
     */
    /* JADX WARNING: Removed duplicated region for block: B:28:? A[ExcHandler: URISyntaxException (unused java.net.URISyntaxException), SYNTHETIC, Splitter:B:1:0x0003] */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo86239c(android.content.Context r5, java.lang.String r6, boolean r7) {
        /*
            r4 = this;
            java.lang.String r0 = "ActivityHelper"
            r1 = 1
            android.content.Intent r1 = android.content.Intent.parseUri(r6, r1)     // Catch:{ URISyntaxException -> 0x0089, RemoteException -> 0x0075 }
            android.content.pm.PackageManager r2 = r5.getPackageManager()     // Catch:{ URISyntaxException -> 0x0089, RemoteException -> 0x0075 }
            r3 = 0
            java.util.List r2 = r2.queryBroadcastReceivers(r1, r3)     // Catch:{ URISyntaxException -> 0x0089, RemoteException -> 0x0075 }
            boolean r2 = r2.isEmpty()     // Catch:{ URISyntaxException -> 0x0089, RemoteException -> 0x0075 }
            if (r2 != 0) goto L_0x0054
            java.lang.String r2 = "android.intent.extra.REFERRER"
            android.net.Uri r3 = com.google.android.apps.gsa.shared.util.C90721ae.f253801j     // Catch:{ URISyntaxException -> 0x0089, RemoteException -> 0x0075 }
            r1.putExtra(r2, r3)     // Catch:{ URISyntaxException -> 0x0089, RemoteException -> 0x0075 }
            if (r7 == 0) goto L_0x0050
            com.google.android.apps.gsa.search.shared.multiuser.u r5 = r4.f255870c     // Catch:{ URISyntaxException -> 0x0089, RemoteException -> 0x0075 }
            com.google.android.apps.gsa.search.shared.multiuser.s r7 = new com.google.android.apps.gsa.search.shared.multiuser.s     // Catch:{ URISyntaxException -> 0x0089, RemoteException -> 0x0075 }
            r7.<init>(r5)     // Catch:{ URISyntaxException -> 0x0089, RemoteException -> 0x0075 }
            boolean r2 = r7.mo81749b()     // Catch:{ URISyntaxException -> 0x0089, RemoteException -> 0x0075 }
            if (r2 == 0) goto L_0x004f
            com.google.android.apps.gsa.search.shared.multiuser.r r2 = new com.google.android.apps.gsa.search.shared.multiuser.r     // Catch:{ RemoteException -> 0x004a, RuntimeException -> 0x0048, URISyntaxException -> 0x0089 }
            r2.<init>(r7)     // Catch:{ RemoteException -> 0x004a, RuntimeException -> 0x0048, URISyntaxException -> 0x0089 }
            com.google.android.apps.gsa.search.shared.multiuser.p r5 = r5.mo81753a()     // Catch:{ RemoteException -> 0x004a, RuntimeException -> 0x0048, URISyntaxException -> 0x0089 }
            if (r5 == 0) goto L_0x0040
            com.google.android.apps.gsa.search.shared.multiuser.j r3 = new com.google.android.apps.gsa.search.shared.multiuser.j     // Catch:{ RemoteException -> 0x004a, RuntimeException -> 0x0048, URISyntaxException -> 0x0089 }
            r3.<init>(r1)     // Catch:{ RemoteException -> 0x004a, RuntimeException -> 0x0048, URISyntaxException -> 0x0089 }
            r5.mo81746a(r3, r2)     // Catch:{ RemoteException -> 0x004a, RuntimeException -> 0x0048, URISyntaxException -> 0x0089 }
            return
        L_0x0040:
            android.os.RemoteException r5 = new android.os.RemoteException     // Catch:{ RemoteException -> 0x004a, RuntimeException -> 0x0048, URISyntaxException -> 0x0089 }
            java.lang.String r1 = "Not connected"
            r5.<init>(r1)     // Catch:{ RemoteException -> 0x004a, RuntimeException -> 0x0048, URISyntaxException -> 0x0089 }
            throw r5     // Catch:{ RemoteException -> 0x004a, RuntimeException -> 0x0048, URISyntaxException -> 0x0089 }
        L_0x0048:
            r5 = move-exception
            goto L_0x004b
        L_0x004a:
            r5 = move-exception
        L_0x004b:
            r7.mo81748a()     // Catch:{ URISyntaxException -> 0x0089, RemoteException -> 0x0075 }
            throw r5     // Catch:{ URISyntaxException -> 0x0089, RemoteException -> 0x0075 }
        L_0x004f:
            return
        L_0x0050:
            r5.sendBroadcast(r1)     // Catch:{ URISyntaxException -> 0x0089, RemoteException -> 0x0075 }
            return
        L_0x0054:
            r7 = 2132090087(0x7f151ce7, float:1.9820504E38)
            r4.m150301f(r5, r7)     // Catch:{ URISyntaxException -> 0x0089, RemoteException -> 0x0075 }
            com.google.common.f.e r5 = f255868a     // Catch:{ URISyntaxException -> 0x0089, RemoteException -> 0x0075 }
            com.google.common.f.x r5 = r5.mo56226d()     // Catch:{ URISyntaxException -> 0x0089, RemoteException -> 0x0075 }
            com.google.common.f.aa r7 = com.google.common.p4526f.p4527a.C58975e.f156826a     // Catch:{ URISyntaxException -> 0x0089, RemoteException -> 0x0075 }
            r5.mo56378ag(r7, r0)     // Catch:{ URISyntaxException -> 0x0089, RemoteException -> 0x0075 }
            com.google.common.f.c r5 = (com.google.common.p4526f.C59052c) r5     // Catch:{ URISyntaxException -> 0x0089, RemoteException -> 0x0075 }
            r7 = 11897(0x2e79, float:1.6671E-41)
            com.google.common.f.x r5 = r5.mo56372aa(r7)     // Catch:{ URISyntaxException -> 0x0089, RemoteException -> 0x0075 }
            com.google.common.f.c r5 = (com.google.common.p4526f.C59052c) r5     // Catch:{ URISyntaxException -> 0x0089, RemoteException -> 0x0075 }
            java.lang.String r7 = "Cannot handle broadcast %s"
            r5.mo56389s(r7, r6)     // Catch:{ URISyntaxException -> 0x0089, RemoteException -> 0x0075 }
            return
        L_0x0075:
            r5 = move-exception
            com.google.common.f.e r7 = f255868a
            com.google.common.f.x r7 = r7.mo56226d()
            com.google.common.f.aa r1 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r7.mo56378ag(r1, r0)
            java.lang.String r0 = "Failed to broadcast to work profile %s"
            r1 = 11896(0x2e78, float:1.667E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r7).mo56382g(r5)).mo56372aa(r1)).mo56389s(r0, r6)
            return
        L_0x0089:
            com.google.common.f.e r5 = f255868a
            com.google.common.f.x r5 = r5.mo56226d()
            com.google.common.f.aa r7 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r5.mo56378ag(r7, r0)
            java.lang.String r7 = "Failed to parse intent for broadcast %s"
            r0 = 11895(0x2e77, float:1.6668E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r5).mo56372aa(r0)).mo56389s(r7, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.sidekick.shared.p7241j.C91748d.mo86239c(android.content.Context, java.lang.String, boolean):void");
    }

    /* renamed from: d */
    public final void mo86240d(Context context, Intent intent) {
        try {
            if (C89292b.m145223a(context)) {
                intent.addFlags(268435456);
            }
            context.startActivity(intent);
        } catch (ActivityNotFoundException e) {
            C59104x d = f255868a.mo56226d();
            d.mo56378ag(C58975e.f156826a, "ActivityHelper");
            ((C59052c) ((C59052c) ((C59052c) d).mo56382g(e)).mo56372aa(11898)).mo56389s("no handler for intent: %s", intent);
            m150301f(context, R.string.no_activity_to_handle_generic);
        }
    }

    /* renamed from: e */
    public final boolean mo86241e(Context context, Uri uri, boolean z, boolean z2) {
        if (mo86238b(context, uri, (Bundle) null, z, z2, false, (String) null, BuildConfig.FLAVOR)) {
            return true;
        }
        C59104x d = f255868a.mo56226d();
        d.mo56378ag(C58975e.f156826a, "ActivityHelper");
        ((C59052c) ((C59052c) d).mo56372aa(11900)).mo56389s("No handler for URI: %s", uri);
        m150301f(context, R.string.no_url_handler);
        return false;
    }
}
