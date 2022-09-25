package com.google.android.apps.search.podcasts.playerpanel;

import android.content.res.Resources;
import android.net.ConnectivityManager;
import android.support.p031v4.app.C0154a;
import android.support.p031v4.app.Fragment;
import android.view.View;
import android.widget.SeekBar;
import android.widget.TextView;
import com.google.android.apps.search.podcasts.p10601r.C140979f;
import com.google.android.apps.search.podcasts.p10601r.C140997s;
import com.google.android.apps.search.podcasts.player.C140752a;
import com.google.android.apps.search.podcasts.player.C140787e;
import com.google.android.apps.search.podcasts.player.C140790h;
import com.google.android.apps.search.podcasts.playerpanel.p10598a.C140855b;
import com.google.android.apps.search.podcasts.playerpanel.p10598a.C140861h;
import com.google.android.apps.search.podcasts.playerpanel.p10599b.C140898b;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.logging.p2185ve.C28306ab;
import com.google.android.libraries.logging.p2185ve.C28427h;
import com.google.android.libraries.logging.p2185ve.C28442l;
import com.google.android.libraries.logging.p2185ve.C28443m;
import com.google.android.libraries.logging.p2185ve.C28485y;
import com.google.android.libraries.p1730f.C21370a;
import com.google.apps.tiktok.account.AccountId;
import com.google.apps.tiktok.contrib.p3629c.C46485f;
import com.google.apps.tiktok.dataservice.local.C46852f;
import com.google.apps.tiktok.dataservice.local.C46855i;
import com.google.apps.tiktok.inject.p3660e.p3661a.C47247a;
import com.google.apps.tiktok.media.C47449e;
import com.google.apps.tiktok.p3674l.p3679c.C47400m;
import com.google.apps.tiktok.tracing.C47770dh;
import dagger.hilt.android.internal.managers.C68324h;
import p3186j$.time.Duration;
import p5462h.p5473f.p5475b.C69648ae;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.podcasts.playerpanel.aj */
/* compiled from: PG */
public final class C140879aj {

    /* renamed from: a */
    public final C140929o f382548a;

    /* renamed from: b */
    public final C140790h f382549b;

    /* renamed from: c */
    public final C47770dh f382550c;

    /* renamed from: d */
    public final C46855i f382551d;

    /* renamed from: e */
    public final C47449e f382552e;

    /* renamed from: f */
    public final C46485f f382553f;

    /* renamed from: g */
    public final C47400m f382554g;

    /* renamed from: h */
    public final C140927m f382555h;

    /* renamed from: i */
    public final ConnectivityManager f382556i;

    /* renamed from: j */
    public final C140997s f382557j;

    /* renamed from: k */
    public C140923i f382558k;

    /* renamed from: l */
    public final C46852f f382559l = new C140931q(this);

    /* renamed from: m */
    public boolean f382560m;

    /* renamed from: n */
    public final C140876ag f382561n = new C140876ag(this);

    /* renamed from: o */
    public float f382562o = 0.5f;

    /* renamed from: p */
    public final C140932r f382563p = new C140932r(this);

    /* renamed from: q */
    private final AccountId f382564q;

    /* renamed from: r */
    private final C21370a f382565r;

    /* renamed from: s */
    private final C28306ab f382566s;

    /* renamed from: t */
    private final C28443m f382567t;

    public C140879aj(AccountId accountId, C140929o oVar, C140790h hVar, C47770dh dhVar, C46855i iVar, C21370a aVar, C47449e eVar, C46485f fVar, C47400m mVar, C140927m mVar2, ConnectivityManager connectivityManager, C28306ab abVar, C28443m mVar3, C140997s sVar) {
        C69664n.m101061g(accountId, "accountId");
        C69664n.m101061g(hVar, "podcastAudioPlayer");
        C69664n.m101061g(dhVar, "traceCreation");
        C69664n.m101061g(iVar, "localSubscriptionMixin");
        C69664n.m101061g(aVar, "clock");
        C69664n.m101061g(eVar, "imageManager");
        C69664n.m101061g(fVar, "accountNavigation");
        C69664n.m101061g(mVar, "events");
        C69664n.m101061g(abVar, "viewVisualElements");
        C69664n.m101061g(mVar3, "interactionLogger");
        C69664n.m101061g(sVar, "veLoggedEvents");
        this.f382564q = accountId;
        this.f382548a = oVar;
        this.f382549b = hVar;
        this.f382550c = dhVar;
        this.f382551d = iVar;
        this.f382565r = aVar;
        this.f382552e = eVar;
        this.f382553f = fVar;
        this.f382554g = mVar;
        this.f382555h = mVar2;
        this.f382556i = connectivityManager;
        this.f382566s = abVar;
        this.f382567t = mVar3;
        this.f382557j = sVar;
    }

    /* renamed from: a */
    public final void mo115978a(View view, int i) {
        C28306ab abVar = this.f382566s;
        abVar.mo33801b(view, abVar.f76990a.mo33805a(C28427h.m53115a(i)));
    }

    /* renamed from: b */
    public final void mo115979b(boolean z) {
        Fragment b = this.f382548a.getChildFragmentManager().f634a.mo670b(R.id.podcasts_panel_container);
        if (b != null) {
            C69648ae aeVar = new C69648ae();
            View requireView = this.f382548a.requireView();
            C69664n.m101060f(requireView, "fragment.requireView()");
            aeVar.f186027a = requireView;
            if (z) {
                ((View) aeVar.f186027a).findViewById(R.id.podcasts_main_container).animate().translationY(0.0f).alpha(1.0f);
                ((View) aeVar.f186027a).findViewById(R.id.podcasts_playback_options_button_container).animate().translationY(0.0f).alpha(1.0f);
                ((View) aeVar.f186027a).findViewById(R.id.podcasts_panel_container).animate().translationY((float) ((View) aeVar.f186027a).findViewById(R.id.podcasts_panel_container).getHeight()).alpha(0.0f).setListener(new C140930p(aeVar, this, b));
            } else {
                mo115980c(b);
            }
            ((View) aeVar.f186027a).findViewById(R.id.podcasts_panel_click_mask).setVisibility(8);
        }
    }

    /* renamed from: c */
    public final void mo115980c(Fragment fragment) {
        C140929o oVar = this.f382548a;
        if (!oVar.isStateSaved()) {
            View requireView = oVar.requireView();
            C69664n.m101060f(requireView, "fragment.requireView()");
            C0154a aVar = new C0154a(this.f382548a.getChildFragmentManager());
            aVar.mo516m(fragment);
            aVar.mo509f();
            requireView.findViewById(R.id.podcasts_panel_container).setVisibility(4);
            requireView.findViewById(R.id.podcasts_main_container).setImportantForAccessibility(0);
            requireView.findViewById(R.id.podcasts_playback_options_button_container).setAlpha(1.0f);
            requireView.findViewById(R.id.podcasts_playback_options_button_container).setTranslationY(0.0f);
            requireView.findViewById(R.id.podcasts_main_container).setAlpha(1.0f);
            requireView.findViewById(R.id.podcasts_main_container).setTranslationY(0.0f);
        }
    }

    /* renamed from: d */
    public final void mo115981d() {
        View requireView = this.f382548a.requireView();
        C69664n.m101060f(requireView, "fragment.requireView()");
        SeekBar e = C140880ak.m228800e(requireView);
        double progress = (double) e.getProgress();
        double max = (double) e.getMax();
        Double.isNaN(progress);
        Double.isNaN(max);
        double d = progress / max;
        C140923i iVar = this.f382558k;
        long max2 = Math.max(0, C140752a.m228544d(iVar != null ? iVar.f382659a : null));
        this.f382567t.mo33853c(C28442l.m53142h().mo33894a(), C28485y.m53234a(e));
        C140790h hVar = this.f382549b;
        double d2 = (double) max2;
        Double.isNaN(d2);
        hVar.mo115892n((long) (d2 * d));
    }

    /* renamed from: e */
    public final void mo115982e(View view) {
        C69664n.m101061g(view, "rootView");
        SeekBar e = C140880ak.m228800e(view);
        C140923i iVar = this.f382558k;
        C140787e eVar = iVar != null ? iVar.f382659a : null;
        long d = this.f382560m ? (C140752a.m228544d(eVar) * ((long) e.getProgress())) / ((long) e.getMax()) : C140752a.m228543c(eVar);
        Resources resources = this.f382548a.getResources();
        C69664n.m101060f(resources, "fragment.getResources()");
        C21370a aVar = this.f382565r;
        Long valueOf = Long.valueOf(d);
        String c = C140979f.m228937c(resources, (long) C140752a.m228541a(eVar, aVar, valueOf));
        if (!this.f382560m) {
            C69664n.m101060f(e, "seekBar");
            C140913bb.m228841b(e, eVar, this.f382565r);
            C140913bb.m228842c(e, eVar);
        }
        Resources resources2 = this.f382548a.getResources();
        C69664n.m101060f(resources2, "fragment.resources");
        String c2 = C140979f.m228937c(resources2, Duration.ofMillis(d).getSeconds());
        TextView textView = (TextView) view.findViewById(R.id.podcasts_played_time);
        textView.setText(c2);
        textView.setContentDescription(this.f382548a.getResources().getString(R.string.podcasts_played_time_description, new Object[]{c2}));
        String string = this.f382548a.getResources().getString(R.string.podcasts_remaining_time_format, new Object[]{c});
        C69664n.m101060f(string, "fragment.resources.getSt…at, remainingSecondsText)");
        TextView textView2 = (TextView) view.findViewById(R.id.podcasts_remaining_time);
        textView2.setText(string);
        textView2.setContentDescription(this.f382548a.getResources().getString(R.string.podcasts_remaining_time_description, new Object[]{string}));
        boolean e2 = C140752a.m228545e(eVar);
        e.setEnabled(e2);
        C140880ak.m228796a(view).setEnabled(e2);
        C140880ak.m228798c(view).setEnabled(e2);
        float f = e2 ? 1.0f : this.f382562o;
        C140880ak.m228796a(view).setAlpha(f);
        C140880ak.m228798c(view).setAlpha(f);
        Resources resources3 = this.f382548a.getResources();
        C69664n.m101060f(resources3, "fragment.getResources()");
        String c3 = C140979f.m228937c(resources3, (long) C140752a.m228542b(eVar, this.f382565r, valueOf));
        C140880ak.m228804i(view).setText(c3);
        C140880ak.m228804i(view).setContentDescription(this.f382548a.getResources().getString(R.string.podcasts_content_description_sleep_timer_ends, new Object[]{c3}));
    }

    /* renamed from: f */
    public final void mo115983f(int i) {
        Fragment fragment;
        if (this.f382548a.getChildFragmentManager().f634a.mo670b(R.id.podcasts_panel_container) == null) {
            View requireView = this.f382548a.requireView();
            C69664n.m101060f(requireView, "fragment.requireView()");
            View findViewById = requireView.findViewById(R.id.podcasts_panel_container);
            int i2 = i - 1;
            if (i2 == 1) {
                AccountId accountId = this.f382564q;
                C69664n.m101061g(accountId, "accountId");
                fragment = new C140855b();
                C68324h.m98669f(fragment);
                C47247a.m84047b(fragment, accountId);
            } else if (i2 != 2) {
                AccountId accountId2 = this.f382564q;
                C69664n.m101061g(accountId2, "accountId");
                fragment = new C140898b();
                C68324h.m98669f(fragment);
                C47247a.m84047b(fragment, accountId2);
            } else {
                AccountId accountId3 = this.f382564q;
                C69664n.m101061g(accountId3, "accountId");
                fragment = new C140861h();
                C68324h.m98669f(fragment);
                C47247a.m84047b(fragment, accountId3);
            }
            C0154a aVar = new C0154a(this.f382548a.getChildFragmentManager());
            aVar.mo511h(R.id.podcasts_panel_container, fragment, (String) null, 1);
            aVar.mo509f();
            View requireView2 = this.f382548a.requireView();
            C69664n.m101060f(requireView2, "fragment.requireView()");
            requireView2.getLayoutParams().height = requireView2.getHeight();
            findViewById.getViewTreeObserver().addOnGlobalLayoutListener(new C140878ai(findViewById, requireView2));
        }
    }
}
