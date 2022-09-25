package com.google.android.apps.gsa.shared.notificationlistening.collection;

import com.google.android.apps.gsa.shared.notificationlistening.collection.p7121a.C90367af;
import java.util.Comparator;

/* renamed from: com.google.android.apps.gsa.shared.notificationlistening.collection.n */
/* compiled from: PG */
public final /* synthetic */ class C90407n implements Comparator {

    /* renamed from: a */
    public static final /* synthetic */ C90407n f252489a = new C90407n();

    private /* synthetic */ C90407n() {
    }

    public final int compare(Object obj, Object obj2) {
        return Long.valueOf(((C90367af) obj).f252393a.getPostTime()).compareTo(Long.valueOf(((C90367af) obj2).f252393a.getPostTime()));
    }
}
