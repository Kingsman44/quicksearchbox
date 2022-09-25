package androidx.work.impl.p207b;

import android.database.Cursor;
import android.os.CancellationSignal;
import androidx.p060c.C0973c;
import androidx.p060c.C0977g;
import androidx.p182p.C3925ah;
import androidx.p182p.C3929al;
import androidx.p182p.C3930am;
import androidx.p182p.p185c.C3939a;
import androidx.p182p.p185c.C3940b;
import androidx.p182p.p185c.C3943e;
import androidx.work.C4632m;
import java.util.ArrayList;
import java.util.Set;
import java.util.TreeMap;

/* renamed from: androidx.work.impl.b.j */
/* compiled from: PG */
public final class C4501j implements C4500i {

    /* renamed from: a */
    private final C3925ah f14261a;

    public C4501j(C3925ah ahVar) {
        this.f14261a = ahVar;
    }

    /* renamed from: b */
    private final void m12828b(C0977g gVar) {
        byte[] bArr;
        int i;
        Set<String> keySet = gVar.keySet();
        C0973c cVar = (C0973c) keySet;
        if (cVar.f3089a.isEmpty()) {
            return;
        }
        if (gVar.f3122d > 999) {
            C0977g gVar2 = new C0977g(999);
            int i2 = gVar.f3122d;
            int i3 = 0;
            loop0:
            while (true) {
                i = 0;
                while (i3 < i2) {
                    gVar2.put((String) gVar.mo3702e(i3), (ArrayList) gVar.mo3708h(i3));
                    i3++;
                    i++;
                    if (i == 999) {
                        m12828b(gVar2);
                        gVar2 = new C0977g(999);
                    }
                }
                break loop0;
            }
            if (i > 0) {
                m12828b(gVar2);
                return;
            }
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("SELECT `progress`,`work_spec_id` FROM `WorkProgress` WHERE `work_spec_id` IN (");
        int i4 = cVar.f3089a.f3122d;
        C3943e.m11297a(sb, i4);
        sb.append(")");
        String sb2 = sb.toString();
        TreeMap treeMap = C3930am.f12576a;
        C3930am a = C3929al.m11267a(sb2, i4);
        int i5 = 1;
        for (String str : keySet) {
            if (str == null) {
                a.f12582g[i5] = 1;
            } else {
                a.mo8206g(i5, str);
            }
            i5++;
        }
        Cursor a2 = C3940b.m11293a(this.f14261a, a, false, (CancellationSignal) null);
        try {
            int a3 = C3939a.m11291a(a2, "work_spec_id");
            if (a3 != -1) {
                while (a2.moveToNext()) {
                    ArrayList arrayList = (ArrayList) gVar.get(a2.getString(a3));
                    if (arrayList != null) {
                        if (a2.isNull(0)) {
                            bArr = null;
                        } else {
                            bArr = a2.getBlob(0);
                        }
                        arrayList.add(C4632m.m13035a(bArr));
                    }
                }
                return;
            }
            a2.close();
        } finally {
            a2.close();
        }
    }

    /* renamed from: c */
    private final void m12829c(C0977g gVar) {
        String str;
        int i;
        Set<String> keySet = gVar.keySet();
        C0973c cVar = (C0973c) keySet;
        if (cVar.f3089a.isEmpty()) {
            return;
        }
        if (gVar.f3122d > 999) {
            C0977g gVar2 = new C0977g(999);
            int i2 = gVar.f3122d;
            int i3 = 0;
            loop0:
            while (true) {
                i = 0;
                while (i3 < i2) {
                    gVar2.put((String) gVar.mo3702e(i3), (ArrayList) gVar.mo3708h(i3));
                    i3++;
                    i++;
                    if (i == 999) {
                        m12829c(gVar2);
                        gVar2 = new C0977g(999);
                    }
                }
                break loop0;
            }
            if (i > 0) {
                m12829c(gVar2);
                return;
            }
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("SELECT `tag`,`work_spec_id` FROM `WorkTag` WHERE `work_spec_id` IN (");
        int i4 = cVar.f3089a.f3122d;
        C3943e.m11297a(sb, i4);
        sb.append(")");
        String sb2 = sb.toString();
        TreeMap treeMap = C3930am.f12576a;
        C3930am a = C3929al.m11267a(sb2, i4);
        int i5 = 1;
        for (String str2 : keySet) {
            if (str2 == null) {
                a.f12582g[i5] = 1;
            } else {
                a.mo8206g(i5, str2);
            }
            i5++;
        }
        Cursor a2 = C3940b.m11293a(this.f14261a, a, false, (CancellationSignal) null);
        try {
            int a3 = C3939a.m11291a(a2, "work_spec_id");
            if (a3 != -1) {
                while (a2.moveToNext()) {
                    ArrayList arrayList = (ArrayList) gVar.get(a2.getString(a3));
                    if (arrayList != null) {
                        if (a2.isNull(0)) {
                            str = null;
                        } else {
                            str = a2.getString(0);
                        }
                        arrayList.add(str);
                    }
                }
                return;
            }
            a2.close();
        } finally {
            a2.close();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x0093 A[Catch:{ all -> 0x0101 }] */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0095 A[Catch:{ all -> 0x0101 }] */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x00a0 A[Catch:{ all -> 0x0101 }] */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x00a3 A[Catch:{ all -> 0x0101 }] */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00b8 A[Catch:{ all -> 0x0101 }] */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00bb A[Catch:{ all -> 0x0101 }] */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00c3 A[Catch:{ all -> 0x0101 }] */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00c6 A[Catch:{ all -> 0x0101 }] */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00d8 A[Catch:{ all -> 0x0101 }] */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00eb A[Catch:{ all -> 0x0101 }] */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x00f0 A[SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.List mo9458a(androidx.p186q.p187a.C4056k r22) {
        /*
            r21 = this;
            r1 = r21
            androidx.p.ah r0 = r1.f14261a
            r0.mo8175S()
            androidx.p.ah r0 = r1.f14261a
            r2 = 1
            r3 = 0
            r4 = r22
            android.database.Cursor r2 = androidx.p182p.p185c.C3940b.m11293a(r0, r4, r2, r3)
            java.lang.String r0 = "id"
            int r0 = androidx.p182p.p185c.C3939a.m11291a(r2, r0)     // Catch:{ all -> 0x0101 }
            java.lang.String r4 = "state"
            int r4 = androidx.p182p.p185c.C3939a.m11291a(r2, r4)     // Catch:{ all -> 0x0101 }
            java.lang.String r5 = "output"
            int r5 = androidx.p182p.p185c.C3939a.m11291a(r2, r5)     // Catch:{ all -> 0x0101 }
            java.lang.String r6 = "run_attempt_count"
            int r6 = androidx.p182p.p185c.C3939a.m11291a(r2, r6)     // Catch:{ all -> 0x0101 }
            java.lang.String r7 = "generation"
            int r7 = androidx.p182p.p185c.C3939a.m11291a(r2, r7)     // Catch:{ all -> 0x0101 }
            androidx.c.g r8 = new androidx.c.g     // Catch:{ all -> 0x0101 }
            r8.<init>()     // Catch:{ all -> 0x0101 }
            androidx.c.g r9 = new androidx.c.g     // Catch:{ all -> 0x0101 }
            r9.<init>()     // Catch:{ all -> 0x0101 }
        L_0x0039:
            boolean r10 = r2.moveToNext()     // Catch:{ all -> 0x0101 }
            if (r10 == 0) goto L_0x0068
            java.lang.String r10 = r2.getString(r0)     // Catch:{ all -> 0x0101 }
            java.lang.Object r11 = r8.get(r10)     // Catch:{ all -> 0x0101 }
            java.util.ArrayList r11 = (java.util.ArrayList) r11     // Catch:{ all -> 0x0101 }
            if (r11 != 0) goto L_0x0053
            java.util.ArrayList r11 = new java.util.ArrayList     // Catch:{ all -> 0x0101 }
            r11.<init>()     // Catch:{ all -> 0x0101 }
            r8.put(r10, r11)     // Catch:{ all -> 0x0101 }
        L_0x0053:
            java.lang.String r10 = r2.getString(r0)     // Catch:{ all -> 0x0101 }
            java.lang.Object r11 = r9.get(r10)     // Catch:{ all -> 0x0101 }
            java.util.ArrayList r11 = (java.util.ArrayList) r11     // Catch:{ all -> 0x0101 }
            if (r11 != 0) goto L_0x0039
            java.util.ArrayList r11 = new java.util.ArrayList     // Catch:{ all -> 0x0101 }
            r11.<init>()     // Catch:{ all -> 0x0101 }
            r9.put(r10, r11)     // Catch:{ all -> 0x0101 }
            goto L_0x0039
        L_0x0068:
            r10 = -1
            r2.moveToPosition(r10)     // Catch:{ all -> 0x0101 }
            r1.m12829c(r8)     // Catch:{ all -> 0x0101 }
            r1.m12828b(r9)     // Catch:{ all -> 0x0101 }
            java.util.ArrayList r11 = new java.util.ArrayList     // Catch:{ all -> 0x0101 }
            int r12 = r2.getCount()     // Catch:{ all -> 0x0101 }
            r11.<init>(r12)     // Catch:{ all -> 0x0101 }
        L_0x007b:
            boolean r12 = r2.moveToNext()     // Catch:{ all -> 0x0101 }
            if (r12 == 0) goto L_0x00fd
            if (r0 != r10) goto L_0x0085
        L_0x0083:
            r14 = r3
            goto L_0x0091
        L_0x0085:
            boolean r12 = r2.isNull(r0)     // Catch:{ all -> 0x0101 }
            if (r12 == 0) goto L_0x008c
            goto L_0x0083
        L_0x008c:
            java.lang.String r12 = r2.getString(r0)     // Catch:{ all -> 0x0101 }
            r14 = r12
        L_0x0091:
            if (r4 != r10) goto L_0x0095
            r15 = r3
            goto L_0x009e
        L_0x0095:
            int r12 = r2.getInt(r4)     // Catch:{ all -> 0x0101 }
            androidx.work.ar r12 = androidx.work.impl.p207b.C4493ba.m12812h(r12)     // Catch:{ all -> 0x0101 }
            r15 = r12
        L_0x009e:
            if (r5 != r10) goto L_0x00a3
            r16 = r3
            goto L_0x00b5
        L_0x00a3:
            boolean r12 = r2.isNull(r5)     // Catch:{ all -> 0x0101 }
            if (r12 == 0) goto L_0x00ab
            r12 = r3
            goto L_0x00af
        L_0x00ab:
            byte[] r12 = r2.getBlob(r5)     // Catch:{ all -> 0x0101 }
        L_0x00af:
            androidx.work.m r12 = androidx.work.C4632m.m13035a(r12)     // Catch:{ all -> 0x0101 }
            r16 = r12
        L_0x00b5:
            r12 = 0
            if (r6 != r10) goto L_0x00bb
            r17 = 0
            goto L_0x00c1
        L_0x00bb:
            int r13 = r2.getInt(r6)     // Catch:{ all -> 0x0101 }
            r17 = r13
        L_0x00c1:
            if (r7 != r10) goto L_0x00c6
            r18 = 0
            goto L_0x00cc
        L_0x00c6:
            int r12 = r2.getInt(r7)     // Catch:{ all -> 0x0101 }
            r18 = r12
        L_0x00cc:
            java.lang.String r12 = r2.getString(r0)     // Catch:{ all -> 0x0101 }
            java.lang.Object r12 = r8.get(r12)     // Catch:{ all -> 0x0101 }
            java.util.ArrayList r12 = (java.util.ArrayList) r12     // Catch:{ all -> 0x0101 }
            if (r12 != 0) goto L_0x00dd
            java.util.ArrayList r12 = new java.util.ArrayList     // Catch:{ all -> 0x0101 }
            r12.<init>()     // Catch:{ all -> 0x0101 }
        L_0x00dd:
            r19 = r12
            java.lang.String r12 = r2.getString(r0)     // Catch:{ all -> 0x0101 }
            java.lang.Object r12 = r9.get(r12)     // Catch:{ all -> 0x0101 }
            java.util.ArrayList r12 = (java.util.ArrayList) r12     // Catch:{ all -> 0x0101 }
            if (r12 != 0) goto L_0x00f0
            java.util.ArrayList r12 = new java.util.ArrayList     // Catch:{ all -> 0x0101 }
            r12.<init>()     // Catch:{ all -> 0x0101 }
        L_0x00f0:
            r20 = r12
            androidx.work.impl.b.ad r12 = new androidx.work.impl.b.ad     // Catch:{ all -> 0x0101 }
            r13 = r12
            r13.<init>(r14, r15, r16, r17, r18, r19, r20)     // Catch:{ all -> 0x0101 }
            r11.add(r12)     // Catch:{ all -> 0x0101 }
            goto L_0x007b
        L_0x00fd:
            r2.close()
            return r11
        L_0x0101:
            r0 = move-exception
            r2.close()
            goto L_0x0107
        L_0x0106:
            throw r0
        L_0x0107:
            goto L_0x0106
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.work.impl.p207b.C4501j.mo9458a(androidx.q.a.k):java.util.List");
    }
}
