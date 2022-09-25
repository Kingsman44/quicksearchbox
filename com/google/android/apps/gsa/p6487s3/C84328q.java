package com.google.android.apps.gsa.p6487s3;

import com.google.android.apps.gsa.shared.p6968aa.C89019aq;
import com.google.android.apps.gsa.shared.p6968aa.C89020ar;
import com.google.android.apps.gsa.shared.util.p7159c.C90888av;
import com.google.android.apps.gsa.shared.util.p7159c.C90931ca;
import com.google.p395al.p408c.p414c.p416b.C8466ai;
import java.util.concurrent.Future;

/* renamed from: com.google.android.apps.gsa.s3.q */
/* compiled from: PG */
abstract class C84328q extends C90888av {

    /* renamed from: a */
    private volatile Future f229494a;

    /* renamed from: e */
    protected volatile boolean f229495e = false;

    protected C84328q(String str) {
        super(str, 1, 4);
    }

    /* renamed from: e */
    protected static final C89020ar m134531e(C8466ai aiVar, String str, int i, int i2, boolean z) {
        C89019aq a = C84334w.m134551a(aiVar, str);
        a.f241249o = i;
        a.f241245k = i2;
        a.f241242h = z;
        return a.mo82989a();
    }

    /* renamed from: a */
    public void mo77834a() {
        this.f229495e = true;
        Future future = this.f229494a;
        if (future != null) {
            future.cancel(true);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo77835b() {
        Future future = this.f229494a;
        if (Thread.interrupted() || this.f229495e || (future != null && future.isDone())) {
            throw new InterruptedException();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public abstract void mo77836c();

    /* renamed from: d */
    public final void mo77865d(C90931ca caVar) {
        try {
            this.f229494a = caVar.mo85139d(this);
            if (this.f229495e) {
                this.f229494a.cancel(true);
            }
        } catch (Throwable th) {
            if (this.f229495e) {
                this.f229494a.cancel(true);
            }
            throw th;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0006, code lost:
        return;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r1 = this;
            r1.mo77836c()     // Catch:{ InterruptedException -> 0x0006, all -> 0x0004 }
            return
        L_0x0004:
            r0 = move-exception
            throw r0
        L_0x0006:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.p6487s3.C84328q.run():void");
    }
}
