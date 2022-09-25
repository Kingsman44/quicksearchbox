package com.google.android.libraries.mdi.download.p2236d;

import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import com.google.common.util.concurrent.C60931s;
import java.io.PrintWriter;

/* renamed from: com.google.android.libraries.mdi.download.d.ih */
/* compiled from: PG */
public final /* synthetic */ class C29201ih implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C29211ir f79171a;

    /* renamed from: b */
    public final /* synthetic */ PrintWriter f79172b;

    public /* synthetic */ C29201ih(C29211ir irVar, PrintWriter printWriter) {
        this.f79171a = irVar;
        this.f79172b = printWriter;
    }

    public final C60870cx apply(Object obj) {
        C29211ir irVar = this.f79171a;
        PrintWriter printWriter = this.f79172b;
        Void voidR = (Void) obj;
        C29117fe feVar = irVar.f79194d;
        printWriter.println("==== MDD_FILE_GROUP_MANAGER ====");
        printWriter.println("MDD_FRESH_FILE_GROUPS:");
        C60870cx c = feVar.f78975d.mo34598c();
        C28838au auVar = new C28838au(printWriter);
        C60870cx h = C60922j.m93045h(c, C47810es.m84966f(auVar), feVar.f78980i);
        C28840aw awVar = new C28840aw(feVar, printWriter);
        C60870cx h2 = C60922j.m93045h(h, C47810es.m84966f(awVar), feVar.f78980i);
        C29189hw hwVar = new C29189hw(irVar, printWriter);
        return C60922j.m93045h(h2, C47810es.m84966f(hwVar), irVar.f79204n);
    }
}
