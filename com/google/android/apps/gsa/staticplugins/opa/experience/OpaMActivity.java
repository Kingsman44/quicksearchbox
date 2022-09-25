package com.google.android.apps.gsa.staticplugins.opa.experience;

import android.app.Activity;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.graphics.drawable.Drawable;
import android.media.MediaMetadata;
import android.media.session.MediaController;
import android.media.session.PlaybackState;
import android.os.Bundle;
import android.support.p033v7.app.C0395p;
import android.view.View;
import android.widget.TextView;
import com.google.android.apps.gsa.assistant.shared.C73798aa;
import com.google.android.apps.gsa.binaries.satin.app.adq;
import com.google.android.apps.gsa.binaries.satin.app.ads;
import com.google.android.apps.gsa.binaries.satin.app.aqy;
import com.google.android.apps.gsa.binaries.satin.app.asp;
import com.google.android.apps.gsa.e.f;
import com.google.android.apps.gsa.p5846e.C74504a;
import com.google.android.apps.gsa.search.shared.media.C87594r;
import com.google.android.apps.gsa.shared.logger.C89943l;
import com.google.android.apps.gsa.shared.logger.C89949q;
import com.google.android.apps.gsa.shared.logger.p7054d.C89885b;
import com.google.android.apps.gsa.shared.p7066m.C90014bt;
import com.google.android.apps.gsa.shared.util.C90779c;
import com.google.android.apps.gsa.staticplugins.opa.ambient.p8264h.p8273g.C107071k;
import com.google.android.apps.gsa.staticplugins.opa.samson.charging.lifecycleobservers.C110114a;
import com.google.android.apps.gsa.staticplugins.opa.samson.p8433h.C110138b;
import com.google.android.apps.gsa.staticplugins.opa.samson.p8433h.C110145i;
import com.google.android.apps.gsa.staticplugins.opa.samson.p8433h.C110157u;
import com.google.android.apps.gsa.staticplugins.opa.samson.p8433h.C110161y;
import com.google.android.apps.gsa.staticplugins.opa.samson.p8446q.C110397a;
import com.google.android.apps.gsa.staticplugins.opa.samson.shared.controller.ActivityIdleDismissController;
import com.google.android.apps.gsa.staticplugins.opa.samson.shared.controller.C110405b;
import com.google.android.apps.gsa.staticplugins.opa.samson.shared.controller.C110407d;
import com.google.android.apps.gsa.staticplugins.opa.samson.shared.controller.C110410g;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.android.libraries.logging.C28285c;
import com.google.android.libraries.logging.C28292j;
import com.google.android.libraries.logging.C28295m;
import com.google.apps.tiktok.inject.C47266f;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60870cx;
import dagger.C68214a;
import dagger.p5294a.C68219e;
import dagger.p5294a.C68225k;
import p5460g.p5461a.C69464a;

/* compiled from: PG */
public class OpaMActivity extends C0395p implements C110407d {

    /* renamed from: q */
    private static final C59071e f303147q = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.opa.experience.OpaMActivity");

    /* renamed from: j */
    public C107071k f303148j;

    /* renamed from: k */
    public C110161y f303149k;

    /* renamed from: l */
    public C110410g f303150l;

    /* renamed from: m */
    public C110405b f303151m;

    /* renamed from: n */
    public C68214a f303152n;

    /* renamed from: o */
    public boolean f303153o;

    /* renamed from: p */
    public C110114a f303154p;

    /* renamed from: com.google.android.apps.gsa.staticplugins.opa.experience.OpaMActivity$a */
    /* compiled from: PG */
    public interface C109012a {
        /* renamed from: aT */
        C110397a mo97378aT();

        /* renamed from: rR */
        adq mo97379rR();

        /* renamed from: s */
        C73798aa mo97380s();
    }

    /* renamed from: v */
    private final void m181338v() {
        getWindow().getAttributes().layoutInDisplayCutoutMode = 1;
    }

    /* renamed from: A */
    public final void mo97369A(boolean z) {
        if (this.f303153o && Boolean.TRUE.equals(Boolean.valueOf(z))) {
            C59104x b = f303147q.mo56224b();
            b.mo56378ag(C58975e.f156826a, "MediaActivity");
            ((C59052c) ((C59052c) b).mo56372aa(24493)).mo56386p("Activity idled.");
            setResult(-1, new Intent().putExtra("MEDIA_EXTRA_EXIT_REASON", 8));
            finish();
        }
    }

    public final void onBackPressed() {
        this.f303149k.mo98432e(4);
    }

    /* access modifiers changed from: protected */
    public final void onCreate(Bundle bundle) {
        boolean z;
        C74504a.m120462a(f.ar);
        super.onCreate(bundle);
        C109012a aVar = (C109012a) C47266f.m84076a(this, C109012a.class);
        adq rR = aVar.mo97379rR();
        if ((getIntent() == null || !getIntent().getBooleanExtra("use_charging", false)) && (aVar.mo97380s().mo65277a() != 0 || !aVar.mo97378aT().mo98624b(true))) {
            z = false;
        } else {
            z = true;
        }
        rR.f195541d = Boolean.valueOf(z);
        rR.f195542e = this;
        rR.f195539b = this;
        rR.f195540c = this;
        C68225k.m98529a(rR.f195539b, C0395p.class);
        C68225k.m98529a(rR.f195540c, Activity.class);
        C68225k.m98529a(rR.f195541d, Boolean.class);
        C68225k.m98529a(rR.f195542e, C110407d.class);
        ads ads = new ads(rR.f195538a, rR.f195539b, rR.f195540c, rR.f195541d, rR.f195542e);
        this.f303148j = (C107071k) ads.f.mo17428b();
        this.f303149k = (C110161y) ads.g.mo17428b();
        aqy aqy = ads.e;
        C69464a aVar2 = aqy.g;
        asp asp = aqy.a;
        this.f303150l = new C110410g(aVar2, asp.f202864fC, asp.f202761dF, aqy.ic);
        C68219e.m98518a(ads.h);
        this.f303151m = new C110405b(ads.e.g, ads.i);
        this.f303152n = C68219e.m98518a(ads.j);
        this.f303153o = ads.c.booleanValue();
        this.f303154p = (C110114a) ads.e.a.f202763dH.mo17428b();
        C22871g gVar = (C22871g) ads.e.aT.mo17428b();
        if (!this.f303153o) {
            C90779c.m148334a(this, 1);
        }
        C58976aa aaVar = C58975e.f156826a;
        View view = this.f303149k.f306954d;
        setContentView(view);
        this.f303150l.mo98647a(new C109025l(this), this.f303153o).mo98645b(this);
        if (!this.f303153o || getIntent() == null || !getIntent().getBooleanExtra("disable_auto_dismiss_when_dark", false)) {
            this.f303151m.mo98646a(new C109025l(this)).mo98643a(this);
        }
        m181338v();
        if (this.f303153o) {
            C28292j jVar = new C28292j(82044);
            jVar.mo33795i(5);
            C28295m.m52919e(view, jVar);
            C89949q.m146521e(C28285c.m52874a(view, 75711), false);
        } else {
            C28295m.m52919e(view, new C28292j(59970));
            C89949q.m146521e(C28285c.m52874a(view, 59956), false);
        }
        if (this.f303153o) {
            getLifecycle().mo5790b(this.f303154p);
            ((ActivityIdleDismissController) this.f303152n.mo27525b()).mo98644a(this);
        }
    }

    /* access modifiers changed from: protected */
    public final void onResume() {
        getWindow().addFlags(C89885b.S3REQUEST_VALUE);
        this.f303148j.mo95768c();
        this.f303148j.mo95766a();
        setTurnScreenOn(true);
        m181338v();
        super.onResume();
        C58976aa aaVar = C58975e.f156826a;
    }

    public final void onStart() {
        long j;
        Drawable drawable;
        super.onStart();
        C58976aa aaVar = C58975e.f156826a;
        C110161y yVar = this.f303149k;
        yVar.f306936D = new C87594r(yVar.f306953c, yVar.f306958h, yVar.f306959i).mo81722a((String) null, false, true);
        MediaController mediaController = yVar.f306936D;
        if (mediaController != null) {
            MediaMetadata metadata = mediaController.getMetadata();
            if (metadata != null) {
                try {
                    boolean containsKey = metadata.containsKey("com.google.android.apps.gsa.search.core.work.audioplayer.PodcastFeedUrl");
                    if (containsKey) {
                        drawable = yVar.f306953c.getResources().getDrawable(R.drawable.product_logo_podcasts_round_color_24);
                    } else {
                        PackageManager packageManager = yVar.f306953c.getPackageManager();
                        MediaController mediaController2 = yVar.f306936D;
                        mediaController2.getClass();
                        drawable = packageManager.getApplicationIcon(mediaController2.getPackageName());
                    }
                    yVar.f306956f.setImageDrawable(drawable);
                    TextView textView = yVar.f306957g;
                    if (textView != null) {
                        if (containsKey) {
                            textView.setText(R.string.media_podcast);
                        } else {
                            PackageManager packageManager2 = yVar.f306953c.getPackageManager();
                            TextView textView2 = yVar.f306957g;
                            MediaController mediaController3 = yVar.f306936D;
                            mediaController3.getClass();
                            textView2.setText(packageManager2.getApplicationLabel(packageManager2.getApplicationInfo(mediaController3.getPackageName(), 0)));
                        }
                    }
                } catch (PackageManager.NameNotFoundException e) {
                    C59104x c = C110161y.f306932a.mo56225c();
                    c.mo56378ag(C58975e.f156826a, "MediaCtl");
                    ((C59052c) ((C59052c) ((C59052c) c).mo56382g(e)).mo56372aa(25774)).mo56386p("Media app icon not found");
                }
                yVar.mo98437k(metadata);
            }
            yVar.f306954d.getViewTreeObserver().addOnGlobalLayoutListener(new C110157u(yVar));
            if (yVar.f306961k.mo79746e(C90014bt.f247429gw)) {
                yVar.f306965o.setOnClickListener(new C89943l(new C110145i(yVar)));
            }
            MediaController mediaController4 = yVar.f306936D;
            mediaController4.getClass();
            PlaybackState playbackState = mediaController4.getPlaybackState();
            if (playbackState != null) {
                yVar.mo98436j(playbackState, playbackState.getActions());
                yVar.mo98439m(playbackState.getActions());
                yVar.mo98438l();
            }
            MediaController mediaController5 = yVar.f306936D;
            mediaController5.getClass();
            mediaController5.registerCallback(yVar.f306975y);
        }
        if (yVar.f306935C == null) {
            C22871g gVar = yVar.f306958h;
            if (yVar.f306963m) {
                j = yVar.f306961k.mo79743a(C90014bt.f247109au);
            } else {
                j = yVar.f306961k.mo79743a(C90014bt.f247134bS);
            }
            yVar.f306935C = gVar.mo28208h("Dismiss media activity after timeout", (long) ((int) j), new C110138b(yVar));
        }
    }

    public final void onStop() {
        super.onStop();
        C58976aa aaVar = C58975e.f156826a;
        C110161y yVar = this.f303149k;
        MediaController mediaController = yVar.f306936D;
        if (mediaController != null) {
            mediaController.unregisterCallback(yVar.f306975y);
        }
        C60870cx cxVar = yVar.f306933A;
        if (cxVar != null) {
            cxVar.cancel(false);
            yVar.f306933A = null;
        }
        yVar.mo98433f();
        C60870cx cxVar2 = yVar.f306935C;
        if (cxVar2 != null) {
            cxVar2.cancel(true);
            yVar.f306935C = null;
        }
        if (yVar.f306954d.getDisplay() != null && yVar.f306954d.getDisplay().getState() == 1) {
            if (!yVar.f306963m) {
                yVar.mo98431d(3);
            } else if (!yVar.f306961k.mo79746e(C90014bt.f247069aG)) {
                yVar.mo98430c(3);
            } else {
                yVar.f306938F.f306844b = true;
            }
        }
    }

    public final void onUserInteraction() {
        super.onUserInteraction();
        if (this.f303153o) {
            ((ActivityIdleDismissController) this.f303152n.mo27525b()).f307715k.mo98404b();
        }
    }
}
