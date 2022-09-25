package com.google.android.libraries.assistant.pcp.p1555f.p1556a;

import com.google.android.libraries.assistant.pcp.p1583o.C19025b;
import com.google.common.p4522b.C58370cn;
import com.google.common.p4522b.C58528ij;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;
import java.util.concurrent.CancellationException;
import p3186j$.util.Collection;

/* renamed from: com.google.android.libraries.assistant.pcp.f.a.j */
/* compiled from: PG */
public final /* synthetic */ class C18687j implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C58528ij f52729a;

    public /* synthetic */ C18687j(C58528ij ijVar) {
        this.f52729a = ijVar;
    }

    public final C60870cx apply(Object obj) {
        C58528ij ijVar = this.f52729a;
        Throwable th = (Throwable) obj;
        if (!(th instanceof CancellationException)) {
            C58528ij ijVar2 = (C58528ij) Collection.EL.stream(ijVar).map(C19025b.f53412a).collect(C58370cn.f155947b);
        }
        return C60856cj.m92899h(th);
    }
}
