package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import com.google.android.gms.common.internal.C143919bh;
import com.google.android.gms.measurement.api.internal.C145198g;
import java.util.ArrayList;

/* renamed from: com.google.android.gms.measurement.internal.il */
/* compiled from: PG */
final class C145448il implements Runnable {

    /* renamed from: a */
    final /* synthetic */ String f393249a;

    /* renamed from: b */
    final /* synthetic */ String f393250b;

    /* renamed from: c */
    final /* synthetic */ AppMetadata f393251c;

    /* renamed from: d */
    final /* synthetic */ C145198g f393252d;

    /* renamed from: e */
    final /* synthetic */ C145456it f393253e;

    public C145448il(C145456it itVar, String str, String str2, AppMetadata appMetadata, C145198g gVar) {
        this.f393253e = itVar;
        this.f393249a = str;
        this.f393250b = str2;
        this.f393251c = appMetadata;
        this.f393252d = gVar;
    }

    public final void run() {
        C145361ff ffVar;
        ArrayList arrayList = new ArrayList();
        try {
            C145456it itVar = this.f393253e;
            C145316do doVar = itVar.f393272c;
            if (doVar == null) {
                itVar.f393011w.mo120965ar().f392795c.mo120896c("Failed to get conditional properties; not connected to service", this.f393249a, this.f393250b);
                ffVar = this.f393253e.f393011w;
            } else {
                C143919bh.m233958a(this.f393251c);
                arrayList = C145495ke.m236483D(doVar.mo120857g(this.f393249a, this.f393250b, this.f393251c));
                this.f393253e.mo121158n();
                ffVar = this.f393253e.f393011w;
            }
        } catch (RemoteException e) {
            this.f393253e.f393011w.mo120965ar().f392795c.mo120897d("Failed to get conditional properties; remote exception", this.f393249a, this.f393250b, e);
            ffVar = this.f393253e.f393011w;
        } catch (Throwable th) {
            this.f393253e.f393011w.mo120977o().mo121256M(this.f393252d, arrayList);
            throw th;
        }
        ffVar.mo120977o().mo121256M(this.f393252d, arrayList);
    }
}
