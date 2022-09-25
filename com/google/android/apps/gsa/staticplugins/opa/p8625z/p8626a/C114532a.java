package com.google.android.apps.gsa.staticplugins.opa.p8625z.p8626a;

import com.evernote.android.state.BuildConfig;
import com.google.android.apps.gsa.assistant.shared.f.a.g;
import com.google.android.apps.gsa.assistant.shared.l.e;
import com.google.common.base.C58817ah;
import com.google.protobuf.C62995dn;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.z.a.a */
/* compiled from: PG */
public final /* synthetic */ class C114532a implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ e f317619a;

    /* renamed from: b */
    public final /* synthetic */ String f317620b = BuildConfig.FLAVOR;

    public /* synthetic */ C114532a(e eVar) {
        this.f317619a = eVar;
    }

    public final Object apply(Object obj) {
        e eVar = this.f317619a;
        String str = this.f317620b;
        int i = eVar.ca;
        C62995dn dnVar = ((g) obj).d;
        Integer valueOf = Integer.valueOf(i);
        return dnVar.containsKey(valueOf) ? (String) dnVar.get(valueOf) : str;
    }
}
