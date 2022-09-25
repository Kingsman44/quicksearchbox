package androidx.p186q.p187a.p188a;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import androidx.p182p.C3928ak;
import androidx.p186q.p187a.C4050e;
import androidx.p186q.p189b.C4058a;
import java.io.File;
import java.util.Map;
import java.util.UUID;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: androidx.q.a.a.j */
/* compiled from: PG */
final class C4041j extends SQLiteOpenHelper {

    /* renamed from: a */
    private final Context f12914a;

    /* renamed from: b */
    private final C4036e f12915b;

    /* renamed from: c */
    private final C4050e f12916c;

    /* renamed from: d */
    private final boolean f12917d;

    /* renamed from: e */
    private boolean f12918e;

    /* renamed from: f */
    private final C4058a f12919f;

    /* renamed from: g */
    private boolean f12920g;

    public C4041j(Context context, String str, C4036e eVar, C4050e eVar2, boolean z) {
        super(context, str, (SQLiteDatabase.CursorFactory) null, eVar2.f12934e, new C4037f(eVar2, eVar));
        this.f12914a = context;
        this.f12915b = eVar;
        this.f12916c = eVar2;
        this.f12917d = z;
        if (str == null) {
            str = UUID.randomUUID().toString();
            C69664n.m101060f(str, "randomUUID().toString()");
        }
        File cacheDir = context.getCacheDir();
        C69664n.m101060f(cacheDir, "context.cacheDir");
        this.f12919f = new C4058a(str, cacheDir);
    }

    /* renamed from: c */
    private final SQLiteDatabase m11567c() {
        SQLiteDatabase writableDatabase = super.getWritableDatabase();
        C69664n.m101060f(writableDatabase, "{\n                super.…eDatabase()\n            }");
        return writableDatabase;
    }

    /* renamed from: a */
    public final C4035d mo8483a(SQLiteDatabase sQLiteDatabase) {
        C69664n.m101061g(sQLiteDatabase, "sqLiteDatabase");
        return C4040i.m11566a(this.f12915b, sQLiteDatabase);
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(7:17|18|19|20|21|22|23) */
    /* JADX WARNING: Code restructure failed: missing block: B:18:?, code lost:
        super.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:?, code lost:
        java.lang.Thread.sleep(500);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:?, code lost:
        r0 = m11567c();
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x004d */
    /* JADX WARNING: Missing exception handler attribute for start block: B:22:0x0055 */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final androidx.p186q.p187a.C4049d mo8484b() {
        /*
            r6 = this;
            java.lang.String r0 = "Invalid database parent file, not a directory: "
            androidx.q.b.a r1 = r6.f12919f     // Catch:{ all -> 0x00b0 }
            boolean r2 = r6.f12920g     // Catch:{ all -> 0x00b0 }
            r3 = 1
            r4 = 0
            if (r2 != 0) goto L_0x0012
            java.lang.String r2 = r6.getDatabaseName()     // Catch:{ all -> 0x00b0 }
            if (r2 == 0) goto L_0x0012
            r2 = 1
            goto L_0x0013
        L_0x0012:
            r2 = 0
        L_0x0013:
            r1.mo8492a(r2)     // Catch:{ all -> 0x00b0 }
            r6.f12918e = r4     // Catch:{ all -> 0x00b0 }
            java.lang.String r1 = r6.getDatabaseName()     // Catch:{ all -> 0x00b0 }
            if (r1 == 0) goto L_0x0048
            android.content.Context r2 = r6.f12914a     // Catch:{ all -> 0x00b0 }
            java.io.File r2 = r2.getDatabasePath(r1)     // Catch:{ all -> 0x00b0 }
            java.io.File r2 = r2.getParentFile()     // Catch:{ all -> 0x00b0 }
            if (r2 == 0) goto L_0x0048
            r2.mkdirs()     // Catch:{ all -> 0x00b0 }
            boolean r4 = r2.isDirectory()     // Catch:{ all -> 0x00b0 }
            if (r4 != 0) goto L_0x0048
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x00b0 }
            r4.<init>(r0)     // Catch:{ all -> 0x00b0 }
            r4.append(r2)     // Catch:{ all -> 0x00b0 }
            java.lang.String r4 = "SupportSQLite"
            java.lang.String r2 = r2.toString()     // Catch:{ all -> 0x00b0 }
            java.lang.String r0 = r0.concat(r2)     // Catch:{ all -> 0x00b0 }
            android.util.Log.w(r4, r0)     // Catch:{ all -> 0x00b0 }
        L_0x0048:
            android.database.sqlite.SQLiteDatabase r0 = r6.m11567c()     // Catch:{ all -> 0x004d }
            goto L_0x0092
        L_0x004d:
            super.close()     // Catch:{ all -> 0x00b0 }
            r4 = 500(0x1f4, double:2.47E-321)
            java.lang.Thread.sleep(r4)     // Catch:{ InterruptedException -> 0x0055 }
        L_0x0055:
            android.database.sqlite.SQLiteDatabase r0 = r6.m11567c()     // Catch:{ all -> 0x005a }
            goto L_0x0092
        L_0x005a:
            r0 = move-exception
            super.close()     // Catch:{ all -> 0x00b0 }
            boolean r2 = r0 instanceof androidx.p186q.p187a.p188a.C4038g     // Catch:{ all -> 0x00b0 }
            if (r2 == 0) goto L_0x007f
            androidx.q.a.a.g r0 = (androidx.p186q.p187a.p188a.C4038g) r0     // Catch:{ all -> 0x00b0 }
            java.lang.Throwable r2 = r0.f12907b     // Catch:{ all -> 0x00b0 }
            androidx.q.a.a.h r0 = r0.f12906a     // Catch:{ all -> 0x00b0 }
            androidx.q.a.a.h r4 = androidx.p186q.p187a.p188a.C4039h.ON_CONFIGURE     // Catch:{ all -> 0x00b0 }
            int r0 = r0.ordinal()     // Catch:{ all -> 0x00b0 }
            if (r0 == 0) goto L_0x007e
            if (r0 == r3) goto L_0x007e
            r3 = 2
            if (r0 == r3) goto L_0x007e
            r3 = 3
            if (r0 == r3) goto L_0x007e
            boolean r0 = r2 instanceof android.database.sqlite.SQLiteException     // Catch:{ all -> 0x00b0 }
            if (r0 == 0) goto L_0x007d
            goto L_0x0089
        L_0x007d:
            throw r2     // Catch:{ all -> 0x00b0 }
        L_0x007e:
            throw r2     // Catch:{ all -> 0x00b0 }
        L_0x007f:
            boolean r2 = r0 instanceof android.database.sqlite.SQLiteException     // Catch:{ all -> 0x00b0 }
            if (r2 == 0) goto L_0x00af
            if (r1 == 0) goto L_0x00ae
            boolean r2 = r6.f12917d     // Catch:{ all -> 0x00b0 }
            if (r2 == 0) goto L_0x00ae
        L_0x0089:
            android.content.Context r0 = r6.f12914a     // Catch:{ all -> 0x00b0 }
            r0.deleteDatabase(r1)     // Catch:{ all -> 0x00b0 }
            android.database.sqlite.SQLiteDatabase r0 = r6.m11567c()     // Catch:{ g -> 0x00aa }
        L_0x0092:
            boolean r1 = r6.f12918e     // Catch:{ all -> 0x00b0 }
            if (r1 == 0) goto L_0x00a3
            r6.close()     // Catch:{ all -> 0x00b0 }
            androidx.q.a.d r0 = r6.mo8484b()     // Catch:{ all -> 0x00b0 }
            androidx.q.b.a r1 = r6.f12919f
        L_0x009f:
            r1.mo8493b()
            return r0
        L_0x00a3:
            androidx.q.a.a.d r0 = r6.mo8483a(r0)     // Catch:{ all -> 0x00b0 }
            androidx.q.b.a r1 = r6.f12919f
            goto L_0x009f
        L_0x00aa:
            r0 = move-exception
            java.lang.Throwable r0 = r0.f12907b     // Catch:{ all -> 0x00b0 }
            throw r0     // Catch:{ all -> 0x00b0 }
        L_0x00ae:
            throw r0     // Catch:{ all -> 0x00b0 }
        L_0x00af:
            throw r0     // Catch:{ all -> 0x00b0 }
        L_0x00b0:
            r0 = move-exception
            androidx.q.b.a r1 = r6.f12919f
            r1.mo8493b()
            goto L_0x00b8
        L_0x00b7:
            throw r0
        L_0x00b8:
            goto L_0x00b7
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.p186q.p187a.p188a.C4041j.mo8484b():androidx.q.a.d");
    }

    public final void close() {
        try {
            C4058a aVar = this.f12919f;
            Map map = C4058a.f12940a;
            boolean z = aVar.f12941b;
            aVar.mo8492a(false);
            super.close();
            this.f12915b.f12903a = null;
            this.f12920g = false;
        } finally {
            this.f12919f.mo8493b();
        }
    }

    public final void onConfigure(SQLiteDatabase sQLiteDatabase) {
        C69664n.m101061g(sQLiteDatabase, "db");
        try {
            mo8483a(sQLiteDatabase);
        } catch (Throwable th) {
            throw new C4038g(C4039h.ON_CONFIGURE, th);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0062, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:?, code lost:
        p5462h.p5472e.C69598b.m101013a(r1, r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0066, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onCreate(android.database.sqlite.SQLiteDatabase r5) {
        /*
            r4 = this;
            java.lang.String r0 = "sqLiteDatabase"
            p5462h.p5473f.p5475b.C69664n.m101061g(r5, r0)
            androidx.q.a.e r0 = r4.f12916c     // Catch:{ all -> 0x0067 }
            androidx.q.a.a.d r5 = r4.mo8483a(r5)     // Catch:{ all -> 0x0067 }
            java.lang.String r1 = "SELECT count(*) FROM sqlite_master WHERE name != 'android_metadata'"
            android.database.Cursor r1 = r5.mo8242b(r1)     // Catch:{ all -> 0x0067 }
            java.lang.String r2 = "db.query(\n              …_metadata'\"\n            )"
            p5462h.p5473f.p5475b.C69664n.m101060f(r1, r2)     // Catch:{ all -> 0x0067 }
            boolean r2 = r1.moveToFirst()     // Catch:{ all -> 0x0060 }
            r3 = 0
            if (r2 == 0) goto L_0x0024
            int r2 = r1.getInt(r3)     // Catch:{ all -> 0x0060 }
            if (r2 != 0) goto L_0x0024
            r3 = 1
        L_0x0024:
            r2 = 0
            p5462h.p5472e.C69598b.m101013a(r1, r2)     // Catch:{ all -> 0x0067 }
            r1 = r0
            androidx.p.ak r1 = (androidx.p182p.C3928ak) r1     // Catch:{ all -> 0x0067 }
            androidx.p.ai r1 = r1.f12573b     // Catch:{ all -> 0x0067 }
            r1.mo8192b(r5)     // Catch:{ all -> 0x0067 }
            if (r3 != 0) goto L_0x0052
            r1 = r0
            androidx.p.ak r1 = (androidx.p182p.C3928ak) r1     // Catch:{ all -> 0x0067 }
            androidx.p.ai r1 = r1.f12573b     // Catch:{ all -> 0x0067 }
            androidx.p.aj r1 = r1.mo8191a(r5)     // Catch:{ all -> 0x0067 }
            boolean r2 = r1.f12570a     // Catch:{ all -> 0x0067 }
            if (r2 == 0) goto L_0x0040
            goto L_0x0052
        L_0x0040:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException     // Catch:{ all -> 0x0067 }
            java.lang.String r0 = "Pre-packaged database has an invalid schema: "
            java.lang.String r1 = r1.f12571b     // Catch:{ all -> 0x0067 }
            java.lang.String r1 = java.lang.String.valueOf(r1)     // Catch:{ all -> 0x0067 }
            java.lang.String r0 = r0.concat(r1)     // Catch:{ all -> 0x0067 }
            r5.<init>(r0)     // Catch:{ all -> 0x0067 }
            throw r5     // Catch:{ all -> 0x0067 }
        L_0x0052:
            r1 = r0
            androidx.p.ak r1 = (androidx.p182p.C3928ak) r1     // Catch:{ all -> 0x0067 }
            r1.mo8198b(r5)     // Catch:{ all -> 0x0067 }
            androidx.p.ak r0 = (androidx.p182p.C3928ak) r0     // Catch:{ all -> 0x0067 }
            androidx.p.ai r5 = r0.f12573b     // Catch:{ all -> 0x0067 }
            r5.mo8196f()     // Catch:{ all -> 0x0067 }
            return
        L_0x0060:
            r5 = move-exception
            throw r5     // Catch:{ all -> 0x0062 }
        L_0x0062:
            r0 = move-exception
            p5462h.p5472e.C69598b.m101013a(r1, r5)     // Catch:{ all -> 0x0067 }
            throw r0     // Catch:{ all -> 0x0067 }
        L_0x0067:
            r5 = move-exception
            androidx.q.a.a.g r0 = new androidx.q.a.a.g
            androidx.q.a.a.h r1 = androidx.p186q.p187a.p188a.C4039h.ON_CREATE
            r0.<init>(r1, r5)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.p186q.p187a.p188a.C4041j.onCreate(android.database.sqlite.SQLiteDatabase):void");
    }

    public final void onDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        C69664n.m101061g(sQLiteDatabase, "db");
        this.f12918e = true;
        try {
            ((C3928ak) this.f12916c).mo8197a(mo8483a(sQLiteDatabase), i, i2);
        } catch (Throwable th) {
            throw new C4038g(C4039h.ON_DOWNGRADE, th);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0089, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:?, code lost:
        p5462h.p5472e.C69598b.m101013a(r3, r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x008d, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00c2, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:?, code lost:
        p5462h.p5472e.C69598b.m101013a(r3, r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x00c6, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onOpen(android.database.sqlite.SQLiteDatabase r8) {
        /*
            r7 = this;
            java.lang.String r0 = "Room cannot verify the data integrity. Looks like you've changed schema but forgot to update the version number. You can simply fix this by increasing the version number. Expected identity hash: "
            java.lang.String r1 = "db"
            p5462h.p5473f.p5475b.C69664n.m101061g(r8, r1)
            boolean r1 = r7.f12918e
            r2 = 1
            if (r1 != 0) goto L_0x00d0
            androidx.q.a.e r1 = r7.f12916c     // Catch:{ all -> 0x00c7 }
            androidx.q.a.a.d r8 = r7.mo8483a(r8)     // Catch:{ all -> 0x00c7 }
            java.lang.String r3 = "SELECT 1 FROM sqlite_master WHERE type = 'table' AND name='room_master_table'"
            android.database.Cursor r3 = r8.mo8242b(r3)     // Catch:{ all -> 0x00c7 }
            java.lang.String r4 = "db.query(\n              …LE_NAME }'\"\n            )"
            p5462h.p5473f.p5475b.C69664n.m101060f(r3, r4)     // Catch:{ all -> 0x00c7 }
            boolean r4 = r3.moveToFirst()     // Catch:{ all -> 0x00c0 }
            r5 = 0
            if (r4 == 0) goto L_0x002c
            int r4 = r3.getInt(r5)     // Catch:{ all -> 0x00c0 }
            if (r4 == 0) goto L_0x002c
            r4 = 1
            goto L_0x002d
        L_0x002c:
            r4 = 0
        L_0x002d:
            r6 = 0
            p5462h.p5472e.C69598b.m101013a(r3, r6)     // Catch:{ all -> 0x00c7 }
            if (r4 == 0) goto L_0x008e
            androidx.q.a.b r3 = new androidx.q.a.b     // Catch:{ all -> 0x00c7 }
            java.lang.String r4 = "SELECT identity_hash FROM room_master_table WHERE id = 42 LIMIT 1"
            r3.<init>(r4, r6)     // Catch:{ all -> 0x00c7 }
            android.database.Cursor r3 = r8.mo8241a(r3)     // Catch:{ all -> 0x00c7 }
            java.lang.String r4 = "db.query(\n              …READ_QUERY)\n            )"
            p5462h.p5473f.p5475b.C69664n.m101060f(r3, r4)     // Catch:{ all -> 0x00c7 }
            boolean r4 = r3.moveToFirst()     // Catch:{ all -> 0x0087 }
            if (r4 == 0) goto L_0x004e
            java.lang.String r4 = r3.getString(r5)     // Catch:{ all -> 0x0087 }
            goto L_0x004f
        L_0x004e:
            r4 = r6
        L_0x004f:
            p5462h.p5472e.C69598b.m101013a(r3, r6)     // Catch:{ all -> 0x00c7 }
            r3 = r1
            androidx.p.ak r3 = (androidx.p182p.C3928ak) r3     // Catch:{ all -> 0x00c7 }
            java.lang.String r3 = r3.f12574c     // Catch:{ all -> 0x00c7 }
            boolean r3 = p5462h.p5473f.p5475b.C69664n.m101066l(r3, r4)     // Catch:{ all -> 0x00c7 }
            if (r3 != 0) goto L_0x00a1
            r3 = r1
            androidx.p.ak r3 = (androidx.p182p.C3928ak) r3     // Catch:{ all -> 0x00c7 }
            java.lang.String r3 = r3.f12575d     // Catch:{ all -> 0x00c7 }
            boolean r3 = p5462h.p5473f.p5475b.C69664n.m101066l(r3, r4)     // Catch:{ all -> 0x00c7 }
            if (r3 == 0) goto L_0x0069
            goto L_0x00a1
        L_0x0069:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException     // Catch:{ all -> 0x00c7 }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x00c7 }
            r2.<init>(r0)     // Catch:{ all -> 0x00c7 }
            androidx.p.ak r1 = (androidx.p182p.C3928ak) r1     // Catch:{ all -> 0x00c7 }
            java.lang.String r0 = r1.f12574c     // Catch:{ all -> 0x00c7 }
            r2.append(r0)     // Catch:{ all -> 0x00c7 }
            java.lang.String r0 = ", found: "
            r2.append(r0)     // Catch:{ all -> 0x00c7 }
            r2.append(r4)     // Catch:{ all -> 0x00c7 }
            java.lang.String r0 = r2.toString()     // Catch:{ all -> 0x00c7 }
            r8.<init>(r0)     // Catch:{ all -> 0x00c7 }
            throw r8     // Catch:{ all -> 0x00c7 }
        L_0x0087:
            r8 = move-exception
            throw r8     // Catch:{ all -> 0x0089 }
        L_0x0089:
            r0 = move-exception
            p5462h.p5472e.C69598b.m101013a(r3, r8)     // Catch:{ all -> 0x00c7 }
            throw r0     // Catch:{ all -> 0x00c7 }
        L_0x008e:
            r0 = r1
            androidx.p.ak r0 = (androidx.p182p.C3928ak) r0     // Catch:{ all -> 0x00c7 }
            androidx.p.ai r0 = r0.f12573b     // Catch:{ all -> 0x00c7 }
            androidx.p.aj r0 = r0.mo8191a(r8)     // Catch:{ all -> 0x00c7 }
            boolean r3 = r0.f12570a     // Catch:{ all -> 0x00c7 }
            if (r3 == 0) goto L_0x00ae
            r0 = r1
            androidx.p.ak r0 = (androidx.p182p.C3928ak) r0     // Catch:{ all -> 0x00c7 }
            r0.mo8198b(r8)     // Catch:{ all -> 0x00c7 }
        L_0x00a1:
            r0 = r1
            androidx.p.ak r0 = (androidx.p182p.C3928ak) r0     // Catch:{ all -> 0x00c7 }
            androidx.p.ai r0 = r0.f12573b     // Catch:{ all -> 0x00c7 }
            r0.mo8194d(r8)     // Catch:{ all -> 0x00c7 }
            androidx.p.ak r1 = (androidx.p182p.C3928ak) r1     // Catch:{ all -> 0x00c7 }
            r1.f12572a = r6     // Catch:{ all -> 0x00c7 }
            goto L_0x00d0
        L_0x00ae:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException     // Catch:{ all -> 0x00c7 }
            java.lang.String r1 = "Pre-packaged database has an invalid schema: "
            java.lang.String r0 = r0.f12571b     // Catch:{ all -> 0x00c7 }
            java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch:{ all -> 0x00c7 }
            java.lang.String r0 = r1.concat(r0)     // Catch:{ all -> 0x00c7 }
            r8.<init>(r0)     // Catch:{ all -> 0x00c7 }
            throw r8     // Catch:{ all -> 0x00c7 }
        L_0x00c0:
            r8 = move-exception
            throw r8     // Catch:{ all -> 0x00c2 }
        L_0x00c2:
            r0 = move-exception
            p5462h.p5472e.C69598b.m101013a(r3, r8)     // Catch:{ all -> 0x00c7 }
            throw r0     // Catch:{ all -> 0x00c7 }
        L_0x00c7:
            r8 = move-exception
            androidx.q.a.a.g r0 = new androidx.q.a.a.g
            androidx.q.a.a.h r1 = androidx.p186q.p187a.p188a.C4039h.ON_OPEN
            r0.<init>(r1, r8)
            throw r0
        L_0x00d0:
            r7.f12920g = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.p186q.p187a.p188a.C4041j.onOpen(android.database.sqlite.SQLiteDatabase):void");
    }

    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        C69664n.m101061g(sQLiteDatabase, "sqLiteDatabase");
        this.f12918e = true;
        try {
            this.f12916c.mo8197a(mo8483a(sQLiteDatabase), i, i2);
        } catch (Throwable th) {
            throw new C4038g(C4039h.ON_UPGRADE, th);
        }
    }
}
