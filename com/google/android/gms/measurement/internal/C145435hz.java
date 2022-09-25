package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import com.google.android.gms.common.internal.C143919bh;
import com.google.android.gms.measurement.api.internal.C145198g;

/* renamed from: com.google.android.gms.measurement.internal.hz */
/* compiled from: PG */
final class C145435hz implements Runnable {

    /* renamed from: a */
    final /* synthetic */ AppMetadata f393210a;

    /* renamed from: b */
    final /* synthetic */ C145198g f393211b;

    /* renamed from: c */
    final /* synthetic */ C145456it f393212c;

    public C145435hz(C145456it itVar, AppMetadata appMetadata, C145198g gVar) {
        this.f393212c = itVar;
        this.f393210a = appMetadata;
        this.f393211b = gVar;
    }

    public final void run() {
        C145361ff ffVar;
        String str = null;
        try {
            if (!this.f393212c.f393011w.mo120971g().mo120923c().mo120786f(C145223ac.ANALYTICS_STORAGE)) {
                this.f393212c.f393011w.mo120965ar().f392800h.mo120894a("Analytics storage consent denied; will not get app instance id");
                this.f393212c.f393011w.mo120972j().f393143d.set((Object) null);
                this.f393212c.f393011w.mo120971g().f392853f.mo120920b((String) null);
                ffVar = this.f393212c.f393011w;
            } else {
                C145456it itVar = this.f393212c;
                C145316do doVar = itVar.f393272c;
                if (doVar == null) {
                    itVar.f393011w.mo120965ar().f392795c.mo120894a("Failed to get app instance id");
                    ffVar = this.f393212c.f393011w;
                } else {
                    C143919bh.m233958a(this.f393210a);
                    str = doVar.mo120855e(this.f393210a);
                    if (str != null) {
                        this.f393212c.f393011w.mo120972j().f393143d.set(str);
                        this.f393212c.f393011w.mo120971g().f392853f.mo120920b(str);
                    }
                    this.f393212c.mo121158n();
                    ffVar = this.f393212c.f393011w;
                }
            }
        } catch (RemoteException e) {
            this.f393212c.f393011w.mo120965ar().f392795c.mo120895b("Failed to get app instance id", e);
            ffVar = this.f393212c.f393011w;
        } catch (Throwable th) {
            this.f393212c.f393011w.mo120977o().mo121261R(this.f393211b, (String) null);
            throw th;
        }
        ffVar.mo120977o().mo121261R(this.f393211b, str);
    }
}
