package com.google.apps.tiktok.tracing;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import com.google.android.libraries.p1623at.p1632e.C19559g;

/* renamed from: com.google.apps.tiktok.tracing.fu */
/* compiled from: PG */
final class C47840fu implements ServiceConnection {

    /* renamed from: a */
    final /* synthetic */ C47842fw f123870a;

    public C47840fu(C47842fw fwVar) {
        this.f123870a = fwVar;
    }

    public final void onBindingDied(ComponentName componentName) {
        C47770dh dhVar;
        synchronized (this.f123870a.f123873c) {
            dhVar = this.f123870a.f123875e;
        }
        dhVar.getClass();
        C47538ax c = dhVar.mo51613c("onBindingDied:".concat(String.valueOf(componentName.flattenToShortString())));
        if (c != null) {
            c.close();
        }
    }

    public final void onNullBinding(ComponentName componentName) {
        C47572bw bwVar;
        C47770dh dhVar;
        synchronized (this.f123870a.f123873c) {
            C47841fv fvVar = this.f123870a.f123874d;
            bwVar = null;
            if (fvVar != null) {
                C47572bw bwVar2 = fvVar.f123871a;
                fvVar.f123871a = null;
                C19559g.m37302a().removeCallbacks(fvVar);
                this.f123870a.f123874d = null;
                bwVar = bwVar2;
            }
            dhVar = this.f123870a.f123875e;
        }
        if (bwVar != null) {
            C47572bw h = C47831fm.m85013h(bwVar);
            try {
                this.f123870a.mo50312a();
                return;
            } finally {
                C47831fm.m85013h(h);
            }
        } else {
            C47538ax c = dhVar.mo51613c("onServiceConnected:".concat(String.valueOf(componentName.flattenToShortString())));
            try {
                this.f123870a.mo50312a();
                if (c != null) {
                    c.close();
                    return;
                }
                return;
            } catch (Throwable th) {
                C47839ft.m85038a(th, th);
            }
        }
        throw th;
    }

    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        C47572bw bwVar;
        C47770dh dhVar;
        synchronized (this.f123870a.f123873c) {
            C47841fv fvVar = this.f123870a.f123874d;
            bwVar = null;
            if (fvVar != null) {
                C47572bw bwVar2 = fvVar.f123871a;
                fvVar.f123871a = null;
                C19559g.m37302a().removeCallbacks(fvVar);
                this.f123870a.f123874d = null;
                bwVar = bwVar2;
            }
            dhVar = this.f123870a.f123875e;
        }
        if (bwVar != null) {
            C47572bw h = C47831fm.m85013h(bwVar);
            try {
                this.f123870a.mo50313b(iBinder);
                return;
            } finally {
                C47831fm.m85013h(h);
            }
        } else {
            C47538ax c = dhVar.mo51613c("onServiceConnected:".concat(String.valueOf(componentName.flattenToShortString())));
            try {
                this.f123870a.mo50313b(iBinder);
                if (c != null) {
                    c.close();
                    return;
                }
                return;
            } catch (Throwable th) {
                C47839ft.m85038a(th, th);
            }
        }
        throw th;
    }

    public final void onServiceDisconnected(ComponentName componentName) {
        C47770dh dhVar;
        synchronized (this.f123870a.f123873c) {
            dhVar = this.f123870a.f123875e;
        }
        dhVar.getClass();
        C47538ax c = dhVar.mo51613c("onServiceDisconnected:".concat(String.valueOf(componentName.flattenToShortString())));
        try {
            this.f123870a.mo50314c();
            if (c != null) {
                c.close();
                return;
            }
            return;
        } catch (Throwable th) {
            C47839ft.m85038a(th, th);
        }
        throw th;
    }
}
