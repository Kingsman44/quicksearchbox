package com.google.android.apps.search.googleapp.launcher.minusone;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.p031v4.app.C0154a;
import android.support.p031v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.C2384o;
import androidx.lifecycle.C2393x;
import com.google.android.apps.search.googleapp.accounts.p10126ui.C133166a;
import com.google.android.apps.search.googleapp.accounts.p10126ui.C133189b;
import com.google.android.apps.search.googleapp.accounts.p10126ui.C133252d;
import com.google.android.apps.search.googleapp.launcher.minusone.p10353a.C136565e;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.p1623at.p1632e.C19559g;
import com.google.android.material.p3505b.C44534d;
import com.google.apps.tiktok.account.AccountId;
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

/* renamed from: com.google.android.apps.search.googleapp.launcher.minusone.bc */
/* compiled from: PG */
public final class C136596bc extends C136642ct implements C47231d, C68288b, C47200b, C47233b, C47570bu {

    /* renamed from: a */
    private C136597bd f371849a;

    /* renamed from: c */
    private Context f371850c;

    /* renamed from: d */
    private final C2393x f371851d = new C2393x(this);

    /* renamed from: e */
    private boolean f371852e;

    @Deprecated
    public C136596bc() {
        C19559g.m37304c();
    }

    /* renamed from: a */
    public final C136597bd mo17754z() {
        C136597bd bdVar = this.f371849a;
        if (bdVar == null) {
            throw new IllegalStateException("peer() called before initialized.");
        } else if (!this.f371852e) {
            return bdVar;
        } else {
            throw new IllegalStateException("peer() called after destroyed.");
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final /* synthetic */ C47222f mo113261b() {
        return C47244m.m84043e(this);
    }

    @Deprecated
    /* renamed from: e */
    public final Context mo17857e() {
        if (this.f371850c == null) {
            this.f371850c = new C47236e((Fragment) this, super.getContext());
        }
        return this.f371850c;
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
        return this.f371851d;
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
            C136595bb.m221998a(th, th);
        }
        throw th;
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.f122869b.mo51381i();
        try {
            mo51119t(layoutInflater, viewGroup, bundle);
            C136597bd a = mo17754z();
            ViewGroup viewGroup2 = (ViewGroup) layoutInflater.inflate(R.layout.googleapp_minus_one_s_post_mvp_header_fragment, viewGroup, false);
            a.f371854b.mo113061a(122362, viewGroup2);
            a.f371857e.mo113253a(viewGroup2.findViewById(R.id.googleapp_search_box), a.f371856d, false);
            a.f371857e.mo113254b(viewGroup2.findViewById(R.id.googleapp_mic_icon), a.f371856d);
            if (a.f371856d.getChildFragmentManager().f634a.mo670b(R.id.googleapp_account_disc_fragment) == null) {
                C0154a aVar = new C0154a(a.f371856d.getChildFragmentManager());
                AccountId accountId = a.f371853a;
                C133166a aVar2 = (C133166a) C133189b.f363045d.createBuilder();
                aVar2.copyOnWrite();
                C133189b bVar = (C133189b) aVar2.instance;
                bVar.f363047a |= 1;
                bVar.f363048b = true;
                aVar.mo511h(R.id.googleapp_account_disc_fragment, C133252d.m216261a(accountId, (C133189b) aVar2.build()), "GoogleApp_AccountDiscFragment", 1);
                aVar.mo509f();
            }
            if (C44534d.m78715b()) {
                a.f371855c.mo113231a(C136565e.m221936c(Integer.valueOf(C136592b.m221992b(C136592b.m221993c(viewGroup2.getContext())))));
            }
            C47831fm.m85019n();
            return viewGroup2;
        } catch (Throwable th) {
            C136595bb.m221998a(th, th);
        }
        throw th;
    }

    public final void onDetach() {
        C47573bx d = this.f122869b.mo51376d();
        try {
            mo51114o();
            this.f371852e = true;
            d.close();
            return;
        } catch (Throwable th) {
            C136595bb.m221998a(th, th);
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
            C136595bb.m221998a(th, th);
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
            if (!this.f371852e) {
                super.onAttach(context);
                if (this.f371849a == null) {
                    this.f371849a = ((C136598be) mo113295d().mo17653jN()).mo113262cK();
                    super.getLifecycle().mo5790b(new TracedFragmentLifecycle(this.f122869b, this.f371851d));
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
                C136595bb.m221998a(th, th2);
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
