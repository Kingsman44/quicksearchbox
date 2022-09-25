package com.google.android.apps.gsa.shared.notificationlistening.collection.p7121a;

import java.util.List;
import java.util.Locale;

/* renamed from: com.google.android.apps.gsa.shared.notificationlistening.collection.a.z */
/* compiled from: PG */
final class C90392z extends C90362aa {

    /* renamed from: b */
    private final List f252458b;

    public C90392z(List list) {
        super(2);
        this.f252458b = list;
    }

    /* renamed from: a */
    public final boolean mo84073a() {
        List list = this.f252458b;
        return list == null || !list.contains(Locale.getDefault());
    }
}
