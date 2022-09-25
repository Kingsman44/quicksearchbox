package com.google.android.apps.search.googleapp.stampviewer.preview;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.p031v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.lifecycle.C2384o;
import androidx.lifecycle.C2393x;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.logging.p2185ve.C28427h;
import com.google.android.libraries.p1623at.p1632e.C19559g;
import com.google.apps.tiktok.account.AccountId;
import com.google.apps.tiktok.inject.C47200b;
import com.google.apps.tiktok.inject.C47214c;
import com.google.apps.tiktok.inject.C47231d;
import com.google.apps.tiktok.inject.baseclasses.TracedFragmentLifecycle;
import com.google.apps.tiktok.inject.p3657c.p3658a.C47222f;
import com.google.apps.tiktok.inject.p3659d.C47232a;
import com.google.apps.tiktok.inject.p3659d.C47233b;
import com.google.apps.tiktok.inject.p3659d.C47236e;
import com.google.apps.tiktok.inject.p3659d.C47243l;
import com.google.apps.tiktok.inject.p3659d.C47244m;
import com.google.apps.tiktok.inject.p3660e.p3661a.C47247a;
import com.google.apps.tiktok.tracing.C47515ab;
import com.google.apps.tiktok.tracing.C47570bu;
import com.google.apps.tiktok.tracing.C47573bx;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.apps.tiktok.tracing.C47816ey;
import com.google.apps.tiktok.tracing.C47831fm;
import com.google.p4242bp.p4253e.p4254a.C56196p;
import com.google.p4283bv.p4287b.p4288a.p4289a.p4290a.C56622n;
import dagger.hilt.android.internal.managers.C68324h;
import dagger.hilt.p5299a.C68288b;
import java.util.Locale;

/* renamed from: com.google.android.apps.search.googleapp.stampviewer.preview.t */
/* compiled from: PG */
public final class C139477t extends C139449af implements C47231d, C68288b, C47200b, C47233b, C47570bu {

    /* renamed from: a */
    private C139479v f379252a;

    /* renamed from: c */
    private Context f379253c;

    /* renamed from: d */
    private final C2393x f379254d = new C2393x(this);

    /* renamed from: e */
    private boolean f379255e;

    @Deprecated
    public C139477t() {
        C19559g.m37304c();
    }

    /* renamed from: a */
    static C139477t m226687a(AccountId accountId, C56622n nVar) {
        C139477t tVar = new C139477t();
        C68324h.m98669f(tVar);
        C47247a.m84047b(tVar, accountId);
        C47243l.m84039a(tVar, nVar);
        return tVar;
    }

    /* renamed from: b */
    public final C139479v mo17754z() {
        C139479v vVar = this.f379252a;
        if (vVar == null) {
            throw new IllegalStateException("peer() called before initialized.");
        } else if (!this.f379255e) {
            return vVar;
        } else {
            throw new IllegalStateException("peer() called after destroyed.");
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final /* synthetic */ C47222f mo114977d() {
        return C47244m.m84043e(this);
    }

    @Deprecated
    /* renamed from: e */
    public final Context mo17857e() {
        if (this.f379253c == null) {
            this.f379253c = new C47236e((Fragment) this, super.getContext());
        }
        return this.f379253c;
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
        return this.f379254d;
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
            C139476s.m226686a(th, th);
        }
        throw th;
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        TextView textView;
        this.f122869b.mo51381i();
        try {
            mo51119t(layoutInflater, viewGroup, bundle);
            C139479v b = mo17754z();
            View inflate = layoutInflater.inflate(R.layout.googleapp_stamp_viewer_inline_preview_overlay, viewGroup, false);
            TextView textView2 = (TextView) inflate.findViewById(R.id.googleapp_stamp_viewer_overlay_title);
            if (textView2 != null) {
                C56196p pVar = b.f379257a.f151181c;
                if (pVar == null) {
                    pVar = C56196p.f149722b;
                }
                textView2.setText(pVar.f149724a);
            }
            if (b.mo114999a() && (textView = (TextView) inflate.findViewById(R.id.googleapp_stamp_viewer_overlay_count_down)) != null) {
                textView.setVisibility(0);
                textView.setText(b.f379259c.getString(R.string.googleapp_stamp_viewer_preview_count_down, Long.valueOf(b.f379260d.f169860a)));
            }
            b.f379258b.mo33801b(inflate, b.f379258b.f76990a.mo33805a(C28427h.m53115a(137299)));
            C47831fm.m85019n();
            return inflate;
        } catch (Throwable th) {
            C139476s.m226686a(th, th);
        }
        throw th;
    }

    public final void onDestroy() {
        C47573bx b = this.f122869b.mo51374b();
        try {
            mo51112m();
            mo17754z().f379261e.cancel();
            b.close();
            return;
        } catch (Throwable th) {
            C139476s.m226686a(th, th);
        }
        throw th;
    }

    public final void onDetach() {
        C47573bx d = this.f122869b.mo51376d();
        try {
            mo51114o();
            this.f379255e = true;
            d.close();
            return;
        } catch (Throwable th) {
            C139476s.m226686a(th, th);
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
            C139476s.m226686a(th, th);
        }
        throw th;
    }

    public final void onStart() {
        this.f122869b.mo51381i();
        try {
            mo51117r();
            C139479v b = mo17754z();
            if (b.mo114999a()) {
                b.f379261e.start();
            }
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C139476s.m226686a(th, th);
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
            if (!this.f379255e) {
                super.onAttach(context);
                if (this.f379252a == null) {
                    this.f379252a = ((C139480w) mo114978f().mo17653jN()).mo115000dI();
                    super.getLifecycle().mo5790b(new TracedFragmentLifecycle(this.f122869b, this.f379254d));
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
                C139476s.m226686a(th, th2);
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
