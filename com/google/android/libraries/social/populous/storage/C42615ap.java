package com.google.android.libraries.social.populous.storage;

import com.google.common.base.C58839bc;
import java.util.List;

/* renamed from: com.google.android.libraries.social.populous.storage.ap */
/* compiled from: PG */
public final /* synthetic */ class C42615ap implements C58839bc {

    /* renamed from: a */
    public final /* synthetic */ List f111813a;

    public /* synthetic */ C42615ap(List list) {
        this.f111813a = list;
    }

    /* renamed from: a */
    public final boolean mo5941a(Object obj) {
        String str = (String) obj;
        return str.startsWith("peopleCache") && str.endsWith(".db") && !this.f111813a.contains(str);
    }
}
