package com.google.android.libraries.p1649b.p1650a;

import android.util.Log;
import com.google.common.p4552o.p4566l.C60214n;
import com.google.common.p4552o.p4566l.C60218r;
import com.google.protos.p4816ai.p4817a.C63188b;
import com.google.protos.p4816ai.p4817a.C63190d;
import com.google.protos.p4816ai.p4817a.C63192f;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Random;
import p3186j$.util.concurrent.ConcurrentHashMap;

/* renamed from: com.google.android.libraries.b.a.d */
/* compiled from: PG */
public final class C19607d {

    /* renamed from: a */
    public boolean f54554a;

    /* renamed from: b */
    public C19608e f54555b;

    /* renamed from: c */
    public int f54556c = 1;

    /* renamed from: d */
    public int f54557d = 1;

    /* renamed from: e */
    public final List f54558e = new ArrayList();

    /* renamed from: f */
    public final Map f54559f = new ConcurrentHashMap();

    /* renamed from: g */
    public C60218r f54560g;

    /* renamed from: h */
    public String f54561h;

    /* renamed from: i */
    public final Random f54562i;

    /* renamed from: j */
    public int f54563j;

    public C19607d() {
        Random random = new Random();
        this.f54562i = random;
        this.f54554a = true;
        this.f54563j = random.nextInt();
    }

    /* renamed from: a */
    public static C63192f m37425a(long j, int i, int i2, int i3) {
        C63188b bVar = (C63188b) m37427e(j, 1).toBuilder();
        bVar.copyOnWrite();
        C63192f fVar = (C63192f) bVar.instance;
        fVar.f170701a |= 32;
        fVar.f170709i = i;
        bVar.copyOnWrite();
        C63192f fVar2 = (C63192f) bVar.instance;
        fVar2.f170701a |= 16;
        fVar2.f170708h = i2;
        bVar.copyOnWrite();
        C63192f fVar3 = (C63192f) bVar.instance;
        fVar3.f170701a |= 64;
        fVar3.f170710j = i3;
        return (C63192f) bVar.build();
    }

    /* renamed from: d */
    public static C63192f m37426d(long j, int i) {
        C63188b bVar = (C63188b) m37427e(j, 7).toBuilder();
        bVar.copyOnWrite();
        C63192f fVar = (C63192f) bVar.instance;
        fVar.f170713m = i;
        fVar.f170701a |= 4096;
        return (C63192f) bVar.build();
    }

    /* renamed from: e */
    public static C63192f m37427e(long j, int i) {
        C63188b bVar = (C63188b) C63192f.f170699q.createBuilder();
        bVar.copyOnWrite();
        C63192f fVar = (C63192f) bVar.instance;
        fVar.f170705e = i - 1;
        fVar.f170701a |= 2;
        bVar.copyOnWrite();
        C63192f fVar2 = (C63192f) bVar.instance;
        fVar2.f170701a |= 1;
        fVar2.f170704d = j;
        return (C63192f) bVar.build();
    }

    /* renamed from: f */
    private final void m37428f(C63192f fVar) {
        int i;
        int i2;
        int hashCode = hashCode();
        int a = C63190d.m96203a(fVar.f170705e);
        if (a == 0) {
            a = 1;
        }
        int i3 = a - 1;
        int i4 = 0;
        if (i3 == 0) {
            Log.d("AttentionEventLogger", String.format("%d|VP:%dx%d top=%d", new Object[]{Integer.valueOf(hashCode), Integer.valueOf(fVar.f170709i), Integer.valueOf(fVar.f170708h), Integer.valueOf(fVar.f170710j)}));
        } else if (i3 == 1) {
            int i5 = fVar.f170702b;
            if (i5 == 19) {
                C60214n nVar = (C60214n) fVar.f170703c;
                i = nVar.f162917b;
                i2 = nVar.f162918c;
            } else {
                i = i5 == 10 ? ((Integer) fVar.f170703c).intValue() : 0;
                i2 = 0;
            }
            Log.d("AttentionEventLogger", String.format("%d|VE<%d,%d,%d> %dx%d top=%d", new Object[]{Integer.valueOf(hashCode), Integer.valueOf(fVar.f170714n), Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(fVar.f170709i), Integer.valueOf(fVar.f170708h), Integer.valueOf(fVar.f170706f)}));
        } else if (i3 == 2) {
            Log.d("AttentionEventLogger", String.format("%d|PAUSE(idle=%d)", new Object[]{Integer.valueOf(hashCode), Long.valueOf(fVar.f170712l)}));
        } else if (i3 == 3) {
            Log.d("AttentionEventLogger", String.format("%d|SC:%d,%d indeterministic:%s", new Object[]{Integer.valueOf(hashCode), Integer.valueOf(fVar.f170710j), Integer.valueOf(fVar.f170711k), Boolean.valueOf(fVar.f170716p)}));
        } else if (i3 != 6) {
            switch (i3) {
                case 9:
                    Object[] objArr = new Object[5];
                    objArr[0] = Integer.valueOf(hashCode);
                    objArr[1] = Integer.valueOf(fVar.f170710j);
                    objArr[2] = Integer.valueOf(fVar.f170711k);
                    objArr[3] = Integer.valueOf(fVar.f170714n);
                    if (fVar.f170702b == 10) {
                        i4 = ((Integer) fVar.f170703c).intValue();
                    }
                    objArr[4] = Integer.valueOf(i4);
                    Log.d("AttentionEventLogger", String.format("%d|SW:%d,%d,%d,%d", objArr));
                    return;
                case 10:
                    Log.d("AttentionEventLogger", String.format("%d|DOM_CHANGE", new Object[]{Integer.valueOf(hashCode)}));
                    return;
                case 11:
                    Log.d("AttentionEventLogger", String.format("%d|EI(%d=%s)", new Object[]{Integer.valueOf(hashCode), Integer.valueOf(fVar.f170714n), fVar.f170715o}));
                    return;
                default:
                    Log.d("AttentionEventLogger", String.format("%d|%s", new Object[]{Integer.valueOf(hashCode), fVar}));
                    return;
            }
        } else {
            Log.d("AttentionEventLogger", String.format("%d|EXIT", new Object[]{Integer.valueOf(hashCode)}));
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:37:0x0133, code lost:
        return;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void mo24935b() {
        /*
            r9 = this;
            monitor-enter(r9)
            com.google.android.libraries.b.a.e r0 = r9.f54555b     // Catch:{ all -> 0x0134 }
            if (r0 == 0) goto L_0x0132
            java.util.List r0 = r9.f54558e     // Catch:{ all -> 0x0134 }
            boolean r0 = r0.isEmpty()     // Catch:{ all -> 0x0134 }
            if (r0 == 0) goto L_0x000f
            goto L_0x0132
        L_0x000f:
            com.google.protos.ai.a.g r0 = com.google.protos.p4816ai.p4817a.C63193g.f170718h     // Catch:{ all -> 0x0134 }
            com.google.protobuf.bn r0 = r0.createBuilder()     // Catch:{ all -> 0x0134 }
            com.google.protos.ai.a.a r0 = (com.google.protos.p4816ai.p4817a.C63187a) r0     // Catch:{ all -> 0x0134 }
            r0.copyOnWrite()     // Catch:{ all -> 0x0134 }
            com.google.protobuf.bv r1 = r0.instance     // Catch:{ all -> 0x0134 }
            com.google.protos.ai.a.g r1 = (com.google.protos.p4816ai.p4817a.C63193g) r1     // Catch:{ all -> 0x0134 }
            int r2 = r1.f170720a     // Catch:{ all -> 0x0134 }
            r2 = r2 | 8
            r1.f170720a = r2     // Catch:{ all -> 0x0134 }
            java.lang.String r2 = "V"
            r1.f170724e = r2     // Catch:{ all -> 0x0134 }
            int r1 = r9.f54557d     // Catch:{ all -> 0x0134 }
            r0.copyOnWrite()     // Catch:{ all -> 0x0134 }
            com.google.protobuf.bv r2 = r0.instance     // Catch:{ all -> 0x0134 }
            com.google.protos.ai.a.g r2 = (com.google.protos.p4816ai.p4817a.C63193g) r2     // Catch:{ all -> 0x0134 }
            int r3 = r2.f170720a     // Catch:{ all -> 0x0134 }
            r3 = r3 | 1
            r2.f170720a = r3     // Catch:{ all -> 0x0134 }
            r2.f170721b = r1     // Catch:{ all -> 0x0134 }
            int r1 = r9.f54563j     // Catch:{ all -> 0x0134 }
            r0.copyOnWrite()     // Catch:{ all -> 0x0134 }
            com.google.protobuf.bv r2 = r0.instance     // Catch:{ all -> 0x0134 }
            com.google.protos.ai.a.g r2 = (com.google.protos.p4816ai.p4817a.C63193g) r2     // Catch:{ all -> 0x0134 }
            int r3 = r2.f170720a     // Catch:{ all -> 0x0134 }
            r3 = r3 | 16
            r2.f170720a = r3     // Catch:{ all -> 0x0134 }
            r2.f170726g = r1     // Catch:{ all -> 0x0134 }
            java.util.Map r1 = r9.f54559f     // Catch:{ all -> 0x0134 }
            java.util.Set r1 = r1.keySet()     // Catch:{ all -> 0x0134 }
            java.util.Iterator r1 = r1.iterator()     // Catch:{ all -> 0x0134 }
        L_0x0054:
            boolean r2 = r1.hasNext()     // Catch:{ all -> 0x0134 }
            if (r2 == 0) goto L_0x00ea
            java.lang.Object r2 = r1.next()     // Catch:{ all -> 0x0134 }
            com.google.common.o.l.r r2 = (com.google.common.p4552o.p4566l.C60218r) r2     // Catch:{ all -> 0x0134 }
            java.util.Map r3 = r9.f54559f     // Catch:{ all -> 0x0134 }
            java.lang.Object r3 = r3.get(r2)     // Catch:{ all -> 0x0134 }
            java.lang.Integer r3 = (java.lang.Integer) r3     // Catch:{ all -> 0x0134 }
            int r3 = r3.intValue()     // Catch:{ all -> 0x0134 }
            boolean r4 = r9.f54554a     // Catch:{ all -> 0x0134 }
            if (r4 == 0) goto L_0x0054
            long r4 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x0134 }
            r6 = 0
            if (r2 == 0) goto L_0x00a3
            int r7 = r2.f162927a     // Catch:{ all -> 0x0134 }
            r7 = r7 & 1
            if (r7 == 0) goto L_0x00a3
            com.google.common.o.l.t r6 = r2.f162928b     // Catch:{ all -> 0x0134 }
            if (r6 != 0) goto L_0x0083
            com.google.common.o.l.t r6 = com.google.common.p4552o.p4566l.C60220t.f162931e     // Catch:{ all -> 0x0134 }
        L_0x0083:
            java.lang.String r6 = com.google.android.libraries.logging.C28294l.m52914d(r6)     // Catch:{ all -> 0x0134 }
            int r7 = r2.f162927a     // Catch:{ all -> 0x0134 }
            r7 = r7 & 2
            if (r7 == 0) goto L_0x00a3
            long r7 = r2.f162929c     // Catch:{ all -> 0x0134 }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x0134 }
            r2.<init>()     // Catch:{ all -> 0x0134 }
            r2.append(r6)     // Catch:{ all -> 0x0134 }
            java.lang.String r6 = ":"
            r2.append(r6)     // Catch:{ all -> 0x0134 }
            r2.append(r7)     // Catch:{ all -> 0x0134 }
            java.lang.String r6 = r2.toString()     // Catch:{ all -> 0x0134 }
        L_0x00a3:
            if (r6 == 0) goto L_0x0054
            r2 = 12
            com.google.protos.ai.a.f r2 = m37427e(r4, r2)     // Catch:{ all -> 0x0134 }
            com.google.protobuf.bn r2 = r2.toBuilder()     // Catch:{ all -> 0x0134 }
            com.google.protos.ai.a.b r2 = (com.google.protos.p4816ai.p4817a.C63188b) r2     // Catch:{ all -> 0x0134 }
            r2.copyOnWrite()     // Catch:{ all -> 0x0134 }
            com.google.protobuf.bv r4 = r2.instance     // Catch:{ all -> 0x0134 }
            com.google.protos.ai.a.f r4 = (com.google.protos.p4816ai.p4817a.C63192f) r4     // Catch:{ all -> 0x0134 }
            int r5 = r4.f170701a     // Catch:{ all -> 0x0134 }
            r7 = 32768(0x8000, float:4.5918E-41)
            r5 = r5 | r7
            r4.f170701a = r5     // Catch:{ all -> 0x0134 }
            r4.f170715o = r6     // Catch:{ all -> 0x0134 }
            r2.copyOnWrite()     // Catch:{ all -> 0x0134 }
            com.google.protobuf.bv r4 = r2.instance     // Catch:{ all -> 0x0134 }
            com.google.protos.ai.a.f r4 = (com.google.protos.p4816ai.p4817a.C63192f) r4     // Catch:{ all -> 0x0134 }
            int r5 = r4.f170701a     // Catch:{ all -> 0x0134 }
            r5 = r5 | 8192(0x2000, float:1.14794E-41)
            r4.f170701a = r5     // Catch:{ all -> 0x0134 }
            r4.f170714n = r3     // Catch:{ all -> 0x0134 }
            com.google.protobuf.bv r2 = r2.build()     // Catch:{ all -> 0x0134 }
            com.google.protos.ai.a.f r2 = (com.google.protos.p4816ai.p4817a.C63192f) r2     // Catch:{ all -> 0x0134 }
            java.lang.String r3 = "AttentionEventLogger"
            r4 = 3
            boolean r3 = android.util.Log.isLoggable(r3, r4)     // Catch:{ all -> 0x0134 }
            if (r3 == 0) goto L_0x00e3
            r9.m37428f(r2)     // Catch:{ all -> 0x0134 }
        L_0x00e3:
            java.util.List r3 = r9.f54558e     // Catch:{ all -> 0x0134 }
            r3.add(r2)     // Catch:{ all -> 0x0134 }
            goto L_0x0054
        L_0x00ea:
            java.util.List r1 = r9.f54558e     // Catch:{ all -> 0x0134 }
            r0.mo59193a(r1)     // Catch:{ all -> 0x0134 }
            com.google.common.o.l.r r1 = r9.f54560g     // Catch:{ all -> 0x0134 }
            if (r1 == 0) goto L_0x0102
            r0.copyOnWrite()     // Catch:{ all -> 0x0134 }
            com.google.protobuf.bv r2 = r0.instance     // Catch:{ all -> 0x0134 }
            com.google.protos.ai.a.g r2 = (com.google.protos.p4816ai.p4817a.C63193g) r2     // Catch:{ all -> 0x0134 }
            r2.f170723d = r1     // Catch:{ all -> 0x0134 }
            int r1 = r2.f170720a     // Catch:{ all -> 0x0134 }
            r1 = r1 | 4
            r2.f170720a = r1     // Catch:{ all -> 0x0134 }
        L_0x0102:
            java.lang.String r1 = r9.f54561h     // Catch:{ all -> 0x0134 }
            if (r1 == 0) goto L_0x0115
            r0.copyOnWrite()     // Catch:{ all -> 0x0134 }
            com.google.protobuf.bv r2 = r0.instance     // Catch:{ all -> 0x0134 }
            com.google.protos.ai.a.g r2 = (com.google.protos.p4816ai.p4817a.C63193g) r2     // Catch:{ all -> 0x0134 }
            int r3 = r2.f170720a     // Catch:{ all -> 0x0134 }
            r3 = r3 | 2
            r2.f170720a = r3     // Catch:{ all -> 0x0134 }
            r2.f170722c = r1     // Catch:{ all -> 0x0134 }
        L_0x0115:
            com.google.android.libraries.b.a.e r1 = r9.f54555b     // Catch:{ all -> 0x0134 }
            com.google.protobuf.bv r0 = r0.build()     // Catch:{ all -> 0x0134 }
            com.google.protos.ai.a.g r0 = (com.google.protos.p4816ai.p4817a.C63193g) r0     // Catch:{ all -> 0x0134 }
            r1.mo24937a(r0)     // Catch:{ all -> 0x0134 }
            int r0 = r9.f54557d     // Catch:{ all -> 0x0134 }
            java.util.List r1 = r9.f54558e     // Catch:{ all -> 0x0134 }
            int r1 = r1.size()     // Catch:{ all -> 0x0134 }
            int r0 = r0 + r1
            r9.f54557d = r0     // Catch:{ all -> 0x0134 }
            java.util.List r0 = r9.f54558e     // Catch:{ all -> 0x0134 }
            r0.clear()     // Catch:{ all -> 0x0134 }
            monitor-exit(r9)
            return
        L_0x0132:
            monitor-exit(r9)
            return
        L_0x0134:
            r0 = move-exception
            monitor-exit(r9)
            goto L_0x0138
        L_0x0137:
            throw r0
        L_0x0138:
            goto L_0x0137
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.p1649b.p1650a.C19607d.mo24935b():void");
    }

    /* renamed from: c */
    public final synchronized void mo24936c(C63192f fVar) {
        if (Log.isLoggable("AttentionEventLogger", 3)) {
            m37428f(fVar);
        }
        this.f54558e.add(fVar);
    }
}
