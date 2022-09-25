package com.google.android.gms.measurement.internal;

import androidx.p060c.C0977g;
import com.google.android.gms.common.internal.C143919bh;
import com.google.android.gms.measurement.p10848a.C145124ab;
import com.google.android.gms.measurement.p10848a.C145137ao;
import com.google.android.gms.measurement.p10848a.C145138ap;
import com.google.android.gms.measurement.p10848a.C145140ar;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import p5304e.p5305a.p5306a.p5390n.p5405h.p5406a.C68928v;

/* renamed from: com.google.android.gms.measurement.internal.w */
/* compiled from: PG */
final class C145507w extends C145478jo {

    /* renamed from: a */
    private String f393425a;

    /* renamed from: b */
    private Set f393426b;

    /* renamed from: c */
    private Map f393427c;

    /* renamed from: d */
    private Long f393428d;

    /* renamed from: e */
    private Long f393429e;

    public C145507w(C145488jy jyVar) {
        super(jyVar);
    }

    /* renamed from: d */
    private final C145502r m236567d(Integer num) {
        if (this.f393427c.containsKey(num)) {
            return (C145502r) this.f393427c.get(num);
        }
        C145502r rVar = new C145502r(this, this.f393425a);
        this.f393427c.put(num, rVar);
        return rVar;
    }

    /* renamed from: e */
    private final boolean m236568e(int i, int i2) {
        C145502r rVar = (C145502r) this.f393427c.get(Integer.valueOf(i));
        if (rVar == null) {
            return false;
        }
        return rVar.f393405c.get(i2);
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:126:0x02d6, code lost:
        if (r5 != null) goto L_0x02d8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:127:0x02d8, code lost:
        r5.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:130:0x02e0, code lost:
        if (r5 != null) goto L_0x02d8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:139:0x0301, code lost:
        if (r5 != null) goto L_0x02d8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:140:0x0304, code lost:
        r0 = mo121310b(r1, r0, r12);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:264:0x0637, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:265:0x0638, code lost:
        r65 = r2;
        r66 = r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:267:0x063f, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:268:0x0640, code lost:
        r5 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:269:0x0642, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:270:0x0643, code lost:
        r65 = r2;
        r66 = r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:275:0x065f, code lost:
        r2.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:332:0x07d8, code lost:
        if (r10 != null) goto L_0x07da;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:333:0x07da, code lost:
        r10.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:341:0x07f8, code lost:
        if (r10 != null) goto L_0x07da;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:389:0x0953, code lost:
        if ((r8.f392361a & 1) == 0) goto L_0x095c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:390:0x0955, code lost:
        r8 = java.lang.Integer.valueOf(r8.f392362b);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:391:0x095c, code lost:
        r8 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:392:0x095d, code lost:
        r1.mo120896c("Invalid property filter ID. appId, id", r7, java.lang.String.valueOf(r8));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x0163, code lost:
        if (r5 != null) goto L_0x0165;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x0165, code lost:
        r5.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x0185, code lost:
        if (r5 != null) goto L_0x0165;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:108:0x0259  */
    /* JADX WARNING: Removed duplicated region for block: B:113:0x026c  */
    /* JADX WARNING: Removed duplicated region for block: B:142:0x030b  */
    /* JADX WARNING: Removed duplicated region for block: B:211:0x04ba  */
    /* JADX WARNING: Removed duplicated region for block: B:267:0x063f A[ExcHandler: all (th java.lang.Throwable), Splitter:B:223:0x0593] */
    /* JADX WARNING: Removed duplicated region for block: B:275:0x065f  */
    /* JADX WARNING: Removed duplicated region for block: B:280:0x066a  */
    /* JADX WARNING: Removed duplicated region for block: B:286:0x0682  */
    /* JADX WARNING: Removed duplicated region for block: B:303:0x071a  */
    /* JADX WARNING: Removed duplicated region for block: B:346:0x0803  */
    /* JADX WARNING: Removed duplicated region for block: B:400:0x0993  */
    /* JADX WARNING: Removed duplicated region for block: B:440:0x0b1c  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x018a  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x01c9 A[Catch:{ SQLiteException -> 0x0236 }] */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x01d7 A[SYNTHETIC, Splitter:B:80:0x01d7] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.List mo121309a(java.lang.String r65, java.util.List r66, java.util.List r67, java.lang.Long r68, java.lang.Long r69) {
        /*
            r64 = this;
            r9 = r64
            java.lang.String r10 = "current_results"
            com.google.android.gms.common.internal.C143919bh.m233969l(r65)
            com.google.android.gms.common.internal.C143919bh.m233958a(r66)
            com.google.android.gms.common.internal.C143919bh.m233958a(r67)
            r0 = r65
            r9.f393425a = r0
            java.util.HashSet r0 = new java.util.HashSet
            r0.<init>()
            r9.f393426b = r0
            androidx.c.g r0 = new androidx.c.g
            r0.<init>()
            r9.f393427c = r0
            r0 = r68
            r9.f393428d = r0
            r0 = r69
            r9.f393429e = r0
            java.util.Iterator r0 = r66.iterator()
        L_0x002b:
            boolean r1 = r0.hasNext()
            r11 = 0
            r12 = 1
            if (r1 == 0) goto L_0x0045
            java.lang.Object r1 = r0.next()
            com.google.android.gms.measurement.a.ad r1 = (com.google.android.gms.measurement.p10848a.C145126ad) r1
            java.lang.String r1 = r1.f392215c
            java.lang.String r2 = "_s"
            boolean r1 = r2.equals(r1)
            if (r1 == 0) goto L_0x002b
            r1 = 1
            goto L_0x0046
        L_0x0045:
            r1 = 0
        L_0x0046:
            boolean r0 = p5304e.p5305a.p5306a.p5390n.p5405h.p5406a.C68925s.m99952c()
            if (r0 == 0) goto L_0x005c
            com.google.android.gms.measurement.internal.ff r0 = r9.f393011w
            com.google.android.gms.measurement.internal.ab r0 = r0.f392937g
            java.lang.String r2 = r9.f393425a
            com.google.android.gms.measurement.internal.dk r3 = com.google.android.gms.measurement.internal.C145313dl.f392716W
            boolean r0 = r0.mo120776m(r2, r3)
            if (r0 == 0) goto L_0x005c
            r13 = 1
            goto L_0x005d
        L_0x005c:
            r13 = 0
        L_0x005d:
            boolean r0 = p5304e.p5305a.p5306a.p5390n.p5405h.p5406a.C68925s.m99952c()
            if (r0 == 0) goto L_0x0073
            com.google.android.gms.measurement.internal.ff r0 = r9.f393011w
            com.google.android.gms.measurement.internal.ab r0 = r0.f392937g
            java.lang.String r2 = r9.f393425a
            com.google.android.gms.measurement.internal.dk r3 = com.google.android.gms.measurement.internal.C145313dl.f392715V
            boolean r0 = r0.mo120776m(r2, r3)
            if (r0 == 0) goto L_0x0073
            r14 = 1
            goto L_0x0074
        L_0x0073:
            r14 = 0
        L_0x0074:
            if (r1 == 0) goto L_0x00b8
            com.google.android.gms.measurement.internal.jy r0 = r9.f393327l
            com.google.android.gms.measurement.internal.ah r2 = r0.f393355c
            com.google.android.gms.measurement.internal.C145488jy.m236409I(r2)
            java.lang.String r3 = r9.f393425a
            r2.mo121194J()
            r2.mo120904g()
            com.google.android.gms.common.internal.C143919bh.m233969l(r3)
            android.content.ContentValues r0 = new android.content.ContentValues
            r0.<init>()
            java.lang.String r4 = "current_session_count"
            java.lang.Integer r5 = java.lang.Integer.valueOf(r11)
            r0.put(r4, r5)
            android.database.sqlite.SQLiteDatabase r4 = r2.mo120806d()     // Catch:{ SQLiteException -> 0x00a6 }
            java.lang.String[] r5 = new java.lang.String[r12]     // Catch:{ SQLiteException -> 0x00a6 }
            r5[r11] = r3     // Catch:{ SQLiteException -> 0x00a6 }
            java.lang.String r6 = "events"
            java.lang.String r7 = "app_id = ?"
            r4.update(r6, r0, r7, r5)     // Catch:{ SQLiteException -> 0x00a6 }
            goto L_0x00b8
        L_0x00a6:
            r0 = move-exception
            com.google.android.gms.measurement.internal.ff r2 = r2.f393011w
            com.google.android.gms.measurement.internal.dx r2 = r2.mo120965ar()
            com.google.android.gms.measurement.internal.dv r2 = r2.f392795c
            java.lang.String r4 = "Error resetting session-scoped event counts. appId"
            java.lang.Object r3 = com.google.android.gms.measurement.internal.C145325dx.m236116a(r3)
            r2.mo120896c(r4, r3, r0)
        L_0x00b8:
            java.util.Map r0 = java.util.Collections.emptyMap()
            java.lang.String r15 = "Failed to merge filter. appId"
            java.lang.String r8 = "Database error querying filters. appId"
            java.lang.String r16 = "data"
            java.lang.String r7 = "audience_id"
            r6 = 2
            if (r14 == 0) goto L_0x018e
            if (r13 == 0) goto L_0x018e
            com.google.android.gms.measurement.internal.jy r0 = r9.f393327l
            com.google.android.gms.measurement.internal.ah r2 = r0.f393355c
            com.google.android.gms.measurement.internal.C145488jy.m236409I(r2)
            java.lang.String r3 = r9.f393425a
            com.google.android.gms.common.internal.C143919bh.m233969l(r3)
            androidx.c.g r4 = new androidx.c.g
            r4.<init>()
            android.database.sqlite.SQLiteDatabase r17 = r2.mo120806d()
            java.lang.String[] r0 = new java.lang.String[r6]     // Catch:{ SQLiteException -> 0x0170, all -> 0x016d }
            r0[r11] = r7     // Catch:{ SQLiteException -> 0x0170, all -> 0x016d }
            r0[r12] = r16     // Catch:{ SQLiteException -> 0x0170, all -> 0x016d }
            java.lang.String[] r5 = new java.lang.String[r12]     // Catch:{ SQLiteException -> 0x0170, all -> 0x016d }
            r5[r11] = r3     // Catch:{ SQLiteException -> 0x0170, all -> 0x016d }
            java.lang.String r18 = "event_filters"
            java.lang.String r20 = "app_id=?"
            r22 = 0
            r23 = 0
            r24 = 0
            r19 = r0
            r21 = r5
            android.database.Cursor r5 = r17.query(r18, r19, r20, r21, r22, r23, r24)     // Catch:{ SQLiteException -> 0x0170, all -> 0x016d }
            boolean r0 = r5.moveToFirst()     // Catch:{ SQLiteException -> 0x016b }
            if (r0 == 0) goto L_0x015f
        L_0x0100:
            byte[] r0 = r5.getBlob(r12)     // Catch:{ SQLiteException -> 0x016b }
            com.google.android.gms.measurement.a.d r17 = com.google.android.gms.measurement.p10848a.C145155d.f392333i     // Catch:{ IOException -> 0x013f }
            com.google.protobuf.bn r17 = r17.createBuilder()     // Catch:{ IOException -> 0x013f }
            r12 = r17
            com.google.android.gms.measurement.a.c r12 = (com.google.android.gms.measurement.p10848a.C145154c) r12     // Catch:{ IOException -> 0x013f }
            com.google.protobuf.ds r0 = com.google.android.gms.measurement.internal.C145491ka.m236458k(r12, r0)     // Catch:{ IOException -> 0x013f }
            com.google.android.gms.measurement.a.c r0 = (com.google.android.gms.measurement.p10848a.C145154c) r0     // Catch:{ IOException -> 0x013f }
            com.google.protobuf.bv r0 = r0.build()     // Catch:{ IOException -> 0x013f }
            com.google.android.gms.measurement.a.d r0 = (com.google.android.gms.measurement.p10848a.C145155d) r0     // Catch:{ IOException -> 0x013f }
            int r12 = r0.f392335a     // Catch:{ SQLiteException -> 0x016b }
            r12 = r12 & 8
            if (r12 == 0) goto L_0x014f
            int r12 = r5.getInt(r11)     // Catch:{ SQLiteException -> 0x016b }
            java.lang.Integer r12 = java.lang.Integer.valueOf(r12)     // Catch:{ SQLiteException -> 0x016b }
            java.lang.Object r17 = r4.get(r12)     // Catch:{ SQLiteException -> 0x016b }
            java.util.List r17 = (java.util.List) r17     // Catch:{ SQLiteException -> 0x016b }
            if (r17 != 0) goto L_0x0139
            java.util.ArrayList r11 = new java.util.ArrayList     // Catch:{ SQLiteException -> 0x016b }
            r11.<init>()     // Catch:{ SQLiteException -> 0x016b }
            r4.put(r12, r11)     // Catch:{ SQLiteException -> 0x016b }
            goto L_0x013b
        L_0x0139:
            r11 = r17
        L_0x013b:
            r11.add(r0)     // Catch:{ SQLiteException -> 0x016b }
            goto L_0x014f
        L_0x013f:
            r0 = move-exception
            com.google.android.gms.measurement.internal.ff r11 = r2.f393011w     // Catch:{ SQLiteException -> 0x016b }
            com.google.android.gms.measurement.internal.dx r11 = r11.mo120965ar()     // Catch:{ SQLiteException -> 0x016b }
            com.google.android.gms.measurement.internal.dv r11 = r11.f392795c     // Catch:{ SQLiteException -> 0x016b }
            java.lang.Object r12 = com.google.android.gms.measurement.internal.C145325dx.m236116a(r3)     // Catch:{ SQLiteException -> 0x016b }
            r11.mo120896c(r15, r12, r0)     // Catch:{ SQLiteException -> 0x016b }
        L_0x014f:
            boolean r0 = r5.moveToNext()     // Catch:{ SQLiteException -> 0x016b }
            if (r0 != 0) goto L_0x015c
            if (r5 == 0) goto L_0x015a
            r5.close()
        L_0x015a:
            r11 = r4
            goto L_0x018f
        L_0x015c:
            r11 = 0
            r12 = 1
            goto L_0x0100
        L_0x015f:
            java.util.Map r0 = java.util.Collections.emptyMap()     // Catch:{ SQLiteException -> 0x016b }
            if (r5 == 0) goto L_0x018e
        L_0x0165:
            r5.close()
            goto L_0x018e
        L_0x0169:
            r0 = move-exception
            goto L_0x0188
        L_0x016b:
            r0 = move-exception
            goto L_0x0172
        L_0x016d:
            r0 = move-exception
            r5 = 0
            goto L_0x0188
        L_0x0170:
            r0 = move-exception
            r5 = 0
        L_0x0172:
            com.google.android.gms.measurement.internal.ff r2 = r2.f393011w     // Catch:{ all -> 0x0169 }
            com.google.android.gms.measurement.internal.dx r2 = r2.mo120965ar()     // Catch:{ all -> 0x0169 }
            com.google.android.gms.measurement.internal.dv r2 = r2.f392795c     // Catch:{ all -> 0x0169 }
            java.lang.Object r3 = com.google.android.gms.measurement.internal.C145325dx.m236116a(r3)     // Catch:{ all -> 0x0169 }
            r2.mo120896c(r8, r3, r0)     // Catch:{ all -> 0x0169 }
            java.util.Map r0 = java.util.Collections.emptyMap()     // Catch:{ all -> 0x0169 }
            if (r5 == 0) goto L_0x018e
            goto L_0x0165
        L_0x0188:
            if (r5 == 0) goto L_0x018d
            r5.close()
        L_0x018d:
            throw r0
        L_0x018e:
            r11 = r0
        L_0x018f:
            com.google.android.gms.measurement.internal.jy r0 = r9.f393327l
            com.google.android.gms.measurement.internal.ah r2 = r0.f393355c
            com.google.android.gms.measurement.internal.C145488jy.m236409I(r2)
            java.lang.String r3 = r9.f393425a
            r2.mo121194J()
            r2.mo120904g()
            com.google.android.gms.common.internal.C143919bh.m233969l(r3)
            android.database.sqlite.SQLiteDatabase r17 = r2.mo120806d()
            java.lang.String[] r0 = new java.lang.String[r6]     // Catch:{ SQLiteException -> 0x023e, all -> 0x023a }
            r4 = 0
            r0[r4] = r7     // Catch:{ SQLiteException -> 0x023e, all -> 0x023a }
            r5 = 1
            r0[r5] = r10     // Catch:{ SQLiteException -> 0x023e, all -> 0x023a }
            java.lang.String[] r12 = new java.lang.String[r5]     // Catch:{ SQLiteException -> 0x023e, all -> 0x023a }
            r12[r4] = r3     // Catch:{ SQLiteException -> 0x023e, all -> 0x023a }
            java.lang.String r18 = "audience_filter_values"
            java.lang.String r20 = "app_id=?"
            r22 = 0
            r23 = 0
            r24 = 0
            r19 = r0
            r21 = r12
            android.database.Cursor r4 = r17.query(r18, r19, r20, r21, r22, r23, r24)     // Catch:{ SQLiteException -> 0x023e, all -> 0x023a }
            boolean r0 = r4.moveToFirst()     // Catch:{ SQLiteException -> 0x0236 }
            if (r0 != 0) goto L_0x01d7
            java.util.Map r0 = java.util.Collections.emptyMap()     // Catch:{ SQLiteException -> 0x0236 }
            if (r4 == 0) goto L_0x01d2
            r4.close()
        L_0x01d2:
            r12 = r0
            r20 = r7
            goto L_0x025d
        L_0x01d7:
            androidx.c.g r5 = new androidx.c.g     // Catch:{ SQLiteException -> 0x0236 }
            r5.<init>()     // Catch:{ SQLiteException -> 0x0236 }
        L_0x01dc:
            r12 = 0
            int r17 = r4.getInt(r12)     // Catch:{ SQLiteException -> 0x0236 }
            r12 = 1
            byte[] r0 = r4.getBlob(r12)     // Catch:{ SQLiteException -> 0x0236 }
            com.google.android.gms.measurement.a.ap r12 = com.google.android.gms.measurement.p10848a.C145138ap.f392285e     // Catch:{ IOException -> 0x0206 }
            com.google.protobuf.bn r12 = r12.createBuilder()     // Catch:{ IOException -> 0x0206 }
            com.google.android.gms.measurement.a.ao r12 = (com.google.android.gms.measurement.p10848a.C145137ao) r12     // Catch:{ IOException -> 0x0206 }
            com.google.protobuf.ds r0 = com.google.android.gms.measurement.internal.C145491ka.m236458k(r12, r0)     // Catch:{ IOException -> 0x0206 }
            com.google.android.gms.measurement.a.ao r0 = (com.google.android.gms.measurement.p10848a.C145137ao) r0     // Catch:{ IOException -> 0x0206 }
            com.google.protobuf.bv r0 = r0.build()     // Catch:{ IOException -> 0x0206 }
            com.google.android.gms.measurement.a.ap r0 = (com.google.android.gms.measurement.p10848a.C145138ap) r0     // Catch:{ IOException -> 0x0206 }
            java.lang.Integer r12 = java.lang.Integer.valueOf(r17)     // Catch:{ SQLiteException -> 0x0236 }
            r5.put(r12, r0)     // Catch:{ SQLiteException -> 0x0236 }
            r19 = r5
            r20 = r7
            goto L_0x0220
        L_0x0206:
            r0 = move-exception
            com.google.android.gms.measurement.internal.ff r12 = r2.f393011w     // Catch:{ SQLiteException -> 0x0236 }
            com.google.android.gms.measurement.internal.dx r12 = r12.mo120965ar()     // Catch:{ SQLiteException -> 0x0236 }
            com.google.android.gms.measurement.internal.dv r12 = r12.f392795c     // Catch:{ SQLiteException -> 0x0236 }
            java.lang.String r6 = "Failed to merge filter results. appId, audienceId, error"
            r19 = r5
            java.lang.Object r5 = com.google.android.gms.measurement.internal.C145325dx.m236116a(r3)     // Catch:{ SQLiteException -> 0x0236 }
            r20 = r7
            java.lang.Integer r7 = java.lang.Integer.valueOf(r17)     // Catch:{ SQLiteException -> 0x0234 }
            r12.mo120897d(r6, r5, r7, r0)     // Catch:{ SQLiteException -> 0x0234 }
        L_0x0220:
            boolean r0 = r4.moveToNext()     // Catch:{ SQLiteException -> 0x0234 }
            if (r0 != 0) goto L_0x022e
            if (r4 == 0) goto L_0x022b
            r4.close()
        L_0x022b:
            r12 = r19
            goto L_0x025d
        L_0x022e:
            r5 = r19
            r7 = r20
            r6 = 2
            goto L_0x01dc
        L_0x0234:
            r0 = move-exception
            goto L_0x0242
        L_0x0236:
            r0 = move-exception
            r20 = r7
            goto L_0x0242
        L_0x023a:
            r0 = move-exception
            r5 = 0
            goto L_0x0b1a
        L_0x023e:
            r0 = move-exception
            r20 = r7
            r4 = 0
        L_0x0242:
            com.google.android.gms.measurement.internal.ff r2 = r2.f393011w     // Catch:{ all -> 0x0b18 }
            com.google.android.gms.measurement.internal.dx r2 = r2.mo120965ar()     // Catch:{ all -> 0x0b18 }
            com.google.android.gms.measurement.internal.dv r2 = r2.f392795c     // Catch:{ all -> 0x0b18 }
            java.lang.String r5 = "Database error querying filter results. appId"
            java.lang.Object r3 = com.google.android.gms.measurement.internal.C145325dx.m236116a(r3)     // Catch:{ all -> 0x0b18 }
            r2.mo120896c(r5, r3, r0)     // Catch:{ all -> 0x0b18 }
            java.util.Map r0 = java.util.Collections.emptyMap()     // Catch:{ all -> 0x0b18 }
            if (r4 == 0) goto L_0x025c
            r4.close()
        L_0x025c:
            r12 = r0
        L_0x025d:
            boolean r0 = r12.isEmpty()
            if (r0 == 0) goto L_0x026c
        L_0x0263:
            r29 = r8
            r23 = r10
            r28 = r20
            r11 = 2
            goto L_0x04ae
        L_0x026c:
            java.util.HashSet r2 = new java.util.HashSet
            java.util.Set r0 = r12.keySet()
            r2.<init>(r0)
            if (r1 == 0) goto L_0x030f
            java.lang.String r1 = r9.f393425a
            com.google.android.gms.measurement.internal.jy r0 = r9.f393327l
            com.google.android.gms.measurement.internal.ah r3 = r0.f393355c
            com.google.android.gms.measurement.internal.C145488jy.m236409I(r3)
            java.lang.String r4 = r9.f393425a
            r3.mo121194J()
            r3.mo120904g()
            com.google.android.gms.common.internal.C143919bh.m233969l(r4)
            androidx.c.g r0 = new androidx.c.g
            r0.<init>()
            android.database.sqlite.SQLiteDatabase r5 = r3.mo120806d()
            r6 = 2
            java.lang.String[] r7 = new java.lang.String[r6]     // Catch:{ SQLiteException -> 0x02ea, all -> 0x02e7 }
            r17 = 0
            r7[r17] = r4     // Catch:{ SQLiteException -> 0x02ea, all -> 0x02e7 }
            r17 = 1
            r7[r17] = r4     // Catch:{ SQLiteException -> 0x02ea, all -> 0x02e7 }
            java.lang.String r6 = "select audience_id, filter_id from event_filters where app_id = ? and session_scoped = 1 UNION select audience_id, filter_id from property_filters where app_id = ? and session_scoped = 1;"
            android.database.Cursor r5 = r5.rawQuery(r6, r7)     // Catch:{ SQLiteException -> 0x02ea, all -> 0x02e7 }
            boolean r6 = r5.moveToFirst()     // Catch:{ SQLiteException -> 0x02e5 }
            if (r6 == 0) goto L_0x02dc
        L_0x02ab:
            r6 = 0
            int r7 = r5.getInt(r6)     // Catch:{ SQLiteException -> 0x02e5 }
            java.lang.Integer r6 = java.lang.Integer.valueOf(r7)     // Catch:{ SQLiteException -> 0x02e5 }
            java.lang.Object r7 = r0.get(r6)     // Catch:{ SQLiteException -> 0x02e5 }
            java.util.List r7 = (java.util.List) r7     // Catch:{ SQLiteException -> 0x02e5 }
            if (r7 != 0) goto L_0x02c4
            java.util.ArrayList r7 = new java.util.ArrayList     // Catch:{ SQLiteException -> 0x02e5 }
            r7.<init>()     // Catch:{ SQLiteException -> 0x02e5 }
            r0.put(r6, r7)     // Catch:{ SQLiteException -> 0x02e5 }
        L_0x02c4:
            r6 = 1
            int r17 = r5.getInt(r6)     // Catch:{ SQLiteException -> 0x02e5 }
            java.lang.Integer r6 = java.lang.Integer.valueOf(r17)     // Catch:{ SQLiteException -> 0x02e5 }
            r7.add(r6)     // Catch:{ SQLiteException -> 0x02e5 }
            boolean r6 = r5.moveToNext()     // Catch:{ SQLiteException -> 0x02e5 }
            if (r6 != 0) goto L_0x02ab
            if (r5 == 0) goto L_0x0304
        L_0x02d8:
            r5.close()
            goto L_0x0304
        L_0x02dc:
            java.util.Map r0 = java.util.Collections.emptyMap()     // Catch:{ SQLiteException -> 0x02e5 }
            if (r5 == 0) goto L_0x0304
            goto L_0x02d8
        L_0x02e3:
            r0 = move-exception
            goto L_0x0309
        L_0x02e5:
            r0 = move-exception
            goto L_0x02ec
        L_0x02e7:
            r0 = move-exception
            r5 = 0
            goto L_0x0309
        L_0x02ea:
            r0 = move-exception
            r5 = 0
        L_0x02ec:
            com.google.android.gms.measurement.internal.ff r3 = r3.f393011w     // Catch:{ all -> 0x02e3 }
            com.google.android.gms.measurement.internal.dx r3 = r3.mo120965ar()     // Catch:{ all -> 0x02e3 }
            com.google.android.gms.measurement.internal.dv r3 = r3.f392795c     // Catch:{ all -> 0x02e3 }
            java.lang.String r6 = "Database error querying scoped filters. appId"
            java.lang.Object r4 = com.google.android.gms.measurement.internal.C145325dx.m236116a(r4)     // Catch:{ all -> 0x02e3 }
            r3.mo120896c(r6, r4, r0)     // Catch:{ all -> 0x02e3 }
            java.util.Map r0 = java.util.Collections.emptyMap()     // Catch:{ all -> 0x02e3 }
            if (r5 == 0) goto L_0x0304
            goto L_0x02d8
        L_0x0304:
            java.util.Map r0 = r9.mo121310b(r1, r0, r12)
            goto L_0x0310
        L_0x0309:
            if (r5 == 0) goto L_0x030e
            r5.close()
        L_0x030e:
            throw r0
        L_0x030f:
            r0 = r12
        L_0x0310:
            java.util.Iterator r17 = r2.iterator()
        L_0x0314:
            boolean r1 = r17.hasNext()
            if (r1 == 0) goto L_0x0263
            java.lang.Object r1 = r17.next()
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r19 = r1.intValue()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r19)
            java.lang.Object r1 = r0.get(r1)
            com.google.android.gms.measurement.a.ap r1 = (com.google.android.gms.measurement.p10848a.C145138ap) r1
            java.util.BitSet r5 = new java.util.BitSet
            r5.<init>()
            java.util.BitSet r6 = new java.util.BitSet
            r6.<init>()
            androidx.c.g r7 = new androidx.c.g
            r7.<init>()
            if (r1 == 0) goto L_0x037a
            com.google.protobuf.cq r2 = r1.f392289c
            int r2 = r2.size()
            if (r2 != 0) goto L_0x0348
            goto L_0x037a
        L_0x0348:
            com.google.protobuf.cq r2 = r1.f392289c
            java.util.Iterator r2 = r2.iterator()
        L_0x034e:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x037a
            java.lang.Object r3 = r2.next()
            com.google.android.gms.measurement.a.ab r3 = (com.google.android.gms.measurement.p10848a.C145124ab) r3
            int r4 = r3.f392208a
            r21 = r4 & 1
            if (r21 == 0) goto L_0x034e
            r21 = r0
            int r0 = r3.f392209b
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r4 = r4 & 2
            if (r4 == 0) goto L_0x0373
            long r3 = r3.f392210c
            java.lang.Long r3 = java.lang.Long.valueOf(r3)
            goto L_0x0374
        L_0x0373:
            r3 = 0
        L_0x0374:
            r7.put(r0, r3)
            r0 = r21
            goto L_0x034e
        L_0x037a:
            r21 = r0
            androidx.c.g r0 = new androidx.c.g
            r0.<init>()
            if (r1 == 0) goto L_0x03ce
            com.google.protobuf.cq r2 = r1.f392290d
            int r2 = r2.size()
            if (r2 != 0) goto L_0x038c
            goto L_0x03ce
        L_0x038c:
            com.google.protobuf.cq r2 = r1.f392290d
            java.util.Iterator r2 = r2.iterator()
        L_0x0392:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x03ce
            java.lang.Object r3 = r2.next()
            com.google.android.gms.measurement.a.ar r3 = (com.google.android.gms.measurement.p10848a.C145140ar) r3
            int r4 = r3.f392293a
            r22 = 1
            r4 = r4 & 1
            if (r4 == 0) goto L_0x0392
            com.google.protobuf.ck r4 = r3.f392295c
            int r4 = r4.size()
            if (r4 <= 0) goto L_0x0392
            int r4 = r3.f392294b
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r22 = r2
            com.google.protobuf.ck r2 = r3.f392295c
            int r2 = r2.size()
            com.google.protobuf.ck r3 = r3.f392295c
            int r2 = r2 + -1
            long r2 = r3.mo58927a(r2)
            java.lang.Long r2 = java.lang.Long.valueOf(r2)
            r0.put(r4, r2)
            r2 = r22
            goto L_0x0392
        L_0x03ce:
            if (r1 == 0) goto L_0x041d
            r2 = 0
        L_0x03d1:
            com.google.protobuf.ck r3 = r1.f392287a
            int r3 = r3.size()
            int r3 = r3 * 64
            if (r2 >= r3) goto L_0x041d
            com.google.protobuf.ck r3 = r1.f392287a
            boolean r3 = com.google.android.gms.measurement.internal.C145491ka.m236460t(r3, r2)
            if (r3 == 0) goto L_0x040b
            com.google.android.gms.measurement.internal.ff r3 = r9.f393011w
            com.google.android.gms.measurement.internal.dx r3 = r3.mo120965ar()
            com.google.android.gms.measurement.internal.dv r3 = r3.f392803k
            java.lang.Integer r4 = java.lang.Integer.valueOf(r19)
            r22 = r8
            java.lang.Integer r8 = java.lang.Integer.valueOf(r2)
            r23 = r10
            java.lang.String r10 = "Filter already evaluated. audience ID, filter ID"
            r3.mo120896c(r10, r4, r8)
            r6.set(r2)
            com.google.protobuf.ck r3 = r1.f392288b
            boolean r3 = com.google.android.gms.measurement.internal.C145491ka.m236460t(r3, r2)
            if (r3 == 0) goto L_0x040f
            r5.set(r2)
            goto L_0x0416
        L_0x040b:
            r22 = r8
            r23 = r10
        L_0x040f:
            java.lang.Integer r3 = java.lang.Integer.valueOf(r2)
            r7.remove(r3)
        L_0x0416:
            int r2 = r2 + 1
            r8 = r22
            r10 = r23
            goto L_0x03d1
        L_0x041d:
            r22 = r8
            r23 = r10
            java.lang.Integer r1 = java.lang.Integer.valueOf(r19)
            java.lang.Object r2 = r12.get(r1)
            r4 = r2
            com.google.android.gms.measurement.a.ap r4 = (com.google.android.gms.measurement.p10848a.C145138ap) r4
            if (r14 == 0) goto L_0x0488
            if (r13 == 0) goto L_0x0488
            java.lang.Object r1 = r11.get(r1)
            java.util.List r1 = (java.util.List) r1
            if (r1 == 0) goto L_0x0488
            java.lang.Long r2 = r9.f393429e
            if (r2 == 0) goto L_0x0488
            java.lang.Long r2 = r9.f393428d
            if (r2 != 0) goto L_0x0441
            goto L_0x0488
        L_0x0441:
            java.util.Iterator r1 = r1.iterator()
        L_0x0445:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x0488
            java.lang.Object r2 = r1.next()
            com.google.android.gms.measurement.a.d r2 = (com.google.android.gms.measurement.p10848a.C145155d) r2
            int r3 = r2.f392336b
            java.lang.Long r8 = r9.f393429e
            long r24 = r8.longValue()
            r26 = 1000(0x3e8, double:4.94E-321)
            long r24 = r24 / r26
            boolean r2 = r2.f392341g
            if (r2 == 0) goto L_0x0469
            java.lang.Long r2 = r9.f393428d
            long r24 = r2.longValue()
            long r24 = r24 / r26
        L_0x0469:
            java.lang.Integer r2 = java.lang.Integer.valueOf(r3)
            boolean r3 = r7.containsKey(r2)
            if (r3 == 0) goto L_0x047a
            java.lang.Long r3 = java.lang.Long.valueOf(r24)
            r7.put(r2, r3)
        L_0x047a:
            boolean r3 = r0.containsKey(r2)
            if (r3 == 0) goto L_0x0445
            java.lang.Long r3 = java.lang.Long.valueOf(r24)
            r0.put(r2, r3)
            goto L_0x0445
        L_0x0488:
            com.google.android.gms.measurement.internal.r r10 = new com.google.android.gms.measurement.internal.r
            java.lang.String r3 = r9.f393425a
            r1 = r10
            r2 = r64
            r8 = 0
            r24 = r11
            r11 = 2
            r28 = r20
            r29 = r22
            r8 = r0
            r1.<init>(r2, r3, r4, r5, r6, r7, r8)
            java.util.Map r0 = r9.f393427c
            java.lang.Integer r1 = java.lang.Integer.valueOf(r19)
            r0.put(r1, r10)
            r0 = r21
            r10 = r23
            r11 = r24
            r8 = r29
            goto L_0x0314
        L_0x04ae:
            boolean r0 = r66.isEmpty()
            java.lang.String r1 = "Skipping failed audience ID"
            if (r0 == 0) goto L_0x04ba
        L_0x04b6:
            r12 = r29
            goto L_0x0712
        L_0x04ba:
            com.google.android.gms.measurement.internal.s r2 = new com.google.android.gms.measurement.internal.s
            r2.<init>(r9)
            androidx.c.g r3 = new androidx.c.g
            r3.<init>()
            java.util.Iterator r4 = r66.iterator()
        L_0x04c8:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x04b6
            java.lang.Object r0 = r4.next()
            com.google.android.gms.measurement.a.ad r0 = (com.google.android.gms.measurement.p10848a.C145126ad) r0
            java.lang.String r5 = r9.f393425a
            com.google.android.gms.measurement.a.ad r5 = r2.mo121303a(r5, r0)
            if (r5 == 0) goto L_0x04c8
            com.google.android.gms.measurement.internal.jy r6 = r9.f393327l
            com.google.android.gms.measurement.internal.ah r6 = r6.f393355c
            com.google.android.gms.measurement.internal.C145488jy.m236409I(r6)
            java.lang.String r7 = r9.f393425a
            java.lang.String r8 = r5.f392215c
            java.lang.String r10 = r0.f392215c
            com.google.android.gms.measurement.internal.an r10 = r6.mo120811j(r7, r10)
            if (r10 != 0) goto L_0x052a
            com.google.android.gms.measurement.internal.ff r10 = r6.f393011w
            com.google.android.gms.measurement.internal.dx r10 = r10.mo120965ar()
            com.google.android.gms.measurement.internal.dv r10 = r10.f392798f
            java.lang.Object r12 = com.google.android.gms.measurement.internal.C145325dx.m236116a(r7)
            com.google.android.gms.measurement.internal.ff r6 = r6.f393011w
            com.google.android.gms.measurement.internal.ds r6 = r6.f392942l
            java.lang.String r6 = r6.mo120890c(r8)
            java.lang.String r8 = "Event aggregate wasn't created during raw event logging. appId, event"
            r10.mo120896c(r8, r12, r6)
            com.google.android.gms.measurement.internal.an r6 = new com.google.android.gms.measurement.internal.an
            r30 = r6
            java.lang.String r8 = r0.f392215c
            r32 = r8
            r33 = 1
            r35 = 1
            r37 = 1
            long r12 = r0.f392216d
            r39 = r12
            r41 = 0
            r43 = 0
            r44 = 0
            r45 = 0
            r46 = 0
            r31 = r7
            r30.<init>(r31, r32, r33, r35, r37, r39, r41, r43, r44, r45, r46)
            goto L_0x055f
        L_0x052a:
            com.google.android.gms.measurement.internal.an r6 = new com.google.android.gms.measurement.internal.an
            r47 = r6
            java.lang.String r0 = r10.f392596a
            r48 = r0
            java.lang.String r0 = r10.f392597b
            r49 = r0
            long r7 = r10.f392598c
            r12 = 1
            long r50 = r7 + r12
            long r7 = r10.f392599d
            long r52 = r7 + r12
            long r7 = r10.f392600e
            long r54 = r7 + r12
            long r7 = r10.f392601f
            r56 = r7
            long r7 = r10.f392602g
            r58 = r7
            java.lang.Long r0 = r10.f392603h
            r60 = r0
            java.lang.Long r0 = r10.f392604i
            r61 = r0
            java.lang.Long r0 = r10.f392605j
            r62 = r0
            java.lang.Boolean r0 = r10.f392606k
            r63 = r0
            r47.<init>(r48, r49, r50, r52, r54, r56, r58, r60, r61, r62, r63)
        L_0x055f:
            com.google.android.gms.measurement.internal.jy r0 = r9.f393327l
            com.google.android.gms.measurement.internal.ah r0 = r0.f393355c
            com.google.android.gms.measurement.internal.C145488jy.m236409I(r0)
            r0.mo120826y(r6)
            long r7 = r6.f392598c
            java.lang.String r10 = r5.f392215c
            java.lang.Object r0 = r3.get(r10)
            java.util.Map r0 = (java.util.Map) r0
            if (r0 != 0) goto L_0x066e
            com.google.android.gms.measurement.internal.jy r0 = r9.f393327l
            com.google.android.gms.measurement.internal.ah r12 = r0.f393355c
            com.google.android.gms.measurement.internal.C145488jy.m236409I(r12)
            java.lang.String r13 = r9.f393425a
            r12.mo121194J()
            r12.mo120904g()
            com.google.android.gms.common.internal.C143919bh.m233969l(r13)
            com.google.android.gms.common.internal.C143919bh.m233969l(r10)
            androidx.c.g r14 = new androidx.c.g
            r14.<init>()
            android.database.sqlite.SQLiteDatabase r30 = r12.mo120806d()
            java.lang.String[] r0 = new java.lang.String[r11]     // Catch:{ SQLiteException -> 0x0642, all -> 0x063f }
            r11 = r28
            r17 = 0
            r0[r17] = r11     // Catch:{ SQLiteException -> 0x0637, all -> 0x063f }
            r19 = 1
            r0[r19] = r16     // Catch:{ SQLiteException -> 0x0637, all -> 0x063f }
            r65 = r2
            r66 = r4
            r2 = 2
            java.lang.String[] r4 = new java.lang.String[r2]     // Catch:{ SQLiteException -> 0x0635, all -> 0x063f }
            r4[r17] = r13     // Catch:{ SQLiteException -> 0x0635, all -> 0x063f }
            r4[r19] = r10     // Catch:{ SQLiteException -> 0x0635, all -> 0x063f }
            java.lang.String r31 = "event_filters"
            java.lang.String r33 = "app_id=? AND event_name=?"
            r35 = 0
            r36 = 0
            r37 = 0
            r32 = r0
            r34 = r4
            android.database.Cursor r2 = r30.query(r31, r32, r33, r34, r35, r36, r37)     // Catch:{ SQLiteException -> 0x0635, all -> 0x063f }
            boolean r0 = r2.moveToFirst()     // Catch:{ SQLiteException -> 0x0631 }
            if (r0 == 0) goto L_0x0621
        L_0x05c2:
            r4 = 1
            byte[] r0 = r2.getBlob(r4)     // Catch:{ SQLiteException -> 0x0631 }
            com.google.android.gms.measurement.a.d r4 = com.google.android.gms.measurement.p10848a.C145155d.f392333i     // Catch:{ IOException -> 0x05ff }
            com.google.protobuf.bn r4 = r4.createBuilder()     // Catch:{ IOException -> 0x05ff }
            com.google.android.gms.measurement.a.c r4 = (com.google.android.gms.measurement.p10848a.C145154c) r4     // Catch:{ IOException -> 0x05ff }
            com.google.protobuf.ds r0 = com.google.android.gms.measurement.internal.C145491ka.m236458k(r4, r0)     // Catch:{ IOException -> 0x05ff }
            com.google.android.gms.measurement.a.c r0 = (com.google.android.gms.measurement.p10848a.C145154c) r0     // Catch:{ IOException -> 0x05ff }
            com.google.protobuf.bv r0 = r0.build()     // Catch:{ IOException -> 0x05ff }
            com.google.android.gms.measurement.a.d r0 = (com.google.android.gms.measurement.p10848a.C145155d) r0     // Catch:{ IOException -> 0x05ff }
            r4 = 0
            int r17 = r2.getInt(r4)     // Catch:{ SQLiteException -> 0x0631 }
            java.lang.Integer r4 = java.lang.Integer.valueOf(r17)     // Catch:{ SQLiteException -> 0x0631 }
            java.lang.Object r17 = r14.get(r4)     // Catch:{ SQLiteException -> 0x0631 }
            java.util.List r17 = (java.util.List) r17     // Catch:{ SQLiteException -> 0x0631 }
            if (r17 != 0) goto L_0x05f7
            r28 = r11
            java.util.ArrayList r11 = new java.util.ArrayList     // Catch:{ SQLiteException -> 0x062f }
            r11.<init>()     // Catch:{ SQLiteException -> 0x062f }
            r14.put(r4, r11)     // Catch:{ SQLiteException -> 0x062f }
            goto L_0x05fb
        L_0x05f7:
            r28 = r11
            r11 = r17
        L_0x05fb:
            r11.add(r0)     // Catch:{ SQLiteException -> 0x062f }
            goto L_0x0611
        L_0x05ff:
            r0 = move-exception
            r28 = r11
            com.google.android.gms.measurement.internal.ff r4 = r12.f393011w     // Catch:{ SQLiteException -> 0x062f }
            com.google.android.gms.measurement.internal.dx r4 = r4.mo120965ar()     // Catch:{ SQLiteException -> 0x062f }
            com.google.android.gms.measurement.internal.dv r4 = r4.f392795c     // Catch:{ SQLiteException -> 0x062f }
            java.lang.Object r11 = com.google.android.gms.measurement.internal.C145325dx.m236116a(r13)     // Catch:{ SQLiteException -> 0x062f }
            r4.mo120896c(r15, r11, r0)     // Catch:{ SQLiteException -> 0x062f }
        L_0x0611:
            boolean r0 = r2.moveToNext()     // Catch:{ SQLiteException -> 0x062f }
            if (r0 != 0) goto L_0x061e
            if (r2 == 0) goto L_0x061c
            r2.close()
        L_0x061c:
            r0 = r14
            goto L_0x062c
        L_0x061e:
            r11 = r28
            goto L_0x05c2
        L_0x0621:
            r28 = r11
            java.util.Map r0 = java.util.Collections.emptyMap()     // Catch:{ SQLiteException -> 0x062f }
            if (r2 == 0) goto L_0x062c
            r2.close()
        L_0x062c:
            r12 = r29
            goto L_0x0662
        L_0x062f:
            r0 = move-exception
            goto L_0x0648
        L_0x0631:
            r0 = move-exception
            r28 = r11
            goto L_0x0648
        L_0x0635:
            r0 = move-exception
            goto L_0x063c
        L_0x0637:
            r0 = move-exception
            r65 = r2
            r66 = r4
        L_0x063c:
            r28 = r11
            goto L_0x0647
        L_0x063f:
            r0 = move-exception
            r5 = 0
            goto L_0x0668
        L_0x0642:
            r0 = move-exception
            r65 = r2
            r66 = r4
        L_0x0647:
            r2 = 0
        L_0x0648:
            com.google.android.gms.measurement.internal.ff r4 = r12.f393011w     // Catch:{ all -> 0x0666 }
            com.google.android.gms.measurement.internal.dx r4 = r4.mo120965ar()     // Catch:{ all -> 0x0666 }
            com.google.android.gms.measurement.internal.dv r4 = r4.f392795c     // Catch:{ all -> 0x0666 }
            java.lang.Object r11 = com.google.android.gms.measurement.internal.C145325dx.m236116a(r13)     // Catch:{ all -> 0x0666 }
            r12 = r29
            r4.mo120896c(r12, r11, r0)     // Catch:{ all -> 0x0666 }
            java.util.Map r0 = java.util.Collections.emptyMap()     // Catch:{ all -> 0x0666 }
            if (r2 == 0) goto L_0x0662
            r2.close()
        L_0x0662:
            r3.put(r10, r0)
            goto L_0x0674
        L_0x0666:
            r0 = move-exception
            r5 = r2
        L_0x0668:
            if (r5 == 0) goto L_0x066d
            r5.close()
        L_0x066d:
            throw r0
        L_0x066e:
            r65 = r2
            r66 = r4
            r12 = r29
        L_0x0674:
            java.util.Set r2 = r0.keySet()
            java.util.Iterator r2 = r2.iterator()
        L_0x067c:
            boolean r4 = r2.hasNext()
            if (r4 == 0) goto L_0x0709
            java.lang.Object r4 = r2.next()
            java.lang.Integer r4 = (java.lang.Integer) r4
            int r4 = r4.intValue()
            java.util.Set r10 = r9.f393426b
            java.lang.Integer r11 = java.lang.Integer.valueOf(r4)
            boolean r10 = r10.contains(r11)
            if (r10 == 0) goto L_0x06a4
            com.google.android.gms.measurement.internal.ff r4 = r9.f393011w
            com.google.android.gms.measurement.internal.dx r4 = r4.mo120965ar()
            com.google.android.gms.measurement.internal.dv r4 = r4.f392803k
            r4.mo120895b(r1, r11)
            goto L_0x067c
        L_0x06a4:
            java.lang.Object r10 = r0.get(r11)
            java.util.List r10 = (java.util.List) r10
            java.util.Iterator r10 = r10.iterator()
            r11 = 1
        L_0x06af:
            boolean r13 = r10.hasNext()
            if (r13 == 0) goto L_0x06f8
            java.lang.Object r11 = r10.next()
            com.google.android.gms.measurement.a.d r11 = (com.google.android.gms.measurement.p10848a.C145155d) r11
            com.google.android.gms.measurement.internal.t r13 = new com.google.android.gms.measurement.internal.t
            java.lang.String r14 = r9.f393425a
            r13.<init>(r9, r14, r4, r11)
            java.lang.Long r14 = r9.f393428d
            r17 = r0
            java.lang.Long r0 = r9.f393429e
            int r11 = r11.f392336b
            boolean r37 = r9.m236568e(r4, r11)
            r30 = r13
            r31 = r14
            r32 = r0
            r33 = r5
            r34 = r7
            r36 = r6
            boolean r11 = r30.mo121307d(r31, r32, r33, r34, r36, r37)
            if (r11 == 0) goto L_0x06ee
            java.lang.Integer r0 = java.lang.Integer.valueOf(r4)
            com.google.android.gms.measurement.internal.r r0 = r9.m236567d(r0)
            r0.mo121302b(r13)
            r0 = r17
            goto L_0x06af
        L_0x06ee:
            java.util.Set r0 = r9.f393426b
            java.lang.Integer r10 = java.lang.Integer.valueOf(r4)
            r0.add(r10)
            goto L_0x06fa
        L_0x06f8:
            r17 = r0
        L_0x06fa:
            if (r11 != 0) goto L_0x0705
            java.util.Set r0 = r9.f393426b
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r0.add(r4)
        L_0x0705:
            r0 = r17
            goto L_0x067c
        L_0x0709:
            r2 = r65
            r4 = r66
            r29 = r12
            r11 = 2
            goto L_0x04c8
        L_0x0712:
            boolean r0 = r67.isEmpty()
            if (r0 == 0) goto L_0x071a
            goto L_0x0979
        L_0x071a:
            androidx.c.g r2 = new androidx.c.g
            r2.<init>()
            java.util.Iterator r3 = r67.iterator()
        L_0x0723:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x0979
            java.lang.Object r0 = r3.next()
            r4 = r0
            com.google.android.gms.measurement.a.at r4 = (com.google.android.gms.measurement.p10848a.C145142at) r4
            java.lang.String r5 = r4.f392300c
            java.lang.Object r0 = r2.get(r5)
            java.util.Map r0 = (java.util.Map) r0
            if (r0 != 0) goto L_0x0807
            com.google.android.gms.measurement.internal.jy r0 = r9.f393327l
            com.google.android.gms.measurement.internal.ah r6 = r0.f393355c
            com.google.android.gms.measurement.internal.C145488jy.m236409I(r6)
            java.lang.String r7 = r9.f393425a
            r6.mo121194J()
            r6.mo120904g()
            com.google.android.gms.common.internal.C143919bh.m233969l(r7)
            com.google.android.gms.common.internal.C143919bh.m233969l(r5)
            androidx.c.g r8 = new androidx.c.g
            r8.<init>()
            android.database.sqlite.SQLiteDatabase r30 = r6.mo120806d()
            r10 = 2
            java.lang.String[] r0 = new java.lang.String[r10]     // Catch:{ SQLiteException -> 0x07e3, all -> 0x07e0 }
            r11 = 0
            r0[r11] = r28     // Catch:{ SQLiteException -> 0x07e3, all -> 0x07e0 }
            r13 = 1
            r0[r13] = r16     // Catch:{ SQLiteException -> 0x07e3, all -> 0x07e0 }
            java.lang.String[] r14 = new java.lang.String[r10]     // Catch:{ SQLiteException -> 0x07e3, all -> 0x07e0 }
            r14[r11] = r7     // Catch:{ SQLiteException -> 0x07e3, all -> 0x07e0 }
            r14[r13] = r5     // Catch:{ SQLiteException -> 0x07e3, all -> 0x07e0 }
            java.lang.String r31 = "property_filters"
            java.lang.String r33 = "app_id=? AND property_name=?"
            r35 = 0
            r36 = 0
            r37 = 0
            r32 = r0
            r34 = r14
            android.database.Cursor r10 = r30.query(r31, r32, r33, r34, r35, r36, r37)     // Catch:{ SQLiteException -> 0x07e3, all -> 0x07e0 }
            boolean r0 = r10.moveToFirst()     // Catch:{ SQLiteException -> 0x07de }
            if (r0 == 0) goto L_0x07d4
        L_0x077f:
            r11 = 1
            byte[] r0 = r10.getBlob(r11)     // Catch:{ SQLiteException -> 0x07de }
            com.google.android.gms.measurement.a.l r11 = com.google.android.gms.measurement.p10848a.C145163l.f392359h     // Catch:{ IOException -> 0x07b5 }
            com.google.protobuf.bn r11 = r11.createBuilder()     // Catch:{ IOException -> 0x07b5 }
            com.google.android.gms.measurement.a.k r11 = (com.google.android.gms.measurement.p10848a.C145162k) r11     // Catch:{ IOException -> 0x07b5 }
            com.google.protobuf.ds r0 = com.google.android.gms.measurement.internal.C145491ka.m236458k(r11, r0)     // Catch:{ IOException -> 0x07b5 }
            com.google.android.gms.measurement.a.k r0 = (com.google.android.gms.measurement.p10848a.C145162k) r0     // Catch:{ IOException -> 0x07b5 }
            com.google.protobuf.bv r0 = r0.build()     // Catch:{ IOException -> 0x07b5 }
            com.google.android.gms.measurement.a.l r0 = (com.google.android.gms.measurement.p10848a.C145163l) r0     // Catch:{ IOException -> 0x07b5 }
            r11 = 0
            int r13 = r10.getInt(r11)     // Catch:{ SQLiteException -> 0x07de }
            java.lang.Integer r11 = java.lang.Integer.valueOf(r13)     // Catch:{ SQLiteException -> 0x07de }
            java.lang.Object r13 = r8.get(r11)     // Catch:{ SQLiteException -> 0x07de }
            java.util.List r13 = (java.util.List) r13     // Catch:{ SQLiteException -> 0x07de }
            if (r13 != 0) goto L_0x07b1
            java.util.ArrayList r13 = new java.util.ArrayList     // Catch:{ SQLiteException -> 0x07de }
            r13.<init>()     // Catch:{ SQLiteException -> 0x07de }
            r8.put(r11, r13)     // Catch:{ SQLiteException -> 0x07de }
        L_0x07b1:
            r13.add(r0)     // Catch:{ SQLiteException -> 0x07de }
            goto L_0x07c7
        L_0x07b5:
            r0 = move-exception
            com.google.android.gms.measurement.internal.ff r11 = r6.f393011w     // Catch:{ SQLiteException -> 0x07de }
            com.google.android.gms.measurement.internal.dx r11 = r11.mo120965ar()     // Catch:{ SQLiteException -> 0x07de }
            com.google.android.gms.measurement.internal.dv r11 = r11.f392795c     // Catch:{ SQLiteException -> 0x07de }
            java.lang.String r13 = "Failed to merge filter"
            java.lang.Object r14 = com.google.android.gms.measurement.internal.C145325dx.m236116a(r7)     // Catch:{ SQLiteException -> 0x07de }
            r11.mo120896c(r13, r14, r0)     // Catch:{ SQLiteException -> 0x07de }
        L_0x07c7:
            boolean r0 = r10.moveToNext()     // Catch:{ SQLiteException -> 0x07de }
            if (r0 != 0) goto L_0x077f
            if (r10 == 0) goto L_0x07d2
            r10.close()
        L_0x07d2:
            r0 = r8
            goto L_0x07fb
        L_0x07d4:
            java.util.Map r0 = java.util.Collections.emptyMap()     // Catch:{ SQLiteException -> 0x07de }
            if (r10 == 0) goto L_0x07fb
        L_0x07da:
            r10.close()
            goto L_0x07fb
        L_0x07de:
            r0 = move-exception
            goto L_0x07e5
        L_0x07e0:
            r0 = move-exception
            r5 = 0
            goto L_0x0801
        L_0x07e3:
            r0 = move-exception
            r10 = 0
        L_0x07e5:
            com.google.android.gms.measurement.internal.ff r6 = r6.f393011w     // Catch:{ all -> 0x07ff }
            com.google.android.gms.measurement.internal.dx r6 = r6.mo120965ar()     // Catch:{ all -> 0x07ff }
            com.google.android.gms.measurement.internal.dv r6 = r6.f392795c     // Catch:{ all -> 0x07ff }
            java.lang.Object r7 = com.google.android.gms.measurement.internal.C145325dx.m236116a(r7)     // Catch:{ all -> 0x07ff }
            r6.mo120896c(r12, r7, r0)     // Catch:{ all -> 0x07ff }
            java.util.Map r0 = java.util.Collections.emptyMap()     // Catch:{ all -> 0x07ff }
            if (r10 == 0) goto L_0x07fb
            goto L_0x07da
        L_0x07fb:
            r2.put(r5, r0)
            goto L_0x0807
        L_0x07ff:
            r0 = move-exception
            r5 = r10
        L_0x0801:
            if (r5 == 0) goto L_0x0806
            r5.close()
        L_0x0806:
            throw r0
        L_0x0807:
            java.util.Set r5 = r0.keySet()
            java.util.Iterator r5 = r5.iterator()
        L_0x080f:
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto L_0x0723
            java.lang.Object r6 = r5.next()
            java.lang.Integer r6 = (java.lang.Integer) r6
            int r6 = r6.intValue()
            java.util.Set r7 = r9.f393426b
            java.lang.Integer r8 = java.lang.Integer.valueOf(r6)
            boolean r7 = r7.contains(r8)
            if (r7 == 0) goto L_0x0838
            com.google.android.gms.measurement.internal.ff r0 = r9.f393011w
            com.google.android.gms.measurement.internal.dx r0 = r0.mo120965ar()
            com.google.android.gms.measurement.internal.dv r0 = r0.f392803k
            r0.mo120895b(r1, r8)
            goto L_0x0723
        L_0x0838:
            java.lang.Object r7 = r0.get(r8)
            java.util.List r7 = (java.util.List) r7
            java.util.Iterator r7 = r7.iterator()
            r8 = 1
        L_0x0843:
            boolean r10 = r7.hasNext()
            if (r10 == 0) goto L_0x0967
            java.lang.Object r8 = r7.next()
            com.google.android.gms.measurement.a.l r8 = (com.google.android.gms.measurement.p10848a.C145163l) r8
            com.google.android.gms.measurement.internal.ff r10 = r9.f393011w
            com.google.android.gms.measurement.internal.dx r10 = r10.mo120965ar()
            java.lang.String r10 = r10.mo120899f()
            r11 = 2
            boolean r10 = android.util.Log.isLoggable(r10, r11)
            if (r10 == 0) goto L_0x0903
            com.google.android.gms.measurement.internal.ff r10 = r9.f393011w
            com.google.android.gms.measurement.internal.dx r10 = r10.mo120965ar()
            com.google.android.gms.measurement.internal.dv r10 = r10.f392803k
            java.lang.Integer r11 = java.lang.Integer.valueOf(r6)
            int r13 = r8.f392361a
            r14 = 1
            r13 = r13 & r14
            if (r13 == 0) goto L_0x0879
            int r13 = r8.f392362b
            java.lang.Integer r13 = java.lang.Integer.valueOf(r13)
            goto L_0x087a
        L_0x0879:
            r13 = 0
        L_0x087a:
            com.google.android.gms.measurement.internal.ff r14 = r9.f393011w
            com.google.android.gms.measurement.internal.ds r14 = r14.f392942l
            java.lang.String r15 = r8.f392363c
            java.lang.String r14 = r14.mo120892e(r15)
            java.lang.String r15 = "Evaluating filter. audience, filter, property"
            r10.mo120897d(r15, r11, r13, r14)
            com.google.android.gms.measurement.internal.ff r10 = r9.f393011w
            com.google.android.gms.measurement.internal.dx r10 = r10.mo120965ar()
            com.google.android.gms.measurement.internal.dv r10 = r10.f392803k
            com.google.android.gms.measurement.internal.jy r11 = r9.f393327l
            com.google.android.gms.measurement.internal.ka r11 = r11.f393359g
            com.google.android.gms.measurement.internal.C145488jy.m236409I(r11)
            if (r8 != 0) goto L_0x08a1
            java.lang.String r11 = "null"
            r65 = r1
            r14 = 1
            r15 = 0
            goto L_0x08fd
        L_0x08a1:
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>()
            java.lang.String r14 = "\nproperty_filter {\n"
            r13.append(r14)
            int r14 = r8.f392361a
            r15 = 1
            r14 = r14 & r15
            if (r14 == 0) goto L_0x08c0
            int r14 = r8.f392362b
            java.lang.Integer r14 = java.lang.Integer.valueOf(r14)
            java.lang.String r15 = "filter_id"
            r65 = r1
            r1 = 0
            com.google.android.gms.measurement.internal.C145491ka.m236454D(r13, r1, r15, r14)
            goto L_0x08c3
        L_0x08c0:
            r65 = r1
            r1 = 0
        L_0x08c3:
            com.google.android.gms.measurement.internal.ff r14 = r11.f393011w
            com.google.android.gms.measurement.internal.ds r14 = r14.f392942l
            java.lang.String r15 = r8.f392363c
            java.lang.String r14 = r14.mo120892e(r15)
            java.lang.String r15 = "property_name"
            com.google.android.gms.measurement.internal.C145491ka.m236454D(r13, r1, r15, r14)
            boolean r14 = r8.f392365e
            boolean r15 = r8.f392366f
            boolean r1 = r8.f392367g
            java.lang.String r1 = com.google.android.gms.measurement.internal.C145491ka.m236452B(r14, r15, r1)
            boolean r14 = r1.isEmpty()
            if (r14 != 0) goto L_0x08e9
            java.lang.String r14 = "filter_type"
            r15 = 0
            com.google.android.gms.measurement.internal.C145491ka.m236454D(r13, r15, r14, r1)
            goto L_0x08ea
        L_0x08e9:
            r15 = 0
        L_0x08ea:
            com.google.android.gms.measurement.a.f r1 = r8.f392364d
            if (r1 != 0) goto L_0x08f0
            com.google.android.gms.measurement.a.f r1 = com.google.android.gms.measurement.p10848a.C145157f.f392343f
        L_0x08f0:
            r14 = 1
            r11.mo121240p(r13, r14, r1)
            java.lang.String r1 = "}\n"
            r13.append(r1)
            java.lang.String r11 = r13.toString()
        L_0x08fd:
            java.lang.String r1 = "Filter definition"
            r10.mo120895b(r1, r11)
            goto L_0x0907
        L_0x0903:
            r65 = r1
            r14 = 1
            r15 = 0
        L_0x0907:
            int r1 = r8.f392361a
            r1 = r1 & r14
            if (r1 == 0) goto L_0x0941
            int r1 = r8.f392362b
            r10 = 256(0x100, float:3.59E-43)
            if (r1 <= r10) goto L_0x0913
            goto L_0x0941
        L_0x0913:
            com.google.android.gms.measurement.internal.v r10 = new com.google.android.gms.measurement.internal.v
            java.lang.String r11 = r9.f393425a
            r10.<init>(r9, r11, r6, r8)
            java.lang.Long r8 = r9.f393428d
            java.lang.Long r11 = r9.f393429e
            boolean r1 = r9.m236568e(r6, r1)
            boolean r8 = r10.mo121308d(r8, r11, r4, r1)
            if (r8 == 0) goto L_0x0937
            java.lang.Integer r1 = java.lang.Integer.valueOf(r6)
            com.google.android.gms.measurement.internal.r r1 = r9.m236567d(r1)
            r1.mo121302b(r10)
            r1 = r65
            goto L_0x0843
        L_0x0937:
            java.util.Set r1 = r9.f393426b
            java.lang.Integer r7 = java.lang.Integer.valueOf(r6)
            r1.add(r7)
            goto L_0x096a
        L_0x0941:
            com.google.android.gms.measurement.internal.ff r1 = r9.f393011w
            com.google.android.gms.measurement.internal.dx r1 = r1.mo120965ar()
            com.google.android.gms.measurement.internal.dv r1 = r1.f392798f
            java.lang.String r7 = r9.f393425a
            java.lang.Object r7 = com.google.android.gms.measurement.internal.C145325dx.m236116a(r7)
            int r10 = r8.f392361a
            r11 = 1
            r10 = r10 & r11
            if (r10 == 0) goto L_0x095c
            int r8 = r8.f392362b
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            goto L_0x095d
        L_0x095c:
            r8 = 0
        L_0x095d:
            java.lang.String r10 = "Invalid property filter ID. appId, id"
            java.lang.String r8 = java.lang.String.valueOf(r8)
            r1.mo120896c(r10, r7, r8)
            goto L_0x096c
        L_0x0967:
            r65 = r1
            r15 = 0
        L_0x096a:
            if (r8 != 0) goto L_0x0975
        L_0x096c:
            java.util.Set r1 = r9.f393426b
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            r1.add(r6)
        L_0x0975:
            r1 = r65
            goto L_0x080f
        L_0x0979:
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.Map r0 = r9.f393427c
            java.util.Set r0 = r0.keySet()
            java.util.Set r2 = r9.f393426b
            r0.removeAll(r2)
            java.util.Iterator r2 = r0.iterator()
        L_0x098d:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0b17
            java.lang.Object r0 = r2.next()
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
            java.util.Map r3 = r9.f393427c
            java.lang.Integer r4 = java.lang.Integer.valueOf(r0)
            java.lang.Object r3 = r3.get(r4)
            com.google.android.gms.measurement.internal.r r3 = (com.google.android.gms.measurement.internal.C145502r) r3
            com.google.android.gms.common.internal.C143919bh.m233958a(r3)
            com.google.android.gms.measurement.a.z r5 = com.google.android.gms.measurement.p10848a.C145177z.f392404f
            com.google.protobuf.bn r5 = r5.createBuilder()
            com.google.android.gms.measurement.a.y r5 = (com.google.android.gms.measurement.p10848a.C145176y) r5
            r5.copyOnWrite()
            com.google.protobuf.bv r6 = r5.instance
            com.google.android.gms.measurement.a.z r6 = (com.google.android.gms.measurement.p10848a.C145177z) r6
            int r7 = r6.f392406a
            r8 = 1
            r7 = r7 | r8
            r6.f392406a = r7
            r6.f392407b = r0
            boolean r0 = r3.f393403a
            r5.copyOnWrite()
            com.google.protobuf.bv r6 = r5.instance
            com.google.android.gms.measurement.a.z r6 = (com.google.android.gms.measurement.p10848a.C145177z) r6
            int r7 = r6.f392406a
            r7 = r7 | 8
            r6.f392406a = r7
            r6.f392410e = r0
            com.google.android.gms.measurement.a.ap r0 = r3.f393404b
            if (r0 == 0) goto L_0x09e7
            r5.copyOnWrite()
            com.google.protobuf.bv r6 = r5.instance
            com.google.android.gms.measurement.a.z r6 = (com.google.android.gms.measurement.p10848a.C145177z) r6
            r6.f392409d = r0
            int r0 = r6.f392406a
            r0 = r0 | 4
            r6.f392406a = r0
        L_0x09e7:
            com.google.android.gms.measurement.a.ap r0 = com.google.android.gms.measurement.p10848a.C145138ap.f392285e
            com.google.protobuf.bn r0 = r0.createBuilder()
            com.google.android.gms.measurement.a.ao r0 = (com.google.android.gms.measurement.p10848a.C145137ao) r0
            java.util.BitSet r6 = r3.f393405c
            java.util.List r6 = com.google.android.gms.measurement.internal.C145491ka.m236459m(r6)
            r0.mo120681b(r6)
            java.util.BitSet r6 = r3.f393406d
            java.util.List r6 = com.google.android.gms.measurement.internal.C145491ka.m236459m(r6)
            r0.mo120683d(r6)
            java.util.List r6 = r3.mo121301a()
            if (r6 == 0) goto L_0x0a0a
            r0.mo120680a(r6)
        L_0x0a0a:
            java.util.Map r6 = r3.f393407e
            if (r6 != 0) goto L_0x0a14
            java.util.List r3 = java.util.Collections.emptyList()
            r14 = 1
            goto L_0x0a81
        L_0x0a14:
            java.util.ArrayList r7 = new java.util.ArrayList
            androidx.c.n r6 = (androidx.p060c.C0984n) r6
            int r6 = r6.f3122d
            r7.<init>(r6)
            java.util.Map r6 = r3.f393407e
            java.util.Set r6 = r6.keySet()
            java.util.Iterator r6 = r6.iterator()
        L_0x0a27:
            boolean r8 = r6.hasNext()
            if (r8 == 0) goto L_0x0a7f
            java.lang.Object r8 = r6.next()
            java.lang.Integer r8 = (java.lang.Integer) r8
            com.google.android.gms.measurement.a.ar r10 = com.google.android.gms.measurement.p10848a.C145140ar.f392291d
            com.google.protobuf.bn r10 = r10.createBuilder()
            com.google.android.gms.measurement.a.aq r10 = (com.google.android.gms.measurement.p10848a.C145139aq) r10
            int r11 = r8.intValue()
            r10.copyOnWrite()
            com.google.protobuf.bv r12 = r10.instance
            com.google.android.gms.measurement.a.ar r12 = (com.google.android.gms.measurement.p10848a.C145140ar) r12
            int r13 = r12.f392293a
            r14 = 1
            r13 = r13 | r14
            r12.f392293a = r13
            r12.f392294b = r11
            java.util.Map r11 = r3.f393407e
            java.lang.Object r8 = r11.get(r8)
            java.util.List r8 = (java.util.List) r8
            if (r8 == 0) goto L_0x0a75
            java.util.Collections.sort(r8)
            r10.copyOnWrite()
            com.google.protobuf.bv r11 = r10.instance
            com.google.android.gms.measurement.a.ar r11 = (com.google.android.gms.measurement.p10848a.C145140ar) r11
            com.google.protobuf.ck r12 = r11.f392295c
            boolean r13 = r12.mo58948c()
            if (r13 != 0) goto L_0x0a70
            com.google.protobuf.ck r12 = com.google.protobuf.C62942bv.mutableCopy((com.google.protobuf.C62964ck) r12)
            r11.f392295c = r12
        L_0x0a70:
            com.google.protobuf.ck r11 = r11.f392295c
            com.google.protobuf.C62947c.addAll((java.lang.Iterable) r8, (java.util.List) r11)
        L_0x0a75:
            com.google.protobuf.bv r8 = r10.build()
            com.google.android.gms.measurement.a.ar r8 = (com.google.android.gms.measurement.p10848a.C145140ar) r8
            r7.add(r8)
            goto L_0x0a27
        L_0x0a7f:
            r14 = 1
            r3 = r7
        L_0x0a81:
            r0.mo120682c(r3)
            r5.copyOnWrite()
            com.google.protobuf.bv r3 = r5.instance
            com.google.android.gms.measurement.a.z r3 = (com.google.android.gms.measurement.p10848a.C145177z) r3
            com.google.protobuf.bv r0 = r0.build()
            com.google.android.gms.measurement.a.ap r0 = (com.google.android.gms.measurement.p10848a.C145138ap) r0
            r0.getClass()
            r3.f392408c = r0
            int r0 = r3.f392406a
            r6 = 2
            r0 = r0 | r6
            r3.f392406a = r0
            com.google.protobuf.bv r0 = r5.build()
            com.google.android.gms.measurement.a.z r0 = (com.google.android.gms.measurement.p10848a.C145177z) r0
            r1.add(r0)
            com.google.android.gms.measurement.internal.jy r3 = r9.f393327l
            com.google.android.gms.measurement.internal.ah r3 = r3.f393355c
            com.google.android.gms.measurement.internal.C145488jy.m236409I(r3)
            java.lang.String r5 = r9.f393425a
            com.google.android.gms.measurement.a.ap r0 = r0.f392408c
            if (r0 != 0) goto L_0x0ab4
            com.google.android.gms.measurement.a.ap r0 = com.google.android.gms.measurement.p10848a.C145138ap.f392285e
        L_0x0ab4:
            r3.mo121194J()
            r3.mo120904g()
            com.google.android.gms.common.internal.C143919bh.m233969l(r5)
            com.google.android.gms.common.internal.C143919bh.m233958a(r0)
            byte[] r0 = r0.toByteArray()
            android.content.ContentValues r7 = new android.content.ContentValues
            r7.<init>()
            java.lang.String r8 = "app_id"
            r7.put(r8, r5)
            r8 = r28
            r7.put(r8, r4)
            r4 = r23
            r7.put(r4, r0)
            android.database.sqlite.SQLiteDatabase r0 = r3.mo120806d()     // Catch:{ SQLiteException -> 0x0afe }
            java.lang.String r10 = "audience_filter_values"
            r11 = 5
            r12 = 0
            long r10 = r0.insertWithOnConflict(r10, r12, r7, r11)     // Catch:{ SQLiteException -> 0x0afc }
            r15 = -1
            int r0 = (r10 > r15 ? 1 : (r10 == r15 ? 0 : -1))
            if (r0 != 0) goto L_0x0b11
            com.google.android.gms.measurement.internal.ff r0 = r3.f393011w     // Catch:{ SQLiteException -> 0x0afc }
            com.google.android.gms.measurement.internal.dx r0 = r0.mo120965ar()     // Catch:{ SQLiteException -> 0x0afc }
            com.google.android.gms.measurement.internal.dv r0 = r0.f392795c     // Catch:{ SQLiteException -> 0x0afc }
            java.lang.String r7 = "Failed to insert filter results (got -1). appId"
            java.lang.Object r10 = com.google.android.gms.measurement.internal.C145325dx.m236116a(r5)     // Catch:{ SQLiteException -> 0x0afc }
            r0.mo120895b(r7, r10)     // Catch:{ SQLiteException -> 0x0afc }
            goto L_0x0b11
        L_0x0afc:
            r0 = move-exception
            goto L_0x0b00
        L_0x0afe:
            r0 = move-exception
            r12 = 0
        L_0x0b00:
            com.google.android.gms.measurement.internal.ff r3 = r3.f393011w
            com.google.android.gms.measurement.internal.dx r3 = r3.mo120965ar()
            com.google.android.gms.measurement.internal.dv r3 = r3.f392795c
            java.lang.String r7 = "Error storing filter results. appId"
            java.lang.Object r5 = com.google.android.gms.measurement.internal.C145325dx.m236116a(r5)
            r3.mo120896c(r7, r5, r0)
        L_0x0b11:
            r23 = r4
            r28 = r8
            goto L_0x098d
        L_0x0b17:
            return r1
        L_0x0b18:
            r0 = move-exception
            r5 = r4
        L_0x0b1a:
            if (r5 == 0) goto L_0x0b1f
            r5.close()
        L_0x0b1f:
            goto L_0x0b21
        L_0x0b20:
            throw r0
        L_0x0b21:
            goto L_0x0b20
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C145507w.mo121309a(java.lang.String, java.util.List, java.util.List, java.lang.Long, java.lang.Long):java.util.List");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final Map mo121310b(String str, Map map, Map map2) {
        C143919bh.m233969l(str);
        C143919bh.m233958a(map2);
        C0977g gVar = new C0977g();
        if (map2.isEmpty()) {
            return gVar;
        }
        for (Integer intValue : map2.keySet()) {
            int intValue2 = intValue.intValue();
            Integer valueOf = Integer.valueOf(intValue2);
            C145138ap apVar = (C145138ap) map2.get(valueOf);
            List list = (List) map.get(valueOf);
            if (list == null || list.isEmpty()) {
                gVar.put(valueOf, apVar);
            } else {
                C145491ka kaVar = this.f393327l.f393359g;
                C145488jy.m236409I(kaVar);
                List l = kaVar.mo121237l(apVar.f392288b, list);
                if (!l.isEmpty()) {
                    C145137ao aoVar = (C145137ao) apVar.toBuilder();
                    aoVar.copyOnWrite();
                    ((C145138ap) aoVar.instance).f392288b = C145138ap.emptyLongList();
                    aoVar.mo120681b(l);
                    C145491ka kaVar2 = this.f393327l.f393359g;
                    C145488jy.m236409I(kaVar2);
                    List l2 = kaVar2.mo121237l(apVar.f392287a, list);
                    aoVar.copyOnWrite();
                    ((C145138ap) aoVar.instance).f392287a = C145138ap.emptyLongList();
                    aoVar.mo120683d(l2);
                    if (!C68928v.f185215a.mo6453a().mo60790a() || !this.f393011w.f392937g.mo120776m((String) null, C145313dl.f392734an)) {
                        for (int i = 0; i < apVar.f392289c.size(); i++) {
                            if (list.contains(Integer.valueOf(((C145124ab) apVar.f392289c.get(i)).f392209b))) {
                                aoVar.copyOnWrite();
                                C145138ap apVar2 = (C145138ap) aoVar.instance;
                                apVar2.mo120684a();
                                apVar2.f392289c.remove(i);
                            }
                        }
                        for (int i2 = 0; i2 < apVar.f392290d.size(); i2++) {
                            if (list.contains(Integer.valueOf(((C145140ar) apVar.f392290d.get(i2)).f392294b))) {
                                aoVar.copyOnWrite();
                                C145138ap apVar3 = (C145138ap) aoVar.instance;
                                apVar3.mo120685b();
                                apVar3.f392290d.remove(i2);
                            }
                        }
                    } else {
                        ArrayList arrayList = new ArrayList();
                        for (C145124ab abVar : apVar.f392289c) {
                            if (!list.contains(Integer.valueOf(abVar.f392209b))) {
                                arrayList.add(abVar);
                            }
                        }
                        aoVar.copyOnWrite();
                        ((C145138ap) aoVar.instance).f392289c = C145138ap.emptyProtobufList();
                        aoVar.mo120680a(arrayList);
                        ArrayList arrayList2 = new ArrayList();
                        for (C145140ar arVar : apVar.f392290d) {
                            if (!list.contains(Integer.valueOf(arVar.f392294b))) {
                                arrayList2.add(arVar);
                            }
                        }
                        aoVar.copyOnWrite();
                        ((C145138ap) aoVar.instance).f392290d = C145138ap.emptyProtobufList();
                        aoVar.mo120682c(arrayList2);
                    }
                    gVar.put(Integer.valueOf(intValue2), (C145138ap) aoVar.build());
                }
            }
        }
        return gVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final boolean mo120805c() {
        return false;
    }
}
