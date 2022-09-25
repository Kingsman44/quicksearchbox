package com.google.android.apps.search.sceneviewer;

import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.net.Uri;
import android.os.Bundle;
import android.os.SystemClock;
import android.view.Menu;
import android.view.MenuItem;
import android.view.Window;
import android.view.WindowManager;
import androidx.lifecycle.C2384o;
import androidx.lifecycle.C2393x;
import com.google.android.apps.search.sceneviewer.modelviewer.C141584am;
import com.google.android.apps.search.sceneviewer.modelviewer.C141592b;
import com.google.android.apps.search.sceneviewer.p10647b.C141533a;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.p579ar.sceneviewer.analytics.ViewerLogger;
import com.google.android.libraries.p579ar.sceneviewer.dialog.LoadObjectErrorDialogFragment;
import com.google.android.libraries.p579ar.sceneviewer.permissions.AllPermissionsFragment;
import com.google.android.libraries.p579ar.sceneviewer.permissions.CameraPermissionsFragment;
import com.google.android.libraries.p579ar.sceneviewer.permissions.MediaPermissionsFragment;
import com.google.apps.tiktok.inject.C47214c;
import com.google.apps.tiktok.inject.C47231d;
import com.google.apps.tiktok.inject.baseclasses.C47211g;
import com.google.apps.tiktok.inject.baseclasses.C47212h;
import com.google.apps.tiktok.inject.p3659d.C47237f;
import com.google.apps.tiktok.inject.p3659d.C47241j;
import com.google.apps.tiktok.p3674l.p3680d.C47401a;
import com.google.apps.tiktok.tracing.C47558bi;
import com.google.apps.tiktok.tracing.C47573bx;
import com.google.apps.tiktok.tracing.C47762d;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.apps.tiktok.tracing.C47818f;
import com.google.apps.tiktok.tracing.C47831fm;
import com.google.apps.tiktok.tracing.C47849i;
import com.google.apps.tiktok.tracing.C47851k;
import com.google.common.p4526f.C59052c;
import com.google.p3723ar.core.viewer.analytics.ArViewerLogEnumOuterClass;
import com.google.p3723ar.core.viewer.jniprotolite.Types;
import dagger.hilt.android.internal.managers.C68314a;

/* compiled from: PG */
public final class ViewerActivity extends C141548f implements C47231d, C47211g {

    /* renamed from: k */
    private C141624o f384144k;

    /* renamed from: l */
    private final C47851k f384145l = new C47851k(this, this);

    /* renamed from: m */
    private boolean f384146m;

    /* renamed from: n */
    private Context f384147n;

    /* renamed from: o */
    private C2393x f384148o;

    /* renamed from: p */
    private boolean f384149p;

    public ViewerActivity() {
        SystemClock.elapsedRealtime();
    }

    /* renamed from: x */
    private final void m229720x() {
        if (this.f384144k != null) {
            return;
        }
        if (!this.f384146m) {
            throw new IllegalStateException("createPeer() called outside of onCreate");
        } else if (!this.f384149p || isFinishing()) {
            C47558bi a = C47831fm.m85006a("CreateComponent");
            try {
                mo116556v().mo17653jN();
                a.close();
                C47558bi a2 = C47831fm.m85006a("CreatePeer");
                try {
                    this.f384144k = ((C141626q) mo116556v().mo17653jN()).mo116617bw();
                    a2.close();
                    this.f384144k.f384433h = this;
                    return;
                } catch (ClassCastException e) {
                    throw new IllegalStateException("Missing entry point. If you're in a test with explicit entry points specified in your @TestRoot, check that you're not missing the one for this class.", e);
                } catch (Throwable th) {
                    C141623n.m229830a(th, th);
                }
            } catch (Throwable th2) {
                C141623n.m229830a(th, th2);
            }
        } else {
            throw new IllegalStateException("createPeer() called after destroyed.");
        }
        throw th;
        throw th;
    }

    public final void applyOverrideConfiguration(Configuration configuration) {
        Context baseContext = getBaseContext();
        if (baseContext == null) {
            baseContext = this.f384147n;
        }
        C47401a.m84249b(baseContext, configuration);
        super.applyOverrideConfiguration(configuration);
    }

    /* access modifiers changed from: protected */
    public final void attachBaseContext(Context context) {
        this.f384147n = context;
        super.attachBaseContext(C47401a.m84248a(context));
        this.f384147n = null;
    }

    public final void finish() {
        super.finish();
        m229720x();
        this.f384144k.mo116616f();
    }

    public final C2384o getLifecycle() {
        if (this.f384148o == null) {
            this.f384148o = new C47212h(this);
        }
        return this.f384148o;
    }

    public final void invalidateOptionsMenu() {
        C47573bx w = C47831fm.m85028w();
        try {
            mo1322k().mo1180i();
            w.close();
            return;
        } catch (Throwable th) {
            C141623n.m229830a(th, th);
        }
        throw th;
    }

    /* access modifiers changed from: protected */
    /* renamed from: jA */
    public final void mo1321jA() {
    }

    /* renamed from: m */
    public final boolean mo1323m() {
        C47573bx i = this.f384145l.mo51682i();
        try {
            boolean m = super.mo1323m();
            if (i != null) {
                i.close();
            }
            return m;
        } catch (Throwable th) {
            C141623n.m229830a(th, th);
        }
        throw th;
    }

    /* access modifiers changed from: protected */
    /* renamed from: o */
    public final void mo1324o() {
    }

    /* access modifiers changed from: protected */
    public final void onActivityResult(int i, int i2, Intent intent) {
        C47573bx r = this.f384145l.mo51691r();
        try {
            super.onActivityResult(i, i2, intent);
            if (r != null) {
                r.close();
                return;
            }
            return;
        } catch (Throwable th) {
            C141623n.m229830a(th, th);
        }
        throw th;
    }

    public final void onBackPressed() {
        C47573bx a = this.f384145l.mo51674a();
        try {
            m229720x();
            C141624o oVar = this.f384144k;
            C141592b e = oVar.mo116615e();
            if (e != null) {
                C141584am a2 = e.mo17754z();
                if (a2.f384292T) {
                    if (CameraPermissionsFragment.isVisible(a2.f384337f.getChildFragmentManager())) {
                        CameraPermissionsFragment.hide(a2.f384337f.getChildFragmentManager());
                        ViewerLogger.getInstance().logAction(ArViewerLogEnumOuterClass.ArViewerLogEnum.Action.PERMISSION_WENT_BACK);
                    } else if (MediaPermissionsFragment.isVisible(a2.f384337f.getChildFragmentManager())) {
                        MediaPermissionsFragment.hide(a2.f384337f.getChildFragmentManager());
                        ViewerLogger.getInstance().logAction(ArViewerLogEnumOuterClass.ArViewerLogEnum.Action.PERMISSION_WENT_BACK);
                    } else if (AllPermissionsFragment.isVisible(a2.f384337f.getChildFragmentManager())) {
                        AllPermissionsFragment.hide(a2.f384337f.getChildFragmentManager());
                        ViewerLogger.getInstance().logAction(ArViewerLogEnumOuterClass.ArViewerLogEnum.Action.PERMISSION_WENT_BACK);
                    } else if (Types.ViewerMode.AR.equals(a2.f384353v.getMode()) && !Types.SceneViewerParams.ModePreference.AR_ONLY.equals(a2.f384309aa) && !Types.SceneViewerParams.ModePreference.AR_PREFERRED.equals(a2.f384309aa)) {
                        a2.mo116573g();
                        if (a2.mo116586s()) {
                            a2.mo116583p();
                            ViewerLogger.getInstance().logAction(ArViewerLogEnumOuterClass.ArViewerLogEnum.Action.SWITCH_TO_THREE_D);
                        }
                    } else if (!Types.ViewerMode.THREE_D.equals(a2.f384353v.getMode()) || !Types.SceneViewerParams.ModePreference.AR_PREFERRED.equals(a2.f384309aa) || !a2.f384353v.supportsArMode()) {
                        a2.mo116575i();
                        ViewerLogger.getInstance().logSessionAnalytics(a2.f384313ae, a2.f384314af);
                    } else if (a2.mo116586s()) {
                        a2.mo116583p();
                        ViewerLogger.getInstance().logAction(ArViewerLogEnumOuterClass.ArViewerLogEnum.Action.SWITCH_TO_AR);
                    }
                    a.close();
                    return;
                }
            }
            super.onBackPressed();
            ViewerLogger.getInstance().logUserExited(ArViewerLogEnumOuterClass.ArViewerLogEnum.ExitReason.BACK_BUTTON);
            a.close();
            return;
        } catch (Throwable th) {
            C141623n.m229830a(th, th);
        }
        throw th;
    }

    public final void onConfigurationChanged(Configuration configuration) {
        C47573bx k = this.f384145l.mo51684k("onConfigurationChanged");
        try {
            super.onConfigurationChanged(configuration);
            if (k != null) {
                k.close();
                return;
            }
            return;
        } catch (Throwable th) {
            C141623n.m229830a(th, th);
        }
        throw th;
    }

    /* access modifiers changed from: protected */
    public final void onCreate(Bundle bundle) {
        C141624o oVar;
        C47573bx s = this.f384145l.mo51692s();
        try {
            this.f384146m = true;
            m229720x();
            ((C47212h) getLifecycle()).mo51120i(this.f384145l);
            ((C47237f) mo116556v().mo17653jN()).mo51141bP().mo50899a();
            super.onCreate(bundle);
            m229720x();
            oVar = this.f384144k;
            if (!oVar.f384431f) {
                oVar.f384427b.setRequestedOrientation(1);
            }
        } catch (IllegalStateException e) {
            ((C59052c) ((C59052c) ((C59052c) C141624o.f384426a.mo56226d()).mo56382g(e)).mo56372aa(41725)).mo56386p("setRequestedOrientation: Unable to setRequestedOrientation.");
        } catch (Throwable th) {
            if (s != null) {
                try {
                    ((C47818f) s).f123842a.mo51690q();
                } catch (Throwable th2) {
                    C141623n.m229830a(th, th2);
                }
            }
            throw th;
        }
        oVar.f384427b.setContentView((int) R.layout.sceneviewer_activity);
        Window window = oVar.f384427b.getWindow();
        WindowManager.LayoutParams attributes = window.getAttributes();
        attributes.rotationAnimation = 1;
        window.setAttributes(attributes);
        Intent intent = oVar.f384427b.getIntent();
        if (intent.getData() == null) {
            LoadObjectErrorDialogFragment.showNow(oVar.f384427b.f727a.f739a.f744e);
        } else {
            Uri data = intent.getData();
            data.getClass();
            oVar.f384432g = data;
            if (C141533a.m229750v(oVar.f384432g)) {
                oVar.f384427b.mo1322k().mo1191s(2);
            }
            oVar.f384427b.getWindow().addFlags(128);
            ViewerLogger.getInstance().initialize(oVar.f384428c, oVar.f384429d, oVar.f384430e);
            ViewerLogger.getInstance().setSessionInfo(oVar.f384432g);
        }
        this.f384146m = false;
        if (s != null) {
            ((C47818f) s).f123842a.mo51690q();
        }
    }

    public final boolean onCreatePanelMenu(int i, Menu menu) {
        C47573bx t = this.f384145l.mo51693t();
        try {
            boolean onCreatePanelMenu = super.onCreatePanelMenu(i, menu);
            t.close();
            return onCreatePanelMenu;
        } catch (Throwable th) {
            C141623n.m229830a(th, th);
        }
        throw th;
    }

    /* access modifiers changed from: protected */
    public final void onDestroy() {
        C47573bx b = this.f384145l.mo51675b();
        try {
            super.onDestroy();
            m229720x();
            ViewerLogger.reset();
            this.f384149p = true;
            ((C47849i) b).f123902a.mo51685l();
            return;
        } catch (Throwable th) {
            C141623n.m229830a(th, th);
        }
        throw th;
    }

    /* access modifiers changed from: protected */
    public final void onNewIntent(Intent intent) {
        C47573bx c = this.f384145l.mo51676c(intent);
        try {
            super.onNewIntent(intent);
            m229720x();
            C141624o oVar = this.f384144k;
            intent.getData();
            if (intent.getData() != null) {
                Uri data = intent.getData();
                data.getClass();
                oVar.f384432g = data;
                C141592b e = oVar.mo116615e();
                if (e != null) {
                    e.mo17754z().mo116588v(intent);
                }
            } else {
                oVar.mo116616f();
                oVar.f384427b.startActivity(intent);
            }
            if (c != null) {
                ((C47818f) c).f123842a.mo51690q();
                return;
            }
            return;
        } catch (Throwable th) {
            C141623n.m229830a(th, th);
        }
        throw th;
    }

    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        C47573bx v = this.f384145l.mo51695v();
        try {
            boolean onOptionsItemSelected = super.onOptionsItemSelected(menuItem);
            if (v != null) {
                v.close();
            }
            return onOptionsItemSelected;
        } catch (Throwable th) {
            C141623n.m229830a(th, th);
        }
        throw th;
    }

    /* access modifiers changed from: protected */
    public final void onPause() {
        C47573bx d = this.f384145l.mo51677d();
        try {
            super.onPause();
            if (d != null) {
                d.close();
                return;
            }
            return;
        } catch (Throwable th) {
            C141623n.m229830a(th, th);
        }
        throw th;
    }

    public final void onPictureInPictureModeChanged(boolean z, Configuration configuration) {
        C47573bx w = this.f384145l.mo51696w();
        try {
            super.onPictureInPictureModeChanged(z, configuration);
            if (w != null) {
                w.close();
                return;
            }
            return;
        } catch (Throwable th) {
            C141623n.m229830a(th, th);
        }
        throw th;
    }

    /* access modifiers changed from: protected */
    public final void onPostCreate(Bundle bundle) {
        C47573bx x = this.f384145l.mo51697x();
        try {
            super.onPostCreate(bundle);
            if (x != null) {
                ((C47818f) x).f123842a.mo51690q();
                return;
            }
            return;
        } catch (Throwable th) {
            C141623n.m229830a(th, th);
        }
        throw th;
    }

    /* access modifiers changed from: protected */
    public final void onPostResume() {
        C47573bx e = this.f384145l.mo51678e();
        try {
            super.onPostResume();
            ((C47762d) e).f123749a.mo51686m();
            return;
        } catch (Throwable th) {
            C141623n.m229830a(th, th);
        }
        throw th;
    }

    public final boolean onPrepareOptionsMenu(Menu menu) {
        C47573bx w = C47831fm.m85028w();
        try {
            boolean onPrepareOptionsMenu = super.onPrepareOptionsMenu(menu);
            w.close();
            return onPrepareOptionsMenu;
        } catch (Throwable th) {
            C141623n.m229830a(th, th);
        }
        throw th;
    }

    public final void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        C47573bx k = this.f384145l.mo51684k("onRequestPermissionsResult");
        try {
            super.onRequestPermissionsResult(i, strArr, iArr);
            if (k != null) {
                k.close();
                return;
            }
            return;
        } catch (Throwable th) {
            C141623n.m229830a(th, th);
        }
        throw th;
    }

    /* access modifiers changed from: protected */
    public final void onResume() {
        C47573bx f = this.f384145l.mo51679f();
        try {
            super.onResume();
            if (f != null) {
                ((C47818f) f).f123842a.mo51690q();
                return;
            }
            return;
        } catch (Throwable th) {
            C141623n.m229830a(th, th);
        }
        throw th;
    }

    /* access modifiers changed from: protected */
    public final void onSaveInstanceState(Bundle bundle) {
        C47573bx y = this.f384145l.mo51698y();
        try {
            super.onSaveInstanceState(bundle);
            if (y != null) {
                y.close();
                return;
            }
            return;
        } catch (Throwable th) {
            C141623n.m229830a(th, th);
        }
        throw th;
    }

    /* access modifiers changed from: protected */
    public final void onStart() {
        C47573bx g = this.f384145l.mo51680g();
        try {
            super.onStart();
            if (g != null) {
                ((C47818f) g).f123842a.mo51690q();
                return;
            }
            return;
        } catch (Throwable th) {
            C141623n.m229830a(th, th);
        }
        throw th;
    }

    /* access modifiers changed from: protected */
    public final void onStop() {
        C47573bx h = this.f384145l.mo51681h();
        try {
            super.onStop();
            if (h != null) {
                h.close();
                return;
            }
            return;
        } catch (Throwable th) {
            C141623n.m229830a(th, th);
        }
        throw th;
    }

    public final void onUserInteraction() {
        C47573bx j = this.f384145l.mo51683j();
        try {
            super.onUserInteraction();
            if (j != null) {
                j.close();
                return;
            }
            return;
        } catch (Throwable th) {
            C141623n.m229830a(th, th);
        }
        throw th;
    }

    /* access modifiers changed from: protected */
    public final void onUserLeaveHint() {
        super.onUserLeaveHint();
        m229720x();
        ViewerLogger.getInstance().logUserExited(ArViewerLogEnumOuterClass.ArViewerLogEnum.ExitReason.USER_LEFT);
    }

    public final void startActivity(Intent intent) {
        if (C47214c.m83984a(intent, getApplicationContext())) {
            int i = C47810es.f123822b;
        }
        super.startActivity(intent);
    }

    /* renamed from: w */
    public final /* synthetic */ C68314a mo116551w() {
        return new C47241j(this);
    }

    /* renamed from: z */
    public final /* bridge */ /* synthetic */ Object mo17754z() {
        C141624o oVar = this.f384144k;
        if (oVar == null) {
            throw new IllegalStateException("peer() called before initialized.");
        } else if (!this.f384149p) {
            return oVar;
        } else {
            throw new IllegalStateException("peer() called after destroyed.");
        }
    }

    public final void startActivity(Intent intent, Bundle bundle) {
        if (C47214c.m83984a(intent, getApplicationContext())) {
            int i = C47810es.f123822b;
        }
        super.startActivity(intent, bundle);
    }
}
