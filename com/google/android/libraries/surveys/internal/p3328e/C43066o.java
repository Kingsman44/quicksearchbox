package com.google.android.libraries.surveys.internal.p3328e;

import android.app.Activity;
import android.app.UiModeManager;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import android.os.Bundle;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.util.Log;
import android.util.Patterns;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import android.view.inputmethod.InputMethodManager;
import android.webkit.URLUtil;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import androidx.browser.p059a.C0953a;
import androidx.browser.p059a.C0954b;
import androidx.browser.p059a.C0963k;
import androidx.core.content.C1877c;
import androidx.core.content.C1878d;
import androidx.core.p097i.C1970e;
import androidx.core.p098j.C2043bi;
import com.evernote.android.state.BuildConfig;
import com.google.android.googlequicksearchbox.R;
import com.google.common.base.C58886cw;
import com.google.common.base.C58890d;
import com.google.p4281bu.p4282a.C56532bp;
import com.google.p4281bu.p4282a.C56534br;
import com.google.p4281bu.p4282a.C56535bs;
import com.google.p4281bu.p4282a.C56536bt;
import com.google.p4281bu.p4282a.C56537bu;
import com.google.p4281bu.p4282a.C56538bv;
import com.google.p4281bu.p4282a.C56539bw;
import com.google.p4281bu.p4282a.C56540bx;
import com.google.p4281bu.p4282a.C56545cb;
import com.google.p4281bu.p4282a.C56546cc;
import com.google.p4281bu.p4282a.C56565cv;
import com.google.p4281bu.p4282a.C56568cy;
import com.google.p4281bu.p4282a.C56583i;
import com.google.p4281bu.p4282a.C56585k;
import com.google.p4281bu.p4282a.C56587m;
import com.google.p4281bu.p4282a.C56593s;
import com.google.p4281bu.p4282a.C56596v;
import com.google.p4281bu.p4282a.C56597w;
import com.google.p4281bu.p4282a.C56599y;
import com.google.p4281bu.p4282a.C56600z;
import com.google.protobuf.C62910ar;
import com.google.protobuf.C62921ba;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C62974ct;
import com.google.protobuf.MessageLite;
import java.io.UnsupportedEncodingException;
import java.net.URI;
import java.net.URISyntaxException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import p3186j$.net.URLEncoder;
import p5304e.p5305a.p5306a.p5333ag.p5334a.C68362ak;
import p5304e.p5305a.p5306a.p5333ag.p5334a.C68368aq;
import p5304e.p5305a.p5306a.p5333ag.p5334a.C68371at;
import p5304e.p5305a.p5306a.p5333ag.p5334a.C68382g;

/* renamed from: com.google.android.libraries.surveys.internal.e.o */
/* compiled from: PG */
public final class C43066o {

    /* renamed from: a */
    public static final /* synthetic */ int f112626a = 0;

    /* renamed from: b */
    private static final long f112627b = TimeUnit.DAYS.toMillis(1);

    /* renamed from: a */
    static int m75980a() {
        String c = C68382g.m98765c(C43054c.f112610b);
        if (c.contains(".")) {
            c = c.substring(c.lastIndexOf(".") + 1);
        }
        return Integer.parseInt(c);
    }

    /* renamed from: b */
    public static Drawable m75981b(Drawable drawable, Context context, int i) {
        Drawable mutate = drawable.getConstantState().newDrawable(context.getResources()).mutate();
        mutate.setColorFilter(i, PorterDuff.Mode.SRC_ATOP);
        return mutate;
    }

    /* renamed from: c */
    public static Bundle m75982c(C56540bx bxVar) {
        C56539bw bwVar = bxVar.f150985a;
        if (bwVar == null) {
            bwVar = C56539bw.f150979c;
        }
        C62971cq cqVar = bwVar.f150981a;
        int size = cqVar.size();
        Bundle bundle = new Bundle(size);
        for (int i = 0; i < size; i++) {
            C56538bv bvVar = (C56538bv) cqVar.get(i);
            bundle.putString(bvVar.f150977a, bvVar.f150978b);
        }
        return bundle;
    }

    /* renamed from: d */
    public static MessageLite m75983d(MessageLite messageLite, byte[] bArr) {
        try {
            return messageLite.toBuilder().mergeFrom(bArr, C62921ba.m95368a()).build();
        } catch (C62974ct e) {
            throw new IllegalStateException(e);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x0052  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0138  */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.google.p4281bu.p4282a.C56600z m75984e(android.content.Context r5) {
        /*
            android.content.pm.PackageManager r0 = r5.getPackageManager()
            java.lang.String r1 = "Unknown"
            if (r0 == 0) goto L_0x0045
            java.lang.String r2 = r5.getPackageName()     // Catch:{ NameNotFoundException -> 0x0039 }
            r3 = 0
            android.content.pm.PackageInfo r2 = r0.getPackageInfo(r2, r3)     // Catch:{ NameNotFoundException -> 0x0039 }
            if (r2 == 0) goto L_0x0045
            android.content.pm.ApplicationInfo r3 = r2.applicationInfo     // Catch:{ NameNotFoundException -> 0x0039 }
            java.lang.CharSequence r0 = r0.getApplicationLabel(r3)     // Catch:{ NameNotFoundException -> 0x0039 }
            boolean r3 = android.text.TextUtils.isEmpty(r0)     // Catch:{ NameNotFoundException -> 0x0039 }
            if (r3 != 0) goto L_0x0024
            java.lang.String r0 = r0.toString()     // Catch:{ NameNotFoundException -> 0x0039 }
            goto L_0x0025
        L_0x0024:
            r0 = r1
        L_0x0025:
            java.lang.String r3 = r2.versionName     // Catch:{ NameNotFoundException -> 0x0037 }
            boolean r3 = android.text.TextUtils.isEmpty(r3)     // Catch:{ NameNotFoundException -> 0x0037 }
            if (r3 != 0) goto L_0x0030
            java.lang.String r2 = r2.versionName     // Catch:{ NameNotFoundException -> 0x0037 }
            goto L_0x0047
        L_0x0030:
            int r2 = r2.versionCode     // Catch:{ NameNotFoundException -> 0x0037 }
            java.lang.String r2 = java.lang.Integer.toString(r2)     // Catch:{ NameNotFoundException -> 0x0037 }
            goto L_0x0047
        L_0x0037:
            r2 = move-exception
            goto L_0x003c
        L_0x0039:
            r0 = move-exception
            r2 = r0
            r0 = r1
        L_0x003c:
            java.lang.String r3 = "SurveyUtils"
            java.lang.String r4 = "Exception while retrieving application information."
            android.util.Log.e(r3, r4, r2)
            r2 = r1
            goto L_0x0047
        L_0x0045:
            r0 = r1
            r2 = r0
        L_0x0047:
            java.lang.String r3 = r5.getPackageName()
            boolean r3 = android.text.TextUtils.isEmpty(r3)
            if (r3 == 0) goto L_0x0052
            goto L_0x0056
        L_0x0052:
            java.lang.String r1 = r5.getPackageName()
        L_0x0056:
            com.google.bu.a.v r5 = com.google.p4281bu.p4282a.C56596v.f151094i
            com.google.protobuf.bn r5 = r5.createBuilder()
            com.google.bu.a.u r5 = (com.google.p4281bu.p4282a.C56595u) r5
            r5.copyOnWrite()
            com.google.protobuf.bv r3 = r5.instance
            com.google.bu.a.v r3 = (com.google.p4281bu.p4282a.C56596v) r3
            r1.getClass()
            r3.f151101f = r1
            r5.copyOnWrite()
            com.google.protobuf.bv r1 = r5.instance
            com.google.bu.a.v r1 = (com.google.p4281bu.p4282a.C56596v) r1
            r0.getClass()
            r1.f151100e = r0
            r5.copyOnWrite()
            com.google.protobuf.bv r0 = r5.instance
            com.google.bu.a.v r0 = (com.google.p4281bu.p4282a.C56596v) r0
            r2.getClass()
            r0.f151102g = r2
            java.lang.String r0 = android.os.Build.MODEL
            r5.copyOnWrite()
            com.google.protobuf.bv r1 = r5.instance
            com.google.bu.a.v r1 = (com.google.p4281bu.p4282a.C56596v) r1
            r0.getClass()
            r1.f151096a = r0
            java.lang.String r0 = android.os.Build.VERSION.RELEASE
            r5.copyOnWrite()
            com.google.protobuf.bv r1 = r5.instance
            com.google.bu.a.v r1 = (com.google.p4281bu.p4282a.C56596v) r1
            r0.getClass()
            r1.f151099d = r0
            r5.copyOnWrite()
            com.google.protobuf.bv r0 = r5.instance
            com.google.bu.a.v r0 = (com.google.p4281bu.p4282a.C56596v) r0
            r1 = 1
            r0.f151098c = r1
            com.google.protobuf.bv r5 = r5.build()
            com.google.bu.a.v r5 = (com.google.p4281bu.p4282a.C56596v) r5
            java.util.TimeZone r0 = java.util.TimeZone.getDefault()
            java.lang.String r0 = r0.getID()
            java.util.concurrent.TimeUnit r2 = java.util.concurrent.TimeUnit.MILLISECONDS
            java.util.TimeZone r0 = p3186j$.util.DesugarTimeZone.getTimeZone(r0)
            int r0 = r0.getRawOffset()
            long r3 = (long) r0
            long r2 = r2.toSeconds(r3)
            com.google.protobuf.ar r0 = com.google.protobuf.C62910ar.f169858c
            com.google.protobuf.bn r0 = r0.createBuilder()
            com.google.protobuf.aq r0 = (com.google.protobuf.C62909aq) r0
            r0.copyOnWrite()
            com.google.protobuf.bv r4 = r0.instance
            com.google.protobuf.ar r4 = (com.google.protobuf.C62910ar) r4
            r4.f169860a = r2
            com.google.protobuf.bv r0 = r0.build()
            com.google.protobuf.ar r0 = (com.google.protobuf.C62910ar) r0
            com.google.bu.a.w r2 = com.google.p4281bu.p4282a.C56597w.f151104d
            com.google.protobuf.bn r2 = r2.createBuilder()
            com.google.bu.a.t r2 = (com.google.p4281bu.p4282a.C56594t) r2
            r2.copyOnWrite()
            com.google.protobuf.bv r3 = r2.instance
            com.google.bu.a.w r3 = (com.google.p4281bu.p4282a.C56597w) r3
            r5.getClass()
            r3.f151107b = r5
            r2.copyOnWrite()
            com.google.protobuf.bv r5 = r2.instance
            com.google.bu.a.w r5 = (com.google.p4281bu.p4282a.C56597w) r5
            r0.getClass()
            r5.f151108c = r0
            com.google.protobuf.bv r5 = r2.build()
            com.google.bu.a.w r5 = (com.google.p4281bu.p4282a.C56597w) r5
            com.google.bu.a.y r0 = com.google.p4281bu.p4282a.C56599y.f151109e
            com.google.protobuf.bn r0 = r0.createBuilder()
            com.google.bu.a.x r0 = (com.google.p4281bu.p4282a.C56598x) r0
            android.content.Context r2 = com.google.android.libraries.surveys.internal.p3328e.C43054c.f112610b
            java.lang.String r2 = p5304e.p5305a.p5306a.p5333ag.p5334a.C68382g.m98765c(r2)
            r0.copyOnWrite()
            com.google.protobuf.bv r3 = r0.instance
            com.google.bu.a.y r3 = (com.google.p4281bu.p4282a.C56599y) r3
            r2.getClass()
            r3.f151112b = r2
            int r2 = m75980a()
            r0.copyOnWrite()
            com.google.protobuf.bv r3 = r0.instance
            com.google.bu.a.y r3 = (com.google.p4281bu.p4282a.C56599y) r3
            r3.f151114d = r2
            r0.copyOnWrite()
            com.google.protobuf.bv r2 = r0.instance
            com.google.bu.a.y r2 = (com.google.p4281bu.p4282a.C56599y) r2
            com.google.protobuf.ch r3 = r2.f151113c
            boolean r4 = r3.mo58948c()
            if (r4 != 0) goto L_0x013e
            com.google.protobuf.ch r3 = com.google.protobuf.C62942bv.mutableCopy((com.google.protobuf.C62961ch) r3)
            r2.f151113c = r3
        L_0x013e:
            com.google.protobuf.ch r2 = r2.f151113c
            r2.mo58916g(r1)
            r0.copyOnWrite()
            com.google.protobuf.bv r1 = r0.instance
            com.google.bu.a.y r1 = (com.google.p4281bu.p4282a.C56599y) r1
            r2 = 2
            r1.f151111a = r2
            com.google.protobuf.bv r0 = r0.build()
            com.google.bu.a.y r0 = (com.google.p4281bu.p4282a.C56599y) r0
            com.google.bu.a.z r1 = com.google.p4281bu.p4282a.C56600z.f151115c
            com.google.protobuf.bn r1 = r1.createBuilder()
            com.google.bu.a.q r1 = (com.google.p4281bu.p4282a.C56591q) r1
            r1.copyOnWrite()
            com.google.protobuf.bv r2 = r1.instance
            com.google.bu.a.z r2 = (com.google.p4281bu.p4282a.C56600z) r2
            r5.getClass()
            r2.f151117a = r5
            r1.copyOnWrite()
            com.google.protobuf.bv r5 = r1.instance
            com.google.bu.a.z r5 = (com.google.p4281bu.p4282a.C56600z) r5
            r0.getClass()
            r5.f151118b = r0
            com.google.protobuf.bv r5 = r1.build()
            com.google.bu.a.z r5 = (com.google.p4281bu.p4282a.C56600z) r5
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.surveys.internal.p3328e.C43066o.m75984e(android.content.Context):com.google.bu.a.z");
    }

    /* renamed from: f */
    public static C56540bx m75985f(List list, Context context) {
        String str;
        C56536bt btVar = (C56536bt) C56539bw.f150979c.createBuilder();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C1970e eVar = (C1970e) it.next();
            C56537bu buVar = (C56537bu) C56538bv.f150975c.createBuilder();
            String str2 = (String) eVar.f5888a;
            buVar.copyOnWrite();
            str2.getClass();
            ((C56538bv) buVar.instance).f150977a = str2;
            String str3 = (String) eVar.f5889b;
            buVar.copyOnWrite();
            str3.getClass();
            ((C56538bv) buVar.instance).f150978b = str3;
            C56538bv bvVar = (C56538bv) buVar.build();
            btVar.copyOnWrite();
            C56539bw bwVar = (C56539bw) btVar.instance;
            bvVar.getClass();
            C62971cq cqVar = bwVar.f150981a;
            if (!cqVar.mo58948c()) {
                bwVar.f150981a = C62942bv.mutableCopy(cqVar);
            }
            bwVar.f150981a.add(bvVar);
        }
        PackageManager packageManager = context.getPackageManager();
        if (packageManager != null) {
            try {
                PackageInfo packageInfo = packageManager.getPackageInfo(context.getPackageName(), 0);
                if (packageInfo != null) {
                    if (!TextUtils.isEmpty(packageInfo.versionName)) {
                        str = packageInfo.versionName;
                    } else {
                        str = Integer.toString(packageInfo.versionCode);
                    }
                    C56535bs bsVar = (C56535bs) C56540bx.f150983c.createBuilder();
                    C56539bw bwVar2 = (C56539bw) btVar.build();
                    bsVar.copyOnWrite();
                    bwVar2.getClass();
                    ((C56540bx) bsVar.instance).f150985a = bwVar2;
                    bsVar.copyOnWrite();
                    str.getClass();
                    ((C56540bx) bsVar.instance).f150986b = str;
                    return (C56540bx) bsVar.build();
                }
            } catch (PackageManager.NameNotFoundException e) {
                Log.e("SurveyUtils", "Exception while retrieving application information.", e);
            }
        }
        str = "Unknown";
        C56535bs bsVar2 = (C56535bs) C56540bx.f150983c.createBuilder();
        C56539bw bwVar22 = (C56539bw) btVar.build();
        bsVar2.copyOnWrite();
        bwVar22.getClass();
        ((C56540bx) bsVar2.instance).f150985a = bwVar22;
        bsVar2.copyOnWrite();
        str.getClass();
        ((C56540bx) bsVar2.instance).f150986b = str;
        return (C56540bx) bsVar2.build();
    }

    /* renamed from: g */
    public static String m75986g(Context context) {
        try {
            return m76001v(context.getPackageManager().getPackageInfo(context.getPackageName(), 64));
        } catch (PackageManager.NameNotFoundException e) {
            Log.e("SurveyUtils", "Package not found.", e);
            return null;
        }
    }

    /* renamed from: h */
    public static String m75987h(String str) {
        if (TextUtils.isEmpty(str) || !Patterns.WEB_URL.matcher(C58890d.m90988c(str)).matches()) {
            Log.e("SurveyUtils", "Follow up URL was empty or invalid.");
            return BuildConfig.FLAVOR;
        }
        if (URLUtil.isHttpUrl(str) || URLUtil.isHttpsUrl(str)) {
            Uri parse = Uri.parse(str);
            try {
                if (C43054c.m75959b(C68371at.f184717a.mo6453a().mo60363a(C43054c.f112610b))) {
                    return new URI(parse.getScheme(), parse.getAuthority(), parse.getPath(), parse.getQuery(), (String) null).toString();
                }
                return new URI(parse.getScheme(), parse.getAuthority(), parse.getPath(), parse.getQuery() != null ? URLEncoder.encode(parse.getQuery(), "utf-8") : BuildConfig.FLAVOR).toString();
            } catch (UnsupportedEncodingException | URISyntaxException e) {
                Log.e("SurveyUtils", e.getMessage());
            }
        }
        Log.e("SurveyUtils", "Follow up URL is not http or https.");
        return BuildConfig.FLAVOR;
    }

    /* renamed from: i */
    static String m75988i() {
        return C68382g.m98765c(C43054c.f112610b);
    }

    /* renamed from: j */
    public static List m75989j(Context context, String str, Bundle bundle) {
        Resources resources = context.getResources();
        C56600z e = m75984e(context);
        C56597w wVar = e.f151117a;
        if (wVar == null) {
            wVar = C56597w.f151104d;
        }
        C62910ar arVar = wVar.f151108c;
        if (arVar == null) {
            arVar = C62910ar.f169858c;
        }
        C56593s sVar = wVar.f151106a;
        if (sVar == null) {
            sVar = C56593s.f151090c;
        }
        C56596v vVar = wVar.f151107b;
        if (vVar == null) {
            vVar = C56596v.f151094i;
        }
        C56599y yVar = e.f151118b;
        if (yVar == null) {
            yVar = C56599y.f151109e;
        }
        ArrayList arrayList = new ArrayList(15);
        long nanos = TimeUnit.SECONDS.toNanos(arVar.f169860a) + ((long) arVar.f169861b);
        m76002w(R.string.survey_email_address, str, arrayList, resources);
        m76002w(R.string.survey_timezone_offset, String.format("%02d:%02d:%02d", new Object[]{Long.valueOf(TimeUnit.NANOSECONDS.toHours(nanos)), Long.valueOf(TimeUnit.NANOSECONDS.toMinutes(nanos) - TimeUnit.HOURS.toMinutes(TimeUnit.NANOSECONDS.toHours(nanos))), Long.valueOf(TimeUnit.NANOSECONDS.toSeconds(nanos) - TimeUnit.MINUTES.toSeconds(TimeUnit.NANOSECONDS.toMinutes(nanos)))}), arrayList, resources);
        m76002w(R.string.survey_user_agent, sVar.f151092a, arrayList, resources);
        m76002w(R.string.survey_url, sVar.f151093b, arrayList, resources);
        m76002w(R.string.survey_device_model, vVar.f151096a, arrayList, resources);
        m76002w(R.string.survey_brand, vVar.f151097b, arrayList, resources);
        m76002w(R.string.survey_operating_system_version, vVar.f151099d, arrayList, resources);
        m76002w(R.string.survey_app_name, vVar.f151100e, arrayList, resources);
        m76002w(R.string.survey_app_id, vVar.f151101f, arrayList, resources);
        m76002w(R.string.survey_app_version, vVar.f151102g, arrayList, resources);
        m76002w(R.string.survey_google_play_services_version, vVar.f151103h, arrayList, resources);
        int i = vVar.f151098c;
        char c = i != 0 ? i != 1 ? i != 2 ? (char) 0 : 4 : 3 : 2;
        String str2 = "UNRECOGNIZED";
        m76002w(R.string.survey_operating_system, c == 0 ? str2 : c != 2 ? c != 3 ? "OS_TYPE_IOS" : "OS_TYPE_ANDROID" : "OS_TYPE_UNKNOWN", arrayList, resources);
        int i2 = yVar.f151111a;
        char c2 = i2 != 0 ? i2 != 1 ? i2 != 2 ? i2 != 3 ? (char) 0 : 5 : 4 : 3 : 2;
        if (c2 != 0) {
            str2 = c2 != 2 ? c2 != 3 ? c2 != 4 ? "PLATFORM_IOS" : "PLATFORM_ANDROID" : "PLATFORM_WEB" : "PLATFORM_UNKNOWN";
        }
        m76002w(R.string.survey_platform, str2, arrayList, resources);
        m76002w(R.string.survey_library_version, yVar.f151112b, arrayList, resources);
        StringBuilder sb = new StringBuilder();
        for (String str3 : bundle.keySet()) {
            Context context2 = context;
            sb.append(String.format("%s %s %s\n", new Object[]{str3, context.getString(R.string.survey_rightwards_arrow), bundle.get(str3)}));
        }
        m76002w(R.string.survey_application_data, sb.toString(), arrayList, resources);
        return arrayList;
    }

    /* renamed from: k */
    public static void m75990k(Activity activity, TextView textView, String str, C43065n nVar) {
        Resources resources = activity.getResources();
        if (C43054c.m75960c(C68368aq.f184713a.mo6453a().mo60360a(C43054c.f112610b)) && ((UiModeManager) C58886cw.m90973a(new C43061j(activity)).mo6453a()).getCurrentModeType() == 3) {
            textView.setText(resources.getString(R.string.survey_legal_text_car));
        } else {
            String string = resources.getString(R.string.survey_account_and_system_info);
            String string2 = resources.getString(R.string.survey_privacy);
            String string3 = resources.getString(R.string.survey_terms);
            SpannableString spannableString = new SpannableString(resources.getString(R.string.survey_legal_text, new Object[]{string, string2, string3}));
            m76003x(spannableString, string, new C43062k(nVar));
            m76003x(spannableString, string2, new C43063l(activity, str));
            m76003x(spannableString, string3, new C43064m(activity, str));
            textView.setMovementMethod(LinkMovementMethod.getInstance());
            textView.setText(spannableString);
        }
        if (C43054c.m75960c(C68362ak.f184703a.mo6453a().mo60355d(C43054c.f112610b))) {
            String packageName = activity.getPackageName();
            String[] split = TextUtils.split(C68362ak.f184703a.mo6453a().mo60352a(C43054c.f112610b), ",");
            int i = 0;
            while (true) {
                if (i >= r0) {
                    break;
                }
                split[i] = split[i].trim();
                i++;
            }
            for (String equals : split) {
                if (TextUtils.equals(equals, packageName)) {
                    C2043bi.m5526T(textView, new C43067p(textView));
                    return;
                }
            }
        }
    }

    /* renamed from: l */
    public static void m75991l(View view) {
        ((InputMethodManager) view.getContext().getSystemService("input_method")).hideSoftInputFromWindow(view.getWindowToken(), 0);
    }

    /* renamed from: m */
    public static void m75992m(ImageView imageView, Context context, int i) {
        Drawable drawable = imageView.getDrawable();
        if (drawable != null) {
            imageView.setImageDrawable(m75981b(drawable, context, i));
        }
    }

    /* renamed from: n */
    public static void m75993n(View view) {
        ((InputMethodManager) view.getContext().getSystemService("input_method")).showSoftInput(view, 0);
    }

    /* renamed from: o */
    public static boolean m75994o(Context context) {
        return ((AccessibilityManager) context.getSystemService("accessibility")).isEnabled();
    }

    /* renamed from: p */
    public static boolean m75995p(C56532bp bpVar) {
        C56534br brVar = bpVar.f150968d;
        if (brVar == null) {
            brVar = C56534br.f150971c;
        }
        return brVar.f150973a;
    }

    /* renamed from: q */
    public static boolean m75996q(C56565cv cvVar) {
        return cvVar != null && !cvVar.f151040a.isEmpty() && !cvVar.f151041b.mo59173M();
    }

    /* renamed from: r */
    public static boolean m75997r(C56532bp bpVar) {
        C56568cy cyVar;
        if (bpVar.f150969e.size() <= 1) {
            C56546cc ccVar = (C56546cc) bpVar.f150969e.get(0);
            int i = ccVar.f150999g;
            int a = C56545cb.m88209a(i);
            if (a != 0 && a == 3) {
                if (ccVar.f150993a == 4) {
                    cyVar = (C56568cy) ccVar.f150994b;
                } else {
                    cyVar = C56568cy.f151042c;
                }
                C56587m mVar = cyVar.f151044a;
                if (mVar == null) {
                    mVar = C56587m.f151083b;
                }
                for (C56585k kVar : mVar.f151085a) {
                    int a2 = C56583i.m88215a(kVar.f151078a);
                    if (a2 != 0 && a2 == 4) {
                        return true;
                    }
                }
                return false;
            }
            int a3 = C56545cb.m88209a(i);
            if (a3 != 0 && a3 == 5) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: s */
    public static Drawable m75998s(Context context) {
        return m75981b(C1877c.m5125a(context, R.drawable.survey_close_button_icon), context, C1878d.m5128a(context, R.color.survey_close_icon_color));
    }

    /* renamed from: t */
    public static boolean m75999t(long j) {
        return System.currentTimeMillis() - j > f112627b;
    }

    /* renamed from: u */
    public static void m76000u(Context context) {
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
        if (activeNetworkInfo == null || !activeNetworkInfo.isConnectedOrConnecting()) {
            Toast.makeText(context, context.getString(R.string.survey_network_request_failed), 0).show();
            return;
        }
        C0953a aVar = new C0953a();
        aVar.mo3569c(Color.parseColor("#eeeeee"));
        C0954b a = aVar.mo3567a();
        C0963k kVar = new C0963k();
        kVar.f3069c = a.mo3570a();
        try {
            kVar.mo3582a().mo3590a(context, Uri.parse("https://www.google.com/policies/terms/"));
        } catch (ActivityNotFoundException unused) {
            Log.e("SurveyUtils", "No app found to open URL: https://www.google.com/policies/terms/");
        }
    }

    /* renamed from: v */
    private static String m76001v(PackageInfo packageInfo) {
        if (packageInfo.signatures != null && packageInfo.signatures.length > 0) {
            try {
                byte[] digest = MessageDigest.getInstance("SHA1").digest(packageInfo.signatures[0].toByteArray());
                if (digest == null) {
                    return null;
                }
                int length = digest.length;
                StringBuilder sb = new StringBuilder(length + length);
                for (int i = 0; i < length; i++) {
                    sb.append(String.format("%02x", new Object[]{Byte.valueOf(digest[i])}));
                }
                return sb.toString();
            } catch (NoSuchAlgorithmException e) {
                Log.e("SurveyUtils", "Can't find SHA1.", e);
            }
        }
        return null;
    }

    /* renamed from: w */
    private static void m76002w(int i, String str, List list, Resources resources) {
        if (!TextUtils.isEmpty(str)) {
            list.add(new C1970e(resources.getString(i), str));
        }
    }

    /* renamed from: x */
    private static void m76003x(Spannable spannable, String str, ClickableSpan clickableSpan) {
        int indexOf = spannable.toString().indexOf(str);
        int length = str.length() + indexOf;
        if (indexOf >= 0) {
            spannable.setSpan(clickableSpan, indexOf, length, 0);
        }
    }
}
