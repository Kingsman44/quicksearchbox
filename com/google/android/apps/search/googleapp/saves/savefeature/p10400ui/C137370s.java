package com.google.android.apps.search.googleapp.saves.savefeature.p10400ui;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.p031v4.app.Fragment;
import android.support.p033v7.widget.LinearLayoutManager;
import android.support.p033v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.lifecycle.C2384o;
import androidx.lifecycle.C2393x;
import com.google.android.apps.gsa.binaries.satin.app.C74176nj;
import com.google.android.apps.search.googleapp.saves.savefeature.p10392a.C137273o;
import com.google.android.apps.search.googleapp.saves.savefeature.p10392a.p10395c.C137243a;
import com.google.android.apps.search.googleapp.saves.savefeature.p10392a.p10395c.C137244b;
import com.google.android.apps.search.googleapp.saves.savefeature.p10400ui.p10402b.C137347d;
import com.google.android.apps.search.googleapp.saves.savefeature.p10400ui.p10402b.C137349f;
import com.google.android.apps.search.googleapp.saves.savefeature.p10400ui.p10403c.C137354b;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.logging.p2185ve.C28306ab;
import com.google.android.libraries.logging.p2185ve.C28427h;
import com.google.android.libraries.logging.p2185ve.C28443m;
import com.google.android.libraries.p1623at.p1632e.C19559g;
import com.google.apps.tiktok.account.AccountId;
import com.google.apps.tiktok.dataservice.C46801dp;
import com.google.apps.tiktok.inject.C47200b;
import com.google.apps.tiktok.inject.C47214c;
import com.google.apps.tiktok.inject.C47231d;
import com.google.apps.tiktok.inject.baseclasses.TracedFragmentLifecycle;
import com.google.apps.tiktok.inject.p3659d.C47232a;
import com.google.apps.tiktok.inject.p3659d.C47233b;
import com.google.apps.tiktok.inject.p3659d.C47236e;
import com.google.apps.tiktok.inject.p3659d.C47242k;
import com.google.apps.tiktok.inject.p3659d.C47243l;
import com.google.apps.tiktok.inject.p3660e.p3661a.C47247a;
import com.google.apps.tiktok.tracing.C47515ab;
import com.google.apps.tiktok.tracing.C47570bu;
import com.google.apps.tiktok.tracing.C47573bx;
import com.google.apps.tiktok.tracing.C47586cj;
import com.google.apps.tiktok.tracing.C47591co;
import com.google.apps.tiktok.tracing.C47770dh;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.apps.tiktok.tracing.C47816ey;
import com.google.apps.tiktok.tracing.C47831fm;
import com.google.common.base.C58838bb;
import com.google.p4283bv.p4369f.p4370a.p4371a.C57648i;
import com.google.p4283bv.p4369f.p4370a.p4371a.C57665z;
import com.google.protobuf.C62921ba;
import com.google.protobuf.contrib.android.ProtoParsers;
import dagger.hilt.android.internal.managers.C68324h;
import dagger.hilt.p5299a.C68288b;
import dagger.p5294a.C68221g;
import dagger.p5294a.C68225k;
import java.util.Locale;

/* renamed from: com.google.android.apps.search.googleapp.saves.savefeature.ui.s */
/* compiled from: PG */
public final class C137370s extends C137342az implements C47231d, C68288b, C47200b, C47233b, C47570bu {

    /* renamed from: a */
    private C137377z f373654a;

    /* renamed from: c */
    private Context f373655c;

    /* renamed from: d */
    private final C2393x f373656d = new C2393x(this);

    /* renamed from: e */
    private boolean f373657e;

    @Deprecated
    public C137370s() {
        C19559g.m37304c();
    }

    /* renamed from: a */
    static C137370s m223196a(AccountId accountId, C137354b bVar) {
        C137370s sVar = new C137370s();
        C68324h.m98669f(sVar);
        C47247a.m84047b(sVar, accountId);
        C47243l.m84039a(sVar, bVar);
        return sVar;
    }

    /* renamed from: b */
    public final C137377z mo17754z() {
        C137377z zVar = this.f373654a;
        if (zVar == null) {
            throw new IllegalStateException("peer() called before initialized.");
        } else if (!this.f373657e) {
            return zVar;
        } else {
            throw new IllegalStateException("peer() called after destroyed.");
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final /* synthetic */ C47247a mo113667d() {
        return new C47242k(this);
    }

    @Deprecated
    /* renamed from: e */
    public final Context mo17857e() {
        if (this.f373655c == null) {
            this.f373655c = new C47236e((Fragment) this, super.getContext());
        }
        return this.f373655c;
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
        return this.f373656d;
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
            C137369r.m223195a(th, th);
        }
        throw th;
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.f122869b.mo51381i();
        try {
            mo51119t(layoutInflater, viewGroup, bundle);
            C137377z b = mo17754z();
            View inflate = layoutInflater.inflate(R.layout.googleapp_list_picker_fragment, viewGroup, false);
            inflate.setOnTouchListener(new C47586cj(b.f373672g, new C137349f(new C137347d(new C137373v(inflate))), "ListPickerRootView onTouch"));
            C28306ab abVar = b.f373673h;
            abVar.mo33801b(inflate, abVar.f76990a.mo33805a(C28427h.m53115a(38841)));
            RecyclerView recyclerView = (RecyclerView) inflate.findViewById(R.id.googleapp_list_view);
            recyclerView.setLayoutManager(new LinearLayoutManager(b.f373669d.getContext()));
            recyclerView.setAdapter(b.f373676k);
            TextView textView = (TextView) inflate.findViewById(R.id.googleapp_create_list);
            C28306ab abVar2 = b.f373673h;
            abVar2.mo33801b(textView, abVar2.f76990a.mo33805a(C28427h.m53115a(37321)));
            textView.setOnClickListener(new C47591co(b.f373672g, "CreateList onClick", new C137374w(b, textView)));
            C137243a aVar = (C137243a) C137244b.f373386c.createBuilder();
            C57665z a = C57665z.m88512a(b.f373668c.f373621a);
            if (a == null) {
                a = C57665z.UNRECOGNIZED;
            }
            aVar.copyOnWrite();
            ((C137244b) aVar.instance).f373388a = a.getNumber();
            C57648i iVar = b.f373668c.f373622b;
            if (iVar != null) {
                aVar.copyOnWrite();
                ((C137244b) aVar.instance).f373389b = iVar;
            }
            b.f373671f.mo50707a(new C137273o(b.f373670e, (C137244b) aVar.build()), b.f373677l);
            C47831fm.m85019n();
            return inflate;
        } catch (Throwable th) {
            C137369r.m223195a(th, th);
        }
        throw th;
    }

    public final void onDetach() {
        C47573bx d = this.f122869b.mo51376d();
        try {
            mo51114o();
            this.f373657e = true;
            d.close();
            return;
        } catch (Throwable th) {
            C137369r.m223195a(th, th);
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
            C137369r.m223195a(th, th);
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
            if (!this.f373657e) {
                super.onAttach(context);
                if (this.f373654a == null) {
                    Object jN = mo113668f().mo17653jN();
                    AccountId accountId = (AccountId) ((C74176nj) jN).f206730b.f198239e.mo17428b();
                    Bundle b = ((C74176nj) jN).mo69504b();
                    C58838bb.m90869d(b.containsKey("TIKTOK_FRAGMENT_ARGUMENT"), "Proto @Argument for Fragment could not be found. @Arguments must be provided using the Fragment#create(MessageLite argument) overload.");
                    C137354b bVar = (C137354b) ProtoParsers.m95522e(b, "TIKTOK_FRAGMENT_ARGUMENT", C137354b.f373619c, (C62921ba) ((C74176nj) jN).f206677a.gG.mo17428b());
                    C68225k.m98532d(bVar);
                    Fragment fragment = (Fragment) ((C68221g) ((C74176nj) jN).f206889e).f184583a;
                    if (fragment instanceof C137370s) {
                        C137370s sVar = (C137370s) fragment;
                        C68225k.m98532d(sVar);
                        this.f373654a = new C137377z(accountId, bVar, sVar, ((C74176nj) jN).mo69641de(), (C46801dp) ((C74176nj) jN).f207084k.mo17428b(), (C47770dh) ((C74176nj) jN).f206730b.f198663m.mo17428b(), (C28306ab) ((C74176nj) jN).f206677a.a.f202880fS.mo17428b(), (C28443m) ((C74176nj) jN).f206677a.a.f202879fR.mo17428b());
                        super.getLifecycle().mo5790b(new TracedFragmentLifecycle(this.f122869b, this.f373656d));
                    } else {
                        String obj = C137377z.class.toString();
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
                C137369r.m223195a(th, th2);
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
