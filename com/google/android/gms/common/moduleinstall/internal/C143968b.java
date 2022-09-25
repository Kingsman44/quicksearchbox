package com.google.android.gms.common.moduleinstall.internal;

import com.google.android.gms.common.Feature;
import java.util.Comparator;

/* renamed from: com.google.android.gms.common.moduleinstall.internal.b */
/* compiled from: PG */
public final /* synthetic */ class C143968b implements Comparator {

    /* renamed from: a */
    public static final /* synthetic */ C143968b f390202a = new C143968b();

    private /* synthetic */ C143968b() {
    }

    public final int compare(Object obj, Object obj2) {
        Feature feature = (Feature) obj;
        Feature feature2 = (Feature) obj2;
        if (!feature.f389577a.equals(feature2.f389577a)) {
            return feature.f389577a.compareTo(feature2.f389577a);
        }
        return (feature.mo119073a() > feature2.mo119073a() ? 1 : (feature.mo119073a() == feature2.mo119073a() ? 0 : -1));
    }
}
