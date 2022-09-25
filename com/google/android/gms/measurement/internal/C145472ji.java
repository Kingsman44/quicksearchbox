package com.google.android.gms.measurement.internal;

import android.app.ActivityManager;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import com.google.android.gms.common.util.C144006f;
import p5304e.p5305a.p5306a.p5390n.p5405h.p5406a.C68893aw;
import p5304e.p5305a.p5306a.p5390n.p5405h.p5406a.C68922p;

/* renamed from: com.google.android.gms.measurement.internal.ji */
/* compiled from: PG */
final class C145472ji {

    /* renamed from: a */
    final /* synthetic */ C145473jj f393317a;

    public C145472ji(C145473jj jjVar) {
        this.f393317a = jjVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo121187a() {
        this.f393317a.mo120904g();
        C145339ek g = this.f393317a.f393011w.mo120971g();
        C144006f fVar = this.f393317a.f393011w.f392924A;
        if (g.mo120927i(System.currentTimeMillis())) {
            this.f393317a.f393011w.mo120971g().f392858k.mo120912b(true);
            ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
            ActivityManager.getMyMemoryState(runningAppProcessInfo);
            if (runningAppProcessInfo.importance == 100) {
                this.f393317a.f393011w.mo120965ar().f392803k.mo120894a("Detected application was in foreground");
                C144006f fVar2 = this.f393317a.f393011w.f392924A;
                mo121189c(System.currentTimeMillis(), false);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo121188b(long j, boolean z) {
        this.f393317a.mo120904g();
        this.f393317a.mo121190e();
        if (this.f393317a.f393011w.mo120971g().mo120927i(j)) {
            this.f393317a.f393011w.mo120971g().f392858k.mo120912b(true);
            if (C68893aw.m99823c() && this.f393317a.f393011w.f392937g.mo120776m((String) null, C145313dl.f392729ai)) {
                this.f393317a.f393011w.mo120969d().mo120876h();
            }
        }
        this.f393317a.f393011w.mo120971g().f392861n.mo120916b(j);
        C145334ef efVar = this.f393317a.f393011w.mo120971g().f392858k;
        efVar.mo120911a();
        if (efVar.f392825a) {
            mo121189c(j, z);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final void mo121189c(long j, boolean z) {
        this.f393317a.mo120904g();
        if (this.f393317a.f393011w.mo120980r()) {
            this.f393317a.f393011w.mo120971g().f392861n.mo120916b(j);
            C144006f fVar = this.f393317a.f393011w.f392924A;
            this.f393317a.f393011w.mo120965ar().f392803k.mo120895b("Session started, time", Long.valueOf(SystemClock.elapsedRealtime()));
            Long valueOf = Long.valueOf(j / 1000);
            this.f393317a.f393011w.mo120972j().mo121087D("auto", "_sid", valueOf, j);
            this.f393317a.f393011w.mo120971g().f392858k.mo120912b(false);
            Bundle bundle = new Bundle();
            bundle.putLong("_sid", valueOf.longValue());
            if (this.f393317a.f393011w.f392937g.mo120776m((String) null, C145313dl.f392719Z) && z) {
                bundle.putLong("_aib", 1);
            }
            this.f393317a.f393011w.mo120972j().mo121102p("auto", "_s", j, bundle);
            if (C68922p.m99945c() && this.f393317a.f393011w.f392937g.mo120776m((String) null, C145313dl.f392723ac)) {
                C145338ej ejVar = this.f393317a.f393011w.mo120971g().f392866s;
                ejVar.mo120919a();
                String str = ejVar.f392844a;
                if (!TextUtils.isEmpty(str)) {
                    Bundle bundle2 = new Bundle();
                    bundle2.putString("_ffr", str);
                    this.f393317a.f393011w.mo120972j().mo121102p("auto", "_ssr", j, bundle2);
                }
            }
        }
    }
}
