package com.google.android.apps.gsa.sidekick.main.entry;

import android.content.Context;
import com.google.android.apps.gsa.sidekick.shared.p7238g.C91731a;
import com.google.android.apps.gsa.sidekick.shared.p7238g.C91732b;
import com.google.android.apps.gsa.sidekick.shared.p7238g.C91733c;
import com.google.android.apps.gsa.sidekick.shared.p7238g.C91734d;
import com.google.p375ai.p378b.C7718hj;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* renamed from: com.google.android.apps.gsa.sidekick.main.entry.al */
/* compiled from: PG */
public final class C91307al {

    /* renamed from: a */
    public final Object f254819a = new Object();

    /* renamed from: b */
    public ArrayList f254820b;

    /* renamed from: c */
    public final C91731a f254821c = ((C91731a) C91732b.f255833m.createBuilder());

    /* renamed from: d */
    public boolean f254822d;

    /* renamed from: e */
    public final Context f254823e;

    /* renamed from: f */
    private boolean f254824f = false;

    /* renamed from: g */
    private final Set f254825g = new HashSet();

    /* renamed from: h */
    private final Set f254826h = new HashSet();

    /* renamed from: i */
    private final Set f254827i = new HashSet();

    /* renamed from: j */
    private final Set f254828j = new HashSet();

    public C91307al(Context context) {
        this.f254823e = context;
    }

    /* renamed from: a */
    public final C91731a mo85600a() {
        this.f254824f = true;
        return this.f254821c;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0059, code lost:
        return;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo85601b(com.google.p375ai.p378b.C7718hj r5) {
        /*
            r4 = this;
            java.lang.Object r0 = r4.f254819a
            monitor-enter(r0)
            java.util.Set r1 = r4.f254825g     // Catch:{ all -> 0x005a }
            com.google.ai.b.fo r2 = r5.f26968i     // Catch:{ all -> 0x005a }
            if (r2 != 0) goto L_0x000b
            com.google.ai.b.fo r2 = com.google.p375ai.p378b.C7669fo.f26633e     // Catch:{ all -> 0x005a }
        L_0x000b:
            boolean r1 = r1.contains(r2)     // Catch:{ all -> 0x005a }
            if (r1 != 0) goto L_0x0058
            java.util.Set r1 = r4.f254826h     // Catch:{ all -> 0x005a }
            boolean r1 = r1.contains(r5)     // Catch:{ all -> 0x005a }
            if (r1 == 0) goto L_0x001a
            goto L_0x0058
        L_0x001a:
            com.google.android.apps.gsa.sidekick.shared.g.a r1 = r4.mo85600a()     // Catch:{ all -> 0x005a }
            r1.copyOnWrite()     // Catch:{ all -> 0x005a }
            com.google.protobuf.bv r1 = r1.instance     // Catch:{ all -> 0x005a }
            com.google.android.apps.gsa.sidekick.shared.g.b r1 = (com.google.android.apps.gsa.sidekick.shared.p7238g.C91732b) r1     // Catch:{ all -> 0x005a }
            com.google.android.apps.gsa.sidekick.shared.g.b r2 = com.google.android.apps.gsa.sidekick.shared.p7238g.C91732b.f255833m     // Catch:{ all -> 0x005a }
            r5.getClass()     // Catch:{ all -> 0x005a }
            com.google.protobuf.cq r2 = r1.f255840f     // Catch:{ all -> 0x005a }
            boolean r3 = r2.mo58948c()     // Catch:{ all -> 0x005a }
            if (r3 != 0) goto L_0x0038
            com.google.protobuf.cq r2 = com.google.protobuf.C62942bv.mutableCopy((com.google.protobuf.C62971cq) r2)     // Catch:{ all -> 0x005a }
            r1.f255840f = r2     // Catch:{ all -> 0x005a }
        L_0x0038:
            com.google.protobuf.cq r1 = r1.f255840f     // Catch:{ all -> 0x005a }
            r1.add(r5)     // Catch:{ all -> 0x005a }
            int r1 = r5.f26955a     // Catch:{ all -> 0x005a }
            r1 = r1 & 4
            if (r1 == 0) goto L_0x004e
            java.util.Set r1 = r4.f254825g     // Catch:{ all -> 0x005a }
            com.google.ai.b.fo r2 = r5.f26968i     // Catch:{ all -> 0x005a }
            if (r2 != 0) goto L_0x004b
            com.google.ai.b.fo r2 = com.google.p375ai.p378b.C7669fo.f26633e     // Catch:{ all -> 0x005a }
        L_0x004b:
            r1.add(r2)     // Catch:{ all -> 0x005a }
        L_0x004e:
            java.util.Set r1 = r4.f254826h     // Catch:{ all -> 0x005a }
            r1.add(r5)     // Catch:{ all -> 0x005a }
            r5 = 1
            r4.f254822d = r5     // Catch:{ all -> 0x005a }
            monitor-exit(r0)     // Catch:{ all -> 0x005a }
            return
        L_0x0058:
            monitor-exit(r0)     // Catch:{ all -> 0x005a }
            return
        L_0x005a:
            r5 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x005a }
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.sidekick.main.entry.C91307al.mo85601b(com.google.ai.b.hj):void");
    }

    /* renamed from: c */
    public final void mo85602c(C7718hj hjVar, List list) {
        synchronized (this.f254819a) {
            C91733c cVar = (C91733c) C91734d.f255848e.createBuilder();
            cVar.copyOnWrite();
            C91734d dVar = (C91734d) cVar.instance;
            dVar.f255850a |= 2;
            dVar.f255853d = true;
            cVar.copyOnWrite();
            C91734d dVar2 = (C91734d) cVar.instance;
            hjVar.getClass();
            dVar2.f255851b = hjVar;
            dVar2.f255850a |= 1;
            cVar.mo86232a(list);
            mo85600a().mo86230a((C91734d) cVar.build());
            this.f254822d = true;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:24:0x008a, code lost:
        return;
     */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo85603d(com.google.p375ai.p378b.C7718hj r7, com.google.p375ai.p378b.C7718hj r8) {
        /*
            r6 = this;
            java.lang.Object r0 = r6.f254819a
            monitor-enter(r0)
            java.util.Set r1 = r6.f254827i     // Catch:{ all -> 0x008b }
            com.google.ai.b.fo r2 = r7.f26968i     // Catch:{ all -> 0x008b }
            if (r2 != 0) goto L_0x000b
            com.google.ai.b.fo r2 = com.google.p375ai.p378b.C7669fo.f26633e     // Catch:{ all -> 0x008b }
        L_0x000b:
            boolean r1 = r1.contains(r2)     // Catch:{ all -> 0x008b }
            if (r1 != 0) goto L_0x0089
            java.util.Set r1 = r6.f254828j     // Catch:{ all -> 0x008b }
            boolean r1 = r1.contains(r7)     // Catch:{ all -> 0x008b }
            if (r1 == 0) goto L_0x001a
            goto L_0x0089
        L_0x001a:
            com.google.android.apps.gsa.sidekick.shared.g.a r1 = r6.mo85600a()     // Catch:{ all -> 0x008b }
            com.google.android.apps.gsa.sidekick.shared.g.f r2 = com.google.android.apps.gsa.sidekick.shared.p7238g.C91736f.f255855d     // Catch:{ all -> 0x008b }
            com.google.protobuf.bn r2 = r2.createBuilder()     // Catch:{ all -> 0x008b }
            com.google.android.apps.gsa.sidekick.shared.g.e r2 = (com.google.android.apps.gsa.sidekick.shared.p7238g.C91735e) r2     // Catch:{ all -> 0x008b }
            r2.copyOnWrite()     // Catch:{ all -> 0x008b }
            com.google.protobuf.bv r3 = r2.instance     // Catch:{ all -> 0x008b }
            com.google.android.apps.gsa.sidekick.shared.g.f r3 = (com.google.android.apps.gsa.sidekick.shared.p7238g.C91736f) r3     // Catch:{ all -> 0x008b }
            r7.getClass()     // Catch:{ all -> 0x008b }
            r3.f255858b = r7     // Catch:{ all -> 0x008b }
            int r4 = r3.f255857a     // Catch:{ all -> 0x008b }
            r5 = 1
            r4 = r4 | r5
            r3.f255857a = r4     // Catch:{ all -> 0x008b }
            r2.copyOnWrite()     // Catch:{ all -> 0x008b }
            com.google.protobuf.bv r3 = r2.instance     // Catch:{ all -> 0x008b }
            com.google.android.apps.gsa.sidekick.shared.g.f r3 = (com.google.android.apps.gsa.sidekick.shared.p7238g.C91736f) r3     // Catch:{ all -> 0x008b }
            r8.getClass()     // Catch:{ all -> 0x008b }
            r3.f255859c = r8     // Catch:{ all -> 0x008b }
            int r8 = r3.f255857a     // Catch:{ all -> 0x008b }
            r8 = r8 | 2
            r3.f255857a = r8     // Catch:{ all -> 0x008b }
            r1.copyOnWrite()     // Catch:{ all -> 0x008b }
            com.google.protobuf.bv r8 = r1.instance     // Catch:{ all -> 0x008b }
            com.google.android.apps.gsa.sidekick.shared.g.b r8 = (com.google.android.apps.gsa.sidekick.shared.p7238g.C91732b) r8     // Catch:{ all -> 0x008b }
            com.google.protobuf.bv r1 = r2.build()     // Catch:{ all -> 0x008b }
            com.google.android.apps.gsa.sidekick.shared.g.f r1 = (com.google.android.apps.gsa.sidekick.shared.p7238g.C91736f) r1     // Catch:{ all -> 0x008b }
            com.google.android.apps.gsa.sidekick.shared.g.b r2 = com.google.android.apps.gsa.sidekick.shared.p7238g.C91732b.f255833m     // Catch:{ all -> 0x008b }
            r1.getClass()     // Catch:{ all -> 0x008b }
            com.google.protobuf.cq r2 = r8.f255841g     // Catch:{ all -> 0x008b }
            boolean r3 = r2.mo58948c()     // Catch:{ all -> 0x008b }
            if (r3 != 0) goto L_0x006a
            com.google.protobuf.cq r2 = com.google.protobuf.C62942bv.mutableCopy((com.google.protobuf.C62971cq) r2)     // Catch:{ all -> 0x008b }
            r8.f255841g = r2     // Catch:{ all -> 0x008b }
        L_0x006a:
            com.google.protobuf.cq r8 = r8.f255841g     // Catch:{ all -> 0x008b }
            r8.add(r1)     // Catch:{ all -> 0x008b }
            int r8 = r7.f26955a     // Catch:{ all -> 0x008b }
            r8 = r8 & 4
            if (r8 == 0) goto L_0x0080
            java.util.Set r8 = r6.f254827i     // Catch:{ all -> 0x008b }
            com.google.ai.b.fo r1 = r7.f26968i     // Catch:{ all -> 0x008b }
            if (r1 != 0) goto L_0x007d
            com.google.ai.b.fo r1 = com.google.p375ai.p378b.C7669fo.f26633e     // Catch:{ all -> 0x008b }
        L_0x007d:
            r8.add(r1)     // Catch:{ all -> 0x008b }
        L_0x0080:
            java.util.Set r8 = r6.f254828j     // Catch:{ all -> 0x008b }
            r8.add(r7)     // Catch:{ all -> 0x008b }
            r6.f254822d = r5     // Catch:{ all -> 0x008b }
            monitor-exit(r0)     // Catch:{ all -> 0x008b }
            return
        L_0x0089:
            monitor-exit(r0)     // Catch:{ all -> 0x008b }
            return
        L_0x008b:
            r7 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x008b }
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.sidekick.main.entry.C91307al.mo85603d(com.google.ai.b.hj, com.google.ai.b.hj):void");
    }

    /* renamed from: e */
    public final void mo85604e() {
        synchronized (this.f254819a) {
            C91731a a = mo85600a();
            a.copyOnWrite();
            C91732b bVar = (C91732b) a.instance;
            C91732b bVar2 = C91732b.f255833m;
            bVar.f255835a |= 2;
            bVar.f255837c = true;
            this.f254822d = true;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public final boolean mo85605f() {
        boolean z;
        synchronized (this.f254819a) {
            z = this.f254822d;
        }
        return z;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public final boolean mo85606g() {
        boolean z;
        synchronized (this.f254819a) {
            z = this.f254824f;
        }
        return z;
    }
}
