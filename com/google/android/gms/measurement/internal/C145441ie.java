package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import com.google.android.gms.measurement.api.internal.C145198g;

/* renamed from: com.google.android.gms.measurement.internal.ie */
/* compiled from: PG */
final class C145441ie implements Runnable {

    /* renamed from: a */
    final /* synthetic */ EventParcel f393225a;

    /* renamed from: b */
    final /* synthetic */ String f393226b;

    /* renamed from: c */
    final /* synthetic */ C145198g f393227c;

    /* renamed from: d */
    final /* synthetic */ C145456it f393228d;

    public C145441ie(C145456it itVar, EventParcel eventParcel, String str, C145198g gVar) {
        this.f393228d = itVar;
        this.f393225a = eventParcel;
        this.f393226b = str;
        this.f393227c = gVar;
    }

    public final void run() {
        C145361ff ffVar;
        byte[] bArr = null;
        try {
            C145456it itVar = this.f393228d;
            C145316do doVar = itVar.f393272c;
            if (doVar == null) {
                itVar.f393011w.mo120965ar().f392795c.mo120894a("Discarding data. Failed to send event to service to bundle");
                ffVar = this.f393228d.f393011w;
            } else {
                bArr = doVar.mo120872v(this.f393225a, this.f393226b);
                this.f393228d.mo121158n();
                ffVar = this.f393228d.f393011w;
            }
        } catch (RemoteException e) {
            this.f393228d.f393011w.mo120965ar().f392795c.mo120895b("Failed to send event to the service to bundle", e);
            ffVar = this.f393228d.f393011w;
        } catch (Throwable th) {
            this.f393228d.f393011w.mo120977o().mo121258O(this.f393227c, bArr);
            throw th;
        }
        ffVar.mo120977o().mo121258O(this.f393227c, bArr);
    }
}
