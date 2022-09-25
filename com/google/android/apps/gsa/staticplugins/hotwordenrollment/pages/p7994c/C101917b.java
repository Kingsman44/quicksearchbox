package com.google.android.apps.gsa.staticplugins.hotwordenrollment.pages.p7994c;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.p031v4.app.Fragment;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import androidx.lifecycle.C2384o;
import androidx.lifecycle.C2393x;
import com.google.android.apps.gsa.assistant.p510b.p511a.C9439b;
import com.google.android.apps.gsa.binaries.satin.app.C74178nm;
import com.google.android.apps.gsa.opaonboarding.C83879am;
import com.google.android.apps.gsa.opaonboarding.C83880an;
import com.google.android.apps.gsa.opaonboarding.C83938e;
import com.google.android.apps.gsa.opaonboarding.C83940g;
import com.google.android.apps.gsa.opaonboarding.p6462d.C83918e;
import com.google.android.apps.gsa.opaonboarding.p6462d.C83919f;
import com.google.android.apps.gsa.p5855h.p5861s.C74555u;
import com.google.android.apps.gsa.staticplugins.hotwordenrollment.p7971c.C101610b;
import com.google.android.apps.gsa.staticplugins.hotwordenrollment.p7979d.C101763c;
import com.google.android.apps.gsa.staticplugins.hotwordenrollment.p7979d.C101783w;
import com.google.android.apps.gsa.staticplugins.hotwordenrollment.p7985h.C101860a;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.p1623at.p1632e.C19559g;
import com.google.apps.tiktok.inject.C47200b;
import com.google.apps.tiktok.inject.C47214c;
import com.google.apps.tiktok.inject.C47231d;
import com.google.apps.tiktok.inject.baseclasses.TracedFragmentLifecycle;
import com.google.apps.tiktok.inject.p3659d.C47232a;
import com.google.apps.tiktok.inject.p3659d.C47233b;
import com.google.apps.tiktok.inject.p3659d.C47236e;
import com.google.apps.tiktok.inject.p3659d.C47243l;
import com.google.apps.tiktok.p3674l.p3679c.C47393f;
import com.google.apps.tiktok.tracing.C47515ab;
import com.google.apps.tiktok.tracing.C47570bu;
import com.google.apps.tiktok.tracing.C47573bx;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.apps.tiktok.tracing.C47816ey;
import com.google.apps.tiktok.tracing.C47831fm;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.p4552o.p4553a.C59566v;
import com.google.common.p4552o.p4553a.C59567w;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62947c;
import com.google.protobuf.C62971cq;
import com.google.protobuf.contrib.android.ProtoParsers;
import dagger.hilt.android.internal.managers.C68324h;
import dagger.hilt.p5299a.C68288b;
import dagger.p5294a.C68221g;
import dagger.p5294a.C68225k;
import java.util.List;
import java.util.Locale;

/* renamed from: com.google.android.apps.gsa.staticplugins.hotwordenrollment.pages.c.b */
/* compiled from: PG */
public final class C101917b extends C101920e implements C47231d, C68288b, C47200b, C47233b, C47570bu {

    /* renamed from: a */
    private C101918c f284288a;

    /* renamed from: b */
    private Context f284289b;

    /* renamed from: c */
    private final C2393x f284290c = new C2393x(this);

    /* renamed from: d */
    private final C47515ab f284291d = new C47515ab(this);

    /* renamed from: e */
    private boolean f284292e;

    @Deprecated
    public C101917b() {
        C19559g.m37304c();
    }

    /* renamed from: a */
    public final void mo92348a() {
        C101918c b = mo17754z();
        C101763c cVar = new C101763c();
        cVar.mo92556b(0);
        C47393f.m84236g(cVar.mo92555a(), b.f284294b);
    }

    /* renamed from: b */
    public final C101918c mo17754z() {
        C101918c cVar = this.f284288a;
        if (cVar == null) {
            throw new IllegalStateException("peer() called before initialized.");
        } else if (!this.f284292e) {
            return cVar;
        } else {
            throw new IllegalStateException("peer() called after destroyed.");
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final /* synthetic */ C68324h mo92688d() {
        return new C47243l(this);
    }

    @Deprecated
    /* renamed from: e */
    public final Context mo17857e() {
        if (this.f284289b == null) {
            this.f284289b = new C47236e((Fragment) this, super.getContext());
        }
        return this.f284289b;
    }

    /* renamed from: g */
    public final C47816ey mo17859g() {
        return this.f284291d.f123354b;
    }

    public final Context getContext() {
        if (super.getContext() == null) {
            return null;
        }
        return mo17857e();
    }

    public final C2384o getLifecycle() {
        return this.f284290c;
    }

    /* renamed from: h */
    public final Locale mo17860h() {
        return C47232a.m84025a(this);
    }

    /* renamed from: i */
    public final void mo17861i(C47816ey eyVar, boolean z) {
        this.f284291d.mo51380h(eyVar, z);
    }

    public final void onActivityCreated(Bundle bundle) {
        this.f284291d.mo51381i();
        try {
            super.onActivityCreated(bundle);
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C101916a.m168626a(th, th);
        }
        throw th;
    }

    public final void onActivityResult(int i, int i2, Intent intent) {
        C47573bx a = this.f284291d.mo51373a("Fragment:onActivityResult");
        try {
            super.onActivityResult(i, i2, intent);
            C101918c b = mo17754z();
            C58976aa aaVar = C58975e.f156826a;
            if (i == 1024) {
                if (i2 == 0) {
                    C101763c cVar = new C101763c();
                    cVar.mo92556b(0);
                    C47393f.m84236g(cVar.mo92555a(), b.f284294b);
                } else {
                    if (intent != null) {
                        String stringExtra = intent.getStringExtra("locale");
                        if (!TextUtils.isEmpty(stringExtra)) {
                            C59104x b2 = C101918c.f284293a.mo56224b();
                            b2.mo56378ag(C58975e.f156826a, "VMDeviceScanFragment");
                            ((C59052c) ((C59052c) b2).mo56372aa(20437)).mo56389s("Device scan returned locale: %s", stringExtra);
                            if (b.f284295c.mo92420a()) {
                                b.f284298f.f284139f = stringExtra;
                                C59104x b3 = C101918c.f284293a.mo56224b();
                                b3.mo56378ag(C58975e.f156826a, "VMDeviceScanFragment");
                                ((C59052c) ((C59052c) b3).mo56372aa(20438)).mo56389s("New dependency controller enabled, setting locale in EnrollmentState: %s", stringExtra);
                            }
                        } else {
                            C59104x d = C101918c.f284293a.mo56226d();
                            d.mo56378ag(C58975e.f156826a, "VMDeviceScanFragment");
                            ((C59052c) ((C59052c) d).mo56372aa(20436)).mo56386p("Device scan returned null or empty enrollment locale!");
                        }
                    }
                    C47393f.m84236g(new C101783w(), b.f284294b);
                }
            }
            if (a != null) {
                a.close();
                return;
            }
            return;
        } catch (Throwable th) {
            C101916a.m168626a(th, th);
        }
        throw th;
    }

    public final void onAttach(Activity activity) {
        this.f284291d.mo51381i();
        try {
            super.onAttach(activity);
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C101916a.m168626a(th, th);
        }
        throw th;
    }

    public final void onCreate(Bundle bundle) {
        this.f284291d.mo51381i();
        try {
            super.onCreate(bundle);
            C101918c b = mo17754z();
            Bundle bundle2 = new Bundle();
            C83918e eVar = (C83918e) C83919f.f228563e.createBuilder();
            eVar.copyOnWrite();
            C83919f fVar = (C83919f) eVar.instance;
            fVar.f228567c = 1;
            fVar.f228565a |= 1;
            C58485gu a = b.f284297e.mo70894a();
            int size = a.size();
            for (int i = 0; i < size; i++) {
                C58976aa aaVar = C58975e.f156826a;
                eVar.mo77329a((String) a.get(i));
            }
            C58485gu b2 = b.f284297e.mo70895b();
            eVar.copyOnWrite();
            C83919f fVar2 = (C83919f) eVar.instance;
            C62971cq cqVar = fVar2.f228568d;
            if (!cqVar.mo58948c()) {
                fVar2.f228568d = C62942bv.mutableCopy(cqVar);
            }
            C62947c.addAll((Iterable) b2, (List) fVar2.f228568d);
            ProtoParsers.m95532o(bundle2, "DeviceScanConfig", eVar.build());
            C83879am o = C83880an.m133553o();
            ((C83940g) o).f228605a = "device_scan_vm";
            ((C83940g) o).f228606b = bundle2;
            ((C83940g) o).f228607c = new C83938e(1, b.f284296d, (String) null);
            C59566v vVar = (C59566v) C59567w.f158058g.createBuilder();
            C9439b bVar = C9439b.DEVICES_SCAN_SEQUENCE_FROM_VOICE_MATCH;
            vVar.copyOnWrite();
            C59567w wVar = (C59567w) vVar.instance;
            wVar.f158062c = bVar.f32835aq;
            wVar.f158060a |= 2;
            o.mo77222b((C59567w) vVar.build());
            o.mo77225e(2);
            b.f284294b.startActivityForResult(o.mo77221a().mo77240n(), 1024);
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C101916a.m168626a(th, th);
        }
        throw th;
    }

    public final Animation onCreateAnimation(int i, boolean z, int i2) {
        this.f284291d.mo51382j(i, i2);
        try {
            Animation onCreateAnimation = super.onCreateAnimation(i, z, i2);
            C47831fm.m85019n();
            return onCreateAnimation;
        } catch (Throwable th) {
            C101916a.m168626a(th, th);
        }
        throw th;
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.f284291d.mo51381i();
        try {
            super.onCreateView(layoutInflater, viewGroup, bundle);
            mo17754z();
            View inflate = layoutInflater.inflate(R.layout.fragment_device_scan_launcher, viewGroup, false);
            C47831fm.m85019n();
            return inflate;
        } catch (Throwable th) {
            C101916a.m168626a(th, th);
        }
        throw th;
    }

    public final void onDestroy() {
        C47573bx b = this.f284291d.mo51374b();
        try {
            super.onDestroy();
            b.close();
            return;
        } catch (Throwable th) {
            C101916a.m168626a(th, th);
        }
        throw th;
    }

    public final void onDestroyView() {
        C47573bx c = this.f284291d.mo51375c();
        try {
            super.onDestroyView();
            c.close();
            return;
        } catch (Throwable th) {
            C101916a.m168626a(th, th);
        }
        throw th;
    }

    public final void onDetach() {
        C47573bx d = this.f284291d.mo51376d();
        try {
            super.onDetach();
            this.f284292e = true;
            d.close();
            return;
        } catch (Throwable th) {
            C101916a.m168626a(th, th);
        }
        throw th;
    }

    public final LayoutInflater onGetLayoutInflater(Bundle bundle) {
        this.f284291d.mo51381i();
        try {
            LayoutInflater onGetLayoutInflater = super.onGetLayoutInflater(bundle);
            LayoutInflater cloneInContext = onGetLayoutInflater.cloneInContext(new C47236e((Fragment) this, onGetLayoutInflater));
            C47831fm.m85019n();
            return cloneInContext;
        } catch (Throwable th) {
            C101916a.m168626a(th, th);
        }
        throw th;
    }

    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        C47573bx a = this.f284291d.mo51373a("Fragment:onOptionsItemSelected");
        try {
            boolean onOptionsItemSelected = super.onOptionsItemSelected(menuItem);
            if (a != null) {
                a.close();
            }
            return onOptionsItemSelected;
        } catch (Throwable th) {
            C101916a.m168626a(th, th);
        }
        throw th;
    }

    public final void onPause() {
        this.f284291d.mo51381i();
        try {
            super.onPause();
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C101916a.m168626a(th, th);
        }
        throw th;
    }

    public final void onResume() {
        C47573bx e = this.f284291d.mo51377e();
        try {
            super.onResume();
            e.close();
            return;
        } catch (Throwable th) {
            C101916a.m168626a(th, th);
        }
        throw th;
    }

    public final void onSaveInstanceState(Bundle bundle) {
        this.f284291d.mo51381i();
        C47831fm.m85019n();
    }

    public final void onStart() {
        this.f284291d.mo51381i();
        try {
            super.onStart();
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C101916a.m168626a(th, th);
        }
        throw th;
    }

    public final void onStop() {
        this.f284291d.mo51381i();
        try {
            super.onStop();
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C101916a.m168626a(th, th);
        }
        throw th;
    }

    public final void onViewCreated(View view, Bundle bundle) {
        this.f284291d.mo51381i();
        C47831fm.m85019n();
    }

    public final void setEnterTransition(Object obj) {
        C47515ab abVar = this.f284291d;
        if (abVar != null) {
            abVar.mo51379g(true);
        }
        super.setEnterTransition(obj);
    }

    public final void setExitTransition(Object obj) {
        C47515ab abVar = this.f284291d;
        if (abVar != null) {
            abVar.mo51379g(true);
        }
        super.setExitTransition(obj);
    }

    public final void setReenterTransition(Object obj) {
        C47515ab abVar = this.f284291d;
        if (abVar != null) {
            abVar.mo51379g(true);
        }
        super.setReenterTransition(obj);
    }

    public final void setRetainInstance(boolean z) {
        if (z) {
            throw new IllegalArgumentException("Peered fragments cannot be retained, to avoid memory leaks. If you need a retained fragment, you should subclass Fragment directly. See http://go/tiktok-conformance-violations/FRAGMENT_SET_RETAIN_INSTANCE");
        }
    }

    public final void setReturnTransition(Object obj) {
        C47515ab abVar = this.f284291d;
        if (abVar != null) {
            abVar.mo51379g(true);
        }
        super.setReturnTransition(obj);
    }

    public final void setSharedElementEnterTransition(Object obj) {
        C47515ab abVar = this.f284291d;
        if (abVar != null) {
            abVar.mo51379g(true);
        }
        super.setSharedElementEnterTransition(obj);
    }

    public final void setSharedElementReturnTransition(Object obj) {
        C47515ab abVar = this.f284291d;
        if (abVar != null) {
            abVar.mo51379g(true);
        }
        super.setSharedElementReturnTransition(obj);
    }

    public final void startActivity(Intent intent) {
        if (C47214c.m83984a(intent, getContext().getApplicationContext())) {
            int i = C47810es.f123822b;
        }
        super.startActivity(intent);
    }

    public final void onAttach(Context context) {
        this.f284291d.mo51381i();
        try {
            if (!this.f284292e) {
                super.onAttach(context);
                if (this.f284288a == null) {
                    Object jN = mo92689f().mo17653jN();
                    Fragment fragment = (Fragment) ((C68221g) ((C74178nm) jN).f207137d).f184583a;
                    if (fragment instanceof C101917b) {
                        C101917b bVar = (C101917b) fragment;
                        C68225k.m98532d(bVar);
                        this.f284288a = new C101918c(bVar, (C101610b) ((C74178nm) jN).f207136c.f205606cB.mo17428b(), (String) ((C74178nm) jN).f207136c.f205595br.mo17428b(), (C101860a) ((C74178nm) jN).f207135b.f205818a.mo17428b(), (C74555u) ((C74178nm) jN).f207136c.f205594bq.mo17428b());
                        super.getLifecycle().mo5790b(new TracedFragmentLifecycle(this.f284291d, this.f284290c));
                    } else {
                        String obj = C101918c.class.toString();
                        String valueOf = String.valueOf(fragment.getClass());
                        throw new IllegalStateException("Attempt to inject a Fragment wrapper of type " + obj + ", but the wrapper available is of type: " + valueOf + ". Does your peer's @Inject constructor reference the wrong wrapper class?");
                    }
                }
                Fragment parentFragment = getParentFragment();
                if (parentFragment instanceof C47570bu) {
                    C47515ab abVar = this.f284291d;
                    if (abVar.f123354b == null) {
                        abVar.mo51380h(((C47570bu) parentFragment).mo17859g(), true);
                    }
                }
                C47831fm.m85019n();
                return;
            }
            throw new IllegalStateException("A Fragment cannot be attached more than once. Instead, create a new Fragment instance.");
        } catch (ClassCastException e) {
            throw new IllegalStateException("Missing entry point. If you're in a test with explicit entry points specified in your @TestRoot, check that you're not missing the one for this class.", e);
        } catch (Throwable th) {
            try {
                C47831fm.m85019n();
            } catch (Throwable th2) {
                C101916a.m168626a(th, th2);
            }
            throw th;
        }
    }

    public final void startActivity(Intent intent, Bundle bundle) {
        if (C47214c.m83984a(intent, getContext().getApplicationContext())) {
            int i = C47810es.f123822b;
        }
        super.startActivity(intent, bundle);
    }
}
