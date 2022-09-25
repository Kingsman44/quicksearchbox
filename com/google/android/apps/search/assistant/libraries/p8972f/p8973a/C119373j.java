package com.google.android.apps.search.assistant.libraries.p8972f.p8973a;

import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.knowledge.p4671b.C61826s;
import java.util.concurrent.Callable;

/* renamed from: com.google.android.apps.search.assistant.libraries.f.a.j */
/* compiled from: PG */
public final /* synthetic */ class C119373j implements Callable {

    /* renamed from: a */
    public final /* synthetic */ C60870cx f332807a;

    /* renamed from: b */
    public final /* synthetic */ C60870cx f332808b;

    public /* synthetic */ C119373j(C60870cx cxVar, C60870cx cxVar2) {
        this.f332807a = cxVar;
        this.f332808b = cxVar2;
    }

    public final Object call() {
        C60870cx cxVar = this.f332807a;
        C60870cx cxVar2 = this.f332808b;
        if (!((Boolean) C60856cj.m92909r(cxVar)).booleanValue()) {
            return C61826s.OPA_OPT_IN_STATUS_UNKNOWN;
        }
        if (((Boolean) C60856cj.m92909r(cxVar2)).booleanValue()) {
            return C61826s.OPA_OPT_IN_STATUS_ENABLED;
        }
        return C61826s.OPA_OPT_IN_STATUS_DISABLED;
    }
}
