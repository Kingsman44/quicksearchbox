package com.google.android.apps.search.faceviewer.p10090b;

import android.content.Intent;
import android.net.Uri;
import android.util.Base64;
import com.google.android.libraries.search.assistant.fluidactions.rendering.p2561ui.p2565b.C33259r;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.protobuf.C62921ba;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62974ct;
import com.google.protos.youtube.p5162a.p5163a.C65989f;
import java.util.Set;
import java.util.regex.Pattern;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.search.faceviewer.b.a */
/* compiled from: PG */
public final class C132677a {

    /* renamed from: a */
    private static final C59071e f362056a = C59071e.m91332i("com.google.android.apps.search.faceviewer.b.a");

    /* renamed from: b */
    private static final String[] f362057b = new String[0];

    /* renamed from: c */
    private static final Pattern f362058c = Pattern.compile("^[a-zA-Z0-9]+$");

    /* renamed from: d */
    private static final Pattern f362059d = Pattern.compile("^[a-zA-Z0-9-]+$");

    /* renamed from: e */
    private static final int f362060e = 3;

    private C132677a() {
    }

    /* renamed from: a */
    public static int m215667a(Intent intent) {
        return intent.getIntExtra("iiio", 0);
    }

    /* renamed from: b */
    public static Intent m215668b(Intent intent) {
        String queryParameter;
        String queryParameter2;
        String action = intent.getAction();
        Uri data = intent.getData();
        if (action == null || !action.equals("android.intent.action.VIEW") || data == null || data.getScheme() == null || data.getHost() == null || data.getPath() == null || ((!"faceviewer".equals(data.getScheme()) && !"https".equals(data.getScheme())) || !"arvr.google.com".equals(data.getHost()) || !"/faceviewer".equals(data.getPath()))) {
            return null;
        }
        Set<String> queryParameterNames = data.getQueryParameterNames();
        Intent intent2 = new Intent("android.intent.action.VIEW");
        if (!m215674h(queryParameterNames, data, "arbi", f362058c, intent2) && !m215674h(queryParameterNames, data, "eil", f362059d, intent2)) {
            return null;
        }
        if (queryParameterNames.contains(C33259r.f88929b)) {
            intent2.putExtra(C33259r.f88929b, data.getQueryParameter(C33259r.f88929b));
        }
        if (queryParameterNames.contains("wturl")) {
            intent2.putExtra("wturl", data.getQueryParameter("wturl"));
        }
        if (queryParameterNames.contains("iiio") && (queryParameter2 = data.getQueryParameter("iiio")) != null) {
            try {
                intent2.putExtra("iiio", Integer.parseInt(queryParameter2));
            } catch (NumberFormatException e) {
                ((C59052c) ((C59052c) ((C59052c) f362056a.mo56226d()).mo56382g(e)).mo56372aa(39791)).mo56386p("Initial index parsing failed.");
            }
        }
        if (queryParameterNames.contains("data") && (queryParameter = data.getQueryParameter("data")) != null) {
            byte[] decode = Base64.decode(queryParameter, 8);
            try {
                C65989f fVar = (C65989f) C62942bv.parseFrom((C62942bv) C65989f.f179473d, decode, C62921ba.m95368a());
                int i = fVar.f179475a;
                if (!((i & 1) == 0 || (i & 2) == 0)) {
                    Uri.Builder buildUpon = Uri.parse("https://www.google.com/search").buildUpon();
                    buildUpon.appendQueryParameter("q", fVar.f179476b);
                    buildUpon.appendQueryParameter("stick", fVar.f179477c);
                    intent2.putExtra("ctaurl", buildUpon.build().toString());
                }
            } catch (C62974ct e2) {
                ((C59052c) ((C59052c) ((C59052c) f362056a.mo56226d()).mo56382g(e2)).mo56372aa(39790)).mo56386p("Unable to parse protocol buffer for FaceViewerDeeplinkData.");
            }
        }
        return intent2;
    }

    /* renamed from: c */
    public static Optional m215669c(Intent intent) {
        return Optional.ofNullable(intent.getStringExtra("ctaurl"));
    }

    /* renamed from: d */
    public static String m215670d(Intent intent) {
        String stringExtra = intent.getStringExtra("arbi");
        return stringExtra != null ? stringExtra : "1373948001335917715";
    }

    /* renamed from: e */
    public static String m215671e(Intent intent) {
        String stringExtra = intent.getStringExtra("wturl");
        return stringExtra != null ? stringExtra : "https://www.gstatic.com/vr/ads/youtube_ar_companion/prod/templates/ar_companion_carousel/";
    }

    /* renamed from: f */
    public static String[] m215672f(Intent intent) {
        String stringExtra = intent.getStringExtra("eil");
        return stringExtra != null ? stringExtra.split("-") : f362057b;
    }

    /* renamed from: g */
    public static int m215673g(Intent intent) {
        if (C59002s.f156871a.equals(intent.getStringExtra("env"))) {
            return 2;
        }
        return f362060e;
    }

    /* renamed from: h */
    private static boolean m215674h(Set set, Uri uri, String str, Pattern pattern, Intent intent) {
        String queryParameter;
        if (!set.contains(str) || (queryParameter = uri.getQueryParameter(str)) == null || !pattern.matcher(queryParameter).matches()) {
            return false;
        }
        intent.putExtra(str, queryParameter);
        return true;
    }
}
