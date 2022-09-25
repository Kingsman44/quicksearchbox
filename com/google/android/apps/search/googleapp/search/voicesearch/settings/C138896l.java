package com.google.android.apps.search.googleapp.search.voicesearch.settings;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.p031v4.app.Fragment;
import android.telephony.TelephonyManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.C2384o;
import androidx.lifecycle.C2393x;
import com.google.android.apps.gsa.binaries.satin.app.C74176nj;
import com.google.android.apps.gsa.binaries.satin.app.anh;
import com.google.android.apps.search.googleapp.search.voicesearch.settings.C138889f;
import com.google.android.apps.search.googleapp.search.voicesearch.settings.p10476a.C138869c;
import com.google.android.apps.search.googleapp.search.voicesearch.settings.p10476a.C138880n;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.logging.p2185ve.C28306ab;
import com.google.android.libraries.logging.p2185ve.C28310af;
import com.google.android.libraries.logging.p2185ve.C28313c;
import com.google.android.libraries.logging.p2185ve.C28427h;
import com.google.android.libraries.logging.p2185ve.C28443m;
import com.google.android.libraries.p1623at.p1632e.C19559g;
import com.google.apps.tiktok.account.AccountId;
import com.google.apps.tiktok.account.p3603a.C45954d;
import com.google.apps.tiktok.contrib.p3629c.C46485f;
import com.google.apps.tiktok.dataservice.C46719bc;
import com.google.apps.tiktok.dataservice.C46801dp;
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
import com.google.apps.tiktok.tracing.C47515ab;
import com.google.apps.tiktok.tracing.C47570bu;
import com.google.apps.tiktok.tracing.C47573bx;
import com.google.apps.tiktok.tracing.C47770dh;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.apps.tiktok.tracing.C47816ey;
import com.google.apps.tiktok.tracing.C47831fm;
import dagger.hilt.p5299a.C68288b;
import dagger.p5294a.C68221g;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.googleapp.search.voicesearch.settings.l */
/* compiled from: PG */
public final class C138896l extends C138907v implements C47231d, C68288b, C47200b, C47233b, C47570bu {

    /* renamed from: a */
    private C138899o f377795a;

    /* renamed from: c */
    private Context f377796c;

    /* renamed from: d */
    private final C2393x f377797d = new C2393x(this);

    /* renamed from: e */
    private boolean f377798e;

    @Deprecated
    public C138896l() {
        C19559g.m37304c();
    }

    /* renamed from: a */
    public final C138899o mo17754z() {
        C138899o oVar = this.f377795a;
        if (oVar == null) {
            throw new IllegalStateException("peer() called before initialized.");
        } else if (!this.f377798e) {
            return oVar;
        } else {
            throw new IllegalStateException("peer() called after destroyed.");
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final /* synthetic */ C47247a mo114623b() {
        return new C47242k(this);
    }

    @Deprecated
    /* renamed from: e */
    public final Context mo17857e() {
        if (this.f377796c == null) {
            this.f377796c = new C47236e((Fragment) this, super.getContext());
        }
        return this.f377796c;
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
        return this.f377797d;
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
            C138895k.m225664a(th, th);
        }
        throw th;
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.f122869b.mo51381i();
        try {
            mo51119t(layoutInflater, viewGroup, bundle);
            C138899o a = mo17754z();
            C69664n.m101061g(layoutInflater, "layoutInflater");
            C69664n.m101061g(viewGroup, "container");
            if (bundle != null) {
                boolean z = bundle.getBoolean("isChangingConfigurations");
                a.f377817q = z;
                if (z) {
                    List list = a.f377814n;
                    ArrayList<String> stringArrayList = bundle.getStringArrayList("selectedLanguages");
                    C69664n.m101058d(stringArrayList);
                    list.addAll(stringArrayList);
                }
            }
            View inflate = layoutInflater.inflate(R.layout.googleapp_voice_settings_languages_setting_fragment, viewGroup, false);
            C69664n.m101060f(inflate, "layoutInflater.inflate(\n…hToRoot= */ false\n      )");
            C46801dp dpVar = a.f377805e;
            C138880n nVar = a.f377804d;
            dpVar.mo50707a(new C46719bc(nVar.f377755a, new C138869c(nVar), "voice_languages_setting_data_source_key"), a.f377816p);
            C28306ab abVar = a.f377810j;
            C28313c a2 = a.f377809i.mo33805a(C28427h.m53115a(150545));
            a2.mo33859g(C45954d.m82060a(a.f377808h));
            abVar.mo33801b(inflate, a2);
            a.f377810j.mo33801b(inflate.findViewById(R.id.googleapp_voice_languages_setting_language_list), a.f377809i.mo33805a(C28427h.m53115a(150546)));
            if (inflate != null) {
                C47831fm.m85019n();
                return inflate;
            }
            throw new NullPointerException("Fragment cannot use Event annotations with null view!");
        } catch (Throwable th) {
            C138895k.m225664a(th, th);
        }
        throw th;
    }

    public final void onDetach() {
        C47573bx d = this.f122869b.mo51376d();
        try {
            mo51114o();
            this.f377798e = true;
            d.close();
            return;
        } catch (Throwable th) {
            C138895k.m225664a(th, th);
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
            C138895k.m225664a(th, th);
        }
        throw th;
    }

    public final void onSaveInstanceState(Bundle bundle) {
        this.f122869b.mo51381i();
        try {
            this.f54442o.mo24721A(bundle);
            C138899o a = mo17754z();
            C69664n.m101061g(bundle, "outState");
            if (a.f377803c.requireActivity().isChangingConfigurations()) {
                bundle.putBoolean("isChangingConfigurations", true);
                bundle.putStringArrayList("selectedLanguages", new ArrayList(a.f377814n));
            }
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C138895k.m225664a(th, th);
        }
        throw th;
    }

    public final void onViewCreated(View view, Bundle bundle) {
        this.f122869b.mo51381i();
        try {
            C47389c.m84226a(getContext()).f123128b = view;
            C47393f.m84233d(this, C138889f.C138890a.class, new C138901p(mo17754z()));
            this.f54442o.mo24720k(bundle);
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C138895k.m225664a(th, th);
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
            if (!this.f377798e) {
                super.onAttach(context);
                if (this.f377795a == null) {
                    Object jN = mo114629d().mo17653jN();
                    anh anh = ((C74176nj) jN).f206730b;
                    ((C74176nj) jN).f206677a.d.mo67760bJ();
                    this.f377795a = new C138899o((Context) ((C74176nj) jN).f206836d.f205391d.mo17428b(), (Fragment) ((C68221g) ((C74176nj) jN).f206889e).f184583a, (C138880n) ((C74176nj) jN).f206730b.f198027a.f199283cB.mo17428b(), (C46801dp) ((C74176nj) jN).f207084k.mo17428b(), (TelephonyManager) ((C74176nj) jN).f206677a.b.f199956aW.mo17428b(), new C138894j(anh.f198027a.f199283cB, anh.f198663m), (C47770dh) ((C74176nj) jN).f206730b.f198663m.mo17428b(), (C46485f) ((C74176nj) jN).f206995g.mo17428b(), (AccountId) ((C74176nj) jN).f206730b.f198239e.mo17428b(), (C28310af) ((C74176nj) jN).f206677a.a.f202878fQ.mo17428b(), (C28306ab) ((C74176nj) jN).f206677a.a.f202880fS.mo17428b(), (C28443m) ((C74176nj) jN).f206677a.a.f202879fR.mo17428b());
                    super.getLifecycle().mo5790b(new TracedFragmentLifecycle(this.f122869b, this.f377797d));
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
                C138895k.m225664a(th, th2);
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
