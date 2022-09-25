package com.google.android.apps.search.podcasts.playerpanel;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.os.Bundle;
import android.support.p031v4.app.C0154a;
import android.support.p031v4.app.Fragment;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.SeekBar;
import android.widget.TextView;
import androidx.core.p098j.C2043bi;
import androidx.lifecycle.C2384o;
import androidx.lifecycle.C2393x;
import androidx.mediarouter.app.MediaRouteButton;
import com.google.android.apps.gsa.binaries.satin.app.C74176nj;
import com.google.android.apps.search.podcasts.p10576l.C140459au;
import com.google.android.apps.search.podcasts.p10601r.C140954a;
import com.google.android.apps.search.podcasts.p10601r.C140997s;
import com.google.android.apps.search.podcasts.player.C140790h;
import com.google.android.apps.search.podcasts.widgets.thumbnail.ThumbnailView;
import com.google.android.gms.cast.framework.C143380a;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.logging.p2185ve.C28306ab;
import com.google.android.libraries.logging.p2185ve.C28443m;
import com.google.android.libraries.p1623at.p1632e.C19559g;
import com.google.android.libraries.p1730f.C21370a;
import com.google.apps.tiktok.account.AccountId;
import com.google.apps.tiktok.contrib.p3629c.C46485f;
import com.google.apps.tiktok.dataservice.C46778cv;
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
import com.google.apps.tiktok.media.C47449e;
import com.google.apps.tiktok.p3674l.p3679c.C47389c;
import com.google.apps.tiktok.p3674l.p3679c.C47393f;
import com.google.apps.tiktok.p3674l.p3679c.C47400m;
import com.google.apps.tiktok.tracing.C47515ab;
import com.google.apps.tiktok.tracing.C47570bu;
import com.google.apps.tiktok.tracing.C47573bx;
import com.google.apps.tiktok.tracing.C47591co;
import com.google.apps.tiktok.tracing.C47758cw;
import com.google.apps.tiktok.tracing.C47770dh;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.apps.tiktok.tracing.C47816ey;
import com.google.apps.tiktok.tracing.C47831fm;
import com.google.common.util.concurrent.C60888db;
import dagger.hilt.p5299a.C68288b;
import dagger.p5294a.C68221g;
import dagger.p5294a.C68225k;
import java.util.Locale;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.podcasts.playerpanel.o */
/* compiled from: PG */
public final class C140929o extends C140915bd implements C47231d, C68288b, C47200b, C47233b, C47570bu {

    /* renamed from: a */
    private C140879aj f382679a;

    /* renamed from: c */
    private Context f382680c;

    /* renamed from: d */
    private final C2393x f382681d = new C2393x(this);

    /* renamed from: e */
    private boolean f382682e;

    @Deprecated
    public C140929o() {
        C19559g.m37304c();
    }

    /* renamed from: a */
    public final C140879aj mo17754z() {
        C140879aj ajVar = this.f382679a;
        if (ajVar == null) {
            throw new IllegalStateException("peer() called before initialized.");
        } else if (!this.f382682e) {
            return ajVar;
        } else {
            throw new IllegalStateException("peer() called after destroyed.");
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final /* synthetic */ C47247a mo116012b() {
        return new C47242k(this);
    }

    @Deprecated
    /* renamed from: e */
    public final Context mo17857e() {
        if (this.f382680c == null) {
            this.f382680c = new C47236e((Fragment) this, super.getContext());
        }
        return this.f382680c;
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
        return this.f382681d;
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
            C140928n.m228879a(th, th);
        }
        throw th;
    }

    public final void onCreate(Bundle bundle) {
        Fragment b;
        this.f122869b.mo51381i();
        try {
            mo51111l(bundle);
            C140879aj a = mo17754z();
            a.f382551d.mo50828h(R.id.podcasts_player_state_subscription, new C140926l(a.f382555h), a.f382559l);
            TypedValue typedValue = new TypedValue();
            if (a.f382548a.requireContext().getTheme().resolveAttribute(16842803, typedValue, true)) {
                a.f382562o = typedValue.getFloat();
            }
            if (!(bundle == null || (b = a.f382548a.getChildFragmentManager().f634a.mo670b(R.id.podcasts_panel_container)) == null)) {
                C0154a aVar = new C0154a(a.f382548a.getChildFragmentManager());
                aVar.mo516m(b);
                aVar.mo509f();
            }
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C140928n.m228879a(th, th);
        }
        throw th;
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Throwable th;
        LayoutInflater layoutInflater2 = layoutInflater;
        this.f122869b.mo51381i();
        try {
            mo51119t(layoutInflater, viewGroup, bundle);
            C140879aj a = mo17754z();
            C69664n.m101061g(layoutInflater2, "inflater");
            View inflate = layoutInflater2.inflate(R.layout.podcasts_expanded_player_panel, viewGroup, false);
            C2043bi.m5555ai(inflate, C140938x.f382693a);
            a.f382554g.mo51252a(inflate.findViewById(R.id.podcasts_metadata_container), new C140896b(new C140939y(a)));
            C140997s sVar = a.f382557j;
            C69664n.m101060f(inflate, "rootView");
            ThumbnailView j = C140880ak.m228805j(inflate);
            C69664n.m101060f(j, "rootView.getThumbnail()");
            sVar.mo116064c(j, new C140896b(new C140940z(a)), "CollapsePlayerEvent", true);
            C140997s sVar2 = a.f382557j;
            ImageView d = C140880ak.m228799d(inflate);
            C69664n.m101060f(d, "rootView.getToggleButton()");
            sVar2.mo116062a(d, new C140870aa(a), "toggle click");
            C140997s sVar3 = a.f382557j;
            ImageView a2 = C140880ak.m228796a(inflate);
            C69664n.m101060f(a2, "rootView.getFastForwardButton()");
            sVar3.mo116062a(a2, new C140871ab(a), "fast forward click");
            C140997s sVar4 = a.f382557j;
            ImageView c = C140880ak.m228798c(inflate);
            C69664n.m101060f(c, "rootView.getRewindButton()");
            sVar4.mo116062a(c, new C140872ac(a), "rewind click");
            int dimensionPixelSize = a.f382548a.getResources().getDimensionPixelSize(R.dimen.podcasts_progress_seek_bar_padding);
            C140880ak.m228800e(inflate).setPadding(dimensionPixelSize, 0, dimensionPixelSize, 0);
            C140880ak.m228800e(inflate).setOnSeekBarChangeListener(new C47758cw(a.f382550c, a.f382561n, "podcastsSeekbarChange"));
            inflate.getViewTreeObserver().addOnGlobalLayoutListener(new C140873ad(inflate, a));
            MediaRouteButton mediaRouteButton = (MediaRouteButton) inflate.findViewById(R.id.podcasts_media_route_button);
            mediaRouteButton.mo7936e();
            if (C140954a.m228911a(a.f382548a.requireContext())) {
                C143380a.m232631a(a.f382548a.requireContext().getApplicationContext(), mediaRouteButton);
            }
            C140997s sVar5 = a.f382557j;
            View findViewById = inflate.findViewById(R.id.podcasts_current_speed_container);
            C69664n.m101060f(findViewById, "rootView.getCurrentSpeedContainer()");
            sVar5.mo116062a(findViewById, new C140874ae(a), "playback speed click");
            C140997s sVar6 = a.f382557j;
            View findViewById2 = inflate.findViewById(R.id.podcasts_sleep_timer_button);
            C69664n.m101060f(findViewById2, "rootView.getSleepTimerButton()");
            sVar6.mo116062a(findViewById2, new C140875af(a), "sleep timer click");
            C140997s sVar7 = a.f382557j;
            TextView i = C140880ak.m228804i(inflate);
            C69664n.m101060f(i, "rootView.getSleepTimerCounter()");
            sVar7.mo116062a(i, new C140933s(a), "sleep timer counter click");
            C140997s sVar8 = a.f382557j;
            View findViewById3 = inflate.findViewById(R.id.podcasts_overflow_button);
            C69664n.m101060f(findViewById3, "rootView.getOverflowMenuButton()");
            sVar8.mo116062a(findViewById3, new C140934t(a), "player panel overflow button click");
            inflate.findViewById(R.id.podcasts_panel_click_mask).setOnClickListener(new C47591co(a.f382550c, "hide panel click", new C140935u(a)));
            C140997s sVar9 = a.f382557j;
            View findViewById4 = inflate.findViewById(R.id.podcasts_playlist_button);
            C69664n.m101060f(findViewById4, "rootView.getPlayListButton()");
            sVar9.mo116064c(findViewById4, new C140896b(new C140936v(inflate)), "collapse player event and go to queue", true);
            C140997s sVar10 = a.f382557j;
            C69664n.m101060f(mediaRouteButton, "mediaRouteButton");
            sVar10.mo116062a(mediaRouteButton, C140937w.f382692a, "cast button click");
            a.mo115978a(inflate, 70845);
            ImageView d2 = C140880ak.m228799d(inflate);
            C69664n.m101060f(d2, "rootView.getToggleButton()");
            a.mo115978a(d2, 42185);
            ThumbnailView j2 = C140880ak.m228805j(inflate);
            C69664n.m101060f(j2, "rootView.getThumbnail()");
            a.mo115978a(j2, 78391);
            SeekBar e = C140880ak.m228800e(inflate);
            C69664n.m101060f(e, "rootView.getSeekBar()");
            a.mo115978a(e, 42184);
            ImageView c2 = C140880ak.m228798c(inflate);
            C69664n.m101060f(c2, "rootView.getRewindButton()");
            a.mo115978a(c2, 42186);
            ImageView a3 = C140880ak.m228796a(inflate);
            C69664n.m101060f(a3, "rootView.getFastForwardButton()");
            a.mo115978a(a3, 42187);
            ImageView b = C140880ak.m228797b(inflate);
            C69664n.m101060f(b, "rootView.getHeartButtonView()");
            a.mo115978a(b, 117491);
            View findViewById5 = inflate.findViewById(R.id.podcasts_current_speed_container);
            C69664n.m101060f(findViewById5, "rootView.getCurrentSpeedContainer()");
            a.mo115978a(findViewById5, 42188);
            View findViewById6 = inflate.findViewById(R.id.podcasts_sleep_timer_button);
            C69664n.m101060f(findViewById6, "rootView.getSleepTimerButton()");
            a.mo115978a(findViewById6, 70849);
            TextView i2 = C140880ak.m228804i(inflate);
            C69664n.m101060f(i2, "rootView.getSleepTimerCounter()");
            a.mo115978a(i2, 70850);
            View findViewById7 = inflate.findViewById(R.id.podcasts_playlist_button);
            C69664n.m101060f(findViewById7, "rootView.getPlayListButton()");
            a.mo115978a(findViewById7, 134572);
            View findViewById8 = inflate.findViewById(R.id.podcasts_overflow_button);
            C69664n.m101060f(findViewById8, "rootView.getOverflowMenuButton()");
            a.mo115978a(findViewById8, 134866);
            a.mo115978a(mediaRouteButton, 56953);
            if (inflate != null) {
                C47831fm.m85019n();
                return inflate;
            }
            throw new NullPointerException("Fragment cannot use Event annotations with null view!");
        } catch (Throwable th2) {
            C140928n.m228879a(th, th2);
        }
        throw th;
    }

    public final void onDetach() {
        C47573bx d = this.f122869b.mo51376d();
        try {
            mo51114o();
            this.f382682e = true;
            d.close();
            return;
        } catch (Throwable th) {
            C140928n.m228879a(th, th);
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
            C140928n.m228879a(th, th);
        }
        throw th;
    }

    public final void onViewCreated(View view, Bundle bundle) {
        this.f122869b.mo51381i();
        try {
            C47389c.m84226a(getContext()).f123128b = view;
            C47393f.m84233d(this, C140853a.class, new C140881al(mo17754z()));
            this.f54442o.mo24720k(bundle);
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C140928n.m228879a(th, th);
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
            if (!this.f382682e) {
                super.onAttach(context);
                if (this.f382679a == null) {
                    Object jN = mo116013d().mo17653jN();
                    AccountId accountId = (AccountId) ((C74176nj) jN).f206730b.f198239e.mo17428b();
                    Fragment fragment = (Fragment) ((C68221g) ((C74176nj) jN).f206889e).f184583a;
                    if (fragment instanceof C140929o) {
                        C140929o oVar = (C140929o) fragment;
                        C68225k.m98532d(oVar);
                        C140927m mVar = new C140927m((C140790h) ((C74176nj) jN).f206730b.f198027a.f199159K.mo17428b(), ((C74176nj) jN).f206730b.f198027a.mo66841dN(), (C140459au) ((C74176nj) jN).f206730b.f198027a.f199879y.mo17428b(), ((C74176nj) jN).f206730b.f198027a.mo66871dr(), (C21370a) ((C74176nj) jN).f206677a.i.mo17428b(), (C46778cv) ((C74176nj) jN).f206677a.ao.mo17428b(), (C60888db) ((C74176nj) jN).f206677a.n.mo17428b());
                        ConnectivityManager n = ((C74176nj) jN).f206677a.n();
                        C140879aj ajVar = r3;
                        C140879aj ajVar2 = new C140879aj(accountId, oVar, (C140790h) ((C74176nj) jN).f206730b.f198027a.f199159K.mo17428b(), (C47770dh) ((C74176nj) jN).f206730b.f198663m.mo17428b(), (C46855i) ((C74176nj) jN).f207083j.mo17428b(), (C21370a) ((C74176nj) jN).f206677a.i.mo17428b(), (C47449e) ((C74176nj) jN).f207092s.mo17428b(), (C46485f) ((C74176nj) jN).f206995g.mo17428b(), (C47400m) ((C74176nj) jN).f206730b.f198027a.f199472ff.mo17428b(), mVar, n, (C28306ab) ((C74176nj) jN).f206677a.a.f202880fS.mo17428b(), (C28443m) ((C74176nj) jN).f206677a.a.f202879fR.mo17428b(), (C140997s) ((C74176nj) jN).f206757ba.mo17428b());
                        this.f382679a = ajVar;
                        super.getLifecycle().mo5790b(new TracedFragmentLifecycle(this.f122869b, this.f382681d));
                    } else {
                        String obj = C140879aj.class.toString();
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
                C140928n.m228879a(th2, th3);
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
