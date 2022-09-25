package com.google.android.apps.gsa.assistant.settings.features.p545ag;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.p031v4.app.Fragment;
import android.support.p033v7.app.C0392m;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import androidx.lifecycle.C2384o;
import androidx.lifecycle.C2393x;
import com.google.android.apps.gsa.binaries.satin.app.C74178nm;
import com.google.android.apps.gsa.nga.engine.warmactions.p6255g.C79570b;
import com.google.android.googlequicksearchbox.R;
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
import com.google.apps.tiktok.inject.p3659d.C47243l;
import com.google.apps.tiktok.p3674l.p3675a.C47363g;
import com.google.apps.tiktok.p3674l.p3675a.C47364h;
import com.google.apps.tiktok.p3674l.p3679c.C47387a;
import com.google.apps.tiktok.tracing.C47515ab;
import com.google.apps.tiktok.tracing.C47570bu;
import com.google.apps.tiktok.tracing.C47573bx;
import com.google.apps.tiktok.tracing.C47581ce;
import com.google.apps.tiktok.tracing.C47770dh;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.apps.tiktok.tracing.C47816ey;
import com.google.apps.tiktok.tracing.C47831fm;
import com.google.common.base.C58838bb;
import com.google.protobuf.C62921ba;
import com.google.protobuf.C62963cj;
import com.google.protobuf.contrib.android.ProtoParsers;
import dagger.hilt.android.internal.managers.C68324h;
import dagger.hilt.p5299a.C68288b;
import dagger.p5294a.C68221g;
import dagger.p5294a.C68225k;
import java.util.Locale;

/* renamed from: com.google.android.apps.gsa.assistant.settings.features.ag.x */
/* compiled from: PG */
public final class C10058x extends C10038d implements C47231d, C68288b, C47200b, C47233b, C47570bu {

    /* renamed from: a */
    private C10005ad f34298a;

    /* renamed from: c */
    private Context f34299c;

    /* renamed from: d */
    private final C2393x f34300d = new C2393x(this);

    /* renamed from: e */
    private final C47515ab f34301e = new C47515ab(this);

    /* renamed from: f */
    private boolean f34302f;

    @Deprecated
    public C10058x() {
        C19559g.m37304c();
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final /* synthetic */ C68324h mo18201b() {
        return new C47243l(this);
    }

    public final void dismiss() {
        C47573bx w = C47831fm.m85028w();
        try {
            super.dismiss();
            w.close();
            return;
        } catch (Throwable th) {
            C10057w.m24853a(th, th);
        }
        throw th;
    }

    @Deprecated
    /* renamed from: e */
    public final Context mo17857e() {
        if (this.f34299c == null) {
            this.f34299c = new C47236e((Fragment) this, super.getContext());
        }
        return this.f34299c;
    }

    /* renamed from: f */
    public final C10005ad mo17754z() {
        C10005ad adVar = this.f34298a;
        if (adVar == null) {
            throw new IllegalStateException("peer() called before initialized.");
        } else if (!this.f34302f) {
            return adVar;
        } else {
            throw new IllegalStateException("peer() called after destroyed.");
        }
    }

    /* renamed from: g */
    public final C47816ey mo17859g() {
        return this.f34301e.f123354b;
    }

    public final Context getContext() {
        if (super.getContext() == null) {
            return null;
        }
        return mo17857e();
    }

    public final C2384o getLifecycle() {
        return this.f34300d;
    }

    /* renamed from: h */
    public final Locale mo17860h() {
        return C47232a.m84025a(this);
    }

    /* renamed from: i */
    public final void mo17861i(C47816ey eyVar, boolean z) {
        this.f34301e.mo51380h(eyVar, z);
    }

    public final void onActivityCreated(Bundle bundle) {
        this.f34301e.mo51381i();
        try {
            super.onActivityCreated(bundle);
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C10057w.m24853a(th, th);
        }
        throw th;
    }

    public final void onActivityResult(int i, int i2, Intent intent) {
        C47573bx a = this.f34301e.mo51373a("Fragment:onActivityResult");
        try {
            super.onActivityResult(i, i2, intent);
            if (a != null) {
                a.close();
                return;
            }
            return;
        } catch (Throwable th) {
            C10057w.m24853a(th, th);
        }
        throw th;
    }

    public final void onAttach(Activity activity) {
        this.f34301e.mo51381i();
        try {
            super.onAttach(activity);
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C10057w.m24853a(th, th);
        }
        throw th;
    }

    public final void onCancel(DialogInterface dialogInterface) {
        this.f34301e.mo51378f("DialogFragment:onCancel").close();
    }

    public final void onCreate(Bundle bundle) {
        this.f34301e.mo51381i();
        try {
            super.onCreate(bundle);
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C10057w.m24853a(th, th);
        }
        throw th;
    }

    public final Animation onCreateAnimation(int i, boolean z, int i2) {
        this.f34301e.mo51382j(i, i2);
        try {
            Animation onCreateAnimation = super.onCreateAnimation(i, z, i2);
            C47831fm.m85019n();
            return onCreateAnimation;
        } catch (Throwable th) {
            C10057w.m24853a(th, th);
        }
        throw th;
    }

    public final Dialog onCreateDialog(Bundle bundle) {
        super.onCreateDialog(bundle);
        C10005ad f = mo17754z();
        boolean contains = new C62963cj(f.f34202f.f34207a, C10008ag.f34204b).contains(C79570b.CALL_CONTACT_V2);
        int i = R.layout.guacamole_settings_calls_v2_opt_in_dialog;
        if (!contains && !new C62963cj(f.f34202f.f34207a, C10008ag.f34204b).contains(C79570b.CALL_NUMBER_V2)) {
            i = R.layout.guacamole_settings_calls_opt_in_dialog;
        }
        View inflate = LayoutInflater.from(f.f34203g.requireActivity()).inflate(i, (ViewGroup) null);
        C47363g a = f.f34198b.mo51239a();
        a.mo51238h(inflate);
        C0392m a2 = a.mo51231a();
        View findViewById = inflate.findViewById(R.id.positive_button);
        View findViewById2 = inflate.findViewById(R.id.negative_button);
        a2.setOnShowListener(new C10059y(f, findViewById, a2, findViewById2));
        a2.setCanceledOnTouchOutside(false);
        a2.setOnKeyListener(new C47581ce(f.f34199c, new C10060z(f, findViewById2)));
        DialogVisualElements.m53173a(f.f34203g, a2, new C10002aa(f, findViewById, findViewById2));
        return a2;
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.f34301e.mo51381i();
        try {
            View onCreateView = super.onCreateView(layoutInflater, viewGroup, bundle);
            C47831fm.m85019n();
            return onCreateView;
        } catch (Throwable th) {
            C10057w.m24853a(th, th);
        }
        throw th;
    }

    public final void onDestroy() {
        C47573bx b = this.f34301e.mo51374b();
        try {
            super.onDestroy();
            b.close();
            return;
        } catch (Throwable th) {
            C10057w.m24853a(th, th);
        }
        throw th;
    }

    public final void onDestroyView() {
        C47573bx c = this.f34301e.mo51375c();
        try {
            super.onDestroyView();
            c.close();
            return;
        } catch (Throwable th) {
            C10057w.m24853a(th, th);
        }
        throw th;
    }

    public final void onDetach() {
        C47573bx d = this.f34301e.mo51376d();
        try {
            super.onDetach();
            this.f34302f = true;
            d.close();
            return;
        } catch (Throwable th) {
            C10057w.m24853a(th, th);
        }
        throw th;
    }

    public final void onDismiss(DialogInterface dialogInterface) {
        C47573bx f = this.f34301e.mo51378f("DialogFragment:onDismiss");
        try {
            super.onDismiss(dialogInterface);
            f.close();
            return;
        } catch (Throwable th) {
            C10057w.m24853a(th, th);
        }
        throw th;
    }

    public final LayoutInflater onGetLayoutInflater(Bundle bundle) {
        this.f34301e.mo51381i();
        try {
            LayoutInflater onGetLayoutInflater = super.onGetLayoutInflater(bundle);
            LayoutInflater cloneInContext = onGetLayoutInflater.cloneInContext(new C47236e((Fragment) this, onGetLayoutInflater));
            C47831fm.m85019n();
            return cloneInContext;
        } catch (Throwable th) {
            C10057w.m24853a(th, th);
        }
        throw th;
    }

    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        C47573bx a = this.f34301e.mo51373a("Fragment:onOptionsItemSelected");
        try {
            boolean O = this.f54440b.mo24732O();
            if (a != null) {
                a.close();
            }
            return O;
        } catch (Throwable th) {
            C10057w.m24853a(th, th);
        }
        throw th;
    }

    public final void onPause() {
        this.f34301e.mo51381i();
        try {
            super.onPause();
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C10057w.m24853a(th, th);
        }
        throw th;
    }

    public final void onResume() {
        C47573bx e = this.f34301e.mo51377e();
        try {
            super.onResume();
            e.close();
            return;
        } catch (Throwable th) {
            C10057w.m24853a(th, th);
        }
        throw th;
    }

    public final void onSaveInstanceState(Bundle bundle) {
        this.f34301e.mo51381i();
        try {
            super.onSaveInstanceState(bundle);
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C10057w.m24853a(th, th);
        }
        throw th;
    }

    public final void onStart() {
        this.f34301e.mo51381i();
        try {
            super.onStart();
            C47387a.m84225b(this);
            if (getShowsDialog()) {
                C47387a.m84224a(this);
            }
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C10057w.m24853a(th, th);
        }
        throw th;
    }

    public final void onStop() {
        this.f34301e.mo51381i();
        try {
            super.onStop();
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C10057w.m24853a(th, th);
        }
        throw th;
    }

    public final void onViewCreated(View view, Bundle bundle) {
        this.f34301e.mo51381i();
        try {
            this.f54440b.mo24720k(bundle);
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C10057w.m24853a(th, th);
        }
        throw th;
    }

    public final void setEnterTransition(Object obj) {
        C47515ab abVar = this.f34301e;
        if (abVar != null) {
            abVar.mo51379g(true);
        }
        super.setEnterTransition(obj);
    }

    public final void setExitTransition(Object obj) {
        C47515ab abVar = this.f34301e;
        if (abVar != null) {
            abVar.mo51379g(true);
        }
        super.setExitTransition(obj);
    }

    public final void setReenterTransition(Object obj) {
        C47515ab abVar = this.f34301e;
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
        C47515ab abVar = this.f34301e;
        if (abVar != null) {
            abVar.mo51379g(true);
        }
        super.setReturnTransition(obj);
    }

    public final void setSharedElementEnterTransition(Object obj) {
        C47515ab abVar = this.f34301e;
        if (abVar != null) {
            abVar.mo51379g(true);
        }
        super.setSharedElementEnterTransition(obj);
    }

    public final void setSharedElementReturnTransition(Object obj) {
        C47515ab abVar = this.f34301e;
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
        this.f34301e.mo51381i();
        try {
            if (!this.f34302f) {
                super.onAttach(context);
                if (this.f34298a == null) {
                    Object jN = mo18200a().mo17653jN();
                    C28443m mVar = (C28443m) ((C74178nm) jN).f207130a.a.f202879fR.mo17428b();
                    C47364h hVar = (C47364h) ((C74178nm) jN).f207140g.mo17428b();
                    C47770dh dhVar = (C47770dh) ((C74178nm) jN).f207130a.a.f202593X.mo17428b();
                    C28306ab abVar = (C28306ab) ((C74178nm) jN).f207130a.a.f202880fS.mo17428b();
                    C28310af afVar = (C28310af) ((C74178nm) jN).f207130a.a.f202878fQ.mo17428b();
                    Bundle a = ((C74178nm) jN).mo70044a();
                    C58838bb.m90869d(a.containsKey("TIKTOK_FRAGMENT_ARGUMENT"), "Proto @Argument for Fragment could not be found. @Arguments must be provided using the Fragment#create(MessageLite argument) overload.");
                    C10008ag agVar = (C10008ag) ProtoParsers.m95522e(a, "TIKTOK_FRAGMENT_ARGUMENT", C10008ag.f34205c, (C62921ba) ((C74178nm) jN).f207130a.gG.mo17428b());
                    C68225k.m98532d(agVar);
                    Fragment fragment = (Fragment) ((C68221g) ((C74178nm) jN).f207137d).f184583a;
                    if (fragment instanceof C10058x) {
                        C10058x xVar = (C10058x) fragment;
                        C68225k.m98532d(xVar);
                        this.f34298a = new C10005ad(mVar, hVar, dhVar, abVar, afVar, agVar, xVar);
                        super.getLifecycle().mo5790b(new TracedFragmentLifecycle(this.f34301e, this.f34300d));
                    } else {
                        String obj = C10005ad.class.toString();
                        String valueOf = String.valueOf(fragment.getClass());
                        throw new IllegalStateException("Attempt to inject a Fragment wrapper of type " + obj + ", but the wrapper available is of type: " + valueOf + ". Does your peer's @Inject constructor reference the wrong wrapper class?");
                    }
                }
                Fragment parentFragment = getParentFragment();
                if (parentFragment instanceof C47570bu) {
                    C47515ab abVar2 = this.f34301e;
                    if (abVar2.f123354b == null) {
                        abVar2.mo51380h(((C47570bu) parentFragment).mo17859g(), true);
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
                C10057w.m24853a(th, th2);
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
