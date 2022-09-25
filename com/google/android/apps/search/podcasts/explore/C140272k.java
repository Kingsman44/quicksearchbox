package com.google.android.apps.search.podcasts.explore;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.p031v4.app.Fragment;
import android.support.p033v7.widget.C0660fv;
import android.support.p033v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.C2384o;
import androidx.lifecycle.C2393x;
import com.google.android.apps.gsa.binaries.satin.app.C74176nj;
import com.google.android.apps.search.podcasts.explore.C140273l;
import com.google.android.apps.search.podcasts.explore.p10564a.C140256i;
import com.google.android.apps.search.podcasts.explore.p10564a.C140260m;
import com.google.android.apps.search.podcasts.explore.p10564a.C140261n;
import com.google.android.apps.search.podcasts.p10566g.p10567a.C140333a;
import com.google.android.apps.search.podcasts.p10591p.C140749o;
import com.google.android.apps.search.podcasts.p10600q.C140951j;
import com.google.android.apps.search.podcasts.p10601r.p10602a.C140957c;
import com.google.android.apps.search.podcasts.widgets.fullscreenmessage.C141250a;
import com.google.android.apps.search.podcasts.widgets.fullscreenmessage.FullScreenMessageView;
import com.google.android.apps.search.podcasts.widgets.p10623e.C141230b;
import com.google.android.apps.search.podcasts.widgets.p10625g.C141259b;
import com.google.android.apps.search.podcasts.widgets.p10625g.C141261d;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.logging.p2185ve.C28310af;
import com.google.android.libraries.logging.p2185ve.C28427h;
import com.google.android.libraries.p1623at.p1632e.C19559g;
import com.google.android.libraries.play.unison.binding.C31972au;
import com.google.android.libraries.play.unison.binding.C31974aw;
import com.google.android.libraries.play.unison.binding.RootBindableController$Builder;
import com.google.apps.tiktok.dataservice.C46689ag;
import com.google.apps.tiktok.dataservice.C46726bj;
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
import com.google.apps.tiktok.tracing.C47515ab;
import com.google.apps.tiktok.tracing.C47570bu;
import com.google.apps.tiktok.tracing.C47573bx;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.apps.tiktok.tracing.C47816ey;
import com.google.apps.tiktok.tracing.C47831fm;
import com.google.common.base.C58838bb;
import com.google.protobuf.C62921ba;
import com.google.protobuf.contrib.android.ProtoParsers;
import dagger.hilt.p5299a.C68288b;
import dagger.p5294a.C68221g;
import dagger.p5294a.C68225k;
import java.util.Locale;
import p5462h.p5463a.C69540x;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.podcasts.explore.k */
/* compiled from: PG */
public final class C140272k extends C140277o implements C47231d, C68288b, C47200b, C47233b, C47570bu {

    /* renamed from: a */
    private C140273l f381074a;

    /* renamed from: c */
    private Context f381075c;

    /* renamed from: d */
    private final C2393x f381076d = new C2393x(this);

    /* renamed from: e */
    private boolean f381077e;

    @Deprecated
    public C140272k() {
        C19559g.m37304c();
    }

    /* renamed from: a */
    public final C140273l mo17754z() {
        C140273l lVar = this.f381074a;
        if (lVar == null) {
            throw new IllegalStateException("peer() called before initialized.");
        } else if (!this.f381077e) {
            return lVar;
        } else {
            throw new IllegalStateException("peer() called after destroyed.");
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final /* synthetic */ C47247a mo115539b() {
        return new C47242k(this);
    }

    @Deprecated
    /* renamed from: e */
    public final Context mo17857e() {
        if (this.f381075c == null) {
            this.f381075c = new C47236e((Fragment) this, super.getContext());
        }
        return this.f381075c;
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
        return this.f381076d;
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
            C140271j.m227974a(th, th);
        }
        throw th;
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C46689ag agVar;
        this.f122869b.mo51381i();
        try {
            mo51119t(layoutInflater, viewGroup, bundle);
            C140273l a = mo17754z();
            C69664n.m101061g(layoutInflater, "inflater");
            View inflate = layoutInflater.inflate(R.layout.podcasts_explore_tab_fragment, viewGroup, false);
            View findViewById = inflate.findViewById(R.id.podcasts_explore_tab_recycler_view);
            C69664n.m101060f(findViewById, "rootView.findViewById(R.…xplore_tab_recycler_view)");
            RecyclerView recyclerView = (RecyclerView) findViewById;
            RootBindableController$Builder a2 = C31972au.m59570a(a.f381084g, C140951j.m228908b(recyclerView, a.f381082e.f381203a.mo116036a(), a.f381083f));
            a2.f85926a = true;
            a.f381089l = a2.mo37724a();
            C141230b.m229247a(recyclerView, C69540x.m100944b(Integer.valueOf(R.layout.podcasts_feed_episode_item)));
            Context requireContext = a.f381084g.requireContext();
            C69664n.m101060f(requireContext, "fragment.requireContext()");
            recyclerView.addItemDecoration$ar$ds(C141259b.m229290a(requireContext));
            Context context = inflate.getContext();
            C69664n.m101060f(context, "rootView.context");
            recyclerView.addItemDecoration$ar$ds(C141261d.m229291a(context));
            ((FullScreenMessageView) inflate.findViewById(R.id.podcasts_explore_tab_message_layer)).mo17754z().f383492a = C141250a.m229282a(R.string.podcasts_generic_error_message, R.string.podcasts_error_loading_feed_secondary, Integer.valueOf(R.string.podcasts_retry_load), C140275m.f381091a);
            C46801dp dpVar = a.f381080c;
            C140262b bVar = a.f381079b;
            if (bVar.f381051a) {
                C140261n nVar = a.f381081d;
                agVar = new C46726bj(nVar.f381047f, "DiscoverTabs", new C140260m(nVar));
            } else {
                C140261n nVar2 = a.f381081d;
                String str = bVar.f381052b;
                C69664n.m101060f(str, "exploreArgs.tabId");
                C69664n.m101061g(str, "tabId");
                agVar = new C140256i(nVar2, str);
            }
            dpVar.mo50707a(agVar, new C140273l.C140274a());
            if (a.f381079b.f381051a) {
                a.f381085h.f76997b.mo33800a(C28427h.m53115a(93992)).mo33809b(inflate);
            }
            C47831fm.m85019n();
            return inflate;
        } catch (Throwable th) {
            C140271j.m227974a(th, th);
        }
        throw th;
    }

    public final void onDestroyView() {
        C47573bx c = this.f122869b.mo51375c();
        try {
            mo51113n();
            C140273l a = mo17754z();
            a.f381088k = null;
            C31974aw awVar = a.f381089l;
            if (awVar != null) {
                awVar.mo37741b();
            }
            a.f381089l = null;
            c.close();
            return;
        } catch (Throwable th) {
            C140271j.m227974a(th, th);
        }
        throw th;
    }

    public final void onDetach() {
        C47573bx d = this.f122869b.mo51376d();
        try {
            mo51114o();
            this.f381077e = true;
            d.close();
            return;
        } catch (Throwable th) {
            C140271j.m227974a(th, th);
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
            C140271j.m227974a(th, th);
        }
        throw th;
    }

    public final void onResume() {
        C47573bx e = this.f122869b.mo51377e();
        try {
            mo51116q();
            C140273l a = mo17754z();
            a.mo115540a(a.f381088k);
            e.close();
            return;
        } catch (Throwable th) {
            C140271j.m227974a(th, th);
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
            if (!this.f381077e) {
                super.onAttach(context);
                if (this.f381074a == null) {
                    Object jN = mo115545d().mo17653jN();
                    Bundle b = ((C74176nj) jN).mo69504b();
                    C58838bb.m90869d(b.containsKey("TIKTOK_FRAGMENT_ARGUMENT"), "Proto @Argument for Fragment could not be found. @Arguments must be provided using the Fragment#create(MessageLite argument) overload.");
                    C140262b bVar = (C140262b) ProtoParsers.m95522e(b, "TIKTOK_FRAGMENT_ARGUMENT", C140262b.f381049c, (C62921ba) ((C74176nj) jN).f206677a.gG.mo17428b());
                    C68225k.m98532d(bVar);
                    C46801dp dpVar = (C46801dp) ((C74176nj) jN).f207084k.mo17428b();
                    C140261n nVar = (C140261n) ((C74176nj) jN).f206730b.f198027a.f199512gS.mo17428b();
                    C140333a ep = ((C74176nj) jN).mo69705ep();
                    C0660fv fvVar = (C0660fv) ((C74176nj) jN).f206759bc.mo17428b();
                    Fragment fragment = (Fragment) ((C68221g) ((C74176nj) jN).f206889e).f184583a;
                    if (fragment instanceof C140272k) {
                        C140272k kVar = (C140272k) fragment;
                        C68225k.m98532d(kVar);
                        this.f381074a = new C140273l(bVar, dpVar, nVar, ep, fvVar, kVar, (C28310af) ((C74176nj) jN).f206677a.a.f202878fQ.mo17428b(), (C140749o) ((C74176nj) jN).f206677a.d.f201897x.mo17428b(), (C140957c) ((C74176nj) jN).f206730b.f198027a.f199513gT.mo17428b());
                        super.getLifecycle().mo5790b(new TracedFragmentLifecycle(this.f122869b, this.f381076d));
                    } else {
                        String obj = C140273l.class.toString();
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
                C140271j.m227974a(th, th2);
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
