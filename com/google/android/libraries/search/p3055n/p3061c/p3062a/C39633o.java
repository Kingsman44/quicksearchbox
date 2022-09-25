package com.google.android.libraries.search.p3055n.p3061c.p3062a;

import android.content.Context;
import android.os.Build;
import android.service.voice.AlwaysOnHotwordDetector;
import androidx.core.content.C1882h;
import com.evernote.android.state.BuildConfig;
import com.google.android.hotword.service.HotwordInformation;
import com.google.android.libraries.p1730f.C21370a;
import com.google.android.libraries.search.assistant.invocation.android.voiceinteraction.p2589a.p2590a.C33497h;
import com.google.android.libraries.search.p3055n.p3061c.p3062a.p3063a.C39383c;
import com.google.android.libraries.search.p3055n.p3061c.p3062a.p3063a.C39384d;
import com.google.android.libraries.search.p3055n.p3061c.p3062a.p3065c.C39457g;
import com.google.android.libraries.search.p3055n.p3061c.p3062a.p3065c.C39458h;
import com.google.android.libraries.search.p3055n.p3061c.p3062a.p3068f.p3069a.C39526i;
import com.google.android.libraries.search.p3055n.p3061c.p3062a.p3071h.C39580br;
import com.google.apps.tiktok.concurrent.C46428ao;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47632e;
import com.google.common.base.C58833ax;
import com.google.common.base.C58837ba;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60866ct;
import com.google.common.util.concurrent.C60870cx;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.atomic.AtomicBoolean;
import p3186j$.time.Duration;

/* renamed from: com.google.android.libraries.search.n.c.a.o */
/* compiled from: PG */
public final class C39633o implements C39384d {

    /* renamed from: a */
    public static final C59071e f104316a = C59071e.m91332i("com.google.android.libraries.search.n.c.a.o");

    /* renamed from: b */
    public static final Duration f104317b = Duration.ofSeconds(15);

    /* renamed from: c */
    public final C47632e f104318c;

    /* renamed from: d */
    public final Executor f104319d;

    /* renamed from: e */
    public final Executor f104320e;

    /* renamed from: f */
    public final C39580br f104321f;

    /* renamed from: g */
    public final C46428ao f104322g;

    /* renamed from: h */
    public final C21370a f104323h;

    /* renamed from: i */
    public final ScheduledExecutorService f104324i;

    /* renamed from: j */
    public final HotwordInformation f104325j;

    /* renamed from: k */
    public final AtomicBoolean f104326k = new AtomicBoolean(false);

    /* renamed from: l */
    public final C39458h f104327l;

    /* renamed from: m */
    public final C39526i f104328m;

    /* renamed from: n */
    public final C39396al f104329n;

    /* renamed from: o */
    public String f104330o = "NOT_READY";

    /* renamed from: p */
    public C39390af f104331p;

    /* renamed from: q */
    public AlwaysOnHotwordDetector f104332q;

    /* renamed from: r */
    public C39457g f104333r;

    /* renamed from: s */
    public final C33497h f104334s;

    /* renamed from: t */
    private final Context f104335t;

    /* renamed from: u */
    private String f104336u = BuildConfig.FLAVOR;

    public C39633o(C33497h hVar, C39425bb bbVar, C39396al alVar, C39580br brVar, C39526i iVar, Context context, C21370a aVar, C39458h hVar2, Executor executor, C46428ao aoVar, Executor executor2, ScheduledExecutorService scheduledExecutorService, C39383c cVar) {
        this.f104325j = bbVar.mo41840a();
        this.f104329n = alVar;
        this.f104320e = executor;
        this.f104319d = executor2;
        this.f104322g = aoVar;
        this.f104334s = hVar;
        this.f104321f = brVar;
        this.f104318c = new C47632e();
        this.f104323h = aVar;
        this.f104324i = scheduledExecutorService;
        this.f104327l = hVar2;
        this.f104335t = context;
        this.f104328m = iVar;
        cVar.mo41795c(this);
    }

    /* renamed from: a */
    public final C39395ak mo41961a() {
        int i = (Build.VERSION.SDK_INT < 30 || C1882h.m5137c(this.f104335t, "android.permission.SOUND_TRIGGER_RUN_IN_BATTERY_SAVER") != 0) ? 1 : 17;
        try {
            AlwaysOnHotwordDetector alwaysOnHotwordDetector = this.f104332q;
            alwaysOnHotwordDetector.getClass();
            boolean startRecognition = alwaysOnHotwordDetector.startRecognition(i);
            C39394aj c = C39395ak.m68799c();
            c.mo41811b(startRecognition);
            if (startRecognition) {
                C59104x b = f104316a.mo56224b();
                b.mo56378ag(C58975e.f156826a, "AOHotwordDetectorMgr");
                ((C59052c) ((C59052c) b).mo56372aa(53489)).mo56386p("Start DSP hotword detection successfully.");
                this.f104326k.set(true);
                return c.mo41810a();
            }
            C59104x c2 = f104316a.mo56225c();
            c2.mo56378ag(C58975e.f156826a, "AOHotwordDetectorMgr");
            ((C59052c) ((C59052c) c2).mo56372aa(53486)).mo56386p("Start DSP hotword detection failed!");
            C39638t tVar = new C39638t();
            tVar.mo41807b(C39392ah.DSP_START_ERROR);
            tVar.f104350a = "Start DSP hotword detection failed!";
            ((C39640v) c).f104354a = C58833ax.m90834k(tVar.mo41806a());
            return c.mo41810a();
        } catch (IllegalStateException | UnsupportedOperationException e) {
            C59104x c3 = f104316a.mo56225c();
            c3.mo56378ag(C58975e.f156826a, "AOHotwordDetectorMgr");
            ((C59052c) ((C59052c) ((C59052c) c3).mo56382g(e)).mo56372aa(53487)).mo56386p("Cannot start DSP hotword detection due to exception!");
            C39394aj c4 = C39395ak.m68799c();
            C39638t tVar2 = new C39638t();
            tVar2.mo41807b(C39392ah.DSP_START_ERROR);
            tVar2.f104350a = C58837ba.m90858g(e.getMessage());
            ((C39640v) c4).f104354a = C58833ax.m90834k(tVar2.mo41806a());
            return c4.mo41810a();
        } catch (Exception e2) {
            C59104x c5 = f104316a.mo56225c();
            c5.mo56378ag(C58975e.f156826a, "AOHotwordDetectorMgr");
            ((C59052c) ((C59052c) ((C59052c) c5).mo56382g(e2)).mo56372aa(53488)).mo56386p("Error starting DSP hotword detection");
            C39394aj c6 = C39395ak.m68799c();
            C39638t tVar3 = new C39638t();
            tVar3.mo41807b(C39392ah.DSP_START_ERROR);
            tVar3.f104350a = C58837ba.m90858g(e2.getMessage());
            ((C39640v) c6).f104354a = C58833ax.m90834k(tVar3.mo41806a());
            return c6.mo41810a();
        }
    }

    /* renamed from: b */
    public final C60870cx mo41962b() {
        boolean z;
        if (this.f104332q == null || !this.f104326k.get()) {
            C59104x d = f104316a.mo56226d();
            d.mo56378ag(C58975e.f156826a, "AOHotwordDetectorMgr");
            ((C59052c) ((C59052c) d).mo56372aa(53499)).mo56386p("DSP Hotword detection is not running; ignore stop call!");
        } else {
            try {
                AlwaysOnHotwordDetector alwaysOnHotwordDetector = this.f104332q;
                alwaysOnHotwordDetector.getClass();
                z = alwaysOnHotwordDetector.stopRecognition();
            } catch (Exception e) {
                C59104x c = f104316a.mo56225c();
                c.mo56378ag(C58975e.f156826a, "AOHotwordDetectorMgr");
                ((C59052c) ((C59052c) ((C59052c) c).mo56382g(e)).mo56372aa(53502)).mo56386p("Error stopping DSP hotword detection");
                z = false;
            }
            this.f104326k.set(false);
            if (!z) {
                C59104x c2 = f104316a.mo56225c();
                c2.mo56378ag(C58975e.f156826a, "AOHotwordDetectorMgr");
                ((C59052c) ((C59052c) c2).mo56372aa(53501)).mo56386p("Failed to stop alwaysOnHotwordDetector");
            } else {
                C59104x b = f104316a.mo56224b();
                b.mo56378ag(C58975e.f156826a, "AOHotwordDetectorMgr");
                ((C59052c) ((C59052c) b).mo56372aa(53500)).mo56386p("Successfully stop alwaysOnHotwordDetector");
            }
        }
        return C60866ct.f164955a;
    }

    /* renamed from: d */
    public final void mo41963d(String str) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("MM-dd HH:mm:ss", Locale.US);
        if (!this.f104336u.isEmpty()) {
            this.f104336u = String.valueOf(this.f104336u).concat("\n");
        }
        String str2 = this.f104336u;
        String format = simpleDateFormat.format(Long.valueOf(this.f104323h.mo26870b()));
        this.f104336u = str2 + "\t \t     " + format + " " + str;
    }

    /* renamed from: u */
    public final String mo41796u() {
        StringBuilder sb = new StringBuilder("\t \t AlwaysOnHotwordDetectorManager\n\t \t   DSP Running: ");
        sb.append(this.f104326k.get());
        sb.append("\n\t \t   Current Availability: ");
        sb.append(this.f104330o);
        sb.append("\n\t \t   Change History:\n");
        if (this.f104336u.isEmpty()) {
            sb.append("\t \t     No Updates Reported\n");
        } else {
            sb.append(this.f104336u);
            sb.append("\n");
        }
        return sb.toString();
    }
}
