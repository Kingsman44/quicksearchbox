package com.google.android.apps.gsa.shared.util;

import android.content.Context;
import android.content.pm.PackageManager;
import com.evernote.android.state.BuildConfig;
import com.google.common.base.C58837ba;
import com.google.common.base.C58869cf;
import com.google.common.p4522b.C58557jl;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.p4526f.p4527a.C58974d;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

/* renamed from: com.google.android.apps.gsa.shared.util.bq */
/* compiled from: PG */
public final class C90773bq {

    /* renamed from: a */
    private static final C58974d f253865a = C58974d.m91136j();

    /* renamed from: b */
    private static final C58869cf f253866b = C58869cf.m90937c(C58837ba.m90854c("\\."));

    /* renamed from: a */
    public static int m148319a(String str) {
        return Integer.parseInt((String) C58557jl.m90128i(f253866b.mo56153g(str), 0));
    }

    /* renamed from: b */
    public static int m148320b(String str) {
        return Integer.parseInt((String) C58557jl.m90128i(f253866b.mo56153g(str), 1));
    }

    /* renamed from: c */
    public static String m148321c(Context context) {
        return context.getPackageManager().getPackageInfo("com.google.android.googlequicksearchbox", 0).versionName;
    }

    /* renamed from: d */
    public static String m148322d(String str) {
        if (str.isEmpty()) {
            return BuildConfig.FLAVOR;
        }
        return String.format(Locale.US, "%s.%s.%s", new Object[]{Integer.valueOf(m148319a(str)), Integer.valueOf(m148320b(str)), Integer.valueOf(Integer.parseInt((String) C58557jl.m90128i(f253866b.mo56153g(str), 2)))});
    }

    /* renamed from: e */
    public static String m148323e(Context context) {
        try {
            String c = m148321c(context);
            return String.format("%s.%s", new Object[]{Integer.valueOf(m148319a(c)), Integer.valueOf(m148320b(c))});
        } catch (PackageManager.NameNotFoundException e) {
            ((C58970a) ((C58970a) ((C58970a) f253865a.mo56226d()).mo56382g(e)).mo56372aa(11346)).mo56386p("AppVersion not found, returning 0.0.");
            return "0.0";
        }
    }

    /* renamed from: f */
    public static boolean m148324f(String str, String str2) {
        int intValue;
        int intValue2;
        List g = m148325g(str);
        List g2 = m148325g(str2);
        int i = 0;
        while (i < g.size() && i < g2.size() && (intValue = ((Integer) g.get(i)).intValue()) <= (intValue2 = ((Integer) g2.get(i)).intValue())) {
            if (intValue < intValue2) {
                return false;
            }
            i++;
        }
        return true;
    }

    /* renamed from: g */
    private static List m148325g(String str) {
        Iterable<String> g = f253866b.mo56153g(str);
        ArrayList arrayList = new ArrayList();
        for (String parseInt : g) {
            arrayList.add(Integer.valueOf(Integer.parseInt(parseInt)));
        }
        return arrayList;
    }
}
