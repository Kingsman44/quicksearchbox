package com.google.android.apps.gsa.shared.notificationlistening.collection;

import androidx.core.app.C1787ad;
import java.util.Comparator;

/* renamed from: com.google.android.apps.gsa.shared.notificationlistening.collection.l */
/* compiled from: PG */
final class C90405l implements Comparator {
    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        long j = ((C1787ad) obj2).f5569b;
        long j2 = ((C1787ad) obj).f5569b;
        if (j < j2) {
            return -1;
        }
        return j != j2 ? 1 : 0;
    }
}
