package com.google.android.apps.search.googleapp.search;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.p031v4.app.C0167am;
import android.support.p031v4.app.Fragment;
import android.support.p031v4.app.FragmentManager;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.activity.result.p046a.C0812e;
import androidx.lifecycle.C2384o;
import androidx.lifecycle.C2393x;
import androidx.navigation.C3807af;
import androidx.navigation.C3896q;
import com.google.android.apps.gsa.binaries.satin.app.C74176nj;
import com.google.android.apps.gsa.binaries.satin.app.aqe;
import com.google.android.apps.gsa.shared.logger.p7051b.C89859i;
import com.google.android.apps.search.googleapp.activity.p10137b.C133411h;
import com.google.android.apps.search.googleapp.amp.silk.C133470f;
import com.google.android.apps.search.googleapp.config.C133665d;
import com.google.android.apps.search.googleapp.config.webfeature.AutoValue_UserAgentListenerFeature;
import com.google.android.apps.search.googleapp.discover.channels.p10180a.C134106b;
import com.google.android.apps.search.googleapp.p10117aa.p10121d.C133118a;
import com.google.android.apps.search.googleapp.p10257g.C135451x;
import com.google.android.apps.search.googleapp.p10516t.p10519c.C139695b;
import com.google.android.apps.search.googleapp.p10516t.p10522f.C139708c;
import com.google.android.apps.search.googleapp.p10539y.p10540a.C139888f;
import com.google.android.apps.search.googleapp.p10539y.p10541b.C139893a;
import com.google.android.apps.search.googleapp.p10539y.p10543d.C139897a;
import com.google.android.apps.search.googleapp.promomanager.srppromotion.AutoValue_SrpPromotionFeature;
import com.google.android.apps.search.googleapp.recents.webfeature.AutoValue_RecentsFeature;
import com.google.android.apps.search.googleapp.search.C137553n;
import com.google.android.apps.search.googleapp.search.p10406c.C137401b;
import com.google.android.apps.search.googleapp.search.p10409e.C137418g;
import com.google.android.apps.search.googleapp.search.p10409e.C137421j;
import com.google.android.apps.search.googleapp.search.p10410f.C137447w;
import com.google.android.apps.search.googleapp.search.p10415i.C137485ae;
import com.google.android.apps.search.googleapp.search.p10422l.C137551b;
import com.google.android.apps.search.googleapp.search.p10422l.p10423a.C137549a;
import com.google.android.apps.search.googleapp.search.srp.error.C137822u;
import com.google.android.apps.search.googleapp.search.srp.external.ExternalRequestObserver;
import com.google.android.apps.search.googleapp.search.srp.interceptor.SrpRequestObserver;
import com.google.android.apps.search.googleapp.search.srp.p10435e.C137770au;
import com.google.android.apps.search.googleapp.search.srp.p10436f.C137837a;
import com.google.android.apps.search.googleapp.search.srp.p10437g.C137852a;
import com.google.android.apps.search.googleapp.search.srp.p10438h.C137872h;
import com.google.android.apps.search.googleapp.search.srp.p10438h.C137873i;
import com.google.android.apps.search.googleapp.search.srp.p10438h.p10439a.C137860e;
import com.google.android.apps.search.googleapp.search.suggest.C138127i;
import com.google.android.apps.search.googleapp.search.suggest.p10464ui.C138546aa;
import com.google.android.apps.search.googleapp.search.suggest.p10464ui.p10466b.C138581f;
import com.google.android.apps.search.googleapp.search.suggest.p10464ui.p10466b.C138582g;
import com.google.android.apps.search.googleapp.search.suggest.p10464ui.p10466b.C138585j;
import com.google.android.apps.search.googleapp.search.suggest.p10464ui.p10466b.C138586k;
import com.google.android.apps.search.googleapp.search.suggest.p10464ui.p10466b.C138587l;
import com.google.android.apps.search.googleapp.search.voicesearch.p10469c.C138728b;
import com.google.android.apps.search.googleapp.search.voicesearch.p10469c.C138767d;
import com.google.android.apps.search.googleapp.search.voicesearch.p10469c.C138772i;
import com.google.android.apps.search.googleapp.search.voicesearch.p10472d.C138790a;
import com.google.android.apps.search.googleapp.search.voicesearch.p10472d.C138791b;
import com.google.android.apps.search.googleapp.search.voicesearch.p10472d.C138792c;
import com.google.android.apps.search.googleapp.search.voicesearch.p10472d.C138793d;
import com.google.android.apps.search.googleapp.search.voicesearch.p10472d.C138794e;
import com.google.android.apps.search.googleapp.startup.appinteractive.C139684f;
import com.google.android.apps.search.googleapp.urlhandler.optimizer.C139846f;
import com.google.android.apps.search.googleapp.urlhandler.optimizer.webfeature.AutoValue_HeavyPrewarmerWebFeature;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.logging.p2185ve.C28306ab;
import com.google.android.libraries.logging.p2185ve.C28427h;
import com.google.android.libraries.p1623at.p1632e.C19559g;
import com.google.android.libraries.p1730f.C21370a;
import com.google.android.libraries.search.location.web.AutoValue_SearchLocationFeature;
import com.google.android.libraries.search.logging.p3034a.C38768q;
import com.google.android.libraries.search.p3025k.C38553h;
import com.google.android.libraries.search.silk.web.amp.SilkAmpFeature;
import com.google.android.libraries.search.silk.web.androiduri.C40672c;
import com.google.android.libraries.search.silk.web.androiduri.SilkAndroidUriFeature;
import com.google.android.libraries.search.silk.web.audiorecording.AutoValue_SilkAudioRecordingFeature;
import com.google.android.libraries.search.silk.web.audiorecording.AutoValue_SilkAudioRecordingPostMessageConfig;
import com.google.android.libraries.search.silk.web.audiorecording.C40689c;
import com.google.android.libraries.search.silk.web.audiorecording.SilkAudioRecordingMessageHandler;
import com.google.android.libraries.search.silk.web.autobot.AutoValue_SilkAutobotFeature;
import com.google.android.libraries.search.silk.web.autobot.AutoValue_SilkAutobotPostMessageConfig;
import com.google.android.libraries.search.silk.web.autobot.C40703c;
import com.google.android.libraries.search.silk.web.autobot.SilkAutobotMessageHandler;
import com.google.android.libraries.search.silk.web.channels.AutoValue_SilkChannelsFeature;
import com.google.android.libraries.search.silk.web.channels.AutoValue_SilkChannelsPostMessageConfig;
import com.google.android.libraries.search.silk.web.channels.SilkChannelsMessageHandler;
import com.google.android.libraries.search.silk.web.collections.SilkCollectionsV2Feature;
import com.google.android.libraries.search.silk.web.core.C40756j;
import com.google.android.libraries.search.silk.web.core.C40757k;
import com.google.android.libraries.search.silk.web.core.C40758l;
import com.google.android.libraries.search.silk.web.core.C40759m;
import com.google.android.libraries.search.silk.web.download.C40763c;
import com.google.android.libraries.search.silk.web.download.SilkDownloadFeature;
import com.google.android.libraries.search.silk.web.feedback.AutoValue_SilkFeedbackFeature;
import com.google.android.libraries.search.silk.web.feedback.AutoValue_SilkFeedbackPostMessageConfig;
import com.google.android.libraries.search.silk.web.feedback.SilkFeedbackMessageHandler;
import com.google.android.libraries.search.silk.web.footprintsconsent.AutoValue_SilkFootprintsConsentFeature;
import com.google.android.libraries.search.silk.web.footprintsconsent.AutoValue_SilkFootprintsConsentPostMessageConfig;
import com.google.android.libraries.search.silk.web.footprintsconsent.C40778c;
import com.google.android.libraries.search.silk.web.footprintsconsent.SilkFootprintsConsentMessageHandler;
import com.google.android.libraries.search.silk.web.geolocation.C40788c;
import com.google.android.libraries.search.silk.web.geolocation.SilkGeolocationFeature;
import com.google.android.libraries.search.silk.web.homescreenshortcuts.C40801c;
import com.google.android.libraries.search.silk.web.homescreenshortcuts.SilkHomescreenShortcutsFeature;
import com.google.android.libraries.search.silk.web.initialization.AutoValue_SilkInitializationFeature;
import com.google.android.libraries.search.silk.web.initialization.AutoValue_SilkInitializationPostMessageConfig;
import com.google.android.libraries.search.silk.web.initialization.C40808c;
import com.google.android.libraries.search.silk.web.initialization.SilkInitializationMessageHandler;
import com.google.android.libraries.search.silk.web.lens.AutoValue_SilkLensFeature;
import com.google.android.libraries.search.silk.web.lens.AutoValue_SilkLensPostMessageConfig;
import com.google.android.libraries.search.silk.web.lens.C40820c;
import com.google.android.libraries.search.silk.web.lens.SilkLensMessageHandler;
import com.google.android.libraries.search.silk.web.logging.AutoValue_SilkLoggingFeature;
import com.google.android.libraries.search.silk.web.logging.AutoValue_SilkLoggingPostMessageConfig;
import com.google.android.libraries.search.silk.web.logging.C40830c;
import com.google.android.libraries.search.silk.web.logging.SilkLoggingMessageHandler;
import com.google.android.libraries.search.silk.web.notification.AutoValue_SilkNotificationV2Feature;
import com.google.android.libraries.search.silk.web.notification.AutoValue_SilkNotificationV2PostMessageConfig;
import com.google.android.libraries.search.silk.web.notification.C40840c;
import com.google.android.libraries.search.silk.web.notification.SilkNotificationV2MessageHandler;
import com.google.android.libraries.search.silk.web.panes.AutoValue_SilkPanesFeature;
import com.google.android.libraries.search.silk.web.panes.AutoValue_SilkPanesPostMessageConfig;
import com.google.android.libraries.search.silk.web.panes.SilkPanesMessageHandler;
import com.google.android.libraries.search.silk.web.phonecall.C40877c;
import com.google.android.libraries.search.silk.web.phonecall.SilkPhonecallFeature;
import com.google.android.libraries.search.silk.web.prewarmplay.AutoValue_SilkPrewarmPlayFeature;
import com.google.android.libraries.search.silk.web.prewarmplay.AutoValue_SilkPrewarmPlayPostMessageConfig;
import com.google.android.libraries.search.silk.web.prewarmplay.C40884c;
import com.google.android.libraries.search.silk.web.prewarmplay.SilkPrewarmPlayMessageHandler;
import com.google.android.libraries.search.silk.web.searchbox.AutoValue_SilkSearchboxFeature;
import com.google.android.libraries.search.silk.web.searchbox.AutoValue_SilkSearchboxPostMessageConfig;
import com.google.android.libraries.search.silk.web.searchbox.SilkSearchboxMessageHandler;
import com.google.android.libraries.search.silk.web.share.C40907c;
import com.google.android.libraries.search.silk.web.share.SilkShareFeature;
import com.google.android.libraries.search.silk.web.signin.AutoValue_SilkSignInFeature;
import com.google.android.libraries.search.silk.web.signin.SilkSignInFeature;
import com.google.android.libraries.search.silk.web.timestamp.AutoValue_SilkTimestampFeature;
import com.google.android.libraries.search.silk.web.timestamp.AutoValue_SilkTimestampPostMessageConfig;
import com.google.android.libraries.search.silk.web.timestamp.SilkTimestampMessageHandler;
import com.google.android.libraries.search.silk.web.uimodes.SilkUiModesFeature;
import com.google.android.libraries.search.silk.web.weathersettings.AutoValue_SilkWeatherSettingsFeature;
import com.google.android.libraries.search.silk.web.weathersettings.AutoValue_SilkWeatherSettingsPostMessageConfig;
import com.google.android.libraries.search.silk.web.weathersettings.C41349c;
import com.google.android.libraries.search.silk.web.weathersettings.SilkWeatherSettingsMessageHandler;
import com.google.android.libraries.search.silk.web.webglide.AutoValue_SilkWebGlideFeature;
import com.google.android.libraries.search.silk.web.webglide.AutoValue_SilkWebGlidePostMessageConfig;
import com.google.android.libraries.search.silk.web.webglide.C41356c;
import com.google.android.libraries.search.silk.web.webglide.SilkWebGlideMessageHandler;
import com.google.android.libraries.search.silk.web.xblendcontainer.AutoValue_SilkXblendContainerFeature;
import com.google.android.libraries.search.silk.web.xblendcontainer.AutoValue_SilkXblendContainerPostMessageConfig;
import com.google.android.libraries.search.silk.web.xblendcontainer.SilkXblendContainerMessageHandler;
import com.google.android.libraries.silk.p3205a.p3209ac.C41712a;
import com.google.android.libraries.silk.p3205a.p3210ad.C41713a;
import com.google.android.libraries.silk.p3205a.p3211ae.C41714a;
import com.google.android.libraries.silk.p3205a.p3214c.C41717a;
import com.google.android.libraries.silk.p3205a.p3215d.C41718a;
import com.google.android.libraries.silk.p3205a.p3217f.C41720a;
import com.google.android.libraries.silk.p3205a.p3221j.C41724a;
import com.google.android.libraries.silk.p3205a.p3222k.C41725a;
import com.google.android.libraries.silk.p3205a.p3225n.C41728a;
import com.google.android.libraries.silk.p3205a.p3226o.C41729a;
import com.google.android.libraries.silk.p3205a.p3227p.C41730a;
import com.google.android.libraries.silk.p3205a.p3229r.C41732a;
import com.google.android.libraries.silk.p3205a.p3230s.C41733a;
import com.google.android.libraries.silk.p3205a.p3232u.C41735a;
import com.google.android.libraries.silk.p3205a.p3237z.C41741a;
import com.google.android.libraries.web.base.C43259j;
import com.google.android.libraries.web.base.WebConfig;
import com.google.android.libraries.web.contrib.debug.C43471c;
import com.google.android.libraries.web.contrib.debug.C43474f;
import com.google.android.libraries.web.contrib.debug.DebugFeature;
import com.google.android.libraries.web.contrib.fullscreen.FullScreenFeature;
import com.google.android.libraries.web.contrib.googlesignin.C43586d;
import com.google.android.libraries.web.contrib.googlesignin.GoogleSignInFeature;
import com.google.android.libraries.web.contrib.logging.LoggingFeature;
import com.google.android.libraries.web.shared.contrib.C44085c;
import com.google.android.libraries.web.webview.contrib.filechooser.AutoValue_FileChooserFeature;
import com.google.android.libraries.web.webview.contrib.setup.WebViewSetupFeature;
import com.google.android.libraries.web.webview.contrib.stuckjs.StuckJsFeature;
import com.google.apps.tiktok.account.AccountId;
import com.google.apps.tiktok.contrib.p3629c.C46485f;
import com.google.apps.tiktok.dataservice.C46801dp;
import com.google.apps.tiktok.experiments.C46897i;
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
import com.google.apps.tiktok.tracing.C47558bi;
import com.google.apps.tiktok.tracing.C47570bu;
import com.google.apps.tiktok.tracing.C47573bx;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.apps.tiktok.tracing.C47816ey;
import com.google.apps.tiktok.tracing.C47831fm;
import com.google.common.base.C58838bb;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.p4552o.apk;
import com.google.p4283bv.p4287b.p4288a.p4322b.C56851g;
import com.google.p4283bv.p4287b.p4288a.p4322b.C56852h;
import com.google.protobuf.C62921ba;
import com.google.protobuf.C62972cr;
import com.google.protobuf.C62974ct;
import com.google.protobuf.contrib.android.ProtoParsers;
import dagger.hilt.p5299a.C68288b;
import dagger.p5294a.C68221g;
import dagger.p5294a.C68225k;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicReference;
import p3186j$.util.DesugarArrays;
import p3186j$.util.Objects;
import p3186j$.util.Optional;
import p3186j$.util.stream.Stream;
import p5304e.p5305a.p5306a.p5411p.p5416c.p5417a.C69036bf;
import p5304e.p5305a.p5306a.p5411p.p5416c.p5417a.C69080cw;
import p5462h.p5463a.C69540x;

/* compiled from: PG */
public final class SearchFragment extends C137394ad implements C47231d, C68288b, C47200b, C47233b, C47570bu {

    /* renamed from: a */
    private C137553n f373679a;

    /* renamed from: c */
    private Context f373680c;

    /* renamed from: d */
    private final C2393x f373681d = new C2393x(this);

    /* renamed from: e */
    private boolean f373682e;

    @Deprecated
    public SearchFragment() {
        C19559g.m37304c();
    }

    /* renamed from: a */
    public final C137553n mo17754z() {
        C137553n nVar = this.f373679a;
        if (nVar == null) {
            throw new IllegalStateException("peer() called before initialized.");
        } else if (!this.f373682e) {
            return nVar;
        } else {
            throw new IllegalStateException("peer() called after destroyed.");
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final /* synthetic */ C47247a mo113697b() {
        return new C47242k(this);
    }

    public final void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.dump(str, fileDescriptor, printWriter, strArr);
        C137553n a = mo17754z();
        printWriter.println(String.valueOf(str).concat("google_app_search"));
        Stream map = DesugarArrays.stream((T[]) a.f374137f.mo113742c().mo50688b().mo59170I(C62972cr.f170009a).split("\n")).map(new C137537k(str));
        Objects.requireNonNull(printWriter);
        map.forEach(new C137547l(printWriter));
    }

    @Deprecated
    /* renamed from: e */
    public final Context mo17857e() {
        if (this.f373680c == null) {
            this.f373680c = new C47236e((Fragment) this, super.getContext());
        }
        return this.f373680c;
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
        return this.f373681d;
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
            C137379a.m223218a(th, th);
        }
        throw th;
    }

    public final void onCreate(Bundle bundle) {
        C137553n a;
        this.f122869b.mo51381i();
        try {
            mo51111l(bundle);
            a = mo17754z();
            if (bundle != null) {
                a.f374115G = bundle.getBoolean("isChangingConfigurations");
                a.f374156y = bundle.getBoolean("isActiveTab");
                String string = bundle.getString("currentFragmentType");
                if (!TextUtils.isEmpty(string)) {
                    a.f374116H = C137393ac.m223236b(string);
                }
                String[] stringArray = bundle.getStringArray("backNavStack");
                if (stringArray != null && stringArray.length > 0) {
                    a.f374113E = new ArrayDeque(Arrays.asList(stringArray));
                }
                a.f374157z = bundle.getString("pendingPrefetchQuery");
                String string2 = bundle.getString("pendingPrefetchType");
                if (string2 != null && !TextUtils.isEmpty(string2)) {
                    a.f374109A = C137770au.m223954a(string2);
                }
                if (bundle.containsKey("pendingPrefetchQueryCommitData")) {
                    a.f374110B = (C138127i) ProtoParsers.m95520c(bundle, "pendingPrefetchQueryCommitData", C138127i.f375805b, C62921ba.m95368a());
                }
                if (a.f374153v) {
                    try {
                        a.f374114F = (C137421j) ProtoParsers.m95520c(bundle, "voiceQueryOptions", C137421j.f373789c, C62921ba.m95368a());
                    } catch (C62974ct e) {
                        ((C58970a) ((C58970a) ((C58970a) C137553n.f374108a.mo56226d()).mo56382g(e)).mo56372aa(40972)).mo56389s("failed to parse bundle for key %s", "voiceQueryOptions");
                    }
                }
            }
        } catch (C62974ct e2) {
            ((C58970a) ((C58970a) ((C58970a) C137553n.f374108a.mo56226d()).mo56382g(e2)).mo56372aa(40973)).mo56389s("failed to parse bundle for key %s", "pendingPrefetchQueryCommitData");
        } catch (Throwable th) {
            try {
                C47831fm.m85019n();
            } catch (Throwable th2) {
                C137379a.m223218a(th, th2);
            }
            throw th;
        }
        if (a.f374141j.mo112951a()) {
            a.f374111C = a.f374138g.registerForActivityResult(new C0812e(), new C137525j(a));
        }
        if (a.f374152u) {
            FragmentManager childFragmentManager = a.f374138g.getChildFragmentManager();
            childFragmentManager.f644k.mo606o(a.f374155x, true);
        }
        C47831fm.m85019n();
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C47558bi a;
        this.f122869b.mo51381i();
        try {
            mo51119t(layoutInflater, viewGroup, bundle);
            C137553n a2 = mo17754z();
            a = C47831fm.m85006a("SearchFragmentPeer#onCreateView");
            ViewGroup viewGroup2 = (ViewGroup) layoutInflater.inflate(R.layout.googleapp_search_fragment, viewGroup, false);
            C28306ab abVar = a2.f374145n;
            abVar.mo33801b(viewGroup2, abVar.f76990a.mo33805a(C28427h.m53115a(136049)));
            a2.f374136e.mo115167b(new C137459h(a2));
            C0167am activity = a2.f374138g.getActivity();
            if (activity != null) {
                activity.getWindow().setStatusBarColor(0);
            }
            if (a2.f374141j.mo112951a()) {
                a2.f374140i.mo50707a(a2.f374147p.mo114523b(), new C137553n.C137554a(a2, a2.f374147p, a2.f374154w, a2.f374153v, a2.f374144m, a2.f374150s));
            }
            a2.f374115G = false;
            a.close();
            if (viewGroup2 != null) {
                C47831fm.m85019n();
                return viewGroup2;
            }
            throw new NullPointerException("Fragment cannot use Event annotations with null view!");
        } catch (Throwable th) {
            try {
                C47831fm.m85019n();
            } catch (Throwable th2) {
                C137379a.m223218a(th, th2);
            }
            throw th;
        }
        throw th;
    }

    public final void onDestroy() {
        C47573bx b = this.f122869b.mo51374b();
        try {
            mo51112m();
            C137553n a = mo17754z();
            if (a.f374152u) {
                FragmentManager childFragmentManager = a.f374138g.getChildFragmentManager();
                childFragmentManager.f644k.mo607p(a.f374155x);
            }
            b.close();
            return;
        } catch (Throwable th) {
            C137379a.m223218a(th, th);
        }
        throw th;
    }

    public final void onDestroyView() {
        C47573bx c = this.f122869b.mo51375c();
        try {
            mo51113n();
            C137553n a = mo17754z();
            if (a.f374151t || (a.f374139h.f373757a & 16) != 0) {
                C3807af a2 = a.f374133b.mo50482c(a.f374138g).mo50505a();
                C3896q qVar = a.f374112D;
                qVar.getClass();
                a2.mo8054n(qVar);
            }
            c.close();
            return;
        } catch (Throwable th) {
            C137379a.m223218a(th, th);
        }
        throw th;
    }

    public final void onDetach() {
        C47573bx d = this.f122869b.mo51376d();
        try {
            mo51114o();
            this.f373682e = true;
            d.close();
            return;
        } catch (Throwable th) {
            C137379a.m223218a(th, th);
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
            C137379a.m223218a(th, th);
        }
        throw th;
    }

    public final void onSaveInstanceState(Bundle bundle) {
        C137421j jVar;
        this.f122869b.mo51381i();
        try {
            this.f54442o.mo24721A(bundle);
            C137553n a = mo17754z();
            C0167am activity = a.f374138g.getActivity();
            if (activity != null && activity.isChangingConfigurations()) {
                bundle.putBoolean("isChangingConfigurations", true);
            }
            bundle.putBoolean("isActiveTab", a.f374156y);
            int i = a.f374116H;
            String a2 = C137393ac.m223235a(i);
            if (i != 0) {
                bundle.putString("currentFragmentType", a2);
                Deque deque = a.f374113E;
                bundle.putStringArray("backNavStack", (String[]) deque.toArray(new String[deque.size()]));
                String str = a.f374157z;
                if (str != null) {
                    bundle.putString("pendingPrefetchQuery", str);
                }
                C137770au auVar = a.f374109A;
                if (auVar != null) {
                    bundle.putString("pendingPrefetchType", auVar.name());
                }
                C138127i iVar = a.f374110B;
                if (iVar != null && !iVar.equals(C138127i.f375805b)) {
                    bundle.putParcelable("pendingPrefetchQueryCommitData", new ProtoParsers.InternalDontUse((byte[]) null, a.f374110B));
                }
                if (a.f374153v && (jVar = a.f374114F) != null) {
                    ProtoParsers.m95532o(bundle, "voiceQueryOptions", jVar);
                }
                C47831fm.m85019n();
                return;
            }
            throw null;
        } catch (Throwable th) {
            C137379a.m223218a(th, th);
        }
        throw th;
    }

    public final void onStart() {
        View view;
        this.f122869b.mo51381i();
        try {
            mo51117r();
            C137553n a = mo17754z();
            a.f374143l.mo115307d();
            C137411e eVar = a.f374139h;
            if ((eVar.f373757a & 16) == 0) {
                if (a.f374116H == 3 && a.f374156y) {
                    a.mo113825z(3);
                    C138546aa m = a.mo113812m();
                    m.getClass();
                    m.mo17754z().mo114326d().mo114406h();
                }
                if (a.f374116H == 4) {
                    C138546aa m2 = a.mo113812m();
                    if (!(m2 == null || (view = m2.getView()) == null)) {
                        view.clearFocus();
                    }
                    a.mo113820u();
                }
            } else if (a.f374116H == 1) {
                C137418g gVar = eVar.f373761e;
                if (gVar == null) {
                    gVar = C137418g.f373767r;
                }
                a.mo113819t(gVar);
            } else if (a.mo113822w()) {
                C138546aa m3 = a.mo113812m();
                m3.getClass();
                m3.mo17754z().mo114326d().mo114406h();
            }
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C137379a.m223218a(th, th);
        }
        throw th;
    }

    public final void onStop() {
        this.f122869b.mo51381i();
        try {
            mo51118s();
            C137553n a = mo17754z();
            if (!a.f374134c.isChangingConfigurations()) {
                a.f374146o.mo114521d(0);
            }
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C137379a.m223218a(th, th);
        }
        throw th;
    }

    public final void onViewCreated(View view, Bundle bundle) {
        this.f122869b.mo51381i();
        try {
            C47389c.m84226a(getContext()).f123128b = view;
            C137553n a = mo17754z();
            C47393f.m84233d(this, C138585j.class, new C137559s(a));
            C47393f.m84233d(this, C138587l.class, new C138683t(a));
            C47393f.m84233d(this, C138582g.class, new C138684u(a));
            C47393f.m84233d(this, C138581f.class, new C138685v(a));
            C47393f.m84233d(this, C138586k.class, new C138919w(a));
            C47393f.m84233d(this, C137837a.class, new C138920x(a));
            C47393f.m84233d(this, C138792c.class, new C138921y(a));
            C47393f.m84233d(this, C135451x.class, new C138922z(a));
            C47393f.m84233d(this, C138794e.class, new C137391aa(a));
            C47393f.m84233d(this, C138793d.class, new C137555o(a));
            C47393f.m84233d(this, C137822u.class, new C137556p(a));
            C47393f.m84233d(this, C138790a.class, new C137557q(a));
            C47393f.m84233d(this, C138791b.class, new C137558r(a));
            this.f54442o.mo24720k(bundle);
            C137553n a2 = mo17754z();
            if (a2.f374151t || (a2.f374139h.f373757a & 16) != 0) {
                a2.f374112D = new C137475i(a2);
                a2.f374156y = false;
                a2.f374133b.mo50482c(a2.f374138g).mo50505a().mo8051k(a2.f374112D);
            }
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C137379a.m223218a(th, th);
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
        SearchFragment searchFragment = this;
        searchFragment.f122869b.mo51381i();
        try {
            if (!searchFragment.f373682e) {
                super.onAttach(context);
                if (searchFragment.f373679a == null) {
                    Object jN = mo113701d().mo17653jN();
                    Context context2 = (Context) ((C74176nj) jN).f206836d.f205391d.mo17428b();
                    Bundle b = ((C74176nj) jN).mo69504b();
                    C58838bb.m90869d(b.containsKey("TIKTOK_FRAGMENT_ARGUMENT"), "Proto @Argument for Fragment could not be found. @Arguments must be provided using the Fragment#create(MessageLite argument) overload.");
                    C137411e eVar = (C137411e) ProtoParsers.m95522e(b, "TIKTOK_FRAGMENT_ARGUMENT", C137411e.f373755g, (C62921ba) ((C74176nj) jN).f206677a.gG.mo17428b());
                    C68225k.m98532d(eVar);
                    C89859i iVar = (C89859i) ((C74176nj) jN).f206677a.c.f201254bi.mo17428b();
                    boolean a = C69036bf.m100108a(((C74176nj) jN).f206730b.f198009I);
                    boolean f = ((C46897i) ((C74176nj) jN).f206730b.f198027a.f199228b.f198009I.mo17428b()).mo50901a("com.google.android.libraries.search.googleapp.user 45373432").mo50907f();
                    boolean f2 = ((C46897i) ((C74176nj) jN).f206730b.f198027a.f199228b.f198009I.mo17428b()).mo50901a("com.google.android.libraries.search.googleapp.user 45372737").mo50907f();
                    boolean f3 = ((C46897i) ((C74176nj) jN).f206730b.f198027a.f199228b.f198009I.mo17428b()).mo50901a("com.google.android.libraries.search.googleapp.user 45372738").mo50907f();
                    String e = ((C46897i) ((C74176nj) jN).f206730b.f198027a.f199228b.f198009I.mo17428b()).mo50901a("com.google.android.libraries.search.googleapp.user 45366681").mo50906e();
                    C68225k.m98532d(e);
                    boolean f4 = ((C46897i) ((C74176nj) jN).f206730b.f198027a.f199228b.f198009I.mo17428b()).mo50901a("com.google.android.libraries.search.googleapp.user 45367730").mo50907f();
                    boolean lR = ((C74176nj) jN).f206730b.f198027a.mo67157lR();
                    boolean b2 = C69080cw.m100186b(((C74176nj) jN).f206730b.f198009I);
                    boolean booleanValue = ((Boolean) ((C74176nj) jN).f206730b.f198027a.f199542gw.mo17428b()).booleanValue();
                    C38768q qVar = (C38768q) ((C74176nj) jN).f206730b.f198016P.mo17428b();
                    AtomicReference atomicReference = (AtomicReference) ((C74176nj) jN).f206783c.f205455i.mo17428b();
                    aqe aqe = ((C74176nj) jN).f206730b.f198027a;
                    C133665d dVar = (C133665d) aqe.f199228b.f198021U.mo17428b();
                    Optional of = Optional.m71637of(new C134106b());
                    C40758l eH = aqe.mo66888eH();
                    aqe.mo67133ku();
                    String str = "Attempt to inject a Fragment wrapper of type ";
                    boolean f5 = ((C46897i) aqe.f199228b.f198009I.mo17428b()).mo50901a("com.google.android.libraries.search.googleapp.user 45353858").mo50907f();
                    String str2 = e;
                    boolean f6 = ((C46897i) aqe.mo66953fT().f185286a.mo17428b()).mo50901a("com.google.android.libraries.search.googleapp.user 45352854").mo50907f();
                    boolean z = f3;
                    boolean f7 = ((C46897i) aqe.f199228b.f198009I.mo17428b()).mo50901a("com.google.android.libraries.search.googleapp.user 45365485").mo50907f();
                    boolean z2 = f2;
                    boolean f8 = ((C46897i) aqe.f199228b.f198009I.mo17428b()).mo50901a("com.google.android.libraries.search.googleapp.user 45365863").mo50907f();
                    boolean f9 = ((C46897i) aqe.f199228b.f198009I.mo17428b()).mo50901a("com.google.android.libraries.search.googleapp.user 45366397").mo50907f();
                    C40756j jVar = (C40756j) C40757k.f106857c.createBuilder();
                    boolean z3 = f;
                    apk apk = apk.TNG_SEARCH;
                    jVar.copyOnWrite();
                    boolean z4 = a;
                    C40757k kVar = (C40757k) jVar.instance;
                    kVar.f106860b = apk.f159677E;
                    kVar.f106859a |= 1;
                    C43259j jVar2 = new C43259j();
                    jVar2.mo46375e(dVar.mo111322c());
                    jVar2.f113067j = f7;
                    jVar2.f113066i = f8;
                    jVar2.f113069l = f9;
                    C43471c g = DebugFeature.m76710g();
                    g.mo46551b(C43474f.GOOGLE_APP_SEARCH);
                    g.mo46552c(30);
                    C40689c cVar = new C40689c();
                    C44085c cVar2 = new C44085c();
                    cVar2.mo47058c(new AutoValue_SilkAudioRecordingPostMessageConfig());
                    C89859i iVar2 = iVar;
                    cVar2.f114767d.add(SilkAudioRecordingMessageHandler.class);
                    cVar2.mo47057b(C41717a.class, cVar.getClass());
                    C40703c cVar3 = new C40703c();
                    C44085c cVar4 = new C44085c();
                    cVar4.mo47058c(new AutoValue_SilkAutobotPostMessageConfig());
                    cVar4.f114767d.add(SilkAutobotMessageHandler.class);
                    cVar4.mo47057b(C41718a.class, cVar3.getClass());
                    C137549a aVar = new C137549a();
                    C44085c cVar5 = new C44085c();
                    cVar5.mo47058c(new AutoValue_SilkFeedbackPostMessageConfig());
                    cVar5.f114767d.add(SilkFeedbackMessageHandler.class);
                    cVar5.mo47057b(C41724a.class, aVar.getClass());
                    C40778c cVar6 = new C40778c();
                    C44085c cVar7 = new C44085c();
                    cVar7.mo47058c(new AutoValue_SilkFootprintsConsentPostMessageConfig());
                    cVar7.f114767d.add(SilkFootprintsConsentMessageHandler.class);
                    cVar7.mo47057b(C41725a.class, cVar6.getClass());
                    C40808c cVar8 = new C40808c();
                    C44085c cVar9 = new C44085c();
                    cVar9.mo47058c(new AutoValue_SilkInitializationPostMessageConfig());
                    cVar9.mo47057b(C41728a.class, cVar8.getClass());
                    cVar9.f114767d.add(SilkInitializationMessageHandler.class);
                    C40820c cVar10 = new C40820c();
                    C44085c cVar11 = new C44085c();
                    cVar11.mo47058c(new AutoValue_SilkLensPostMessageConfig());
                    cVar11.f114767d.add(SilkLensMessageHandler.class);
                    cVar11.mo47057b(C41729a.class, cVar10.getClass());
                    C40830c cVar12 = new C40830c();
                    C44085c cVar13 = new C44085c();
                    cVar13.mo47058c(new AutoValue_SilkLoggingPostMessageConfig());
                    cVar13.f114767d.add(SilkLoggingMessageHandler.class);
                    cVar13.mo47057b(C41730a.class, cVar12.getClass());
                    C139893a aVar2 = new C139893a();
                    C44085c cVar14 = new C44085c();
                    cVar14.mo47058c(new AutoValue_SilkPanesPostMessageConfig());
                    cVar14.f114767d.add(SilkPanesMessageHandler.class);
                    cVar14.mo47057b(C41733a.class, aVar2.getClass());
                    C40884c cVar15 = new C40884c();
                    C44085c cVar16 = new C44085c();
                    cVar16.mo47058c(new AutoValue_SilkPrewarmPlayPostMessageConfig());
                    cVar16.f114767d.add(SilkPrewarmPlayMessageHandler.class);
                    cVar16.mo47057b(C41735a.class, cVar15.getClass());
                    C56851g gVar = (C56851g) C56852h.f151675d.createBuilder();
                    gVar.copyOnWrite();
                    C56852h hVar = (C56852h) gVar.instance;
                    hVar.f151677a |= 2;
                    hVar.f151679c = 37;
                    gVar.mo54436a(Arrays.asList(new Integer[0]));
                    C44085c cVar17 = new C44085c();
                    cVar17.mo47058c(new AutoValue_SilkSearchboxPostMessageConfig());
                    cVar17.f114767d.add(SilkSearchboxMessageHandler.class);
                    C56851g gVar2 = (C56851g) C56852h.f151675d.createBuilder();
                    gVar2.copyOnWrite();
                    C56852h hVar2 = (C56852h) gVar2.instance;
                    hVar2.f151677a |= 2;
                    hVar2.f151679c = 41;
                    gVar2.mo54436a(Arrays.asList(new Integer[0]));
                    C137551b bVar = new C137551b();
                    C44085c cVar18 = new C44085c();
                    cVar18.mo47058c(new AutoValue_SilkTimestampPostMessageConfig());
                    cVar18.f114767d.add(SilkTimestampMessageHandler.class);
                    cVar18.mo47057b(C41741a.class, bVar.getClass());
                    C41349c cVar19 = new C41349c();
                    C44085c cVar20 = new C44085c();
                    cVar20.mo47058c(new AutoValue_SilkWeatherSettingsPostMessageConfig());
                    cVar20.f114767d.add(SilkWeatherSettingsMessageHandler.class);
                    cVar20.mo47057b(C41712a.class, cVar19.getClass());
                    C41356c cVar21 = new C41356c();
                    C44085c cVar22 = new C44085c();
                    cVar22.mo47058c(new AutoValue_SilkWebGlidePostMessageConfig());
                    cVar22.f114767d.add(SilkWebGlideMessageHandler.class);
                    cVar22.mo47057b(C41713a.class, cVar21.getClass());
                    jVar2.mo46372b(g.mo46555d(), new AutoValue_FileChooserFeature(), FullScreenFeature.f113728a, LoggingFeature.m77099d(C137860e.class), new AutoValue_RecentsFeature(), new AutoValue_SearchLocationFeature(), SilkAmpFeature.m70435e(new C133470f()), SilkAndroidUriFeature.m70461e(new C40672c()), new AutoValue_SilkAudioRecordingFeature(cVar2.mo47056a(), C40759m.m70631a(5, new Integer[0])), new AutoValue_SilkAutobotFeature(cVar4.mo47056a(), C40759m.m70631a(6, new Integer[0])), SilkCollectionsV2Feature.m70594e(new C139888f()), SilkDownloadFeature.m70636e(new C40763c()), new AutoValue_SilkFeedbackFeature(cVar5.mo47056a(), C40759m.m70631a(16, new Integer[0])), new AutoValue_SilkFootprintsConsentFeature(cVar7.mo47056a(), C40759m.m70631a(17, new Integer[0])), SilkGeolocationFeature.m70712e(new C40788c()), SilkHomescreenShortcutsFeature.m70740e(new C40801c()), new AutoValue_SilkInitializationFeature(C40759m.m70631a(24, new Integer[]{1, 2, 3}), cVar9.mo47056a()), new AutoValue_SilkLensFeature(cVar11.mo47056a(), C40759m.m70631a(27, new Integer[0])), new AutoValue_SilkLoggingFeature(cVar13.mo47056a(), C40759m.m70631a(28, new Integer[]{1})), new AutoValue_SilkPanesFeature(cVar14.mo47056a(), C40759m.m70631a(32, new Integer[0])), SilkPhonecallFeature.m70895e(new C40877c()), new AutoValue_SilkPrewarmPlayFeature(cVar16.mo47056a(), C40759m.m70631a(35, new Integer[0])), new AutoValue_SilkSearchboxFeature(cVar17.mo47056a(), new ProtoParsers.InternalDontUse((byte[]) null, (C56852h) gVar.build())), SilkShareFeature.m70984e(new C40907c()), new AutoValue_SilkSignInFeature(SilkSignInFeature.m71018f().mo47056a(), new ProtoParsers.InternalDontUse((byte[]) null, (C56852h) gVar2.build())), new AutoValue_SilkTimestampFeature(cVar18.mo47056a(), C40759m.m70631a(43, new Integer[]{1})), SilkUiModesFeature.m71065e(SilkUiModesFeature.m71066f()), new AutoValue_SilkWeatherSettingsFeature(cVar20.mo47056a(), C40759m.m70631a(46, new Integer[0])), new AutoValue_SilkWebGlideFeature(cVar22.mo47056a(), C40759m.m70631a(47, new Integer[0])), StuckJsFeature.m78405e(), new AutoValue_UserAgentListenerFeature(), WebViewSetupFeature.m78387d(C137873i.class), eH.mo42702a((C40757k) jVar.build()));
                    if (f5) {
                        C139897a aVar3 = new C139897a();
                        C44085c cVar23 = new C44085c();
                        cVar23.mo47058c(new AutoValue_SilkXblendContainerPostMessageConfig());
                        cVar23.f114767d.add(SilkXblendContainerMessageHandler.class);
                        cVar23.mo47057b(C41714a.class, aVar3.getClass());
                        jVar2.mo46373c(new AutoValue_SilkXblendContainerFeature(cVar23.mo47056a(), C40759m.m70631a(48, new Integer[0])));
                    }
                    if (of.isPresent()) {
                        C44085c cVar24 = new C44085c();
                        cVar24.mo47058c(new AutoValue_SilkChannelsPostMessageConfig());
                        cVar24.f114767d.add(SilkChannelsMessageHandler.class);
                        cVar24.mo47057b(C41720a.class, ((C134106b) of.get()).getClass());
                        jVar2.mo46373c(new AutoValue_SilkChannelsFeature(cVar24.mo47056a(), C40759m.m70631a(7, new Integer[]{1})));
                    }
                    C43586d e2 = GoogleSignInFeature.m76919e();
                    e2.f113777c = C137872h.class;
                    jVar2.mo46373c(e2.mo46642c());
                    C40840c cVar25 = new C40840c();
                    C44085c cVar26 = new C44085c();
                    cVar26.mo47058c(new AutoValue_SilkNotificationV2PostMessageConfig());
                    cVar26.f114767d.add(SilkNotificationV2MessageHandler.class);
                    cVar26.mo47057b(C41732a.class, cVar25.getClass());
                    jVar2.mo46373c(new AutoValue_SilkNotificationV2Feature(cVar26.mo47056a(), C40759m.m70631a(31, new Integer[0])));
                    if (f6) {
                        jVar2.mo46373c(new AutoValue_SrpPromotionFeature());
                    }
                    jVar2.mo46373c(new AutoValue_HeavyPrewarmerWebFeature());
                    C69540x.m100812s(jVar2.f113072o, new Class[]{SrpRequestObserver.class, ExternalRequestObserver.class});
                    WebConfig a2 = jVar2.mo46371a();
                    AccountId accountId = (AccountId) ((C74176nj) jN).f206730b.f198239e.mo17428b();
                    C46485f fVar = (C46485f) ((C74176nj) jN).f206995g.mo17428b();
                    Activity activity = (Activity) ((C74176nj) jN).f206836d.f205391d.mo17428b();
                    ((C74176nj) jN).mo69971l();
                    C139695b bVar2 = (C139695b) ((C74176nj) jN).f206730b.f198027a.f199333cz.mo17428b();
                    C137401b bVar3 = (C137401b) ((C74176nj) jN).f206730b.f198027a.f199286cE.mo17428b();
                    C21370a aVar4 = (C21370a) ((C74176nj) jN).f206677a.i.mo17428b();
                    C139684f eb = ((C74176nj) jN).mo69691eb();
                    C38553h hVar3 = (C38553h) ((C74176nj) jN).f206730b.f198027a.f199220as.mo17428b();
                    C133411h hVar4 = (C133411h) ((C74176nj) jN).f206836d.f205431m.mo17428b();
                    C137852a aVar5 = (C137852a) ((C74176nj) jN).f206730b.f198027a.f199282cA.mo17428b();
                    C137447w wVar = (C137447w) ((C74176nj) jN).f206730b.f198027a.f199478fl.mo17428b();
                    Fragment fragment = (Fragment) ((C68221g) ((C74176nj) jN).f206889e).f184583a;
                    if (fragment instanceof SearchFragment) {
                        SearchFragment searchFragment2 = (SearchFragment) fragment;
                        C68225k.m98532d(searchFragment2);
                        C137553n nVar = r7;
                        C137553n nVar2 = new C137553n(context2, eVar, iVar2, z4, z3, z2, z, str2, f4, lR, b2, booleanValue, qVar, atomicReference, a2, accountId, fVar, activity, bVar3, aVar4, eb, hVar3, hVar4, aVar5, wVar, searchFragment2, (C137485ae) ((C74176nj) jN).f206783c.f205461o.mo17428b(), (C46801dp) ((C74176nj) jN).f207084k.mo17428b(), (C133118a) ((C74176nj) jN).f206730b.f198027a.f199877w.mo17428b(), ((C74176nj) jN).mo69693ed(), ((C74176nj) jN).f206730b.mo66139cf(), ((C74176nj) jN).mo69697eh(), (C139846f) ((C74176nj) jN).f206652B.mo17428b(), (C138728b) ((C74176nj) jN).f206677a.d.f201629ci.mo17428b(), (C28306ab) ((C74176nj) jN).f206677a.a.f202880fS.mo17428b(), (C138767d) ((C74176nj) jN).f206730b.f198027a.f199545gz.mo17428b(), (C138772i) ((C74176nj) jN).f206730b.f198027a.f199544gy.mo17428b(), (C139708c) ((C74176nj) jN).f206730b.f198027a.f199482fp.mo17428b());
                        searchFragment = this;
                        searchFragment.f373679a = nVar;
                        super.getLifecycle().mo5790b(new TracedFragmentLifecycle(searchFragment.f122869b, searchFragment.f373681d));
                    } else {
                        throw new IllegalStateException(str + C137553n.class.toString() + ", but the wrapper available is of type: " + String.valueOf(fragment.getClass()) + ". Does your peer's @Inject constructor reference the wrong wrapper class?");
                    }
                }
                Fragment parentFragment = getParentFragment();
                if (parentFragment instanceof C47570bu) {
                    C47515ab abVar = searchFragment.f122869b;
                    if (abVar.f123354b == null) {
                        abVar.mo51380h(((C47570bu) parentFragment).mo17859g(), true);
                    }
                }
                C47831fm.m85019n();
                return;
            }
            throw new IllegalStateException("A Fragment cannot be attached more than once. Instead, create a new Fragment instance.");
        } catch (ClassCastException e3) {
            throw new IllegalStateException("Missing entry point. If you're in a test with explicit entry points specified in your @TestRoot, check that you're not missing the one for this class.", e3);
        } catch (Throwable th) {
            th = th;
            Throwable th2 = th;
            C47831fm.m85019n();
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
