package com.google.android.apps.gsa.staticplugins.opa.p8410s.p8411a;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.view.ViewGroup;
import com.google.android.libraries.elements.C21196h;
import com.google.android.libraries.elements.interfaces.C21255ay;
import com.google.android.libraries.elements.interfaces.C21256az;
import com.google.android.libraries.elements.interfaces.C21298e;
import com.google.protos.youtube.elements.C66166ck;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.s.a.r */
/* compiled from: PG */
public final class C109977r {

    /* renamed from: a */
    private final Activity f306430a;

    /* renamed from: b */
    private final C21196h f306431b;

    /* renamed from: c */
    private Dialog f306432c;

    public C109977r(Context context, Activity activity, C69464a aVar) {
        this.f306430a = activity;
        C21255ay l = C21256az.m40047l(aVar);
        l.mo26718f(false);
        ((C21298e) l).f59649b = "OverlayControllerImpl";
        this.f306431b = new C21196h(context, l.mo26713a());
    }

    /* renamed from: a */
    public final void mo98276a() {
        if (this.f306431b.getParent() != null) {
            ((ViewGroup) this.f306431b.getParent()).removeView(this.f306431b);
        }
        Dialog dialog = this.f306432c;
        if (dialog != null) {
            dialog.dismiss();
            this.f306432c = null;
        }
    }

    /* renamed from: b */
    public final void mo98277b(C66166ck ckVar) {
        mo98276a();
        this.f306431b.mo26215b(ckVar.toByteArray());
        Dialog dialog = new Dialog(this.f306430a);
        this.f306432c = dialog;
        dialog.requestWindowFeature(1);
        this.f306432c.setContentView(this.f306431b);
        this.f306432c.show();
    }
}
