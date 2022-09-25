package com.google.android.apps.auto.sdk;

import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import android.support.p033v7.widget.LinearLayoutManager;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import com.google.android.gms.car.C143092ad;
import com.google.android.gms.car.C143106ar;
import com.google.android.gms.car.C143111aw;
import com.google.android.gms.car.C143112ax;
import com.google.android.gms.car.CarInfo;
import com.google.android.gms.car.p10750a.p10751a.C143059db;
import com.google.android.gms.car.p10750a.p10751a.C143079x;
import com.google.android.gms.car.p10760f.C143268bb;
import com.google.android.gms.car.p10760f.C143275bi;
import com.google.android.gms.car.p10760f.C143276bj;
import com.google.android.gms.car.p10760f.C143311z;
import com.google.android.p445a.C8850c;

/* renamed from: com.google.android.apps.auto.sdk.c */
/* compiled from: PG */
public class C8971c extends C143106ar {

    /* renamed from: a */
    public C8972d f31072a;

    /* renamed from: b */
    private C8967ac f31073b;

    /* renamed from: c */
    private C8969ae f31074c;

    /* renamed from: d */
    private ViewGroup f31075d;

    /* renamed from: a */
    public final void mo17280a(IBinder iBinder) {
        C8972d dVar = this.f31072a;
        dVar.mo17306c(dVar.f31083h, iBinder);
    }

    /* renamed from: b */
    public final void mo17281b(Configuration configuration) {
        super.mo17281b(configuration);
        Log.d("CSL.CarActivity", "onConfigurationChanged ".concat(String.valueOf(String.valueOf(configuration))));
        getResources().getConfiguration().updateFrom(configuration);
        C8972d dVar = this.f31072a;
        Configuration configuration2 = getResources().getConfiguration();
        dVar.mo17306c(dVar.f31086k, configuration2);
    }

    /* renamed from: c */
    public void mo17282c(Bundle bundle) {
        C143275bi biVar;
        C143276bj bjVar;
        super.mo17282c(bundle);
        this.f31073b = new C8967ac(getBaseContext());
        this.f31074c = new C8969ae();
        Context context = this.f31073b.f31063b;
        Resources resources = context.getResources();
        try {
            C143092ad adVar = this.f388166f;
            if (!((C143268bb) adVar).mo118326v()) {
                bjVar = null;
            } else {
                C143059db dbVar = ((C143311z) ((C143268bb) adVar).f388446N.f388478a).f388542a;
                bjVar = (C143276bj) dbVar.f388029d.mo117944c(C143276bj.class, new C143079x(dbVar));
            }
            CarInfo a = bjVar.f388481a.mo117914a();
            a.getClass();
            biVar = new C143275bi(a);
        } catch (C143111aw | C143112ax e) {
            Log.w("CSL.CarActivity", "Unable to get car info", e);
            biVar = null;
        }
        if (C8966ab.m23523a(C8994z.MULTI_REGION_CAR_UI_ENTRY, context, resources)) {
            this.f31072a = new C8972d(this.f31073b, mo118027w(), this.f31074c, biVar, mo118022r(), mo118023s());
        } else if (C8966ab.m23523a(C8994z.MULTI_DISPLAY_CAR_UI_ENTRY, context, resources)) {
            this.f31072a = new C8972d(this.f31073b, mo118027w(), this.f31074c, biVar, mo118022r());
        } else {
            Log.d("CSL.CarActivity", "Creating CarUiController without displayId");
            this.f31072a = new C8972d(this.f31073b, mo118027w(), this.f31074c, biVar);
        }
        this.f388166f.mo118031b(this.f31072a.mo17292a());
        this.f31075d = (ViewGroup) mo118025u(this.f31072a.f31080e);
        C8965aa aaVar = C8965aa.DRAWER_HEADER_HEIGHT;
        int identifier = resources.getIdentifier(aaVar.f31061d, "dimen", context.getPackageName());
        if (identifier != 0) {
            int dimensionPixelOffset = resources.getDimensionPixelOffset(identifier);
            C8968ad adVar2 = this.f31072a.f31077b;
            Intent intent = ((C143268bb) this.f388166f).f388466o;
            boolean z = false;
            if (intent != null && intent.getBooleanExtra("assistant_activity", false)) {
                z = true;
            }
            try {
                C8986r rVar = adVar2.f31064a;
                Parcel gA = rVar.mo17260gA();
                C8850c.m23495d(gA, z);
                rVar.mo17262he(21, gA);
            } catch (RemoteException unused) {
                Log.e("CSL.StatusBarController", "Error setting demand window status");
            }
            if (C8966ab.m23523a(C8994z.SUPPORTS_WINDOW_INSETS, context, resources)) {
                this.f31072a.f31076a.f31056a.contains("APP_BAR_INSET_BEHAVIOR");
            } else {
                this.f31075d.setOnApplyWindowInsetsListener(new C8970b(this, dimensionPixelOffset));
            }
        } else {
            throw new Resources.NotFoundException("Can't find resource: @dimen/".concat(String.valueOf(aaVar.f31061d)));
        }
    }

    /* renamed from: e */
    public final void mo17283e(Bundle bundle) {
        Bundle bundle2 = bundle.getBundle("android:viewHierarchyState");
        if (bundle2 != null) {
            bundle2.setClassLoader(this.f31073b.f31063b.getClassLoader());
        }
        super.mo17283e(bundle);
        C8972d dVar = this.f31072a;
        dVar.mo17306c(dVar.f31084i, bundle);
        C8992x xVar = dVar.f31078c;
        Log.d("CSL.MenuController", "onRestoreInstanceState");
        Log.w("CSL.MenuController", "Root MenuAdapter is null after day/night mode Activity recreate.");
    }

    /* renamed from: f */
    public final void mo17284f(Bundle bundle) {
        super.mo17284f(bundle);
        C8972d dVar = this.f31072a;
        dVar.mo17306c(dVar.f31085j, bundle);
    }

    /* renamed from: g */
    public void mo17285g() {
        super.mo17285g();
        C8972d dVar = this.f31072a;
        dVar.mo17306c(dVar.f31081f, new Object[0]);
    }

    /* renamed from: h */
    public void mo17286h() {
        super.mo17286h();
        C8972d dVar = this.f31072a;
        dVar.mo17306c(dVar.f31082g, new Object[0]);
    }

    /* renamed from: i */
    public final void mo17287i(WindowManager.LayoutParams layoutParams) {
        boolean z = true;
        boolean z2 = (layoutParams.flags & LinearLayoutManager.INVALID_OFFSET) == 0;
        if ((layoutParams.flags & 67108864) != 0) {
            z = false;
        }
        C8968ad adVar = this.f31072a.f31077b;
        Log.d("CSL.StatusBarController", "setStatusBarBackgroundVisibility");
        try {
            C8986r rVar = adVar.f31064a;
            Parcel gA = rVar.mo17260gA();
            C8850c.m23495d(gA, z2);
            C8850c.m23495d(gA, z);
            rVar.mo17262he(19, gA);
        } catch (RemoteException e) {
            Log.e("CSL.StatusBarController", "Error setting status bar background visibility", e);
        }
    }

    /* renamed from: j */
    public final void mo17288j(View view) {
        this.f31075d.removeAllViews();
        this.f31075d.addView(view);
    }

    /* renamed from: k */
    public final void mo17289k(boolean z) {
        C8991w wVar = this.f31072a.f31079d;
        if (z && getResources().getConfiguration().navigation == 2 && wVar.mo17305b()) {
            wVar.mo17304a();
        }
    }

    /* renamed from: l */
    public final void mo17290l() {
        ((C143268bb) this.f388166f).f388470s = 515;
    }

    public final View onCreateView(String str, Context context, AttributeSet attributeSet) {
        View onCreateView = this.f31074c.onCreateView(str, context, attributeSet);
        if (onCreateView != null) {
            return onCreateView;
        }
        return super.onCreateView(str, context, attributeSet);
    }
}
