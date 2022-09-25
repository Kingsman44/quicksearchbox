package com.google.android.apps.search.assistant.surfaces.voice.p9785ui.response.p9875d;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.p031v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.lifecycle.C2384o;
import androidx.lifecycle.C2393x;
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
import com.google.apps.tiktok.tracing.C47515ab;
import com.google.apps.tiktok.tracing.C47570bu;
import com.google.apps.tiktok.tracing.C47573bx;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.apps.tiktok.tracing.C47816ey;
import com.google.apps.tiktok.tracing.C47831fm;
import dagger.hilt.p5299a.C68288b;
import java.util.Locale;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.ui.response.d.b */
/* compiled from: PG */
public final class C130235b extends C130249o implements C47231d, C68288b, C47200b, C47233b, C47570bu {

    /* renamed from: a */
    private C130244k f357019a;

    /* renamed from: c */
    private Context f357020c;

    /* renamed from: d */
    private final C2393x f357021d = new C2393x(this);

    /* renamed from: e */
    private boolean f357022e;

    @Deprecated
    public C130235b() {
        C19559g.m37304c();
    }

    /* renamed from: a */
    public final C130244k mo17754z() {
        C130244k kVar = this.f357019a;
        if (kVar == null) {
            throw new IllegalStateException("peer() called before initialized.");
        } else if (!this.f357022e) {
            return kVar;
        } else {
            throw new IllegalStateException("peer() called after destroyed.");
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final /* synthetic */ C47222f mo109587b() {
        return C47244m.m84043e(this);
    }

    @Deprecated
    /* renamed from: e */
    public final Context mo17857e() {
        if (this.f357020c == null) {
            this.f357020c = new C47236e((Fragment) this, super.getContext());
        }
        return this.f357020c;
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
        return this.f357021d;
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
            C130234a.m212627a(th, th);
        }
        throw th;
    }

    public final void onCreate(Bundle bundle) {
        this.f122869b.mo51381i();
        try {
            mo51111l(bundle);
            C130244k a = mo17754z();
            a.f357068d.mo50429i(a.f357069e);
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C130234a.m212627a(th, th);
        }
        throw th;
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Throwable th;
        this.f122869b.mo51381i();
        try {
            mo51119t(layoutInflater, viewGroup, bundle);
            C130244k a = mo17754z();
            View inflate = layoutInflater.inflate(R.layout.assistant_csat_card_layout, viewGroup, false);
            ImageView imageView = (ImageView) inflate.findViewById(R.id.assistant_btn_close);
            ImageView imageView2 = (ImageView) inflate.findViewById(R.id.assistant_btn_rating_1);
            ImageView imageView3 = (ImageView) inflate.findViewById(R.id.assistant_btn_rating_2);
            ImageView imageView4 = (ImageView) inflate.findViewById(R.id.assistant_btn_rating_3);
            ImageView imageView5 = (ImageView) inflate.findViewById(R.id.assistant_btn_rating_4);
            ImageView imageView6 = (ImageView) inflate.findViewById(R.id.assistant_btn_rating_5);
            TextView textView = (TextView) inflate.findViewById(R.id.assistant_txt_header);
            a.f357070f.mo108810b(58396, imageView);
            a.f357070f.mo108810b(58402, imageView2);
            a.f357070f.mo108810b(58403, imageView3);
            a.f357070f.mo108810b(58404, imageView4);
            a.f357070f.mo108810b(58405, imageView5);
            a.f357070f.mo108810b(58406, imageView6);
            a.f357070f.mo108810b(58392, inflate);
            imageView.setOnClickListener(new C130236c(a, inflate));
            C130237d dVar = r2;
            C130237d dVar2 = new C130237d(a, imageView2, imageView3, imageView4, imageView5, imageView6, textView);
            imageView2.setOnClickListener(dVar);
            imageView3.setOnClickListener(new C130238e(a, imageView3, imageView2, imageView4, imageView5, imageView6, textView));
            imageView4.setOnClickListener(new C130239f(a, imageView4, imageView2, imageView3, imageView5, imageView6, textView));
            imageView5.setOnClickListener(new C130240g(a, imageView5, imageView2, imageView3, imageView4, imageView6, textView));
            imageView6.setOnClickListener(new C130241h(a, imageView6, imageView2, imageView3, imageView4, imageView5, textView));
            C47831fm.m85019n();
            return inflate;
        } catch (Throwable th2) {
            C130234a.m212627a(th, th2);
        }
        throw th;
    }

    public final void onDetach() {
        C47573bx d = this.f122869b.mo51376d();
        try {
            mo51114o();
            this.f357022e = true;
            d.close();
            return;
        } catch (Throwable th) {
            C130234a.m212627a(th, th);
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
            C130234a.m212627a(th, th);
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
            if (!this.f357022e) {
                super.onAttach(context);
                if (this.f357019a == null) {
                    this.f357019a = ((C130246l) mo109606d().mo17653jN()).mo109604bf();
                    super.getLifecycle().mo5790b(new TracedFragmentLifecycle(this.f122869b, this.f357021d));
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
                C130234a.m212627a(th, th2);
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
