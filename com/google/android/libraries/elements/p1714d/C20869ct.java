package com.google.android.libraries.elements.p1714d;

import com.facebook.litho.C6411u;
import com.google.android.libraries.elements.interfaces.C21239ai;
import com.google.android.libraries.elements.interfaces.C21249as;
import com.google.android.libraries.elements.interfaces.C21259bb;
import com.google.android.libraries.elements.interfaces.C21319z;
import p5488io.p5490b.C70120l;
import p5488io.p5490b.p5494b.C69802a;
import p5488io.p5490b.p5494b.C69803b;
import p5488io.p5490b.p5496d.C69822d;
import p5488io.p5490b.p5497e.p5498a.C69828d;
import p5488io.p5490b.p5497e.p5499b.C69841j;
import p5488io.p5490b.p5497e.p5502e.p5506d.C69972bz;
import p5488io.p5490b.p5497e.p5513j.C70089j;
import p5488io.p5490b.p5517i.C70101a;
import p5488io.p5490b.p5519k.C70115c;
import p5488io.p5490b.p5519k.C70119g;

/* renamed from: com.google.android.libraries.elements.d.ct */
/* compiled from: PG */
public final class C20869ct implements C69803b {

    /* renamed from: a */
    public final C21259bb f58527a;

    /* renamed from: b */
    public final C21249as f58528b;

    /* renamed from: c */
    public volatile C21319z f58529c;

    /* renamed from: d */
    public final C21239ai f58530d;

    /* renamed from: e */
    public C69802a f58531e;

    /* renamed from: f */
    public C20868cs f58532f;

    /* renamed from: g */
    public volatile C70120l f58533g;

    /* renamed from: h */
    private C70119g f58534h = new C70115c();

    public C20869ct(C21259bb bbVar, C21249as asVar, C21319z zVar, C21239ai aiVar, C69802a aVar) {
        this.f58527a = bbVar;
        this.f58528b = asVar;
        this.f58529c = zVar;
        this.f58530d = aiVar;
        this.f58531e = aVar;
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0017, code lost:
        return null;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized com.facebook.litho.C6407q mo25989a() {
        /*
            r2 = this;
            monitor-enter(r2)
            boolean r0 = r2.mo25859e()     // Catch:{ all -> 0x0019 }
            if (r0 != 0) goto L_0x0016
            com.google.android.libraries.elements.d.cs r0 = r2.f58532f     // Catch:{ all -> 0x0019 }
            if (r0 == 0) goto L_0x0016
            java.lang.Object r1 = r0.f58524b     // Catch:{ all -> 0x0019 }
            monitor-enter(r1)     // Catch:{ all -> 0x0019 }
            com.facebook.litho.q r0 = r0.f58525c     // Catch:{ all -> 0x0013 }
            monitor-exit(r1)     // Catch:{ all -> 0x0013 }
            monitor-exit(r2)
            return r0
        L_0x0013:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x0013 }
            throw r0     // Catch:{ all -> 0x0019 }
        L_0x0016:
            monitor-exit(r2)
            r0 = 0
            return r0
        L_0x0019:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.elements.p1714d.C20869ct.mo25989a():com.facebook.litho.q");
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0018, code lost:
        return;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void mo25990b() {
        /*
            r3 = this;
            monitor-enter(r3)
            boolean r0 = r3.mo25859e()     // Catch:{ all -> 0x0019 }
            if (r0 != 0) goto L_0x0017
            com.google.android.libraries.elements.d.cs r0 = r3.f58532f     // Catch:{ all -> 0x0019 }
            if (r0 == 0) goto L_0x0017
            java.lang.Object r1 = r0.f58524b     // Catch:{ all -> 0x0019 }
            monitor-enter(r1)     // Catch:{ all -> 0x0019 }
            r2 = 1
            r0.f58526d = r2     // Catch:{ all -> 0x0014 }
            monitor-exit(r1)     // Catch:{ all -> 0x0014 }
            monitor-exit(r3)
            return
        L_0x0014:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x0014 }
            throw r0     // Catch:{ all -> 0x0019 }
        L_0x0017:
            monitor-exit(r3)
            return
        L_0x0019:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.elements.p1714d.C20869ct.mo25990b():void");
    }

    /* renamed from: c */
    public final synchronized void mo25991c(C69802a aVar) {
        this.f58531e = aVar;
    }

    /* renamed from: d */
    public final synchronized void mo25992d(C6411u uVar) {
        if (!mo25859e()) {
            this.f58534h.mo25988lL(uVar);
        }
    }

    public final synchronized void dispose() {
        C20868cs csVar = this.f58532f;
        if (csVar != null) {
            C69828d.m101309f(csVar.f186827e);
        }
        this.f58533g = null;
        this.f58532f = null;
        this.f58534h.mo25986a();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0010, code lost:
        return true;
     */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized boolean mo25859e() {
        /*
            r1 = this;
            monitor-enter(r1)
            com.google.android.libraries.elements.d.cs r0 = r1.f58532f     // Catch:{ all -> 0x0012 }
            if (r0 == 0) goto L_0x000f
            boolean r0 = r0.mo25859e()     // Catch:{ all -> 0x0012 }
            if (r0 == 0) goto L_0x000c
            goto L_0x000f
        L_0x000c:
            monitor-exit(r1)
            r0 = 0
            return r0
        L_0x000f:
            monitor-exit(r1)
            r0 = 1
            return r0
        L_0x0012:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.elements.p1714d.C20869ct.mo25859e():boolean");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public final synchronized void mo25993f(C70120l lVar, C70120l lVar2, C21319z zVar, C6411u uVar, C20798ak akVar) {
        if (((C70115c) this.f58534h).f186875c.get() == C70089j.f186819a) {
            this.f58534h = new C70115c();
        }
        this.f58534h.mo25988lL(uVar);
        this.f58529c = zVar;
        this.f58533g = lVar;
        C20868cs csVar = new C20868cs(akVar);
        this.f58532f = csVar;
        C70119g gVar = this.f58534h;
        C20867cr crVar = new C20867cr(this);
        C69841j.m101337b(gVar, "other is null");
        C69972bz bzVar = new C69972bz(lVar2, crVar, gVar);
        C69822d dVar = C70101a.f186843k;
        bzVar.mo61539p(csVar);
    }
}
