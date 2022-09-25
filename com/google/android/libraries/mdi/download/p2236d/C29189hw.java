package com.google.android.libraries.mdi.download.p2236d;

import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import com.google.common.util.concurrent.C60931s;
import java.io.PrintWriter;

/* renamed from: com.google.android.libraries.mdi.download.d.hw */
/* compiled from: PG */
public final /* synthetic */ class C29189hw implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C29211ir f79149a;

    /* renamed from: b */
    public final /* synthetic */ PrintWriter f79150b;

    public /* synthetic */ C29189hw(C29211ir irVar, PrintWriter printWriter) {
        this.f79149a = irVar;
        this.f79150b = printWriter;
    }

    public final C60870cx apply(Object obj) {
        C29211ir irVar = this.f79149a;
        PrintWriter printWriter = this.f79150b;
        Void voidR = (Void) obj;
        C29290lp lpVar = irVar.f79196f;
        printWriter.println("==== MDD_SHARED_FILES ====");
        C60870cx c = lpVar.f79387c.mo34618c();
        C29266ks ksVar = new C29266ks(lpVar, printWriter);
        return C60922j.m93045h(c, C47810es.m84966f(ksVar), lpVar.f79395k);
    }
}
