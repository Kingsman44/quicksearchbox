package com.google.android.voiceinteraction;

import android.app.ActivityManager;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.UiModeManager;
import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.ServiceConnection;
import android.content.SharedPreferences;
import android.media.AudioAttributes;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Looper;
import android.os.Message;
import android.os.ParcelFileDescriptor;
import android.os.PowerManager;
import android.os.RemoteException;
import android.os.SharedMemory;
import android.service.voice.AlwaysOnHotwordDetector;
import androidx.core.content.C1882h;
import com.evernote.android.state.BuildConfig;
import com.google.android.apps.gsa.assist.p501a.C9325m;
import com.google.android.apps.gsa.assistant.shared.af;
import com.google.android.apps.gsa.assistant.shared.ah;
import com.google.android.apps.gsa.assistant.shared.ao;
import com.google.android.apps.gsa.assistant.shared.ap;
import com.google.android.apps.gsa.assistant.shared.ar;
import com.google.android.apps.gsa.assistant.shared.e.j;
import com.google.android.apps.gsa.assistant.shared.e.l;
import com.google.android.apps.gsa.assistant.shared.e.o;
import com.google.android.apps.gsa.assistant.shared.k.ag;
import com.google.android.apps.gsa.assistant.shared.p5812e.C73858p;
import com.google.android.apps.gsa.broadcastreceiver.C74444a;
import com.google.android.apps.gsa.hotword.hotworddetectionservice.C74581j;
import com.google.android.apps.gsa.hotword.hotworddetectionservice.k;
import com.google.android.apps.gsa.nga.shared.p6321am.p6322a.C80905at;
import com.google.android.apps.gsa.nga.shared.p6345h.C81323s;
import com.google.android.apps.gsa.nga.shared.p6356m.C81428d;
import com.google.android.apps.gsa.p8883x.C118826c;
import com.google.android.apps.gsa.search.core.p6513aj.C84516aa;
import com.google.android.apps.gsa.search.shared.p6930h.C87566i;
import com.google.android.apps.gsa.search.shared.service.C87673aa;
import com.google.android.apps.gsa.search.shared.service.C87677ae;
import com.google.android.apps.gsa.search.shared.service.C87682aj;
import com.google.android.apps.gsa.search.shared.service.C88486g;
import com.google.android.apps.gsa.search.shared.service.C88489j;
import com.google.android.apps.gsa.search.shared.service.C88499t;
import com.google.android.apps.gsa.search.shared.service.ClientConfig;
import com.google.android.apps.gsa.search.shared.service.p6935b.C87739bu;
import com.google.android.apps.gsa.search.shared.service.p6935b.C87831fe;
import com.google.android.apps.gsa.search.shared.service.p6935b.C87832ff;
import com.google.android.apps.gsa.search.shared.service.p6935b.C87833fg;
import com.google.android.apps.gsa.search.shared.service.p6940d.C88483e;
import com.google.android.apps.gsa.shared.bisto.C89606ad;
import com.google.android.apps.gsa.shared.bisto.C89686y;
import com.google.android.apps.gsa.shared.logger.C89838ab;
import com.google.android.apps.gsa.shared.logger.p7051b.C89849ae;
import com.google.android.apps.gsa.shared.logger.p7051b.C89852b;
import com.google.android.apps.gsa.shared.logger.p7051b.C89859i;
import com.google.android.apps.gsa.shared.logger.p7051b.C89862l;
import com.google.android.apps.gsa.shared.p6976ag.p6977a.C89105a;
import com.google.android.apps.gsa.shared.p6987ak.C89187a;
import com.google.android.apps.gsa.shared.p6987ak.C89188b;
import com.google.android.apps.gsa.shared.p6987ak.C89189c;
import com.google.android.apps.gsa.shared.p6987ak.C89190d;
import com.google.android.apps.gsa.shared.p6987ak.C89192f;
import com.google.android.apps.gsa.shared.p7010ba.C89341c;
import com.google.android.apps.gsa.shared.p7010ba.p7011a.C89339b;
import com.google.android.apps.gsa.shared.p7066m.C90086ek;
import com.google.android.apps.gsa.shared.p7066m.C90126fx;
import com.google.android.apps.gsa.shared.p7130s.p7131a.C90476a;
import com.google.android.apps.gsa.shared.p7130s.p7133b.C90479a;
import com.google.android.apps.gsa.shared.search.Query;
import com.google.android.apps.gsa.shared.speech.dumper.C90543af;
import com.google.android.apps.gsa.shared.speech.dumper.C90544ag;
import com.google.android.apps.gsa.shared.speech.dumper.C90557j;
import com.google.android.apps.gsa.shared.speech.dumper.C90558k;
import com.google.android.apps.gsa.shared.speech.hotword.C90599p;
import com.google.android.apps.gsa.shared.speech.hotword.HotwordResult;
import com.google.android.apps.gsa.shared.speech.hotword.p7143a.C90584f;
import com.google.android.apps.gsa.shared.speech.speakerid.SpeakerIdModel;
import com.google.android.apps.gsa.shared.util.debug.C91022f;
import com.google.android.apps.gsa.shared.util.debug.p7163a.C90991b;
import com.google.android.apps.gsa.shared.util.debug.p7163a.C91006f;
import com.google.android.apps.gsa.shared.util.debug.p7166b.C91018d;
import com.google.android.apps.gsa.shared.util.p7158b.C90752i;
import com.google.android.apps.gsa.shared.util.p7159c.C90873ag;
import com.google.android.apps.gsa.shared.util.p7159c.C90892az;
import com.google.android.apps.gsa.shared.util.p7159c.C90929bz;
import com.google.android.apps.gsa.shared.util.p7159c.p7160a.C90851k;
import com.google.android.apps.gsa.shared.util.p7188v.C91142g;
import com.google.android.apps.gsa.shared.util.permissions.C91076c;
import com.google.android.apps.gsa.speech.microdetection.p7303a.p7308e.C92513g;
import com.google.android.apps.gsa.velvet.p8861a.C118616a;
import com.google.android.apps.gsa.velvet.p8861a.C118617b;
import com.google.android.apps.gsa.velvet.p8861a.C118618c;
import com.google.android.apps.gsa.voiceinteraction.hotword.C118717e;
import com.google.android.apps.gsa.voiceinteraction.hotword.C118719g;
import com.google.android.apps.gsa.voiceinteraction.hotword.C118720h;
import com.google.android.apps.gsa.voiceinteraction.hotword.C118726n;
import com.google.android.gms.clearcut.C143673z;
import com.google.android.gms.location.ActivityTransitionRequest;
import com.google.android.gms.location.C144896b;
import com.google.android.gms.location.C144907f;
import com.google.android.gms.tasks.C146006ab;
import com.google.android.gms.tasks.C146013ai;
import com.google.android.gms.tasks.C146014aj;
import com.google.android.googlequicksearchbox.R;
import com.google.android.hotword.service.C146591i;
import com.google.android.hotword.service.HotwordInformation;
import com.google.android.libraries.assistant.auto.tng.morris.p1072f.C14650f;
import com.google.android.libraries.assistant.hotword.C18375l;
import com.google.android.libraries.assistant.soda.p1605d.C19281s;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.android.libraries.p1730f.C21370a;
import com.google.android.libraries.search.assistant.fluidactions.rendering.p2561ui.p2565b.C33259r;
import com.google.android.libraries.search.assistant.invocation.android.voiceinteraction.p2589a.C33489a;
import com.google.android.libraries.search.assistant.invocation.p2655o.p2660d.p2661a.C34134g;
import com.google.android.libraries.search.assistant.p2820v.p2821a.C36771a;
import com.google.android.libraries.search.assistant.p2820v.p2821a.C36772b;
import com.google.android.libraries.search.assistant.p2820v.p2821a.C36773c;
import com.google.android.libraries.search.assistant.p2820v.p2821a.C36774d;
import com.google.android.libraries.search.assistant.p2820v.p2821a.C36776f;
import com.google.android.libraries.search.logging.C38828b;
import com.google.android.libraries.search.logging.appflows.C38780c;
import com.google.android.libraries.search.p2871b.p2872a.p2878f.C37188a;
import com.google.android.libraries.search.p3047m.p3048a.C39224b;
import com.google.android.libraries.search.p3047m.p3050b.C39226b;
import com.google.android.libraries.search.p3047m.p3054d.C39239a;
import com.google.android.libraries.storage.p3304a.C42813k;
import com.google.android.voiceinteraction.p3559a.C45370f;
import com.google.android.voiceinteraction.p3559a.C45371g;
import com.google.apps.tiktok.tracing.C47538ax;
import com.google.apps.tiktok.tracing.C47770dh;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47632e;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47633f;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.base.C58847bk;
import com.google.common.base.C58881cr;
import com.google.common.base.C58886cw;
import com.google.common.p4520a.C58206am;
import com.google.common.p4520a.C58254i;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58528ij;
import com.google.common.p4522b.C58733pz;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C58979ad;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.p4535g.C59203do;
import com.google.common.p4552o.C59582aj;
import com.google.common.p4552o.C59687cb;
import com.google.common.p4552o.amo;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60888db;
import com.google.common.util.concurrent.C60904dr;
import com.google.p3728as.p3737c.p3738a.C48034a;
import com.google.p3728as.p3737c.p3738a.C48037d;
import com.google.protobuf.C62910ar;
import com.google.protobuf.C62940bt;
import com.google.protobuf.p4750c.C62950b;
import dagger.C68214a;
import java.io.FileDescriptor;
import java.io.IOException;
import java.io.PrintWriter;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.Timer;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import p3186j$.time.Duration;
import p5460g.p5461a.C69464a;

/* compiled from: PG */
public class GsaVoiceInteractionService extends C45387ap implements C90991b, C14650f {

    /* renamed from: a */
    public static final C59071e f118622a = C59071e.m91332i("com.google.android.voiceinteraction.GsaVoiceInteractionService");

    /* renamed from: aW */
    private static final C58528ij f118623aW = C58528ij.m90015O("cmn-Hant-TW", "zh-Hant-TW", "zh-TW", "yue-Hant-HK", "zh-Hant-HK", "zh-HK", "yue-HK", "cmn-Hans-CN", "zh-Hans-CN", "zh-CN");

    /* renamed from: aX */
    private static final C58528ij f118624aX = C58733pz.f156496a;

    /* renamed from: b */
    public static boolean f118625b = false;

    /* renamed from: c */
    static final long f118626c = Duration.ofMinutes(60).toMillis();

    /* renamed from: d */
    public static final SimpleDateFormat f118627d = new SimpleDateFormat("MM-dd HH:mm:ss");

    /* renamed from: e */
    static final ClientConfig f118628e;

    /* renamed from: A */
    public C88499t f118629A;

    /* renamed from: B */
    boolean f118630B = true;

    /* renamed from: C */
    ar f118631C;

    /* renamed from: D */
    C118719g f118632D;

    /* renamed from: E */
    public C90929bz f118633E;

    /* renamed from: F */
    public C22871g f118634F;

    /* renamed from: G */
    public C22871g f118635G;

    /* renamed from: H */
    public C91022f f118636H;

    /* renamed from: I */
    public Context f118637I;

    /* renamed from: J */
    public ComponentName f118638J;

    /* renamed from: K */
    public C58833ax f118639K;

    /* renamed from: L */
    public C87677ae f118640L;

    /* renamed from: M */
    public C68214a f118641M;

    /* renamed from: N */
    public C68214a f118642N;

    /* renamed from: O */
    public C68214a f118643O;

    /* renamed from: P */
    public C68214a f118644P;

    /* renamed from: Q */
    public C69464a f118645Q;

    /* renamed from: R */
    public C90479a f118646R;

    /* renamed from: S */
    public C88483e f118647S;

    /* renamed from: T */
    public C58833ax f118648T;

    /* renamed from: U */
    public Set f118649U;

    /* renamed from: V */
    public C68214a f118650V;

    /* renamed from: W */
    public C68214a f118651W;

    /* renamed from: X */
    public C21370a f118652X;

    /* renamed from: Y */
    public C68214a f118653Y;

    /* renamed from: Z */
    public C68214a f118654Z;

    /* renamed from: aA */
    public final AtomicBoolean f118655aA;

    /* renamed from: aB */
    public int f118656aB;

    /* renamed from: aC */
    public String f118657aC;

    /* renamed from: aD */
    String f118658aD;

    /* renamed from: aE */
    String f118659aE;

    /* renamed from: aF */
    C45386ao f118660aF;

    /* renamed from: aG */
    C146591i f118661aG;

    /* renamed from: aH */
    public boolean f118662aH;

    /* renamed from: aI */
    boolean f118663aI;

    /* renamed from: aJ */
    HotwordInformation f118664aJ;

    /* renamed from: aK */
    public C45393av f118665aK;

    /* renamed from: aL */
    final AlwaysOnHotwordDetector.Callback f118666aL;

    /* renamed from: aM */
    k f118667aM;

    /* renamed from: aN */
    final C74581j f118668aN;

    /* renamed from: aO */
    final AlwaysOnHotwordDetector.Callback f118669aO;

    /* renamed from: aP */
    C45390as f118670aP;

    /* renamed from: aQ */
    final ServiceConnection f118671aQ;

    /* renamed from: aR */
    final BroadcastReceiver f118672aR;

    /* renamed from: aS */
    final BroadcastReceiver f118673aS;

    /* renamed from: aT */
    final BroadcastReceiver f118674aT;

    /* renamed from: aU */
    final C45416x f118675aU;

    /* renamed from: aV */
    public C90851k f118676aV;

    /* renamed from: aY */
    private Set f118677aY;

    /* renamed from: aZ */
    private final C58881cr f118678aZ = C58886cw.m90973a(new C45415w());

    /* renamed from: aa */
    public C68214a f118679aa;

    /* renamed from: ab */
    public C68214a f118680ab;

    /* renamed from: ac */
    public C68214a f118681ac;

    /* renamed from: ad */
    public C68214a f118682ad;

    /* renamed from: ae */
    public C68214a f118683ae;

    /* renamed from: af */
    public C68214a f118684af;

    /* renamed from: ag */
    public C68214a f118685ag;

    /* renamed from: ah */
    public C68214a f118686ah;

    /* renamed from: ai */
    public C68214a f118687ai;

    /* renamed from: aj */
    public C68214a f118688aj;

    /* renamed from: ak */
    public C69464a f118689ak;

    /* renamed from: al */
    public C68214a f118690al;

    /* renamed from: am */
    public C68214a f118691am;

    /* renamed from: an */
    public C58833ax f118692an;

    /* renamed from: ao */
    public C68214a f118693ao;

    /* renamed from: ap */
    ArrayList f118694ap = new ArrayList();

    /* renamed from: aq */
    public final ConcurrentMap f118695aq;

    /* renamed from: ar */
    public final ConcurrentMap f118696ar;

    /* renamed from: as */
    public final ConcurrentMap f118697as;

    /* renamed from: at */
    final C89686y f118698at;

    /* renamed from: au */
    final C87682aj f118699au;

    /* renamed from: av */
    final C118717e f118700av;

    /* renamed from: aw */
    public final Object f118701aw;

    /* renamed from: ax */
    AlwaysOnHotwordDetector f118702ax;

    /* renamed from: ay */
    volatile int f118703ay;

    /* renamed from: az */
    boolean f118704az;

    /* renamed from: ba */
    private boolean f118705ba;

    /* renamed from: bb */
    private SharedPreferences f118706bb;

    /* renamed from: bc */
    private int f118707bc;

    /* renamed from: bd */
    private Intent f118708bd;

    /* renamed from: be */
    private final BroadcastReceiver f118709be;

    /* renamed from: f */
    int f118710f = 0;

    /* renamed from: g */
    boolean f118711g = false;

    /* renamed from: h */
    boolean f118712h = false;

    /* renamed from: i */
    public boolean f118713i = false;

    /* renamed from: j */
    public long f118714j = -1;

    /* renamed from: k */
    C58833ax f118715k = C58836b.f156633a;

    /* renamed from: l */
    public String f118716l = BuildConfig.FLAVOR;

    /* renamed from: m */
    public boolean f118717m = false;

    /* renamed from: n */
    AtomicBoolean f118718n = new AtomicBoolean(false);

    /* renamed from: o */
    boolean f118719o = false;

    /* renamed from: p */
    C60888db f118720p;

    /* renamed from: q */
    Executor f118721q;

    /* renamed from: r */
    C47632e f118722r = new C47632e();

    /* renamed from: s */
    Timer f118723s;

    /* renamed from: t */
    boolean f118724t = true;

    /* renamed from: u */
    public final Object f118725u = new Object();

    /* renamed from: v */
    public final Object f118726v = new Object();

    /* renamed from: w */
    boolean f118727w = false;

    /* renamed from: x */
    C58833ax f118728x = C58836b.f156633a;

    /* renamed from: y */
    HotwordResult f118729y;

    /* renamed from: z */
    C87673aa f118730z;

    static {
        C88486g gVar = new C88486g();
        gVar.f239201c = amo.VOICE_INTERACTION_SERVICE;
        gVar.f239199a = 562954248945792L;
        gVar.f239204f = "search";
        f118628e = new ClientConfig(gVar);
    }

    public GsaVoiceInteractionService() {
        C58254i iVar = new C58254i();
        iVar.mo54823g(5);
        iVar.mo54821e(10, TimeUnit.MINUTES);
        this.f118695aq = ((C58206am) iVar.mo54817a()).f155647a;
        C58254i iVar2 = new C58254i();
        iVar2.mo54823g(5);
        iVar2.mo54821e(10, TimeUnit.MINUTES);
        this.f118696ar = ((C58206am) iVar2.mo54817a()).f155647a;
        C58254i iVar3 = new C58254i();
        iVar3.mo54823g(5);
        iVar3.mo54821e(10, TimeUnit.MINUTES);
        this.f118697as = ((C58206am) iVar3.mo54817a()).f155647a;
        this.f118675aU = new C45416x(this);
        this.f118698at = new C45417y(this);
        this.f118699au = new C45418z(this);
        this.f118700av = new C45372aa(this);
        this.f118701aw = new Object();
        this.f118703ay = 0;
        this.f118704az = false;
        this.f118655aA = new AtomicBoolean(false);
        this.f118656aB = 0;
        this.f118657aC = BuildConfig.FLAVOR;
        this.f118707bc = -1;
        this.f118664aJ = null;
        this.f118666aL = new C45378ag(this);
        this.f118667aM = null;
        this.f118668aN = new C45379ah(this);
        this.f118669aO = new C45381aj(this);
        this.f118670aP = new C45383al(this);
        this.f118671aQ = new C45404l(this);
        this.f118672aR = new C45407o(this);
        this.f118673aS = new C45408p(this);
        this.f118674aT = new C45413u(this);
        this.f118709be = new C45414v(this);
    }

    /* renamed from: al */
    private final void m80883al(C91006f fVar) {
        synchronized (this.f118726v) {
            HotwordInformation hotwordInformation = this.f118664aJ;
            if (hotwordInformation != null) {
                SpeakerIdModel speakerIdModel = hotwordInformation.f395887h;
                if (speakerIdModel != null) {
                    if (speakerIdModel.f253284b.mo56113h()) {
                        if (this.f118664aJ.f395875G == null) {
                            fVar.mo85284k("Bad Hotword State", "No Hotword Model");
                        }
                    }
                }
                fVar.mo85284k("Bad Hotword State", "No SpeakerId Model");
            }
        }
    }

    /* renamed from: am */
    private final void m80884am() {
        Intent intent = this.f118708bd;
        if (intent != null) {
            if (!"com.google.android.voiceinteraction.START_VOICE_INTERACTION".equals(intent.getAction())) {
                C58976aa aaVar = C58975e.f156826a;
            } else if (!this.f118662aH) {
                C59104x c = f118622a.mo56225c();
                c.mo56378ag(C58975e.f156826a, "GsaVoiceInteractionSrv");
                ((C59052c) ((C59052c) c).mo56372aa(54605)).mo56386p("Service is not ready, don't start session.");
            } else {
                m80886ao((Intent) this.f118708bd.getExtras().getParcelable("voice_intent"));
            }
        }
    }

    /* renamed from: an */
    private final void m80885an() {
        synchronized (this.f118726v) {
            this.f118727w = true;
        }
    }

    /* renamed from: ao */
    private final void m80886ao(Intent intent) {
        Bundle bundle;
        int i;
        if (!f118625b || !intent.getBooleanExtra("nga_programmatic_context_request", false)) {
            intent.setExtrasClassLoader(Query.class.getClassLoader());
            if (!intent.hasExtra("reissue_on_show_bundle") || (bundle = intent.getBundleExtra("reissue_on_show_bundle")) == null) {
                bundle = new Bundle();
                bundle.putParcelable("com.google.voicesearch.VI_INTENT", intent);
                if (intent.hasExtra("nga_only_create_session")) {
                    bundle.putBoolean("nga_only_create_session", intent.getBooleanExtra("nga_only_create_session", false));
                }
                if (intent.hasExtra("nga_assist_ui_client")) {
                    bundle.putBundle("nga_assist_ui_client", intent.getBundleExtra("nga_assist_ui_client"));
                }
            } else if (!bundle.getBoolean("is_reissued_session", false)) {
                bundle.putBoolean("is_reissued_session", true);
            } else {
                throw new IllegalStateException("Request to re-issue an already re-issued session.");
            }
            if (intent.hasExtra("reissue_on_show_flags")) {
                i = intent.getIntExtra("reissue_on_show_flags", 0);
            } else {
                int intExtra = intent.getIntExtra("InteractorMode", 0);
                int intExtra2 = intent.getIntExtra("InteractorSessionFlags", 0);
                i = (C87566i.m142283ag(intent.getExtras()) || intExtra != 1) ? intExtra2 : intExtra2 | 3;
            }
            C90476a aVar = C91018d.f254254a;
            showSession(bundle, i);
            C58976aa aaVar = C58975e.f156826a;
            return;
        }
        C58976aa aaVar2 = C58975e.f156826a;
    }

    /* renamed from: ap */
    private final void m80887ap() {
        C80905at.m128763g(((C81323s) ((C58847bk) this.f118692an).f156646a).mo74937b(Long.valueOf(this.f118652X.mo26871c())), C45399g.f118770a);
    }

    /* renamed from: aq */
    private final boolean m80888aq() {
        synchronized (this.f118726v) {
            HotwordInformation hotwordInformation = this.f118664aJ;
            if (hotwordInformation != null) {
                if (hotwordInformation.f395876H != null) {
                    if (!C45370f.m80968d(this.f118637I)) {
                        C58976aa aaVar = C58975e.f156826a;
                        return false;
                    } else if (this.f118711g) {
                        C58976aa aaVar2 = C58975e.f156826a;
                        return false;
                    } else {
                        C58976aa aaVar3 = C58975e.f156826a;
                        return true;
                    }
                }
            }
            C58976aa aaVar4 = C58975e.f156826a;
            return false;
        }
    }

    /* renamed from: ar */
    private final boolean m80889ar() {
        boolean z;
        synchronized (this.f118726v) {
            z = this.f118727w;
        }
        return z;
    }

    /* renamed from: as */
    private final void m80890as(C91006f fVar) {
        synchronized (this.f118726v) {
            C118719g gVar = this.f118632D;
            String str = "No";
            if (gVar != null) {
                if (gVar.f331147j.f331163d) {
                    str = "Yes";
                }
            }
            fVar.mo85284k("Audio Captured By Search Service", str);
        }
    }

    /* renamed from: at */
    private final void m80891at(C91006f fVar) {
        String str = "Yes";
        fVar.mo85284k("Software Hotword Triggered", true != this.f118696ar.containsValue(Boolean.TRUE) ? "No" : str);
        if (true != this.f118697as.containsValue(Boolean.TRUE)) {
            str = "No";
        }
        fVar.mo85284k("SpeakerID Verification Failed", str);
    }

    /* renamed from: au */
    private final void m80892au(StringBuilder sb) {
        Object obj;
        sb.append("\n    NowOnTapLocale=");
        sb.append(Locale.getDefault().toString());
        sb.append("\n    HotwordLocale=");
        synchronized (this.f118701aw) {
            sb.append(this.f118658aD);
        }
        sb.append("\n    Availability=");
        sb.append(this.f118703ay);
        sb.append("\n    Always-on recognition enabled=");
        sb.append(this.f118663aI);
        sb.append("\n    Hotword Requested=");
        sb.append(this.f118655aA.get());
        sb.append("\n    Using Trusted Always-On Hotword Detector=");
        sb.append(this.f118704az);
        sb.append("\n    Is AlwaysOnHotwordDetector null=");
        boolean z = true;
        sb.append(this.f118702ax == null);
        sb.append("\n    Connected To HotwordService=");
        synchronized (this.f118725u) {
            sb.append(this.f118661aG != null);
        }
        synchronized (this.f118726v) {
            obj = this.f118664aJ;
        }
        sb.append("\n    HotwordInformation=");
        if (obj == null) {
            obj = "null";
        }
        sb.append(obj);
        C58528ij ijVar = C74444a.f208520b;
        sb.append("\n    RegisteredOreoReceiver=");
        if (ijVar == null || ijVar.isEmpty()) {
            z = false;
        }
        sb.append(z);
        sb.append("\n    AvailabilityChanges=");
        sb.append(this.f118716l);
        synchronized (this.f118726v) {
            if (this.f118632D != null) {
                sb.append("\n");
                C118719g gVar = this.f118632D;
                StringBuilder l = gVar.f331139b.mo23798l();
                if (gVar.f331140c != null) {
                    l.append("\n");
                    l.append(gVar.f331140c.mo23798l());
                }
                HotwordInformation hotwordInformation = gVar.f331148k;
                if (hotwordInformation != null && hotwordInformation.f395884e) {
                    l.append("\n");
                    C118720h hVar = gVar.f331147j;
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(hVar.getClass().getSimpleName());
                    sb2.append("\n    Audio captured by search service=");
                    sb2.append(hVar.f331163d);
                    sb2.append("\n    Audio captured by hotword enrollment=");
                    sb2.append(hVar.f331164e);
                    sb2.append("\n    External hotword-capable device connected");
                    sb2.append(hVar.f331167h);
                    sb2.append("\n    Last known screen on status=");
                    sb2.append(hVar.f331165f);
                    sb2.append("\n    HotwordRunning=");
                    sb2.append(hVar.mo103924c());
                    sb2.append("\n    Software hotword requested=");
                    sb2.append(hVar.f331166g);
                    l.append(sb2);
                }
                sb.append(l);
            }
        }
        sb.append("\n    HotwordCheckinData=");
        sb.append(((C90544ag) this.f118684af.mo27525b()).mo84660a());
    }

    /* renamed from: b */
    public static int m80893b(AlwaysOnHotwordDetector.EventPayload eventPayload) {
        try {
            Integer num = (Integer) eventPayload.getClass().getMethod("getCaptureSession", new Class[0]).invoke(eventPayload, new Object[0]);
            if (num != null) {
                return num.intValue();
            }
            return -1;
        } catch (Exception e) {
            C59104x c = f118622a.mo56225c();
            c.mo56378ag(C58975e.f156826a, "GsaVoiceInteractionSrv");
            ((C59052c) ((C59052c) ((C59052c) c).mo56382g(e)).mo56372aa(54499)).mo56386p("Failed to get captureSession");
            return -1;
        }
    }

    /* renamed from: A */
    public final void mo49386A(C89849ae aeVar) {
        synchronized (this.f118726v) {
            HotwordInformation hotwordInformation = this.f118664aJ;
            if (hotwordInformation != null && hotwordInformation.f395900u) {
                if (!this.f118728x.mo56113h()) {
                    mo49388C(C89849ae.DSP_HARDWARE_AVAILABILITY_CHANGE);
                }
                mo49390E(aeVar);
            }
            this.f118728x = C58836b.f156633a;
        }
    }

    /* renamed from: B */
    public final void mo49387B(C89849ae aeVar) {
        synchronized (this.f118726v) {
            HotwordInformation hotwordInformation = this.f118664aJ;
            if (hotwordInformation != null && hotwordInformation.f395900u) {
                if (!this.f118728x.mo56113h()) {
                    mo49388C(C89849ae.DSP_HARDWARE_AVAILABILITY_CHANGE);
                }
                ((C89859i) this.f118650V.mo27525b()).mo83702b(aeVar);
            }
        }
    }

    /* renamed from: C */
    public final void mo49388C(C89849ae aeVar) {
        synchronized (this.f118726v) {
            HotwordInformation hotwordInformation = this.f118664aJ;
            if (hotwordInformation != null && hotwordInformation.f395900u) {
                this.f118728x = C58833ax.m90834k(aeVar);
                mo49387B(aeVar);
            }
        }
    }

    /* renamed from: D */
    public final void mo49389D(HotwordResult hotwordResult) {
        if (this.f118730z.mo81951w()) {
            mo49399N("GsaVoiceInteractionSrv#createHotwordRejectedClientEvent", new C45396d(this, hotwordResult));
            this.f118660aF.sendEmptyMessage(6);
        }
        m80887ap();
    }

    /* renamed from: E */
    public final void mo49390E(C89849ae aeVar) {
        mo49391F(aeVar, C58836b.f156633a, (C59582aj) C59687cb.f160034bf.createBuilder());
    }

    /* JADX WARNING: Code restructure failed: missing block: B:50:0x0157, code lost:
        if (r1 != false) goto L_0x0159;
     */
    /* renamed from: F */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo49391F(com.google.android.apps.gsa.shared.logger.p7051b.C89849ae r12, com.google.common.base.C58833ax r13, com.google.common.p4552o.C59582aj r14) {
        /*
            r11 = this;
            dagger.a r0 = r11.f118650V
            if (r0 == 0) goto L_0x02a6
            java.lang.Object r0 = r0.mo27525b()
            if (r0 != 0) goto L_0x000c
            goto L_0x02a6
        L_0x000c:
            com.google.common.o.be r0 = com.google.common.p4552o.C59651be.f159929E
            com.google.protobuf.bn r0 = r0.createBuilder()
            com.google.common.o.ay r0 = (com.google.common.p4552o.C59601ay) r0
            java.lang.Object r1 = r11.f118726v
            monitor-enter(r1)
            com.google.android.apps.gsa.shared.speech.hotword.HotwordResult r2 = r11.f118729y     // Catch:{ all -> 0x02a3 }
            r3 = 262144(0x40000, float:3.67342E-40)
            r4 = 524288(0x80000, float:7.34684E-40)
            r5 = 0
            if (r2 == 0) goto L_0x009f
            java.lang.String r2 = r2.mo84707x()     // Catch:{ all -> 0x02a3 }
            if (r2 == 0) goto L_0x003e
            boolean r6 = r2.isEmpty()     // Catch:{ all -> 0x02a3 }
            if (r6 != 0) goto L_0x003e
            r14.copyOnWrite()     // Catch:{ all -> 0x02a3 }
            com.google.protobuf.bv r6 = r14.instance     // Catch:{ all -> 0x02a3 }
            com.google.common.o.cb r6 = (com.google.common.p4552o.C59687cb) r6     // Catch:{ all -> 0x02a3 }
            com.google.common.o.cb r7 = com.google.common.p4552o.C59687cb.f160034bf     // Catch:{ all -> 0x02a3 }
            int r7 = r6.f160115b     // Catch:{ all -> 0x02a3 }
            r8 = 131072(0x20000, float:1.83671E-40)
            r7 = r7 | r8
            r6.f160115b = r7     // Catch:{ all -> 0x02a3 }
            r6.f160054S = r2     // Catch:{ all -> 0x02a3 }
        L_0x003e:
            com.google.android.apps.gsa.shared.speech.hotword.HotwordResult r2 = r11.f118729y     // Catch:{ all -> 0x02a3 }
            float r2 = r2.mo84683c()     // Catch:{ all -> 0x02a3 }
            r14.copyOnWrite()     // Catch:{ all -> 0x02a3 }
            com.google.protobuf.bv r6 = r14.instance     // Catch:{ all -> 0x02a3 }
            com.google.common.o.cb r6 = (com.google.common.p4552o.C59687cb) r6     // Catch:{ all -> 0x02a3 }
            com.google.common.o.cb r7 = com.google.common.p4552o.C59687cb.f160034bf     // Catch:{ all -> 0x02a3 }
            int r7 = r6.f160115b     // Catch:{ all -> 0x02a3 }
            r7 = r7 | r3
            r6.f160115b = r7     // Catch:{ all -> 0x02a3 }
            r6.f160055T = r2     // Catch:{ all -> 0x02a3 }
            com.google.android.apps.gsa.shared.speech.hotword.HotwordResult r2 = r11.f118729y     // Catch:{ all -> 0x02a3 }
            float r2 = r2.mo84684d()     // Catch:{ all -> 0x02a3 }
            r14.copyOnWrite()     // Catch:{ all -> 0x02a3 }
            com.google.protobuf.bv r6 = r14.instance     // Catch:{ all -> 0x02a3 }
            com.google.common.o.cb r6 = (com.google.common.p4552o.C59687cb) r6     // Catch:{ all -> 0x02a3 }
            int r7 = r6.f160115b     // Catch:{ all -> 0x02a3 }
            r7 = r7 | r4
            r6.f160115b = r7     // Catch:{ all -> 0x02a3 }
            r6.f160056U = r2     // Catch:{ all -> 0x02a3 }
            com.google.android.apps.gsa.shared.speech.hotword.HotwordResult r2 = r11.f118729y     // Catch:{ all -> 0x02a3 }
            com.google.common.base.ax r2 = r2.mo84700r()     // Catch:{ all -> 0x02a3 }
            if (r2 == 0) goto L_0x009f
            boolean r6 = r2.mo56113h()     // Catch:{ all -> 0x02a3 }
            if (r6 == 0) goto L_0x009f
            java.lang.Object r2 = r2.mo56107c()     // Catch:{ all -> 0x02a3 }
            boolean[] r2 = (boolean[]) r2     // Catch:{ all -> 0x02a3 }
            r6 = 0
        L_0x007d:
            int r7 = r2.length     // Catch:{ all -> 0x02a3 }
            if (r6 >= r7) goto L_0x009f
            boolean r7 = r2[r6]     // Catch:{ all -> 0x02a3 }
            r0.copyOnWrite()     // Catch:{ all -> 0x02a3 }
            com.google.protobuf.bv r8 = r0.instance     // Catch:{ all -> 0x02a3 }
            com.google.common.o.be r8 = (com.google.common.p4552o.C59651be) r8     // Catch:{ all -> 0x02a3 }
            com.google.protobuf.cb r9 = r8.f159960z     // Catch:{ all -> 0x02a3 }
            boolean r10 = r9.mo58948c()     // Catch:{ all -> 0x02a3 }
            if (r10 != 0) goto L_0x0097
            com.google.protobuf.cb r9 = com.google.protobuf.C62942bv.mutableCopy((com.google.protobuf.C62955cb) r9)     // Catch:{ all -> 0x02a3 }
            r8.f159960z = r9     // Catch:{ all -> 0x02a3 }
        L_0x0097:
            com.google.protobuf.cb r8 = r8.f159960z     // Catch:{ all -> 0x02a3 }
            r8.mo58923f(r7)     // Catch:{ all -> 0x02a3 }
            int r6 = r6 + 1
            goto L_0x007d
        L_0x009f:
            monitor-exit(r1)     // Catch:{ all -> 0x02a3 }
            java.lang.Object r2 = r11.f118701aw
            monitor-enter(r2)
            java.lang.String r1 = r11.f118658aD     // Catch:{ all -> 0x02a0 }
            if (r1 == 0) goto L_0x00b8
            r14.copyOnWrite()     // Catch:{ all -> 0x02a0 }
            com.google.protobuf.bv r6 = r14.instance     // Catch:{ all -> 0x02a0 }
            com.google.common.o.cb r6 = (com.google.common.p4552o.C59687cb) r6     // Catch:{ all -> 0x02a0 }
            com.google.common.o.cb r7 = com.google.common.p4552o.C59687cb.f160034bf     // Catch:{ all -> 0x02a0 }
            int r7 = r6.f160115b     // Catch:{ all -> 0x02a0 }
            r7 = r7 | 4096(0x1000, float:5.74E-42)
            r6.f160115b = r7     // Catch:{ all -> 0x02a0 }
            r6.f160048M = r1     // Catch:{ all -> 0x02a0 }
        L_0x00b8:
            java.lang.String r1 = r11.f118659aE     // Catch:{ all -> 0x02a0 }
            if (r1 == 0) goto L_0x00ca
            r0.copyOnWrite()     // Catch:{ all -> 0x02a0 }
            com.google.protobuf.bv r6 = r0.instance     // Catch:{ all -> 0x02a0 }
            com.google.common.o.be r6 = (com.google.common.p4552o.C59651be) r6     // Catch:{ all -> 0x02a0 }
            int r7 = r6.f159935a     // Catch:{ all -> 0x02a0 }
            r4 = r4 | r7
            r6.f159935a = r4     // Catch:{ all -> 0x02a0 }
            r6.f159952r = r1     // Catch:{ all -> 0x02a0 }
        L_0x00ca:
            monitor-exit(r2)     // Catch:{ all -> 0x02a0 }
            boolean r1 = r13.mo56113h()
            if (r1 == 0) goto L_0x00eb
            java.lang.Object r13 = r13.mo56107c()
            java.lang.Integer r13 = (java.lang.Integer) r13
            int r13 = r13.intValue()
            r0.copyOnWrite()
            com.google.protobuf.bv r1 = r0.instance
            com.google.common.o.be r1 = (com.google.common.p4552o.C59651be) r1
            int r2 = r1.f159935a
            r4 = 67108864(0x4000000, float:1.5046328E-36)
            r2 = r2 | r4
            r1.f159935a = r2
            r1.f159959y = r13
        L_0x00eb:
            com.google.common.o.ba r13 = com.google.common.p4552o.C59647ba.f159921e
            com.google.protobuf.bn r13 = r13.createBuilder()
            com.google.common.o.az r13 = (com.google.common.p4552o.C59602az) r13
            dagger.a r1 = r11.f118683ae
            java.lang.Object r1 = r1.mo27525b()
            r2 = 1
            if (r1 == 0) goto L_0x013e
            android.content.Context r1 = r11.f118637I
            java.lang.String r4 = "android.permission.MANAGE_SOUND_TRIGGER"
            int r1 = androidx.core.content.C1882h.m5137c(r1, r4)
            if (r1 != 0) goto L_0x013e
            dagger.a r1 = r11.f118683ae
            java.lang.Object r1 = r1.mo27525b()
            com.google.as.c.a.a r1 = (com.google.p3728as.p3737c.p3738a.C48034a) r1
            com.google.as.c.a.d r1 = r1.mo53133b()
            if (r1 == 0) goto L_0x013e
            java.lang.String r4 = r1.mo53135b()
            r13.copyOnWrite()
            com.google.protobuf.bv r6 = r13.instance
            com.google.common.o.ba r6 = (com.google.common.p4552o.C59647ba) r6
            r4.getClass()
            int r7 = r6.f159923a
            r7 = r7 | r2
            r6.f159923a = r7
            r6.f159924b = r4
            int r1 = r1.mo53134a()
            r13.copyOnWrite()
            com.google.protobuf.bv r4 = r13.instance
            com.google.common.o.ba r4 = (com.google.common.p4552o.C59647ba) r4
            int r6 = r4.f159923a
            r6 = r6 | 2
            r4.f159923a = r6
            r4.f159925c = r1
            r1 = 1
            goto L_0x013f
        L_0x013e:
            r1 = 0
        L_0x013f:
            com.google.android.voiceinteraction.a.g r4 = r11.mo49430l()
            if (r4 == 0) goto L_0x0157
            int r1 = r4.f118742e
            r13.copyOnWrite()
            com.google.protobuf.bv r4 = r13.instance
            com.google.common.o.ba r4 = (com.google.common.p4552o.C59647ba) r4
            int r6 = r4.f159923a
            r6 = r6 | 4
            r4.f159923a = r6
            r4.f159926d = r1
            goto L_0x0159
        L_0x0157:
            if (r1 == 0) goto L_0x0170
        L_0x0159:
            r0.copyOnWrite()
            com.google.protobuf.bv r1 = r0.instance
            com.google.common.o.be r1 = (com.google.common.p4552o.C59651be) r1
            com.google.protobuf.bv r13 = r13.build()
            com.google.common.o.ba r13 = (com.google.common.p4552o.C59647ba) r13
            r13.getClass()
            r1.f159951q = r13
            int r13 = r1.f159935a
            r13 = r13 | r3
            r1.f159935a = r13
        L_0x0170:
            android.os.PowerManager r13 = r11.mo49427i()
            boolean r13 = r13.isPowerSaveMode()
            r0.copyOnWrite()
            com.google.protobuf.bv r1 = r0.instance
            com.google.common.o.be r1 = (com.google.common.p4552o.C59651be) r1
            int r3 = r1.f159935a
            r4 = 8388608(0x800000, float:1.17549435E-38)
            r3 = r3 | r4
            r1.f159935a = r3
            r1.f159956v = r13
            long r3 = r11.mo49425g()
            r6 = 0
            int r13 = (r3 > r6 ? 1 : (r3 == r6 ? 0 : -1))
            if (r13 > 0) goto L_0x0195
            com.google.common.base.b r13 = com.google.common.base.C58836b.f156633a
            goto L_0x01d6
        L_0x0195:
            com.google.android.libraries.f.a r13 = r11.f118652X
            long r8 = r13.mo26871c()
            long r8 = r8 - r3
            com.google.android.apps.gsa.shared.util.v.g r13 = r11.mo49429k()
            com.google.android.apps.gsa.shared.m.f r1 = com.google.android.apps.gsa.shared.p7066m.C90082eg.f249956bS
            long r3 = r13.mo85399d(r1)
            int r13 = (r8 > r3 ? 1 : (r8 == r3 ? 0 : -1))
            if (r13 <= 0) goto L_0x01ad
            com.google.common.base.b r13 = com.google.common.base.C58836b.f156633a
            goto L_0x01d6
        L_0x01ad:
            int r13 = (r8 > r6 ? 1 : (r8 == r6 ? 0 : -1))
            if (r13 > 0) goto L_0x01ce
            com.google.common.f.e r13 = f118622a
            com.google.common.f.x r13 = r13.mo56224b()
            com.google.common.f.aa r1 = com.google.common.p4526f.p4527a.C58975e.f156826a
            java.lang.String r3 = "GsaVoiceInteractionSrv"
            r13.mo56378ag(r1, r3)
            com.google.common.f.c r13 = (com.google.common.p4526f.C59052c) r13
            r1 = 54509(0xd4ed, float:7.6383E-41)
            com.google.common.f.x r13 = r13.mo56372aa(r1)
            com.google.common.f.c r13 = (com.google.common.p4526f.C59052c) r13
            java.lang.String r1 = "Time since most recent near-miss is negative?! Propagating to server logs: %d ms."
            r13.mo56388r(r1, r8)
        L_0x01ce:
            java.lang.Long r13 = java.lang.Long.valueOf(r8)
            com.google.common.base.ax r13 = com.google.common.base.C58833ax.m90834k(r13)
        L_0x01d6:
            r0.copyOnWrite()
            com.google.protobuf.bv r1 = r0.instance
            com.google.common.o.be r1 = (com.google.common.p4552o.C59651be) r1
            int r3 = r1.f159935a
            r3 = r3 | 128(0x80, float:1.794E-43)
            r1.f159935a = r3
            boolean r3 = r13.mo56113h()
            r1.f159943i = r3
            r3 = -1
            java.lang.Long r1 = java.lang.Long.valueOf(r3)
            java.lang.Object r13 = r13.mo56109e(r1)
            java.lang.Long r13 = (java.lang.Long) r13
            long r3 = r13.longValue()
            r0.copyOnWrite()
            com.google.protobuf.bv r13 = r0.instance
            com.google.common.o.be r13 = (com.google.common.p4552o.C59651be) r13
            int r1 = r13.f159935a
            r1 = r1 | 512(0x200, float:7.175E-43)
            r13.f159935a = r1
            r13.f159944j = r3
            android.content.SharedPreferences r13 = r11.mo49426h()
            java.lang.String r1 = "LatestRejectionDeviceType"
            int r13 = r13.getInt(r1, r5)
            r0.copyOnWrite()
            com.google.protobuf.bv r1 = r0.instance
            com.google.common.o.be r1 = (com.google.common.p4552o.C59651be) r1
            int r3 = r1.f159935a
            r4 = 268435456(0x10000000, float:2.5243549E-29)
            r3 = r3 | r4
            r1.f159935a = r3
            r1.f159931A = r13
            r14.copyOnWrite()
            com.google.protobuf.bv r13 = r14.instance
            com.google.common.o.cb r13 = (com.google.common.p4552o.C59687cb) r13
            com.google.protobuf.bv r0 = r0.build()
            com.google.common.o.be r0 = (com.google.common.p4552o.C59651be) r0
            com.google.common.o.cb r1 = com.google.common.p4552o.C59687cb.f160034bf
            r0.getClass()
            r13.f160100al = r0
            int r0 = r13.f160122c
            r0 = r0 | 16
            r13.f160122c = r0
            com.google.android.apps.gsa.shared.util.v.g r13 = r11.mo49429k()
            com.google.android.apps.gsa.shared.m.d r0 = com.google.android.apps.gsa.shared.p7066m.C90086ek.f250427ct
            boolean r13 = r13.mo85405j(r0)
            if (r13 == 0) goto L_0x0281
            com.google.common.o.ai r13 = com.google.common.p4552o.C59581ai.f158792c
            com.google.protobuf.bn r13 = r13.createBuilder()
            com.google.common.o.ah r13 = (com.google.common.p4552o.C59580ah) r13
            g.a.a r0 = r11.f118689ak
            java.lang.Object r0 = r0.mo17428b()
            com.google.android.libraries.assistant.auto.jumpboost.a.j.a r0 = (com.google.android.libraries.assistant.auto.jumpboost.p649a.p663j.C11445a) r0
            boolean r0 = r0.f37229a
            r13.copyOnWrite()
            com.google.protobuf.bv r1 = r13.instance
            com.google.common.o.ai r1 = (com.google.common.p4552o.C59581ai) r1
            int r3 = r1.f158794a
            r2 = r2 | r3
            r1.f158794a = r2
            r1.f158795b = r0
            com.google.protobuf.bv r13 = r13.build()
            com.google.common.o.ai r13 = (com.google.common.p4552o.C59581ai) r13
            r14.copyOnWrite()
            com.google.protobuf.bv r0 = r14.instance
            com.google.common.o.cb r0 = (com.google.common.p4552o.C59687cb) r0
            r13.getClass()
            r0.f160110av = r13
            int r13 = r0.f160122c
            r1 = 65536(0x10000, float:9.18355E-41)
            r13 = r13 | r1
            r0.f160122c = r13
        L_0x0281:
            com.google.android.apps.gsa.shared.logger.b.f r13 = new com.google.android.apps.gsa.shared.logger.b.f
            r13.<init>()
            r13.f246201a = r12
            com.google.protobuf.bv r12 = r14.build()
            com.google.common.o.cb r12 = (com.google.common.p4552o.C59687cb) r12
            r13.f246203c = r12
            com.google.android.apps.gsa.shared.logger.b.g r12 = r13.mo83699a()
            dagger.a r13 = r11.f118650V
            java.lang.Object r13 = r13.mo27525b()
            com.google.android.apps.gsa.shared.logger.b.i r13 = (com.google.android.apps.gsa.shared.logger.p7051b.C89859i) r13
            r13.mo74236a(r12)
            return
        L_0x02a0:
            r12 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x02a0 }
            throw r12
        L_0x02a3:
            r12 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x02a3 }
            throw r12
        L_0x02a6:
            com.google.common.f.e r13 = f118622a
            com.google.common.f.x r13 = r13.mo56225c()
            com.google.common.f.aa r14 = com.google.common.p4526f.p4527a.C58975e.f156826a
            java.lang.String r0 = "GsaVoiceInteractionSrv"
            r13.mo56378ag(r14, r0)
            com.google.common.f.c r13 = (com.google.common.p4526f.C59052c) r13
            r14 = 54602(0xd54a, float:7.6514E-41)
            com.google.common.f.x r13 = r13.mo56372aa(r14)
            com.google.common.f.c r13 = (com.google.common.p4526f.C59052c) r13
            java.lang.String r14 = "Cannot log AppFlows with null AppFlowLogger event=%d"
            int r12 = r12.f245884YW
            r13.mo56387q(r14, r12)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.voiceinteraction.GsaVoiceInteractionService.mo49391F(com.google.android.apps.gsa.shared.logger.b.ae, com.google.common.base.ax, com.google.common.o.aj):void");
    }

    /* renamed from: G */
    public final void mo49392G() {
        C118719g gVar;
        synchronized (this.f118726v) {
            HotwordInformation hotwordInformation = this.f118664aJ;
            if (!(hotwordInformation == null || (gVar = this.f118632D) == null || !hotwordInformation.f395885f)) {
                gVar.mo103913e();
            }
        }
    }

    /* renamed from: H */
    public final void mo49393H() {
        if (((C89606ad) ((C58847bk) this.f118639K).f156646a).mo83479y()) {
            ((C89606ad) ((C58847bk) this.f118639K).f156646a).mo83459e();
        }
    }

    /* renamed from: I */
    public final void mo49394I(SpeakerIdModel speakerIdModel) {
        ((C89606ad) ((C58847bk) this.f118639K).f156646a).mo83468n(speakerIdModel);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: J */
    public final void mo49395J() {
        String message;
        if (mo49415ad() && this.f118662aH) {
            try {
                synchronized (this.f118726v) {
                    C118719g gVar = this.f118632D;
                    if (gVar != null) {
                        gVar.mo103916h();
                    } else {
                        throw new IllegalStateException("mHotwordDetector is null");
                    }
                }
            } catch (IllegalArgumentException | IllegalStateException e) {
                C59104x c = f118622a.mo56225c();
                c.mo56378ag(C58975e.f156826a, "GsaVoiceInteractionSrv");
                ((C59052c) ((C59052c) ((C59052c) c).mo56382g(e)).mo56372aa(54615)).mo56386p("Failed to perform next action.");
                if ((e instanceof IllegalArgumentException) && (message = e.getMessage()) != null) {
                    if (message.contains("Invalid speaker model provided")) {
                        this.f118713i = true;
                    }
                    if (message.contains("Error parsing hotword data buffer")) {
                        return;
                    }
                }
                mo49433o();
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: K */
    public final void mo49396K() {
        if (mo49415ad() && this.f118662aH) {
            synchronized (this.f118726v) {
                C118719g gVar = this.f118632D;
                if (gVar != null) {
                    gVar.mo103917i();
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: L */
    public final void mo49397L() {
        synchronized (this.f118726v) {
            if (mo49415ad() && !this.f118705ba && this.f118632D != null) {
                mo49429k();
                if (new C84516aa(this).mo78230d()) {
                    this.f118632D.f331147j.mo103926e();
                } else {
                    this.f118632D.f331147j.mo103925d();
                }
                BroadcastReceiver broadcastReceiver = this.f118672aR;
                IntentFilter intentFilter = new IntentFilter();
                intentFilter.addAction("android.intent.action.SCREEN_ON");
                intentFilter.addAction("android.intent.action.SCREEN_OFF");
                intentFilter.addAction("com.google.android.apps.now.account_update_broadcast");
                intentFilter.addAction("com.google.android.googlequicksearchbox.HOTWORD_STATUS_CHANGED");
                registerReceiver(broadcastReceiver, intentFilter, (String) null, this.f118660aF);
                this.f118705ba = true;
            }
        }
    }

    /* renamed from: M */
    public final void mo49398M() {
        if (this.f118660aF.hasMessages(8)) {
            this.f118660aF.removeMessages(8);
            ((C38780c) this.f118651W.mo27525b()).mo41619a(C38828b.HOTWORD_LIBRARY_ANDROID).mo19974a(C37188a.f98365i.mo40804b());
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: N */
    public final void mo49399N(String str, Runnable runnable) {
        if (Thread.currentThread() == Looper.getMainLooper().getThread()) {
            runnable.run();
        } else {
            this.f118633E.mo85151p(new C90892az(str, runnable));
        }
    }

    /* renamed from: O */
    public final void mo49400O() {
        C87739bu buVar;
        ArrayList arrayList = this.f118694ap;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            C73858p pVar = (C73858p) arrayList.get(i);
            if (pVar.f195165a) {
                buVar = C87739bu.APP_MOVED_TO_FOREGROUND;
            } else {
                buVar = C87739bu.APP_MOVED_TO_BACKGROUND;
            }
            C88489j jVar = new C88489j(buVar);
            C62940bt btVar = C87831fe.f237644a;
            C87832ff ffVar = (C87832ff) C87833fg.f237645c.createBuilder();
            String str = pVar.f195166b;
            ffVar.copyOnWrite();
            C87833fg fgVar = (C87833fg) ffVar.instance;
            str.getClass();
            fgVar.f237647a |= 1;
            fgVar.f237648b = str;
            jVar.mo82014b(btVar, (C87833fg) ffVar.build());
            this.f118730z.mo81937i(jVar.mo82013a());
        }
        this.f118694ap.clear();
    }

    /* renamed from: P */
    public final void mo49401P(C36771a aVar) {
        C36774d dVar;
        synchronized (this.f118726v) {
            if (this.f118715k.mo56113h()) {
                C59104x b = f118622a.mo56224b();
                b.mo56378ag(C58975e.f156826a, "GsaVoiceInteractionSrv");
                ((C59052c) ((C59052c) b).mo56372aa(54618)).mo56389s("suggesting Android feedback; hotwordFailureReason=%s", aVar);
                C89190d dVar2 = (C89190d) this.f118715k.mo56107c();
                C36771a aVar2 = C36771a.NO_FAILURE;
                int ordinal = aVar.ordinal();
                if (ordinal == 1) {
                    C36773c a = C36772b.m65451a("Hotword DSP Start Recognition Failure");
                    a.mo40391a(C58485gu.m89847o(3166274L, 3207142L));
                    dVar = (C36774d) a.build();
                } else if (ordinal == 2) {
                    C36773c a2 = C36772b.m65451a("Hotword DSP Detector Error");
                    a2.mo40391a(C58485gu.m89847o(3166274L, 3208772L));
                    dVar = (C36774d) a2.build();
                } else if (ordinal == 3) {
                    C36773c a3 = C36772b.m65451a("Hotword DSP Hardware Unavailable When Needed");
                    a3.mo40391a(C58485gu.m89847o(3166274L, 3207144L));
                    dVar = (C36774d) a3.build();
                } else {
                    throw new IllegalArgumentException("invalid failure reason: ".concat(String.valueOf(String.valueOf(aVar))));
                }
                if (dVar2.f241809c.mo56113h()) {
                    int a4 = C36776f.m65453a(dVar.f95835c);
                    if (a4 == 0 || a4 != 2) {
                        throw new IllegalArgumentException("Implementation should only be used with FEEDBACK_HOTWORD type");
                    }
                    C47633f i = C47633f.m84733g(C47633f.m84733g(((C89192f) dVar2.f241809c.mo56107c()).mo83151a()).mo51515h(new C89187a(dVar2), dVar2.f241811e)).mo51516i(new C89188b(dVar2), dVar2.f241811e);
                    C89189c cVar = new C89189c();
                    C60856cj.m92911t(i.f164926b, C47810es.m84974n(cVar), dVar2.f241811e);
                }
            }
        }
    }

    /* renamed from: Q */
    public final void mo49402Q() {
        synchronized (this.f118726v) {
            this.f118727w = false;
        }
    }

    /* renamed from: R */
    public final void mo49403R(Intent intent) {
        C58976aa aaVar = C58975e.f156826a;
        m80886ao(intent);
        f118625b = true;
        this.f118635G.mo28208h("reset isMorrisStarted", 5000, C45394b.f118763a);
    }

    /* renamed from: S */
    public final void mo49404S() {
        C118719g gVar;
        synchronized (this.f118726v) {
            HotwordInformation hotwordInformation = this.f118664aJ;
            if (!(hotwordInformation == null || hotwordInformation.f395878J || (gVar = this.f118632D) == null)) {
                gVar.mo103915g();
            }
        }
    }

    /* renamed from: T */
    public final void mo49405T() {
        C58976aa aaVar = C58975e.f156826a;
        synchronized (this.f118725u) {
            if (this.f118661aG != null) {
                this.f118661aG = null;
                unbindService(this.f118671aQ);
            }
        }
    }

    /*  JADX ERROR: IndexOutOfBoundsException in pass: RegionMakerVisitor
        java.lang.IndexOutOfBoundsException: Index 0 out of bounds for length 0
        	at java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
        	at java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
        	at java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:248)
        	at java.base/java.util.Objects.checkIndex(Objects.java:372)
        	at java.base/java.util.ArrayList.get(ArrayList.java:458)
        	at jadx.core.dex.nodes.InsnNode.getArg(InsnNode.java:101)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:611)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:598)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:598)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    /* renamed from: U */
    final void mo49406U() {
        /*
            r15 = this;
            com.google.common.f.aa r0 = com.google.common.p4526f.p4527a.C58975e.f156826a
            java.lang.Object r0 = r15.f118726v
            monitor-enter(r0)
            com.google.android.hotword.service.HotwordInformation r1 = r15.f118664aJ     // Catch:{ all -> 0x00fa }
            if (r1 == 0) goto L_0x00f8
            int r1 = r15.f118703ay     // Catch:{ all -> 0x00fa }
            r2 = 2
            if (r1 == r2) goto L_0x0010
            goto L_0x00f8
        L_0x0010:
            java.lang.Object r1 = r15.f118701aw     // Catch:{ all -> 0x00fa }
            monitor-enter(r1)     // Catch:{ all -> 0x00fa }
            android.content.Context r3 = r15.f118637I     // Catch:{ all -> 0x00f5 }
            boolean r3 = com.google.android.voiceinteraction.p3559a.C45370f.m80968d(r3)     // Catch:{ all -> 0x00f5 }
            if (r3 == 0) goto L_0x00c9
            java.lang.Object r3 = r15.f118701aw     // Catch:{ all -> 0x00f5 }
            monitor-enter(r3)     // Catch:{ all -> 0x00f5 }
            java.lang.String r10 = r15.f118658aD     // Catch:{ all -> 0x00c6 }
            java.lang.String r11 = r15.f118659aE     // Catch:{ all -> 0x00c6 }
            java.lang.String r12 = r15.mo49432n(r10, r11)     // Catch:{ all -> 0x00c6 }
            int r4 = com.google.android.apps.gsa.shared.speech.hotword.C90586c.m147807e(r11)     // Catch:{ all -> 0x00c6 }
            int r13 = r4 + -1
            monitor-exit(r3)     // Catch:{ all -> 0x00c6 }
            com.google.common.f.e r3 = f118622a     // Catch:{ all -> 0x00f5 }
            com.google.common.f.x r3 = r3.mo56224b()     // Catch:{ all -> 0x00f5 }
            com.google.common.f.aa r4 = com.google.common.p4526f.p4527a.C58975e.f156826a     // Catch:{ all -> 0x00f5 }
            java.lang.String r5 = "GsaVoiceInteractionSrv"
            r3.mo56378ag(r4, r5)     // Catch:{ all -> 0x00f5 }
            com.google.common.f.c r3 = (com.google.common.p4526f.C59052c) r3     // Catch:{ all -> 0x00f5 }
            r4 = 54629(0xd565, float:7.6552E-41)
            com.google.common.f.x r3 = r3.mo56372aa(r4)     // Catch:{ all -> 0x00f5 }
            r4 = r3
            com.google.common.f.c r4 = (com.google.common.p4526f.C59052c) r4     // Catch:{ all -> 0x00f5 }
            java.lang.Integer r3 = java.lang.Integer.valueOf(r13)     // Catch:{ all -> 0x00f5 }
            java.lang.String r5 = "unenroll keyphraseSoundModel via KeyphraseModelManager: locale=%s/%s, hotwordPhrase=%s/%d"
            r6 = r10
            r7 = r12
            r8 = r11
            r9 = r3
            r4.mo56360M(r5, r6, r7, r8, r9)     // Catch:{ all -> 0x00f5 }
            java.util.Locale r4 = java.util.Locale.forLanguageTag(r12)     // Catch:{ e -> 0x0099 }
            r4.toLanguageTag()     // Catch:{ e -> 0x0099 }
            com.google.android.voiceinteraction.p3559a.C45370f.m80966b(r15)     // Catch:{ e -> 0x0099 }
            com.google.android.apps.gsa.shared.s.a.a r5 = com.google.android.apps.gsa.shared.util.debug.p7166b.C91018d.f254254a     // Catch:{ e -> 0x0099 }
            java.lang.Object r5 = com.google.android.voiceinteraction.p3559a.C45370f.m80965a(r15)     // Catch:{ NoSuchMethodException -> 0x0091, IllegalAccessException -> 0x008f, InvocationTargetException -> 0x008d }
            java.lang.Class[] r6 = new java.lang.Class[r2]     // Catch:{ NoSuchMethodException -> 0x0091, IllegalAccessException -> 0x008f, InvocationTargetException -> 0x008d }
            java.lang.Class r7 = java.lang.Integer.TYPE     // Catch:{ NoSuchMethodException -> 0x0091, IllegalAccessException -> 0x008f, InvocationTargetException -> 0x008d }
            r8 = 0
            r6[r8] = r7     // Catch:{ NoSuchMethodException -> 0x0091, IllegalAccessException -> 0x008f, InvocationTargetException -> 0x008d }
            java.lang.Class<java.util.Locale> r7 = java.util.Locale.class
            r9 = 1
            r6[r9] = r7     // Catch:{ NoSuchMethodException -> 0x0091, IllegalAccessException -> 0x008f, InvocationTargetException -> 0x008d }
            java.lang.Class r7 = r5.getClass()     // Catch:{ NoSuchMethodException -> 0x0091, IllegalAccessException -> 0x008f, InvocationTargetException -> 0x008d }
            java.lang.String r14 = "deleteKeyphraseSoundModel"
            java.lang.reflect.Method r6 = r7.getMethod(r14, r6)     // Catch:{ NoSuchMethodException -> 0x0091, IllegalAccessException -> 0x008f, InvocationTargetException -> 0x008d }
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch:{ NoSuchMethodException -> 0x0091, IllegalAccessException -> 0x008f, InvocationTargetException -> 0x008d }
            r2[r8] = r3     // Catch:{ NoSuchMethodException -> 0x0091, IllegalAccessException -> 0x008f, InvocationTargetException -> 0x008d }
            r2[r9] = r4     // Catch:{ NoSuchMethodException -> 0x0091, IllegalAccessException -> 0x008f, InvocationTargetException -> 0x008d }
            r6.invoke(r5, r2)     // Catch:{ NoSuchMethodException -> 0x0091, IllegalAccessException -> 0x008f, InvocationTargetException -> 0x008d }
            r15.m80885an()     // Catch:{ e -> 0x0099 }
            com.google.android.apps.gsa.shared.logger.b.ae r2 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.DSP_ENROLLMENT_VIA_DOWNLOADED_MODEL     // Catch:{ e -> 0x0099 }
            r15.mo49387B(r2)     // Catch:{ e -> 0x0099 }
            goto L_0x00f2
        L_0x008b:
            r2 = move-exception
            goto L_0x0098
        L_0x008d:
            r2 = move-exception
            goto L_0x0092
        L_0x008f:
            r2 = move-exception
            goto L_0x0092
        L_0x0091:
            r2 = move-exception
        L_0x0092:
            com.google.android.voiceinteraction.a.e r3 = new com.google.android.voiceinteraction.a.e     // Catch:{ all -> 0x008b }
            r3.<init>(r2)     // Catch:{ all -> 0x008b }
            throw r3     // Catch:{ all -> 0x008b }
        L_0x0098:
            throw r2     // Catch:{ e -> 0x0099 }
        L_0x0099:
            r2 = move-exception
            com.google.common.f.e r3 = f118622a     // Catch:{ all -> 0x00f5 }
            com.google.common.f.x r3 = r3.mo56225c()     // Catch:{ all -> 0x00f5 }
            com.google.common.f.aa r4 = com.google.common.p4526f.p4527a.C58975e.f156826a     // Catch:{ all -> 0x00f5 }
            java.lang.String r5 = "GsaVoiceInteractionSrv"
            r3.mo56378ag(r4, r5)     // Catch:{ all -> 0x00f5 }
            com.google.common.f.c r3 = (com.google.common.p4526f.C59052c) r3     // Catch:{ all -> 0x00f5 }
            com.google.common.f.x r2 = r3.mo56382g(r2)     // Catch:{ all -> 0x00f5 }
            com.google.common.f.c r2 = (com.google.common.p4526f.C59052c) r2     // Catch:{ all -> 0x00f5 }
            r3 = 54630(0xd566, float:7.6553E-41)
            com.google.common.f.x r2 = r2.mo56372aa(r3)     // Catch:{ all -> 0x00f5 }
            r4 = r2
            com.google.common.f.c r4 = (com.google.common.p4526f.C59052c) r4     // Catch:{ all -> 0x00f5 }
            java.lang.String r5 = "failed to deleteKeyphraseSoundModel; locale=%s/%s, hotwordPhrase=%s/%d"
            java.lang.Integer r9 = java.lang.Integer.valueOf(r13)     // Catch:{ all -> 0x00f5 }
            r6 = r10
            r7 = r12
            r8 = r11
            r4.mo56360M(r5, r6, r7, r8, r9)     // Catch:{ all -> 0x00f5 }
            goto L_0x00f2
        L_0x00c6:
            r2 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x00c6 }
            throw r2     // Catch:{ all -> 0x00f5 }
        L_0x00c9:
            java.lang.Object r2 = r15.f118701aw     // Catch:{ Exception -> 0x00dc }
            monitor-enter(r2)     // Catch:{ Exception -> 0x00dc }
            com.google.android.voiceinteraction.as r3 = r15.f118670aP     // Catch:{ all -> 0x00d9 }
            java.lang.String r4 = r15.f118658aD     // Catch:{ all -> 0x00d9 }
            android.content.Intent r3 = r3.mo49495f(r4)     // Catch:{ all -> 0x00d9 }
            r15.mo49451w(r3)     // Catch:{ all -> 0x00d9 }
            monitor-exit(r2)     // Catch:{ all -> 0x00d9 }
            goto L_0x00f2
        L_0x00d9:
            r3 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x00d9 }
            throw r3     // Catch:{ Exception -> 0x00dc }
        L_0x00dc:
            r2 = move-exception
            com.google.common.f.e r3 = f118622a     // Catch:{ all -> 0x00f5 }
            com.google.common.f.x r3 = r3.mo56225c()     // Catch:{ all -> 0x00f5 }
            com.google.common.f.aa r4 = com.google.common.p4526f.p4527a.C58975e.f156826a     // Catch:{ all -> 0x00f5 }
            java.lang.String r5 = "GsaVoiceInteractionSrv"
            r3.mo56378ag(r4, r5)     // Catch:{ all -> 0x00f5 }
            java.lang.String r4 = "Exception when unenrolling"
            r5 = 54563(0xd523, float:7.6459E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r3).mo56382g(r2)).mo56372aa(r5)).mo56386p(r4)     // Catch:{ all -> 0x00f5 }
        L_0x00f2:
            monitor-exit(r1)     // Catch:{ all -> 0x00f5 }
            monitor-exit(r0)     // Catch:{ all -> 0x00fa }
            return
        L_0x00f5:
            r2 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x00f5 }
            throw r2     // Catch:{ all -> 0x00fa }
        L_0x00f8:
            monitor-exit(r0)     // Catch:{ all -> 0x00fa }
            return
        L_0x00fa:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x00fa }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.voiceinteraction.GsaVoiceInteractionService.mo49406U():void");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: V */
    public final void mo49407V() {
        if (this.f118662aH && this.f118705ba && mo49415ad()) {
            try {
                unregisterReceiver(this.f118672aR);
                this.f118705ba = false;
            } catch (IllegalArgumentException unused) {
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: W */
    public final void mo49408W(HotwordInformation hotwordInformation, boolean z, boolean z2, boolean z3) {
        byte[] bArr;
        C58976aa aaVar = C58975e.f156826a;
        synchronized (this.f118726v) {
            int i = 0;
            if (this.f118711g && z) {
                this.f118711g = false;
            }
            mo49453y(false);
            synchronized (this.f118726v) {
                C118719g gVar = this.f118632D;
                if (gVar != null) {
                    boolean z4 = hotwordInformation.f395889j;
                    C18375l lVar = gVar.f331139b;
                    if (lVar != null) {
                        lVar.mo23793e(z4);
                    }
                }
            }
            String str = hotwordInformation.f395886g;
            if (str != null) {
                C90476a aVar = C91018d.f254254a;
                if (hotwordInformation.f395897r) {
                    Uri parse = Uri.parse(str);
                    try {
                        if (parse.getScheme() != null && ((C42813k) this.f118679aa.mo27525b()).mo45894h(parse)) {
                            bArr = C92513g.m152178g((C42813k) this.f118679aa.mo27525b(), Uri.parse(str));
                        }
                    } catch (IOException e) {
                        C59104x c = f118622a.mo56225c();
                        c.mo56378ag(C58975e.f156826a, "GsaVoiceInteractionSrv");
                        ((C59052c) ((C59052c) ((C59052c) c).mo56382g(e)).mo56372aa(54639)).mo56386p("modelLocation was not a valid Mobstore URI! Will try using this as an asset filepath, but hotword model may break. Did MDD delete this model?");
                    }
                    bArr = C92513g.m152179h(this, str);
                } else {
                    bArr = C92513g.m152177f(this, str, hotwordInformation.f395888i, C92513g.m152172a(hotwordInformation.f395891l));
                }
                C59104x b = f118622a.mo56224b();
                b.mo56378ag(C58975e.f156826a, "GsaVoiceInteractionSrv");
                ((C59052c) ((C59052c) b).mo56372aa(54638)).mo56389s("hotwordModel is null :  %b", Boolean.valueOf(bArr == null));
                HotwordInformation hotwordInformation2 = this.f118664aJ;
                if (hotwordInformation2 != null) {
                    hotwordInformation2.f395875G = bArr;
                }
                hotwordInformation.f395875G = bArr;
            } else {
                C59104x c2 = f118622a.mo56225c();
                c2.mo56378ag(C58975e.f156826a, "GsaVoiceInteractionSrv");
                ((C59052c) ((C59052c) c2).mo56372aa(54634)).mo56359L("modelLocation is null: %b isAlwaysOnEnabled is false: %b isFromAnyScreenEnabled is false: %b", true, Boolean.valueOf(!hotwordInformation.f395883d), Boolean.valueOf(!hotwordInformation.f395885f));
            }
            if (this.f118712h && hotwordInformation.f395883d) {
                this.f118712h = false;
                C59104x d = f118622a.mo56226d();
                d.mo56378ag(C58975e.f156826a, "GsaVoiceInteractionSrv");
                ((C59052c) ((C59052c) d).mo56372aa(54636)).mo56386p("AlwaysRunDspHotword and AlwaysOnEnabled were true");
            }
            if (!hotwordInformation.f395883d && this.f118660aF.hasMessages(14)) {
                this.f118660aF.removeMessages(14);
            }
            boolean z5 = hotwordInformation.f395892m && this.f118703ay == 1;
            boolean z6 = z && m80888aq();
            if (z5 || z6) {
                mo49450v();
            }
            synchronized (this.f118726v) {
                if (this.f118632D != null) {
                    C90476a aVar2 = C91018d.f254254a;
                    this.f118632D.mo103920l(this.f118664aJ);
                } else if (this.f118704az && this.f118702ax != null && z3) {
                    SpeakerIdModel speakerIdModel = hotwordInformation.f395887h;
                    byte[] bArr2 = hotwordInformation.f395875G;
                    boolean z7 = hotwordInformation.f395883d && speakerIdModel != null;
                    SharedMemory sharedMemory = null;
                    if (z2 && bArr2 != null) {
                        sharedMemory = C118726n.m197094b(bArr2, speakerIdModel);
                        i = bArr2.length;
                        this.f118657aC = hotwordInformation.f395870B;
                    }
                    try {
                        this.f118702ax.updateState(C118726n.m197093a(i, speakerIdModel, z7), sharedMemory);
                    } catch (Exception e2) {
                        C59104x c3 = f118622a.mo56225c();
                        c3.mo56378ag(C58975e.f156826a, "GsaVoiceInteractionSrv");
                        ((C59052c) ((C59052c) ((C59052c) c3).mo56382g(e2)).mo56372aa(54635)).mo56386p("Error updating trusted process state");
                    }
                }
            }
            if (!hotwordInformation.f395882c && hotwordInformation.f395884e) {
                if (!hotwordInformation.f395885f) {
                    if (!hotwordInformation.f395893n) {
                        mo49407V();
                        if (this.f118660aF.hasMessages(12)) {
                            this.f118660aF.removeMessages(12);
                        }
                        mo49395J();
                    }
                }
                mo49397L();
                if (!this.f118660aF.hasMessages(12)) {
                    this.f118660aF.sendEmptyMessageDelayed(12, 600000);
                }
                mo49395J();
            } else if (!this.f118712h && !hotwordInformation.f395883d) {
                mo49421aj(true);
            }
        }
        mo49444q();
    }

    /* renamed from: X */
    public final void mo49409X(C58833ax axVar) {
        mo49426h().edit().putLong("LatestRejectionTimestampMs", this.f118652X.mo26871c()).apply();
        if (axVar.mo56113h()) {
            mo49426h().edit().putInt("LatestRejectionDeviceType", ((HotwordResult) axVar.mo56107c()).mo84705v().f181272r).apply();
        }
        m80887ap();
    }

    /* renamed from: Y */
    public final void mo49410Y() {
        double d;
        C89339b a = ((C89341c) this.f118685ag.mo27525b()).mo83283a();
        C90544ag agVar = (C90544ag) this.f118684af.mo27525b();
        C62910ar arVar = a.f242209d;
        if (arVar == null) {
            arVar = C62910ar.f169858c;
        }
        Duration d2 = C62950b.m95473d(arVar);
        C62910ar arVar2 = a.f242207b;
        if (arVar2 == null) {
            arVar2 = C62910ar.f169858c;
        }
        Duration minus = d2.minus(C62950b.m95473d(arVar2));
        C62910ar arVar3 = a.f242210e;
        if (arVar3 == null) {
            arVar3 = C62910ar.f169858c;
        }
        Duration d3 = C62950b.m95473d(arVar3);
        if (minus.isZero()) {
            d = C59203do.f157270a;
        } else {
            double millis = (double) d3.toMillis();
            Double.isNaN(millis);
            double millis2 = (double) minus.toMillis();
            Double.isNaN(millis2);
            d = (millis * 100.0d) / millis2;
        }
        ((C59052c) ((C59052c) C90544ag.f253128a.mo56224b()).mo56372aa(11111)).mo56389s("Interactor uptime: setting uptime percentage %f", Double.valueOf(d));
        C118826c.m197213c(agVar.f253129b.mo46039a(new C90558k(d), C60826bg.f164896a));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: Z */
    public final void mo49411Z(String str) {
        synchronized (this.f118701aw) {
            if (!str.equals(this.f118658aD)) {
                String str2 = this.f118658aD;
                throw new UnsupportedOperationException("Please call initializeForLocale method before calling this method.Current initialized locale : " + str2 + " new locale " + str);
            }
        }
    }

    /* renamed from: a */
    public final void mo21615a(Intent intent) {
        if (mo49429k().mo85405j(C90126fx.f251329gk)) {
            ((C81428d) ((C58847bk) this.f118648T).f156646a).mo75074a().mo4106b(new C45402j(this, intent), C60826bg.f164896a);
        } else {
            mo49403R(intent);
        }
    }

    /* renamed from: aa */
    public final boolean mo49412aa() {
        return ((C89606ad) ((C58847bk) this.f118639K).f156646a).mo83476v();
    }

    /* renamed from: ab */
    public final boolean mo49413ab() {
        boolean z;
        synchronized (this.f118726v) {
            HotwordInformation hotwordInformation = this.f118664aJ;
            z = false;
            if (hotwordInformation != null && C118726n.m197095c(hotwordInformation.f395869A) && hotwordInformation.f395877I) {
                z = true;
            }
        }
        return z;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: ac */
    public final boolean mo49414ac() {
        return C9325m.m23781b(this.f118637I, this.f118638J, mo49429k());
    }

    /* renamed from: ad */
    public final boolean mo49415ad() {
        synchronized (this.f118726v) {
            HotwordInformation hotwordInformation = this.f118664aJ;
            boolean z = false;
            if (hotwordInformation == null) {
                return false;
            }
            if ((hotwordInformation.f395884e || (C118726n.m197095c(hotwordInformation.f395869A) && !this.f118704az)) && !hotwordInformation.f395882c) {
                z = true;
            }
            C58976aa aaVar = C58975e.f156826a;
            return z;
        }
    }

    /* renamed from: ae */
    public final boolean mo49416ae() {
        return ((C81428d) ((C58847bk) this.f118648T).f156646a).mo75077d();
    }

    /*  JADX ERROR: IndexOutOfBoundsException in pass: RegionMakerVisitor
        java.lang.IndexOutOfBoundsException: Index 0 out of bounds for length 0
        	at java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
        	at java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
        	at java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:248)
        	at java.base/java.util.Objects.checkIndex(Objects.java:372)
        	at java.base/java.util.ArrayList.get(ArrayList.java:458)
        	at jadx.core.dex.nodes.InsnNode.getArg(InsnNode.java:101)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:611)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    /* renamed from: af */
    public final boolean mo49417af(java.lang.String r8, java.lang.String r9, boolean r10) {
        /*
            r7 = this;
            java.lang.Object r0 = r7.f118726v
            monitor-enter(r0)
            com.google.android.hotword.service.HotwordInformation r1 = r7.f118664aJ     // Catch:{ all -> 0x0088 }
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L_0x001d
            boolean r4 = r1.f395883d     // Catch:{ all -> 0x0088 }
            boolean r5 = r1.f395869A     // Catch:{ all -> 0x0088 }
            boolean r5 = com.google.android.apps.gsa.voiceinteraction.hotword.C118726n.m197095c(r5)     // Catch:{ all -> 0x0088 }
            boolean r6 = r1.f395873E     // Catch:{ all -> 0x0088 }
            if (r5 == 0) goto L_0x001b
            boolean r1 = r1.f395877I     // Catch:{ all -> 0x0088 }
            if (r1 == 0) goto L_0x001b
            r1 = 1
            goto L_0x0021
        L_0x001b:
            r1 = 0
            goto L_0x0021
        L_0x001d:
            r1 = 0
            r4 = 0
            r5 = 0
            r6 = 0
        L_0x0021:
            monitor-exit(r0)     // Catch:{ all -> 0x0088 }
            if (r1 != 0) goto L_0x004f
            java.lang.Object r0 = r7.f118701aw
            monitor-enter(r0)
            java.lang.String r10 = r7.f118658aD     // Catch:{ all -> 0x004c }
            if (r10 == 0) goto L_0x004a
            boolean r8 = r10.equals(r8)     // Catch:{ all -> 0x004c }
            if (r8 == 0) goto L_0x004a
            java.lang.String r8 = r7.f118659aE     // Catch:{ all -> 0x004c }
            if (r8 == 0) goto L_0x004a
            boolean r8 = r8.equals(r9)     // Catch:{ all -> 0x004c }
            if (r8 == 0) goto L_0x004a
            int r8 = r7.f118703ay     // Catch:{ all -> 0x004c }
            if (r8 == 0) goto L_0x004a
            android.service.voice.AlwaysOnHotwordDetector r8 = r7.f118702ax     // Catch:{ all -> 0x004c }
            if (r8 != 0) goto L_0x0044
            goto L_0x004a
        L_0x0044:
            monitor-exit(r0)     // Catch:{ all -> 0x004c }
            boolean r8 = r7.f118704az
            if (r5 == r8) goto L_0x0081
            return r2
        L_0x004a:
            monitor-exit(r0)     // Catch:{ all -> 0x004c }
            return r2
        L_0x004c:
            r8 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x004c }
            throw r8
        L_0x004f:
            if (r6 != 0) goto L_0x0052
            return r3
        L_0x0052:
            int r0 = r7.f118703ay
            if (r0 != 0) goto L_0x0057
            return r2
        L_0x0057:
            if (r10 != 0) goto L_0x005c
            if (r4 == 0) goto L_0x0068
            r4 = 1
        L_0x005c:
            android.service.voice.AlwaysOnHotwordDetector r10 = r7.f118702ax
            if (r10 == 0) goto L_0x0087
            if (r4 == 0) goto L_0x0068
            boolean r10 = r7.f118704az
            if (r10 == 0) goto L_0x0067
            goto L_0x0068
        L_0x0067:
            return r2
        L_0x0068:
            java.lang.Object r10 = r7.f118701aw
            monitor-enter(r10)
            java.lang.String r0 = r7.f118658aD     // Catch:{ all -> 0x0084 }
            if (r0 == 0) goto L_0x0082
            boolean r8 = r0.equals(r8)     // Catch:{ all -> 0x0084 }
            if (r8 == 0) goto L_0x0082
            java.lang.String r8 = r7.f118659aE     // Catch:{ all -> 0x0084 }
            if (r8 == 0) goto L_0x0082
            boolean r8 = r8.equals(r9)     // Catch:{ all -> 0x0084 }
            if (r8 != 0) goto L_0x0080
            goto L_0x0082
        L_0x0080:
            monitor-exit(r10)     // Catch:{ all -> 0x0084 }
        L_0x0081:
            return r3
        L_0x0082:
            monitor-exit(r10)     // Catch:{ all -> 0x0084 }
            return r2
        L_0x0084:
            r8 = move-exception
            monitor-exit(r10)     // Catch:{ all -> 0x0084 }
            throw r8
        L_0x0087:
            return r2
        L_0x0088:
            r8 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0088 }
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.voiceinteraction.GsaVoiceInteractionService.mo49417af(java.lang.String, java.lang.String, boolean):boolean");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: ag */
    public final boolean mo49418ag(String str, String str2, boolean z) {
        if (!mo49417af(str, str2, z)) {
            return false;
        }
        Message obtainMessage = this.f118660aF.obtainMessage();
        obtainMessage.obj = str + "," + str2;
        obtainMessage.what = 1;
        this.f118660aF.sendMessage(obtainMessage);
        return true;
    }

    /* renamed from: ah */
    public final boolean mo49419ah() {
        return Build.VERSION.SDK_INT >= 30 && !m80888aq();
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0045, code lost:
        r9.f118630B = false;
        r0 = com.google.android.apps.gsa.shared.util.debug.p7166b.C91018d.f254254a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x004f, code lost:
        if (androidx.core.p094f.C1888a.m5149c() == false) goto L_0x006f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0051, code lost:
        r4 = r9.f118726v;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0053, code lost:
        monitor-enter(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:?, code lost:
        r5 = r9.f118664aJ;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0056, code lost:
        if (r5 == null) goto L_0x006a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x005a, code lost:
        if (r5.f395901v == false) goto L_0x006a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0064, code lost:
        if (androidx.core.content.C1882h.m5137c(r9.f118637I, "android.permission.SOUND_TRIGGER_RUN_IN_BATTERY_SAVER") != 0) goto L_0x006a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0066, code lost:
        monitor-exit(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0067, code lost:
        r4 = 17;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x006a, code lost:
        monitor-exit(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x006f, code lost:
        r4 = 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x0070, code lost:
        r5 = r9.f118702ax;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x0072, code lost:
        if (r5 == null) goto L_0x012f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x0074, code lost:
        r9.f118630B = r5.startRecognition(r4);
        r4 = r9.f118710f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x007c, code lost:
        if (r4 != 0) goto L_0x008d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x007e, code lost:
        ((com.google.android.apps.gsa.shared.logger.p7051b.C89859i) r9.f118650V.mo27525b()).mo83702b(com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.DSP_START_HOTWORD_RECOGNITION);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x008d, code lost:
        if (r4 >= 3) goto L_0x009e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x008f, code lost:
        ((com.google.android.apps.gsa.shared.logger.p7051b.C89859i) r9.f118650V.mo27525b()).mo83702b(com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.DSP_START_HOTWORD_RECOGNITION_RETRY);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x009e, code lost:
        ((com.google.android.apps.gsa.shared.logger.p7051b.C89859i) r9.f118650V.mo27525b()).mo83702b(com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.DSP_START_HOTWORD_RECOGNITION_EXHAUSTED_RETRIES);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00b0, code lost:
        r4 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:?, code lost:
        r5 = f118622a.mo56225c();
        r5.mo56378ag(com.google.common.p4526f.p4527a.C58975e.f156826a, "GsaVoiceInteractionSrv");
        ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r5).mo56382g(r4)).mo56372aa(54660)).mo56386p("Error starting recognition");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x00d5, code lost:
        r4 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x00d6, code lost:
        r5 = r4.getMessage();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x00da, code lost:
        if (r5 == null) goto L_0x0107;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x00e4, code lost:
        r4 = f118622a.mo56226d();
        r4.mo56378ag(com.google.common.p4526f.p4527a.C58975e.f156826a, "GsaVoiceInteractionSrv");
        ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r4).mo56372aa(54659)).mo56386p("Start called while DSP was not enrolled");
        mo49390E(com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.DSP_START_HOTWORD_RECOGNITION_NOT_ENROLLED);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x0107, code lost:
        r5 = f118622a.mo56225c();
        r5.mo56378ag(com.google.common.p4526f.p4527a.C58975e.f156826a, "GsaVoiceInteractionSrv");
        ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r5).mo56382g(r4)).mo56372aa(54658)).mo56386p("UnsupportedOperationException");
        mo49390E(com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.DSP_START_HOTWORD_RECOGNITION_UNSUPPORTED_OPERATION);
     */
    /* renamed from: ai */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo49420ai() {
        /*
            r9 = this;
            com.google.common.f.aa r0 = com.google.common.p4526f.p4527a.C58975e.f156826a
            int r0 = r9.f118703ay
            r1 = 0
            r2 = 2
            if (r0 == r2) goto L_0x0009
            goto L_0x001b
        L_0x0009:
            java.lang.Object r0 = r9.f118726v
            monitor-enter(r0)
            boolean r3 = r9.m80889ar()     // Catch:{ all -> 0x01bf }
            if (r3 == 0) goto L_0x0044
            com.google.android.hotword.service.HotwordInformation r3 = r9.f118664aJ     // Catch:{ all -> 0x01bf }
            if (r3 == 0) goto L_0x0044
            boolean r3 = r3.f395902w     // Catch:{ all -> 0x01bf }
            if (r3 == 0) goto L_0x0044
            monitor-exit(r0)     // Catch:{ all -> 0x01bf }
        L_0x001b:
            com.google.common.f.e r0 = f118622a
            com.google.common.f.x r0 = r0.mo56224b()
            com.google.common.f.aa r2 = com.google.common.p4526f.p4527a.C58975e.f156826a
            java.lang.String r3 = "GsaVoiceInteractionSrv"
            r0.mo56378ag(r2, r3)
            com.google.common.f.c r0 = (com.google.common.p4526f.C59052c) r0
            com.google.common.f.ad r2 = com.google.common.p4526f.C58979ad.FULL
            r0.mo56380ai(r2)
            r2 = 54654(0xd57e, float:7.6587E-41)
            com.google.common.f.x r0 = r0.mo56372aa(r2)
            com.google.common.f.c r0 = (com.google.common.p4526f.C59052c) r0
            java.lang.String r2 = "Not calling startRecognition. Availability: %d; DspEnrollmentInProgress: %b"
            int r3 = r9.f118703ay
            boolean r4 = r9.m80889ar()
            r0.mo56396z(r2, r3, r4)
            return r1
        L_0x0044:
            monitor-exit(r0)     // Catch:{ all -> 0x01bf }
            r9.f118630B = r1
            com.google.android.apps.gsa.shared.s.a.a r0 = com.google.android.apps.gsa.shared.util.debug.p7166b.C91018d.f254254a
            r0 = 3
            r3 = 1
            boolean r4 = androidx.core.p094f.C1888a.m5149c()     // Catch:{ UnsupportedOperationException -> 0x00d5, Exception -> 0x00b0 }
            if (r4 == 0) goto L_0x006f
            java.lang.Object r4 = r9.f118726v     // Catch:{ UnsupportedOperationException -> 0x00d5, Exception -> 0x00b0 }
            monitor-enter(r4)     // Catch:{ UnsupportedOperationException -> 0x00d5, Exception -> 0x00b0 }
            com.google.android.hotword.service.HotwordInformation r5 = r9.f118664aJ     // Catch:{ all -> 0x006c }
            if (r5 == 0) goto L_0x006a
            boolean r5 = r5.f395901v     // Catch:{ all -> 0x006c }
            if (r5 == 0) goto L_0x006a
            android.content.Context r5 = r9.f118637I     // Catch:{ all -> 0x006c }
            java.lang.String r6 = "android.permission.SOUND_TRIGGER_RUN_IN_BATTERY_SAVER"
            int r5 = androidx.core.content.C1882h.m5137c(r5, r6)     // Catch:{ all -> 0x006c }
            if (r5 != 0) goto L_0x006a
            monitor-exit(r4)     // Catch:{ all -> 0x006c }
            r4 = 17
            goto L_0x0070
        L_0x006a:
            monitor-exit(r4)     // Catch:{ all -> 0x006c }
            goto L_0x006f
        L_0x006c:
            r5 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x006c }
            throw r5     // Catch:{ UnsupportedOperationException -> 0x00d5, Exception -> 0x00b0 }
        L_0x006f:
            r4 = 1
        L_0x0070:
            android.service.voice.AlwaysOnHotwordDetector r5 = r9.f118702ax     // Catch:{ UnsupportedOperationException -> 0x00d5, Exception -> 0x00b0 }
            if (r5 == 0) goto L_0x012f
            boolean r4 = r5.startRecognition(r4)     // Catch:{ UnsupportedOperationException -> 0x00d5, Exception -> 0x00b0 }
            r9.f118630B = r4     // Catch:{ UnsupportedOperationException -> 0x00d5, Exception -> 0x00b0 }
            int r4 = r9.f118710f     // Catch:{ UnsupportedOperationException -> 0x00d5, Exception -> 0x00b0 }
            if (r4 != 0) goto L_0x008d
            dagger.a r4 = r9.f118650V     // Catch:{ UnsupportedOperationException -> 0x00d5, Exception -> 0x00b0 }
            java.lang.Object r4 = r4.mo27525b()     // Catch:{ UnsupportedOperationException -> 0x00d5, Exception -> 0x00b0 }
            com.google.android.apps.gsa.shared.logger.b.i r4 = (com.google.android.apps.gsa.shared.logger.p7051b.C89859i) r4     // Catch:{ UnsupportedOperationException -> 0x00d5, Exception -> 0x00b0 }
            com.google.android.apps.gsa.shared.logger.b.ae r5 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.DSP_START_HOTWORD_RECOGNITION     // Catch:{ UnsupportedOperationException -> 0x00d5, Exception -> 0x00b0 }
            r4.mo83702b(r5)     // Catch:{ UnsupportedOperationException -> 0x00d5, Exception -> 0x00b0 }
            goto L_0x012f
        L_0x008d:
            if (r4 >= r0) goto L_0x009e
            dagger.a r4 = r9.f118650V     // Catch:{ UnsupportedOperationException -> 0x00d5, Exception -> 0x00b0 }
            java.lang.Object r4 = r4.mo27525b()     // Catch:{ UnsupportedOperationException -> 0x00d5, Exception -> 0x00b0 }
            com.google.android.apps.gsa.shared.logger.b.i r4 = (com.google.android.apps.gsa.shared.logger.p7051b.C89859i) r4     // Catch:{ UnsupportedOperationException -> 0x00d5, Exception -> 0x00b0 }
            com.google.android.apps.gsa.shared.logger.b.ae r5 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.DSP_START_HOTWORD_RECOGNITION_RETRY     // Catch:{ UnsupportedOperationException -> 0x00d5, Exception -> 0x00b0 }
            r4.mo83702b(r5)     // Catch:{ UnsupportedOperationException -> 0x00d5, Exception -> 0x00b0 }
            goto L_0x012f
        L_0x009e:
            dagger.a r4 = r9.f118650V     // Catch:{ UnsupportedOperationException -> 0x00d5, Exception -> 0x00b0 }
            java.lang.Object r4 = r4.mo27525b()     // Catch:{ UnsupportedOperationException -> 0x00d5, Exception -> 0x00b0 }
            com.google.android.apps.gsa.shared.logger.b.i r4 = (com.google.android.apps.gsa.shared.logger.p7051b.C89859i) r4     // Catch:{ UnsupportedOperationException -> 0x00d5, Exception -> 0x00b0 }
            com.google.android.apps.gsa.shared.logger.b.ae r5 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.DSP_START_HOTWORD_RECOGNITION_EXHAUSTED_RETRIES     // Catch:{ UnsupportedOperationException -> 0x00d5, Exception -> 0x00b0 }
            r4.mo83702b(r5)     // Catch:{ UnsupportedOperationException -> 0x00d5, Exception -> 0x00b0 }
            goto L_0x012f
        L_0x00ad:
            r0 = move-exception
            goto L_0x01be
        L_0x00b0:
            r4 = move-exception
            com.google.common.f.e r5 = f118622a     // Catch:{ all -> 0x00ad }
            com.google.common.f.x r5 = r5.mo56225c()     // Catch:{ all -> 0x00ad }
            com.google.common.f.aa r6 = com.google.common.p4526f.p4527a.C58975e.f156826a     // Catch:{ all -> 0x00ad }
            java.lang.String r7 = "GsaVoiceInteractionSrv"
            r5.mo56378ag(r6, r7)     // Catch:{ all -> 0x00ad }
            com.google.common.f.c r5 = (com.google.common.p4526f.C59052c) r5     // Catch:{ all -> 0x00ad }
            com.google.common.f.x r4 = r5.mo56382g(r4)     // Catch:{ all -> 0x00ad }
            com.google.common.f.c r4 = (com.google.common.p4526f.C59052c) r4     // Catch:{ all -> 0x00ad }
            r5 = 54660(0xd584, float:7.6595E-41)
            com.google.common.f.x r4 = r4.mo56372aa(r5)     // Catch:{ all -> 0x00ad }
            com.google.common.f.c r4 = (com.google.common.p4526f.C59052c) r4     // Catch:{ all -> 0x00ad }
            java.lang.String r5 = "Error starting recognition"
            r4.mo56386p(r5)     // Catch:{ all -> 0x00ad }
            goto L_0x012f
        L_0x00d5:
            r4 = move-exception
            java.lang.String r5 = r4.getMessage()     // Catch:{ all -> 0x00ad }
            if (r5 == 0) goto L_0x0107
            java.lang.String r6 = "Recognition for the given keyphrase is not supported"
            boolean r5 = r5.contains(r6)     // Catch:{ all -> 0x00ad }
            if (r5 == 0) goto L_0x0107
            com.google.common.f.e r4 = f118622a     // Catch:{ all -> 0x00ad }
            com.google.common.f.x r4 = r4.mo56226d()     // Catch:{ all -> 0x00ad }
            com.google.common.f.aa r5 = com.google.common.p4526f.p4527a.C58975e.f156826a     // Catch:{ all -> 0x00ad }
            java.lang.String r6 = "GsaVoiceInteractionSrv"
            r4.mo56378ag(r5, r6)     // Catch:{ all -> 0x00ad }
            com.google.common.f.c r4 = (com.google.common.p4526f.C59052c) r4     // Catch:{ all -> 0x00ad }
            r5 = 54659(0xd583, float:7.6594E-41)
            com.google.common.f.x r4 = r4.mo56372aa(r5)     // Catch:{ all -> 0x00ad }
            com.google.common.f.c r4 = (com.google.common.p4526f.C59052c) r4     // Catch:{ all -> 0x00ad }
            java.lang.String r5 = "Start called while DSP was not enrolled"
            r4.mo56386p(r5)     // Catch:{ all -> 0x00ad }
            com.google.android.apps.gsa.shared.logger.b.ae r4 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.DSP_START_HOTWORD_RECOGNITION_NOT_ENROLLED     // Catch:{ all -> 0x00ad }
            r9.mo49390E(r4)     // Catch:{ all -> 0x00ad }
            goto L_0x012f
        L_0x0107:
            com.google.common.f.e r5 = f118622a     // Catch:{ all -> 0x00ad }
            com.google.common.f.x r5 = r5.mo56225c()     // Catch:{ all -> 0x00ad }
            com.google.common.f.aa r6 = com.google.common.p4526f.p4527a.C58975e.f156826a     // Catch:{ all -> 0x00ad }
            java.lang.String r7 = "GsaVoiceInteractionSrv"
            r5.mo56378ag(r6, r7)     // Catch:{ all -> 0x00ad }
            com.google.common.f.c r5 = (com.google.common.p4526f.C59052c) r5     // Catch:{ all -> 0x00ad }
            com.google.common.f.x r4 = r5.mo56382g(r4)     // Catch:{ all -> 0x00ad }
            com.google.common.f.c r4 = (com.google.common.p4526f.C59052c) r4     // Catch:{ all -> 0x00ad }
            r5 = 54658(0xd582, float:7.6592E-41)
            com.google.common.f.x r4 = r4.mo56372aa(r5)     // Catch:{ all -> 0x00ad }
            com.google.common.f.c r4 = (com.google.common.p4526f.C59052c) r4     // Catch:{ all -> 0x00ad }
            java.lang.String r5 = "UnsupportedOperationException"
            r4.mo56386p(r5)     // Catch:{ all -> 0x00ad }
            com.google.android.apps.gsa.shared.logger.b.ae r4 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.DSP_START_HOTWORD_RECOGNITION_UNSUPPORTED_OPERATION     // Catch:{ all -> 0x00ad }
            r9.mo49390E(r4)     // Catch:{ all -> 0x00ad }
        L_0x012f:
            com.google.common.f.e r4 = f118622a
            com.google.common.f.x r5 = r4.mo56224b()
            com.google.common.f.aa r6 = com.google.common.p4526f.p4527a.C58975e.f156826a
            java.lang.String r7 = "GsaVoiceInteractionSrv"
            r5.mo56378ag(r6, r7)
            java.lang.String r6 = "Start Hotword Recognition Status: %b"
            boolean r7 = r9.f118630B
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r7)
            r8 = 54655(0xd57f, float:7.6588E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r5).mo56372aa(r8)).mo56389s(r6, r7)
            boolean r5 = r9.f118630B
            if (r5 == 0) goto L_0x0158
            r9.f118663aI = r3
            r9.f118710f = r1
            com.google.android.apps.gsa.shared.logger.b.ae r0 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.DSP_START_HOTWORD_RECOGNITION_SUCCEEDED
            r9.mo49390E(r0)
            goto L_0x01b8
        L_0x0158:
            com.google.android.libraries.search.assistant.v.a.a r1 = com.google.android.libraries.search.assistant.p2820v.p2821a.C36771a.DSP_START_RECOGNITION_FAILURE
            r9.mo49401P(r1)
            int r1 = r9.f118710f
            int r1 = r1 + r3
            r9.f118710f = r1
            if (r1 >= r0) goto L_0x0189
            com.google.common.f.x r0 = r4.mo56224b()
            com.google.common.f.aa r1 = com.google.common.p4526f.p4527a.C58975e.f156826a
            java.lang.String r3 = "GsaVoiceInteractionSrv"
            r0.mo56378ag(r1, r3)
            com.google.common.f.c r0 = (com.google.common.p4526f.C59052c) r0
            r1 = 54657(0xd581, float:7.6591E-41)
            com.google.common.f.x r0 = r0.mo56372aa(r1)
            com.google.common.f.c r0 = (com.google.common.p4526f.C59052c) r0
            java.lang.String r1 = "Retry startRecognition after some time #-%d"
            int r3 = r9.f118710f
            r0.mo56387q(r1, r3)
            com.google.android.voiceinteraction.ao r0 = r9.f118660aF
            r3 = 2000(0x7d0, double:9.88E-321)
            r0.sendEmptyMessageDelayed(r2, r3)
            goto L_0x01b8
        L_0x0189:
            com.google.android.apps.gsa.shared.logger.b.ae r0 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.DSP_START_HOTWORD_RECOGNITION_ALL_ATTEMPTS_FAILED
            r9.mo49390E(r0)
            java.lang.Object r0 = r9.f118726v
            monitor-enter(r0)
            boolean r1 = r9.m80888aq()     // Catch:{ all -> 0x01bb }
            if (r1 == 0) goto L_0x01b7
            com.google.common.f.x r1 = r4.mo56224b()     // Catch:{ all -> 0x01bb }
            com.google.common.f.aa r2 = com.google.common.p4526f.p4527a.C58975e.f156826a     // Catch:{ all -> 0x01bb }
            java.lang.String r4 = "GsaVoiceInteractionSrv"
            r1.mo56378ag(r2, r4)     // Catch:{ all -> 0x01bb }
            com.google.common.f.c r1 = (com.google.common.p4526f.C59052c) r1     // Catch:{ all -> 0x01bb }
            r2 = 54656(0xd580, float:7.659E-41)
            com.google.common.f.x r1 = r1.mo56372aa(r2)     // Catch:{ all -> 0x01bb }
            com.google.common.f.c r1 = (com.google.common.p4526f.C59052c) r1     // Catch:{ all -> 0x01bb }
            java.lang.String r2 = "#startRecognition failed on a downloaded model, disabling use of downloaded models until new models downloaded"
            r1.mo56386p(r2)     // Catch:{ all -> 0x01bb }
            r9.f118711g = r3     // Catch:{ all -> 0x01bb }
            r9.mo49406U()     // Catch:{ all -> 0x01bb }
        L_0x01b7:
            monitor-exit(r0)     // Catch:{ all -> 0x01bb }
        L_0x01b8:
            boolean r0 = r9.f118630B
            return r0
        L_0x01bb:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x01bb }
            throw r1
        L_0x01be:
            throw r0
        L_0x01bf:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x01bf }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.voiceinteraction.GsaVoiceInteractionService.mo49420ai():boolean");
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x008c  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x008e  */
    /* renamed from: aj */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo49421aj(boolean r7) {
        /*
            r6 = this;
            r0 = 2
            if (r7 == 0) goto L_0x000e
            com.google.android.voiceinteraction.ao r7 = r6.f118660aF
            r7.removeMessages(r0)
            com.google.android.voiceinteraction.ao r7 = r6.f118660aF
            r1 = 3
            r7.removeMessages(r1)
        L_0x000e:
            boolean r7 = r6.f118663aI
            r1 = 1
            if (r7 != 0) goto L_0x0016
            com.google.common.f.aa r7 = com.google.common.p4526f.p4527a.C58975e.f156826a
            return r1
        L_0x0016:
            int r7 = r6.f118703ay
            r2 = 0
            java.lang.String r3 = "GsaVoiceInteractionSrv"
            if (r7 != r0) goto L_0x0091
            android.service.voice.AlwaysOnHotwordDetector r7 = r6.f118702ax
            if (r7 == 0) goto L_0x0091
            boolean r7 = r7.stopRecognition()     // Catch:{ UnsupportedOperationException -> 0x003c, Exception -> 0x0026 }
            goto L_0x0073
        L_0x0026:
            r7 = move-exception
            com.google.common.f.e r0 = f118622a
            com.google.common.f.x r0 = r0.mo56225c()
            com.google.common.f.aa r4 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r0.mo56378ag(r4, r3)
            java.lang.String r4 = "Error stopping recognition"
            r5 = 54665(0xd589, float:7.6602E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r0).mo56382g(r7)).mo56372aa(r5)).mo56386p(r4)
        L_0x003a:
            r7 = 0
            goto L_0x0073
        L_0x003c:
            r7 = move-exception
            java.lang.String r0 = r7.getMessage()
            if (r0 == 0) goto L_0x005f
            java.lang.String r4 = "Recognition for the given keyphrase is not supported"
            boolean r0 = r0.contains(r4)
            if (r0 == 0) goto L_0x005f
            com.google.common.f.e r7 = f118622a
            com.google.common.f.x r7 = r7.mo56226d()
            com.google.common.f.aa r0 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r7.mo56378ag(r0, r3)
            java.lang.String r0 = "Stop called while DSP was not enrolled"
            r4 = 54664(0xd588, float:7.66E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r7).mo56372aa(r4)).mo56386p(r0)
            goto L_0x003a
        L_0x005f:
            com.google.common.f.e r0 = f118622a
            com.google.common.f.x r0 = r0.mo56225c()
            com.google.common.f.aa r4 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r0.mo56378ag(r4, r3)
            java.lang.String r4 = "UnsupportedOperationException"
            r5 = 54663(0xd587, float:7.6599E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r0).mo56382g(r7)).mo56372aa(r5)).mo56386p(r4)
            goto L_0x003a
        L_0x0073:
            com.google.common.f.e r0 = f118622a
            com.google.common.f.x r0 = r0.mo56224b()
            com.google.common.f.aa r4 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r0.mo56378ag(r4, r3)
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r7)
            r4 = 54662(0xd586, float:7.6598E-41)
            java.lang.String r5 = "Stop Hotword Recognition status: %b"
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r0).mo56372aa(r4)).mo56389s(r5, r3)
            if (r7 != 0) goto L_0x008e
            r2 = r7
            goto L_0x00ae
        L_0x008e:
            r6.f118663aI = r2
            return r1
        L_0x0091:
            com.google.common.f.e r7 = f118622a
            com.google.common.f.x r7 = r7.mo56224b()
            com.google.common.f.aa r0 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r7.mo56378ag(r0, r3)
            com.google.common.f.c r7 = (com.google.common.p4526f.C59052c) r7
            r0 = 54661(0xd585, float:7.6596E-41)
            com.google.common.f.x r7 = r7.mo56372aa(r0)
            com.google.common.f.c r7 = (com.google.common.p4526f.C59052c) r7
            java.lang.String r0 = "Not calling stopRecognition. Availability: %d"
            int r1 = r6.f118703ay
            r7.mo56387q(r0, r1)
        L_0x00ae:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.voiceinteraction.GsaVoiceInteractionService.mo49421aj(boolean):boolean");
    }

    /* access modifiers changed from: protected */
    public final void dump(FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.dump(fileDescriptor, printWriter, strArr);
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        m80892au(sb);
        printWriter.println(sb.toString());
    }

    /* renamed from: f */
    public final int mo49424f(String str, Locale locale) {
        try {
            Boolean bool = (Boolean) getClass().getMethod("isKeyphraseAndLocaleSupportedForHotword", new Class[]{String.class, Locale.class}).invoke(this, new Object[]{str, locale});
            C58976aa aaVar = C58975e.f156826a;
            if (bool == null) {
                return -2;
            }
            if (bool.booleanValue()) {
                return 1;
            }
            return -1;
        } catch (Exception e) {
            C59104x c = f118622a.mo56225c();
            c.mo56378ag(C58975e.f156826a, "GsaVoiceInteractionSrv");
            ((C59052c) ((C59052c) ((C59052c) c).mo56382g(e)).mo56372aa(54504)).mo56354G("Invoking method isKeyphraseAndLocaleSupportedForHotword failed; keyphrase=%s locale=%s", str, locale);
            return -2;
        }
    }

    /* renamed from: g */
    public final long mo49425g() {
        return ((C81323s) ((C58847bk) this.f118692an).f156646a).mo74938c();
    }

    /* renamed from: gS */
    public final void mo17602gS(C91006f fVar) {
        String str;
        String str2;
        String str3;
        HotwordInformation hotwordInformation;
        String str4;
        C58976aa aaVar = C58975e.f156826a;
        fVar.mo85291r("GsaVoiceInteractionService");
        fVar.mo85278b("HOTWORD ARCHITECTURE").mo85276a(C90752i.m148229c(((C34134g) this.f118688aj.mo27525b()).name()));
        StringBuilder sb = new StringBuilder();
        m80892au(sb);
        fVar.mo85279c("Data").mo85276a(C90752i.m148229c(sb.toString()));
        boolean ac = mo49414ac();
        String str5 = "Yes";
        fVar.mo85284k("Default Assistant", true != ac ? "No" : str5);
        if (ac) {
            synchronized (this.f118726v) {
                if (this.f118703ay == 0) {
                    fVar.mo85284k("Assistant Ready", "No");
                } else {
                    if (this.f118703ay > 0) {
                        if (this.f118703ay == 1) {
                            fVar.mo85284k("Always On", "Disabled");
                        } else if (this.f118703ay == 2 && (hotwordInformation = this.f118664aJ) != null) {
                            if (hotwordInformation.f395883d) {
                                fVar.mo85284k("Always On", "Enabled");
                                if (true != this.f118663aI) {
                                    str4 = "No";
                                } else {
                                    str4 = str5;
                                }
                                fVar.mo85284k("Hotword Running", str4);
                                m80883al(fVar);
                                m80890as(fVar);
                            } else {
                                fVar.mo85284k("Always On", "Disabled");
                            }
                            m80891at(fVar);
                        }
                        if (true != this.f118695aq.containsValue(Boolean.TRUE)) {
                            str3 = "No";
                        } else {
                            str3 = str5;
                        }
                        fVar.mo85284k("Dsp Hotword Triggered", str3);
                    } else {
                        HotwordInformation hotwordInformation2 = this.f118664aJ;
                        if (hotwordInformation2 != null && hotwordInformation2.f395884e) {
                            if (hotwordInformation2.f395885f) {
                                fVar.mo85284k("From Any Screen", "Enabled");
                                C118719g gVar = this.f118632D;
                                if (gVar == null || !gVar.f331139b.mo23879i()) {
                                    str2 = "No";
                                } else {
                                    str2 = str5;
                                }
                                fVar.mo85284k("Hotword Running", str2);
                                m80890as(fVar);
                                m80883al(fVar);
                            } else {
                                fVar.mo85284k("From Any Screen", "Disabled");
                            }
                            m80891at(fVar);
                        }
                    }
                    HotwordInformation hotwordInformation3 = this.f118664aJ;
                    if (hotwordInformation3 != null) {
                        fVar.mo85284k("Hotword Model Location", String.valueOf(hotwordInformation3.f395886g));
                    }
                }
                if (true != m80888aq()) {
                    str = "No";
                } else {
                    str = str5;
                }
                fVar.mo85284k("Downloaded DSP model enabled", str);
                if (true != this.f118711g) {
                    str5 = "No";
                }
                fVar.mo85284k("Downloaded DSP model failed", str5);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public final SharedPreferences mo49426h() {
        if (this.f118706bb == null) {
            this.f118706bb = getSharedPreferences("VoiceInteractionService", 0);
        }
        return this.f118706bb;
    }

    /* renamed from: i */
    public final PowerManager mo49427i() {
        return (PowerManager) getSystemService("power");
    }

    /* renamed from: j */
    public final HotwordResult mo49428j(int i) {
        C90599p F = HotwordResult.m147742F();
        F.mo84728q(i);
        F.mo84719h(true);
        F.mo84713b(mo49431m());
        return F.mo84712a();
    }

    /* access modifiers changed from: protected */
    /* renamed from: k */
    public final C91142g mo49429k() {
        return (C91142g) this.f118642N.mo27525b();
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x0180, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:?, code lost:
        throw r3;
     */
    /* renamed from: l */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.voiceinteraction.p3559a.C45371g mo49430l() {
        /*
            r23 = this;
            r1 = r23
            android.content.Context r2 = r1.f118637I
            boolean r2 = com.google.android.voiceinteraction.p3559a.C45370f.m80968d(r2)
            r3 = 0
            if (r2 == 0) goto L_0x0196
            int r2 = r1.f118703ay
            r4 = 2
            if (r2 == r4) goto L_0x0012
            goto L_0x0196
        L_0x0012:
            java.lang.Object r2 = r1.f118701aw
            monitor-enter(r2)
            java.lang.String r5 = r1.f118659aE     // Catch:{ all -> 0x0192 }
            int r5 = com.google.android.apps.gsa.shared.speech.hotword.C90586c.m147807e(r5)     // Catch:{ all -> 0x0192 }
            int r5 = r5 + -1
            if (r5 != 0) goto L_0x0021
            monitor-exit(r2)     // Catch:{ all -> 0x0192 }
            return r3
        L_0x0021:
            java.lang.String r6 = r1.f118658aD     // Catch:{ all -> 0x0192 }
            java.util.Locale r6 = java.util.Locale.forLanguageTag(r6)     // Catch:{ all -> 0x0192 }
            com.google.common.f.aa r7 = com.google.common.p4526f.p4527a.C58975e.f156826a     // Catch:{ all -> 0x0192 }
            r6.toLanguageTag()     // Catch:{ all -> 0x0192 }
            com.google.android.voiceinteraction.p3559a.C45370f.m80966b(r23)     // Catch:{ all -> 0x0192 }
            com.google.android.apps.gsa.shared.s.a.a r7 = com.google.android.apps.gsa.shared.util.debug.p7166b.C91018d.f254254a     // Catch:{ all -> 0x0192 }
            java.lang.Object r7 = com.google.android.voiceinteraction.p3559a.C45370f.m80965a(r23)     // Catch:{ NoSuchMethodException -> 0x0189, IllegalAccessException -> 0x0187, InvocationTargetException -> 0x0185, ClassNotFoundException -> 0x0183 }
            java.lang.Class[] r8 = new java.lang.Class[r4]     // Catch:{ NoSuchMethodException -> 0x0189, IllegalAccessException -> 0x0187, InvocationTargetException -> 0x0185, ClassNotFoundException -> 0x0183 }
            java.lang.Class r9 = java.lang.Integer.TYPE     // Catch:{ NoSuchMethodException -> 0x0189, IllegalAccessException -> 0x0187, InvocationTargetException -> 0x0185, ClassNotFoundException -> 0x0183 }
            r10 = 0
            r8[r10] = r9     // Catch:{ NoSuchMethodException -> 0x0189, IllegalAccessException -> 0x0187, InvocationTargetException -> 0x0185, ClassNotFoundException -> 0x0183 }
            java.lang.Class<java.util.Locale> r9 = java.util.Locale.class
            r11 = 1
            r8[r11] = r9     // Catch:{ NoSuchMethodException -> 0x0189, IllegalAccessException -> 0x0187, InvocationTargetException -> 0x0185, ClassNotFoundException -> 0x0183 }
            java.lang.Class r9 = r7.getClass()     // Catch:{ NoSuchMethodException -> 0x0189, IllegalAccessException -> 0x0187, InvocationTargetException -> 0x0185, ClassNotFoundException -> 0x0183 }
            java.lang.String r12 = "getKeyphraseSoundModel"
            java.lang.reflect.Method r8 = r9.getMethod(r12, r8)     // Catch:{ NoSuchMethodException -> 0x0189, IllegalAccessException -> 0x0187, InvocationTargetException -> 0x0185, ClassNotFoundException -> 0x0183 }
            java.lang.Object[] r4 = new java.lang.Object[r4]     // Catch:{ NoSuchMethodException -> 0x0189, IllegalAccessException -> 0x0187, InvocationTargetException -> 0x0185, ClassNotFoundException -> 0x0183 }
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch:{ NoSuchMethodException -> 0x0189, IllegalAccessException -> 0x0187, InvocationTargetException -> 0x0185, ClassNotFoundException -> 0x0183 }
            r4[r10] = r5     // Catch:{ NoSuchMethodException -> 0x0189, IllegalAccessException -> 0x0187, InvocationTargetException -> 0x0185, ClassNotFoundException -> 0x0183 }
            r4[r11] = r6     // Catch:{ NoSuchMethodException -> 0x0189, IllegalAccessException -> 0x0187, InvocationTargetException -> 0x0185, ClassNotFoundException -> 0x0183 }
            java.lang.Object r4 = r8.invoke(r7, r4)     // Catch:{ NoSuchMethodException -> 0x0189, IllegalAccessException -> 0x0187, InvocationTargetException -> 0x0185, ClassNotFoundException -> 0x0183 }
            if (r4 != 0) goto L_0x005d
            goto L_0x017e
        L_0x005d:
            java.lang.String r3 = "android.hardware.soundtrigger.SoundTrigger$KeyphraseSoundModel"
            java.lang.Class r3 = java.lang.Class.forName(r3)     // Catch:{ NoSuchMethodException -> 0x0189, IllegalAccessException -> 0x0187, InvocationTargetException -> 0x0185, ClassNotFoundException -> 0x0183 }
            java.lang.String r5 = "getUuid"
            java.lang.Class[] r6 = new java.lang.Class[r10]     // Catch:{ NoSuchMethodException -> 0x0189, IllegalAccessException -> 0x0187, InvocationTargetException -> 0x0185, ClassNotFoundException -> 0x0183 }
            java.lang.reflect.Method r5 = r3.getMethod(r5, r6)     // Catch:{ NoSuchMethodException -> 0x0189, IllegalAccessException -> 0x0187, InvocationTargetException -> 0x0185, ClassNotFoundException -> 0x0183 }
            java.lang.Object[] r6 = new java.lang.Object[r10]     // Catch:{ NoSuchMethodException -> 0x0189, IllegalAccessException -> 0x0187, InvocationTargetException -> 0x0185, ClassNotFoundException -> 0x0183 }
            java.lang.Object r5 = r5.invoke(r4, r6)     // Catch:{ NoSuchMethodException -> 0x0189, IllegalAccessException -> 0x0187, InvocationTargetException -> 0x0185, ClassNotFoundException -> 0x0183 }
            r5.getClass()
            r12 = r5
            java.util.UUID r12 = (java.util.UUID) r12     // Catch:{ NoSuchMethodException -> 0x0189, IllegalAccessException -> 0x0187, InvocationTargetException -> 0x0185, ClassNotFoundException -> 0x0183 }
            java.lang.String r5 = "getVendorUuid"
            java.lang.Class[] r6 = new java.lang.Class[r10]     // Catch:{ NoSuchMethodException -> 0x0189, IllegalAccessException -> 0x0187, InvocationTargetException -> 0x0185, ClassNotFoundException -> 0x0183 }
            java.lang.reflect.Method r5 = r3.getMethod(r5, r6)     // Catch:{ NoSuchMethodException -> 0x0189, IllegalAccessException -> 0x0187, InvocationTargetException -> 0x0185, ClassNotFoundException -> 0x0183 }
            java.lang.Object[] r6 = new java.lang.Object[r10]     // Catch:{ NoSuchMethodException -> 0x0189, IllegalAccessException -> 0x0187, InvocationTargetException -> 0x0185, ClassNotFoundException -> 0x0183 }
            java.lang.Object r5 = r5.invoke(r4, r6)     // Catch:{ NoSuchMethodException -> 0x0189, IllegalAccessException -> 0x0187, InvocationTargetException -> 0x0185, ClassNotFoundException -> 0x0183 }
            r5.getClass()
            r13 = r5
            java.util.UUID r13 = (java.util.UUID) r13     // Catch:{ NoSuchMethodException -> 0x0189, IllegalAccessException -> 0x0187, InvocationTargetException -> 0x0185, ClassNotFoundException -> 0x0183 }
            java.lang.String r5 = "getData"
            java.lang.Class[] r6 = new java.lang.Class[r10]     // Catch:{ NoSuchMethodException -> 0x0189, IllegalAccessException -> 0x0187, InvocationTargetException -> 0x0185, ClassNotFoundException -> 0x0183 }
            java.lang.reflect.Method r5 = r3.getMethod(r5, r6)     // Catch:{ NoSuchMethodException -> 0x0189, IllegalAccessException -> 0x0187, InvocationTargetException -> 0x0185, ClassNotFoundException -> 0x0183 }
            java.lang.Object[] r6 = new java.lang.Object[r10]     // Catch:{ NoSuchMethodException -> 0x0189, IllegalAccessException -> 0x0187, InvocationTargetException -> 0x0185, ClassNotFoundException -> 0x0183 }
            java.lang.Object r5 = r5.invoke(r4, r6)     // Catch:{ NoSuchMethodException -> 0x0189, IllegalAccessException -> 0x0187, InvocationTargetException -> 0x0185, ClassNotFoundException -> 0x0183 }
            r14 = r5
            byte[] r14 = (byte[]) r14     // Catch:{ NoSuchMethodException -> 0x0189, IllegalAccessException -> 0x0187, InvocationTargetException -> 0x0185, ClassNotFoundException -> 0x0183 }
            java.lang.String r5 = "getVersion"
            java.lang.Class[] r6 = new java.lang.Class[r10]     // Catch:{ NoSuchMethodException -> 0x0189, IllegalAccessException -> 0x0187, InvocationTargetException -> 0x0185, ClassNotFoundException -> 0x0183 }
            java.lang.reflect.Method r5 = r3.getMethod(r5, r6)     // Catch:{ NoSuchMethodException -> 0x0189, IllegalAccessException -> 0x0187, InvocationTargetException -> 0x0185, ClassNotFoundException -> 0x0183 }
            java.lang.Object[] r6 = new java.lang.Object[r10]     // Catch:{ NoSuchMethodException -> 0x0189, IllegalAccessException -> 0x0187, InvocationTargetException -> 0x0185, ClassNotFoundException -> 0x0183 }
            java.lang.Object r5 = r5.invoke(r4, r6)     // Catch:{ NoSuchMethodException -> 0x0189, IllegalAccessException -> 0x0187, InvocationTargetException -> 0x0185, ClassNotFoundException -> 0x0183 }
            r5.getClass()
            java.lang.Integer r5 = (java.lang.Integer) r5     // Catch:{ NoSuchMethodException -> 0x0189, IllegalAccessException -> 0x0187, InvocationTargetException -> 0x0185, ClassNotFoundException -> 0x0183 }
            int r16 = r5.intValue()     // Catch:{ NoSuchMethodException -> 0x0189, IllegalAccessException -> 0x0187, InvocationTargetException -> 0x0185, ClassNotFoundException -> 0x0183 }
            java.lang.String r5 = "getKeyphrases"
            java.lang.Class[] r6 = new java.lang.Class[r10]     // Catch:{ NoSuchMethodException -> 0x0189, IllegalAccessException -> 0x0187, InvocationTargetException -> 0x0185, ClassNotFoundException -> 0x0183 }
            java.lang.reflect.Method r3 = r3.getMethod(r5, r6)     // Catch:{ NoSuchMethodException -> 0x0189, IllegalAccessException -> 0x0187, InvocationTargetException -> 0x0185, ClassNotFoundException -> 0x0183 }
            java.lang.Object[] r5 = new java.lang.Object[r10]     // Catch:{ NoSuchMethodException -> 0x0189, IllegalAccessException -> 0x0187, InvocationTargetException -> 0x0185, ClassNotFoundException -> 0x0183 }
            java.lang.Object r5 = r3.invoke(r4, r5)     // Catch:{ NoSuchMethodException -> 0x0189, IllegalAccessException -> 0x0187, InvocationTargetException -> 0x0185, ClassNotFoundException -> 0x0183 }
            java.lang.Object[] r5 = (java.lang.Object[]) r5     // Catch:{ NoSuchMethodException -> 0x0189, IllegalAccessException -> 0x0187, InvocationTargetException -> 0x0185, ClassNotFoundException -> 0x0183 }
            if (r5 != 0) goto L_0x00c9
            com.google.android.voiceinteraction.a.d[] r3 = new com.google.android.voiceinteraction.p3559a.C45368d[r10]     // Catch:{ NoSuchMethodException -> 0x0189, IllegalAccessException -> 0x0187, InvocationTargetException -> 0x0185, ClassNotFoundException -> 0x0183 }
            goto L_0x0173
        L_0x00c9:
            java.lang.Object[] r5 = new java.lang.Object[r10]     // Catch:{ NoSuchMethodException -> 0x0189, IllegalAccessException -> 0x0187, InvocationTargetException -> 0x0185, ClassNotFoundException -> 0x0183 }
            java.lang.Object r3 = r3.invoke(r4, r5)     // Catch:{ NoSuchMethodException -> 0x0189, IllegalAccessException -> 0x0187, InvocationTargetException -> 0x0185, ClassNotFoundException -> 0x0183 }
            r3.getClass()
            java.lang.Object[] r3 = (java.lang.Object[]) r3     // Catch:{ NoSuchMethodException -> 0x0189, IllegalAccessException -> 0x0187, InvocationTargetException -> 0x0185, ClassNotFoundException -> 0x0183 }
            int r4 = r3.length     // Catch:{ NoSuchMethodException -> 0x0189, IllegalAccessException -> 0x0187, InvocationTargetException -> 0x0185, ClassNotFoundException -> 0x0183 }
            com.google.android.voiceinteraction.a.d[] r4 = new com.google.android.voiceinteraction.p3559a.C45368d[r4]     // Catch:{ NoSuchMethodException -> 0x0189, IllegalAccessException -> 0x0187, InvocationTargetException -> 0x0185, ClassNotFoundException -> 0x0183 }
            r5 = 0
        L_0x00d8:
            int r6 = r3.length     // Catch:{ NoSuchMethodException -> 0x0189, IllegalAccessException -> 0x0187, InvocationTargetException -> 0x0185, ClassNotFoundException -> 0x0183 }
            if (r5 >= r6) goto L_0x0172
            r6 = r3[r5]     // Catch:{ NoSuchMethodException -> 0x0189, IllegalAccessException -> 0x0187, InvocationTargetException -> 0x0185, ClassNotFoundException -> 0x0183 }
            java.lang.String r7 = "android.hardware.soundtrigger.SoundTrigger$Keyphrase"
            java.lang.Class r7 = java.lang.Class.forName(r7)     // Catch:{ NoSuchMethodException -> 0x0189, IllegalAccessException -> 0x0187, InvocationTargetException -> 0x0185, ClassNotFoundException -> 0x0183 }
            java.lang.String r8 = "getId"
            java.lang.Class[] r9 = new java.lang.Class[r10]     // Catch:{ NoSuchMethodException -> 0x0189, IllegalAccessException -> 0x0187, InvocationTargetException -> 0x0185, ClassNotFoundException -> 0x0183 }
            java.lang.reflect.Method r8 = r7.getMethod(r8, r9)     // Catch:{ NoSuchMethodException -> 0x0189, IllegalAccessException -> 0x0187, InvocationTargetException -> 0x0185, ClassNotFoundException -> 0x0183 }
            java.lang.Object[] r9 = new java.lang.Object[r10]     // Catch:{ NoSuchMethodException -> 0x0189, IllegalAccessException -> 0x0187, InvocationTargetException -> 0x0185, ClassNotFoundException -> 0x0183 }
            java.lang.Object r8 = r8.invoke(r6, r9)     // Catch:{ NoSuchMethodException -> 0x0189, IllegalAccessException -> 0x0187, InvocationTargetException -> 0x0185, ClassNotFoundException -> 0x0183 }
            r8.getClass()
            java.lang.Integer r8 = (java.lang.Integer) r8     // Catch:{ NoSuchMethodException -> 0x0189, IllegalAccessException -> 0x0187, InvocationTargetException -> 0x0185, ClassNotFoundException -> 0x0183 }
            int r18 = r8.intValue()     // Catch:{ NoSuchMethodException -> 0x0189, IllegalAccessException -> 0x0187, InvocationTargetException -> 0x0185, ClassNotFoundException -> 0x0183 }
            java.lang.String r8 = "getRecognitionModes"
            java.lang.Class[] r9 = new java.lang.Class[r10]     // Catch:{ NoSuchMethodException -> 0x0189, IllegalAccessException -> 0x0187, InvocationTargetException -> 0x0185, ClassNotFoundException -> 0x0183 }
            java.lang.reflect.Method r8 = r7.getMethod(r8, r9)     // Catch:{ NoSuchMethodException -> 0x0189, IllegalAccessException -> 0x0187, InvocationTargetException -> 0x0185, ClassNotFoundException -> 0x0183 }
            java.lang.Object[] r9 = new java.lang.Object[r10]     // Catch:{ NoSuchMethodException -> 0x0189, IllegalAccessException -> 0x0187, InvocationTargetException -> 0x0185, ClassNotFoundException -> 0x0183 }
            java.lang.Object r8 = r8.invoke(r6, r9)     // Catch:{ NoSuchMethodException -> 0x0189, IllegalAccessException -> 0x0187, InvocationTargetException -> 0x0185, ClassNotFoundException -> 0x0183 }
            r8.getClass()
            java.lang.Integer r8 = (java.lang.Integer) r8     // Catch:{ NoSuchMethodException -> 0x0189, IllegalAccessException -> 0x0187, InvocationTargetException -> 0x0185, ClassNotFoundException -> 0x0183 }
            int r19 = r8.intValue()     // Catch:{ NoSuchMethodException -> 0x0189, IllegalAccessException -> 0x0187, InvocationTargetException -> 0x0185, ClassNotFoundException -> 0x0183 }
            java.lang.String r8 = "getLocale"
            java.lang.Class[] r9 = new java.lang.Class[r10]     // Catch:{ NoSuchMethodException -> 0x0189, IllegalAccessException -> 0x0187, InvocationTargetException -> 0x0185, ClassNotFoundException -> 0x0183 }
            java.lang.reflect.Method r8 = r7.getMethod(r8, r9)     // Catch:{ NoSuchMethodException -> 0x0189, IllegalAccessException -> 0x0187, InvocationTargetException -> 0x0185, ClassNotFoundException -> 0x0183 }
            java.lang.Object[] r9 = new java.lang.Object[r10]     // Catch:{ NoSuchMethodException -> 0x0189, IllegalAccessException -> 0x0187, InvocationTargetException -> 0x0185, ClassNotFoundException -> 0x0183 }
            java.lang.Object r8 = r8.invoke(r6, r9)     // Catch:{ NoSuchMethodException -> 0x0189, IllegalAccessException -> 0x0187, InvocationTargetException -> 0x0185, ClassNotFoundException -> 0x0183 }
            r8.getClass()
            r20 = r8
            java.util.Locale r20 = (java.util.Locale) r20     // Catch:{ NoSuchMethodException -> 0x0189, IllegalAccessException -> 0x0187, InvocationTargetException -> 0x0185, ClassNotFoundException -> 0x0183 }
            java.lang.String r8 = "getText"
            java.lang.Class[] r9 = new java.lang.Class[r10]     // Catch:{ NoSuchMethodException -> 0x0189, IllegalAccessException -> 0x0187, InvocationTargetException -> 0x0185, ClassNotFoundException -> 0x0183 }
            java.lang.reflect.Method r8 = r7.getMethod(r8, r9)     // Catch:{ NoSuchMethodException -> 0x0189, IllegalAccessException -> 0x0187, InvocationTargetException -> 0x0185, ClassNotFoundException -> 0x0183 }
            java.lang.Object[] r9 = new java.lang.Object[r10]     // Catch:{ NoSuchMethodException -> 0x0189, IllegalAccessException -> 0x0187, InvocationTargetException -> 0x0185, ClassNotFoundException -> 0x0183 }
            java.lang.Object r8 = r8.invoke(r6, r9)     // Catch:{ NoSuchMethodException -> 0x0189, IllegalAccessException -> 0x0187, InvocationTargetException -> 0x0185, ClassNotFoundException -> 0x0183 }
            r8.getClass()
            r21 = r8
            java.lang.String r21 = (java.lang.String) r21     // Catch:{ NoSuchMethodException -> 0x0189, IllegalAccessException -> 0x0187, InvocationTargetException -> 0x0185, ClassNotFoundException -> 0x0183 }
            java.lang.String r8 = "getUsers"
            java.lang.Class[] r9 = new java.lang.Class[r10]     // Catch:{ NoSuchMethodException -> 0x0189, IllegalAccessException -> 0x0187, InvocationTargetException -> 0x0185, ClassNotFoundException -> 0x0183 }
            java.lang.reflect.Method r7 = r7.getMethod(r8, r9)     // Catch:{ NoSuchMethodException -> 0x0189, IllegalAccessException -> 0x0187, InvocationTargetException -> 0x0185, ClassNotFoundException -> 0x0183 }
            r6.getClass()
            java.lang.Object[] r8 = new java.lang.Object[r10]     // Catch:{ NoSuchMethodException -> 0x0189, IllegalAccessException -> 0x0187, InvocationTargetException -> 0x0185, ClassNotFoundException -> 0x0183 }
            java.lang.Object r6 = r7.invoke(r6, r8)     // Catch:{ NoSuchMethodException -> 0x0189, IllegalAccessException -> 0x0187, InvocationTargetException -> 0x0185, ClassNotFoundException -> 0x0183 }
            r6.getClass()
            int[] r6 = (int[]) r6     // Catch:{ NoSuchMethodException -> 0x0189, IllegalAccessException -> 0x0187, InvocationTargetException -> 0x0185, ClassNotFoundException -> 0x0183 }
            com.google.android.voiceinteraction.a.a r7 = new com.google.android.voiceinteraction.a.a     // Catch:{ NoSuchMethodException -> 0x0189, IllegalAccessException -> 0x0187, InvocationTargetException -> 0x0185, ClassNotFoundException -> 0x0183 }
            j$.util.stream.IntStream r6 = p3186j$.util.DesugarArrays.stream((int[]) r6)     // Catch:{ NoSuchMethodException -> 0x0189, IllegalAccessException -> 0x0187, InvocationTargetException -> 0x0185, ClassNotFoundException -> 0x0183 }
            j$.util.stream.Stream r6 = r6.boxed()     // Catch:{ NoSuchMethodException -> 0x0189, IllegalAccessException -> 0x0187, InvocationTargetException -> 0x0185, ClassNotFoundException -> 0x0183 }
            com.google.android.voiceinteraction.a.c r8 = com.google.android.voiceinteraction.p3559a.C45367c.f118737a     // Catch:{ NoSuchMethodException -> 0x0189, IllegalAccessException -> 0x0187, InvocationTargetException -> 0x0185, ClassNotFoundException -> 0x0183 }
            java.lang.Object[] r6 = r6.toArray(r8)     // Catch:{ NoSuchMethodException -> 0x0189, IllegalAccessException -> 0x0187, InvocationTargetException -> 0x0185, ClassNotFoundException -> 0x0183 }
            java.lang.Integer[] r6 = (java.lang.Integer[]) r6     // Catch:{ NoSuchMethodException -> 0x0189, IllegalAccessException -> 0x0187, InvocationTargetException -> 0x0185, ClassNotFoundException -> 0x0183 }
            com.google.common.b.gu r22 = com.google.common.p4522b.C58485gu.m89844l(r6)     // Catch:{ NoSuchMethodException -> 0x0189, IllegalAccessException -> 0x0187, InvocationTargetException -> 0x0185, ClassNotFoundException -> 0x0183 }
            r17 = r7
            r17.<init>(r18, r19, r20, r21, r22)     // Catch:{ NoSuchMethodException -> 0x0189, IllegalAccessException -> 0x0187, InvocationTargetException -> 0x0185, ClassNotFoundException -> 0x0183 }
            r4[r5] = r7     // Catch:{ NoSuchMethodException -> 0x0189, IllegalAccessException -> 0x0187, InvocationTargetException -> 0x0185, ClassNotFoundException -> 0x0183 }
            int r5 = r5 + 1
            goto L_0x00d8
        L_0x0172:
            r3 = r4
        L_0x0173:
            com.google.android.voiceinteraction.a.g r4 = new com.google.android.voiceinteraction.a.g     // Catch:{ NoSuchMethodException -> 0x0189, IllegalAccessException -> 0x0187, InvocationTargetException -> 0x0185, ClassNotFoundException -> 0x0183 }
            java.util.List r15 = java.util.Arrays.asList(r3)     // Catch:{ NoSuchMethodException -> 0x0189, IllegalAccessException -> 0x0187, InvocationTargetException -> 0x0185, ClassNotFoundException -> 0x0183 }
            r11 = r4
            r11.<init>(r12, r13, r14, r15, r16)     // Catch:{ NoSuchMethodException -> 0x0189, IllegalAccessException -> 0x0187, InvocationTargetException -> 0x0185, ClassNotFoundException -> 0x0183 }
            r3 = r4
        L_0x017e:
            monitor-exit(r2)     // Catch:{ all -> 0x0192 }
            return r3
        L_0x0180:
            r0 = move-exception
            r3 = r0
            goto L_0x0191
        L_0x0183:
            r0 = move-exception
            goto L_0x018a
        L_0x0185:
            r0 = move-exception
            goto L_0x018a
        L_0x0187:
            r0 = move-exception
            goto L_0x018a
        L_0x0189:
            r0 = move-exception
        L_0x018a:
            r3 = r0
            com.google.android.voiceinteraction.a.e r4 = new com.google.android.voiceinteraction.a.e     // Catch:{ all -> 0x0180 }
            r4.<init>(r3)     // Catch:{ all -> 0x0180 }
            throw r4     // Catch:{ all -> 0x0180 }
        L_0x0191:
            throw r3     // Catch:{ all -> 0x0192 }
        L_0x0192:
            r0 = move-exception
            r3 = r0
            monitor-exit(r2)     // Catch:{ all -> 0x0192 }
            throw r3
        L_0x0196:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.voiceinteraction.GsaVoiceInteractionService.mo49430l():com.google.android.voiceinteraction.a.g");
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x0030  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0054  */
    /* renamed from: m */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.speech.p5224k.p5225a.C67229g mo49431m() {
        /*
            r5 = this;
            java.lang.Object r0 = r5.f118726v
            monitor-enter(r0)
            com.google.android.hotword.service.HotwordInformation r1 = r5.f118664aJ     // Catch:{ all -> 0x0079 }
            if (r1 == 0) goto L_0x0058
            java.lang.String r1 = r1.f395891l     // Catch:{ all -> 0x0079 }
            int r2 = r1.hashCode()     // Catch:{ all -> 0x0079 }
            r3 = -777576671(0xffffffffd1a71f21, float:-8.9722724E10)
            r4 = 1
            if (r2 == r3) goto L_0x0023
            r3 = 1216066813(0x487bb4fd, float:257747.95)
            if (r2 == r3) goto L_0x0019
            goto L_0x002d
        L_0x0019:
            java.lang.String r2 = "Ok Google"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L_0x002d
            r2 = 0
            goto L_0x002e
        L_0x0023:
            java.lang.String r2 = "X Google"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L_0x002d
            r2 = 1
            goto L_0x002e
        L_0x002d:
            r2 = -1
        L_0x002e:
            if (r2 == 0) goto L_0x0054
            if (r2 == r4) goto L_0x0050
            com.google.common.f.e r2 = f118622a     // Catch:{ all -> 0x0079 }
            com.google.common.f.x r2 = r2.mo56226d()     // Catch:{ all -> 0x0079 }
            com.google.common.f.aa r3 = com.google.common.p4526f.p4527a.C58975e.f156826a     // Catch:{ all -> 0x0079 }
            java.lang.String r4 = "GsaVoiceInteractionSrv"
            r2.mo56378ag(r3, r4)     // Catch:{ all -> 0x0079 }
            com.google.common.f.c r2 = (com.google.common.p4526f.C59052c) r2     // Catch:{ all -> 0x0079 }
            r3 = 54511(0xd4ef, float:7.6386E-41)
            com.google.common.f.x r2 = r2.mo56372aa(r3)     // Catch:{ all -> 0x0079 }
            com.google.common.f.c r2 = (com.google.common.p4526f.C59052c) r2     // Catch:{ all -> 0x0079 }
            java.lang.String r3 = "Unknown keyphrase-%s"
            r2.mo56389s(r3, r1)     // Catch:{ all -> 0x0079 }
            goto L_0x0075
        L_0x0050:
            com.google.speech.k.a.g r1 = com.google.speech.p5224k.p5225a.C67229g.AOHD_X_GOOGLE     // Catch:{ all -> 0x0079 }
            monitor-exit(r0)     // Catch:{ all -> 0x0079 }
            return r1
        L_0x0054:
            com.google.speech.k.a.g r1 = com.google.speech.p5224k.p5225a.C67229g.AOHD_OK_GOOGLE     // Catch:{ all -> 0x0079 }
            monitor-exit(r0)     // Catch:{ all -> 0x0079 }
            return r1
        L_0x0058:
            com.google.common.f.e r1 = f118622a     // Catch:{ all -> 0x0079 }
            com.google.common.f.x r1 = r1.mo56226d()     // Catch:{ all -> 0x0079 }
            com.google.common.f.aa r2 = com.google.common.p4526f.p4527a.C58975e.f156826a     // Catch:{ all -> 0x0079 }
            java.lang.String r3 = "GsaVoiceInteractionSrv"
            r1.mo56378ag(r2, r3)     // Catch:{ all -> 0x0079 }
            com.google.common.f.c r1 = (com.google.common.p4526f.C59052c) r1     // Catch:{ all -> 0x0079 }
            r2 = 54510(0xd4ee, float:7.6385E-41)
            com.google.common.f.x r1 = r1.mo56372aa(r2)     // Catch:{ all -> 0x0079 }
            com.google.common.f.c r1 = (com.google.common.p4526f.C59052c) r1     // Catch:{ all -> 0x0079 }
            java.lang.String r2 = "#getAlwaysOnHotwordDetectorType - hotword information is null"
            r1.mo56386p(r2)     // Catch:{ all -> 0x0079 }
        L_0x0075:
            com.google.speech.k.a.g r1 = com.google.speech.p5224k.p5225a.C67229g.AOHD_OK_GOOGLE     // Catch:{ all -> 0x0079 }
            monitor-exit(r0)     // Catch:{ all -> 0x0079 }
            return r1
        L_0x0079:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0079 }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.voiceinteraction.GsaVoiceInteractionService.mo49431m():com.google.speech.k.a.g");
    }

    /* renamed from: n */
    public final String mo49432n(String str, String str2) {
        if (mo49424f(str2, Locale.forLanguageTag(str)) >= 0) {
            return str;
        }
        if (str.startsWith("fr")) {
            return "fr-FR";
        }
        if (str.startsWith("de")) {
            return "de-DE";
        }
        if (str.startsWith("es")) {
            return "es-ES";
        }
        if (str.startsWith("en")) {
            if (this.f118677aY == null) {
                HashSet hashSet = new HashSet(7);
                this.f118677aY = hashSet;
                hashSet.add("en-AU");
                this.f118677aY.add("en-CA");
                this.f118677aY.add("en-GB");
                this.f118677aY.add("en-IE");
                this.f118677aY.add("en-IN");
                this.f118677aY.add("en-PH");
                this.f118677aY.add("en-US");
            }
            if (this.f118677aY.contains(str)) {
                return str;
            }
            return "en-GB";
        } else if (str.startsWith("it")) {
            return "it-IT";
        } else {
            if (str.startsWith("nl")) {
                return "nl-NL";
            }
            if (str.startsWith("ar")) {
                return "ar-EG";
            }
            if (str.startsWith("pt")) {
                return "pt-BR";
            }
            return !f118623aW.contains(str) ? str : "yue-Hant-HK";
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: o */
    public final void mo49433o() {
        C90851k kVar;
        if (((C34134g) this.f118688aj.mo27525b()).equals(C34134g.LEGACY)) {
            C58976aa aaVar = C58975e.f156826a;
            if (this.f118720p == null && (kVar = this.f118676aV) != null) {
                this.f118720p = kVar.mo85208a("HotwordBackgroundExecutor");
            }
            this.f118720p.execute(C47810es.m84977q(new C45397e(this)));
        }
    }

    /* JADX WARNING: type inference failed for: r4v2, types: [com.google.android.voiceinteraction.as, android.os.IBinder] */
    public final IBinder onBind(Intent intent) {
        C58976aa aaVar = C58975e.f156826a;
        if (intent.getAction().equals("android.voiceinteraction.GsaVoiceInteractionService")) {
            if (((C34134g) this.f118688aj.mo27525b()).equals(C34134g.LEGACY)) {
                ? r4 = this.f118670aP;
                r4.asBinder();
                return r4;
            }
            C59104x b = f118622a.mo56224b();
            b.mo56378ag(C58975e.f156826a, "GsaVoiceInteractionSrv");
            ((C59052c) ((C59052c) b).mo56372aa(54506)).mo56386p("Not legacy hotword; returning null binder for GSA_VIS_INTERFACE.");
        }
        return super.onBind(intent);
    }

    public final void onCreate() {
        C58976aa aaVar = C58975e.f156826a;
        C89838ab.m146265i();
        C118618c.m196918a(getApplicationContext(), this.f118678aZ, new C118617b(getApplicationContext()), (C118616a) null);
        super.onCreate();
        this.f118660aF = new C45386ao(this);
        if (mo49429k().mo85405j(C90126fx.f251278fm)) {
            this.f118660aF.postDelayed(new C45401i(this), Duration.ofSeconds(30).toMillis());
        }
    }

    public final void onDestroy() {
        super.onDestroy();
        C58976aa aaVar = C58975e.f156826a;
        this.f118636H.mo85302b(this);
        f118625b = false;
    }

    public final Set onGetSupportedVoiceActions(Set set) {
        return C58733pz.f156496a;
    }

    public final void onLaunchVoiceAssistFromKeyguard() {
        C88483e.m142828c(this, new C88489j(C87739bu.VOICE_ASSIST_FROM_KEYGUARD_TRIGGERED).mo82013a());
    }

    public final void onReady() {
        super.onReady();
        C58976aa aaVar = C58975e.f156826a;
        C58833ax axVar = (C58833ax) this.f118687ai.mo27525b();
        if (axVar.mo56113h()) {
            C47538ax c = ((C47770dh) this.f118690al.mo27525b()).mo51613c("ApaVoiceInteractionService#onReady");
            try {
                ((C33489a) axVar.mo56107c()).mo38902a(this);
                if (c != null) {
                    c.close();
                }
            } catch (Throwable th) {
                C45364a.m80954a(th, th);
            }
        }
        Bundle bundle = new Bundle();
        bundle.putString("action", "config");
        bundle.putBoolean("is_available", false);
        try {
            setUiHints(bundle);
        } catch (SecurityException e) {
            C59104x c2 = f118622a.mo56225c();
            c2.mo56378ag(C58975e.f156826a, "GsaVoiceInteractionSrv");
            ((C59052c) ((C59052c) ((C59052c) c2).mo56382g(e)).mo56372aa(54622)).mo56386p("Cannot setUiHints() since we're not the default assistant anymore.");
        }
        if (((C34134g) this.f118688aj.mo27525b()).equals(C34134g.LEGACY)) {
            BroadcastReceiver broadcastReceiver = this.f118674aT;
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("com.google.android.googlequicksearchbox.CHANGE_VOICESEARCH_LANGUAGE");
            intentFilter.addAction("com.google.android.googlequicksearchbox.interactor.RESTART_RECOGNITION");
            intentFilter.addAction("com.google.android.googlequicksearchbox.interactor.BOOT_COMPLETED");
            intentFilter.addAction("com.google.android.googlequicksearchbox.FROM_ANY_SCREEN_INTERACTOR_FLAG_CHANGED");
            intentFilter.addAction("com.google.android.googlequicksearchbox.ACTION_UPDATE_HOTWORD_INFORMATION_AND_HOTWORD_STATE");
            intentFilter.addAction("com.google.android.googlequicksearchbox.interactor.HOTWORD_MODEL_DOWNLOADED");
            intentFilter.addAction("com.google.android.googlequicksearchbox.FROM_ANY_SCREEN_PREFERENCE_CHANGED");
            intentFilter.addAction("com.google.android.googlequicksearchbox.START_HOTWORD");
            intentFilter.addAction("com.google.android.googlequicksearchbox.STOP_HOTWORD");
            intentFilter.addAction("com.google.android.googlequicksearchbox.START_DSP_HOTWORD");
            intentFilter.addAction("com.google.android.googlequicksearchbox.STOP_DSP_HOTWORD");
            intentFilter.addAction("com.google.android.voiceinteraction.NEW_SPEAKER_ID_MODEL_AVAILABLE");
            intentFilter.addAction("com.google.android.googlequicksearchbox.action.HOTWORD_ENROLLMENT");
            registerReceiver(broadcastReceiver, intentFilter, "android.permission.MANAGE_VOICE_KEYPHRASES", this.f118660aF);
        }
        C58528ij<IntentFilter> ijVar = C74444a.f208520b;
        if (ijVar != null && !ijVar.isEmpty()) {
            C59104x b = f118622a.mo56224b();
            b.mo56378ag(C58975e.f156826a, "GsaVoiceInteractionSrv");
            ((C59052c) ((C59052c) b).mo56372aa(54616)).mo56386p("Registering passthrough");
            for (IntentFilter intentFilter2 : ijVar) {
                if (intentFilter2.countActions() > 0) {
                    registerReceiver(this.f118709be, intentFilter2);
                }
            }
        }
        if (this.f118646R.mo84231f()) {
            ar arVar = (ar) this.f118645Q.mo17428b();
            arVar.k = this;
            this.f118631C = arVar;
            Context context = this.f118637I;
            arVar.getClass();
            IntentFilter intentFilter3 = new IntentFilter();
            intentFilter3.addAction(UiModeManager.ACTION_ENTER_CAR_MODE);
            intentFilter3.addAction(UiModeManager.ACTION_EXIT_CAR_MODE);
            intentFilter3.addAction("com.google.android.apps.gsa.staticplugins.opa.morris.notification.INTENT_ACTION_ENTER_MORRIS_WITHOUT_CARMODE");
            intentFilter3.addAction("com.google.android.apps.gsa.staticplugins.opa.morris.notification.INTENT_ACTION_NOTIFICATION_CLICKED");
            intentFilter3.addAction("com.google.android.apps.gsa.staticplugins.opa.morris.notification.INTENT_ACTION_NOT_DRIVING");
            intentFilter3.addAction("com.google.android.apps.gsa.staticplugins.opa.morris.notification.INTENT_ACTION_NOTIFICATION_DISMISS");
            intentFilter3.addAction("com.google.android.apps.gsa.staticplugins.opa.morris.notification.INTENT_ACTION_LAUNCH_DRIVING_SETTINGS");
            intentFilter3.addAction("com.google.android.apps.gmm.NAVIGATION_STATE");
            if (arVar.d) {
                intentFilter3.addAction("com.google.android.apps.gsa.staticplugins.opa.morris.shared.INTENT_TRANSITIONS_RECEIVED");
            }
            if (arVar.e) {
                if (C91076c.m148792a(arVar.c)) {
                    intentFilter3.addAction("android.bluetooth.device.action.ACL_CONNECTED");
                    intentFilter3.addAction("android.bluetooth.device.action.ACL_DISCONNECTED");
                } else {
                    C59104x d = ar.a.mo56226d();
                    d.mo56378ag(C58975e.f156826a, "Morris.CarModeRcvr");
                    ((C59052c) ((C59052c) d).mo56372aa(1665)).mo56386p("No Bluetooth permissions on S+");
                }
            }
            context.registerReceiver(arVar, intentFilter3);
            ar arVar2 = this.f118631C;
            arVar2.getClass();
            C59104x b2 = ar.a.mo56224b();
            b2.mo56378ag(C58975e.f156826a, "Morris.CarModeRcvr");
            ((C59052c) ((C59052c) b2).mo56372aa(1702)).mo56358K("#registerActivityRecognizer(%b, %b)", arVar2.d, arVar2.e);
            C143673z zVar = arVar2.h;
            if (zVar != null) {
                zVar.mo119019c("MORRIS_DRIVING_SCREEN_REGISTER_AR_COUNT").mo119010b();
            }
            if (arVar2.c.checkSelfPermission("android.permission.ACTIVITY_RECOGNITION") == 0) {
                C143673z zVar2 = arVar2.h;
                if (zVar2 != null) {
                    zVar2.mo119019c("MORRIS_DRIVING_SCREEN_DEVICE_PERMISSION_GRANT_COUNT").mo119010b();
                }
            } else {
                C59104x d2 = ar.a.mo56226d();
                d2.mo56378ag(C58975e.f156826a, "Morris.CarModeRcvr");
                ((C59052c) ((C59052c) d2).mo56372aa(1703)).mo56386p("Activity Recognition permission is not granted.");
                C143673z zVar3 = arVar2.h;
                if (zVar3 != null) {
                    zVar3.mo119019c("MORRIS_DRIVING_SCREEN_DEVICE_PERMISSION_DENIED_COUNT").mo119010b();
                }
            }
            NotificationManager notificationManager = arVar2.i;
            notificationManager.getClass();
            notificationManager.deleteNotificationChannel("com.google.android.apps.gsa.staticplugins.opa.morris2.drivingscreen.NOTIFICATION_CHANNEL");
            NotificationManager notificationManager2 = arVar2.i;
            notificationManager2.getClass();
            notificationManager2.deleteNotificationChannel("morris2.drivingscreen.NOTIFICATION_CHANNEL");
            NotificationChannel notificationChannel = new NotificationChannel("morris2.new.drivingscreen.NOTIFICATION_CHANNEL", arVar2.c.getString(R.string.channel_name), 4);
            notificationChannel.setDescription(arVar2.c.getString(R.string.channel_description));
            String packageName = arVar2.c.getPackageName();
            notificationChannel.setSound(Uri.parse("android.resource://" + packageName + "/2132017468"), (AudioAttributes) null);
            notificationChannel.enableVibration(true);
            notificationChannel.setVibrationPattern(new long[]{0});
            NotificationManager notificationManager3 = arVar2.i;
            notificationManager3.getClass();
            notificationManager3.createNotificationChannel(notificationChannel);
            if (arVar2.j == null && arVar2.d) {
                arVar2.j = C144896b.m235498a(C39239a.m68666a(arVar2.c, C39226b.TAG_CLASSIC_ASSISTANT_AUTO));
                C144907f fVar = arVar2.j;
                fVar.getClass();
                C146006ab b3 = fVar.mo120400b(new ActivityTransitionRequest(ar.b, (String) null, (List) null, (String) null), arVar2.a());
                C146014aj ajVar = (C146014aj) b3;
                ajVar.mo122495n(C146013ai.f394700a, af.a);
                ajVar.mo122494m(C146013ai.f394700a, ah.a);
            }
        }
        for (C89105a aVar : this.f118649U) {
            if (aVar.mo83079c()) {
                aVar.mo83077a(this);
            }
        }
        this.f118662aH = true;
        this.f118720p = this.f118676aV.mo85208a("HotwordBackgroundExecutor");
        mo49433o();
        m80884am();
        int i = this.f118707bc;
        if (i != -1) {
            setDisabledShowContext(i);
        }
        this.f118629A = new C45384am(this);
        this.f118636H.mo85301a(this);
        this.f118660aF.sendEmptyMessageDelayed(10, 600000);
        ((C89862l) this.f118643O.mo27525b()).mo83705b((C89852b) this.f118644P.mo27525b());
        if (Build.VERSION.SDK_INT >= 30) {
            C59104x b4 = f118622a.mo56224b();
            b4.mo56378ag(C58975e.f156826a, "GsaVoiceInteractionSrv");
            ((C59052c) ((C59052c) b4).mo56372aa(54610)).mo56386p("Registering AppOpsListener");
            C39224b.m68653a(this.f118637I, this.f118676aV.mo85210c(":interactor Permissions"), C58485gu.m89842j((Collection) this.f118691am.mo27525b()));
        }
        o oVar = (o) this.f118680ab.mo27525b();
        C45416x xVar = this.f118675aU;
        C60870cx a = ((ag) oVar.j.mo27525b()).a("com.google.android.phone.lockscreen");
        oVar.i = true;
        new C90873ag(C60856cj.m92895d(oVar.a(), a).mo57334a(new j(a), C60826bg.f164896a), oVar.k, "registerCallback", new com.google.android.apps.gsa.assistant.shared.e.k(oVar, xVar)).mo85223a(l.a);
        C59104x b5 = f118622a.mo56224b();
        b5.mo56378ag(C58975e.f156826a, "GsaVoiceInteractionSrv");
        ((C59052c) ((C59052c) b5).mo56372aa(54609)).mo56386p("hotwordHelper registerDeviceConnectedListener");
        ((C89606ad) ((C58847bk) this.f118639K).f156646a).mo83461g(this.f118698at);
        if (mo49429k().mo85405j(C90086ek.f250427ct)) {
            IntentFilter intentFilter4 = new IntentFilter();
            intentFilter4.addAction("action_auto_projected_client_info");
            registerReceiver(this.f118673aS, intentFilter4);
            return;
        }
        return;
        throw th;
    }

    public final void onShutdown() {
        C59104x b = f118622a.mo56224b();
        b.mo56378ag(C58975e.f156826a, "GsaVoiceInteractionSrv");
        ((C59052c) ((C59052c) b).mo56372aa(54612)).mo56386p("onShutdown");
        C58833ax axVar = (C58833ax) this.f118687ai.mo27525b();
        if (axVar.mo56113h()) {
            C47538ax c = ((C47770dh) this.f118690al.mo27525b()).mo51613c("ApaVoiceInteractionService#onShutdown");
            try {
                ((C33489a) axVar.mo56107c()).mo38903b();
                if (c != null) {
                    c.close();
                }
            } catch (Throwable th) {
                C45364a.m80954a(th, th);
            }
        }
        if (this.f118662aH) {
            synchronized (this.f118726v) {
                C118719g gVar = this.f118632D;
                if (gVar != null && gVar.f331139b.mo23879i()) {
                    this.f118632D.mo103921m();
                }
            }
            this.f118662aH = false;
            o oVar = (o) this.f118680ab.mo27525b();
            if (oVar.i) {
                try {
                    if (!(oVar.e == null || oVar.f == null)) {
                        ActivityManager activityManager = (ActivityManager) oVar.c.getSystemService("activity");
                        Class<?> cls = activityManager.getClass();
                        Class[] clsArr = new Class[1];
                        Class cls2 = oVar.e;
                        cls2.getClass();
                        clsArr[0] = cls2;
                        Method method = cls.getMethod("removeOnUidImportanceListener", clsArr);
                        Object[] objArr = new Object[1];
                        Object obj = oVar.f;
                        obj.getClass();
                        objArr[0] = obj;
                        method.invoke(activityManager, objArr);
                    }
                } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException e) {
                    ((C59052c) ((C59052c) ((C59052c) o.a.mo56225c()).mo56382g(e)).mo56372aa(1777)).mo56386p("Could not de-register onUidImportanceListener");
                }
                oVar.g = null;
                BroadcastReceiver broadcastReceiver = oVar.n;
                if (broadcastReceiver != null) {
                    oVar.c.unregisterReceiver(broadcastReceiver);
                    oVar.n = null;
                }
                oVar.o = null;
                oVar.i = false;
            }
            try {
                unregisterReceiver(this.f118674aT);
                C58528ij ijVar = C74444a.f208520b;
                if (ijVar != null && !ijVar.isEmpty()) {
                    unregisterReceiver(this.f118709be);
                }
            } catch (IllegalArgumentException unused) {
            }
            ar arVar = this.f118631C;
            if (arVar != null) {
                this.f118637I.unregisterReceiver(arVar);
                ar arVar2 = this.f118631C;
                C144907f fVar = arVar2.j;
                if (fVar != null) {
                    C146006ab a = fVar.mo120399a(arVar2.a());
                    C146014aj ajVar = (C146014aj) a;
                    ajVar.mo122495n(C146013ai.f394700a, ao.a);
                    ajVar.mo122494m(C146013ai.f394700a, ap.a);
                    arVar2.j = null;
                    NotificationManager notificationManager = arVar2.i;
                    notificationManager.getClass();
                    notificationManager.deleteNotificationChannel("morris2.drivingscreen.NOTIFICATION_CHANNEL");
                }
                this.f118631C = null;
            }
        }
        mo49405T();
        ((C89606ad) ((C58847bk) this.f118639K).f156646a).mo83473s(this.f118698at);
        C87673aa aaVar = this.f118730z;
        if (aaVar != null && aaVar.mo81951w()) {
            aaVar.mo81933e();
        }
        for (C89105a aVar : this.f118649U) {
            if (aVar.mo83079c()) {
                try {
                    aVar.mo83078b();
                    unregisterReceiver(aVar);
                } catch (Exception e2) {
                    C59104x c2 = f118622a.mo56225c();
                    c2.mo56378ag(C58975e.f156826a, "GsaVoiceInteractionSrv");
                    ((C59052c) ((C59052c) ((C59052c) c2).mo56382g(e2)).mo56372aa(54613)).mo56386p("Failed to unregister broadcast receiver");
                }
            }
        }
        mo49407V();
        if (mo49429k().mo85405j(C90086ek.f250427ct)) {
            try {
                unregisterReceiver(this.f118673aS);
            } catch (IllegalArgumentException unused2) {
            }
        }
        this.f118703ay = 0;
        mo49454z(this.f118703ay, "onShutdown");
        this.f118663aI = false;
        stopSelf();
        return;
        throw th;
    }

    public final int onStartCommand(Intent intent, int i, int i2) {
        super.onStartCommand(intent, i, i2);
        C58976aa aaVar = C58975e.f156826a;
        this.f118708bd = intent;
        if (intent != null && intent.getAction().equals("com.google.android.voiceinteraction.DISABLE_CONTEXT")) {
            int i3 = 0;
            if (true == intent.getBooleanExtra("extra_disable_context", false)) {
                i3 = 3;
            }
            setDisabledShowContext(i3);
            return 2;
        } else if (intent == null || !intent.getAction().equals("com.google.android.voiceinteraction.NEW_HOTWORD_MODEL_AVAILABLE")) {
            m80884am();
            return 2;
        } else {
            mo49433o();
            return 2;
        }
    }

    public final boolean onUnbind(Intent intent) {
        C58976aa aaVar = C58975e.f156826a;
        if (intent.getAction().equals("android.service.voice.VoiceInteractionService")) {
            return super.onUnbind(intent);
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x008d, code lost:
        r0 = new com.google.android.apps.gsa.shared.speech.HotwordDetectedEventData(r1, r2);
        r1 = new com.google.android.apps.gsa.search.shared.service.C88489j(com.google.android.apps.gsa.search.shared.service.p6935b.C87739bu.HOTWORD_DETECTED_IN_INTERACTOR);
        r1.mo82015c(r0);
        r0 = r1.mo82013a();
        mo49390E(com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.HOTWORD_DETECTED_IN_INTERACTOR_SENT);
        com.google.android.apps.gsa.p8883x.C118826c.m197213c(((com.google.android.apps.gsa.shared.speech.dumper.C90544ag) r4.f118684af.mo27525b()).f253129b.mo46039a(com.google.android.apps.gsa.shared.speech.dumper.C90572y.f253172a, com.google.common.util.concurrent.C60826bg.f164896a));
        mo49399N("GsaVoiceInteractionSrv#onHotwordDetectedInInteractor", new com.google.android.voiceinteraction.C45400h(r4, r0));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00c4, code lost:
        return;
     */
    /* renamed from: p */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo49443p() {
        /*
            r4 = this;
            com.google.android.apps.gsa.search.shared.service.aa r0 = r4.f118730z
            boolean r0 = r0.mo81951w()
            if (r0 == 0) goto L_0x00cf
            java.lang.Object r0 = r4.f118726v
            monitor-enter(r0)
            com.google.android.apps.gsa.shared.speech.hotword.HotwordResult r1 = r4.f118729y     // Catch:{ all -> 0x00cc }
            if (r1 != 0) goto L_0x0016
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.NOT_SENDING_HOTWORD_MISSING_RESULT_OR_DETECTOR     // Catch:{ all -> 0x00cc }
            r4.mo49390E(r1)     // Catch:{ all -> 0x00cc }
            monitor-exit(r0)     // Catch:{ all -> 0x00cc }
            return
        L_0x0016:
            com.google.android.hotword.service.HotwordInformation r2 = r4.f118664aJ     // Catch:{ all -> 0x00cc }
            if (r2 == 0) goto L_0x0053
            boolean r3 = r2.f395883d     // Catch:{ all -> 0x00cc }
            if (r3 != 0) goto L_0x0022
            boolean r2 = r2.f395885f     // Catch:{ all -> 0x00cc }
            if (r2 == 0) goto L_0x0053
        L_0x0022:
            boolean r2 = r1.mo84676A()     // Catch:{ all -> 0x00cc }
            if (r2 != 0) goto L_0x0053
            com.google.android.apps.gsa.shared.util.v.g r2 = r4.mo49429k()     // Catch:{ all -> 0x00cc }
            com.google.android.apps.gsa.shared.m.d r3 = com.google.android.apps.gsa.shared.p7066m.C90082eg.f250077n     // Catch:{ all -> 0x00cc }
            boolean r2 = r2.mo85405j(r3)     // Catch:{ all -> 0x00cc }
            if (r2 != 0) goto L_0x0053
            com.google.common.f.e r1 = f118622a     // Catch:{ all -> 0x00cc }
            com.google.common.f.x r1 = r1.mo56224b()     // Catch:{ all -> 0x00cc }
            com.google.common.f.aa r2 = com.google.common.p4526f.p4527a.C58975e.f156826a     // Catch:{ all -> 0x00cc }
            java.lang.String r3 = "GsaVoiceInteractionSrv"
            r1.mo56378ag(r2, r3)     // Catch:{ all -> 0x00cc }
            com.google.common.f.c r1 = (com.google.common.p4526f.C59052c) r1     // Catch:{ all -> 0x00cc }
            r2 = 54515(0xd4f3, float:7.6392E-41)
            com.google.common.f.x r1 = r1.mo56372aa(r2)     // Catch:{ all -> 0x00cc }
            com.google.common.f.c r1 = (com.google.common.p4526f.C59052c) r1     // Catch:{ all -> 0x00cc }
            java.lang.String r2 = "Speaker-id is enabled, but not triggered."
            r1.mo56386p(r2)     // Catch:{ all -> 0x00cc }
            monitor-exit(r0)     // Catch:{ all -> 0x00cc }
            return
        L_0x0053:
            android.net.Uri r2 = r1.mo84695m()     // Catch:{ all -> 0x00cc }
            if (r2 == 0) goto L_0x005e
            android.net.Uri r2 = r1.mo84695m()     // Catch:{ all -> 0x00cc }
            goto L_0x008c
        L_0x005e:
            com.google.android.apps.gsa.voiceinteraction.hotword.g r2 = r4.f118632D     // Catch:{ all -> 0x00cc }
            if (r2 == 0) goto L_0x00c5
            android.net.Uri r2 = r2.mo103909a()     // Catch:{ all -> 0x00cc }
            if (r2 != 0) goto L_0x008c
            com.google.common.f.e r1 = f118622a     // Catch:{ all -> 0x00cc }
            com.google.common.f.x r1 = r1.mo56225c()     // Catch:{ all -> 0x00cc }
            com.google.common.f.aa r2 = com.google.common.p4526f.p4527a.C58975e.f156826a     // Catch:{ all -> 0x00cc }
            java.lang.String r3 = "GsaVoiceInteractionSrv"
            r1.mo56378ag(r2, r3)     // Catch:{ all -> 0x00cc }
            com.google.common.f.c r1 = (com.google.common.p4526f.C59052c) r1     // Catch:{ all -> 0x00cc }
            r2 = 54514(0xd4f2, float:7.639E-41)
            com.google.common.f.x r1 = r1.mo56372aa(r2)     // Catch:{ all -> 0x00cc }
            com.google.common.f.c r1 = (com.google.common.p4526f.C59052c) r1     // Catch:{ all -> 0x00cc }
            java.lang.String r2 = "No URI for GenericClientEvent"
            r1.mo56386p(r2)     // Catch:{ all -> 0x00cc }
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.NOT_SENDING_HOTWORD_DETECTED_NO_AUDIO     // Catch:{ all -> 0x00cc }
            r4.mo49390E(r1)     // Catch:{ all -> 0x00cc }
            monitor-exit(r0)     // Catch:{ all -> 0x00cc }
            return
        L_0x008c:
            monitor-exit(r0)     // Catch:{ all -> 0x00cc }
            com.google.android.apps.gsa.shared.speech.HotwordDetectedEventData r0 = new com.google.android.apps.gsa.shared.speech.HotwordDetectedEventData
            r0.<init>(r1, r2)
            com.google.android.apps.gsa.search.shared.service.j r1 = new com.google.android.apps.gsa.search.shared.service.j
            com.google.android.apps.gsa.search.shared.service.b.bu r2 = com.google.android.apps.gsa.search.shared.service.p6935b.C87739bu.HOTWORD_DETECTED_IN_INTERACTOR
            r1.<init>((com.google.android.apps.gsa.search.shared.service.p6935b.C87739bu) r2)
            r1.mo82015c(r0)
            com.google.android.apps.gsa.search.shared.service.ClientEventData r0 = r1.mo82013a()
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.HOTWORD_DETECTED_IN_INTERACTOR_SENT
            r4.mo49390E(r1)
            dagger.a r1 = r4.f118684af
            java.lang.Object r1 = r1.mo27525b()
            com.google.android.apps.gsa.shared.speech.dumper.ag r1 = (com.google.android.apps.gsa.shared.speech.dumper.C90544ag) r1
            com.google.android.libraries.storage.protostore.ab r1 = r1.f253129b
            com.google.android.apps.gsa.shared.speech.dumper.y r2 = com.google.android.apps.gsa.shared.speech.dumper.C90572y.f253172a
            com.google.common.util.concurrent.bg r3 = com.google.common.util.concurrent.C60826bg.f164896a
            com.google.common.util.concurrent.cx r1 = r1.mo46039a(r2, r3)
            com.google.android.apps.gsa.p8883x.C118826c.m197213c(r1)
            com.google.android.voiceinteraction.h r1 = new com.google.android.voiceinteraction.h
            r1.<init>(r4, r0)
            java.lang.String r0 = "GsaVoiceInteractionSrv#onHotwordDetectedInInteractor"
            r4.mo49399N(r0, r1)
            return
        L_0x00c5:
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.NOT_SENDING_HOTWORD_MISSING_RESULT_OR_DETECTOR     // Catch:{ all -> 0x00cc }
            r4.mo49390E(r1)     // Catch:{ all -> 0x00cc }
            monitor-exit(r0)     // Catch:{ all -> 0x00cc }
            return
        L_0x00cc:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x00cc }
            throw r1
        L_0x00cf:
            com.google.android.apps.gsa.shared.logger.b.ae r0 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.NOT_SENDING_HOTWORD_DETECTED_IN_INTERACTOR
            r4.mo49390E(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.voiceinteraction.GsaVoiceInteractionService.mo49443p():void");
    }

    /* renamed from: q */
    public final void mo49444q() {
        C59071e eVar = f118622a;
        C59104x b = eVar.mo56224b();
        b.mo56378ag(C58975e.f156826a, "GsaVoiceInteractionSrv");
        ((C59052c) ((C59052c) b).mo56372aa(54516)).mo56386p("#checkDspStatus");
        synchronized (this.f118726v) {
            HotwordInformation hotwordInformation = this.f118664aJ;
            if (hotwordInformation != null && hotwordInformation.f395882c && hotwordInformation.f395883d && !this.f118660aF.hasMessages(14)) {
                if (this.f118703ay != 0 && !this.f118719o) {
                    int i = this.f118703ay;
                    long j = this.f118714j;
                    if (Boolean.valueOf(i == 2 && (this.f118663aI || ((j > 0 ? 1 : (j == 0 ? 0 : -1)) > 0 && (Math.abs(j - this.f118652X.mo26871c()) > 10000 ? 1 : (Math.abs(j - this.f118652X.mo26871c()) == 10000 ? 0 : -1)) <= 0))).booleanValue()) {
                        C59104x b2 = eVar.mo56224b();
                        b2.mo56378ag(C58975e.f156826a, "GsaVoiceInteractionSrv");
                        ((C59052c) ((C59052c) b2).mo56372aa(54601)).mo56386p("DSP available");
                        ((C19281s) this.f118654Z.mo27525b()).mo24438b(0);
                        C118826c.m197213c(((C90544ag) this.f118684af.mo27525b()).f253129b.mo46039a(C90543af.f253127a, C60826bg.f164896a));
                    } else {
                        C59104x b3 = eVar.mo56224b();
                        b3.mo56378ag(C58975e.f156826a, "GsaVoiceInteractionSrv");
                        ((C59052c) ((C59052c) b3).mo56372aa(54599)).mo56386p("DSP unavailable");
                        ((C19281s) this.f118654Z.mo27525b()).mo24438b(1);
                        C118826c.m197213c(((C90544ag) this.f118684af.mo27525b()).f253129b.mo46039a(C90557j.f253156a, C60826bg.f164896a));
                        if (!this.f118660aF.hasMessages(2)) {
                            if (mo49420ai()) {
                                C59104x b4 = eVar.mo56224b();
                                b4.mo56378ag(C58975e.f156826a, "GsaVoiceInteractionSrv");
                                ((C59052c) ((C59052c) b4).mo56372aa(54600)).mo56386p("DSP unavailable");
                                ((C19281s) this.f118654Z.mo27525b()).mo24438b(3);
                            } else {
                                ((C19281s) this.f118654Z.mo27525b()).mo24438b(2);
                            }
                        }
                    }
                }
                this.f118660aF.sendEmptyMessageDelayed(14, 600000);
            }
        }
    }

    /* renamed from: r */
    public final void mo49445r(Uri uri) {
        if (uri != null) {
            C58976aa aaVar = C58975e.f156826a;
            try {
                ParcelFileDescriptor openFileDescriptor = this.f118637I.getContentResolver().openFileDescriptor(uri, C33259r.f88929b);
                if (openFileDescriptor != null) {
                    openFileDescriptor.close();
                }
            } catch (IOException | SecurityException e) {
                C59104x c = f118622a.mo56225c();
                c.mo56378ag(C58975e.f156826a, "GsaVoiceInteractionSrv");
                ((C59052c) ((C59052c) ((C59052c) c).mo56382g(e)).mo56372aa(54519)).mo56386p("#closeAudioProvider");
            }
        }
    }

    /* renamed from: s */
    public final void mo49446s() {
        synchronized (this.f118726v) {
            this.f118729y = null;
        }
        this.f118660aF.sendEmptyMessageDelayed(6, 5000);
    }

    public final void setDisabledShowContext(int i) {
        if (!mo49414ac()) {
            C58976aa aaVar = C58975e.f156826a;
        } else if (!this.f118662aH) {
            this.f118707bc = i;
        } else {
            try {
                super.setDisabledShowContext(i);
            } catch (SecurityException unused) {
                C58976aa aaVar2 = C58975e.f156826a;
            }
        }
    }

    /* renamed from: t */
    public final void mo49448t() {
        C90851k kVar;
        if (this.f118720p == null && (kVar = this.f118676aV) != null) {
            this.f118720p = kVar.mo85208a("HotwordBackgroundExecutor");
        }
    }

    /* renamed from: u */
    public final void mo49449u() {
        C90851k kVar;
        if (this.f118720p == null && (kVar = this.f118676aV) != null) {
            this.f118720p = kVar.mo85208a("HotwordBackgroundExecutor");
        }
        if (this.f118721q == null) {
            this.f118721q = new C60904dr(this.f118720p);
        }
    }

    /*  JADX ERROR: IndexOutOfBoundsException in pass: RegionMakerVisitor
        java.lang.IndexOutOfBoundsException: Index 0 out of bounds for length 0
        	at java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
        	at java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
        	at java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:248)
        	at java.base/java.util.Objects.checkIndex(Objects.java:372)
        	at java.base/java.util.ArrayList.get(ArrayList.java:458)
        	at jadx.core.dex.nodes.InsnNode.getArg(InsnNode.java:101)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:611)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:598)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    /* renamed from: v */
    final void mo49450v() {
        /*
            r15 = this;
            com.google.common.f.aa r0 = com.google.common.p4526f.p4527a.C58975e.f156826a
            java.lang.Object r0 = r15.f118726v
            monitor-enter(r0)
            com.google.android.hotword.service.HotwordInformation r1 = r15.f118664aJ     // Catch:{ all -> 0x0230 }
            if (r1 == 0) goto L_0x022e
            android.service.voice.AlwaysOnHotwordDetector r1 = r15.f118702ax     // Catch:{ all -> 0x0230 }
            if (r1 == 0) goto L_0x022e
            int r1 = r15.f118703ay     // Catch:{ all -> 0x0230 }
            if (r1 == 0) goto L_0x022e
            int r1 = r15.f118703ay     // Catch:{ all -> 0x0230 }
            r2 = -2
            if (r1 != r2) goto L_0x0018
            goto L_0x022e
        L_0x0018:
            boolean r1 = r15.m80888aq()     // Catch:{ all -> 0x0230 }
            r2 = 0
            if (r1 == 0) goto L_0x0191
            boolean r1 = r15.m80888aq()     // Catch:{ all -> 0x0230 }
            if (r1 != 0) goto L_0x0027
            goto L_0x022c
        L_0x0027:
            java.lang.Object r1 = r15.f118726v     // Catch:{ all -> 0x0230 }
            monitor-enter(r1)     // Catch:{ all -> 0x0230 }
            com.google.android.hotword.service.HotwordInformation r3 = r15.f118664aJ     // Catch:{ all -> 0x018e }
            r3.getClass()
            com.google.android.libraries.assistant.hotword.dsphotwordmodeldownload.DspModelInformation r3 = r3.f395876H     // Catch:{ all -> 0x018e }
            r3.getClass()
            com.google.common.b.ij r4 = f118624aX     // Catch:{ all -> 0x018e }
            java.lang.String r5 = r3.mo23835c()     // Catch:{ all -> 0x018e }
            boolean r4 = r4.contains(r5)     // Catch:{ all -> 0x018e }
            if (r4 == 0) goto L_0x0064
            com.google.common.f.e r2 = f118622a     // Catch:{ all -> 0x018e }
            com.google.common.f.x r2 = r2.mo56224b()     // Catch:{ all -> 0x018e }
            com.google.common.f.aa r4 = com.google.common.p4526f.p4527a.C58975e.f156826a     // Catch:{ all -> 0x018e }
            java.lang.String r5 = "GsaVoiceInteractionSrv"
            r2.mo56378ag(r4, r5)     // Catch:{ all -> 0x018e }
            com.google.common.f.c r2 = (com.google.common.p4526f.C59052c) r2     // Catch:{ all -> 0x018e }
            r4 = 54652(0xd57c, float:7.6584E-41)
            com.google.common.f.x r2 = r2.mo56372aa(r4)     // Catch:{ all -> 0x018e }
            com.google.common.f.c r2 = (com.google.common.p4526f.C59052c) r2     // Catch:{ all -> 0x018e }
            java.lang.String r4 = "#shouldUpdateDownloadedDspModel:%s is in DSP blacklisted locale"
            java.lang.String r3 = r3.mo23835c()     // Catch:{ all -> 0x018e }
            r2.mo56389s(r4, r3)     // Catch:{ all -> 0x018e }
            monitor-exit(r1)     // Catch:{ all -> 0x018e }
            goto L_0x022c
        L_0x0064:
            int r4 = r3.mo23833a()     // Catch:{ all -> 0x018e }
            java.lang.String r4 = com.google.android.apps.gsa.shared.speech.hotword.C90586c.m147806d(r4)     // Catch:{ all -> 0x018e }
            java.lang.String r5 = r3.mo23835c()     // Catch:{ all -> 0x018e }
            java.lang.String r5 = r15.mo49432n(r5, r4)     // Catch:{ all -> 0x018e }
            java.lang.Object r6 = r15.f118701aw     // Catch:{ all -> 0x018e }
            monitor-enter(r6)     // Catch:{ all -> 0x018e }
            java.lang.String r7 = r15.f118658aD     // Catch:{ all -> 0x018b }
            java.lang.String r8 = r3.mo23835c()     // Catch:{ all -> 0x018b }
            boolean r7 = r7.equals(r8)     // Catch:{ all -> 0x018b }
            if (r7 == 0) goto L_0x0187
            java.lang.String r7 = r15.f118659aE     // Catch:{ all -> 0x018b }
            boolean r4 = r7.equals(r4)     // Catch:{ all -> 0x018b }
            if (r4 != 0) goto L_0x008d
            goto L_0x0187
        L_0x008d:
            monitor-exit(r6)     // Catch:{ all -> 0x018b }
            com.google.android.voiceinteraction.a.g r4 = r15.mo49430l()     // Catch:{ all -> 0x018e }
            if (r4 == 0) goto L_0x00c0
            java.util.UUID r6 = r4.f118739b     // Catch:{ all -> 0x018e }
            java.util.UUID r7 = r3.mo23837e()     // Catch:{ all -> 0x018e }
            boolean r6 = r6.equals(r7)     // Catch:{ all -> 0x018e }
            if (r6 == 0) goto L_0x00c0
            int r6 = r4.f118742e     // Catch:{ all -> 0x018e }
            int r7 = r3.mo23834b()     // Catch:{ all -> 0x018e }
            if (r6 != r7) goto L_0x00c0
            java.util.List r4 = r4.f118741d     // Catch:{ all -> 0x018e }
            com.google.common.b.gu r4 = com.google.common.p4522b.C58485gu.m89842j(r4)     // Catch:{ all -> 0x018e }
            j$.util.stream.Stream r4 = p3186j$.util.Collection.EL.stream(r4)     // Catch:{ all -> 0x018e }
            com.google.android.voiceinteraction.f r6 = new com.google.android.voiceinteraction.f     // Catch:{ all -> 0x018e }
            r6.<init>(r3, r5)     // Catch:{ all -> 0x018e }
            boolean r3 = r4.anyMatch(r6)     // Catch:{ all -> 0x018e }
            if (r3 == 0) goto L_0x00c0
            monitor-exit(r1)     // Catch:{ all -> 0x018e }
            goto L_0x022c
        L_0x00c0:
            monitor-exit(r1)     // Catch:{ all -> 0x018e }
            com.google.android.hotword.service.HotwordInformation r1 = r15.f118664aJ     // Catch:{ all -> 0x0230 }
            r1.getClass()
            com.google.android.libraries.assistant.hotword.dsphotwordmodeldownload.DspModelInformation r1 = r1.f395876H     // Catch:{ all -> 0x0230 }
            r1.getClass()
            dagger.a r3 = r15.f118679aa     // Catch:{ all -> 0x0230 }
            java.lang.Object r3 = r3.mo27525b()     // Catch:{ all -> 0x0230 }
            com.google.android.libraries.storage.a.k r3 = (com.google.android.libraries.storage.p3304a.C42813k) r3     // Catch:{ all -> 0x0230 }
            java.lang.String r4 = r1.mo23836d()     // Catch:{ all -> 0x0230 }
            android.net.Uri r4 = android.net.Uri.parse(r4)     // Catch:{ all -> 0x0230 }
            byte[] r8 = com.google.android.apps.gsa.speech.microdetection.p7303a.p7308e.C92513g.m152178g(r3, r4)     // Catch:{ all -> 0x0230 }
            if (r8 == 0) goto L_0x0170
            int r3 = r1.mo23833a()     // Catch:{ all -> 0x0230 }
            java.lang.String r13 = com.google.android.apps.gsa.shared.speech.hotword.C90586c.m147806d(r3)     // Catch:{ all -> 0x0230 }
            java.lang.String r3 = r1.mo23835c()     // Catch:{ all -> 0x0230 }
            java.lang.String r3 = r15.mo49432n(r3, r13)     // Catch:{ all -> 0x0230 }
            int r10 = r1.mo23833a()     // Catch:{ all -> 0x0230 }
            java.util.Locale r12 = java.util.Locale.forLanguageTag(r3)     // Catch:{ all -> 0x0230 }
            com.google.android.voiceinteraction.a.a r3 = new com.google.android.voiceinteraction.a.a     // Catch:{ all -> 0x0230 }
            java.lang.String r4 = "android.permission.INTERACT_ACROSS_USERS"
            int r4 = androidx.core.content.C1882h.m5137c(r15, r4)     // Catch:{ IllegalAccessException | NoSuchMethodException | InvocationTargetException -> 0x0122 }
            if (r4 != 0) goto L_0x0122
            java.lang.Class[] r4 = new java.lang.Class[r2]     // Catch:{ IllegalAccessException | NoSuchMethodException | InvocationTargetException -> 0x0122 }
            java.lang.Class<android.app.ActivityManager> r5 = android.app.ActivityManager.class
            java.lang.String r6 = "getCurrentUser"
            java.lang.reflect.Method r4 = r5.getMethod(r6, r4)     // Catch:{ IllegalAccessException | NoSuchMethodException | InvocationTargetException -> 0x0122 }
            java.lang.Object r5 = new java.lang.Object     // Catch:{ IllegalAccessException | NoSuchMethodException | InvocationTargetException -> 0x0122 }
            r5.<init>()     // Catch:{ IllegalAccessException | NoSuchMethodException | InvocationTargetException -> 0x0122 }
            java.lang.Object[] r6 = new java.lang.Object[r2]     // Catch:{ IllegalAccessException | NoSuchMethodException | InvocationTargetException -> 0x0122 }
            java.lang.Object r4 = r4.invoke(r5, r6)     // Catch:{ IllegalAccessException | NoSuchMethodException | InvocationTargetException -> 0x0122 }
            r4.getClass()
            java.lang.Integer r4 = (java.lang.Integer) r4     // Catch:{ IllegalAccessException | NoSuchMethodException | InvocationTargetException -> 0x0122 }
            int r4 = r4.intValue()     // Catch:{ IllegalAccessException | NoSuchMethodException | InvocationTargetException -> 0x0122 }
            goto L_0x0123
        L_0x0122:
            r4 = 0
        L_0x0123:
            r11 = 1
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)     // Catch:{ all -> 0x0230 }
            com.google.common.b.gu r14 = com.google.common.p4522b.C58485gu.m89846n(r4)     // Catch:{ all -> 0x0230 }
            r9 = r3
            r9.<init>(r10, r11, r12, r13, r14)     // Catch:{ all -> 0x0230 }
            com.google.android.voiceinteraction.a.g r4 = new com.google.android.voiceinteraction.a.g     // Catch:{ all -> 0x0230 }
            java.util.UUID r6 = java.util.UUID.nameUUIDFromBytes(r8)     // Catch:{ all -> 0x0230 }
            java.util.UUID r7 = r1.mo23837e()     // Catch:{ all -> 0x0230 }
            r5 = 1
            com.google.android.voiceinteraction.a.d[] r5 = new com.google.android.voiceinteraction.p3559a.C45368d[r5]     // Catch:{ all -> 0x0230 }
            r5[r2] = r3     // Catch:{ all -> 0x0230 }
            java.util.List r9 = java.util.Arrays.asList(r5)     // Catch:{ all -> 0x0230 }
            int r10 = r1.mo23834b()     // Catch:{ all -> 0x0230 }
            r5 = r4
            r5.<init>(r6, r7, r8, r9, r10)     // Catch:{ all -> 0x0230 }
            com.google.android.voiceinteraction.p3559a.C45370f.m80967c(r15, r4)     // Catch:{ e -> 0x0158 }
            r15.m80885an()     // Catch:{ e -> 0x0158 }
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.DSP_ENROLLMENT_VIA_DOWNLOADED_MODEL     // Catch:{ e -> 0x0158 }
            r15.mo49387B(r1)     // Catch:{ e -> 0x0158 }
            goto L_0x022c
        L_0x0158:
            r1 = move-exception
            com.google.common.f.e r2 = f118622a     // Catch:{ all -> 0x0230 }
            com.google.common.f.x r2 = r2.mo56225c()     // Catch:{ all -> 0x0230 }
            com.google.common.f.aa r3 = com.google.common.p4526f.p4527a.C58975e.f156826a     // Catch:{ all -> 0x0230 }
            java.lang.String r4 = "GsaVoiceInteractionSrv"
            r2.mo56378ag(r3, r4)     // Catch:{ all -> 0x0230 }
            java.lang.String r3 = "failed to updateKeyphraseSoundModel"
            r4 = 54538(0xd50a, float:7.6424E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r2).mo56382g(r1)).mo56372aa(r4)).mo56386p(r3)     // Catch:{ all -> 0x0230 }
            goto L_0x022c
        L_0x0170:
            com.google.common.f.e r2 = f118622a     // Catch:{ all -> 0x0230 }
            com.google.common.f.x r2 = r2.mo56225c()     // Catch:{ all -> 0x0230 }
            com.google.common.f.aa r3 = com.google.common.p4526f.p4527a.C58975e.f156826a     // Catch:{ all -> 0x0230 }
            java.lang.String r4 = "GsaVoiceInteractionSrv"
            r2.mo56378ag(r3, r4)     // Catch:{ all -> 0x0230 }
            java.lang.String r3 = "DspModelInformation URI contained no data. %s"
            r4 = 54535(0xd507, float:7.642E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r2).mo56372aa(r4)).mo56389s(r3, r1)     // Catch:{ all -> 0x0230 }
            goto L_0x022c
        L_0x0187:
            monitor-exit(r6)     // Catch:{ all -> 0x018b }
            monitor-exit(r1)     // Catch:{ all -> 0x018e }
            goto L_0x022c
        L_0x018b:
            r2 = move-exception
            monitor-exit(r6)     // Catch:{ all -> 0x018b }
            throw r2     // Catch:{ all -> 0x018e }
        L_0x018e:
            r2 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x018e }
            throw r2     // Catch:{ all -> 0x0230 }
        L_0x0191:
            android.content.Context r1 = r15.f118637I     // Catch:{ all -> 0x0230 }
            android.content.ContentResolver r1 = r1.getContentResolver()     // Catch:{ all -> 0x0230 }
            java.lang.String r3 = "device_provisioned"
            int r1 = android.provider.Settings.Global.getInt(r1, r3, r2)     // Catch:{ all -> 0x0230 }
            if (r1 != 0) goto L_0x01b0
            boolean r1 = androidx.core.p094f.C1888a.m5148b()     // Catch:{ all -> 0x0230 }
            if (r1 != 0) goto L_0x01b0
            com.google.android.voiceinteraction.ao r1 = r15.f118660aF     // Catch:{ all -> 0x0230 }
            r2 = 13
            r3 = 2000(0x7d0, double:9.88E-321)
            r1.sendEmptyMessageDelayed(r2, r3)     // Catch:{ all -> 0x0230 }
            goto L_0x022c
        L_0x01b0:
            java.lang.Object r1 = r15.f118701aw     // Catch:{ RemoteException -> 0x0216 }
            monitor-enter(r1)     // Catch:{ RemoteException -> 0x0216 }
            int r2 = r15.f118703ay     // Catch:{ all -> 0x0213 }
            r3 = -1
            if (r2 != r3) goto L_0x01db
            com.google.common.f.e r2 = f118622a     // Catch:{ all -> 0x0213 }
            com.google.common.f.x r2 = r2.mo56224b()     // Catch:{ all -> 0x0213 }
            com.google.common.f.aa r3 = com.google.common.p4526f.p4527a.C58975e.f156826a     // Catch:{ all -> 0x0213 }
            java.lang.String r4 = "GsaVoiceInteractionSrv"
            r2.mo56378ag(r3, r4)     // Catch:{ all -> 0x0213 }
            com.google.common.f.c r2 = (com.google.common.p4526f.C59052c) r2     // Catch:{ all -> 0x0213 }
            r3 = 54552(0xd518, float:7.6444E-41)
            com.google.common.f.x r2 = r2.mo56372aa(r3)     // Catch:{ all -> 0x0213 }
            com.google.common.f.c r2 = (com.google.common.p4526f.C59052c) r2     // Catch:{ all -> 0x0213 }
            java.lang.String r3 = "#fireCreateEnrollIntent: keypahrase=%s and locale=%s not supported by system enrollment app"
            java.lang.String r4 = r15.f118659aE     // Catch:{ all -> 0x0213 }
            java.lang.String r5 = r15.f118658aD     // Catch:{ all -> 0x0213 }
            r2.mo56354G(r3, r4, r5)     // Catch:{ all -> 0x0213 }
            monitor-exit(r1)     // Catch:{ all -> 0x0213 }
            goto L_0x022c
        L_0x01db:
            com.google.common.b.ij r2 = f118624aX     // Catch:{ all -> 0x0213 }
            java.lang.String r3 = r15.f118658aD     // Catch:{ all -> 0x0213 }
            boolean r2 = r2.contains(r3)     // Catch:{ all -> 0x0213 }
            if (r2 == 0) goto L_0x0206
            com.google.common.f.e r2 = f118622a     // Catch:{ all -> 0x0213 }
            com.google.common.f.x r2 = r2.mo56224b()     // Catch:{ all -> 0x0213 }
            com.google.common.f.aa r3 = com.google.common.p4526f.p4527a.C58975e.f156826a     // Catch:{ all -> 0x0213 }
            java.lang.String r4 = "GsaVoiceInteractionSrv"
            r2.mo56378ag(r3, r4)     // Catch:{ all -> 0x0213 }
            com.google.common.f.c r2 = (com.google.common.p4526f.C59052c) r2     // Catch:{ all -> 0x0213 }
            r3 = 54551(0xd517, float:7.6442E-41)
            com.google.common.f.x r2 = r2.mo56372aa(r3)     // Catch:{ all -> 0x0213 }
            com.google.common.f.c r2 = (com.google.common.p4526f.C59052c) r2     // Catch:{ all -> 0x0213 }
            java.lang.String r3 = "#fireCreateEnrollIntent:%s is in DSP blacklisted locale"
            java.lang.String r4 = r15.f118658aD     // Catch:{ all -> 0x0213 }
            r2.mo56389s(r3, r4)     // Catch:{ all -> 0x0213 }
            monitor-exit(r1)     // Catch:{ all -> 0x0213 }
            goto L_0x022c
        L_0x0206:
            com.google.android.voiceinteraction.as r2 = r15.f118670aP     // Catch:{ all -> 0x0213 }
            java.lang.String r3 = r15.f118658aD     // Catch:{ all -> 0x0213 }
            android.content.Intent r2 = r2.mo49493d(r3)     // Catch:{ all -> 0x0213 }
            r15.mo49451w(r2)     // Catch:{ all -> 0x0213 }
            monitor-exit(r1)     // Catch:{ all -> 0x0213 }
            goto L_0x022c
        L_0x0213:
            r2 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x0213 }
            throw r2     // Catch:{ RemoteException -> 0x0216 }
        L_0x0216:
            r1 = move-exception
            com.google.common.f.e r2 = f118622a     // Catch:{ all -> 0x0230 }
            com.google.common.f.x r2 = r2.mo56225c()     // Catch:{ all -> 0x0230 }
            com.google.common.f.aa r3 = com.google.common.p4526f.p4527a.C58975e.f156826a     // Catch:{ all -> 0x0230 }
            java.lang.String r4 = "GsaVoiceInteractionSrv"
            r2.mo56378ag(r3, r4)     // Catch:{ all -> 0x0230 }
            java.lang.String r3 = "RemoteException"
            r4 = 54550(0xd516, float:7.6441E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r2).mo56382g(r1)).mo56372aa(r4)).mo56386p(r3)     // Catch:{ all -> 0x0230 }
        L_0x022c:
            monitor-exit(r0)     // Catch:{ all -> 0x0230 }
            return
        L_0x022e:
            monitor-exit(r0)     // Catch:{ all -> 0x0230 }
            return
        L_0x0230:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0230 }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.voiceinteraction.GsaVoiceInteractionService.mo49450v():void");
    }

    /* renamed from: w */
    public final void mo49451w(Intent intent) {
        if (intent == null) {
            C59104x c = f118622a.mo56225c();
            c.mo56378ag(C58975e.f156826a, "GsaVoiceInteractionSrv");
            ((C59052c) ((C59052c) c).mo56372aa(54561)).mo56386p("no valid enrollment intent");
            return;
        }
        C59071e eVar = f118622a;
        C59104x b = eVar.mo56224b();
        b.mo56378ag(C58975e.f156826a, "GsaVoiceInteractionSrv");
        ((C59052c) ((C59052c) b).mo56372aa(54554)).mo56386p("Firing Enroll Intent");
        m80885an();
        try {
            if (!this.f118637I.getPackageManager().queryBroadcastReceivers(intent, 65536).isEmpty()) {
                C59104x b2 = eVar.mo56224b();
                b2.mo56378ag(C58975e.f156826a, "GsaVoiceInteractionSrv");
                ((C59052c) ((C59052c) b2).mo56372aa(54560)).mo56389s("Firing broadcastreceiver Intent: %s", intent);
                mo49387B(C89849ae.DSP_ENROLLMENT_INTENT_TO_RECEIVER_SENT);
                sendBroadcast(intent);
            } else if (!this.f118637I.getPackageManager().queryIntentServices(intent, 65536).isEmpty()) {
                C59104x b3 = eVar.mo56224b();
                b3.mo56378ag(C58975e.f156826a, "GsaVoiceInteractionSrv");
                ((C59052c) ((C59052c) b3).mo56372aa(54559)).mo56389s("Firing foreground service Intent: %s", intent);
                mo49387B(C89849ae.DSP_ENROLLMENT_INTENT_TO_SERVICE_SENT);
                startForegroundService(intent);
            } else if (!this.f118637I.getPackageManager().queryIntentActivities(intent, 65536).isEmpty()) {
                intent.addFlags(268435456);
                C59104x b4 = eVar.mo56224b();
                b4.mo56378ag(C58975e.f156826a, "GsaVoiceInteractionSrv");
                ((C59052c) ((C59052c) b4).mo56372aa(54557)).mo56386p("Firing activity Intent");
                mo49387B(C89849ae.DSP_ENROLLMENT_INTENT_TO_ACTIVITY_SENT);
                startActivity(intent);
            } else {
                C59104x c2 = eVar.mo56225c();
                c2.mo56378ag(C58975e.f156826a, "GsaVoiceInteractionSrv");
                C59052c cVar = (C59052c) c2;
                cVar.mo56380ai(C58979ad.FULL);
                ((C59052c) cVar.mo56372aa(54555)).mo56386p("failed to determine type of enrollment application");
                mo49402Q();
            }
        } catch (SecurityException e) {
            C59104x c3 = f118622a.mo56225c();
            c3.mo56378ag(C58975e.f156826a, "GsaVoiceInteractionSrv");
            ((C59052c) ((C59052c) ((C59052c) c3).mo56382g(e)).mo56372aa(54556)).mo56386p("Failed to fire enrollment intent");
            mo49402Q();
        }
    }

    /* renamed from: x */
    public final void mo49452x() {
        C45393av avVar = this.f118665aK;
        if (avVar != null) {
            try {
                avVar.mo49509a();
            } catch (RemoteException e) {
                C59104x c = f118622a.mo56225c();
                c.mo56378ag(C58975e.f156826a, "GsaVoiceInteractionSrv");
                ((C59052c) ((C59052c) ((C59052c) c).mo56382g(e)).mo56372aa(54576)).mo56386p("Executing initialization callback failed.");
            }
            this.f118665aK = null;
        }
    }

    /* renamed from: y */
    public final void mo49453y(boolean z) {
        synchronized (this.f118726v) {
            boolean z2 = true;
            if (!z) {
                try {
                    HotwordInformation hotwordInformation = this.f118664aJ;
                    if (C118726n.m197095c(hotwordInformation.f395869A) && (!hotwordInformation.f395884e || this.f118703ay == 0)) {
                        HotwordInformation hotwordInformation2 = this.f118664aJ;
                        if (!hotwordInformation2.f395877I || hotwordInformation2.f395873E) {
                            z2 = false;
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (this.f118632D == null) {
                if (z2) {
                    this.f118632D = new C118719g(this.f118634F, this.f118720p, this.f118676aV.mo85210c("HotwordLightweightExecutor"), this.f118700av, this.f118641M, this, this.f118682ad, this.f118651W, this.f118639K, this.f118681ac);
                }
                this.f118660aF.sendEmptyMessage(7);
            }
        }
    }

    /* renamed from: z */
    public final void mo49454z(int i, String str) {
        C48037d b;
        if (this.f118716l.length() != 0) {
            this.f118716l = String.valueOf(this.f118716l).concat(", ");
        }
        String str2 = this.f118716l;
        String format = f118627d.format(Long.valueOf(System.currentTimeMillis()));
        this.f118716l = str2 + i + " | " + format + " (" + str + ")";
        if (i == -2) {
            mo49386A(C89849ae.DSP_HARDWARE_UNAVAILABLE);
        } else if (i == -1) {
            mo49386A(C89849ae.DSP_KEYPHRASE_LOCALE_UNSUPPORTED);
        } else if (i == 1) {
            mo49387B(C89849ae.DSP_KEYPHRASE_LOCALE_UNENROLLED);
        } else if (i == 2 && (!mo49419ah() || !this.f118724t)) {
            mo49386A(C89849ae.DSP_KEYPHRASE_LOCALE_ENROLLED);
            C45371g l = mo49430l();
            if (l != null) {
                synchronized (this.f118701aw) {
                    C90584f fVar = C90584f.UNKNOWN;
                    String str3 = this.f118659aE;
                    if (str3 == null || !str3.equals("Ok Google")) {
                        String str4 = this.f118659aE;
                        if (str4 != null && str4.equals("X Google")) {
                            fVar = C90584f.OK_HEY_GOOGLE;
                        }
                    } else {
                        fVar = C90584f.OK_GOOGLE;
                    }
                    ((C90544ag) this.f118684af.mo27525b()).mo84665f(l.f118742e, this.f118658aD, fVar);
                }
            }
        }
        if (i > 0 && this.f118683ae.mo27525b() != null && C1882h.m5137c(this.f118637I, "android.permission.MANAGE_SOUND_TRIGGER") == 0 && (b = ((C48034a) this.f118683ae.mo27525b()).mo53133b()) != null) {
            ((C90544ag) this.f118684af.mo27525b()).mo84664e(b.mo53135b(), b.mo53134a());
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public final int mo49423e() {
        AlwaysOnHotwordDetector alwaysOnHotwordDetector;
        if (this.f118703ay != 2 || (alwaysOnHotwordDetector = this.f118702ax) == null) {
            C59104x b = f118622a.mo56224b();
            b.mo56378ag(C58975e.f156826a, "GsaVoiceInteractionSrv");
            ((C59052c) ((C59052c) b).mo56372aa(54500)).mo56393w("Not calling getSupportedRecognitionModes. Availability: %d. SupportedRecognitionModes: %d", this.f118703ay, this.f118656aB);
            if (mo49413ab()) {
                return this.f118656aB;
            }
            return 0;
        }
        try {
            return alwaysOnHotwordDetector.getSupportedRecognitionModes();
        } catch (UnsupportedOperationException e) {
            C59104x c = f118622a.mo56225c();
            c.mo56378ag(C58975e.f156826a, "GsaVoiceInteractionSrv");
            ((C59052c) ((C59052c) ((C59052c) c).mo56382g(e)).mo56372aa(54501)).mo56386p("UnsupportedOperationException");
            return 0;
        } catch (Exception e2) {
            C59104x c2 = f118622a.mo56225c();
            c2.mo56378ag(C58975e.f156826a, "GsaVoiceInteractionSrv");
            ((C59052c) ((C59052c) ((C59052c) c2).mo56382g(e2)).mo56372aa(54502)).mo56386p("Error getting supported recognition modes");
            return 0;
        }
    }
}
