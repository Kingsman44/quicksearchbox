package com.google.android.libraries.search.assistant.p2822w.p2823a;

import android.content.Context;
import android.database.Cursor;
import android.database.DatabaseUtils;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;
import android.text.TextUtils;
import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.geller.portable.database.C21957e;
import com.google.common.base.C58833ax;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.p4526f.p4527a.C58974d;
import com.google.protos.p4985f.p5030q.C65161dv;
import com.google.protos.p4985f.p5030q.C65291iq;
import com.google.protos.p4985f.p5030q.C65293is;
import com.google.protos.p4985f.p5030q.p5032b.C65019ad;
import com.google.protos.p4985f.p5030q.p5032b.C65059f;
import com.google.protos.p4985f.p5030q.p5032b.C65063j;
import com.google.protos.p4985f.p5030q.p5032b.C65066m;
import com.google.protos.p4985f.p5030q.p5032b.C65071r;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

/* renamed from: com.google.android.libraries.search.assistant.w.a.d */
/* compiled from: PG */
public final class C36783d extends SQLiteOpenHelper implements C21957e {

    /* renamed from: a */
    private static final C58974d f95850a = C58974d.m91136j();

    public C36783d(Context context, String str) {
        super(context, String.format("portable_provider_%s.db", new Object[]{str}), (SQLiteDatabase.CursorFactory) null, 1);
    }

    /* renamed from: h */
    public static String m65458h(C65161dv dvVar) {
        if ((dvVar.f176348a & 1) == 0) {
            return BuildConfig.FLAVOR;
        }
        C65291iq iqVar = dvVar.f176351d;
        if (iqVar == null) {
            iqVar = C65291iq.f176610d;
        }
        Object[] objArr = new Object[2];
        objArr[0] = (iqVar.f176612a & 1) != 0 ? iqVar.f176613b : "provider_id";
        int a = C65293is.m96663a(iqVar.f176614c);
        if (a == 0) {
            a = 1;
        }
        objArr[1] = a == 3 ? "DESC" : "ASC";
        String concat = BuildConfig.FLAVOR.concat(String.valueOf(String.format(" ORDER BY %s %s ", objArr)));
        Object[] objArr2 = new Object[2];
        objArr2[0] = Long.valueOf(dvVar.f176349b);
        objArr2[1] = Long.valueOf((2 & dvVar.f176348a) != 0 ? dvVar.f176350c : 0);
        return concat.concat(String.valueOf(String.format(" LIMIT %s OFFSET %s ", objArr2)));
    }

    /* renamed from: i */
    public static String m65459i(Iterable iterable) {
        StringBuilder sb = new StringBuilder();
        sb.append("(");
        boolean z = true;
        for (Object next : iterable) {
            sb.append(true != z ? ", " : BuildConfig.FLAVOR);
            if (next instanceof Number) {
                sb.append(next);
            } else {
                DatabaseUtils.appendEscapedSQLString(sb, String.valueOf(next));
            }
            z = false;
        }
        sb.append(")");
        return sb.toString();
    }

    /* renamed from: b */
    public final /* synthetic */ C65063j mo27282b(C58833ax axVar, Set set) {
        return C65063j.f176192d;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v9, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v6, resolved type: java.lang.String} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final byte[][] mo27283c(com.google.common.base.C58833ax r8, com.google.protos.p4985f.p5030q.p5032b.C65031ap r9) {
        /*
            r7 = this;
            android.database.sqlite.SQLiteDatabase r8 = r7.mo40395g()
            r0 = 0
            if (r8 != 0) goto L_0x000a
            byte[][] r8 = new byte[r0][]
            return r8
        L_0x000a:
            int r1 = r9.f176103b
            java.lang.String r2 = ""
            r3 = 1
            if (r1 != r3) goto L_0x0016
            java.lang.Object r1 = r9.f176104c
            java.lang.String r1 = (java.lang.String) r1
            goto L_0x0017
        L_0x0016:
            r1 = r2
        L_0x0017:
            boolean r1 = r1.isEmpty()
            r4 = 2
            if (r1 != 0) goto L_0x0044
            r1 = 5
            java.lang.Object[] r1 = new java.lang.Object[r1]
            java.lang.String r5 = "_id"
            r1[r0] = r5
            java.lang.String r5 = "data_id"
            r1[r3] = r5
            java.lang.String r5 = "pp_app_intents"
            r1[r4] = r5
            r5 = 3
            java.lang.String r6 = "provider_id"
            r1[r5] = r6
            int r5 = r9.f176103b
            if (r5 != r3) goto L_0x003b
            java.lang.Object r9 = r9.f176104c
            r2 = r9
            java.lang.String r2 = (java.lang.String) r2
        L_0x003b:
            r9 = 4
            r1[r9] = r2
            java.lang.String r9 = "WHERE %s IN (SELECT %s FROM %s WHERE %s = %s)"
            java.lang.String r2 = java.lang.String.format(r9, r1)
        L_0x0044:
            java.lang.Object[] r9 = new java.lang.Object[r4]
            java.lang.String r1 = "data"
            r9[r0] = r1
            java.lang.String r4 = "pp_data"
            r9[r3] = r4
            java.lang.String r3 = "SELECT %s FROM %s "
            java.lang.String r9 = java.lang.String.format(r3, r9)
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.lang.String r9 = java.lang.String.valueOf(r9)
            java.lang.String r2 = java.lang.String.valueOf(r2)
            java.lang.String r9 = r9.concat(r2)
            r2 = 0
            android.database.Cursor r8 = r8.rawQuery(r9, r2)
            int r9 = r8.getColumnIndexOrThrow(r1)     // Catch:{ all -> 0x008a }
        L_0x006e:
            boolean r1 = r8.moveToNext()     // Catch:{ all -> 0x008a }
            if (r1 == 0) goto L_0x007c
            byte[] r1 = r8.getBlob(r9)     // Catch:{ all -> 0x008a }
            r3.add(r1)     // Catch:{ all -> 0x008a }
            goto L_0x006e
        L_0x007c:
            if (r8 == 0) goto L_0x0081
            r8.close()
        L_0x0081:
            byte[][] r8 = new byte[r0][]
            java.lang.Object[] r8 = r3.toArray(r8)
            byte[][] r8 = (byte[][]) r8
            return r8
        L_0x008a:
            r9 = move-exception
            if (r8 == 0) goto L_0x0095
            r8.close()     // Catch:{ all -> 0x0091 }
            goto L_0x0095
        L_0x0091:
            r8 = move-exception
            com.google.android.libraries.search.assistant.p2822w.p2823a.C36782c.m65457a(r9, r8)
        L_0x0095:
            goto L_0x0097
        L_0x0096:
            throw r9
        L_0x0097:
            goto L_0x0096
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.search.assistant.p2822w.p2823a.C36783d.mo27283c(com.google.common.base.ax, com.google.protos.f.q.b.ap):byte[][]");
    }

    /* renamed from: d */
    public final String[] mo27284d(C58833ax axVar, String str) {
        SQLiteDatabase g = mo40395g();
        if (g == null) {
            return new String[0];
        }
        String format = String.format("SELECT DISTINCT %s FROM %s", new Object[]{"provider_id", "pp_app_intents"});
        HashSet hashSet = new HashSet();
        Cursor rawQuery = g.rawQuery(format, (String[]) null);
        while (rawQuery.moveToNext()) {
            try {
                String string = rawQuery.getString(rawQuery.getColumnIndexOrThrow("provider_id"));
                if (!TextUtils.isEmpty(string)) {
                    hashSet.add(string);
                }
            } catch (Throwable th) {
                C36782c.m65457a(th, th);
            }
        }
        if (rawQuery != null) {
            rawQuery.close();
        }
        return (String[]) hashSet.toArray(new String[0]);
        throw th;
    }

    /* renamed from: e */
    public final long mo27285e(C58833ax axVar, String str, C65019ad adVar, C58833ax axVar2, C58833ax axVar3, C58833ax axVar4) {
        return 0;
    }

    /* JADX INFO: finally extract failed */
    /* JADX WARNING: type inference failed for: r12v2 */
    /* JADX WARNING: type inference failed for: r12v3 */
    /* JADX WARNING: type inference failed for: r12v4 */
    /* JADX WARNING: type inference failed for: r12v5 */
    /* JADX WARNING: Can't wrap try/catch for region: R(2:44|45) */
    /* JADX WARNING: Code restructure failed: missing block: B:45:?, code lost:
        throw r1;
     */
    /* JADX WARNING: Incorrect type for immutable var: ssa=int, code=?, for r12v1, types: [boolean, int] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:44:0x00a3 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x00ba A[Catch:{ IllegalStateException -> 0x0152, all -> 0x0150 }] */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x00e7 A[Catch:{ IllegalStateException -> 0x0152, all -> 0x0150 }] */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x00ef A[Catch:{ IllegalStateException -> 0x0152, all -> 0x0150 }] */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x00f5 A[Catch:{ IllegalStateException -> 0x0152, all -> 0x0150 }] */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x010e A[Catch:{ IllegalStateException -> 0x0152, all -> 0x0150 }] */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x011c A[Catch:{ IllegalStateException -> 0x0152, all -> 0x0150 }] */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x0138 A[Catch:{ IllegalStateException -> 0x0152, all -> 0x0150 }, LOOP:1: B:73:0x0132->B:75:0x0138, LOOP_END] */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo27286f(com.google.common.base.C58833ax r19, java.lang.String r20, java.lang.String[] r21, long r22, boolean r24, byte[] r25) {
        /*
            r18 = this;
            r0 = r25
            java.lang.String r1 = "data_id"
            android.database.sqlite.SQLiteDatabase r11 = r18.mo40395g()
            r12 = 0
            if (r11 != 0) goto L_0x000c
            return r12
        L_0x000c:
            int r2 = r0.length
            r3 = 2000000(0x1e8480, float:2.802597E-39)
            if (r2 <= r3) goto L_0x0021
            com.google.common.f.a.d r0 = f95850a
            com.google.common.f.x r0 = r0.mo56226d()
            java.lang.String r1 = "Unable to write data: data size must be less than or equal to %s bytes"
            r2 = 52340(0xcc74, float:7.3344E-41)
            ((com.google.common.p4526f.p4527a.C58970a) ((com.google.common.p4526f.p4527a.C58970a) r0).mo56372aa(r2)).mo56387q(r1, r3)
            return r12
        L_0x0021:
            com.google.protobuf.ba r2 = com.google.protobuf.C62921ba.m95368a()     // Catch:{ ct -> 0x0181 }
            com.google.protos.p.b.az r3 = com.google.protos.p5129p.p5131b.C65768az.f178793f     // Catch:{ ct -> 0x0181 }
            com.google.protobuf.bv r0 = com.google.protobuf.C62942bv.parseFrom((com.google.protobuf.C62942bv) r3, (byte[]) r0, (com.google.protobuf.C62921ba) r2)     // Catch:{ ct -> 0x0181 }
            com.google.protos.p.b.az r0 = (com.google.protos.p5129p.p5131b.C65768az) r0     // Catch:{ ct -> 0x0181 }
            com.google.protobuf.h r0 = r0.f178799e     // Catch:{ ct -> 0x0178 }
            if (r0 != 0) goto L_0x0033
            com.google.protobuf.h r0 = com.google.protobuf.C63070h.f170215c     // Catch:{ ct -> 0x0178 }
        L_0x0033:
            com.google.protobuf.z r0 = r0.f170218b     // Catch:{ ct -> 0x0178 }
            com.google.protobuf.ba r2 = com.google.protobuf.C62921ba.m95368a()     // Catch:{ ct -> 0x0178 }
            com.google.assistant.an.e.a.d r3 = com.google.assistant.p3825an.p3834e.p3835a.C49362d.f127591d     // Catch:{ ct -> 0x0178 }
            com.google.protobuf.bv r0 = com.google.protobuf.C62942bv.parseFrom((com.google.protobuf.C62942bv) r3, (com.google.protobuf.C63088z) r0, (com.google.protobuf.C62921ba) r2)     // Catch:{ ct -> 0x0178 }
            r13 = r0
            com.google.assistant.an.e.a.d r13 = (com.google.assistant.p3825an.p3834e.p3835a.C49362d) r13     // Catch:{ ct -> 0x0178 }
            r11.beginTransactionNonExclusive()
            com.google.assistant.an.e.a.l r0 = r13.f127593a     // Catch:{ IllegalStateException -> 0x0152 }
            if (r0 != 0) goto L_0x004b
            com.google.assistant.an.e.a.l r0 = com.google.assistant.p3825an.p3834e.p3835a.C49370l.f127608b     // Catch:{ IllegalStateException -> 0x0152 }
        L_0x004b:
            long r14 = r0.f127610a     // Catch:{ IllegalStateException -> 0x0152 }
            r10 = 1
            java.lang.String[] r4 = new java.lang.String[r10]     // Catch:{ IllegalStateException -> 0x0152 }
            r4[r12] = r1     // Catch:{ IllegalStateException -> 0x0152 }
            r16 = -1
            java.lang.String[] r6 = new java.lang.String[r10]     // Catch:{ IllegalArgumentException -> 0x00a4 }
            java.lang.String r0 = java.lang.String.valueOf(r14)     // Catch:{ IllegalArgumentException -> 0x00a4 }
            r6[r12] = r0     // Catch:{ IllegalArgumentException -> 0x00a4 }
            java.lang.String r3 = "pp_app_intents"
            java.lang.String r5 = "provider_id = ?"
            r7 = 0
            r8 = 0
            r9 = 0
            r0 = 0
            r2 = r11
            r12 = 1
            r10 = r0
            android.database.Cursor r2 = r2.query(r3, r4, r5, r6, r7, r8, r9, r10)     // Catch:{ IllegalArgumentException -> 0x0081 }
            boolean r0 = r2.moveToNext()     // Catch:{ all -> 0x0083 }
            if (r0 == 0) goto L_0x007b
            int r0 = r2.getColumnIndexOrThrow(r1)     // Catch:{ all -> 0x0083 }
            long r0 = r2.getLong(r0)     // Catch:{ all -> 0x0083 }
            r16 = r0
        L_0x007b:
            if (r2 == 0) goto L_0x00b4
            r2.close()     // Catch:{ IllegalArgumentException -> 0x0081 }
            goto L_0x00b4
        L_0x0081:
            r0 = move-exception
            goto L_0x00a6
        L_0x0083:
            r0 = move-exception
            r1 = r0
            if (r2 == 0) goto L_0x00a3
            r2.close()     // Catch:{ all -> 0x008b }
            goto L_0x00a3
        L_0x008b:
            r0 = move-exception
            r2 = r0
            java.lang.Class[] r0 = new java.lang.Class[r12]     // Catch:{ Exception -> 0x00a3 }
            java.lang.Class<java.lang.Throwable> r3 = java.lang.Throwable.class
            r4 = 0
            r0[r4] = r3     // Catch:{ Exception -> 0x00a3 }
            java.lang.Class<java.lang.Throwable> r3 = java.lang.Throwable.class
            java.lang.String r5 = "addSuppressed"
            java.lang.reflect.Method r0 = r3.getDeclaredMethod(r5, r0)     // Catch:{ Exception -> 0x00a3 }
            java.lang.Object[] r3 = new java.lang.Object[r12]     // Catch:{ Exception -> 0x00a3 }
            r3[r4] = r2     // Catch:{ Exception -> 0x00a3 }
            r0.invoke(r1, r3)     // Catch:{ Exception -> 0x00a3 }
        L_0x00a3:
            throw r1     // Catch:{ IllegalArgumentException -> 0x0081 }
        L_0x00a4:
            r0 = move-exception
            r12 = 1
        L_0x00a6:
            com.google.common.f.e r1 = com.google.android.libraries.search.assistant.p2822w.p2823a.C36784e.f95851a     // Catch:{ IllegalStateException -> 0x0152 }
            com.google.common.f.x r1 = r1.mo56225c()     // Catch:{ IllegalStateException -> 0x0152 }
            java.lang.String r2 = "Query execution failed."
            r3 = 52341(0xcc75, float:7.3345E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r1).mo56382g(r0)).mo56372aa(r3)).mo56386p(r2)     // Catch:{ IllegalStateException -> 0x0152 }
        L_0x00b4:
            r0 = 0
            int r2 = (r16 > r0 ? 1 : (r16 == r0 ? 0 : -1))
            if (r2 <= 0) goto L_0x00ca
            java.lang.String[] r0 = new java.lang.String[r12]     // Catch:{ IllegalStateException -> 0x0152 }
            java.lang.String r1 = java.lang.Long.toString(r14)     // Catch:{ IllegalStateException -> 0x0152 }
            r2 = 0
            r0[r2] = r1     // Catch:{ IllegalStateException -> 0x0152 }
            java.lang.String r1 = "pp_app_intents"
            java.lang.String r2 = "provider_id = ?"
            r11.delete(r1, r2, r0)     // Catch:{ IllegalStateException -> 0x0152 }
        L_0x00ca:
            j$.time.Instant r0 = com.google.common.p4580v.C60945d.m93099d(r22)     // Catch:{ IllegalStateException -> 0x0152 }
            byte[] r1 = r13.toByteArray()     // Catch:{ IllegalStateException -> 0x0152 }
            android.content.ContentValues r2 = new android.content.ContentValues     // Catch:{ IllegalStateException -> 0x0152 }
            r2.<init>()     // Catch:{ IllegalStateException -> 0x0152 }
            java.lang.String r3 = "data"
            r2.put(r3, r1)     // Catch:{ IllegalStateException -> 0x0152 }
            java.lang.String r1 = "pp_data"
            r3 = 0
            long r14 = r11.insertOrThrow(r1, r3, r2)     // Catch:{ IllegalStateException -> 0x0152 }
            com.google.assistant.an.e.a.l r1 = r13.f127593a     // Catch:{ IllegalStateException -> 0x0152 }
            if (r1 != 0) goto L_0x00e9
            com.google.assistant.an.e.a.l r1 = com.google.assistant.p3825an.p3834e.p3835a.C49370l.f127608b     // Catch:{ IllegalStateException -> 0x0152 }
        L_0x00e9:
            long r8 = r1.f127610a     // Catch:{ IllegalStateException -> 0x0152 }
            com.google.assistant.an.e.a.n r1 = r13.f127594b     // Catch:{ IllegalStateException -> 0x0152 }
            if (r1 != 0) goto L_0x00f1
            com.google.assistant.an.e.a.n r1 = com.google.assistant.p3825an.p3834e.p3835a.C49372n.f127612b     // Catch:{ IllegalStateException -> 0x0152 }
        L_0x00f1:
            com.google.assistant.an.e.a.b r1 = r1.f127614a     // Catch:{ IllegalStateException -> 0x0152 }
            if (r1 != 0) goto L_0x00f7
            com.google.assistant.an.e.a.b r1 = com.google.assistant.p3825an.p3834e.p3835a.C49360b.f127587b     // Catch:{ IllegalStateException -> 0x0152 }
        L_0x00f7:
            java.lang.String r1 = r1.f127589a     // Catch:{ IllegalStateException -> 0x0152 }
            java.lang.String r6 = ""
            r2 = r11
            r3 = r8
            r5 = r1
            r7 = r0
            r16 = r8
            r8 = r14
            com.google.android.libraries.search.assistant.p2822w.p2823a.C36784e.m65467a(r2, r3, r5, r6, r7, r8)     // Catch:{ IllegalStateException -> 0x0152 }
            java.util.HashSet r2 = new java.util.HashSet     // Catch:{ IllegalStateException -> 0x0152 }
            r2.<init>()     // Catch:{ IllegalStateException -> 0x0152 }
            com.google.assistant.an.e.a.j r3 = r13.f127595c     // Catch:{ IllegalStateException -> 0x0152 }
            if (r3 != 0) goto L_0x0110
            com.google.assistant.an.e.a.j r3 = com.google.assistant.p3825an.p3834e.p3835a.C49368j.f127605b     // Catch:{ IllegalStateException -> 0x0152 }
        L_0x0110:
            com.google.protobuf.cq r3 = r3.f127607a     // Catch:{ IllegalStateException -> 0x0152 }
            java.util.Iterator r3 = r3.iterator()     // Catch:{ IllegalStateException -> 0x0152 }
        L_0x0116:
            boolean r4 = r3.hasNext()     // Catch:{ IllegalStateException -> 0x0152 }
            if (r4 == 0) goto L_0x012e
            java.lang.Object r4 = r3.next()     // Catch:{ IllegalStateException -> 0x0152 }
            com.google.b.c.g r4 = (com.google.p4129b.p4136c.C54759g) r4     // Catch:{ IllegalStateException -> 0x0152 }
            com.google.b.c.u r4 = r4.f143681a     // Catch:{ IllegalStateException -> 0x0152 }
            if (r4 != 0) goto L_0x0128
            com.google.b.c.u r4 = com.google.p4129b.p4136c.C54773u.f143704c     // Catch:{ IllegalStateException -> 0x0152 }
        L_0x0128:
            java.lang.String r4 = r4.f143706a     // Catch:{ IllegalStateException -> 0x0152 }
            r2.add(r4)     // Catch:{ IllegalStateException -> 0x0152 }
            goto L_0x0116
        L_0x012e:
            java.util.Iterator r10 = r2.iterator()     // Catch:{ IllegalStateException -> 0x0152 }
        L_0x0132:
            boolean r2 = r10.hasNext()     // Catch:{ IllegalStateException -> 0x0152 }
            if (r2 == 0) goto L_0x0149
            java.lang.Object r2 = r10.next()     // Catch:{ IllegalStateException -> 0x0152 }
            r6 = r2
            java.lang.String r6 = (java.lang.String) r6     // Catch:{ IllegalStateException -> 0x0152 }
            r2 = r11
            r3 = r16
            r5 = r1
            r7 = r0
            r8 = r14
            com.google.android.libraries.search.assistant.p2822w.p2823a.C36784e.m65467a(r2, r3, r5, r6, r7, r8)     // Catch:{ IllegalStateException -> 0x0152 }
            goto L_0x0132
        L_0x0149:
            r11.setTransactionSuccessful()     // Catch:{ IllegalStateException -> 0x0152 }
            r11.endTransaction()
            return r12
        L_0x0150:
            r0 = move-exception
            goto L_0x0174
        L_0x0152:
            r0 = move-exception
            com.google.common.f.a.d r1 = f95850a     // Catch:{ all -> 0x0150 }
            com.google.common.f.x r1 = r1.mo56225c()     // Catch:{ all -> 0x0150 }
            com.google.common.f.a.a r1 = (com.google.common.p4526f.p4527a.C58970a) r1     // Catch:{ all -> 0x0150 }
            com.google.common.f.x r0 = r1.mo56382g(r0)     // Catch:{ all -> 0x0150 }
            com.google.common.f.a.a r0 = (com.google.common.p4526f.p4527a.C58970a) r0     // Catch:{ all -> 0x0150 }
            r1 = 52339(0xcc73, float:7.3343E-41)
            com.google.common.f.x r0 = r0.mo56372aa(r1)     // Catch:{ all -> 0x0150 }
            com.google.common.f.a.a r0 = (com.google.common.p4526f.p4527a.C58970a) r0     // Catch:{ all -> 0x0150 }
            java.lang.String r1 = "Failed to write to portable provider data table."
            r0.mo56386p(r1)     // Catch:{ all -> 0x0150 }
            r11.endTransaction()
            r1 = 0
            return r1
        L_0x0174:
            r11.endTransaction()
            throw r0
        L_0x0178:
            r0 = move-exception
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "Failed to parse the portable provider"
            r1.<init>(r2, r0)
            throw r1
        L_0x0181:
            r0 = move-exception
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "Failed to unpack Element"
            r1.<init>(r2, r0)
            goto L_0x018b
        L_0x018a:
            throw r1
        L_0x018b:
            goto L_0x018a
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.search.assistant.p2822w.p2823a.C36783d.mo27286f(com.google.common.base.ax, java.lang.String, java.lang.String[], long, boolean, byte[]):boolean");
    }

    /* renamed from: g */
    public final SQLiteDatabase mo40395g() {
        try {
            return getWritableDatabase();
        } catch (SQLiteException e) {
            ((C58970a) ((C58970a) ((C58970a) f95850a.mo56226d()).mo56382g(e)).mo56372aa(52337)).mo56386p("Failed to get Portable Provider Database.");
            return null;
        }
    }

    public final void onCreate(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS pp_app_intents (data_id TEXT NOT NULL, provider_id INTEGER NOT NULL, package_name TEXT NOT NULL, intent TEXT NOT NULL, sync_timestamp_micro INTEGER NOT NULL,  FOREIGN KEY (data_id) REFERENCES pp_data (_id) ON DELETE CASCADE );");
        sQLiteDatabase.execSQL(" CREATE TABLE IF NOT EXISTS pp_data (_id INTEGER PRIMARY KEY, data BLOB NOT NULL);");
    }

    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
    }

    /* renamed from: a */
    public final long mo27281a(C58833ax axVar, String str, C65071r rVar) {
        long j;
        C65066m mVar;
        if ((rVar.f176210a & 1) != 0) {
            SQLiteDatabase g = mo40395g();
            if (g == null) {
                return 0;
            }
            try {
                g.beginTransactionNonExclusive();
                int i = rVar.f176211b;
                if (i != 2) {
                    if (i == 4) {
                        if (((Boolean) rVar.f176212c).booleanValue()) {
                            g.execSQL(String.format("DELETE FROM %s", new Object[]{"pp_data"}));
                            j = DatabaseUtils.longForQuery(g, "SELECT changes()", (String[]) null);
                            g.setTransactionSuccessful();
                            ((C58970a) ((C58970a) f95850a.mo56224b()).mo56372aa(52336)).mo56388r("Deleted %s rows", j);
                            return j;
                        }
                    }
                    ArrayList arrayList = new ArrayList();
                    if (rVar.f176211b == 1) {
                        mVar = (C65066m) rVar.f176212c;
                    } else {
                        mVar = C65066m.f176197b;
                    }
                    for (C65059f fVar : mVar.f176199a) {
                        arrayList.add(fVar.f176184c);
                    }
                    g.execSQL(String.format("DELETE FROM %s WHERE %s IN %s", new Object[]{"pp_data", "_id", m65459i(arrayList)}));
                    j = DatabaseUtils.longForQuery(g, "SELECT changes()", (String[]) null);
                    g.setTransactionSuccessful();
                    ((C58970a) ((C58970a) f95850a.mo56224b()).mo56372aa(52336)).mo56388r("Deleted %s rows", j);
                    return j;
                }
                throw new UnsupportedOperationException("Deletion by selection is not supported");
            } finally {
                g.endTransaction();
            }
        } else {
            throw new IllegalArgumentException("The dataType field is required in GellerDeleteParams.");
        }
    }
}
