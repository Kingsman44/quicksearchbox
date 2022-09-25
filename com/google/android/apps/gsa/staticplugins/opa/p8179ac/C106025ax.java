package com.google.android.apps.gsa.staticplugins.opa.p8179ac;

import android.content.Context;
import android.content.res.Configuration;
import android.os.Handler;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.ValueCallback;
import android.webkit.WebView;
import android.widget.FrameLayout;
import androidx.core.p098j.C2100o;
import com.evernote.android.state.BuildConfig;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.search.shared.service.C87682aj;
import com.google.android.apps.gsa.search.shared.service.C88489j;
import com.google.android.apps.gsa.search.shared.service.p6935b.C87739bu;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88092ow;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88093ox;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88094oy;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88105pi;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88106pj;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88107pk;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88244um;
import com.google.android.apps.gsa.shared.logger.p7051b.C89849ae;
import com.google.android.apps.gsa.shared.logger.p7051b.C89859i;
import com.google.android.apps.gsa.shared.p7066m.C90014bt;
import com.google.android.apps.gsa.shared.p7066m.C90041ct;
import com.google.android.apps.gsa.shared.p7148ui.TouchInterceptingFrameLayout;
import com.google.android.apps.gsa.shared.p7195y.C91189au;
import com.google.android.apps.gsa.shared.search.Query;
import com.google.android.apps.gsa.staticplugins.nga.p8092ui.p8095b.C104149a;
import com.google.android.apps.gsa.staticplugins.opa.C109262i;
import com.google.android.apps.gsa.staticplugins.opa.chatui.C108226ax;
import com.google.android.apps.gsa.staticplugins.opa.chatui.C108237bh;
import com.google.android.apps.gsa.staticplugins.opa.chatui.C108423id;
import com.google.android.apps.gsa.staticplugins.opa.chatui.C108424ie;
import com.google.android.apps.gsa.staticplugins.opa.chatui.C108435ip;
import com.google.android.apps.gsa.staticplugins.opa.p8300as.p8301a.C107460a;
import com.google.android.apps.gsa.staticplugins.opa.p8300as.p8301a.C107502c;
import com.google.android.apps.gsa.staticplugins.opa.p8300as.p8301a.C107503d;
import com.google.android.apps.gsa.staticplugins.opa.p8300as.p8301a.C107504e;
import com.google.android.apps.gsa.staticplugins.opa.p8300as.p8301a.p8302a.C107468ag;
import com.google.android.apps.gsa.staticplugins.opa.p8300as.p8301a.p8302a.C107469ah;
import com.google.android.apps.gsa.staticplugins.opa.p8300as.p8301a.p8302a.C107472ak;
import com.google.android.apps.gsa.staticplugins.opa.p8300as.p8301a.p8302a.C107473al;
import com.google.android.apps.gsa.staticplugins.opa.p8300as.p8301a.p8302a.C107474am;
import com.google.android.apps.gsa.staticplugins.opa.p8300as.p8301a.p8302a.C107475an;
import com.google.android.apps.gsa.staticplugins.opa.p8300as.p8301a.p8302a.C107481g;
import com.google.android.apps.gsa.staticplugins.opa.p8300as.p8301a.p8302a.C107482h;
import com.google.android.apps.gsa.staticplugins.opa.p8300as.p8301a.p8302a.C107483i;
import com.google.android.apps.gsa.staticplugins.opa.p8300as.p8301a.p8302a.C107484j;
import com.google.android.apps.gsa.staticplugins.opa.p8300as.p8301a.p8302a.C107486l;
import com.google.android.apps.gsa.staticplugins.opa.p8315az.C107698i;
import com.google.android.apps.gsa.staticplugins.opa.p8315az.C107710u;
import com.google.android.apps.gsa.staticplugins.opa.p8378m.C109461g;
import com.google.android.apps.gsa.staticplugins.opa.util.C113863cr;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.assistant.p1528m.p1529a.C18422g;
import com.google.android.libraries.assistant.p1528m.p1529a.C18430o;
import com.google.android.libraries.assistant.p1528m.p1529a.C18431p;
import com.google.android.libraries.assistant.p1622v.C19457a;
import com.google.android.libraries.gsa.p1876k.C22864c;
import com.google.android.libraries.gsa.p1876k.C22869e;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.android.libraries.logging.C28285c;
import com.google.android.libraries.logging.C28292j;
import com.google.android.libraries.logging.C28294l;
import com.google.android.libraries.logging.C28295m;
import com.google.assistant.p3814ai.p3815a.p3816a.C49172f;
import com.google.assistant.p3814ai.p3815a.p3816a.C49187u;
import com.google.assistant.p3890d.C50855a;
import com.google.assistant.p3890d.C50863c;
import com.google.assistant.p3897e.p3898a.C50870f;
import com.google.assistant.p3897e.p3902c.p3907c.C51073fj;
import com.google.assistant.p3897e.p3917i.p3918a.C51577mw;
import com.google.assistant.p3897e.p3917i.p3918a.C51580mz;
import com.google.assistant.p3897e.p3917i.p3918a.C51623oo;
import com.google.assistant.p3897e.p3921j.C51805du;
import com.google.assistant.p3897e.p3921j.ams;
import com.google.assistant.p3897e.p3921j.amw;
import com.google.assistant.p3897e.p3921j.amx;
import com.google.assistant.p3897e.p3921j.amy;
import com.google.assistant.p3897e.p3921j.amz;
import com.google.assistant.p3897e.p3921j.p3926e.C51842bc;
import com.google.assistant.p3897e.p3921j.p3926e.C51843bd;
import com.google.assistant.p3897e.p3921j.p3926e.C51865bz;
import com.google.assistant.p3897e.p3921j.p3926e.C51873cg;
import com.google.assistant.p3897e.p3921j.p3926e.C51874ch;
import com.google.assistant.p3897e.p3921j.p3926e.C51876cj;
import com.google.assistant.p3897e.p3921j.p3926e.C51878cl;
import com.google.assistant.p3897e.p3921j.p3926e.C51882cp;
import com.google.assistant.p3897e.p3921j.p3926e.C51884cr;
import com.google.assistant.p3897e.p3921j.p3926e.C51885cs;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58495hd;
import com.google.common.p4522b.C58528ij;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.p4552o.C60320od;
import com.google.common.p4552o.C60321oe;
import com.google.common.p4552o.C60446qi;
import com.google.common.p4552o.C60448qk;
import com.google.common.p4552o.C60449ql;
import com.google.common.p4552o.C60450qm;
import com.google.common.p4552o.C60451qn;
import com.google.common.p4552o.C60452qo;
import com.google.common.p4552o.p4566l.C60213m;
import com.google.common.p4552o.p4566l.C60214n;
import com.google.common.p4552o.p4566l.C60217q;
import com.google.common.p4552o.p4566l.C60218r;
import com.google.common.p4552o.p4566l.C60220t;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60866ct;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.SettableFuture;
import com.google.knowledge.p4671b.C61788ag;
import com.google.p386ak.C8268b;
import com.google.p386ak.C8393i;
import com.google.p386ak.C8394j;
import com.google.p386ak.C8409y;
import com.google.p386ak.p388b.C8327aa;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C62988dg;
import com.google.protobuf.C62995dn;
import com.google.protobuf.C63034ez;
import com.google.protobuf.C63037fb;
import com.google.protobuf.C63063ga;
import com.google.protobuf.C63088z;
import com.google.protos.p5129p.p5131b.C65796c;
import com.google.protos.p5129p.p5131b.C65823d;
import dagger.C68214a;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;
import p3186j$.util.Collection;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.ac.ax */
/* compiled from: PG */
public final class C106025ax implements C106062r {

    /* renamed from: G */
    private static final C58528ij f295982G = C58528ij.m90013M(C51843bd.APPLICATION_URL, C51843bd.APPLICATION_HTML, C51843bd.EXIT, C51843bd.APPLICATION_NOT_SET);

    /* renamed from: a */
    public static final C59071e f295983a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.opa.ac.ax");

    /* renamed from: A */
    boolean f295984A;

    /* renamed from: B */
    public String f295985B;

    /* renamed from: C */
    public C108226ax f295986C;

    /* renamed from: D */
    public boolean f295987D;

    /* renamed from: E */
    public boolean f295988E = false;

    /* renamed from: F */
    C63034ez f295989F = ((C63034ez) C63037fb.f170144b.createBuilder());

    /* renamed from: H */
    private final List f295990H;

    /* renamed from: I */
    private final C68214a f295991I;

    /* renamed from: J */
    private final C106054j f295992J;

    /* renamed from: K */
    private final C68214a f295993K;

    /* renamed from: L */
    private final C106061q f295994L;

    /* renamed from: M */
    private String f295995M;

    /* renamed from: N */
    private C19457a f295996N;

    /* renamed from: O */
    private C22869e f295997O;

    /* renamed from: P */
    private String f295998P;

    /* renamed from: Q */
    private boolean f295999Q;

    /* renamed from: R */
    private final C106035bg f296000R;

    /* renamed from: S */
    private C60870cx f296001S;

    /* renamed from: T */
    private final C108424ie f296002T;

    /* renamed from: U */
    private final C104149a f296003U;

    /* renamed from: b */
    final C113863cr f296004b;

    /* renamed from: c */
    C58833ax f296005c;

    /* renamed from: d */
    C58833ax f296006d;

    /* renamed from: e */
    C58833ax f296007e;

    /* renamed from: f */
    C58833ax f296008f;

    /* renamed from: g */
    public final C58485gu f296009g;

    /* renamed from: h */
    public final Context f296010h;

    /* renamed from: i */
    public final C107698i f296011i;

    /* renamed from: j */
    public final C22871g f296012j;

    /* renamed from: k */
    public final C86124t f296013k;

    /* renamed from: l */
    public final C2100o f296014l;

    /* renamed from: m */
    public final C106030bb f296015m;

    /* renamed from: n */
    public final C8393i f296016n;

    /* renamed from: o */
    public final Map f296017o = new HashMap();

    /* renamed from: p */
    public final Map f296018p = new HashMap();

    /* renamed from: q */
    public final Map f296019q = new HashMap();

    /* renamed from: r */
    final C87682aj f296020r;

    /* renamed from: s */
    public boolean f296021s;

    /* renamed from: t */
    public C58833ax f296022t = C58836b.f156633a;

    /* renamed from: u */
    public C51885cs f296023u;

    /* renamed from: v */
    public C51842bc f296024v = C51842bc.f135998g;

    /* renamed from: w */
    public String f296025w;

    /* renamed from: x */
    public boolean f296026x;

    /* renamed from: y */
    public SettableFuture f296027y;

    /* renamed from: z */
    public C22864c f296028z;

    public C106025ax(Context context, C86124t tVar, C104149a aVar, C68214a aVar2, C106054j jVar, C108424ie ieVar, C107698i iVar, C107710u uVar, C22871g gVar, C68214a aVar3, C113863cr crVar, C106061q qVar, C106030bb bbVar, C106035bg bgVar) {
        C58836b bVar = C58836b.f156633a;
        this.f296005c = bVar;
        this.f296006d = bVar;
        this.f296007e = bVar;
        this.f296008f = bVar;
        C8327aa aaVar = C8327aa.f29138a;
        C8268b bVar2 = C8268b.IDENTITY;
        HashMap hashMap = new HashMap();
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        C8409y yVar = C8393i.f29246b;
        C8409y yVar2 = C8393i.f29246b;
        C8409y yVar3 = C8393i.f29247c;
        LinkedList linkedList = new LinkedList();
        C8394j.m23232b(C63063ga.class, new C106046br(), hashMap, arrayList);
        C8394j.m23232b(ams.class, new C106059o(), hashMap, arrayList);
        C8394j.m23232b(C49172f.class, new C106058n(), hashMap, arrayList);
        C8394j.m23232b(C49187u.class, new C106045bq(), hashMap, arrayList);
        this.f296016n = C8394j.m23231a(aaVar, bVar2, hashMap, arrayList, arrayList2, yVar2, yVar3, linkedList);
        context.getClass();
        tVar.getClass();
        this.f296010h = context;
        this.f296009g = tVar.mo79745c(C90014bt.f247410gd);
        this.f295991I = aVar2;
        this.f295992J = jVar;
        this.f296011i = iVar;
        this.f296012j = gVar;
        this.f295993K = aVar3;
        this.f296013k = tVar;
        this.f296003U = aVar;
        this.f295990H = tVar.mo79749o(C90014bt.f247409gc);
        C106006ae aeVar = new C106006ae(this);
        this.f296020r = aeVar;
        this.f296002T = ieVar;
        uVar.mo96220c(aeVar, C88244um.TTS_PLAYBACK_STARTED, C88244um.TTS_PLAYBACK_DONE, C88244um.ATTACH_WEBVIEW, C88244um.TTS_TIMEPOINT_EVENT, C88244um.CONTINUOUS_MATCH_STARTED, C88244um.CONTINUOUS_MATCH_STOPPED);
        this.f296004b = crVar;
        this.f295994L = qVar;
        this.f296027y = new SettableFuture();
        this.f296014l = new C2100o(context, new C106024aw(this), (Handler) null);
        this.f296015m = bbVar;
        this.f295987D = false;
        this.f296000R = bgVar;
    }

    /* renamed from: I */
    private static String m176592I(C51885cs csVar) {
        C51843bd bdVar = C51843bd.APPLICATION_URL;
        C88244um umVar = C88244um.ATTACH_WEBVIEW;
        int ordinal = C51843bd.m86399a(csVar.f136083b).ordinal();
        if (ordinal != 0) {
            if (ordinal == 1 && csVar.f136083b == 2) {
                return (String) csVar.f136084c;
            }
            return BuildConfig.FLAVOR;
        } else if (csVar.f136083b == 1) {
            return (String) csVar.f136084c;
        } else {
            return BuildConfig.FLAVOR;
        }
    }

    /* renamed from: J */
    private final void m176593J() {
        C60870cx cxVar = this.f296001S;
        if (cxVar != null) {
            cxVar.cancel(true);
            this.f296001S = null;
        }
    }

    /* renamed from: K */
    private final void m176594K() {
        int a;
        int a2 = C51865bz.m86402a(this.f296023u.f136092k);
        if ((a2 != 0 && a2 == 2) || ((a = C51865bz.m86402a(this.f296023u.f136092k)) != 0 && a == 3)) {
            C58976aa aaVar = C58975e.f156826a;
            int i = this.f296023u.f136092k;
            return;
        }
        mo95211A(C107486l.f299077d);
        m176597N(C107483i.f299071d);
    }

    /* renamed from: L */
    private final void m176595L() {
        C107698i iVar = this.f296011i;
        C88489j jVar = new C88489j(C87739bu.OPA_DISPLAY_CONTEXT_UPDATED);
        C62940bt btVar = C88105pi.f238198a;
        C88106pj pjVar = (C88106pj) C88107pk.f238199h.createBuilder();
        C61788ag agVar = C61788ag.f166893c;
        pjVar.copyOnWrite();
        C88107pk pkVar = (C88107pk) pjVar.instance;
        agVar.getClass();
        pkVar.f238206f = agVar;
        pkVar.f238201a |= 16;
        jVar.mo82014b(btVar, (C88107pk) pjVar.build());
        iVar.mo96219b(jVar.mo82013a());
    }

    /* renamed from: M */
    private final void m176596M(boolean z) {
        ((FrameLayout) this.f296022t.mo56107c()).findViewById(R.id.canvas_rotation_message_container).setVisibility(true != z ? 8 : 0);
    }

    /* renamed from: N */
    private final void m176597N(C107483i iVar) {
        C107503d dVar = (C107503d) C107504e.f299115c.createBuilder();
        C107502c cVar = C107502c.OPA_IMMERSIVE_CANVAS_UPDATE_PARAMS;
        dVar.copyOnWrite();
        C107504e eVar = (C107504e) dVar.instance;
        eVar.f299118b = cVar.f299114n;
        eVar.f299117a |= 1;
        dVar.mo58885m(C107481g.f299070a, iVar);
        C88489j jVar = new C88489j(C87739bu.OPA_SESSION_CLIENT_EVENT);
        jVar.mo82014b(C107460a.f299029a, (C107504e) dVar.build());
        this.f296011i.mo96219b(jVar.mo82013a());
    }

    /* renamed from: O */
    private final void m176598O(C107472ak akVar) {
        C107503d dVar = (C107503d) C107504e.f299115c.createBuilder();
        C107502c cVar = C107502c.OPA_WEB_VIEW;
        dVar.copyOnWrite();
        C107504e eVar = (C107504e) dVar.instance;
        eVar.f299118b = cVar.f299114n;
        eVar.f299117a |= 1;
        dVar.mo58885m(C107468ag.f299047a, akVar);
        C88489j jVar = new C88489j(C87739bu.OPA_SESSION_CLIENT_EVENT);
        jVar.mo82014b(C107460a.f299029a, (C107504e) dVar.build());
        this.f296011i.mo96219b(jVar.mo82013a());
    }

    /* renamed from: P */
    private final boolean m176599P(C51885cs csVar) {
        List list = this.f295990H;
        int a = C51876cj.m86404a(csVar.f136086e);
        if (a == 0) {
            a = 1;
        }
        if (list.contains(Integer.valueOf(a - 1)) && f295982G.contains(C51843bd.m86399a(csVar.f136083b))) {
            return true;
        }
        C59104x c = f295983a.mo56225c();
        c.mo56378ag(C58975e.f156826a, "ImmersiveCanvasCtrlr");
        C59052c cVar = (C59052c) ((C59052c) c).mo56372aa(24693);
        int a2 = C51876cj.m86404a(csVar.f136086e);
        cVar.mo56354G("showHtmlImmersiveArgs are malformed with source: %s and application case: %s", (a2 == 0 || a2 == 1) ? "UNKNOWN_SOURCE" : a2 != 2 ? "THIRD_PARTY" : "GOOGLE", C51843bd.m86399a(csVar.f136083b));
        return false;
    }

    /* renamed from: A */
    public final void mo95211A(C107486l lVar) {
        C107503d dVar = (C107503d) C107504e.f299115c.createBuilder();
        C107502c cVar = C107502c.OPA_IMMERSIVE_CANVAS_UPDATE_STATE;
        dVar.copyOnWrite();
        C107504e eVar = (C107504e) dVar.instance;
        eVar.f299118b = cVar.f299114n;
        eVar.f299117a |= 1;
        dVar.mo58885m(C107484j.f299076a, lVar);
        C88489j jVar = new C88489j(C87739bu.OPA_SESSION_CLIENT_EVENT);
        jVar.mo82014b(C107460a.f299029a, (C107504e) dVar.build());
        this.f296011i.mo96219b(jVar.mo82013a());
    }

    /* renamed from: B */
    public final void mo95212B(C51623oo ooVar) {
        C107482h hVar = (C107482h) C107483i.f299071d.createBuilder();
        C63088z byteString = ooVar.toByteString();
        hVar.copyOnWrite();
        C107483i iVar = (C107483i) hVar.instance;
        byteString.getClass();
        iVar.f299073a |= 2;
        iVar.f299075c = byteString;
        m176597N((C107483i) hVar.build());
    }

    /* renamed from: C */
    public final void mo95213C() {
        this.f296011i.mo96219b(new C88489j(C87739bu.STOP_SPEAKING).mo82013a());
        this.f296026x = false;
        C107474am amVar = (C107474am) C107475an.f299054e.createBuilder();
        amVar.copyOnWrite();
        C107475an anVar = (C107475an) amVar.instance;
        anVar.f299056a |= 4;
        anVar.f299059d = true;
        C107503d dVar = (C107503d) C107504e.f299115c.createBuilder();
        C107502c cVar = C107502c.OPA_TEXT_TO_SPEECH;
        dVar.copyOnWrite();
        C107504e eVar = (C107504e) dVar.instance;
        eVar.f299118b = cVar.f299114n;
        eVar.f299117a = 1 | eVar.f299117a;
        dVar.mo58885m(C107473al.f299053a, (C107475an) amVar.build());
        C88489j jVar = new C88489j(C87739bu.OPA_SESSION_CLIENT_EVENT);
        jVar.mo82014b(C107460a.f299029a, (C107504e) dVar.build());
        this.f296011i.mo96219b(jVar.mo82013a());
    }

    /* renamed from: E */
    public final void mo95215E(String str) {
        C51805du duVar;
        if (Collections.unmodifiableMap(((C63037fb) this.f295989F.instance).f170146a).size() == 0) {
            amw amw = (amw) amz.f135409e.createBuilder();
            amw.copyOnWrite();
            amz amz = (amz) amw.instance;
            str.getClass();
            amz.f135411a |= 32;
            amz.f135414d = str;
            amx amx = (amx) amy.f135404d.createBuilder();
            amx.copyOnWrite();
            amy amy = (amy) amx.instance;
            amy.f135406a |= 2;
            amy.f135407b = true;
            amw.copyOnWrite();
            amz amz2 = (amz) amw.instance;
            amy amy2 = (amy) amx.build();
            amy2.getClass();
            amz2.f135413c = amy2;
            amz2.f135412b = 5;
            duVar = C109461g.m182159a((amz) amw.build());
        } else {
            C63037fb fbVar = (C63037fb) this.f295989F.build();
            amw amw2 = (amw) amz.f135409e.createBuilder();
            amw2.copyOnWrite();
            amz amz3 = (amz) amw2.instance;
            str.getClass();
            amz3.f135411a |= 32;
            amz3.f135414d = str;
            amx amx2 = (amx) amy.f135404d.createBuilder();
            amx2.copyOnWrite();
            amy amy3 = (amy) amx2.instance;
            fbVar.getClass();
            amy3.f135408c = fbVar;
            amy3.f135406a |= 4;
            amw2.copyOnWrite();
            amz amz4 = (amz) amw2.instance;
            amy amy4 = (amy) amx2.build();
            amy4.getClass();
            amz4.f135413c = amy4;
            amz4.f135412b = 5;
            duVar = C109461g.m182159a((amz) amw2.build());
        }
        mo95243y(duVar);
    }

    /* renamed from: F */
    public final void mo95216F(String str, String str2) {
        C60870cx cxVar;
        C50855a aVar = (C50855a) C50863c.f132437b.createBuilder();
        Map unmodifiableMap = Collections.unmodifiableMap(((C63037fb) this.f295989F.build()).f170146a);
        aVar.copyOnWrite();
        C50863c cVar = (C50863c) aVar.instance;
        C62995dn dnVar = cVar.f132439a;
        if (!dnVar.f170058b) {
            cVar.f132439a = dnVar.mo58980a();
        }
        cVar.f132439a.putAll(unmodifiableMap);
        C50863c cVar2 = (C50863c) aVar.build();
        C106035bg bgVar = this.f296000R;
        String str3 = this.f295998P;
        if (TextUtils.isEmpty(bgVar.f296044b)) {
            cxVar = C60856cj.m92899h(new Exception("Can not get account name."));
        } else {
            C63088z byteString = cVar2.toByteString();
            C65796c cVar3 = (C65796c) C65823d.f178941c.createBuilder();
            cVar3.copyOnWrite();
            C65823d dVar = (C65823d) cVar3.instance;
            byteString.getClass();
            dVar.f178943a |= 1;
            dVar.f178944b = byteString;
            cxVar = bgVar.f296046d.d(bgVar.f296044b, C106035bg.f296043a, bgVar.f296045c.b("type.googleapis.com/geller.oneplatform.AogAppUserContext", ((C65823d) cVar3.build()).toByteString(), str3), false);
        }
        this.f296012j.mo28211k(bgVar.f296048f.mo28210j(cxVar, "Triggers an immediate sync between the client and kansas", new C106032bd(bgVar)), "writeAndSyncDataFuture", new C106004ac(this, str, str2));
    }

    /* renamed from: G */
    public final void mo95217G() {
        String str = this.f296023u.f136101t;
        C58485gu j = C58485gu.m89842j(this.f296017o.values());
        C58495hd l = C58495hd.m89898l(this.f296018p);
        C58485gu j2 = C58485gu.m89842j(this.f296019q.values());
        C51577mw mwVar = (C51577mw) C51580mz.f134430h.createBuilder();
        mwVar.copyOnWrite();
        C51580mz mzVar = (C51580mz) mwVar.instance;
        str.getClass();
        mzVar.f134432a = 5;
        mzVar.f134433b = str;
        mwVar.copyOnWrite();
        ((C51580mz) mwVar.instance).f134434c = 5;
        Collection.EL.stream(j).filter(C106037bi.f296056a).forEach(new C106038bj(mwVar));
        Collection.EL.stream(j).filter(C106039bk.f296058a).forEach(new C106040bl(l, mwVar));
        Collection.EL.stream(j2).forEach(new C106041bm(mwVar));
        C51580mz mzVar2 = (C51580mz) mwVar.build();
        C107503d dVar = (C107503d) C107504e.f299115c.createBuilder();
        C107502c cVar = C107502c.OPA_IMMERSIVE_CANVAS_UPDATE_PARAMS;
        dVar.copyOnWrite();
        C107504e eVar = (C107504e) dVar.instance;
        eVar.f299118b = cVar.f299114n;
        eVar.f299117a |= 1;
        C62940bt btVar = C107481g.f299070a;
        C107482h hVar = (C107482h) C107483i.f299071d.createBuilder();
        hVar.copyOnWrite();
        C107483i iVar = (C107483i) hVar.instance;
        mzVar2.getClass();
        iVar.f299074b = mzVar2;
        iVar.f299073a |= 1;
        dVar.mo58885m(btVar, (C107483i) hVar.build());
        C88489j jVar = new C88489j(C87739bu.OPA_SESSION_CLIENT_EVENT);
        jVar.mo82014b(C107460a.f299029a, (C107504e) dVar.build());
        this.f296011i.mo96219b(jVar.mo82013a());
    }

    /* renamed from: H */
    public final boolean mo95218H(String str, String str2) {
        if (this.f295999Q) {
            return true;
        }
        ((C18431p) this.f296005c.mo56107c()).mo23961g(str, C18430o.USER_UNVERIFIED, str2, "User is not verified.");
        if (!this.f296013k.mo79746e(C90041ct.f248695h)) {
            return false;
        }
        this.f296015m.mo95248b(((C63037fb) this.f295989F.build()).getSerializedSize(), C18430o.USER_UNVERIFIED, this.f296024v);
        return false;
    }

    /* renamed from: a */
    public final C19457a mo95219a() {
        return this.f295996N;
    }

    /* renamed from: b */
    public final C58833ax mo95220b() {
        return this.f296008f.mo56113h() ? this.f296008f : C58836b.f156633a;
    }

    /* renamed from: c */
    public final C58833ax mo95221c() {
        return this.f296022t.mo56113h() ? C58833ax.m90834k((ViewGroup) this.f296022t.mo56107c()) : C58836b.f156633a;
    }

    /* renamed from: d */
    public final C60870cx mo95222d(C51885cs csVar) {
        C58976aa aaVar = C58975e.f156826a;
        if (!this.f296021s) {
            C59104x c = f295983a.mo56225c();
            c.mo56378ag(C58975e.f156826a, "ImmersiveCanvasCtrlr");
            ((C59052c) ((C59052c) c).mo56372aa(24670)).mo56386p("ImmersiveCanvas must be running in order to handle args");
            return C60856cj.m92898g();
        } else if (!m176599P(csVar)) {
            return C60856cj.m92898g();
        } else {
            this.f296023u = csVar;
            mo95214D();
            this.f295985B = csVar.f136098q;
            this.f295987D = csVar.f136099r;
            if (C51843bd.m86399a(csVar.f136083b) == C51843bd.EXIT && csVar.f136083b == 7 && ((Boolean) csVar.f136084c).booleanValue()) {
                ((C109262i) this.f295997O).f304363a.mo98077i();
                return C60866ct.f164955a;
            }
            mo95232n(this.f296010h.getResources().getConfiguration());
            return mo95241w();
        }
    }

    /* renamed from: e */
    public final C60870cx mo95223e(C51885cs csVar, C50870f fVar, String str, C22864c cVar, C22869e eVar, C108226ax axVar, C108237bh bhVar) {
        C108423id idVar;
        C51885cs csVar2 = csVar;
        C50870f fVar2 = fVar;
        C108226ax axVar2 = axVar;
        C108237bh bhVar2 = bhVar;
        if (!m176599P(csVar)) {
            return C60856cj.m92898g();
        }
        if (C51843bd.m86399a(csVar2.f136083b) == C51843bd.EXIT && csVar2.f136083b == 7 && ((Boolean) csVar2.f136084c).booleanValue()) {
            C59104x c = f295983a.mo56225c();
            c.mo56378ag(C58975e.f156826a, "ImmersiveCanvasCtrlr");
            ((C59052c) ((C59052c) c).mo56372aa(24672)).mo56386p("ImmersiveCanvas should not be exiting on initialization.");
            return C60856cj.m92898g();
        }
        this.f296023u = csVar2;
        this.f295995M = m176592I(csVar);
        this.f296028z = cVar;
        this.f295997O = eVar;
        mo95214D();
        this.f295985B = csVar2.f136098q;
        this.f295998P = csVar2.f136101t;
        int a = C51884cr.m86406a(csVar2.f136100s);
        this.f295999Q = a != 0 && a == 3;
        this.f295986C = axVar2;
        m176594K();
        C51882cp cpVar = this.f296023u.f136096o;
        if (cpVar == null) {
            cpVar = C51882cp.f136072b;
        }
        C63037fb fbVar = cpVar.f136074a;
        if (fbVar == null) {
            fbVar = C63037fb.f170144b;
        }
        this.f295989F = (C63034ez) fbVar.toBuilder();
        if (!this.f296005c.mo56113h()) {
            C107469ah ahVar = (C107469ah) C107472ak.f299049c.createBuilder();
            ahVar.copyOnWrite();
            C107472ak akVar = (C107472ak) ahVar.instance;
            akVar.f299052b = 1;
            akVar.f299051a |= 1;
            m176598O((C107472ak) ahVar.build());
        }
        if (bhVar2 != null) {
            idVar = this.f296002T.mo96870a(bhVar2, axVar2, (View) null);
        } else {
            C59104x d = f295983a.mo56226d();
            d.mo56378ag(C58975e.f156826a, "ImmersiveCanvasCtrlr");
            ((C59052c) ((C59052c) d).mo56372aa(24671)).mo56389s("ImmersiveCanvas suggestion adapter can not be created as %s is null.", "chatUiStyle");
            idVar = null;
        }
        C58833ax k = C58833ax.m90834k((FrameLayout) LayoutInflater.from(C108435ip.m180256a(this.f296003U, this.f296010h)).inflate(R.layout.immersivecanvas, (ViewGroup) null));
        this.f296022t = k;
        ViewGroup viewGroup = (ViewGroup) ((FrameLayout) k.mo56107c()).findViewById(R.id.canvas_footer);
        this.f295996N = new C19457a();
        if (!this.f296006d.mo56113h()) {
            C106054j jVar = this.f295992J;
            Context context = this.f296010h;
            View findViewById = viewGroup.findViewById(R.id.canvas_mic_plate_container);
            C19457a aVar = this.f295996N;
            C106005ad adVar = new C106005ad(this);
            findViewById.getClass();
            aVar.getClass();
            C107698i iVar = (C107698i) jVar.f296088a.mo17428b();
            iVar.getClass();
            C107710u uVar = (C107710u) jVar.f296089b.mo17428b();
            uVar.getClass();
            Query query = (Query) jVar.f296090c.mo17428b();
            query.getClass();
            this.f296006d = C58833ax.m90834k(new C106053i(context, findViewById, aVar, adVar, iVar, uVar, query));
        }
        if (idVar == null) {
            C59104x d2 = f295983a.mo56226d();
            d2.mo56378ag(C58975e.f156826a, "ImmersiveCanvasCtrlr");
            ((C59052c) ((C59052c) d2).mo56372aa(24680)).mo56386p("ImmersiveCanvas suggestion adapter is not created.");
        } else if (!this.f296007e.mo56113h()) {
            Context context2 = this.f296010h;
            ViewGroup viewGroup2 = (ViewGroup) viewGroup.findViewById(R.id.canvas_suggestion_chip_wrapper);
            viewGroup2.getClass();
            this.f296007e = C58833ax.m90834k(new C106055k(context2, viewGroup2, idVar));
        }
        try {
            C58976aa aaVar = C58975e.f156826a;
            View findViewById2 = ((FrameLayout) this.f296022t.mo56107c()).findViewById(R.id.immersivecanvas_root);
            C28295m.m52919e(findViewById2, new C28292j(55114));
            C60321oe a2 = C28285c.m52874a(findViewById2, 58810);
            if (!(a2 == null || str == null)) {
                C60320od odVar = (C60320od) a2.toBuilder();
                C60217q qVar = (C60217q) C60218r.f162925d.createBuilder();
                C60220t b = C28294l.m52912b(str);
                qVar.copyOnWrite();
                C60218r rVar = (C60218r) qVar.instance;
                b.getClass();
                rVar.f162928b = b;
                rVar.f162927a |= 1;
                C60218r rVar2 = (C60218r) qVar.build();
                odVar.copyOnWrite();
                C60321oe oeVar = (C60321oe) odVar.instance;
                rVar2.getClass();
                oeVar.f163229d = rVar2;
                oeVar.f163226a |= 2;
                C60449ql qlVar = (C60449ql) C60450qm.f163590b.createBuilder();
                C60446qi qiVar = (C60446qi) C60448qk.f163581g.createBuilder();
                qiVar.copyOnWrite();
                C60448qk qkVar = (C60448qk) qiVar.instance;
                qkVar.f163585c = 3;
                qkVar.f163583a |= 2;
                C60451qn qnVar = (C60451qn) C60452qo.f163594e.createBuilder();
                qnVar.copyOnWrite();
                C60452qo qoVar = (C60452qo) qnVar.instance;
                rVar2.getClass();
                qoVar.f163597b = rVar2;
                qoVar.f163596a = 3;
                C60213m mVar = (C60213m) C60214n.f162914g.createBuilder();
                mVar.copyOnWrite();
                C60214n nVar = (C60214n) mVar.instance;
                nVar.f162916a |= 1;
                nVar.f162917b = 0;
                mVar.copyOnWrite();
                C60214n nVar2 = (C60214n) mVar.instance;
                nVar2.f162916a |= 8;
                nVar2.f162918c = 23263;
                qnVar.copyOnWrite();
                C60452qo qoVar2 = (C60452qo) qnVar.instance;
                C60214n nVar3 = (C60214n) mVar.build();
                nVar3.getClass();
                qoVar2.f163599d = nVar3;
                qoVar2.f163598c = 2;
                qiVar.copyOnWrite();
                C60448qk qkVar2 = (C60448qk) qiVar.instance;
                C60452qo qoVar3 = (C60452qo) qnVar.build();
                qoVar3.getClass();
                qkVar2.f163584b = qoVar3;
                qkVar2.f163583a |= 1;
                qlVar.mo57090a(qiVar);
                odVar.copyOnWrite();
                C60321oe oeVar2 = (C60321oe) odVar.instance;
                C60450qm qmVar = (C60450qm) qlVar.build();
                qmVar.getClass();
                oeVar2.f163232g = qmVar;
                oeVar2.f163226a |= 64;
                a2 = (C60321oe) odVar.build();
            }
            this.f296004b.mo100721a(0, 0, a2);
        } catch (Exception unused) {
            C58976aa aaVar2 = C58975e.f156826a;
        }
        ((C89859i) this.f295993K.mo27525b()).mo83702b(C89849ae.IMMERSIVE_CANVAS_START);
        this.f296021s = true;
        this.f295984A = false;
        this.f295988E = false;
        if (!(fVar2 == null || (fVar2.f132448a & 8) == 0)) {
            C51073fj fjVar = fVar2.f132453f;
            if (fjVar == null) {
                fjVar = C51073fj.f132977d;
            }
            int i = fjVar.f132981c;
            ((FrameLayout) this.f296022t.mo56107c()).findViewById(R.id.title_bar_container).setVisibility(0);
            C106036bh bhVar3 = new C106036bh((View) this.f296022t.mo56107c());
            bhVar3.f296052b.setText(fVar2.f132449b);
            bhVar3.f296051a.mo76738i(fVar2.f132450c, (C91189au) this.f295991I.mo27525b());
            this.f296008f = C58833ax.m90834k(bhVar3);
        }
        if (!csVar2.f136095n) {
            ((TouchInterceptingFrameLayout) ((FrameLayout) this.f296022t.mo56107c()).findViewById(R.id.canvas_and_rotation_message_container)).f253398a = new C106003ab(this);
        }
        return this.f296027y;
    }

    /* renamed from: f */
    public final void mo95224f(java.util.Collection collection) {
        if (this.f296007e.mo56113h()) {
            C106055k kVar = (C106055k) this.f296007e.mo56107c();
            kVar.f296092b.mo96861d(collection);
            if (kVar.f296092b.getItemCount() > 0) {
                kVar.f296092b.mo96866j(true);
                kVar.f296091a.setVisibility(0);
                kVar.f296091a.setEnabled(true);
                return;
            }
            return;
        }
        C59104x d = f295983a.mo56226d();
        d.mo56378ag(C58975e.f156826a, "ImmersiveCanvasCtrlr");
        ((C59052c) ((C59052c) d).mo56372aa(24677)).mo56386p("Can not add suggestion chips as suggestion chip controller is not created.");
    }

    /* renamed from: g */
    public final void mo95225g() {
        if (this.f296007e.mo56113h()) {
            C106055k kVar = (C106055k) this.f296007e.mo56107c();
            kVar.f296092b.mo96863g();
            kVar.f296092b.mo96866j(false);
            kVar.f296091a.setVisibility(8);
            kVar.f296091a.setEnabled(false);
            return;
        }
        C59104x d = f295983a.mo56226d();
        d.mo56378ag(C58975e.f156826a, "ImmersiveCanvasCtrlr");
        ((C59052c) ((C59052c) d).mo56372aa(24679)).mo56386p("Can not clear suggestion chips as suggestion chip controller is not created.");
    }

    /* renamed from: h */
    public final void mo95226h() {
        this.f296027y = new SettableFuture();
        this.f296024v = C51842bc.f135998g;
        if (this.f296005c.mo56113h()) {
            C107469ah ahVar = (C107469ah) C107472ak.f299049c.createBuilder();
            ahVar.copyOnWrite();
            C107472ak akVar = (C107472ak) ahVar.instance;
            akVar.f299052b = 2;
            akVar.f299051a |= 1;
            m176598O((C107472ak) ahVar.build());
            WebView webView = ((C18431p) this.f296005c.mo56107c()).f52310b;
            if (!(webView == null || webView.getParent() == null)) {
                ((ViewGroup) webView.getParent()).removeView(webView);
            }
            C18431p pVar = (C18431p) this.f296005c.mo56107c();
            pVar.mo23965i();
            pVar.f52310b.destroy();
            this.f296005c = C58836b.f156633a;
        }
        if (this.f296022t.mo56113h()) {
            if (((FrameLayout) this.f296022t.mo56107c()).getParent() != null) {
                ((ViewGroup) ((FrameLayout) this.f296022t.mo56107c()).getParent()).removeView((View) this.f296022t.mo56107c());
            }
            this.f296022t = C58836b.f156633a;
        }
        if (this.f296008f.mo56113h()) {
            this.f296008f = C58836b.f156633a;
        }
        if (this.f296006d.mo56113h()) {
            this.f296006d = C58836b.f156633a;
        }
        if (this.f296007e.mo56113h()) {
            this.f296007e = C58836b.f156633a;
        }
        m176593J();
        m176594K();
        m176595L();
        ((C89859i) this.f295993K.mo27525b()).mo83702b(C89849ae.IMMERSIVE_CANVAS_EXIT);
        this.f296021s = false;
        this.f295988E = false;
    }

    /* renamed from: i */
    public final void mo95227i() {
        if (this.f296007e.mo56113h()) {
            ((C106055k) this.f296007e.mo56107c()).f296092b.mo96866j(true);
        }
    }

    /* renamed from: j */
    public final void mo95228j() {
        C106061q qVar = this.f295994L;
        View decorView = qVar.f296098a.getWindow().getDecorView();
        qVar.f296102e = qVar.f296098a.findViewById(R.id.opa_top_level).getFitsSystemWindows();
        qVar.f296103f = decorView.getSystemUiVisibility();
        qVar.mo95280b();
        if (!qVar.f296101d) {
            qVar.f296099b = new C106060p(qVar);
            qVar.f296098a.getWindow().getDecorView().getViewTreeObserver().addOnGlobalLayoutListener(qVar.f296099b);
            qVar.f296101d = true;
        }
    }

    /* renamed from: k */
    public final void mo95229k() {
        C106061q qVar = this.f295994L;
        if (qVar.f296101d) {
            qVar.f296098a.getWindow().getDecorView().getViewTreeObserver().removeOnGlobalLayoutListener(qVar.f296099b);
            qVar.f296101d = false;
        }
        View decorView = qVar.f296098a.getWindow().getDecorView();
        qVar.f296098a.findViewById(R.id.opa_top_level).setFitsSystemWindows(qVar.f296102e);
        decorView.setSystemUiVisibility(qVar.f296103f);
        qVar.f296100c = false;
    }

    /* renamed from: m */
    public final void mo95231m(C51874ch chVar) {
        C18430o oVar;
        int a = C51873cg.m86403a(chVar.f136062b);
        if (a == 0) {
            a = 1;
        }
        C51843bd bdVar = C51843bd.APPLICATION_URL;
        C88244um umVar = C88244um.ATTACH_WEBVIEW;
        int i = a - 1;
        if (i == 1) {
            oVar = C18430o.OK;
        } else if (i == 3) {
            oVar = C18430o.SKIP;
        } else if (i != 4) {
            oVar = C18430o.UNKNOWN;
        } else {
            oVar = C18430o.ERROR;
        }
        if (this.f296013k.mo79746e(C90041ct.f248695h)) {
            this.f296015m.mo95248b(((C63037fb) this.f295989F.build()).getSerializedSize(), oVar, this.f296024v);
        }
        ((C18431p) this.f296005c.mo56107c()).mo23961g(chVar.f136061a, oVar, BuildConfig.FLAVOR, chVar.f136063c);
    }

    /* renamed from: n */
    public final void mo95232n(Configuration configuration) {
        int a = C51878cl.m86405a(this.f296023u.f136088g);
        if (a == 0) {
            a = 1;
        }
        if (a != 2 ? !(a == 3 && configuration.orientation == 1) : configuration.orientation != 2) {
            m176596M(false);
        } else {
            m176596M(true);
        }
        C106061q qVar = this.f295994L;
        if (!qVar.f296100c) {
            qVar.mo95281c();
        }
    }

    /* renamed from: o */
    public final void mo95233o() {
        mo95244z();
    }

    /* renamed from: p */
    public final void mo95234p() {
        C58976aa aaVar = C58975e.f156826a;
        if (this.f296005c.mo56113h() && !this.f295988E) {
            this.f296012j.mo28212l("onPauseCanvas", new C106070z(this));
        }
    }

    /* renamed from: q */
    public final void mo95235q() {
        C58976aa aaVar = C58975e.f156826a;
        if (this.f296021s) {
            C106053i iVar = (C106053i) this.f296006d.mo56107c();
            iVar.f296078h = false;
            if (iVar.f296072b.f63000g.f63060j == 4 && !iVar.f296079i) {
                iVar.mo95269a();
            }
        }
    }

    /* renamed from: r */
    public final void mo95236r() {
        C106061q qVar = this.f295994L;
        if (qVar.f296100c) {
            qVar.mo95280b();
        } else {
            qVar.mo95281c();
        }
        if (this.f296005c.mo56113h()) {
            C18431p pVar = (C18431p) this.f296005c.mo56107c();
            if (pVar.f52320l.mo23950a() != C18422g.LOADED) {
                ((C59052c) ((C59052c) C18431p.f52308a.mo56225c()).mo56372aa(47321)).mo56386p("Page content not loaded onResumeCanvas");
            } else {
                pVar.f52310b.evaluateJavascript(pVar.mo23953c("onResume", new Object[0]), (ValueCallback) null);
                pVar.f52310b.onResume();
            }
        }
        m176593J();
    }

    /* renamed from: s */
    public final void mo95237s() {
        C58976aa aaVar = C58975e.f156826a;
        if (this.f296005c.mo56113h() && this.f295988E) {
            this.f296012j.mo28212l("onResumeCanvas", new C106068x(this));
        }
    }

    /* renamed from: t */
    public final void mo95238t() {
        if (this.f296007e.mo56113h()) {
            ((C106055k) this.f296007e.mo56107c()).f296092b.mo96866j(false);
        }
        if (this.f296006d.mo56113h()) {
            ((C106053i) this.f296006d.mo56107c()).mo95270b();
        }
    }

    /* renamed from: u */
    public final boolean mo95239u() {
        return this.f295988E;
    }

    /* renamed from: v */
    public final boolean mo95240v() {
        return this.f296021s;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v21, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v3, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v45, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v6, resolved type: java.lang.String} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: w */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.common.util.concurrent.C60870cx mo95241w() {
        /*
            r16 = this;
            r0 = r16
            com.google.common.util.concurrent.cx r1 = com.google.common.util.concurrent.C60866ct.f164955a
            com.google.assistant.e.j.e.cs r2 = r0.f296023u
            int r3 = r2.f136086e
            int r3 = com.google.assistant.p3897e.p3921j.p3926e.C51876cj.m86404a(r3)
            r4 = 2
            r5 = 0
            r6 = 1
            if (r3 != 0) goto L_0x0013
        L_0x0011:
            r3 = 0
            goto L_0x0016
        L_0x0013:
            if (r3 != r4) goto L_0x0011
            r3 = 1
        L_0x0016:
            boolean r7 = r2.f136094m
            int r2 = r2.f136092k
            int r2 = com.google.assistant.p3897e.p3921j.p3926e.C51865bz.m86402a(r2)
            r8 = 5
            if (r2 != 0) goto L_0x0023
        L_0x0021:
            r2 = 0
            goto L_0x0026
        L_0x0023:
            if (r2 != r8) goto L_0x0021
            r2 = 1
        L_0x0026:
            com.google.assistant.e.j.e.cs r9 = r0.f296023u
            java.lang.String r9 = m176592I(r9)
            java.lang.String r10 = r0.f295995M
            boolean r10 = r10.equals(r9)
            if (r10 != 0) goto L_0x0039
            r16.mo95225g()
            r0.f295995M = r9
        L_0x0039:
            com.google.assistant.e.j.e.bd r9 = com.google.assistant.p3897e.p3921j.p3926e.C51843bd.APPLICATION_URL
            com.google.android.apps.gsa.search.shared.service.b.um r9 = com.google.android.apps.gsa.search.shared.service.p6935b.C88244um.ATTACH_WEBVIEW
            com.google.assistant.e.j.e.cs r9 = r0.f296023u
            int r9 = r9.f136083b
            com.google.assistant.e.j.e.bd r9 = com.google.assistant.p3897e.p3921j.p3926e.C51843bd.m86399a(r9)
            int r9 = r9.ordinal()
            java.lang.String r10 = "file:///android_asset/immersive_shim.html"
            r11 = 8
            java.lang.String r12 = ""
            r13 = 4
            r14 = 3
            r15 = 0
            if (r9 == 0) goto L_0x00e4
            if (r9 == r6) goto L_0x0058
            goto L_0x017b
        L_0x0058:
            com.google.common.base.ax r1 = r0.f296005c
            java.lang.Object r1 = r1.mo56107c()
            com.google.android.libraries.assistant.m.a.p r1 = (com.google.android.libraries.assistant.p1528m.p1529a.C18431p) r1
            com.google.assistant.e.j.e.cs r9 = r0.f296023u
            int r8 = r9.f136083b
            if (r8 != r4) goto L_0x006b
            java.lang.Object r8 = r9.f136084c
            r12 = r8
            java.lang.String r12 = (java.lang.String) r12
        L_0x006b:
            java.lang.String r8 = r9.f136090i
            r1.mo23967k(r7)
            r1.mo23966j(r2)
            r1.mo23965i()
            com.google.android.libraries.assistant.m.a.n r2 = r1.f52320l
            r2.mo23952c(r15)
            com.google.android.libraries.assistant.m.a.n r2 = r1.f52320l
            java.lang.Object[] r7 = new java.lang.Object[r11]
            java.lang.String r9 = r1.f52318j
            java.lang.String r9 = com.google.android.libraries.assistant.p1528m.p1529a.C18431p.m35890d(r9)
            r7[r5] = r9
            java.lang.String r8 = com.google.android.libraries.assistant.p1528m.p1529a.C18431p.m35890d(r8)
            r7[r6] = r8
            double r8 = r1.f52313e
            java.lang.String r8 = java.lang.Double.toString(r8)
            r7[r4] = r8
            long r8 = r1.f52319k
            java.lang.String r8 = java.lang.Long.toString(r8)
            r7[r14] = r8
            com.google.protobuf.fb r8 = r1.f52314f
            java.lang.Object r8 = com.google.android.libraries.assistant.p1528m.p1529a.C18431p.m35888a(r8)
            java.lang.String r8 = r8.toString()
            java.lang.String r8 = com.google.android.libraries.assistant.p1528m.p1529a.C18431p.m35890d(r8)
            r7[r13] = r8
            com.google.protobuf.fb r8 = r1.f52315g
            java.lang.Object r8 = com.google.android.libraries.assistant.p1528m.p1529a.C18431p.m35888a(r8)
            java.lang.String r8 = r8.toString()
            java.lang.String r8 = com.google.android.libraries.assistant.p1528m.p1529a.C18431p.m35890d(r8)
            r9 = 5
            r7[r9] = r8
            java.lang.String r8 = com.google.android.libraries.assistant.p1528m.p1529a.C18431p.m35890d(r12)
            r9 = 6
            r7[r9] = r8
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r3)
            r8 = 7
            r7[r8] = r3
            java.lang.String r3 = "initializeMessageHandler({0}, {1}, {2}, {3}, {4}, {5}); setIframeSrcdoc({6}, {7});"
            java.lang.String r3 = java.text.MessageFormat.format(r3, r7)
            r2.f52297e = r3
            android.webkit.WebView r2 = r1.f52310b
            r2.loadUrl(r10)
            android.webkit.WebView r2 = r1.f52310b
            r2.setBackgroundColor(r5)
            com.google.android.libraries.assistant.m.a.n r1 = r1.f52320l
            com.google.common.util.concurrent.SettableFuture r1 = r1.f52294b
            goto L_0x017b
        L_0x00e4:
            com.google.common.base.ax r1 = r0.f296005c
            java.lang.Object r1 = r1.mo56107c()
            com.google.android.libraries.assistant.m.a.p r1 = (com.google.android.libraries.assistant.p1528m.p1529a.C18431p) r1
            com.google.assistant.e.j.e.cs r8 = r0.f296023u
            int r9 = r8.f136083b
            if (r9 != r6) goto L_0x00f7
            java.lang.Object r9 = r8.f136084c
            r12 = r9
            java.lang.String r12 = (java.lang.String) r12
        L_0x00f7:
            java.lang.String r8 = r8.f136090i
            com.google.android.libraries.assistant.m.a.n r9 = r1.f52320l
            java.lang.String r9 = r9.f52296d
            boolean r9 = r12.equals(r9)
            if (r9 == 0) goto L_0x0106
            com.google.common.util.concurrent.cx r1 = com.google.common.util.concurrent.C60866ct.f164955a
            goto L_0x017b
        L_0x0106:
            r1.mo23967k(r7)
            r1.mo23966j(r2)
            r1.mo23965i()
            com.google.android.libraries.assistant.m.a.n r2 = r1.f52320l
            r2.mo23952c(r12)
            com.google.android.libraries.assistant.m.a.n r2 = r1.f52320l
            java.lang.Object[] r7 = new java.lang.Object[r11]
            java.lang.String r9 = r1.f52318j
            java.lang.String r9 = com.google.android.libraries.assistant.p1528m.p1529a.C18431p.m35890d(r9)
            r7[r5] = r9
            java.lang.String r8 = com.google.android.libraries.assistant.p1528m.p1529a.C18431p.m35890d(r8)
            r7[r6] = r8
            double r8 = r1.f52313e
            java.lang.String r8 = java.lang.Double.toString(r8)
            r7[r4] = r8
            long r8 = r1.f52319k
            java.lang.String r8 = java.lang.Long.toString(r8)
            r7[r14] = r8
            com.google.protobuf.fb r8 = r1.f52314f
            java.lang.Object r8 = com.google.android.libraries.assistant.p1528m.p1529a.C18431p.m35888a(r8)
            java.lang.String r8 = r8.toString()
            java.lang.String r8 = com.google.android.libraries.assistant.p1528m.p1529a.C18431p.m35890d(r8)
            r7[r13] = r8
            com.google.protobuf.fb r8 = r1.f52315g
            java.lang.Object r8 = com.google.android.libraries.assistant.p1528m.p1529a.C18431p.m35888a(r8)
            java.lang.String r8 = r8.toString()
            java.lang.String r8 = com.google.android.libraries.assistant.p1528m.p1529a.C18431p.m35890d(r8)
            r9 = 5
            r7[r9] = r8
            java.lang.String r8 = com.google.android.libraries.assistant.p1528m.p1529a.C18431p.m35890d(r12)
            r9 = 6
            r7[r9] = r8
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r3)
            r8 = 7
            r7[r8] = r3
            java.lang.String r3 = "initializeMessageHandler({0}, {1}, {2}, {3}, {4}, {5}); setIframeSrc({6}, {7});"
            java.lang.String r3 = java.text.MessageFormat.format(r3, r7)
            r2.f52297e = r3
            android.webkit.WebView r2 = r1.f52310b
            r2.loadUrl(r10)
            android.webkit.WebView r2 = r1.f52310b
            r2.setBackgroundColor(r5)
            com.google.android.libraries.assistant.m.a.n r1 = r1.f52320l
            com.google.common.util.concurrent.SettableFuture r1 = r1.f52294b
        L_0x017b:
            com.google.assistant.e.j.e.cs r2 = r0.f296023u
            com.google.assistant.e.j.e.bt r2 = r2.f136085d
            if (r2 != 0) goto L_0x0183
            com.google.assistant.e.j.e.bt r2 = com.google.assistant.p3897e.p3921j.p3926e.C51859bt.f136033c
        L_0x0183:
            int r2 = r2.f136035a
            if (r2 != r6) goto L_0x01e5
            com.google.common.base.ax r1 = r0.f296005c
            java.lang.Object r1 = r1.mo56107c()
            com.google.android.libraries.assistant.m.a.p r1 = (com.google.android.libraries.assistant.p1528m.p1529a.C18431p) r1
            com.google.assistant.e.j.e.cs r2 = r0.f296023u
            com.google.assistant.e.j.e.bt r2 = r2.f136085d
            if (r2 != 0) goto L_0x0197
            com.google.assistant.e.j.e.bt r2 = com.google.assistant.p3897e.p3921j.p3926e.C51859bt.f136033c
        L_0x0197:
            int r3 = r2.f136035a
            if (r3 != r6) goto L_0x01a0
            java.lang.Object r2 = r2.f136036b
            com.google.assistant.e.j.e.bs r2 = (com.google.assistant.p3897e.p3921j.p3926e.C51858bs) r2
            goto L_0x01a2
        L_0x01a0:
            com.google.assistant.e.j.e.bs r2 = com.google.assistant.p3897e.p3921j.p3926e.C51858bs.f136029b
        L_0x01a2:
            java.lang.String r2 = r2.f136031a
            com.google.android.libraries.assistant.m.a.g r3 = com.google.android.libraries.assistant.p1528m.p1529a.C18422g.NO_CONTENT
            com.google.android.libraries.assistant.m.a.n r3 = r1.f52320l
            com.google.android.libraries.assistant.m.a.g r3 = r3.mo23950a()
            int r3 = r3.ordinal()
            if (r3 == 0) goto L_0x01da
            if (r3 == r6) goto L_0x01bd
            if (r3 != r4) goto L_0x01b7
            goto L_0x01bd
        L_0x01b7:
            java.lang.AssertionError r1 = new java.lang.AssertionError
            r1.<init>()
            throw r1
        L_0x01bd:
            com.google.android.libraries.assistant.m.a.l r3 = new com.google.android.libraries.assistant.m.a.l
            r3.<init>(r1, r2)
            java.util.Map r2 = r1.f52316h
            java.lang.String r5 = r3.f52287a
            r2.put(r5, r3)
            com.google.android.libraries.assistant.m.a.n r1 = r1.f52320l
            com.google.android.libraries.assistant.m.a.g r1 = r1.mo23950a()
            com.google.android.libraries.assistant.m.a.g r2 = com.google.android.libraries.assistant.p1528m.p1529a.C18422g.LOADED
            if (r1 != r2) goto L_0x01d6
            r3.mo23948b()
        L_0x01d6:
            com.google.common.util.concurrent.SettableFuture r1 = r3.f52289c
            goto L_0x0367
        L_0x01da:
            java.lang.String r2 = "perform update before the app content has been set"
            r1.mo23960f(r2)
            com.google.common.util.concurrent.cx r1 = com.google.common.util.concurrent.C60856cj.m92898g()
            goto L_0x0367
        L_0x01e5:
            com.google.assistant.e.j.e.cs r2 = r0.f296023u
            com.google.assistant.e.j.e.bt r2 = r2.f136085d
            if (r2 != 0) goto L_0x01ee
            com.google.assistant.e.j.e.bt r3 = com.google.assistant.p3897e.p3921j.p3926e.C51859bt.f136033c
            goto L_0x01ef
        L_0x01ee:
            r3 = r2
        L_0x01ef:
            int r3 = r3.f136035a
            r7 = 5
            if (r3 != r7) goto L_0x02a6
            com.google.common.base.ax r2 = r0.f296005c
            java.lang.Object r2 = r2.mo56107c()
            com.google.android.libraries.assistant.m.a.p r2 = (com.google.android.libraries.assistant.p1528m.p1529a.C18431p) r2
            com.google.assistant.e.j.e.cs r3 = r0.f296023u
            com.google.assistant.e.j.e.bt r3 = r3.f136085d
            if (r3 != 0) goto L_0x0204
            com.google.assistant.e.j.e.bt r3 = com.google.assistant.p3897e.p3921j.p3926e.C51859bt.f136033c
        L_0x0204:
            int r8 = r3.f136035a
            if (r8 != r7) goto L_0x020d
            java.lang.Object r3 = r3.f136036b
            com.google.assistant.e.j.e.bo r3 = (com.google.assistant.p3897e.p3921j.p3926e.C51854bo) r3
            goto L_0x020f
        L_0x020d:
            com.google.assistant.e.j.e.bo r3 = com.google.assistant.p3897e.p3921j.p3926e.C51854bo.f136022e
        L_0x020f:
            com.google.android.libraries.assistant.m.a.n r7 = r2.f52320l
            com.google.android.libraries.assistant.m.a.g r7 = r7.mo23950a()
            com.google.android.libraries.assistant.m.a.g r8 = com.google.android.libraries.assistant.p1528m.p1529a.C18422g.LOADED
            if (r7 == r8) goto L_0x0229
            com.google.common.f.e r2 = com.google.android.libraries.assistant.p1528m.p1529a.C18431p.f52308a
            com.google.common.f.x r2 = r2.mo56225c()
            java.lang.String r3 = "Page content not loaded."
            r5 = 47318(0xb8d6, float:6.6307E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r2).mo56372aa(r5)).mo56386p(r3)
            goto L_0x0367
        L_0x0229:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            java.lang.String r8 = "["
            r7.<init>(r8)
            com.google.protobuf.cq r9 = r3.f136025b
            r10 = 0
        L_0x0233:
            int r11 = r9.size()
            java.lang.String r12 = "]"
            if (r10 >= r11) goto L_0x0284
            java.lang.String r11 = ", "
            if (r10 <= 0) goto L_0x0242
            r7.append(r11)
        L_0x0242:
            java.lang.String r13 = "{'phrases': "
            r7.append(r13)
            java.lang.Object r13 = r9.get(r10)
            com.google.assistant.e.j.e.bn r13 = (com.google.assistant.p3897e.p3921j.p3926e.C51853bn) r13
            com.google.protobuf.cq r13 = r13.f136021a
            java.lang.StringBuilder r14 = new java.lang.StringBuilder
            r14.<init>(r8)
            r15 = 0
        L_0x0255:
            int r6 = r13.size()
            if (r15 >= r6) goto L_0x0270
            if (r15 <= 0) goto L_0x0260
            r14.append(r11)
        L_0x0260:
            java.lang.Object r6 = r13.get(r15)
            java.lang.String r6 = (java.lang.String) r6
            java.lang.String r6 = com.google.android.libraries.assistant.p1528m.p1529a.C18431p.m35890d(r6)
            r14.append(r6)
            int r15 = r15 + 1
            goto L_0x0255
        L_0x0270:
            r14.append(r12)
            java.lang.String r6 = r14.toString()
            r7.append(r6)
            java.lang.String r6 = "}"
            r7.append(r6)
            int r10 = r10 + 1
            r6 = 1
            r15 = 0
            goto L_0x0233
        L_0x0284:
            r7.append(r12)
            java.lang.String r6 = r7.toString()
            android.webkit.WebView r7 = r2.f52310b
            java.lang.Object[] r8 = new java.lang.Object[r4]
            r8[r5] = r6
            boolean r3 = r3.f136026c
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r3)
            r5 = 1
            r8[r5] = r3
            java.lang.String r3 = "onStreamingPhraseMatch"
            java.lang.String r2 = r2.mo23953c(r3, r8)
            r3 = 0
            r7.evaluateJavascript(r2, r3)
            goto L_0x0367
        L_0x02a6:
            if (r2 != 0) goto L_0x02ab
            com.google.assistant.e.j.e.bt r3 = com.google.assistant.p3897e.p3921j.p3926e.C51859bt.f136033c
            goto L_0x02ac
        L_0x02ab:
            r3 = r2
        L_0x02ac:
            int r3 = r3.f136035a
            r6 = 7
            if (r3 != r6) goto L_0x02e9
            com.google.common.base.ax r2 = r0.f296005c
            java.lang.Object r2 = r2.mo56107c()
            com.google.android.libraries.assistant.m.a.p r2 = (com.google.android.libraries.assistant.p1528m.p1529a.C18431p) r2
            com.google.assistant.e.j.e.cs r3 = r0.f296023u
            com.google.assistant.e.j.e.bt r3 = r3.f136085d
            if (r3 != 0) goto L_0x02c1
            com.google.assistant.e.j.e.bt r3 = com.google.assistant.p3897e.p3921j.p3926e.C51859bt.f136033c
        L_0x02c1:
            int r5 = r3.f136035a
            if (r5 != r6) goto L_0x02d3
            java.lang.Object r3 = r3.f136036b
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = r3.intValue()
            int r3 = com.google.assistant.p3897e.p3921j.p3926e.C51856bq.m86401a(r3)
            if (r3 != 0) goto L_0x02d4
        L_0x02d3:
            r3 = 1
        L_0x02d4:
            com.google.android.libraries.assistant.m.a.g r5 = com.google.android.libraries.assistant.p1528m.p1529a.C18422g.NO_CONTENT
            int r3 = r3 + -1
            r5 = 1
            if (r3 == r5) goto L_0x02e5
            if (r3 == r4) goto L_0x02e1
            r2.f52321m = r5
            goto L_0x0367
        L_0x02e1:
            r2.f52321m = r13
            goto L_0x0367
        L_0x02e5:
            r2.f52321m = r4
            goto L_0x0367
        L_0x02e9:
            if (r2 != 0) goto L_0x02ed
            com.google.assistant.e.j.e.bt r2 = com.google.assistant.p3897e.p3921j.p3926e.C51859bt.f136033c
        L_0x02ed:
            int r2 = r2.f136035a
            r3 = 6
            if (r2 != r3) goto L_0x0367
            com.google.common.base.ax r2 = r0.f296005c
            java.lang.Object r2 = r2.mo56107c()
            com.google.android.libraries.assistant.m.a.p r2 = (com.google.android.libraries.assistant.p1528m.p1529a.C18431p) r2
            com.google.assistant.e.j.e.cs r6 = r0.f296023u
            com.google.assistant.e.j.e.bt r6 = r6.f136085d
            if (r6 != 0) goto L_0x0302
            com.google.assistant.e.j.e.bt r6 = com.google.assistant.p3897e.p3921j.p3926e.C51859bt.f136033c
        L_0x0302:
            int r7 = r6.f136035a
            if (r7 != r3) goto L_0x030b
            java.lang.Object r6 = r6.f136036b
            com.google.assistant.e.j.e.bj r6 = (com.google.assistant.p3897e.p3921j.p3926e.C51849bj) r6
            goto L_0x030d
        L_0x030b:
            com.google.assistant.e.j.e.bj r6 = com.google.assistant.p3897e.p3921j.p3926e.C51849bj.f136012d
        L_0x030d:
            int r7 = r6.f136014a
            int r8 = com.google.assistant.p3897e.p3921j.p3926e.C51847bh.m86400a(r7)
            java.lang.String r9 = "onMediaControl"
            if (r8 != 0) goto L_0x0319
        L_0x0317:
            r10 = 1
            goto L_0x034a
        L_0x0319:
            if (r8 != r3) goto L_0x0317
            android.webkit.WebView r3 = r2.f52310b
            java.lang.Object[] r8 = new java.lang.Object[r14]
            int r7 = com.google.assistant.p3897e.p3921j.p3926e.C51847bh.m86400a(r7)
            if (r7 != 0) goto L_0x0326
            r7 = 1
        L_0x0326:
            java.lang.String r7 = com.google.android.libraries.assistant.p1528m.p1529a.C18431p.m35891o(r7)
            java.lang.String r7 = com.google.android.libraries.assistant.p1528m.p1529a.C18431p.m35890d(r7)
            r8[r5] = r7
            long r10 = r6.f136015b
            java.lang.Long r5 = java.lang.Long.valueOf(r10)
            r10 = 1
            r8[r10] = r5
            boolean r5 = r6.f136016c
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r5)
            r8[r4] = r5
            java.lang.String r2 = r2.mo23953c(r9, r8)
            r5 = 0
            r3.evaluateJavascript(r2, r5)
            goto L_0x0367
        L_0x034a:
            android.webkit.WebView r3 = r2.f52310b
            java.lang.Object[] r6 = new java.lang.Object[r10]
            int r7 = com.google.assistant.p3897e.p3921j.p3926e.C51847bh.m86400a(r7)
            if (r7 != 0) goto L_0x0355
            r7 = 1
        L_0x0355:
            java.lang.String r7 = com.google.android.libraries.assistant.p1528m.p1529a.C18431p.m35891o(r7)
            java.lang.String r7 = com.google.android.libraries.assistant.p1528m.p1529a.C18431p.m35890d(r7)
            r6[r5] = r7
            java.lang.String r2 = r2.mo23953c(r9, r6)
            r5 = 0
            r3.evaluateJavascript(r2, r5)
        L_0x0367:
            com.google.assistant.e.j.e.cs r2 = r0.f296023u
            int r2 = r2.f136092k
            int r2 = com.google.assistant.p3897e.p3921j.p3926e.C51865bz.m86402a(r2)
            if (r2 != 0) goto L_0x0372
            goto L_0x03e8
        L_0x0372:
            if (r2 != r4) goto L_0x03e8
            com.google.android.apps.gsa.staticplugins.opa.az.i r2 = r0.f296011i
            com.google.android.apps.gsa.search.shared.service.j r3 = new com.google.android.apps.gsa.search.shared.service.j
            com.google.android.apps.gsa.search.shared.service.b.bu r4 = com.google.android.apps.gsa.search.shared.service.p6935b.C87739bu.OPA_DISPLAY_CONTEXT_UPDATED
            r3.<init>((com.google.android.apps.gsa.search.shared.service.p6935b.C87739bu) r4)
            com.google.protobuf.bt r4 = com.google.android.apps.gsa.search.shared.service.p6935b.C88105pi.f238198a
            com.google.android.apps.gsa.search.shared.service.b.pk r5 = com.google.android.apps.gsa.search.shared.service.p6935b.C88107pk.f238199h
            com.google.protobuf.bn r5 = r5.createBuilder()
            com.google.android.apps.gsa.search.shared.service.b.pj r5 = (com.google.android.apps.gsa.search.shared.service.p6935b.C88106pj) r5
            com.google.knowledge.b.ag r6 = com.google.knowledge.p4671b.C61788ag.f166893c
            com.google.protobuf.bn r6 = r6.createBuilder()
            com.google.knowledge.b.af r6 = (com.google.knowledge.p4671b.C61787af) r6
            com.google.knowledge.b.ap r7 = com.google.knowledge.p4671b.C61797ap.f166930c
            com.google.protobuf.bn r7 = r7.createBuilder()
            com.google.knowledge.b.an r7 = (com.google.knowledge.p4671b.C61795an) r7
            r7.copyOnWrite()
            com.google.protobuf.bv r8 = r7.instance
            com.google.knowledge.b.ap r8 = (com.google.knowledge.p4671b.C61797ap) r8
            r9 = 9
            r8.f166933b = r9
            int r9 = r8.f166932a
            r10 = 1
            r9 = r9 | r10
            r8.f166932a = r9
            com.google.protobuf.bv r7 = r7.build()
            com.google.knowledge.b.ap r7 = (com.google.knowledge.p4671b.C61797ap) r7
            r6.copyOnWrite()
            com.google.protobuf.bv r8 = r6.instance
            com.google.knowledge.b.ag r8 = (com.google.knowledge.p4671b.C61788ag) r8
            r7.getClass()
            r8.f166896b = r7
            int r7 = r8.f166895a
            r7 = r7 | r10
            r8.f166895a = r7
            com.google.protobuf.bv r6 = r6.build()
            com.google.knowledge.b.ag r6 = (com.google.knowledge.p4671b.C61788ag) r6
            r5.copyOnWrite()
            com.google.protobuf.bv r7 = r5.instance
            com.google.android.apps.gsa.search.shared.service.b.pk r7 = (com.google.android.apps.gsa.search.shared.service.p6935b.C88107pk) r7
            r6.getClass()
            r7.f238206f = r6
            int r6 = r7.f238201a
            r6 = r6 | 16
            r7.f238201a = r6
            com.google.protobuf.bv r5 = r5.build()
            com.google.android.apps.gsa.search.shared.service.b.pk r5 = (com.google.android.apps.gsa.search.shared.service.p6935b.C88107pk) r5
            r3.mo82014b(r4, r5)
            com.google.android.apps.gsa.search.shared.service.ClientEventData r3 = r3.mo82013a()
            r2.mo96219b(r3)
            goto L_0x03eb
        L_0x03e8:
            r16.m176595L()
        L_0x03eb:
            com.google.assistant.e.j.e.cs r2 = r0.f296023u
            int r2 = r2.f136082a
            r3 = 4194304(0x400000, float:5.877472E-39)
            r2 = r2 & r3
            if (r2 == 0) goto L_0x0451
            com.google.protobuf.ez r2 = r0.f295989F
            com.google.protobuf.bv r2 = r2.build()
            com.google.protobuf.fb r2 = (com.google.protobuf.C63037fb) r2
            com.google.assistant.e.j.e.cs r3 = r0.f296023u
            com.google.assistant.e.j.e.cp r3 = r3.f136096o
            if (r3 != 0) goto L_0x0404
            com.google.assistant.e.j.e.cp r3 = com.google.assistant.p3897e.p3921j.p3926e.C51882cp.f136072b
        L_0x0404:
            com.google.protobuf.fb r3 = r3.f136074a
            if (r3 != 0) goto L_0x040a
            com.google.protobuf.fb r3 = com.google.protobuf.C63037fb.f170144b
        L_0x040a:
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L_0x0451
            com.google.assistant.e.j.e.cs r2 = r0.f296023u
            com.google.assistant.e.j.e.cp r2 = r2.f136096o
            if (r2 != 0) goto L_0x0418
            com.google.assistant.e.j.e.cp r2 = com.google.assistant.p3897e.p3921j.p3926e.C51882cp.f136072b
        L_0x0418:
            com.google.protobuf.fb r2 = r2.f136074a
            if (r2 != 0) goto L_0x041e
            com.google.protobuf.fb r2 = com.google.protobuf.C63037fb.f170144b
        L_0x041e:
            com.google.protobuf.bn r2 = r2.toBuilder()
            com.google.protobuf.ez r2 = (com.google.protobuf.C63034ez) r2
            r0.f295989F = r2
            com.google.assistant.e.i.a.oo r2 = com.google.assistant.p3897e.p3917i.p3918a.C51623oo.f134536c
            com.google.protobuf.bn r2 = r2.createBuilder()
            com.google.assistant.e.i.a.on r2 = (com.google.assistant.p3897e.p3917i.p3918a.C51622on) r2
            com.google.protobuf.ez r3 = r0.f295989F
            com.google.protobuf.bv r3 = r3.build()
            com.google.protobuf.fb r3 = (com.google.protobuf.C63037fb) r3
            r2.copyOnWrite()
            com.google.protobuf.bv r4 = r2.instance
            com.google.assistant.e.i.a.oo r4 = (com.google.assistant.p3897e.p3917i.p3918a.C51623oo) r4
            r3.getClass()
            r4.f134539b = r3
            int r3 = r4.f134538a
            r5 = 1
            r3 = r3 | r5
            r4.f134538a = r3
            com.google.protobuf.bv r2 = r2.build()
            com.google.assistant.e.i.a.oo r2 = (com.google.assistant.p3897e.p3917i.p3918a.C51623oo) r2
            r0.mo95212B(r2)
        L_0x0451:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.staticplugins.opa.p8179ac.C106025ax.mo95241w():com.google.common.util.concurrent.cx");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: x */
    public final Object mo95242x(C63063ga gaVar) {
        int i;
        if (!(gaVar == null || (i = gaVar.f170181a) == 1)) {
            if (i == 2) {
                return Double.valueOf(((Double) gaVar.f170182b).doubleValue());
            }
            if (i == 3) {
                return (String) gaVar.f170182b;
            }
            if (i == 4) {
                return Boolean.valueOf(((Boolean) gaVar.f170182b).booleanValue());
            }
            if (i == 5) {
                Map unmodifiableMap = Collections.unmodifiableMap(((C63037fb) gaVar.f170182b).f170146a);
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                for (String str : unmodifiableMap.keySet()) {
                    Object x = mo95242x((C63063ga) unmodifiableMap.get(str));
                    if (x != null) {
                        linkedHashMap.put(str, x);
                    }
                }
                return new JSONObject(linkedHashMap);
            } else if (i == 6) {
                C62971cq<C63063ga> cqVar = ((C62988dg) gaVar.f170182b).f170045a;
                ArrayList arrayList = new ArrayList();
                for (C63063ga x2 : cqVar) {
                    Object x3 = mo95242x(x2);
                    if (x3 != null) {
                        arrayList.add(x3);
                    }
                }
                return new JSONArray(arrayList);
            }
        }
        return null;
    }

    /* renamed from: y */
    public final void mo95243y(C51805du duVar) {
        if (!this.f295987D) {
            C88093ox oxVar = (C88093ox) C88094oy.f238174g.createBuilder();
            C63088z byteString = duVar.toByteString();
            oxVar.copyOnWrite();
            C88094oy oyVar = (C88094oy) oxVar.instance;
            byteString.getClass();
            oyVar.f238176a |= 1;
            oyVar.f238177b = byteString;
            C88489j jVar = new C88489j(C87739bu.OPA_CLIENT_INPUT);
            jVar.mo82014b(C88092ow.f238173a, (C88094oy) oxVar.build());
            this.f296011i.mo96219b(jVar.mo82013a());
        }
    }

    /* renamed from: z */
    public final void mo95244z() {
        if (this.f296005c.mo56113h()) {
            C18431p pVar = (C18431p) this.f296005c.mo56107c();
            if (pVar.f52320l.mo23950a() != C18422g.LOADED) {
                ((C59052c) ((C59052c) C18431p.f52308a.mo56225c()).mo56372aa(47320)).mo56386p("Page content not loaded onPauseCanvas.");
            } else {
                pVar.f52310b.evaluateJavascript(pVar.mo23953c("onPause", new Object[0]), (ValueCallback) null);
                pVar.f52310b.onPause();
            }
        }
        if (this.f296001S == null) {
            this.f296001S = this.f296012j.mo28208h("Kill canvas after timeout", 300000, new C106002aa(this));
        }
    }

    /* renamed from: D */
    public final void mo95214D() {
        C51842bc bcVar;
        C51885cs csVar = this.f296023u;
        if ((csVar.f136082a & 512) != 0) {
            bcVar = csVar.f136089h;
            if (bcVar == null) {
                bcVar = C51842bc.f135998g;
            }
        } else {
            bcVar = C51842bc.f135998g;
        }
        this.f296024v = bcVar;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v23, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v9, resolved type: java.lang.String} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x0179  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x0188  */
    /* renamed from: l */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo95230l(com.google.assistant.p3897e.p3899b.p3901b.C50890q r12) {
        /*
            r11 = this;
            int r0 = r12.f132495a
            r1 = 2
            r0 = r0 & r1
            java.lang.String r2 = ""
            java.lang.String r3 = "ImmersiveCanvasCtrlr"
            if (r0 == 0) goto L_0x0050
            java.util.Map r0 = r11.f296018p
            java.util.Set r0 = r0.entrySet()
            j$.util.stream.Stream r0 = p3186j$.util.Collection.EL.stream(r0)
            com.google.android.apps.gsa.staticplugins.opa.ac.s r4 = new com.google.android.apps.gsa.staticplugins.opa.ac.s
            r4.<init>(r12)
            j$.util.stream.Stream r0 = r0.filter(r4)
            j$.util.Optional r0 = r0.findFirst()
            com.google.android.apps.gsa.staticplugins.opa.ac.t r4 = com.google.android.apps.gsa.staticplugins.opa.p8179ac.C106064t.f296105a
            j$.util.Optional r0 = r0.map(r4)
            boolean r4 = r0.isEmpty()
            if (r4 == 0) goto L_0x0049
            com.google.common.f.e r4 = f295983a
            com.google.common.f.x r4 = r4.mo56226d()
            com.google.common.f.aa r5 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r4.mo56378ag(r5, r3)
            com.google.common.f.c r4 = (com.google.common.p4526f.C59052c) r4
            r5 = 24674(0x6062, float:3.4576E-41)
            com.google.common.f.x r4 = r4.mo56372aa(r5)
            com.google.common.f.c r4 = (com.google.common.p4526f.C59052c) r4
            java.lang.String r5 = "Horizontal intent ID '%s' from the server could not be converted to the public ID"
            java.lang.String r6 = r12.f132496b
            r4.mo56389s(r5, r6)
        L_0x0049:
            java.lang.Object r0 = r0.orElse(r2)
            java.lang.String r0 = (java.lang.String) r0
            goto L_0x007b
        L_0x0050:
            java.lang.String r0 = r12.f132496b
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x0068
            java.lang.String r0 = r12.f132496b
            java.lang.String r4 = "SYS.NO_MATCH"
            boolean r0 = r0.equals(r4)
            if (r0 == 0) goto L_0x0065
            java.lang.String r0 = "actions.intent.NO_MATCH"
            goto L_0x007b
        L_0x0065:
            java.lang.String r0 = r12.f132496b
            goto L_0x007b
        L_0x0068:
            com.google.common.f.e r0 = f295983a
            com.google.common.f.x r0 = r0.mo56226d()
            com.google.common.f.aa r4 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r0.mo56378ag(r4, r3)
            java.lang.String r4 = "MatchedIntent had no valid horizontal intent or custom intent match."
            r5 = 24673(0x6061, float:3.4574E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r0).mo56372aa(r5)).mo56386p(r4)
            r0 = r2
        L_0x007b:
            com.google.ak.q r4 = new com.google.ak.q
            r4.<init>()
            int r5 = r12.f132495a
            r5 = r5 & r1
            r6 = 0
            r7 = 1
            r8 = 0
            if (r5 == 0) goto L_0x00f2
            com.google.protobuf.ga r12 = r12.f132498d
            if (r12 != 0) goto L_0x008e
            com.google.protobuf.ga r12 = com.google.protobuf.C63063ga.f170179c
        L_0x008e:
            com.google.assistant.e.j.e.bd r5 = com.google.assistant.p3897e.p3921j.p3926e.C51843bd.APPLICATION_URL
            com.google.android.apps.gsa.search.shared.service.b.um r5 = com.google.android.apps.gsa.search.shared.service.p6935b.C88244um.ATTACH_WEBVIEW
            int r5 = r12.f170181a
            int r9 = com.google.protobuf.C63061fz.m96003b(r5)
            int r10 = r9 + -1
            if (r9 == 0) goto L_0x00f1
            if (r10 == r7) goto L_0x00da
            r9 = 3
            if (r10 == r1) goto L_0x00cd
            if (r10 == r9) goto L_0x00b6
            com.google.common.f.e r12 = f295983a
            com.google.common.f.x r12 = r12.mo56226d()
            com.google.common.f.aa r2 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r12.mo56378ag(r2, r3)
            java.lang.String r2 = "Unsupported horizontal intent type"
            r3 = 24676(0x6064, float:3.4578E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r12).mo56372aa(r3)).mo56386p(r2)
            goto L_0x0120
        L_0x00b6:
            r2 = 4
            if (r5 != r2) goto L_0x00c2
            java.lang.Object r12 = r12.f170182b
            java.lang.Boolean r12 = (java.lang.Boolean) r12
            boolean r12 = r12.booleanValue()
            goto L_0x00c3
        L_0x00c2:
            r12 = 0
        L_0x00c3:
            java.lang.String r2 = "booleanValue"
            java.lang.Boolean r12 = java.lang.Boolean.valueOf(r12)
            r4.mo17167c(r2, r12)
            goto L_0x0120
        L_0x00cd:
            if (r5 != r9) goto L_0x00d4
            java.lang.Object r12 = r12.f170182b
            r2 = r12
            java.lang.String r2 = (java.lang.String) r2
        L_0x00d4:
            java.lang.String r12 = "stringValue"
            r4.mo17171j(r12, r2)
            goto L_0x0120
        L_0x00da:
            if (r5 != r1) goto L_0x00e5
            java.lang.Object r12 = r12.f170182b
            java.lang.Double r12 = (java.lang.Double) r12
            double r2 = r12.doubleValue()
            goto L_0x00e7
        L_0x00e5:
            r2 = 0
        L_0x00e7:
            java.lang.String r12 = "numberValue"
            java.lang.Double r2 = java.lang.Double.valueOf(r2)
            r4.mo17170i(r12, r2)
            goto L_0x0120
        L_0x00f1:
            throw r8
        L_0x00f2:
            java.lang.String r5 = r12.f132496b
            boolean r5 = r5.isEmpty()
            if (r5 != 0) goto L_0x0125
            com.google.protobuf.dn r5 = r12.f132497c
            java.util.Map r5 = java.util.Collections.unmodifiableMap(r5)
            boolean r5 = r5.isEmpty()
            if (r5 != 0) goto L_0x0125
            com.google.protobuf.dn r12 = r12.f132497c
            java.util.Map r12 = java.util.Collections.unmodifiableMap(r12)
            com.google.ak.q r2 = new com.google.ak.q
            r2.<init>()
            com.google.android.apps.gsa.staticplugins.opa.ac.y r3 = new com.google.android.apps.gsa.staticplugins.opa.ac.y
            r3.<init>(r2)
            p3186j$.util.Map.EL.forEach(r12, r3)
            com.google.ak.b.ak r12 = r4.f29255a
            java.lang.String r3 = "customIntentValue"
            r12.put(r3, r2)
        L_0x0120:
            java.lang.String r2 = r4.toString()
            goto L_0x0141
        L_0x0125:
            com.google.common.f.e r4 = f295983a
            com.google.common.f.x r4 = r4.mo56226d()
            com.google.common.f.aa r5 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r4.mo56378ag(r5, r3)
            com.google.common.f.c r4 = (com.google.common.p4526f.C59052c) r4
            r3 = 24675(0x6063, float:3.4577E-41)
            com.google.common.f.x r3 = r4.mo56372aa(r3)
            com.google.common.f.c r3 = (com.google.common.p4526f.C59052c) r3
            java.lang.String r4 = "No valid value for intent: %s"
            java.lang.String r12 = r12.f132496b
            r3.mo56389s(r4, r12)
        L_0x0141:
            java.util.Map r12 = r11.f296017o
            java.util.Set r12 = r12.entrySet()
            j$.util.stream.Stream r12 = p3186j$.util.Collection.EL.stream(r12)
            com.google.android.apps.gsa.staticplugins.opa.ac.u r3 = com.google.android.apps.gsa.staticplugins.opa.p8179ac.C106065u.f296106a
            j$.util.stream.Stream r12 = r12.filter(r3)
            com.google.android.apps.gsa.staticplugins.opa.ac.v r3 = new com.google.android.apps.gsa.staticplugins.opa.ac.v
            r3.<init>(r11)
            r12.forEach(r3)
            java.util.Map r12 = r11.f296017o
            java.util.Set r12 = r12.entrySet()
            com.google.android.apps.gsa.staticplugins.opa.ac.w r3 = com.google.android.apps.gsa.staticplugins.opa.p8179ac.C106067w.f296108a
            p3186j$.util.Collection.EL.removeIf(r12, r3)
            r11.mo95217G()
            com.google.common.base.ax r12 = r11.f296005c
            java.lang.Object r12 = r12.mo56107c()
            com.google.android.libraries.assistant.m.a.p r12 = (com.google.android.libraries.assistant.p1528m.p1529a.C18431p) r12
            com.google.android.libraries.assistant.m.a.n r3 = r12.f52320l
            com.google.android.libraries.assistant.m.a.g r3 = r3.mo23950a()
            com.google.android.libraries.assistant.m.a.g r4 = com.google.android.libraries.assistant.p1528m.p1529a.C18422g.LOADED
            if (r3 == r4) goto L_0x0188
            com.google.common.f.e r12 = com.google.android.libraries.assistant.p1528m.p1529a.C18431p.f52308a
            com.google.common.f.x r12 = r12.mo56225c()
            java.lang.String r0 = "Page content not loaded."
            r1 = 47313(0xb8d1, float:6.63E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r12).mo56372aa(r1)).mo56386p(r0)
            return
        L_0x0188:
            android.webkit.WebView r3 = r12.f52310b
            java.lang.Object[] r1 = new java.lang.Object[r1]
            java.lang.String r0 = com.google.android.libraries.assistant.p1528m.p1529a.C18431p.m35890d(r0)
            r1[r6] = r0
            java.lang.String r0 = com.google.android.libraries.assistant.p1528m.p1529a.C18431p.m35890d(r2)
            r1[r7] = r0
            java.lang.String r0 = "sendIntentMatchResponse"
            java.lang.String r12 = r12.mo23953c(r0, r1)
            r3.evaluateJavascript(r12, r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.staticplugins.opa.p8179ac.C106025ax.mo95230l(com.google.assistant.e.b.b.q):void");
    }
}
