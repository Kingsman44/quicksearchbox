package com.google.android.gms.common.api.internal;

import android.app.PendingIntent;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import com.google.android.gms.common.C143875g;
import com.google.android.gms.common.C143876h;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.libs.p10836d.p10839c.C144861c;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.google.android.gms.common.api.internal.r */
/* compiled from: PG */
public abstract class C143829r extends LifecycleCallback implements DialogInterface.OnCancelListener {

    /* renamed from: a */
    public volatile boolean f389893a;

    /* renamed from: b */
    public final AtomicReference f389894b = new AtomicReference((Object) null);

    /* renamed from: c */
    public final Handler f389895c = new C144861c(Looper.getMainLooper());

    /* renamed from: d */
    protected final C143875g f389896d;

    public C143829r(C143777by byVar, C143875g gVar) {
        super(byVar);
        this.f389896d = gVar;
    }

    /* renamed from: k */
    private static final int m233755k(C143826o oVar) {
        if (oVar == null) {
            return -1;
        }
        return oVar.f389887a;
    }

    /* renamed from: a */
    public final void mo119278a(ConnectionResult connectionResult, int i) {
        this.f389894b.set((Object) null);
        mo119126e(connectionResult, i);
    }

    /* renamed from: b */
    public final void mo119279b() {
        this.f389894b.set((Object) null);
        mo119127f();
    }

    /* renamed from: c */
    public final void mo119115c(int i, int i2, Intent intent) {
        C143826o oVar = (C143826o) this.f389894b.get();
        if (i != 1) {
            if (i == 2) {
                int j = this.f389896d.mo119362j(mo119121l(), C143876h.f389990c);
                if (j == 0) {
                    mo119279b();
                    return;
                } else if (oVar != null) {
                    if (oVar.f389888b.f389574c == 18 && j == 18) {
                        return;
                    }
                } else {
                    return;
                }
            }
        } else if (i2 == -1) {
            mo119279b();
            return;
        } else if (i2 == 0) {
            if (oVar != null) {
                int i3 = 13;
                if (intent != null) {
                    i3 = intent.getIntExtra("<<ResolutionFailureErrorDetail>>", 13);
                }
                mo119278a(new ConnectionResult(1, i3, (PendingIntent) null, oVar.f389888b.toString()), m233755k(oVar));
                return;
            }
            return;
        }
        if (oVar != null) {
            mo119278a(oVar.f389888b, oVar.f389887a);
        }
    }

    /* renamed from: d */
    public final void mo119116d(Bundle bundle) {
        if (bundle != null) {
            AtomicReference atomicReference = this.f389894b;
            C143826o oVar = null;
            if (bundle.getBoolean("resolving_error", false)) {
                oVar = new C143826o(new ConnectionResult(1, bundle.getInt("failed_status"), (PendingIntent) bundle.getParcelable("failed_resolution"), (String) null), bundle.getInt("failed_client_id", -1));
            }
            atomicReference.set(oVar);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public abstract void mo119126e(ConnectionResult connectionResult, int i);

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public abstract void mo119127f();

    /* renamed from: g */
    public final void mo119117g(Bundle bundle) {
        C143826o oVar = (C143826o) this.f389894b.get();
        if (oVar != null) {
            bundle.putBoolean("resolving_error", true);
            bundle.putInt("failed_client_id", oVar.f389887a);
            bundle.putInt("failed_status", oVar.f389888b.f389574c);
            bundle.putParcelable("failed_resolution", oVar.f389888b.f389575d);
        }
    }

    public final void onCancel(DialogInterface dialogInterface) {
        mo119278a(new ConnectionResult(1, 13, (PendingIntent) null, (String) null), m233755k((C143826o) this.f389894b.get()));
    }
}
