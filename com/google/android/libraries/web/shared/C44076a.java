package com.google.android.libraries.web.shared;

import android.net.Uri;
import android.text.TextUtils;
import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.p10983ae.p10984a.C147476u;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: com.google.android.libraries.web.shared.a */
/* compiled from: PG */
public final class C44076a {

    /* renamed from: a */
    private static final C59071e f114745a = C59071e.m91332i("com.google.android.libraries.web.shared.a");

    /* renamed from: b */
    private static final Pattern f114746b = Pattern.compile("^https?://((\\w|-)+)\\.cdn\\.ampproject\\.org/.*$");

    /* renamed from: a */
    public static Uri m77818a(String str) {
        Uri parse = Uri.parse(str);
        if (!parse.isHierarchical()) {
            return new Uri.Builder().build();
        }
        String host = parse.getHost();
        if (parse.getPort() != -1) {
            host = host + ":" + parse.getPort();
        }
        return new Uri.Builder().scheme(parse.getScheme()).encodedAuthority(host).build();
    }

    /* renamed from: b */
    public static Uri m77819b(Uri uri) {
        if (!uri.isHierarchical()) {
            return uri;
        }
        String queryParameter = uri.getQueryParameter("url");
        String queryParameter2 = uri.getQueryParameter(C147476u.f398081a);
        if (!"www.google.com".equals(uri.getHost()) || !"/url".equals(uri.getPath()) || TextUtils.isEmpty(queryParameter)) {
            boolean z = true;
            if (!"/sp".equals(uri.getPath()) && !"/i".equals(uri.getPath())) {
                z = false;
            }
            if ("googleweblight.com".equals(uri.getHost()) && z && !TextUtils.isEmpty(queryParameter2)) {
                uri = Uri.parse(queryParameter2);
            }
        } else {
            uri = Uri.parse(queryParameter);
        }
        return "/".equals(uri.getPath()) ? uri.buildUpon().path((String) null).build() : uri;
    }

    /* renamed from: c */
    public static String m77820c(String str) {
        if (str == null) {
            return null;
        }
        Matcher matcher = f114746b.matcher(str);
        if (!matcher.matches()) {
            return null;
        }
        String group = matcher.group(1);
        if (group.startsWith("-") || group.endsWith("-") || group.contains("---")) {
            ((C59052c) ((C59052c) f114745a.mo56226d()).mo56372aa(54164)).mo56386p("Publisher domain extracted from AMP URL has incorrect format");
            return null;
        }
        StringBuilder sb = new StringBuilder(group);
        for (int i = 1; i < sb.length() - 1; i++) {
            if (!(sb.charAt(i - 1) == '-' || sb.charAt(i) != '-' || sb.charAt(i + 1) == '-')) {
                sb.setCharAt(i, '.');
            }
        }
        return sb.toString().replace("--", "-");
    }

    /* renamed from: d */
    public static String m77821d(String str) {
        Uri parse = Uri.parse(str);
        if (TextUtils.equals(parse.getPath(), BuildConfig.FLAVOR)) {
            parse = parse.buildUpon().path("/").build();
        }
        return parse.toString();
    }

    /* renamed from: e */
    public static String m77822e(String str) {
        return m77819b(Uri.parse(str)).toString();
    }

    /* renamed from: f */
    public static boolean m77823f(Uri uri) {
        return TextUtils.equals(uri.getScheme(), "https");
    }
}
