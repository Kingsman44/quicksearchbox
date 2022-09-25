package com.google.android.apps.gsa.staticplugins.opa.deviceregistration.p8358c;

import android.os.Bundle;
import com.google.android.libraries.search.p2998g.p2999a.C38342ab;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.deviceregistration.c.e */
/* compiled from: PG */
public final class C108600e {
    /* renamed from: a */
    public static String m180596a(Bundle bundle) {
        if (bundle != null) {
            return bundle.getString("link_provider_id");
        }
        return null;
    }

    /* renamed from: b */
    public static String m180597b(Bundle bundle) {
        if (bundle != null) {
            return bundle.getString("source_package_name");
        }
        return null;
    }

    /* renamed from: c */
    public static String m180598c(Bundle bundle) {
        if (bundle != null) {
            return bundle.getString("source_return_url");
        }
        return null;
    }

    /* renamed from: d */
    public static String m180599d(Bundle bundle) {
        if (bundle != null) {
            return bundle.getString("unlink_provider_id");
        }
        return null;
    }

    /* renamed from: e */
    public static String m180600e(List list, String str) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C38342ab abVar = (C38342ab) it.next();
            if (str.equals(abVar.f101526b)) {
                return abVar.f101527c;
            }
        }
        return null;
    }

    /* renamed from: f */
    public static boolean m180601f(Bundle bundle) {
        return bundle != null && bundle.getBoolean("should_return_source_url_errors", false);
    }

    /* renamed from: g */
    public static boolean m180602g(Bundle bundle) {
        return bundle != null && bundle.getBoolean("should_trigger_port", false);
    }
}
