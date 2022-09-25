package com.google.android.apps.gsa.staticplugins.opa.p8625z.p8626a;

import com.google.android.apps.gsa.assistant.shared.f.a.g;
import com.google.common.base.C58817ah;
import com.google.protobuf.C62995dn;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.z.a.h */
/* compiled from: PG */
public final /* synthetic */ class C114539h implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ String f317632a;

    /* renamed from: b */
    public final /* synthetic */ Boolean f317633b;

    public /* synthetic */ C114539h(String str, Boolean bool) {
        this.f317632a = str;
        this.f317633b = bool;
    }

    public final Object apply(Object obj) {
        String str = this.f317632a;
        boolean booleanValue = this.f317633b.booleanValue();
        C62995dn dnVar = ((g) obj).b;
        if (dnVar.containsKey(str)) {
            booleanValue = ((Boolean) dnVar.get(str)).booleanValue();
        }
        return Boolean.valueOf(booleanValue);
    }
}
