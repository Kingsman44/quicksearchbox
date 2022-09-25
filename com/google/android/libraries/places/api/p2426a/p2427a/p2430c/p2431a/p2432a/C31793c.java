package com.google.android.libraries.places.api.p2426a.p2427a.p2430c.p2431a.p2432a;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.places.api.model.TypeFilter;
import com.google.common.p4522b.C58490gz;
import com.google.common.p4522b.C58495hd;

/* renamed from: com.google.android.libraries.places.api.a.a.c.a.a.c */
/* compiled from: PG */
public final class C31793c {

    /* renamed from: a */
    private static final C58495hd f85417a;

    static {
        C58490gz gzVar = new C58490gz(4);
        gzVar.mo55429h(TypeFilter.ADDRESS, "address");
        gzVar.mo55429h(TypeFilter.CITIES, "(cities)");
        gzVar.mo55429h(TypeFilter.ESTABLISHMENT, "establishment");
        gzVar.mo55429h(TypeFilter.GEOCODE, "geocode");
        gzVar.mo55429h(TypeFilter.REGIONS, "(regions)");
        f85417a = gzVar.mo55427f(true);
    }

    /* renamed from: a */
    public static String m59158a(TypeFilter typeFilter) {
        String str = (String) f85417a.get(typeFilter);
        return str == null ? BuildConfig.FLAVOR : str;
    }
}
