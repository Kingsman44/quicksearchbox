package com.google.android.apps.search.podcasts.library.download;

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
import com.google.android.apps.gsa.binaries.satin.app.C74176nj;
import com.google.android.apps.search.podcasts.p10600q.C140951j;
import com.google.android.apps.search.podcasts.widgets.fullscreenmessage.C141251b;
import com.google.android.apps.search.podcasts.widgets.fullscreenmessage.FullScreenMessageView;
import com.google.android.apps.search.podcasts.widgets.p10623e.C141230b;
import com.google.android.apps.search.podcasts.widgets.p10625g.C141259b;
import com.google.android.apps.search.podcasts.widgets.p10625g.C141261d;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.logging.p2185ve.C28306ab;
import com.google.android.libraries.logging.p2185ve.C28427h;
import com.google.android.libraries.p1623at.p1632e.C19559g;
import com.google.android.libraries.play.unison.binding.C31972au;
import com.google.android.libraries.play.unison.binding.C31974aw;
import com.google.android.libraries.play.unison.binding.RootBindableController$Builder;
import com.google.apps.tiktok.dataservice.local.C46855i;
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
import dagger.hilt.p5299a.C68288b;
import dagger.p5294a.C68221g;
import dagger.p5294a.C68225k;
import java.util.Locale;
import p5462h.p5463a.C69540x;
import p5462h.p5473f.p5475b.C69664n;

/* compiled from: PG */
public final class DownloadFragment extends C140582m implements C47231d, C68288b, C47200b, C47233b, C47570bu {

    /* renamed from: a */
    private C140581l f381775a;

    /* renamed from: c */
    private Context f381776c;

    /* renamed from: d */
    private final C2393x f381777d = new C2393x(this);

    /* renamed from: e */
    private boolean f381778e;

    @Deprecated
    public DownloadFragment() {
        C19559g.m37304c();
    }

    /* renamed from: a */
    public final C140581l mo17754z() {
        C140581l lVar = this.f381775a;
        if (lVar == null) {
            throw new IllegalStateException("peer() called before initialized.");
        } else if (!this.f381778e) {
            return lVar;
        } else {
            throw new IllegalStateException("peer() called after destroyed.");
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final /* synthetic */ C47247a mo115749b() {
        return new C47242k(this);
    }

    @Deprecated
    /* renamed from: e */
    public final Context mo17857e() {
        if (this.f381776c == null) {
            this.f381776c = new C47236e((Fragment) this, super.getContext());
        }
        return this.f381776c;
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
        return this.f381777d;
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
            C140570a.m228295a(th, th);
        }
        throw th;
    }

    public final void onCreate(Bundle bundle) {
        this.f122869b.mo51381i();
        try {
            mo51111l(bundle);
            C140581l a = mo17754z();
            a.f381790b.mo50828h(R.id.podcasts_downloads_subscription, new C140580k(a), a.f381797i);
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C140570a.m228295a(th, th);
        }
        throw th;
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.f122869b.mo51381i();
        try {
            mo51119t(layoutInflater, viewGroup, bundle);
            C140581l a = mo17754z();
            C69664n.m101061g(layoutInflater, "inflater");
            View inflate = layoutInflater.inflate(R.layout.podcasts_download_fragment, viewGroup, false);
            View findViewById = inflate.findViewById(R.id.podcasts_downloads_list);
            C69664n.m101060f(findViewById, "rootView.findViewById(R.….podcasts_downloads_list)");
            RecyclerView recyclerView = (RecyclerView) findViewById;
            C141230b.m229247a(recyclerView, C69540x.m100944b(Integer.valueOf(R.layout.podcasts_library_episode_item)));
            Context context = inflate.getContext();
            C69664n.m101060f(context, "rootView.context");
            recyclerView.addItemDecoration$ar$ds(C141259b.m229290a(context));
            Context context2 = inflate.getContext();
            C69664n.m101060f(context2, "rootView.context");
            recyclerView.addItemDecoration$ar$ds(C141261d.m229291a(context2));
            new C0502l(new C140571b(a)).mo2460d(recyclerView);
            RootBindableController$Builder a2 = C31972au.m59570a(a.f381789a, C140951j.m228907a(recyclerView, a.f381792d.f381736a.mo116036a()));
            a2.f85926a = true;
            a.f381796h = a2.mo37724a();
            a.mo115756a(a.f381795g);
            C28306ab abVar = a.f381793e;
            abVar.mo33801b(inflate, abVar.f76990a.mo33805a(C28427h.m53115a(48555)));
            ((FullScreenMessageView) inflate.findViewById(R.id.podcasts_message_layer)).mo17754z().f383493b = new C141251b(R.drawable.podcasts_download_icon, 16843827, R.string.podcasts_downloads_empty_title, Integer.valueOf(R.string.podcasts_downloads_empty_text), (Integer) null, (View.OnClickListener) null);
            C69664n.m101060f(inflate, "rootView");
            a.mo115757b(inflate);
            C47831fm.m85019n();
            return inflate;
        } catch (Throwable th) {
            C140570a.m228295a(th, th);
        }
        throw th;
    }

    public final void onDestroyView() {
        C47573bx c = this.f122869b.mo51375c();
        try {
            mo51113n();
            C140581l a = mo17754z();
            C31974aw awVar = a.f381796h;
            if (awVar != null) {
                awVar.mo37741b();
            }
            a.f381796h = null;
            c.close();
            return;
        } catch (Throwable th) {
            C140570a.m228295a(th, th);
        }
        throw th;
    }

    public final void onDetach() {
        C47573bx d = this.f122869b.mo51376d();
        try {
            mo51114o();
            this.f381778e = true;
            d.close();
            return;
        } catch (Throwable th) {
            C140570a.m228295a(th, th);
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
            C140570a.m228295a(th, th);
        }
        throw th;
    }

    public final void onResume() {
        C47573bx e = this.f122869b.mo51377e();
        try {
            mo51116q();
            C140581l a = mo17754z();
            a.mo115756a(a.f381795g);
            e.close();
            return;
        } catch (Throwable th) {
            C140570a.m228295a(th, th);
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
            if (!this.f381778e) {
                super.onAttach(context);
                if (this.f381775a == null) {
                    Object jN = mo115758d().mo17653jN();
                    Fragment fragment = (Fragment) ((C68221g) ((C74176nj) jN).f206889e).f184583a;
                    if (fragment instanceof DownloadFragment) {
                        DownloadFragment downloadFragment = (DownloadFragment) fragment;
                        C68225k.m98532d(downloadFragment);
                        this.f381775a = new C140581l(downloadFragment, (C46855i) ((C74176nj) jN).f207083j.mo17428b(), ((C74176nj) jN).f206730b.f198027a.mo66833dF(), ((C74176nj) jN).mo69707er(), (C28306ab) ((C74176nj) jN).f206677a.a.f202880fS.mo17428b(), ((C74176nj) jN).mo69715ez(), (C47770dh) ((C74176nj) jN).f206730b.f198663m.mo17428b());
                        super.getLifecycle().mo5790b(new TracedFragmentLifecycle(this.f122869b, this.f381777d));
                    } else {
                        String obj = C140581l.class.toString();
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
                C140570a.m228295a(th, th2);
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
