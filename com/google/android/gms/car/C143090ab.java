package com.google.android.gms.car;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Looper;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import com.google.android.gms.car.p10759e.C143212d;
import com.google.android.gms.car.p10760f.C143238ab;
import com.google.android.gms.car.p10760f.C143268bb;
import com.google.android.gms.car.p10760f.C143284br;
import com.google.android.p445a.C8850c;
import com.google.common.base.C58838bb;

/* renamed from: com.google.android.gms.car.ab */
/* compiled from: PG */
public class C143090ab extends ContextWrapper implements LayoutInflater.Factory, C143091ac {

    /* renamed from: f */
    public C143092ad f388166f;

    /* renamed from: g */
    public boolean f388167g;

    public C143090ab() {
        super((Context) null);
    }

    /* renamed from: A */
    public final void mo118012A() {
        C143092ad adVar = this.f388166f;
        if (adVar != null) {
            adVar.mo118030a();
        }
    }

    /* renamed from: B */
    public void mo117887B() {
        this.f388167g = false;
    }

    /* renamed from: C */
    public void mo118013C() {
    }

    /* renamed from: D */
    public void mo118014D() {
    }

    /* renamed from: E */
    public void mo118015E(Context context) {
        attachBaseContext(context);
    }

    /* renamed from: F */
    public final void mo118016F(Intent intent) {
        C143092ad adVar = this.f388166f;
        try {
            ((C143268bb) adVar).f388466o = intent;
            C143150cf cfVar = ((C143268bb) adVar).f388447O;
            if (cfVar != null) {
                Parcel gA = cfVar.mo17260gA();
                C8850c.m23497f(gA, intent);
                cfVar.mo17262he(21, gA);
            }
        } catch (RemoteException unused) {
            C143181dh.m232308a(Looper.getMainLooper(), ((C143268bb) adVar).f388456e);
        }
    }

    /* renamed from: G */
    public final boolean mo118017G() {
        C143092ad adVar = this.f388166f;
        if (adVar != null) {
            try {
                return ((C143268bb) adVar).f388469r;
            } catch (AbstractMethodError | NoSuchMethodError unused) {
                Log.d("CAR.PROJECTION", "Unable check if changing configurations");
                if (!mo118018H()) {
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: H */
    public final boolean mo118018H() {
        C143092ad adVar = this.f388166f;
        if (adVar != null) {
            return ((C143268bb) adVar).f388471t;
        }
        return true;
    }

    /* renamed from: I */
    public final boolean mo118019I() {
        return false;
    }

    /* renamed from: J */
    public final boolean mo118020J() {
        return false;
    }

    /* renamed from: K */
    public final boolean mo118021K(int i) {
        if (i != 4) {
            return false;
        }
        this.f388167g = true;
        mo117887B();
        return this.f388167g;
    }

    /* renamed from: a */
    public void mo17280a(IBinder iBinder) {
    }

    /* renamed from: b */
    public void mo17281b(Configuration configuration) {
    }

    /* renamed from: c */
    public void mo17282c(Bundle bundle) {
    }

    /* renamed from: e */
    public void mo17283e(Bundle bundle) {
        Bundle bundle2;
        C143268bb bbVar = (C143268bb) this.f388166f;
        C143179df dfVar = bbVar.f388464m;
        if (dfVar != null && dfVar.getWindow() != null && (bundle2 = bundle.getBundle("android:viewHierarchyState")) != null) {
            bbVar.f388464m.getWindow().restoreHierarchyState(bundle2);
        }
    }

    /* renamed from: f */
    public void mo17284f(Bundle bundle) {
        bundle.putBundle("android:viewHierarchyState", ((C143268bb) this.f388166f).f388464m.getWindow().saveHierarchyState());
    }

    /* renamed from: g */
    public void mo17285g() {
    }

    /* renamed from: h */
    public void mo17286h() {
    }

    /* renamed from: i */
    public void mo17287i(WindowManager.LayoutParams layoutParams) {
    }

    /* renamed from: k */
    public void mo17289k(boolean z) {
    }

    /* renamed from: m */
    public void mo19990m() {
    }

    /* renamed from: n */
    public void mo19991n(Intent intent) {
    }

    /* renamed from: o */
    public void mo19992o() {
    }

    public View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return null;
    }

    /* renamed from: p */
    public void mo19993p() {
    }

    /* renamed from: r */
    public final int mo118022r() {
        try {
            C143092ad adVar = this.f388166f;
            C58838bb.m90866a(((C143268bb) adVar).f388462k, "Can't provide displayId before activity is started");
            return ((C143268bb) adVar).f388462k.f388294b.f388292b;
        } catch (AbstractMethodError | NoSuchMethodError unused) {
            Log.w("CAR.PROJECTION", "CarActivityHost#getDisplayId does not exit. Using primary car display id as fallback.");
            return 0;
        }
    }

    /* renamed from: s */
    public final int mo118023s() {
        try {
            C143092ad adVar = this.f388166f;
            C58838bb.m90866a(((C143268bb) adVar).f388462k, "Can't provide regionId before activity is started");
            return ((C143268bb) adVar).f388462k.f388293a;
        } catch (AbstractMethodError | NoSuchMethodError unused) {
            Log.w("CAR.PROJECTION", "CarActivityHost#getRegionId does not exit. Using primary car region id as fallback.");
            return 0;
        }
    }

    /* renamed from: t */
    public final LayoutInflater mo118024t() {
        return ((C143268bb) this.f388166f).f388464m.getLayoutInflater();
    }

    /* renamed from: u */
    public final View mo118025u(int i) {
        return ((C143268bb) this.f388166f).f388464m.findViewById(i);
    }

    /* renamed from: v */
    public final Window mo118026v() {
        return ((C143268bb) this.f388166f).f388464m.getWindow();
    }

    /* renamed from: w */
    public final C143212d mo118027w() {
        C143268bb bbVar = (C143268bb) this.f388166f;
        if (bbVar.f388474w == null) {
            bbVar.f388474w = new C143284br(new C143238ab(bbVar));
        }
        return bbVar.f388474w;
    }

    /* renamed from: x */
    public Object mo117889x() {
        return null;
    }

    /* renamed from: y */
    public final void mo118028y(C143092ad adVar) {
        if (Log.isLoggable("CAR.PROJECTION", 2)) {
            int i = getResources().getConfiguration().densityDpi;
            Log.v("CAR.PROJECTION", "Context DPI: " + i);
        }
        this.f388166f = adVar;
    }

    /* renamed from: z */
    public final void mo118029z() {
        C143092ad adVar = this.f388166f;
        C143268bb bbVar = (C143268bb) adVar;
        C143179df dfVar = bbVar.f388464m;
        if (!dfVar.isShowing()) {
            dfVar.mo118143c().setFormat(-3);
            try {
                C143150cf cfVar = ((C143268bb) adVar).f388447O;
                if (cfVar != null) {
                    cfVar.mo17262he(31, cfVar.mo17260gA());
                }
            } catch (RemoteException unused) {
                C143181dh.m232308a(Looper.getMainLooper(), bbVar.f388456e);
            }
        } else {
            throw new IllegalStateException("Transparency cannot be enabled after the Presentation is shown");
        }
    }
}
