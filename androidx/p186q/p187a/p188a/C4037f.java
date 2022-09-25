package androidx.p186q.p187a.p188a;

import android.database.DatabaseErrorHandler;
import androidx.p186q.p187a.C4050e;

/* renamed from: androidx.q.a.a.f */
/* compiled from: PG */
public final /* synthetic */ class C4037f implements DatabaseErrorHandler {

    /* renamed from: a */
    public final /* synthetic */ C4050e f12904a;

    /* renamed from: b */
    public final /* synthetic */ C4036e f12905b;

    public /* synthetic */ C4037f(C4050e eVar, C4036e eVar2) {
        this.f12904a = eVar;
        this.f12905b = eVar2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0042, code lost:
        if (r0 != null) goto L_0x0044;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0044, code lost:
        r3 = r0.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x004c, code lost:
        if (r3.hasNext() != false) goto L_0x004e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x004e, code lost:
        androidx.p186q.p187a.C4050e.m11599c((java.lang.String) r3.next().second);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x005c, code lost:
        androidx.p186q.p187a.C4050e.m11599c(r3.f12902a.getPath());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0065, code lost:
        throw r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x003a, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x003c */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0069  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0082  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x003a A[ExcHandler: all (r1v4 'th' java.lang.Throwable A[CUSTOM_DECLARE]), PHI: r0 
      PHI: (r0v14 java.util.List<android.util.Pair<java.lang.String, java.lang.String>>) = (r0v7 java.util.List<android.util.Pair<java.lang.String, java.lang.String>>), (r0v8 java.util.List<android.util.Pair<java.lang.String, java.lang.String>>), (r0v8 java.util.List<android.util.Pair<java.lang.String, java.lang.String>>) binds: [B:6:0x0033, B:9:0x003c, B:10:?] A[DONT_GENERATE, DONT_INLINE], Splitter:B:6:0x0033] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onCorruption(android.database.sqlite.SQLiteDatabase r3) {
        /*
            r2 = this;
            androidx.q.a.a.e r0 = r2.f12905b
            java.lang.String r1 = "dbObj"
            p5462h.p5473f.p5475b.C69664n.m101060f(r3, r1)
            androidx.q.a.a.d r3 = androidx.p186q.p187a.p188a.C4040i.m11566a(r0, r3)
            android.database.sqlite.SQLiteDatabase r0 = r3.f12902a
            java.lang.String r0 = r0.getPath()
            java.lang.String r0 = java.lang.String.valueOf(r0)
            java.lang.String r1 = "Corruption reported by sqlite on database: "
            java.lang.String r0 = r1.concat(r0)
            java.lang.String r1 = "SupportSQLite"
            android.util.Log.e(r1, r0)
            android.database.sqlite.SQLiteDatabase r0 = r3.f12902a
            boolean r0 = r0.isOpen()
            if (r0 != 0) goto L_0x0032
            android.database.sqlite.SQLiteDatabase r3 = r3.f12902a
            java.lang.String r3 = r3.getPath()
        L_0x002e:
            androidx.p186q.p187a.C4050e.m11599c(r3)
            return
        L_0x0032:
            r0 = 0
            android.database.sqlite.SQLiteDatabase r1 = r3.f12902a     // Catch:{ SQLiteException -> 0x003c, all -> 0x003a }
            java.util.List r0 = r1.getAttachedDbs()     // Catch:{ SQLiteException -> 0x003c, all -> 0x003a }
            goto L_0x003c
        L_0x003a:
            r1 = move-exception
            goto L_0x0042
        L_0x003c:
            android.database.sqlite.SQLiteDatabase r1 = r3.f12902a     // Catch:{ IOException -> 0x0066, all -> 0x003a }
            r1.close()     // Catch:{ IOException -> 0x0066, all -> 0x003a }
            goto L_0x0067
        L_0x0042:
            if (r0 == 0) goto L_0x005c
            java.util.Iterator r3 = r0.iterator()
        L_0x0048:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x0065
            java.lang.Object r0 = r3.next()
            android.util.Pair r0 = (android.util.Pair) r0
            java.lang.Object r0 = r0.second
            java.lang.String r0 = (java.lang.String) r0
            androidx.p186q.p187a.C4050e.m11599c(r0)
            goto L_0x0048
        L_0x005c:
            android.database.sqlite.SQLiteDatabase r3 = r3.f12902a
            java.lang.String r3 = r3.getPath()
            androidx.p186q.p187a.C4050e.m11599c(r3)
        L_0x0065:
            throw r1
        L_0x0066:
        L_0x0067:
            if (r0 == 0) goto L_0x0082
            java.util.Iterator r3 = r0.iterator()
        L_0x006d:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x0081
            java.lang.Object r0 = r3.next()
            android.util.Pair r0 = (android.util.Pair) r0
            java.lang.Object r0 = r0.second
            java.lang.String r0 = (java.lang.String) r0
            androidx.p186q.p187a.C4050e.m11599c(r0)
            goto L_0x006d
        L_0x0081:
            return
        L_0x0082:
            android.database.sqlite.SQLiteDatabase r3 = r3.f12902a
            java.lang.String r3 = r3.getPath()
            goto L_0x002e
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.p186q.p187a.p188a.C4037f.onCorruption(android.database.sqlite.SQLiteDatabase):void");
    }
}
