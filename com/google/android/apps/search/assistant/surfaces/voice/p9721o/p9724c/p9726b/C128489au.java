package com.google.android.apps.search.assistant.surfaces.voice.p9721o.p9724c.p9726b;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.p031v4.app.C0154a;
import android.support.p031v4.app.Fragment;
import android.support.p031v4.app.FragmentManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.lifecycle.C2384o;
import androidx.lifecycle.C2393x;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.assistant.p1614t.C19391a;
import com.google.android.libraries.p1623at.p1632e.C19559g;
import com.google.android.material.textview.MaterialTextView;
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
import com.google.apps.tiktok.tracing.C47810es;
import com.google.apps.tiktok.tracing.C47816ey;
import com.google.apps.tiktok.tracing.C47831fm;
import dagger.hilt.android.internal.managers.C68324h;
import dagger.hilt.p5299a.C68288b;
import java.util.Locale;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.o.c.b.au */
/* compiled from: PG */
public final class C128489au extends C128513e implements C47231d, C68288b, C47200b, C47233b, C47570bu {

    /* renamed from: a */
    private C128491aw f353362a;

    /* renamed from: c */
    private Context f353363c;

    /* renamed from: d */
    private final C2393x f353364d = new C2393x(this);

    /* renamed from: e */
    private boolean f353365e;

    @Deprecated
    public C128489au() {
        C19559g.m37304c();
    }

    /* renamed from: f */
    static C128489au m209678f() {
        C128489au auVar = new C128489au();
        C68324h.m98669f(auVar);
        return auVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final /* synthetic */ C47222f mo108476b() {
        return C47244m.m84042d(this);
    }

    @Deprecated
    /* renamed from: e */
    public final Context mo17857e() {
        if (this.f353363c == null) {
            this.f353363c = new C47236e((Fragment) this, super.getContext());
        }
        return this.f353363c;
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
        return this.f353364d;
    }

    /* renamed from: h */
    public final Locale mo17860h() {
        return C47232a.m84025a(this);
    }

    /* renamed from: i */
    public final void mo17861i(C47816ey eyVar, boolean z) {
        this.f122869b.mo51380h(eyVar, z);
    }

    /* renamed from: j */
    public final C128491aw mo17754z() {
        C128491aw awVar = this.f353362a;
        if (awVar == null) {
            throw new IllegalStateException("peer() called before initialized.");
        } else if (!this.f353365e) {
            return awVar;
        } else {
            throw new IllegalStateException("peer() called after destroyed.");
        }
    }

    public final void onAttach(Activity activity) {
        this.f122869b.mo51381i();
        try {
            super.onAttach(activity);
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C128488at.m209677a(th, th);
        }
        throw th;
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.f122869b.mo51381i();
        try {
            mo51119t(layoutInflater, viewGroup, bundle);
            C128491aw j = mo17754z();
            C69664n.m101061g(layoutInflater, "inflater");
            View inflate = C128526r.m209763a(layoutInflater).inflate(R.layout.assistant_guacamole_pill_fragment, viewGroup, false);
            FragmentManager childFragmentManager = j.f353372d.getChildFragmentManager();
            C69664n.m101060f(childFragmentManager, "warmActionsPillFragment.childFragmentManager");
            C0154a aVar = new C0154a(childFragmentManager);
            C128506bk bkVar = new C128506bk();
            C68324h.m98669f(bkVar);
            aVar.mo511h(R.id.assistant_guacamole_pill_wiggle_container, bkVar, (String) null, 1);
            aVar.mo509f();
            View requireViewById = inflate.requireViewById(R.id.assistant_guacamole_pill_prompt);
            C69664n.m101060f(requireViewById, "view.requireViewById<Mat…nt_guacamole_pill_prompt)");
            MaterialTextView materialTextView = (MaterialTextView) requireViewById;
            View requireViewById2 = inflate.requireViewById(R.id.assistant_guacamole_pill_phrase);
            C69664n.m101060f(requireViewById2, "view.requireViewById<Mat…nt_guacamole_pill_phrase)");
            MaterialTextView materialTextView2 = (MaterialTextView) requireViewById2;
            View requireViewById3 = inflate.requireViewById(R.id.assistant_guacamole_pill_phrase_start_quote);
            C69664n.m101060f(requireViewById3, "view.requireViewById<Mat…_pill_phrase_start_quote)");
            MaterialTextView materialTextView3 = (MaterialTextView) requireViewById3;
            View requireViewById4 = inflate.requireViewById(R.id.assistant_guacamole_pill_phrase_end_quote);
            C69664n.m101060f(requireViewById4, "view.requireViewById<Mat…le_pill_phrase_end_quote)");
            MaterialTextView materialTextView4 = (MaterialTextView) requireViewById4;
            if (j.f353373e || j.f353374f || j.f353376h) {
                int a = C19391a.m36980a(inflate.getContext(), R.attr.colorPrimary);
                materialTextView2.setTextColor(a);
                materialTextView3.setTextColor(a);
                materialTextView4.setTextColor(a);
            }
            if (j.f353373e || j.f353374f || j.f353375g || j.f353376h) {
                ((FrameLayout) inflate.requireViewById(R.id.assistant_guacamole_pill_wiggle_container)).setVisibility(8);
            }
            if (j.f353376h) {
                materialTextView.setVisibility(8);
            }
            if (j.f353375g) {
                materialTextView.setTextColor(-16777216);
                materialTextView2.setTextColor(-16777216);
                materialTextView3.setTextColor(-16777216);
                materialTextView4.setTextColor(-16777216);
            }
            j.f353370b.mo50707a(j.f353371c.mo108455a(), new C128490av(j, materialTextView2, viewGroup));
            C69664n.m101060f(inflate, "view");
            C47831fm.m85019n();
            return inflate;
        } catch (Throwable th) {
            C128488at.m209677a(th, th);
        }
        throw th;
    }

    public final void onDetach() {
        C47573bx d = this.f122869b.mo51376d();
        try {
            mo51114o();
            this.f353365e = true;
            d.close();
            return;
        } catch (Throwable th) {
            C128488at.m209677a(th, th);
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
            C128488at.m209677a(th, th);
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
            if (!this.f353365e) {
                super.onAttach(context);
                if (this.f353362a == null) {
                    this.f353362a = ((C128492ax) mo108496a().mo17653jN()).mo108478H();
                    super.getLifecycle().mo5790b(new TracedFragmentLifecycle(this.f122869b, this.f353364d));
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
                C128488at.m209677a(th, th2);
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
