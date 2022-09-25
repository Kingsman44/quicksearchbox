package com.google.android.libraries.mdi.download.p2236d;

import com.google.android.libraries.mdi.download.C29398ev;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.util.concurrent.C60866ct;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import com.google.common.util.concurrent.C60931s;
import java.io.PrintWriter;
import java.util.List;

/* renamed from: com.google.android.libraries.mdi.download.d.ks */
/* compiled from: PG */
public final /* synthetic */ class C29266ks implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C29290lp f79302a;

    /* renamed from: b */
    public final /* synthetic */ PrintWriter f79303b;

    public /* synthetic */ C29266ks(C29290lp lpVar, PrintWriter printWriter) {
        this.f79302a = lpVar;
        this.f79303b = printWriter;
    }

    public final C60870cx apply(Object obj) {
        C29290lp lpVar = this.f79302a;
        PrintWriter printWriter = this.f79303b;
        C60870cx cxVar = C60866ct.f164955a;
        for (C29398ev kuVar : (List) obj) {
            C29268ku kuVar2 = new C29268ku(lpVar, kuVar, printWriter);
            cxVar = C60922j.m93045h(cxVar, C47810es.m84966f(kuVar2), lpVar.f79395k);
        }
        return cxVar;
    }
}
