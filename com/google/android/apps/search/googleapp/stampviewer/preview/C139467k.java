package com.google.android.apps.search.googleapp.stampviewer.preview;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.p031v4.app.C0154a;
import android.support.p031v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.C2368bp;
import androidx.lifecycle.C2384o;
import androidx.lifecycle.C2393x;
import com.google.android.apps.search.googleapp.stampviewer.C139433j;
import com.google.android.apps.search.googleapp.stampviewer.p10488b.C139323e;
import com.google.android.apps.search.googleapp.stampviewer.p10488b.C139324f;
import com.google.android.apps.search.googleapp.stampviewer.p10488b.C139325g;
import com.google.android.apps.search.googleapp.stampviewer.p10488b.C139326h;
import com.google.android.apps.search.googleapp.stampviewer.p10488b.C139343y;
import com.google.android.apps.search.googleapp.stampviewer.p10489c.C139351g;
import com.google.android.apps.search.googleapp.stampviewer.p10489c.C139352h;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.logging.p2185ve.C28427h;
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
import com.google.apps.tiktok.inject.p3659d.C47244m;
import com.google.apps.tiktok.p3674l.p3679c.C47389c;
import com.google.apps.tiktok.p3674l.p3679c.C47393f;
import com.google.apps.tiktok.tracing.C47515ab;
import com.google.apps.tiktok.tracing.C47570bu;
import com.google.apps.tiktok.tracing.C47573bx;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.apps.tiktok.tracing.C47816ey;
import com.google.apps.tiktok.tracing.C47831fm;
import com.google.p4283bv.p4287b.p4288a.p4289a.p4290a.C56609a;
import com.google.p4283bv.p4287b.p4288a.p4289a.p4290a.C56610b;
import dagger.hilt.p5299a.C68288b;
import java.util.Locale;

/* renamed from: com.google.android.apps.search.googleapp.stampviewer.preview.k */
/* compiled from: PG */
public final class C139467k extends C139448ae implements C47231d, C68288b, C47200b, C47233b, C47570bu {

    /* renamed from: a */
    private C139470n f379233a;

    /* renamed from: c */
    private Context f379234c;

    /* renamed from: d */
    private final C2393x f379235d = new C2393x(this);

    /* renamed from: e */
    private boolean f379236e;

    @Deprecated
    public C139467k() {
        C19559g.m37304c();
    }

    /* renamed from: a */
    public final C139470n mo17754z() {
        C139470n nVar = this.f379233a;
        if (nVar == null) {
            throw new IllegalStateException("peer() called before initialized.");
        } else if (!this.f379236e) {
            return nVar;
        } else {
            throw new IllegalStateException("peer() called after destroyed.");
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final /* synthetic */ C47222f mo114974b() {
        return C47244m.m84043e(this);
    }

    @Deprecated
    /* renamed from: e */
    public final Context mo17857e() {
        if (this.f379234c == null) {
            this.f379234c = new C47236e((Fragment) this, super.getContext());
        }
        return this.f379234c;
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
        return this.f379235d;
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
            C139466j.m226666a(th, th);
        }
        throw th;
    }

    public final void onCreate(Bundle bundle) {
        this.f122869b.mo51381i();
        try {
            mo51111l(bundle);
            C139470n a = mo17754z();
            a.f379243f.mo50429i(a.f379248k);
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C139466j.m226666a(th, th);
        }
        throw th;
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.f122869b.mo51381i();
        try {
            mo51119t(layoutInflater, viewGroup, bundle);
            C139470n a = mo17754z();
            View inflate = layoutInflater.inflate(R.layout.googleapp_stamp_viewer_inline_preview_fragment, viewGroup, false);
            if (((C139433j) a.f379240c.getChildFragmentManager().f634a.mo671c("STAMP_VIEWER_FRAGMENT")) == null) {
                AccountId accountId = a.f379238a;
                C56610b bVar = a.f379239b;
                String b = a.f379241d.mo114962b(bVar.f151144c, true, true);
                C56609a aVar = (C56609a) bVar.toBuilder();
                aVar.copyOnWrite();
                C56610b bVar2 = (C56610b) aVar.instance;
                b.getClass();
                bVar2.f151142a |= 2;
                bVar2.f151144c = b;
                C139323e eVar = (C139323e) C139324f.f378925k.createBuilder();
                eVar.mo114903b((C56610b) aVar.build());
                C139343y yVar = C139343y.VIEWER_MODE_INLINE;
                eVar.copyOnWrite();
                C139324f fVar = (C139324f) eVar.instance;
                fVar.f378936j = yVar.f378967d;
                fVar.f378927a |= 128;
                eVar.copyOnWrite();
                C139324f fVar2 = (C139324f) eVar.instance;
                fVar2.f378927a |= 64;
                fVar2.f378935i = true;
                C139325g gVar = (C139325g) C139326h.f378938c.createBuilder();
                gVar.copyOnWrite();
                C139326h hVar = (C139326h) gVar.instance;
                hVar.f378940a |= 1;
                hVar.f378941b = true;
                C139326h hVar2 = (C139326h) gVar.build();
                eVar.copyOnWrite();
                C139324f fVar3 = (C139324f) eVar.instance;
                hVar2.getClass();
                fVar3.f378933g = hVar2;
                fVar3.f378927a |= 16;
                C139433j a2 = C139433j.m226574a(accountId, (C139324f) eVar.build());
                C0154a aVar2 = new C0154a(a.f379240c.getChildFragmentManager());
                aVar2.mo511h(R.id.googleapp_inline_stamp_viewer_container, a2, "STAMP_VIEWER_FRAGMENT", 1);
                aVar2.mo509f();
            }
            a.f379246i.mo33801b(inflate, a.f379246i.f76990a.mo33805a(C28427h.m53115a(137298)));
            a.f379247j = (C139483z) new C2368bp(a.f379240c).mo5770a(C139483z.class);
            if (inflate != null) {
                C47831fm.m85019n();
                return inflate;
            }
            throw new NullPointerException("Fragment cannot use Event annotations with null view!");
        } catch (Throwable th) {
            C139466j.m226666a(th, th);
        }
        throw th;
    }

    public final void onDestroy() {
        C47573bx b = this.f122869b.mo51374b();
        try {
            mo51112m();
            mo17754z().mo114993c(4);
            b.close();
            return;
        } catch (Throwable th) {
            C139466j.m226666a(th, th);
        }
        throw th;
    }

    public final void onDetach() {
        C47573bx d = this.f122869b.mo51376d();
        try {
            mo51114o();
            this.f379236e = true;
            d.close();
            return;
        } catch (Throwable th) {
            C139466j.m226666a(th, th);
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
            C139466j.m226666a(th, th);
        }
        throw th;
    }

    public final void onPause() {
        this.f122869b.mo51381i();
        try {
            mo51115p();
            mo17754z().mo114993c(3);
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C139466j.m226666a(th, th);
        }
        throw th;
    }

    public final void onResume() {
        C47573bx e = this.f122869b.mo51377e();
        try {
            mo51116q();
            mo17754z().mo114993c(1);
            e.close();
            return;
        } catch (Throwable th) {
            C139466j.m226666a(th, th);
        }
        throw th;
    }

    public final void onStop() {
        this.f122869b.mo51381i();
        try {
            mo51118s();
            mo17754z().mo114993c(2);
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C139466j.m226666a(th, th);
        }
        throw th;
    }

    public final void onViewCreated(View view, Bundle bundle) {
        this.f122869b.mo51381i();
        try {
            C47389c.m84226a(getContext()).f123128b = view;
            C139470n a = mo17754z();
            C47393f.m84233d(this, C139352h.class, new C139472o(a));
            C47393f.m84233d(this, C139351g.class, new C139473p(a));
            this.f54442o.mo24720k(bundle);
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C139466j.m226666a(th, th);
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
            if (!this.f379236e) {
                super.onAttach(context);
                if (this.f379233a == null) {
                    this.f379233a = ((C139474q) mo114975d().mo17653jN()).mo114994dH();
                    super.getLifecycle().mo5790b(new TracedFragmentLifecycle(this.f122869b, this.f379235d));
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
                C139466j.m226666a(th, th2);
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
