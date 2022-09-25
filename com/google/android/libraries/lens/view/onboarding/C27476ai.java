package com.google.android.libraries.lens.view.onboarding;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.p031v4.app.Fragment;
import android.text.Html;
import android.text.Spannable;
import android.text.method.LinkMovementMethod;
import android.text.style.URLSpan;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.widget.TextView;
import androidx.lifecycle.C2384o;
import androidx.lifecycle.C2393x;
import com.airbnb.lottie.LottieAnimationView;
import com.google.android.apps.gsa.binaries.satin.app.C74176nj;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.lens.view.filters.p2101e.C25989d;
import com.google.android.libraries.lens.view.filters.p2101e.p2102a.C25980d;
import com.google.android.libraries.lens.view.p2078at.C25504aj;
import com.google.android.libraries.lens.view.p2078at.C25537t;
import com.google.android.libraries.lens.view.p2090ba.C25684e;
import com.google.android.libraries.lens.view.p2090ba.C25686g;
import com.google.android.libraries.logging.p2185ve.C28306ab;
import com.google.android.libraries.logging.p2185ve.C28313c;
import com.google.android.libraries.logging.p2185ve.C28353e;
import com.google.android.libraries.logging.p2185ve.C28427h;
import com.google.android.libraries.logging.p2185ve.C28441k;
import com.google.android.libraries.logging.p2185ve.C28443m;
import com.google.android.libraries.logging.p2185ve.C28446p;
import com.google.android.libraries.logging.p2185ve.C28447q;
import com.google.android.libraries.logging.p2185ve.C28448r;
import com.google.android.libraries.p1623at.p1632e.C19559g;
import com.google.apps.tiktok.account.p3603a.C45954d;
import com.google.apps.tiktok.inject.C47200b;
import com.google.apps.tiktok.inject.C47214c;
import com.google.apps.tiktok.inject.C47231d;
import com.google.apps.tiktok.inject.baseclasses.TracedFragmentLifecycle;
import com.google.apps.tiktok.inject.p3659d.C47232a;
import com.google.apps.tiktok.inject.p3659d.C47233b;
import com.google.apps.tiktok.inject.p3659d.C47236e;
import com.google.apps.tiktok.inject.p3659d.C47242k;
import com.google.apps.tiktok.inject.p3660e.p3661a.C47247a;
import com.google.apps.tiktok.inject.p3660e.p3662b.C47260e;
import com.google.apps.tiktok.p3674l.p3679c.C47389c;
import com.google.apps.tiktok.p3674l.p3679c.C47400m;
import com.google.apps.tiktok.tracing.C47515ab;
import com.google.apps.tiktok.tracing.C47570bu;
import com.google.apps.tiktok.tracing.C47573bx;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.apps.tiktok.tracing.C47816ey;
import com.google.apps.tiktok.tracing.C47831fm;
import com.google.common.p4552o.abb;
import com.google.common.p4552o.abc;
import com.google.common.p4552o.adn;
import com.google.common.p4552o.ado;
import com.google.common.p4552o.p4563i.C59899bh;
import com.google.common.p4552o.p4563i.C59900bi;
import com.google.common.p4552o.p4563i.C59928cj;
import com.google.common.p4552o.p4563i.C59930cl;
import dagger.hilt.p5299a.C68288b;
import dagger.p5294a.C68225k;
import java.util.Locale;
import org.chromium.net.NetError;

/* renamed from: com.google.android.libraries.lens.view.onboarding.ai */
/* compiled from: PG */
public final class C27476ai extends C27503bi implements C47231d, C68288b, C47200b, C47233b, C47570bu {

    /* renamed from: a */
    private C27479al f75133a;

    /* renamed from: b */
    private Context f75134b;

    /* renamed from: c */
    private final C2393x f75135c = new C2393x(this);

    /* renamed from: d */
    private final C47515ab f75136d = new C47515ab(this);

    /* renamed from: e */
    private boolean f75137e;

    @Deprecated
    public C27476ai() {
        C19559g.m37304c();
    }

    /* renamed from: a */
    public final C27479al mo17754z() {
        C27479al alVar = this.f75133a;
        if (alVar == null) {
            throw new IllegalStateException("peer() called before initialized.");
        } else if (!this.f75137e) {
            return alVar;
        } else {
            throw new IllegalStateException("peer() called after destroyed.");
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final /* synthetic */ C47247a mo33012b() {
        return new C47242k(this);
    }

    @Deprecated
    /* renamed from: e */
    public final Context mo17857e() {
        if (this.f75134b == null) {
            this.f75134b = new C47236e((Fragment) this, super.getContext());
        }
        return this.f75134b;
    }

    /* renamed from: g */
    public final C47816ey mo17859g() {
        return this.f75136d.f123354b;
    }

    public final Context getContext() {
        if (super.getContext() == null) {
            return null;
        }
        return mo17857e();
    }

    public final C2384o getLifecycle() {
        return this.f75135c;
    }

    /* renamed from: h */
    public final Locale mo17860h() {
        return C47232a.m84025a(this);
    }

    /* renamed from: i */
    public final void mo17861i(C47816ey eyVar, boolean z) {
        this.f75136d.mo51380h(eyVar, z);
    }

    public final void onActivityCreated(Bundle bundle) {
        this.f75136d.mo51381i();
        try {
            super.onActivityCreated(bundle);
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C27475ah.m51159a(th, th);
        }
        throw th;
    }

    public final void onActivityResult(int i, int i2, Intent intent) {
        C47573bx a = this.f75136d.mo51373a("Fragment:onActivityResult");
        try {
            super.onActivityResult(i, i2, intent);
            if (a != null) {
                a.close();
                return;
            }
            return;
        } catch (Throwable th) {
            C27475ah.m51159a(th, th);
        }
        throw th;
    }

    public final void onAttach(Activity activity) {
        this.f75136d.mo51381i();
        try {
            super.onAttach(activity);
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C27475ah.m51159a(th, th);
        }
        throw th;
    }

    public final void onCreate(Bundle bundle) {
        this.f75136d.mo51381i();
        try {
            super.onCreate(bundle);
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C27475ah.m51159a(th, th);
        }
        throw th;
    }

    public final Animation onCreateAnimation(int i, boolean z, int i2) {
        this.f75136d.mo51382j(i, i2);
        try {
            Animation onCreateAnimation = super.onCreateAnimation(i, z, i2);
            C47831fm.m85019n();
            return onCreateAnimation;
        } catch (Throwable th) {
            C27475ah.m51159a(th, th);
        }
        throw th;
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.f75136d.mo51381i();
        try {
            super.onCreateView(layoutInflater, viewGroup, bundle);
            C27479al a = mo17754z();
            LayoutInflater from = LayoutInflater.from(new ContextThemeWrapper(layoutInflater.getContext(), 2132150759));
            ViewGroup viewGroup2 = (ViewGroup) from.inflate(R.layout.onboarding_tos_fragment, viewGroup, false);
            TextView textView = (TextView) viewGroup2.findViewById(R.id.onboarding_tos_pp);
            String string = from.getContext().getString(R.string.lens_onboarding_warm_welcome_tos_links);
            C27477aj ajVar = new C27477aj(a, viewGroup2);
            Spannable spannable = (Spannable) Html.fromHtml(string);
            for (URLSpan uRLSpan : (URLSpan[]) spannable.getSpans(0, spannable.length(), URLSpan.class)) {
                int spanStart = spannable.getSpanStart(uRLSpan);
                int spanEnd = spannable.getSpanEnd(uRLSpan);
                String url = uRLSpan.getURL();
                spannable.removeSpan(uRLSpan);
                spannable.setSpan(new C27478ak(ajVar, url), spanStart, spanEnd, 0);
            }
            textView.setText(spannable);
            textView.setMovementMethod(LinkMovementMethod.getInstance());
            textView.setPaintFlags(textView.getPaintFlags() & -9);
            LottieAnimationView lottieAnimationView = (LottieAnimationView) viewGroup2.findViewById(R.id.onboarding_tos_animation);
            if (a.f75143b.f70642a.f70649b == C25980d.TRANSLATE) {
                lottieAnimationView.mo9698i(R.raw.onboarding_translate);
            } else if (a.f75143b.f70642a.f70649b == C25980d.EDUCATION) {
                lottieAnimationView.mo9698i(R.raw.onboarding_education);
            } else {
                lottieAnimationView.mo9698i(R.raw.onboarding_animation);
            }
            C28306ab abVar = a.f75149h;
            abVar.mo33801b(viewGroup2, abVar.f76990a.mo33805a(C28427h.m53115a(141443)));
            adn adn = (adn) ado.f158388g.createBuilder();
            abb abb = (abb) abc.f158180c.createBuilder();
            abb.copyOnWrite();
            abc abc = (abc) abb.instance;
            abc.f158182a |= 2;
            abc.f158183b = !a.f75146e.mo30536f("android.permission.CAMERA");
            adn.copyOnWrite();
            ado ado = (ado) adn.instance;
            abc abc2 = (abc) abb.build();
            abc2.getClass();
            ado.f158393c = abc2;
            ado.f158391a |= 4;
            C28306ab abVar2 = a.f75149h;
            View findViewById = viewGroup2.findViewById(R.id.onboarding_tos_confirm_button);
            C28313c a2 = a.f75149h.f76990a.mo33805a(C28427h.m53115a(146848));
            a2.mo33858f(new C28353e(C25686g.f69825a, (ado) adn.build()));
            abVar2.mo33801b(findViewById, a2);
            C28448r rVar = a.f75147f;
            C28446p a3 = C28447q.m53152a(126855);
            C59899bh bhVar = (C59899bh) C59900bi.f161890j.createBuilder();
            C59928cj cjVar = (C59928cj) C59930cl.f161974c.createBuilder();
            cjVar.copyOnWrite();
            C59930cl clVar = (C59930cl) cjVar.instance;
            clVar.f161977b = 8;
            clVar.f161976a |= 1;
            bhVar.copyOnWrite();
            C59900bi biVar = (C59900bi) bhVar.instance;
            C59930cl clVar2 = (C59930cl) cjVar.build();
            clVar2.getClass();
            biVar.f161898f = clVar2;
            biVar.f161893a |= 1024;
            a3.f77232a.mo33895b(new C28441k(C25686g.f69826b, (C59900bi) bhVar.build()));
            a3.mo33898b(C45954d.m82060a(a.f75148g.f69824a));
            rVar.mo33855a(a3.mo33897a());
            if (a.f75142a > 0) {
                viewGroup2.setAlpha(0.0f);
                if (a.f75142a > 150) {
                    viewGroup2.animate().alpha(1.0f).setStartDelay((long) (a.f75142a + NetError.ERR_SSL_PINNED_KEY_NOT_IN_CERT_CHAIN)).setDuration(150);
                } else {
                    viewGroup2.animate().alpha(1.0f).setDuration((long) a.f75142a);
                }
            }
            if (viewGroup2 != null) {
                C47831fm.m85019n();
                return viewGroup2;
            }
            throw new NullPointerException("Fragment cannot use Event annotations with null view!");
        } catch (Throwable th) {
            C27475ah.m51159a(th, th);
        }
        throw th;
    }

    public final void onDestroy() {
        C47573bx b = this.f75136d.mo51374b();
        try {
            super.onDestroy();
            b.close();
            return;
        } catch (Throwable th) {
            C27475ah.m51159a(th, th);
        }
        throw th;
    }

    public final void onDestroyView() {
        C47573bx c = this.f75136d.mo51375c();
        try {
            super.onDestroyView();
            c.close();
            return;
        } catch (Throwable th) {
            C27475ah.m51159a(th, th);
        }
        throw th;
    }

    public final void onDetach() {
        C47573bx d = this.f75136d.mo51376d();
        try {
            super.onDetach();
            this.f75137e = true;
            d.close();
            return;
        } catch (Throwable th) {
            C27475ah.m51159a(th, th);
        }
        throw th;
    }

    public final LayoutInflater onGetLayoutInflater(Bundle bundle) {
        this.f75136d.mo51381i();
        try {
            LayoutInflater onGetLayoutInflater = super.onGetLayoutInflater(bundle);
            LayoutInflater cloneInContext = onGetLayoutInflater.cloneInContext(new C47236e((Fragment) this, onGetLayoutInflater));
            C47831fm.m85019n();
            return cloneInContext;
        } catch (Throwable th) {
            C27475ah.m51159a(th, th);
        }
        throw th;
    }

    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        C47573bx a = this.f75136d.mo51373a("Fragment:onOptionsItemSelected");
        try {
            boolean onOptionsItemSelected = super.onOptionsItemSelected(menuItem);
            if (a != null) {
                a.close();
            }
            return onOptionsItemSelected;
        } catch (Throwable th) {
            C27475ah.m51159a(th, th);
        }
        throw th;
    }

    public final void onPause() {
        this.f75136d.mo51381i();
        try {
            super.onPause();
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C27475ah.m51159a(th, th);
        }
        throw th;
    }

    public final void onResume() {
        C47573bx e = this.f75136d.mo51377e();
        try {
            super.onResume();
            e.close();
            return;
        } catch (Throwable th) {
            C27475ah.m51159a(th, th);
        }
        throw th;
    }

    public final void onSaveInstanceState(Bundle bundle) {
        this.f75136d.mo51381i();
        C47831fm.m85019n();
    }

    public final void onStart() {
        this.f75136d.mo51381i();
        try {
            super.onStart();
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C27475ah.m51159a(th, th);
        }
        throw th;
    }

    public final void onStop() {
        this.f75136d.mo51381i();
        try {
            super.onStop();
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C27475ah.m51159a(th, th);
        }
        throw th;
    }

    public final void onViewCreated(View view, Bundle bundle) {
        this.f75136d.mo51381i();
        try {
            C47400m a = C47389c.m84226a(getContext());
            a.f123128b = view;
            a.mo51254d(a.f123128b.findViewById(R.id.onboarding_tos_confirm_button), new C27480am(mo17754z()));
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C27475ah.m51159a(th, th);
        }
        throw th;
    }

    public final void setEnterTransition(Object obj) {
        C47515ab abVar = this.f75136d;
        if (abVar != null) {
            abVar.mo51379g(true);
        }
        super.setEnterTransition(obj);
    }

    public final void setExitTransition(Object obj) {
        C47515ab abVar = this.f75136d;
        if (abVar != null) {
            abVar.mo51379g(true);
        }
        super.setExitTransition(obj);
    }

    public final void setReenterTransition(Object obj) {
        C47515ab abVar = this.f75136d;
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
        C47515ab abVar = this.f75136d;
        if (abVar != null) {
            abVar.mo51379g(true);
        }
        super.setReturnTransition(obj);
    }

    public final void setSharedElementEnterTransition(Object obj) {
        C47515ab abVar = this.f75136d;
        if (abVar != null) {
            abVar.mo51379g(true);
        }
        super.setSharedElementEnterTransition(obj);
    }

    public final void setSharedElementReturnTransition(Object obj) {
        C47515ab abVar = this.f75136d;
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
        this.f75136d.mo51381i();
        try {
            if (!this.f75137e) {
                super.onAttach(context);
                if (this.f75133a == null) {
                    Object jN = mo33043d().mo17653jN();
                    String b = C47260e.m84065b(((C74176nj) jN).mo69504b());
                    C68225k.m98532d(b);
                    this.f75133a = new C27479al(b, (C25989d) ((C74176nj) jN).f206836d.f205212G.mo17428b(), (C25537t) ((C74176nj) jN).f206836d.f205273ao.mo17428b(), (C28443m) ((C74176nj) jN).f206677a.a.f202879fR.mo17428b(), (C25504aj) ((C74176nj) jN).f206836d.f205220O.mo17428b(), (C28448r) ((C74176nj) jN).f206677a.b.f200191et.mo17428b(), (C25684e) ((C74176nj) jN).f206836d.f205219N.mo17428b(), (C28306ab) ((C74176nj) jN).f206677a.a.f202880fS.mo17428b());
                    super.getLifecycle().mo5790b(new TracedFragmentLifecycle(this.f75136d, this.f75135c));
                }
                Fragment parentFragment = getParentFragment();
                if (parentFragment instanceof C47570bu) {
                    C47515ab abVar = this.f75136d;
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
                C27475ah.m51159a(th, th2);
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
