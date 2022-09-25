package com.google.android.apps.gsa.staticplugins.hotwordenrollment.p7971c.p7978c;

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
import android.widget.TextView;
import androidx.lifecycle.C2384o;
import androidx.lifecycle.C2393x;
import com.google.android.apps.gsa.assistant.settings.features.av.ei;
import com.google.android.apps.gsa.binaries.satin.app.C74178nm;
import com.google.android.apps.gsa.opaonboarding.p6463ui.C83983ah;
import com.google.android.apps.gsa.opaonboarding.p6463ui.C84018m;
import com.google.android.apps.gsa.opaonboarding.p6463ui.HeaderLayout;
import com.google.android.apps.gsa.opaonboarding.p6463ui.OpaPageLayout;
import com.google.android.apps.gsa.shared.util.C90743b;
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
import com.google.apps.tiktok.tracing.C47515ab;
import com.google.apps.tiktok.tracing.C47570bu;
import com.google.apps.tiktok.tracing.C47573bx;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.apps.tiktok.tracing.C47816ey;
import com.google.apps.tiktok.tracing.C47831fm;
import dagger.hilt.android.internal.managers.C68324h;
import dagger.hilt.p5299a.C68288b;
import dagger.p5294a.C68221g;
import dagger.p5294a.C68225k;
import java.util.Locale;

/* renamed from: com.google.android.apps.gsa.staticplugins.hotwordenrollment.c.c.v */
/* compiled from: PG */
public final class C101713v extends C101690c implements C47231d, C68288b, C47200b, C47233b, C47570bu {

    /* renamed from: a */
    private C101716y f283807a;

    /* renamed from: b */
    private Context f283808b;

    /* renamed from: c */
    private final C2393x f283809c = new C2393x(this);

    /* renamed from: d */
    private final C47515ab f283810d = new C47515ab(this);

    /* renamed from: e */
    private boolean f283811e;

    @Deprecated
    public C101713v() {
        C19559g.m37304c();
    }

    /* renamed from: a */
    public final void mo92348a() {
        mo17754z();
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final /* synthetic */ C68324h mo92499d() {
        return new C47243l(this);
    }

    @Deprecated
    /* renamed from: e */
    public final Context mo17857e() {
        if (this.f283808b == null) {
            this.f283808b = new C47236e((Fragment) this, super.getContext());
        }
        return this.f283808b;
    }

    /* renamed from: g */
    public final C47816ey mo17859g() {
        return this.f283810d.f123354b;
    }

    public final Context getContext() {
        if (super.getContext() == null) {
            return null;
        }
        return mo17857e();
    }

    public final C2384o getLifecycle() {
        return this.f283809c;
    }

    /* renamed from: h */
    public final Locale mo17860h() {
        return C47232a.m84025a(this);
    }

    /* renamed from: i */
    public final void mo17861i(C47816ey eyVar, boolean z) {
        this.f283810d.mo51380h(eyVar, z);
    }

    /* renamed from: j */
    public final C101716y mo17754z() {
        C101716y yVar = this.f283807a;
        if (yVar == null) {
            throw new IllegalStateException("peer() called before initialized.");
        } else if (!this.f283811e) {
            return yVar;
        } else {
            throw new IllegalStateException("peer() called after destroyed.");
        }
    }

    public final void onActivityCreated(Bundle bundle) {
        this.f283810d.mo51381i();
        try {
            super.onActivityCreated(bundle);
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C101712u.m168303a(th, th);
        }
        throw th;
    }

    public final void onActivityResult(int i, int i2, Intent intent) {
        C47573bx a = this.f283810d.mo51373a("Fragment:onActivityResult");
        try {
            super.onActivityResult(i, i2, intent);
            if (a != null) {
                a.close();
                return;
            }
            return;
        } catch (Throwable th) {
            C101712u.m168303a(th, th);
        }
        throw th;
    }

    public final void onAttach(Activity activity) {
        this.f283810d.mo51381i();
        try {
            super.onAttach(activity);
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C101712u.m168303a(th, th);
        }
        throw th;
    }

    public final void onCreate(Bundle bundle) {
        this.f283810d.mo51381i();
        try {
            super.onCreate(bundle);
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C101712u.m168303a(th, th);
        }
        throw th;
    }

    public final Animation onCreateAnimation(int i, boolean z, int i2) {
        this.f283810d.mo51382j(i, i2);
        try {
            Animation onCreateAnimation = super.onCreateAnimation(i, z, i2);
            C47831fm.m85019n();
            return onCreateAnimation;
        } catch (Throwable th) {
            C101712u.m168303a(th, th);
        }
        throw th;
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.f283810d.mo51381i();
        try {
            super.onCreateView(layoutInflater, viewGroup, bundle);
            C101716y j = mo17754z();
            OpaPageLayout opaPageLayout = (OpaPageLayout) layoutInflater.inflate(R.layout.structure_level_already_enabled_screen, viewGroup, false);
            HeaderLayout headerLayout = (HeaderLayout) opaPageLayout.findViewById(R.id.opa_header);
            C84018m.m133908c(headerLayout.f228718a, j.f283814a.getString(R.string.structure_level_already_enabled_header_title), TextView.BufferType.NORMAL, headerLayout);
            String string = j.f283814a.getString(R.string.structure_level_already_enabled_description);
            ei eiVar = j.f283816c;
            C84018m.m133908c(headerLayout.f228719b, String.format(string, new Object[]{eiVar.d(eiVar.a(j.f283815b).f129636g)}), TextView.BufferType.NORMAL, headerLayout);
            if (ei.m(j.f283816c.a(j.f283815b), 1)) {
                opaPageLayout.findViewById(R.id.voice_match).setVisibility(0);
            }
            if (ei.m(j.f283816c.a(j.f283815b), 2)) {
                opaPageLayout.findViewById(R.id.face_match).setVisibility(0);
            }
            if (ei.m(j.f283816c.a(j.f283815b), 3)) {
                opaPageLayout.findViewById(R.id.personal_results).setVisibility(0);
            }
            C83983ah.m133842b(opaPageLayout, new C101715x(j)).mo77412a();
            if (j.f283817d.mo85090c()) {
                C90743b.m148214a(headerLayout.f228718a, 500);
            }
            C47831fm.m85019n();
            return opaPageLayout;
        } catch (Throwable th) {
            C101712u.m168303a(th, th);
        }
        throw th;
    }

    public final void onDestroy() {
        C47573bx b = this.f283810d.mo51374b();
        try {
            super.onDestroy();
            b.close();
            return;
        } catch (Throwable th) {
            C101712u.m168303a(th, th);
        }
        throw th;
    }

    public final void onDestroyView() {
        C47573bx c = this.f283810d.mo51375c();
        try {
            super.onDestroyView();
            c.close();
            return;
        } catch (Throwable th) {
            C101712u.m168303a(th, th);
        }
        throw th;
    }

    public final void onDetach() {
        C47573bx d = this.f283810d.mo51376d();
        try {
            super.onDetach();
            this.f283811e = true;
            d.close();
            return;
        } catch (Throwable th) {
            C101712u.m168303a(th, th);
        }
        throw th;
    }

    public final LayoutInflater onGetLayoutInflater(Bundle bundle) {
        this.f283810d.mo51381i();
        try {
            LayoutInflater onGetLayoutInflater = super.onGetLayoutInflater(bundle);
            LayoutInflater cloneInContext = onGetLayoutInflater.cloneInContext(new C47236e((Fragment) this, onGetLayoutInflater));
            C47831fm.m85019n();
            return cloneInContext;
        } catch (Throwable th) {
            C101712u.m168303a(th, th);
        }
        throw th;
    }

    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        C47573bx a = this.f283810d.mo51373a("Fragment:onOptionsItemSelected");
        try {
            boolean onOptionsItemSelected = super.onOptionsItemSelected(menuItem);
            if (a != null) {
                a.close();
            }
            return onOptionsItemSelected;
        } catch (Throwable th) {
            C101712u.m168303a(th, th);
        }
        throw th;
    }

    public final void onPause() {
        this.f283810d.mo51381i();
        try {
            super.onPause();
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C101712u.m168303a(th, th);
        }
        throw th;
    }

    public final void onResume() {
        C47573bx e = this.f283810d.mo51377e();
        try {
            super.onResume();
            e.close();
            return;
        } catch (Throwable th) {
            C101712u.m168303a(th, th);
        }
        throw th;
    }

    public final void onSaveInstanceState(Bundle bundle) {
        this.f283810d.mo51381i();
        C47831fm.m85019n();
    }

    public final void onStart() {
        this.f283810d.mo51381i();
        try {
            super.onStart();
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C101712u.m168303a(th, th);
        }
        throw th;
    }

    public final void onStop() {
        this.f283810d.mo51381i();
        try {
            super.onStop();
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C101712u.m168303a(th, th);
        }
        throw th;
    }

    public final void onViewCreated(View view, Bundle bundle) {
        this.f283810d.mo51381i();
        C47831fm.m85019n();
    }

    public final void setEnterTransition(Object obj) {
        C47515ab abVar = this.f283810d;
        if (abVar != null) {
            abVar.mo51379g(true);
        }
        super.setEnterTransition(obj);
    }

    public final void setExitTransition(Object obj) {
        C47515ab abVar = this.f283810d;
        if (abVar != null) {
            abVar.mo51379g(true);
        }
        super.setExitTransition(obj);
    }

    public final void setReenterTransition(Object obj) {
        C47515ab abVar = this.f283810d;
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
        C47515ab abVar = this.f283810d;
        if (abVar != null) {
            abVar.mo51379g(true);
        }
        super.setReturnTransition(obj);
    }

    public final void setSharedElementEnterTransition(Object obj) {
        C47515ab abVar = this.f283810d;
        if (abVar != null) {
            abVar.mo51379g(true);
        }
        super.setSharedElementEnterTransition(obj);
    }

    public final void setSharedElementReturnTransition(Object obj) {
        C47515ab abVar = this.f283810d;
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
        this.f283810d.mo51381i();
        try {
            if (!this.f283811e) {
                super.onAttach(context);
                if (this.f283807a == null) {
                    Object jN = mo92498b().mo17653jN();
                    Fragment fragment = (Fragment) ((C68221g) ((C74178nm) jN).f207137d).f184583a;
                    if (fragment instanceof C101713v) {
                        C101713v vVar = (C101713v) fragment;
                        C68225k.m98532d(vVar);
                        this.f283807a = new C101716y(vVar, ((C74178nm) jN).mo70080v(), (ei) ((C74178nm) jN).f207130a.b.f200245fu.mo17428b(), (C90743b) ((C74178nm) jN).f207130a.gx.mo17428b());
                        super.getLifecycle().mo5790b(new TracedFragmentLifecycle(this.f283810d, this.f283809c));
                    } else {
                        String obj = C101716y.class.toString();
                        String valueOf = String.valueOf(fragment.getClass());
                        throw new IllegalStateException("Attempt to inject a Fragment wrapper of type " + obj + ", but the wrapper available is of type: " + valueOf + ". Does your peer's @Inject constructor reference the wrong wrapper class?");
                    }
                }
                Fragment parentFragment = getParentFragment();
                if (parentFragment instanceof C47570bu) {
                    C47515ab abVar = this.f283810d;
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
                C101712u.m168303a(th, th2);
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
