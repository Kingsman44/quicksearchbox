package com.google.android.apps.search.podcasts.searchresults;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.p031v4.app.Fragment;
import android.support.p033v7.widget.C0660fv;
import android.support.p033v7.widget.RecyclerView;
import android.support.p033v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.C2384o;
import androidx.lifecycle.C2393x;
import com.evernote.android.state.BuildConfig;
import com.google.android.apps.gsa.binaries.satin.app.C74176nj;
import com.google.android.apps.search.podcasts.p10566g.C140379g;
import com.google.android.apps.search.podcasts.p10569h.C140385d;
import com.google.android.apps.search.podcasts.p10591p.C140749o;
import com.google.android.apps.search.podcasts.p10600q.C140951j;
import com.google.android.apps.search.podcasts.p10601r.p10602a.C140957c;
import com.google.android.apps.search.podcasts.searchresults.C141037b;
import com.google.android.apps.search.podcasts.searchresults.p10611a.C141029d;
import com.google.android.apps.search.podcasts.searchresults.p10611a.C141034i;
import com.google.android.apps.search.podcasts.searchresults.p10611a.C141035j;
import com.google.android.apps.search.podcasts.widgets.fullscreenmessage.C141250a;
import com.google.android.apps.search.podcasts.widgets.fullscreenmessage.C141251b;
import com.google.android.apps.search.podcasts.widgets.fullscreenmessage.C141254e;
import com.google.android.apps.search.podcasts.widgets.fullscreenmessage.FullScreenMessageView;
import com.google.android.apps.search.podcasts.widgets.p10621c.C141213d;
import com.google.android.apps.search.podcasts.widgets.p10621c.C141215f;
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
import com.google.android.material.appbar.AppBarLayout;
import com.google.apps.tiktok.cache.C46407v;
import com.google.apps.tiktok.contrib.p3629c.C46485f;
import com.google.apps.tiktok.contrib.p3629c.C46490k;
import com.google.apps.tiktok.dataservice.C46689ag;
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
import com.google.p4017at.p4082j.p4083a.C54297aa;
import com.google.protobuf.C62921ba;
import com.google.protobuf.contrib.android.ProtoParsers;
import dagger.hilt.p5299a.C68288b;
import dagger.p5294a.C68221g;
import dagger.p5294a.C68225k;
import java.util.Locale;
import java.util.concurrent.Executor;
import p5462h.p5463a.C69540x;
import p5462h.p5473f.p5475b.C69664n;

/* compiled from: PG */
public final class SearchResultsFragment extends C141046j implements C47231d, C68288b, C47200b, C47233b, C47570bu {

    /* renamed from: a */
    private C141037b f382862a;

    /* renamed from: c */
    private Context f382863c;

    /* renamed from: d */
    private final C2393x f382864d = new C2393x(this);

    /* renamed from: e */
    private boolean f382865e;

    @Deprecated
    public SearchResultsFragment() {
        C19559g.m37304c();
    }

    /* renamed from: a */
    public final C141037b mo17754z() {
        C141037b bVar = this.f382862a;
        if (bVar == null) {
            throw new IllegalStateException("peer() called before initialized.");
        } else if (!this.f382865e) {
            return bVar;
        } else {
            throw new IllegalStateException("peer() called after destroyed.");
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final /* synthetic */ C47247a mo116087b() {
        return new C47242k(this);
    }

    @Deprecated
    /* renamed from: e */
    public final Context mo17857e() {
        if (this.f382863c == null) {
            this.f382863c = new C47236e((Fragment) this, super.getContext());
        }
        return this.f382863c;
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
        return this.f382864d;
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
            C141025a.m228998a(th, th);
        }
        throw th;
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C46689ag agVar;
        C141043g gVar;
        C141041e eVar;
        C141043g gVar2;
        this.f122869b.mo51381i();
        try {
            mo51119t(layoutInflater, viewGroup, bundle);
            C141037b a = mo17754z();
            C69664n.m101061g(layoutInflater, "inflater");
            View inflate = layoutInflater.inflate(R.layout.podcasts_search_results_fragment, viewGroup, false);
            AppBarLayout appBarLayout = (AppBarLayout) inflate.findViewById(R.id.podcasts_appbar_layout);
            C69664n.m101060f(appBarLayout, BuildConfig.FLAVOR);
            C141215f.m229224b(appBarLayout);
            Toolbar toolbar = (Toolbar) appBarLayout.findViewById(R.id.podcasts_appbar_header_toolbar);
            C141213d dVar = a.f382890h;
            C69664n.m101060f(toolbar, "this");
            dVar.mo116228c(toolbar);
            C141045i iVar = a.f382884b;
            int i = iVar.f382908a;
            if (i == 1) {
                toolbar.mo2423x(((C141043g) iVar.f382909b).f382905a);
                C46485f fVar = a.f382891i;
                C141045i iVar2 = a.f382884b;
                if (iVar2.f382908a == 1) {
                    gVar2 = (C141043g) iVar2.f382909b;
                } else {
                    gVar2 = C141043g.f382903b;
                }
                toolbar.setOnClickListener(fVar.mo50480a(R.id.podcasts_action_to_search, C46490k.m82869b(gVar2.f382905a).mo50504d(), "Clicked appbar to re-search"));
            } else {
                if (i == 2) {
                    eVar = (C141041e) iVar.f382909b;
                } else {
                    eVar = C141041e.f382899c;
                }
                toolbar.mo2423x(eVar.f382901a);
            }
            View findViewById = inflate.findViewById(R.id.podcasts_search_results_recycler);
            C69664n.m101060f(findViewById, "rootView.findViewById(R.…_search_results_recycler)");
            RecyclerView recyclerView = (RecyclerView) findViewById;
            C141230b.m229247a(recyclerView, C69540x.m100944b(Integer.valueOf(R.layout.podcasts_feed_episode_item)));
            Context context = inflate.getContext();
            C69664n.m101060f(context, "rootView.context");
            recyclerView.addItemDecoration$ar$ds(C141259b.m229290a(context));
            Context context2 = inflate.getContext();
            C69664n.m101060f(context2, "rootView.context");
            recyclerView.addItemDecoration$ar$ds(C141261d.m229291a(context2));
            RootBindableController$Builder a2 = C31972au.m59570a(a.f382885c, C140951j.m228908b(recyclerView, a.f382888f.f381203a.mo116036a(), a.f382889g));
            a2.f85926a = true;
            a.f382896n = a2.mo37724a();
            C46801dp dpVar = a.f382886d;
            C141045i iVar3 = a.f382884b;
            int i2 = iVar3.f382908a;
            if (i2 == 2) {
                C141035j jVar = a.f382887e;
                C54297aa aaVar = ((C141041e) iVar3.f382909b).f382902b;
                if (aaVar == null) {
                    aaVar = C54297aa.f142650b;
                }
                C69664n.m101060f(aaVar, "args.result.feed");
                C69664n.m101061g(aaVar, "feed");
                agVar = new C141029d(jVar, aaVar);
            } else {
                C141035j jVar2 = a.f382887e;
                if (i2 == 1) {
                    gVar = (C141043g) iVar3.f382909b;
                } else {
                    gVar = C141043g.f382903b;
                }
                String str = gVar.f382905a;
                C69664n.m101060f(str, "args.query.query");
                C69664n.m101061g(str, "query");
                agVar = new C141034i(str, jVar2);
            }
            dpVar.mo50707a(agVar, new C141037b.C141038a());
            FullScreenMessageView fullScreenMessageView = (FullScreenMessageView) inflate.findViewById(R.id.podcasts_search_results_message_layer);
            if (fullScreenMessageView != null) {
                C141254e a3 = fullScreenMessageView.mo17754z();
                a3.f383493b = new C141251b(R.drawable.quantum_gm_ic_search_vd_theme_24, Integer.valueOf(R.attr.colorOnSurfaceVariantCustom), R.string.podcasts_empty_search_results, (Integer) null, Integer.valueOf(R.string.podcasts_search_the_web), new C141039c(a));
                a3.f383492a = C141250a.m229282a(R.string.podcasts_generic_error_message, R.string.podcasts_error_loading_feed_secondary, (Integer) null, (View.OnClickListener) null);
            }
            a.f382892j.f76997b.mo33800a(C28427h.m53115a(40821)).mo33809b(inflate);
            a.f382892j.f76997b.mo33800a(C28427h.m53115a(41727)).mo33809b(recyclerView);
            C69664n.m101060f(inflate, "rootView");
            C47831fm.m85019n();
            return inflate;
        } catch (Throwable th) {
            C141025a.m228998a(th, th);
        }
        throw th;
    }

    public final void onDestroyView() {
        C47573bx c = this.f122869b.mo51375c();
        try {
            mo51113n();
            C141037b a = mo17754z();
            a.f382895m = null;
            C31974aw awVar = a.f382896n;
            if (awVar != null) {
                awVar.mo37741b();
            }
            a.f382896n = null;
            c.close();
            return;
        } catch (Throwable th) {
            C141025a.m228998a(th, th);
        }
        throw th;
    }

    public final void onDetach() {
        C47573bx d = this.f122869b.mo51376d();
        try {
            mo51114o();
            this.f382865e = true;
            d.close();
            return;
        } catch (Throwable th) {
            C141025a.m228998a(th, th);
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
            C141025a.m228998a(th, th);
        }
        throw th;
    }

    public final void onResume() {
        C47573bx e = this.f122869b.mo51377e();
        try {
            mo51116q();
            C141037b a = mo17754z();
            a.mo116092b(a.f382895m);
            e.close();
            return;
        } catch (Throwable th) {
            C141025a.m228998a(th, th);
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
            if (!this.f382865e) {
                super.onAttach(context);
                if (this.f382862a == null) {
                    Object jN = mo116095d().mo17653jN();
                    Bundle b = ((C74176nj) jN).mo69504b();
                    C58838bb.m90869d(b.containsKey("TIKTOK_FRAGMENT_ARGUMENT"), "Proto @Argument for Fragment could not be found. @Arguments must be provided using the Fragment#create(MessageLite argument) overload.");
                    C141045i iVar = (C141045i) ProtoParsers.m95522e(b, "TIKTOK_FRAGMENT_ARGUMENT", C141045i.f382906c, (C62921ba) ((C74176nj) jN).f206677a.gG.mo17428b());
                    C68225k.m98532d(iVar);
                    Fragment fragment = (Fragment) ((C68221g) ((C74176nj) jN).f206889e).f184583a;
                    if (fragment instanceof SearchResultsFragment) {
                        SearchResultsFragment searchResultsFragment = (SearchResultsFragment) fragment;
                        C68225k.m98532d(searchResultsFragment);
                        C141037b bVar = r4;
                        C141037b bVar2 = new C141037b(iVar, searchResultsFragment, (C46801dp) ((C74176nj) jN).f207084k.mo17428b(), new C141035j((C46407v) ((C74176nj) jN).f206730b.f198027a.f199517gX.mo17428b(), (C140385d) ((C74176nj) jN).f206730b.f198027a.f199878x.mo17428b(), ((C74176nj) jN).mo69789gT(), (C140379g) ((C74176nj) jN).f206730b.f198027a.f199511gR.mo17428b(), ((C74176nj) jN).f206730b.f198027a.mo66834dG(), (Executor) ((C74176nj) jN).f206677a.n.mo17428b()), ((C74176nj) jN).mo69705ep(), (C0660fv) ((C74176nj) jN).f206759bc.mo17428b(), ((C74176nj) jN).mo69715ez(), (C46485f) ((C74176nj) jN).f206995g.mo17428b(), (C28310af) ((C74176nj) jN).f206677a.a.f202878fQ.mo17428b(), (C140749o) ((C74176nj) jN).f206677a.d.f201897x.mo17428b(), (C140957c) ((C74176nj) jN).f206730b.f198027a.f199513gT.mo17428b());
                        this.f382862a = bVar;
                        super.getLifecycle().mo5790b(new TracedFragmentLifecycle(this.f122869b, this.f382864d));
                    } else {
                        String obj = C141037b.class.toString();
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
            Throwable th2 = th;
            try {
                C47831fm.m85019n();
            } catch (Throwable th3) {
                C141025a.m228998a(th2, th3);
            }
            throw th2;
        }
    }

    public final void startActivity(Intent intent, Bundle bundle) {
        if (C47214c.m83984a(intent, getContext().getApplicationContext())) {
            int i = C47810es.f123822b;
        }
        super.startActivity(intent, bundle);
    }
}
