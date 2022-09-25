package com.google.android.apps.gsa.shared.util.p7174l;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.apps.gsa.shared.search.Query;
import com.google.android.libraries.search.logging.p3043f.C39193b;
import com.google.common.p4552o.C60547ty;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Locale;
import java.util.Set;

/* renamed from: com.google.android.apps.gsa.shared.util.l.a */
/* compiled from: PG */
public final class C91053a {
    /* renamed from: a */
    public static String m148741a(String str, String str2) {
        return str + "." + str2;
    }

    /* renamed from: b */
    public static String m148742b(Bundle bundle) {
        bundle.setClassLoader(Query.class.getClassLoader());
        return bundle.getString("source");
    }

    /* renamed from: c */
    public static String m148743c(Intent intent) {
        String a = m148741a(intent.getComponent() == null ? "i" : "e", m148745e(intent.getAction()));
        Set<String> categories = intent.getCategories();
        if (categories == null) {
            return a;
        }
        ArrayList arrayList = new ArrayList();
        for (String e : categories) {
            arrayList.add(m148745e(e));
        }
        Collections.sort(arrayList);
        return m148741a(a, TextUtils.join(".", arrayList));
    }

    /* renamed from: d */
    public static void m148744d(Intent intent, C60547ty tyVar) {
        if (TextUtils.isEmpty(C39193b.m68624a(intent))) {
            intent.putExtra("source", m148741a(m148741a("and.gsa.d.at", String.valueOf(tyVar.f164058x)), m148743c(intent)));
        }
    }

    /* renamed from: e */
    static String m148745e(String str) {
        if (str == null) {
            return "nil";
        }
        String lowerCase = str.substring(str.lastIndexOf(46) + 1).toLowerCase(Locale.ENGLISH);
        return lowerCase.substring(0, Math.min(3, lowerCase.length()));
    }
}
