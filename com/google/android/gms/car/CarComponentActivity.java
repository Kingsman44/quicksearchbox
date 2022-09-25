package com.google.android.gms.car;

import android.app.Application;
import android.content.Intent;
import android.os.Bundle;
import androidx.activity.C0823s;
import androidx.activity.OnBackPressedDispatcher;
import androidx.lifecycle.C2354bb;
import androidx.lifecycle.C2363bk;
import androidx.lifecycle.C2370br;
import androidx.lifecycle.C2371bs;
import androidx.lifecycle.C2380k;
import androidx.lifecycle.C2382m;
import androidx.lifecycle.C2383n;
import androidx.lifecycle.C2384o;
import androidx.lifecycle.C2389t;
import androidx.lifecycle.C2391v;
import androidx.lifecycle.C2393x;
import androidx.lifecycle.p127a.C2320a;
import androidx.lifecycle.p127a.C2322c;
import androidx.savedstate.C4088d;
import androidx.savedstate.C4089e;
import androidx.savedstate.C4090f;
import androidx.savedstate.C4091g;
import com.google.android.gms.car.p10760f.C143268bb;

/* compiled from: PG */
public class CarComponentActivity extends C143090ab implements C2391v, C2371bs, C2380k, C4091g, C0823s {

    /* renamed from: a */
    private final C2393x f387953a;

    /* renamed from: b */
    private final C4090f f387954b = C4089e.m11719a(this);

    /* renamed from: c */
    private C2370br f387955c;

    /* renamed from: d */
    private C2363bk f387956d;

    /* renamed from: h */
    public final OnBackPressedDispatcher f387957h = new OnBackPressedDispatcher(new C143103ao(this));

    public CarComponentActivity() {
        C2393x xVar = new C2393x(this);
        this.f387953a = xVar;
        xVar.mo5790b(new C2389t() {
            /* renamed from: eN */
            public final void mo416eN(C2391v vVar, C2382m mVar) {
                if (mVar == C2382m.ON_DESTROY && !CarComponentActivity.this.mo118017G()) {
                    CarComponentActivity.this.getViewModelStore().mo5774c();
                }
            }
        });
    }

    /* renamed from: B */
    public final void mo117887B() {
        this.f387957h.mo3340c();
    }

    /* renamed from: L */
    public final void mo117888L(C2382m mVar) {
        C2393x xVar = this.f387953a;
        if (xVar instanceof C2393x) {
            xVar.mo5793e(mVar);
        }
    }

    /* renamed from: c */
    public void mo17282c(Bundle bundle) {
        this.f387954b.mo8589b(bundle);
        mo117888L(C2382m.ON_CREATE);
    }

    /* renamed from: f */
    public void mo17284f(Bundle bundle) {
        C2393x xVar = this.f387953a;
        if (xVar instanceof C2393x) {
            xVar.mo5795g(C2383n.CREATED);
        }
        super.mo17284f(bundle);
        this.f387954b.mo8590c(bundle);
    }

    /* renamed from: g */
    public void mo17285g() {
        mo117888L(C2382m.ON_START);
    }

    public final /* synthetic */ C2322c getDefaultViewModelCreationExtras() {
        return C2320a.f6515a;
    }

    public final C2363bk getDefaultViewModelProviderFactory() {
        if (this.f387956d == null) {
            Intent intent = ((C143268bb) this.f388166f).f388466o;
            this.f387956d = new C2354bb((Application) null, this, intent != null ? intent.getExtras() : null);
        }
        return this.f387956d;
    }

    public final C2384o getLifecycle() {
        return this.f387953a;
    }

    public final C4088d getSavedStateRegistry() {
        return this.f387954b.f13082a;
    }

    public final C2370br getViewModelStore() {
        if (this.f387955c == null) {
            C143104ap apVar = (C143104ap) ((C143268bb) this.f388166f).f388436D;
            if (apVar != null) {
                this.f387955c = apVar.f388171a;
            }
            if (this.f387955c == null) {
                this.f387955c = new C2370br();
            }
        }
        return this.f387955c;
    }

    /* renamed from: gz */
    public final OnBackPressedDispatcher mo535gz() {
        return this.f387957h;
    }

    /* renamed from: h */
    public void mo17286h() {
        mo117888L(C2382m.ON_STOP);
    }

    /* renamed from: m */
    public void mo19990m() {
        mo117888L(C2382m.ON_DESTROY);
    }

    /* renamed from: o */
    public void mo19992o() {
        mo117888L(C2382m.ON_PAUSE);
    }

    /* renamed from: p */
    public void mo19993p() {
        mo117888L(C2382m.ON_RESUME);
    }

    /* renamed from: x */
    public final Object mo117889x() {
        C143104ap apVar;
        C2370br brVar = this.f387955c;
        if (brVar == null && (apVar = (C143104ap) ((C143268bb) this.f388166f).f388436D) != null) {
            brVar = apVar.f388171a;
        }
        if (brVar == null) {
            return null;
        }
        C143104ap apVar2 = new C143104ap();
        apVar2.f388171a = brVar;
        return apVar2;
    }
}
