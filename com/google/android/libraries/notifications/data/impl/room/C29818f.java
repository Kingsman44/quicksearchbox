package com.google.android.libraries.notifications.data.impl.room;

import android.database.Cursor;
import android.os.CancellationSignal;
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
import com.google.android.libraries.notifications.data.C29828s;
import com.google.p4160bf.p4164b.p4165a.p4166a.C55538ar;
import com.google.p4160bf.p4164b.p4165a.p4166a.C55560bm;
import com.google.p4160bf.p4164b.p4165a.p4166a.C55588x;
import com.google.p4160bf.p4164b.p4165a.p4166a.C55590z;
import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;

/* renamed from: com.google.android.libraries.notifications.data.impl.room.f */
/* compiled from: PG */
public final class C29818f implements C29814b {

    /* renamed from: a */
    private final C3925ah f80831a;

    /* renamed from: b */
    private final C3966s f80832b;

    /* renamed from: c */
    private final C3965r f80833c;

    /* renamed from: d */
    private final C3933ap f80834d;

    public C29818f(C3925ah ahVar) {
        this.f80831a = ahVar;
        this.f80832b = new C29815c(ahVar);
        this.f80833c = new C29816d(ahVar);
        this.f80834d = new C29817e(ahVar);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v0, resolved type: com.google.android.libraries.notifications.data.s} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v1, resolved type: com.google.android.libraries.notifications.data.s} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v3, resolved type: com.google.android.libraries.notifications.data.s} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v0, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v5, resolved type: com.google.android.libraries.notifications.data.s} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v6, resolved type: com.google.android.libraries.notifications.data.s} */
    /* JADX WARNING: type inference failed for: r4v2, types: [java.lang.String] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.libraries.notifications.data.C29828s mo35116a(java.lang.String r25) {
        /*
            r24 = this;
            r1 = r24
            java.util.TreeMap r0 = androidx.p182p.C3930am.f12576a
            java.lang.String r0 = "SELECT * FROM chime_thread_states WHERE thread_id = ?"
            r2 = 1
            androidx.p.am r3 = androidx.p182p.C3929al.m11267a(r0, r2)
            r0 = r25
            r3.mo8206g(r2, r0)
            androidx.p.ah r0 = r1.f80831a
            r0.mo8175S()
            androidx.p.ah r0 = r1.f80831a
            r2 = 0
            r4 = 0
            android.database.Cursor r2 = androidx.p182p.p185c.C3940b.m11293a(r0, r3, r2, r4)
            java.lang.String r0 = "id"
            int r0 = androidx.p182p.p185c.C3939a.m11292b(r2, r0)     // Catch:{ all -> 0x0097 }
            java.lang.String r5 = "thread_id"
            int r5 = androidx.p182p.p185c.C3939a.m11292b(r2, r5)     // Catch:{ all -> 0x0097 }
            java.lang.String r6 = "last_updated_version"
            int r6 = androidx.p182p.p185c.C3939a.m11292b(r2, r6)     // Catch:{ all -> 0x0097 }
            java.lang.String r7 = "read_state"
            int r7 = androidx.p182p.p185c.C3939a.m11292b(r2, r7)     // Catch:{ all -> 0x0097 }
            java.lang.String r8 = "deletion_status"
            int r8 = androidx.p182p.p185c.C3939a.m11292b(r2, r8)     // Catch:{ all -> 0x0097 }
            java.lang.String r9 = "count_behavior"
            int r9 = androidx.p182p.p185c.C3939a.m11292b(r2, r9)     // Catch:{ all -> 0x0097 }
            java.lang.String r10 = "system_tray_behavior"
            int r10 = androidx.p182p.p185c.C3939a.m11292b(r2, r10)     // Catch:{ all -> 0x0097 }
            java.lang.String r11 = "modified_timestamp"
            int r11 = androidx.p182p.p185c.C3939a.m11292b(r2, r11)     // Catch:{ all -> 0x0097 }
            boolean r12 = r2.moveToFirst()     // Catch:{ all -> 0x0097 }
            if (r12 == 0) goto L_0x0090
            long r13 = r2.getLong(r0)     // Catch:{ all -> 0x0097 }
            boolean r0 = r2.isNull(r5)     // Catch:{ all -> 0x0097 }
            if (r0 == 0) goto L_0x005f
        L_0x005d:
            r15 = r4
            goto L_0x0064
        L_0x005f:
            java.lang.String r4 = r2.getString(r5)     // Catch:{ all -> 0x0097 }
            goto L_0x005d
        L_0x0064:
            long r16 = r2.getLong(r6)     // Catch:{ all -> 0x0097 }
            int r0 = r2.getInt(r7)     // Catch:{ all -> 0x0097 }
            int r18 = com.google.p4160bf.p4164b.p4165a.p4166a.C55538ar.m87703a(r0)     // Catch:{ all -> 0x0097 }
            int r0 = r2.getInt(r8)     // Catch:{ all -> 0x0097 }
            int r19 = com.google.p4160bf.p4164b.p4165a.p4166a.C55590z.m87714a(r0)     // Catch:{ all -> 0x0097 }
            int r0 = r2.getInt(r9)     // Catch:{ all -> 0x0097 }
            int r20 = com.google.p4160bf.p4164b.p4165a.p4166a.C55588x.m87713a(r0)     // Catch:{ all -> 0x0097 }
            int r0 = r2.getInt(r10)     // Catch:{ all -> 0x0097 }
            int r21 = com.google.p4160bf.p4164b.p4165a.p4166a.C55560bm.m87708a(r0)     // Catch:{ all -> 0x0097 }
            long r22 = r2.getLong(r11)     // Catch:{ all -> 0x0097 }
            com.google.android.libraries.notifications.data.s r4 = com.google.android.libraries.notifications.data.C29828s.m55171j(r13, r15, r16, r18, r19, r20, r21, r22)     // Catch:{ all -> 0x0097 }
        L_0x0090:
            r2.close()
            r3.mo8207h()
            return r4
        L_0x0097:
            r0 = move-exception
            r2.close()
            r3.mo8207h()
            goto L_0x00a0
        L_0x009f:
            throw r0
        L_0x00a0:
            goto L_0x009f
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.notifications.data.impl.room.C29818f.mo35116a(java.lang.String):com.google.android.libraries.notifications.data.s");
    }

    /* renamed from: b */
    public final List mo35117b(String... strArr) {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append("SELECT * FROM chime_thread_states WHERE thread_id IN (");
        C3943e.m11297a(sb, r3);
        sb.append(")");
        String sb2 = sb.toString();
        TreeMap treeMap = C3930am.f12576a;
        C3930am a = C3929al.m11267a(sb2, r3);
        int i = 1;
        for (String str2 : strArr) {
            if (str2 == null) {
                a.f12582g[i] = 1;
            } else {
                a.mo8206g(i, str2);
            }
            i++;
        }
        this.f80831a.mo8175S();
        Cursor a2 = C3940b.m11293a(this.f80831a, a, false, (CancellationSignal) null);
        try {
            int b = C3939a.m11292b(a2, "id");
            int b2 = C3939a.m11292b(a2, "thread_id");
            int b3 = C3939a.m11292b(a2, "last_updated_version");
            int b4 = C3939a.m11292b(a2, "read_state");
            int b5 = C3939a.m11292b(a2, "deletion_status");
            int b6 = C3939a.m11292b(a2, "count_behavior");
            int b7 = C3939a.m11292b(a2, "system_tray_behavior");
            int b8 = C3939a.m11292b(a2, "modified_timestamp");
            ArrayList arrayList = new ArrayList(a2.getCount());
            while (a2.moveToNext()) {
                long j = a2.getLong(b);
                if (a2.isNull(b2)) {
                    str = null;
                } else {
                    str = a2.getString(b2);
                }
                arrayList.add(C29828s.m55171j(j, str, a2.getLong(b3), C55538ar.m87703a(a2.getInt(b4)), C55590z.m87714a(a2.getInt(b5)), C55588x.m87713a(a2.getInt(b6)), C55560bm.m87708a(a2.getInt(b7)), a2.getLong(b8)));
            }
            return arrayList;
        } finally {
            a2.close();
            a.mo8207h();
        }
    }

    /* renamed from: c */
    public final void mo35118c(long j) {
        this.f80831a.mo8175S();
        C4057l d = this.f80834d.mo8212d();
        d.mo8204e(1, j);
        this.f80831a.mo8181p();
        try {
            d.mo8256a();
            this.f80831a.mo8188w();
        } finally {
            this.f80831a.mo8183r();
            this.f80834d.mo8215g(d);
        }
    }

    /* renamed from: d */
    public final void mo35119d(C29828s sVar) {
        this.f80831a.mo8175S();
        this.f80831a.mo8181p();
        try {
            this.f80833c.mo8304b(sVar);
            this.f80831a.mo8188w();
        } finally {
            this.f80831a.mo8183r();
        }
    }

    /* renamed from: e */
    public final void mo35120e(C29828s sVar) {
        C3966s sVar2;
        C4057l d;
        this.f80831a.mo8175S();
        this.f80831a.mo8181p();
        try {
            sVar2 = this.f80832b;
            d = sVar2.mo8212d();
            sVar2.mo8306a(d, sVar);
            d.mo8257b();
            sVar2.mo8215g(d);
            this.f80831a.mo8188w();
            this.f80831a.mo8183r();
        } catch (Throwable th) {
            this.f80831a.mo8183r();
            throw th;
        }
    }
}
