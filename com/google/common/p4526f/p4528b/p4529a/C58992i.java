package com.google.common.p4526f.p4528b.p4529a;

import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60873d;
import java.io.Closeable;
import java.io.IOException;
import java.util.concurrent.ExecutionException;

/* renamed from: com.google.common.f.b.a.i */
/* compiled from: PG */
public final /* synthetic */ class C58992i implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C60870cx f156854a;

    public /* synthetic */ C58992i(C60870cx cxVar) {
        this.f156854a = cxVar;
    }

    public final void run() {
        C60870cx cxVar = this.f156854a;
        if (((C60873d) cxVar).value instanceof C60873d.C60875b) {
            try {
                ((Closeable) C60856cj.m92909r(cxVar)).close();
            } catch (IOException | ExecutionException unused) {
            }
        }
    }
}
