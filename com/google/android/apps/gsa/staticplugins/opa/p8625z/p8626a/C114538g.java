package com.google.android.apps.gsa.staticplugins.opa.p8625z.p8626a;

import com.google.android.apps.gsa.assistant.shared.f.a.b;
import com.google.android.apps.gsa.assistant.shared.f.a.g;
import com.google.android.apps.gsa.assistant.shared.l.e;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;
import com.google.protobuf.C62995dn;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.z.a.g */
/* compiled from: PG */
public final /* synthetic */ class C114538g implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ e f317630a;

    /* renamed from: b */
    public final /* synthetic */ String f317631b;

    public /* synthetic */ C114538g(e eVar, String str) {
        this.f317630a = eVar;
        this.f317631b = str;
    }

    public final C60870cx apply(Object obj) {
        e eVar = this.f317630a;
        String str = this.f317631b;
        b builder = ((g) obj).toBuilder();
        int i = eVar.ca;
        str.getClass();
        builder.copyOnWrite();
        g gVar = builder.instance;
        C62995dn dnVar = gVar.d;
        if (!dnVar.f170058b) {
            gVar.d = dnVar.mo58980a();
        }
        gVar.d.put(Integer.valueOf(i), str);
        return C60856cj.m92900i(builder.build());
    }
}
