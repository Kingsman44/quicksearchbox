package com.google.android.apps.search.sceneviewer.modelviewer;

import android.animation.LayoutTransition;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.support.p031v4.app.C0167am;
import android.view.GestureDetector;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.FrameLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.evernote.android.state.BuildConfig;
import com.google.android.apps.gsa.shared.logger.p7054d.C89885b;
import com.google.android.apps.search.sceneviewer.C141551i;
import com.google.android.apps.search.sceneviewer.C141568k;
import com.google.android.apps.search.sceneviewer.C141570m;
import com.google.android.apps.search.sceneviewer.immersiveedge.C141554c;
import com.google.android.apps.search.sceneviewer.immersiveedge.C141562f;
import com.google.android.apps.search.sceneviewer.immersiveedge.C141565i;
import com.google.android.apps.search.sceneviewer.immersiveedge.C141566j;
import com.google.android.apps.search.sceneviewer.immersiveedge.clientevents.C141559e;
import com.google.android.apps.search.sceneviewer.immersiveedge.clientevents.UserActionManager;
import com.google.android.apps.search.sceneviewer.modelviewer.p10651ui.PlacementHelpOverlay;
import com.google.android.apps.search.sceneviewer.p10646a.C141527b;
import com.google.android.apps.search.sceneviewer.p10646a.C141528c;
import com.google.android.apps.search.sceneviewer.p10646a.C141529d;
import com.google.android.apps.search.sceneviewer.p10646a.C141530e;
import com.google.android.apps.search.sceneviewer.p10647b.C141533a;
import com.google.android.apps.search.sceneviewer.p10647b.C141534b;
import com.google.android.apps.search.sceneviewer.p10648c.C141536a;
import com.google.android.apps.search.sceneviewer.p10648c.C141539d;
import com.google.android.apps.search.sceneviewer.p10649d.C141541a;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.p1730f.C21370a;
import com.google.android.libraries.p579ar.sceneviewer.accountability.CameraAccessAttributionHandler;
import com.google.android.libraries.p579ar.sceneviewer.analytics.ViewerLogger;
import com.google.android.libraries.p579ar.sceneviewer.concurrent.CompletableFuture;
import com.google.android.libraries.p579ar.sceneviewer.debug.DebugInfoView;
import com.google.android.libraries.p579ar.sceneviewer.dialog.ArSessionErrorDialogFragment;
import com.google.android.libraries.p579ar.sceneviewer.dialog.LoadObjectErrorDialogFragment;
import com.google.android.libraries.p579ar.sceneviewer.dialog.NoConnectionDialogFragment;
import com.google.android.libraries.p579ar.sceneviewer.header.TopViewGroup;
import com.google.android.libraries.p579ar.sceneviewer.hotspots.ButtonType;
import com.google.android.libraries.p579ar.sceneviewer.hotspots.HotspotsController;
import com.google.android.libraries.p579ar.sceneviewer.infocard.BottomViewGroup;
import com.google.android.libraries.p579ar.sceneviewer.media.capture.ShutterButtonController;
import com.google.android.libraries.p579ar.sceneviewer.media.gallery.GalleryButton;
import com.google.android.libraries.p579ar.sceneviewer.media.gallery.GalleryButtonController;
import com.google.android.libraries.p579ar.sceneviewer.modelviewer.ImpApiHandler;
import com.google.android.libraries.p579ar.sceneviewer.modelviewer.ModelViewer;
import com.google.android.libraries.p579ar.sceneviewer.notification.ChipNotification;
import com.google.android.libraries.p579ar.sceneviewer.notification.NotificationView;
import com.google.android.libraries.p579ar.sceneviewer.p589ui.ActualScaleButton;
import com.google.android.libraries.p579ar.sceneviewer.p589ui.FloatingButton;
import com.google.android.libraries.p579ar.sceneviewer.p589ui.NodeTransformationIndicator;
import com.google.android.libraries.p579ar.sceneviewer.p589ui.SimpleSnackbar;
import com.google.android.libraries.p579ar.sceneviewer.p589ui.ToggleModeButton;
import com.google.android.libraries.p579ar.sceneviewer.permissions.AllPermissionsFragment;
import com.google.android.libraries.p579ar.sceneviewer.permissions.CameraPermissionsFragment;
import com.google.android.libraries.p579ar.sceneviewer.permissions.MediaPermissionsFragment;
import com.google.android.libraries.p579ar.sceneviewer.permissions.PermissionUtilities;
import com.google.android.libraries.p579ar.sceneviewer.permissions.PermissionsCallback;
import com.google.android.libraries.p579ar.sceneviewer.utilities.AnimationUtilities;
import com.google.android.libraries.p579ar.sceneviewer.utilities.AppUtilities;
import com.google.android.libraries.p579ar.sceneviewer.utilities.ArOnboardingStatus;
import com.google.android.libraries.p579ar.sceneviewer.utilities.ThreadPools;
import com.google.android.libraries.p579ar.sceneviewer.utilities.UriUtilities;
import com.google.android.libraries.p579ar.sceneviewer.utilities.ViewUtilities;
import com.google.android.libraries.p579ar.sceneviewer.utilities.WebUtilities;
import com.google.android.libraries.search.p3047m.p3050b.C39226b;
import com.google.android.libraries.search.p3047m.p3050b.C39227c;
import com.google.apps.tiktok.account.AccountId;
import com.google.apps.tiktok.account.data.p3611a.C46128f;
import com.google.apps.tiktok.concurrent.futuresmixin.C46439e;
import com.google.apps.tiktok.concurrent.futuresmixin.C46440f;
import com.google.apps.tiktok.dataservice.C46723bg;
import com.google.apps.tiktok.dataservice.C46792di;
import com.google.apps.tiktok.dataservice.C46801dp;
import com.google.apps.tiktok.inject.p3660e.p3661a.C47247a;
import com.google.apps.tiktok.monitoring.feedback.C47465c;
import com.google.apps.tiktok.monitoring.feedback.C47474k;
import com.google.apps.tiktok.monitoring.feedback.C47475l;
import com.google.apps.tiktok.p3633d.p3634a.C46663a;
import com.google.apps.tiktok.p3633d.p3634a.C46667e;
import com.google.apps.tiktok.tracing.C47591co;
import com.google.apps.tiktok.tracing.C47770dh;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.base.C58833ax;
import com.google.common.base.C58837ba;
import com.google.common.base.C58869cf;
import com.google.common.base.C58903m;
import com.google.common.p4522b.C58557jl;
import com.google.common.p4522b.C58800sl;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4535g.C59203do;
import com.google.common.p4573p.C60713c;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import com.google.p3723ar.core.viewer.analytics.ArViewerLogEnumOuterClass;
import com.google.p3723ar.core.viewer.jniprotolite.Types;
import com.google.p3723ar.p3724a.p3725a.C47890a;
import com.google.p3723ar.p3724a.p3725a.C47891b;
import com.google.p3723ar.p3724a.p3725a.C47892c;
import com.google.protobuf.C62921ba;
import com.google.protobuf.C62974ct;
import com.google.protobuf.C63088z;
import dagger.hilt.android.internal.managers.C68324h;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.Executor;
import java.util.regex.Pattern;
import p3186j$.time.Duration;
import p3186j$.util.Objects;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.search.sceneviewer.modelviewer.am */
/* compiled from: PG */
public final class C141584am implements ModelViewer.Host {

    /* renamed from: a */
    public static final String f384270a = "am";

    /* renamed from: b */
    public static final C59071e f384271b = C59071e.m91332i("com.google.android.apps.search.sceneviewer.modelviewer.am");

    /* renamed from: c */
    public static final Duration f384272c = Duration.ofMillis(1100);

    /* renamed from: A */
    public ChipNotification f384273A;

    /* renamed from: B */
    public BottomViewGroup f384274B;

    /* renamed from: C */
    public TopViewGroup f384275C;

    /* renamed from: D */
    public ToggleModeButton f384276D;

    /* renamed from: E */
    public FrameLayout f384277E;

    /* renamed from: F */
    public View f384278F;

    /* renamed from: G */
    public RelativeLayout f384279G;

    /* renamed from: H */
    public FloatingButton f384280H;

    /* renamed from: I */
    public FloatingButton f384281I;

    /* renamed from: J */
    public NodeTransformationIndicator f384282J;

    /* renamed from: K */
    public ProgressBar f384283K;

    /* renamed from: L */
    public ProgressBar f384284L;

    /* renamed from: M */
    public TextView f384285M;

    /* renamed from: N */
    public NotificationView f384286N;

    /* renamed from: O */
    public View f384287O;

    /* renamed from: P */
    public final Set f384288P = new HashSet();

    /* renamed from: Q */
    public ShutterButtonController f384289Q;

    /* renamed from: R */
    public GalleryButtonController f384290R;

    /* renamed from: S */
    public UserActionManager f384291S;

    /* renamed from: T */
    public boolean f384292T = false;

    /* renamed from: U */
    public boolean f384293U = false;

    /* renamed from: V */
    public long f384294V;

    /* renamed from: W */
    public boolean f384295W = false;

    /* renamed from: X */
    public boolean f384296X;

    /* renamed from: Y */
    public Uri f384297Y;

    /* renamed from: Z */
    public Uri f384298Z;

    /* renamed from: aA */
    private boolean f384299aA = false;

    /* renamed from: aB */
    private final float f384300aB;

    /* renamed from: aC */
    private boolean f384301aC = false;

    /* renamed from: aD */
    private Types.ViewerMode f384302aD;

    /* renamed from: aE */
    private final List f384303aE = new ArrayList();

    /* renamed from: aF */
    private long f384304aF = -1;

    /* renamed from: aG */
    private long f384305aG = -1;

    /* renamed from: aH */
    private boolean f384306aH = false;

    /* renamed from: aI */
    private boolean f384307aI;

    /* renamed from: aJ */
    private final C141554c f384308aJ;

    /* renamed from: aa */
    public Types.SceneViewerParams.ModePreference f384309aa = Types.SceneViewerParams.ModePreference.THREED_PREFERRED;

    /* renamed from: ab */
    public Optional f384310ab;

    /* renamed from: ac */
    public Optional f384311ac;

    /* renamed from: ad */
    public boolean f384312ad = true;

    /* renamed from: ae */
    public Duration f384313ae = Duration.ZERO;

    /* renamed from: af */
    public Duration f384314af = Duration.ZERO;

    /* renamed from: ag */
    public boolean f384315ag = false;

    /* renamed from: ah */
    public boolean f384316ah = false;

    /* renamed from: ai */
    public boolean f384317ai = false;

    /* renamed from: aj */
    public Runnable f384318aj = null;

    /* renamed from: ak */
    public C141568k f384319ak;

    /* renamed from: al */
    public String f384320al;

    /* renamed from: am */
    public FrameLayout f384321am;

    /* renamed from: an */
    public final C141589ap f384322an;

    /* renamed from: ao */
    private final C141530e f384323ao;

    /* renamed from: ap */
    private final C141536a f384324ap;

    /* renamed from: aq */
    private final Executor f384325aq;

    /* renamed from: ar */
    private final C141534b f384326ar;

    /* renamed from: as */
    private final C141585a f384327as;

    /* renamed from: at */
    private final CameraAccessAttributionHandler f384328at;

    /* renamed from: au */
    private ActualScaleButton f384329au;

    /* renamed from: av */
    private final HotspotsController f384330av;

    /* renamed from: aw */
    private SimpleSnackbar f384331aw;

    /* renamed from: ax */
    private Optional f384332ax = Optional.empty();

    /* renamed from: ay */
    private boolean f384333ay = false;

    /* renamed from: az */
    private boolean f384334az = false;

    /* renamed from: d */
    public boolean f384335d = false;

    /* renamed from: e */
    public boolean f384336e = false;

    /* renamed from: f */
    public final C141592b f384337f;

    /* renamed from: g */
    public final UUID f384338g;

    /* renamed from: h */
    public final C47890a f384339h;

    /* renamed from: i */
    public final String f384340i;

    /* renamed from: j */
    public final C141541a f384341j;

    /* renamed from: k */
    public final C47770dh f384342k;

    /* renamed from: l */
    public final C141539d f384343l;

    /* renamed from: m */
    public final C46723bg f384344m;

    /* renamed from: n */
    public final C46439e f384345n;

    /* renamed from: o */
    public final C46801dp f384346o;

    /* renamed from: p */
    public final C141586b f384347p;

    /* renamed from: q */
    public final C46440f f384348q;

    /* renamed from: r */
    public final C21370a f384349r;

    /* renamed from: s */
    public final PermissionsCallback f384350s;

    /* renamed from: t */
    public final boolean f384351t;

    /* renamed from: u */
    public final C141559e f384352u;

    /* renamed from: v */
    public ModelViewer f384353v;

    /* renamed from: w */
    public ViewGroup f384354w;

    /* renamed from: x */
    public C47892c f384355x;

    /* renamed from: y */
    public Types.StreamingSettings f384356y;

    /* renamed from: z */
    public DebugInfoView f384357z;

    /* renamed from: com.google.android.apps.search.sceneviewer.modelviewer.am$a */
    /* compiled from: PG */
    final class C141585a implements C46792di {
        public C141585a() {
        }

        /* renamed from: a */
        public final void mo18077a(Throwable th) {
            ((C59052c) ((C59052c) ((C59052c) C141584am.f384271b.mo56226d()).mo56382g(th)).mo56372aa(41739)).mo56386p("Error on loading UiConfig");
        }

        /* renamed from: b */
        public final /* bridge */ /* synthetic */ void mo18078b(Object obj) {
            C141551i iVar = (C141551i) obj;
            ((C59052c) ((C59052c) C141584am.f384271b.mo56224b()).mo56372aa(41740)).mo56389s("UiConfigCallback: %s", iVar);
            if ((iVar.f384208a & 1) != 0) {
                TopViewGroup topViewGroup = C141584am.this.f384275C;
                C141570m mVar = iVar.f384209b;
                if (mVar == null) {
                    mVar = C141570m.f384247e;
                }
                topViewGroup.configCustomLogo(mVar, C141584am.this.f384320al);
            } else {
                C141584am.this.f384275C.setLogoType(TopViewGroup.LogoType.DISABLE);
            }
            if ((iVar.f384208a & 2) != 0) {
                C141584am amVar = C141584am.this;
                C141568k kVar = iVar.f384210c;
                if (kVar == null) {
                    kVar = C141568k.f384242d;
                }
                amVar.f384319ak = kVar;
            }
        }

        /* renamed from: c */
        public final /* synthetic */ void mo18079c() {
        }
    }

    /* renamed from: com.google.android.apps.search.sceneviewer.modelviewer.am$b */
    /* compiled from: PG */
    final class C141586b implements C46792di {
        public C141586b() {
        }

        /* renamed from: a */
        public final void mo18077a(Throwable th) {
            ((C59052c) ((C59052c) ((C59052c) C141584am.f384271b.mo56226d()).mo56382g(th)).mo56372aa(41741)).mo56386p("Error on loading ModelViewer");
            C141584am.this.showLoadObjectErrorDialog();
        }

        /* renamed from: b */
        public final /* bridge */ /* synthetic */ void mo18078b(Object obj) {
            C141584am amVar = C141584am.this;
            amVar.f384353v = (ModelViewer) obj;
            LayoutInflater layoutInflater = amVar.f384337f.getActivity().getLayoutInflater();
            amVar.f384357z = (DebugInfoView) amVar.f384354w.findViewById(R.id.sceneviewer_debug_info_view);
            amVar.f384357z.initialize(amVar.f384353v);
            amVar.f384275C = (TopViewGroup) amVar.f384354w.findViewById(R.id.top_group);
            amVar.f384275C.initialize(amVar.f384339h, amVar.f384353v, amVar);
            amVar.f384275C.setOcclusionsHost(amVar.f384353v);
            amVar.f384275C.setSendFeedbackButtonClickListener(new C47591co(amVar.f384342k, "Clicked Send Feedback", new C141609s(amVar)));
            TopViewGroup topViewGroup = amVar.f384275C;
            DebugInfoView debugInfoView = amVar.f384357z;
            Objects.requireNonNull(debugInfoView);
            topViewGroup.setDebugToggleClickListener(new C141610t(debugInfoView));
            amVar.f384275C.setExitButtonClickListener(new C141611u(amVar));
            amVar.f384354w.getViewTreeObserver().addOnGlobalLayoutListener(new C141618v(amVar));
            layoutInflater.inflate(R.layout.sceneviewer_get_help_button, amVar.f384354w);
            View findViewById = amVar.f384354w.findViewById(R.id.sceneviewer_get_help_button);
            findViewById.setOnClickListener(new C141572aa(amVar, layoutInflater));
            findViewById.getViewTreeObserver().addOnGlobalLayoutListener(new C141582ak(amVar, findViewById));
            amVar.f384287O = findViewById;
            amVar.f384286N = (NotificationView) amVar.f384354w.findViewById(R.id.top_notification_view);
            amVar.f384283K = (ProgressBar) amVar.f384354w.findViewById(R.id.sceneviewer_loading_spinner);
            amVar.f384284L = (ProgressBar) amVar.f384354w.findViewById(R.id.sceneviewer_progress_indicator);
            amVar.f384285M = (TextView) amVar.f384354w.findViewById(R.id.sceneviewer_loading_spinner_text);
            amVar.f384282J = (NodeTransformationIndicator) amVar.f384354w.findViewById(R.id.node_transformation_indicator);
            amVar.f384276D = (ToggleModeButton) amVar.f384354w.findViewById(R.id.sceneviewer_toggle_mode_button);
            amVar.f384277E = (FrameLayout) amVar.f384354w.findViewById(R.id.sceneviewer_toggle_button_container);
            amVar.f384278F = amVar.f384354w.findViewById(R.id.sceneviewer_toggle_button_placeholder);
            amVar.f384321am = (FrameLayout) amVar.f384354w.findViewById(R.id.sceneviewer_immersive_edge_ar_button);
            amVar.f384279G = (RelativeLayout) amVar.f384354w.findViewById(R.id.sceneviewer_preset_buttons);
            amVar.f384280H = (FloatingButton) amVar.f384354w.findViewById(R.id.sceneviewer_left_button);
            amVar.f384281I = (FloatingButton) amVar.f384354w.findViewById(R.id.sceneviewer_right_button);
            amVar.f384273A = new ChipNotification(layoutInflater, amVar.f384354w, amVar.f384275C);
            amVar.f384276D.setOnClickListener(new C141594d(amVar));
            amVar.f384321am.setOnClickListener(new C141595e(amVar));
            amVar.f384353v.setNodeTransformationIndicator(amVar.f384282J);
            AppUtilities.updateSystemBars(amVar.f384337f.getActivity().getWindow(), amVar.mo116568b(), amVar.f384296X);
            if (C141584am.m229780t(amVar.f384353v)) {
                GalleryButtonController galleryButtonController = new GalleryButtonController((GalleryButton) amVar.f384354w.findViewById(R.id.sceneviewer_gallery_button), amVar.f384337f.getActivity());
                galleryButtonController.updateGalleryButtonThumbnail();
                C0167am activity = amVar.f384337f.getActivity();
                ModelViewer modelViewer = amVar.f384353v;
                amVar.f384289Q = new ShutterButtonController(activity, modelViewer, modelViewer, amVar.f384354w, galleryButtonController, new C141583al(amVar));
                amVar.f384290R = galleryButtonController;
            }
            BottomViewGroup bottomViewGroup = amVar.f384274B;
            if (bottomViewGroup != null) {
                amVar.f384354w.removeView(bottomViewGroup);
            }
            amVar.f384337f.getActivity().getLayoutInflater().inflate(R.layout.bottom_view_group, amVar.f384354w);
            amVar.f384274B = (BottomViewGroup) amVar.f384354w.findViewById(R.id.bottom_group);
            amVar.f384274B.setPositionListener(new C141604n(amVar));
            BottomViewGroup bottomViewGroup2 = amVar.f384274B;
            ModelViewer modelViewer2 = amVar.f384353v;
            Objects.requireNonNull(modelViewer2);
            bottomViewGroup2.setStateChangeListener(new C141621y(modelViewer2));
            amVar.f384274B.setAgsaVersion(amVar.f384340i);
            amVar.f384274B.getViewTreeObserver().addOnGlobalLayoutListener(new C141622z(amVar));
            amVar.mo116584q();
            amVar.mo116570d();
            C141584am amVar2 = C141584am.this;
            View rootView = amVar2.f384353v.getRootView();
            ModelViewer modelViewer3 = amVar2.f384353v;
            C47890a aVar = amVar2.f384339h;
            Types.LightingSettings.Builder newBuilder = Types.LightingSettings.newBuilder();
            Types.ImageBasedLighting forNumber = Types.ImageBasedLighting.forNumber(amVar2.f384355x.f124016q);
            if (forNumber == null) {
                forNumber = Types.ImageBasedLighting.DEFAULT_LIGHTING;
            }
            newBuilder.setIbl(forNumber);
            Types.LightingSettings.Mode forNumber2 = Types.LightingSettings.Mode.forNumber(amVar2.f384355x.f124017r);
            if (forNumber2 == null) {
                forNumber2 = Types.LightingSettings.Mode.UNSPECIFIED;
            }
            newBuilder.setMode(forNumber2);
            Types.LightingSettings lightingSettings = (Types.LightingSettings) newBuilder.build();
            Types.OcclusionSettings.Builder newBuilder2 = Types.OcclusionSettings.newBuilder();
            newBuilder2.setLongestExtentMax(amVar2.f384355x.f124002c);
            newBuilder2.setLongestExtentMin(amVar2.f384355x.f124003d);
            Types.OcclusionSettings.Mode forNumber3 = Types.OcclusionSettings.Mode.forNumber(amVar2.f384355x.f124018s);
            if (forNumber3 == null) {
                forNumber3 = Types.OcclusionSettings.Mode.UNSPECIFIED;
            }
            newBuilder2.setMode(forNumber3);
            Types.AutoEnvironmentSettings.Builder newBuilder3 = Types.AutoEnvironmentSettings.newBuilder();
            try {
                newBuilder3.mergeFrom(amVar2.f384355x.f124001b, C62921ba.m95368a());
            } catch (C62974ct e) {
                ((C59052c) ((C59052c) ((C59052c) C141584am.f384271b.mo56225c()).mo56382g(e)).mo56372aa(41744)).mo56386p("Error parsing auto environment settings");
            }
            Types.DynamicResolutionSettings.Builder newBuilder4 = Types.DynamicResolutionSettings.newBuilder();
            newBuilder4.setEnabled(true);
            newBuilder4.setScaleRate(0.125f);
            newBuilder4.setMinScale(0.24f);
            newBuilder4.setMaxScale(1.0f);
            try {
                newBuilder4.mergeFrom(amVar2.f384355x.f124010k, C62921ba.m95368a());
            } catch (C62974ct e2) {
                ((C59052c) ((C59052c) ((C59052c) C141584am.f384271b.mo56225c()).mo56382g(e2)).mo56372aa(41743)).mo56386p("Error parsing dynamic resolution scaling settings");
            }
            Types.InitialSettings.Builder newBuilder5 = Types.InitialSettings.newBuilder();
            newBuilder5.setAutoEnvironment((Types.AutoEnvironmentSettings) newBuilder3.build());
            newBuilder5.setBuildType(ViewerLogger.convertBuildType(amVar2.f384339h).getNumber());
            newBuilder5.setViewerSessionUuid(amVar2.f384338g.toString());
            newBuilder5.setLighting(lightingSettings);
            newBuilder5.setOcclusion((Types.OcclusionSettings) newBuilder2.build());
            newBuilder5.setStreaming(amVar2.f384356y);
            newBuilder5.setDynamicResolutionOptions((Types.DynamicResolutionSettings) newBuilder4.build());
            newBuilder5.setUseDarkTheme(AppUtilities.isDarkMode(amVar2.f384337f.getContext()));
            newBuilder5.setArCoreApkVersionCode(AppUtilities.getArCoreApkVersionCode(amVar2.f384337f.getContext()));
            newBuilder5.setEnableOnboardingGuidance(amVar2.f384312ad);
            newBuilder5.setEnableDimensionVisualization(amVar2.f384315ag);
            C47892c cVar = amVar2.f384355x;
            if ((cVar.f124000a & 16384) != 0) {
                newBuilder5.setAutoColorHex(cVar.f124015p);
            }
            modelViewer3.initialize(aVar, amVar2, (Types.InitialSettings) newBuilder5.build());
            if (amVar2.f384356y.getSideChannelEventEnabled()) {
                C141559e eVar = amVar2.f384352u;
                C141577af afVar = new C141577af(amVar2);
                ImpApiHandler impApiHandler = amVar2.f384353v.getImpApiHandler();
                Context context = (Context) eVar.f384229a.mo17428b();
                context.getClass();
                C47770dh dhVar = (C47770dh) eVar.f384230b.mo17428b();
                dhVar.getClass();
                amVar2.f384291S = new UserActionManager(context, dhVar, afVar, impApiHandler);
                amVar2.f384353v.setUserActionManager(amVar2.f384291S);
            }
            amVar2.f384353v.setBottomViewGroup(amVar2.f384274B);
            if (rootView.getParent() == null) {
                rootView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
                ((ViewGroup) amVar2.f384354w.findViewById(R.id.sceneviewer_model_view_layout)).addView(rootView, 0);
                amVar2.f384353v.setWebView(amVar2.f384274B.getCardWebView());
                amVar2.f384353v.setDarkMode(AppUtilities.isDarkMode(amVar2.f384337f.getContext()));
                View sceneView = amVar2.f384353v.getSceneView();
                if (sceneView != null && !amVar2.f384336e) {
                    sceneView.setAlpha(0.0f);
                }
                C47892c cVar2 = amVar2.f384355x;
                amVar2.f384353v.setEnableVerticalPlacement(cVar2.f124007h);
                amVar2.f384353v.setEnableVerticalPlacementSnapBehaviour(cVar2.f124008i);
                amVar2.f384353v.setEnableEasyPlacement(cVar2.f124009j);
            }
            C141584am amVar3 = C141584am.this;
            amVar3.f384318aj = new C141575ad(amVar3);
            ((FrameLayout) amVar3.f384354w.findViewById(R.id.sceneviewer_hats_overlay_layout)).setOnClickListener(new C141576ae(amVar3));
            C141584am amVar4 = C141584am.this;
            amVar4.f384292T = true;
            amVar4.mo116585r();
            C141584am.this.mo116580n(true, 300);
            if (C141584am.m229780t(C141584am.this.f384353v)) {
                ViewerLogger.getInstance().setViewerClientVersion(ArViewerLogEnumOuterClass.ArViewerLogEnum.ViewerClientVersion.IMP_MODEL_VIEW);
            }
            C141584am amVar5 = C141584am.this;
            if (amVar5.f384293U) {
                amVar5.mo116576j();
            }
            if (C141584am.this.f384353v.supportsArMode()) {
                ViewerLogger.getInstance().logAction(ArViewerLogEnumOuterClass.ArViewerLogEnum.Action.AR_AVAILABLE);
            } else {
                ViewerLogger.getInstance().logAction(ArViewerLogEnumOuterClass.ArViewerLogEnum.Action.AR_UNAVAILABLE);
                if (C141584am.m229780t(C141584am.this.f384353v)) {
                    ViewerLogger.getInstance().logAction(C141584am.this.f384353v.getArAvailabilityErrorAction());
                }
            }
            C141584am amVar6 = C141584am.this;
            Uri uri = amVar6.f384298Z;
            if (uri != null) {
                amVar6.mo116574h(uri, false);
            }
        }

        /* renamed from: c */
        public final /* synthetic */ void mo18079c() {
        }
    }

    public C141584am(C141592b bVar, C141589ap apVar, String str, UUID uuid, C47890a aVar, Executor executor, Executor executor2, C141530e eVar, C46128f fVar, AccountId accountId, C141541a aVar2, C141536a aVar3, C47892c cVar, Types.StreamingSettings streamingSettings, C47770dh dhVar, C46439e eVar2, C46801dp dpVar, C46723bg bgVar, C141539d dVar, C21370a aVar4, boolean z, boolean z2, C141559e eVar3, C141554c cVar2) {
        Types.StreamingSettings a;
        C141592b bVar2 = bVar;
        C47890a aVar5 = aVar;
        C141530e eVar4 = eVar;
        this.f384355x = cVar;
        this.f384356y = streamingSettings;
        if (aVar5 == C47890a.STANDALONE && (a = C141534b.m229755a(bVar.getActivity().getIntent())) != null) {
            this.f384356y = a;
        }
        this.f384337f = bVar2;
        this.f384322an = apVar;
        this.f384344m = bgVar;
        this.f384323ao = eVar4;
        this.f384338g = uuid;
        this.f384349r = aVar4;
        this.f384330av = new HotspotsController(bVar.getContext());
        this.f384341j = aVar2;
        this.f384340i = str;
        this.f384339h = aVar5;
        this.f384324ap = aVar3;
        this.f384342k = dhVar;
        this.f384343l = dVar;
        this.f384345n = eVar2;
        this.f384352u = eVar3;
        Executor executor3 = executor;
        C60922j.m93045h(fVar.mo50215b(accountId), C47810es.m84966f(new C141598h(this)), executor);
        this.f384325aq = executor2;
        this.f384346o = dpVar;
        this.f384347p = new C141586b();
        this.f384348q = new C141578ag(this);
        this.f384351t = z;
        this.f384310ab = Optional.empty();
        this.f384315ag = z2;
        C60870cx d = eVar4.f384154a.mo46042d();
        C141527b bVar3 = C141527b.f384151a;
        C60870cx g = C60922j.m93044g(d, C47810es.m84963c(bVar3), C60826bg.f164896a);
        C141599i iVar = new C141599i(this);
        C60922j.m93044g(g, C47810es.m84963c(iVar), C60826bg.f164896a);
        this.f384311ac = Optional.empty();
        C60870cx d2 = eVar4.f384154a.mo46042d();
        C141529d dVar2 = C141529d.f384153a;
        C60870cx g2 = C60922j.m93044g(d2, C47810es.m84963c(dVar2), C60826bg.f164896a);
        C141600j jVar = new C141600j(this);
        C60922j.m93044g(g2, C47810es.m84963c(jVar), C60826bg.f164896a);
        this.f384350s = new C141579ah(this, bVar);
        this.f384326ar = new C141534b(this.f384356y);
        this.f384308aJ = cVar2;
        this.f384327as = new C141585a();
        this.f384300aB = (float) bVar.getResources().getDimensionPixelSize(R.dimen.sceneviewer_toggle_bottom_margin);
        this.f384328at = new CameraAccessAttributionHandler(bVar.getContext().getApplicationContext(), C39227c.m68658b(C39226b.TAG_SCENEVIEWER_CAPTURE));
    }

    /* renamed from: A */
    private final boolean m229778A() {
        return this.f384353v.isModelShown() && this.f384353v.getMode() == Types.ViewerMode.AR;
    }

    /* renamed from: a */
    public static C141592b m229779a(AccountId accountId) {
        C141592b bVar = new C141592b();
        C68324h.m98669f(bVar);
        C47247a.m84047b(bVar, accountId);
        return bVar;
    }

    private boolean configureButtonAnnotation(int i, String str) {
        if (this.f384330av.containsHotspot(i)) {
            return this.f384330av.setHotspotAnnotation(i, str);
        }
        ((C59052c) ((C59052c) f384271b.mo56224b()).mo56372aa(41757)).mo56386p("Attempting to set annotation on non-hotspot buttons, ignoring.");
        return false;
    }

    private void onModelLoaded() {
        m229783y(false, 300);
        if (mo116586s()) {
            m229781w(true, true);
        }
        if (!this.f384301aC) {
            Types.SceneViewerParams.LightingMode lightingMode = Types.SceneViewerParams.LightingMode.UNSPECIFIED_LIGHTING;
            ButtonType buttonType = ButtonType.NONE;
            Types.ViewerMode viewerMode = Types.ViewerMode.INVALID;
            Types.SceneViewerParams.ModePreference modePreference = Types.SceneViewerParams.ModePreference.UNSPECIFIED;
            Types.SnackbarMessage snackbarMessage = Types.SnackbarMessage.EMPTY;
            int ordinal = this.f384309aa.ordinal();
            if ((ordinal == 1 || ordinal == 2) && this.f384353v.supportsArMode()) {
                mo116587u(Types.ViewerMode.AR);
            }
            this.f384301aC = true;
        }
        this.f384273A.hide();
        mo116584q();
    }

    private boolean setButtonPosition(int i, int i2, int i3) {
        return this.f384330av.setHotspotPosition(i, i2, i3);
    }

    private boolean setButtonVisibility(int i, Types.Visibility visibility) {
        FloatingButton floatingButton;
        ButtonType fromId = ButtonType.fromId(i);
        if (fromId == null) {
            return this.f384330av.setHotspotState(i, visibility);
        }
        View view = this.f384287O;
        if (ButtonType.GET_HELP.equals(fromId) && view != null) {
            boolean equals = visibility.equals(Types.Visibility.VISIBLE);
            ButtonType.GET_HELP.setValid(equals);
            AnimationUtilities.animateVisibility(view, equals, 300);
            if (!equals) {
                mo116573g();
            }
        }
        if (ButtonType.LEFT.equals(fromId) && ButtonType.LEFT.isValid()) {
            floatingButton = this.f384280H;
        } else if (!ButtonType.RIGHT.equals(fromId) || !ButtonType.RIGHT.isValid()) {
            return false;
        } else {
            floatingButton = this.f384281I;
        }
        floatingButton.setVisibilityState(visibility, 300);
        return true;
    }

    /* renamed from: t */
    public static boolean m229780t(ModelViewer modelViewer) {
        return modelViewer.getViewerClientVersion().equals(ArViewerLogEnumOuterClass.ArViewerLogEnum.ViewerClientVersion.IMP_MODEL_VIEW);
    }

    /* renamed from: w */
    private final void m229781w(boolean z, boolean z2) {
        if (!this.f384307aI) {
            this.f384276D.setEnabled(z);
            int i = 0;
            if ((this.f384276D.getVisibility() == 0) != z) {
                if (z2) {
                    AnimationUtilities.animateVisibility(this.f384276D, true, 300);
                    return;
                }
                ToggleModeButton toggleModeButton = this.f384276D;
                if (true != z) {
                    i = 8;
                }
                toggleModeButton.setVisibility(i);
            }
        }
    }

    /* renamed from: x */
    private final void m229782x(boolean z) {
        ActualScaleButton actualScaleButton = this.f384329au;
        if (actualScaleButton == null) {
            ((C59052c) ((C59052c) f384271b.mo56226d()).mo56372aa(41753)).mo56386p("Called setViewActualSizeButtonVisible when button is null, ignoring");
            return;
        }
        boolean z2 = false;
        if (actualScaleButton.isEnabled() && m229778A() && z) {
            z2 = true;
        }
        AnimationUtilities.animateVisibility(actualScaleButton, z2, 300);
    }

    /* renamed from: y */
    private final void m229783y(boolean z, int i) {
        if (this.f384333ay != z) {
            AnimationUtilities.animateVisibility(this.f384284L, false, i);
            AnimationUtilities.animateVisibility(this.f384285M, false, i);
            AnimationUtilities.animateVisibility(this.f384283K, z, i);
            this.f384333ay = z;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x000a, code lost:
        r0 = r2.f384353v;
     */
    /* renamed from: z */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final boolean m229784z() {
        /*
            r2 = this;
            com.google.ar.core.viewer.jniprotolite.Types$SceneViewerParams$ModePreference r0 = com.google.p3723ar.core.viewer.jniprotolite.Types.SceneViewerParams.ModePreference.THREED_ONLY
            com.google.ar.core.viewer.jniprotolite.Types$SceneViewerParams$ModePreference r1 = r2.f384309aa
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0016
            com.google.android.libraries.ar.sceneviewer.modelviewer.ModelViewer r0 = r2.f384353v
            if (r0 == 0) goto L_0x0016
            boolean r0 = r0.supportsArMode()
            if (r0 == 0) goto L_0x0016
            r0 = 1
            return r0
        L_0x0016:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.search.sceneviewer.modelviewer.C141584am.m229784z():boolean");
    }

    /* renamed from: b */
    public final Types.ViewerMode mo116568b() {
        if (!this.f384292T) {
            return Types.ViewerMode.INVALID;
        }
        return this.f384353v.getMode();
    }

    /* renamed from: c */
    public final void mo116569c() {
        View findViewById = this.f384354w.findViewById(R.id.sceneviewer_model_view_layout);
        if (this.f384274B.isWebViewOnlyModeEnabled() || this.f384334az) {
            findViewById.setY((float) findViewById.getTop());
            return;
        }
        findViewById.setY((float) (findViewById.getTop() - ((findViewById.getHeight() - ((int) this.f384274B.getY())) / 2)));
    }

    /* renamed from: d */
    public final void mo116570d() {
        float f;
        ShutterButtonController shutterButtonController;
        if (this.f384274B != null) {
            float dimensionPixelSize = ((float) this.f384337f.getResources().getDimensionPixelSize(R.dimen.sceneviewer_side_buttons_size)) / 2.0f;
            if (this.f384334az) {
                f = ((float) this.f384279G.getBottom()) - dimensionPixelSize;
            } else {
                f = (Math.max(this.f384274B.getY(), (float) this.f384274B.getPeekingYValue()) - (((float) this.f384277E.getHeight()) / 2.0f)) - this.f384300aB;
            }
            float f2 = 0.0f;
            float min = Math.min(Math.max(this.f384274B.getY() - f, 0.0f), 100.0f) / 100.0f;
            float right = ((float) this.f384277E.getRight()) - dimensionPixelSize;
            if (this.f384334az) {
                this.f384279G.setTranslationY(0.0f);
                RelativeLayout relativeLayout = this.f384279G;
                relativeLayout.setX(right - (((float) relativeLayout.getWidth()) / 2.0f));
            } else {
                this.f384279G.setTranslationX(0.0f);
                RelativeLayout relativeLayout2 = this.f384279G;
                relativeLayout2.setY(f - (((float) relativeLayout2.getHeight()) / 2.0f));
            }
            this.f384279G.setAlpha(min);
            FrameLayout frameLayout = this.f384277E;
            frameLayout.setY(f - (((float) frameLayout.getHeight()) / 2.0f));
            this.f384277E.setAlpha(min);
            if (!this.f384295W && (shutterButtonController = this.f384289Q) != null) {
                if (this.f384334az) {
                    shutterButtonController.setButtonPosition(right, ((float) this.f384354w.getHeight()) / 2.0f);
                    this.f384289Q.setAlpha(1.0f);
                } else {
                    shutterButtonController.setButtonPosition(((float) this.f384354w.getWidth()) / 2.0f, f);
                    this.f384289Q.setAlpha(min);
                }
            }
            ActualScaleButton actualScaleButton = this.f384329au;
            if (actualScaleButton != null && actualScaleButton.isEnabled()) {
                ShutterButtonController shutterButtonController2 = this.f384289Q;
                if (shutterButtonController2 != null && !this.f384334az) {
                    f2 = ((float) shutterButtonController2.getShutterButtonHeight()) / 2.0f;
                }
                actualScaleButton.alignAbove(Math.min(this.f384274B.getY(), f - f2));
                actualScaleButton.setAlpha(min);
            }
            View view = this.f384287O;
            if (view != null) {
                view.setY(f - (((float) view.getHeight()) / 2.0f));
            }
        }
    }

    /* renamed from: e */
    public final void mo116571e(int i, int i2, Drawable drawable, String str) {
        FloatingButton floatingButton;
        ButtonType fromId = ButtonType.fromId(i);
        boolean z = fromId != null;
        if (z) {
            Types.SceneViewerParams.LightingMode lightingMode = Types.SceneViewerParams.LightingMode.UNSPECIFIED_LIGHTING;
            Types.ViewerMode viewerMode = Types.ViewerMode.INVALID;
            Types.SceneViewerParams.ModePreference modePreference = Types.SceneViewerParams.ModePreference.UNSPECIFIED;
            Types.SnackbarMessage snackbarMessage = Types.SnackbarMessage.EMPTY;
            int ordinal = fromId.ordinal();
            if (ordinal == 1) {
                floatingButton = this.f384280H;
            } else if (ordinal == 2) {
                floatingButton = this.f384281I;
            } else {
                return;
            }
            fromId.setValid(true);
        } else if (this.f384330av.containsHotspot(i)) {
            floatingButton = this.f384330av.getHotspot(i);
            if (floatingButton == null) {
                throw null;
            }
        } else {
            floatingButton = this.f384330av.createHotspot(i, (ViewGroup) this.f384354w.findViewById(R.id.sceneviewer_model_view_layout));
        }
        if (!z) {
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(i2, i2);
            layoutParams.width = i2;
            layoutParams.height = i2;
            floatingButton.setLayoutParams(layoutParams);
        }
        floatingButton.setEnabled(true);
        floatingButton.setOnClickListener(new C141607q(this, floatingButton, i));
        floatingButton.setContentDescription(str);
        if (drawable != null) {
            floatingButton.setBackground(drawable);
        }
        if (!z) {
            this.f384330av.setHotspotState(i, this.f384296X ? Types.Visibility.VISIBLE : Types.Visibility.HIDDEN);
        } else if (this.f384296X) {
            AnimationUtilities.animateVisibility(floatingButton, true, 300);
        }
    }

    public void emitLogProto(byte[] bArr) {
        C58557jl.m90145z(this.f384303aE, C141596f.f384382a);
        this.f384303aE.add(C60856cj.m92903l(new C141597g(bArr), this.f384325aq));
    }

    public boolean ensureArPermissions() {
        boolean z;
        C0167am activity = this.f384337f.getActivity();
        if (activity == null) {
            ((C59052c) ((C59052c) f384271b.mo56224b()).mo56372aa(41758)).mo56386p("Fragment is not attached to an activity, permissions request denied.");
            return false;
        }
        if (this.f384351t) {
            z = PermissionUtilities.hasCameraPermissions(this.f384337f.getContext());
        } else {
            z = PermissionUtilities.hasAllPermissions(this.f384337f.getContext());
        }
        boolean z2 = ArOnboardingStatus.isArOnboardingCompleted(activity) || ((Boolean) this.f384311ac.orElse(true)).booleanValue();
        this.f384323ao.mo116552a(z2);
        if (z && z2) {
            return true;
        }
        mo116578l(false);
        if (this.f384351t) {
            CameraPermissionsFragment.showNow(this.f384337f.getChildFragmentManager(), this.f384350s);
        } else {
            AllPermissionsFragment.showNow(this.f384337f.getChildFragmentManager(), this.f384350s);
        }
        return false;
    }

    /* renamed from: f */
    public final void mo116572f(long j) {
        if (!this.f384317ai) {
            long c = this.f384349r.mo26871c() + j;
            if (c > this.f384305aG) {
                this.f384305aG = c;
                Runnable runnable = this.f384318aj;
                if (runnable != null) {
                    this.f384354w.removeCallbacks(runnable);
                    this.f384354w.postDelayed(this.f384318aj, j);
                }
            }
        }
    }

    /* renamed from: g */
    public final void mo116573g() {
        PlacementHelpOverlay placementHelpOverlay = (PlacementHelpOverlay) this.f384354w.findViewById(R.id.sceneviewer_placement_help_overlay);
        if (placementHelpOverlay != null && AnimationUtilities.isVisible(placementHelpOverlay)) {
            placementHelpOverlay.mo116603a();
        }
    }

    public boolean getOnboardingGuidanceShown() {
        return ((Boolean) this.f384310ab.orElse(true)).booleanValue();
    }

    public final C47892c getViewerConfig() {
        return this.f384355x;
    }

    /* renamed from: h */
    public final void mo116574h(Uri uri, boolean z) {
        C141591ar arVar;
        String m = C141533a.m229741m(uri);
        if (m == null) {
            showLoadObjectErrorDialog();
        } else if (!this.f384293U || !this.f384292T) {
            this.f384298Z = uri;
        } else if (!uri.equals(this.f384297Y) || ((!this.f384353v.isModelLoaded() && !this.f384353v.isModelLoading()) || z)) {
            mo116580n(false, 0);
            ButtonType.LEFT.setValid(false);
            ButtonType.RIGHT.setValid(false);
            this.f384276D.setEnabled(false);
            this.f384274B.clear();
            mo116580n(true, 0);
            mo116584q();
            m229783y(true, 300);
            if (!AppUtilities.hasInternetConnectivity(this.f384337f.getContext())) {
                ViewerLogger.getInstance().logLoadingError(ArViewerLogEnumOuterClass.ArViewerLogEnum.LoadErrorReason.NO_INTERNET, BuildConfig.FLAVOR, this.f384294V);
                mo116581o();
                return;
            }
            this.f384274B.enableFlipKartButton("flipkart.com:android".equals(C141533a.m229743o(uri)));
            this.f384275C.setModelUri(uri);
            this.f384275C.setColorMode(this.f384356y.getTouchEventsEnabled() ? TopViewGroup.ColorMode.LIGHT : TopViewGroup.ColorMode.DEFAULT);
            if (this.f384356y.getTouchEventsEnabled()) {
                C141554c cVar = this.f384308aJ;
                String s = C141533a.m229747s(uri);
                if (!C141566j.m229772a(s)) {
                    arVar = null;
                } else {
                    String substring = s.substring(0, s.indexOf("."));
                    if (C141566j.f384241a.contains(substring)) {
                        arVar = new C141565i(String.format("https://www.gstatic.com/ar/core/viewer/carousel/cloud9/logo_config/%s_logo_config.txt", new Object[]{substring}), cVar.f384216a);
                    } else {
                        arVar = new C141562f(String.format("https://%s-ui.streamplease.net", new Object[]{substring}), cVar.f384216a);
                    }
                }
                if (arVar != null) {
                    this.f384346o.mo50707a(arVar.mo116561a(), this.f384327as);
                }
            } else {
                C47892c cVar2 = this.f384355x;
                if ((cVar2.f124000a & 1024) == 0 || !cVar2.f124011l.startsWith("google.com:")) {
                    this.f384275C.setLogoType(TopViewGroup.LogoType.DISABLE);
                } else {
                    this.f384275C.setLogoType(TopViewGroup.LogoType.GOOGLE);
                }
            }
            if (!this.f384356y.getTouchEventsEnabled()) {
                this.f384332ax = Optional.m71637of(new GestureDetector(this.f384337f.getContext(), new C141581aj(this)));
            }
            this.f384274B.setStreamingMode(this.f384356y.getTouchEventsEnabled());
            String r = C141533a.m229746r(uri);
            String u = C141533a.m229749u(uri);
            ((C59052c) ((C59052c) f384271b.mo56224b()).mo56372aa(41746)).mo56389s("Loading new model with uri: %s", uri);
            if (m229780t(this.f384353v)) {
                this.f384353v.loadUri(uri);
            } else {
                String k = C141533a.m229739k(uri);
                ModelViewer modelViewer = this.f384353v;
                if (modelViewer.supportsDracoCompression() && k != null) {
                    m = k;
                }
                modelViewer.loadGltf(m, r, u);
            }
            ViewerLogger.getInstance().setSessionInfo(uri);
            this.f384297Y = uri;
            this.f384298Z = null;
        }
    }

    public void hideChipNotification() {
        this.f384273A.hide();
    }

    public void hideSnackbar() {
        SimpleSnackbar simpleSnackbar = this.f384331aw;
        if (simpleSnackbar != null && simpleSnackbar.isShownOrQueued()) {
            simpleSnackbar.dismiss();
        }
    }

    /* renamed from: i */
    public final void mo116575i() {
        long b = this.f384349r.mo26870b();
        long j = this.f384304aF;
        if (j > 0) {
            long j2 = b - j;
            if (this.f384334az) {
                this.f384313ae = this.f384313ae.plusMillis(j2);
            } else {
                this.f384314af = this.f384314af.plusMillis(j2);
            }
        }
        this.f384304aF = this.f384349r.mo26870b();
    }

    /* renamed from: j */
    public final void mo116576j() {
        this.f384353v.resume();
        if (!m229784z() && !Types.SceneViewerParams.ModePreference.THREED_ONLY.equals(this.f384309aa)) {
            this.f384309aa = Types.SceneViewerParams.ModePreference.THREED_ONLY;
        }
        if (!mo116586s()) {
            m229781w(false, false);
        }
        long b = this.f384349r.mo26870b();
        this.f384294V = b;
        this.f384304aF = b;
        mo116587u(mo116568b());
        Uri uri = this.f384298Z;
        if (uri != null) {
            mo116574h(uri, false);
        } else {
            Uri uri2 = this.f384297Y;
            if (uri2 != null) {
                mo116574h(uri2, false);
            }
        }
        Types.ViewerMode viewerMode = this.f384302aD;
        if (viewerMode != null) {
            mo116587u(viewerMode);
            this.f384302aD = null;
        }
    }

    /* renamed from: k */
    public final void mo116577k(Bitmap bitmap) {
        String str = (!this.f384356y.getMode().equals(Types.SceneViewerParams.StreamingMode.STREAMING_PREFERRED) || !this.f384356y.getModeAllowed()) ? "on-device" : "streaming";
        C141536a aVar = this.f384324ap;
        UUID uuid = this.f384338g;
        C47474k g = C47475l.m84477g();
        C47465c cVar = (C47465c) g;
        cVar.f123249a = "com.google.android.googlequicksearchbox.USER_INITIATED_FEEDBACK_REPORT";
        g.mo51310d(true);
        C46663a aVar2 = new C46663a();
        aVar2.mo50686d(C46667e.KEY_VALUE);
        aVar2.mo50684b(false);
        aVar2.f121916a = C63088z.m96143E(uuid.toString());
        g.mo51333f("viewer_session_id", aVar2.mo50683a());
        C46663a aVar3 = new C46663a();
        aVar3.mo50686d(C46667e.KEY_VALUE);
        aVar3.mo50684b(false);
        aVar3.f121916a = C63088z.m96143E(str);
        g.mo51333f("locality", aVar3.mo50683a());
        if (bitmap != null) {
            cVar.f123251c = C58833ax.m90834k(bitmap);
        }
        aVar.f384168a.mo51336a(g.mo51332e());
    }

    /* renamed from: l */
    public final void mo116578l(boolean z) {
        this.f384311ac = Optional.m71637of(Boolean.valueOf(z));
        this.f384323ao.mo116552a(z);
    }

    /* renamed from: m */
    public final void mo116579m(Types.SceneViewerParams.ModePreference modePreference) {
        this.f384309aa = modePreference;
        if ((modePreference.equals(Types.SceneViewerParams.ModePreference.THREED_ONLY) || modePreference.equals(Types.SceneViewerParams.ModePreference.THREED_PREFERRED)) && !mo116568b().equals(Types.ViewerMode.THREE_D)) {
            mo116587u(Types.ViewerMode.THREE_D);
        } else if ((modePreference.equals(Types.SceneViewerParams.ModePreference.AR_ONLY) || modePreference.equals(Types.SceneViewerParams.ModePreference.AR_PREFERRED)) && !mo116568b().equals(Types.ViewerMode.AR)) {
            mo116587u(Types.ViewerMode.AR);
        }
        if (this.f384276D != null) {
            m229781w(!Types.SceneViewerParams.ModePreference.AR_ONLY.equals(this.f384309aa) && !Types.SceneViewerParams.ModePreference.THREED_ONLY.equals(this.f384309aa) && m229784z(), false);
        }
    }

    /* renamed from: n */
    public final void mo116580n(boolean z, int i) {
        if (this.f384296X != z || !this.f384274B.isReady()) {
            C141602l lVar = new C141602l(this, z);
            int i2 = (-this.f384275C.getWidth()) / 3;
            int i3 = (-this.f384275C.getHeight()) / 3;
            boolean z2 = false;
            int i4 = true != z ? i2 : 0;
            int i5 = true != z ? i3 : 0;
            float f = 0.0f;
            float f2 = true != z ? 0.0f : 1.0f;
            if (!this.f384296X) {
                this.f384275C.setTranslationX(this.f384334az ? (float) i2 : 0.0f);
                this.f384275C.setTranslationY(this.f384334az ? 0.0f : (float) i3);
            }
            ViewPropertyAnimator translationY = this.f384275C.animate().translationY(this.f384334az ? 0.0f : (float) i5);
            if (this.f384334az) {
                f = (float) i4;
            }
            translationY.translationX(f).setDuration((long) i).alpha(f2).setInterpolator(new AccelerateDecelerateInterpolator()).withEndAction(lVar).start();
            AnimationUtilities.animateVisibility(this.f384277E, z, i);
            GalleryButtonController galleryButtonController = this.f384290R;
            if (galleryButtonController != null) {
                if (z && mo116568b() == Types.ViewerMode.AR) {
                    z2 = true;
                }
                galleryButtonController.setGalleryButtonVisible(z2, i);
            }
            this.f384274B.setUiVisible(z, i);
            if (ButtonType.LEFT.isValid()) {
                this.f384280H.setEnabled(z, i);
            }
            if (ButtonType.RIGHT.isValid()) {
                this.f384281I.setEnabled(z, i);
            }
            View view = this.f384287O;
            if (view != null && (ButtonType.GET_HELP.isValid() || view.getVisibility() == 0)) {
                AnimationUtilities.animateVisibility(view, z, i);
            }
            this.f384296X = z;
            this.f384330av.setEnabled(z);
            m229782x(z);
            C0167am activity = this.f384337f.getActivity();
            if (activity != null) {
                AppUtilities.updateSystemBars(activity.getWindow(), mo116568b(), this.f384296X);
            }
        }
    }

    public void notifyActualScale(boolean z) {
        m229782x(!z);
    }

    /* renamed from: o */
    public final void mo116581o() {
        new NoConnectionDialogFragment().showNow(this.f384337f.getChildFragmentManager(), NoConnectionDialogFragment.TAG);
    }

    public void onArScaleUiSnap() {
        this.f384353v.onSnap();
    }

    public void onFrameRendered() {
        this.f384353v.onFrameRendered();
    }

    public void onGetRenderedImage(byte[] bArr, int i, int i2) {
        ((C59052c) ((C59052c) f384271b.mo56224b()).mo56372aa(41749)).mo56359L("Got rendered image from native, renderedImageByteArray.length %d, width %d, height %d.", Integer.valueOf(bArr.length), Integer.valueOf(i), Integer.valueOf(i2));
        Bitmap createBitmap = Bitmap.createBitmap(i, i2, Bitmap.Config.ARGB_8888);
        createBitmap.copyPixelsFromBuffer(ByteBuffer.wrap(bArr));
        if (!PermissionUtilities.hasMediaPermissions(this.f384337f.getContext())) {
            MediaPermissionsFragment.showNow(this.f384337f.getChildFragmentManager(), createBitmap, new C141580ai(this, createBitmap));
            return;
        }
        ShutterButtonController shutterButtonController = this.f384289Q;
        if (shutterButtonController != null) {
            shutterButtonController.onGetRenderedImage(createBitmap);
        }
    }

    public void onHideLoadingIndicator() {
        m229783y(false, 300);
    }

    public final boolean onInterceptModelViewerTouchEvent(MotionEvent motionEvent) {
        this.f384332ax.ifPresent(new C141601k(motionEvent));
        return false;
    }

    public void onLoadProgress(double d) {
        if (C60713c.m92639a(d, 1.0d, 0.01d) >= 0) {
            d = 1.0d;
        }
        m229783y(true, 300);
        if (d >= C59203do.f157270a) {
            float f = (float) d;
            if (this.f384333ay) {
                if (!AnimationUtilities.isVisible(this.f384284L)) {
                    AnimationUtilities.animateVisibility(this.f384284L, true, 0);
                    AnimationUtilities.animateVisibility(this.f384285M, true, 0);
                    AnimationUtilities.animateVisibility(this.f384283K, false, 0);
                }
                int round = Math.round(f * 100.0f);
                this.f384284L.setProgress(round);
                this.f384285M.setText(round + "%");
            }
        }
    }

    public final void onModelLoadFailed(String str) {
        ((C59052c) ((C59052c) f384271b.mo56225c()).mo56372aa(41750)).mo56389s("Model Load failed with error '%s'", str);
    }

    public void onModelVisibilityChanged() {
        ((C59052c) ((C59052c) f384271b.mo56224b()).mo56372aa(41751)).mo56386p("Model visibility has changed");
        if (this.f384353v.isModelLoaded()) {
            onModelLoaded();
        } else {
            m229783y(mo116568b() == Types.ViewerMode.THREE_D, 0);
        }
        if (this.f384353v.isModelShown()) {
            mo116572f(mo116568b() == Types.ViewerMode.AR ? 40000 : 20000);
        }
        mo116584q();
        if (!m229778A()) {
            m229782x(false);
        }
    }

    public void onRenderReadinessChanged(boolean z) {
        View sceneView = this.f384353v.getSceneView();
        if (z && sceneView != null && !AnimationUtilities.isVisible(sceneView)) {
            AnimationUtilities.animateVisibility(sceneView, true, 300);
        }
    }

    public boolean onSessionError(Types.SessionError sessionError) {
        ((C59052c) ((C59052c) f384271b.mo56225c()).mo56372aa(41759)).mo56389s("Session error: %s", sessionError.name());
        if (!sessionError.equals(Types.SessionError.ERROR_AR_INITIALIZATION_FAILED) && !sessionError.equals(Types.SessionError.ERROR_ANCHOR_UNAVAILABLE)) {
            return false;
        }
        ArSessionErrorDialogFragment.showNow(this.f384337f.getChildFragmentManager(), new C141574ac(this));
        return true;
    }

    public void onSnapBehavior() {
        this.f384354w.performHapticFeedback(16);
    }

    /* renamed from: p */
    public final void mo116583p() {
        if (this.f384292T) {
            if (mo116568b() == Types.ViewerMode.AR) {
                mo116587u(Types.ViewerMode.THREE_D);
            } else {
                mo116587u(Types.ViewerMode.AR);
            }
        }
    }

    /* renamed from: q */
    public final void mo116584q() {
        ShutterButtonController shutterButtonController;
        Types.ViewerMode b = mo116568b();
        if (Types.ViewerMode.THREE_D.equals(b) && (shutterButtonController = this.f384289Q) != null && shutterButtonController.isShutterButtonPopupVisible()) {
            this.f384289Q.hideShutterButtonPopup();
        }
        GalleryButtonController galleryButtonController = this.f384290R;
        boolean z = true;
        if (galleryButtonController != null) {
            galleryButtonController.setGalleryButtonVisible(this.f384296X && Types.ViewerMode.AR.equals(b), 300);
            this.f384290R.updateGalleryButtonThumbnail();
        }
        if (this.f384353v.getCaptureView() == null || !m229778A()) {
            z = false;
        }
        ShutterButtonController shutterButtonController2 = this.f384289Q;
        if (shutterButtonController2 != null && shutterButtonController2.getShutterButtonVisible() != z) {
            shutterButtonController2.setShutterButtonVisible(z, 300);
        }
    }

    /* renamed from: r */
    public final void mo116585r() {
        ViewUtilities.Direction direction;
        if (this.f384292T) {
            mo116575i();
            boolean z = false;
            if (ViewUtilities.getVerticalDp(this.f384337f.getContext()) < 600.0f && !this.f384306aH) {
                z = true;
            }
            this.f384334az = z;
            ((C59052c) ((C59052c) f384271b.mo56224b()).mo56372aa(41755)).mo56389s("Switching to %s configuration.", true != this.f384334az ? "regular" : "low profile");
            if (mo116568b().equals(Types.ViewerMode.AR)) {
                if (this.f384334az) {
                    ViewUtilities.setLayoutGravity(this.f384276D, 8388613);
                } else {
                    ViewUtilities.setLayoutGravity(this.f384276D, 8388611);
                }
            }
            this.f384274B.enableLowProfile(this.f384334az);
            this.f384275C.setLandscapeMode(this.f384334az);
            boolean z2 = this.f384299aA;
            boolean z3 = this.f384334az;
            if (z2 != z3) {
                RelativeLayout relativeLayout = this.f384279G;
                if (z3) {
                    direction = ViewUtilities.Direction.COUNTER_CLOCKWISE;
                } else {
                    direction = ViewUtilities.Direction.CLOCKWISE;
                }
                ViewUtilities.rotateRecursively(relativeLayout, direction);
            }
            this.f384299aA = this.f384334az;
            mo116570d();
            mo116569c();
        }
    }

    public void reloadWithStreamingDisabled() {
        this.f384337f.getActivity().runOnUiThread(new C141606p(this));
    }

    /* renamed from: s */
    public final boolean mo116586s() {
        return this.f384292T && !this.f384309aa.equals(Types.SceneViewerParams.ModePreference.THREED_ONLY) && !this.f384309aa.equals(Types.SceneViewerParams.ModePreference.AR_ONLY) && m229784z();
    }

    public void setOnboardingGuidanceShown(boolean z) {
        this.f384310ab = Optional.m71637of(Boolean.valueOf(z));
        this.f384323ao.f384154a.mo46039a(new C141528c(z), C60826bg.f164896a);
    }

    public void showChipNotification(Types.ChipNotificationContent chipNotificationContent) {
        this.f384273A.show(chipNotificationContent);
    }

    public final void showLoadObjectErrorDialog() {
        LoadObjectErrorDialogFragment.showNow(this.f384337f.getChildFragmentManager());
    }

    public final void showNotification(Types.Notification notification) {
        this.f384286N.show(notification);
    }

    public void showSnackbar(Types.SnackbarMessage snackbarMessage) {
        hideSnackbar();
        Types.SceneViewerParams.LightingMode lightingMode = Types.SceneViewerParams.LightingMode.UNSPECIFIED_LIGHTING;
        ButtonType buttonType = ButtonType.NONE;
        Types.ViewerMode viewerMode = Types.ViewerMode.INVALID;
        Types.SceneViewerParams.ModePreference modePreference = Types.SceneViewerParams.ModePreference.UNSPECIFIED;
        Types.SnackbarMessage snackbarMessage2 = Types.SnackbarMessage.EMPTY;
        if (snackbarMessage.ordinal() == 1) {
            SimpleSnackbar make = SimpleSnackbar.make(this.f384354w, R.string.sceneviewer_object_placement_prompt, -1);
            this.f384331aw = make;
            make.show();
        }
    }

    /* renamed from: u */
    public final boolean mo116587u(Types.ViewerMode viewerMode) {
        Types.InitialScale b;
        int i = 0;
        if (viewerMode.equals(Types.ViewerMode.INVALID) || viewerMode.equals(Types.ViewerMode.UNRECOGNIZED)) {
            ((C59052c) ((C59052c) f384271b.mo56226d()).mo56372aa(41760)).mo56386p("Invalid ViewerMode specified on setViewerMode, ignoring.");
            return false;
        } else if (!this.f384292T || !this.f384293U) {
            this.f384302aD = viewerMode;
            return false;
        } else {
            boolean equals = Types.ViewerMode.AR.equals(viewerMode);
            if (equals) {
                if (!m229784z()) {
                    ((C59052c) ((C59052c) f384271b.mo56226d()).mo56372aa(41761)).mo56386p("Attempting to switch to AR when AR isn't available, ignoring.");
                    return false;
                } else if (!ensureArPermissions()) {
                    return false;
                } else {
                    this.f384316ah = true;
                }
            }
            if (Build.VERSION.SDK_INT >= 30) {
                if (equals) {
                    this.f384328at.notifyCameraUsageStart();
                } else {
                    this.f384328at.notifyCameraUsageStop();
                }
            }
            this.f384353v.setMode(viewerMode);
            this.f384275C.setMode(viewerMode);
            LayoutTransition layoutTransition = this.f384277E.getLayoutTransition();
            if (layoutTransition != null) {
                layoutTransition.enableTransitionType(4);
            }
            Uri uri = this.f384297Y;
            if (!(uri == null || ((b = C141533a.m229730b(uri)) == null && this.f384329au == null))) {
                ActualScaleButton actualScaleButton = this.f384329au;
                if (actualScaleButton == null && (actualScaleButton = ActualScaleButton.create(this.f384337f.getContext(), this.f384354w)) == null) {
                    ((C59052c) ((C59052c) f384271b.mo56226d()).mo56372aa(41752)).mo56386p("Unable to inflate actual scale button.");
                } else {
                    actualScaleButton.setEnabled(b != null);
                    if (b != null && actualScaleButton.getVisibility() == 8) {
                        actualScaleButton.setVisibility(4);
                        mo116570d();
                    }
                    actualScaleButton.setOnClickListener(new C141603m(this));
                    actualScaleButton.setOnVisibilityChangedListener(new C141605o(this));
                    this.f384329au = actualScaleButton;
                }
            }
            if (this.f384307aI) {
                FrameLayout frameLayout = this.f384321am;
                if (true != Types.ViewerMode.AR.equals(viewerMode)) {
                    i = 8;
                }
                frameLayout.setVisibility(i);
            } else {
                this.f384276D.setMode(viewerMode);
                Types.SceneViewerParams.LightingMode lightingMode = Types.SceneViewerParams.LightingMode.UNSPECIFIED_LIGHTING;
                ButtonType buttonType = ButtonType.NONE;
                Types.SceneViewerParams.ModePreference modePreference = Types.SceneViewerParams.ModePreference.UNSPECIFIED;
                Types.SnackbarMessage snackbarMessage = Types.SnackbarMessage.EMPTY;
                int ordinal = viewerMode.ordinal();
                if (ordinal == 1) {
                    AnimationUtilities.animateVisibility(this.f384278F, false, 300);
                    ViewUtilities.setLayoutGravity(this.f384276D, 17);
                    ActualScaleButton actualScaleButton2 = this.f384329au;
                    if (actualScaleButton2 != null && actualScaleButton2.getVisibility() == 0) {
                        this.f384329au.setVisibility(8);
                    }
                } else if (ordinal == 2) {
                    AnimationUtilities.animateVisibility(this.f384278F, true, 300);
                    if (this.f384334az) {
                        ViewUtilities.setLayoutGravity(this.f384276D, 8388613);
                    } else {
                        ViewUtilities.setLayoutGravity(this.f384276D, 8388611);
                    }
                }
            }
            AppUtilities.updateSystemBars(this.f384337f.getActivity().getWindow(), viewerMode, this.f384296X);
            mo116584q();
            mo116570d();
            this.f384282J.setVisibility(8);
            return true;
        }
    }

    public void updateArScaleUI(float f, float f2, float f3) {
        this.f384353v.updateTransformUI(f, f2, f3);
    }

    public final void updateOcclusionsUi() {
        this.f384275C.updateOcclusionsUi();
    }

    /* renamed from: v */
    public final void mo116588v(Intent intent) {
        Types.LightingSettings.Mode mode;
        Types.OcclusionSettings.Mode mode2;
        Uri data = intent.getData();
        data.getClass();
        this.f384319ak = null;
        this.f384320al = C141533a.m229742n(data);
        C141534b bVar = this.f384326ar;
        boolean z = true;
        boolean z2 = bVar.f384165b.contains("*") || bVar.f384165b.contains(C141533a.m229743o(data));
        boolean z3 = !Types.SceneViewerParams.StreamingMode.STREAMING_DISABLED.equals(C141533a.m229733e(data));
        String l = C141533a.m229740l(data);
        boolean z4 = l == null || !Pattern.matches(bVar.f384164a.getDisallowedModelTitlePattern(), l);
        String t = C141533a.m229748t(data);
        boolean z5 = bVar.f384167d.contains("*") || t == null || bVar.f384167d.contains(t);
        String s = C141533a.m229747s(data);
        boolean z6 = bVar.f384166c.contains("*") || s == null;
        if (s != null) {
            String str = (String) C58557jl.m90128i(C58869cf.m90936b(new C58903m(':')).mo56153g(s), 0);
            C58800sl lA = bVar.f384166c.iterator();
            while (lA.hasNext()) {
                z6 = z6 || str.endsWith((String) lA.next());
            }
        }
        boolean z7 = bVar.f384164a.getModeAllowed() && C141533a.m229735g(data) != null && z2 && z3 && z4 && z5 && z6;
        this.f384306aH = z7;
        if (z7) {
            data = UriUtilities.upsertQueryParameter(data, "streaming_mode", true != Types.SceneViewerParams.StreamingMode.STREAMING_PREFERRED.equals(Types.SceneViewerParams.StreamingMode.STREAMING_DISABLED) ? "preferred" : "disabled");
        } else {
            ViewerLogger.getInstance().logAction(ArViewerLogEnumOuterClass.ArViewerLogEnum.Action.STREAMING_MODE_NOT_ALLOWED_FOR_USER);
        }
        Uri a = C141533a.m229729a(data);
        if (a != null) {
            String host = a.getHost();
            if ("flipkart.com:android".equals(C141533a.m229743o(data)) && host != null && !host.endsWith("flipkart.com")) {
                showLoadObjectErrorDialog();
                return;
            }
        }
        boolean z8 = C141533a.m229728A(data) && this.f384355x.f124007h;
        C47891b bVar2 = (C47891b) this.f384355x.toBuilder();
        bVar2.copyOnWrite();
        C47892c cVar = (C47892c) bVar2.instance;
        cVar.f124000a |= 64;
        cVar.f124007h = z8;
        Types.LightingSettings.Mode mode3 = Types.LightingSettings.Mode.UNSPECIFIED;
        Types.SceneViewerParams.LightingMode lightingMode = Types.SceneViewerParams.LightingMode.UNSPECIFIED_LIGHTING;
        ButtonType buttonType = ButtonType.NONE;
        Types.ViewerMode viewerMode = Types.ViewerMode.INVALID;
        Types.SceneViewerParams.ModePreference modePreference = Types.SceneViewerParams.ModePreference.UNSPECIFIED;
        Types.SnackbarMessage snackbarMessage = Types.SnackbarMessage.EMPTY;
        if (C141533a.m229731c(data).ordinal() != 1) {
            mode = Types.LightingSettings.Mode.ENABLED;
        } else {
            mode = Types.LightingSettings.Mode.DISABLED;
        }
        bVar2.copyOnWrite();
        C47892c cVar2 = (C47892c) bVar2.instance;
        cVar2.f124017r = mode.getNumber();
        cVar2.f124000a |= 65536;
        if (C141533a.m229752x(data) || z8) {
            mode2 = Types.OcclusionSettings.Mode.DISABLED;
        } else {
            mode2 = Types.OcclusionSettings.Mode.ENABLED;
        }
        bVar2.copyOnWrite();
        C47892c cVar3 = (C47892c) bVar2.instance;
        cVar3.f124018s = mode2.getNumber();
        cVar3.f124000a |= C89885b.S3REQUEST_VALUE;
        String o = C141533a.m229743o(data);
        if (o != null) {
            bVar2.copyOnWrite();
            C47892c cVar4 = (C47892c) bVar2.instance;
            cVar4.f124000a |= 1024;
            cVar4.f124011l = o;
        }
        String i = C141533a.m229737i(data);
        if (i != null) {
            bVar2.copyOnWrite();
            C47892c cVar5 = (C47892c) bVar2.instance;
            cVar5.f124000a |= 2048;
            cVar5.f124012m = i;
        }
        String h = C141533a.m229736h(data);
        if (h != null) {
            bVar2.copyOnWrite();
            C47892c cVar6 = (C47892c) bVar2.instance;
            cVar6.f124000a |= 4096;
            cVar6.f124013n = h;
        }
        String q = C141533a.m229745q(data);
        if (q != null) {
            bVar2.copyOnWrite();
            C47892c cVar7 = (C47892c) bVar2.instance;
            cVar7.f124000a |= 8192;
            cVar7.f124014o = q;
        }
        String f = C141533a.m229734f(data);
        if (f != null) {
            bVar2.copyOnWrite();
            C47892c cVar8 = (C47892c) bVar2.instance;
            cVar8.f124000a |= 16384;
            cVar8.f124015p = f;
        }
        this.f384312ad = !C141533a.m229753y(data);
        this.f384315ag = this.f384315ag && C141533a.m229751w(data);
        this.f384355x = (C47892c) bVar2.build();
        Uri data2 = intent.getData();
        data2.getClass();
        boolean z9 = C141533a.m229754z(data2);
        Types.StreamingSettings a2 = C141534b.m229755a(intent);
        if (a2 != null) {
            z9 |= a2.getTouchEventsEnabled();
        }
        Types.StreamingSettings.Builder builder = (Types.StreamingSettings.Builder) this.f384356y.toBuilder();
        builder.setMode(C141533a.m229733e(data2));
        builder.setTouchEventsEnabled(z9);
        this.f384356y = (Types.StreamingSettings) builder.build();
        String s2 = C141533a.m229747s(data);
        if (C141566j.m229772a(s2)) {
            if (C141566j.f384241a.contains(s2.substring(0, s2.indexOf("."))) || !this.f384356y.getTouchEventsEnabled() || !this.f384356y.getSideChannelEventEnabled()) {
                z = false;
            }
            this.f384307aI = z;
        } else {
            this.f384307aI = false;
        }
        mo116579m(C141533a.m229732d(data));
        mo116574h(data, false);
    }

    private boolean configureButton(int i, int i2, String str, String str2) {
        CompletableFuture completableFuture;
        if (i < 0 || i2 <= 0) {
            ((C59052c) ((C59052c) f384271b.mo56226d()).mo56372aa(41756)).mo56386p("Invalid params passed to configure button, returning.");
            return false;
        } else if (!C58837ba.m90859h(str)) {
            Uri parse = Uri.parse(str);
            if (AppUtilities.isDarkMode(this.f384337f.getContext())) {
                Uri parse2 = Uri.parse(str.replace(".png", "-dark.png"));
                completableFuture = WebUtilities.downloadDrawable(this.f384337f.getContext(), parse2).exceptionally(C141619w.f384420a).thenComposeAsync(new C141620x(this, parse2, parse), ThreadPools.getThreadPoolExecutor());
            } else {
                completableFuture = WebUtilities.downloadDrawable(this.f384337f.getContext(), parse);
            }
            this.f384288P.add(completableFuture);
            completableFuture.thenAcceptAsync(new C141593c(this, completableFuture, i, i2, str2), ThreadPools.getMainExecutor());
            return true;
        } else {
            mo116571e(i, i2, (Drawable) null, str2);
            return true;
        }
    }
}
