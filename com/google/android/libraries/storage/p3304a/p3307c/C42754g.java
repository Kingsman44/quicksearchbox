package com.google.android.libraries.storage.p3304a.p3307c;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.google.android.libraries.storage.a.c.g */
/* compiled from: PG */
public final class C42754g {

    /* renamed from: a */
    public final String f112014a;

    /* renamed from: b */
    public final List f112015b;

    public C42754g(String str, List list) {
        ArrayList arrayList = new ArrayList();
        this.f112015b = arrayList;
        this.f112014a = str;
        if (list != null) {
            arrayList.addAll(list);
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(C42756i.m75529a(this.f112014a));
        if (this.f112015b.isEmpty()) {
            return sb.toString();
        }
        sb.append("(");
        sb.append(TextUtils.join(",", this.f112015b));
        sb.append(")");
        return sb.toString();
    }
}
