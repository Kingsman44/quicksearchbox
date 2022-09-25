package com.google.apps.tiktok.p3644h;

import com.google.apps.tiktok.tracing.C47558bi;
import com.google.apps.tiktok.tracing.C47831fm;
import com.google.common.util.concurrent.SettableFuture;
import p5488io.grpc.C70334de;
import p5488io.grpc.C70897l;

/* renamed from: com.google.apps.tiktok.h.z */
/* compiled from: PG */
public final /* synthetic */ class C47149z implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C47106aa f122767a;

    /* renamed from: b */
    public final /* synthetic */ C70897l f122768b;

    /* renamed from: c */
    public final /* synthetic */ C70334de f122769c;

    public /* synthetic */ C47149z(C47106aa aaVar, C70897l lVar, C70334de deVar) {
        this.f122767a = aaVar;
        this.f122768b = lVar;
        this.f122769c = deVar;
    }

    public final void run() {
        C47106aa aaVar = this.f122767a;
        C70897l lVar = this.f122768b;
        C70334de deVar = this.f122769c;
        C47558bi s = C47831fm.m85024s(aaVar.f122708b);
        try {
            SettableFuture settableFuture = new SettableFuture();
            s.mo51417a(settableFuture);
            aaVar.f187014c.mo27478a(new C47107ab(lVar, settableFuture), deVar);
            s.close();
            return;
        } catch (Throwable th) {
            try {
                Throwable.class.getDeclaredMethod("addSuppressed", new Class[]{Throwable.class}).invoke(th, new Object[]{th});
            } catch (Exception unused) {
            }
        }
        throw th;
    }
}
