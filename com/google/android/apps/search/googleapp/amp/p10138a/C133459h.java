package com.google.android.apps.search.googleapp.amp.p10138a;

import android.net.Uri;
import com.google.common.base.C58837ba;
import java.util.Map;
import java.util.TreeMap;
import p3186j$.util.Collection;

/* renamed from: com.google.android.apps.search.googleapp.amp.a.h */
/* compiled from: PG */
public final class C133459h {

    /* renamed from: a */
    public final Map f363658a;

    /* renamed from: b */
    private final Uri f363659b;

    /* renamed from: c */
    private final Map f363660c;

    public C133459h(Uri uri) {
        this.f363659b = uri;
        TreeMap treeMap = new TreeMap();
        Collection.EL.stream(uri.getQueryParameterNames()).forEach(new C133458g(treeMap, uri));
        this.f363658a = treeMap;
        String encodedFragment = uri.getEncodedFragment();
        TreeMap treeMap2 = new TreeMap();
        if (!C58837ba.m90859h(encodedFragment)) {
            for (String split : encodedFragment.split("&", -1)) {
                String[] split2 = split.split("=", -1);
                if (split2.length == 2 && split2[0].length() > 0 && split2[1].length() > 0) {
                    treeMap2.put(split2[0], split2[1]);
                }
            }
        }
        this.f363660c = treeMap2;
    }

    /* renamed from: e */
    private static String m216621e(Map map) {
        StringBuilder sb = new StringBuilder();
        for (Map.Entry entry : map.entrySet()) {
            if (sb.length() > 0) {
                sb.append("&");
            }
            sb.append((String) entry.getKey());
            sb.append("=");
            sb.append((String) entry.getValue());
        }
        return sb.toString();
    }

    /* renamed from: a */
    public final Uri mo111163a() {
        return this.f363659b.buildUpon().encodedQuery(m216621e(this.f363658a)).encodedFragment(m216621e(this.f363660c)).build();
    }

    /* renamed from: b */
    public final void mo111164b(String str) {
        this.f363660c.remove(str);
    }

    /* renamed from: c */
    public final void mo111165c(String str, String str2) {
        this.f363660c.put(str, str2);
    }

    /* renamed from: d */
    public final void mo111166d(String str, String str2) {
        this.f363658a.put(str, str2);
    }
}
