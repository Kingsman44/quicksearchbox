package com.google.android.apps.gsa.staticplugins.nga.p8044a.p8045a;

import android.os.Build;
import com.google.android.apps.gsa.shared.util.C90772bp;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58528ij;

/* renamed from: com.google.android.apps.gsa.staticplugins.nga.a.a.bd */
/* compiled from: PG */
final class C102922bd {

    /* renamed from: a */
    private static final C58485gu f287414a = C58485gu.m89846n("Pixel *");

    /* renamed from: b */
    private static final C58528ij f287415b = C58528ij.m90015O("Pixel C", "Pixel", "Pixel XL", "Pixel 2", "Pixel 2 XL", "Pixel 3", "Pixel 3 XL", "Pixel 3a", "Pixel 3a XL");

    /* renamed from: a */
    public static boolean m170702a() {
        if (C90772bp.m148274A(f287414a, Build.MODEL) && !f287415b.contains(Build.MODEL)) {
            return true;
        }
        return false;
    }
}
