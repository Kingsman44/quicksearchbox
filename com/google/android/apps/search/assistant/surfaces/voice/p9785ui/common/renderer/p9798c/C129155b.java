package com.google.android.apps.search.assistant.surfaces.voice.p9785ui.common.renderer.p9798c;

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
import com.google.android.apps.gsa.binaries.satin.app.C74176nj;
import com.google.android.apps.search.assistant.surfaces.voice.p9785ui.common.renderer.p9798c.p9799a.C129148a;
import com.google.android.apps.search.assistant.surfaces.voice.p9785ui.common.renderer.p9798c.p9799a.C129149b;
import com.google.android.apps.search.assistant.surfaces.voice.p9785ui.common.renderer.p9798c.p9799a.C129152e;
import com.google.android.apps.search.assistant.surfaces.voice.p9785ui.common.renderer.p9798c.p9799a.C129153f;
import com.google.android.apps.search.assistant.surfaces.voice.p9785ui.common.renderer.p9798c.p9799a.C129154g;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.p1623at.p1632e.C19559g;
import com.google.apps.tiktok.dataservice.C46690ah;
import com.google.apps.tiktok.dataservice.C46801dp;
import com.google.apps.tiktok.dataservice.p3637b.C46716g;
import com.google.apps.tiktok.inject.C47200b;
import com.google.apps.tiktok.inject.C47214c;
import com.google.apps.tiktok.inject.C47231d;
import com.google.apps.tiktok.inject.baseclasses.TracedFragmentLifecycle;
import com.google.apps.tiktok.inject.p3659d.C47232a;
import com.google.apps.tiktok.inject.p3659d.C47233b;
import com.google.apps.tiktok.inject.p3659d.C47236e;
import com.google.apps.tiktok.inject.p3659d.C47242k;
import com.google.apps.tiktok.inject.p3660e.p3661a.C47247a;
import com.google.apps.tiktok.tracing.C47515ab;
import com.google.apps.tiktok.tracing.C47570bu;
import com.google.apps.tiktok.tracing.C47573bx;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.apps.tiktok.tracing.C47816ey;
import com.google.apps.tiktok.tracing.C47831fm;
import com.google.assistant.p3897e.p3921j.p3926e.C52027hz;
import com.google.common.base.C58838bb;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59094n;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.protobuf.C62921ba;
import com.google.protobuf.contrib.android.ProtoParsers;
import dagger.hilt.p5299a.C68288b;
import dagger.p5294a.C68225k;
import java.util.Locale;
import kotlinx.coroutines.C71422aw;
import p5462h.p5466c.C69577g;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.ui.common.renderer.c.b */
/* compiled from: PG */
public final class C129155b extends C129162h implements C47231d, C68288b, C47200b, C47233b, C47570bu {

    /* renamed from: a */
    private C129156c f354789a;

    /* renamed from: b */
    private Context f354790b;

    /* renamed from: c */
    private final C2393x f354791c = new C2393x(this);

    /* renamed from: d */
    private final C47515ab f354792d = new C47515ab(this);

    /* renamed from: e */
    private boolean f354793e;

    @Deprecated
    public C129155b() {
        C19559g.m37304c();
    }

    /* renamed from: a */
    public final C129156c mo17754z() {
        C129156c cVar = this.f354789a;
        if (cVar == null) {
            throw new IllegalStateException("peer() called before initialized.");
        } else if (!this.f354793e) {
            return cVar;
        } else {
            throw new IllegalStateException("peer() called after destroyed.");
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final /* synthetic */ C47247a mo108867b() {
        return new C47242k(this);
    }

    @Deprecated
    /* renamed from: e */
    public final Context mo17857e() {
        if (this.f354790b == null) {
            this.f354790b = new C47236e((Fragment) this, super.getContext());
        }
        return this.f354790b;
    }

    /* renamed from: g */
    public final C47816ey mo17859g() {
        return this.f354792d.f123354b;
    }

    public final Context getContext() {
        if (super.getContext() == null) {
            return null;
        }
        return mo17857e();
    }

    public final C2384o getLifecycle() {
        return this.f354791c;
    }

    /* renamed from: h */
    public final Locale mo17860h() {
        return C47232a.m84025a(this);
    }

    /* renamed from: i */
    public final void mo17861i(C47816ey eyVar, boolean z) {
        this.f354792d.mo51380h(eyVar, z);
    }

    public final void onActivityCreated(Bundle bundle) {
        this.f354792d.mo51381i();
        try {
            super.onActivityCreated(bundle);
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C129147a.m210806a(th, th);
        }
        throw th;
    }

    public final void onActivityResult(int i, int i2, Intent intent) {
        C47573bx a = this.f354792d.mo51373a("Fragment:onActivityResult");
        try {
            super.onActivityResult(i, i2, intent);
            if (a != null) {
                a.close();
                return;
            }
            return;
        } catch (Throwable th) {
            C129147a.m210806a(th, th);
        }
        throw th;
    }

    public final void onAttach(Activity activity) {
        this.f354792d.mo51381i();
        try {
            super.onAttach(activity);
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C129147a.m210806a(th, th);
        }
        throw th;
    }

    public final void onCreate(Bundle bundle) {
        this.f354792d.mo51381i();
        try {
            super.onCreate(bundle);
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C129147a.m210806a(th, th);
        }
        throw th;
    }

    public final Animation onCreateAnimation(int i, boolean z, int i2) {
        this.f354792d.mo51382j(i, i2);
        try {
            Animation onCreateAnimation = super.onCreateAnimation(i, z, i2);
            C47831fm.m85019n();
            return onCreateAnimation;
        } catch (Throwable th) {
            C129147a.m210806a(th, th);
        }
        throw th;
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.f354792d.mo51381i();
        try {
            super.onCreateView(layoutInflater, viewGroup, bundle);
            C129156c a = mo17754z();
            C69664n.m101061g(layoutInflater, "inflater");
            View view = null;
            if (a.f354797d.isEmpty()) {
                C59052c cVar = (C59052c) C129156c.f354794a.mo56226d();
                cVar.mo56378ag(C58975e.f156826a, "ShowSmartDeviceControl");
                cVar.mo56379ah(new C59094n(38230));
                cVar.mo56386p("No affected devices in ShowSmartDeviceControlArgs");
            } else {
                C46801dp dpVar = a.f354796c;
                C129152e eVar = a.f354798e;
                C71422aw awVar = eVar.f354783c;
                C129148a aVar = new C129148a(eVar, (C69577g) null);
                C129149b bVar = new C129149b(eVar, (C69577g) null);
                C46690ah ahVar = C129154g.f354788a;
                C69664n.m101060f(ahVar, "DATA_SOURCE_KEY");
                dpVar.mo50707a(C46716g.m83256a(awVar, aVar, bVar, ahVar), a.f354800g);
                view = layoutInflater.inflate(R.layout.assistant_show_smart_device_control_card, viewGroup, false);
            }
            C47831fm.m85019n();
            return view;
        } catch (Throwable th) {
            C129147a.m210806a(th, th);
        }
        throw th;
    }

    public final void onDestroy() {
        C47573bx b = this.f354792d.mo51374b();
        try {
            super.onDestroy();
            b.close();
            return;
        } catch (Throwable th) {
            C129147a.m210806a(th, th);
        }
        throw th;
    }

    public final void onDestroyView() {
        C47573bx c = this.f354792d.mo51375c();
        try {
            super.onDestroyView();
            c.close();
            return;
        } catch (Throwable th) {
            C129147a.m210806a(th, th);
        }
        throw th;
    }

    public final void onDetach() {
        C47573bx d = this.f354792d.mo51376d();
        try {
            super.onDetach();
            this.f354793e = true;
            d.close();
            return;
        } catch (Throwable th) {
            C129147a.m210806a(th, th);
        }
        throw th;
    }

    public final LayoutInflater onGetLayoutInflater(Bundle bundle) {
        this.f354792d.mo51381i();
        try {
            LayoutInflater onGetLayoutInflater = super.onGetLayoutInflater(bundle);
            LayoutInflater cloneInContext = onGetLayoutInflater.cloneInContext(new C47236e((Fragment) this, onGetLayoutInflater));
            C47831fm.m85019n();
            return cloneInContext;
        } catch (Throwable th) {
            C129147a.m210806a(th, th);
        }
        throw th;
    }

    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        C47573bx a = this.f354792d.mo51373a("Fragment:onOptionsItemSelected");
        try {
            boolean onOptionsItemSelected = super.onOptionsItemSelected(menuItem);
            if (a != null) {
                a.close();
            }
            return onOptionsItemSelected;
        } catch (Throwable th) {
            C129147a.m210806a(th, th);
        }
        throw th;
    }

    public final void onPause() {
        this.f354792d.mo51381i();
        try {
            super.onPause();
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C129147a.m210806a(th, th);
        }
        throw th;
    }

    public final void onResume() {
        C47573bx e = this.f354792d.mo51377e();
        try {
            super.onResume();
            e.close();
            return;
        } catch (Throwable th) {
            C129147a.m210806a(th, th);
        }
        throw th;
    }

    public final void onSaveInstanceState(Bundle bundle) {
        this.f354792d.mo51381i();
        C47831fm.m85019n();
    }

    public final void onStart() {
        this.f354792d.mo51381i();
        try {
            super.onStart();
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C129147a.m210806a(th, th);
        }
        throw th;
    }

    public final void onStop() {
        this.f354792d.mo51381i();
        try {
            super.onStop();
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C129147a.m210806a(th, th);
        }
        throw th;
    }

    public final void onViewCreated(View view, Bundle bundle) {
        this.f354792d.mo51381i();
        try {
            C129156c a = mo17754z();
            C69664n.m101061g(view, "view");
            a.f354799f = a.f354795b.mo28944a(a.f354798e, (ViewGroup) view, a.f354797d.values());
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C129147a.m210806a(th, th);
        }
        throw th;
    }

    public final void setEnterTransition(Object obj) {
        C47515ab abVar = this.f354792d;
        if (abVar != null) {
            abVar.mo51379g(true);
        }
        super.setEnterTransition(obj);
    }

    public final void setExitTransition(Object obj) {
        C47515ab abVar = this.f354792d;
        if (abVar != null) {
            abVar.mo51379g(true);
        }
        super.setExitTransition(obj);
    }

    public final void setReenterTransition(Object obj) {
        C47515ab abVar = this.f354792d;
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
        C47515ab abVar = this.f354792d;
        if (abVar != null) {
            abVar.mo51379g(true);
        }
        super.setReturnTransition(obj);
    }

    public final void setSharedElementEnterTransition(Object obj) {
        C47515ab abVar = this.f354792d;
        if (abVar != null) {
            abVar.mo51379g(true);
        }
        super.setSharedElementEnterTransition(obj);
    }

    public final void setSharedElementReturnTransition(Object obj) {
        C47515ab abVar = this.f354792d;
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
        this.f354792d.mo51381i();
        try {
            if (!this.f354793e) {
                super.onAttach(context);
                if (this.f354789a == null) {
                    Object jN = mo108869d().mo17653jN();
                    Bundle b = ((C74176nj) jN).mo69504b();
                    C58838bb.m90869d(b.containsKey("TIKTOK_FRAGMENT_ARGUMENT"), "Proto @Argument for Fragment could not be found. @Arguments must be provided using the Fragment#create(MessageLite argument) overload.");
                    C52027hz hzVar = (C52027hz) ProtoParsers.m95522e(b, "TIKTOK_FRAGMENT_ARGUMENT", C52027hz.f136550c, (C62921ba) ((C74176nj) jN).f206677a.gG.mo17428b());
                    C68225k.m98532d(hzVar);
                    this.f354789a = new C129156c(hzVar, (C129153f) ((C74176nj) jN).f207094u.mo17428b(), ((C74176nj) jN).f206677a.b.mo67390cv(), (C46801dp) ((C74176nj) jN).f207084k.mo17428b());
                    super.getLifecycle().mo5790b(new TracedFragmentLifecycle(this.f354792d, this.f354791c));
                }
                Fragment parentFragment = getParentFragment();
                if (parentFragment instanceof C47570bu) {
                    C47515ab abVar = this.f354792d;
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
                C129147a.m210806a(th, th2);
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
