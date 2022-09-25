package com.google.android.apps.search.fedora.p10092a;

import com.google.common.base.C58817ah;

/* renamed from: com.google.android.apps.search.fedora.a.i */
/* compiled from: PG */
public final /* synthetic */ class C132703i implements C58817ah {

    /* renamed from: a */
    public static final /* synthetic */ C132703i f362119a = new C132703i();

    private /* synthetic */ C132703i() {
    }

    public final Object apply(Object obj) {
        String str = (String) obj;
        boolean z = false;
        if (str != null && (str.endsWith("@gmail.com") || str.endsWith("@googlemail.com"))) {
            z = true;
        }
        return Boolean.valueOf(z);
    }
}
