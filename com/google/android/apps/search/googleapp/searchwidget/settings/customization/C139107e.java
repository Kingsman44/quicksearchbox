package com.google.android.apps.search.googleapp.searchwidget.settings.customization;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.p031v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import androidx.lifecycle.C2384o;
import androidx.lifecycle.C2393x;
import com.google.android.apps.gsa.binaries.satin.app.C74176nj;
import com.google.android.apps.search.googleapp.searchwidget.settings.p10481a.C139045c;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.logging.p2185ve.C28306ab;
import com.google.android.libraries.logging.p2185ve.C28427h;
import com.google.android.libraries.p1623at.p1632e.C19559g;
import com.google.apps.tiktok.account.AccountId;
import com.google.apps.tiktok.inject.C47200b;
import com.google.apps.tiktok.inject.C47214c;
import com.google.apps.tiktok.inject.C47231d;
import com.google.apps.tiktok.inject.baseclasses.TracedFragmentLifecycle;
import com.google.apps.tiktok.inject.p3659d.C47232a;
import com.google.apps.tiktok.inject.p3659d.C47233b;
import com.google.apps.tiktok.inject.p3659d.C47236e;
import com.google.apps.tiktok.inject.p3659d.C47242k;
import com.google.apps.tiktok.inject.p3660e.p3661a.C47247a;
import com.google.apps.tiktok.p3674l.p3679c.C47389c;
import com.google.apps.tiktok.p3674l.p3679c.C47393f;
import com.google.apps.tiktok.p3674l.p3679c.C47400m;
import com.google.apps.tiktok.tracing.C47515ab;
import com.google.apps.tiktok.tracing.C47570bu;
import com.google.apps.tiktok.tracing.C47573bx;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.apps.tiktok.tracing.C47816ey;
import com.google.apps.tiktok.tracing.C47831fm;
import dagger.hilt.p5299a.C68288b;
import dagger.p5294a.C68221g;
import dagger.p5294a.C68225k;
import java.util.Locale;

/* renamed from: com.google.android.apps.search.googleapp.searchwidget.settings.customization.e */
/* compiled from: PG */
public final class C139107e extends C139081bf implements C47231d, C68288b, C47200b, C47233b, C47570bu {

    /* renamed from: a */
    private C139108f f378321a;

    /* renamed from: c */
    private Context f378322c;

    /* renamed from: d */
    private final C2393x f378323d = new C2393x(this);

    /* renamed from: e */
    private boolean f378324e;

    @Deprecated
    public C139107e() {
        C19559g.m37304c();
    }

    /* renamed from: a */
    public final C139108f mo17754z() {
        C139108f fVar = this.f378321a;
        if (fVar == null) {
            throw new IllegalStateException("peer() called before initialized.");
        } else if (!this.f378324e) {
            return fVar;
        } else {
            throw new IllegalStateException("peer() called after destroyed.");
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final /* synthetic */ C47247a mo114697b() {
        return new C47242k(this);
    }

    @Deprecated
    /* renamed from: e */
    public final Context mo17857e() {
        if (this.f378322c == null) {
            this.f378322c = new C47236e((Fragment) this, super.getContext());
        }
        return this.f378322c;
    }

    /* renamed from: g */
    public final C47816ey mo17859g() {
        return this.f122869b.f123354b;
    }

    public final Context getContext() {
        if (super.getContext() == null) {
            return null;
        }
        return mo17857e();
    }

    public final C2384o getLifecycle() {
        return this.f378323d;
    }

    /* renamed from: h */
    public final Locale mo17860h() {
        return C47232a.m84025a(this);
    }

    /* renamed from: i */
    public final void mo17861i(C47816ey eyVar, boolean z) {
        this.f122869b.mo51380h(eyVar, z);
    }

    public final void onAttach(Activity activity) {
        this.f122869b.mo51381i();
        try {
            super.onAttach(activity);
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C139106d.m225958a(th, th);
        }
        throw th;
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.f122869b.mo51381i();
        try {
            mo51119t(layoutInflater, viewGroup, bundle);
            C139108f a = mo17754z();
            View inflate = layoutInflater.inflate(R.layout.googleapp_color_theme_picker, viewGroup, false);
            C28306ab abVar = a.f378327c;
            abVar.mo33801b(inflate, abVar.f76990a.mo33805a(C28427h.m53115a(149054)));
            C139080be beVar = a.f378330f;
            beVar.getClass();
            C139074az azVar = beVar.f378255f;
            if (azVar == null) {
                azVar = C139074az.f378227d;
            }
            C139079bd a2 = C139079bd.m225894a(azVar.f378230b);
            if (a2 == null) {
                a2 = C139079bd.THEME_UNKNOWN;
            }
            C139108f.m225967b(inflate, a2);
            ImageButton a3 = C139108f.m225966a(inflate);
            C139074az azVar2 = a.f378330f.f378255f;
            if (azVar2 == null) {
                azVar2 = C139074az.f378227d;
            }
            a.mo114728d(a3, azVar2.f378231c);
            a.f378328d.mo51252a(inflate.findViewById(R.id.googleapp_color_theme_picker_back_arrow), new C139062an());
            if (inflate != null) {
                C47831fm.m85019n();
                return inflate;
            }
            throw new NullPointerException("Fragment cannot use Event annotations with null view!");
        } catch (Throwable th) {
            C139106d.m225958a(th, th);
        }
        throw th;
    }

    public final void onDetach() {
        C47573bx d = this.f122869b.mo51376d();
        try {
            mo51114o();
            this.f378324e = true;
            d.close();
            return;
        } catch (Throwable th) {
            C139106d.m225958a(th, th);
        }
        throw th;
    }

    public final LayoutInflater onGetLayoutInflater(Bundle bundle) {
        this.f122869b.mo51381i();
        try {
            LayoutInflater onGetLayoutInflater = super.onGetLayoutInflater(bundle);
            LayoutInflater cloneInContext = onGetLayoutInflater.cloneInContext(new C47236e((Fragment) this, onGetLayoutInflater));
            C47831fm.m85019n();
            return cloneInContext;
        } catch (Throwable th) {
            C139106d.m225958a(th, th);
        }
        throw th;
    }

    public final void onStart() {
        this.f122869b.mo51381i();
        try {
            mo51117r();
            C47393f.m84236g(new C139102c("color_picker_tag"), mo17754z().f378325a);
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C139106d.m225958a(th, th);
        }
        throw th;
    }

    public final void onViewCreated(View view, Bundle bundle) {
        this.f122869b.mo51381i();
        try {
            C47400m a = C47389c.m84226a(getContext());
            a.f123128b = view;
            C139108f a2 = mo17754z();
            C47393f.m84233d(this, C139115m.class, new C139109g(a2));
            a.f123128b.findViewById(R.id.googleapp_standard_color_theme).setTag(R.id.tiktok_event_internal_trace, "Standard theme tapped");
            a.mo51254d(a.f123128b.findViewById(R.id.googleapp_standard_color_theme), new C139110h(a2));
            a.f123128b.findViewById(R.id.googleapp_monochrome_light_theme).setTag(R.id.tiktok_event_internal_trace, "Monochrome light theme tapped");
            a.mo51254d(a.f123128b.findViewById(R.id.googleapp_monochrome_light_theme), new C139111i(a2));
            a.f123128b.findViewById(R.id.googleapp_monochrome_dark_theme).setTag(R.id.tiktok_event_internal_trace, "Monochrome dark theme tapped");
            a.mo51254d(a.f123128b.findViewById(R.id.googleapp_monochrome_dark_theme), new C139112j(a2));
            a.f123128b.findViewById(R.id.googleapp_custom_color).setTag(R.id.tiktok_event_internal_trace, "Custom color tapped");
            a.mo51254d(a.f123128b.findViewById(R.id.googleapp_custom_color), new C139113k(a2));
            a.f123128b.findViewById(R.id.googleapp_color_theme_feedback).setTag(R.id.tiktok_event_internal_trace, "Feedback tapped");
            a.mo51254d(a.f123128b.findViewById(R.id.googleapp_color_theme_feedback), new C139114l(a2));
            this.f54442o.mo24720k(bundle);
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C139106d.m225958a(th, th);
        }
        throw th;
    }

    public final void setRetainInstance(boolean z) {
        if (z) {
            throw new IllegalArgumentException("Peered fragments cannot be retained, to avoid memory leaks. If you need a retained fragment, you should subclass Fragment directly. See http://go/tiktok-conformance-violations/FRAGMENT_SET_RETAIN_INSTANCE");
        }
    }

    public final void startActivity(Intent intent) {
        if (C47214c.m83984a(intent, getContext().getApplicationContext())) {
            int i = C47810es.f123822b;
        }
        super.startActivity(intent);
    }

    public final void onAttach(Context context) {
        this.f122869b.mo51381i();
        try {
            if (!this.f378324e) {
                super.onAttach(context);
                if (this.f378321a == null) {
                    Object jN = mo114698d().mo17653jN();
                    Fragment fragment = (Fragment) ((C68221g) ((C74176nj) jN).f206889e).f184583a;
                    if (fragment instanceof C139107e) {
                        C139107e eVar = (C139107e) fragment;
                        C68225k.m98532d(eVar);
                        this.f378321a = new C139108f(eVar, (AccountId) ((C74176nj) jN).f206730b.f198239e.mo17428b(), (C28306ab) ((C74176nj) jN).f206677a.a.f202880fS.mo17428b(), (C139045c) ((C74176nj) jN).f206730b.f198027a.f199498gE.mo17428b(), (C47400m) ((C74176nj) jN).f206730b.f198027a.f199472ff.mo17428b(), new C139093br(((C74176nj) jN).mo69794gY()), ((C74176nj) jN).mo69661dy());
                        super.getLifecycle().mo5790b(new TracedFragmentLifecycle(this.f122869b, this.f378323d));
                    } else {
                        String obj = C139108f.class.toString();
                        String valueOf = String.valueOf(fragment.getClass());
                        throw new IllegalStateException("Attempt to inject a Fragment wrapper of type " + obj + ", but the wrapper available is of type: " + valueOf + ". Does your peer's @Inject constructor reference the wrong wrapper class?");
                    }
                }
                Fragment parentFragment = getParentFragment();
                if (parentFragment instanceof C47570bu) {
                    C47515ab abVar = this.f122869b;
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
                C139106d.m225958a(th, th2);
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
