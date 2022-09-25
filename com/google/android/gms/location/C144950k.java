package com.google.android.gms.location;

import com.google.android.gms.common.internal.C143919bh;
import java.util.Comparator;

/* renamed from: com.google.android.gms.location.k */
/* compiled from: PG */
final class C144950k implements Comparator {
    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        ActivityTransition activityTransition = (ActivityTransition) obj;
        ActivityTransition activityTransition2 = (ActivityTransition) obj2;
        C143919bh.m233958a(activityTransition);
        C143919bh.m233958a(activityTransition2);
        int i = activityTransition.f391729a;
        int i2 = activityTransition2.f391729a;
        if (i != i2) {
            return i >= i2 ? 1 : -1;
        }
        int i3 = activityTransition.f391730b;
        int i4 = activityTransition2.f391730b;
        if (i3 == i4) {
            return 0;
        }
        return i3 < i4 ? -1 : 1;
    }
}
