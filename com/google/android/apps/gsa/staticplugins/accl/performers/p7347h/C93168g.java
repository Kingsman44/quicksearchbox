package com.google.android.apps.gsa.staticplugins.accl.performers.p7347h;

import com.google.android.libraries.search.p2871b.p2872a.p2874b.C37176a;
import com.google.common.base.C58817ah;
import com.google.net.p4726a.p4727a.C62722b;
import java.util.concurrent.TimeoutException;

/* renamed from: com.google.android.apps.gsa.staticplugins.accl.performers.h.g */
/* compiled from: PG */
public final /* synthetic */ class C93168g implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ C93173l f259852a;

    public /* synthetic */ C93168g(C93173l lVar) {
        this.f259852a = lVar;
    }

    public final Object apply(Object obj) {
        C93173l lVar = this.f259852a;
        Exception exc = (Exception) obj;
        boolean z = exc instanceof TimeoutException;
        Object[] objArr = new Object[2];
        objArr[0] = true != z ? "Exception" : "TimeoutException";
        objArr[1] = exc.getMessage();
        String format = String.format("%s: %s", objArr);
        lVar.f259865f.mo19974a(C37176a.f96818P.mo40805c(z ? C62722b.DEADLINE_EXCEEDED : C62722b.INTERNAL));
        return C93173l.m153240b(format);
    }
}
