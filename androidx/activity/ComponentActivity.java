package androidx.activity;

import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Trace;
import android.support.p031v4.app.C0229cu;
import android.support.p031v4.app.C0230cv;
import android.support.p031v4.app.C0241df;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.activity.p045a.C0787a;
import androidx.activity.p045a.C0788b;
import androidx.activity.result.ActivityResultRegistry;
import androidx.activity.result.C0815b;
import androidx.activity.result.C0816c;
import androidx.activity.result.C0821h;
import androidx.activity.result.p046a.C0809b;
import androidx.core.p094f.C1888a;
import androidx.core.p097i.C1967b;
import androidx.core.p098j.C2105t;
import androidx.core.p098j.C2108w;
import androidx.lifecycle.C2340ao;
import androidx.lifecycle.C2349ax;
import androidx.lifecycle.C2351az;
import androidx.lifecycle.C2354bb;
import androidx.lifecycle.C2361bi;
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
import androidx.lifecycle.SavedStateHandleAttacher;
import androidx.lifecycle.p127a.C2320a;
import androidx.lifecycle.p127a.C2322c;
import androidx.lifecycle.p127a.C2324e;
import androidx.p196t.C4188a;
import androidx.savedstate.C4088d;
import androidx.savedstate.C4089e;
import androidx.savedstate.C4090f;
import androidx.savedstate.C4091g;
import androidx.savedstate.C4092h;
import com.google.android.googlequicksearchbox.R;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;
import p5462h.p5473f.p5474a.C69615a;
import p5462h.p5473f.p5475b.C69664n;

/* compiled from: PG */
public class ComponentActivity extends C0241df implements C2391v, C2371bs, C2380k, C4091g, C0823s, C0821h {

    /* renamed from: YZ */
    private int f2698YZ;

    /* renamed from: Zl */
    private final AtomicInteger f2699Zl;

    /* renamed from: a */
    private final C2105t f2700a;

    /* renamed from: b */
    private final C2393x f2701b;

    /* renamed from: c */
    private C2370br f2702c;

    /* renamed from: d */
    private C2363bk f2703d;

    /* renamed from: e */
    private final C0799l f2704e;

    /* renamed from: f */
    public final C0787a f2705f;

    /* renamed from: g */
    public final C4090f f2706g;

    /* renamed from: h */
    public final OnBackPressedDispatcher f2707h;

    /* renamed from: i */
    public final ActivityResultRegistry f2708i;

    /* renamed from: l */
    private final CopyOnWriteArrayList f2709l;

    /* renamed from: m */
    private final CopyOnWriteArrayList f2710m;

    /* renamed from: n */
    private final CopyOnWriteArrayList f2711n;

    /* renamed from: o */
    private final CopyOnWriteArrayList f2712o;

    /* renamed from: p */
    private final CopyOnWriteArrayList f2713p;

    /* renamed from: q */
    private boolean f2714q;

    /* renamed from: r */
    private boolean f2715r;

    public ComponentActivity() {
        C0787a aVar = new C0787a();
        this.f2705f = aVar;
        this.f2700a = new C2105t();
        this.f2701b = new C2393x(this);
        C4090f a = C4089e.m11719a(this);
        this.f2706g = a;
        this.f2707h = new OnBackPressedDispatcher(new C0791d(this));
        this.f2704e = new C0799l();
        this.f2699Zl = new AtomicInteger();
        this.f2708i = new C0794g(this);
        this.f2709l = new CopyOnWriteArrayList();
        this.f2710m = new CopyOnWriteArrayList();
        this.f2711n = new CopyOnWriteArrayList();
        this.f2712o = new CopyOnWriteArrayList();
        this.f2713p = new CopyOnWriteArrayList();
        this.f2714q = false;
        this.f2715r = false;
        if (getLifecycle() != null) {
            getLifecycle().mo5790b(new C2389t() {
                /* renamed from: eN */
                public final void mo416eN(C2391v vVar, C2382m mVar) {
                    if (mVar == C2382m.ON_STOP) {
                        Window window = ComponentActivity.this.getWindow();
                        View peekDecorView = window != null ? window.peekDecorView() : null;
                        if (peekDecorView != null) {
                            peekDecorView.cancelPendingInputEvents();
                        }
                    }
                }
            });
            getLifecycle().mo5790b(new C2389t() {
                /* renamed from: eN */
                public final void mo416eN(C2391v vVar, C2382m mVar) {
                    if (mVar == C2382m.ON_DESTROY) {
                        ComponentActivity.this.f2705f.f2730b = null;
                        if (!ComponentActivity.this.isChangingConfigurations()) {
                            ComponentActivity.this.getViewModelStore().mo5774c();
                        }
                    }
                }
            });
            getLifecycle().mo5790b(new C2389t() {
                /* renamed from: eN */
                public final void mo416eN(C2391v vVar, C2382m mVar) {
                    ComponentActivity.this.mo3337u();
                    ComponentActivity.this.getLifecycle().mo5791c(this);
                }
            });
            a.mo8588a();
            C2383n a2 = getLifecycle().mo5789a();
            C69664n.m101060f(a2, "lifecycle.currentState");
            if (a2 == C2383n.INITIALIZED || a2 == C2383n.CREATED) {
                if (getSavedStateRegistry().mo8587d() == null) {
                    C2351az azVar = new C2351az(getSavedStateRegistry(), this);
                    getSavedStateRegistry().mo8585b("androidx.lifecycle.internal.SavedStateHandlesProvider", azVar);
                    getLifecycle().mo5790b(new SavedStateHandleAttacher(azVar));
                }
                a.f13082a.mo8585b("android:support:activity-result", new C0789b(this));
                aVar.mo3343a(new C0790c(this));
                return;
            }
            throw new IllegalArgumentException("Failed requirement.");
        }
        throw new IllegalStateException("getLifecycle() returned null in ComponentActivity's constructor. Please make sure you are lazily constructing your Lifecycle in the first call to getLifecycle() rather than relying on field initialization.");
    }

    /* renamed from: a */
    private void mo46104a() {
        getWindow().getDecorView().setTag(R.id.view_tree_lifecycle_owner, this);
        getWindow().getDecorView().setTag(R.id.view_tree_view_model_store_owner, this);
        C4092h.m11723a(getWindow().getDecorView(), this);
        C0824t.m2679a(getWindow().getDecorView(), this);
        View decorView = getWindow().getDecorView();
        C69664n.m101061g(decorView, "<this>");
        decorView.setTag(R.id.report_loaded, this);
    }

    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        mo46104a();
        super.addContentView(view, layoutParams);
    }

    public final C2322c getDefaultViewModelCreationExtras() {
        C2324e eVar = new C2324e(C2320a.f6515a);
        if (getApplication() != null) {
            eVar.mo5724b(C2361bi.f6582b, getApplication());
        }
        eVar.mo5724b(C2349ax.f6550a, this);
        eVar.mo5724b(C2349ax.f6551b, this);
        if (!(getIntent() == null || getIntent().getExtras() == null)) {
            eVar.mo5724b(C2349ax.f6552c, getIntent().getExtras());
        }
        return eVar;
    }

    public C2363bk getDefaultViewModelProviderFactory() {
        if (this.f2703d == null) {
            this.f2703d = new C2354bb(getApplication(), this, getIntent() != null ? getIntent().getExtras() : null);
        }
        return this.f2703d;
    }

    public C2384o getLifecycle() {
        return this.f2701b;
    }

    public final C4088d getSavedStateRegistry() {
        return this.f2706g.f13082a;
    }

    public final C2370br getViewModelStore() {
        if (getApplication() != null) {
            mo3337u();
            return this.f2702c;
        }
        throw new IllegalStateException("Your activity is not yet attached to the Application instance. You can't request ViewModel before onCreate call.");
    }

    /* renamed from: gz */
    public final OnBackPressedDispatcher mo535gz() {
        return this.f2707h;
    }

    /* renamed from: jy */
    public final ActivityResultRegistry mo539jy() {
        return this.f2708i;
    }

    /* access modifiers changed from: protected */
    @Deprecated
    public void onActivityResult(int i, int i2, Intent intent) {
        if (!this.f2708i.mo3363f(i, i2, intent)) {
            super.onActivityResult(i, i2, intent);
        }
    }

    public void onBackPressed() {
        this.f2707h.mo3340c();
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        Iterator it = this.f2709l.iterator();
        while (it.hasNext()) {
            ((C1967b) it.next()).mo3353a(configuration);
        }
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        this.f2706g.mo8589b(bundle);
        C0787a aVar = this.f2705f;
        aVar.f2730b = this;
        for (C0788b a : aVar.f2729a) {
            a.mo531a();
        }
        super.onCreate(bundle);
        C2340ao.m6326b(this);
        if (C1888a.m5150d()) {
            OnBackPressedDispatcher onBackPressedDispatcher = this.f2707h;
            onBackPressedDispatcher.f2720b = C0795h.m2636a(this);
            onBackPressedDispatcher.mo3341d();
        }
        int i = this.f2698YZ;
        if (i != 0) {
            setContentView(i);
        }
    }

    public boolean onCreatePanelMenu(int i, Menu menu) {
        if (i != 0) {
            return true;
        }
        super.onCreatePanelMenu(0, menu);
        C2105t tVar = this.f2700a;
        getMenuInflater();
        Iterator it = tVar.f6016a.iterator();
        while (it.hasNext()) {
            ((C2108w) it.next()).mo5275a();
        }
        return true;
    }

    public boolean onMenuItemSelected(int i, MenuItem menuItem) {
        if (super.onMenuItemSelected(i, menuItem)) {
            return true;
        }
        if (i == 0) {
            return this.f2700a.mo5273a();
        }
        return false;
    }

    public void onMultiWindowModeChanged(boolean z) {
        if (!this.f2714q) {
            Iterator it = this.f2712o.iterator();
            while (it.hasNext()) {
                ((C1967b) it.next()).mo3353a(new C0229cu());
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        Iterator it = this.f2711n.iterator();
        while (it.hasNext()) {
            ((C1967b) it.next()).mo3353a(intent);
        }
    }

    public void onPanelClosed(int i, Menu menu) {
        Iterator it = this.f2700a.f6016a.iterator();
        while (it.hasNext()) {
            ((C2108w) it.next()).mo5276b();
        }
        super.onPanelClosed(i, menu);
    }

    public void onPictureInPictureModeChanged(boolean z) {
        if (!this.f2715r) {
            Iterator it = this.f2713p.iterator();
            while (it.hasNext()) {
                ((C1967b) it.next()).mo3353a(new C0230cv());
            }
        }
    }

    public boolean onPreparePanel(int i, View view, Menu menu) {
        if (i != 0) {
            return true;
        }
        super.onPreparePanel(0, view, menu);
        this.f2700a.mo5274b();
        return true;
    }

    @Deprecated
    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        if (!this.f2708i.mo3363f(i, -1, new Intent().putExtra("androidx.activity.result.contract.extra.PERMISSIONS", strArr).putExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS", iArr))) {
            super.onRequestPermissionsResult(i, strArr, iArr);
        }
    }

    public final Object onRetainNonConfigurationInstance() {
        C0796i iVar;
        C2370br brVar = this.f2702c;
        if (brVar == null && (iVar = (C0796i) getLastNonConfigurationInstance()) != null) {
            brVar = iVar.f2741a;
        }
        if (brVar == null) {
            return null;
        }
        C0796i iVar2 = new C0796i();
        iVar2.f2741a = brVar;
        return iVar2;
    }

    /* access modifiers changed from: protected */
    public void onSaveInstanceState(Bundle bundle) {
        C2384o lifecycle = getLifecycle();
        if (lifecycle instanceof C2393x) {
            ((C2393x) lifecycle).mo5795g(C2383n.CREATED);
        }
        super.onSaveInstanceState(bundle);
        this.f2706g.mo8590c(bundle);
    }

    public final void onTrimMemory(int i) {
        super.onTrimMemory(i);
        Iterator it = this.f2710m.iterator();
        while (it.hasNext()) {
            ((C1967b) it.next()).mo3353a(Integer.valueOf(i));
        }
    }

    public final void reportFullyDrawn() {
        try {
            if (C4188a.m12003a()) {
                Trace.beginSection("reportFullyDrawn() for ComponentActivity");
            }
            super.reportFullyDrawn();
            C0799l lVar = this.f2704e;
            synchronized (lVar.f2745a) {
                for (C69615a a : lVar.f2746b) {
                    a.mo5672a();
                }
                lVar.f2746b.clear();
            }
            Trace.endSection();
        } catch (Throwable th) {
            Trace.endSection();
            throw th;
        }
    }

    /* renamed from: s */
    public final C0816c mo3336s(C0809b bVar, ActivityResultRegistry activityResultRegistry, C0815b bVar2) {
        return activityResultRegistry.mo3360c("activity_rq#" + this.f2699Zl.getAndIncrement(), this, bVar, bVar2);
    }

    public void setContentView(int i) {
        mo46104a();
        super.setContentView(i);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: u */
    public final void mo3337u() {
        if (this.f2702c == null) {
            C0796i iVar = (C0796i) getLastNonConfigurationInstance();
            if (iVar != null) {
                this.f2702c = iVar.f2741a;
            }
            if (this.f2702c == null) {
                this.f2702c = new C2370br();
            }
        }
    }

    /* JADX INFO: finally extract failed */
    public final void onMultiWindowModeChanged(boolean z, Configuration configuration) {
        this.f2714q = true;
        try {
            super.onMultiWindowModeChanged(z, configuration);
            this.f2714q = false;
            Iterator it = this.f2712o.iterator();
            while (it.hasNext()) {
                ((C1967b) it.next()).mo3353a(new C0229cu((byte[]) null));
            }
        } catch (Throwable th) {
            this.f2714q = false;
            throw th;
        }
    }

    /* JADX INFO: finally extract failed */
    public void onPictureInPictureModeChanged(boolean z, Configuration configuration) {
        this.f2715r = true;
        try {
            super.onPictureInPictureModeChanged(z, configuration);
            this.f2715r = false;
            Iterator it = this.f2713p.iterator();
            while (it.hasNext()) {
                ((C1967b) it.next()).mo3353a(new C0230cv((byte[]) null));
            }
        } catch (Throwable th) {
            this.f2715r = false;
            throw th;
        }
    }

    public void setContentView(View view) {
        mo46104a();
        super.setContentView(view);
    }

    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        mo46104a();
        super.setContentView(view, layoutParams);
    }

    public ComponentActivity(int i) {
        this();
        this.f2698YZ = i;
    }
}
