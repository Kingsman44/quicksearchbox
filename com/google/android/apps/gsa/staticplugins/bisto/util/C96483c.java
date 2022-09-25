package com.google.android.apps.gsa.staticplugins.bisto.util;

import com.google.android.apps.gsa.shared.bisto.p7029b.C89643n;
import com.google.assistant.p3861at.acu;
import com.google.assistant.p3861at.acv;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import com.google.common.util.concurrent.C60931s;

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.util.c */
/* compiled from: PG */
public final /* synthetic */ class C96483c implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C96497q f269941a;

    public /* synthetic */ C96483c(C96497q qVar) {
        this.f269941a = qVar;
    }

    public final C60870cx apply(Object obj) {
        C96497q qVar = this.f269941a;
        int intValue = ((Integer) obj).intValue();
        if (!C89643n.m145921f(intValue)) {
            return C60856cj.m92900i(Integer.valueOf(intValue));
        }
        acu acu = (acu) acv.f128920X.createBuilder();
        acu.copyOnWrite();
        acv acv = (acv) acu.instance;
        acv.f128946b |= 8388608;
        acv.f128934M = true;
        return C60922j.m93044g(qVar.mo83517a((acv) acu.build()), new C96487g(intValue), qVar.f269970d);
    }
}
