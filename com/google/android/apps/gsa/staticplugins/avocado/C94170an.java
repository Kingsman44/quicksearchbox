package com.google.android.apps.gsa.staticplugins.avocado;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CameraManager;
import android.hardware.camera2.CaptureRequest;
import android.media.AudioAttributes;
import android.media.Image;
import android.media.ImageReader;
import android.media.SoundPool;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.VibrationEffect;
import android.os.Vibrator;
import android.util.Size;
import android.view.LayoutInflater;
import android.view.Surface;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.apps.gsa.opaonboarding.C83891ay;
import com.google.android.apps.gsa.opaonboarding.C83907bm;
import com.google.android.apps.gsa.opaonboarding.p6463ui.C84018m;
import com.google.android.apps.gsa.opaonboarding.p6463ui.FooterLayout;
import com.google.android.apps.gsa.opaonboarding.p6463ui.HeaderLayout;
import com.google.android.apps.gsa.search.core.C84413ad;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.search.core.preferences.C86337q;
import com.google.android.apps.gsa.search.core.preferences.C86338r;
import com.google.android.apps.gsa.shared.logger.C89943l;
import com.google.android.apps.gsa.shared.logger.p7051b.C89849ae;
import com.google.android.apps.gsa.shared.logger.p7051b.C89859i;
import com.google.android.apps.gsa.shared.p7066m.C90082eg;
import com.google.android.apps.gsa.shared.util.C90743b;
import com.google.android.apps.gsa.shared.util.permissions.C91075b;
import com.google.android.apps.gsa.shared.util.permissions.C91077d;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.gcoreclient.p1739aa.C21412a;
import com.google.android.libraries.gcoreclient.p1739aa.p1740a.C21413a;
import com.google.android.libraries.gcoreclient.p1739aa.p1740a.C21414b;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.android.libraries.logging.C28292j;
import com.google.android.libraries.logging.C28295m;
import com.google.android.libraries.p1730f.C21370a;
import com.google.android.libraries.search.p3047m.p3050b.C39226b;
import com.google.android.libraries.search.p3047m.p3054d.C39239a;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60870cx;
import dagger.C68214a;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.apps.gsa.staticplugins.avocado.an */
/* compiled from: PG */
public final class C94170an extends C83907bm {

    /* renamed from: b */
    public static final C59071e f263048b = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.avocado.an");

    /* renamed from: A */
    Integer f263049A;

    /* renamed from: B */
    int f263050B;

    /* renamed from: C */
    Surface f263051C;

    /* renamed from: D */
    public C94327n f263052D = C94327n.f263598g;

    /* renamed from: E */
    public C94273dy f263053E;

    /* renamed from: F */
    public Boolean f263054F = false;

    /* renamed from: G */
    public HeaderLayout f263055G;

    /* renamed from: H */
    public String[] f263056H;

    /* renamed from: I */
    public String[] f263057I;

    /* renamed from: J */
    public C60870cx f263058J;

    /* renamed from: K */
    public int f263059K;

    /* renamed from: L */
    public CameraCaptureSession f263060L;

    /* renamed from: M */
    public CameraDevice f263061M;

    /* renamed from: N */
    Handler f263062N;

    /* renamed from: O */
    public int f263063O = 0;

    /* renamed from: P */
    public boolean f263064P;

    /* renamed from: Q */
    public boolean f263065Q = false;

    /* renamed from: R */
    public boolean f263066R = false;

    /* renamed from: S */
    public boolean f263067S;

    /* renamed from: T */
    public CircleView f263068T;

    /* renamed from: U */
    public ImageView f263069U;

    /* renamed from: V */
    public AvocadoLottieAnimationView f263070V;

    /* renamed from: W */
    public AvocadoLottieAnimationView f263071W;

    /* renamed from: X */
    public AvocadoLottieAnimationView f263072X;

    /* renamed from: Y */
    public C94221c f263073Y;

    /* renamed from: Z */
    public int f263074Z = 5;

    /* renamed from: aa */
    public boolean f263075aa = true;

    /* renamed from: ab */
    public int f263076ab = 0;

    /* renamed from: ac */
    public Size f263077ac;

    /* renamed from: ad */
    VibrationEffect f263078ad;

    /* renamed from: ae */
    VibrationEffect f263079ae;

    /* renamed from: af */
    public final CameraCaptureSession.CaptureCallback f263080af = new C94339z(this);

    /* renamed from: ag */
    public C21413a f263081ag;

    /* renamed from: ah */
    public C21412a f263082ah;

    /* renamed from: ai */
    public C21414b f263083ai;

    /* renamed from: aj */
    public C94167ak f263084aj;

    /* renamed from: ak */
    private View f263085ak;

    /* renamed from: al */
    private String[] f263086al;

    /* renamed from: am */
    private Camera2SourcePreview f263087am;

    /* renamed from: an */
    private HandlerThread f263088an;

    /* renamed from: ao */
    private ImageReader f263089ao;

    /* renamed from: ap */
    private long f263090ap;

    /* renamed from: aq */
    private final CameraDevice.StateCallback f263091aq = new C94337x(this);

    /* renamed from: ar */
    private final ImageReader.OnImageAvailableListener f263092ar = new C94338y(this);

    /* renamed from: as */
    private final C94336w f263093as = new C94336w(this);

    /* renamed from: c */
    public final Object f263094c = new Object();

    /* renamed from: d */
    public final Object f263095d = new Object();

    /* renamed from: e */
    public final Semaphore f263096e = new Semaphore(1);

    /* renamed from: f */
    public final float[] f263097f = new float[5];

    /* renamed from: g */
    final String f263098g = UUID.randomUUID().toString();

    /* renamed from: h */
    public C22871g f263099h;

    /* renamed from: i */
    public C22871g f263100i;

    /* renamed from: j */
    public C91075b f263101j;

    /* renamed from: k */
    public C68214a f263102k;

    /* renamed from: l */
    public C94256dh f263103l;

    /* renamed from: m */
    public C86124t f263104m;

    /* renamed from: n */
    public C91077d f263105n;

    /* renamed from: o */
    public C68214a f263106o;

    /* renamed from: p */
    public C68214a f263107p;

    /* renamed from: q */
    public C84413ad f263108q;

    /* renamed from: r */
    public C90743b f263109r;

    /* renamed from: s */
    public C21370a f263110s;

    /* renamed from: t */
    Integer f263111t = 0;

    /* renamed from: u */
    int f263112u = 0;

    /* renamed from: v */
    boolean f263113v = false;

    /* renamed from: w */
    int f263114w = 0;

    /* renamed from: x */
    int f263115x = 3;

    /* renamed from: y */
    int f263116y;

    /* renamed from: z */
    int f263117z = 20;

    /* renamed from: k */
    public static void m155416k(ImageReader imageReader) {
        Image acquireLatestImage = imageReader.acquireLatestImage();
        if (acquireLatestImage != null) {
            acquireLatestImage.close();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo77314b() {
        C83891ay.m133615a(this);
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public final Vibrator mo88362e() {
        Context context = getContext();
        if (context == null) {
            return null;
        }
        return (Vibrator) context.getSystemService("vibrator");
    }

    /* renamed from: g */
    public final void mo88363g() {
        try {
            ((C59052c) ((C59052c) f263048b.mo56224b()).mo56372aa(14194)).mo56386p("#createPreviewSession");
            Surface surface = this.f263051C;
            surface.getClass();
            ImageReader imageReader = this.f263089ao;
            imageReader.getClass();
            List asList = Arrays.asList(new Surface[]{surface, imageReader.getSurface()});
            CameraDevice cameraDevice = this.f263061M;
            cameraDevice.getClass();
            C58485gu j = C58485gu.m89842j(asList);
            CaptureRequest.Builder createCaptureRequest = cameraDevice.createCaptureRequest(1);
            int size = j.size();
            for (int i = 0; i < size; i++) {
                Surface surface2 = (Surface) j.get(i);
                if (createCaptureRequest != null) {
                    createCaptureRequest.addTarget(surface2);
                }
            }
            C94276ea eaVar = new C94276ea(new C94274dz(createCaptureRequest));
            CameraDevice cameraDevice2 = this.f263061M;
            if (cameraDevice2 == null) {
                ((C59052c) ((C59052c) f263048b.mo56226d()).mo56372aa(14196)).mo56386p("Already closed.");
            } else {
                cameraDevice2.createCaptureSession(asList, new C94157aa(this, eaVar), (Handler) null);
            }
        } catch (CameraAccessException e) {
            ((C59052c) ((C59052c) ((C59052c) f263048b.mo56225c()).mo56382g(e)).mo56372aa(14195)).mo56386p("CameraAccessException");
        }
    }

    /* renamed from: h */
    public final void mo88364h(int i) {
        long c = this.f263110s.mo26871c();
        if (c - this.f263090ap >= this.f263104m.mo79743a(C90082eg.f249982bs)) {
            this.f263090ap = c;
            if (i == 1) {
                this.f263084aj.mo88360b(getString(R.string.face_rejection_too_big_text));
            } else if (i == 2) {
                this.f263084aj.mo88360b(getString(R.string.face_rejection_too_small_text));
            } else if (i == 3) {
                this.f263084aj.mo88360b(getString(R.string.face_rejection_not_centered_text));
            } else if (i != 5) {
                this.f263084aj.mo88360b(getString(R.string.face_rejection_other_reasons_text));
            } else {
                this.f263084aj.mo88360b(getString(R.string.face_rejection_tilt_up_down_too_much_text));
            }
            this.f263100i.mo28212l("Change the UI when reject", new C94330q(this));
        }
    }

    /* renamed from: i */
    public final void mo88365i() {
        C94326m mVar = (C94326m) C94327n.f263598g.createBuilder();
        mVar.copyOnWrite();
        C94327n nVar = (C94327n) mVar.instance;
        nVar.f263600a |= 4;
        nVar.f263604f = true;
        this.f263052D = (C94327n) mVar.build();
        if (getActivity() != null) {
            ((C59052c) ((C59052c) f263048b.mo56224b()).mo56372aa(14222)).mo56386p("# onSuccess onFragmentCompleted");
            mo77318iT().mo77312a();
        }
    }

    /* renamed from: j */
    public final void mo88366j(int i, int i2) {
        if (this.f263105n.mo85350f("android.permission.CAMERA")) {
            ((C59052c) ((C59052c) f263048b.mo56225c()).mo56372aa(14229)).mo56386p("Permission is not granted. Requesting permission");
            this.f263101j.mo81047ju(new String[]{"android.permission.CAMERA"}, 14, new C94168al(this));
            return;
        }
        C59071e eVar = f263048b;
        ((C59052c) ((C59052c) eVar.mo56224b()).mo56372aa(14225)).mo56386p("#open");
        C94273dy dyVar = new C94273dy(getContext(), this.f263087am, this.f263084aj, i, i2, this.f263104m);
        this.f263053E = dyVar;
        this.f263064P = dyVar.f263448e;
        Size size = dyVar.f263449f;
        this.f263077ac = size;
        ImageReader newInstance = ImageReader.newInstance(size.getWidth(), size.getHeight(), 35, 2);
        this.f263089ao = newInstance;
        newInstance.setOnImageAvailableListener(this.f263092ar, this.f263062N);
        try {
            if (this.f263096e.tryAcquire(2500, TimeUnit.MILLISECONDS)) {
                this.f263062N.getClass();
                ((C59052c) ((C59052c) eVar.mo56224b()).mo56372aa(14226)).mo56386p("#Real start to open");
                C94273dy dyVar2 = this.f263053E;
                CameraDevice.StateCallback stateCallback = this.f263091aq;
                Handler handler = this.f263062N;
                dyVar2.f263447d.getClass();
                ((CameraManager) C39239a.m68666a(dyVar2.f263445b, C39226b.TAG_CLASSIC_ASSISTANT_FACEMATCH).getSystemService("camera")).openCamera(dyVar2.f263447d, stateCallback, handler);
                return;
            }
            throw new RuntimeException("Time out waiting to lock opening.");
        } catch (CameraAccessException e) {
            ((C59052c) ((C59052c) ((C59052c) f263048b.mo56225c()).mo56382g(e)).mo56372aa(14227)).mo56386p("CameraAccessException");
        } catch (InterruptedException e2) {
            ((C59052c) ((C59052c) ((C59052c) f263048b.mo56225c()).mo56382g(e2)).mo56372aa(14228)).mo56386p("Interrupted while trying to lock opening.");
            throw new RuntimeException("Interrupted while trying to lock opening.", e2);
        }
    }

    /* renamed from: l */
    public final void mo88367l() {
        if (this.f263109r.mo85090c()) {
            C60870cx cxVar = this.f263058J;
            if (cxVar != null) {
                cxVar.cancel(true);
            }
            this.f263109r.mo85089b(getContext(), this.f263086al[this.f263114w]);
            this.f263058J = this.f263100i.mo28208h("Give extra audible instruction", (long) this.f263059K, new C94328o(this));
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: m */
    public final boolean mo88368m() {
        return this.f263104m.mo79746e(C90082eg.f249986bw) && this.f263075aa;
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (this.f263108q.mo77966c() < 15300000) {
            this.f263075aa = false;
            ((C59052c) ((C59052c) f263048b.mo56224b()).mo56372aa(14216)).mo56386p("Up down not supported. Version < 25");
        } else if (this.f263104m.mo79746e(C90082eg.f249987bx) && ((C86338r) this.f263107p.mo27525b()).getBoolean("PROBLEM_WITH_UP_DOWN_POSE_KEY", false)) {
            this.f263075aa = false;
            ((C59052c) ((C59052c) f263048b.mo56224b()).mo56372aa(14215)).mo56386p("Up down not supported");
            C86337q b = ((C86338r) this.f263107p.mo27525b()).mo80076b();
            b.mo80075j("PROBLEM_WITH_UP_DOWN_POSE_KEY");
            b.commit();
        }
        this.f263076ab = true != mo88368m() ? 3 : 5;
        this.f263116y = (int) this.f263104m.mo79743a(C90082eg.f249970bg);
        this.f263078ad = AvocadoUtils.m155377a(this.f263104m, false);
        this.f263079ae = AvocadoUtils.m155377a(this.f263104m, true);
        C94256dh dhVar = this.f263103l;
        Context context = getContext();
        int i = this.f263076ab;
        if (dhVar.f263402q == null) {
            dhVar.f263402q = new SoundPool.Builder().setAudioAttributes(new AudioAttributes.Builder().setUsage(13).setContentType(4).setFlags(1).build()).setMaxStreams(i).build();
            dhVar.f263403r = false;
            dhVar.f263404s = false;
            dhVar.f263402q.setOnLoadCompleteListener(new C94254df(dhVar));
        }
        if (context != null && (!dhVar.f263403r || !dhVar.f263404s)) {
            dhVar.f263409x = new C94255dg(dhVar);
            context.registerReceiver(dhVar.f263409x, new IntentFilter("android.intent.action.DOWNLOAD_COMPLETE"));
            if (!dhVar.f263403r) {
                dhVar.f263393h.mo28212l("Download sound for photo capturing on intermediate steps", new C94237cp(dhVar, context));
            }
            if (!dhVar.f263404s) {
                dhVar.f263393h.mo28212l("Download sound for photo capturing on final step", new C94238cq(dhVar, context));
            }
        }
        this.f263086al = new String[]{getString(R.string.talk_back_pose_instruction_front), getString(R.string.talk_back_pose_instruction_left), getString(R.string.talk_back_pose_instruction_right)};
        this.f263057I = new String[]{getString(R.string.talk_back_pose_retry_instruction_front), getString(R.string.talk_back_pose_retry_instruction_left), getString(R.string.talk_back_pose_retry_instruction_right)};
        this.f263059K = (int) this.f263104m.mo79743a(C90082eg.f249899aO);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        super.onCreateView(layoutInflater, viewGroup, bundle);
        View inflate = View.inflate(getContext(), R.layout.face_match_image_capture_page_layout, (ViewGroup) null);
        this.f263085ak = inflate;
        C28295m.m52919e(inflate, new C28292j(62528));
        getActivity().getWindow().addFlags(128);
        this.f263100i.mo28213m("Remove LayoutParams.FLAG_KEEP_SCREEN_ON", TimeUnit.MINUTES.toMillis(this.f263104m.mo79743a(C90082eg.f249908aX)), new C94329p(this));
        return this.f263085ak;
    }

    public final void onDestroy() {
        BroadcastReceiver broadcastReceiver;
        super.onDestroy();
        C94256dh dhVar = this.f263103l;
        SoundPool soundPool = dhVar.f263402q;
        if (soundPool != null) {
            soundPool.release();
            dhVar.f263402q = null;
        }
        C94256dh dhVar2 = this.f263103l;
        Context context = getContext();
        if (context != null && (broadcastReceiver = dhVar2.f263409x) != null) {
            context.unregisterReceiver(broadcastReceiver);
            dhVar2.f263409x = null;
        }
    }

    public final void onDestroyView() {
        C89849ae aeVar;
        super.onDestroyView();
        C94327n nVar = this.f263052D;
        if ((nVar.f263600a & 2) == 0) {
            if (nVar.f263604f) {
                aeVar = C89849ae.FACE_MATCH_RECORD_FACE_SUCCESS;
            } else {
                aeVar = C89849ae.FACE_MATCH_RECORD_FACE_EXIT;
            }
            ((C89859i) this.f263106o.mo27525b()).mo83702b(aeVar);
        }
        Activity activity = getActivity();
        if (activity != null) {
            activity.getWindow().clearFlags(128);
        }
    }

    public final void onPause() {
        C59071e eVar = f263048b;
        ((C59052c) ((C59052c) eVar.mo56224b()).mo56372aa(14218)).mo56386p("#onPause");
        ((C59052c) ((C59052c) eVar.mo56224b()).mo56372aa(14193)).mo56386p("#close");
        C94273dy dyVar = this.f263053E;
        if (dyVar != null) {
            dyVar.f263446c.disable();
        }
        try {
            this.f263096e.acquire();
            CameraCaptureSession cameraCaptureSession = this.f263060L;
            if (cameraCaptureSession != null) {
                cameraCaptureSession.close();
                this.f263060L = null;
            }
            CameraDevice cameraDevice = this.f263061M;
            if (cameraDevice != null) {
                cameraDevice.close();
                this.f263061M = null;
            }
            ImageReader imageReader = this.f263089ao;
            if (imageReader != null) {
                imageReader.close();
                this.f263089ao = null;
            }
            C21414b bVar = this.f263083ai;
            if (bVar != null) {
                bVar.f59887a.mo122867a();
            }
            this.f263096e.release();
            HandlerThread handlerThread = this.f263088an;
            if (handlerThread != null) {
                handlerThread.quitSafely();
            }
            try {
                HandlerThread handlerThread2 = this.f263088an;
                if (handlerThread2 != null) {
                    handlerThread2.join();
                }
                this.f263088an = null;
                this.f263062N = null;
            } catch (InterruptedException e) {
                ((C59052c) ((C59052c) ((C59052c) f263048b.mo56225c()).mo56382g(e)).mo56372aa(14232)).mo56386p("InterruptedException");
            }
            super.onPause();
        } catch (InterruptedException e2) {
            throw new RuntimeException("Interrupted while trying to lock closing.", e2);
        } catch (Throwable th) {
            this.f263096e.release();
            throw th;
        }
    }

    public final void onResume() {
        super.onResume();
        HandlerThread handlerThread = new HandlerThread("CameraBackground");
        this.f263088an = handlerThread;
        handlerThread.start();
        this.f263062N = new Handler(this.f263088an.getLooper());
        C59071e eVar = f263048b;
        ((C59052c) ((C59052c) eVar.mo56224b()).mo56372aa(14219)).mo56386p("#onResume");
        Camera2SourcePreview camera2SourcePreview = this.f263087am;
        C58976aa aaVar = C58975e.f156826a;
        if (camera2SourcePreview.f263020b) {
            ((C59052c) ((C59052c) eVar.mo56224b()).mo56372aa(14221)).mo56386p("already available");
            mo88366j(this.f263087am.getWidth(), this.f263087am.getHeight());
            return;
        }
        ((C59052c) ((C59052c) eVar.mo56224b()).mo56372aa(14220)).mo56386p("onResume setPreviewListener");
        this.f263087am.f263021c = this.f263093as;
    }

    public final void onViewCreated(View view, Bundle bundle) {
        this.f263087am = (Camera2SourcePreview) this.f263085ak.findViewById(R.id.avocado_preview);
        try {
            for (String str : ((CameraManager) getActivity().getSystemService("camera")).getCameraIdList()) {
            }
        } catch (CameraAccessException e) {
            ((C59052c) ((C59052c) ((C59052c) f263048b.mo56225c()).mo56382g(e)).mo56372aa(14224)).mo56386p("CameraAccessException");
        }
        CircleView circleView = (CircleView) this.f263085ak.findViewById(R.id.circle_view);
        this.f263068T = circleView;
        ViewTreeObserver viewTreeObserver = circleView.getViewTreeObserver();
        if (viewTreeObserver != null) {
            viewTreeObserver.addOnGlobalLayoutListener(new C94277eb(circleView));
        }
        this.f263068T.setVisibility(4);
        this.f263069U = (ImageView) this.f263085ak.findViewById(R.id.red_ring);
        this.f263070V = (AvocadoLottieAnimationView) this.f263085ak.findViewById(R.id.loading);
        this.f263055G = (HeaderLayout) this.f263085ak.findViewById(R.id.opa_header);
        if (mo88368m()) {
            this.f263056H = new String[]{getString(R.string.record_face_screen_initial_title), getString(R.string.record_face_screen_turn_face_title), getString(R.string.record_face_screen_turn_face_title), getString(R.string.record_face_screen_turn_face_title), getString(R.string.record_face_screen_last_turn_face_title)};
            this.f263071W = (AvocadoLottieAnimationView) this.f263085ak.findViewById(R.id.scanning_hints);
            this.f263072X = (AvocadoLottieAnimationView) this.f263085ak.findViewById(R.id.intro_with_up_down);
        } else {
            this.f263056H = new String[]{getString(R.string.record_face_screen_initial_title), getString(R.string.record_face_screen_turn_face_title), getString(R.string.record_face_screen_turn_the_other_way_title)};
            this.f263071W = (AvocadoLottieAnimationView) this.f263085ak.findViewById(R.id.scanning_hints_two_poses);
            this.f263072X = (AvocadoLottieAnimationView) this.f263085ak.findViewById(R.id.intro_without_up_down);
        }
        HeaderLayout headerLayout = this.f263055G;
        C84018m.m133908c(headerLayout.f228718a, this.f263056H[0], TextView.BufferType.NORMAL, headerLayout);
        this.f263072X.setVisibility(0);
        this.f263073Y = new C94221c(this.f263071W, this.f263076ab, this.f263104m.mo79746e(C90082eg.f249978bo));
        this.f263115x = (int) this.f263104m.mo79743a(C90082eg.f249971bh);
        this.f263117z = (int) this.f263104m.mo79743a(C90082eg.f249966bc);
        FooterLayout footerLayout = (FooterLayout) this.f263085ak.findViewById(R.id.opa_footer_container);
        footerLayout.mo77362c(2);
        Button b = footerLayout.mo77361b();
        b.setText(getString(R.string.cancel_button_text));
        b.setOnClickListener(new C89943l(new C94333t(this)));
        Button a = footerLayout.mo77360a();
        a.setText(getString(R.string.start_button_text));
        a.setOnClickListener(new C89943l(new C94334u(this, a)));
        this.f263084aj = new C94167ak(this);
        this.f263090ap = this.f263110s.mo26871c();
    }
}
