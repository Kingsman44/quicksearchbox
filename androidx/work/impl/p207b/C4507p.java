package androidx.work.impl.p207b;

import android.database.Cursor;
import android.os.CancellationSignal;
import androidx.p182p.C3925ah;
import androidx.p182p.C3929al;
import androidx.p182p.C3930am;
import androidx.p182p.C3933ap;
import androidx.p182p.C3966s;
import androidx.p182p.p185c.C3940b;
import androidx.p186q.p187a.C4057l;
import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;

/* renamed from: androidx.work.impl.b.p */
/* compiled from: PG */
public final class C4507p implements C4503l {

    /* renamed from: a */
    public final C3925ah f14265a;

    /* renamed from: b */
    public final C3933ap f14266b;

    /* renamed from: c */
    private final C3966s f14267c;

    /* renamed from: d */
    private final C3933ap f14268d;

    public C4507p(C3925ah ahVar) {
        this.f14265a = ahVar;
        this.f14267c = new C4504m(ahVar);
        this.f14266b = new C4505n(ahVar);
        this.f14268d = new C4506o(ahVar);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v2, resolved type: androidx.work.impl.b.k} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v3, resolved type: java.lang.String} */
    /* JADX WARNING: type inference failed for: r2v1 */
    /* JADX WARNING: type inference failed for: r2v4 */
    /* JADX WARNING: type inference failed for: r2v6 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final androidx.work.impl.p207b.C4502k mo9462a(androidx.work.impl.p207b.C4509r r7) {
        /*
            r6 = this;
            java.lang.String r0 = r7.f14269a
            int r7 = r7.f14270b
            java.util.TreeMap r1 = androidx.p182p.C3930am.f12576a
            java.lang.String r1 = "SELECT * FROM SystemIdInfo WHERE work_spec_id=? AND generation=?"
            r2 = 2
            androidx.p.am r1 = androidx.p182p.C3929al.m11267a(r1, r2)
            r3 = 1
            if (r0 != 0) goto L_0x0015
            int[] r0 = r1.f12582g
            r0[r3] = r3
            goto L_0x0018
        L_0x0015:
            r1.mo8206g(r3, r0)
        L_0x0018:
            long r3 = (long) r7
            r1.mo8204e(r2, r3)
            androidx.p.ah r7 = r6.f14265a
            r7.mo8175S()
            androidx.p.ah r7 = r6.f14265a
            r0 = 0
            r2 = 0
            android.database.Cursor r7 = androidx.p182p.p185c.C3940b.m11293a(r7, r1, r0, r2)
            java.lang.String r0 = "work_spec_id"
            int r0 = androidx.p182p.p185c.C3939a.m11292b(r7, r0)     // Catch:{ all -> 0x0061 }
            java.lang.String r3 = "generation"
            int r3 = androidx.p182p.p185c.C3939a.m11292b(r7, r3)     // Catch:{ all -> 0x0061 }
            java.lang.String r4 = "system_id"
            int r4 = androidx.p182p.p185c.C3939a.m11292b(r7, r4)     // Catch:{ all -> 0x0061 }
            boolean r5 = r7.moveToFirst()     // Catch:{ all -> 0x0061 }
            if (r5 == 0) goto L_0x005a
            boolean r5 = r7.isNull(r0)     // Catch:{ all -> 0x0061 }
            if (r5 == 0) goto L_0x0048
            goto L_0x004c
        L_0x0048:
            java.lang.String r2 = r7.getString(r0)     // Catch:{ all -> 0x0061 }
        L_0x004c:
            int r0 = r7.getInt(r3)     // Catch:{ all -> 0x0061 }
            int r3 = r7.getInt(r4)     // Catch:{ all -> 0x0061 }
            androidx.work.impl.b.k r4 = new androidx.work.impl.b.k     // Catch:{ all -> 0x0061 }
            r4.<init>(r2, r0, r3)     // Catch:{ all -> 0x0061 }
            r2 = r4
        L_0x005a:
            r7.close()
            r1.mo8207h()
            return r2
        L_0x0061:
            r0 = move-exception
            r7.close()
            r1.mo8207h()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.work.impl.p207b.C4507p.mo9462a(androidx.work.impl.b.r):androidx.work.impl.b.k");
    }

    /* renamed from: b */
    public final List mo9463b() {
        String str;
        TreeMap treeMap = C3930am.f12576a;
        C3930am a = C3929al.m11267a("SELECT DISTINCT work_spec_id FROM SystemIdInfo", 0);
        this.f14265a.mo8175S();
        Cursor a2 = C3940b.m11293a(this.f14265a, a, false, (CancellationSignal) null);
        try {
            ArrayList arrayList = new ArrayList(a2.getCount());
            while (a2.moveToNext()) {
                if (a2.isNull(0)) {
                    str = null;
                } else {
                    str = a2.getString(0);
                }
                arrayList.add(str);
            }
            return arrayList;
        } finally {
            a2.close();
            a.mo8207h();
        }
    }

    /* renamed from: c */
    public final void mo9464c(C4502k kVar) {
        this.f14265a.mo8175S();
        this.f14265a.mo8181p();
        try {
            this.f14267c.mo8308c(kVar);
            this.f14265a.mo8188w();
        } finally {
            this.f14265a.mo8183r();
        }
    }

    /* renamed from: d */
    public final void mo9465d(C4509r rVar) {
        String str = rVar.f14269a;
        int i = rVar.f14270b;
        this.f14265a.mo8175S();
        C4057l d = this.f14266b.mo8212d();
        if (str == null) {
            d.mo8205f(1);
        } else {
            d.mo8206g(1, str);
        }
        d.mo8204e(2, (long) i);
        this.f14265a.mo8181p();
        try {
            d.mo8256a();
            this.f14265a.mo8188w();
        } finally {
            this.f14265a.mo8183r();
            this.f14266b.mo8215g(d);
        }
    }

    /* renamed from: e */
    public final void mo9466e(String str) {
        this.f14265a.mo8175S();
        C4057l d = this.f14268d.mo8212d();
        if (str == null) {
            d.mo8205f(1);
        } else {
            d.mo8206g(1, str);
        }
        this.f14265a.mo8181p();
        try {
            d.mo8256a();
            this.f14265a.mo8188w();
        } finally {
            this.f14265a.mo8183r();
            this.f14268d.mo8215g(d);
        }
    }
}
