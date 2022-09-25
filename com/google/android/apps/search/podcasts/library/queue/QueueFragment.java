package com.google.android.apps.search.podcasts.library.queue;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.p031v4.app.Fragment;
import android.support.p033v7.widget.RecyclerView;
import android.support.p033v7.widget.p041a.C0502l;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.C2384o;
import androidx.lifecycle.C2393x;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.evernote.android.state.BuildConfig;
import com.google.android.apps.gsa.binaries.satin.app.C74176nj;
import com.google.android.apps.search.podcasts.library.p10581c.C140569a;
import com.google.android.apps.search.podcasts.library.queue.C140607h;
import com.google.android.apps.search.podcasts.library.queue.p10583a.C140599d;
import com.google.android.apps.search.podcasts.library.queue.p10583a.C140600e;
import com.google.android.apps.search.podcasts.p10550b.p10556f.C140097al;
import com.google.android.apps.search.podcasts.p10600q.C140951j;
import com.google.android.apps.search.podcasts.widgets.fullscreenmessage.C141251b;
import com.google.android.apps.search.podcasts.widgets.fullscreenmessage.FullScreenMessageView;
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
import com.google.apps.tiktok.p3674l.p3679c.C47389c;
import com.google.apps.tiktok.p3674l.p3679c.C47393f;
import com.google.apps.tiktok.tracing.C47515ab;
import com.google.apps.tiktok.tracing.C47570bu;
import com.google.apps.tiktok.tracing.C47573bx;
import com.google.apps.tiktok.tracing.C47770dh;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.apps.tiktok.tracing.C47816ey;
import com.google.apps.tiktok.tracing.C47831fm;
import com.google.apps.tiktok.tracing.contrib.p3708i.p3712c.C47701a;
import dagger.hilt.p5299a.C68288b;
import java.util.Locale;
import p5462h.p5473f.p5475b.C69664n;

/* compiled from: PG */
public final class QueueFragment extends C140615o implements C47231d, C68288b, C47200b, C47233b, C47570bu {

    /* renamed from: a */
    private C140607h f381846a;

    /* renamed from: c */
    private Context f381847c;

    /* renamed from: d */
    private final C2393x f381848d = new C2393x(this);

    /* renamed from: e */
    private boolean f381849e;

    @Deprecated
    public QueueFragment() {
        C19559g.m37304c();
    }

    /* renamed from: a */
    public final C140607h mo17754z() {
        C140607h hVar = this.f381846a;
        if (hVar == null) {
            throw new IllegalStateException("peer() called before initialized.");
        } else if (!this.f381849e) {
            return hVar;
        } else {
            throw new IllegalStateException("peer() called after destroyed.");
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final /* synthetic */ C47247a mo115773b() {
        return new C47242k(this);
    }

    @Deprecated
    /* renamed from: e */
    public final Context mo17857e() {
        if (this.f381847c == null) {
            this.f381847c = new C47236e((Fragment) this, super.getContext());
        }
        return this.f381847c;
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
        return this.f381848d;
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
            C140606g.m228360a(th, th);
        }
        throw th;
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.f122869b.mo51381i();
        try {
            mo51119t(layoutInflater, viewGroup, bundle);
            C140607h a = mo17754z();
            C69664n.m101061g(layoutInflater, "inflater");
            View inflate = layoutInflater.inflate(R.layout.podcasts_queue_fragment, viewGroup, false);
            View findViewById = inflate.findViewById(R.id.podcasts_queue_list);
            C69664n.m101060f(findViewById, "rootView.findViewById(R.id.podcasts_queue_list)");
            RecyclerView recyclerView = (RecyclerView) findViewById;
            Context context = inflate.getContext();
            C69664n.m101060f(context, "rootView.context");
            recyclerView.addItemDecoration$ar$ds(C141259b.m229290a(context));
            Context context2 = inflate.getContext();
            C69664n.m101060f(context2, "rootView.context");
            recyclerView.addItemDecoration$ar$ds(C141261d.m229291a(context2));
            C0502l lVar = new C0502l(new C140609i(a));
            lVar.mo2460d(recyclerView);
            a.f381878n = lVar;
            RootBindableController$Builder a2 = C31972au.m59570a(a.f381870f, C140951j.m228907a(recyclerView, a.f381869e.f381736a.mo116036a()));
            a2.f85926a = true;
            a.f381877m = a2.mo37724a();
            a.f381867c.mo50709c(new C140599d(a.f381868d), new C140607h.C140608a());
            C28306ab abVar = a.f381874j;
            abVar.mo33801b(inflate, abVar.f76990a.mo33805a(C28427h.m53115a(101050)));
            SwipeRefreshLayout swipeRefreshLayout = (SwipeRefreshLayout) inflate.findViewById(R.id.podcasts_swipe_refresh);
            C69664n.m101060f(swipeRefreshLayout, BuildConfig.FLAVOR);
            C141265c.m229299a(swipeRefreshLayout);
            swipeRefreshLayout.f13508a = new C47701a(a.f381871g, "Swipe refresh queue page", new C140611k(a));
            ((FullScreenMessageView) inflate.findViewById(R.id.podcasts_message_layer)).mo17754z().f383493b = new C141251b(R.drawable.quantum_gm_ic_playlist_add_vd_theme_24, 16843827, R.string.podcasts_queue_empty_title, Integer.valueOf(R.string.podcasts_queue_empty_text), (Integer) null, (View.OnClickListener) null);
            C69664n.m101060f(inflate, "rootView");
            a.mo115782c(inflate);
            if (inflate != null) {
                C47831fm.m85019n();
                return inflate;
            }
            throw new NullPointerException("Fragment cannot use Event annotations with null view!");
        } catch (Throwable th) {
            C140606g.m228360a(th, th);
        }
        throw th;
    }

    public final void onDestroyView() {
        C47573bx c = this.f122869b.mo51375c();
        try {
            mo51113n();
            C140607h a = mo17754z();
            C31974aw awVar = a.f381877m;
            if (awVar != null) {
                awVar.mo37741b();
            }
            a.f381877m = null;
            a.f381878n = null;
            c.close();
            return;
        } catch (Throwable th) {
            C140606g.m228360a(th, th);
        }
        throw th;
    }

    public final void onDetach() {
        C47573bx d = this.f122869b.mo51376d();
        try {
            mo51114o();
            this.f381849e = true;
            d.close();
            return;
        } catch (Throwable th) {
            C140606g.m228360a(th, th);
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
            C140606g.m228360a(th, th);
        }
        throw th;
    }

    public final void onResume() {
        C47573bx e = this.f122869b.mo51377e();
        try {
            mo51116q();
            C140607h a = mo17754z();
            a.mo115781b(a.f381876l);
            e.close();
            return;
        } catch (Throwable th) {
            C140606g.m228360a(th, th);
        }
        throw th;
    }

    public final void onViewCreated(View view, Bundle bundle) {
        this.f122869b.mo51381i();
        try {
            C47389c.m84226a(getContext()).f123128b = view;
            C47393f.m84233d(this, C140569a.class, new C140613m(mo17754z()));
            this.f54442o.mo24720k(bundle);
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C140606g.m228360a(th, th);
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
            if (!this.f381849e) {
                super.onAttach(context);
                if (this.f381846a == null) {
                    Object jN = mo115787d().mo17653jN();
                    this.f381846a = new C140607h(((C74176nj) jN).mo69709et(), (C46801dp) ((C74176nj) jN).f207084k.mo17428b(), new C140600e((C140097al) ((C74176nj) jN).f206730b.f198027a.f199152D.mo17428b(), ((C74176nj) jN).f206730b.f198027a.mo66836dI()), ((C74176nj) jN).mo69707er(), ((C74176nj) jN).mo69709et(), ((C74176nj) jN).mo69846hd(), (C47770dh) ((C74176nj) jN).f206730b.f198663m.mo17428b(), (C46778cv) ((C74176nj) jN).f206677a.ao.mo17428b(), (C28306ab) ((C74176nj) jN).f206677a.a.f202880fS.mo17428b(), ((C74176nj) jN).mo69715ez(), (C140097al) ((C74176nj) jN).f206730b.f198027a.f199152D.mo17428b());
                    super.getLifecycle().mo5790b(new TracedFragmentLifecycle(this.f122869b, this.f381848d));
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
                C140606g.m228360a(th, th2);
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
