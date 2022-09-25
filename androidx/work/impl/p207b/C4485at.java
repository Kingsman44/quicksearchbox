package androidx.work.impl.p207b;

import android.database.Cursor;
import android.os.CancellationSignal;
import androidx.p060c.C0973c;
import androidx.p060c.C0977g;
import androidx.p182p.C3925ah;
import androidx.p182p.C3929al;
import androidx.p182p.C3930am;
import androidx.p182p.C3933ap;
import androidx.p182p.C3965r;
import androidx.p182p.C3966s;
import androidx.p182p.p185c.C3939a;
import androidx.p182p.p185c.C3940b;
import androidx.p182p.p185c.C3943e;
import androidx.p186q.p187a.C4057l;
import androidx.work.C4394ar;
import androidx.work.C4632m;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeMap;

/* renamed from: androidx.work.impl.b.at */
/* compiled from: PG */
public final class C4485at implements C4471af {

    /* renamed from: a */
    private final C3925ah f14237a;

    /* renamed from: b */
    private final C3966s f14238b;

    /* renamed from: c */
    private final C3965r f14239c;

    /* renamed from: d */
    private final C3933ap f14240d;

    /* renamed from: e */
    private final C3933ap f14241e;

    /* renamed from: f */
    private final C3933ap f14242f;

    /* renamed from: g */
    private final C3933ap f14243g;

    /* renamed from: h */
    private final C3933ap f14244h;

    /* renamed from: i */
    private final C3933ap f14245i;

    /* renamed from: j */
    private final C3933ap f14246j;

    /* renamed from: k */
    private final C3933ap f14247k;

    /* renamed from: l */
    private final C3933ap f14248l;

    /* renamed from: m */
    private final C3933ap f14249m;

    public C4485at(C3925ah ahVar) {
        this.f14237a = ahVar;
        this.f14238b = new C4476ak(ahVar);
        this.f14239c = new C4477al(ahVar);
        this.f14240d = new C4478am(ahVar);
        this.f14241e = new C4479an(ahVar);
        this.f14242f = new C4480ao(ahVar);
        this.f14243g = new C4481ap(ahVar);
        this.f14244h = new C4482aq(ahVar);
        this.f14245i = new C4483ar(ahVar);
        this.f14246j = new C4484as(ahVar);
        this.f14247k = new C4472ag(ahVar);
        this.f14248l = new C4473ah(ahVar);
        this.f14249m = new C4474ai(ahVar);
        new C4475aj(ahVar);
    }

    /* renamed from: A */
    private final void m12764A(C0977g gVar) {
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
                        m12764A(gVar2);
                        gVar2 = new C0977g(999);
                    }
                }
                break loop0;
            }
            if (i > 0) {
                m12764A(gVar2);
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
        Cursor a2 = C3940b.m11293a(this.f14237a, a, false, (CancellationSignal) null);
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

    /* renamed from: z */
    private final void m12765z(C0977g gVar) {
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
                        m12765z(gVar2);
                        gVar2 = new C0977g(999);
                    }
                }
                break loop0;
            }
            if (i > 0) {
                m12765z(gVar2);
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
        Cursor a2 = C3940b.m11293a(this.f14237a, a, false, (CancellationSignal) null);
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

    /* renamed from: a */
    public final C4394ar mo9421a(String str) {
        Integer num;
        TreeMap treeMap = C3930am.f12576a;
        C3930am a = C3929al.m11267a("SELECT state FROM workspec WHERE id=?", 1);
        if (str == null) {
            a.f12582g[1] = 1;
        } else {
            a.mo8206g(1, str);
        }
        this.f14237a.mo8175S();
        C4394ar arVar = null;
        Cursor a2 = C3940b.m11293a(this.f14237a, a, false, (CancellationSignal) null);
        try {
            if (a2.moveToFirst()) {
                if (a2.isNull(0)) {
                    num = null;
                } else {
                    num = Integer.valueOf(a2.getInt(0));
                }
                if (num != null) {
                    arVar = C4493ba.m12812h(num.intValue());
                }
            }
            return arVar;
        } finally {
            a2.close();
            a.mo8207h();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:61:0x01e6 A[Catch:{ all -> 0x023d }] */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x01e9 A[Catch:{ all -> 0x023d }] */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x01f1 A[Catch:{ all -> 0x023d }] */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x01f4 A[Catch:{ all -> 0x023d }] */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x01fc A[Catch:{ all -> 0x023d }] */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x01ff A[Catch:{ all -> 0x023d }] */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x0207 A[Catch:{ all -> 0x023d }] */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x020a A[Catch:{ all -> 0x023d }] */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x021a A[Catch:{ all -> 0x023d }] */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x021c A[Catch:{ all -> 0x023d }] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final androidx.work.impl.p207b.C4470ae mo9422b(java.lang.String r58) {
        /*
            r57 = this;
            r1 = r57
            r0 = r58
            java.util.TreeMap r2 = androidx.p182p.C3930am.f12576a
            java.lang.String r2 = "SELECT * FROM workspec WHERE id=?"
            r3 = 1
            androidx.p.am r2 = androidx.p182p.C3929al.m11267a(r2, r3)
            if (r0 != 0) goto L_0x0014
            int[] r0 = r2.f12582g
            r0[r3] = r3
            goto L_0x0017
        L_0x0014:
            r2.mo8206g(r3, r0)
        L_0x0017:
            androidx.p.ah r0 = r1.f14237a
            r0.mo8175S()
            androidx.p.ah r0 = r1.f14237a
            r4 = 0
            r5 = 0
            android.database.Cursor r6 = androidx.p182p.p185c.C3940b.m11293a(r0, r2, r4, r5)
            java.lang.String r0 = "id"
            int r0 = androidx.p182p.p185c.C3939a.m11292b(r6, r0)     // Catch:{ all -> 0x023f }
            java.lang.String r7 = "state"
            int r7 = androidx.p182p.p185c.C3939a.m11292b(r6, r7)     // Catch:{ all -> 0x023f }
            java.lang.String r8 = "worker_class_name"
            int r8 = androidx.p182p.p185c.C3939a.m11292b(r6, r8)     // Catch:{ all -> 0x023f }
            java.lang.String r9 = "input_merger_class_name"
            int r9 = androidx.p182p.p185c.C3939a.m11292b(r6, r9)     // Catch:{ all -> 0x023f }
            java.lang.String r10 = "input"
            int r10 = androidx.p182p.p185c.C3939a.m11292b(r6, r10)     // Catch:{ all -> 0x023f }
            java.lang.String r11 = "output"
            int r11 = androidx.p182p.p185c.C3939a.m11292b(r6, r11)     // Catch:{ all -> 0x023f }
            java.lang.String r12 = "initial_delay"
            int r12 = androidx.p182p.p185c.C3939a.m11292b(r6, r12)     // Catch:{ all -> 0x023f }
            java.lang.String r13 = "interval_duration"
            int r13 = androidx.p182p.p185c.C3939a.m11292b(r6, r13)     // Catch:{ all -> 0x023f }
            java.lang.String r14 = "flex_duration"
            int r14 = androidx.p182p.p185c.C3939a.m11292b(r6, r14)     // Catch:{ all -> 0x023f }
            java.lang.String r15 = "run_attempt_count"
            int r15 = androidx.p182p.p185c.C3939a.m11292b(r6, r15)     // Catch:{ all -> 0x023f }
            java.lang.String r3 = "backoff_policy"
            int r3 = androidx.p182p.p185c.C3939a.m11292b(r6, r3)     // Catch:{ all -> 0x023f }
            java.lang.String r4 = "backoff_delay_duration"
            int r4 = androidx.p182p.p185c.C3939a.m11292b(r6, r4)     // Catch:{ all -> 0x023f }
            java.lang.String r5 = "last_enqueue_time"
            int r5 = androidx.p182p.p185c.C3939a.m11292b(r6, r5)     // Catch:{ all -> 0x023f }
            java.lang.String r1 = "minimum_retention_duration"
            int r1 = androidx.p182p.p185c.C3939a.m11292b(r6, r1)     // Catch:{ all -> 0x023f }
            r16 = r2
            java.lang.String r2 = "schedule_requested_at"
            int r2 = androidx.p182p.p185c.C3939a.m11292b(r6, r2)     // Catch:{ all -> 0x023d }
            r17 = r2
            java.lang.String r2 = "run_in_foreground"
            int r2 = androidx.p182p.p185c.C3939a.m11292b(r6, r2)     // Catch:{ all -> 0x023d }
            r18 = r2
            java.lang.String r2 = "out_of_quota_policy"
            int r2 = androidx.p182p.p185c.C3939a.m11292b(r6, r2)     // Catch:{ all -> 0x023d }
            r19 = r2
            java.lang.String r2 = "period_count"
            int r2 = androidx.p182p.p185c.C3939a.m11292b(r6, r2)     // Catch:{ all -> 0x023d }
            r20 = r2
            java.lang.String r2 = "generation"
            int r2 = androidx.p182p.p185c.C3939a.m11292b(r6, r2)     // Catch:{ all -> 0x023d }
            r21 = r2
            java.lang.String r2 = "required_network_type"
            int r2 = androidx.p182p.p185c.C3939a.m11292b(r6, r2)     // Catch:{ all -> 0x023d }
            r22 = r2
            java.lang.String r2 = "requires_charging"
            int r2 = androidx.p182p.p185c.C3939a.m11292b(r6, r2)     // Catch:{ all -> 0x023d }
            r23 = r2
            java.lang.String r2 = "requires_device_idle"
            int r2 = androidx.p182p.p185c.C3939a.m11292b(r6, r2)     // Catch:{ all -> 0x023d }
            r24 = r2
            java.lang.String r2 = "requires_battery_not_low"
            int r2 = androidx.p182p.p185c.C3939a.m11292b(r6, r2)     // Catch:{ all -> 0x023d }
            r25 = r2
            java.lang.String r2 = "requires_storage_not_low"
            int r2 = androidx.p182p.p185c.C3939a.m11292b(r6, r2)     // Catch:{ all -> 0x023d }
            r26 = r2
            java.lang.String r2 = "trigger_content_update_delay"
            int r2 = androidx.p182p.p185c.C3939a.m11292b(r6, r2)     // Catch:{ all -> 0x023d }
            r27 = r2
            java.lang.String r2 = "trigger_max_content_delay"
            int r2 = androidx.p182p.p185c.C3939a.m11292b(r6, r2)     // Catch:{ all -> 0x023d }
            r28 = r2
            java.lang.String r2 = "content_uri_triggers"
            int r2 = androidx.p182p.p185c.C3939a.m11292b(r6, r2)     // Catch:{ all -> 0x023d }
            boolean r29 = r6.moveToFirst()     // Catch:{ all -> 0x023d }
            if (r29 == 0) goto L_0x0235
            boolean r29 = r6.isNull(r0)     // Catch:{ all -> 0x023d }
            if (r29 == 0) goto L_0x00ef
            r30 = 0
            goto L_0x00f5
        L_0x00ef:
            java.lang.String r0 = r6.getString(r0)     // Catch:{ all -> 0x023d }
            r30 = r0
        L_0x00f5:
            int r0 = r6.getInt(r7)     // Catch:{ all -> 0x023d }
            androidx.work.ar r31 = androidx.work.impl.p207b.C4493ba.m12812h(r0)     // Catch:{ all -> 0x023d }
            boolean r0 = r6.isNull(r8)     // Catch:{ all -> 0x023d }
            if (r0 == 0) goto L_0x0106
            r32 = 0
            goto L_0x010c
        L_0x0106:
            java.lang.String r0 = r6.getString(r8)     // Catch:{ all -> 0x023d }
            r32 = r0
        L_0x010c:
            boolean r0 = r6.isNull(r9)     // Catch:{ all -> 0x023d }
            if (r0 == 0) goto L_0x0115
            r33 = 0
            goto L_0x011b
        L_0x0115:
            java.lang.String r0 = r6.getString(r9)     // Catch:{ all -> 0x023d }
            r33 = r0
        L_0x011b:
            boolean r0 = r6.isNull(r10)     // Catch:{ all -> 0x023d }
            if (r0 == 0) goto L_0x0123
            r0 = 0
            goto L_0x0127
        L_0x0123:
            byte[] r0 = r6.getBlob(r10)     // Catch:{ all -> 0x023d }
        L_0x0127:
            androidx.work.m r34 = androidx.work.C4632m.m13035a(r0)     // Catch:{ all -> 0x023d }
            boolean r0 = r6.isNull(r11)     // Catch:{ all -> 0x023d }
            if (r0 == 0) goto L_0x0133
            r0 = 0
            goto L_0x0137
        L_0x0133:
            byte[] r0 = r6.getBlob(r11)     // Catch:{ all -> 0x023d }
        L_0x0137:
            androidx.work.m r35 = androidx.work.C4632m.m13035a(r0)     // Catch:{ all -> 0x023d }
            long r36 = r6.getLong(r12)     // Catch:{ all -> 0x023d }
            long r38 = r6.getLong(r13)     // Catch:{ all -> 0x023d }
            long r40 = r6.getLong(r14)     // Catch:{ all -> 0x023d }
            int r43 = r6.getInt(r15)     // Catch:{ all -> 0x023d }
            int r0 = r6.getInt(r3)     // Catch:{ all -> 0x023d }
            androidx.work.a r44 = androidx.work.impl.p207b.C4493ba.m12809e(r0)     // Catch:{ all -> 0x023d }
            long r45 = r6.getLong(r4)     // Catch:{ all -> 0x023d }
            long r47 = r6.getLong(r5)     // Catch:{ all -> 0x023d }
            long r49 = r6.getLong(r1)     // Catch:{ all -> 0x023d }
            r0 = r17
            long r51 = r6.getLong(r0)     // Catch:{ all -> 0x023d }
            r0 = r18
            int r0 = r6.getInt(r0)     // Catch:{ all -> 0x023d }
            if (r0 == 0) goto L_0x0172
            r0 = r19
            r53 = 1
            goto L_0x0176
        L_0x0172:
            r0 = r19
            r53 = 0
        L_0x0176:
            int r0 = r6.getInt(r0)     // Catch:{ all -> 0x023d }
            androidx.work.am r54 = androidx.work.impl.p207b.C4493ba.m12811g(r0)     // Catch:{ all -> 0x023d }
            r0 = r20
            int r55 = r6.getInt(r0)     // Catch:{ all -> 0x023d }
            r0 = r21
            int r56 = r6.getInt(r0)     // Catch:{ all -> 0x023d }
            r0 = r22
            boolean r1 = r6.isNull(r0)     // Catch:{ all -> 0x023d }
            if (r1 == 0) goto L_0x01cc
            r1 = r23
            boolean r3 = r6.isNull(r1)     // Catch:{ all -> 0x023d }
            if (r3 == 0) goto L_0x01ce
            r3 = r24
            boolean r4 = r6.isNull(r3)     // Catch:{ all -> 0x023d }
            if (r4 == 0) goto L_0x01d0
            r4 = r25
            boolean r5 = r6.isNull(r4)     // Catch:{ all -> 0x023d }
            if (r5 == 0) goto L_0x01d2
            r5 = r26
            boolean r7 = r6.isNull(r5)     // Catch:{ all -> 0x023d }
            if (r7 == 0) goto L_0x01d4
            r7 = r27
            boolean r8 = r6.isNull(r7)     // Catch:{ all -> 0x023d }
            if (r8 == 0) goto L_0x01d6
            r8 = r28
            boolean r9 = r6.isNull(r8)     // Catch:{ all -> 0x023d }
            if (r9 == 0) goto L_0x01d8
            boolean r9 = r6.isNull(r2)     // Catch:{ all -> 0x023d }
            if (r9 != 0) goto L_0x01c9
            goto L_0x01d8
        L_0x01c9:
            r42 = 0
            goto L_0x022d
        L_0x01cc:
            r1 = r23
        L_0x01ce:
            r3 = r24
        L_0x01d0:
            r4 = r25
        L_0x01d2:
            r5 = r26
        L_0x01d4:
            r7 = r27
        L_0x01d6:
            r8 = r28
        L_0x01d8:
            int r0 = r6.getInt(r0)     // Catch:{ all -> 0x023d }
            androidx.work.ae r18 = androidx.work.impl.p207b.C4493ba.m12810f(r0)     // Catch:{ all -> 0x023d }
            int r0 = r6.getInt(r1)     // Catch:{ all -> 0x023d }
            if (r0 == 0) goto L_0x01e9
            r19 = 1
            goto L_0x01eb
        L_0x01e9:
            r19 = 0
        L_0x01eb:
            int r0 = r6.getInt(r3)     // Catch:{ all -> 0x023d }
            if (r0 == 0) goto L_0x01f4
            r20 = 1
            goto L_0x01f6
        L_0x01f4:
            r20 = 0
        L_0x01f6:
            int r0 = r6.getInt(r4)     // Catch:{ all -> 0x023d }
            if (r0 == 0) goto L_0x01ff
            r21 = 1
            goto L_0x0201
        L_0x01ff:
            r21 = 0
        L_0x0201:
            int r0 = r6.getInt(r5)     // Catch:{ all -> 0x023d }
            if (r0 == 0) goto L_0x020a
            r22 = 1
            goto L_0x020c
        L_0x020a:
            r22 = 0
        L_0x020c:
            long r23 = r6.getLong(r7)     // Catch:{ all -> 0x023d }
            long r25 = r6.getLong(r8)     // Catch:{ all -> 0x023d }
            boolean r0 = r6.isNull(r2)     // Catch:{ all -> 0x023d }
            if (r0 == 0) goto L_0x021c
            r5 = 0
            goto L_0x0220
        L_0x021c:
            byte[] r5 = r6.getBlob(r2)     // Catch:{ all -> 0x023d }
        L_0x0220:
            java.util.Set r27 = androidx.work.impl.p207b.C4493ba.m12813i(r5)     // Catch:{ all -> 0x023d }
            androidx.work.h r5 = new androidx.work.h     // Catch:{ all -> 0x023d }
            r17 = r5
            r17.<init>(r18, r19, r20, r21, r22, r23, r25, r27)     // Catch:{ all -> 0x023d }
            r42 = r5
        L_0x022d:
            androidx.work.impl.b.ae r5 = new androidx.work.impl.b.ae     // Catch:{ all -> 0x023d }
            r29 = r5
            r29.<init>(r30, r31, r32, r33, r34, r35, r36, r38, r40, r42, r43, r44, r45, r47, r49, r51, r53, r54, r55, r56)     // Catch:{ all -> 0x023d }
            goto L_0x0236
        L_0x0235:
            r5 = 0
        L_0x0236:
            r6.close()
            r16.mo8207h()
            return r5
        L_0x023d:
            r0 = move-exception
            goto L_0x0242
        L_0x023f:
            r0 = move-exception
            r16 = r2
        L_0x0242:
            r6.close()
            r16.mo8207h()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.work.impl.p207b.C4485at.mo9422b(java.lang.String):androidx.work.impl.b.ae");
    }

    /* JADX WARNING: Removed duplicated region for block: B:59:0x0220 A[Catch:{ all -> 0x029d }] */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x0223 A[Catch:{ all -> 0x029d }] */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x022b A[Catch:{ all -> 0x029d }] */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x022e A[Catch:{ all -> 0x029d }] */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x0236 A[Catch:{ all -> 0x029d }] */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x0239 A[Catch:{ all -> 0x029d }] */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x0241 A[Catch:{ all -> 0x029d }] */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x0244 A[Catch:{ all -> 0x029d }] */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x0254 A[Catch:{ all -> 0x029d }] */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x0257 A[Catch:{ all -> 0x029d }] */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.List mo9423c(int r71) {
        /*
            r70 = this;
            r1 = r70
            java.util.TreeMap r0 = androidx.p182p.C3930am.f12576a
            java.lang.String r0 = "SELECT * FROM workspec WHERE state=0 AND schedule_requested_at=-1 ORDER BY last_enqueue_time LIMIT (SELECT MAX(?-COUNT(*), 0) FROM workspec WHERE schedule_requested_at<>-1 AND state NOT IN (2, 3, 5))"
            r2 = 1
            androidx.p.am r3 = androidx.p182p.C3929al.m11267a(r0, r2)
            r0 = r71
            long r4 = (long) r0
            r3.mo8204e(r2, r4)
            androidx.p.ah r0 = r1.f14237a
            r0.mo8175S()
            androidx.p.ah r0 = r1.f14237a
            r4 = 0
            r5 = 0
            android.database.Cursor r6 = androidx.p182p.p185c.C3940b.m11293a(r0, r3, r4, r5)
            java.lang.String r0 = "id"
            int r0 = androidx.p182p.p185c.C3939a.m11292b(r6, r0)     // Catch:{ all -> 0x029f }
            java.lang.String r7 = "state"
            int r7 = androidx.p182p.p185c.C3939a.m11292b(r6, r7)     // Catch:{ all -> 0x029f }
            java.lang.String r8 = "worker_class_name"
            int r8 = androidx.p182p.p185c.C3939a.m11292b(r6, r8)     // Catch:{ all -> 0x029f }
            java.lang.String r9 = "input_merger_class_name"
            int r9 = androidx.p182p.p185c.C3939a.m11292b(r6, r9)     // Catch:{ all -> 0x029f }
            java.lang.String r10 = "input"
            int r10 = androidx.p182p.p185c.C3939a.m11292b(r6, r10)     // Catch:{ all -> 0x029f }
            java.lang.String r11 = "output"
            int r11 = androidx.p182p.p185c.C3939a.m11292b(r6, r11)     // Catch:{ all -> 0x029f }
            java.lang.String r12 = "initial_delay"
            int r12 = androidx.p182p.p185c.C3939a.m11292b(r6, r12)     // Catch:{ all -> 0x029f }
            java.lang.String r13 = "interval_duration"
            int r13 = androidx.p182p.p185c.C3939a.m11292b(r6, r13)     // Catch:{ all -> 0x029f }
            java.lang.String r14 = "flex_duration"
            int r14 = androidx.p182p.p185c.C3939a.m11292b(r6, r14)     // Catch:{ all -> 0x029f }
            java.lang.String r15 = "run_attempt_count"
            int r15 = androidx.p182p.p185c.C3939a.m11292b(r6, r15)     // Catch:{ all -> 0x029f }
            java.lang.String r2 = "backoff_policy"
            int r2 = androidx.p182p.p185c.C3939a.m11292b(r6, r2)     // Catch:{ all -> 0x029f }
            java.lang.String r4 = "backoff_delay_duration"
            int r4 = androidx.p182p.p185c.C3939a.m11292b(r6, r4)     // Catch:{ all -> 0x029f }
            java.lang.String r5 = "last_enqueue_time"
            int r5 = androidx.p182p.p185c.C3939a.m11292b(r6, r5)     // Catch:{ all -> 0x029f }
            java.lang.String r1 = "minimum_retention_duration"
            int r1 = androidx.p182p.p185c.C3939a.m11292b(r6, r1)     // Catch:{ all -> 0x029f }
            r16 = r3
            java.lang.String r3 = "schedule_requested_at"
            int r3 = androidx.p182p.p185c.C3939a.m11292b(r6, r3)     // Catch:{ all -> 0x029d }
            r17 = r3
            java.lang.String r3 = "run_in_foreground"
            int r3 = androidx.p182p.p185c.C3939a.m11292b(r6, r3)     // Catch:{ all -> 0x029d }
            r18 = r3
            java.lang.String r3 = "out_of_quota_policy"
            int r3 = androidx.p182p.p185c.C3939a.m11292b(r6, r3)     // Catch:{ all -> 0x029d }
            r19 = r3
            java.lang.String r3 = "period_count"
            int r3 = androidx.p182p.p185c.C3939a.m11292b(r6, r3)     // Catch:{ all -> 0x029d }
            r20 = r3
            java.lang.String r3 = "generation"
            int r3 = androidx.p182p.p185c.C3939a.m11292b(r6, r3)     // Catch:{ all -> 0x029d }
            r21 = r3
            java.lang.String r3 = "required_network_type"
            int r3 = androidx.p182p.p185c.C3939a.m11292b(r6, r3)     // Catch:{ all -> 0x029d }
            r22 = r3
            java.lang.String r3 = "requires_charging"
            int r3 = androidx.p182p.p185c.C3939a.m11292b(r6, r3)     // Catch:{ all -> 0x029d }
            r23 = r3
            java.lang.String r3 = "requires_device_idle"
            int r3 = androidx.p182p.p185c.C3939a.m11292b(r6, r3)     // Catch:{ all -> 0x029d }
            r24 = r3
            java.lang.String r3 = "requires_battery_not_low"
            int r3 = androidx.p182p.p185c.C3939a.m11292b(r6, r3)     // Catch:{ all -> 0x029d }
            r25 = r3
            java.lang.String r3 = "requires_storage_not_low"
            int r3 = androidx.p182p.p185c.C3939a.m11292b(r6, r3)     // Catch:{ all -> 0x029d }
            r26 = r3
            java.lang.String r3 = "trigger_content_update_delay"
            int r3 = androidx.p182p.p185c.C3939a.m11292b(r6, r3)     // Catch:{ all -> 0x029d }
            r27 = r3
            java.lang.String r3 = "trigger_max_content_delay"
            int r3 = androidx.p182p.p185c.C3939a.m11292b(r6, r3)     // Catch:{ all -> 0x029d }
            r28 = r3
            java.lang.String r3 = "content_uri_triggers"
            int r3 = androidx.p182p.p185c.C3939a.m11292b(r6, r3)     // Catch:{ all -> 0x029d }
            r29 = r3
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch:{ all -> 0x029d }
            r30 = r1
            int r1 = r6.getCount()     // Catch:{ all -> 0x029d }
            r3.<init>(r1)     // Catch:{ all -> 0x029d }
        L_0x00e7:
            boolean r1 = r6.moveToNext()     // Catch:{ all -> 0x029d }
            if (r1 == 0) goto L_0x0296
            boolean r1 = r6.isNull(r0)     // Catch:{ all -> 0x029d }
            if (r1 == 0) goto L_0x00f6
            r32 = 0
            goto L_0x00fc
        L_0x00f6:
            java.lang.String r1 = r6.getString(r0)     // Catch:{ all -> 0x029d }
            r32 = r1
        L_0x00fc:
            int r1 = r6.getInt(r7)     // Catch:{ all -> 0x029d }
            androidx.work.ar r33 = androidx.work.impl.p207b.C4493ba.m12812h(r1)     // Catch:{ all -> 0x029d }
            boolean r1 = r6.isNull(r8)     // Catch:{ all -> 0x029d }
            if (r1 == 0) goto L_0x010d
            r34 = 0
            goto L_0x0113
        L_0x010d:
            java.lang.String r1 = r6.getString(r8)     // Catch:{ all -> 0x029d }
            r34 = r1
        L_0x0113:
            boolean r1 = r6.isNull(r9)     // Catch:{ all -> 0x029d }
            if (r1 == 0) goto L_0x011c
            r35 = 0
            goto L_0x0122
        L_0x011c:
            java.lang.String r1 = r6.getString(r9)     // Catch:{ all -> 0x029d }
            r35 = r1
        L_0x0122:
            boolean r1 = r6.isNull(r10)     // Catch:{ all -> 0x029d }
            if (r1 == 0) goto L_0x012a
            r1 = 0
            goto L_0x012e
        L_0x012a:
            byte[] r1 = r6.getBlob(r10)     // Catch:{ all -> 0x029d }
        L_0x012e:
            androidx.work.m r36 = androidx.work.C4632m.m13035a(r1)     // Catch:{ all -> 0x029d }
            boolean r1 = r6.isNull(r11)     // Catch:{ all -> 0x029d }
            if (r1 == 0) goto L_0x013a
            r1 = 0
            goto L_0x013e
        L_0x013a:
            byte[] r1 = r6.getBlob(r11)     // Catch:{ all -> 0x029d }
        L_0x013e:
            androidx.work.m r37 = androidx.work.C4632m.m13035a(r1)     // Catch:{ all -> 0x029d }
            long r38 = r6.getLong(r12)     // Catch:{ all -> 0x029d }
            long r40 = r6.getLong(r13)     // Catch:{ all -> 0x029d }
            long r42 = r6.getLong(r14)     // Catch:{ all -> 0x029d }
            int r45 = r6.getInt(r15)     // Catch:{ all -> 0x029d }
            int r1 = r6.getInt(r2)     // Catch:{ all -> 0x029d }
            androidx.work.a r46 = androidx.work.impl.p207b.C4493ba.m12809e(r1)     // Catch:{ all -> 0x029d }
            long r47 = r6.getLong(r4)     // Catch:{ all -> 0x029d }
            long r49 = r6.getLong(r5)     // Catch:{ all -> 0x029d }
            r1 = r30
            long r51 = r6.getLong(r1)     // Catch:{ all -> 0x029d }
            r30 = r0
            r0 = r17
            long r53 = r6.getLong(r0)     // Catch:{ all -> 0x029d }
            r17 = r0
            r0 = r18
            int r18 = r6.getInt(r0)     // Catch:{ all -> 0x029d }
            if (r18 == 0) goto L_0x0181
            r18 = r0
            r0 = r19
            r55 = 1
            goto L_0x0187
        L_0x0181:
            r18 = r0
            r0 = r19
            r55 = 0
        L_0x0187:
            int r19 = r6.getInt(r0)     // Catch:{ all -> 0x029d }
            androidx.work.am r56 = androidx.work.impl.p207b.C4493ba.m12811g(r19)     // Catch:{ all -> 0x029d }
            r19 = r0
            r0 = r20
            int r57 = r6.getInt(r0)     // Catch:{ all -> 0x029d }
            r20 = r0
            r0 = r21
            int r58 = r6.getInt(r0)     // Catch:{ all -> 0x029d }
            r21 = r0
            r0 = r22
            boolean r22 = r6.isNull(r0)     // Catch:{ all -> 0x029d }
            if (r22 == 0) goto L_0x01f6
            r22 = r1
            r1 = r23
            boolean r23 = r6.isNull(r1)     // Catch:{ all -> 0x029d }
            if (r23 == 0) goto L_0x01fa
            r23 = r2
            r2 = r24
            boolean r24 = r6.isNull(r2)     // Catch:{ all -> 0x029d }
            if (r24 == 0) goto L_0x01fe
            r24 = r4
            r4 = r25
            boolean r25 = r6.isNull(r4)     // Catch:{ all -> 0x029d }
            if (r25 == 0) goto L_0x0202
            r25 = r5
            r5 = r26
            boolean r26 = r6.isNull(r5)     // Catch:{ all -> 0x029d }
            if (r26 == 0) goto L_0x0206
            r26 = r7
            r7 = r27
            boolean r27 = r6.isNull(r7)     // Catch:{ all -> 0x029d }
            if (r27 == 0) goto L_0x020a
            r27 = r8
            r8 = r28
            boolean r28 = r6.isNull(r8)     // Catch:{ all -> 0x029d }
            if (r28 == 0) goto L_0x020e
            r28 = r9
            r9 = r29
            boolean r29 = r6.isNull(r9)     // Catch:{ all -> 0x029d }
            if (r29 != 0) goto L_0x01f0
            goto L_0x0212
        L_0x01f0:
            r29 = r0
            r44 = 0
            goto L_0x026a
        L_0x01f6:
            r22 = r1
            r1 = r23
        L_0x01fa:
            r23 = r2
            r2 = r24
        L_0x01fe:
            r24 = r4
            r4 = r25
        L_0x0202:
            r25 = r5
            r5 = r26
        L_0x0206:
            r26 = r7
            r7 = r27
        L_0x020a:
            r27 = r8
            r8 = r28
        L_0x020e:
            r28 = r9
            r9 = r29
        L_0x0212:
            int r29 = r6.getInt(r0)     // Catch:{ all -> 0x029d }
            androidx.work.ae r60 = androidx.work.impl.p207b.C4493ba.m12810f(r29)     // Catch:{ all -> 0x029d }
            int r29 = r6.getInt(r1)     // Catch:{ all -> 0x029d }
            if (r29 == 0) goto L_0x0223
            r61 = 1
            goto L_0x0225
        L_0x0223:
            r61 = 0
        L_0x0225:
            int r29 = r6.getInt(r2)     // Catch:{ all -> 0x029d }
            if (r29 == 0) goto L_0x022e
            r62 = 1
            goto L_0x0230
        L_0x022e:
            r62 = 0
        L_0x0230:
            int r29 = r6.getInt(r4)     // Catch:{ all -> 0x029d }
            if (r29 == 0) goto L_0x0239
            r63 = 1
            goto L_0x023b
        L_0x0239:
            r63 = 0
        L_0x023b:
            int r29 = r6.getInt(r5)     // Catch:{ all -> 0x029d }
            if (r29 == 0) goto L_0x0244
            r64 = 1
            goto L_0x0246
        L_0x0244:
            r64 = 0
        L_0x0246:
            long r65 = r6.getLong(r7)     // Catch:{ all -> 0x029d }
            long r67 = r6.getLong(r8)     // Catch:{ all -> 0x029d }
            boolean r29 = r6.isNull(r9)     // Catch:{ all -> 0x029d }
            if (r29 == 0) goto L_0x0257
            r29 = 0
            goto L_0x025b
        L_0x0257:
            byte[] r29 = r6.getBlob(r9)     // Catch:{ all -> 0x029d }
        L_0x025b:
            java.util.Set r69 = androidx.work.impl.p207b.C4493ba.m12813i(r29)     // Catch:{ all -> 0x029d }
            androidx.work.h r29 = new androidx.work.h     // Catch:{ all -> 0x029d }
            r59 = r29
            r59.<init>(r60, r61, r62, r63, r64, r65, r67, r69)     // Catch:{ all -> 0x029d }
            r44 = r29
            r29 = r0
        L_0x026a:
            androidx.work.impl.b.ae r0 = new androidx.work.impl.b.ae     // Catch:{ all -> 0x029d }
            r31 = r0
            r31.<init>(r32, r33, r34, r35, r36, r37, r38, r40, r42, r44, r45, r46, r47, r49, r51, r53, r55, r56, r57, r58)     // Catch:{ all -> 0x029d }
            r3.add(r0)     // Catch:{ all -> 0x029d }
            r0 = r30
            r30 = r22
            r22 = r29
            r29 = r9
            r9 = r28
            r28 = r8
            r8 = r27
            r27 = r7
            r7 = r26
            r26 = r5
            r5 = r25
            r25 = r4
            r4 = r24
            r24 = r2
            r2 = r23
            r23 = r1
            goto L_0x00e7
        L_0x0296:
            r6.close()
            r16.mo8207h()
            return r3
        L_0x029d:
            r0 = move-exception
            goto L_0x02a2
        L_0x029f:
            r0 = move-exception
            r16 = r3
        L_0x02a2:
            r6.close()
            r16.mo8207h()
            goto L_0x02aa
        L_0x02a9:
            throw r0
        L_0x02aa:
            goto L_0x02a9
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.work.impl.p207b.C4485at.mo9423c(int):java.util.List");
    }

    /* renamed from: d */
    public final List mo9424d(String str) {
        byte[] bArr;
        TreeMap treeMap = C3930am.f12576a;
        C3930am a = C3929al.m11267a("SELECT output FROM workspec WHERE id IN\n             (SELECT prerequisite_id FROM dependency WHERE work_spec_id=?)", 1);
        if (str == null) {
            a.f12582g[1] = 1;
        } else {
            a.mo8206g(1, str);
        }
        this.f14237a.mo8175S();
        Cursor a2 = C3940b.m11293a(this.f14237a, a, false, (CancellationSignal) null);
        try {
            ArrayList arrayList = new ArrayList(a2.getCount());
            while (a2.moveToNext()) {
                if (a2.isNull(0)) {
                    bArr = null;
                } else {
                    bArr = a2.getBlob(0);
                }
                arrayList.add(C4632m.m13035a(bArr));
            }
            return arrayList;
        } finally {
            a2.close();
            a.mo8207h();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:59:0x021f A[Catch:{ all -> 0x029c }] */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x0222 A[Catch:{ all -> 0x029c }] */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x022a A[Catch:{ all -> 0x029c }] */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x022d A[Catch:{ all -> 0x029c }] */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x0235 A[Catch:{ all -> 0x029c }] */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x0238 A[Catch:{ all -> 0x029c }] */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x0240 A[Catch:{ all -> 0x029c }] */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x0243 A[Catch:{ all -> 0x029c }] */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x0253 A[Catch:{ all -> 0x029c }] */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x0256 A[Catch:{ all -> 0x029c }] */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.List mo9425e(long r71) {
        /*
            r70 = this;
            r1 = r70
            java.util.TreeMap r0 = androidx.p182p.C3930am.f12576a
            java.lang.String r0 = "SELECT * FROM workspec WHERE last_enqueue_time >= ? AND state IN (2, 3, 5) ORDER BY last_enqueue_time DESC"
            r2 = 1
            androidx.p.am r3 = androidx.p182p.C3929al.m11267a(r0, r2)
            r4 = r71
            r3.mo8204e(r2, r4)
            androidx.p.ah r0 = r1.f14237a
            r0.mo8175S()
            androidx.p.ah r0 = r1.f14237a
            r4 = 0
            r5 = 0
            android.database.Cursor r6 = androidx.p182p.p185c.C3940b.m11293a(r0, r3, r4, r5)
            java.lang.String r0 = "id"
            int r0 = androidx.p182p.p185c.C3939a.m11292b(r6, r0)     // Catch:{ all -> 0x029e }
            java.lang.String r7 = "state"
            int r7 = androidx.p182p.p185c.C3939a.m11292b(r6, r7)     // Catch:{ all -> 0x029e }
            java.lang.String r8 = "worker_class_name"
            int r8 = androidx.p182p.p185c.C3939a.m11292b(r6, r8)     // Catch:{ all -> 0x029e }
            java.lang.String r9 = "input_merger_class_name"
            int r9 = androidx.p182p.p185c.C3939a.m11292b(r6, r9)     // Catch:{ all -> 0x029e }
            java.lang.String r10 = "input"
            int r10 = androidx.p182p.p185c.C3939a.m11292b(r6, r10)     // Catch:{ all -> 0x029e }
            java.lang.String r11 = "output"
            int r11 = androidx.p182p.p185c.C3939a.m11292b(r6, r11)     // Catch:{ all -> 0x029e }
            java.lang.String r12 = "initial_delay"
            int r12 = androidx.p182p.p185c.C3939a.m11292b(r6, r12)     // Catch:{ all -> 0x029e }
            java.lang.String r13 = "interval_duration"
            int r13 = androidx.p182p.p185c.C3939a.m11292b(r6, r13)     // Catch:{ all -> 0x029e }
            java.lang.String r14 = "flex_duration"
            int r14 = androidx.p182p.p185c.C3939a.m11292b(r6, r14)     // Catch:{ all -> 0x029e }
            java.lang.String r15 = "run_attempt_count"
            int r15 = androidx.p182p.p185c.C3939a.m11292b(r6, r15)     // Catch:{ all -> 0x029e }
            java.lang.String r2 = "backoff_policy"
            int r2 = androidx.p182p.p185c.C3939a.m11292b(r6, r2)     // Catch:{ all -> 0x029e }
            java.lang.String r4 = "backoff_delay_duration"
            int r4 = androidx.p182p.p185c.C3939a.m11292b(r6, r4)     // Catch:{ all -> 0x029e }
            java.lang.String r5 = "last_enqueue_time"
            int r5 = androidx.p182p.p185c.C3939a.m11292b(r6, r5)     // Catch:{ all -> 0x029e }
            java.lang.String r1 = "minimum_retention_duration"
            int r1 = androidx.p182p.p185c.C3939a.m11292b(r6, r1)     // Catch:{ all -> 0x029e }
            r16 = r3
            java.lang.String r3 = "schedule_requested_at"
            int r3 = androidx.p182p.p185c.C3939a.m11292b(r6, r3)     // Catch:{ all -> 0x029c }
            r17 = r3
            java.lang.String r3 = "run_in_foreground"
            int r3 = androidx.p182p.p185c.C3939a.m11292b(r6, r3)     // Catch:{ all -> 0x029c }
            r18 = r3
            java.lang.String r3 = "out_of_quota_policy"
            int r3 = androidx.p182p.p185c.C3939a.m11292b(r6, r3)     // Catch:{ all -> 0x029c }
            r19 = r3
            java.lang.String r3 = "period_count"
            int r3 = androidx.p182p.p185c.C3939a.m11292b(r6, r3)     // Catch:{ all -> 0x029c }
            r20 = r3
            java.lang.String r3 = "generation"
            int r3 = androidx.p182p.p185c.C3939a.m11292b(r6, r3)     // Catch:{ all -> 0x029c }
            r21 = r3
            java.lang.String r3 = "required_network_type"
            int r3 = androidx.p182p.p185c.C3939a.m11292b(r6, r3)     // Catch:{ all -> 0x029c }
            r22 = r3
            java.lang.String r3 = "requires_charging"
            int r3 = androidx.p182p.p185c.C3939a.m11292b(r6, r3)     // Catch:{ all -> 0x029c }
            r23 = r3
            java.lang.String r3 = "requires_device_idle"
            int r3 = androidx.p182p.p185c.C3939a.m11292b(r6, r3)     // Catch:{ all -> 0x029c }
            r24 = r3
            java.lang.String r3 = "requires_battery_not_low"
            int r3 = androidx.p182p.p185c.C3939a.m11292b(r6, r3)     // Catch:{ all -> 0x029c }
            r25 = r3
            java.lang.String r3 = "requires_storage_not_low"
            int r3 = androidx.p182p.p185c.C3939a.m11292b(r6, r3)     // Catch:{ all -> 0x029c }
            r26 = r3
            java.lang.String r3 = "trigger_content_update_delay"
            int r3 = androidx.p182p.p185c.C3939a.m11292b(r6, r3)     // Catch:{ all -> 0x029c }
            r27 = r3
            java.lang.String r3 = "trigger_max_content_delay"
            int r3 = androidx.p182p.p185c.C3939a.m11292b(r6, r3)     // Catch:{ all -> 0x029c }
            r28 = r3
            java.lang.String r3 = "content_uri_triggers"
            int r3 = androidx.p182p.p185c.C3939a.m11292b(r6, r3)     // Catch:{ all -> 0x029c }
            r29 = r3
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch:{ all -> 0x029c }
            r30 = r1
            int r1 = r6.getCount()     // Catch:{ all -> 0x029c }
            r3.<init>(r1)     // Catch:{ all -> 0x029c }
        L_0x00e6:
            boolean r1 = r6.moveToNext()     // Catch:{ all -> 0x029c }
            if (r1 == 0) goto L_0x0295
            boolean r1 = r6.isNull(r0)     // Catch:{ all -> 0x029c }
            if (r1 == 0) goto L_0x00f5
            r32 = 0
            goto L_0x00fb
        L_0x00f5:
            java.lang.String r1 = r6.getString(r0)     // Catch:{ all -> 0x029c }
            r32 = r1
        L_0x00fb:
            int r1 = r6.getInt(r7)     // Catch:{ all -> 0x029c }
            androidx.work.ar r33 = androidx.work.impl.p207b.C4493ba.m12812h(r1)     // Catch:{ all -> 0x029c }
            boolean r1 = r6.isNull(r8)     // Catch:{ all -> 0x029c }
            if (r1 == 0) goto L_0x010c
            r34 = 0
            goto L_0x0112
        L_0x010c:
            java.lang.String r1 = r6.getString(r8)     // Catch:{ all -> 0x029c }
            r34 = r1
        L_0x0112:
            boolean r1 = r6.isNull(r9)     // Catch:{ all -> 0x029c }
            if (r1 == 0) goto L_0x011b
            r35 = 0
            goto L_0x0121
        L_0x011b:
            java.lang.String r1 = r6.getString(r9)     // Catch:{ all -> 0x029c }
            r35 = r1
        L_0x0121:
            boolean r1 = r6.isNull(r10)     // Catch:{ all -> 0x029c }
            if (r1 == 0) goto L_0x0129
            r1 = 0
            goto L_0x012d
        L_0x0129:
            byte[] r1 = r6.getBlob(r10)     // Catch:{ all -> 0x029c }
        L_0x012d:
            androidx.work.m r36 = androidx.work.C4632m.m13035a(r1)     // Catch:{ all -> 0x029c }
            boolean r1 = r6.isNull(r11)     // Catch:{ all -> 0x029c }
            if (r1 == 0) goto L_0x0139
            r1 = 0
            goto L_0x013d
        L_0x0139:
            byte[] r1 = r6.getBlob(r11)     // Catch:{ all -> 0x029c }
        L_0x013d:
            androidx.work.m r37 = androidx.work.C4632m.m13035a(r1)     // Catch:{ all -> 0x029c }
            long r38 = r6.getLong(r12)     // Catch:{ all -> 0x029c }
            long r40 = r6.getLong(r13)     // Catch:{ all -> 0x029c }
            long r42 = r6.getLong(r14)     // Catch:{ all -> 0x029c }
            int r45 = r6.getInt(r15)     // Catch:{ all -> 0x029c }
            int r1 = r6.getInt(r2)     // Catch:{ all -> 0x029c }
            androidx.work.a r46 = androidx.work.impl.p207b.C4493ba.m12809e(r1)     // Catch:{ all -> 0x029c }
            long r47 = r6.getLong(r4)     // Catch:{ all -> 0x029c }
            long r49 = r6.getLong(r5)     // Catch:{ all -> 0x029c }
            r1 = r30
            long r51 = r6.getLong(r1)     // Catch:{ all -> 0x029c }
            r30 = r0
            r0 = r17
            long r53 = r6.getLong(r0)     // Catch:{ all -> 0x029c }
            r17 = r0
            r0 = r18
            int r18 = r6.getInt(r0)     // Catch:{ all -> 0x029c }
            if (r18 == 0) goto L_0x0180
            r18 = r0
            r0 = r19
            r55 = 1
            goto L_0x0186
        L_0x0180:
            r18 = r0
            r0 = r19
            r55 = 0
        L_0x0186:
            int r19 = r6.getInt(r0)     // Catch:{ all -> 0x029c }
            androidx.work.am r56 = androidx.work.impl.p207b.C4493ba.m12811g(r19)     // Catch:{ all -> 0x029c }
            r19 = r0
            r0 = r20
            int r57 = r6.getInt(r0)     // Catch:{ all -> 0x029c }
            r20 = r0
            r0 = r21
            int r58 = r6.getInt(r0)     // Catch:{ all -> 0x029c }
            r21 = r0
            r0 = r22
            boolean r22 = r6.isNull(r0)     // Catch:{ all -> 0x029c }
            if (r22 == 0) goto L_0x01f5
            r22 = r1
            r1 = r23
            boolean r23 = r6.isNull(r1)     // Catch:{ all -> 0x029c }
            if (r23 == 0) goto L_0x01f9
            r23 = r2
            r2 = r24
            boolean r24 = r6.isNull(r2)     // Catch:{ all -> 0x029c }
            if (r24 == 0) goto L_0x01fd
            r24 = r4
            r4 = r25
            boolean r25 = r6.isNull(r4)     // Catch:{ all -> 0x029c }
            if (r25 == 0) goto L_0x0201
            r25 = r5
            r5 = r26
            boolean r26 = r6.isNull(r5)     // Catch:{ all -> 0x029c }
            if (r26 == 0) goto L_0x0205
            r26 = r7
            r7 = r27
            boolean r27 = r6.isNull(r7)     // Catch:{ all -> 0x029c }
            if (r27 == 0) goto L_0x0209
            r27 = r8
            r8 = r28
            boolean r28 = r6.isNull(r8)     // Catch:{ all -> 0x029c }
            if (r28 == 0) goto L_0x020d
            r28 = r9
            r9 = r29
            boolean r29 = r6.isNull(r9)     // Catch:{ all -> 0x029c }
            if (r29 != 0) goto L_0x01ef
            goto L_0x0211
        L_0x01ef:
            r29 = r0
            r44 = 0
            goto L_0x0269
        L_0x01f5:
            r22 = r1
            r1 = r23
        L_0x01f9:
            r23 = r2
            r2 = r24
        L_0x01fd:
            r24 = r4
            r4 = r25
        L_0x0201:
            r25 = r5
            r5 = r26
        L_0x0205:
            r26 = r7
            r7 = r27
        L_0x0209:
            r27 = r8
            r8 = r28
        L_0x020d:
            r28 = r9
            r9 = r29
        L_0x0211:
            int r29 = r6.getInt(r0)     // Catch:{ all -> 0x029c }
            androidx.work.ae r60 = androidx.work.impl.p207b.C4493ba.m12810f(r29)     // Catch:{ all -> 0x029c }
            int r29 = r6.getInt(r1)     // Catch:{ all -> 0x029c }
            if (r29 == 0) goto L_0x0222
            r61 = 1
            goto L_0x0224
        L_0x0222:
            r61 = 0
        L_0x0224:
            int r29 = r6.getInt(r2)     // Catch:{ all -> 0x029c }
            if (r29 == 0) goto L_0x022d
            r62 = 1
            goto L_0x022f
        L_0x022d:
            r62 = 0
        L_0x022f:
            int r29 = r6.getInt(r4)     // Catch:{ all -> 0x029c }
            if (r29 == 0) goto L_0x0238
            r63 = 1
            goto L_0x023a
        L_0x0238:
            r63 = 0
        L_0x023a:
            int r29 = r6.getInt(r5)     // Catch:{ all -> 0x029c }
            if (r29 == 0) goto L_0x0243
            r64 = 1
            goto L_0x0245
        L_0x0243:
            r64 = 0
        L_0x0245:
            long r65 = r6.getLong(r7)     // Catch:{ all -> 0x029c }
            long r67 = r6.getLong(r8)     // Catch:{ all -> 0x029c }
            boolean r29 = r6.isNull(r9)     // Catch:{ all -> 0x029c }
            if (r29 == 0) goto L_0x0256
            r29 = 0
            goto L_0x025a
        L_0x0256:
            byte[] r29 = r6.getBlob(r9)     // Catch:{ all -> 0x029c }
        L_0x025a:
            java.util.Set r69 = androidx.work.impl.p207b.C4493ba.m12813i(r29)     // Catch:{ all -> 0x029c }
            androidx.work.h r29 = new androidx.work.h     // Catch:{ all -> 0x029c }
            r59 = r29
            r59.<init>(r60, r61, r62, r63, r64, r65, r67, r69)     // Catch:{ all -> 0x029c }
            r44 = r29
            r29 = r0
        L_0x0269:
            androidx.work.impl.b.ae r0 = new androidx.work.impl.b.ae     // Catch:{ all -> 0x029c }
            r31 = r0
            r31.<init>(r32, r33, r34, r35, r36, r37, r38, r40, r42, r44, r45, r46, r47, r49, r51, r53, r55, r56, r57, r58)     // Catch:{ all -> 0x029c }
            r3.add(r0)     // Catch:{ all -> 0x029c }
            r0 = r30
            r30 = r22
            r22 = r29
            r29 = r9
            r9 = r28
            r28 = r8
            r8 = r27
            r27 = r7
            r7 = r26
            r26 = r5
            r5 = r25
            r25 = r4
            r4 = r24
            r24 = r2
            r2 = r23
            r23 = r1
            goto L_0x00e6
        L_0x0295:
            r6.close()
            r16.mo8207h()
            return r3
        L_0x029c:
            r0 = move-exception
            goto L_0x02a1
        L_0x029e:
            r0 = move-exception
            r16 = r3
        L_0x02a1:
            r6.close()
            r16.mo8207h()
            goto L_0x02a9
        L_0x02a8:
            throw r0
        L_0x02a9:
            goto L_0x02a8
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.work.impl.p207b.C4485at.mo9425e(long):java.util.List");
    }

    /* JADX WARNING: Removed duplicated region for block: B:59:0x021b A[Catch:{ all -> 0x0298 }] */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x021e A[Catch:{ all -> 0x0298 }] */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x0226 A[Catch:{ all -> 0x0298 }] */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x0229 A[Catch:{ all -> 0x0298 }] */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x0231 A[Catch:{ all -> 0x0298 }] */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x0234 A[Catch:{ all -> 0x0298 }] */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x023c A[Catch:{ all -> 0x0298 }] */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x023f A[Catch:{ all -> 0x0298 }] */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x024f A[Catch:{ all -> 0x0298 }] */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x0252 A[Catch:{ all -> 0x0298 }] */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.List mo9426f() {
        /*
            r70 = this;
            r1 = r70
            java.util.TreeMap r0 = androidx.p182p.C3930am.f12576a
            java.lang.String r0 = "SELECT * FROM workspec WHERE state=1"
            r2 = 0
            androidx.p.am r3 = androidx.p182p.C3929al.m11267a(r0, r2)
            androidx.p.ah r0 = r1.f14237a
            r0.mo8175S()
            androidx.p.ah r0 = r1.f14237a
            r4 = 0
            android.database.Cursor r5 = androidx.p182p.p185c.C3940b.m11293a(r0, r3, r2, r4)
            java.lang.String r0 = "id"
            int r0 = androidx.p182p.p185c.C3939a.m11292b(r5, r0)     // Catch:{ all -> 0x029a }
            java.lang.String r6 = "state"
            int r6 = androidx.p182p.p185c.C3939a.m11292b(r5, r6)     // Catch:{ all -> 0x029a }
            java.lang.String r7 = "worker_class_name"
            int r7 = androidx.p182p.p185c.C3939a.m11292b(r5, r7)     // Catch:{ all -> 0x029a }
            java.lang.String r8 = "input_merger_class_name"
            int r8 = androidx.p182p.p185c.C3939a.m11292b(r5, r8)     // Catch:{ all -> 0x029a }
            java.lang.String r9 = "input"
            int r9 = androidx.p182p.p185c.C3939a.m11292b(r5, r9)     // Catch:{ all -> 0x029a }
            java.lang.String r10 = "output"
            int r10 = androidx.p182p.p185c.C3939a.m11292b(r5, r10)     // Catch:{ all -> 0x029a }
            java.lang.String r11 = "initial_delay"
            int r11 = androidx.p182p.p185c.C3939a.m11292b(r5, r11)     // Catch:{ all -> 0x029a }
            java.lang.String r12 = "interval_duration"
            int r12 = androidx.p182p.p185c.C3939a.m11292b(r5, r12)     // Catch:{ all -> 0x029a }
            java.lang.String r13 = "flex_duration"
            int r13 = androidx.p182p.p185c.C3939a.m11292b(r5, r13)     // Catch:{ all -> 0x029a }
            java.lang.String r14 = "run_attempt_count"
            int r14 = androidx.p182p.p185c.C3939a.m11292b(r5, r14)     // Catch:{ all -> 0x029a }
            java.lang.String r15 = "backoff_policy"
            int r15 = androidx.p182p.p185c.C3939a.m11292b(r5, r15)     // Catch:{ all -> 0x029a }
            java.lang.String r2 = "backoff_delay_duration"
            int r2 = androidx.p182p.p185c.C3939a.m11292b(r5, r2)     // Catch:{ all -> 0x029a }
            java.lang.String r4 = "last_enqueue_time"
            int r4 = androidx.p182p.p185c.C3939a.m11292b(r5, r4)     // Catch:{ all -> 0x029a }
            java.lang.String r1 = "minimum_retention_duration"
            int r1 = androidx.p182p.p185c.C3939a.m11292b(r5, r1)     // Catch:{ all -> 0x029a }
            r16 = r3
            java.lang.String r3 = "schedule_requested_at"
            int r3 = androidx.p182p.p185c.C3939a.m11292b(r5, r3)     // Catch:{ all -> 0x0298 }
            r17 = r3
            java.lang.String r3 = "run_in_foreground"
            int r3 = androidx.p182p.p185c.C3939a.m11292b(r5, r3)     // Catch:{ all -> 0x0298 }
            r18 = r3
            java.lang.String r3 = "out_of_quota_policy"
            int r3 = androidx.p182p.p185c.C3939a.m11292b(r5, r3)     // Catch:{ all -> 0x0298 }
            r19 = r3
            java.lang.String r3 = "period_count"
            int r3 = androidx.p182p.p185c.C3939a.m11292b(r5, r3)     // Catch:{ all -> 0x0298 }
            r20 = r3
            java.lang.String r3 = "generation"
            int r3 = androidx.p182p.p185c.C3939a.m11292b(r5, r3)     // Catch:{ all -> 0x0298 }
            r21 = r3
            java.lang.String r3 = "required_network_type"
            int r3 = androidx.p182p.p185c.C3939a.m11292b(r5, r3)     // Catch:{ all -> 0x0298 }
            r22 = r3
            java.lang.String r3 = "requires_charging"
            int r3 = androidx.p182p.p185c.C3939a.m11292b(r5, r3)     // Catch:{ all -> 0x0298 }
            r23 = r3
            java.lang.String r3 = "requires_device_idle"
            int r3 = androidx.p182p.p185c.C3939a.m11292b(r5, r3)     // Catch:{ all -> 0x0298 }
            r24 = r3
            java.lang.String r3 = "requires_battery_not_low"
            int r3 = androidx.p182p.p185c.C3939a.m11292b(r5, r3)     // Catch:{ all -> 0x0298 }
            r25 = r3
            java.lang.String r3 = "requires_storage_not_low"
            int r3 = androidx.p182p.p185c.C3939a.m11292b(r5, r3)     // Catch:{ all -> 0x0298 }
            r26 = r3
            java.lang.String r3 = "trigger_content_update_delay"
            int r3 = androidx.p182p.p185c.C3939a.m11292b(r5, r3)     // Catch:{ all -> 0x0298 }
            r27 = r3
            java.lang.String r3 = "trigger_max_content_delay"
            int r3 = androidx.p182p.p185c.C3939a.m11292b(r5, r3)     // Catch:{ all -> 0x0298 }
            r28 = r3
            java.lang.String r3 = "content_uri_triggers"
            int r3 = androidx.p182p.p185c.C3939a.m11292b(r5, r3)     // Catch:{ all -> 0x0298 }
            r29 = r3
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch:{ all -> 0x0298 }
            r30 = r1
            int r1 = r5.getCount()     // Catch:{ all -> 0x0298 }
            r3.<init>(r1)     // Catch:{ all -> 0x0298 }
        L_0x00e0:
            boolean r1 = r5.moveToNext()     // Catch:{ all -> 0x0298 }
            if (r1 == 0) goto L_0x0291
            boolean r1 = r5.isNull(r0)     // Catch:{ all -> 0x0298 }
            if (r1 == 0) goto L_0x00ef
            r32 = 0
            goto L_0x00f5
        L_0x00ef:
            java.lang.String r1 = r5.getString(r0)     // Catch:{ all -> 0x0298 }
            r32 = r1
        L_0x00f5:
            int r1 = r5.getInt(r6)     // Catch:{ all -> 0x0298 }
            androidx.work.ar r33 = androidx.work.impl.p207b.C4493ba.m12812h(r1)     // Catch:{ all -> 0x0298 }
            boolean r1 = r5.isNull(r7)     // Catch:{ all -> 0x0298 }
            if (r1 == 0) goto L_0x0106
            r34 = 0
            goto L_0x010c
        L_0x0106:
            java.lang.String r1 = r5.getString(r7)     // Catch:{ all -> 0x0298 }
            r34 = r1
        L_0x010c:
            boolean r1 = r5.isNull(r8)     // Catch:{ all -> 0x0298 }
            if (r1 == 0) goto L_0x0115
            r35 = 0
            goto L_0x011b
        L_0x0115:
            java.lang.String r1 = r5.getString(r8)     // Catch:{ all -> 0x0298 }
            r35 = r1
        L_0x011b:
            boolean r1 = r5.isNull(r9)     // Catch:{ all -> 0x0298 }
            if (r1 == 0) goto L_0x0123
            r1 = 0
            goto L_0x0127
        L_0x0123:
            byte[] r1 = r5.getBlob(r9)     // Catch:{ all -> 0x0298 }
        L_0x0127:
            androidx.work.m r36 = androidx.work.C4632m.m13035a(r1)     // Catch:{ all -> 0x0298 }
            boolean r1 = r5.isNull(r10)     // Catch:{ all -> 0x0298 }
            if (r1 == 0) goto L_0x0133
            r1 = 0
            goto L_0x0137
        L_0x0133:
            byte[] r1 = r5.getBlob(r10)     // Catch:{ all -> 0x0298 }
        L_0x0137:
            androidx.work.m r37 = androidx.work.C4632m.m13035a(r1)     // Catch:{ all -> 0x0298 }
            long r38 = r5.getLong(r11)     // Catch:{ all -> 0x0298 }
            long r40 = r5.getLong(r12)     // Catch:{ all -> 0x0298 }
            long r42 = r5.getLong(r13)     // Catch:{ all -> 0x0298 }
            int r45 = r5.getInt(r14)     // Catch:{ all -> 0x0298 }
            int r1 = r5.getInt(r15)     // Catch:{ all -> 0x0298 }
            androidx.work.a r46 = androidx.work.impl.p207b.C4493ba.m12809e(r1)     // Catch:{ all -> 0x0298 }
            long r47 = r5.getLong(r2)     // Catch:{ all -> 0x0298 }
            long r49 = r5.getLong(r4)     // Catch:{ all -> 0x0298 }
            r1 = r30
            long r51 = r5.getLong(r1)     // Catch:{ all -> 0x0298 }
            r30 = r0
            r0 = r17
            long r53 = r5.getLong(r0)     // Catch:{ all -> 0x0298 }
            r17 = r0
            r0 = r18
            int r18 = r5.getInt(r0)     // Catch:{ all -> 0x0298 }
            r31 = 1
            if (r18 == 0) goto L_0x017c
            r18 = r0
            r0 = r19
            r55 = 1
            goto L_0x0182
        L_0x017c:
            r18 = r0
            r0 = r19
            r55 = 0
        L_0x0182:
            int r19 = r5.getInt(r0)     // Catch:{ all -> 0x0298 }
            androidx.work.am r56 = androidx.work.impl.p207b.C4493ba.m12811g(r19)     // Catch:{ all -> 0x0298 }
            r19 = r0
            r0 = r20
            int r57 = r5.getInt(r0)     // Catch:{ all -> 0x0298 }
            r20 = r0
            r0 = r21
            int r58 = r5.getInt(r0)     // Catch:{ all -> 0x0298 }
            r21 = r0
            r0 = r22
            boolean r22 = r5.isNull(r0)     // Catch:{ all -> 0x0298 }
            if (r22 == 0) goto L_0x01f1
            r22 = r1
            r1 = r23
            boolean r23 = r5.isNull(r1)     // Catch:{ all -> 0x0298 }
            if (r23 == 0) goto L_0x01f5
            r23 = r2
            r2 = r24
            boolean r24 = r5.isNull(r2)     // Catch:{ all -> 0x0298 }
            if (r24 == 0) goto L_0x01f9
            r24 = r4
            r4 = r25
            boolean r25 = r5.isNull(r4)     // Catch:{ all -> 0x0298 }
            if (r25 == 0) goto L_0x01fd
            r25 = r6
            r6 = r26
            boolean r26 = r5.isNull(r6)     // Catch:{ all -> 0x0298 }
            if (r26 == 0) goto L_0x0201
            r26 = r7
            r7 = r27
            boolean r27 = r5.isNull(r7)     // Catch:{ all -> 0x0298 }
            if (r27 == 0) goto L_0x0205
            r27 = r8
            r8 = r28
            boolean r28 = r5.isNull(r8)     // Catch:{ all -> 0x0298 }
            if (r28 == 0) goto L_0x0209
            r28 = r9
            r9 = r29
            boolean r29 = r5.isNull(r9)     // Catch:{ all -> 0x0298 }
            if (r29 != 0) goto L_0x01eb
            goto L_0x020d
        L_0x01eb:
            r29 = r0
            r44 = 0
            goto L_0x0265
        L_0x01f1:
            r22 = r1
            r1 = r23
        L_0x01f5:
            r23 = r2
            r2 = r24
        L_0x01f9:
            r24 = r4
            r4 = r25
        L_0x01fd:
            r25 = r6
            r6 = r26
        L_0x0201:
            r26 = r7
            r7 = r27
        L_0x0205:
            r27 = r8
            r8 = r28
        L_0x0209:
            r28 = r9
            r9 = r29
        L_0x020d:
            int r29 = r5.getInt(r0)     // Catch:{ all -> 0x0298 }
            androidx.work.ae r60 = androidx.work.impl.p207b.C4493ba.m12810f(r29)     // Catch:{ all -> 0x0298 }
            int r29 = r5.getInt(r1)     // Catch:{ all -> 0x0298 }
            if (r29 == 0) goto L_0x021e
            r61 = 1
            goto L_0x0220
        L_0x021e:
            r61 = 0
        L_0x0220:
            int r29 = r5.getInt(r2)     // Catch:{ all -> 0x0298 }
            if (r29 == 0) goto L_0x0229
            r62 = 1
            goto L_0x022b
        L_0x0229:
            r62 = 0
        L_0x022b:
            int r29 = r5.getInt(r4)     // Catch:{ all -> 0x0298 }
            if (r29 == 0) goto L_0x0234
            r63 = 1
            goto L_0x0236
        L_0x0234:
            r63 = 0
        L_0x0236:
            int r29 = r5.getInt(r6)     // Catch:{ all -> 0x0298 }
            if (r29 == 0) goto L_0x023f
            r64 = 1
            goto L_0x0241
        L_0x023f:
            r64 = 0
        L_0x0241:
            long r65 = r5.getLong(r7)     // Catch:{ all -> 0x0298 }
            long r67 = r5.getLong(r8)     // Catch:{ all -> 0x0298 }
            boolean r29 = r5.isNull(r9)     // Catch:{ all -> 0x0298 }
            if (r29 == 0) goto L_0x0252
            r29 = 0
            goto L_0x0256
        L_0x0252:
            byte[] r29 = r5.getBlob(r9)     // Catch:{ all -> 0x0298 }
        L_0x0256:
            java.util.Set r69 = androidx.work.impl.p207b.C4493ba.m12813i(r29)     // Catch:{ all -> 0x0298 }
            androidx.work.h r29 = new androidx.work.h     // Catch:{ all -> 0x0298 }
            r59 = r29
            r59.<init>(r60, r61, r62, r63, r64, r65, r67, r69)     // Catch:{ all -> 0x0298 }
            r44 = r29
            r29 = r0
        L_0x0265:
            androidx.work.impl.b.ae r0 = new androidx.work.impl.b.ae     // Catch:{ all -> 0x0298 }
            r31 = r0
            r31.<init>(r32, r33, r34, r35, r36, r37, r38, r40, r42, r44, r45, r46, r47, r49, r51, r53, r55, r56, r57, r58)     // Catch:{ all -> 0x0298 }
            r3.add(r0)     // Catch:{ all -> 0x0298 }
            r0 = r30
            r30 = r22
            r22 = r29
            r29 = r9
            r9 = r28
            r28 = r8
            r8 = r27
            r27 = r7
            r7 = r26
            r26 = r6
            r6 = r25
            r25 = r4
            r4 = r24
            r24 = r2
            r2 = r23
            r23 = r1
            goto L_0x00e0
        L_0x0291:
            r5.close()
            r16.mo8207h()
            return r3
        L_0x0298:
            r0 = move-exception
            goto L_0x029d
        L_0x029a:
            r0 = move-exception
            r16 = r3
        L_0x029d:
            r5.close()
            r16.mo8207h()
            goto L_0x02a5
        L_0x02a4:
            throw r0
        L_0x02a5:
            goto L_0x02a4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.work.impl.p207b.C4485at.mo9426f():java.util.List");
    }

    /* JADX WARNING: Removed duplicated region for block: B:59:0x021b A[Catch:{ all -> 0x0298 }] */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x021e A[Catch:{ all -> 0x0298 }] */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x0226 A[Catch:{ all -> 0x0298 }] */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x0229 A[Catch:{ all -> 0x0298 }] */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x0231 A[Catch:{ all -> 0x0298 }] */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x0234 A[Catch:{ all -> 0x0298 }] */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x023c A[Catch:{ all -> 0x0298 }] */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x023f A[Catch:{ all -> 0x0298 }] */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x024f A[Catch:{ all -> 0x0298 }] */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x0252 A[Catch:{ all -> 0x0298 }] */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.List mo9427g() {
        /*
            r70 = this;
            r1 = r70
            java.util.TreeMap r0 = androidx.p182p.C3930am.f12576a
            java.lang.String r0 = "SELECT * FROM workspec WHERE state=0 AND schedule_requested_at<>-1"
            r2 = 0
            androidx.p.am r3 = androidx.p182p.C3929al.m11267a(r0, r2)
            androidx.p.ah r0 = r1.f14237a
            r0.mo8175S()
            androidx.p.ah r0 = r1.f14237a
            r4 = 0
            android.database.Cursor r5 = androidx.p182p.p185c.C3940b.m11293a(r0, r3, r2, r4)
            java.lang.String r0 = "id"
            int r0 = androidx.p182p.p185c.C3939a.m11292b(r5, r0)     // Catch:{ all -> 0x029a }
            java.lang.String r6 = "state"
            int r6 = androidx.p182p.p185c.C3939a.m11292b(r5, r6)     // Catch:{ all -> 0x029a }
            java.lang.String r7 = "worker_class_name"
            int r7 = androidx.p182p.p185c.C3939a.m11292b(r5, r7)     // Catch:{ all -> 0x029a }
            java.lang.String r8 = "input_merger_class_name"
            int r8 = androidx.p182p.p185c.C3939a.m11292b(r5, r8)     // Catch:{ all -> 0x029a }
            java.lang.String r9 = "input"
            int r9 = androidx.p182p.p185c.C3939a.m11292b(r5, r9)     // Catch:{ all -> 0x029a }
            java.lang.String r10 = "output"
            int r10 = androidx.p182p.p185c.C3939a.m11292b(r5, r10)     // Catch:{ all -> 0x029a }
            java.lang.String r11 = "initial_delay"
            int r11 = androidx.p182p.p185c.C3939a.m11292b(r5, r11)     // Catch:{ all -> 0x029a }
            java.lang.String r12 = "interval_duration"
            int r12 = androidx.p182p.p185c.C3939a.m11292b(r5, r12)     // Catch:{ all -> 0x029a }
            java.lang.String r13 = "flex_duration"
            int r13 = androidx.p182p.p185c.C3939a.m11292b(r5, r13)     // Catch:{ all -> 0x029a }
            java.lang.String r14 = "run_attempt_count"
            int r14 = androidx.p182p.p185c.C3939a.m11292b(r5, r14)     // Catch:{ all -> 0x029a }
            java.lang.String r15 = "backoff_policy"
            int r15 = androidx.p182p.p185c.C3939a.m11292b(r5, r15)     // Catch:{ all -> 0x029a }
            java.lang.String r2 = "backoff_delay_duration"
            int r2 = androidx.p182p.p185c.C3939a.m11292b(r5, r2)     // Catch:{ all -> 0x029a }
            java.lang.String r4 = "last_enqueue_time"
            int r4 = androidx.p182p.p185c.C3939a.m11292b(r5, r4)     // Catch:{ all -> 0x029a }
            java.lang.String r1 = "minimum_retention_duration"
            int r1 = androidx.p182p.p185c.C3939a.m11292b(r5, r1)     // Catch:{ all -> 0x029a }
            r16 = r3
            java.lang.String r3 = "schedule_requested_at"
            int r3 = androidx.p182p.p185c.C3939a.m11292b(r5, r3)     // Catch:{ all -> 0x0298 }
            r17 = r3
            java.lang.String r3 = "run_in_foreground"
            int r3 = androidx.p182p.p185c.C3939a.m11292b(r5, r3)     // Catch:{ all -> 0x0298 }
            r18 = r3
            java.lang.String r3 = "out_of_quota_policy"
            int r3 = androidx.p182p.p185c.C3939a.m11292b(r5, r3)     // Catch:{ all -> 0x0298 }
            r19 = r3
            java.lang.String r3 = "period_count"
            int r3 = androidx.p182p.p185c.C3939a.m11292b(r5, r3)     // Catch:{ all -> 0x0298 }
            r20 = r3
            java.lang.String r3 = "generation"
            int r3 = androidx.p182p.p185c.C3939a.m11292b(r5, r3)     // Catch:{ all -> 0x0298 }
            r21 = r3
            java.lang.String r3 = "required_network_type"
            int r3 = androidx.p182p.p185c.C3939a.m11292b(r5, r3)     // Catch:{ all -> 0x0298 }
            r22 = r3
            java.lang.String r3 = "requires_charging"
            int r3 = androidx.p182p.p185c.C3939a.m11292b(r5, r3)     // Catch:{ all -> 0x0298 }
            r23 = r3
            java.lang.String r3 = "requires_device_idle"
            int r3 = androidx.p182p.p185c.C3939a.m11292b(r5, r3)     // Catch:{ all -> 0x0298 }
            r24 = r3
            java.lang.String r3 = "requires_battery_not_low"
            int r3 = androidx.p182p.p185c.C3939a.m11292b(r5, r3)     // Catch:{ all -> 0x0298 }
            r25 = r3
            java.lang.String r3 = "requires_storage_not_low"
            int r3 = androidx.p182p.p185c.C3939a.m11292b(r5, r3)     // Catch:{ all -> 0x0298 }
            r26 = r3
            java.lang.String r3 = "trigger_content_update_delay"
            int r3 = androidx.p182p.p185c.C3939a.m11292b(r5, r3)     // Catch:{ all -> 0x0298 }
            r27 = r3
            java.lang.String r3 = "trigger_max_content_delay"
            int r3 = androidx.p182p.p185c.C3939a.m11292b(r5, r3)     // Catch:{ all -> 0x0298 }
            r28 = r3
            java.lang.String r3 = "content_uri_triggers"
            int r3 = androidx.p182p.p185c.C3939a.m11292b(r5, r3)     // Catch:{ all -> 0x0298 }
            r29 = r3
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch:{ all -> 0x0298 }
            r30 = r1
            int r1 = r5.getCount()     // Catch:{ all -> 0x0298 }
            r3.<init>(r1)     // Catch:{ all -> 0x0298 }
        L_0x00e0:
            boolean r1 = r5.moveToNext()     // Catch:{ all -> 0x0298 }
            if (r1 == 0) goto L_0x0291
            boolean r1 = r5.isNull(r0)     // Catch:{ all -> 0x0298 }
            if (r1 == 0) goto L_0x00ef
            r32 = 0
            goto L_0x00f5
        L_0x00ef:
            java.lang.String r1 = r5.getString(r0)     // Catch:{ all -> 0x0298 }
            r32 = r1
        L_0x00f5:
            int r1 = r5.getInt(r6)     // Catch:{ all -> 0x0298 }
            androidx.work.ar r33 = androidx.work.impl.p207b.C4493ba.m12812h(r1)     // Catch:{ all -> 0x0298 }
            boolean r1 = r5.isNull(r7)     // Catch:{ all -> 0x0298 }
            if (r1 == 0) goto L_0x0106
            r34 = 0
            goto L_0x010c
        L_0x0106:
            java.lang.String r1 = r5.getString(r7)     // Catch:{ all -> 0x0298 }
            r34 = r1
        L_0x010c:
            boolean r1 = r5.isNull(r8)     // Catch:{ all -> 0x0298 }
            if (r1 == 0) goto L_0x0115
            r35 = 0
            goto L_0x011b
        L_0x0115:
            java.lang.String r1 = r5.getString(r8)     // Catch:{ all -> 0x0298 }
            r35 = r1
        L_0x011b:
            boolean r1 = r5.isNull(r9)     // Catch:{ all -> 0x0298 }
            if (r1 == 0) goto L_0x0123
            r1 = 0
            goto L_0x0127
        L_0x0123:
            byte[] r1 = r5.getBlob(r9)     // Catch:{ all -> 0x0298 }
        L_0x0127:
            androidx.work.m r36 = androidx.work.C4632m.m13035a(r1)     // Catch:{ all -> 0x0298 }
            boolean r1 = r5.isNull(r10)     // Catch:{ all -> 0x0298 }
            if (r1 == 0) goto L_0x0133
            r1 = 0
            goto L_0x0137
        L_0x0133:
            byte[] r1 = r5.getBlob(r10)     // Catch:{ all -> 0x0298 }
        L_0x0137:
            androidx.work.m r37 = androidx.work.C4632m.m13035a(r1)     // Catch:{ all -> 0x0298 }
            long r38 = r5.getLong(r11)     // Catch:{ all -> 0x0298 }
            long r40 = r5.getLong(r12)     // Catch:{ all -> 0x0298 }
            long r42 = r5.getLong(r13)     // Catch:{ all -> 0x0298 }
            int r45 = r5.getInt(r14)     // Catch:{ all -> 0x0298 }
            int r1 = r5.getInt(r15)     // Catch:{ all -> 0x0298 }
            androidx.work.a r46 = androidx.work.impl.p207b.C4493ba.m12809e(r1)     // Catch:{ all -> 0x0298 }
            long r47 = r5.getLong(r2)     // Catch:{ all -> 0x0298 }
            long r49 = r5.getLong(r4)     // Catch:{ all -> 0x0298 }
            r1 = r30
            long r51 = r5.getLong(r1)     // Catch:{ all -> 0x0298 }
            r30 = r0
            r0 = r17
            long r53 = r5.getLong(r0)     // Catch:{ all -> 0x0298 }
            r17 = r0
            r0 = r18
            int r18 = r5.getInt(r0)     // Catch:{ all -> 0x0298 }
            r31 = 1
            if (r18 == 0) goto L_0x017c
            r18 = r0
            r0 = r19
            r55 = 1
            goto L_0x0182
        L_0x017c:
            r18 = r0
            r0 = r19
            r55 = 0
        L_0x0182:
            int r19 = r5.getInt(r0)     // Catch:{ all -> 0x0298 }
            androidx.work.am r56 = androidx.work.impl.p207b.C4493ba.m12811g(r19)     // Catch:{ all -> 0x0298 }
            r19 = r0
            r0 = r20
            int r57 = r5.getInt(r0)     // Catch:{ all -> 0x0298 }
            r20 = r0
            r0 = r21
            int r58 = r5.getInt(r0)     // Catch:{ all -> 0x0298 }
            r21 = r0
            r0 = r22
            boolean r22 = r5.isNull(r0)     // Catch:{ all -> 0x0298 }
            if (r22 == 0) goto L_0x01f1
            r22 = r1
            r1 = r23
            boolean r23 = r5.isNull(r1)     // Catch:{ all -> 0x0298 }
            if (r23 == 0) goto L_0x01f5
            r23 = r2
            r2 = r24
            boolean r24 = r5.isNull(r2)     // Catch:{ all -> 0x0298 }
            if (r24 == 0) goto L_0x01f9
            r24 = r4
            r4 = r25
            boolean r25 = r5.isNull(r4)     // Catch:{ all -> 0x0298 }
            if (r25 == 0) goto L_0x01fd
            r25 = r6
            r6 = r26
            boolean r26 = r5.isNull(r6)     // Catch:{ all -> 0x0298 }
            if (r26 == 0) goto L_0x0201
            r26 = r7
            r7 = r27
            boolean r27 = r5.isNull(r7)     // Catch:{ all -> 0x0298 }
            if (r27 == 0) goto L_0x0205
            r27 = r8
            r8 = r28
            boolean r28 = r5.isNull(r8)     // Catch:{ all -> 0x0298 }
            if (r28 == 0) goto L_0x0209
            r28 = r9
            r9 = r29
            boolean r29 = r5.isNull(r9)     // Catch:{ all -> 0x0298 }
            if (r29 != 0) goto L_0x01eb
            goto L_0x020d
        L_0x01eb:
            r29 = r0
            r44 = 0
            goto L_0x0265
        L_0x01f1:
            r22 = r1
            r1 = r23
        L_0x01f5:
            r23 = r2
            r2 = r24
        L_0x01f9:
            r24 = r4
            r4 = r25
        L_0x01fd:
            r25 = r6
            r6 = r26
        L_0x0201:
            r26 = r7
            r7 = r27
        L_0x0205:
            r27 = r8
            r8 = r28
        L_0x0209:
            r28 = r9
            r9 = r29
        L_0x020d:
            int r29 = r5.getInt(r0)     // Catch:{ all -> 0x0298 }
            androidx.work.ae r60 = androidx.work.impl.p207b.C4493ba.m12810f(r29)     // Catch:{ all -> 0x0298 }
            int r29 = r5.getInt(r1)     // Catch:{ all -> 0x0298 }
            if (r29 == 0) goto L_0x021e
            r61 = 1
            goto L_0x0220
        L_0x021e:
            r61 = 0
        L_0x0220:
            int r29 = r5.getInt(r2)     // Catch:{ all -> 0x0298 }
            if (r29 == 0) goto L_0x0229
            r62 = 1
            goto L_0x022b
        L_0x0229:
            r62 = 0
        L_0x022b:
            int r29 = r5.getInt(r4)     // Catch:{ all -> 0x0298 }
            if (r29 == 0) goto L_0x0234
            r63 = 1
            goto L_0x0236
        L_0x0234:
            r63 = 0
        L_0x0236:
            int r29 = r5.getInt(r6)     // Catch:{ all -> 0x0298 }
            if (r29 == 0) goto L_0x023f
            r64 = 1
            goto L_0x0241
        L_0x023f:
            r64 = 0
        L_0x0241:
            long r65 = r5.getLong(r7)     // Catch:{ all -> 0x0298 }
            long r67 = r5.getLong(r8)     // Catch:{ all -> 0x0298 }
            boolean r29 = r5.isNull(r9)     // Catch:{ all -> 0x0298 }
            if (r29 == 0) goto L_0x0252
            r29 = 0
            goto L_0x0256
        L_0x0252:
            byte[] r29 = r5.getBlob(r9)     // Catch:{ all -> 0x0298 }
        L_0x0256:
            java.util.Set r69 = androidx.work.impl.p207b.C4493ba.m12813i(r29)     // Catch:{ all -> 0x0298 }
            androidx.work.h r29 = new androidx.work.h     // Catch:{ all -> 0x0298 }
            r59 = r29
            r59.<init>(r60, r61, r62, r63, r64, r65, r67, r69)     // Catch:{ all -> 0x0298 }
            r44 = r29
            r29 = r0
        L_0x0265:
            androidx.work.impl.b.ae r0 = new androidx.work.impl.b.ae     // Catch:{ all -> 0x0298 }
            r31 = r0
            r31.<init>(r32, r33, r34, r35, r36, r37, r38, r40, r42, r44, r45, r46, r47, r49, r51, r53, r55, r56, r57, r58)     // Catch:{ all -> 0x0298 }
            r3.add(r0)     // Catch:{ all -> 0x0298 }
            r0 = r30
            r30 = r22
            r22 = r29
            r29 = r9
            r9 = r28
            r28 = r8
            r8 = r27
            r27 = r7
            r7 = r26
            r26 = r6
            r6 = r25
            r25 = r4
            r4 = r24
            r24 = r2
            r2 = r23
            r23 = r1
            goto L_0x00e0
        L_0x0291:
            r5.close()
            r16.mo8207h()
            return r3
        L_0x0298:
            r0 = move-exception
            goto L_0x029d
        L_0x029a:
            r0 = move-exception
            r16 = r3
        L_0x029d:
            r5.close()
            r16.mo8207h()
            goto L_0x02a5
        L_0x02a4:
            throw r0
        L_0x02a5:
            goto L_0x02a4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.work.impl.p207b.C4485at.mo9427g():java.util.List");
    }

    /* renamed from: h */
    public final List mo9428h(String str) {
        String str2;
        TreeMap treeMap = C3930am.f12576a;
        C3930am a = C3929al.m11267a("SELECT id FROM workspec WHERE state NOT IN (2, 3, 5) AND id IN (SELECT work_spec_id FROM workname WHERE name=?)", 1);
        if (str == null) {
            a.f12582g[1] = 1;
        } else {
            a.mo8206g(1, str);
        }
        this.f14237a.mo8175S();
        Cursor a2 = C3940b.m11293a(this.f14237a, a, false, (CancellationSignal) null);
        try {
            ArrayList arrayList = new ArrayList(a2.getCount());
            while (a2.moveToNext()) {
                if (a2.isNull(0)) {
                    str2 = null;
                } else {
                    str2 = a2.getString(0);
                }
                arrayList.add(str2);
            }
            return arrayList;
        } finally {
            a2.close();
            a.mo8207h();
        }
    }

    /* renamed from: i */
    public final List mo9429i(String str) {
        String str2;
        TreeMap treeMap = C3930am.f12576a;
        C3930am a = C3929al.m11267a("SELECT id FROM workspec WHERE state NOT IN (2, 3, 5) AND id IN (SELECT work_spec_id FROM worktag WHERE tag=?)", 1);
        if (str == null) {
            a.f12582g[1] = 1;
        } else {
            a.mo8206g(1, str);
        }
        this.f14237a.mo8175S();
        Cursor a2 = C3940b.m11293a(this.f14237a, a, false, (CancellationSignal) null);
        try {
            ArrayList arrayList = new ArrayList(a2.getCount());
            while (a2.moveToNext()) {
                if (a2.isNull(0)) {
                    str2 = null;
                } else {
                    str2 = a2.getString(0);
                }
                arrayList.add(str2);
            }
            return arrayList;
        } finally {
            a2.close();
            a.mo8207h();
        }
    }

    /* renamed from: j */
    public final List mo9430j(String str) {
        String str2;
        TreeMap treeMap = C3930am.f12576a;
        C3930am a = C3929al.m11267a("SELECT id, state FROM workspec WHERE id IN (SELECT work_spec_id FROM workname WHERE name=?)", 1);
        if (str == null) {
            a.f12582g[1] = 1;
        } else {
            a.mo8206g(1, str);
        }
        this.f14237a.mo8175S();
        Cursor a2 = C3940b.m11293a(this.f14237a, a, false, (CancellationSignal) null);
        try {
            ArrayList arrayList = new ArrayList(a2.getCount());
            while (a2.moveToNext()) {
                if (a2.isNull(0)) {
                    str2 = null;
                } else {
                    str2 = a2.getString(0);
                }
                arrayList.add(new C4468ac(str2, C4493ba.m12812h(a2.getInt(1))));
            }
            return arrayList;
        } finally {
            a2.close();
            a.mo8207h();
        }
    }

    /* renamed from: k */
    public final List mo9431k(String str) {
        Cursor a;
        String str2;
        byte[] bArr;
        TreeMap treeMap = C3930am.f12576a;
        C3930am a2 = C3929al.m11267a("SELECT id, state, output, run_attempt_count, generation FROM workspec WHERE id IN (SELECT work_spec_id FROM workname WHERE name=?)", 1);
        a2.mo8206g(1, str);
        this.f14237a.mo8175S();
        this.f14237a.mo8181p();
        try {
            a = C3940b.m11293a(this.f14237a, a2, true, (CancellationSignal) null);
            C0977g gVar = new C0977g();
            C0977g gVar2 = new C0977g();
            while (a.moveToNext()) {
                String string = a.getString(0);
                if (((ArrayList) gVar.get(string)) == null) {
                    gVar.put(string, new ArrayList());
                }
                String string2 = a.getString(0);
                if (((ArrayList) gVar2.get(string2)) == null) {
                    gVar2.put(string2, new ArrayList());
                }
            }
            a.moveToPosition(-1);
            m12764A(gVar);
            m12765z(gVar2);
            ArrayList arrayList = new ArrayList(a.getCount());
            while (a.moveToNext()) {
                if (a.isNull(0)) {
                    str2 = null;
                } else {
                    str2 = a.getString(0);
                }
                C4394ar h = C4493ba.m12812h(a.getInt(1));
                if (a.isNull(2)) {
                    bArr = null;
                } else {
                    bArr = a.getBlob(2);
                }
                C4632m a3 = C4632m.m13035a(bArr);
                int i = a.getInt(3);
                int i2 = a.getInt(4);
                ArrayList arrayList2 = (ArrayList) gVar.get(a.getString(0));
                if (arrayList2 == null) {
                    arrayList2 = new ArrayList();
                }
                ArrayList arrayList3 = arrayList2;
                ArrayList arrayList4 = (ArrayList) gVar2.get(a.getString(0));
                if (arrayList4 == null) {
                    arrayList4 = new ArrayList();
                }
                arrayList.add(new C4469ad(str2, h, a3, i, i2, arrayList3, arrayList4));
            }
            this.f14237a.mo8188w();
            a.close();
            a2.mo8207h();
            this.f14237a.mo8183r();
            return arrayList;
        } catch (Throwable th) {
            this.f14237a.mo8183r();
            throw th;
        }
    }

    /* renamed from: l */
    public final void mo9432l(String str) {
        this.f14237a.mo8175S();
        C4057l d = this.f14240d.mo8212d();
        if (str == null) {
            d.mo8205f(1);
        } else {
            d.mo8206g(1, str);
        }
        this.f14237a.mo8181p();
        try {
            d.mo8256a();
            this.f14237a.mo8188w();
        } finally {
            this.f14237a.mo8183r();
            this.f14240d.mo8215g(d);
        }
    }

    /* renamed from: m */
    public final void mo9433m(String str) {
        this.f14237a.mo8175S();
        C4057l d = this.f14242f.mo8212d();
        if (str == null) {
            d.mo8205f(1);
        } else {
            d.mo8206g(1, str);
        }
        this.f14237a.mo8181p();
        try {
            d.mo8256a();
            this.f14237a.mo8188w();
        } finally {
            this.f14237a.mo8183r();
            this.f14242f.mo8215g(d);
        }
    }

    /* renamed from: n */
    public final void mo9434n(C4470ae aeVar) {
        this.f14237a.mo8175S();
        this.f14237a.mo8181p();
        try {
            this.f14238b.mo8308c(aeVar);
            this.f14237a.mo8188w();
        } finally {
            this.f14237a.mo8183r();
        }
    }

    /* renamed from: o */
    public final void mo9435o() {
        this.f14237a.mo8175S();
        C4057l d = this.f14249m.mo8212d();
        this.f14237a.mo8181p();
        try {
            d.mo8256a();
            this.f14237a.mo8188w();
        } finally {
            this.f14237a.mo8183r();
            this.f14249m.mo8215g(d);
        }
    }

    /* renamed from: p */
    public final void mo9436p(String str, long j) {
        this.f14237a.mo8175S();
        C4057l d = this.f14244h.mo8212d();
        d.mo8204e(1, j);
        if (str == null) {
            d.mo8205f(2);
        } else {
            d.mo8206g(2, str);
        }
        this.f14237a.mo8181p();
        try {
            d.mo8256a();
            this.f14237a.mo8188w();
        } finally {
            this.f14237a.mo8183r();
            this.f14244h.mo8215g(d);
        }
    }

    /* renamed from: q */
    public final void mo9437q(String str, C4632m mVar) {
        this.f14237a.mo8175S();
        C4057l d = this.f14243g.mo8212d();
        byte[] e = C4632m.m13036e(mVar);
        if (e == null) {
            d.mo8205f(1);
        } else {
            d.mo8201c(1, e);
        }
        if (str == null) {
            d.mo8205f(2);
        } else {
            d.mo8206g(2, str);
        }
        this.f14237a.mo8181p();
        try {
            d.mo8256a();
            this.f14237a.mo8188w();
        } finally {
            this.f14237a.mo8183r();
            this.f14243g.mo8215g(d);
        }
    }

    /* renamed from: r */
    public final void mo9438r(C4470ae aeVar) {
        this.f14237a.mo8175S();
        this.f14237a.mo8181p();
        try {
            this.f14239c.mo8304b(aeVar);
            this.f14237a.mo8188w();
        } finally {
            this.f14237a.mo8183r();
        }
    }

    /* renamed from: s */
    public final boolean mo9439s() {
        TreeMap treeMap = C3930am.f12576a;
        boolean z = false;
        C3930am a = C3929al.m11267a("SELECT COUNT(*) > 0 FROM workspec WHERE state NOT IN (2, 3, 5) LIMIT 1", 0);
        this.f14237a.mo8175S();
        Cursor a2 = C3940b.m11293a(this.f14237a, a, false, (CancellationSignal) null);
        try {
            if (a2.moveToFirst() && a2.getInt(0) != 0) {
                z = true;
            }
            return z;
        } finally {
            a2.close();
            a.mo8207h();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:59:0x021f A[Catch:{ all -> 0x029c }] */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x0222 A[Catch:{ all -> 0x029c }] */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x022a A[Catch:{ all -> 0x029c }] */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x022d A[Catch:{ all -> 0x029c }] */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x0235 A[Catch:{ all -> 0x029c }] */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x0238 A[Catch:{ all -> 0x029c }] */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x0240 A[Catch:{ all -> 0x029c }] */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x0243 A[Catch:{ all -> 0x029c }] */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x0253 A[Catch:{ all -> 0x029c }] */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x0256 A[Catch:{ all -> 0x029c }] */
    /* renamed from: t */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.List mo9440t() {
        /*
            r70 = this;
            r1 = r70
            java.util.TreeMap r0 = androidx.p182p.C3930am.f12576a
            java.lang.String r0 = "SELECT * FROM workspec WHERE state=0 ORDER BY last_enqueue_time LIMIT ?"
            r2 = 1
            androidx.p.am r3 = androidx.p182p.C3929al.m11267a(r0, r2)
            r4 = 200(0xc8, double:9.9E-322)
            r3.mo8204e(r2, r4)
            androidx.p.ah r0 = r1.f14237a
            r0.mo8175S()
            androidx.p.ah r0 = r1.f14237a
            r4 = 0
            r5 = 0
            android.database.Cursor r6 = androidx.p182p.p185c.C3940b.m11293a(r0, r3, r4, r5)
            java.lang.String r0 = "id"
            int r0 = androidx.p182p.p185c.C3939a.m11292b(r6, r0)     // Catch:{ all -> 0x029e }
            java.lang.String r7 = "state"
            int r7 = androidx.p182p.p185c.C3939a.m11292b(r6, r7)     // Catch:{ all -> 0x029e }
            java.lang.String r8 = "worker_class_name"
            int r8 = androidx.p182p.p185c.C3939a.m11292b(r6, r8)     // Catch:{ all -> 0x029e }
            java.lang.String r9 = "input_merger_class_name"
            int r9 = androidx.p182p.p185c.C3939a.m11292b(r6, r9)     // Catch:{ all -> 0x029e }
            java.lang.String r10 = "input"
            int r10 = androidx.p182p.p185c.C3939a.m11292b(r6, r10)     // Catch:{ all -> 0x029e }
            java.lang.String r11 = "output"
            int r11 = androidx.p182p.p185c.C3939a.m11292b(r6, r11)     // Catch:{ all -> 0x029e }
            java.lang.String r12 = "initial_delay"
            int r12 = androidx.p182p.p185c.C3939a.m11292b(r6, r12)     // Catch:{ all -> 0x029e }
            java.lang.String r13 = "interval_duration"
            int r13 = androidx.p182p.p185c.C3939a.m11292b(r6, r13)     // Catch:{ all -> 0x029e }
            java.lang.String r14 = "flex_duration"
            int r14 = androidx.p182p.p185c.C3939a.m11292b(r6, r14)     // Catch:{ all -> 0x029e }
            java.lang.String r15 = "run_attempt_count"
            int r15 = androidx.p182p.p185c.C3939a.m11292b(r6, r15)     // Catch:{ all -> 0x029e }
            java.lang.String r2 = "backoff_policy"
            int r2 = androidx.p182p.p185c.C3939a.m11292b(r6, r2)     // Catch:{ all -> 0x029e }
            java.lang.String r4 = "backoff_delay_duration"
            int r4 = androidx.p182p.p185c.C3939a.m11292b(r6, r4)     // Catch:{ all -> 0x029e }
            java.lang.String r5 = "last_enqueue_time"
            int r5 = androidx.p182p.p185c.C3939a.m11292b(r6, r5)     // Catch:{ all -> 0x029e }
            java.lang.String r1 = "minimum_retention_duration"
            int r1 = androidx.p182p.p185c.C3939a.m11292b(r6, r1)     // Catch:{ all -> 0x029e }
            r16 = r3
            java.lang.String r3 = "schedule_requested_at"
            int r3 = androidx.p182p.p185c.C3939a.m11292b(r6, r3)     // Catch:{ all -> 0x029c }
            r17 = r3
            java.lang.String r3 = "run_in_foreground"
            int r3 = androidx.p182p.p185c.C3939a.m11292b(r6, r3)     // Catch:{ all -> 0x029c }
            r18 = r3
            java.lang.String r3 = "out_of_quota_policy"
            int r3 = androidx.p182p.p185c.C3939a.m11292b(r6, r3)     // Catch:{ all -> 0x029c }
            r19 = r3
            java.lang.String r3 = "period_count"
            int r3 = androidx.p182p.p185c.C3939a.m11292b(r6, r3)     // Catch:{ all -> 0x029c }
            r20 = r3
            java.lang.String r3 = "generation"
            int r3 = androidx.p182p.p185c.C3939a.m11292b(r6, r3)     // Catch:{ all -> 0x029c }
            r21 = r3
            java.lang.String r3 = "required_network_type"
            int r3 = androidx.p182p.p185c.C3939a.m11292b(r6, r3)     // Catch:{ all -> 0x029c }
            r22 = r3
            java.lang.String r3 = "requires_charging"
            int r3 = androidx.p182p.p185c.C3939a.m11292b(r6, r3)     // Catch:{ all -> 0x029c }
            r23 = r3
            java.lang.String r3 = "requires_device_idle"
            int r3 = androidx.p182p.p185c.C3939a.m11292b(r6, r3)     // Catch:{ all -> 0x029c }
            r24 = r3
            java.lang.String r3 = "requires_battery_not_low"
            int r3 = androidx.p182p.p185c.C3939a.m11292b(r6, r3)     // Catch:{ all -> 0x029c }
            r25 = r3
            java.lang.String r3 = "requires_storage_not_low"
            int r3 = androidx.p182p.p185c.C3939a.m11292b(r6, r3)     // Catch:{ all -> 0x029c }
            r26 = r3
            java.lang.String r3 = "trigger_content_update_delay"
            int r3 = androidx.p182p.p185c.C3939a.m11292b(r6, r3)     // Catch:{ all -> 0x029c }
            r27 = r3
            java.lang.String r3 = "trigger_max_content_delay"
            int r3 = androidx.p182p.p185c.C3939a.m11292b(r6, r3)     // Catch:{ all -> 0x029c }
            r28 = r3
            java.lang.String r3 = "content_uri_triggers"
            int r3 = androidx.p182p.p185c.C3939a.m11292b(r6, r3)     // Catch:{ all -> 0x029c }
            r29 = r3
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch:{ all -> 0x029c }
            r30 = r1
            int r1 = r6.getCount()     // Catch:{ all -> 0x029c }
            r3.<init>(r1)     // Catch:{ all -> 0x029c }
        L_0x00e6:
            boolean r1 = r6.moveToNext()     // Catch:{ all -> 0x029c }
            if (r1 == 0) goto L_0x0295
            boolean r1 = r6.isNull(r0)     // Catch:{ all -> 0x029c }
            if (r1 == 0) goto L_0x00f5
            r32 = 0
            goto L_0x00fb
        L_0x00f5:
            java.lang.String r1 = r6.getString(r0)     // Catch:{ all -> 0x029c }
            r32 = r1
        L_0x00fb:
            int r1 = r6.getInt(r7)     // Catch:{ all -> 0x029c }
            androidx.work.ar r33 = androidx.work.impl.p207b.C4493ba.m12812h(r1)     // Catch:{ all -> 0x029c }
            boolean r1 = r6.isNull(r8)     // Catch:{ all -> 0x029c }
            if (r1 == 0) goto L_0x010c
            r34 = 0
            goto L_0x0112
        L_0x010c:
            java.lang.String r1 = r6.getString(r8)     // Catch:{ all -> 0x029c }
            r34 = r1
        L_0x0112:
            boolean r1 = r6.isNull(r9)     // Catch:{ all -> 0x029c }
            if (r1 == 0) goto L_0x011b
            r35 = 0
            goto L_0x0121
        L_0x011b:
            java.lang.String r1 = r6.getString(r9)     // Catch:{ all -> 0x029c }
            r35 = r1
        L_0x0121:
            boolean r1 = r6.isNull(r10)     // Catch:{ all -> 0x029c }
            if (r1 == 0) goto L_0x0129
            r1 = 0
            goto L_0x012d
        L_0x0129:
            byte[] r1 = r6.getBlob(r10)     // Catch:{ all -> 0x029c }
        L_0x012d:
            androidx.work.m r36 = androidx.work.C4632m.m13035a(r1)     // Catch:{ all -> 0x029c }
            boolean r1 = r6.isNull(r11)     // Catch:{ all -> 0x029c }
            if (r1 == 0) goto L_0x0139
            r1 = 0
            goto L_0x013d
        L_0x0139:
            byte[] r1 = r6.getBlob(r11)     // Catch:{ all -> 0x029c }
        L_0x013d:
            androidx.work.m r37 = androidx.work.C4632m.m13035a(r1)     // Catch:{ all -> 0x029c }
            long r38 = r6.getLong(r12)     // Catch:{ all -> 0x029c }
            long r40 = r6.getLong(r13)     // Catch:{ all -> 0x029c }
            long r42 = r6.getLong(r14)     // Catch:{ all -> 0x029c }
            int r45 = r6.getInt(r15)     // Catch:{ all -> 0x029c }
            int r1 = r6.getInt(r2)     // Catch:{ all -> 0x029c }
            androidx.work.a r46 = androidx.work.impl.p207b.C4493ba.m12809e(r1)     // Catch:{ all -> 0x029c }
            long r47 = r6.getLong(r4)     // Catch:{ all -> 0x029c }
            long r49 = r6.getLong(r5)     // Catch:{ all -> 0x029c }
            r1 = r30
            long r51 = r6.getLong(r1)     // Catch:{ all -> 0x029c }
            r30 = r0
            r0 = r17
            long r53 = r6.getLong(r0)     // Catch:{ all -> 0x029c }
            r17 = r0
            r0 = r18
            int r18 = r6.getInt(r0)     // Catch:{ all -> 0x029c }
            if (r18 == 0) goto L_0x0180
            r18 = r0
            r0 = r19
            r55 = 1
            goto L_0x0186
        L_0x0180:
            r18 = r0
            r0 = r19
            r55 = 0
        L_0x0186:
            int r19 = r6.getInt(r0)     // Catch:{ all -> 0x029c }
            androidx.work.am r56 = androidx.work.impl.p207b.C4493ba.m12811g(r19)     // Catch:{ all -> 0x029c }
            r19 = r0
            r0 = r20
            int r57 = r6.getInt(r0)     // Catch:{ all -> 0x029c }
            r20 = r0
            r0 = r21
            int r58 = r6.getInt(r0)     // Catch:{ all -> 0x029c }
            r21 = r0
            r0 = r22
            boolean r22 = r6.isNull(r0)     // Catch:{ all -> 0x029c }
            if (r22 == 0) goto L_0x01f5
            r22 = r1
            r1 = r23
            boolean r23 = r6.isNull(r1)     // Catch:{ all -> 0x029c }
            if (r23 == 0) goto L_0x01f9
            r23 = r2
            r2 = r24
            boolean r24 = r6.isNull(r2)     // Catch:{ all -> 0x029c }
            if (r24 == 0) goto L_0x01fd
            r24 = r4
            r4 = r25
            boolean r25 = r6.isNull(r4)     // Catch:{ all -> 0x029c }
            if (r25 == 0) goto L_0x0201
            r25 = r5
            r5 = r26
            boolean r26 = r6.isNull(r5)     // Catch:{ all -> 0x029c }
            if (r26 == 0) goto L_0x0205
            r26 = r7
            r7 = r27
            boolean r27 = r6.isNull(r7)     // Catch:{ all -> 0x029c }
            if (r27 == 0) goto L_0x0209
            r27 = r8
            r8 = r28
            boolean r28 = r6.isNull(r8)     // Catch:{ all -> 0x029c }
            if (r28 == 0) goto L_0x020d
            r28 = r9
            r9 = r29
            boolean r29 = r6.isNull(r9)     // Catch:{ all -> 0x029c }
            if (r29 != 0) goto L_0x01ef
            goto L_0x0211
        L_0x01ef:
            r29 = r0
            r44 = 0
            goto L_0x0269
        L_0x01f5:
            r22 = r1
            r1 = r23
        L_0x01f9:
            r23 = r2
            r2 = r24
        L_0x01fd:
            r24 = r4
            r4 = r25
        L_0x0201:
            r25 = r5
            r5 = r26
        L_0x0205:
            r26 = r7
            r7 = r27
        L_0x0209:
            r27 = r8
            r8 = r28
        L_0x020d:
            r28 = r9
            r9 = r29
        L_0x0211:
            int r29 = r6.getInt(r0)     // Catch:{ all -> 0x029c }
            androidx.work.ae r60 = androidx.work.impl.p207b.C4493ba.m12810f(r29)     // Catch:{ all -> 0x029c }
            int r29 = r6.getInt(r1)     // Catch:{ all -> 0x029c }
            if (r29 == 0) goto L_0x0222
            r61 = 1
            goto L_0x0224
        L_0x0222:
            r61 = 0
        L_0x0224:
            int r29 = r6.getInt(r2)     // Catch:{ all -> 0x029c }
            if (r29 == 0) goto L_0x022d
            r62 = 1
            goto L_0x022f
        L_0x022d:
            r62 = 0
        L_0x022f:
            int r29 = r6.getInt(r4)     // Catch:{ all -> 0x029c }
            if (r29 == 0) goto L_0x0238
            r63 = 1
            goto L_0x023a
        L_0x0238:
            r63 = 0
        L_0x023a:
            int r29 = r6.getInt(r5)     // Catch:{ all -> 0x029c }
            if (r29 == 0) goto L_0x0243
            r64 = 1
            goto L_0x0245
        L_0x0243:
            r64 = 0
        L_0x0245:
            long r65 = r6.getLong(r7)     // Catch:{ all -> 0x029c }
            long r67 = r6.getLong(r8)     // Catch:{ all -> 0x029c }
            boolean r29 = r6.isNull(r9)     // Catch:{ all -> 0x029c }
            if (r29 == 0) goto L_0x0256
            r29 = 0
            goto L_0x025a
        L_0x0256:
            byte[] r29 = r6.getBlob(r9)     // Catch:{ all -> 0x029c }
        L_0x025a:
            java.util.Set r69 = androidx.work.impl.p207b.C4493ba.m12813i(r29)     // Catch:{ all -> 0x029c }
            androidx.work.h r29 = new androidx.work.h     // Catch:{ all -> 0x029c }
            r59 = r29
            r59.<init>(r60, r61, r62, r63, r64, r65, r67, r69)     // Catch:{ all -> 0x029c }
            r44 = r29
            r29 = r0
        L_0x0269:
            androidx.work.impl.b.ae r0 = new androidx.work.impl.b.ae     // Catch:{ all -> 0x029c }
            r31 = r0
            r31.<init>(r32, r33, r34, r35, r36, r37, r38, r40, r42, r44, r45, r46, r47, r49, r51, r53, r55, r56, r57, r58)     // Catch:{ all -> 0x029c }
            r3.add(r0)     // Catch:{ all -> 0x029c }
            r0 = r30
            r30 = r22
            r22 = r29
            r29 = r9
            r9 = r28
            r28 = r8
            r8 = r27
            r27 = r7
            r7 = r26
            r26 = r5
            r5 = r25
            r25 = r4
            r4 = r24
            r24 = r2
            r2 = r23
            r23 = r1
            goto L_0x00e6
        L_0x0295:
            r6.close()
            r16.mo8207h()
            return r3
        L_0x029c:
            r0 = move-exception
            goto L_0x02a1
        L_0x029e:
            r0 = move-exception
            r16 = r3
        L_0x02a1:
            r6.close()
            r16.mo8207h()
            goto L_0x02a9
        L_0x02a8:
            throw r0
        L_0x02a9:
            goto L_0x02a8
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.work.impl.p207b.C4485at.mo9440t():java.util.List");
    }

    /* renamed from: u */
    public final void mo9441u(String str) {
        this.f14237a.mo8175S();
        C4057l d = this.f14245i.mo8212d();
        if (str == null) {
            d.mo8205f(1);
        } else {
            d.mo8206g(1, str);
        }
        this.f14237a.mo8181p();
        try {
            d.mo8256a();
            this.f14237a.mo8188w();
        } finally {
            this.f14237a.mo8183r();
            this.f14245i.mo8215g(d);
        }
    }

    /* renamed from: v */
    public final void mo9442v(String str, long j) {
        this.f14237a.mo8175S();
        C4057l d = this.f14247k.mo8212d();
        d.mo8204e(1, j);
        if (str == null) {
            d.mo8205f(2);
        } else {
            d.mo8206g(2, str);
        }
        this.f14237a.mo8181p();
        try {
            d.mo8256a();
            this.f14237a.mo8188w();
        } finally {
            this.f14237a.mo8183r();
            this.f14247k.mo8215g(d);
        }
    }

    /* renamed from: w */
    public final void mo9443w() {
        this.f14237a.mo8175S();
        C4057l d = this.f14248l.mo8212d();
        this.f14237a.mo8181p();
        try {
            d.mo8256a();
            this.f14237a.mo8188w();
        } finally {
            this.f14237a.mo8183r();
            this.f14248l.mo8215g(d);
        }
    }

    /* renamed from: x */
    public final void mo9444x(String str) {
        this.f14237a.mo8175S();
        C4057l d = this.f14246j.mo8212d();
        if (str == null) {
            d.mo8205f(1);
        } else {
            d.mo8206g(1, str);
        }
        this.f14237a.mo8181p();
        try {
            d.mo8256a();
            this.f14237a.mo8188w();
        } finally {
            this.f14237a.mo8183r();
            this.f14246j.mo8215g(d);
        }
    }

    /* renamed from: y */
    public final void mo9445y(C4394ar arVar, String str) {
        this.f14237a.mo8175S();
        C4057l d = this.f14241e.mo8212d();
        d.mo8204e(1, (long) C4493ba.m12808d(arVar));
        if (str == null) {
            d.mo8205f(2);
        } else {
            d.mo8206g(2, str);
        }
        this.f14237a.mo8181p();
        try {
            d.mo8256a();
            this.f14237a.mo8188w();
        } finally {
            this.f14237a.mo8183r();
            this.f14241e.mo8215g(d);
        }
    }
}
