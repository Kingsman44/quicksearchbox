package com.google.android.apps.gsa.staticplugins.hotwordenrollment.pages.voicematchconsent;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.p031v4.app.Fragment;
import android.support.p033v7.app.C0392m;
import android.text.SpannableString;
import android.text.style.URLSpan;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import androidx.lifecycle.C2384o;
import androidx.lifecycle.C2393x;
import com.google.android.apps.gsa.binaries.satin.app.C74178nm;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.shared.p7066m.C90082eg;
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
import com.google.apps.tiktok.inject.p3660e.p3662b.C47260e;
import com.google.apps.tiktok.p3674l.p3675a.C47363g;
import com.google.apps.tiktok.p3674l.p3675a.C47364h;
import com.google.apps.tiktok.p3674l.p3679c.C47387a;
import com.google.apps.tiktok.p3674l.p3679c.C47389c;
import com.google.apps.tiktok.p3674l.p3679c.C47393f;
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

/* renamed from: com.google.android.apps.gsa.staticplugins.hotwordenrollment.pages.voicematchconsent.g */
/* compiled from: PG */
public final class C102207g extends C102204d implements C47231d, C68288b, C47200b, C47233b, C47570bu {

    /* renamed from: a */
    private C102209i f285192a;

    /* renamed from: b */
    private Context f285193b;

    /* renamed from: c */
    private final C2393x f285194c = new C2393x(this);

    /* renamed from: d */
    private final C47515ab f285195d = new C47515ab(this);

    /* renamed from: e */
    private boolean f285196e;

    /* renamed from: f */
    private boolean f285197f;

    @Deprecated
    public C102207g() {
        C19559g.m37304c();
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final /* synthetic */ C68324h mo92994b() {
        return new C47243l(this);
    }

    public final void dismiss() {
        C47573bx w = C47831fm.m85028w();
        try {
            super.dismiss();
            w.close();
            return;
        } catch (Throwable th) {
            C102206f.m169343a(th, th);
        }
        throw th;
    }

    @Deprecated
    /* renamed from: e */
    public final Context mo17857e() {
        if (this.f285193b == null) {
            this.f285193b = new C47236e((Fragment) this, super.getContext());
        }
        return this.f285193b;
    }

    /* renamed from: f */
    public final C102209i mo17754z() {
        C102209i iVar = this.f285192a;
        if (iVar == null) {
            throw new IllegalStateException("peer() called before initialized.");
        } else if (!this.f285197f) {
            return iVar;
        } else {
            throw new IllegalStateException("peer() called after destroyed.");
        }
    }

    /* renamed from: g */
    public final C47816ey mo17859g() {
        return this.f285195d.f123354b;
    }

    public final Context getContext() {
        if (super.getContext() == null) {
            return null;
        }
        return mo17857e();
    }

    public final C2384o getLifecycle() {
        return this.f285194c;
    }

    /* renamed from: h */
    public final Locale mo17860h() {
        return C47232a.m84025a(this);
    }

    /* renamed from: i */
    public final void mo17861i(C47816ey eyVar, boolean z) {
        this.f285195d.mo51380h(eyVar, z);
    }

    public final void onActivityCreated(Bundle bundle) {
        this.f285195d.mo51381i();
        try {
            super.onActivityCreated(bundle);
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C102206f.m169343a(th, th);
        }
        throw th;
    }

    public final void onActivityResult(int i, int i2, Intent intent) {
        C47573bx a = this.f285195d.mo51373a("Fragment:onActivityResult");
        try {
            super.onActivityResult(i, i2, intent);
            if (a != null) {
                a.close();
                return;
            }
            return;
        } catch (Throwable th) {
            C102206f.m169343a(th, th);
        }
        throw th;
    }

    public final void onAttach(Activity activity) {
        this.f285195d.mo51381i();
        try {
            super.onAttach(activity);
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C102206f.m169343a(th, th);
        }
        throw th;
    }

    public final void onCancel(DialogInterface dialogInterface) {
        this.f285195d.mo51378f("DialogFragment:onCancel").close();
    }

    public final void onCreate(Bundle bundle) {
        this.f285195d.mo51381i();
        try {
            super.onCreate(bundle);
            C102209i f = mo17754z();
            f.f285201b.setStyle(0, 2132150770);
            f.f285201b.setCancelable(false);
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C102206f.m169343a(th, th);
        }
        throw th;
    }

    public final Animation onCreateAnimation(int i, boolean z, int i2) {
        this.f285195d.mo51382j(i, i2);
        try {
            Animation onCreateAnimation = super.onCreateAnimation(i, z, i2);
            C47831fm.m85019n();
            return onCreateAnimation;
        } catch (Throwable th) {
            C102206f.m169343a(th, th);
        }
        throw th;
    }

    public final Dialog onCreateDialog(Bundle bundle) {
        super.onCreateDialog(bundle);
        C102209i f = mo17754z();
        String str = f.f285200a;
        if (((str.hashCode() == 1921410083 && str.equals("NORMAL_USER")) ? (char) 0 : 65535) == 0) {
            C47363g gVar = f.f285202c;
            gVar.mo51236f();
            gVar.f123084f = R.string.florida_auburn_vm_error_general_title;
            gVar.mo51235e();
            gVar.f123083e = 2132150770;
            CharSequence text = f.f285201b.getText(R.string.florida_auburn_vm_error_general_description);
            String x = f.f285203d.mo79758x(C90082eg.f249939bB);
            SpannableString spannableString = new SpannableString(text);
            for (URLSpan uRLSpan : (URLSpan[]) spannableString.getSpans(0, spannableString.length(), URLSpan.class)) {
                int spanStart = spannableString.getSpanStart(uRLSpan);
                int spanEnd = spannableString.getSpanEnd(uRLSpan);
                int spanFlags = spannableString.getSpanFlags(uRLSpan);
                spannableString.removeSpan(uRLSpan);
                spannableString.setSpan(new LinkingFailureDialogFragmentPeer$1(x), spanStart, spanEnd, spanFlags);
            }
            gVar.mo51237g(spannableString);
            gVar.mo51233c();
            gVar.f123081c = R.string.florida_auburn_vm_error_general_primary_button_text;
            C0392m a = gVar.mo51231a();
            a.setOnShowListener(new C102208h(f, a));
            return a;
        }
        throw new IllegalStateException("Invalid DisplayMode provided to LinkingFailureDialogFragmentPeer!");
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.f285195d.mo51381i();
        try {
            View onCreateView = super.onCreateView(layoutInflater, viewGroup, bundle);
            this.f285196e = false;
            C47831fm.m85019n();
            return onCreateView;
        } catch (Throwable th) {
            C102206f.m169343a(th, th);
        }
        throw th;
    }

    public final void onDestroy() {
        C47573bx b = this.f285195d.mo51374b();
        try {
            super.onDestroy();
            b.close();
            return;
        } catch (Throwable th) {
            C102206f.m169343a(th, th);
        }
        throw th;
    }

    public final void onDestroyView() {
        C47573bx c = this.f285195d.mo51375c();
        try {
            super.onDestroyView();
            c.close();
            return;
        } catch (Throwable th) {
            C102206f.m169343a(th, th);
        }
        throw th;
    }

    public final void onDetach() {
        C47573bx d = this.f285195d.mo51376d();
        try {
            super.onDetach();
            this.f285197f = true;
            d.close();
            return;
        } catch (Throwable th) {
            C102206f.m169343a(th, th);
        }
        throw th;
    }

    public final void onDismiss(DialogInterface dialogInterface) {
        C47573bx f = this.f285195d.mo51378f("DialogFragment:onDismiss");
        try {
            super.onDismiss(dialogInterface);
            f.close();
            return;
        } catch (Throwable th) {
            C102206f.m169343a(th, th);
        }
        throw th;
    }

    public final LayoutInflater onGetLayoutInflater(Bundle bundle) {
        this.f285195d.mo51381i();
        try {
            LayoutInflater onGetLayoutInflater = super.onGetLayoutInflater(bundle);
            LayoutInflater cloneInContext = onGetLayoutInflater.cloneInContext(new C47236e((Fragment) this, onGetLayoutInflater));
            C47831fm.m85019n();
            return cloneInContext;
        } catch (Throwable th) {
            C102206f.m169343a(th, th);
        }
        throw th;
    }

    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        C47573bx a = this.f285195d.mo51373a("Fragment:onOptionsItemSelected");
        try {
            boolean onOptionsItemSelected = super.onOptionsItemSelected(menuItem);
            if (a != null) {
                a.close();
            }
            return onOptionsItemSelected;
        } catch (Throwable th) {
            C102206f.m169343a(th, th);
        }
        throw th;
    }

    public final void onPause() {
        this.f285195d.mo51381i();
        try {
            super.onPause();
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C102206f.m169343a(th, th);
        }
        throw th;
    }

    public final void onResume() {
        C47573bx e = this.f285195d.mo51377e();
        try {
            super.onResume();
            e.close();
            return;
        } catch (Throwable th) {
            C102206f.m169343a(th, th);
        }
        throw th;
    }

    public final void onSaveInstanceState(Bundle bundle) {
        this.f285195d.mo51381i();
        try {
            super.onSaveInstanceState(bundle);
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C102206f.m169343a(th, th);
        }
        throw th;
    }

    public final void onStart() {
        this.f285195d.mo51381i();
        try {
            super.onStart();
            C47387a.m84225b(this);
            if (getShowsDialog()) {
                if (!this.f285196e) {
                    C47389c.m84226a(getContext()).f123128b = C47393f.m84230a(this);
                    C102211k.m169352a(this, mo17754z());
                    this.f285196e = true;
                }
                C47387a.m84224a(this);
            }
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C102206f.m169343a(th, th);
        }
        throw th;
    }

    public final void onStop() {
        this.f285195d.mo51381i();
        try {
            super.onStop();
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C102206f.m169343a(th, th);
        }
        throw th;
    }

    public final void onViewCreated(View view, Bundle bundle) {
        this.f285195d.mo51381i();
        try {
            if (!getShowsDialog() && !this.f285196e) {
                C47389c.m84226a(getContext()).f123128b = view;
                C102211k.m169352a(this, mo17754z());
                this.f285196e = true;
            }
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C102206f.m169343a(th, th);
        }
        throw th;
    }

    public final void setEnterTransition(Object obj) {
        C47515ab abVar = this.f285195d;
        if (abVar != null) {
            abVar.mo51379g(true);
        }
        super.setEnterTransition(obj);
    }

    public final void setExitTransition(Object obj) {
        C47515ab abVar = this.f285195d;
        if (abVar != null) {
            abVar.mo51379g(true);
        }
        super.setExitTransition(obj);
    }

    public final void setReenterTransition(Object obj) {
        C47515ab abVar = this.f285195d;
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
        C47515ab abVar = this.f285195d;
        if (abVar != null) {
            abVar.mo51379g(true);
        }
        super.setReturnTransition(obj);
    }

    public final void setSharedElementEnterTransition(Object obj) {
        C47515ab abVar = this.f285195d;
        if (abVar != null) {
            abVar.mo51379g(true);
        }
        super.setSharedElementEnterTransition(obj);
    }

    public final void setSharedElementReturnTransition(Object obj) {
        C47515ab abVar = this.f285195d;
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
        this.f285195d.mo51381i();
        try {
            if (!this.f285197f) {
                super.onAttach(context);
                if (this.f285192a == null) {
                    Object jN = mo92993a().mo17653jN();
                    String b = C47260e.m84065b(((C74178nm) jN).mo70044a());
                    C68225k.m98532d(b);
                    Fragment fragment = (Fragment) ((C68221g) ((C74178nm) jN).f207137d).f184583a;
                    if (fragment instanceof C102207g) {
                        C102207g gVar = (C102207g) fragment;
                        C68225k.m98532d(gVar);
                        this.f285192a = new C102209i(b, gVar, (C47364h) ((C74178nm) jN).f207140g.mo17428b(), (C86124t) ((C74178nm) jN).f207130a.a.f202006C.mo17428b());
                        super.getLifecycle().mo5790b(new TracedFragmentLifecycle(this.f285195d, this.f285194c));
                    } else {
                        String obj = C102209i.class.toString();
                        String valueOf = String.valueOf(fragment.getClass());
                        throw new IllegalStateException("Attempt to inject a Fragment wrapper of type " + obj + ", but the wrapper available is of type: " + valueOf + ". Does your peer's @Inject constructor reference the wrong wrapper class?");
                    }
                }
                Fragment parentFragment = getParentFragment();
                if (parentFragment instanceof C47570bu) {
                    C47515ab abVar = this.f285195d;
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
                C102206f.m169343a(th, th2);
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
