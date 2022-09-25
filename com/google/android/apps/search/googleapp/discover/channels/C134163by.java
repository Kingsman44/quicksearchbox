package com.google.android.apps.search.googleapp.discover.channels;

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
import com.google.android.apps.gsa.binaries.satin.app.C74176nj;
import com.google.android.apps.search.googleapp.accounts.p10126ui.C133166a;
import com.google.android.apps.search.googleapp.accounts.p10126ui.C133189b;
import com.google.android.apps.search.googleapp.accounts.p10126ui.C133252d;
import com.google.android.apps.search.googleapp.p10516t.p10522f.C139708c;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.logging.p2185ve.C28306ab;
import com.google.android.libraries.logging.p2185ve.C28427h;
import com.google.android.libraries.logging.p2185ve.p2201h.C28430c;
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
import dagger.hilt.android.internal.managers.C68324h;
import dagger.hilt.p5299a.C68288b;
import dagger.p5294a.C68221g;
import dagger.p5294a.C68225k;
import java.util.Locale;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.googleapp.discover.channels.by */
/* compiled from: PG */
public final class C134163by extends C134171cf implements C47231d, C68288b, C47200b, C47233b, C47570bu {

    /* renamed from: a */
    private C134167cb f365460a;

    /* renamed from: c */
    private Context f365461c;

    /* renamed from: d */
    private final C2393x f365462d = new C2393x(this);

    /* renamed from: e */
    private boolean f365463e;

    @Deprecated
    public C134163by() {
        C19559g.m37304c();
    }

    /* renamed from: a */
    static C134163by m217640a(AccountId accountId) {
        C134163by byVar = new C134163by();
        C68324h.m98669f(byVar);
        C47247a.m84047b(byVar, accountId);
        return byVar;
    }

    /* renamed from: b */
    public final C134167cb mo17754z() {
        C134167cb cbVar = this.f365460a;
        if (cbVar == null) {
            throw new IllegalStateException("peer() called before initialized.");
        } else if (!this.f365463e) {
            return cbVar;
        } else {
            throw new IllegalStateException("peer() called after destroyed.");
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final /* synthetic */ C47247a mo111584d() {
        return new C47242k(this);
    }

    @Deprecated
    /* renamed from: e */
    public final Context mo17857e() {
        if (this.f365461c == null) {
            this.f365461c = new C47236e((Fragment) this, super.getContext());
        }
        return this.f365461c;
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
        return this.f365462d;
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
            C134162bx.m217639a(th, th);
        }
        throw th;
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.f122869b.mo51381i();
        try {
            mo51119t(layoutInflater, viewGroup, bundle);
            C134167cb b = mo17754z();
            C69664n.m101061g(layoutInflater, "inflater");
            View inflate = layoutInflater.inflate(R.layout.googleapp_discover_channels_search_bar_layout, viewGroup, false);
            C28306ab abVar = b.f365470d;
            abVar.mo33801b(inflate, abVar.f76990a.mo33805a(C28427h.m53115a(132910)));
            inflate.setOnClickListener(new C47591co(b.f365469c, "ChannelSearchBoxTapped", new C28430c(b.f365471e, new C134164bz(b))));
            View findViewById = inflate.findViewById(R.id.googleapp_discover_channels_search_bar_mic);
            C28306ab abVar2 = b.f365470d;
            abVar2.mo33801b(findViewById, abVar2.f76990a.mo33805a(C28427h.m53115a(132911)));
            findViewById.setOnClickListener(new C47591co(b.f365469c, "MicButtonTapped", new C28430c(b.f365471e, new C134166ca(b))));
            View findViewById2 = inflate.findViewById(R.id.googleapp_discover_channels_search_bar_account_disc);
            if (findViewById2 != null) {
                C28306ab abVar3 = b.f365470d;
                abVar3.mo33801b(findViewById2, abVar3.f76990a.mo33805a(C28427h.m53115a(132912)));
            }
            if (b.f365467a.getChildFragmentManager().f634a.mo670b(R.id.googleapp_discover_channels_search_bar_account_disc) == null) {
                C0154a aVar = new C0154a(b.f365467a.getChildFragmentManager());
                aVar.mo691x(17432576, 17432577, 0, 0);
                AccountId accountId = b.f365468b;
                C133166a aVar2 = (C133166a) C133189b.f363045d.createBuilder();
                aVar2.copyOnWrite();
                C133189b bVar = (C133189b) aVar2.instance;
                bVar.f363047a |= 2;
                bVar.f363049c = true;
                aVar.mo511h(R.id.googleapp_discover_channels_search_bar_account_disc, C133252d.m216261a(accountId, (C133189b) aVar2.build()), "GoogleApp_AccountDiscFragment", 1);
                aVar.mo509f();
            }
            C69664n.m101060f(inflate, "view");
            C47831fm.m85019n();
            return inflate;
        } catch (Throwable th) {
            C134162bx.m217639a(th, th);
        }
        throw th;
    }

    public final void onDetach() {
        C47573bx d = this.f122869b.mo51376d();
        try {
            mo51114o();
            this.f365463e = true;
            d.close();
            return;
        } catch (Throwable th) {
            C134162bx.m217639a(th, th);
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
            C134162bx.m217639a(th, th);
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
            if (!this.f365463e) {
                super.onAttach(context);
                if (this.f365460a == null) {
                    Object jN = mo111593f().mo17653jN();
                    Fragment fragment = (Fragment) ((C68221g) ((C74176nj) jN).f206889e).f184583a;
                    if (fragment instanceof C134163by) {
                        C134163by byVar = (C134163by) fragment;
                        C68225k.m98532d(byVar);
                        this.f365460a = new C134167cb(byVar, (AccountId) ((C74176nj) jN).f206730b.f198239e.mo17428b(), (C47770dh) ((C74176nj) jN).f206730b.f198663m.mo17428b(), (C28306ab) ((C74176nj) jN).f206677a.a.f202880fS.mo17428b(), ((C74176nj) jN).f206677a.d.mo67739ap(), (C139708c) ((C74176nj) jN).f206730b.f198027a.f199482fp.mo17428b());
                        super.getLifecycle().mo5790b(new TracedFragmentLifecycle(this.f122869b, this.f365462d));
                    } else {
                        String obj = C134167cb.class.toString();
                        String valueOf = String.valueOf(fragment.getClass());
                        throw new IllegalStateException("Attempt to inject a Fragment wrapper of type " + obj + ", but the wrapper available is of type: " + valueOf + ". Does your peer's @Inject constructor reference the wrong wrapper class?");
                    }
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
                C134162bx.m217639a(th, th2);
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
