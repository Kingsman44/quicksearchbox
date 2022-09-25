package com.google.android.gms.measurement.internal;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.app.job.JobScheduler;
import android.content.Context;
import android.content.Intent;
import com.google.android.gms.libs.p10835c.C144855c;

/* renamed from: com.google.android.gms.measurement.internal.jm */
/* compiled from: PG */
public final class C145476jm extends C145478jo {

    /* renamed from: a */
    private final AlarmManager f393324a = ((AlarmManager) this.f393011w.f392931a.getSystemService("alarm"));

    /* renamed from: b */
    private C145231ak f393325b;

    /* renamed from: c */
    private Integer f393326c;

    public C145476jm(C145488jy jyVar) {
        super(jyVar);
    }

    /* renamed from: e */
    private final PendingIntent m236395e() {
        Context context = this.f393011w.f392931a;
        return PendingIntent.getBroadcast(context, 0, new Intent().setClassName(context, "com.google.android.gms.measurement.AppMeasurementReceiver").setAction("com.google.android.gms.measurement.UPLOAD"), C144855c.f391705a);
    }

    /* renamed from: i */
    private final void m236396i() {
        JobScheduler jobScheduler = (JobScheduler) this.f393011w.f392931a.getSystemService("jobscheduler");
        if (jobScheduler != null) {
            jobScheduler.cancel(mo121191a());
        }
    }

    /* renamed from: a */
    public final int mo121191a() {
        if (this.f393326c == null) {
            this.f393326c = Integer.valueOf("measurement".concat(String.valueOf(this.f393011w.f392931a.getPackageName())).hashCode());
        }
        return this.f393326c.intValue();
    }

    /* renamed from: b */
    public final C145231ak mo121192b() {
        if (this.f393325b == null) {
            this.f393325b = new C145475jl(this, this.f393327l.f393363k);
        }
        return this.f393325b;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final boolean mo120805c() {
        AlarmManager alarmManager = this.f393324a;
        if (alarmManager != null) {
            alarmManager.cancel(m236395e());
        }
        m236396i();
        return false;
    }

    /* renamed from: d */
    public final void mo121193d() {
        mo121194J();
        this.f393011w.mo120965ar().f392803k.mo120894a("Unscheduling upload");
        AlarmManager alarmManager = this.f393324a;
        if (alarmManager != null) {
            alarmManager.cancel(m236395e());
        }
        mo121192b().mo120829a();
        m236396i();
    }
}
