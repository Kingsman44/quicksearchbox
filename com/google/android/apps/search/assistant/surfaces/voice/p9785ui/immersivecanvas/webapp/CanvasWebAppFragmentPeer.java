package com.google.android.apps.search.assistant.surfaces.voice.p9785ui.immersivecanvas.webapp;

import android.content.Context;
import android.util.Base64;
import androidx.lifecycle.C2384o;
import com.evernote.android.state.BuildConfig;
import com.google.android.apps.search.assistant.surfaces.voice.controller.p9532ui.actions.C127118j;
import com.google.android.apps.search.assistant.surfaces.voice.p9539d.p9581g.C127353a;
import com.google.android.apps.search.assistant.surfaces.voice.p9785ui.common.p9793c.C129024a;
import com.google.android.apps.search.assistant.surfaces.voice.p9785ui.host.p9828a.C129540c;
import com.google.android.apps.search.assistant.surfaces.voice.p9785ui.immersivecanvas.exithandler.ExitHandler;
import com.google.android.apps.search.assistant.surfaces.voice.p9785ui.immersivecanvas.p9842a.C129722e;
import com.google.android.apps.search.assistant.surfaces.voice.p9785ui.immersivecanvas.p9845b.C129745a;
import com.google.android.apps.search.assistant.surfaces.voice.p9785ui.immersivecanvas.p9845b.p9846a.C129748c;
import com.google.android.apps.search.assistant.surfaces.voice.p9785ui.immersivecanvas.p9845b.p9846a.C129750e;
import com.google.android.apps.search.assistant.surfaces.voice.p9785ui.immersivecanvas.p9847c.C129755c;
import com.google.android.apps.search.assistant.surfaces.voice.p9785ui.immersivecanvas.webapp.p9851a.C129809a;
import com.google.android.apps.search.assistant.surfaces.voice.shared.p9729a.C128556m;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.web.base.C43262m;
import com.google.android.libraries.web.p3408h.p3409a.p3410a.C43775a;
import com.google.android.libraries.web.postmessage.C43952c;
import com.google.android.libraries.web.postmessage.PostMessageConfig;
import com.google.android.libraries.web.postmessage.internal.C43960g;
import com.google.android.libraries.web.postmessage.internal.C43968o;
import com.google.android.material.snackbar.Snackbar;
import com.google.apps.tiktok.account.AccountId;
import com.google.apps.tiktok.concurrent.futuresmixin.C46438d;
import com.google.apps.tiktok.concurrent.futuresmixin.C46439e;
import com.google.apps.tiktok.concurrent.futuresmixin.C46440f;
import com.google.assistant.p3897e.p3921j.p3926e.C51876cj;
import com.google.assistant.p3897e.p3921j.p3926e.C51885cs;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60872cz;
import com.google.common.util.concurrent.C60888db;
import com.google.protos.p5068j.p5069a.p5070a.p5071a.p5076b.p5077a.p5093b.p5094a.p5099b.p5100a.p5103b.p5104a.C65506a;
import com.google.protos.p5068j.p5069a.p5070a.p5071a.p5076b.p5077a.p5093b.p5094a.p5099b.p5100a.p5103b.p5104a.C65507aa;
import com.google.protos.p5068j.p5069a.p5070a.p5071a.p5076b.p5077a.p5093b.p5094a.p5099b.p5100a.p5103b.p5104a.C65508ab;
import com.google.protos.p5068j.p5069a.p5070a.p5071a.p5076b.p5077a.p5093b.p5094a.p5099b.p5100a.p5103b.p5104a.C65509ac;
import com.google.protos.p5068j.p5069a.p5070a.p5071a.p5076b.p5077a.p5093b.p5094a.p5099b.p5100a.p5103b.p5104a.C65510ad;
import com.google.protos.p5068j.p5069a.p5070a.p5071a.p5076b.p5077a.p5093b.p5094a.p5099b.p5100a.p5103b.p5104a.C65511ae;
import com.google.protos.p5068j.p5069a.p5070a.p5071a.p5076b.p5077a.p5093b.p5094a.p5099b.p5100a.p5103b.p5104a.C65512af;
import com.google.protos.p5068j.p5069a.p5070a.p5071a.p5076b.p5077a.p5093b.p5094a.p5099b.p5100a.p5103b.p5104a.C65513ag;
import com.google.protos.p5068j.p5069a.p5070a.p5071a.p5076b.p5077a.p5093b.p5094a.p5099b.p5100a.p5103b.p5104a.C65518b;
import com.google.protos.p5068j.p5069a.p5070a.p5071a.p5076b.p5077a.p5093b.p5094a.p5099b.p5100a.p5103b.p5104a.C65540x;
import com.google.protos.p5068j.p5069a.p5070a.p5071a.p5076b.p5077a.p5093b.p5094a.p5099b.p5100a.p5103b.p5104a.C65541y;
import com.google.protos.p5068j.p5069a.p5070a.p5071a.p5076b.p5077a.p5093b.p5094a.p5099b.p5100a.p5103b.p5104a.C65542z;
import java.util.concurrent.atomic.AtomicReference;
import org.json.JSONException;
import org.json.JSONObject;
import p3186j$.time.Duration;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.ui.immersivecanvas.webapp.CanvasWebAppFragmentPeer */
/* compiled from: PG */
public final class CanvasWebAppFragmentPeer {

    /* renamed from: a */
    public static final C59071e f356144a = C59071e.m91332i("com.google.android.apps.search.assistant.surfaces.voice.ui.immersivecanvas.webapp.CanvasWebAppFragmentPeer");

    /* renamed from: b */
    public static final C43775a f356145b = new C43775a("immersiveCanvasBridge");

    /* renamed from: c */
    public static final Duration f356146c = Duration.ofSeconds(10);

    /* renamed from: A */
    public final C128556m f356147A;

    /* renamed from: B */
    public final C129722e f356148B;

    /* renamed from: C */
    private final C129750e f356149C;

    /* renamed from: d */
    public final C129836c f356150d;

    /* renamed from: e */
    public final AccountId f356151e;

    /* renamed from: f */
    public final C43952c f356152f;

    /* renamed from: g */
    public final C129806c f356153g = new C129806c();

    /* renamed from: h */
    public final C46439e f356154h;

    /* renamed from: i */
    public final C127118j f356155i;

    /* renamed from: j */
    public final C129807d f356156j = new C129807d();

    /* renamed from: k */
    public final C129745a f356157k;

    /* renamed from: l */
    public final C129748c f356158l;

    /* renamed from: m */
    public final C129809a f356159m;

    /* renamed from: n */
    public final C43262m f356160n;

    /* renamed from: o */
    public final C129024a f356161o;

    /* renamed from: p */
    public final AtomicReference f356162p = new AtomicReference(new C129842i(this));

    /* renamed from: q */
    public final C129805b f356163q = new C129805b();

    /* renamed from: r */
    public C60872cz f356164r;

    /* renamed from: s */
    public final C60888db f356165s;

    /* renamed from: t */
    public final C129804a f356166t = new C129804a();

    /* renamed from: u */
    public final C127353a f356167u;

    /* renamed from: v */
    public final C2384o f356168v;

    /* renamed from: w */
    public final ExitHandler f356169w;

    /* renamed from: x */
    public CanvasWebAppViewModel f356170x;

    /* renamed from: y */
    public C65518b f356171y;

    /* renamed from: z */
    public final C128556m f356172z;

    /* renamed from: com.google.android.apps.search.assistant.surfaces.voice.ui.immersivecanvas.webapp.CanvasWebAppFragmentPeer$CanvasPostMessageConfig */
    /* compiled from: PG */
    public abstract class CanvasPostMessageConfig implements PostMessageConfig {
        /* renamed from: a */
        public final C43775a mo42598a() {
            return CanvasWebAppFragmentPeer.f356145b;
        }

        /* renamed from: b */
        public final C58485gu mo42599b() {
            return C58485gu.m89846n("https://appassets.androidplatform.net");
        }

        /* renamed from: c */
        public final /* synthetic */ Optional mo42600c() {
            return Optional.empty();
        }

        /* renamed from: d */
        public final /* synthetic */ Optional mo42601d(JSONObject jSONObject) {
            return Optional.empty();
        }

        /* renamed from: e */
        public final /* synthetic */ boolean mo42602e() {
            return false;
        }
    }

    /* renamed from: com.google.android.apps.search.assistant.surfaces.voice.ui.immersivecanvas.webapp.CanvasWebAppFragmentPeer$a */
    /* compiled from: PG */
    final class C129804a implements C46440f {
        /* renamed from: a */
        public final /* bridge */ /* synthetic */ void mo18066a(Object obj, Throwable th) {
            Void voidR = (Void) obj;
            ((C59052c) ((C59052c) ((C59052c) CanvasWebAppFragmentPeer.f356144a.mo56225c()).mo56382g(th)).mo56372aa(38467)).mo56386p("Failed to start interaction for mic open after OutputTTS.");
        }

        /* renamed from: c */
        public final /* bridge */ /* synthetic */ void mo18067c(Object obj, Object obj2) {
            Void voidR = (Void) obj;
            Void voidR2 = (Void) obj2;
            ((C59052c) ((C59052c) CanvasWebAppFragmentPeer.f356144a.mo56224b()).mo56372aa(38468)).mo56386p("Open Mic interaction started.");
        }

        /* renamed from: i */
        public final /* synthetic */ void mo18068i(Object obj) {
        }
    }

    /* renamed from: com.google.android.apps.search.assistant.surfaces.voice.ui.immersivecanvas.webapp.CanvasWebAppFragmentPeer$b */
    /* compiled from: PG */
    final class C129805b implements C46440f {
        public C129805b() {
        }

        /* renamed from: a */
        public final /* bridge */ /* synthetic */ void mo18066a(Object obj, Throwable th) {
            Void voidR = (Void) obj;
        }

        /* renamed from: c */
        public final /* bridge */ /* synthetic */ void mo18067c(Object obj, Object obj2) {
            Void voidR = (Void) obj;
            Void voidR2 = (Void) obj2;
            CanvasWebAppFragmentPeer canvasWebAppFragmentPeer = ((C129842i) CanvasWebAppFragmentPeer.this.f356162p.get()).f356241c;
            if (canvasWebAppFragmentPeer.f356164r != null) {
                canvasWebAppFragmentPeer.f356159m.mo109281d();
            }
        }

        /* renamed from: i */
        public final /* synthetic */ void mo18068i(Object obj) {
        }
    }

    /* renamed from: com.google.android.apps.search.assistant.surfaces.voice.ui.immersivecanvas.webapp.CanvasWebAppFragmentPeer$c */
    /* compiled from: PG */
    final class C129806c implements C46440f {
        public C129806c() {
        }

        /* renamed from: a */
        public final /* bridge */ /* synthetic */ void mo18066a(Object obj, Throwable th) {
            Void voidR = (Void) obj;
            ((C59052c) ((C59052c) ((C59052c) CanvasWebAppFragmentPeer.f356144a.mo56225c()).mo56382g(th)).mo56372aa(38469)).mo56386p("Failed to execute requested post message.");
            Snackbar.m79661q((Context) null, CanvasWebAppFragmentPeer.this.f356150d.requireView(), "Failed to execute requested post message", -1).mo48343h();
        }

        /* renamed from: c */
        public final /* bridge */ /* synthetic */ void mo18067c(Object obj, Object obj2) {
            Void voidR = (Void) obj;
            Void voidR2 = (Void) obj2;
            C59071e eVar = CanvasWebAppFragmentPeer.f356144a;
        }

        /* renamed from: i */
        public final /* synthetic */ void mo18068i(Object obj) {
        }
    }

    /* renamed from: com.google.android.apps.search.assistant.surfaces.voice.ui.immersivecanvas.webapp.CanvasWebAppFragmentPeer$d */
    /* compiled from: PG */
    final class C129807d implements C46440f {
        public C129807d() {
        }

        /* renamed from: a */
        public final /* bridge */ /* synthetic */ void mo18066a(Object obj, Throwable th) {
            Void voidR = (Void) obj;
            ((C59052c) ((C59052c) ((C59052c) CanvasWebAppFragmentPeer.f356144a.mo56225c()).mo56382g(th)).mo56372aa(38471)).mo56386p("Failed to start interaction for sendTextQuery.");
            CanvasWebAppFragmentPeer.this.f356158l.mo109226b(false);
            CanvasWebAppFragmentPeer.this.mo109275j(4);
        }

        /* renamed from: c */
        public final /* bridge */ /* synthetic */ void mo18067c(Object obj, Object obj2) {
            Void voidR = (Void) obj;
            Void voidR2 = (Void) obj2;
            ((C59052c) ((C59052c) CanvasWebAppFragmentPeer.f356144a.mo56224b()).mo56372aa(38472)).mo56386p("Text Query interaction started.");
            CanvasWebAppFragmentPeer.this.mo109275j(3);
        }

        /* renamed from: i */
        public final /* synthetic */ void mo18068i(Object obj) {
        }
    }

    public CanvasWebAppFragmentPeer(C129836c cVar, AccountId accountId, C65518b bVar, C129745a aVar, C46439e eVar, C127118j jVar, C43960g gVar, C129748c cVar2, C129809a aVar2, C129722e eVar2, C43262m mVar, C60888db dbVar, C129750e eVar3, C127353a aVar3, C129540c cVar3, C2384o oVar, C129024a aVar4, C128556m mVar2, C128556m mVar3) {
        this.f356150d = cVar;
        this.f356151e = accountId;
        this.f356171y = bVar;
        this.f356157k = aVar;
        this.f356154h = eVar;
        this.f356155i = jVar;
        C43960g gVar2 = gVar;
        this.f356152f = gVar.mo46957a(f356145b);
        this.f356158l = cVar2;
        this.f356159m = aVar2;
        this.f356148B = eVar2;
        this.f356160n = mVar;
        this.f356165s = dbVar;
        this.f356149C = eVar3;
        this.f356167u = aVar3;
        this.f356168v = oVar;
        this.f356169w = new ExitHandler(cVar3, eVar, jVar);
        this.f356161o = aVar4;
        this.f356172z = mVar2;
        this.f356147A = mVar3;
    }

    /* renamed from: a */
    public static C65518b m211923a(C51885cs csVar) {
        C65506a aVar = (C65506a) C65518b.f178088b.createBuilder();
        aVar.copyOnWrite();
        csVar.getClass();
        ((C65518b) aVar.instance).f178090a = csVar;
        return (C65518b) aVar.build();
    }

    /* renamed from: k */
    private final void m211926k(String str, String str2) {
        C65542z zVar = (C65542z) C65507aa.f178066c.createBuilder();
        C65510ad adVar = (C65510ad) C65511ae.f178074c.createBuilder();
        adVar.copyOnWrite();
        str2.getClass();
        ((C65511ae) adVar.instance).f178076a = str2;
        adVar.copyOnWrite();
        ((C65511ae) adVar.instance).f178077b = str;
        C65511ae aeVar = (C65511ae) adVar.build();
        zVar.copyOnWrite();
        C65507aa aaVar = (C65507aa) zVar.instance;
        aeVar.getClass();
        aaVar.f178069b = aeVar;
        aaVar.f178068a = 4;
        mo109271f((C65507aa) zVar.build());
    }

    /* renamed from: b */
    public final C65507aa mo109269b() {
        C51885cs csVar = this.f356171y.f178090a;
        if (csVar == null) {
            csVar = C51885cs.f136078y;
        }
        double dimension = (double) (this.f356150d.getResources().getDimension(R.dimen.assistant_title_bar_height) / this.f356150d.getResources().getDisplayMetrics().density);
        C65542z zVar = (C65542z) C65507aa.f178066c.createBuilder();
        C65540x xVar = (C65540x) C65541y.f178123e.createBuilder();
        String str = csVar.f136083b == 1 ? (String) csVar.f136084c : BuildConfig.FLAVOR;
        xVar.copyOnWrite();
        str.getClass();
        ((C65541y) xVar.instance).f178125a = str;
        String str2 = csVar.f136090i;
        xVar.copyOnWrite();
        str2.getClass();
        ((C65541y) xVar.instance).f178127c = str2;
        xVar.copyOnWrite();
        ((C65541y) xVar.instance).f178128d = dimension;
        int a = C51876cj.m86404a(csVar.f136086e);
        boolean z = false;
        if (a != 0 && a == 2) {
            z = true;
        }
        xVar.copyOnWrite();
        ((C65541y) xVar.instance).f178126b = z;
        C65541y yVar = (C65541y) xVar.build();
        zVar.copyOnWrite();
        C65507aa aaVar = (C65507aa) zVar.instance;
        yVar.getClass();
        aaVar.f178069b = yVar;
        aaVar.f178068a = 1;
        return (C65507aa) zVar.build();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x00c2, code lost:
        if (r8.equals("START") == false) goto L_0x00d7;
     */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x00da A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:35:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo109270e(java.lang.String r8) {
        /*
            r7 = this;
            boolean r0 = com.google.common.base.C58837ba.m90859h(r8)
            if (r0 == 0) goto L_0x0015
            com.google.common.f.e r8 = f356144a
            com.google.common.f.x r8 = r8.mo56226d()
            java.lang.String r0 = "TtsMarkUpdate has null/empty mark name."
            r1 = 38485(0x9655, float:5.3929E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r8).mo56372aa(r1)).mo56386p(r0)
            return
        L_0x0015:
            java.lang.String r0 = "END"
            boolean r1 = r8.equals(r0)
            r2 = 0
            if (r1 == 0) goto L_0x004d
            com.google.android.apps.search.assistant.surfaces.voice.ui.immersivecanvas.b.a.e r1 = r7.f356149C
            java.util.concurrent.atomic.AtomicReference r1 = r1.f356053b
            java.lang.Object r1 = r1.get()
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            if (r1 == 0) goto L_0x004d
            com.google.apps.tiktok.concurrent.futuresmixin.e r1 = r7.f356154h
            com.google.android.apps.search.assistant.surfaces.voice.controller.ui.actions.j r3 = r7.f356155i
            com.google.android.apps.search.assistant.surfaces.voice.f.a.g.b r4 = com.google.android.apps.search.assistant.surfaces.voice.p9591f.p9592a.p9600g.C127454b.MIC_ICON
            com.google.android.apps.search.assistant.surfaces.voice.controller.ui.actions.b r4 = com.google.android.apps.search.assistant.surfaces.voice.p9590e.C127407d.m208365e(r4)
            com.google.common.util.concurrent.cx r3 = r3.mo107931g(r4)
            com.google.apps.tiktok.concurrent.futuresmixin.d r3 = com.google.apps.tiktok.concurrent.futuresmixin.C46438d.m82810b(r3)
            com.google.android.apps.search.assistant.surfaces.voice.ui.immersivecanvas.webapp.CanvasWebAppFragmentPeer$a r4 = r7.f356166t
            com.google.common.util.concurrent.cx r3 = r3.f121541a
            r5 = 0
            r1.mo50428h(r3, r5, r4)
            com.google.android.apps.search.assistant.surfaces.voice.ui.immersivecanvas.b.a.e r1 = r7.f356149C
            r1.mo109228b(r2)
        L_0x004d:
            com.google.protos.j.a.a.a.b.a.b.a.b.a.b.a.aa r1 = com.google.protos.p5068j.p5069a.p5070a.p5071a.p5076b.p5077a.p5093b.p5094a.p5099b.p5100a.p5103b.p5104a.C65507aa.f178066c
            com.google.protobuf.bn r1 = r1.createBuilder()
            com.google.protos.j.a.a.a.b.a.b.a.b.a.b.a.z r1 = (com.google.protos.p5068j.p5069a.p5070a.p5071a.p5076b.p5077a.p5093b.p5094a.p5099b.p5100a.p5103b.p5104a.C65542z) r1
            com.google.protos.j.a.a.a.b.a.b.a.b.a.b.a.ak r3 = com.google.protos.p5068j.p5069a.p5070a.p5071a.p5076b.p5077a.p5093b.p5094a.p5099b.p5100a.p5103b.p5104a.C65517ak.f178085b
            com.google.protobuf.bn r3 = r3.createBuilder()
            com.google.protos.j.a.a.a.b.a.b.a.b.a.b.a.aj r3 = (com.google.protos.p5068j.p5069a.p5070a.p5071a.p5076b.p5077a.p5093b.p5094a.p5099b.p5100a.p5103b.p5104a.C65516aj) r3
            r3.copyOnWrite()
            com.google.protobuf.bv r4 = r3.instance
            com.google.protos.j.a.a.a.b.a.b.a.b.a.b.a.ak r4 = (com.google.protos.p5068j.p5069a.p5070a.p5071a.p5076b.p5077a.p5093b.p5094a.p5099b.p5100a.p5103b.p5104a.C65517ak) r4
            r8.getClass()
            r4.f178087a = r8
            com.google.protobuf.bv r3 = r3.build()
            com.google.protos.j.a.a.a.b.a.b.a.b.a.b.a.ak r3 = (com.google.protos.p5068j.p5069a.p5070a.p5071a.p5076b.p5077a.p5093b.p5094a.p5099b.p5100a.p5103b.p5104a.C65517ak) r3
            r1.copyOnWrite()
            com.google.protobuf.bv r4 = r1.instance
            com.google.protos.j.a.a.a.b.a.b.a.b.a.b.a.aa r4 = (com.google.protos.p5068j.p5069a.p5070a.p5071a.p5076b.p5077a.p5093b.p5094a.p5099b.p5100a.p5103b.p5104a.C65507aa) r4
            r3.getClass()
            r4.f178069b = r3
            r3 = 3
            r4.f178068a = r3
            com.google.protobuf.bv r1 = r1.build()
            com.google.protos.j.a.a.a.b.a.b.a.b.a.b.a.aa r1 = (com.google.protos.p5068j.p5069a.p5070a.p5071a.p5076b.p5077a.p5093b.p5094a.p5099b.p5100a.p5103b.p5104a.C65507aa) r1
            r7.mo109271f(r1)
            com.google.android.apps.search.assistant.surfaces.voice.ui.immersivecanvas.b.a.e r1 = r7.f356149C
            java.util.concurrent.atomic.AtomicReference r1 = r1.f356054c
            java.lang.Object r1 = r1.get()
            java.lang.String r1 = (java.lang.String) r1
            boolean r3 = com.google.common.base.C58837ba.m90859h(r1)
            if (r3 == 0) goto L_0x00a6
            com.google.common.f.e r0 = f356144a
            com.google.common.f.x r0 = r0.mo56226d()
            java.lang.String r1 = "Ignoring markName:%s as pendingOutputTtsId is null"
            r2 = 38491(0x965b, float:5.3937E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r0).mo56372aa(r2)).mo56389s(r1, r8)
            return
        L_0x00a6:
            int r3 = r8.hashCode()
            r4 = 68795(0x10cbb, float:9.6402E-41)
            r5 = 2
            r6 = 1
            if (r3 == r4) goto L_0x00cf
            r4 = 66247144(0x3f2d9e8, float:1.42735105E-36)
            if (r3 == r4) goto L_0x00c5
            r4 = 79219778(0x4b8cc42, float:4.3445773E-36)
            if (r3 == r4) goto L_0x00bc
            goto L_0x00d7
        L_0x00bc:
            java.lang.String r3 = "START"
            boolean r8 = r8.equals(r3)
            if (r8 == 0) goto L_0x00d7
            goto L_0x00d8
        L_0x00c5:
            java.lang.String r2 = "ERROR"
            boolean r8 = r8.equals(r2)
            if (r8 == 0) goto L_0x00d7
            r2 = 1
            goto L_0x00d8
        L_0x00cf:
            boolean r8 = r8.equals(r0)
            if (r8 == 0) goto L_0x00d7
            r2 = 2
            goto L_0x00d8
        L_0x00d7:
            r2 = -1
        L_0x00d8:
            if (r2 == 0) goto L_0x00f0
            if (r2 == r6) goto L_0x00f0
            if (r2 == r5) goto L_0x00e4
            java.lang.String r8 = "MARK"
            r7.m211926k(r8, r1)
            return
        L_0x00e4:
            r7.m211926k(r0, r1)
            com.google.android.apps.search.assistant.surfaces.voice.ui.immersivecanvas.b.a.e r8 = r7.f356149C
            java.util.concurrent.atomic.AtomicReference r8 = r8.f356054c
            java.lang.String r0 = ""
            r8.set(r0)
        L_0x00f0:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.search.assistant.surfaces.voice.p9785ui.immersivecanvas.webapp.CanvasWebAppFragmentPeer.mo109270e(java.lang.String):void");
    }

    /* renamed from: f */
    public final void mo109271f(C65507aa aaVar) {
        C43968o oVar = (C43968o) this.f356152f.mo46950a().orElse(null);
        if (oVar == null) {
            ((C59052c) ((C59052c) f356144a.mo56226d()).mo56372aa(38488)).mo56389s("Cannot send message:%s to WebApp because postMessageSender is null.", C129755c.m211835a(aaVar));
        } else {
            mo109273h(aaVar, oVar);
        }
    }

    /* renamed from: g */
    public final void mo109272g(C65509ac acVar) {
        C65542z zVar = (C65542z) C65507aa.f178066c.createBuilder();
        zVar.copyOnWrite();
        C65507aa aaVar = (C65507aa) zVar.instance;
        acVar.getClass();
        aaVar.f178069b = acVar;
        aaVar.f178068a = 6;
        mo109271f((C65507aa) zVar.build());
    }

    /* renamed from: h */
    public final void mo109273h(C65507aa aaVar, C43968o oVar) {
        ((C59052c) ((C59052c) f356144a.mo56224b()).mo56372aa(38489)).mo56389s("Sending message:%s to WebApp", C129755c.m211835a(aaVar));
        try {
            C60870cx a = oVar.mo46960a(new JSONObject().put("protoAsBase64", Base64.encodeToString(aaVar.toByteArray(), 0)).toString());
            C46439e eVar = this.f356154h;
            C46438d b = C46438d.m82810b(a);
            eVar.mo50428h(b.f121541a, (Object) null, this.f356153g);
        } catch (JSONException e) {
            ((C59052c) ((C59052c) ((C59052c) f356144a.mo56225c()).mo56382g(e)).mo56372aa(38490)).mo56389s("Message:%s was not sent because of error in parsing.", C129755c.m211835a(aaVar));
        }
    }

    /* renamed from: i */
    public final void mo109274i(int i) {
        C65508ab abVar = (C65508ab) C65509ac.f178070c.createBuilder();
        abVar.copyOnWrite();
        ((C65509ac) abVar.instance).f178072a = 1;
        abVar.copyOnWrite();
        ((C65509ac) abVar.instance).f178073b = i - 2;
        mo109272g((C65509ac) abVar.build());
    }

    /* renamed from: j */
    public final void mo109275j(int i) {
        C65542z zVar = (C65542z) C65507aa.f178066c.createBuilder();
        C65512af afVar = (C65512af) C65513ag.f178078b.createBuilder();
        afVar.copyOnWrite();
        ((C65513ag) afVar.instance).f178080a = i - 2;
        zVar.copyOnWrite();
        C65507aa aaVar = (C65507aa) zVar.instance;
        C65513ag agVar = (C65513ag) afVar.build();
        agVar.getClass();
        aaVar.f178069b = agVar;
        aaVar.f178068a = 5;
        mo109271f((C65507aa) zVar.build());
    }
}
