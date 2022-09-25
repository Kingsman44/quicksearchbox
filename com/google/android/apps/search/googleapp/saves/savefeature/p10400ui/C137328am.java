package com.google.android.apps.search.googleapp.saves.savefeature.p10400ui;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.p031v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.TextView;
import androidx.lifecycle.C2384o;
import androidx.lifecycle.C2393x;
import com.google.android.apps.gsa.binaries.satin.app.C74176nj;
import com.google.android.apps.search.googleapp.incognito.lifecycleobserver.IncognitoLifecycleObserver;
import com.google.android.apps.search.googleapp.incognito.p10324e.C136247a;
import com.google.android.apps.search.googleapp.saves.savefeature.p10400ui.p10401a.C137308f;
import com.google.android.apps.search.googleapp.saves.savefeature.p10400ui.p10401a.C137309g;
import com.google.android.apps.search.googleapp.saves.savefeature.p10400ui.p10401a.C137311i;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.p1623at.p1632e.C19559g;
import com.google.android.libraries.search.p2476a.p2482d.C32214c;
import com.google.apps.tiktok.account.AccountId;
import com.google.apps.tiktok.cache.InstanceStateStoreFactory;
import com.google.apps.tiktok.concurrent.futuresmixin.C46439e;
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
import com.google.apps.tiktok.p3674l.p3679c.C47400m;
import com.google.apps.tiktok.tracing.C47515ab;
import com.google.apps.tiktok.tracing.C47570bu;
import com.google.apps.tiktok.tracing.C47573bx;
import com.google.apps.tiktok.tracing.C47586cj;
import com.google.apps.tiktok.tracing.C47591co;
import com.google.apps.tiktok.tracing.C47770dh;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.apps.tiktok.tracing.C47816ey;
import com.google.apps.tiktok.tracing.C47831fm;
import com.google.p4283bv.p4369f.p4370a.p4371a.C57563ag;
import com.google.p4283bv.p4369f.p4370a.p4371a.C57565ai;
import com.google.p4283bv.p4369f.p4370a.p4371a.C57566aj;
import com.google.p4283bv.p4369f.p4370a.p4371a.C57576at;
import com.google.p4283bv.p4369f.p4370a.p4371a.C57578av;
import com.google.p4283bv.p4369f.p4370a.p4371a.C57665z;
import com.google.protobuf.C62912at;
import dagger.hilt.p5299a.C68288b;
import dagger.p5294a.C68221g;
import dagger.p5294a.C68225k;
import java.util.Locale;

/* renamed from: com.google.android.apps.search.googleapp.saves.savefeature.ui.am */
/* compiled from: PG */
public final class C137328am extends C137351bb implements C47231d, C68288b, C47200b, C47233b, C47570bu {

    /* renamed from: a */
    private C137332aq f373551a;

    /* renamed from: c */
    private Context f373552c;

    /* renamed from: d */
    private final C2393x f373553d = new C2393x(this);

    /* renamed from: e */
    private boolean f373554e;

    @Deprecated
    public C137328am() {
        C19559g.m37304c();
    }

    /* renamed from: a */
    public final C137332aq mo17754z() {
        C137332aq aqVar = this.f373551a;
        if (aqVar == null) {
            throw new IllegalStateException("peer() called before initialized.");
        } else if (!this.f373554e) {
            return aqVar;
        } else {
            throw new IllegalStateException("peer() called after destroyed.");
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final /* synthetic */ C47247a mo113653b() {
        return new C47242k(this);
    }

    @Deprecated
    /* renamed from: e */
    public final Context mo17857e() {
        if (this.f373552c == null) {
            this.f373552c = new C47236e((Fragment) this, super.getContext());
        }
        return this.f373552c;
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
        return this.f373553d;
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
            C137327al.m223117a(th, th);
        }
        throw th;
    }

    public final void onCreate(Bundle bundle) {
        this.f122869b.mo51381i();
        try {
            mo51111l(bundle);
            C137332aq a = mo17754z();
            a.f373563f.mo50429i(a.f373567j);
            a.f373560c.requireActivity().f2707h.mo3339b(a.f373560c, new C137331ap(a));
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C137327al.m223117a(th, th);
        }
        throw th;
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.f122869b.mo51381i();
        try {
            mo51119t(layoutInflater, viewGroup, bundle);
            C137332aq a = mo17754z();
            View inflate = layoutInflater.inflate(R.layout.googleapp_share_fragment, viewGroup, false);
            inflate.setOnTouchListener(new C47586cj(a.f373561d, new C137329an(a), "ShareRootView onTouch"));
            C57576at atVar = (C57576at) C57578av.f153822h.createBuilder();
            C57565ai aiVar = (C57565ai) C57566aj.f153791e.createBuilder();
            C57563ag agVar = C57563ag.FAVORITES;
            aiVar.copyOnWrite();
            ((C57566aj) aiVar.instance).f153794b = agVar.getNumber();
            aiVar.mo54517b(C57665z.WEB_PAGE);
            C57566aj ajVar = (C57566aj) aiVar.build();
            atVar.copyOnWrite();
            ajVar.getClass();
            ((C57578av) atVar.instance).f153824a = ajVar;
            String string = a.f373560c.getString(R.string.googleapp_save_feature_default_collection_label);
            atVar.copyOnWrite();
            string.getClass();
            ((C57578av) atVar.instance).f153828e = string;
            C57578av avVar = (C57578av) atVar.build();
            C137332aq.m223126c(inflate, avVar);
            a.f373564g.mo50381d(C62912at.f169862a, avVar);
            ((TextView) inflate.findViewById(R.id.googleapp_change_list_text)).setOnClickListener(new C47591co(a.f373561d, "ChangeList onClick", C137330ao.f373556a));
            Window window = a.f373560c.requireActivity().getWindow();
            WindowManager.LayoutParams attributes = window.getAttributes();
            if ((attributes.flags & 2) == 0) {
                window.addFlags(2);
                attributes.dimAmount = 0.6f;
                window.setAttributes(attributes);
            }
            if (inflate != null) {
                C47831fm.m85019n();
                return inflate;
            }
            throw new NullPointerException("Fragment cannot use Event annotations with null view!");
        } catch (Throwable th) {
            C137327al.m223117a(th, th);
        }
        throw th;
    }

    public final void onDetach() {
        C47573bx d = this.f122869b.mo51376d();
        try {
            mo51114o();
            this.f373554e = true;
            d.close();
            return;
        } catch (Throwable th) {
            C137327al.m223117a(th, th);
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
            C137327al.m223117a(th, th);
        }
        throw th;
    }

    public final void onViewCreated(View view, Bundle bundle) {
        this.f122869b.mo51381i();
        try {
            C47400m a = C47389c.m84226a(getContext());
            a.f123128b = view;
            C137332aq a2 = mo17754z();
            C47393f.m84233d(this, C137308f.class, new C137334ar(a2));
            C47393f.m84233d(this, C137311i.class, new C137335as(a2));
            C47393f.m84233d(this, C137309g.class, new C137336at(a2));
            C47393f.m84233d(this, C32214c.class, new C137337au(a2));
            a.mo51254d(a.f123128b.findViewById(R.id.googleapp_share_fragment_save_button), new C137338av(a2));
            this.f54442o.mo24720k(bundle);
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C137327al.m223117a(th, th);
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
            if (!this.f373554e) {
                super.onAttach(context);
                if (this.f373551a == null) {
                    Object jN = mo113680d().mo17653jN();
                    AccountId accountId = (AccountId) ((C74176nj) jN).f206730b.f198239e.mo17428b();
                    Fragment fragment = (Fragment) ((C68221g) ((C74176nj) jN).f206889e).f184583a;
                    if (fragment instanceof C137328am) {
                        C137328am amVar = (C137328am) fragment;
                        C68225k.m98532d(amVar);
                        this.f373551a = new C137332aq(accountId, amVar, (C47770dh) ((C74176nj) jN).f206730b.f198663m.mo17428b(), ((C74176nj) jN).mo69641de(), (InstanceStateStoreFactory) ((C74176nj) jN).f206683aF.mo17428b(), (C46439e) ((C74176nj) jN).f206942f.mo17428b(), (IncognitoLifecycleObserver) ((C74176nj) jN).f206664N.mo17428b(), (C136247a) ((C74176nj) jN).f206662L.mo17428b());
                        super.getLifecycle().mo5790b(new TracedFragmentLifecycle(this.f122869b, this.f373553d));
                    } else {
                        String obj = C137332aq.class.toString();
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
                C137327al.m223117a(th, th2);
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
