package com.google.android.libraries.assistant.auto.tng.morris.onboarding;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.p031v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.lifecycle.C2384o;
import androidx.lifecycle.C2393x;
import com.google.android.apps.gsa.binaries.satin.app.C74178nm;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.logging.p2185ve.C28443m;
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
import com.google.apps.tiktok.p3674l.p3679c.C47400m;
import com.google.apps.tiktok.tracing.C47515ab;
import com.google.apps.tiktok.tracing.C47570bu;
import com.google.apps.tiktok.tracing.C47573bx;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.apps.tiktok.tracing.C47816ey;
import com.google.apps.tiktok.tracing.C47831fm;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import dagger.hilt.android.internal.managers.C68324h;
import dagger.hilt.p5299a.C68288b;
import dagger.p5294a.C68225k;
import java.util.Locale;

/* renamed from: com.google.android.libraries.assistant.auto.tng.morris.onboarding.bb */
/* compiled from: PG */
public final class C15421bb extends C15397ae implements C47231d, C68288b, C47200b, C47233b, C47570bu {

    /* renamed from: a */
    private C15425bf f46265a;

    /* renamed from: c */
    private Context f46266c;

    /* renamed from: d */
    private final C2393x f46267d = new C2393x(this);

    /* renamed from: e */
    private boolean f46268e;

    @Deprecated
    public C15421bb() {
        C19559g.m37304c();
    }

    /* renamed from: f */
    static C15421bb m32109f(String str) {
        C15421bb bbVar = new C15421bb();
        C68324h.m98669f(bbVar);
        C47243l.m84040b(bbVar, str);
        return bbVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final /* synthetic */ C68324h mo22306b() {
        return new C47243l(this);
    }

    @Deprecated
    /* renamed from: e */
    public final Context mo17857e() {
        if (this.f46266c == null) {
            this.f46266c = new C47236e((Fragment) this, super.getContext());
        }
        return this.f46266c;
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
        return this.f46267d;
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
    public final C15425bf mo17754z() {
        C15425bf bfVar = this.f46265a;
        if (bfVar == null) {
            throw new IllegalStateException("peer() called before initialized.");
        } else if (!this.f46268e) {
            return bfVar;
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
            C15420ba.m32108a(th, th);
        }
        throw th;
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.f122869b.mo51381i();
        try {
            mo51119t(layoutInflater, viewGroup, bundle);
            C15425bf j = mo17754z();
            C58976aa aaVar = C58975e.f156826a;
            View inflate = layoutInflater.inflate(R.layout.morris_try_navigation_fragment, viewGroup, false);
            if ("gmm_dialog".equals(j.f46275a)) {
                ((TextView) inflate.findViewById(R.id.try_nav_title)).setText(R.string.try_navigation_title_gmm_entry_point);
            }
            if (!"notification_opted_in".equals(j.f46275a)) {
                LinearLayout linearLayout = (LinearLayout) inflate.findViewById(R.id.bottom_buttons_layout);
                Button button = (Button) layoutInflater.inflate(R.layout.got_it_button, linearLayout, false);
                if ("gmm_dialog".equals(j.f46275a)) {
                    button.setText(R.string.try_it_out_button_text);
                } else {
                    button.setText(R.string.try_nav_opted_in_button_text);
                }
                j.f46276b.mo51253b(button, new C15422bc(j, button));
                j.f46277c.mo21444a(button, 112131);
                Button button2 = (Button) layoutInflater.inflate(R.layout.not_now_button, linearLayout, false);
                j.f46276b.mo51253b(button2, new C15423bd(j, button2));
                j.f46277c.mo21444a(button2, 112132);
                linearLayout.addView(button);
                linearLayout.addView(button2);
            } else {
                LinearLayout linearLayout2 = (LinearLayout) inflate.findViewById(R.id.bottom_buttons_layout);
                Button button3 = (Button) layoutInflater.inflate(R.layout.got_it_button, linearLayout2, false);
                j.f46276b.mo51253b(button3, new C15424be(j, button3));
                linearLayout2.addView(button3);
            }
            j.f46277c.mo21444a(inflate, 111979);
            C47831fm.m85019n();
            return inflate;
        } catch (Throwable th) {
            C15420ba.m32108a(th, th);
        }
        throw th;
    }

    public final void onDetach() {
        C47573bx d = this.f122869b.mo51376d();
        try {
            mo51114o();
            this.f46268e = true;
            d.close();
            return;
        } catch (Throwable th) {
            C15420ba.m32108a(th, th);
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
            C15420ba.m32108a(th, th);
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
            if (!this.f46268e) {
                super.onAttach(context);
                if (this.f46265a == null) {
                    Object jN = mo22305a().mo17653jN();
                    String b = C47260e.m84065b(((C74178nm) jN).mo70044a());
                    C68225k.m98532d(b);
                    this.f46265a = new C15425bf(b, (C47400m) ((C74178nm) jN).f207130a.d.f201806g.mo17428b(), ((C74178nm) jN).f207130a.a.mo68330fc(), (C28443m) ((C74178nm) jN).f207130a.a.f202879fR.mo17428b());
                    super.getLifecycle().mo5790b(new TracedFragmentLifecycle(this.f122869b, this.f46267d));
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
                C15420ba.m32108a(th, th2);
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
