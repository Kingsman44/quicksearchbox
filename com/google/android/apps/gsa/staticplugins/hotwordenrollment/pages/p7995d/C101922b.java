package com.google.android.apps.gsa.staticplugins.hotwordenrollment.pages.p7995d;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.p031v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import androidx.lifecycle.C2384o;
import androidx.lifecycle.C2393x;
import com.google.android.apps.gsa.assistant.p510b.p511a.C9439b;
import com.google.android.apps.gsa.assistant.shared.l;
import com.google.android.apps.gsa.binaries.satin.app.C74178nm;
import com.google.android.apps.gsa.opaonboarding.C83879am;
import com.google.android.apps.gsa.opaonboarding.C83880an;
import com.google.android.apps.gsa.opaonboarding.C83938e;
import com.google.android.apps.gsa.opaonboarding.C83940g;
import com.google.android.apps.gsa.opaonboarding.p6462d.C83934u;
import com.google.android.apps.gsa.opaonboarding.p6462d.C83935v;
import com.google.android.apps.gsa.speech.hotword.enrollmentutils.p7290a.C92391o;
import com.google.android.apps.gsa.speech.hotword.enrollmentutils.p7290a.C92392p;
import com.google.android.apps.gsa.speech.hotword.enrollmentutils.p7290a.C92395s;
import com.google.android.apps.gsa.speech.hotword.p7285c.C92371d;
import com.google.android.apps.gsa.staticplugins.hotwordenrollment.C101497ae;
import com.google.android.apps.gsa.staticplugins.hotwordenrollment.p7979d.C101763c;
import com.google.android.apps.gsa.staticplugins.hotwordenrollment.p7979d.C101783w;
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
import com.google.common.base.C58833ax;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.p4552o.p4553a.C59566v;
import com.google.common.p4552o.p4553a.C59567w;
import dagger.hilt.android.internal.managers.C68324h;
import dagger.hilt.p5299a.C68288b;
import dagger.p5294a.C68221g;
import dagger.p5294a.C68225k;
import java.util.HashMap;
import java.util.Locale;

/* renamed from: com.google.android.apps.gsa.staticplugins.hotwordenrollment.pages.d.b */
/* compiled from: PG */
public final class C101922b extends C101925e implements C47231d, C68288b, C47200b, C47233b, C47570bu {

    /* renamed from: a */
    private C101923c f284305a;

    /* renamed from: b */
    private Context f284306b;

    /* renamed from: c */
    private final C2393x f284307c = new C2393x(this);

    /* renamed from: d */
    private final C47515ab f284308d = new C47515ab(this);

    /* renamed from: e */
    private boolean f284309e;

    @Deprecated
    public C101922b() {
        C19559g.m37304c();
    }

    /* renamed from: a */
    public final void mo92348a() {
        C101923c b = mo17754z();
        C101763c cVar = new C101763c();
        cVar.mo92556b(0);
        C47393f.m84236g(cVar.mo92555a(), b.f284310a);
    }

    /* renamed from: b */
    public final C101923c mo17754z() {
        C101923c cVar = this.f284305a;
        if (cVar == null) {
            throw new IllegalStateException("peer() called before initialized.");
        } else if (!this.f284309e) {
            return cVar;
        } else {
            throw new IllegalStateException("peer() called after destroyed.");
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final /* synthetic */ C68324h mo92692d() {
        return new C47243l(this);
    }

    @Deprecated
    /* renamed from: e */
    public final Context mo17857e() {
        if (this.f284306b == null) {
            this.f284306b = new C47236e((Fragment) this, super.getContext());
        }
        return this.f284306b;
    }

    /* renamed from: g */
    public final C47816ey mo17859g() {
        return this.f284308d.f123354b;
    }

    public final Context getContext() {
        if (super.getContext() == null) {
            return null;
        }
        return mo17857e();
    }

    public final C2384o getLifecycle() {
        return this.f284307c;
    }

    /* renamed from: h */
    public final Locale mo17860h() {
        return C47232a.m84025a(this);
    }

    /* renamed from: i */
    public final void mo17861i(C47816ey eyVar, boolean z) {
        this.f284308d.mo51380h(eyVar, z);
    }

    public final void onActivityCreated(Bundle bundle) {
        this.f284308d.mo51381i();
        try {
            super.onActivityCreated(bundle);
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C101921a.m168641a(th, th);
        }
        throw th;
    }

    public final void onActivityResult(int i, int i2, Intent intent) {
        C47573bx a = this.f284308d.mo51373a("Fragment:onActivityResult");
        try {
            super.onActivityResult(i, i2, intent);
            C101923c b = mo17754z();
            C58976aa aaVar = C58975e.f156826a;
            if (i == 1024) {
                C47393f.m84236g(new C101783w(), b.f284310a);
            }
            if (a != null) {
                a.close();
                return;
            }
            return;
        } catch (Throwable th) {
            C101921a.m168641a(th, th);
        }
        throw th;
    }

    public final void onAttach(Activity activity) {
        this.f284308d.mo51381i();
        try {
            super.onAttach(activity);
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C101921a.m168641a(th, th);
        }
        throw th;
    }

    public final void onCreate(Bundle bundle) {
        C92395s sVar;
        this.f284308d.mo51381i();
        try {
            super.onCreate(bundle);
            C101923c b = mo17754z();
            HashMap hashMap = new HashMap();
            for (l lVar : b.f284312c.f257559d) {
                hashMap.put(lVar.b(), Integer.valueOf(lVar.a().f129621v));
            }
            Bundle bundle2 = new Bundle();
            bundle2.putSerializable("avocadoEnrollDeviceMap", hashMap);
            if (b.f284312c.f257558c.mo56113h()) {
                C92392p pVar = (C92392p) C92395s.f257652e.createBuilder();
                C92391o oVar = (C92391o) b.f284312c.f257558c.mo56107c();
                pVar.copyOnWrite();
                C92395s sVar2 = (C92395s) pVar.instance;
                oVar.getClass();
                sVar2.f257655b = oVar;
                sVar2.f257654a |= 1;
                sVar = (C92395s) pVar.build();
            } else if (b.f284313d.f283244a.f284137d.get()) {
                C92392p pVar2 = (C92392p) C92395s.f257652e.createBuilder();
                C83934u uVar = (C83934u) C83935v.f228590f.createBuilder();
                String b2 = b.f284313d.mo92329b();
                uVar.copyOnWrite();
                C83935v vVar = (C83935v) uVar.instance;
                b2.getClass();
                vVar.f228592a |= 2;
                vVar.f228594c = b2;
                String c = b.f284313d.mo92330c();
                uVar.copyOnWrite();
                C83935v vVar2 = (C83935v) uVar.instance;
                c.getClass();
                vVar2.f228592a |= 8;
                vVar2.f228596e = c;
                pVar2.copyOnWrite();
                C92395s sVar3 = (C92395s) pVar2.instance;
                C83935v vVar3 = (C83935v) uVar.build();
                vVar3.getClass();
                sVar3.f257656c = vVar3;
                sVar3.f257654a |= 2;
                pVar2.copyOnWrite();
                C92395s sVar4 = (C92395s) pVar2.instance;
                sVar4.f257657d = 1;
                sVar4.f257654a |= 4;
                sVar = (C92395s) pVar2.build();
            } else {
                sVar = null;
            }
            C83879am o = C83880an.m133553o();
            ((C83940g) o).f228605a = "AvocadoOnboarding.VM.VMSettings";
            ((C83940g) o).f228606b = bundle2;
            ((C83940g) o).f228607c = new C83938e(1, b.f284311b, (String) null);
            C59566v vVar4 = (C59566v) C59567w.f158058g.createBuilder();
            C9439b bVar = C9439b.FACE_MATCH_ENROLLMENT_FROM_VOICE_MATCH;
            vVar4.copyOnWrite();
            C59567w wVar = (C59567w) vVar4.instance;
            wVar.f158062c = bVar.f32835aq;
            wVar.f158060a |= 2;
            o.mo77222b((C59567w) vVar4.build());
            ((C83940g) o).f228609e = C58833ax.m90833j(sVar);
            o.mo77225e(2);
            b.f284310a.startActivityForResult(o.mo77221a().mo77240n(), 1024);
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C101921a.m168641a(th, th);
        }
        throw th;
    }

    public final Animation onCreateAnimation(int i, boolean z, int i2) {
        this.f284308d.mo51382j(i, i2);
        try {
            Animation onCreateAnimation = super.onCreateAnimation(i, z, i2);
            C47831fm.m85019n();
            return onCreateAnimation;
        } catch (Throwable th) {
            C101921a.m168641a(th, th);
        }
        throw th;
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.f284308d.mo51381i();
        try {
            super.onCreateView(layoutInflater, viewGroup, bundle);
            mo17754z();
            View inflate = layoutInflater.inflate(R.layout.fragment_face_match_launcher, viewGroup, false);
            C47831fm.m85019n();
            return inflate;
        } catch (Throwable th) {
            C101921a.m168641a(th, th);
        }
        throw th;
    }

    public final void onDestroy() {
        C47573bx b = this.f284308d.mo51374b();
        try {
            super.onDestroy();
            b.close();
            return;
        } catch (Throwable th) {
            C101921a.m168641a(th, th);
        }
        throw th;
    }

    public final void onDestroyView() {
        C47573bx c = this.f284308d.mo51375c();
        try {
            super.onDestroyView();
            c.close();
            return;
        } catch (Throwable th) {
            C101921a.m168641a(th, th);
        }
        throw th;
    }

    public final void onDetach() {
        C47573bx d = this.f284308d.mo51376d();
        try {
            super.onDetach();
            this.f284309e = true;
            d.close();
            return;
        } catch (Throwable th) {
            C101921a.m168641a(th, th);
        }
        throw th;
    }

    public final LayoutInflater onGetLayoutInflater(Bundle bundle) {
        this.f284308d.mo51381i();
        try {
            LayoutInflater onGetLayoutInflater = super.onGetLayoutInflater(bundle);
            LayoutInflater cloneInContext = onGetLayoutInflater.cloneInContext(new C47236e((Fragment) this, onGetLayoutInflater));
            C47831fm.m85019n();
            return cloneInContext;
        } catch (Throwable th) {
            C101921a.m168641a(th, th);
        }
        throw th;
    }

    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        C47573bx a = this.f284308d.mo51373a("Fragment:onOptionsItemSelected");
        try {
            boolean onOptionsItemSelected = super.onOptionsItemSelected(menuItem);
            if (a != null) {
                a.close();
            }
            return onOptionsItemSelected;
        } catch (Throwable th) {
            C101921a.m168641a(th, th);
        }
        throw th;
    }

    public final void onPause() {
        this.f284308d.mo51381i();
        try {
            super.onPause();
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C101921a.m168641a(th, th);
        }
        throw th;
    }

    public final void onResume() {
        C47573bx e = this.f284308d.mo51377e();
        try {
            super.onResume();
            e.close();
            return;
        } catch (Throwable th) {
            C101921a.m168641a(th, th);
        }
        throw th;
    }

    public final void onSaveInstanceState(Bundle bundle) {
        this.f284308d.mo51381i();
        C47831fm.m85019n();
    }

    public final void onStart() {
        this.f284308d.mo51381i();
        try {
            super.onStart();
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C101921a.m168641a(th, th);
        }
        throw th;
    }

    public final void onStop() {
        this.f284308d.mo51381i();
        try {
            super.onStop();
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C101921a.m168641a(th, th);
        }
        throw th;
    }

    public final void onViewCreated(View view, Bundle bundle) {
        this.f284308d.mo51381i();
        C47831fm.m85019n();
    }

    public final void setEnterTransition(Object obj) {
        C47515ab abVar = this.f284308d;
        if (abVar != null) {
            abVar.mo51379g(true);
        }
        super.setEnterTransition(obj);
    }

    public final void setExitTransition(Object obj) {
        C47515ab abVar = this.f284308d;
        if (abVar != null) {
            abVar.mo51379g(true);
        }
        super.setExitTransition(obj);
    }

    public final void setReenterTransition(Object obj) {
        C47515ab abVar = this.f284308d;
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
        C47515ab abVar = this.f284308d;
        if (abVar != null) {
            abVar.mo51379g(true);
        }
        super.setReturnTransition(obj);
    }

    public final void setSharedElementEnterTransition(Object obj) {
        C47515ab abVar = this.f284308d;
        if (abVar != null) {
            abVar.mo51379g(true);
        }
        super.setSharedElementEnterTransition(obj);
    }

    public final void setSharedElementReturnTransition(Object obj) {
        C47515ab abVar = this.f284308d;
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
        this.f284308d.mo51381i();
        try {
            if (!this.f284309e) {
                super.onAttach(context);
                if (this.f284305a == null) {
                    Object jN = mo92693f().mo17653jN();
                    Fragment fragment = (Fragment) ((C68221g) ((C74178nm) jN).f207137d).f184583a;
                    if (fragment instanceof C101922b) {
                        C101922b bVar = (C101922b) fragment;
                        C68225k.m98532d(bVar);
                        this.f284305a = new C101923c(bVar, (String) ((C74178nm) jN).f207136c.f205595br.mo17428b(), (C92371d) ((C74178nm) jN).f207130a.a.f202806dy.mo17428b(), (C101497ae) ((C74178nm) jN).f207109F.mo17428b());
                        super.getLifecycle().mo5790b(new TracedFragmentLifecycle(this.f284308d, this.f284307c));
                    } else {
                        String obj = C101923c.class.toString();
                        String valueOf = String.valueOf(fragment.getClass());
                        throw new IllegalStateException("Attempt to inject a Fragment wrapper of type " + obj + ", but the wrapper available is of type: " + valueOf + ". Does your peer's @Inject constructor reference the wrong wrapper class?");
                    }
                }
                Fragment parentFragment = getParentFragment();
                if (parentFragment instanceof C47570bu) {
                    C47515ab abVar = this.f284308d;
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
                C101921a.m168641a(th, th2);
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
