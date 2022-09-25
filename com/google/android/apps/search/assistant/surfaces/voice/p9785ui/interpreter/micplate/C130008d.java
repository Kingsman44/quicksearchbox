package com.google.android.apps.search.assistant.surfaces.voice.p9785ui.interpreter.micplate;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.p031v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.C2384o;
import androidx.lifecycle.C2393x;
import com.google.android.apps.search.assistant.surfaces.voice.p9785ui.interpreter.p9856a.C129854a;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.assistant.p1614t.C19391a;
import com.google.android.libraries.p1623at.p1632e.C19559g;
import com.google.android.material.p3505b.C44534d;
import com.google.apps.tiktok.inject.C47200b;
import com.google.apps.tiktok.inject.C47214c;
import com.google.apps.tiktok.inject.C47231d;
import com.google.apps.tiktok.inject.baseclasses.TracedFragmentLifecycle;
import com.google.apps.tiktok.inject.p3657c.p3658a.C47222f;
import com.google.apps.tiktok.inject.p3659d.C47232a;
import com.google.apps.tiktok.inject.p3659d.C47233b;
import com.google.apps.tiktok.inject.p3659d.C47236e;
import com.google.apps.tiktok.inject.p3659d.C47244m;
import com.google.apps.tiktok.tracing.C47515ab;
import com.google.apps.tiktok.tracing.C47570bu;
import com.google.apps.tiktok.tracing.C47573bx;
import com.google.apps.tiktok.tracing.C47591co;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.apps.tiktok.tracing.C47816ey;
import com.google.apps.tiktok.tracing.C47831fm;
import dagger.hilt.p5299a.C68288b;
import java.util.Locale;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.ui.interpreter.micplate.d */
/* compiled from: PG */
public final class C130008d extends C130022r implements C47231d, C68288b, C47200b, C47233b, C47570bu {

    /* renamed from: a */
    private C130019o f356529a;

    /* renamed from: c */
    private Context f356530c;

    /* renamed from: d */
    private final C2393x f356531d = new C2393x(this);

    /* renamed from: e */
    private boolean f356532e;

    @Deprecated
    public C130008d() {
        C19559g.m37304c();
    }

    /* renamed from: a */
    public final C130019o mo17754z() {
        C130019o oVar = this.f356529a;
        if (oVar == null) {
            throw new IllegalStateException("peer() called before initialized.");
        } else if (!this.f356532e) {
            return oVar;
        } else {
            throw new IllegalStateException("peer() called after destroyed.");
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final /* synthetic */ C47222f mo109398b() {
        return C47244m.m84043e(this);
    }

    @Deprecated
    /* renamed from: e */
    public final Context mo17857e() {
        if (this.f356530c == null) {
            this.f356530c = new C47236e((Fragment) this, super.getContext());
        }
        return this.f356530c;
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
        return this.f356531d;
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
            C130007c.m212247a(th, th);
        }
        throw th;
    }

    public final void onCreate(Bundle bundle) {
        this.f122869b.mo51381i();
        try {
            mo51111l(bundle);
            C130019o a = mo17754z();
            a.f356547e.mo50828h(R.id.assistant_interpreter_local_subscription, new C129854a(a.f356558p), new C130010f(a));
            a.f356545c.mo50429i(a.f356554l);
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C130007c.m212247a(th, th);
        }
        throw th;
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.f122869b.mo51381i();
        try {
            mo51119t(layoutInflater, viewGroup, bundle);
            C130019o a = mo17754z();
            C69664n.m101061g(layoutInflater, "inflater");
            View inflate = layoutInflater.inflate(R.layout.assistant_interpreter_mic_plate, viewGroup, false);
            a.f356550h.mo108810b(77075, inflate.findViewById(R.id.assistant_interpreter_auto_mic_button));
            a.f356550h.mo108810b(77076, inflate.findViewById(R.id.assistant_interpreter_source_mic_button));
            a.f356550h.mo108810b(77077, inflate.findViewById(R.id.assistant_interpreter_target_mic_button));
            a.f356550h.mo108810b(77078, inflate.findViewById(R.id.assistant_interpreter_source_keyboard_button));
            a.f356550h.mo108810b(77079, inflate.findViewById(R.id.assistant_interpreter_target_keyboard_button));
            C69664n.m101060f(inflate, "view");
            C47831fm.m85019n();
            return inflate;
        } catch (Throwable th) {
            C130007c.m212247a(th, th);
        }
        throw th;
    }

    public final void onDestroy() {
        C47573bx b = this.f122869b.mo51374b();
        try {
            mo51112m();
            mo17754z().f356557o = true;
            b.close();
            return;
        } catch (Throwable th) {
            C130007c.m212247a(th, th);
        }
        throw th;
    }

    public final void onDetach() {
        C47573bx d = this.f122869b.mo51376d();
        try {
            mo51114o();
            this.f356532e = true;
            d.close();
            return;
        } catch (Throwable th) {
            C130007c.m212247a(th, th);
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
            C130007c.m212247a(th, th);
        }
        throw th;
    }

    public final void onViewCreated(View view, Bundle bundle) {
        this.f122869b.mo51381i();
        try {
            this.f54442o.mo24720k(bundle);
            C130019o a = mo17754z();
            a.mo109415g().mo109394c(new C47591co(a.f356544b, "InterpreterMicPlateFragmentPeer.autoMicButton", new C130011g(a)));
            a.mo109416h().mo109394c(new C47591co(a.f356544b, "InterpreterMicPlateFragmentPeer.sourceManualMicButton", new C130012h(a)));
            a.mo109417i().mo109394c(new C47591co(a.f356544b, "InterpreterMicPlateFragmentPeer.targetManualMicButton", new C130013i(a)));
            a.mo109413e().mo109391c(new C47591co(a.f356544b, "InterpreterMicPlateFragmentPeer.sourceKeyboardMicButton", new C130014j(a)));
            a.mo109414f().mo109391c(new C47591co(a.f356544b, "InterpreterMicPlateFragmentPeer.targetKeyboardMicButton", new C130015k(a)));
            Context c = C44534d.m78716c(a.f356546d.requireContext());
            C69664n.m101060f(c, "wrapContextIfAvailable(fragment.requireContext())");
            a.mo109415g().mo109392a(C19391a.m36980a(c, R.attr.colorPrimary), C19391a.m36980a(c, R.attr.colorOnPrimary));
            a.mo109416h().mo109392a(C19391a.m36980a(c, R.attr.colorPrimary), C19391a.m36980a(c, R.attr.colorOnPrimary));
            a.mo109417i().mo109392a(C19391a.m36980a(c, R.attr.colorSecondary), C19391a.m36980a(c, R.attr.colorOnSecondary));
            a.mo109413e().mo109389a(C19391a.m36980a(c, R.attr.colorPrimary), C19391a.m36980a(c, R.attr.colorOnPrimary));
            a.mo109414f().mo109389a(C19391a.m36980a(c, R.attr.colorSecondary), C19391a.m36980a(c, R.attr.colorOnSecondary));
            a.mo109412d().mo104344d(a.f356552j, a.f356553k);
            a.mo109412d().setOnClickListener(new C47591co(a.f356544b, "InterpreterMicPlateFragmentPeer.logoView", new C130016l(a)));
            a.mo109412d().mo104346f(a.f356551i);
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C130007c.m212247a(th, th);
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
            if (!this.f356532e) {
                super.onAttach(context);
                if (this.f356529a == null) {
                    this.f356529a = ((C130020p) mo109423d().mo17653jN()).mo109421aN();
                    super.getLifecycle().mo5790b(new TracedFragmentLifecycle(this.f122869b, this.f356531d));
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
                C130007c.m212247a(th, th2);
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
