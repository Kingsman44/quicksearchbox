package com.google.android.gms.cast.internal;

import com.google.android.gms.cast.ApplicationMetadata;
import com.google.android.gms.cast.C143557h;

/* renamed from: com.google.android.gms.cast.internal.o */
/* compiled from: PG */
final class C143589o implements Runnable {

    /* renamed from: a */
    final /* synthetic */ C143593s f389328a;

    /* renamed from: b */
    final /* synthetic */ DeviceStatus f389329b;

    public C143589o(C143593s sVar, DeviceStatus deviceStatus) {
        this.f389328a = sVar;
        this.f389329b = deviceStatus;
    }

    public final void run() {
        boolean z;
        boolean z2;
        boolean z3;
        C143593s sVar = this.f389328a;
        DeviceStatus deviceStatus = this.f389329b;
        ApplicationMetadata applicationMetadata = deviceStatus.f389256d;
        if (!C143596v.m233278k(applicationMetadata, sVar.f389344d)) {
            sVar.f389344d = applicationMetadata;
            sVar.f389346f.mo118711c(sVar.f389344d);
        }
        double d = deviceStatus.f389253a;
        if (Double.isNaN(d) || Math.abs(d - sVar.f389352l) <= 1.0E-7d) {
            z = false;
        } else {
            sVar.f389352l = d;
            z = true;
        }
        boolean z4 = deviceStatus.f389254b;
        if (z4 != sVar.f389349i) {
            sVar.f389349i = z4;
            z = true;
        }
        Double.isNaN(deviceStatus.f389259g);
        C143593s.f389337a.mo118884b("hasVolumeChanged=%b, mFirstDeviceStatusUpdate=%b", Boolean.valueOf(z), Boolean.valueOf(sVar.f389351k));
        C143557h hVar = sVar.f389346f;
        if (hVar != null && (z || sVar.f389351k)) {
            hVar.mo118714f();
        }
        int i = deviceStatus.f389255c;
        if (i != sVar.f389354n) {
            sVar.f389354n = i;
            z2 = true;
        } else {
            z2 = false;
        }
        C143593s.f389337a.mo118884b("hasActiveInputChanged=%b, mFirstDeviceStatusUpdate=%b", Boolean.valueOf(z2), Boolean.valueOf(sVar.f389351k));
        C143557h hVar2 = sVar.f389346f;
        if (hVar2 != null && (z2 || sVar.f389351k)) {
            hVar2.mo118709a(sVar.f389354n);
        }
        int i2 = deviceStatus.f389257e;
        if (i2 != sVar.f389355o) {
            sVar.f389355o = i2;
            z3 = true;
        } else {
            z3 = false;
        }
        C143593s.f389337a.mo118884b("hasStandbyStateChanged=%b, mFirstDeviceStatusUpdate=%b", Boolean.valueOf(z3), Boolean.valueOf(sVar.f389351k));
        C143557h hVar3 = sVar.f389346f;
        if (hVar3 != null && (z3 || sVar.f389351k)) {
            hVar3.mo118713e(sVar.f389355o);
        }
        if (!C143596v.m233278k(sVar.f389353m, deviceStatus.f389258f)) {
            sVar.f389353m = deviceStatus.f389258f;
        }
        sVar.f389351k = false;
    }
}
