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
import com.google.android.apps.search.googleapp.amp.p10138a.C133459h;
import com.google.android.apps.search.googleapp.stampviewer.p10488b.C139343y;
import com.google.android.apps.search.googleapp.stampviewer.p10489c.C139352h;
import com.google.android.apps.search.googleapp.stampviewer.p10489c.C139356l;
import com.google.android.apps.search.googleapp.stampviewer.p10489c.C139359o;
import com.google.android.apps.search.googleapp.stampviewer.p10494f.C139391a;
import com.google.android.apps.search.googleapp.stampviewer.p10494f.C139392b;
import com.google.android.apps.search.googleapp.stampviewer.p10499j.C139434a;
import com.google.android.apps.search.googleapp.stampviewer.webview.C139618h;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.logging.p2185ve.C28306ab;
import com.google.android.libraries.logging.p2185ve.C28427h;
import com.google.android.libraries.p1623at.p1632e.C19559g;
import com.google.android.libraries.web.base.C43264o;
import com.google.android.libraries.web.base.C43265p;
import com.google.android.libraries.web.base.C43266q;
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
import com.google.protobuf.C62942bv;
import dagger.hilt.p5299a.C68288b;
import java.util.Locale;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.googleapp.stampviewer.preview.b */
/* compiled from: PG */
public final class C139456b extends C139447ad implements C47231d, C68288b, C47200b, C47233b, C47570bu {

    /* renamed from: a */
    private C139457c f379206a;

    /* renamed from: c */
    private Context f379207c;

    /* renamed from: d */
    private final C2393x f379208d = new C2393x(this);

    /* renamed from: e */
    private boolean f379209e;

    @Deprecated
    public C139456b() {
        C19559g.m37304c();
    }

    /* renamed from: a */
    public final C139457c mo17754z() {
        C139457c cVar = this.f379206a;
        if (cVar == null) {
            throw new IllegalStateException("peer() called before initialized.");
        } else if (!this.f379209e) {
            return cVar;
        } else {
            throw new IllegalStateException("peer() called after destroyed.");
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final /* synthetic */ C47222f mo114971b() {
        return C47244m.m84043e(this);
    }

    @Deprecated
    /* renamed from: e */
    public final Context mo17857e() {
        if (this.f379207c == null) {
            this.f379207c = new C47236e((Fragment) this, super.getContext());
        }
        return this.f379207c;
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
        return this.f379208d;
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
            C139443a.m226597a(th, th);
        }
        throw th;
    }

    public final void onCreate(Bundle bundle) {
        this.f122869b.mo51381i();
        try {
            mo51111l(bundle);
            C139457c a = mo17754z();
            a.f379215f.mo50429i(a.f379223n);
            a.f379215f.mo50429i(a.f379224o);
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C139443a.m226597a(th, th);
        }
        throw th;
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.f122869b.mo51381i();
        try {
            mo51119t(layoutInflater, viewGroup, bundle);
            C139457c a = mo17754z();
            C69664n.m101061g(layoutInflater, "layoutInflater");
            a.f379221l = (C139483z) new C2368bp(a.f379212c).mo5770a(C139483z.class);
            View inflate = layoutInflater.inflate(R.layout.googleapp_stamp_viewer_inline_preview_fragment, viewGroup, false);
            C43264o oVar = (C43264o) a.f379212c.getChildFragmentManager().f634a.mo671c("INLINE_WEB_COORDINATOR_FRAGMENT");
            if (((C139618h) (oVar != null ? oVar.mo17754z().mo46379a() : null)) == null) {
                C43264o a2 = C43265p.m76349a(a.f379211b, a.f379216g.mo115013a());
                C0154a aVar = new C0154a(a.f379212c.getChildFragmentManager());
                aVar.mo511h(R.id.googleapp_inline_stamp_viewer_container, a2, "INLINE_WEB_COORDINATOR_FRAGMENT", 1);
                aVar.mo509f();
                C43266q f = a2.mo17754z();
                AccountId accountId = a.f379211b;
                C56610b bVar = a.f379213d;
                C139434a aVar2 = a.f379214e;
                C133459h a3 = aVar2.mo114961a(bVar.f151144c, false, false, true);
                a3.mo111164b("prerenderSize");
                a3.mo111165c("visibilityState", "preview");
                a3.mo111165c("previewSecondsPerPage", String.valueOf(aVar2.f379137a.f169860a));
                a3.mo111165c("hideProgressBar", "0");
                a3.mo111165c("minPreviewPages", String.valueOf(aVar2.f379138b));
                a3.mo111165c("pctPagesToPreview", String.valueOf(aVar2.f379139c));
                String uri = a3.mo111163a().toString();
                C56609a aVar3 = (C56609a) bVar.toBuilder();
                aVar3.copyOnWrite();
                C56610b bVar2 = (C56610b) aVar3.instance;
                uri.getClass();
                bVar2.f151142a |= 2;
                bVar2.f151144c = uri;
                C62942bv build = aVar3.build();
                C69664n.m101060f(build, "ampDocumentIn.toBuilder(…setCdnUrl(cdnUrl).build()");
                C56610b bVar3 = (C56610b) build;
                C139391a aVar4 = (C139391a) C139392b.f379029j.createBuilder();
                C69664n.m101060f(aVar4, "newBuilder()");
                C69664n.m101061g(aVar4, "builder");
                C69664n.m101061g(bVar3, "value");
                aVar4.copyOnWrite();
                C139392b bVar4 = (C139392b) aVar4.instance;
                bVar3.getClass();
                bVar4.f379032b = bVar3;
                bVar4.f379031a |= 1;
                C139343y yVar = C139343y.VIEWER_MODE_INLINE;
                C69664n.m101061g(yVar, "value");
                aVar4.copyOnWrite();
                C139392b bVar5 = (C139392b) aVar4.instance;
                bVar5.f379037g = yVar.f378967d;
                bVar5.f379031a |= 32;
                C62942bv build2 = aVar4.build();
                C69664n.m101060f(build2, "_builder.build()");
                f.mo46380b(C139618h.m226960a(accountId, (C139392b) build2));
            }
            C28306ab abVar = a.f379210a;
            abVar.mo33801b(inflate, abVar.f76990a.mo33805a(C28427h.m53115a(137298)));
            a.f379225p = 1;
            C69664n.m101060f(inflate, "root");
            if (inflate != null) {
                C47831fm.m85019n();
                return inflate;
            }
            throw new NullPointerException("Fragment cannot use Event annotations with null view!");
        } catch (Throwable th) {
            C139443a.m226597a(th, th);
        }
        throw th;
    }

    public final void onDestroy() {
        C47573bx b = this.f122869b.mo51374b();
        try {
            mo51112m();
            mo17754z().mo114987c(4);
            b.close();
            return;
        } catch (Throwable th) {
            C139443a.m226597a(th, th);
        }
        throw th;
    }

    public final void onDetach() {
        C47573bx d = this.f122869b.mo51376d();
        try {
            mo51114o();
            this.f379209e = true;
            d.close();
            return;
        } catch (Throwable th) {
            C139443a.m226597a(th, th);
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
            C139443a.m226597a(th, th);
        }
        throw th;
    }

    public final void onPause() {
        this.f122869b.mo51381i();
        try {
            mo51115p();
            mo17754z().mo114987c(3);
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C139443a.m226597a(th, th);
        }
        throw th;
    }

    public final void onResume() {
        C47573bx e = this.f122869b.mo51377e();
        try {
            mo51116q();
            mo17754z().mo114987c(1);
            e.close();
            return;
        } catch (Throwable th) {
            C139443a.m226597a(th, th);
        }
        throw th;
    }

    public final void onStop() {
        this.f122869b.mo51381i();
        try {
            mo51118s();
            mo17754z().mo114987c(2);
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C139443a.m226597a(th, th);
        }
        throw th;
    }

    public final void onViewCreated(View view, Bundle bundle) {
        this.f122869b.mo51381i();
        try {
            C47389c.m84226a(getContext()).f123128b = view;
            C139457c a = mo17754z();
            C47393f.m84233d(this, C139356l.class, new C139461e(a));
            C47393f.m84233d(this, C139352h.class, new C139462f(a));
            C47393f.m84233d(this, C139359o.class, new C139463g(a));
            this.f54442o.mo24720k(bundle);
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C139443a.m226597a(th, th);
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
            if (!this.f379209e) {
                super.onAttach(context);
                if (this.f379206a == null) {
                    this.f379206a = ((C139464h) mo114972d().mo17653jN()).mo114988dG();
                    super.getLifecycle().mo5790b(new TracedFragmentLifecycle(this.f122869b, this.f379208d));
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
                C139443a.m226597a(th, th2);
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
