package com.google.android.apps.gsa.staticplugins.opa.p8625z.p8626a;

import com.google.android.apps.gsa.assistant.shared.f.a.b;
import com.google.android.apps.gsa.assistant.shared.f.a.g;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;
import com.google.protobuf.C62995dn;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.z.a.d */
/* compiled from: PG */
public final /* synthetic */ class C114535d implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ String f317625a;

    public /* synthetic */ C114535d(String str) {
        this.f317625a = str;
    }

    public final C60870cx apply(Object obj) {
        String str = this.f317625a;
        b builder = ((g) obj).toBuilder();
        str.getClass();
        builder.copyOnWrite();
        g gVar = builder.instance;
        C62995dn dnVar = gVar.c;
        if (!dnVar.f170058b) {
            gVar.c = dnVar.mo58980a();
        }
        gVar.c.put("opa_active_dates", str);
        return C60856cj.m92900i(builder.build());
    }
}
