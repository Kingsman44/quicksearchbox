package com.google.android.apps.gsa.staticplugins.opa.p8205am;

import com.google.android.apps.gsa.assistant.shared.k.a.a;
import com.google.android.apps.gsa.assistant.shared.k.a.d;
import com.google.common.base.C58817ah;
import com.google.common.p4552o.C59688cc;
import com.google.common.p4552o.C59689cd;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.am.i */
/* compiled from: PG */
public final /* synthetic */ class C106384i implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ String f296736a;

    public /* synthetic */ C106384i(String str) {
        this.f296736a = str;
    }

    public final Object apply(Object obj) {
        String str = this.f296736a;
        a builder = ((d) obj).toBuilder();
        C59689cd b = builder.b(str, C59689cd.f160146e);
        C59688cc ccVar = (C59688cc) b.toBuilder();
        ccVar.copyOnWrite();
        C59689cd cdVar = (C59689cd) ccVar.instance;
        cdVar.f160148a |= 1;
        cdVar.f160149b = str;
        int i = b.f160151d;
        ccVar.copyOnWrite();
        C59689cd cdVar2 = (C59689cd) ccVar.instance;
        cdVar2.f160148a |= 4;
        cdVar2.f160151d = i + 1;
        builder.c(str, (C59689cd) ccVar.build());
        return builder.build();
    }
}
