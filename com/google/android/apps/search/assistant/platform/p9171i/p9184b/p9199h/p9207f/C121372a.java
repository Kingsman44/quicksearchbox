package com.google.android.apps.search.assistant.platform.p9171i.p9184b.p9199h.p9207f;

import com.google.android.apps.search.assistant.platform.p9171i.p9172a.p9178d.C121220ae;
import com.google.android.apps.search.assistant.platform.p9171i.p9172a.p9178d.C121250n;
import com.google.android.apps.search.assistant.platform.p9171i.p9172a.p9178d.C121251o;
import com.google.common.base.C58817ah;
import java.util.Collections;
import java.util.Map;

/* renamed from: com.google.android.apps.search.assistant.platform.i.b.h.f.a */
/* compiled from: PG */
public final /* synthetic */ class C121372a implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ String f337002a;

    public /* synthetic */ C121372a(String str) {
        this.f337002a = str;
    }

    public final Object apply(Object obj) {
        C121251o oVar;
        String str = this.f337002a;
        C121220ae aeVar = (C121220ae) obj;
        if (aeVar.f336744b == 5) {
            oVar = (C121251o) aeVar.f336745c;
        } else {
            oVar = C121251o.f336804b;
        }
        Map unmodifiableMap = Collections.unmodifiableMap(oVar.f336806a);
        if (!unmodifiableMap.containsKey(str)) {
            return C121250n.f336801b;
        }
        return (C121250n) unmodifiableMap.get(str);
    }
}
