package com.google.android.apps.search.googleapp.accounts.p10126ui;

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
import com.google.android.apps.search.googleapp.p10122ab.C133143b;
import com.google.android.apps.search.googleapp.p10122ab.C133148g;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.p1623at.p1632e.C19559g;
import com.google.apps.tiktok.inject.C47200b;
import com.google.apps.tiktok.inject.C47214c;
import com.google.apps.tiktok.inject.C47231d;
import com.google.apps.tiktok.inject.baseclasses.TracedFragmentLifecycle;
import com.google.apps.tiktok.inject.p3657c.p3658a.C47222f;
import com.google.apps.tiktok.inject.p3659d.C47232a;
import com.google.apps.tiktok.inject.p3659d.C47233b;
import com.google.apps.tiktok.inject.p3659d.C47236e;
import com.google.apps.tiktok.inject.p3659d.C47244m;
import com.google.apps.tiktok.p3674l.p3675a.C47363g;
import com.google.apps.tiktok.p3674l.p3679c.C47387a;
import com.google.apps.tiktok.p3674l.p3679c.C47389c;
import com.google.apps.tiktok.p3674l.p3679c.C47393f;
import com.google.apps.tiktok.tracing.C47515ab;
import com.google.apps.tiktok.tracing.C47570bu;
import com.google.apps.tiktok.tracing.C47573bx;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.apps.tiktok.tracing.C47816ey;
import com.google.apps.tiktok.tracing.C47831fm;
import com.google.common.base.C58838bb;
import dagger.hilt.p5299a.C68288b;
import java.util.Locale;
import p3186j$.util.Objects;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.search.googleapp.accounts.ui.ag */
/* compiled from: PG */
public final class C133177ag extends C133188aq implements C47231d, C68288b, C47200b, C47233b, C47570bu {

    /* renamed from: a */
    private C133180aj f363008a;

    /* renamed from: b */
    private Context f363009b;

    /* renamed from: c */
    private final C2393x f363010c = new C2393x(this);

    /* renamed from: d */
    private final C47515ab f363011d = new C47515ab(this);

    /* renamed from: e */
    private boolean f363012e;

    /* renamed from: f */
    private boolean f363013f;

    @Deprecated
    public C133177ag() {
        C19559g.m37304c();
    }

    /* renamed from: a */
    public final C133180aj mo17754z() {
        C133180aj ajVar = this.f363008a;
        if (ajVar == null) {
            throw new IllegalStateException("peer() called before initialized.");
        } else if (!this.f363013f) {
            return ajVar;
        } else {
            throw new IllegalStateException("peer() called after destroyed.");
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final /* synthetic */ C47222f mo111012b() {
        return C47244m.m84043e(this);
    }

    public final void dismiss() {
        C47573bx w = C47831fm.m85028w();
        try {
            super.dismiss();
            w.close();
            return;
        } catch (Throwable th) {
            C133176af.m216161a(th, th);
        }
        throw th;
    }

    @Deprecated
    /* renamed from: e */
    public final Context mo17857e() {
        if (this.f363009b == null) {
            this.f363009b = new C47236e((Fragment) this, super.getContext());
        }
        return this.f363009b;
    }

    /* renamed from: g */
    public final C47816ey mo17859g() {
        return this.f363011d.f123354b;
    }

    public final Context getContext() {
        if (super.getContext() == null) {
            return null;
        }
        return mo17857e();
    }

    public final C2384o getLifecycle() {
        return this.f363010c;
    }

    /* renamed from: h */
    public final Locale mo17860h() {
        return C47232a.m84025a(this);
    }

    /* renamed from: i */
    public final void mo17861i(C47816ey eyVar, boolean z) {
        this.f363011d.mo51380h(eyVar, z);
    }

    public final void onActivityCreated(Bundle bundle) {
        this.f363011d.mo51381i();
        try {
            super.onActivityCreated(bundle);
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C133176af.m216161a(th, th);
        }
        throw th;
    }

    public final void onActivityResult(int i, int i2, Intent intent) {
        C47573bx a = this.f363011d.mo51373a("Fragment:onActivityResult");
        try {
            super.onActivityResult(i, i2, intent);
            if (a != null) {
                a.close();
                return;
            }
            return;
        } catch (Throwable th) {
            C133176af.m216161a(th, th);
        }
        throw th;
    }

    public final void onAttach(Activity activity) {
        this.f363011d.mo51381i();
        try {
            super.onAttach(activity);
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C133176af.m216161a(th, th);
        }
        throw th;
    }

    public final void onCancel(DialogInterface dialogInterface) {
        this.f363011d.mo51378f("DialogFragment:onCancel").close();
    }

    public final void onCreate(Bundle bundle) {
        this.f363011d.mo51381i();
        try {
            super.onCreate(bundle);
            C133180aj a = mo17754z();
            a.f363022e.mo50429i(a.f363023f);
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C133176af.m216161a(th, th);
        }
        throw th;
    }

    public final Animation onCreateAnimation(int i, boolean z, int i2) {
        this.f363011d.mo51382j(i, i2);
        try {
            Animation onCreateAnimation = super.onCreateAnimation(i, z, i2);
            C47831fm.m85019n();
            return onCreateAnimation;
        } catch (Throwable th) {
            C133176af.m216161a(th, th);
        }
        throw th;
    }

    public final Dialog onCreateDialog(Bundle bundle) {
        super.onCreateDialog(bundle);
        C133180aj a = mo17754z();
        boolean z = false;
        a.f363019b.setCancelable(false);
        C133148g gVar = a.f363027j;
        C47363g gVar2 = a.f363020c;
        Optional c = gVar.mo110995c(Optional.m71637of(2132150987), Optional.m71637of(Integer.valueOf(R.style.googleapp_accountmenu_restricted_account_logout_dialog)));
        Objects.requireNonNull(gVar2);
        c.ifPresent(new C133143b(gVar2));
        C47363g gVar3 = a.f363020c;
        gVar3.mo51236f();
        gVar3.f123084f = R.string.googleapp_accountmenu_restricted_account_logout_dialog_title;
        if (gVar3.f123079a == -1) {
            z = true;
        }
        C58838bb.m90884s(z, "Cannot set icon multiple times.");
        gVar3.f123079a = R.drawable.quantum_gm_ic_info_outline_vd_theme_24;
        gVar3.mo51232b();
        gVar3.f123080b = R.string.googleapp_accountmenu_restricted_account_logout_dialog_description;
        gVar3.mo51234d();
        gVar3.f123082d = R.string.googleapp_accountmenu_restricted_account_logout_dialog_pos_button;
        C0392m a2 = gVar3.mo51231a();
        a2.setOnShowListener(new C133178ah(a, a2));
        return a2;
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.f363011d.mo51381i();
        try {
            View onCreateView = super.onCreateView(layoutInflater, viewGroup, bundle);
            this.f363012e = false;
            C47831fm.m85019n();
            return onCreateView;
        } catch (Throwable th) {
            C133176af.m216161a(th, th);
        }
        throw th;
    }

    public final void onDestroy() {
        C47573bx b = this.f363011d.mo51374b();
        try {
            super.onDestroy();
            b.close();
            return;
        } catch (Throwable th) {
            C133176af.m216161a(th, th);
        }
        throw th;
    }

    public final void onDestroyView() {
        C47573bx c = this.f363011d.mo51375c();
        try {
            super.onDestroyView();
            c.close();
            return;
        } catch (Throwable th) {
            C133176af.m216161a(th, th);
        }
        throw th;
    }

    public final void onDetach() {
        C47573bx d = this.f363011d.mo51376d();
        try {
            super.onDetach();
            this.f363013f = true;
            d.close();
            return;
        } catch (Throwable th) {
            C133176af.m216161a(th, th);
        }
        throw th;
    }

    public final void onDismiss(DialogInterface dialogInterface) {
        C47573bx f = this.f363011d.mo51378f("DialogFragment:onDismiss");
        try {
            super.onDismiss(dialogInterface);
            f.close();
            return;
        } catch (Throwable th) {
            C133176af.m216161a(th, th);
        }
        throw th;
    }

    public final LayoutInflater onGetLayoutInflater(Bundle bundle) {
        this.f363011d.mo51381i();
        try {
            LayoutInflater onGetLayoutInflater = super.onGetLayoutInflater(bundle);
            LayoutInflater cloneInContext = onGetLayoutInflater.cloneInContext(new C47236e((Fragment) this, onGetLayoutInflater));
            C47831fm.m85019n();
            return cloneInContext;
        } catch (Throwable th) {
            C133176af.m216161a(th, th);
        }
        throw th;
    }

    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        C47573bx a = this.f363011d.mo51373a("Fragment:onOptionsItemSelected");
        try {
            boolean onOptionsItemSelected = super.onOptionsItemSelected(menuItem);
            if (a != null) {
                a.close();
            }
            return onOptionsItemSelected;
        } catch (Throwable th) {
            C133176af.m216161a(th, th);
        }
        throw th;
    }

    public final void onPause() {
        this.f363011d.mo51381i();
        try {
            super.onPause();
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C133176af.m216161a(th, th);
        }
        throw th;
    }

    public final void onResume() {
        C47573bx e = this.f363011d.mo51377e();
        try {
            super.onResume();
            e.close();
            return;
        } catch (Throwable th) {
            C133176af.m216161a(th, th);
        }
        throw th;
    }

    public final void onSaveInstanceState(Bundle bundle) {
        this.f363011d.mo51381i();
        try {
            super.onSaveInstanceState(bundle);
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C133176af.m216161a(th, th);
        }
        throw th;
    }

    public final void onStart() {
        this.f363011d.mo51381i();
        try {
            super.onStart();
            C47387a.m84225b(this);
            if (getShowsDialog()) {
                if (!this.f363012e) {
                    C47389c.m84226a(getContext()).f123128b = C47393f.m84230a(this);
                    C133183al.m216175a(this, mo17754z());
                    this.f363012e = true;
                }
                C47387a.m84224a(this);
            }
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C133176af.m216161a(th, th);
        }
        throw th;
    }

    public final void onStop() {
        this.f363011d.mo51381i();
        try {
            super.onStop();
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C133176af.m216161a(th, th);
        }
        throw th;
    }

    public final void onViewCreated(View view, Bundle bundle) {
        this.f363011d.mo51381i();
        try {
            if (!getShowsDialog() && !this.f363012e) {
                C47389c.m84226a(getContext()).f123128b = view;
                C133183al.m216175a(this, mo17754z());
                this.f363012e = true;
            }
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C133176af.m216161a(th, th);
        }
        throw th;
    }

    public final void setEnterTransition(Object obj) {
        C47515ab abVar = this.f363011d;
        if (abVar != null) {
            abVar.mo51379g(true);
        }
        super.setEnterTransition(obj);
    }

    public final void setExitTransition(Object obj) {
        C47515ab abVar = this.f363011d;
        if (abVar != null) {
            abVar.mo51379g(true);
        }
        super.setExitTransition(obj);
    }

    public final void setReenterTransition(Object obj) {
        C47515ab abVar = this.f363011d;
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
        C47515ab abVar = this.f363011d;
        if (abVar != null) {
            abVar.mo51379g(true);
        }
        super.setReturnTransition(obj);
    }

    public final void setSharedElementEnterTransition(Object obj) {
        C47515ab abVar = this.f363011d;
        if (abVar != null) {
            abVar.mo51379g(true);
        }
        super.setSharedElementEnterTransition(obj);
    }

    public final void setSharedElementReturnTransition(Object obj) {
        C47515ab abVar = this.f363011d;
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
        this.f363011d.mo51381i();
        try {
            if (!this.f363013f) {
                super.onAttach(context);
                if (this.f363008a == null) {
                    this.f363008a = ((C133184am) mo111019d().mo17653jN()).mo111014bn();
                    super.getLifecycle().mo5790b(new TracedFragmentLifecycle(this.f363011d, this.f363010c));
                }
                Fragment parentFragment = getParentFragment();
                if (parentFragment instanceof C47570bu) {
                    C47515ab abVar = this.f363011d;
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
                C133176af.m216161a(th, th2);
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
