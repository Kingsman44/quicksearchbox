package com.google.android.gms.car;

import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.IBinder;
import android.util.Log;
import android.view.View;
import android.view.Window;
import com.evernote.android.state.BuildConfig;
import com.google.android.gms.car.p10760f.C143260ax;
import com.google.android.gms.car.p10760f.C143262az;
import com.google.android.gms.car.p10760f.C143268bb;
import com.google.android.gms.car.p10760f.C143269bc;
import com.google.android.gms.car.p10760f.C143284br;
import com.google.android.gms.car.p10760f.C143311z;
import com.google.android.gms.car.p10764h.C143316a;
import com.google.android.gms.car.p10768k.C143322a;
import java.io.FileDescriptor;
import java.io.PrintWriter;

/* renamed from: com.google.android.gms.car.ag */
/* compiled from: PG */
public abstract class C143095ag extends Service implements C143096ah {

    /* renamed from: a */
    private C143097ai f388169a;

    public final void attachBaseContext(Context context) {
        super.attachBaseContext(context);
    }

    /* renamed from: b */
    public final int mo118033b() {
        return 0;
    }

    /* access modifiers changed from: protected */
    public final void dump(FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        C143268bb bbVar = (C143268bb) this.f388169a;
        if (bbVar.f388461j != null) {
            printWriter.println("activity state:".concat(String.valueOf(C143268bb.m232421e(bbVar.f388444L))));
        }
        C143207dx dxVar = bbVar.f388463l;
        if (dxVar != null) {
            printWriter.println("surface:".concat(String.valueOf(String.valueOf(dxVar.mo118227a()))));
            printWriter.println("display:".concat(String.valueOf(String.valueOf(dxVar.f388308a.getDisplay()))));
        }
        C143179df dfVar = bbVar.f388464m;
        if (dfVar != null) {
            printWriter.println("ProjectedPresentation:");
            boolean z = dfVar.f388265m;
            printWriter.println("  configurationSet:" + z);
            Resources resources = dfVar.getResources();
            if (resources != null) {
                printWriter.println("  configuration:".concat(String.valueOf(String.valueOf(resources.getConfiguration()))));
            }
            boolean isShowing = dfVar.isShowing();
            printWriter.println("  isShowing:" + isShowing);
            boolean z2 = dfVar.f388262j;
            printWriter.println("  attachedToWindow:" + z2);
            boolean z3 = dfVar.f388264l;
            printWriter.println("  inTouchMode:" + z3);
            Window window = dfVar.getWindow();
            printWriter.println("  window:".concat(String.valueOf(String.valueOf(window))));
            boolean z4 = dfVar.f388263k;
            printWriter.println("    hasInputFocus:" + z4);
            boolean z5 = dfVar.f388266n;
            printWriter.println("    windowHasFocus:" + z5);
            printWriter.println("    systemWindowInsets:".concat(String.valueOf(String.valueOf(dfVar.f388227B))));
            if (window != null) {
                printWriter.println("    layout param:".concat(String.valueOf(String.valueOf(window.getAttributes()))));
                printWriter.println("    view hierarchy:");
                View decorView = window.getDecorView();
                C143206dw dwVar = C143206dw.f388307a;
                StringBuilder sb = new StringBuilder();
                C143322a.m232522a(decorView, BuildConfig.FLAVOR, sb, dwVar);
                printWriter.println(sb.toString());
            }
        }
    }

    public final IBinder onBind(Intent intent) {
        C143097ai aiVar = this.f388169a;
        if (C143109au.m232164a("CAR.PROJECTION.CAHI", 3)) {
            C143316a.m232514d(3, "CAR.PROJECTION.CAHI", (Throwable) null, "%s.onBind()", ((C143268bb) aiVar).f388473v);
        }
        C143268bb bbVar = (C143268bb) aiVar;
        bbVar.f388454c = new C143260ax(bbVar);
        return bbVar.f388454c;
    }

    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        C143268bb bbVar = (C143268bb) this.f388169a;
        if (bbVar.f388477z.mo117940t()) {
            bbVar.mo118324t();
        }
    }

    public void onCreate() {
        super.onCreate();
        if (this.f388169a == null) {
            try {
                C143316a.m232513c("CAR.ApiFactory", (Throwable) null, "Initialized ApiFactory to load from local APK");
                this.f388169a = new C143268bb((byte[]) null);
            } catch (C143115b e) {
                Log.e("CAR.PROJECTION", "Error loading car activity host", e);
                throw new RuntimeException(e);
            }
        }
        C143268bb bbVar = (C143268bb) this.f388169a;
        bbVar.f388458g = this;
        bbVar.f388460i = mo19989a();
        bbVar.f388470s = mo118033b();
        bbVar.f388459h = new C143262az(bbVar.f388458g.getApplicationContext());
        bbVar.f388473v = bbVar.f388460i.getSimpleName();
        if (C143109au.m232164a("CAR.PROJECTION.CAHI", 3)) {
            C143316a.m232514d(3, "CAR.PROJECTION.CAHI", (Throwable) null, "%s.onCreate()", bbVar.f388473v);
        }
        bbVar.f388477z.mo117930l(bbVar.f388434B);
        bbVar.f388465n = new C143311z(bbVar.f388477z);
        bbVar.f388446N = new C143269bc(bbVar.f388465n);
        bbVar.f388475x = (C143093ae) C143094af.f388168a.get(bbVar.f388458g.getClass());
    }

    public final void onDestroy() {
        C143097ai aiVar = this.f388169a;
        if (C143109au.m232164a("CAR.PROJECTION.CAHI", 3)) {
            C143316a.m232514d(3, "CAR.PROJECTION.CAHI", (Throwable) null, "%s.onDestroy()", ((C143268bb) aiVar).f388473v);
        }
        C143268bb bbVar = (C143268bb) aiVar;
        C143284br brVar = bbVar.f388474w;
        if (brVar != null) {
            if (C143109au.m232164a("CAR.INPUT", 3)) {
                C143316a.m232511a("CAR.INPUT", (Throwable) null, "destroy");
            }
            brVar.f388493a = true;
        }
        if (bbVar.f388461j != null) {
            bbVar.mo118311k(0, false);
        }
        bbVar.mo118310j();
        bbVar.f388477z.mo118008u((C143134br) null);
        bbVar.f388461j = null;
        bbVar.f388438F = false;
        synchronized (bbVar.f388457f) {
            C143150cf cfVar = ((C143268bb) aiVar).f388447O;
            if (cfVar != null) {
                cfVar.f30761a.unlinkToDeath(((C143268bb) aiVar).f388457f, 0);
                ((C143268bb) aiVar).f388447O = null;
            }
        }
        bbVar.f388463l = null;
        bbVar.f388464m = null;
        bbVar.f388446N = null;
        bbVar.f388466o = null;
        bbVar.f388467p = null;
        bbVar.f388472u = null;
        bbVar.f388473v = null;
        bbVar.f388474w = null;
        bbVar.f388471t = false;
        super.onDestroy();
    }

    public final void onLowMemory() {
        C143091ac acVar = ((C143268bb) this.f388169a).f388461j;
        if (acVar != null) {
            acVar.mo118013C();
        }
    }

    public final boolean onUnbind(Intent intent) {
        C143097ai aiVar = this.f388169a;
        if (C143109au.m232164a("CAR.PROJECTION.CAHI", 3)) {
            C143316a.m232514d(3, "CAR.PROJECTION.CAHI", (Throwable) null, "%s.onUnbind()", ((C143268bb) aiVar).f388473v);
        }
        C143268bb bbVar = (C143268bb) aiVar;
        bbVar.mo118311k(0, false);
        bbVar.mo118310j();
        bbVar.f388454c = null;
        return false;
    }
}
