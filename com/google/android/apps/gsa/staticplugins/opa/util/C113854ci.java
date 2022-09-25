package com.google.android.apps.gsa.staticplugins.opa.util;

import com.google.android.apps.gsa.shared.logger.p7051b.C89849ae;
import com.google.android.apps.gsa.shared.logger.p7051b.C89859i;
import com.google.android.apps.gsa.shared.util.BitFlags;
import com.google.android.libraries.p1730f.C21370a;
import com.google.android.libraries.search.logging.appflows.startup.p3037a.C38802e;
import com.google.common.base.C58833ax;
import dagger.C68214a;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.util.ci */
/* compiled from: PG */
public final class C113854ci {

    /* renamed from: a */
    public final C68214a f315268a;

    /* renamed from: b */
    public final C21370a f315269b;

    /* renamed from: c */
    public final Object f315270c = new Object();

    /* renamed from: d */
    public final BitFlags f315271d = new BitFlags(C113854ci.class, "FLAG_", 0);

    /* renamed from: e */
    public long f315272e;

    /* renamed from: f */
    public final C58833ax f315273f;

    /* renamed from: g */
    public final C38802e f315274g;

    public C113854ci(C68214a aVar, C58833ax axVar, C38802e eVar, C21370a aVar2) {
        this.f315268a = aVar;
        this.f315273f = axVar;
        this.f315274g = eVar;
        this.f315269b = aVar2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0028, code lost:
        ((com.google.android.apps.gsa.shared.logger.p7051b.C89859i) r8.f315268a.mo27525b()).mo83703p(r11, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0033, code lost:
        if (r9 == false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0035, code lost:
        r9 = (com.google.common.p4552o.C59582aj) com.google.common.p4552o.C59687cb.f160034bf.createBuilder();
        r9.copyOnWrite();
        r10 = (com.google.common.p4552o.C59687cb) r9.instance;
        r10.f160062a |= 1073741824;
        r10.f160036A = r4;
        r10 = new com.google.android.apps.gsa.shared.logger.p7051b.C89856f();
        r10.f246201a = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.OPA_ANDROID_STARTUP_END;
        r10.f246203c = (com.google.common.p4552o.C59687cb) r9.build();
        ((com.google.android.apps.gsa.shared.logger.p7051b.C89859i) r8.f315268a.mo27525b()).mo74236a(r10.mo83699a());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:?, code lost:
        return;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo100700a(long r9, com.google.android.apps.gsa.shared.logger.p7051b.C89849ae r11) {
        /*
            r8 = this;
            com.google.android.libraries.f.a r0 = r8.f315269b
            long r0 = r0.mo26872d()
            java.lang.Object r2 = r8.f315270c
            monitor-enter(r2)
            com.google.android.apps.gsa.shared.util.BitFlags r3 = r8.f315271d     // Catch:{ all -> 0x006e }
            boolean r4 = r3.mo85052e(r9)     // Catch:{ all -> 0x006e }
            if (r4 != 0) goto L_0x0013
            monitor-exit(r2)     // Catch:{ all -> 0x006e }
            return
        L_0x0013:
            long r4 = r8.f315272e     // Catch:{ all -> 0x006e }
            r6 = 0
            r3.mo85049c(r9, r6)     // Catch:{ all -> 0x006e }
            com.google.android.apps.gsa.shared.util.BitFlags r9 = r8.f315271d     // Catch:{ all -> 0x006e }
            boolean r9 = r9.mo85050d()     // Catch:{ all -> 0x006e }
            if (r9 != 0) goto L_0x0026
            r8.f315272e = r6     // Catch:{ all -> 0x006e }
            r9 = 1
            goto L_0x0027
        L_0x0026:
            r9 = 0
        L_0x0027:
            monitor-exit(r2)     // Catch:{ all -> 0x006e }
            dagger.a r10 = r8.f315268a
            java.lang.Object r10 = r10.mo27525b()
            com.google.android.apps.gsa.shared.logger.b.i r10 = (com.google.android.apps.gsa.shared.logger.p7051b.C89859i) r10
            r10.mo83703p(r11, r0)
            if (r9 == 0) goto L_0x006d
            com.google.common.o.cb r9 = com.google.common.p4552o.C59687cb.f160034bf
            com.google.protobuf.bn r9 = r9.createBuilder()
            com.google.common.o.aj r9 = (com.google.common.p4552o.C59582aj) r9
            r9.copyOnWrite()
            com.google.protobuf.bv r10 = r9.instance
            com.google.common.o.cb r10 = (com.google.common.p4552o.C59687cb) r10
            int r11 = r10.f160062a
            r0 = 1073741824(0x40000000, float:2.0)
            r11 = r11 | r0
            r10.f160062a = r11
            r10.f160036A = r4
            com.google.protobuf.bv r9 = r9.build()
            com.google.common.o.cb r9 = (com.google.common.p4552o.C59687cb) r9
            com.google.android.apps.gsa.shared.logger.b.f r10 = new com.google.android.apps.gsa.shared.logger.b.f
            r10.<init>()
            com.google.android.apps.gsa.shared.logger.b.ae r11 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.OPA_ANDROID_STARTUP_END
            r10.f246201a = r11
            r10.f246203c = r9
            dagger.a r9 = r8.f315268a
            java.lang.Object r9 = r9.mo27525b()
            com.google.android.apps.gsa.shared.logger.b.i r9 = (com.google.android.apps.gsa.shared.logger.p7051b.C89859i) r9
            com.google.android.apps.gsa.shared.logger.b.g r10 = r10.mo83699a()
            r9.mo74236a(r10)
        L_0x006d:
            return
        L_0x006e:
            r9 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x006e }
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.staticplugins.opa.util.C113854ci.mo100700a(long, com.google.android.apps.gsa.shared.logger.b.ae):void");
    }

    /* renamed from: b */
    public final void mo100701b(long j) {
        long d = this.f315269b.mo26872d();
        synchronized (this.f315270c) {
            BitFlags bitFlags = this.f315271d;
            if (bitFlags.mo85050d()) {
                bitFlags.mo85054g();
            }
            this.f315271d.mo85049c(0, j);
            this.f315272e = j;
        }
        if (j == 0) {
            ((C89859i) this.f315268a.mo27525b()).mo83703p(C89849ae.OPA_ANDROID_STARTUP_END, d);
        }
    }

    /* renamed from: c */
    public final void mo100702c() {
        mo100700a(4, C89849ae.OPA_ANDROID_STARTUP_ZERO_STATE_SHOWN);
    }
}
