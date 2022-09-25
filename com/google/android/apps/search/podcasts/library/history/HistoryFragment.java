package com.google.android.apps.search.podcasts.library.history;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.p031v4.app.Fragment;
import android.support.p033v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.C2384o;
import androidx.lifecycle.C2393x;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.evernote.android.state.BuildConfig;
import com.google.android.apps.gsa.binaries.satin.app.C74176nj;
import com.google.android.apps.search.podcasts.library.history.C140590b;
import com.google.android.apps.search.podcasts.library.history.p10582a.C140584a;
import com.google.android.apps.search.podcasts.library.history.p10582a.C140588e;
import com.google.android.apps.search.podcasts.library.history.p10582a.C140589f;
import com.google.android.apps.search.podcasts.p10550b.p10555e.C140084z;
import com.google.android.apps.search.podcasts.p10576l.C140459au;
import com.google.android.apps.search.podcasts.p10600q.C140951j;
import com.google.android.apps.search.podcasts.widgets.fullscreenmessage.C141251b;
import com.google.android.apps.search.podcasts.widgets.fullscreenmessage.FullScreenMessageView;
import com.google.android.apps.search.podcasts.widgets.p10623e.C141230b;
import com.google.android.apps.search.podcasts.widgets.p10625g.C141259b;
import com.google.android.apps.search.podcasts.widgets.p10625g.C141261d;
import com.google.android.apps.search.podcasts.widgets.p10627i.C141265c;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.logging.p2185ve.C28306ab;
import com.google.android.libraries.logging.p2185ve.C28427h;
import com.google.android.libraries.p1623at.p1632e.C19559g;
import com.google.android.libraries.play.unison.binding.C31972au;
import com.google.android.libraries.play.unison.binding.C31974aw;
import com.google.android.libraries.play.unison.binding.RootBindableController$Builder;
import com.google.apps.tiktok.dataservice.C46778cv;
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
import com.google.apps.tiktok.tracing.C47770dh;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.apps.tiktok.tracing.C47816ey;
import com.google.apps.tiktok.tracing.C47831fm;
import com.google.apps.tiktok.tracing.contrib.p3708i.p3712c.C47701a;
import dagger.hilt.p5299a.C68288b;
import dagger.p5294a.C68221g;
import dagger.p5294a.C68225k;
import java.util.Locale;
import p5462h.p5463a.C69540x;
import p5462h.p5473f.p5475b.C69664n;

/* compiled from: PG */
public final class HistoryFragment extends C140594e implements C47231d, C68288b, C47200b, C47233b, C47570bu {

    /* renamed from: a */
    private C140590b f381804a;

    /* renamed from: c */
    private Context f381805c;

    /* renamed from: d */
    private final C2393x f381806d = new C2393x(this);

    /* renamed from: e */
    private boolean f381807e;

    @Deprecated
    public HistoryFragment() {
        C19559g.m37304c();
    }

    /* renamed from: a */
    public final C140590b mo17754z() {
        C140590b bVar = this.f381804a;
        if (bVar == null) {
            throw new IllegalStateException("peer() called before initialized.");
        } else if (!this.f381807e) {
            return bVar;
        } else {
            throw new IllegalStateException("peer() called after destroyed.");
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final /* synthetic */ C47247a mo115761b() {
        return new C47242k(this);
    }

    @Deprecated
    /* renamed from: e */
    public final Context mo17857e() {
        if (this.f381805c == null) {
            this.f381805c = new C47236e((Fragment) this, super.getContext());
        }
        return this.f381805c;
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
        return this.f381806d;
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
            C140583a.m228317a(th, th);
        }
        throw th;
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.f122869b.mo51381i();
        try {
            mo51119t(layoutInflater, viewGroup, bundle);
            C140590b a = mo17754z();
            C69664n.m101061g(layoutInflater, "inflater");
            View inflate = layoutInflater.inflate(R.layout.podcasts_history_fragment, viewGroup, false);
            View findViewById = inflate.findViewById(R.id.podcasts_history_list);
            C69664n.m101060f(findViewById, "rootView.findViewById(R.id.podcasts_history_list)");
            RecyclerView recyclerView = (RecyclerView) findViewById;
            C141230b.m229247a(recyclerView, C69540x.m100944b(Integer.valueOf(R.layout.podcasts_library_episode_item)));
            Context context = inflate.getContext();
            C69664n.m101060f(context, "rootView.context");
            recyclerView.addItemDecoration$ar$ds(C141259b.m229290a(context));
            Context context2 = inflate.getContext();
            C69664n.m101060f(context2, "rootView.context");
            recyclerView.addItemDecoration$ar$ds(C141261d.m229291a(context2));
            RootBindableController$Builder a2 = C31972au.m59570a(a.f381821b, C140951j.m228907a(recyclerView, a.f381824e.f381736a.mo116036a()));
            boolean z = true;
            a2.f85926a = true;
            a.f381829j = a2.mo37724a();
            a.f381822c.mo50709c(new C140588e(a.f381826g), new C140590b.C140591a());
            C28306ab abVar = a.f381825f;
            abVar.mo33801b(inflate, abVar.f76990a.mo33805a(C28427h.m53115a(96717)));
            SwipeRefreshLayout swipeRefreshLayout = (SwipeRefreshLayout) inflate.findViewById(R.id.podcasts_swipe_refresh);
            C69664n.m101060f(swipeRefreshLayout, BuildConfig.FLAVOR);
            C141265c.m229299a(swipeRefreshLayout);
            swipeRefreshLayout.f13508a = new C47701a(a.f381823d, "Swipe refresh history page", new C140592c(a));
            ((FullScreenMessageView) inflate.findViewById(R.id.podcasts_message_layer)).mo17754z().f383493b = new C141251b(R.drawable.quantum_gm_ic_play_circle_outline_vd_theme_24, 16843827, R.string.podcasts_history_empty_title, Integer.valueOf(R.string.podcasts_history_empty_text), (Integer) null, (View.OnClickListener) null);
            C69664n.m101060f(inflate, "rootView");
            C140584a aVar = a.f381828i;
            if (aVar != null) {
                z = aVar.f381809b;
            }
            a.mo115767c(inflate, z);
            C47831fm.m85019n();
            return inflate;
        } catch (Throwable th) {
            C140583a.m228317a(th, th);
        }
        throw th;
    }

    public final void onDestroyView() {
        C47573bx c = this.f122869b.mo51375c();
        try {
            mo51113n();
            C140590b a = mo17754z();
            C31974aw awVar = a.f381829j;
            if (awVar != null) {
                awVar.mo37741b();
            }
            a.f381829j = null;
            c.close();
            return;
        } catch (Throwable th) {
            C140583a.m228317a(th, th);
        }
        throw th;
    }

    public final void onDetach() {
        C47573bx d = this.f122869b.mo51376d();
        try {
            mo51114o();
            this.f381807e = true;
            d.close();
            return;
        } catch (Throwable th) {
            C140583a.m228317a(th, th);
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
            C140583a.m228317a(th, th);
        }
        throw th;
    }

    public final void onResume() {
        C47573bx e = this.f122869b.mo51377e();
        try {
            mo51116q();
            C140590b a = mo17754z();
            a.mo115766b(a.f381828i);
            e.close();
            return;
        } catch (Throwable th) {
            C140583a.m228317a(th, th);
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
            if (!this.f381807e) {
                super.onAttach(context);
                if (this.f381804a == null) {
                    Object jN = mo115769d().mo17653jN();
                    Fragment fragment = (Fragment) ((C68221g) ((C74176nj) jN).f206889e).f184583a;
                    if (fragment instanceof HistoryFragment) {
                        HistoryFragment historyFragment = (HistoryFragment) fragment;
                        C68225k.m98532d(historyFragment);
                        this.f381804a = new C140590b(historyFragment, (C46801dp) ((C74176nj) jN).f207084k.mo17428b(), ((C74176nj) jN).mo69846hd(), ((C74176nj) jN).mo69707er(), (C28306ab) ((C74176nj) jN).f206677a.a.f202880fS.mo17428b(), new C140589f((C140084z) ((C74176nj) jN).f206730b.f198027a.f199155G.mo17428b(), ((C74176nj) jN).f206730b.f198027a.mo66835dH(), (C46778cv) ((C74176nj) jN).f206677a.ao.mo17428b(), (C140459au) ((C74176nj) jN).f206730b.f198027a.f199879y.mo17428b()), (C46778cv) ((C74176nj) jN).f206677a.ao.mo17428b(), ((C74176nj) jN).mo69715ez(), (C47770dh) ((C74176nj) jN).f206730b.f198663m.mo17428b());
                        super.getLifecycle().mo5790b(new TracedFragmentLifecycle(this.f122869b, this.f381806d));
                    } else {
                        String obj = C140590b.class.toString();
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
                C140583a.m228317a(th, th2);
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
