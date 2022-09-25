package com.google.android.libraries.assistant.auto.tng.assistant.p725c.p726a.p736c;

import com.google.android.libraries.assistant.auto.tng.assistant.p725c.p726a.p743f.p747c.p748a.C12143a;
import com.google.android.libraries.search.p2871b.p2872a.p2875c.C37179a;
import com.google.android.libraries.search.p2904c.C37338ac;
import com.google.android.libraries.search.p2904c.C37341af;
import com.google.common.util.concurrent.C60866ct;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;

/* renamed from: com.google.android.libraries.assistant.auto.tng.assistant.c.a.c.l */
/* compiled from: PG */
public final /* synthetic */ class C12078l implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C12084r f38664a;

    public /* synthetic */ C12078l(C12084r rVar) {
        this.f38664a = rVar;
    }

    public final C60870cx apply(Object obj) {
        C12084r rVar = this.f38664a;
        C37338ac acVar = (C37338ac) obj;
        C37341af a = C37341af.m66350a(acVar.f99179b);
        if (a == null) {
            a = C37341af.UNKNOWN_ACQUIRING_STATUS;
        }
        if (a.equals(C37341af.ACQUIRED)) {
            return C60866ct.f164955a;
        }
        rVar.f38672c.mo22352b(C37179a.f97656eP);
        C37341af a2 = C37341af.m66350a(acVar.f99179b);
        if (a2 == null) {
            a2 = C37341af.UNKNOWN_ACQUIRING_STATUS;
        }
        throw new C12143a(a2);
    }
}
