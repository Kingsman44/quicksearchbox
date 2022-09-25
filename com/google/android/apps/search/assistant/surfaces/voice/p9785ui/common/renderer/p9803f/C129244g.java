package com.google.android.apps.search.assistant.surfaces.voice.p9785ui.common.renderer.p9803f;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.p031v4.app.Fragment;
import android.text.Html;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.lifecycle.C2384o;
import androidx.lifecycle.C2393x;
import com.google.android.apps.search.assistant.surfaces.voice.p9785ui.response.p9870a.C130150a;
import com.google.android.googlequicksearchbox.R;
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
import com.google.apps.tiktok.p3674l.p3679c.C47389c;
import com.google.apps.tiktok.p3674l.p3679c.C47400m;
import com.google.apps.tiktok.tracing.C47515ab;
import com.google.apps.tiktok.tracing.C47570bu;
import com.google.apps.tiktok.tracing.C47573bx;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.apps.tiktok.tracing.C47816ey;
import com.google.apps.tiktok.tracing.C47831fm;
import com.google.assistant.p3897e.p3917i.p3918a.C51383fr;
import com.google.assistant.p3897e.p3917i.p3918a.C51386fu;
import com.google.assistant.p3897e.p3921j.p3926e.C52003hb;
import dagger.hilt.android.internal.managers.C68324h;
import dagger.hilt.p5299a.C68288b;
import java.util.Locale;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.ui.common.renderer.f.g */
/* compiled from: PG */
public final class C129244g extends C129241d implements C47231d, C68288b, C47200b, C47233b, C47570bu {

    /* renamed from: a */
    private C129252o f355011a;

    /* renamed from: c */
    private Context f355012c;

    /* renamed from: d */
    private final C2393x f355013d = new C2393x(this);

    /* renamed from: e */
    private boolean f355014e;

    @Deprecated
    public C129244g() {
        C19559g.m37304c();
    }

    /* renamed from: f */
    public static C129244g m211012f(AccountId accountId, C129246i iVar) {
        C129244g gVar = new C129244g();
        C68324h.m98669f(gVar);
        C47247a.m84047b(gVar, accountId);
        C47243l.m84039a(gVar, iVar);
        return gVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final /* synthetic */ C47222f mo108923b() {
        return C47244m.m84043e(this);
    }

    @Deprecated
    /* renamed from: e */
    public final Context mo17857e() {
        if (this.f355012c == null) {
            this.f355012c = new C47236e((Fragment) this, super.getContext());
        }
        return this.f355012c;
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
        return this.f355013d;
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
    public final C129252o mo17754z() {
        C129252o oVar = this.f355011a;
        if (oVar == null) {
            throw new IllegalStateException("peer() called before initialized.");
        } else if (!this.f355014e) {
            return oVar;
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
            C129243f.m211011a(th, th);
        }
        throw th;
    }

    public final void onCreate(Bundle bundle) {
        this.f122869b.mo51381i();
        try {
            mo51111l(bundle);
            C129252o j = mo17754z();
            j.f355034j.mo50429i(j.f355037m);
            int a = C51386fu.m86174a(j.f355028d.f133831b);
            if (a != 0) {
                if (a == 3 && j.f355029e.isPresent()) {
                    ((C130150a) j.f355029e.get()).mo109536b();
                }
            }
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C129243f.m211011a(th, th);
        }
        throw th;
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.f122869b.mo51381i();
        try {
            mo51119t(layoutInflater, viewGroup, bundle);
            C129252o j = mo17754z();
            j.f355030f.mo50707a(j.f355031g.mo50244a(j.f355032h), j.f355036l);
            View inflate = layoutInflater.inflate(R.layout.assistant_response_content_text, viewGroup, false);
            if (inflate != null) {
                C47831fm.m85019n();
                return inflate;
            }
            throw new NullPointerException("Fragment cannot use Event annotations with null view!");
        } catch (Throwable th) {
            C129243f.m211011a(th, th);
        }
        throw th;
    }

    public final void onDetach() {
        C47573bx d = this.f122869b.mo51376d();
        try {
            mo51114o();
            this.f355014e = true;
            d.close();
            return;
        } catch (Throwable th) {
            C129243f.m211011a(th, th);
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
            C129243f.m211011a(th, th);
        }
        throw th;
    }

    public final void onViewCreated(View view, Bundle bundle) {
        CharSequence charSequence;
        this.f122869b.mo51381i();
        try {
            C47400m a = C47389c.m84226a(getContext());
            a.f123128b = view;
            a.mo51254d(a.f123128b.findViewById(R.id.assistant_google_bubble_profile_icon), new C129255p(mo17754z()));
            this.f54442o.mo24720k(bundle);
            C129252o j = mo17754z();
            TextView textView = (TextView) view.findViewById(R.id.assistant_google_bubble_text);
            int a2 = C51383fr.m86173a(j.f355028d.f133832c);
            if (a2 != 0) {
                if (a2 == 3) {
                    textView.setTextAppearance(2132150332);
                }
            }
            C52003hb hbVar = j.f355027c;
            if (hbVar.f136482e) {
                charSequence = Html.fromHtml(hbVar.f136479b);
            } else {
                charSequence = hbVar.f136479b;
            }
            textView.setText(charSequence);
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C129243f.m211011a(th, th);
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
            if (!this.f355014e) {
                super.onAttach(context);
                if (this.f355011a == null) {
                    this.f355011a = ((C129256q) mo108922a().mo17653jN()).mo108935ae();
                    super.getLifecycle().mo5790b(new TracedFragmentLifecycle(this.f122869b, this.f355013d));
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
                C129243f.m211011a(th, th2);
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
