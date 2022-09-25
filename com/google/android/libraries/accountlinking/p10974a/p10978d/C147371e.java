package com.google.android.libraries.accountlinking.p10974a.p10978d;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.support.p031v4.app.Fragment;
import android.text.TextUtils;
import android.util.Log;
import androidx.browser.p059a.C0963k;
import androidx.lifecycle.C2368bp;
import com.google.android.libraries.accountlinking.activity.C147388p;
import com.google.android.libraries.accountlinking.p10974a.C147366d;
import com.google.android.libraries.accountlinking.p10974a.C147372e;
import com.google.common.base.C58833ax;
import com.google.common.p4522b.C58490gz;
import com.google.common.p4522b.C58495hd;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.p4526f.p4527a.C58974d;
import com.google.protos.p5133r.p5134a.p5135a.p5136a.C65879c;
import com.google.protos.p5133r.p5134a.p5135a.p5136a.C65881e;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.chromium.p5641a.p5642a.C72303a;

/* renamed from: com.google.android.libraries.accountlinking.a.d.e */
/* compiled from: PG */
public final class C147371e extends Fragment {

    /* renamed from: a */
    public static final C147366d f397815a;

    /* renamed from: b */
    public static final C147366d f397816b = C147366d.m240280b(109);

    /* renamed from: c */
    public static final C58495hd f397817c;

    /* renamed from: d */
    public static final C58495hd f397818d;

    /* renamed from: h */
    private static final C58974d f397819h = C58974d.m91134h("GAL");

    /* renamed from: e */
    public C147372e f397820e;

    /* renamed from: f */
    public C147388p f397821f;

    /* renamed from: g */
    public boolean f397822g;

    /* renamed from: i */
    private String f397823i;

    /* renamed from: j */
    private boolean f397824j;

    /* renamed from: k */
    private boolean f397825k;

    static {
        C147366d c = C147366d.m240281c(2, 106);
        f397815a = c;
        C58490gz gzVar = new C58490gz(4);
        gzVar.mo55429h("invalid_request", C147366d.m240280b(101));
        gzVar.mo55429h("unauthorized_client", C147366d.m240280b(102));
        gzVar.mo55429h("access_denied", C147366d.m240281c(2, 103));
        gzVar.mo55429h("unsupported_response_type", C147366d.m240280b(104));
        gzVar.mo55429h("invalid_scope", C147366d.m240280b(105));
        gzVar.mo55429h("server_error", c);
        gzVar.mo55429h("temporarily_unavailable", C147366d.m240281c(2, 107));
        f397817c = gzVar.mo55427f(true);
        C58490gz gzVar2 = new C58490gz(4);
        gzVar2.mo55429h("invalid_request", C65879c.EVENT_APP_AUTH_INVALID_REQUEST);
        gzVar2.mo55429h("unauthorized_client", C65879c.EVENT_APP_AUTH_UNAUTHORIZED_CLIENT);
        gzVar2.mo55429h("access_denied", C65879c.EVENT_APP_AUTH_ACCESS_DENIED);
        gzVar2.mo55429h("unsupported_response_type", C65879c.EVENT_APP_AUTH_UNSUPPORTED_RESPONSE_TYPE);
        gzVar2.mo55429h("invalid_scope", C65879c.EVENT_APP_AUTH_INVALID_SCOPE);
        gzVar2.mo55429h("server_error", C65879c.EVENT_APP_AUTH_SERVER_ERROR);
        gzVar2.mo55429h("temporarily_unavailable", C65879c.EVENT_APP_AUTH_TEMPORARILY_UNAVAILABLE);
        f397818d = gzVar2.mo55427f(true);
    }

    /* renamed from: a */
    public static C147371e m240284a(String str, boolean z) {
        Bundle bundle = new Bundle();
        bundle.putString("auth_url", str);
        bundle.putBoolean("need_one_time_auth_code", z);
        C147371e eVar = new C147371e();
        eVar.setArguments(bundle);
        return eVar;
    }

    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        this.f397821f.mo124147e(C65879c.EVENT_APP_AUTH_RECEIVE_ACTIVITY_RESULT);
        new Handler().postDelayed(new C147370d(this), 20);
    }

    public final void onCreate(Bundle bundle) {
        Intent intent;
        super.onCreate(bundle);
        setRetainInstance(true);
        Bundle arguments = getArguments();
        arguments.getClass();
        String string = arguments.getString("auth_url");
        string.getClass();
        this.f397823i = string;
        this.f397824j = arguments.getBoolean("need_one_time_auth_code");
        this.f397820e = (C147372e) new C2368bp(getActivity()).mo5770a(C147372e.class);
        if (bundle == null) {
            C147388p pVar = (C147388p) new C2368bp(getActivity()).mo5770a(C147388p.class);
            this.f397821f = pVar;
            pVar.mo124148f(C65881e.STATE_APP_AUTH);
            Context context = getContext();
            String str = C72303a.f192468a;
            if (str == null) {
                PackageManager packageManager = context.getPackageManager();
                Intent intent2 = new Intent("android.intent.action.VIEW", Uri.parse("http://www.example.com"));
                ResolveInfo resolveActivity = packageManager.resolveActivity(intent2, 0);
                String str2 = resolveActivity != null ? resolveActivity.activityInfo.packageName : null;
                List<ResolveInfo> queryIntentActivities = packageManager.queryIntentActivities(intent2, 0);
                ArrayList arrayList = new ArrayList();
                for (ResolveInfo next : queryIntentActivities) {
                    Intent intent3 = new Intent();
                    intent3.setAction("android.support.customtabs.action.CustomTabsService");
                    intent3.setPackage(next.activityInfo.packageName);
                    if (packageManager.resolveService(intent3, 0) != null) {
                        arrayList.add(next.activityInfo.packageName);
                    }
                }
                if (arrayList.isEmpty()) {
                    C72303a.f192468a = null;
                } else if (arrayList.size() == 1) {
                    C72303a.f192468a = (String) arrayList.get(0);
                } else {
                    if (!TextUtils.isEmpty(str2)) {
                        try {
                            List<ResolveInfo> queryIntentActivities2 = context.getPackageManager().queryIntentActivities(intent2, 64);
                            if (queryIntentActivities2 != null) {
                                if (queryIntentActivities2.size() != 0) {
                                    Iterator<ResolveInfo> it = queryIntentActivities2.iterator();
                                    while (true) {
                                        if (!it.hasNext()) {
                                            break;
                                        }
                                        ResolveInfo next2 = it.next();
                                        IntentFilter intentFilter = next2.filter;
                                        if (intentFilter != null && intentFilter.countDataAuthorities() != 0 && intentFilter.countDataPaths() != 0 && next2.activityInfo != null) {
                                            break;
                                        }
                                    }
                                }
                            }
                        } catch (RuntimeException unused) {
                            Log.e("CustomTabsHelper", "Runtime exception while getting specialized handlers");
                        }
                        if (arrayList.contains(str2)) {
                            C72303a.f192468a = str2;
                        }
                    }
                    if (arrayList.contains("com.android.chrome")) {
                        C72303a.f192468a = "com.android.chrome";
                    } else if (arrayList.contains("com.chrome.beta")) {
                        C72303a.f192468a = "com.chrome.beta";
                    } else if (arrayList.contains("com.chrome.dev")) {
                        C72303a.f192468a = "com.chrome.dev";
                    } else if (arrayList.contains("com.google.android.apps.chrome")) {
                        C72303a.f192468a = "com.google.android.apps.chrome";
                    }
                }
                str = C72303a.f192468a;
            }
            if (str == null) {
                this.f397821f.mo124147e(C65879c.EVENT_APP_AUTH_NO_CUSTOM_TABS_SUPPORTED_BROWSER);
            }
            if (str != null) {
                String str3 = this.f397823i;
                intent = new C0963k().mo3582a().f3074a;
                intent.setPackage(str);
                intent.setData(Uri.parse(str3));
                if (!this.f397824j) {
                    intent.setFlags(1073741824);
                }
            } else {
                C58833ax a = C147369c.m240283a(getContext());
                if (!a.mo56113h()) {
                    this.f397821f.mo124147e(C65879c.EVENT_APP_AUTH_NO_BROWSER_FOUND);
                    this.f397820e.f397826a.mo5706i(C147366d.m240280b(108));
                    ((C58970a) ((C58970a) f397819h.mo56226d()).mo56372aa(42236)).mo56386p("WebOAuth flow cannot be started because no web browser is found on this device");
                    return;
                }
                String str4 = this.f397823i;
                Intent intent4 = new Intent("android.intent.action.VIEW");
                intent4.setPackage((String) a.mo56107c());
                intent4.setData(Uri.parse(str4));
                if (!this.f397824j) {
                    intent4.setFlags(1073741824);
                }
                intent = intent4;
            }
            this.f397822g = false;
            startActivityForResult(intent, 1001);
            return;
        }
        this.f397825k = true;
    }

    public final void onStart() {
        super.onStart();
        if (this.f397825k) {
            this.f397821f = (C147388p) new C2368bp(getActivity()).mo5770a(C147388p.class);
        }
    }
}
