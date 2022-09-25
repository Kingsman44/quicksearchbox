package com.google.android.apps.search.assistant.surfaces.voice.p9785ui.keyboardinput;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.support.p031v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import androidx.core.p098j.C2043bi;
import androidx.lifecycle.C2384o;
import androidx.lifecycle.C2393x;
import com.google.android.apps.search.assistant.libraries.p8984ui.logoview.LogoView;
import com.google.android.apps.search.assistant.surfaces.voice.p9785ui.response.utils.C130307e;
import com.google.android.apps.search.assistant.surfaces.voice.shared.p9733ui.p9734a.C128567c;
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
import com.google.apps.tiktok.p3674l.p3679c.C47389c;
import com.google.apps.tiktok.p3674l.p3679c.C47400m;
import com.google.apps.tiktok.tracing.C47515ab;
import com.google.apps.tiktok.tracing.C47570bu;
import com.google.apps.tiktok.tracing.C47573bx;
import com.google.apps.tiktok.tracing.C47577ca;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.apps.tiktok.tracing.C47816ey;
import com.google.apps.tiktok.tracing.C47831fm;
import dagger.hilt.p5299a.C68288b;
import java.util.Locale;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.ui.keyboardinput.f */
/* compiled from: PG */
public final class C130096f extends C130083ad implements C47231d, C68288b, C47200b, C47233b, C47570bu {

    /* renamed from: a */
    private C130109s f356728a;

    /* renamed from: c */
    private Context f356729c;

    /* renamed from: d */
    private final C2393x f356730d = new C2393x(this);

    /* renamed from: e */
    private boolean f356731e;

    @Deprecated
    public C130096f() {
        C19559g.m37304c();
    }

    /* renamed from: a */
    public final C130109s mo17754z() {
        C130109s sVar = this.f356728a;
        if (sVar == null) {
            throw new IllegalStateException("peer() called before initialized.");
        } else if (!this.f356731e) {
            return sVar;
        } else {
            throw new IllegalStateException("peer() called after destroyed.");
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final /* synthetic */ C47222f mo109481b() {
        return C47244m.m84043e(this);
    }

    @Deprecated
    /* renamed from: e */
    public final Context mo17857e() {
        if (this.f356729c == null) {
            this.f356729c = new C47236e((Fragment) this, super.getContext());
        }
        return this.f356729c;
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
        return this.f356730d;
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
            C130095e.m212393a(th, th);
        }
        throw th;
    }

    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        mo17754z().mo109502g();
    }

    public final void onCreate(Bundle bundle) {
        this.f122869b.mo51381i();
        try {
            mo51111l(bundle);
            C130109s a = mo17754z();
            a.f356761k.mo109118c();
            a.f356754d.mo50429i(a.f356756f);
            a.f356760j.mo50829i(R.id.assistant_keyboard_input_suggest_local_subscription, new C130084ae(a.f356758h), new C130102l(a), new C130103m(a));
            a.f356760j.mo50828h(R.id.assistant_keyboard_input_highlight_local_subscription, a.f356759i.mo109564a(), new C130104n(a));
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C130095e.m212393a(th, th);
        }
        throw th;
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.f122869b.mo51381i();
        try {
            mo51119t(layoutInflater, viewGroup, bundle);
            mo17754z();
            View inflate = layoutInflater.inflate(R.layout.assistant_keyboard_input_fragment_layout, viewGroup, false);
            if (inflate != null) {
                C47831fm.m85019n();
                return inflate;
            }
            throw new NullPointerException("Fragment cannot use Event annotations with null view!");
        } catch (Throwable th) {
            C130095e.m212393a(th, th);
        }
        throw th;
    }

    public final void onDetach() {
        C47573bx d = this.f122869b.mo51376d();
        try {
            mo51114o();
            this.f356731e = true;
            d.close();
            return;
        } catch (Throwable th) {
            C130095e.m212393a(th, th);
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
            C130095e.m212393a(th, th);
        }
        throw th;
    }

    public final void onViewCreated(View view, Bundle bundle) {
        this.f122869b.mo51381i();
        try {
            C47400m a = C47389c.m84226a(getContext());
            a.f123128b = view;
            C130109s a2 = mo17754z();
            a.mo51254d(a.f123128b.findViewById(R.id.assistant_keyboard_input_clear_button), new C130113v(a2));
            a.mo51254d(a.f123128b.findViewById(R.id.assistant_keyboard_input_mic_button), new C130114w(a2));
            this.f54442o.mo24720k(bundle);
            C130109s a3 = mo17754z();
            LogoView logoView = (LogoView) C2043bi.m5589r(a3.f356752b.requireView(), R.id.assistant_keyboard_input_mic_button);
            ImageView imageView = (ImageView) C2043bi.m5589r(a3.f356752b.requireView(), R.id.assistant_keyboard_input_clear_button);
            EditText a4 = C130109s.m212407a(a3.f356752b);
            a4.requestFocus();
            if (!a4.hasWindowFocus() || !a4.hasFocus()) {
                a4.getViewTreeObserver().addOnWindowFocusChangeListener(new C130108r(a3, a4));
            } else {
                a3.mo109499d(a4);
            }
            logoView.mo104344d((float) a3.f356752b.getResources().getInteger(R.integer.assistant_keyboard_input_logo_view_width), (float) a3.f356752b.getResources().getInteger(R.integer.assistant_keyboard_input_logo_view_height));
            logoView.mo104345e(7, true);
            a4.setOnEditorActionListener(new C47577ca(a3.f356757g, new C130101k(a3, a4), "Clicked EditTextView"));
            a4.addTextChangedListener(new C130105o(a3, logoView, imageView));
            View r = C2043bi.m5589r(view, R.id.assistant_keyboard_container);
            C128567c.m209821d(r, new C130098h(r));
            a3.mo109502g();
            C130109s.m212407a(a3.f356752b).setText(a3.f356763m);
            ((KeyboardInputTextView) a3.f356752b.requireView().findViewById(R.id.assistant_keyboard_input_text)).f356635a = a3.f356767q;
            if (a3.f356762l) {
                C130109s.m212407a(a3.f356752b).setMovementMethod(new C130307e(new C130112u(a3)));
            }
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C130095e.m212393a(th, th);
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
            if (!this.f356731e) {
                super.onAttach(context);
                if (this.f356728a == null) {
                    this.f356728a = ((C130115x) mo109482d().mo17653jN()).mo109507aU();
                    super.getLifecycle().mo5790b(new TracedFragmentLifecycle(this.f122869b, this.f356730d));
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
                C130095e.m212393a(th, th2);
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
