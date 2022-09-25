package com.google.android.libraries.assistant.contexttrigger.impl;

import com.google.assistant.p3803ag.p3807b.p3808a.C48906h;
import com.google.assistant.p3803ag.p3807b.p3808a.C48908j;
import com.google.assistant.p3803ag.p3807b.p3808a.C48913o;
import com.google.assistant.p3803ag.p3807b.p3808a.C48917s;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60866ct;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60930r;

/* renamed from: com.google.android.libraries.assistant.contexttrigger.impl.o */
/* compiled from: PG */
public final /* synthetic */ class C17772o implements C60930r {

    /* renamed from: a */
    public final /* synthetic */ C60870cx f51024a;

    /* renamed from: b */
    public final /* synthetic */ String f51025b;

    /* renamed from: c */
    public final /* synthetic */ C48917s f51026c;

    public /* synthetic */ C17772o(C60870cx cxVar, String str, C48917s sVar) {
        this.f51024a = cxVar;
        this.f51025b = str;
        this.f51026c = sVar;
    }

    /* renamed from: a */
    public final C60870cx mo18058a() {
        C60870cx cxVar = this.f51024a;
        String str = this.f51025b;
        C48917s sVar = this.f51026c;
        String str2 = (String) C60856cj.m92909r(cxVar);
        str2.getClass();
        if (!str2.equals(str)) {
            C48913o oVar = sVar.f126584e;
            if (oVar == null) {
                oVar = C48913o.f126569d;
            }
            C48908j jVar = oVar.f126572b;
            if (jVar == null) {
                jVar = C48908j.f126561c;
            }
            C48906h a = C48906h.m85303a(jVar.f126564b);
            if (a == null) {
                a = C48906h.TRIGGER_FOR_CURRENT;
            }
            if (a != C48906h.TRIGGER_FOR_ALL) {
                return C60856cj.m92899h(new C17773p(String.format("Triggering for account %s, which is not current (%s) is suppressed by policy.", new Object[]{C60856cj.m92909r(cxVar), str}), false));
            }
        }
        return C60866ct.f164955a;
    }
}
