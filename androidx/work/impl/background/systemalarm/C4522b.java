package androidx.work.impl.background.systemalarm;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import androidx.work.C4380ad;
import androidx.work.impl.C4452ag;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.p207b.C4502k;
import androidx.work.impl.p207b.C4503l;
import androidx.work.impl.p207b.C4508q;
import androidx.work.impl.p207b.C4509r;
import androidx.work.impl.utils.C4602i;
import androidx.work.impl.utils.C4604k;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: androidx.work.impl.background.systemalarm.b */
/* compiled from: PG */
final class C4522b {

    /* renamed from: a */
    private static final String f14297a = C4380ad.m12561i("Alarms");

    /* renamed from: a */
    public static void m12870a(Context context, C4452ag agVar, C4509r rVar) {
        C4503l C = agVar.f14143e.mo9361C();
        C4502k a = C.mo9462a(rVar);
        if (a != null) {
            m12872c(context, rVar, a.f14264c);
            C4380ad h = C4380ad.m12560h();
            String str = f14297a;
            h.mo9309a(str, "Removing SystemIdInfo for workSpecId (" + rVar + ")");
            C.mo9465d(rVar);
        }
    }

    /* renamed from: b */
    public static void m12871b(Context context, C4452ag agVar, C4509r rVar, long j) {
        WorkDatabase workDatabase = agVar.f14143e;
        C4503l C = workDatabase.mo9361C();
        C4502k a = C.mo9462a(rVar);
        if (a != null) {
            m12872c(context, rVar, a.f14264c);
            m12873d(context, rVar, a.f14264c, j);
            return;
        }
        C4604k kVar = new C4604k(workDatabase);
        Object M = kVar.f14500a.mo8169M(new C4602i(kVar));
        C69664n.m101060f(M, "workDatabase.runInTransa…ANAGER_ID_KEY)\n        })");
        int intValue = ((Number) M).intValue();
        C.mo9464c(C4508q.m12845a(rVar, intValue));
        m12873d(context, rVar, intValue, j);
    }

    /* renamed from: c */
    private static void m12872c(Context context, C4509r rVar, int i) {
        AlarmManager alarmManager = (AlarmManager) context.getSystemService("alarm");
        PendingIntent service = PendingIntent.getService(context, i, C4523c.m12875c(context, rVar), 603979776);
        if (service != null && alarmManager != null) {
            C4380ad h = C4380ad.m12560h();
            String str = f14297a;
            h.mo9309a(str, "Cancelling existing alarm with (workSpecId, systemId) (" + rVar + ", " + i + ")");
            alarmManager.cancel(service);
        }
    }

    /* renamed from: d */
    private static void m12873d(Context context, C4509r rVar, int i, long j) {
        AlarmManager alarmManager = (AlarmManager) context.getSystemService("alarm");
        PendingIntent service = PendingIntent.getService(context, i, C4523c.m12875c(context, rVar), 201326592);
        if (alarmManager != null) {
            C4521a.m12869a(alarmManager, 0, j, service);
        }
    }
}
