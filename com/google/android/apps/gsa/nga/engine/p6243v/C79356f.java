package com.google.android.apps.gsa.nga.engine.p6243v;

import com.google.android.apps.gsa.p8883x.C118826c;
import com.google.common.p4522b.C58528ij;
import com.google.common.p4522b.C58733pz;
import com.google.common.p4526f.p4527a.C58974d;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60838bs;
import com.google.common.util.concurrent.C60846c;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.google.android.apps.gsa.nga.engine.v.f */
/* compiled from: PG */
public abstract class C79356f extends C79365o {

    /* renamed from: z */
    public static final C58974d f217897z = C58974d.m91136j();

    /* renamed from: A */
    public final Object f217898A = new Object();

    /* renamed from: B */
    public boolean f217899B = false;

    /* renamed from: a */
    private final AtomicBoolean f217900a = new AtomicBoolean(false);

    protected C79356f(C79359i iVar) {
        super(iVar, C58733pz.f156496a);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0011, code lost:
        return r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x002b, code lost:
        return 4;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final int mo71200a() {
        /*
            r3 = this;
            java.lang.Object r0 = r3.f217898A
            monitor-enter(r0)
            boolean r1 = r3.mo71201gC()     // Catch:{ all -> 0x002d }
            r2 = 1
            if (r1 != 0) goto L_0x0012
            boolean r1 = r3.f217899B     // Catch:{ all -> 0x002d }
            if (r2 == r1) goto L_0x000f
            goto L_0x0010
        L_0x000f:
            r2 = 3
        L_0x0010:
            monitor-exit(r0)     // Catch:{ all -> 0x002d }
            return r2
        L_0x0012:
            boolean r1 = r3.f217899B     // Catch:{ all -> 0x002d }
            if (r1 != 0) goto L_0x0019
            monitor-exit(r0)     // Catch:{ all -> 0x002d }
            r0 = 2
            return r0
        L_0x0019:
            java.util.concurrent.atomic.AtomicBoolean r1 = r3.f217900a     // Catch:{ all -> 0x002d }
            boolean r1 = r1.get()     // Catch:{ all -> 0x002d }
            if (r1 != 0) goto L_0x002a
            boolean r1 = r3.mo71822gD()     // Catch:{ all -> 0x002d }
            if (r1 == 0) goto L_0x0028
            goto L_0x002a
        L_0x0028:
            monitor-exit(r0)     // Catch:{ all -> 0x002d }
            return r2
        L_0x002a:
            monitor-exit(r0)     // Catch:{ all -> 0x002d }
            r0 = 4
            return r0
        L_0x002d:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x002d }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.nga.engine.p6243v.C79356f.mo71200a():int");
    }

    /* renamed from: Q */
    public final void mo71863Q() {
        mo73920X();
    }

    /* renamed from: R */
    public final C60870cx mo73914R() {
        return C60846c.m92879h(C60838bs.m92859i(mo71202h()), Throwable.class, new C79353c(this), C60826bg.f164896a);
    }

    /* access modifiers changed from: protected */
    /* renamed from: S */
    public final C60870cx mo73915S() {
        C60870cx cxVar;
        int a = mo71200a();
        this.f217900a.set(false);
        synchronized (this.f217898A) {
            int i = a - 1;
            if (i == 0) {
                C60870cx cxVar2 = C118826c.f331423b;
                return cxVar2;
            } else if (i == 1 || i == 3) {
                if (a == 2) {
                    cxVar = mo73914R();
                } else {
                    cxVar = C60922j.m93045h(C60838bs.m92859i(mo71203i()), new C79335a(this), C60826bg.f164896a);
                }
                C60870cx g = C60922j.m93044g(C60838bs.m92859i(cxVar), new C79352b(this), C60826bg.f164896a);
                return g;
            } else {
                this.f217899B = false;
                C60870cx i2 = mo71203i();
                return i2;
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: T */
    public final boolean mo73916T() {
        return mo71200a() != 1;
    }

    /* access modifiers changed from: protected */
    /* renamed from: U */
    public final void mo73917U() {
        this.f217900a.set(true);
        mo73920X();
    }

    /* access modifiers changed from: protected */
    /* renamed from: gD */
    public boolean mo71822gD() {
        return false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public abstract C60870cx mo71202h();

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public abstract C60870cx mo71203i();

    protected C79356f(C79359i iVar, C58528ij ijVar) {
        super(iVar, ijVar);
    }
}
