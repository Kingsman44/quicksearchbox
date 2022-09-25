package com.google.android.apps.search.googleapp.googleappbrowser.p10305g;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.p031v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CheckedTextView;
import androidx.lifecycle.C2384o;
import androidx.lifecycle.C2393x;
import com.google.android.apps.gsa.binaries.satin.app.C74176nj;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.logging.p2185ve.C28306ab;
import com.google.android.libraries.logging.p2185ve.C28443m;
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
import com.google.apps.tiktok.tracing.C47515ab;
import com.google.apps.tiktok.tracing.C47570bu;
import com.google.apps.tiktok.tracing.C47573bx;
import com.google.apps.tiktok.tracing.C47591co;
import com.google.apps.tiktok.tracing.C47770dh;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.apps.tiktok.tracing.C47816ey;
import com.google.apps.tiktok.tracing.C47831fm;
import dagger.hilt.p5299a.C68288b;
import dagger.p5294a.C68221g;
import java.util.Locale;

/* renamed from: com.google.android.apps.search.googleapp.googleappbrowser.g.v */
/* compiled from: PG */
public final class C136005v extends C135981ba implements C47231d, C68288b, C47200b, C47233b, C47570bu {

    /* renamed from: a */
    private C136009z f370406a;

    /* renamed from: c */
    private Context f370407c;

    /* renamed from: d */
    private final C2393x f370408d = new C2393x(this);

    /* renamed from: e */
    private boolean f370409e;

    @Deprecated
    public C136005v() {
        C19559g.m37304c();
    }

    /* renamed from: a */
    public final C136009z mo17754z() {
        C136009z zVar = this.f370406a;
        if (zVar == null) {
            throw new IllegalStateException("peer() called before initialized.");
        } else if (!this.f370409e) {
            return zVar;
        } else {
            throw new IllegalStateException("peer() called after destroyed.");
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final /* synthetic */ C47247a mo112663b() {
        return new C47242k(this);
    }

    @Deprecated
    /* renamed from: e */
    public final Context mo17857e() {
        if (this.f370407c == null) {
            this.f370407c = new C47236e((Fragment) this, super.getContext());
        }
        return this.f370407c;
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
        return this.f370408d;
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
            C136004u.m220808a(th, th);
        }
        throw th;
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.f122869b.mo51381i();
        try {
            mo51119t(layoutInflater, viewGroup, bundle);
            C136009z a = mo17754z();
            View inflate = layoutInflater.inflate(R.layout.googleapp_browser_settings_clear_browsing_data_fragment, viewGroup, false);
            a.mo112681a(inflate, 149933);
            CheckedTextView checkedTextView = (CheckedTextView) inflate.findViewById(R.id.googleapp_browser_setting_clear_data);
            a.mo112681a(checkedTextView, 149934);
            checkedTextView.setOnClickListener(new C47591co(a.f370416d, "Clear data checkbox clicked", new C136006w(a)));
            CheckedTextView checkedTextView2 = (CheckedTextView) inflate.findViewById(R.id.googleapp_browser_setting_clear_cache);
            a.mo112681a(checkedTextView2, 149936);
            checkedTextView2.setOnClickListener(new C47591co(a.f370416d, "Clear cache checkbox clicked", new C136007x(a)));
            Button button = (Button) inflate.findViewById(R.id.googleapp_browser_settings_cleardata_button);
            a.mo112681a(button, 149938);
            button.setOnClickListener(new C47591co(a.f370416d, "Clear button clicked", new C136008y(a)));
            C47831fm.m85019n();
            return inflate;
        } catch (Throwable th) {
            C136004u.m220808a(th, th);
        }
        throw th;
    }

    public final void onDetach() {
        C47573bx d = this.f122869b.mo51376d();
        try {
            mo51114o();
            this.f370409e = true;
            d.close();
            return;
        } catch (Throwable th) {
            C136004u.m220808a(th, th);
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
            C136004u.m220808a(th, th);
        }
        throw th;
    }

    public final void onViewStateRestored(Bundle bundle) {
        super.onViewStateRestored(bundle);
        mo17754z().mo112683c();
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
            if (!this.f370409e) {
                super.onAttach(context);
                if (this.f370406a == null) {
                    Object jN = mo112664d().mo17653jN();
                    this.f370406a = new C136009z((Fragment) ((C68221g) ((C74176nj) jN).f206889e).f184583a, (AccountId) ((C74176nj) jN).f206730b.f198239e.mo17428b(), (C28306ab) ((C74176nj) jN).f206677a.a.f202880fS.mo17428b(), (C28443m) ((C74176nj) jN).f206677a.a.f202879fR.mo17428b(), (C47770dh) ((C74176nj) jN).f206730b.f198663m.mo17428b());
                    super.getLifecycle().mo5790b(new TracedFragmentLifecycle(this.f122869b, this.f370408d));
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
                C136004u.m220808a(th, th2);
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
