package com.google.apps.tiktok.inject.baseclasses;

import android.animation.Animator;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.p031v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import com.google.android.libraries.p1623at.p1626c.p1629c.C19522b;
import com.google.apps.tiktok.tracing.C47515ab;
import com.google.apps.tiktok.tracing.C47570bu;
import com.google.apps.tiktok.tracing.C47573bx;
import com.google.apps.tiktok.tracing.C47816ey;
import com.google.apps.tiktok.tracing.C47831fm;

/* renamed from: com.google.apps.tiktok.inject.baseclasses.f */
/* compiled from: PG */
public class C47210f extends C19522b implements C47570bu {

    /* renamed from: b */
    protected final C47515ab f122869b = new C47515ab(this);

    /* renamed from: g */
    public C47816ey mo17859g() {
        throw null;
    }

    /* renamed from: i */
    public void mo17861i(C47816ey eyVar, boolean z) {
        throw null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: k */
    public final void mo51110k(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
    }

    /* access modifiers changed from: protected */
    /* renamed from: l */
    public final void mo51111l(Bundle bundle) {
        super.onCreate(bundle);
    }

    /* access modifiers changed from: protected */
    /* renamed from: m */
    public final void mo51112m() {
        super.onDestroy();
    }

    /* access modifiers changed from: protected */
    /* renamed from: n */
    public final void mo51113n() {
        super.onDestroyView();
    }

    /* access modifiers changed from: protected */
    /* renamed from: o */
    public final void mo51114o() {
        super.onDetach();
    }

    public final void onActivityCreated(Bundle bundle) {
        this.f122869b.mo51383k();
        try {
            super.onActivityCreated(bundle);
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C47209e.m83968a(th, th);
        }
        throw th;
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        C47573bx a = this.f122869b.mo51373a("Fragment:onActivityResult");
        try {
            super.onActivityResult(i, i2, intent);
            if (a != null) {
                a.close();
                return;
            }
            return;
        } catch (Throwable th) {
            C47209e.m83968a(th, th);
        }
        throw th;
    }

    public void onAttach(Context context) {
        super.onAttach(context);
        Fragment parentFragment = getParentFragment();
        if (parentFragment instanceof C47570bu) {
            C47515ab abVar = this.f122869b;
            if (abVar.f123354b == null) {
                abVar.mo51380h(((C47570bu) parentFragment).mo17859g(), true);
            }
        }
    }

    public void onCreate(Bundle bundle) {
        this.f122869b.mo51383k();
        try {
            super.onCreate(bundle);
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C47209e.m83968a(th, th);
        }
        throw th;
    }

    public Animation onCreateAnimation(int i, boolean z, int i2) {
        this.f122869b.mo51382j(i, i2);
        try {
            Animation onCreateAnimation = super.onCreateAnimation(i, z, i2);
            C47831fm.m85019n();
            return onCreateAnimation;
        } catch (Throwable th) {
            C47209e.m83968a(th, th);
        }
        throw th;
    }

    public final Animator onCreateAnimator(int i, boolean z, int i2) {
        C47515ab abVar = this.f122869b;
        C47831fm.m85023r();
        if (i2 != 0) {
            abVar.f123353a = C47816ey.m84988b();
        }
        if (i != 0) {
            abVar.mo51380h(C47816ey.m84988b(), true);
        }
        try {
            Animator onCreateAnimator = super.onCreateAnimator(i, z, i2);
            C47831fm.m85019n();
            return onCreateAnimator;
        } catch (Throwable th) {
            C47209e.m83968a(th, th);
        }
        throw th;
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.f122869b.mo51383k();
        try {
            View onCreateView = super.onCreateView(layoutInflater, viewGroup, bundle);
            C47831fm.m85019n();
            return onCreateView;
        } catch (Throwable th) {
            C47209e.m83968a(th, th);
        }
        throw th;
    }

    public void onDestroy() {
        C47573bx b = this.f122869b.mo51374b();
        try {
            super.onDestroy();
            b.close();
            return;
        } catch (Throwable th) {
            C47209e.m83968a(th, th);
        }
        throw th;
    }

    public void onDestroyView() {
        C47573bx c = this.f122869b.mo51375c();
        try {
            super.onDestroyView();
            c.close();
            return;
        } catch (Throwable th) {
            C47209e.m83968a(th, th);
        }
        throw th;
    }

    public void onDetach() {
        C47573bx d = this.f122869b.mo51376d();
        try {
            super.onDetach();
            d.close();
            return;
        } catch (Throwable th) {
            C47209e.m83968a(th, th);
        }
        throw th;
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        C47573bx a = this.f122869b.mo51373a("Fragment:onOptionsItemSelected");
        try {
            boolean O = this.f54442o.mo24732O();
            if (a != null) {
                a.close();
            }
            return O;
        } catch (Throwable th) {
            C47209e.m83968a(th, th);
        }
        throw th;
    }

    public void onPause() {
        this.f122869b.mo51383k();
        try {
            super.onPause();
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C47209e.m83968a(th, th);
        }
        throw th;
    }

    public void onResume() {
        this.f122869b.mo51383k();
        try {
            super.onResume();
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C47209e.m83968a(th, th);
        }
        throw th;
    }

    public void onSaveInstanceState(Bundle bundle) {
        this.f122869b.mo51383k();
        try {
            this.f54442o.mo24721A(bundle);
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C47209e.m83968a(th, th);
        }
        throw th;
    }

    public void onStart() {
        this.f122869b.mo51383k();
        try {
            super.onStart();
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C47209e.m83968a(th, th);
        }
        throw th;
    }

    public void onStop() {
        this.f122869b.mo51383k();
        try {
            super.onStop();
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C47209e.m83968a(th, th);
        }
        throw th;
    }

    public void onViewCreated(View view, Bundle bundle) {
        this.f122869b.mo51383k();
        try {
            this.f54442o.mo24720k(bundle);
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C47209e.m83968a(th, th);
        }
        throw th;
    }

    /* access modifiers changed from: protected */
    /* renamed from: p */
    public final void mo51115p() {
        super.onPause();
    }

    /* access modifiers changed from: protected */
    /* renamed from: q */
    public final void mo51116q() {
        super.onResume();
    }

    /* access modifiers changed from: protected */
    /* renamed from: r */
    public final void mo51117r() {
        super.onStart();
    }

    /* access modifiers changed from: protected */
    /* renamed from: s */
    public final void mo51118s() {
        super.onStop();
    }

    public final void setEnterTransition(Object obj) {
        this.f122869b.mo51379g(obj != null);
        super.setEnterTransition(obj);
    }

    public final void setExitTransition(Object obj) {
        this.f122869b.mo51379g(obj != null);
        super.setExitTransition(obj);
    }

    public final void setReenterTransition(Object obj) {
        this.f122869b.mo51379g(obj != null);
        super.setReenterTransition(obj);
    }

    public final void setReturnTransition(Object obj) {
        this.f122869b.mo51379g(obj != null);
        super.setReturnTransition(obj);
    }

    public final void setSharedElementEnterTransition(Object obj) {
        this.f122869b.mo51379g(obj != null);
        super.setSharedElementEnterTransition(obj);
    }

    public final void setSharedElementReturnTransition(Object obj) {
        this.f122869b.mo51379g(obj != null);
        super.setSharedElementReturnTransition(obj);
    }

    /* access modifiers changed from: protected */
    /* renamed from: t */
    public final void mo51119t(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        super.onCreateView(layoutInflater, viewGroup, bundle);
    }
}
