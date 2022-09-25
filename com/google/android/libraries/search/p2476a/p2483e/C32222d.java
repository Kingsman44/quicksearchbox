package com.google.android.libraries.search.p2476a.p2483e;

import com.google.common.base.C58817ah;
import com.google.common.base.C58827ar;
import com.google.common.base.C58869cf;
import java.util.ArrayList;
import p3186j$.util.Optional;

/* renamed from: com.google.android.libraries.search.a.e.d */
/* compiled from: PG */
public final /* synthetic */ class C32222d implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ String f86435a;

    public /* synthetic */ C32222d(String str) {
        this.f86435a = str;
    }

    public final Object apply(Object obj) {
        String str = this.f86435a;
        Optional optional = (Optional) obj;
        int i = C32230l.f86442a;
        if (optional.isEmpty()) {
            return str;
        }
        ArrayList arrayList = new ArrayList();
        boolean z = false;
        for (String str2 : C58869cf.m90938d("; ").mo56151a().mo56153g(str)) {
            if (str2.startsWith("NID=")) {
                arrayList.add("NID=".concat(String.valueOf((String) optional.get())));
                z = true;
            } else {
                arrayList.add(str2);
            }
        }
        if (!z) {
            arrayList.add("NID=".concat(String.valueOf((String) optional.get())));
        }
        return new C58827ar("; ").mo56097d(arrayList);
    }
}
