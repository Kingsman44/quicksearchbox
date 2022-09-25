package com.google.android.libraries.storage.p3304a.p3307c;

import android.text.TextUtils;
import com.google.android.libraries.storage.p3304a.p3307c.p3308a.C42748i;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.google.android.libraries.storage.a.c.e */
/* compiled from: PG */
public final class C42752e {

    /* renamed from: a */
    public final String f112010a;

    /* renamed from: b */
    public final List f112011b;

    public C42752e(String str, List list) {
        ArrayList arrayList = new ArrayList();
        this.f112011b = arrayList;
        C42748i.m75526a(!list.isEmpty(), "Missing param values", new Object[0]);
        this.f112010a = str;
        arrayList.addAll(list);
    }

    public final String toString() {
        return C42756i.m75529a(this.f112010a) + "=" + TextUtils.join("+", this.f112011b);
    }
}
