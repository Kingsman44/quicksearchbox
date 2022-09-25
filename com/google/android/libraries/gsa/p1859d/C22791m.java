package com.google.android.libraries.gsa.p1859d;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.graphics.Bitmap;
import android.graphics.Point;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Process;
import android.os.RemoteException;
import android.view.Display;
import android.view.WindowManager;
import com.google.android.libraries.p10922ab.C146707c;
import java.lang.ref.WeakReference;

/* renamed from: com.google.android.libraries.gsa.d.m */
/* compiled from: PG */
public final class C22791m {

    /* renamed from: a */
    public static int f62740a = -1;

    /* renamed from: b */
    public final Activity f62741b;

    /* renamed from: c */
    public final C22792n f62742c;

    /* renamed from: d */
    public final C22785g f62743d = new C22785g("Client", 20);

    /* renamed from: e */
    public final C22785g f62744e = new C22785g("Service", 10);

    /* renamed from: f */
    public final C22799u f62745f;

    /* renamed from: g */
    public final C22783e f62746g;

    /* renamed from: h */
    public final BroadcastReceiver f62747h;

    /* renamed from: i */
    public C146707c f62748i;

    /* renamed from: j */
    public int f62749j;

    /* renamed from: k */
    public boolean f62750k;

    /* renamed from: l */
    public int f62751l;

    /* renamed from: m */
    public C22789k f62752m;

    /* renamed from: n */
    public WindowManager.LayoutParams f62753n;

    /* renamed from: o */
    public C22790l f62754o;

    /* renamed from: p */
    private final Handler f62755p;

    public C22791m(Activity activity, C22792n nVar, C22789k kVar, Looper looper) {
        C22786h hVar = new C22786h(this);
        this.f62747h = hVar;
        this.f62749j = 0;
        this.f62750k = false;
        this.f62751l = 0;
        this.f62741b = activity;
        this.f62742c = nVar;
        this.f62752m = kVar;
        Handler handler = new Handler(looper);
        this.f62755p = handler;
        String str = this.f62752m.f62732b;
        this.f62745f = new C22799u(activity, 65, handler);
        C22783e eVar = C22783e.f62716a;
        if (eVar != null && !str.equals(eVar.f62763f)) {
            eVar.mo28148d();
            C22783e.f62716a = null;
        }
        if (C22783e.f62716a == null) {
            C22783e.f62716a = new C22783e(activity.getApplicationContext(), handler);
        }
        C22783e eVar2 = C22783e.f62716a;
        this.f62746g = eVar2;
        eVar2.f62718c = new WeakReference(this);
        this.f62748i = eVar2.f62717b;
        IntentFilter intentFilter = new IntentFilter("android.intent.action.PACKAGE_ADDED");
        intentFilter.addDataScheme("package");
        intentFilter.addDataSchemeSpecificPart(this.f62752m.f62732b, 0);
        activity.registerReceiver(hVar, intentFilter);
        if (f62740a <= 0) {
            mo28136e(activity);
        }
        mo28134c();
        if (activity.getWindow() != null && activity.getWindow().peekDecorView() != null && activity.getWindow().peekDecorView().isAttachedToWindow()) {
            mo28135d();
        }
    }

    /* renamed from: h */
    static Intent m42603h(Context context) {
        return new Intent("com.android.launcher3.WINDOW_OVERLAY").setPackage("com.google.android.googlequicksearchbox").setData(Uri.parse("app://" + context.getPackageName() + ":" + Process.myUid()).buildUpon().appendQueryParameter("v", Integer.toString(11)).appendQueryParameter("cv", Integer.toString(20)).build());
    }

    /* renamed from: a */
    public final void mo28132a() {
        Display display;
        if (this.f62748i != null) {
            try {
                if (this.f62754o == null) {
                    this.f62754o = new C22790l();
                }
                C22790l lVar = this.f62754o;
                lVar.f62735a = this;
                lVar.f62736b = this.f62741b.getWindowManager();
                Point point = new Point();
                if (Build.VERSION.SDK_INT >= 30) {
                    display = this.f62741b.getDisplay();
                } else {
                    display = lVar.f62736b.getDefaultDisplay();
                }
                display.getRealSize(point);
                lVar.f62737c = -Math.max(point.x, point.y);
                lVar.f62738d = this.f62741b.getWindow();
                if (f62740a < 3) {
                    this.f62748i.mo28073C(this.f62753n, this.f62754o, this.f62752m.f62731a);
                } else {
                    Bundle bundle = new Bundle();
                    bundle.putParcelable("layout_params", this.f62753n);
                    bundle.putParcelable("configuration", this.f62741b.getResources().getConfiguration());
                    bundle.putInt("client_options", this.f62752m.f62731a);
                    Bitmap bitmap = this.f62752m.f62734d;
                    this.f62748i.mo28074D(bundle, this.f62754o);
                }
                if (f62740a >= 4) {
                    this.f62748i.mo28092u(this.f62749j);
                } else if ((this.f62749j & 2) != 0) {
                    this.f62748i.mo28086n();
                } else {
                    this.f62748i.mo28085m();
                }
            } catch (RemoteException unused) {
            }
        }
    }

    /* renamed from: b */
    public final void mo28133b(int i) {
        int i2 = i & 1;
        int i3 = this.f62751l;
        int i4 = i3 & 1;
        boolean z = false;
        boolean z2 = (i & 2) != 0;
        boolean z3 = (i3 & 2) != 0;
        if (!(i2 == i4 && z2 == z3)) {
            C22792n nVar = this.f62742c;
            if (1 == i2) {
                z = true;
            }
            nVar.mo28140b(z);
        }
        this.f62751l = i;
    }

    /* renamed from: c */
    public final void mo28134c() {
        boolean z = this.f62752m.f62733c;
        if (!this.f62750k) {
            C22799u.m42621c(this.f62755p, new C22788j(this));
        }
    }

    /* renamed from: d */
    public final void mo28135d() {
        if (!this.f62750k) {
            this.f62743d.mo28121a("attachedToWindow");
            mo28137f(this.f62741b.getWindow().getAttributes());
        }
    }

    /* renamed from: e */
    public final void mo28136e(Context context) {
        PackageManager packageManager = context.getPackageManager();
        String str = this.f62752m.f62732b;
        ResolveInfo resolveService = packageManager.resolveService(m42603h(context), 128);
        if (resolveService == null || resolveService.serviceInfo.metaData == null) {
            f62740a = 1;
        } else {
            f62740a = resolveService.serviceInfo.metaData.getInt("service.api.version", 1);
        }
    }

    /* renamed from: f */
    public final void mo28137f(WindowManager.LayoutParams layoutParams) {
        if (this.f62753n != layoutParams) {
            this.f62753n = layoutParams;
            if (layoutParams != null) {
                mo28132a();
                return;
            }
            C146707c cVar = this.f62748i;
            if (cVar != null) {
                try {
                    cVar.mo28075F(this.f62741b.isChangingConfigurations());
                } catch (RemoteException unused) {
                }
                this.f62748i = null;
            }
        }
    }

    /* renamed from: g */
    public final boolean mo28138g() {
        return this.f62748i != null;
    }
}
