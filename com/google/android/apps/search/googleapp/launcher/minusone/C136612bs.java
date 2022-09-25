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
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.C2384o;
import androidx.lifecycle.C2393x;
import com.google.android.apps.search.googleapp.accounts.p10126ui.C133166a;
import com.google.android.apps.search.googleapp.accounts.p10126ui.C133189b;
import com.google.android.apps.search.googleapp.accounts.p10126ui.C133252d;
import com.google.android.apps.search.googleapp.launcher.minusone.C136614bu;
import com.google.android.apps.search.googleapp.launcher.minusone.p10353a.C136565e;
import com.google.android.apps.search.googleapp.p10257g.C135428c;
import com.google.android.apps.search.googleapp.p10257g.C135430e;
import com.google.android.apps.search.googleapp.p10257g.C135431f;
import com.google.android.apps.search.googleapp.p10257g.C135434i;
import com.google.android.apps.search.googleapp.p10257g.C135435j;
import com.google.android.apps.search.googleapp.p10257g.C135451x;
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
import com.google.apps.tiktok.p3674l.p3679c.C47389c;
import com.google.apps.tiktok.p3674l.p3679c.C47393f;
import com.google.apps.tiktok.tracing.C47515ab;
import com.google.apps.tiktok.tracing.C47570bu;
import com.google.apps.tiktok.tracing.C47573bx;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.apps.tiktok.tracing.C47816ey;
import com.google.apps.tiktok.tracing.C47831fm;
import com.google.p4479cg.C58070b;
import dagger.hilt.p5299a.C68288b;
import java.util.Locale;
import java.util.Set;

/* renamed from: com.google.android.apps.search.googleapp.launcher.minusone.bs */
/* compiled from: PG */
public final class C136612bs extends C136644cv implements C47231d, C68288b, C47200b, C47233b, C47570bu {

    /* renamed from: a */
    private C136614bu f371888a;

    /* renamed from: c */
    private Context f371889c;

    /* renamed from: d */
    private final C2393x f371890d = new C2393x(this);

    /* renamed from: e */
    private boolean f371891e;

    @Deprecated
    public C136612bs() {
        C19559g.m37304c();
    }

    /* renamed from: a */
    public final C136614bu mo17754z() {
        C136614bu buVar = this.f371888a;
        if (buVar == null) {
            throw new IllegalStateException("peer() called before initialized.");
        } else if (!this.f371891e) {
            return buVar;
        } else {
            throw new IllegalStateException("peer() called after destroyed.");
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final /* synthetic */ C47222f mo113269b() {
        return C47244m.m84043e(this);
    }

    @Deprecated
    /* renamed from: e */
    public final Context mo17857e() {
        if (this.f371889c == null) {
            this.f371889c = new C47236e((Fragment) this, super.getContext());
        }
        return this.f371889c;
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
        return this.f371890d;
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
            C136611br.m222052a(th, th);
        }
        throw th;
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C58070b bVar;
        this.f122869b.mo51381i();
        try {
            mo51119t(layoutInflater, viewGroup, bundle);
            C136614bu a = mo17754z();
            ViewGroup viewGroup2 = (ViewGroup) layoutInflater.inflate(R.layout.googleapp_pixel_minus_one_s_header_fragment, viewGroup, false);
            a.f371894b.mo113061a(122360, viewGroup2);
            if (a.f371895c.getChildFragmentManager().f634a.mo670b(R.id.googleapp_doodle_fragment) == null) {
                if (C44534d.m78715b()) {
                    bVar = C136592b.m221994d(C136592b.m221991a(viewGroup2.getContext(), R.attr.colorSecondary));
                } else {
                    bVar = C58070b.f155212e;
                }
                C0154a aVar = new C0154a(a.f371895c.getChildFragmentManager());
                AccountId accountId = a.f371893a;
                C135428c cVar = (C135428c) C135431f.f368964f.createBuilder();
                C135430e eVar = C135430e.PIXEL_SPLUS_MINUS_ONE;
                cVar.copyOnWrite();
                C135431f fVar = (C135431f) cVar.instance;
                fVar.f368967b = eVar.f368963g;
                fVar.f368966a |= 1;
                cVar.copyOnWrite();
                C135431f fVar2 = (C135431f) cVar.instance;
                fVar2.f368966a |= 2;
                fVar2.f368968c = true;
                cVar.copyOnWrite();
                C135431f fVar3 = (C135431f) cVar.instance;
                bVar.getClass();
                fVar3.f368969d = bVar;
                fVar3.f368966a |= 4;
                boolean z = a.f371902j;
                cVar.copyOnWrite();
                C135431f fVar4 = (C135431f) cVar.instance;
                fVar4.f368966a |= 8;
                fVar4.f368970e = z;
                Set set = C135435j.f368973a;
                aVar.mo511h(R.id.googleapp_doodle_fragment, C135434i.m219595a(accountId, (C135431f) cVar.build()), (String) null, 1);
                aVar.mo509f();
            }
            if (a.f371895c.getChildFragmentManager().f634a.mo670b(R.id.googleapp_account_disc_fragment) == null) {
                C0154a aVar2 = new C0154a(a.f371895c.getChildFragmentManager());
                AccountId accountId2 = a.f371893a;
                C133166a aVar3 = (C133166a) C133189b.f363045d.createBuilder();
                aVar3.copyOnWrite();
                C133189b bVar2 = (C133189b) aVar3.instance;
                bVar2.f363047a |= 1;
                bVar2.f363048b = true;
                aVar2.mo511h(R.id.googleapp_account_disc_fragment, C133252d.m216261a(accountId2, (C133189b) aVar3.build()), "GoogleApp_AccountDiscFragment", 1);
                aVar2.mo509f();
            }
            if (C44534d.m78715b()) {
                C58070b c = C136592b.m221993c(layoutInflater.getContext());
                if (!C58070b.f155212e.equals(c)) {
                    a.f371901i.mo113231a(C136565e.m221936c(Integer.valueOf(C136592b.m221992b(c))));
                }
            } else {
                a.f371901i.mo113231a(C136565e.m221936c(Integer.valueOf(layoutInflater.getContext().getResources().getColor(R.color.googleapp_minus_one_feed_background))));
            }
            a.f371899g = new C136619by(viewGroup2, viewGroup2.findViewById(R.id.googleapp_account_disc_fragment));
            if (!a.f371903k) {
                a.f371896d.mo50707a(a.f371900h.mo112310a(), new C136614bu.C136615a((ConstraintLayout) viewGroup2.findViewById(R.id.googleapp_pixel_minus_one_header)));
            }
            if (viewGroup2 != null) {
                C47831fm.m85019n();
                return viewGroup2;
            }
            throw new NullPointerException("Fragment cannot use Event annotations with null view!");
        } catch (Throwable th) {
            C136611br.m222052a(th, th);
        }
        throw th;
    }

    public final void onDestroyView() {
        C47573bx c = this.f122869b.mo51375c();
        try {
            mo51113n();
            mo17754z().f371899g = null;
            c.close();
            return;
        } catch (Throwable th) {
            C136611br.m222052a(th, th);
        }
        throw th;
    }

    public final void onDetach() {
        C47573bx d = this.f122869b.mo51376d();
        try {
            mo51114o();
            this.f371891e = true;
            d.close();
            return;
        } catch (Throwable th) {
            C136611br.m222052a(th, th);
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
            C136611br.m222052a(th, th);
        }
        throw th;
    }

    public final void onViewCreated(View view, Bundle bundle) {
        this.f122869b.mo51381i();
        try {
            C47389c.m84226a(getContext()).f123128b = view;
            C47393f.m84233d(this, C135451x.class, new C136616bv(mo17754z()));
            this.f54442o.mo24720k(bundle);
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C136611br.m222052a(th, th);
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
            if (!this.f371891e) {
                super.onAttach(context);
                if (this.f371888a == null) {
                    this.f371888a = ((C136617bw) mo113299d().mo17653jN()).mo113270cM();
                    super.getLifecycle().mo5790b(new TracedFragmentLifecycle(this.f122869b, this.f371890d));
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
                C136611br.m222052a(th, th2);
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
