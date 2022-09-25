package com.google.android.libraries.mdi.download.p2236d.p2242f;

import android.content.Context;
import android.net.Uri;
import com.google.android.libraries.mdi.download.C29658ia;
import com.google.android.libraries.mdi.download.p2236d.p2241e.C29045l;
import com.google.android.libraries.storage.p3304a.p3305a.C42718e;
import com.google.android.libraries.storage.p3304a.p3305a.C42719f;
import com.google.android.libraries.storage.p3304a.p3305a.C42724k;
import com.google.android.libraries.storage.p3304a.p3305a.C42725l;
import com.google.common.base.C58833ax;

/* renamed from: com.google.android.libraries.mdi.download.d.f.d */
/* compiled from: PG */
public final class C29090d {
    /* renamed from: a */
    public static Uri m53980a(Context context, C58833ax axVar) {
        String str;
        C42718e a = C42719f.m75461a(context);
        if (axVar == null || !axVar.mo56113h()) {
            str = "datadownload";
        } else {
            str = (String) axVar.mo56107c();
        }
        C42719f.m75463c(str);
        a.f111968c = str;
        if (axVar != null && axVar.mo56113h()) {
            a.mo45821b("datadownload");
        }
        return a.mo45820a();
    }

    /* renamed from: b */
    public static Uri m53981b(Context context, C58833ax axVar) {
        return m53980a(context, axVar).buildUpon().appendPath("links").build();
    }

    /* renamed from: c */
    public static Uri m53982c(Context context, String str) {
        int i = C42725l.f111984a;
        return C42724k.m75484a(str, context.getPackageName(), 0);
    }

    /* renamed from: d */
    public static String m53983d(String str, C58833ax axVar) {
        if (axVar != null && axVar.mo56113h()) {
            str = str.concat(String.valueOf((String) axVar.mo56107c()));
        }
        return str.concat(".pb");
    }

    /* renamed from: f */
    public static String m53985f(int i) {
        int i2 = i - 1;
        return i2 != 0 ? i2 != 1 ? "public_3p" : "private" : "public";
    }

    /* renamed from: g */
    public static Uri m53986g(Context context) {
        C42718e a = C42719f.m75461a(context);
        C42719f.m75463c("datadownloadmanifest");
        a.f111968c = "datadownloadmanifest";
        a.mo45821b("datadownload");
        return a.mo45820a();
    }

    /* renamed from: e */
    public static Uri m53984e(Context context, int i, String str, String str2, C29658ia iaVar, C58833ax axVar, boolean z) {
        if (!z) {
            return m53980a(context, axVar).buildUpon().appendPath(m53985f(i)).build().buildUpon().appendPath(str).build();
        }
        try {
            return m53982c(context, str2);
        } catch (Exception e) {
            C29045l.m53938j(e, "%s: Unable to create mobstore uri for file %s.", "DirectoryUtil", str);
            iaVar.mo34497a(e, "Unable to create mobstore uri for file", new Object[0]);
            return null;
        }
    }
}
