package com.google.android.apps.search.googleapp.accounts.p10126ui;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.p031v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.C2384o;
import androidx.lifecycle.C2393x;
import com.google.android.apps.search.googleapp.accounts.p10126ui.p10128b.C133222e;
import com.google.android.apps.search.googleapp.accounts.p10126ui.p10128b.C133224g;
import com.google.android.apps.search.googleapp.accounts.p10126ui.p10128b.C133226i;
import com.google.android.apps.search.googleapp.accounts.p10126ui.p10128b.C133230m;
import com.google.android.apps.search.googleapp.accounts.p10126ui.p10128b.C133231n;
import com.google.android.apps.search.googleapp.accounts.p10126ui.p10128b.p10129a.C133200j;
import com.google.android.apps.search.googleapp.accounts.p10126ui.p10133d.C133255c;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.logging.p2185ve.C28427h;
import com.google.android.libraries.onegoogle.accountmenu.SelectedAccountDisc;
import com.google.android.libraries.onegoogle.accountmenu.accountlayer.C30306o;
import com.google.android.libraries.onegoogle.accountmenu.accountlayer.C30313v;
import com.google.android.libraries.onegoogle.accountmenu.p2353c.C30343m;
import com.google.android.libraries.p1623at.p1632e.C19559g;
import com.google.android.libraries.search.udcdataservice.C41385a;
import com.google.android.libraries.search.udcdataservice.C41387c;
import com.google.android.libraries.search.udcdataservice.C41409h;
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
import com.google.apps.tiktok.tracing.C47591co;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.apps.tiktok.tracing.C47816ey;
import com.google.apps.tiktok.tracing.C47831fm;
import com.google.common.p4522b.C58800sl;
import com.google.common.p4526f.C59052c;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import dagger.hilt.android.internal.managers.C68324h;
import dagger.hilt.p5299a.C68288b;
import java.util.Locale;
import java.util.Map;

/* renamed from: com.google.android.apps.search.googleapp.accounts.ui.d */
/* compiled from: PG */
public final class C133252d extends C133187ap implements C47231d, C68288b, C47200b, C47233b, C47570bu {

    /* renamed from: a */
    private C133339g f363175a;

    /* renamed from: c */
    private Context f363176c;

    /* renamed from: d */
    private final C2393x f363177d = new C2393x(this);

    /* renamed from: e */
    private boolean f363178e;

    @Deprecated
    public C133252d() {
        C19559g.m37304c();
    }

    /* renamed from: a */
    public static C133252d m216261a(AccountId accountId, C133189b bVar) {
        C133252d dVar = new C133252d();
        C68324h.m98669f(dVar);
        C47247a.m84047b(dVar, accountId);
        C47243l.m84039a(dVar, bVar);
        return dVar;
    }

    /* renamed from: b */
    public final C133339g mo17754z() {
        C133339g gVar = this.f363175a;
        if (gVar == null) {
            throw new IllegalStateException("peer() called before initialized.");
        } else if (!this.f363178e) {
            return gVar;
        } else {
            throw new IllegalStateException("peer() called after destroyed.");
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final /* synthetic */ C47222f mo111016d() {
        return C47244m.m84043e(this);
    }

    @Deprecated
    /* renamed from: e */
    public final Context mo17857e() {
        if (this.f363176c == null) {
            this.f363176c = new C47236e((Fragment) this, super.getContext());
        }
        return this.f363176c;
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
        return this.f363177d;
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
            C133244c.m216247a(th, th);
        }
        throw th;
    }

    public final void onCreate(Bundle bundle) {
        this.f122869b.mo51381i();
        try {
            mo51111l(bundle);
            C133339g b = mo17754z();
            b.f363326d.mo50828h(R.id.googleapp_mavatar_datasubscription, new C133222e(b.f363327e), b.f363328f);
            b.f363326d.mo50828h(R.id.googleapp_mavatar_deletehistory_datasubscription, new C133200j(b.f363333k), b.f363329g);
            if (b.f363339q) {
                b.f363326d.mo50828h(R.id.googleapp_mavatar_saa_datasubscription, new C133224g(b.f363327e), b.f363343u);
            }
            b.f363326d.mo50828h(R.id.googleapp_mavatar_waa_datasubscription, new C133226i(b.f363327e), new C133257f(b));
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C133244c.m216247a(th, th);
        }
        throw th;
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.f122869b.mo51381i();
        try {
            mo51119t(layoutInflater, viewGroup, bundle);
            C133339g b = mo17754z();
            b.f363325c.mo50707a(b.f363334l.mo50245b(), b.f363331i);
            View inflate = layoutInflater.inflate(R.layout.googleapp_account_disc_fragment, viewGroup, false);
            C47831fm.m85019n();
            return inflate;
        } catch (Throwable th) {
            C133244c.m216247a(th, th);
        }
        throw th;
    }

    public final void onDetach() {
        C47573bx d = this.f122869b.mo51376d();
        try {
            mo51114o();
            this.f363178e = true;
            d.close();
            return;
        } catch (Throwable th) {
            C133244c.m216247a(th, th);
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
            C133244c.m216247a(th, th);
        }
        throw th;
    }

    public final void onPause() {
        this.f122869b.mo51381i();
        try {
            mo51115p();
            C133339g b = mo17754z();
            C30306o oVar = b.f363340r;
            oVar.f81934a.f81880a.remove(b.f363335m);
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C133244c.m216247a(th, th);
        }
        throw th;
    }

    public final void onResume() {
        C47573bx e = this.f122869b.mo51377e();
        try {
            mo51116q();
            C133339g b = mo17754z();
            C30306o oVar = b.f363340r;
            oVar.f81934a.f81880a.add(b.f363335m);
            C133231n nVar = b.f363327e;
            C60870cx b2 = ((C41409h) nVar.f363129j.mo27525b()).mo43949b(new C41387c[]{C41387c.WEB_HISTORY}, C41385a.MAVATAR);
            C133230m mVar = new C133230m(nVar);
            C60856cj.m92911t(b2, C47810es.m84974n(mVar), nVar.f363127h);
            e.close();
            return;
        } catch (Throwable th) {
            C133244c.m216247a(th, th);
        }
        throw th;
    }

    public final void onViewCreated(View view, Bundle bundle) {
        this.f122869b.mo51381i();
        try {
            this.f54442o.mo24720k(bundle);
            C133339g b = mo17754z();
            C133255c cVar = b.f363341s;
            C58800sl lA = C133255c.f363182a.entrySet().iterator();
            while (lA.hasNext()) {
                Map.Entry entry = (Map.Entry) lA.next();
                cVar.f363186d.mo33801b(cVar.f363184b.requireView().findViewById(((Integer) entry.getValue()).intValue()), cVar.f363185c.mo33805a(C28427h.m53115a(((Integer) entry.getKey()).intValue())));
            }
            SelectedAccountDisc selectedAccountDisc = (SelectedAccountDisc) view.findViewById(R.id.googleapp_selected_account_disc);
            selectedAccountDisc.f81903d = new C47591co(b.f363342t, "Mavatar disc clicked", new C133256e(b));
            if (b.f363332j.f363048b) {
                selectedAccountDisc.mo35806d(view.getContext().getResources().getDimensionPixelSize(R.dimen.googleapp_account_disc_large));
            }
            if (b.f363332j.f363049c) {
                selectedAccountDisc.setPadding(0, 0, 0, 0);
            }
            if (b.f363346x.f101930a) {
                ((C30313v) b.f363338p.mo35866q().mo56107c()).mo35878a(true);
            }
            C30343m.m56502b(b.f363324b, b.f363338p, selectedAccountDisc);
            ((C59052c) ((C59052c) C133339g.f363323a.mo56224b()).mo56372aa(40010)).mo56386p("Account disc initialised");
            b.f363325c.mo50707a(b.f363337o.mo113447d(), b.f363330h);
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C133244c.m216247a(th, th);
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
            if (!this.f363178e) {
                super.onAttach(context);
                if (this.f363175a == null) {
                    this.f363175a = ((C133340h) mo111017f().mo17653jN()).mo111086bm();
                    super.getLifecycle().mo5790b(new TracedFragmentLifecycle(this.f122869b, this.f363177d));
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
                C133244c.m216247a(th, th2);
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
