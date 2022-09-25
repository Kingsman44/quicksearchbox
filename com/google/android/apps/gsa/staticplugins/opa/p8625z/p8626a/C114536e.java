package com.google.android.apps.gsa.staticplugins.opa.p8625z.p8626a;

import com.evernote.android.state.BuildConfig;
import com.google.android.apps.gsa.assistant.shared.f.a.g;
import com.google.common.base.C58817ah;
import com.google.protobuf.C62995dn;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.z.a.e */
/* compiled from: PG */
public final /* synthetic */ class C114536e implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ String f317626a = "opa_active_dates";

    /* renamed from: b */
    public final /* synthetic */ String f317627b = BuildConfig.FLAVOR;

    public final Object apply(Object obj) {
        String str = this.f317626a;
        String str2 = this.f317627b;
        C62995dn dnVar = ((g) obj).c;
        return dnVar.containsKey(str) ? (String) dnVar.get(str) : str2;
    }
}
