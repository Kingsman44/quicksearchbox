package com.google.android.gms.analytics.internal;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.os.PersistableBundle;
import android.os.SystemClock;
import com.google.android.gms.common.internal.C143919bh;
import com.google.android.gms.common.util.C144006f;
import com.google.android.gms.libs.p10835c.C144855c;
import com.google.android.gms.libs.p10836d.p10837a.C144856a;

/* renamed from: com.google.android.gms.analytics.internal.aj */
/* compiled from: PG */
public final class C142713aj extends C142737g {

    /* renamed from: a */
    public boolean f387243a;

    /* renamed from: b */
    public boolean f387244b;

    /* renamed from: c */
    private final AlarmManager f387245c = ((AlarmManager) this.f387328e.f387334b.getSystemService("alarm"));

    /* renamed from: d */
    private Integer f387246d;

    protected C142713aj(C142740j jVar) {
        super(jVar);
    }

    /* renamed from: d */
    private final int m231560d() {
        if (this.f387246d == null) {
            this.f387246d = Integer.valueOf("analytics".concat(String.valueOf(this.f387328e.f387334b.getPackageName())).hashCode());
        }
        return this.f387246d.intValue();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo117488a() {
        try {
            mo117504b();
            C142708ae aeVar = this.f387328e.f387336d;
            if (C142708ae.m231544b() > 0) {
                Context context = this.f387328e.f387334b;
                ActivityInfo receiverInfo = context.getPackageManager().getReceiverInfo(new ComponentName(context, "com.google.android.gms.analytics.AnalyticsReceiver"), 0);
                if (receiverInfo != null && receiverInfo.enabled) {
                    super.mo117536i(2, "Receiver registered for local dispatch.", (Object) null, (Object) null, (Object) null);
                    this.f387243a = true;
                }
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
    }

    /* renamed from: b */
    public final void mo117504b() {
        this.f387244b = false;
        try {
            AlarmManager alarmManager = this.f387245c;
            Context context = this.f387328e.f387334b;
            alarmManager.cancel(PendingIntent.getBroadcast(context, 0, new Intent("com.google.android.gms.analytics.ANALYTICS_DISPATCH").setComponent(new ComponentName(context, "com.google.android.gms.analytics.AnalyticsReceiver")), C144855c.f391705a));
        } catch (NullPointerException unused) {
        }
        int d = m231560d();
        super.mo117536i(2, "Cancelling job. JobID", Integer.valueOf(d), (Object) null, (Object) null);
        ((JobScheduler) this.f387328e.f387334b.getSystemService("jobscheduler")).cancel(d);
    }

    /* renamed from: c */
    public final void mo117505c() {
        mo117537k();
        C143919bh.m233967j(this.f387243a, "Receiver not registered");
        C142708ae aeVar = this.f387328e.f387336d;
        long b = C142708ae.m231544b();
        if (b > 0) {
            mo117504b();
            C144006f fVar = this.f387328e.f387340h;
            SystemClock.elapsedRealtime();
            this.f387244b = true;
            ((Boolean) C142715al.f387253E.mo117506a()).booleanValue();
            super.mo117536i(2, "Scheduling upload with JobScheduler", (Object) null, (Object) null, (Object) null);
            Context context = this.f387328e.f387334b;
            ComponentName componentName = new ComponentName(context, "com.google.android.gms.analytics.AnalyticsJobService");
            int d = m231560d();
            PersistableBundle persistableBundle = new PersistableBundle();
            persistableBundle.putString("action", "com.google.android.gms.analytics.ANALYTICS_DISPATCH");
            JobInfo build = new JobInfo.Builder(d, componentName).setMinimumLatency(b).setOverrideDeadline(b + b).setExtras(persistableBundle).build();
            super.mo117536i(2, "Scheduling job. JobID", Integer.valueOf(d), (Object) null, (Object) null);
            C144856a.m235444a(context, build, "DispatchAlarm");
        }
    }
}
