package com.google.android.apps.search.assistant.surfaces.onboarding.oobe;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.p031v4.app.C0167am;
import android.support.p031v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.C2384o;
import androidx.lifecycle.C2393x;
import com.google.android.apps.gsa.binaries.satin.app.C74176nj;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.p1623at.p1632e.C19559g;
import com.google.android.libraries.search.assistant.p2803u.p2804a.C36624a;
import com.google.android.libraries.search.assistant.p2803u.p2808b.p2809a.C36657a;
import com.google.android.libraries.search.assistant.p2803u.p2808b.p2809a.p2811b.C36675c;
import com.google.android.libraries.search.assistant.p2803u.p2808b.p2812b.C36684d;
import com.google.android.libraries.search.p2871b.C37215b;
import com.google.android.libraries.search.p2871b.p2872a.p2874b.C37176a;
import com.google.apps.tiktok.account.AccountId;
import com.google.apps.tiktok.account.data.C46175b;
import com.google.apps.tiktok.dataservice.local.C46855i;
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
import com.google.apps.tiktok.tracing.C47810es;
import com.google.apps.tiktok.tracing.C47816ey;
import com.google.apps.tiktok.tracing.C47831fm;
import com.google.common.base.C58838bb;
import com.google.protobuf.C62921ba;
import com.google.protobuf.contrib.android.ProtoParsers;
import com.google.protos.p4759ad.p4760a.p4761a.p4788b.p4789a.p4790a.p4791a.p4792a.p4793a.C63143a;
import com.google.protos.p4759ad.p4760a.p4761a.p4788b.p4789a.p4790a.p4791a.p4792a.p4793a.C63145c;
import dagger.hilt.p5299a.C68288b;
import dagger.p5294a.C68221g;
import dagger.p5294a.C68225k;
import java.util.Locale;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.apps.search.assistant.surfaces.onboarding.oobe.q */
/* compiled from: PG */
public final class C126679q extends C126684v implements C47231d, C68288b, C47200b, C47233b, C47570bu {

    /* renamed from: a */
    private C126681s f348844a;

    /* renamed from: c */
    private Context f348845c;

    /* renamed from: d */
    private final C2393x f348846d = new C2393x(this);

    /* renamed from: e */
    private boolean f348847e;

    @Deprecated
    public C126679q() {
        C19559g.m37304c();
    }

    /* renamed from: a */
    public final C126681s mo17754z() {
        C126681s sVar = this.f348844a;
        if (sVar == null) {
            throw new IllegalStateException("peer() called before initialized.");
        } else if (!this.f348847e) {
            return sVar;
        } else {
            throw new IllegalStateException("peer() called after destroyed.");
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final /* synthetic */ C47247a mo107675b() {
        return new C47242k(this);
    }

    @Deprecated
    /* renamed from: e */
    public final Context mo17857e() {
        if (this.f348845c == null) {
            this.f348845c = new C47236e((Fragment) this, super.getContext());
        }
        return this.f348845c;
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
        return this.f348846d;
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
            C126678p.m207148a(th, th);
        }
        throw th;
    }

    public final void onCreate(Bundle bundle) {
        this.f122869b.mo51381i();
        try {
            mo51111l(bundle);
            C126681s a = mo17754z();
            if (bundle != null) {
                a.f348860l = bundle.getBoolean("isChangingConfigurations");
            }
            C46855i iVar = a.f348853e;
            C36657a aVar = a.f348855g;
            int a2 = C63143a.m96188a(a.f348856h.f170516a);
            if (a2 == 0) {
                a2 = 1;
            }
            iVar.mo50828h(R.id.assistant_oobe_fragments_info_id, aVar.mo40300c(a2), a.f348859k);
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C126678p.m207148a(th, th);
        }
        throw th;
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.f122869b.mo51381i();
        try {
            mo51119t(layoutInflater, viewGroup, bundle);
            mo17754z().f348852d.mo19974a(C37176a.f97290ik);
            View inflate = layoutInflater.inflate(R.layout.assistant_oobe_activity, viewGroup, false);
            if (inflate != null) {
                C47831fm.m85019n();
                return inflate;
            }
            throw new NullPointerException("Fragment cannot use Event annotations with null view!");
        } catch (Throwable th) {
            C126678p.m207148a(th, th);
        }
        throw th;
    }

    public final void onDetach() {
        C47573bx d = this.f122869b.mo51376d();
        try {
            mo51114o();
            this.f348847e = true;
            d.close();
            return;
        } catch (Throwable th) {
            C126678p.m207148a(th, th);
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
            C126678p.m207148a(th, th);
        }
        throw th;
    }

    public final void onSaveInstanceState(Bundle bundle) {
        this.f122869b.mo51381i();
        try {
            this.f54442o.mo24721A(bundle);
            C0167am activity = mo17754z().f348851c.getActivity();
            if (activity != null && activity.isChangingConfigurations()) {
                bundle.putBoolean("isChangingConfigurations", true);
            }
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C126678p.m207148a(th, th);
        }
        throw th;
    }

    public final void onViewCreated(View view, Bundle bundle) {
        this.f122869b.mo51381i();
        try {
            C47389c.m84226a(getContext()).f123128b = view;
            C47393f.m84233d(this, C36684d.class, new C126682t(mo17754z()));
            this.f54442o.mo24720k(bundle);
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C126678p.m207148a(th, th);
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
            if (!this.f348847e) {
                super.onAttach(context);
                if (this.f348844a == null) {
                    Object jN = mo107678d().mo17653jN();
                    AccountId accountId = (AccountId) ((C74176nj) jN).f206730b.f198239e.mo17428b();
                    Bundle b = ((C74176nj) jN).mo69504b();
                    C58838bb.m90869d(b.containsKey("TIKTOK_FRAGMENT_ARGUMENT"), "Proto @Argument for Fragment could not be found. @Arguments must be provided using the Fragment#create(MessageLite argument) overload.");
                    C63145c cVar = (C63145c) ProtoParsers.m95522e(b, "TIKTOK_FRAGMENT_ARGUMENT", C63145c.f170514c, (C62921ba) ((C74176nj) jN).f206677a.gG.mo17428b());
                    C68225k.m98532d(cVar);
                    Fragment fragment = (Fragment) ((C68221g) ((C74176nj) jN).f206889e).f184583a;
                    if (fragment instanceof C126679q) {
                        C126679q qVar = (C126679q) fragment;
                        C68225k.m98532d(qVar);
                        this.f348844a = new C126681s(accountId, cVar, qVar, (C37215b) ((C74176nj) jN).f206730b.f198067an.mo17428b(), (C36624a) ((C74176nj) jN).f206730b.f198093bM.mo17428b(), (C46855i) ((C74176nj) jN).f207083j.mo17428b(), new C36675c(((C74176nj) jN).mo69663e(), (C46175b) ((C74176nj) jN).f206730b.f198398h.mo17428b(), (Executor) ((C74176nj) jN).f206677a.n.mo17428b()), (C36657a) ((C74176nj) jN).f206730b.f198094bN.mo17428b());
                        super.getLifecycle().mo5790b(new TracedFragmentLifecycle(this.f122869b, this.f348846d));
                    } else {
                        String obj = C126681s.class.toString();
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
                C126678p.m207148a(th, th2);
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
