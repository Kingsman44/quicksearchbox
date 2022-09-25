package com.google.android.apps.gsa.shared.notificationlistening.collection.p7121a;

import java.util.List;
import java.util.Locale;

/* renamed from: com.google.android.apps.gsa.shared.notificationlistening.collection.a.ab */
/* compiled from: PG */
final class C90363ab extends C90362aa {

    /* renamed from: b */
    private final List f252384b;

    public C90363ab(int i, List list) {
        super(i);
        this.f252384b = list;
    }

    /* renamed from: a */
    public final boolean mo84073a() {
        List list = this.f252384b;
        return list == null || list.contains(Locale.getDefault());
    }
}
