package com.google.android.libraries.lens.view.infopanel.p2140b;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.p031v4.app.Fragment;
import android.support.p033v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.widget.TextView;
import androidx.core.content.C1878d;
import androidx.core.p098j.C2043bi;
import androidx.core.widget.NestedScrollView;
import androidx.lifecycle.C2384o;
import androidx.lifecycle.C2393x;
import com.google.android.apps.gsa.binaries.satin.app.C74176nj;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.lens.view.infopanel.p2145f.C27188c;
import com.google.android.libraries.lens.view.p2090ba.C25684e;
import com.google.android.libraries.lens.view.utils.C28110al;
import com.google.android.libraries.logging.p2185ve.C28306ab;
import com.google.android.libraries.logging.p2185ve.C28310af;
import com.google.android.libraries.logging.p2185ve.C28443m;
import com.google.android.libraries.logging.p2185ve.synthetic.dialogs.DialogVisualElements;
import com.google.android.libraries.p1623at.p1632e.C19559g;
import com.google.apps.tiktok.inject.C47200b;
import com.google.apps.tiktok.inject.C47214c;
import com.google.apps.tiktok.inject.C47231d;
import com.google.apps.tiktok.inject.baseclasses.TracedFragmentLifecycle;
import com.google.apps.tiktok.inject.p3659d.C47232a;
import com.google.apps.tiktok.inject.p3659d.C47233b;
import com.google.apps.tiktok.inject.p3659d.C47236e;
import com.google.apps.tiktok.inject.p3659d.C47242k;
import com.google.apps.tiktok.inject.p3660e.p3661a.C47247a;
import com.google.apps.tiktok.p3674l.p3679c.C47387a;
import com.google.apps.tiktok.tracing.C47515ab;
import com.google.apps.tiktok.tracing.C47570bu;
import com.google.apps.tiktok.tracing.C47573bx;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.apps.tiktok.tracing.C47816ey;
import com.google.apps.tiktok.tracing.C47831fm;
import com.google.common.base.C58838bb;
import com.google.protobuf.C62921ba;
import com.google.protobuf.contrib.android.ProtoParsers;
import com.google.protos.youtube.elements.C66166ck;
import dagger.hilt.p5299a.C68288b;
import dagger.p5294a.C68221g;
import dagger.p5294a.C68225k;
import java.util.Locale;

/* renamed from: com.google.android.libraries.lens.view.infopanel.b.f */
/* compiled from: PG */
public final class C27018f extends C27038z implements C47231d, C68288b, C47200b, C47233b, C47570bu {

    /* renamed from: a */
    private C27024l f73650a;

    /* renamed from: b */
    private Context f73651b;

    /* renamed from: c */
    private final C2393x f73652c = new C2393x(this);

    /* renamed from: d */
    private final C47515ab f73653d = new C47515ab(this);

    /* renamed from: e */
    private boolean f73654e;

    @Deprecated
    public C27018f() {
        C19559g.m37304c();
    }

    /* renamed from: a */
    public final C27024l mo17754z() {
        C27024l lVar = this.f73650a;
        if (lVar == null) {
            throw new IllegalStateException("peer() called before initialized.");
        } else if (!this.f73654e) {
            return lVar;
        } else {
            throw new IllegalStateException("peer() called after destroyed.");
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final /* synthetic */ C47247a mo32473b() {
        return new C47242k(this);
    }

    public final void dismiss() {
        C47573bx w = C47831fm.m85028w();
        try {
            super.dismiss();
            w.close();
            return;
        } catch (Throwable th) {
            C27017e.m50133a(th, th);
        }
        throw th;
    }

    @Deprecated
    /* renamed from: e */
    public final Context mo17857e() {
        if (this.f73651b == null) {
            this.f73651b = new C47236e((Fragment) this, super.getContext());
        }
        return this.f73651b;
    }

    /* renamed from: g */
    public final C47816ey mo17859g() {
        return this.f73653d.f123354b;
    }

    public final Context getContext() {
        if (super.getContext() == null) {
            return null;
        }
        return mo17857e();
    }

    public final C2384o getLifecycle() {
        return this.f73652c;
    }

    /* renamed from: h */
    public final Locale mo17860h() {
        return C47232a.m84025a(this);
    }

    /* renamed from: i */
    public final void mo17861i(C47816ey eyVar, boolean z) {
        this.f73653d.mo51380h(eyVar, z);
    }

    public final void onActivityCreated(Bundle bundle) {
        this.f73653d.mo51381i();
        try {
            super.onActivityCreated(bundle);
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C27017e.m50133a(th, th);
        }
        throw th;
    }

    public final void onActivityResult(int i, int i2, Intent intent) {
        C47573bx a = this.f73653d.mo51373a("Fragment:onActivityResult");
        try {
            super.onActivityResult(i, i2, intent);
            if (a != null) {
                a.close();
                return;
            }
            return;
        } catch (Throwable th) {
            C27017e.m50133a(th, th);
        }
        throw th;
    }

    public final void onAttach(Activity activity) {
        this.f73653d.mo51381i();
        try {
            super.onAttach(activity);
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C27017e.m50133a(th, th);
        }
        throw th;
    }

    public final void onCancel(DialogInterface dialogInterface) {
        this.f73653d.mo51378f("DialogFragment:onCancel").close();
    }

    public final void onCreate(Bundle bundle) {
        this.f73653d.mo51381i();
        try {
            super.onCreate(bundle);
            mo17754z().f73663b.setStyle(0, 2132150752);
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C27017e.m50133a(th, th);
        }
        throw th;
    }

    public final Animation onCreateAnimation(int i, boolean z, int i2) {
        this.f73653d.mo51382j(i, i2);
        try {
            Animation onCreateAnimation = super.onCreateAnimation(i, z, i2);
            C47831fm.m85019n();
            return onCreateAnimation;
        } catch (Throwable th) {
            C27017e.m50133a(th, th);
        }
        throw th;
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.f73653d.mo51381i();
        try {
            super.onCreateView(layoutInflater, viewGroup, bundle);
            C27024l a = mo17754z();
            C66166ck ckVar = a.f73662a.f73658b;
            if (ckVar == null) {
                ckVar = C66166ck.f179921e;
            }
            ViewGroup viewGroup2 = (ViewGroup) layoutInflater.inflate(R.layout.elements_view, viewGroup, false);
            String str = a.f73662a.f73657a;
            Toolbar toolbar = (Toolbar) viewGroup2.findViewById(R.id.interstitial_toolbar);
            Context context = a.f73664c;
            Drawable b = C28110al.m52390b(context, R.drawable.quantum_ic_arrow_back_vd_theme_24, C1878d.m5128a(context, R.color.text_color_primary));
            toolbar.mo2415p(R.string.lens_back);
            toolbar.mo2418s(b);
            toolbar.mo2419t(new C27021i(a));
            ((TextView) toolbar.findViewById(R.id.interstitial_toolbar_title)).setText(str);
            C2043bi.m5555ai(viewGroup2, new C27022j());
            ((ViewGroup) viewGroup2.findViewById(R.id.interstitial_content)).addView(a.f73665d.mo32469a(ckVar.toByteArray()));
            C27018f fVar = a.f73663b;
            Dialog dialog = fVar.getDialog();
            if (dialog != null) {
                DialogVisualElements.m53173a(fVar, dialog, new C27023k(a));
            }
            a.f73671j = new C27188c((NestedScrollView) viewGroup2.findViewById(R.id.interstitial_scroll_view), a.f73668g, a.f73670i, a.f73666e);
            a.f73671j.mo32622e();
            a.f73669h.mo32475d(a);
            C47831fm.m85019n();
            return viewGroup2;
        } catch (Throwable th) {
            C27017e.m50133a(th, th);
        }
        throw th;
    }

    public final void onDestroy() {
        C47573bx b = this.f73653d.mo51374b();
        try {
            super.onDestroy();
            b.close();
            return;
        } catch (Throwable th) {
            C27017e.m50133a(th, th);
        }
        throw th;
    }

    public final void onDestroyView() {
        C47573bx c = this.f73653d.mo51375c();
        try {
            super.onDestroyView();
            C27024l a = mo17754z();
            a.f73669h.mo32476e(a);
            a.f73671j.mo32618a();
            c.close();
            return;
        } catch (Throwable th) {
            C27017e.m50133a(th, th);
        }
        throw th;
    }

    public final void onDetach() {
        C47573bx d = this.f73653d.mo51376d();
        try {
            super.onDetach();
            this.f73654e = true;
            d.close();
            return;
        } catch (Throwable th) {
            C27017e.m50133a(th, th);
        }
        throw th;
    }

    public final void onDismiss(DialogInterface dialogInterface) {
        C47573bx f = this.f73653d.mo51378f("DialogFragment:onDismiss");
        try {
            super.onDismiss(dialogInterface);
            f.close();
            return;
        } catch (Throwable th) {
            C27017e.m50133a(th, th);
        }
        throw th;
    }

    public final LayoutInflater onGetLayoutInflater(Bundle bundle) {
        this.f73653d.mo51381i();
        try {
            LayoutInflater onGetLayoutInflater = super.onGetLayoutInflater(bundle);
            LayoutInflater cloneInContext = onGetLayoutInflater.cloneInContext(new C47236e((Fragment) this, onGetLayoutInflater));
            C47831fm.m85019n();
            return cloneInContext;
        } catch (Throwable th) {
            C27017e.m50133a(th, th);
        }
        throw th;
    }

    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        C47573bx a = this.f73653d.mo51373a("Fragment:onOptionsItemSelected");
        try {
            boolean onOptionsItemSelected = super.onOptionsItemSelected(menuItem);
            if (a != null) {
                a.close();
            }
            return onOptionsItemSelected;
        } catch (Throwable th) {
            C27017e.m50133a(th, th);
        }
        throw th;
    }

    public final void onPause() {
        this.f73653d.mo51381i();
        try {
            super.onPause();
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C27017e.m50133a(th, th);
        }
        throw th;
    }

    public final void onResume() {
        C47573bx e = this.f73653d.mo51377e();
        try {
            super.onResume();
            e.close();
            return;
        } catch (Throwable th) {
            C27017e.m50133a(th, th);
        }
        throw th;
    }

    public final void onSaveInstanceState(Bundle bundle) {
        this.f73653d.mo51381i();
        try {
            super.onSaveInstanceState(bundle);
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C27017e.m50133a(th, th);
        }
        throw th;
    }

    public final void onStart() {
        this.f73653d.mo51381i();
        try {
            super.onStart();
            C47387a.m84225b(this);
            if (getShowsDialog()) {
                C47387a.m84224a(this);
            }
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C27017e.m50133a(th, th);
        }
        throw th;
    }

    public final void onStop() {
        this.f73653d.mo51381i();
        try {
            super.onStop();
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C27017e.m50133a(th, th);
        }
        throw th;
    }

    public final void onViewCreated(View view, Bundle bundle) {
        this.f73653d.mo51381i();
        C47831fm.m85019n();
    }

    public final void setEnterTransition(Object obj) {
        C47515ab abVar = this.f73653d;
        if (abVar != null) {
            abVar.mo51379g(true);
        }
        super.setEnterTransition(obj);
    }

    public final void setExitTransition(Object obj) {
        C47515ab abVar = this.f73653d;
        if (abVar != null) {
            abVar.mo51379g(true);
        }
        super.setExitTransition(obj);
    }

    public final void setReenterTransition(Object obj) {
        C47515ab abVar = this.f73653d;
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
        C47515ab abVar = this.f73653d;
        if (abVar != null) {
            abVar.mo51379g(true);
        }
        super.setReturnTransition(obj);
    }

    public final void setSharedElementEnterTransition(Object obj) {
        C47515ab abVar = this.f73653d;
        if (abVar != null) {
            abVar.mo51379g(true);
        }
        super.setSharedElementEnterTransition(obj);
    }

    public final void setSharedElementReturnTransition(Object obj) {
        C47515ab abVar = this.f73653d;
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
        this.f73653d.mo51381i();
        try {
            if (!this.f73654e) {
                super.onAttach(context);
                if (this.f73650a == null) {
                    Object jN = mo32479d().mo17653jN();
                    Bundle b = ((C74176nj) jN).mo69504b();
                    C58838bb.m90869d(b.containsKey("TIKTOK_FRAGMENT_ARGUMENT"), "Proto @Argument for Fragment could not be found. @Arguments must be provided using the Fragment#create(MessageLite argument) overload.");
                    C27020h hVar = (C27020h) ProtoParsers.m95522e(b, "TIKTOK_FRAGMENT_ARGUMENT", C27020h.f73655c, (C62921ba) ((C74176nj) jN).f206677a.gG.mo17428b());
                    C68225k.m98532d(hVar);
                    Fragment fragment = (Fragment) ((C68221g) ((C74176nj) jN).f206889e).f184583a;
                    if (fragment instanceof C27018f) {
                        C27018f fVar = (C27018f) fragment;
                        C68225k.m98532d(fVar);
                        this.f73650a = new C27024l(hVar, fVar, (Context) ((C74176nj) jN).f206836d.f205391d.mo17428b(), (C27014b) ((C74176nj) jN).f206836d.f205249aQ.mo17428b(), (C28306ab) ((C74176nj) jN).f206677a.a.f202880fS.mo17428b(), (C25684e) ((C74176nj) jN).f206836d.f205219N.mo17428b(), (C28310af) ((C74176nj) jN).f206677a.a.f202878fQ.mo17428b(), (C27031s) ((C74176nj) jN).f206836d.f205252aT.mo17428b(), (C28443m) ((C74176nj) jN).f206677a.a.f202879fR.mo17428b());
                        super.getLifecycle().mo5790b(new TracedFragmentLifecycle(this.f73653d, this.f73652c));
                    } else {
                        String obj = C27024l.class.toString();
                        String valueOf = String.valueOf(fragment.getClass());
                        throw new IllegalStateException("Attempt to inject a Fragment wrapper of type " + obj + ", but the wrapper available is of type: " + valueOf + ". Does your peer's @Inject constructor reference the wrong wrapper class?");
                    }
                }
                Fragment parentFragment = getParentFragment();
                if (parentFragment instanceof C47570bu) {
                    C47515ab abVar = this.f73653d;
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
                C27017e.m50133a(th, th2);
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
