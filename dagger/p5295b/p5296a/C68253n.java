package dagger.p5295b.p5296a;

import com.google.common.p4522b.C58598kz;
import com.google.common.p4522b.C58615lp;
import com.google.common.util.concurrent.C60870cx;
import dagger.p5295b.C68283d;
import java.util.Collections;
import java.util.Set;

/* renamed from: dagger.b.a.n */
/* compiled from: PG */
public abstract class C68253n implements C68248i {

    /* renamed from: a */
    private boolean f184621a = false;

    /* renamed from: b */
    public final Set f184622b;

    public C68253n() {
        C58598kz kzVar = new C58598kz();
        kzVar.mo55627f(C58615lp.WEAK);
        this.f184622b = Collections.newSetFromMap(kzVar.mo55626e());
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract C60870cx mo60309b();

    /* renamed from: c */
    public final C68283d mo60298c(C68249j jVar) {
        return new C68252m(this, jVar);
    }

    /* renamed from: d */
    public final void mo60299d(boolean z) {
        synchronized (this.f184622b) {
            this.f184621a = true;
            for (C60870cx cancel : this.f184622b) {
                cancel.cancel(z);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x002a, code lost:
        return r1;
     */
    /* renamed from: gq */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.common.util.concurrent.C60870cx mo60297gq() {
        /*
            r4 = this;
            java.util.Set r0 = r4.f184622b
            monitor-enter(r0)
            boolean r1 = r4.f184621a     // Catch:{ all -> 0x002b }
            if (r1 == 0) goto L_0x000d
            com.google.common.util.concurrent.cx r1 = com.google.common.util.concurrent.C60856cj.m92898g()     // Catch:{ all -> 0x002b }
            monitor-exit(r0)     // Catch:{ all -> 0x002b }
            return r1
        L_0x000d:
            com.google.common.util.concurrent.cx r1 = r4.mo60309b()     // Catch:{ all -> 0x002b }
            boolean r2 = r1.isDone()     // Catch:{ all -> 0x002b }
            if (r2 != 0) goto L_0x0029
            java.util.Set r2 = r4.f184622b     // Catch:{ all -> 0x002b }
            boolean r2 = r2.add(r1)     // Catch:{ all -> 0x002b }
            if (r2 == 0) goto L_0x0029
            dagger.b.a.k r2 = new dagger.b.a.k     // Catch:{ all -> 0x002b }
            r2.<init>(r4, r1)     // Catch:{ all -> 0x002b }
            com.google.common.util.concurrent.bg r3 = com.google.common.util.concurrent.C60826bg.f164896a     // Catch:{ all -> 0x002b }
            r1.mo4106b(r2, r3)     // Catch:{ all -> 0x002b }
        L_0x0029:
            monitor-exit(r0)     // Catch:{ all -> 0x002b }
            return r1
        L_0x002b:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x002b }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: dagger.p5295b.p5296a.C68253n.mo60297gq():com.google.common.util.concurrent.cx");
    }

    /* renamed from: gr */
    public final C68283d mo60300gr() {
        return this;
    }
}
