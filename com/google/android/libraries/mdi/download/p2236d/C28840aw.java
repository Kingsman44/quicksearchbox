package com.google.android.libraries.mdi.download.p2236d;

import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import com.google.common.util.concurrent.C60931s;
import java.io.PrintWriter;

/* renamed from: com.google.android.libraries.mdi.download.d.aw */
/* compiled from: PG */
public final /* synthetic */ class C28840aw implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C29117fe f78344a;

    /* renamed from: b */
    public final /* synthetic */ PrintWriter f78345b;

    public /* synthetic */ C28840aw(C29117fe feVar, PrintWriter printWriter) {
        this.f78344a = feVar;
        this.f78345b = printWriter;
    }

    public final C60870cx apply(Object obj) {
        C29117fe feVar = this.f78344a;
        PrintWriter printWriter = this.f78345b;
        Void voidR = (Void) obj;
        printWriter.println("MDD_STALE_FILE_GROUPS:");
        C60870cx e = feVar.f78975d.mo34600e();
        C29064ee eeVar = new C29064ee(printWriter);
        return C60922j.m93045h(e, C47810es.m84966f(eeVar), feVar.f78980i);
    }
}
