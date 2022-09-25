package androidx.work.impl.utils;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.util.Log;
import androidx.work.C4379ac;
import androidx.work.C4380ad;
import androidx.work.impl.C4452ag;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
public final class ForceStopRunnable implements Runnable {

    /* renamed from: a */
    private static final String f14412a = C4380ad.m12561i("ForceStopRunnable");

    /* renamed from: b */
    private static final long f14413b = TimeUnit.DAYS.toMillis(3650);

    /* renamed from: c */
    private final Context f14414c;

    /* renamed from: d */
    private final C4452ag f14415d;

    /* renamed from: e */
    private final C4610q f14416e;

    /* renamed from: f */
    private int f14417f = 0;

    /* compiled from: PG */
    public class BroadcastReceiver extends android.content.BroadcastReceiver {

        /* renamed from: a */
        private static final String f14418a = C4380ad.m12561i("ForceStopRunnable$Rcvr");

        public final void onReceive(Context context, Intent intent) {
            if (intent != null && "ACTION_FORCE_STOP_RESCHEDULE".equals(intent.getAction())) {
                C4380ad h = C4380ad.m12560h();
                String str = f14418a;
                if (((C4379ac) h).f14003a <= 2) {
                    Log.v(str, "Rescheduling alarm that keeps track of force-stops.");
                }
                ForceStopRunnable.m12953a(context);
            }
        }
    }

    public ForceStopRunnable(Context context, C4452ag agVar) {
        this.f14414c = context.getApplicationContext();
        this.f14415d = agVar;
        this.f14416e = agVar.f14146h;
    }

    /* renamed from: a */
    static void m12953a(Context context) {
        AlarmManager alarmManager = (AlarmManager) context.getSystemService("alarm");
        PendingIntent b = m12954b(context, Build.VERSION.SDK_INT >= 31 ? 167772160 : 134217728);
        long currentTimeMillis = System.currentTimeMillis() + f14413b;
        if (alarmManager != null) {
            alarmManager.setExact(0, currentTimeMillis, b);
        }
    }

    /* renamed from: b */
    private static PendingIntent m12954b(Context context, int i) {
        Intent intent = new Intent();
        intent.setComponent(new ComponentName(context, BroadcastReceiver.class));
        intent.setAction("ACTION_FORCE_STOP_RESCHEDULE");
        return PendingIntent.getBroadcast(context, -1, intent, i);
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(19:10|11|(7:13|(1:15)|16|(1:18)|131|19|(4:22|(1:133)(6:24|(1:26)|27|(1:29)(1:30)|31|134)|132|20))|32|33|34|35|36|37|38|(1:43)(1:42)|(3:45|(2:48|46)|135)|49|50|51|(1:(1:54)(3:55|57|(6:62|63|(1:65)(1:66)|67|(3:(1:70)|71|(5:75|(1:77)|139|(3:80|(1:85)(2:126|84)|78)|136))(1:(2:127|87))|(2:89|90)(1:128))(2:125|61)))|56|57|(0)(0)) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:10:0x0043 */
    /* JADX WARNING: Removed duplicated region for block: B:10:0x0043 A[LOOP:0: B:10:0x0043->B:123:0x0043, LOOP_LABEL: LOOP:0: B:10:0x0043->B:123:0x0043, LOOP_START, SYNTHETIC, Splitter:B:10:0x0043] */
    /* JADX WARNING: Removed duplicated region for block: B:125:0x01e2 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0054 A[Catch:{ SQLiteException -> 0x0331, all -> 0x0352 }] */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x0191 A[Catch:{ all -> 0x02c9, SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteTableLockedException -> 0x02ce }] */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x0193 A[Catch:{ all -> 0x02c9, SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteTableLockedException -> 0x02ce }] */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x0196 A[Catch:{ all -> 0x02c9, SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteTableLockedException -> 0x02ce }] */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x01c0 A[Catch:{ all -> 0x02c9, SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteTableLockedException -> 0x02ce }] */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x020a A[SYNTHETIC, Splitter:B:62:0x020a] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r15 = this;
            java.lang.String r0 = "last_force_stop_ms"
            java.lang.String r1 = "reschedule_needed"
            java.lang.String r2 = "context"
            java.lang.String r3 = "Is default app process = "
            androidx.work.impl.ag r4 = r15.f14415d     // Catch:{ all -> 0x0352 }
            androidx.work.e r4 = r4.f14142d     // Catch:{ all -> 0x0352 }
            java.lang.String r5 = r4.f14067g     // Catch:{ all -> 0x0352 }
            boolean r5 = android.text.TextUtils.isEmpty(r5)     // Catch:{ all -> 0x0352 }
            if (r5 == 0) goto L_0x0020
            androidx.work.ad r3 = androidx.work.C4380ad.m12560h()     // Catch:{ all -> 0x0352 }
            java.lang.String r4 = f14412a     // Catch:{ all -> 0x0352 }
            java.lang.String r5 = "The default process name was not specified."
            r3.mo9309a(r4, r5)     // Catch:{ all -> 0x0352 }
            goto L_0x0043
        L_0x0020:
            android.content.Context r5 = r15.f14414c     // Catch:{ all -> 0x0352 }
            boolean r4 = androidx.work.impl.utils.C4611r.m13005a(r5, r4)     // Catch:{ all -> 0x0352 }
            androidx.work.ad r5 = androidx.work.C4380ad.m12560h()     // Catch:{ all -> 0x0352 }
            java.lang.String r6 = f14412a     // Catch:{ all -> 0x0352 }
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ all -> 0x0352 }
            r7.<init>(r3)     // Catch:{ all -> 0x0352 }
            r7.append(r4)     // Catch:{ all -> 0x0352 }
            java.lang.String r3 = r7.toString()     // Catch:{ all -> 0x0352 }
            r5.mo9309a(r6, r3)     // Catch:{ all -> 0x0352 }
            if (r4 != 0) goto L_0x0043
            androidx.work.impl.ag r0 = r15.f14415d
        L_0x003f:
            r0.mo9392l()
            return
        L_0x0043:
            android.content.Context r3 = r15.f14414c     // Catch:{ SQLiteException -> 0x0331 }
            p5462h.p5473f.p5475b.C69664n.m101061g(r3, r2)     // Catch:{ SQLiteException -> 0x0331 }
            java.io.File r4 = androidx.work.impl.C4446aa.m12676a(r3)     // Catch:{ SQLiteException -> 0x0331 }
            boolean r4 = r4.exists()     // Catch:{ SQLiteException -> 0x0331 }
            r5 = 3
            r6 = 0
            if (r4 == 0) goto L_0x0162
            androidx.work.ad r4 = androidx.work.C4380ad.m12560h()     // Catch:{ SQLiteException -> 0x0331 }
            java.lang.String r7 = androidx.work.impl.C4447ab.f14134a     // Catch:{ SQLiteException -> 0x0331 }
            java.lang.String r8 = "Migrating WorkDatabase to the no-backup directory"
            r4.mo9309a(r7, r8)     // Catch:{ SQLiteException -> 0x0331 }
            p5462h.p5473f.p5475b.C69664n.m101061g(r3, r2)     // Catch:{ SQLiteException -> 0x0331 }
            java.io.File r4 = androidx.work.impl.C4446aa.m12676a(r3)     // Catch:{ SQLiteException -> 0x0331 }
            p5462h.p5473f.p5475b.C69664n.m101061g(r3, r2)     // Catch:{ SQLiteException -> 0x0331 }
            java.io.File r7 = new java.io.File     // Catch:{ SQLiteException -> 0x0331 }
            androidx.work.impl.a r8 = androidx.work.impl.C4414a.f14098a     // Catch:{ SQLiteException -> 0x0331 }
            java.io.File r3 = r8.mo9367a(r3)     // Catch:{ SQLiteException -> 0x0331 }
            java.lang.String r8 = "androidx.work.workdb"
            r7.<init>(r3, r8)     // Catch:{ SQLiteException -> 0x0331 }
            java.lang.String[] r3 = androidx.work.impl.C4447ab.f14135b     // Catch:{ SQLiteException -> 0x0331 }
            int r8 = r3.length     // Catch:{ SQLiteException -> 0x0331 }
            int r8 = p5462h.p5463a.C69505av.m100860b(r5)     // Catch:{ SQLiteException -> 0x0331 }
            r9 = 16
            if (r8 >= r9) goto L_0x0083
            r8 = 16
        L_0x0083:
            java.util.LinkedHashMap r9 = new java.util.LinkedHashMap     // Catch:{ SQLiteException -> 0x0331 }
            r9.<init>(r8)     // Catch:{ SQLiteException -> 0x0331 }
            r8 = 0
        L_0x0089:
            if (r8 >= r5) goto L_0x00c6
            r10 = r3[r8]     // Catch:{ SQLiteException -> 0x0331 }
            java.io.File r11 = new java.io.File     // Catch:{ SQLiteException -> 0x0331 }
            java.lang.String r12 = r4.getPath()     // Catch:{ SQLiteException -> 0x0331 }
            java.lang.String r12 = java.lang.String.valueOf(r12)     // Catch:{ SQLiteException -> 0x0331 }
            java.lang.String r13 = java.lang.String.valueOf(r10)     // Catch:{ SQLiteException -> 0x0331 }
            java.lang.String r12 = r12.concat(r13)     // Catch:{ SQLiteException -> 0x0331 }
            r11.<init>(r12)     // Catch:{ SQLiteException -> 0x0331 }
            java.io.File r12 = new java.io.File     // Catch:{ SQLiteException -> 0x0331 }
            java.lang.String r13 = r7.getPath()     // Catch:{ SQLiteException -> 0x0331 }
            java.lang.String r13 = java.lang.String.valueOf(r13)     // Catch:{ SQLiteException -> 0x0331 }
            java.lang.String r10 = java.lang.String.valueOf(r10)     // Catch:{ SQLiteException -> 0x0331 }
            java.lang.String r10 = r13.concat(r10)     // Catch:{ SQLiteException -> 0x0331 }
            r12.<init>(r10)     // Catch:{ SQLiteException -> 0x0331 }
            h.i r10 = new h.i     // Catch:{ SQLiteException -> 0x0331 }
            r10.<init>(r11, r12)     // Catch:{ SQLiteException -> 0x0331 }
            java.lang.Object r11 = r10.f186052a     // Catch:{ SQLiteException -> 0x0331 }
            java.lang.Object r10 = r10.f186053b     // Catch:{ SQLiteException -> 0x0331 }
            r9.put(r11, r10)     // Catch:{ SQLiteException -> 0x0331 }
            int r8 = r8 + 1
            goto L_0x0089
        L_0x00c6:
            h.i r3 = new h.i     // Catch:{ SQLiteException -> 0x0331 }
            r3.<init>(r4, r7)     // Catch:{ SQLiteException -> 0x0331 }
            java.util.Map r3 = p5462h.p5463a.C69505av.m100873o(r9, r3)     // Catch:{ SQLiteException -> 0x0331 }
            java.util.Set r3 = r3.entrySet()     // Catch:{ SQLiteException -> 0x0331 }
            java.util.Iterator r3 = r3.iterator()     // Catch:{ SQLiteException -> 0x0331 }
        L_0x00d7:
            boolean r4 = r3.hasNext()     // Catch:{ SQLiteException -> 0x0331 }
            if (r4 == 0) goto L_0x0162
            java.lang.Object r4 = r3.next()     // Catch:{ SQLiteException -> 0x0331 }
            java.util.Map$Entry r4 = (java.util.Map.Entry) r4     // Catch:{ SQLiteException -> 0x0331 }
            java.lang.Object r7 = r4.getKey()     // Catch:{ SQLiteException -> 0x0331 }
            java.io.File r7 = (java.io.File) r7     // Catch:{ SQLiteException -> 0x0331 }
            java.lang.Object r4 = r4.getValue()     // Catch:{ SQLiteException -> 0x0331 }
            java.io.File r4 = (java.io.File) r4     // Catch:{ SQLiteException -> 0x0331 }
            boolean r8 = r7.exists()     // Catch:{ SQLiteException -> 0x0331 }
            if (r8 == 0) goto L_0x00d7
            boolean r8 = r4.exists()     // Catch:{ SQLiteException -> 0x0331 }
            if (r8 == 0) goto L_0x0119
            androidx.work.ad r8 = androidx.work.C4380ad.m12560h()     // Catch:{ SQLiteException -> 0x0331 }
            java.lang.String r9 = androidx.work.impl.C4447ab.f14134a     // Catch:{ SQLiteException -> 0x0331 }
            java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch:{ SQLiteException -> 0x0331 }
            r10.<init>()     // Catch:{ SQLiteException -> 0x0331 }
            java.lang.String r11 = "Over-writing contents of "
            r10.append(r11)     // Catch:{ SQLiteException -> 0x0331 }
            r10.append(r4)     // Catch:{ SQLiteException -> 0x0331 }
            java.lang.String r10 = java.lang.String.valueOf(r4)     // Catch:{ SQLiteException -> 0x0331 }
            java.lang.String r10 = r11.concat(r10)     // Catch:{ SQLiteException -> 0x0331 }
            r8.mo9314f(r9, r10)     // Catch:{ SQLiteException -> 0x0331 }
        L_0x0119:
            boolean r8 = r7.renameTo(r4)     // Catch:{ SQLiteException -> 0x0331 }
            if (r8 == 0) goto L_0x0139
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch:{ SQLiteException -> 0x0331 }
            r8.<init>()     // Catch:{ SQLiteException -> 0x0331 }
            java.lang.String r9 = "Migrated "
            r8.append(r9)     // Catch:{ SQLiteException -> 0x0331 }
            r8.append(r7)     // Catch:{ SQLiteException -> 0x0331 }
            java.lang.String r7 = "to "
            r8.append(r7)     // Catch:{ SQLiteException -> 0x0331 }
            r8.append(r4)     // Catch:{ SQLiteException -> 0x0331 }
            java.lang.String r4 = r8.toString()     // Catch:{ SQLiteException -> 0x0331 }
            goto L_0x0157
        L_0x0139:
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch:{ SQLiteException -> 0x0331 }
            r8.<init>()     // Catch:{ SQLiteException -> 0x0331 }
            java.lang.String r9 = "Renaming "
            r8.append(r9)     // Catch:{ SQLiteException -> 0x0331 }
            r8.append(r7)     // Catch:{ SQLiteException -> 0x0331 }
            java.lang.String r7 = " to "
            r8.append(r7)     // Catch:{ SQLiteException -> 0x0331 }
            r8.append(r4)     // Catch:{ SQLiteException -> 0x0331 }
            java.lang.String r4 = " failed"
            r8.append(r4)     // Catch:{ SQLiteException -> 0x0331 }
            java.lang.String r4 = r8.toString()     // Catch:{ SQLiteException -> 0x0331 }
        L_0x0157:
            androidx.work.ad r7 = androidx.work.C4380ad.m12560h()     // Catch:{ SQLiteException -> 0x0331 }
            java.lang.String r8 = androidx.work.impl.C4447ab.f14134a     // Catch:{ SQLiteException -> 0x0331 }
            r7.mo9309a(r8, r4)     // Catch:{ SQLiteException -> 0x0331 }
            goto L_0x00d7
        L_0x0162:
            androidx.work.ad r3 = androidx.work.C4380ad.m12560h()     // Catch:{ all -> 0x0352 }
            java.lang.String r4 = f14412a     // Catch:{ all -> 0x0352 }
            java.lang.String r7 = "Performing cleanup operations."
            r3.mo9309a(r4, r7)     // Catch:{ all -> 0x0352 }
            r3 = 1
            android.content.Context r4 = r15.f14414c     // Catch:{ SQLiteCantOpenDatabaseException -> 0x02da, SQLiteDiskIOException -> 0x02d8, SQLiteDatabaseCorruptException -> 0x02d6, SQLiteDatabaseLockedException -> 0x02d4, SQLiteTableLockedException -> 0x02d2, SQLiteConstraintException -> 0x02d0, SQLiteAccessPermException -> 0x02ce }
            androidx.work.impl.ag r7 = r15.f14415d     // Catch:{ SQLiteCantOpenDatabaseException -> 0x02da, SQLiteDiskIOException -> 0x02d8, SQLiteDatabaseCorruptException -> 0x02d6, SQLiteDatabaseLockedException -> 0x02d4, SQLiteTableLockedException -> 0x02d2, SQLiteConstraintException -> 0x02d0, SQLiteAccessPermException -> 0x02ce }
            boolean r4 = androidx.work.impl.background.systemjob.C4535b.m12895f(r4, r7)     // Catch:{ SQLiteCantOpenDatabaseException -> 0x02da, SQLiteDiskIOException -> 0x02d8, SQLiteDatabaseCorruptException -> 0x02d6, SQLiteDatabaseLockedException -> 0x02d4, SQLiteTableLockedException -> 0x02d2, SQLiteConstraintException -> 0x02d0, SQLiteAccessPermException -> 0x02ce }
            androidx.work.impl.ag r7 = r15.f14415d     // Catch:{ SQLiteCantOpenDatabaseException -> 0x02da, SQLiteDiskIOException -> 0x02d8, SQLiteDatabaseCorruptException -> 0x02d6, SQLiteDatabaseLockedException -> 0x02d4, SQLiteTableLockedException -> 0x02d2, SQLiteConstraintException -> 0x02d0, SQLiteAccessPermException -> 0x02ce }
            androidx.work.impl.WorkDatabase r7 = r7.f14143e     // Catch:{ SQLiteCantOpenDatabaseException -> 0x02da, SQLiteDiskIOException -> 0x02d8, SQLiteDatabaseCorruptException -> 0x02d6, SQLiteDatabaseLockedException -> 0x02d4, SQLiteTableLockedException -> 0x02d2, SQLiteConstraintException -> 0x02d0, SQLiteAccessPermException -> 0x02ce }
            androidx.work.impl.b.af r8 = r7.mo9364F()     // Catch:{ SQLiteCantOpenDatabaseException -> 0x02da, SQLiteDiskIOException -> 0x02d8, SQLiteDatabaseCorruptException -> 0x02d6, SQLiteDatabaseLockedException -> 0x02d4, SQLiteTableLockedException -> 0x02d2, SQLiteConstraintException -> 0x02d0, SQLiteAccessPermException -> 0x02ce }
            androidx.work.impl.b.x r9 = r7.mo9363E()     // Catch:{ SQLiteCantOpenDatabaseException -> 0x02da, SQLiteDiskIOException -> 0x02d8, SQLiteDatabaseCorruptException -> 0x02d6, SQLiteDatabaseLockedException -> 0x02d4, SQLiteTableLockedException -> 0x02d2, SQLiteConstraintException -> 0x02d0, SQLiteAccessPermException -> 0x02ce }
            r7.mo8181p()     // Catch:{ SQLiteCantOpenDatabaseException -> 0x02da, SQLiteDiskIOException -> 0x02d8, SQLiteDatabaseCorruptException -> 0x02d6, SQLiteDatabaseLockedException -> 0x02d4, SQLiteTableLockedException -> 0x02d2, SQLiteConstraintException -> 0x02d0, SQLiteAccessPermException -> 0x02ce }
            java.util.List r10 = r8.mo9426f()     // Catch:{ all -> 0x02c9 }
            if (r10 == 0) goto L_0x0193
            boolean r11 = r10.isEmpty()     // Catch:{ all -> 0x02c9 }
            if (r11 != 0) goto L_0x0193
            r11 = 1
            goto L_0x0194
        L_0x0193:
            r11 = 0
        L_0x0194:
            if (r11 == 0) goto L_0x01b5
            java.util.Iterator r10 = r10.iterator()     // Catch:{ all -> 0x02c9 }
        L_0x019a:
            boolean r12 = r10.hasNext()     // Catch:{ all -> 0x02c9 }
            if (r12 == 0) goto L_0x01b5
            java.lang.Object r12 = r10.next()     // Catch:{ all -> 0x02c9 }
            androidx.work.impl.b.ae r12 = (androidx.work.impl.p207b.C4470ae) r12     // Catch:{ all -> 0x02c9 }
            androidx.work.ar r13 = androidx.work.C4394ar.ENQUEUED     // Catch:{ all -> 0x02c9 }
            java.lang.String r14 = r12.f14217b     // Catch:{ all -> 0x02c9 }
            r8.mo9445y(r13, r14)     // Catch:{ all -> 0x02c9 }
            java.lang.String r12 = r12.f14217b     // Catch:{ all -> 0x02c9 }
            r13 = -1
            r8.mo9442v(r12, r13)     // Catch:{ all -> 0x02c9 }
            goto L_0x019a
        L_0x01b5:
            r9.mo9406b()     // Catch:{ all -> 0x02c9 }
            r7.mo8188w()     // Catch:{ all -> 0x02c9 }
            r7.mo8183r()     // Catch:{ SQLiteCantOpenDatabaseException -> 0x02da, SQLiteDiskIOException -> 0x02d8, SQLiteDatabaseCorruptException -> 0x02d6, SQLiteDatabaseLockedException -> 0x02d4, SQLiteTableLockedException -> 0x02d2, SQLiteConstraintException -> 0x02d0, SQLiteAccessPermException -> 0x02ce }
            if (r11 != 0) goto L_0x01c5
            if (r4 == 0) goto L_0x01c3
            goto L_0x01c5
        L_0x01c3:
            r4 = 0
            goto L_0x01c6
        L_0x01c5:
            r4 = 1
        L_0x01c6:
            androidx.work.impl.ag r7 = r15.f14415d     // Catch:{ SQLiteCantOpenDatabaseException -> 0x02da, SQLiteDiskIOException -> 0x02d8, SQLiteDatabaseCorruptException -> 0x02d6, SQLiteDatabaseLockedException -> 0x02d4, SQLiteTableLockedException -> 0x02d2, SQLiteConstraintException -> 0x02d0, SQLiteAccessPermException -> 0x02ce }
            androidx.work.impl.utils.q r7 = r7.f14146h     // Catch:{ SQLiteCantOpenDatabaseException -> 0x02da, SQLiteDiskIOException -> 0x02d8, SQLiteDatabaseCorruptException -> 0x02d6, SQLiteDatabaseLockedException -> 0x02d4, SQLiteTableLockedException -> 0x02d2, SQLiteConstraintException -> 0x02d0, SQLiteAccessPermException -> 0x02ce }
            androidx.work.impl.WorkDatabase r7 = r7.f14502a     // Catch:{ SQLiteCantOpenDatabaseException -> 0x02da, SQLiteDiskIOException -> 0x02d8, SQLiteDatabaseCorruptException -> 0x02d6, SQLiteDatabaseLockedException -> 0x02d4, SQLiteTableLockedException -> 0x02d2, SQLiteConstraintException -> 0x02d0, SQLiteAccessPermException -> 0x02ce }
            androidx.work.impl.b.f r7 = r7.mo9359A()     // Catch:{ SQLiteCantOpenDatabaseException -> 0x02da, SQLiteDiskIOException -> 0x02d8, SQLiteDatabaseCorruptException -> 0x02d6, SQLiteDatabaseLockedException -> 0x02d4, SQLiteTableLockedException -> 0x02d2, SQLiteConstraintException -> 0x02d0, SQLiteAccessPermException -> 0x02ce }
            java.lang.Long r7 = r7.mo9456a(r1)     // Catch:{ SQLiteCantOpenDatabaseException -> 0x02da, SQLiteDiskIOException -> 0x02d8, SQLiteDatabaseCorruptException -> 0x02d6, SQLiteDatabaseLockedException -> 0x02d4, SQLiteTableLockedException -> 0x02d2, SQLiteConstraintException -> 0x02d0, SQLiteAccessPermException -> 0x02ce }
            r8 = 0
            if (r7 == 0) goto L_0x020a
            long r10 = r7.longValue()     // Catch:{ SQLiteCantOpenDatabaseException -> 0x02da, SQLiteDiskIOException -> 0x02d8, SQLiteDatabaseCorruptException -> 0x02d6, SQLiteDatabaseLockedException -> 0x02d4, SQLiteTableLockedException -> 0x02d2, SQLiteConstraintException -> 0x02d0, SQLiteAccessPermException -> 0x02ce }
            r12 = 1
            int r7 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r7 != 0) goto L_0x020a
            androidx.work.ad r4 = androidx.work.C4380ad.m12560h()     // Catch:{ SQLiteCantOpenDatabaseException -> 0x02da, SQLiteDiskIOException -> 0x02d8, SQLiteDatabaseCorruptException -> 0x02d6, SQLiteDatabaseLockedException -> 0x02d4, SQLiteTableLockedException -> 0x02d2, SQLiteConstraintException -> 0x02d0, SQLiteAccessPermException -> 0x02ce }
            java.lang.String r6 = f14412a     // Catch:{ SQLiteCantOpenDatabaseException -> 0x02da, SQLiteDiskIOException -> 0x02d8, SQLiteDatabaseCorruptException -> 0x02d6, SQLiteDatabaseLockedException -> 0x02d4, SQLiteTableLockedException -> 0x02d2, SQLiteConstraintException -> 0x02d0, SQLiteAccessPermException -> 0x02ce }
            java.lang.String r7 = "Rescheduling Workers."
            r4.mo9309a(r6, r7)     // Catch:{ SQLiteCantOpenDatabaseException -> 0x02da, SQLiteDiskIOException -> 0x02d8, SQLiteDatabaseCorruptException -> 0x02d6, SQLiteDatabaseLockedException -> 0x02d4, SQLiteTableLockedException -> 0x02d2, SQLiteConstraintException -> 0x02d0, SQLiteAccessPermException -> 0x02ce }
            androidx.work.impl.ag r4 = r15.f14415d     // Catch:{ SQLiteCantOpenDatabaseException -> 0x02da, SQLiteDiskIOException -> 0x02d8, SQLiteDatabaseCorruptException -> 0x02d6, SQLiteDatabaseLockedException -> 0x02d4, SQLiteTableLockedException -> 0x02d2, SQLiteConstraintException -> 0x02d0, SQLiteAccessPermException -> 0x02ce }
            r4.mo9393m()     // Catch:{ SQLiteCantOpenDatabaseException -> 0x02da, SQLiteDiskIOException -> 0x02d8, SQLiteDatabaseCorruptException -> 0x02d6, SQLiteDatabaseLockedException -> 0x02d4, SQLiteTableLockedException -> 0x02d2, SQLiteConstraintException -> 0x02d0, SQLiteAccessPermException -> 0x02ce }
            androidx.work.impl.ag r4 = r15.f14415d     // Catch:{ SQLiteCantOpenDatabaseException -> 0x02da, SQLiteDiskIOException -> 0x02d8, SQLiteDatabaseCorruptException -> 0x02d6, SQLiteDatabaseLockedException -> 0x02d4, SQLiteTableLockedException -> 0x02d2, SQLiteConstraintException -> 0x02d0, SQLiteAccessPermException -> 0x02ce }
            androidx.work.impl.utils.q r4 = r4.f14146h     // Catch:{ SQLiteCantOpenDatabaseException -> 0x02da, SQLiteDiskIOException -> 0x02d8, SQLiteDatabaseCorruptException -> 0x02d6, SQLiteDatabaseLockedException -> 0x02d4, SQLiteTableLockedException -> 0x02d2, SQLiteConstraintException -> 0x02d0, SQLiteAccessPermException -> 0x02ce }
            androidx.work.impl.b.e r6 = new androidx.work.impl.b.e     // Catch:{ SQLiteCantOpenDatabaseException -> 0x02da, SQLiteDiskIOException -> 0x02d8, SQLiteDatabaseCorruptException -> 0x02d6, SQLiteDatabaseLockedException -> 0x02d4, SQLiteTableLockedException -> 0x02d2, SQLiteConstraintException -> 0x02d0, SQLiteAccessPermException -> 0x02ce }
            java.lang.Long r7 = java.lang.Long.valueOf(r8)     // Catch:{ SQLiteCantOpenDatabaseException -> 0x02da, SQLiteDiskIOException -> 0x02d8, SQLiteDatabaseCorruptException -> 0x02d6, SQLiteDatabaseLockedException -> 0x02d4, SQLiteTableLockedException -> 0x02d2, SQLiteConstraintException -> 0x02d0, SQLiteAccessPermException -> 0x02ce }
            r6.<init>(r1, r7)     // Catch:{ SQLiteCantOpenDatabaseException -> 0x02da, SQLiteDiskIOException -> 0x02d8, SQLiteDatabaseCorruptException -> 0x02d6, SQLiteDatabaseLockedException -> 0x02d4, SQLiteTableLockedException -> 0x02d2, SQLiteConstraintException -> 0x02d0, SQLiteAccessPermException -> 0x02ce }
            androidx.work.impl.WorkDatabase r4 = r4.f14502a     // Catch:{ SQLiteCantOpenDatabaseException -> 0x02da, SQLiteDiskIOException -> 0x02d8, SQLiteDatabaseCorruptException -> 0x02d6, SQLiteDatabaseLockedException -> 0x02d4, SQLiteTableLockedException -> 0x02d2, SQLiteConstraintException -> 0x02d0, SQLiteAccessPermException -> 0x02ce }
            androidx.work.impl.b.f r4 = r4.mo9359A()     // Catch:{ SQLiteCantOpenDatabaseException -> 0x02da, SQLiteDiskIOException -> 0x02d8, SQLiteDatabaseCorruptException -> 0x02d6, SQLiteDatabaseLockedException -> 0x02d4, SQLiteTableLockedException -> 0x02d2, SQLiteConstraintException -> 0x02d0, SQLiteAccessPermException -> 0x02ce }
            r4.mo9457b(r6)     // Catch:{ SQLiteCantOpenDatabaseException -> 0x02da, SQLiteDiskIOException -> 0x02d8, SQLiteDatabaseCorruptException -> 0x02d6, SQLiteDatabaseLockedException -> 0x02d4, SQLiteTableLockedException -> 0x02d2, SQLiteConstraintException -> 0x02d0, SQLiteAccessPermException -> 0x02ce }
            goto L_0x034d
        L_0x020a:
            int r7 = android.os.Build.VERSION.SDK_INT     // Catch:{ SecurityException -> 0x0293, IllegalArgumentException -> 0x0291 }
            r10 = 31
            if (r7 < r10) goto L_0x0213
            r7 = 570425344(0x22000000, float:1.7347235E-18)
            goto L_0x0215
        L_0x0213:
            r7 = 536870912(0x20000000, float:1.0842022E-19)
        L_0x0215:
            android.content.Context r10 = r15.f14414c     // Catch:{ SecurityException -> 0x0293, IllegalArgumentException -> 0x0291 }
            android.app.PendingIntent r7 = m12954b(r10, r7)     // Catch:{ SecurityException -> 0x0293, IllegalArgumentException -> 0x0291 }
            int r10 = android.os.Build.VERSION.SDK_INT     // Catch:{ SecurityException -> 0x0293, IllegalArgumentException -> 0x0291 }
            r11 = 30
            if (r10 < r11) goto L_0x026f
            if (r7 == 0) goto L_0x0226
            r7.cancel()     // Catch:{ SecurityException -> 0x0293, IllegalArgumentException -> 0x0291 }
        L_0x0226:
            android.content.Context r7 = r15.f14414c     // Catch:{ SecurityException -> 0x0293, IllegalArgumentException -> 0x0291 }
            java.lang.String r10 = "activity"
            java.lang.Object r7 = r7.getSystemService(r10)     // Catch:{ SecurityException -> 0x0293, IllegalArgumentException -> 0x0291 }
            android.app.ActivityManager r7 = (android.app.ActivityManager) r7     // Catch:{ SecurityException -> 0x0293, IllegalArgumentException -> 0x0291 }
            r10 = 0
            java.util.List r7 = r7.getHistoricalProcessExitReasons(r10, r6, r6)     // Catch:{ SecurityException -> 0x0293, IllegalArgumentException -> 0x0291 }
            if (r7 == 0) goto L_0x0277
            boolean r10 = r7.isEmpty()     // Catch:{ SecurityException -> 0x0293, IllegalArgumentException -> 0x0291 }
            if (r10 != 0) goto L_0x0277
            androidx.work.impl.utils.q r10 = r15.f14416e     // Catch:{ SecurityException -> 0x0293, IllegalArgumentException -> 0x0291 }
            androidx.work.impl.WorkDatabase r10 = r10.f14502a     // Catch:{ SecurityException -> 0x0293, IllegalArgumentException -> 0x0291 }
            androidx.work.impl.b.f r10 = r10.mo9359A()     // Catch:{ SecurityException -> 0x0293, IllegalArgumentException -> 0x0291 }
            java.lang.Long r10 = r10.mo9456a(r0)     // Catch:{ SecurityException -> 0x0293, IllegalArgumentException -> 0x0291 }
            if (r10 == 0) goto L_0x024f
            long r8 = r10.longValue()     // Catch:{ SecurityException -> 0x0293, IllegalArgumentException -> 0x0291 }
        L_0x024f:
            int r10 = r7.size()     // Catch:{ SecurityException -> 0x0293, IllegalArgumentException -> 0x0291 }
            if (r6 >= r10) goto L_0x0277
            java.lang.Object r10 = r7.get(r6)     // Catch:{ SecurityException -> 0x0293, IllegalArgumentException -> 0x0291 }
            android.app.ApplicationExitInfo r10 = (android.app.ApplicationExitInfo) r10     // Catch:{ SecurityException -> 0x0293, IllegalArgumentException -> 0x0291 }
            int r11 = r10.getReason()     // Catch:{ SecurityException -> 0x0293, IllegalArgumentException -> 0x0291 }
            r12 = 10
            if (r11 != r12) goto L_0x026c
            long r10 = r10.getTimestamp()     // Catch:{ SecurityException -> 0x0293, IllegalArgumentException -> 0x0291 }
            int r12 = (r10 > r8 ? 1 : (r10 == r8 ? 0 : -1))
            if (r12 < 0) goto L_0x026c
            goto L_0x029f
        L_0x026c:
            int r6 = r6 + 1
            goto L_0x024f
        L_0x026f:
            if (r7 != 0) goto L_0x0277
            android.content.Context r4 = r15.f14414c     // Catch:{ SecurityException -> 0x0293, IllegalArgumentException -> 0x0291 }
            m12953a(r4)     // Catch:{ SecurityException -> 0x0293, IllegalArgumentException -> 0x0291 }
            goto L_0x029f
        L_0x0277:
            if (r4 == 0) goto L_0x034d
            androidx.work.ad r4 = androidx.work.C4380ad.m12560h()     // Catch:{ SQLiteCantOpenDatabaseException -> 0x02da, SQLiteDiskIOException -> 0x02d8, SQLiteDatabaseCorruptException -> 0x02d6, SQLiteDatabaseLockedException -> 0x02d4, SQLiteTableLockedException -> 0x02d2, SQLiteConstraintException -> 0x02d0, SQLiteAccessPermException -> 0x02ce }
            java.lang.String r6 = f14412a     // Catch:{ SQLiteCantOpenDatabaseException -> 0x02da, SQLiteDiskIOException -> 0x02d8, SQLiteDatabaseCorruptException -> 0x02d6, SQLiteDatabaseLockedException -> 0x02d4, SQLiteTableLockedException -> 0x02d2, SQLiteConstraintException -> 0x02d0, SQLiteAccessPermException -> 0x02ce }
            java.lang.String r7 = "Found unfinished work, scheduling it."
            r4.mo9309a(r6, r7)     // Catch:{ SQLiteCantOpenDatabaseException -> 0x02da, SQLiteDiskIOException -> 0x02d8, SQLiteDatabaseCorruptException -> 0x02d6, SQLiteDatabaseLockedException -> 0x02d4, SQLiteTableLockedException -> 0x02d2, SQLiteConstraintException -> 0x02d0, SQLiteAccessPermException -> 0x02ce }
            androidx.work.impl.ag r4 = r15.f14415d     // Catch:{ SQLiteCantOpenDatabaseException -> 0x02da, SQLiteDiskIOException -> 0x02d8, SQLiteDatabaseCorruptException -> 0x02d6, SQLiteDatabaseLockedException -> 0x02d4, SQLiteTableLockedException -> 0x02d2, SQLiteConstraintException -> 0x02d0, SQLiteAccessPermException -> 0x02ce }
            androidx.work.e r6 = r4.f14142d     // Catch:{ SQLiteCantOpenDatabaseException -> 0x02da, SQLiteDiskIOException -> 0x02d8, SQLiteDatabaseCorruptException -> 0x02d6, SQLiteDatabaseLockedException -> 0x02d4, SQLiteTableLockedException -> 0x02d2, SQLiteConstraintException -> 0x02d0, SQLiteAccessPermException -> 0x02ce }
            androidx.work.impl.WorkDatabase r7 = r4.f14143e     // Catch:{ SQLiteCantOpenDatabaseException -> 0x02da, SQLiteDiskIOException -> 0x02d8, SQLiteDatabaseCorruptException -> 0x02d6, SQLiteDatabaseLockedException -> 0x02d4, SQLiteTableLockedException -> 0x02d2, SQLiteConstraintException -> 0x02d0, SQLiteAccessPermException -> 0x02ce }
            java.util.List r4 = r4.f14144f     // Catch:{ SQLiteCantOpenDatabaseException -> 0x02da, SQLiteDiskIOException -> 0x02d8, SQLiteDatabaseCorruptException -> 0x02d6, SQLiteDatabaseLockedException -> 0x02d4, SQLiteTableLockedException -> 0x02d2, SQLiteConstraintException -> 0x02d0, SQLiteAccessPermException -> 0x02ce }
            androidx.work.impl.C4565u.m12952b(r6, r7, r4)     // Catch:{ SQLiteCantOpenDatabaseException -> 0x02da, SQLiteDiskIOException -> 0x02d8, SQLiteDatabaseCorruptException -> 0x02d6, SQLiteDatabaseLockedException -> 0x02d4, SQLiteTableLockedException -> 0x02d2, SQLiteConstraintException -> 0x02d0, SQLiteAccessPermException -> 0x02ce }
            goto L_0x034d
        L_0x0291:
            r4 = move-exception
            goto L_0x0294
        L_0x0293:
            r4 = move-exception
        L_0x0294:
            androidx.work.ad r6 = androidx.work.C4380ad.m12560h()     // Catch:{ SQLiteCantOpenDatabaseException -> 0x02da, SQLiteDiskIOException -> 0x02d8, SQLiteDatabaseCorruptException -> 0x02d6, SQLiteDatabaseLockedException -> 0x02d4, SQLiteTableLockedException -> 0x02d2, SQLiteConstraintException -> 0x02d0, SQLiteAccessPermException -> 0x02ce }
            java.lang.String r7 = f14412a     // Catch:{ SQLiteCantOpenDatabaseException -> 0x02da, SQLiteDiskIOException -> 0x02d8, SQLiteDatabaseCorruptException -> 0x02d6, SQLiteDatabaseLockedException -> 0x02d4, SQLiteTableLockedException -> 0x02d2, SQLiteConstraintException -> 0x02d0, SQLiteAccessPermException -> 0x02ce }
            java.lang.String r8 = "Ignoring exception"
            r6.mo9315g(r7, r8, r4)     // Catch:{ SQLiteCantOpenDatabaseException -> 0x02da, SQLiteDiskIOException -> 0x02d8, SQLiteDatabaseCorruptException -> 0x02d6, SQLiteDatabaseLockedException -> 0x02d4, SQLiteTableLockedException -> 0x02d2, SQLiteConstraintException -> 0x02d0, SQLiteAccessPermException -> 0x02ce }
        L_0x029f:
            androidx.work.ad r4 = androidx.work.C4380ad.m12560h()     // Catch:{ SQLiteCantOpenDatabaseException -> 0x02da, SQLiteDiskIOException -> 0x02d8, SQLiteDatabaseCorruptException -> 0x02d6, SQLiteDatabaseLockedException -> 0x02d4, SQLiteTableLockedException -> 0x02d2, SQLiteConstraintException -> 0x02d0, SQLiteAccessPermException -> 0x02ce }
            java.lang.String r6 = f14412a     // Catch:{ SQLiteCantOpenDatabaseException -> 0x02da, SQLiteDiskIOException -> 0x02d8, SQLiteDatabaseCorruptException -> 0x02d6, SQLiteDatabaseLockedException -> 0x02d4, SQLiteTableLockedException -> 0x02d2, SQLiteConstraintException -> 0x02d0, SQLiteAccessPermException -> 0x02ce }
            java.lang.String r7 = "Application was force-stopped, rescheduling."
            r4.mo9309a(r6, r7)     // Catch:{ SQLiteCantOpenDatabaseException -> 0x02da, SQLiteDiskIOException -> 0x02d8, SQLiteDatabaseCorruptException -> 0x02d6, SQLiteDatabaseLockedException -> 0x02d4, SQLiteTableLockedException -> 0x02d2, SQLiteConstraintException -> 0x02d0, SQLiteAccessPermException -> 0x02ce }
            androidx.work.impl.ag r4 = r15.f14415d     // Catch:{ SQLiteCantOpenDatabaseException -> 0x02da, SQLiteDiskIOException -> 0x02d8, SQLiteDatabaseCorruptException -> 0x02d6, SQLiteDatabaseLockedException -> 0x02d4, SQLiteTableLockedException -> 0x02d2, SQLiteConstraintException -> 0x02d0, SQLiteAccessPermException -> 0x02ce }
            r4.mo9393m()     // Catch:{ SQLiteCantOpenDatabaseException -> 0x02da, SQLiteDiskIOException -> 0x02d8, SQLiteDatabaseCorruptException -> 0x02d6, SQLiteDatabaseLockedException -> 0x02d4, SQLiteTableLockedException -> 0x02d2, SQLiteConstraintException -> 0x02d0, SQLiteAccessPermException -> 0x02ce }
            androidx.work.impl.utils.q r4 = r15.f14416e     // Catch:{ SQLiteCantOpenDatabaseException -> 0x02da, SQLiteDiskIOException -> 0x02d8, SQLiteDatabaseCorruptException -> 0x02d6, SQLiteDatabaseLockedException -> 0x02d4, SQLiteTableLockedException -> 0x02d2, SQLiteConstraintException -> 0x02d0, SQLiteAccessPermException -> 0x02ce }
            long r6 = java.lang.System.currentTimeMillis()     // Catch:{ SQLiteCantOpenDatabaseException -> 0x02da, SQLiteDiskIOException -> 0x02d8, SQLiteDatabaseCorruptException -> 0x02d6, SQLiteDatabaseLockedException -> 0x02d4, SQLiteTableLockedException -> 0x02d2, SQLiteConstraintException -> 0x02d0, SQLiteAccessPermException -> 0x02ce }
            androidx.work.impl.b.e r8 = new androidx.work.impl.b.e     // Catch:{ SQLiteCantOpenDatabaseException -> 0x02da, SQLiteDiskIOException -> 0x02d8, SQLiteDatabaseCorruptException -> 0x02d6, SQLiteDatabaseLockedException -> 0x02d4, SQLiteTableLockedException -> 0x02d2, SQLiteConstraintException -> 0x02d0, SQLiteAccessPermException -> 0x02ce }
            java.lang.Long r6 = java.lang.Long.valueOf(r6)     // Catch:{ SQLiteCantOpenDatabaseException -> 0x02da, SQLiteDiskIOException -> 0x02d8, SQLiteDatabaseCorruptException -> 0x02d6, SQLiteDatabaseLockedException -> 0x02d4, SQLiteTableLockedException -> 0x02d2, SQLiteConstraintException -> 0x02d0, SQLiteAccessPermException -> 0x02ce }
            r8.<init>(r0, r6)     // Catch:{ SQLiteCantOpenDatabaseException -> 0x02da, SQLiteDiskIOException -> 0x02d8, SQLiteDatabaseCorruptException -> 0x02d6, SQLiteDatabaseLockedException -> 0x02d4, SQLiteTableLockedException -> 0x02d2, SQLiteConstraintException -> 0x02d0, SQLiteAccessPermException -> 0x02ce }
            androidx.work.impl.WorkDatabase r4 = r4.f14502a     // Catch:{ SQLiteCantOpenDatabaseException -> 0x02da, SQLiteDiskIOException -> 0x02d8, SQLiteDatabaseCorruptException -> 0x02d6, SQLiteDatabaseLockedException -> 0x02d4, SQLiteTableLockedException -> 0x02d2, SQLiteConstraintException -> 0x02d0, SQLiteAccessPermException -> 0x02ce }
            androidx.work.impl.b.f r4 = r4.mo9359A()     // Catch:{ SQLiteCantOpenDatabaseException -> 0x02da, SQLiteDiskIOException -> 0x02d8, SQLiteDatabaseCorruptException -> 0x02d6, SQLiteDatabaseLockedException -> 0x02d4, SQLiteTableLockedException -> 0x02d2, SQLiteConstraintException -> 0x02d0, SQLiteAccessPermException -> 0x02ce }
            r4.mo9457b(r8)     // Catch:{ SQLiteCantOpenDatabaseException -> 0x02da, SQLiteDiskIOException -> 0x02d8, SQLiteDatabaseCorruptException -> 0x02d6, SQLiteDatabaseLockedException -> 0x02d4, SQLiteTableLockedException -> 0x02d2, SQLiteConstraintException -> 0x02d0, SQLiteAccessPermException -> 0x02ce }
            goto L_0x034d
        L_0x02c9:
            r4 = move-exception
            r7.mo8183r()     // Catch:{ SQLiteCantOpenDatabaseException -> 0x02da, SQLiteDiskIOException -> 0x02d8, SQLiteDatabaseCorruptException -> 0x02d6, SQLiteDatabaseLockedException -> 0x02d4, SQLiteTableLockedException -> 0x02d2, SQLiteConstraintException -> 0x02d0, SQLiteAccessPermException -> 0x02ce }
            throw r4     // Catch:{ SQLiteCantOpenDatabaseException -> 0x02da, SQLiteDiskIOException -> 0x02d8, SQLiteDatabaseCorruptException -> 0x02d6, SQLiteDatabaseLockedException -> 0x02d4, SQLiteTableLockedException -> 0x02d2, SQLiteConstraintException -> 0x02d0, SQLiteAccessPermException -> 0x02ce }
        L_0x02ce:
            r4 = move-exception
            goto L_0x02db
        L_0x02d0:
            r4 = move-exception
            goto L_0x02db
        L_0x02d2:
            r4 = move-exception
            goto L_0x02db
        L_0x02d4:
            r4 = move-exception
            goto L_0x02db
        L_0x02d6:
            r4 = move-exception
            goto L_0x02db
        L_0x02d8:
            r4 = move-exception
            goto L_0x02db
        L_0x02da:
            r4 = move-exception
        L_0x02db:
            int r6 = r15.f14417f     // Catch:{ all -> 0x0352 }
            int r6 = r6 + r3
            r15.f14417f = r6     // Catch:{ all -> 0x0352 }
            if (r6 < r5) goto L_0x0308
            java.lang.String r0 = "The file system on the device is in a bad state. WorkManager cannot access the app's internal data store."
            androidx.work.ad r1 = androidx.work.C4380ad.m12560h()     // Catch:{ all -> 0x0352 }
            java.lang.String r2 = f14412a     // Catch:{ all -> 0x0352 }
            r1.mo9312d(r2, r0, r4)     // Catch:{ all -> 0x0352 }
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException     // Catch:{ all -> 0x0352 }
            r1.<init>(r0, r4)     // Catch:{ all -> 0x0352 }
            androidx.work.impl.ag r0 = r15.f14415d     // Catch:{ all -> 0x0352 }
            androidx.work.e r0 = r0.f14142d     // Catch:{ all -> 0x0352 }
            androidx.work.r r0 = r0.f14066f     // Catch:{ all -> 0x0352 }
            if (r0 == 0) goto L_0x0307
            androidx.work.ad r3 = androidx.work.C4380ad.m12560h()     // Catch:{ all -> 0x0352 }
            java.lang.String r4 = "Routing exception to the specified exception handler"
            r3.mo9310b(r2, r4, r1)     // Catch:{ all -> 0x0352 }
            r0.mo9577a()     // Catch:{ all -> 0x0352 }
            goto L_0x034d
        L_0x0307:
            throw r1     // Catch:{ all -> 0x0352 }
        L_0x0308:
            long r5 = (long) r6     // Catch:{ all -> 0x0352 }
            r7 = 300(0x12c, double:1.48E-321)
            long r5 = r5 * r7
            androidx.work.ad r3 = androidx.work.C4380ad.m12560h()     // Catch:{ all -> 0x0352 }
            java.lang.String r9 = f14412a     // Catch:{ all -> 0x0352 }
            java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch:{ all -> 0x0352 }
            r10.<init>()     // Catch:{ all -> 0x0352 }
            java.lang.String r11 = "Retrying after "
            r10.append(r11)     // Catch:{ all -> 0x0352 }
            r10.append(r5)     // Catch:{ all -> 0x0352 }
            java.lang.String r5 = r10.toString()     // Catch:{ all -> 0x0352 }
            r3.mo9310b(r9, r5, r4)     // Catch:{ all -> 0x0352 }
            int r3 = r15.f14417f     // Catch:{ all -> 0x0352 }
            long r3 = (long) r3
            long r3 = r3 * r7
            java.lang.Thread.sleep(r3)     // Catch:{ InterruptedException -> 0x0043 }
            goto L_0x0043
        L_0x0331:
            r0 = move-exception
            java.lang.String r1 = "Unexpected SQLite exception during migrations"
            androidx.work.ad r2 = androidx.work.C4380ad.m12560h()     // Catch:{ all -> 0x0352 }
            java.lang.String r3 = f14412a     // Catch:{ all -> 0x0352 }
            r2.mo9311c(r3, r1)     // Catch:{ all -> 0x0352 }
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException     // Catch:{ all -> 0x0352 }
            r2.<init>(r1, r0)     // Catch:{ all -> 0x0352 }
            androidx.work.impl.ag r0 = r15.f14415d     // Catch:{ all -> 0x0352 }
            androidx.work.e r0 = r0.f14142d     // Catch:{ all -> 0x0352 }
            androidx.work.r r0 = r0.f14066f     // Catch:{ all -> 0x0352 }
            if (r0 == 0) goto L_0x0351
            r0.mo9577a()     // Catch:{ all -> 0x0352 }
        L_0x034d:
            androidx.work.impl.ag r0 = r15.f14415d
            goto L_0x003f
        L_0x0351:
            throw r2     // Catch:{ all -> 0x0352 }
        L_0x0352:
            r0 = move-exception
            androidx.work.impl.ag r1 = r15.f14415d
            r1.mo9392l()
            goto L_0x035a
        L_0x0359:
            throw r0
        L_0x035a:
            goto L_0x0359
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.work.impl.utils.ForceStopRunnable.run():void");
    }
}
