package com.google.android.gms.cast;

import com.google.android.gms.cast.internal.C143596v;
import com.google.android.gms.cast.internal.DeviceStatus;

/* renamed from: com.google.android.gms.cast.af */
/* compiled from: PG */
public final /* synthetic */ class C143348af implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C143353ak f388764a;

    /* renamed from: b */
    public final /* synthetic */ DeviceStatus f388765b;

    public /* synthetic */ C143348af(C143353ak akVar, DeviceStatus deviceStatus) {
        this.f388764a = akVar;
        this.f388765b = deviceStatus;
    }

    public final void run() {
        boolean z;
        boolean z2;
        boolean z3;
        C143353ak akVar = this.f388764a;
        DeviceStatus deviceStatus = this.f388765b;
        C143354al alVar = akVar.f388775a;
        ApplicationMetadata applicationMetadata = deviceStatus.f389256d;
        if (!C143596v.m233278k(applicationMetadata, alVar.f388788j)) {
            alVar.f388788j = applicationMetadata;
            alVar.f388798t.mo118711c(alVar.f388788j);
        }
        double d = deviceStatus.f389253a;
        if (Double.isNaN(d) || Math.abs(d - alVar.f388790l) <= 1.0E-7d) {
            z = false;
        } else {
            alVar.f388790l = d;
            z = true;
        }
        boolean z4 = deviceStatus.f389254b;
        if (z4 != alVar.f388791m) {
            alVar.f388791m = z4;
            z = true;
        }
        C143354al.f388778a.mo118884b("hasVolumeChanged=%b, mFirstDeviceStatusUpdate=%b", Boolean.valueOf(z), Boolean.valueOf(alVar.f388781c));
        C143557h hVar = alVar.f388798t;
        if (hVar != null && (z || alVar.f388781c)) {
            hVar.mo118714f();
        }
        Double.isNaN(deviceStatus.f389259g);
        int i = deviceStatus.f389255c;
        if (i != alVar.f388792n) {
            alVar.f388792n = i;
            z2 = true;
        } else {
            z2 = false;
        }
        C143354al.f388778a.mo118884b("hasActiveInputChanged=%b, mFirstDeviceStatusUpdate=%b", Boolean.valueOf(z2), Boolean.valueOf(alVar.f388781c));
        C143557h hVar2 = alVar.f388798t;
        if (hVar2 != null && (z2 || alVar.f388781c)) {
            hVar2.mo118709a(alVar.f388792n);
        }
        int i2 = deviceStatus.f389257e;
        if (i2 != alVar.f388793o) {
            alVar.f388793o = i2;
            z3 = true;
        } else {
            z3 = false;
        }
        C143354al.f388778a.mo118884b("hasStandbyStateChanged=%b, mFirstDeviceStatusUpdate=%b", Boolean.valueOf(z3), Boolean.valueOf(alVar.f388781c));
        C143557h hVar3 = alVar.f388798t;
        if (hVar3 != null && (z3 || alVar.f388781c)) {
            hVar3.mo118713e(alVar.f388793o);
        }
        if (!C143596v.m233278k(alVar.f388794p, deviceStatus.f389258f)) {
            alVar.f388794p = deviceStatus.f389258f;
        }
        alVar.f388781c = false;
    }
}
