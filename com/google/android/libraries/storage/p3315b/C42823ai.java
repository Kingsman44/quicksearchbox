package com.google.android.libraries.storage.p3315b;

import android.app.ActivityManager;
import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.res.Configuration;
import android.database.DatabaseErrorHandler;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.database.sqlite.SQLiteDiskIOException;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteFullException;
import android.database.sqlite.SQLiteOutOfMemoryException;
import android.database.sqlite.SQLiteTableLockedException;
import com.google.apps.tiktok.tracing.C47558bi;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.apps.tiktok.tracing.C47831fm;
import com.google.common.base.C58833ax;
import com.google.common.base.C58838bb;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58724pq;
import com.google.common.p4522b.C58801sm;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60803ak;
import com.google.common.util.concurrent.C60817ay;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60845bz;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60904dr;
import com.google.common.util.concurrent.C60922j;
import com.google.common.util.concurrent.C60930r;
import java.io.Closeable;
import java.io.File;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

@Deprecated
/* renamed from: com.google.android.libraries.storage.b.ai */
/* compiled from: PG */
public final class C42823ai implements ComponentCallbacks2 {

    /* renamed from: a */
    public static final C59071e f112084a = C59071e.m91332i("com.google.android.libraries.storage.b.ai");

    /* renamed from: b */
    public final Context f112085b;

    /* renamed from: c */
    public final ScheduledExecutorService f112086c;

    /* renamed from: d */
    public final C42822ah f112087d;

    /* renamed from: e */
    public final C58833ax f112088e;

    /* renamed from: f */
    public final List f112089f;

    /* renamed from: g */
    public final List f112090g;

    /* renamed from: h */
    public final C42829ao f112091h;

    /* renamed from: i */
    public final String f112092i;

    /* renamed from: j */
    public final Set f112093j = new HashSet();

    /* renamed from: k */
    public final Object f112094k = new Object();

    /* renamed from: l */
    public final Executor f112095l;

    /* renamed from: m */
    public C60870cx f112096m;

    /* renamed from: n */
    public int f112097n = 0;

    /* renamed from: o */
    public boolean f112098o = false;

    /* renamed from: p */
    public boolean f112099p;

    /* renamed from: q */
    public final C42815aa f112100q = new C42815aa(this);

    /* renamed from: r */
    private final C60930r f112101r;

    /* renamed from: s */
    private final C60845bz f112102s = new C42816ab(this);

    /* renamed from: t */
    private boolean f112103t = false;

    /* renamed from: u */
    private ScheduledFuture f112104u;

    @Deprecated
    public C42823ai(Context context, ScheduledExecutorService scheduledExecutorService, C42822ah ahVar, C60930r rVar, C42835au auVar, String str) {
        this.f112101r = rVar;
        this.f112086c = scheduledExecutorService;
        this.f112087d = ahVar;
        this.f112095l = new C60904dr(scheduledExecutorService);
        this.f112085b = context;
        this.f112088e = auVar.f112118a;
        this.f112089f = auVar.f112119b;
        this.f112090g = auVar.f112120c;
        this.f112091h = auVar.f112121d;
        this.f112092i = str;
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: a */
    public static SQLiteDatabase m75657a(Context context, File file, C42829ao aoVar, C58833ax axVar, List list, List list2) {
        C47558bi a;
        C47558bi a2;
        SQLiteDatabase i = m75662i(context, aoVar, file);
        try {
            if (axVar.mo56113h() && ((C42830ap) axVar.mo56107c()).f112114a > i.getVersion()) {
                a2 = C47831fm.m85006a("Dropping tables.");
                i.close();
                m75659f(file);
                i = m75662i(context, aoVar, file);
                i.setVersion(((C42830ap) axVar.mo56107c()).f112114a);
                a2.close();
            }
            try {
                if (m75663j(i, aoVar, axVar, list, list2)) {
                    i.close();
                    i = m75662i(context, aoVar, file);
                    try {
                        a = C47831fm.m85006a("Configuring reopened database.");
                        C58838bb.m90884s(!m75663j(i, aoVar, axVar, list, list2), "Reopen request for a database that was already reopened after upgrade. Upgrade did not take despite error-free completion of the upgrade transaction.");
                        a.close();
                    } catch (SQLiteException | IllegalStateException e) {
                        i.close();
                        throw new C42818ad("Failed to open database.", e);
                    } catch (Throwable th) {
                        i.close();
                        throw th;
                    }
                }
                return i;
            } catch (SQLiteException e2) {
                i.close();
                throw new C42818ad("Failed to open database.", e2);
            } catch (Throwable th2) {
                i.close();
                throw th2;
            }
            throw th;
            throw th;
        } catch (C42819ae e3) {
            throw new C42818ad("Failed to drop tables to apply new schema.", e3);
        } catch (Throwable th3) {
            C42863r.m75716a(th, th3);
        }
    }

    /* renamed from: f */
    public static void m75659f(File file) {
        File file2 = new File(String.valueOf(file.getPath()).concat("-wal"));
        File file3 = new File(String.valueOf(file.getPath()).concat("-journal"));
        File file4 = new File(String.valueOf(file.getPath()).concat("-shm"));
        try {
            if ((file2.exists() && !file2.delete()) || ((file3.exists() && !file3.delete()) || ((file4.exists() && !file4.delete()) || !file.delete()))) {
                throw new C42819ae(String.format("Unable to clean up database %s", new Object[]{file.getAbsolutePath()}));
            }
        } catch (Throwable th) {
            throw new C42819ae(String.format("Unable to clean up database %s", new Object[]{file.getAbsolutePath()}), th);
        }
    }

    /* renamed from: g */
    public static boolean m75660g(Context context, C42829ao aoVar) {
        int i = aoVar.f112113b;
        return !((ActivityManager) context.getSystemService("activity")).isLowRamDevice();
    }

    /* renamed from: h */
    private static int m75661h(SQLiteDatabase sQLiteDatabase, C58833ax axVar) {
        if (axVar.mo56113h()) {
            return sQLiteDatabase.getVersion() - ((C42830ap) axVar.mo56107c()).f112114a;
        }
        return sQLiteDatabase.getVersion();
    }

    /* renamed from: i */
    private static SQLiteDatabase m75662i(Context context, C42829ao aoVar, File file) {
        boolean g = m75660g(context, aoVar);
        int i = g ? 805306368 : 268435456;
        file.getParentFile().mkdirs();
        try {
            SQLiteDatabase openDatabase = SQLiteDatabase.openDatabase(file.getPath(), (SQLiteDatabase.CursorFactory) null, i, (DatabaseErrorHandler) null);
            if (g) {
                openDatabase.enableWriteAheadLogging();
            }
            return openDatabase;
        } catch (Throwable th) {
            throw new C42818ad("Failed to open database.", th);
        }
    }

    /* renamed from: j */
    private static boolean m75663j(SQLiteDatabase sQLiteDatabase, C42829ao aoVar, C58833ax axVar, List list, List list2) {
        sQLiteDatabase.setForeignKeyConstraintsEnabled(true);
        for (String valueOf : aoVar.f112112a) {
            sQLiteDatabase.execSQL("PRAGMA ".concat(String.valueOf(valueOf)));
        }
        return m75664k(sQLiteDatabase, axVar, list, list2);
    }

    /* renamed from: k */
    private static boolean m75664k(SQLiteDatabase sQLiteDatabase, C58833ax axVar, List list, List list2) {
        C47558bi a;
        int h = m75661h(sQLiteDatabase, axVar);
        int i = ((C58724pq) list).f156474d;
        C58838bb.m90888w(h <= i, "Can't downgrade from version %s to version %s", h, i);
        C42847bf bfVar = new C42847bf(sQLiteDatabase);
        sQLiteDatabase.beginTransaction();
        try {
            if (h != ((C58724pq) list).f156474d) {
                a = C47831fm.m85006a("Applying upgrade steps");
                for (C42834at a2 : ((C58485gu) list).subList(h, ((C58724pq) list).f156474d)) {
                    a2.mo45917a(bfVar);
                }
                a.close();
                if (axVar.mo56113h()) {
                    sQLiteDatabase.setVersion(((C42830ap) axVar.mo56107c()).f112114a + ((C58724pq) list).f156474d);
                } else {
                    sQLiteDatabase.setVersion(((C58724pq) list).f156474d);
                }
            }
            C58801sm G = ((C58485gu) list2).listIterator(0);
            while (G.hasNext()) {
                C42833as asVar = (C42833as) G.next();
                if (!Thread.interrupted()) {
                    bfVar.f112138b.execSQL(asVar.f112117a);
                } else {
                    throw new InterruptedException();
                }
            }
            sQLiteDatabase.setTransactionSuccessful();
            sQLiteDatabase.endTransaction();
            return h != m75661h(sQLiteDatabase, axVar);
        } catch (InterruptedException e) {
            throw new C42821ag("Thread interrupted during database upgrade. Upgrade transaction will be unsuccessful.", e);
        } catch (SQLiteDatabaseLockedException e2) {
            e = e2;
            throw new C42821ag("An Exception was thrown during upgrade. This is probably recoverable by the user clearing disk space or when another process releases a database lock.", e);
        } catch (SQLiteDiskIOException e3) {
            e = e3;
            throw new C42821ag("An Exception was thrown during upgrade. This is probably recoverable by the user clearing disk space or when another process releases a database lock.", e);
        } catch (SQLiteFullException e4) {
            e = e4;
            throw new C42821ag("An Exception was thrown during upgrade. This is probably recoverable by the user clearing disk space or when another process releases a database lock.", e);
        } catch (SQLiteOutOfMemoryException e5) {
            e = e5;
            throw new C42821ag("An Exception was thrown during upgrade. This is probably recoverable by the user clearing disk space or when another process releases a database lock.", e);
        } catch (SQLiteTableLockedException e6) {
            e = e6;
            throw new C42821ag("An Exception was thrown during upgrade. This is probably recoverable by the user clearing disk space or when another process releases a database lock.", e);
        } catch (Throwable th) {
            try {
                throw new C42820af(th);
            } catch (Throwable th2) {
                sQLiteDatabase.endTransaction();
                throw th2;
            }
        }
        throw th;
    }

    /* renamed from: c */
    public final C60817ay mo45899c() {
        C60870cx cxVar;
        C60870cx cxVar2;
        WeakHashMap weakHashMap = C47831fm.f123851a;
        C47558bi biVar = null;
        try {
            synchronized (this.f112094k) {
                int i = this.f112097n + 1;
                this.f112097n = i;
                if (this.f112096m == null) {
                    C58838bb.m90884s(i == 1, "DB was null with nonzero refcount");
                    biVar = C47831fm.m85006a("Opening database");
                    try {
                        C60870cx n = C60856cj.m92905n(this.f112101r, this.f112095l);
                        C60856cj.m92911t(n, this.f112102s, this.f112086c);
                        cxVar2 = C60922j.m93044g(n, C47810es.m84963c(new C42870y(this)), this.f112095l);
                    } catch (Exception e) {
                        cxVar2 = C60856cj.m92899h(e);
                    }
                    this.f112096m = cxVar2;
                }
                cxVar = this.f112096m;
                ScheduledFuture scheduledFuture = this.f112104u;
                if (scheduledFuture != null) {
                    scheduledFuture.cancel(true);
                }
            }
            C60870cx j = C60856cj.m92901j(cxVar);
            if (biVar != null) {
                biVar.mo51417a(j);
            }
            C60817ay f = m75658b(j, new C42866u(this)).mo57273f(C47810es.m84968h(new C42867v(this)), C60826bg.f164896a);
            if (biVar != null) {
                biVar.close();
            }
            return f;
        } catch (Throwable th) {
            if (biVar != null) {
                biVar.close();
            }
            throw th;
        }
    }

    /* renamed from: d */
    public final void mo45900d() {
        if (this.f112097n == 0 && this.f112096m != null) {
            if (this.f112103t) {
                mo45901e();
                return;
            }
            this.f112104u = this.f112086c.schedule(new C42868w(this), 60, TimeUnit.SECONDS);
            if (!this.f112099p) {
                C60856cj.m92911t(this.f112096m, new C42817ac(this), this.f112095l);
            }
        }
    }

    /* renamed from: e */
    public final void mo45901e() {
        this.f112095l.execute(new C42869x(this));
    }

    public final void onConfigurationChanged(Configuration configuration) {
    }

    public final void onLowMemory() {
        onTrimMemory(80);
    }

    public final void onTrimMemory(int i) {
        synchronized (this.f112094k) {
            this.f112103t = i >= 40;
            mo45900d();
        }
    }

    /* renamed from: b */
    public static C60817ay m75658b(C60870cx cxVar, Closeable... closeableArr) {
        cxVar.getClass();
        return new C60817ay((C60803ak) new C42864s(closeableArr), (Executor) C60826bg.f164896a).mo57273f(new C42865t(cxVar), C60826bg.f164896a);
    }
}
