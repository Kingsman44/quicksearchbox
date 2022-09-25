package com.google.android.libraries.p11016ak.p11019c.p11021b;

import com.google.android.libraries.p11016ak.C147731m;
import com.google.android.libraries.p11016ak.C147732n;
import com.google.android.libraries.p11016ak.C147733o;
import com.google.android.libraries.p11016ak.C147734p;
import com.google.android.libraries.p11016ak.C147735q;
import com.google.android.libraries.p11016ak.C147736r;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.p4522b.C58480gp;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.SettableFuture;
import com.google.protobuf.C62910ar;
import com.google.protobuf.C63088z;
import com.google.protobuf.p4750c.C62948a;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import p3186j$.util.Map;
import p3186j$.util.concurrent.ConcurrentHashMap;

/* renamed from: com.google.android.libraries.ak.c.b.ad */
/* compiled from: PG */
final class C147650ad {

    /* renamed from: f */
    private static final C59071e f398492f = C59071e.m91332i("com.google.android.libraries.ak.c.b.ad");

    /* renamed from: a */
    public final C147654b f398493a = new C147654b();

    /* renamed from: b */
    public final Map f398494b = new ConcurrentHashMap();

    /* renamed from: c */
    public final C147646a f398495c;

    /* renamed from: d */
    public boolean f398496d;

    /* renamed from: e */
    public int f398497e;

    /* renamed from: g */
    private final C58480gp f398498g = C58485gu.m89837e();

    /* renamed from: h */
    private final SettableFuture f398499h;

    /* renamed from: i */
    private C58833ax f398500i;

    /* renamed from: j */
    private C58833ax f398501j;

    public C147650ad(SettableFuture settableFuture) {
        C58836b bVar = C58836b.f156633a;
        this.f398500i = bVar;
        this.f398501j = bVar;
        this.f398499h = settableFuture;
        this.f398495c = new C147646a();
    }

    /* renamed from: f */
    private final void m240723f() {
        if (this.f398500i.mo56113h()) {
            Path path = (Path) this.f398500i.mo56107c();
            try {
                Files.delete(path);
            } catch (IOException e) {
                ((C59052c) ((C59052c) ((C59052c) f398492f.mo56225c()).mo56382g(e)).mo56372aa(50531)).mo56389s("Unable to delete file %s", path.toAbsolutePath());
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final synchronized C60870cx mo124397a(int i) {
        C147654b bVar = this.f398493a;
        if (i < bVar.mo124403a()) {
            return C60856cj.m92900i(bVar.mo124404b(i));
        } else if (this.f398499h.isDone()) {
            try {
                this.f398499h.get();
                return C60856cj.m92900i(C63088z.f170246b);
            } catch (InterruptedException | ExecutionException e) {
                return C60856cj.m92899h(e.getCause());
            }
        } else {
            return (C60870cx) Map.EL.computeIfAbsent(this.f398494b, Integer.valueOf(i), C147647aa.f398489a);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final synchronized void mo124398b(int i) {
        if (!this.f398496d) {
            this.f398496d = true;
            this.f398495c.mo124394b();
            double d = (double) this.f398497e;
            Double.isNaN(d);
            C62910ar j = C62948a.m95459j((long) (((d * 8.0d) / 384000.0d) * 1000.0d));
            if (this.f398501j.mo56113h()) {
                C147735q qVar = (C147735q) this.f398501j.mo56107c();
                long d2 = C62948a.m95453d(j);
                qVar.copyOnWrite();
                C147736r rVar = C147736r.f398657g;
                ((C147736r) qVar.instance).f398662d = d2;
                this.f398498g.mo55395g((C147736r) ((C147735q) this.f398501j.mo56107c()).build());
            }
            C147733o oVar = (C147733o) C147734p.f398651e.createBuilder();
            oVar.copyOnWrite();
            ((C147734p) oVar.instance).f398656d = i;
            C147731m mVar = (C147731m) C147732n.f398646d.createBuilder();
            C63088z b = this.f398493a.mo124404b(0);
            mVar.copyOnWrite();
            b.getClass();
            ((C147732n) mVar.instance).f398648a = b;
            mVar.copyOnWrite();
            j.getClass();
            ((C147732n) mVar.instance).f398650c = j;
            mVar.copyOnWrite();
            ((C147732n) mVar.instance).f398649b = "m4a";
            oVar.copyOnWrite();
            C147732n nVar = (C147732n) mVar.build();
            nVar.getClass();
            ((C147734p) oVar.instance).f398653a = nVar;
            oVar.mo124427a(this.f398498g.mo55394f());
            C147734p pVar = (C147734p) oVar.build();
            this.f398499h.mo57356n(pVar);
            for (Map.Entry entry : this.f398494b.entrySet()) {
                int intValue = ((Integer) entry.getKey()).intValue();
                SettableFuture settableFuture = (SettableFuture) entry.getValue();
                C147732n nVar2 = pVar.f398653a;
                if (nVar2 == null) {
                    nVar2 = C147732n.f398646d;
                }
                C63088z zVar = nVar2.f398648a;
                settableFuture.mo57356n(intValue >= zVar.mo59031d() ? C63088z.f170246b : zVar.mo59039k(intValue, zVar.mo59031d()));
            }
            this.f398494b.clear();
            m240723f();
        }
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0042, code lost:
        r0 = r0.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x004a, code lost:
        if (r0.hasNext() == false) goto L_0x0056;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x004c, code lost:
        ((com.google.common.util.concurrent.SettableFuture) r0.next()).mo57357o(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0056, code lost:
        return;
     */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo124399c(java.lang.Throwable r4) {
        /*
            r3 = this;
            java.util.HashSet r0 = new java.util.HashSet
            r0.<init>()
            monitor-enter(r3)
            boolean r1 = r3.f398496d     // Catch:{ all -> 0x0057 }
            if (r1 == 0) goto L_0x000c
            monitor-exit(r3)     // Catch:{ all -> 0x0057 }
            return
        L_0x000c:
            r1 = 1
            r3.f398496d = r1     // Catch:{ all -> 0x0057 }
            com.google.android.libraries.ak.c.b.a r1 = r3.f398495c     // Catch:{ all -> 0x0057 }
            r1.mo124394b()     // Catch:{ all -> 0x0057 }
            com.google.common.util.concurrent.SettableFuture r1 = r3.f398499h     // Catch:{ all -> 0x0057 }
            r1.mo57357o(r4)     // Catch:{ all -> 0x0057 }
            java.util.Map r1 = r3.f398494b     // Catch:{ all -> 0x0057 }
            java.util.Set r1 = r1.entrySet()     // Catch:{ all -> 0x0057 }
            java.util.Iterator r1 = r1.iterator()     // Catch:{ all -> 0x0057 }
        L_0x0023:
            boolean r2 = r1.hasNext()     // Catch:{ all -> 0x0057 }
            if (r2 == 0) goto L_0x0039
            java.lang.Object r2 = r1.next()     // Catch:{ all -> 0x0057 }
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2     // Catch:{ all -> 0x0057 }
            java.lang.Object r2 = r2.getValue()     // Catch:{ all -> 0x0057 }
            com.google.common.util.concurrent.SettableFuture r2 = (com.google.common.util.concurrent.SettableFuture) r2     // Catch:{ all -> 0x0057 }
            r0.add(r2)     // Catch:{ all -> 0x0057 }
            goto L_0x0023
        L_0x0039:
            java.util.Map r1 = r3.f398494b     // Catch:{ all -> 0x0057 }
            r1.clear()     // Catch:{ all -> 0x0057 }
            r3.m240723f()     // Catch:{ all -> 0x0057 }
            monitor-exit(r3)     // Catch:{ all -> 0x0057 }
            java.util.Iterator r0 = r0.iterator()
        L_0x0046:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x0056
            java.lang.Object r1 = r0.next()
            com.google.common.util.concurrent.SettableFuture r1 = (com.google.common.util.concurrent.SettableFuture) r1
            r1.mo57357o(r4)
            goto L_0x0046
        L_0x0056:
            return
        L_0x0057:
            r4 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x0057 }
            goto L_0x005b
        L_0x005a:
            throw r4
        L_0x005b:
            goto L_0x005a
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.p11016ak.p11019c.p11021b.C147650ad.mo124399c(java.lang.Throwable):void");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final synchronized void mo124400d(int i, int i2, int i3) {
        if (!this.f398496d) {
            if (!this.f398501j.mo56113h() || i > ((C147736r) ((C147735q) this.f398501j.mo56107c()).instance).f398663e) {
                double d = (double) i3;
                Double.isNaN(d);
                long j = (long) ((d / 24000.0d) * 1000.0d);
                if (this.f398501j.mo56113h()) {
                    C147735q qVar = (C147735q) this.f398501j.mo56107c();
                    qVar.copyOnWrite();
                    C147736r rVar = C147736r.f398657g;
                    ((C147736r) qVar.instance).f398662d = j;
                    this.f398498g.mo55395g((C147736r) ((C147735q) this.f398501j.mo56107c()).build());
                }
                C147735q qVar2 = (C147735q) C147736r.f398657g.createBuilder();
                qVar2.copyOnWrite();
                ((C147736r) qVar2.instance).f398661c = j;
                qVar2.copyOnWrite();
                ((C147736r) qVar2.instance).f398663e = i;
                qVar2.copyOnWrite();
                ((C147736r) qVar2.instance).f398664f = i2;
                this.f398501j = C58833ax.m90834k(qVar2);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public final synchronized void mo124401e(Path path) {
        this.f398500i = C58833ax.m90834k(path);
    }
}
