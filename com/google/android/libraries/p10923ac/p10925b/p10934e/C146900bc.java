package com.google.android.libraries.p10923ac.p10925b.p10934e;

import com.google.android.libraries.p10923ac.p10925b.p10942i.C147089l;
import com.google.android.libraries.p10923ac.p10925b.p10942i.C147095r;
import com.google.android.libraries.p10923ac.p10925b.p10942i.C147096s;
import com.google.android.libraries.p10923ac.p10925b.p10945l.C147179m;
import com.google.android.libraries.p10923ac.p10948d.p10953b.p10955b.p10962d.C147256m;
import com.google.common.util.concurrent.C60933u;
import dagger.C68214a;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.libraries.ac.b.e.bc */
/* compiled from: PG */
public final class C146900bc implements C146855ay {

    /* renamed from: c */
    private static final C147096s f396526c;

    /* renamed from: a */
    public final Map f396527a = new HashMap();

    /* renamed from: b */
    public final C60933u f396528b = C60933u.m93072c();

    /* renamed from: d */
    private final C68214a f396529d;

    /* renamed from: e */
    private final C68214a f396530e;

    /* renamed from: f */
    private final C147179m f396531f;

    /* renamed from: g */
    private final C147179m f396532g;

    /* renamed from: h */
    private final C147089l f396533h;

    /* renamed from: i */
    private final C68214a f396534i;

    /* renamed from: j */
    private final C69464a f396535j;

    static {
        HashSet hashSet = new HashSet();
        C147095r.m239832a(':', hashSet);
        f396526c = new C147096s('\\', hashSet);
    }

    public C146900bc(C68214a aVar, C68214a aVar2, C147179m mVar, C147179m mVar2, C147089l lVar, C68214a aVar3, C69464a aVar4) {
        this.f396529d = aVar;
        this.f396530e = aVar2;
        this.f396531f = mVar;
        this.f396532g = mVar2;
        this.f396533h = lVar;
        this.f396534i = aVar3;
        this.f396535j = aVar4;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0138, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x013a, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:?, code lost:
        ((com.google.android.libraries.p10923ac.p10948d.p10953b.p10955b.p10962d.C147256m) r13.f396530e.mo27525b()).mo124063f("Failure cleaning up erroneous creation of accessor object", r0, new java.lang.Object[0]);
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [B:25:0x0128, B:34:0x0134] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.libraries.p10923ac.p10925b.p10934e.C146856az mo123776a(android.accounts.Account r19, int r20, int r21) {
        /*
            r18 = this;
            r13 = r18
            r0 = r19
            r1 = r20
            r2 = r21
            com.google.protos.aw.b.ao r3 = com.google.protos.p4895aw.p4902b.C63978ao.SYNC_LATEST_PER_SECONDARY_ID
            com.google.protos.aw.b.p r3 = com.google.android.libraries.p10923ac.p10925b.p10934e.C146854ax.m239334d(r1, r2, r3)
            g.a.a r4 = r13.f396535j     // Catch:{ InterruptedException -> 0x0175, ExecutionException -> 0x0173 }
            com.google.android.libraries.ac.d.b.b.j r4 = (com.google.android.libraries.p10923ac.p10948d.p10953b.p10955b.C147317j) r4     // Catch:{ InterruptedException -> 0x0175, ExecutionException -> 0x0173 }
            com.google.android.libraries.ac.d.b.b.i r4 = r4.f397608a     // Catch:{ InterruptedException -> 0x0175, ExecutionException -> 0x0173 }
            com.google.protos.aw.b.k r4 = r4.f397599a     // Catch:{ InterruptedException -> 0x0175, ExecutionException -> 0x0173 }
            com.google.common.util.concurrent.cx r4 = com.google.common.util.concurrent.C60856cj.m92900i(r4)     // Catch:{ InterruptedException -> 0x0175, ExecutionException -> 0x0173 }
            com.google.common.util.concurrent.ct r4 = (com.google.common.util.concurrent.C60866ct) r4     // Catch:{ InterruptedException -> 0x0175, ExecutionException -> 0x0173 }
            java.lang.Object r4 = r4.f164957b     // Catch:{ InterruptedException -> 0x0175, ExecutionException -> 0x0173 }
            com.google.protos.aw.b.k r4 = (com.google.protos.p4895aw.p4902b.C64093k) r4     // Catch:{ InterruptedException -> 0x0175, ExecutionException -> 0x0173 }
            com.google.protobuf.cq r4 = r4.f173282a     // Catch:{ InterruptedException -> 0x0175, ExecutionException -> 0x0173 }
            java.util.Iterator r4 = r4.iterator()     // Catch:{ InterruptedException -> 0x0175, ExecutionException -> 0x0173 }
        L_0x0026:
            boolean r5 = r4.hasNext()     // Catch:{ InterruptedException -> 0x0175, ExecutionException -> 0x0173 }
            if (r5 == 0) goto L_0x0153
            java.lang.Object r5 = r4.next()     // Catch:{ InterruptedException -> 0x0175, ExecutionException -> 0x0173 }
            com.google.protos.aw.b.i r5 = (com.google.protos.p4895aw.p4902b.C64091i) r5     // Catch:{ InterruptedException -> 0x0175, ExecutionException -> 0x0173 }
            com.google.protos.aw.b.p r6 = r5.f173275d     // Catch:{ InterruptedException -> 0x0175, ExecutionException -> 0x0173 }
            if (r6 != 0) goto L_0x0038
            com.google.protos.aw.b.p r6 = com.google.protos.p4895aw.p4902b.C64098p.f173292c     // Catch:{ InterruptedException -> 0x0175, ExecutionException -> 0x0173 }
        L_0x0038:
            boolean r6 = r6.equals(r3)     // Catch:{ InterruptedException -> 0x0175, ExecutionException -> 0x0173 }
            if (r6 == 0) goto L_0x0026
            int r4 = r5.f173273b     // Catch:{ InterruptedException -> 0x0175, ExecutionException -> 0x0173 }
            r6 = 4
            if (r4 != r6) goto L_0x0048
            java.lang.Object r4 = r5.f173274c     // Catch:{ InterruptedException -> 0x0175, ExecutionException -> 0x0173 }
            com.google.protos.aw.b.ax r4 = (com.google.protos.p4895aw.p4902b.C63987ax) r4     // Catch:{ InterruptedException -> 0x0175, ExecutionException -> 0x0173 }
            goto L_0x004a
        L_0x0048:
            com.google.protos.aw.b.ax r4 = com.google.protos.p4895aw.p4902b.C63987ax.f173047d     // Catch:{ InterruptedException -> 0x0175, ExecutionException -> 0x0173 }
        L_0x004a:
            com.google.android.libraries.ac.b.b.b r14 = new com.google.android.libraries.ac.b.b.b
            r14.<init>(r0, r3)
            com.google.common.l.x r15 = com.google.common.p4541l.C59341x.m92227a()
            java.util.Map r12 = r13.f396527a
            monitor-enter(r12)
            java.util.Map r3 = r13.f396527a     // Catch:{ IOException -> 0x0130, all -> 0x012c }
            java.lang.Object r3 = r3.get(r14)     // Catch:{ IOException -> 0x0130, all -> 0x012c }
            com.google.android.libraries.ac.b.e.az r3 = (com.google.android.libraries.p10923ac.p10925b.p10934e.C146856az) r3     // Catch:{ IOException -> 0x0130, all -> 0x012c }
            if (r3 != 0) goto L_0x011f
            com.google.android.libraries.ac.b.i.s r3 = f396526c     // Catch:{ IOException -> 0x0130, all -> 0x012c }
            java.lang.String r5 = r0.type     // Catch:{ IOException -> 0x0130, all -> 0x012c }
            java.lang.String r5 = r3.mo123916a(r5)     // Catch:{ IOException -> 0x0130, all -> 0x012c }
            java.lang.String r0 = r0.name     // Catch:{ IOException -> 0x0130, all -> 0x012c }
            java.lang.String r0 = r3.mo123916a(r0)     // Catch:{ IOException -> 0x0130, all -> 0x012c }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x0130, all -> 0x012c }
            r3.<init>()     // Catch:{ IOException -> 0x0130, all -> 0x012c }
            r3.append(r5)     // Catch:{ IOException -> 0x0130, all -> 0x012c }
            java.lang.String r5 = ":"
            r3.append(r5)     // Catch:{ IOException -> 0x0130, all -> 0x012c }
            r3.append(r0)     // Catch:{ IOException -> 0x0130, all -> 0x012c }
            java.lang.String r0 = ":"
            r3.append(r0)     // Catch:{ IOException -> 0x0130, all -> 0x012c }
            r3.append(r1)     // Catch:{ IOException -> 0x0130, all -> 0x012c }
            java.lang.String r0 = ":"
            r3.append(r0)     // Catch:{ IOException -> 0x0130, all -> 0x012c }
            r3.append(r2)     // Catch:{ IOException -> 0x0130, all -> 0x012c }
            java.lang.String r0 = r3.toString()     // Catch:{ IOException -> 0x0130, all -> 0x012c }
            com.google.android.libraries.ac.b.i.l r1 = r13.f396533h     // Catch:{ IOException -> 0x0130, all -> 0x012c }
            com.google.android.libraries.ac.b.i.l r9 = r1.mo123883c(r0)     // Catch:{ IOException -> 0x0130, all -> 0x012c }
            r15.mo56859c(r9)     // Catch:{ IOException -> 0x0130, all -> 0x012c }
            com.google.android.libraries.ac.b.e.bd r0 = new com.google.android.libraries.ac.b.e.bd     // Catch:{ IOException -> 0x0130, all -> 0x012c }
            dagger.a r2 = r13.f396530e     // Catch:{ IOException -> 0x0130, all -> 0x012c }
            java.lang.String r1 = "data"
            com.google.android.libraries.ac.b.i.k r5 = r9.mo123881a(r1)     // Catch:{ IOException -> 0x0130, all -> 0x012c }
            r15.mo56859c(r5)     // Catch:{ IOException -> 0x0130, all -> 0x012c }
            com.google.android.libraries.ac.b.i.h r6 = new com.google.android.libraries.ac.b.i.h     // Catch:{ IOException -> 0x0130, all -> 0x012c }
            dagger.a r1 = r13.f396529d     // Catch:{ IOException -> 0x0130, all -> 0x012c }
            com.google.android.libraries.ac.b.l.m r3 = r13.f396531f     // Catch:{ IOException -> 0x0130, all -> 0x012c }
            java.lang.Object r3 = r3.mo124004a()     // Catch:{ IOException -> 0x0130, all -> 0x012c }
            java.lang.Integer r3 = (java.lang.Integer) r3     // Catch:{ IOException -> 0x0130, all -> 0x012c }
            int r3 = r3.intValue()     // Catch:{ IOException -> 0x0130, all -> 0x012c }
            com.google.protos.aw.b.av r7 = com.google.protos.p4895aw.p4902b.C63985av.f173039g     // Catch:{ IOException -> 0x0130, all -> 0x012c }
            com.google.protobuf.eb r7 = r7.getParserForType()     // Catch:{ IOException -> 0x0130, all -> 0x012c }
            java.lang.String r8 = "changelog"
            com.google.android.libraries.ac.b.i.k r8 = r9.mo123881a(r8)     // Catch:{ IOException -> 0x0130, all -> 0x012c }
            r6.<init>(r1, r3, r7, r8)     // Catch:{ IOException -> 0x0130, all -> 0x012c }
            r15.mo56859c(r6)     // Catch:{ IOException -> 0x0130, all -> 0x012c }
            com.google.android.libraries.ac.b.i.h r7 = new com.google.android.libraries.ac.b.i.h     // Catch:{ IOException -> 0x0130, all -> 0x012c }
            dagger.a r1 = r13.f396529d     // Catch:{ IOException -> 0x0130, all -> 0x012c }
            com.google.android.libraries.ac.b.l.m r3 = r13.f396531f     // Catch:{ IOException -> 0x0130, all -> 0x012c }
            java.lang.Object r3 = r3.mo124004a()     // Catch:{ IOException -> 0x0130, all -> 0x012c }
            java.lang.Integer r3 = (java.lang.Integer) r3     // Catch:{ IOException -> 0x0130, all -> 0x012c }
            int r3 = r3.intValue()     // Catch:{ IOException -> 0x0130, all -> 0x012c }
            com.google.protos.aw.b.av r8 = com.google.protos.p4895aw.p4902b.C63985av.f173039g     // Catch:{ IOException -> 0x0130, all -> 0x012c }
            com.google.protobuf.eb r8 = r8.getParserForType()     // Catch:{ IOException -> 0x0130, all -> 0x012c }
            java.lang.String r10 = "synclog"
            com.google.android.libraries.ac.b.i.k r10 = r9.mo123881a(r10)     // Catch:{ IOException -> 0x0130, all -> 0x012c }
            r7.<init>(r1, r3, r8, r10)     // Catch:{ IOException -> 0x0130, all -> 0x012c }
            r15.mo56859c(r7)     // Catch:{ IOException -> 0x0130, all -> 0x012c }
            com.google.android.libraries.ac.b.i.i r1 = new com.google.android.libraries.ac.b.i.i     // Catch:{ IOException -> 0x0130, all -> 0x012c }
            java.lang.String r3 = "metadata"
            com.google.android.libraries.ac.b.i.k r3 = r9.mo123881a(r3)     // Catch:{ IOException -> 0x0130, all -> 0x012c }
            r1.<init>(r3)     // Catch:{ IOException -> 0x0130, all -> 0x012c }
            com.google.android.libraries.ac.b.i.a r8 = new com.google.android.libraries.ac.b.i.a     // Catch:{ IOException -> 0x0130, all -> 0x012c }
            r8.<init>(r1)     // Catch:{ IOException -> 0x0130, all -> 0x012c }
            r15.mo56859c(r8)     // Catch:{ IOException -> 0x0130, all -> 0x012c }
            dagger.a r10 = r13.f396534i     // Catch:{ IOException -> 0x0130, all -> 0x012c }
            com.google.android.libraries.ac.b.l.m r1 = r13.f396532g     // Catch:{ IOException -> 0x0130, all -> 0x012c }
            java.lang.Object r1 = r1.mo124004a()     // Catch:{ IOException -> 0x0130, all -> 0x012c }
            java.lang.Integer r1 = (java.lang.Integer) r1     // Catch:{ IOException -> 0x0130, all -> 0x012c }
            int r16 = r1.intValue()     // Catch:{ IOException -> 0x0130, all -> 0x012c }
            r1 = r0
            r3 = r14
            r11 = r18
            r17 = r12
            r12 = r16
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)     // Catch:{ IOException -> 0x012a }
            java.util.Map r1 = r13.f396527a     // Catch:{ IOException -> 0x012a }
            r1.put(r14, r0)     // Catch:{ IOException -> 0x012a }
            r3 = r0
            goto L_0x0121
        L_0x011f:
            r17 = r12
        L_0x0121:
            com.google.common.util.concurrent.u r0 = r13.f396528b     // Catch:{ IOException -> 0x012a }
            r1 = 1
            r0.mo57435a(r14, r1)     // Catch:{ IOException -> 0x012a }
            monitor-exit(r17)     // Catch:{ all -> 0x0138 }
            return r3
        L_0x012a:
            r0 = move-exception
            goto L_0x0133
        L_0x012c:
            r0 = move-exception
            r17 = r12
            goto L_0x0151
        L_0x0130:
            r0 = move-exception
            r17 = r12
        L_0x0133:
            r1 = r0
            r15.close()     // Catch:{ IOException -> 0x013a }
            goto L_0x014c
        L_0x0138:
            r0 = move-exception
            goto L_0x0151
        L_0x013a:
            r0 = move-exception
            r2 = r0
            dagger.a r0 = r13.f396530e     // Catch:{ all -> 0x0138 }
            java.lang.Object r0 = r0.mo27525b()     // Catch:{ all -> 0x0138 }
            com.google.android.libraries.ac.d.b.b.d.m r0 = (com.google.android.libraries.p10923ac.p10948d.p10953b.p10955b.p10962d.C147256m) r0     // Catch:{ all -> 0x0138 }
            java.lang.String r3 = "Failure cleaning up erroneous creation of accessor object"
            r4 = 0
            java.lang.Object[] r4 = new java.lang.Object[r4]     // Catch:{ all -> 0x0138 }
            r0.mo124063f(r3, r2, r4)     // Catch:{ all -> 0x0138 }
        L_0x014c:
            com.google.android.libraries.ac.b.i.at r0 = com.google.android.libraries.p10923ac.p10925b.p10942i.C147075at.m239771a(r1)     // Catch:{ all -> 0x0138 }
            throw r0     // Catch:{ all -> 0x0138 }
        L_0x0151:
            monitor-exit(r17)     // Catch:{ all -> 0x0138 }
            throw r0
        L_0x0153:
            com.google.android.libraries.ac.b.i.at r0 = new com.google.android.libraries.ac.b.i.at     // Catch:{ InterruptedException -> 0x0175, ExecutionException -> 0x0173 }
            java.lang.String r1 = java.lang.String.valueOf(r3)     // Catch:{ InterruptedException -> 0x0175, ExecutionException -> 0x0173 }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ InterruptedException -> 0x0175, ExecutionException -> 0x0173 }
            r2.<init>()     // Catch:{ InterruptedException -> 0x0175, ExecutionException -> 0x0173 }
            java.lang.String r3 = "Didn't find find channel "
            r2.append(r3)     // Catch:{ InterruptedException -> 0x0175, ExecutionException -> 0x0173 }
            r2.append(r1)     // Catch:{ InterruptedException -> 0x0175, ExecutionException -> 0x0173 }
            java.lang.String r1 = " in ChannelConfigList."
            r2.append(r1)     // Catch:{ InterruptedException -> 0x0175, ExecutionException -> 0x0173 }
            java.lang.String r1 = r2.toString()     // Catch:{ InterruptedException -> 0x0175, ExecutionException -> 0x0173 }
            r0.<init>(r1)     // Catch:{ InterruptedException -> 0x0175, ExecutionException -> 0x0173 }
            throw r0     // Catch:{ InterruptedException -> 0x0175, ExecutionException -> 0x0173 }
        L_0x0173:
            r0 = move-exception
            goto L_0x0176
        L_0x0175:
            r0 = move-exception
        L_0x0176:
            com.google.android.libraries.ac.b.i.at r1 = new com.google.android.libraries.ac.b.i.at
            java.lang.String r2 = "Failed to retrieve Channel properties"
            r1.<init>(r2, r0)
            goto L_0x017f
        L_0x017e:
            throw r1
        L_0x017f:
            goto L_0x017e
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.p10923ac.p10925b.p10934e.C146900bc.mo123776a(android.accounts.Account, int, int):com.google.android.libraries.ac.b.e.az");
    }

    /* access modifiers changed from: protected */
    public final void finalize() {
        synchronized (this.f396527a) {
            for (Map.Entry entry : this.f396527a.entrySet()) {
                ((C147256m) this.f396530e.mo27525b()).mo124067j("Channel %s was not closed. Closing it in finalizer.", entry.getKey());
                ((C146856az) entry.getValue()).close();
            }
        }
        super.finalize();
    }
}
