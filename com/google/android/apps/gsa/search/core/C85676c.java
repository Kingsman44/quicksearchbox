package com.google.android.apps.gsa.search.core;

import android.content.ActivityNotFoundException;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Base64;
import android.webkit.JavascriptInterface;
import com.google.android.apps.gsa.p8852u.C118569b;
import com.google.android.apps.gsa.p8852u.C118575h;
import com.google.android.apps.gsa.p8885y.C118827a;
import com.google.android.apps.gsa.search.core.google.C85923cq;
import com.google.android.apps.gsa.search.core.preferences.C86338r;
import com.google.android.apps.gsa.search.core.webview.C87256b;
import com.google.android.apps.gsa.search.core.webview.C87261g;
import com.google.android.apps.gsa.search.core.webview.C87277w;
import com.google.android.apps.gsa.search.shared.service.C88489j;
import com.google.android.apps.gsa.search.shared.service.p6935b.C87741bw;
import com.google.android.apps.gsa.shared.logger.C89949q;
import com.google.android.apps.gsa.shared.p6968aa.C89034be;
import com.google.android.apps.gsa.shared.p6968aa.C89037bh;
import com.google.android.apps.gsa.shared.p7195y.C91189au;
import com.google.android.apps.gsa.shared.search.C90507o;
import com.google.android.apps.gsa.shared.util.p7159c.C90877ak;
import com.google.android.apps.gsa.shared.util.p7184t.C91095e;
import com.google.android.apps.gsa.shared.util.p7184t.C91097g;
import com.google.android.gms.identity.accounts.api.C144354b;
import com.google.android.libraries.gcoreclient.p1784p.p1785a.p1786a.p1787a.C21601a;
import com.google.android.libraries.gsa.util.p1935a.C23336a;
import com.google.android.libraries.p1730f.C21370a;
import com.google.android.libraries.p1730f.C21383f;
import com.google.common.base.C58887cx;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60870cx;
import com.google.protobuf.C62921ba;
import com.google.protobuf.C62942bv;
import com.google.speech.p5208h.C66554ak;
import dagger.C68214a;
import java.net.URISyntaxException;
import java.util.List;
import java.util.Locale;

/* renamed from: com.google.android.apps.gsa.search.core.c */
/* compiled from: PG */
public class C85676c {

    /* renamed from: a */
    public static final C59071e f231611a = C59071e.m91332i("com.google.android.apps.gsa.search.core.c");

    /* renamed from: b */
    public final C87277w f231612b;

    /* renamed from: c */
    public final C68214a f231613c;

    /* renamed from: d */
    public volatile C60870cx f231614d;

    /* renamed from: e */
    private final Context f231615e;

    /* renamed from: f */
    private final C91097g f231616f;

    /* renamed from: g */
    private final PackageManager f231617g;

    /* renamed from: h */
    private final C85923cq f231618h;

    /* renamed from: i */
    private final C68214a f231619i;

    /* renamed from: j */
    private final C68214a f231620j;

    /* renamed from: k */
    private final C68214a f231621k;

    /* renamed from: l */
    private final C87256b f231622l;

    /* renamed from: m */
    private final C87261g f231623m;

    /* renamed from: n */
    private final C21370a f231624n;

    /* renamed from: o */
    private final C118575h f231625o;

    /* renamed from: p */
    private final C118827a f231626p;

    /* renamed from: q */
    private int f231627q;

    /* renamed from: r */
    private int f231628r;

    /* renamed from: s */
    private int f231629s;

    public C85676c(C118575h hVar, C87277w wVar, C87261g gVar, Context context, PackageManager packageManager, C85923cq cqVar, C68214a aVar, C68214a aVar2, C68214a aVar3, C68214a aVar4, C21370a aVar5, C118827a aVar6, C91097g gVar2, C87256b bVar) {
        this.f231615e = context;
        this.f231616f = gVar2;
        this.f231612b = wVar;
        this.f231618h = cqVar;
        this.f231617g = packageManager;
        this.f231619i = aVar;
        this.f231622l = bVar;
        this.f231620j = aVar2;
        this.f231621k = aVar3;
        this.f231613c = aVar4;
        this.f231623m = gVar;
        this.f231624n = aVar5;
        this.f231625o = hVar;
        this.f231626p = aVar6;
    }

    /* renamed from: c */
    private final int m137555c(int i) {
        return (int) (((float) i) / this.f231615e.getResources().getDisplayMetrics().density);
    }

    /* renamed from: d */
    private final Intent m137556d(String str) {
        C58976aa aaVar = C58975e.f156826a;
        ComponentName unflattenFromString = ComponentName.unflattenFromString(str);
        if (unflattenFromString != null) {
            Intent f = m137558f(unflattenFromString);
            if (this.f231617g.queryIntentActivities(f, 0).isEmpty()) {
                return null;
            }
            return f;
        }
        Intent g = m137559g(str);
        Intent addCategory = m137559g(str).addCategory("android.intent.category.DEFAULT");
        List<ResolveInfo> queryIntentActivityOptions = this.f231617g.queryIntentActivityOptions((ComponentName) null, new Intent[]{addCategory}, g, 0);
        if (queryIntentActivityOptions.isEmpty()) {
            return null;
        }
        ResolveInfo resolveInfo = queryIntentActivityOptions.get(0);
        return m137558f(new ComponentName(resolveInfo.activityInfo.packageName, resolveInfo.activityInfo.name));
    }

    /* renamed from: e */
    private final boolean m137557e(String str, boolean z, boolean z2) {
        try {
            C58976aa aaVar = C58975e.f156826a;
            Uri parse = Uri.parse(str);
            if (!this.f231612b.mo80921a() || !this.f231618h.mo79554e(parse, true)) {
                return false;
            }
            this.f231622l.mo79403b(parse, z, z2);
            return true;
        } catch (Throwable th) {
            C59104x c = f231611a.mo56225c();
            c.mo56378ag(C58975e.f156826a, "AgsaJavascriptExt");
            ((C59052c) ((C59052c) ((C59052c) c).mo56382g(th)).mo56372aa(7349)).mo56386p("Uncaught Throwable");
            C58887cx.m90980g(th);
            throw new RuntimeException(th);
        }
    }

    /* renamed from: f */
    private static final Intent m137558f(ComponentName componentName) {
        return new Intent("android.intent.action.MAIN").setFlags(268435456).addCategory("android.intent.category.LAUNCHER").setComponent(componentName);
    }

    /* renamed from: g */
    private static final Intent m137559g(String str) {
        return new Intent("android.intent.action.MAIN").setFlags(268435456).addCategory("android.intent.category.LAUNCHER").setPackage(str);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo79206a(C118569b bVar) {
        this.f231626p.mo77944g(bVar, this.f231625o).mo104025g(1);
        C58976aa aaVar = C58975e.f156826a;
    }

    @JavascriptInterface
    public void addInAppUrlPattern(String str) {
        mo79206a(C118569b.JS_EXT_ADD_IN_APP_URL_PATTERN_CALL_COUNT);
        try {
            C58976aa aaVar = C58975e.f156826a;
            this.f231622l.mo80866d(str);
        } catch (Throwable th) {
            C59104x c = f231611a.mo56225c();
            c.mo56378ag(C58975e.f156826a, "AgsaJavascriptExt");
            ((C59052c) ((C59052c) ((C59052c) c).mo56382g(th)).mo56372aa(7283)).mo56386p("Uncaught Throwable");
            C58887cx.m90980g(th);
            throw new RuntimeException(th);
        }
    }

    @JavascriptInterface
    public void addOptionsMenuItem(String str, int i, String str2, boolean z) {
        mo79206a(C118569b.JS_EXT_ADD_OPTIONS_MENU_ITEM_CALL_COUNT);
        try {
            C58976aa aaVar = C58975e.f156826a;
            this.f231622l.mo80867e(str, i, str2, z);
        } catch (Throwable th) {
            C59104x c = f231611a.mo56225c();
            c.mo56378ag(C58975e.f156826a, "AgsaJavascriptExt");
            ((C59052c) ((C59052c) ((C59052c) c).mo56382g(th)).mo56372aa(7285)).mo56386p("Uncaught Throwable");
            C58887cx.m90980g(th);
            throw new RuntimeException(th);
        }
    }

    /* renamed from: b */
    public final synchronized void mo79209b(int i, int i2, int i3) {
        this.f231627q = m137555c(i);
        this.f231628r = m137555c(i2);
        this.f231629s = m137555c(i3);
    }

    @JavascriptInterface
    public boolean canLaunchApp(String str) {
        mo79206a(C118569b.JS_EXT_CAN_LAUNCH_APP_CALL_COUNT);
        try {
            C58976aa aaVar = C58975e.f156826a;
            if (this.f231612b.mo80921a() && m137556d(str) != null) {
                return true;
            }
            return false;
        } catch (Throwable th) {
            C59104x c = f231611a.mo56225c();
            c.mo56378ag(C58975e.f156826a, "AgsaJavascriptExt");
            ((C59052c) ((C59052c) ((C59052c) c).mo56382g(th)).mo56372aa(7319)).mo56386p("Uncaught Throwable");
            C58887cx.m90980g(th);
            throw new RuntimeException(th);
        }
    }

    @JavascriptInterface
    public boolean canUriBeHandled(String str) {
        mo79206a(C118569b.JS_EXT_CAN_URI_BE_HANDLED_CALL_COUNT);
        try {
            C58976aa aaVar = C58975e.f156826a;
            this.f231612b.mo80921a();
            return !this.f231617g.queryIntentActivities(C23336a.m43768a(str), 0).isEmpty();
        } catch (URISyntaxException unused) {
            C58976aa aaVar2 = C58975e.f156826a;
            return false;
        } catch (Throwable th) {
            C59104x c = f231611a.mo56225c();
            c.mo56378ag(C58975e.f156826a, "AgsaJavascriptExt");
            ((C59052c) ((C59052c) ((C59052c) c).mo56382g(th)).mo56372aa(7324)).mo56386p("Uncaught Throwable");
            C58887cx.m90980g(th);
            throw new RuntimeException(th);
        }
    }

    @JavascriptInterface
    public boolean canUriBeHandledByPackage(String str, String str2) {
        mo79206a(C118569b.JS_EXT_CAN_URI_BE_HANDLED_BY_PACKAGE_CALL_COUNT);
        try {
            C58976aa aaVar = C58975e.f156826a;
            if (!this.f231612b.mo80921a()) {
                return false;
            }
            return !this.f231617g.queryIntentActivities(C23336a.m43768a(str).setPackage(str2), 0).isEmpty();
        } catch (URISyntaxException unused) {
            C58976aa aaVar2 = C58975e.f156826a;
            return false;
        } catch (Throwable th) {
            C59104x c = f231611a.mo56225c();
            c.mo56378ag(C58975e.f156826a, "AgsaJavascriptExt");
            ((C59052c) ((C59052c) ((C59052c) c).mo56382g(th)).mo56372aa(7329)).mo56386p("Uncaught Throwable");
            C58887cx.m90980g(th);
            throw new RuntimeException(th);
        }
    }

    @JavascriptInterface
    public void closePage(int i, String str) {
        mo79206a(C118569b.JS_EXT_CLOSE_PAGE_CALL_COUNT);
        try {
            C58976aa aaVar = C58975e.f156826a;
            this.f231622l.mo80868f(i, Intent.parseUri(str, 1));
        } catch (Throwable th) {
            C59104x c = f231611a.mo56225c();
            c.mo56378ag(C58975e.f156826a, "AgsaJavascriptExt");
            ((C59052c) ((C59052c) ((C59052c) c).mo56382g(th)).mo56372aa(7288)).mo56386p("Uncaught Throwable");
            C58887cx.m90980g(th);
            throw new RuntimeException(th);
        }
    }

    @JavascriptInterface
    public void delayedPageLoad() {
        mo79206a(C118569b.JS_EXT_DELAYED_PAGE_LOAD_CALL_COUNT);
        try {
            C58976aa aaVar = C58975e.f156826a;
            this.f231622l.mo80869g();
        } catch (Throwable th) {
            C59104x c = f231611a.mo56225c();
            c.mo56378ag(C58975e.f156826a, "AgsaJavascriptExt");
            ((C59052c) ((C59052c) ((C59052c) c).mo56382g(th)).mo56372aa(7290)).mo56386p("Uncaught Throwable");
            C58887cx.m90980g(th);
            throw new RuntimeException(th);
        }
    }

    @JavascriptInterface
    public int getDetailedNetworkConnectionType() {
        mo79206a(C118569b.JS_EXT_GET_DETAILED_NETWORK_CONNECTION_TYPE_CALL_COUNT);
        try {
            C58976aa aaVar = C58975e.f156826a;
            return C89034be.m144791a(((C89037bh) this.f231620j.mo27525b()).mo27377b()).f181028z;
        } catch (Throwable th) {
            C59104x c = f231611a.mo56225c();
            c.mo56378ag(C58975e.f156826a, "AgsaJavascriptExt");
            ((C59052c) ((C59052c) ((C59052c) c).mo56382g(th)).mo56372aa(7269)).mo56386p("Uncaught Throwable");
            C58887cx.m90980g(th);
            throw new RuntimeException(th);
        }
    }

    @JavascriptInterface
    public long getFirstByteTimeMillis() {
        mo79206a(C118569b.JS_EXT_GET_FIRST_BYTE_TIME_MILLIS_CALL_COUNT);
        if (this.f231614d != null) {
            Long l = (Long) C90877ak.m148475i(this.f231614d, (Object) null);
            if (l != null && l.longValue() > 0) {
                return C21383f.m40448a(this.f231624n, l.longValue());
            }
            C59104x c = f231611a.mo56225c();
            c.mo56378ag(C58975e.f156826a, "AgsaJavascriptExt");
            ((C59052c) ((C59052c) c).mo56372aa(7270)).mo56389s("%s", "mFirstByteElapsedTimeMillisFuture is not successfully done");
            throw new IllegalStateException("mFirstByteElapsedTimeMillisFuture is not successfully done");
        }
        C59104x c2 = f231611a.mo56225c();
        c2.mo56378ag(C58975e.f156826a, "AgsaJavascriptExt");
        ((C59052c) ((C59052c) c2).mo56372aa(7271)).mo56389s("%s", "mFirstByteElapsedTimeMillisFuture is null");
        throw new IllegalStateException("mFirstByteElapsedTimeMillisFuture is null");
    }

    @JavascriptInterface
    public int getFooterPaddingHeight() {
        mo79206a(C118569b.JS_EXT_GET_FOOTER_PADDING_HEIGHT_CALL_COUNT);
        return this.f231629s;
    }

    @JavascriptInterface
    public int getHeaderPaddingHeight() {
        mo79206a(C118569b.JS_EXT_GET_HEADER_PADDING_HEIGHT_CALL_COUNT);
        return this.f231628r;
    }

    @JavascriptInterface
    public String getNetworkConnectionType() {
        mo79206a(C118569b.JS_EXT_GET_NETWORK_CONNECTION_TYPE_CALL_COUNT);
        try {
            C58976aa aaVar = C58975e.f156826a;
            C66554ak a = C89034be.m144791a(((C89037bh) this.f231620j.mo27525b()).mo27377b());
            C66554ak akVar = C66554ak.UNKNOWN;
            int ordinal = a.ordinal();
            if (ordinal == 24) {
                return "CELL_5G";
            }
            switch (ordinal) {
                case 1:
                    return "WIFI";
                case 2:
                case 3:
                case 4:
                case 9:
                case 14:
                    return "CELL_2G";
                case 5:
                case 6:
                case 7:
                case 8:
                case 10:
                case 11:
                case 12:
                case 13:
                case 16:
                    return "CELL_3G";
                case 15:
                case 19:
                    return "CELL_4G";
                case 17:
                    return "BLUETOOTH";
                case 18:
                    return "ETHERNET";
                default:
                    return "UNKNOWN";
            }
        } catch (Throwable th) {
            C59104x c = f231611a.mo56225c();
            c.mo56378ag(C58975e.f156826a, "AgsaJavascriptExt");
            ((C59052c) ((C59052c) ((C59052c) c).mo56382g(th)).mo56372aa(7278)).mo56386p("Uncaught Throwable");
            C58887cx.m90980g(th);
            throw new RuntimeException(th);
        }
    }

    @JavascriptInterface
    public String getPageVisibility() {
        mo79206a(C118569b.JS_EXT_GET_PAGE_VISIBILITY_CALL_COUNT);
        try {
            C58976aa aaVar = C58975e.f156826a;
            if (!this.f231612b.mo80921a()) {
                return null;
            }
            return this.f231622l.mo80865c();
        } catch (Throwable th) {
            C59104x c = f231611a.mo56225c();
            c.mo56378ag(C58975e.f156826a, "AgsaJavascriptExt");
            ((C59052c) ((C59052c) ((C59052c) c).mo56382g(th)).mo56372aa(7280)).mo56386p("Uncaught Throwable");
            C58887cx.m90980g(th);
            throw new RuntimeException(th);
        }
    }

    @JavascriptInterface
    public int getScrollTop() {
        mo79206a(C118569b.JS_EXT_GET_SCROLL_TOP_CALL_COUNT);
        return this.f231627q;
    }

    @JavascriptInterface
    public void goBack() {
        mo79206a(C118569b.JS_EXT_GO_BACK_CALL_COUNT);
        try {
            C58976aa aaVar = C58975e.f156826a;
            this.f231622l.mo79402a();
        } catch (Throwable th) {
            C59104x c = f231611a.mo56225c();
            c.mo56378ag(C58975e.f156826a, "AgsaJavascriptExt");
            ((C59052c) ((C59052c) ((C59052c) c).mo56382g(th)).mo56372aa(7293)).mo56386p("Uncaught Throwable");
            C58887cx.m90980g(th);
            throw new RuntimeException(th);
        }
    }

    @JavascriptInterface
    public boolean hasHomescreenShortcut(String str) {
        C59104x d = f231611a.mo56226d();
        d.mo56378ag(C58975e.f156826a, "AgsaJavascriptExt");
        ((C59052c) ((C59052c) d).mo56372aa(7332)).mo56386p("Homescreen Shortcuts APIs are not enabled.");
        return false;
    }

    @JavascriptInterface
    public void installHomescreenShortcut(String str, String str2, String str3, String str4) {
        C59104x d = f231611a.mo56226d();
        d.mo56378ag(C58975e.f156826a, "AgsaJavascriptExt");
        ((C59052c) ((C59052c) d).mo56372aa(7294)).mo56386p("Homescreen Shortcuts APIs are not enabled.");
    }

    @JavascriptInterface
    public void installShortcut(String str, String str2, String str3) {
        mo79206a(C118569b.JS_EXT_INSTALL_SHORTCUT_CALL_COUNT);
        try {
            C58976aa aaVar = C58975e.f156826a;
            if (this.f231612b.mo80921a()) {
                Intent parseUri = Intent.parseUri(str2, 1);
                ((C91189au) this.f231621k.mo27525b()).mo85428r(((C91189au) this.f231621k.mo27525b()).mo85417d(Uri.parse(str3)), "AgsaJavascriptExt.ImageCallback", new C85642b(this, str, parseUri));
            }
        } catch (Throwable th) {
            C59104x c = f231611a.mo56225c();
            c.mo56378ag(C58975e.f156826a, "AgsaJavascriptExt");
            ((C59052c) ((C59052c) ((C59052c) c).mo56382g(th)).mo56372aa(7296)).mo56386p("Uncaught Throwable");
            C58887cx.m90980g(th);
            throw new RuntimeException(th);
        }
    }

    @JavascriptInterface
    public boolean isTrusted() {
        mo79206a(C118569b.JS_EXT_IS_TRUSTED_CALL_COUNT);
        try {
            C58976aa aaVar = C58975e.f156826a;
            return this.f231612b.mo80921a();
        } catch (Throwable th) {
            C59104x c = f231611a.mo56225c();
            c.mo56378ag(C58975e.f156826a, "AgsaJavascriptExt");
            ((C59052c) ((C59052c) ((C59052c) c).mo56382g(th)).mo56372aa(7335)).mo56386p("Uncaught Throwable");
            C58887cx.m90980g(th);
            throw new RuntimeException(th);
        }
    }

    @JavascriptInterface
    public boolean launchApp(String str) {
        Intent d;
        mo79206a(C118569b.JS_EXT_LAUNCH_APP_CALL_COUNT);
        try {
            C58976aa aaVar = C58975e.f156826a;
            if (this.f231612b.mo80921a() && (d = m137556d(str)) != null) {
                return this.f231616f.mo65089a(d);
            }
            return false;
        } catch (Throwable th) {
            C59104x c = f231611a.mo56225c();
            c.mo56378ag(C58975e.f156826a, "AgsaJavascriptExt");
            ((C59052c) ((C59052c) ((C59052c) c).mo56382g(th)).mo56372aa(7338)).mo56386p("Uncaught Throwable");
            C58887cx.m90980g(th);
            throw new RuntimeException(th);
        }
    }

    @JavascriptInterface
    public boolean launchAppViaIntentUri(String str, boolean z) {
        mo79206a(C118569b.JS_EXT_LAUNCH_APP_VIA_INTENT_URI_CALL_COUNT);
        try {
            C58976aa aaVar = C58975e.f156826a;
            if (!this.f231612b.mo80921a()) {
                return false;
            }
            if (!str.startsWith("intent:")) {
                if (!str.startsWith("android-app:")) {
                    return false;
                }
            }
            Intent parseUri = Intent.parseUri(str, 1);
            if (this.f231617g.resolveActivity(parseUri, 0) == null) {
                return false;
            }
            if (!z) {
                return this.f231616f.mo65089a(parseUri);
            }
            if (!this.f231616f.mo65092d()) {
                return false;
            }
            return this.f231616f.mo65090b(parseUri, new C91095e());
        } catch (ActivityNotFoundException | URISyntaxException unused) {
            C58976aa aaVar2 = C58975e.f156826a;
            return false;
        } catch (Throwable th) {
            C59104x c = f231611a.mo56225c();
            c.mo56378ag(C58975e.f156826a, "AgsaJavascriptExt");
            ((C59052c) ((C59052c) ((C59052c) c).mo56382g(th)).mo56372aa(7343)).mo56386p("Uncaught Throwable");
            C58887cx.m90980g(th);
            throw new RuntimeException(th);
        }
    }

    @JavascriptInterface
    public void logClientEvent(int i) {
        mo79206a(C118569b.JS_EXT_LOG_CLIENT_EVENT_CALL_COUNT);
        try {
            C58976aa aaVar = C58975e.f156826a;
            if (this.f231612b.mo80921a()) {
                C89949q.m146523g(i);
            }
        } catch (Throwable th) {
            C59104x c = f231611a.mo56225c();
            c.mo56378ag(C58975e.f156826a, "AgsaJavascriptExt");
            ((C59052c) ((C59052c) ((C59052c) c).mo56382g(th)).mo56372aa(7299)).mo56386p("Uncaught Throwable");
            C58887cx.m90980g(th);
            throw new RuntimeException(th);
        }
    }

    @JavascriptInterface
    public void openImageViewer(String str) {
    }

    @JavascriptInterface
    public boolean openInApp(String str) {
        mo79206a(C118569b.JS_EXT_OPEN_IN_APP_CALL_COUNT);
        return m137557e(str, false, false);
    }

    @JavascriptInterface
    public boolean openInAppFullScreen(String str) {
        mo79206a(C118569b.JS_EXT_OPEN_IN_APP_FULLSCREEN_CALL_COUNT);
        return m137557e(str, true, false);
    }

    @JavascriptInterface
    public boolean openInAppSameSession(String str) {
        mo79206a(C118569b.JS_EXT_OPEN_IN_APP_SAME_SESSION_CALL_COUNT);
        return m137557e(str, true, true);
    }

    @JavascriptInterface
    public boolean openWithPackage(String str, String str2) {
        mo79206a(C118569b.JS_EXT_OPEN_WITH_PACKAGE_CALL_COUNT);
        try {
            C58976aa aaVar = C58975e.f156826a;
            if (!this.f231612b.mo80921a()) {
                return false;
            }
            return this.f231616f.mo65089a(C23336a.m43768a(str).setPackage(str2));
        } catch (URISyntaxException unused) {
            C58976aa aaVar2 = C58975e.f156826a;
            return false;
        } catch (Throwable th) {
            C59104x c = f231611a.mo56225c();
            c.mo56378ag(C58975e.f156826a, "AgsaJavascriptExt");
            ((C59052c) ((C59052c) ((C59052c) c).mo56382g(th)).mo56372aa(7355)).mo56386p("Uncaught Throwable");
            C58887cx.m90980g(th);
            throw new RuntimeException(th);
        }
    }

    @JavascriptInterface
    public boolean openWithPackageWithAccountExtras(String str, String str2) {
        String string;
        mo79206a(C118569b.JS_EXT_OPEN_WITH_PACAGE_WITH_ACCOUNT_EXTRAS_CALL_COUNT);
        try {
            C58976aa aaVar = C58975e.f156826a;
            if (this.f231612b.mo80921a() && (string = ((C86338r) this.f231619i.mo27525b()).getString(C90507o.f253011a, (String) null)) != null) {
                if (!TextUtils.isEmpty(string)) {
                    Intent intent = C23336a.m43768a(str).setPackage(str2);
                    C144354b.m234631a(this.f231615e, intent, C21601a.m40714a(string).f59976a);
                    return this.f231616f.mo65089a(intent);
                }
            }
            return false;
        } catch (URISyntaxException unused) {
            C58976aa aaVar2 = C58975e.f156826a;
            return false;
        } catch (Throwable th) {
            C59104x c = f231611a.mo56225c();
            c.mo56378ag(C58975e.f156826a, "AgsaJavascriptExt");
            ((C59052c) ((C59052c) ((C59052c) c).mo56382g(th)).mo56372aa(7360)).mo56386p("Uncaught Throwable");
            C58887cx.m90980g(th);
            throw new RuntimeException(th);
        }
    }

    @JavascriptInterface
    public void pageReady() {
        mo79206a(C118569b.JS_EXT_PAGE_READY_CALL_COUNT);
        try {
            C58976aa aaVar = C58975e.f156826a;
            this.f231622l.mo80870h();
        } catch (Throwable th) {
            C59104x c = f231611a.mo56225c();
            c.mo56378ag(C58975e.f156826a, "AgsaJavascriptExt");
            ((C59052c) ((C59052c) ((C59052c) c).mo56382g(th)).mo56372aa(7302)).mo56386p("Uncaught Throwable");
            C58887cx.m90980g(th);
            throw new RuntimeException(th);
        }
    }

    @JavascriptInterface
    public void prefetch(String str) {
        mo79206a(C118569b.JS_EXT_PREFETCH_CALL_COUNT);
    }

    @JavascriptInterface
    public void prewarmImageViewer() {
    }

    @JavascriptInterface
    public boolean registerPageVisibilityListener(String str) {
        mo79206a(C118569b.JS_EXT_REGISTER_PAGE_VISIBILITY_LISTENER_CALL_COUNT);
        try {
            C58976aa aaVar = C58975e.f156826a;
            if (!this.f231612b.mo80921a()) {
                return false;
            }
            return this.f231622l.mo80871i(str);
        } catch (Throwable th) {
            C59104x c = f231611a.mo56225c();
            c.mo56378ag(C58975e.f156826a, "AgsaJavascriptExt");
            ((C59052c) ((C59052c) ((C59052c) c).mo56382g(th)).mo56372aa(7365)).mo56386p("Uncaught Throwable");
            C58887cx.m90980g(th);
            throw new RuntimeException(th);
        }
    }

    @JavascriptInterface
    public String registerReceiver(String str, String str2) {
        C59104x d = f231611a.mo56226d();
        d.mo56378ag(C58975e.f156826a, "AgsaJavascriptExt");
        ((C59052c) ((C59052c) d).mo56372aa(7282)).mo56386p("Broadcast receivers not supported.");
        return null;
    }

    @JavascriptInterface
    public void replaceSearchBoxText(String str) {
    }

    @JavascriptInterface
    public void requestUpdateHostApp() {
        mo79206a(C118569b.JS_EXT_REQUEST_UPDATE_HOST_APP_CALL_COUNT);
        try {
            C58976aa aaVar = C58975e.f156826a;
            if (this.f231612b.mo80921a()) {
                String packageName = this.f231615e.getPackageName();
                PackageManager packageManager = this.f231615e.getPackageManager();
                Intent intent = new Intent("com.android.vending.billing.PURCHASE");
                intent.addCategory("android.intent.category.DEFAULT");
                intent.setPackage("com.android.vending");
                intent.putExtra("backend", 3);
                intent.putExtra("document_type", 1);
                intent.putExtra("full_docid", packageName);
                intent.putExtra("backend_docid", packageName);
                intent.putExtra("offer_type", 1);
                if (packageManager.resolveActivity(intent, 65536) == null) {
                    intent = new Intent("android.intent.action.VIEW");
                    intent.setData(Uri.parse(String.format(Locale.US, "https://play.google.com/store/apps/details?id=%1$s&rdid=%1$s&rdot=%2$d", new Object[]{packageName, 1})));
                    intent.setPackage("com.android.vending");
                    intent.putExtra("use_direct_purchase", true);
                }
                this.f231616f.mo65090b(intent, new C84338a());
            }
        } catch (Throwable th) {
            C59104x c = f231611a.mo56225c();
            c.mo56378ag(C58975e.f156826a, "AgsaJavascriptExt");
            ((C59052c) ((C59052c) ((C59052c) c).mo56382g(th)).mo56372aa(7306)).mo56386p("Uncaught Throwable");
            C58887cx.m90980g(th);
            throw new RuntimeException(th);
        }
    }

    @JavascriptInterface
    public void restoreWebpageScrollPosition(boolean z) {
    }

    @JavascriptInterface
    public void sendGenericClientEvent(String str) {
        mo79206a(C118569b.JS_EXT_SEND_GENERIC_CLIENT_EVENT_CALL_COUNT);
        try {
            C58976aa aaVar = C58975e.f156826a;
            if (this.f231612b.mo80921a()) {
                this.f231623m.mo79400a(new C88489j((C87741bw) C62942bv.parseFrom((C62942bv) C87741bw.f237477c, Base64.decode(str, 0), C62921ba.m95368a())).mo82013a());
            }
        } catch (Throwable th) {
            C59104x c = f231611a.mo56225c();
            c.mo56378ag(C58975e.f156826a, "AgsaJavascriptExt");
            ((C59052c) ((C59052c) ((C59052c) c).mo56382g(th)).mo56372aa(7310)).mo56386p("Uncaught Throwable");
            C58887cx.m90980g(th);
            throw new RuntimeException(th);
        }
    }

    @JavascriptInterface
    public void setNativeUiState(int i, int i2) {
        C59104x d = f231611a.mo56226d();
        d.mo56378ag(C58975e.f156826a, "AgsaJavascriptExt");
        ((C59052c) ((C59052c) d).mo56372aa(7312)).mo56386p("setNativeUiState called from outside SRP WebView");
    }

    @JavascriptInterface
    public void share(String str, String str2) {
        mo79206a(C118569b.JS_EXT_SHARE_CALL_COUNT);
        try {
            C58976aa aaVar = C58975e.f156826a;
            if (this.f231612b.mo80921a()) {
                Intent intent = new Intent();
                intent.setAction("android.intent.action.SEND");
                intent.putExtra("android.intent.extra.TEXT", str);
                if (str2 == null || str2.isEmpty()) {
                    intent.setType("text/plain");
                } else {
                    intent.putExtra("android.intent.extra.HTML_TEXT", str2);
                    intent.setType("text/html");
                }
                intent.addFlags(268435456);
                this.f231616f.mo65089a(Intent.createChooser(intent, (CharSequence) null));
            }
        } catch (Throwable th) {
            C59104x c = f231611a.mo56225c();
            c.mo56378ag(C58975e.f156826a, "AgsaJavascriptExt");
            ((C59052c) ((C59052c) ((C59052c) c).mo56382g(th)).mo56372aa(7314)).mo56386p("Uncaught Throwable");
            C58887cx.m90980g(th);
            throw new RuntimeException(th);
        }
    }

    @JavascriptInterface
    public boolean unregisterReceiver(String str) {
        C59104x d = f231611a.mo56226d();
        d.mo56378ag(C58975e.f156826a, "AgsaJavascriptExt");
        ((C59052c) ((C59052c) d).mo56372aa(7367)).mo56386p("Broadcast receivers not supported.");
        return false;
    }

    @JavascriptInterface
    public void updateHomescreenShortcut(String str, String str2, String str3, String str4) {
        C59104x d = f231611a.mo56226d();
        d.mo56378ag(C58975e.f156826a, "AgsaJavascriptExt");
        ((C59052c) ((C59052c) d).mo56372aa(7316)).mo56386p("Homescreen Shortcuts APIs are not enabled.");
    }
}
