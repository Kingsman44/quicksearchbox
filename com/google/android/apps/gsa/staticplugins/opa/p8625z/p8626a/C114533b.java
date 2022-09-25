package com.google.android.apps.gsa.staticplugins.opa.p8625z.p8626a;

import com.google.android.apps.gsa.assistant.shared.f.a.g;
import com.google.common.base.C58817ah;
import com.google.protobuf.C62995dn;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.z.a.b */
/* compiled from: PG */
public final /* synthetic */ class C114533b implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ String f317621a;

    /* renamed from: b */
    public final /* synthetic */ Integer f317622b;

    public /* synthetic */ C114533b(String str, Integer num) {
        this.f317621a = str;
        this.f317622b = num;
    }

    public final Object apply(Object obj) {
        String str = this.f317621a;
        int intValue = this.f317622b.intValue();
        C62995dn dnVar = ((g) obj).a;
        if (dnVar.containsKey(str)) {
            intValue = ((Integer) dnVar.get(str)).intValue();
        }
        return Integer.valueOf(intValue);
    }
}
