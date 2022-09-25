package com.google.android.apps.search.assistant.surfaces.voice.p9721o.p9724c.p9726b;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.support.p031v4.app.C0154a;
import android.support.p031v4.app.Fragment;
import android.support.p031v4.app.FragmentManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import androidx.core.p098j.C2043bi;
import androidx.core.p098j.p099a.C1988h;
import androidx.lifecycle.C2384o;
import androidx.lifecycle.C2393x;
import com.google.android.apps.search.assistant.surfaces.voice.p9721o.p9724c.p9728d.C128543h;
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
import com.google.apps.tiktok.p3674l.p3679c.C47393f;
import com.google.apps.tiktok.tracing.C47515ab;
import com.google.apps.tiktok.tracing.C47570bu;
import com.google.apps.tiktok.tracing.C47573bx;
import com.google.apps.tiktok.tracing.C47586cj;
import com.google.apps.tiktok.tracing.C47591co;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.apps.tiktok.tracing.C47816ey;
import com.google.apps.tiktok.tracing.C47831fm;
import dagger.hilt.android.internal.managers.C68324h;
import dagger.hilt.p5299a.C68288b;
import java.util.Locale;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.o.c.b.y */
/* compiled from: PG */
public final class C128533y extends C128512d implements C47231d, C68288b, C47200b, C47233b, C47570bu {

    /* renamed from: a */
    private C128483ao f353440a;

    /* renamed from: c */
    private Context f353441c;

    /* renamed from: d */
    private final C2393x f353442d = new C2393x(this);

    /* renamed from: e */
    private boolean f353443e;

    @Deprecated
    public C128533y() {
        C19559g.m37304c();
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final /* synthetic */ C47222f mo108494b() {
        return C47244m.m84042d(this);
    }

    @Deprecated
    /* renamed from: e */
    public final Context mo17857e() {
        if (this.f353441c == null) {
            this.f353441c = new C47236e((Fragment) this, super.getContext());
        }
        return this.f353441c;
    }

    /* renamed from: f */
    public final C128483ao mo17754z() {
        C128483ao aoVar = this.f353440a;
        if (aoVar == null) {
            throw new IllegalStateException("peer() called before initialized.");
        } else if (!this.f353443e) {
            return aoVar;
        } else {
            throw new IllegalStateException("peer() called after destroyed.");
        }
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
        return this.f353442d;
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
            C128532x.m209774a(th, th);
        }
        throw th;
    }

    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        C128483ao f = mo17754z();
        C69664n.m101061g(configuration, "newConfig");
        C128543h hVar = (C128543h) f.f353358k.get();
        C69664n.m101060f(hVar, "data");
        if (C128495b.m209692a(hVar)) {
            f.mo108467f(hVar, -2, C128484ap.m209673b(configuration));
        }
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.f122869b.mo51381i();
        try {
            mo51119t(layoutInflater, viewGroup, bundle);
            C128483ao f = mo17754z();
            C69664n.m101061g(layoutInflater, "inflater");
            View inflate = C128526r.m209763a(layoutInflater).inflate(R.layout.assistant_guacamole_fragment, viewGroup, false);
            C69664n.m101059e(inflate, "null cannot be cast to non-null type android.widget.RelativeLayout");
            RelativeLayout relativeLayout = (RelativeLayout) inflate;
            FragmentManager childFragmentManager = f.f353352e.getChildFragmentManager();
            C69664n.m101060f(childFragmentManager, "fragment.childFragmentManager");
            C0154a aVar = new C0154a(childFragmentManager);
            aVar.mo511h(R.id.assistant_guacamole_pill_container, C128489au.m209678f(), (String) null, 1);
            C128496ba baVar = new C128496ba();
            C68324h.m98669f(baVar);
            aVar.mo511h(R.id.assistant_guacamole_popup_container, baVar, (String) null, 1);
            aVar.mo509f();
            C128483ao.m209657n(relativeLayout, R.id.assistant_guacamole_pill_container);
            C128483ao.m209657n(relativeLayout, R.id.assistant_guacamole_popup_container);
            relativeLayout.addOnLayoutChangeListener(new C128475ag(f));
            f.f353351d.mo50707a(f.f353350c.mo108455a(), new C128476ah(f, relativeLayout));
            if (relativeLayout != null) {
                C47831fm.m85019n();
                return relativeLayout;
            }
            throw new NullPointerException("Fragment cannot use Event annotations with null view!");
        } catch (Throwable th) {
            C128532x.m209774a(th, th);
        }
        throw th;
    }

    public final void onDetach() {
        C47573bx d = this.f122869b.mo51376d();
        try {
            mo51114o();
            this.f353443e = true;
            d.close();
            return;
        } catch (Throwable th) {
            C128532x.m209774a(th, th);
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
            C128532x.m209774a(th, th);
        }
        throw th;
    }

    public final void onViewCreated(View view, Bundle bundle) {
        this.f122869b.mo51381i();
        try {
            C47389c.m84226a(getContext()).f123128b = view;
            C47393f.m84233d(this, C128497bb.class, new C128485aq(mo17754z()));
            this.f54442o.mo24720k(bundle);
            C128483ao f = mo17754z();
            C69664n.m101061g(view, "containerView");
            f.mo108465d().setOnClickListener(new C47591co(f.f353349b, "guacamolePopupUiClick", new C128477ai(f)));
            f.mo108464c().setOnTouchListener(new C47586cj(f.f353349b, new C128524p(new C128478aj(f, view), new C128479ak(f), new C128480al(f), new C128481am(f), new C128482an(f)), "guacamolePillUiTouch"));
            int dimensionPixelOffset = f.mo108464c().getResources().getDimensionPixelOffset(R.dimen.assistant_guacamole_pill_le_padding_top_bottom);
            int dimensionPixelOffset2 = f.mo108464c().getResources().getDimensionPixelOffset(R.dimen.assistant_guacamole_pill_le_padding_left_right);
            int dimensionPixelOffset3 = f.mo108464c().getResources().getDimensionPixelOffset(R.dimen.assistant_guacamole_pill_padding_top_bottom);
            int dimensionPixelOffset4 = f.mo108464c().getResources().getDimensionPixelOffset(R.dimen.assistant_guacamole_pill_padding_left_right);
            if (!f.f353353f && !f.f353354g) {
                if (!f.f353355h) {
                    f.mo108464c().setPadding(dimensionPixelOffset4, dimensionPixelOffset3, dimensionPixelOffset4, dimensionPixelOffset3);
                    C2043bi.m5523Q(f.mo108464c(), C1988h.f5905c, (CharSequence) null, new C128474af(f));
                    f.mo108468g();
                    f.mo108469h();
                    C47831fm.m85019n();
                    return;
                }
            }
            f.mo108464c().setPadding(dimensionPixelOffset2, dimensionPixelOffset, dimensionPixelOffset2, dimensionPixelOffset);
            C2043bi.m5523Q(f.mo108464c(), C1988h.f5905c, (CharSequence) null, new C128474af(f));
            f.mo108468g();
            f.mo108469h();
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C128532x.m209774a(th, th);
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
            if (!this.f353443e) {
                super.onAttach(context);
                if (this.f353440a == null) {
                    this.f353440a = ((C128486ar) mo108493a().mo17653jN()).mo108474G();
                    super.getLifecycle().mo5790b(new TracedFragmentLifecycle(this.f122869b, this.f353442d));
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
                C128532x.m209774a(th, th2);
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
