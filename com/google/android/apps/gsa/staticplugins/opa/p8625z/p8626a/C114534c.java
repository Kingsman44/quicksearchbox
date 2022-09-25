package com.google.android.apps.gsa.staticplugins.opa.p8625z.p8626a;

import com.google.android.apps.gsa.assistant.shared.f.a.b;
import com.google.android.apps.gsa.assistant.shared.f.a.g;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;
import com.google.protobuf.C62995dn;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.z.a.c */
/* compiled from: PG */
public final /* synthetic */ class C114534c implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ String f317623a;

    /* renamed from: b */
    public final /* synthetic */ Integer f317624b;

    public /* synthetic */ C114534c(String str, Integer num) {
        this.f317623a = str;
        this.f317624b = num;
    }

    public final C60870cx apply(Object obj) {
        String str = this.f317623a;
        Integer num = this.f317624b;
        b builder = ((g) obj).toBuilder();
        int intValue = num.intValue();
        builder.copyOnWrite();
        g gVar = builder.instance;
        C62995dn dnVar = gVar.a;
        if (!dnVar.f170058b) {
            gVar.a = dnVar.mo58980a();
        }
        gVar.a.put(str, Integer.valueOf(intValue));
        return C60856cj.m92900i(builder.build());
    }
}
