package com.google.android.apps.gsa.shared.notificationlistening.collection;

import com.google.android.apps.gsa.shared.notificationlistening.common.C90421b;
import java.util.Comparator;
import java.util.List;

/* renamed from: com.google.android.apps.gsa.shared.notificationlistening.collection.aa */
/* compiled from: PG */
final class C90393aa implements Comparator {
    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        long j = ((C90421b) ((List) obj).get(0)).f252593n;
        long j2 = ((C90421b) ((List) obj2).get(0)).f252593n;
        if (j > j2) {
            return -1;
        }
        if (j < j2) {
            return 1;
        }
        return 0;
    }
}
