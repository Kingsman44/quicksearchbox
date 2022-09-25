package com.google.android.apps.gsa.assist;

import android.accounts.Account;
import android.app.Dialog;
import android.app.VoiceInteractor;
import android.app.assist.AssistContent;
import android.app.assist.AssistStructure;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.Region;
import android.os.Bundle;
import android.service.voice.VoiceInteractionSession;
import android.text.TextUtils;
import android.util.AndroidRuntimeException;
import android.util.SparseBooleanArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.annotation.C0826b;
import com.evernote.android.state.BuildConfig;
import com.google.android.apps.gsa.assist.p501a.C9313a;
import com.google.android.apps.gsa.assist.p501a.C9318f;
import com.google.android.apps.gsa.assist.p501a.C9321i;
import com.google.android.apps.gsa.assist.p501a.C9329q;
import com.google.android.apps.gsa.assist.p503c.p504a.C9388a;
import com.google.android.apps.gsa.assist.p505d.C9406a;
import com.google.android.apps.gsa.assist.p507f.p508a.C9413b;
import com.google.android.apps.gsa.assistant.shared.C73912w;
import com.google.android.apps.gsa.assistant.shared.az;
import com.google.android.apps.gsa.assistant.shared.bm;
import com.google.android.apps.gsa.nga.api.C74726cf;
import com.google.android.apps.gsa.nga.shared.p6407v.C83305i;
import com.google.android.apps.gsa.nga.shared.p6407v.p6410c.C82306ah;
import com.google.android.apps.gsa.opa.C83574ae;
import com.google.android.apps.gsa.opa.C83575af;
import com.google.android.apps.gsa.search.core.C84413ad;
import com.google.android.apps.gsa.search.core.google.gaia.C86054o;
import com.google.android.apps.gsa.search.core.p6513aj.C84516aa;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.search.core.p6809l.C86152a;
import com.google.android.apps.gsa.search.core.p6809l.C86159h;
import com.google.android.apps.gsa.search.shared.actions.util.C87493o;
import com.google.android.apps.gsa.search.shared.p6926d.C87541c;
import com.google.android.apps.gsa.search.shared.p6930h.C87566i;
import com.google.android.apps.gsa.search.shared.service.C87673aa;
import com.google.android.apps.gsa.search.shared.service.C87677ae;
import com.google.android.apps.gsa.search.shared.service.C88486g;
import com.google.android.apps.gsa.search.shared.service.ClientConfig;
import com.google.android.apps.gsa.shared.p7066m.C90077eb;
import com.google.android.apps.gsa.shared.p7066m.C90120fr;
import com.google.android.apps.gsa.shared.p7130s.p7131a.C90476a;
import com.google.android.apps.gsa.shared.search.Query;
import com.google.android.apps.gsa.shared.util.debug.C91022f;
import com.google.android.apps.gsa.shared.util.debug.p7163a.C90991b;
import com.google.android.apps.gsa.shared.util.debug.p7163a.C91006f;
import com.google.android.apps.gsa.shared.util.p7158b.C90752i;
import com.google.android.apps.gsa.shared.util.p7159c.C90904ba;
import com.google.android.apps.gsa.shared.util.p7159c.C90929bz;
import com.google.android.apps.gsa.shared.util.p7171i.C91042a;
import com.google.android.apps.gsa.shared.util.p7184t.C91093c;
import com.google.android.apps.gsa.staticplugins.opa.p8354d.C108523b;
import com.google.android.apps.search.assistant.platform.p9044c.p9045a.p9046a.p9047a.p9048a.C120032q;
import com.google.android.apps.search.assistant.platform.p9044c.p9045a.p9046a.p9047a.p9049b.C120058d;
import com.google.android.apps.search.assistant.platform.p9044c.p9045a.p9046a.p9047a.p9049b.C120059e;
import com.google.android.apps.search.assistant.platform.p9044c.p9055c.p9056a.p9057a.C120124o;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.assistant.auto.tng.morris.p1068c.C14115ap;
import com.google.android.libraries.assistant.auto.tng.morris.p1072f.C14651g;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.android.libraries.gsa.p1876k.C22872h;
import com.google.android.libraries.p1730f.C21370a;
import com.google.android.libraries.search.logging.appflows.startup.p3037a.C38802e;
import com.google.android.libraries.search.p2871b.p2872a.p2876d.C37182a;
import com.google.android.libraries.search.p2871b.p2895i.C37252a;
import com.google.android.libraries.search.p2871b.p2895i.C37253b;
import com.google.apps.tiktok.tracing.C47538ax;
import com.google.apps.tiktok.tracing.C47770dh;
import com.google.common.base.C58833ax;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C58979ad;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.p4526f.p4534f.C59081b;
import com.google.common.p4552o.C59710cy;
import com.google.common.p4552o.C59711cz;
import com.google.common.p4552o.C59729dn;
import com.google.common.p4552o.amo;
import com.google.common.util.concurrent.C60870cx;
import com.google.p4152bb.p4153a.C54969b;
import com.google.p4152bb.p4153a.C55412rk;
import com.google.protobuf.C62940bt;
import dagger.C68214a;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p3186j$.util.Objects;
import p3186j$.util.Optional;
import p3186j$.util.function.Consumer;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.apps.gsa.assist.cb */
/* compiled from: PG */
public final class C9397cb extends VoiceInteractionSession implements C90991b, C14651g, C9406a, C9329q {

    /* renamed from: a */
    public static final C59071e f32567a = C59071e.m91332i("com.google.android.apps.gsa.assist.cb");

    /* renamed from: b */
    public static final amo f32568b;

    /* renamed from: z */
    private static final ClientConfig f32569z;

    /* renamed from: A */
    private final C9312a f32570A;

    /* renamed from: B */
    private C60870cx f32571B;

    /* renamed from: C */
    private final C86124t f32572C;

    /* renamed from: D */
    private final C68214a f32573D;

    /* renamed from: E */
    private final C68214a f32574E;

    /* renamed from: F */
    private final C68214a f32575F;

    /* renamed from: G */
    private final C68214a f32576G;

    /* renamed from: H */
    private final C84413ad f32577H;

    /* renamed from: I */
    private final C91022f f32578I;

    /* renamed from: J */
    private final C9321i f32579J;

    /* renamed from: K */
    private final bm f32580K;

    /* renamed from: L */
    private final C83574ae f32581L;

    /* renamed from: M */
    private final C9413b f32582M;

    /* renamed from: N */
    private final C86152a f32583N;

    /* renamed from: O */
    private final C68214a f32584O;

    /* renamed from: P */
    private final C87677ae f32585P;

    /* renamed from: Q */
    private final C21370a f32586Q;

    /* renamed from: R */
    private final C58833ax f32587R;

    /* renamed from: S */
    private final C38802e f32588S;

    /* renamed from: T */
    private final C69464a f32589T;

    /* renamed from: U */
    private final C73912w f32590U;

    /* renamed from: V */
    private final C84516aa f32591V;

    /* renamed from: W */
    private final C68214a f32592W;

    /* renamed from: X */
    private final az f32593X;

    /* renamed from: Y */
    private final C83305i f32594Y;

    /* renamed from: Z */
    private final C47770dh f32595Z;

    /* renamed from: aa */
    private boolean f32596aa;

    /* renamed from: ab */
    private boolean f32597ab;

    /* renamed from: ac */
    private C83575af f32598ac;

    /* renamed from: ad */
    private boolean f32599ad;

    /* renamed from: ae */
    private boolean f32600ae;

    /* renamed from: af */
    private boolean f32601af;

    /* renamed from: ag */
    private boolean f32602ag;

    /* renamed from: ah */
    private final C58833ax f32603ah;

    /* renamed from: ai */
    private final C108523b f32604ai;

    /* renamed from: aj */
    private int f32605aj;

    /* renamed from: c */
    public final Context f32606c;

    /* renamed from: d */
    public C60870cx f32607d;

    /* renamed from: e */
    public C60870cx f32608e;

    /* renamed from: f */
    public final C90929bz f32609f;

    /* renamed from: g */
    public final C9313a f32610g;

    /* renamed from: h */
    public final C68214a f32611h;

    /* renamed from: i */
    public final C90476a f32612i;

    /* renamed from: j */
    public final C22871g f32613j;

    /* renamed from: k */
    public final C120058d f32614k;

    /* renamed from: l */
    public final C120124o f32615l;

    /* renamed from: m */
    public boolean f32616m;

    /* renamed from: n */
    public boolean f32617n;

    /* renamed from: o */
    GsaVoiceInteractionView f32618o;

    /* renamed from: p */
    public C87673aa f32619p;

    /* renamed from: q */
    public View f32620q;

    /* renamed from: r */
    int f32621r = -1;

    /* renamed from: s */
    boolean f32622s;

    /* renamed from: t */
    boolean f32623t;

    /* renamed from: u */
    public C90904ba f32624u;

    /* renamed from: v */
    public C9396ca f32625v;

    /* renamed from: w */
    public final C9384by f32626w = new C9384by(this);

    /* renamed from: x */
    public final Query f32627x;

    /* renamed from: y */
    public C120059e f32628y;

    static {
        amo amo = amo.VOICE_COMMAND;
        f32568b = amo;
        C88486g gVar = new C88486g();
        gVar.f239199a = 4398046511136L;
        gVar.f239201c = amo;
        gVar.f239204f = "search";
        f32569z = new ClientConfig(gVar);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C9397cb(Bundle bundle, Context context, C58833ax axVar, C86124t tVar, C90929bz bzVar, C68214a aVar, C68214a aVar2, C68214a aVar3, C68214a aVar4, C84413ad adVar, C9313a aVar5, C91022f fVar, C9321i iVar, bm bmVar, C83574ae aeVar, C9413b bVar, C86152a aVar6, C9356b bVar2, C68214a aVar7, C68214a aVar8, C90476a aVar9, C87677ae aeVar2, Query query, C21370a aVar10, C58833ax axVar2, C38802e eVar, C69464a aVar11, C84516aa aaVar, C73912w wVar, C108523b bVar3, C68214a aVar12, az azVar, C83305i iVar2, C22871g gVar, C120058d dVar, C47770dh dhVar) {
        super(context);
        this.f32606c = context;
        this.f32603ah = axVar;
        this.f32627x = query;
        this.f32590U = wVar;
        this.f32572C = tVar;
        this.f32609f = bzVar;
        this.f32573D = aVar;
        this.f32574E = aVar2;
        this.f32575F = aVar3;
        this.f32576G = aVar4;
        this.f32577H = adVar;
        this.f32610g = aVar5;
        this.f32578I = fVar;
        this.f32579J = iVar;
        this.f32580K = bmVar;
        this.f32581L = aeVar;
        this.f32582M = bVar;
        this.f32583N = aVar6;
        this.f32611h = aVar7;
        this.f32584O = aVar8;
        this.f32612i = aVar9;
        this.f32585P = aeVar2;
        this.f32586Q = aVar10;
        this.f32587R = axVar2;
        this.f32588S = eVar;
        this.f32589T = aVar11;
        this.f32591V = aaVar;
        this.f32604ai = bVar3;
        this.f32592W = aVar12;
        this.f32593X = azVar;
        this.f32594Y = iVar2;
        this.f32613j = gVar;
        this.f32614k = dVar;
        this.f32595Z = dhVar;
        Bundle bundle2 = bundle;
        this.f32615l = C120032q.m198936a(bundle, C120124o.CLASSIC);
        this.f32570A = bVar2.mo17545a(context);
    }

    /* renamed from: c */
    public static List m23886c(List list) {
        C54969b bVar;
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C55412rk rkVar = (C55412rk) it.next();
            VoiceInteractor.PickOptionRequest.Option option = new VoiceInteractor.PickOptionRequest.Option(rkVar.f146010b, rkVar.f146012d);
            for (String addSynonym : rkVar.f146011c) {
                option.addSynonym(addSynonym);
            }
            if ((rkVar.f146009a & 4) != 0) {
                bVar = rkVar.f146013e;
                if (bVar == null) {
                    bVar = C54969b.f144589b;
                }
            } else {
                bVar = null;
            }
            option.setExtras(C87493o.m142020b(bVar));
            arrayList.add(option);
        }
        return arrayList;
    }

    /* renamed from: i */
    public static void m23887i(C60870cx cxVar) {
        if (cxVar != null) {
            C58976aa aaVar = C58975e.f156826a;
            cxVar.cancel(true);
        }
    }

    /* renamed from: l */
    private final Intent m23888l(Bundle bundle) {
        Intent intent = (Intent) bundle.getParcelable("com.google.voicesearch.VI_INTENT");
        if (intent != null) {
            intent.setExtrasClassLoader(getClass().getClassLoader());
        }
        return intent;
    }

    /* renamed from: m */
    private final void m23889m(C59729dn dnVar) {
        C37252a g = C37182a.f98071fl.mo40813g();
        C62940bt btVar = C59711cz.f160208s;
        C59710cy cyVar = (C59710cy) C59711cz.f160207r.createBuilder();
        cyVar.copyOnWrite();
        C59711cz czVar = (C59711cz) cyVar.instance;
        dnVar.getClass();
        czVar.f160222m = dnVar;
        czVar.f160210a |= 4096;
        ((C37253b) g).mo40792p(btVar, (C59711cz) cyVar.build());
        ((C14115ap) this.f32592W.mo27525b()).mo21431e(g);
        setUiEnabled(false);
        finish();
    }

    /* renamed from: n */
    private final void m23890n() {
        this.f32597ab = false;
        GsaVoiceInteractionView gsaVoiceInteractionView = this.f32618o;
        if (gsaVoiceInteractionView != null) {
            gsaVoiceInteractionView.setVisibility(0);
            return;
        }
        C59104x d = f32567a.mo56226d();
        d.mo56378ag(C58975e.f156826a, "GsaVoiceInteractionSess");
        ((C59052c) ((C59052c) d).mo56372aa('Y')).mo56386p("forceShowVoiceUI: cannot setVisibility.");
    }

    /* renamed from: o */
    private final void m23891o(Bundle bundle, int i) {
        int i2;
        boolean z;
        Intent intent;
        if (this.f32618o == null && m23895s()) {
            this.f32618o = (GsaVoiceInteractionView) getLayoutInflater().inflate(R.layout.voice_interaction_session, (ViewGroup) null);
        }
        if ((i & 16) != 0) {
            this.f32621r = 0;
            i2 = 0;
            z = true;
        } else {
            i2 = -1;
            if (bundle == null || (intent = (Intent) bundle.getParcelable("com.google.voicesearch.VI_INTENT")) == null) {
                this.f32621r = -1;
            } else {
                int intExtra = intent.getIntExtra("InteractorMode", -1);
                if (intExtra == -1) {
                    C59104x d = f32567a.mo56226d();
                    d.mo56378ag(C58975e.f156826a, "GsaVoiceInteractionSess");
                    ((C59052c) ((C59052c) d).mo56372aa('^')).mo56386p("parseInteractionMode: mode was not set");
                } else {
                    i2 = intExtra;
                }
                this.f32621r = i2;
            }
            z = false;
        }
        if (i2 != 0) {
            C59104x d2 = f32567a.mo56226d();
            d2.mo56378ag(C58975e.f156826a, "GsaVoiceInteractionSess");
            ((C59052c) ((C59052c) d2).mo56372aa(93)).mo56387q("Unexpected voice interaction mode: %d", this.f32621r);
            m23897u(7);
            mo17601g();
            return;
        }
        C87677ae aeVar = this.f32585P;
        C9384by byVar = this.f32626w;
        this.f32619p = aeVar.mo81958a(byVar, byVar, f32569z);
        if (!z) {
            Intent intent2 = (Intent) bundle.getParcelable("com.google.voicesearch.VI_INTENT");
            if (this.f32572C.mo79746e(C90120fr.f250856w)) {
                intent2.addFlags(8);
            }
            m23897u(9);
            C58976aa aaVar = C58975e.f156826a;
            boolean booleanExtra = intent2.getBooleanExtra("IsVoiceQuery", true);
            intent2.removeExtra("IsVoiceQuery");
            this.f32617n = booleanExtra;
            boolean booleanExtra2 = intent2.getBooleanExtra("NoUiQuery", false);
            intent2.removeExtra("NoUiQuery");
            this.f32597ab = booleanExtra2;
            try {
                startVoiceActivity(intent2);
            } catch (AndroidRuntimeException | IllegalStateException e) {
                C59104x d3 = f32567a.mo56226d();
                d3.mo56378ag(C58975e.f156826a, "GsaVoiceInteractionSess");
                ((C59052c) ((C59052c) d3).mo56372aa('\\')).mo56389s("%s", e.getMessage());
                mo17601g();
                return;
            }
        } else {
            m23897u(8);
            this.f32597ab = true;
            this.f32617n = true;
        }
        if (this.f32597ab) {
            m23892p(C9371bl.f32531a);
        }
        m23887i(this.f32571B);
        this.f32616m = true;
        this.f32571B = this.f32609f.mo85137b(new C9376bq(this), 900000);
        if (m23895s()) {
            setContentView(this.f32618o);
        }
        this.f32619p.mo81932c();
        m23892p(new C9372bm(this));
        m23892p(new C9373bn(this));
    }

    /* renamed from: p */
    private final void m23892p(Consumer consumer) {
        GsaVoiceInteractionView gsaVoiceInteractionView = this.f32618o;
        if (gsaVoiceInteractionView != null && m23895s()) {
            consumer.accept(gsaVoiceInteractionView);
        }
    }

    /* renamed from: q */
    private final void m23893q(boolean z) {
        if (m23895s()) {
            Window b = mo17595b();
            int systemUiVisibility = b.getDecorView().getSystemUiVisibility();
            if (z) {
                b.getDecorView().setSystemUiVisibility(systemUiVisibility | 8192);
            } else {
                b.getDecorView().setSystemUiVisibility(systemUiVisibility & -8193);
            }
        }
    }

    /* renamed from: r */
    private final void m23894r(String str, Runnable runnable) {
        C47538ax c = this.f32595Z.mo51613c(str);
        try {
            runnable.run();
            if (c != null) {
                c.close();
                return;
            }
            return;
        } catch (Throwable th) {
            try {
                Throwable.class.getDeclaredMethod("addSuppressed", new Class[]{Throwable.class}).invoke(th, new Object[]{th});
            } catch (Exception unused) {
            }
        }
        throw th;
    }

    /* renamed from: s */
    private final boolean m23895s() {
        return !this.f32603ah.mo56113h();
    }

    /* renamed from: t */
    private final boolean m23896t() {
        return this.f32599ad && this.f32598ac != null;
    }

    /* renamed from: u */
    private final void m23897u(int i) {
        String str;
        if (!m23895s()) {
            C83305i iVar = this.f32594Y;
            switch (i) {
                case 1:
                    str = "DISMISS_CURRENT_SESSION_UI";
                    break;
                case 2:
                    str = "TRIGGER_MORRIS_MIC";
                    break;
                case 3:
                    str = "START_OPA";
                    break;
                case 4:
                    str = "START_CLASSIC_SEARCH";
                    break;
                case 5:
                    str = "FINISH_DURING_ON_SHOW_FOR_MORRIS";
                    break;
                case 6:
                    str = "MIC_OCCUPIED";
                    break;
                case 7:
                    str = "VOICE_INTERACTION_MODE_UNEXPECTED";
                    break;
                case 8:
                    str = "VOICE_INTERACTION_NO_ACTION";
                    break;
                default:
                    str = "START_VOICE_ACTIVITY";
                    break;
            }
            iVar.mo75579d(new C82306ah("GSA_VIS_DELEGATION_OUTCOME", str));
        }
    }

    /* renamed from: a */
    public final int mo17594a(Account account) {
        return (account == null || ((C9388a) this.f32576G.mo27525b()).mo17585g()) ? 3 : 0;
    }

    /* renamed from: b */
    public final Window mo17595b() {
        Dialog window = getWindow();
        window.getClass();
        Window window2 = window.getWindow();
        window2.getClass();
        return window2;
    }

    public final void closeSystemDialogs() {
        if (this.f32603ah.mo56113h()) {
            ((C74726cf) this.f32603ah.mo56107c()).mo71102b();
        } else {
            super.closeSystemDialogs();
        }
    }

    public final void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.dump(str, fileDescriptor, printWriter, strArr);
        C91006f f = C91006f.m148645f(this.f32612i);
        f.mo85286m(this);
        f.mo85295u(printWriter, str);
    }

    /* renamed from: e */
    public final void mo17598e(Bundle bundle) {
        if (!m23895s() || (!C87566i.m142287ak(bundle) && !C87566i.m142288al(bundle))) {
            C9377br brVar = new C9377br(this);
            this.f32624u = brVar;
            this.f32609f.mo85150o(brVar, 200);
            return;
        }
        C58976aa aaVar = C58975e.f156826a;
        mo17601g();
    }

    /* renamed from: f */
    public final void mo17599f() {
        if (this.f32623t) {
            mo17601g();
        }
    }

    public final void finish() {
        if (!this.f32596aa) {
            if (this.f32603ah.mo56113h()) {
                ((C74726cf) this.f32603ah.mo56107c()).mo71103c();
            } else {
                super.finish();
            }
        }
    }

    /* renamed from: g */
    public final void mo17601g() {
        C58976aa aaVar = C58975e.f156826a;
        if (this.f32603ah.mo56113h()) {
            ((C74726cf) this.f32603ah.mo56107c()).mo71104d();
            this.f32623t = false;
        } else {
            super.hide();
        }
        this.f32602ag = false;
    }

    /* renamed from: gS */
    public final void mo17602gS(C91006f fVar) {
        fVar.mo85291r("GsaVoiceInteractionSession");
        fVar.mo85279c("mInteractorMode").mo85276a(C90752i.m148230d(Integer.valueOf(this.f32621r)));
        fVar.mo85279c("mIsShown").mo85276a(C90752i.m148228b(Boolean.valueOf(this.f32622s)));
        fVar.mo85279c("hasUserOptedIn").mo85276a(C90752i.m148228b(Boolean.valueOf(mo17607k())));
        fVar.mo85279c("mShowWithOpa").mo85276a(C90752i.m148228b(Boolean.valueOf(this.f32599ad)));
        fVar.mo85279c("mOpaEligibility").mo85276a(C90752i.m148230d(Integer.valueOf(this.f32580K.a())));
    }

    public final int getUserDisabledShowContext() {
        try {
            if (this.f32603ah.mo56113h()) {
                return ((C74726cf) this.f32603ah.mo56107c()).mo71101a();
            }
            return super.getUserDisabledShowContext();
        } catch (SecurityException unused) {
            C58976aa aaVar = C58975e.f156826a;
            return -2;
        }
    }

    /* renamed from: h */
    public final void mo17604h() {
        int i;
        C58976aa aaVar = C58975e.f156826a;
        if (this.f32602ag) {
            C59104x d = f32567a.mo56226d();
            d.mo56378ag(C58975e.f156826a, "GsaVoiceInteractionSess");
            ((C59052c) ((C59052c) d).mo56372aa('c')).mo56386p("#hideWithAnimation called while hiding");
            return;
        }
        this.f32602ag = true;
        if (m23896t() || (i = this.f32621r) == 0 || i == -1 || (i == 1 && this.f32623t)) {
            mo17601g();
        }
    }

    public final void hide() {
        if (!this.f32593X.m() || !this.f32623t) {
            mo17604h();
        } else {
            C58976aa aaVar = C58975e.f156826a;
        }
    }

    /* renamed from: j */
    public final void mo17606j() {
        C58976aa aaVar = C58975e.f156826a;
        C87673aa aaVar2 = this.f32619p;
        if (aaVar2 != null) {
            aaVar2.mo81950v();
            this.f32619p.mo81949u();
            this.f32619p.mo81948t(false);
        }
    }

    /* renamed from: k */
    public final boolean mo17607k() {
        return ((C9388a) this.f32576G.mo27525b()).mo17583e();
    }

    public final void onBackPressed() {
        if ((!this.f32623t || !this.f32593X.p()) && !this.f32602ag && this.f32622s) {
            super.onBackPressed();
        }
    }

    public final void onCancelRequest(VoiceInteractionSession.Request request) {
        C58976aa aaVar = C58975e.f156826a;
        mo17606j();
    }

    public final void onComputeInsets(VoiceInteractionSession.Insets insets) {
        GsaVoiceInteractionView gsaVoiceInteractionView;
        super.onComputeInsets(insets);
        Optional b = this.f32593X.b();
        if (b.isPresent()) {
            insets.touchableInsets = 3;
            insets.touchableRegion.set((Region) b.get());
        } else if (this.f32621r == 0) {
            insets.touchableInsets = 1;
            if (!this.f32597ab && (gsaVoiceInteractionView = this.f32618o) != null) {
                insets.contentInsets.top = gsaVoiceInteractionView.findViewById(R.id.search_plate_container).getTop();
            }
        }
    }

    public final void onConfigurationChanged(Configuration configuration) {
        C58976aa aaVar = C58975e.f156826a;
        if (this.f32621r != 0) {
            super.onConfigurationChanged(configuration);
        }
    }

    public final void onCreate() {
        C58976aa aaVar = C58975e.f156826a;
        super.onCreate();
        this.f32578I.mo85301a(this);
        setDisabledShowContext(mo17594a(((C86054o) this.f32575F.mo27525b()).mo79668a()));
        ((C86054o) this.f32575F.mo27525b()).mo79675i(new C9374bo(this));
        if (((Boolean) this.f32589T.mo17428b()).booleanValue() && !this.f32593X.o()) {
            this.f32593X.c(this, new C91093c(this.f32606c));
        }
        if (m23895s()) {
            m23894r("SessionConformityClient#subscribe", new C9367bh(this));
        }
    }

    public final View onCreateContentView() {
        C58976aa aaVar = C58975e.f156826a;
        getLayoutInflater();
        return null;
    }

    public final void onDestroy() {
        C58976aa aaVar = C58975e.f156826a;
        this.f32596aa = true;
        this.f32578I.mo85302b(this);
        this.f32593X.d();
        if (m23895s()) {
            C120059e eVar = this.f32628y;
            if (eVar != null) {
                C59104x b = f32567a.mo56224b();
                b.mo56378ag(C58975e.f156826a, "GsaVoiceInteractionSess");
                ((C59052c) ((C59052c) b).mo56372aa(136)).mo56386p("unsubscribeFromSessionConformityCommands - unsubscribing");
                Objects.requireNonNull(eVar);
                m23894r("SessionConformityClient#unsubscribe", new C9370bk(eVar));
            } else {
                C59104x c = f32567a.mo56225c();
                c.mo56378ag(C58975e.f156826a, "GsaVoiceInteractionSess");
                ((C59052c) ((C59052c) c).mo56372aa(135)).mo56386p("unsubscribeFromSessionConformityCommands - not subscribed");
            }
            this.f32628y = null;
        }
        super.onDestroy();
    }

    public final boolean[] onGetSupportedCommands(String[] strArr) {
        return null;
    }

    public final void onHandleAssist(Bundle bundle, AssistStructure assistStructure, AssistContent assistContent) {
        String string;
        int i;
        Bundle bundle2 = bundle;
        C58976aa aaVar = C58975e.f156826a;
        this.f32610g.mo17503a(2);
        boolean t = m23896t();
        if (this.f32622s || t) {
            int i2 = this.f32605aj;
            char c = true != m23896t() ? (char) 65535 : 5;
            C9318f fVar = C9318f.CONTEXTUAL;
            if (this.f32616m) {
                this.f32610g.mo17503a(9);
            } else if (((C9388a) this.f32576G.mo27525b()).mo17585g()) {
                setDisabledShowContext(3);
            } else if (!mo17607k()) {
                this.f32610g.mo17503a(10);
            } else {
                int userDisabledShowContext = getUserDisabledShowContext() & 1;
                int i3 = 0;
                boolean z = bundle2 == null && assistStructure == null && assistContent == null;
                if (!(bundle2 == null || (string = bundle2.getString("android.intent.extra.ASSIST_PACKAGE")) == null)) {
                    int a = C91042a.m148717a(string);
                    C58485gu o = this.f32572C.mo79749o(C90077eb.f249792f);
                    int size = o.size();
                    int i4 = 0;
                    while (true) {
                        if (i4 >= size) {
                            break;
                        }
                        int i5 = i4 + 1;
                        if (a != ((Integer) o.get(i4)).intValue()) {
                            i4 = i5;
                        } else if (this.f32577H.mo77971h()) {
                            i = 1;
                        }
                    }
                    i = 0;
                    C9321i iVar = this.f32579J;
                    iVar.f32344e = Integer.valueOf(a);
                    if (iVar.f32343d == null) {
                        C58485gu o2 = iVar.f32341b.mo79749o(C90077eb.f249789c);
                        iVar.f32343d = new SparseBooleanArray(o2.size());
                        int size2 = o2.size();
                        while (i3 < size2) {
                            iVar.f32343d.put(((Integer) o2.get(i3)).intValue(), true);
                            i3++;
                        }
                    }
                    i3 = i;
                }
                C9321i iVar2 = this.f32579J;
                if (m23896t()) {
                    if (c == 5 && i3 != 0) {
                        C86159h hVar = (C86159h) this.f32574E.mo27525b();
                        hVar.f232839h.set(hVar.mo79793b());
                    }
                    C87541c cVar = (C87541c) this.f32573D.mo27525b();
                    C9413b bVar = this.f32582M;
                    synchronized (cVar.f236439a) {
                        cVar.f236451m = bVar;
                    }
                    if (!m23896t() && this.f32621r != 1) {
                        return;
                    }
                    if (this.f32623t || (this.f32593X.o() && this.f32593X.l())) {
                        C59081b.m91349a(C58979ad.FULL, "stack size");
                    } else if (userDisabledShowContext == 0 && !z) {
                        this.f32570A.mo17502a(bundle, assistStructure, assistContent, fVar, this.f32582M, i2 == 0 ? 1 : i2);
                    } else if (userDisabledShowContext == 0) {
                        this.f32610g.mo17503a(17);
                        C59104x d = f32567a.mo56226d();
                        d.mo56378ag(C58975e.f156826a, "GsaVoiceInteractionSess");
                        ((C59052c) ((C59052c) d).mo56372aa('I')).mo56386p("Received null assist data, but user has not turned off context");
                    } else {
                        this.f32610g.mo17503a(11);
                        if (!z) {
                            C59104x d2 = f32567a.mo56226d();
                            d2.mo56378ag(C58975e.f156826a, "GsaVoiceInteractionSess");
                            ((C59052c) ((C59052c) d2).mo56372aa('H')).mo56386p("Assist bundle is not null yet the user has turned off context.");
                        }
                        C9417g gVar = (C9417g) C9418h.f32714k.createBuilder();
                        gVar.copyOnWrite();
                        C9418h hVar2 = (C9418h) gVar.instance;
                        hVar2.f32716a |= 4;
                        hVar2.f32720e = true;
                        iVar2.mo17530g((C9418h) gVar.build(), fVar);
                    }
                }
            }
        }
    }

    public final void onHandleScreenshot(Bitmap bitmap) {
        C58976aa aaVar = C58975e.f156826a;
        this.f32610g.mo17503a(3);
        boolean z = true;
        if (!this.f32600ae || this.f32582M.mo17666b().isDone()) {
            this.f32601af = true;
        }
        this.f32600ae = false;
        if ((!this.f32593X.m() || !this.f32623t || (this.f32593X.o() && !this.f32593X.l())) && !this.f32616m) {
            if ((getUserDisabledShowContext() & 3) == 0) {
                z = false;
            }
            this.f32582M.f32703a = z;
            if (bitmap != null) {
                if (((C9388a) this.f32576G.mo27525b()).mo17585g()) {
                    setDisabledShowContext(3);
                    return;
                } else if (!((C9388a) this.f32576G.mo27525b()).mo17583e()) {
                    return;
                }
            }
            if (m23896t()) {
                this.f32582M.mo17669e(bitmap);
            } else {
                this.f32582M.mo17668d(bitmap);
            }
        }
    }

    public final void onHide() {
        C58976aa aaVar = C58975e.f156826a;
        C108523b bVar = this.f32604ai;
        C22872h.m42742b(C0826b.class);
        bVar.f301941b = null;
        m23893q(false);
        this.f32622s = false;
        this.f32623t = false;
        C87673aa aaVar2 = this.f32619p;
        if (aaVar2 != null) {
            aaVar2.mo81933e();
            this.f32619p.mo81948t(false);
            this.f32619p = null;
        }
        this.f32616m = false;
        this.f32624u = null;
    }

    public final void onRequestAbortVoice(VoiceInteractionSession.AbortVoiceRequest abortVoiceRequest) {
        this.f32625v = new C9379bt(this, abortVoiceRequest);
        C58976aa aaVar = C58975e.f156826a;
        if (!TextUtils.isEmpty(C9396ca.m23871n(this.f32625v.mo17557b()))) {
            this.f32625v.mo17591l();
        } else {
            this.f32625v.mo17558c();
        }
    }

    public final void onRequestCommand(VoiceInteractionSession.CommandRequest commandRequest) {
        m23890n();
        this.f32625v = new C9380bu(this, commandRequest);
        C58976aa aaVar = C58975e.f156826a;
        this.f32625v.mo17591l();
    }

    public final void onRequestCompleteVoice(VoiceInteractionSession.CompleteVoiceRequest completeVoiceRequest) {
        this.f32625v = new C9381bv(this, completeVoiceRequest);
        C58976aa aaVar = C58975e.f156826a;
        if (!TextUtils.isEmpty(C9396ca.m23871n(this.f32625v.mo17557b()))) {
            this.f32625v.mo17591l();
        } else {
            this.f32625v.mo17562g();
        }
    }

    public final void onRequestConfirmation(VoiceInteractionSession.ConfirmationRequest confirmationRequest) {
        m23890n();
        this.f32625v = new C9382bw(this, confirmationRequest);
        C58976aa aaVar = C58975e.f156826a;
        this.f32625v.mo17591l();
    }

    public final void onRequestPickOption(VoiceInteractionSession.PickOptionRequest pickOptionRequest) {
        m23890n();
        this.f32625v = new C9385bz(this, pickOptionRequest);
        C58976aa aaVar = C58975e.f156826a;
        this.f32625v.mo17591l();
    }

    public final void onTaskFinished(Intent intent, int i) {
        C58976aa aaVar = C58975e.f156826a;
        m23887i(this.f32607d);
        GsaVoiceInteractionView gsaVoiceInteractionView = this.f32618o;
        if (gsaVoiceInteractionView != null) {
            gsaVoiceInteractionView.f32315b.mo82688p(BuildConfig.FLAVOR);
            this.f32618o.setVisibility(4);
        } else {
            C59104x b = f32567a.mo56224b();
            b.mo56378ag(C58975e.f156826a, "GsaVoiceInteractionSess");
            ((C59052c) ((C59052c) b).mo56372aa(129)).mo56386p("onTaskFinished: cannot setVisibility.");
        }
        this.f32616m = false;
        super.onTaskFinished(intent, i);
    }

    public final void onTaskStarted(Intent intent, int i) {
        GsaVoiceInteractionView gsaVoiceInteractionView;
        C58976aa aaVar = C58975e.f156826a;
        super.onTaskStarted(intent, i);
        if (this.f32597ab || (gsaVoiceInteractionView = this.f32618o) == null) {
            C59104x d = f32567a.mo56226d();
            d.mo56378ag(C58975e.f156826a, "GsaVoiceInteractionSess");
            ((C59052c) ((C59052c) d).mo56372aa(131)).mo56386p("onTaskStarted: cannot setVisibility.");
            return;
        }
        gsaVoiceInteractionView.setVisibility(0);
    }

    public final void setDisabledShowContext(int i) {
        try {
            if (!this.f32603ah.mo56113h()) {
                super.setDisabledShowContext(i);
            } else {
                ((C74726cf) this.f32603ah.mo56107c()).mo71105e(i);
            }
        } catch (SecurityException unused) {
            C58976aa aaVar = C58975e.f156826a;
        }
    }

    public final void startAssistantActivity(Intent intent) {
        if (this.f32603ah.mo56113h()) {
            ((C74726cf) this.f32603ah.mo56107c()).mo71106f(intent);
        } else {
            super.startAssistantActivity(intent);
        }
    }

    public final void startVoiceActivity(Intent intent) {
        if (this.f32603ah.mo56113h()) {
            ((C74726cf) this.f32603ah.mo56107c()).mo71107g(intent);
        } else {
            super.startVoiceActivity(intent);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:124:0x03a8  */
    /* JADX WARNING: Removed duplicated region for block: B:200:0x0549  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onShow(android.os.Bundle r20, int r21) {
        /*
            r19 = this;
            r0 = r19
            r1 = r21
            java.lang.String r2 = "GsaVoiceInteractionSess"
            if (r20 != 0) goto L_0x0020
            if (r1 == 0) goto L_0x000b
            goto L_0x0020
        L_0x000b:
            com.google.common.f.e r1 = f32567a
            com.google.common.f.x r1 = r1.mo56225c()
            com.google.common.f.aa r3 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r1.mo56378ag(r3, r2)
            r2 = 127(0x7f, float:1.78E-43)
            com.google.common.f.ad r3 = com.google.common.p4526f.C58979ad.FULL
            java.lang.String r4 = "onShow called with null args and empty showFlags!"
            android.databinding.C0118a.m96d(r1, r4, r2, r3)
            return
        L_0x0020:
            if (r20 != 0) goto L_0x003a
            com.google.common.f.e r3 = f32567a
            com.google.common.f.x r3 = r3.mo56226d()
            com.google.common.f.aa r4 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r3.mo56378ag(r4, r2)
            java.lang.String r4 = "onShow: args is null"
            r5 = 126(0x7e, float:1.77E-43)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r3).mo56372aa(r5)).mo56386p(r4)
            android.os.Bundle r3 = new android.os.Bundle
            r3.<init>()
            goto L_0x003c
        L_0x003a:
            r3 = r20
        L_0x003c:
            android.content.Intent r4 = r0.m23888l(r3)
            java.lang.String r5 = "com.google.voicesearch.VI_INTENT"
            r3.putParcelable(r5, r4)
            com.google.android.apps.gsa.search.core.aj.aa r6 = r0.f32591V
            boolean r6 = r6.mo78228b()
            com.google.android.apps.gsa.assistant.shared.f r6 = com.google.android.apps.gsa.assistant.shared.g.a(r3, r1, r6)
            com.google.android.apps.gsa.assistant.shared.n r6 = (com.google.android.apps.gsa.assistant.shared.n) r6
            com.google.android.apps.gsa.assistant.shared.l.e r6 = r6.b
            boolean r7 = r0.f32623t
            if (r7 == 0) goto L_0x0084
            com.google.android.apps.gsa.assistant.shared.az r7 = r0.f32593X
            boolean r7 = r7.q(r6)
            if (r7 == 0) goto L_0x0060
            goto L_0x0084
        L_0x0060:
            com.google.common.f.e r1 = f32567a
            com.google.common.f.x r1 = r1.mo56225c()
            com.google.common.f.aa r3 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r1.mo56378ag(r3, r2)
            com.google.common.f.c r1 = (com.google.common.p4526f.C59052c) r1
            com.google.common.f.ad r2 = com.google.common.p4526f.C58979ad.FULL
            r1.mo56380ai(r2)
            r2 = 125(0x7d, float:1.75E-43)
            com.google.common.f.x r1 = r1.mo56372aa(r2)
            com.google.common.f.c r1 = (com.google.common.p4526f.C59052c) r1
            java.lang.String r2 = "onShow called when Morris shown! Trigger type: %s"
            java.lang.String r3 = r6.name()
            r1.mo56389s(r2, r3)
            return
        L_0x0084:
            com.google.android.libraries.f.a r6 = r0.f32586Q
            long r6 = r6.mo26872d()
            com.google.android.libraries.f.a r8 = r0.f32586Q
            long r8 = r8.mo26874f()
            com.google.common.f.aa r10 = com.google.common.p4526f.p4527a.C58975e.f156826a
            com.google.android.apps.gsa.staticplugins.opa.d.b r10 = r0.f32604ai
            java.lang.Class<androidx.annotation.b> r11 = androidx.annotation.C0826b.class
            com.google.android.libraries.gsa.p1876k.C22872h.m42742b(r11)
            r10.f301941b = r0
            boolean r10 = r0.f32602ag
            r11 = 0
            if (r10 == 0) goto L_0x00b4
            com.google.common.f.e r10 = f32567a
            com.google.common.f.x r10 = r10.mo56225c()
            com.google.common.f.aa r12 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r10.mo56378ag(r12, r2)
            java.lang.String r12 = "onShow received while hiding"
            r13 = 124(0x7c, float:1.74E-43)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r10).mo56372aa(r13)).mo56386p(r12)
            r0.f32602ag = r11
        L_0x00b4:
            android.content.Intent r10 = r0.m23888l(r3)
            r12 = 1
            if (r10 == 0) goto L_0x00cb
            java.lang.String r13 = "extra_dismiss_current_session_ui"
            boolean r10 = r10.getBooleanExtra(r13, r11)
            if (r10 != 0) goto L_0x00c4
            goto L_0x00cb
        L_0x00c4:
            r0.m23897u(r12)
            r19.mo17601g()
            return
        L_0x00cb:
            r10 = r1 & 2
            if (r10 == 0) goto L_0x00d1
            r10 = 1
            goto L_0x00d2
        L_0x00d1:
            r10 = 0
        L_0x00d2:
            r0.f32600ae = r10
            r10 = r1 & 8
            if (r10 == 0) goto L_0x00da
            r10 = 1
            goto L_0x00db
        L_0x00da:
            r10 = 0
        L_0x00db:
            android.content.Intent r13 = r0.m23888l(r3)
            if (r13 == 0) goto L_0x00ea
            android.os.Bundle r13 = r13.getExtras()
            boolean r13 = com.google.android.apps.gsa.search.shared.p6930h.C87566i.m142297au(r13)
            goto L_0x00eb
        L_0x00ea:
            r13 = 0
        L_0x00eb:
            boolean r14 = com.google.android.libraries.assistant.auto.tng.morris.p1072f.C14649e.m30712c(r4)
            com.google.common.o.dn r15 = com.google.common.p4552o.C59729dn.f160317h
            com.google.protobuf.bn r15 = r15.createBuilder()
            com.google.common.o.dk r15 = (com.google.common.p4552o.C59726dk) r15
            r15.copyOnWrite()
            com.google.protobuf.bv r11 = r15.instance
            com.google.common.o.dn r11 = (com.google.common.p4552o.C59729dn) r11
            r16 = r5
            int r5 = r11.f160319a
            r5 = r5 | r12
            r11.f160319a = r5
            r11.f160320b = r10
            r15.copyOnWrite()
            com.google.protobuf.bv r5 = r15.instance
            com.google.common.o.dn r5 = (com.google.common.p4552o.C59729dn) r5
            int r11 = r5.f160319a
            r12 = 4
            r11 = r11 | r12
            r5.f160319a = r11
            r5.f160322d = r14
            r15.copyOnWrite()
            com.google.protobuf.bv r5 = r15.instance
            com.google.common.o.dn r5 = (com.google.common.p4552o.C59729dn) r5
            int r11 = r5.f160319a
            r12 = 2
            r11 = r11 | r12
            r5.f160319a = r11
            r5.f160321c = r13
            com.google.android.apps.gsa.assistant.shared.az r5 = r0.f32593X
            boolean r5 = r5.m()
            r15.copyOnWrite()
            com.google.protobuf.bv r11 = r15.instance
            com.google.common.o.dn r11 = (com.google.common.p4552o.C59729dn) r11
            int r12 = r11.f160319a
            r12 = r12 | 8
            r11.f160319a = r12
            r11.f160323e = r5
            if (r10 == 0) goto L_0x013e
            if (r13 == 0) goto L_0x015c
        L_0x013e:
            com.google.android.apps.gsa.assistant.shared.az r5 = r0.f32593X
            boolean r5 = r5.o()
            if (r5 == 0) goto L_0x015c
            com.google.android.apps.gsa.assistant.shared.az r5 = r0.f32593X
            boolean r5 = r5.l()
            if (r5 != 0) goto L_0x014f
            goto L_0x015c
        L_0x014f:
            r5 = 2
            r0.m23897u(r5)
            com.google.android.apps.gsa.assistant.shared.az r1 = r0.f32593X
            r1.j(r13)
            r19.mo17601g()
            return
        L_0x015c:
            java.lang.String r11 = "InteractorMode"
            if (r10 == 0) goto L_0x0162
            if (r13 == 0) goto L_0x01d0
        L_0x0162:
            com.google.android.apps.gsa.assistant.shared.az r12 = r0.f32593X
            boolean r12 = r12.m()
            if (r12 == 0) goto L_0x01d0
            com.google.android.apps.gsa.assistant.shared.az r12 = r0.f32593X
            com.google.common.o.dm r12 = r12.s(r14)
            r15.copyOnWrite()
            com.google.protobuf.bv r5 = r15.instance
            com.google.common.o.dn r5 = (com.google.common.p4552o.C59729dn) r5
            r17 = r8
            int r8 = r12.f160316e
            r5.f160324f = r8
            int r8 = r5.f160319a
            r8 = r8 | 16
            r5.f160319a = r8
            com.google.common.o.dm r5 = com.google.common.p4552o.C59728dm.SUCCESS
            boolean r5 = r12.equals(r5)
            if (r5 == 0) goto L_0x01d3
            if (r4 == 0) goto L_0x0194
            r1 = -1
            int r1 = r4.getIntExtra(r11, r1)
            r0.f32621r = r1
        L_0x0194:
            int r1 = r0.f32621r
            r3 = 1
            if (r1 == r3) goto L_0x01ca
            r1 = 5
            r0.m23897u(r1)
            com.google.common.f.e r1 = f32567a
            com.google.common.f.x r1 = r1.mo56225c()
            com.google.common.f.aa r3 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r1.mo56378ag(r3, r2)
            java.lang.String r2 = "Morris invoked NOT under AssistLayer mode"
            r3 = 121(0x79, float:1.7E-43)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r1).mo56372aa(r3)).mo56386p(r2)
            int r1 = r0.f32621r
            r15.copyOnWrite()
            com.google.protobuf.bv r2 = r15.instance
            com.google.common.o.dn r2 = (com.google.common.p4552o.C59729dn) r2
            int r3 = r2.f160319a
            r4 = 32
            r3 = r3 | r4
            r2.f160319a = r3
            r2.f160325g = r1
            com.google.protobuf.bv r1 = r15.build()
            com.google.common.o.dn r1 = (com.google.common.p4552o.C59729dn) r1
            r0.m23889m(r1)
        L_0x01ca:
            r1 = 1
            r0.f32622s = r1
            r0.f32623t = r1
            return
        L_0x01d0:
            r17 = r8
            r12 = 0
        L_0x01d3:
            com.google.common.o.dm r5 = com.google.common.p4552o.C59728dm.SUCCESS
            if (r12 == r5) goto L_0x0208
            if (r14 != 0) goto L_0x01da
            goto L_0x0208
        L_0x01da:
            com.google.common.f.e r1 = f32567a
            com.google.common.f.x r1 = r1.mo56225c()
            com.google.common.f.aa r3 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r1.mo56378ag(r3, r2)
            com.google.common.f.c r1 = (com.google.common.p4526f.C59052c) r1
            r2 = 120(0x78, float:1.68E-43)
            com.google.common.f.x r1 = r1.mo56372aa(r2)
            com.google.common.f.c r1 = (com.google.common.p4526f.C59052c) r1
            com.google.android.apps.gsa.assistant.shared.az r2 = r0.f32593X
            boolean r2 = r2.m()
            java.lang.String r3 = "onShow() is called specifically for Morris but not handled by Morris. fromApplication = %b, MorrisMiniController present = %b"
            r1.mo56358K(r3, r10, r2)
            r2 = 5
            r0.m23897u(r2)
            com.google.protobuf.bv r1 = r15.build()
            com.google.common.o.dn r1 = (com.google.common.p4552o.C59729dn) r1
            r0.m23889m(r1)
            return
        L_0x0208:
            r2 = 5
            r5 = r1 & 1
            if (r5 == 0) goto L_0x020f
        L_0x020d:
            r8 = 1
            goto L_0x0225
        L_0x020f:
            if (r4 == 0) goto L_0x0224
            android.os.Bundle r8 = r4.getExtras()
            boolean r8 = com.google.android.apps.gsa.search.shared.p6930h.C87566i.m142283ag(r8)
            if (r8 == 0) goto L_0x0224
            r8 = -1
            int r9 = r4.getIntExtra(r11, r8)
            r8 = 1
            if (r9 != r8) goto L_0x0224
            goto L_0x020d
        L_0x0224:
            r8 = 0
        L_0x0225:
            r9 = r1 & 4
            if (r9 == 0) goto L_0x022b
            r9 = 1
            goto L_0x022c
        L_0x022b:
            r9 = 0
        L_0x022c:
            com.google.android.apps.gsa.assistant.shared.w r10 = r0.f32590U
            boolean r4 = r10.mo65448d(r4)
            if (r8 == 0) goto L_0x0265
            com.google.android.apps.gsa.assistant.shared.bm r10 = r0.f32580K
            int r10 = r10.y()
            r11 = 2
            if (r10 == r11) goto L_0x0265
            if (r9 != 0) goto L_0x0263
            android.content.Intent r10 = r0.m23888l(r3)
            if (r10 == 0) goto L_0x024f
            android.os.Bundle r10 = r10.getExtras()
            boolean r10 = com.google.android.apps.gsa.search.shared.p6930h.C87566i.m142281ae(r10)
            if (r10 != 0) goto L_0x0263
        L_0x024f:
            if (r13 == 0) goto L_0x0259
            com.google.android.apps.gsa.assistant.shared.bm r10 = r0.f32580K
            boolean r10 = r10.s()
            if (r10 != 0) goto L_0x0263
        L_0x0259:
            com.google.android.apps.gsa.assistant.shared.bm r10 = r0.f32580K
            boolean r10 = r10.n()
            if (r10 == 0) goto L_0x0263
            if (r4 == 0) goto L_0x0265
        L_0x0263:
            r4 = 1
            goto L_0x0266
        L_0x0265:
            r4 = 0
        L_0x0266:
            r0.f32599ad = r4
            if (r4 == 0) goto L_0x0290
            if (r9 == 0) goto L_0x0290
            com.google.common.o.uf r4 = com.google.common.p4552o.C60555uf.f164065cO
            com.google.protobuf.bn r4 = r4.createBuilder()
            com.google.common.o.tz r4 = (com.google.common.p4552o.C60548tz) r4
            r4.copyOnWrite()
            com.google.protobuf.bv r10 = r4.instance
            com.google.common.o.uf r10 = (com.google.common.p4552o.C60555uf) r10
            int r11 = r10.f164093a
            r12 = 2
            r11 = r11 | r12
            r10.f164093a = r11
            r11 = 1077(0x435, float:1.509E-42)
            r10.f164258m = r11
            com.google.protobuf.bv r4 = r4.build()
            com.google.common.o.uf r4 = (com.google.common.p4552o.C60555uf) r4
            r10 = 0
            com.google.android.apps.gsa.shared.logger.C89949q.m146525j(r4, r10, r10, r10)
            goto L_0x0291
        L_0x0290:
            r10 = 0
        L_0x0291:
            r0.f32624u = r10
            r19.closeSystemDialogs()
            boolean r4 = r19.m23895s()
            if (r4 == 0) goto L_0x02bc
            android.view.Window r4 = r19.mo17595b()
            r10 = 2097152(0x200000, float:2.938736E-39)
            r4.addFlags(r10)
            r10 = 67108864(0x4000000, float:1.5046328E-36)
            r4.clearFlags(r10)
            r10 = 0
            r4.setStatusBarColor(r10)
            r10 = 134217728(0x8000000, float:3.85186E-34)
            r4.clearFlags(r10)
            r10 = 32
            r4.clearFlags(r10)
            r10 = -1
            r4.setLayout(r10, r10)
        L_0x02bc:
            com.google.android.apps.gsa.assist.a.a r4 = r0.f32610g
            com.google.android.apps.gsa.shared.util.ac r10 = r4.f32328b
            long r10 = r10.mo85083a()
            r4.f32327a = r10
            boolean r4 = r0.f32599ad
            java.lang.String r10 = "assistSessionId"
            if (r4 == 0) goto L_0x0375
            if (r9 == 0) goto L_0x0375
            j$.time.Duration r4 = p3186j$.time.Duration.ofNanos(r6)
            j$.time.Duration r9 = p3186j$.time.Duration.ofMillis(r17)
            com.google.common.o.a.r r11 = com.google.common.p4552o.p4553a.C59562r.OPA_ON_SHOW
            com.google.common.base.az r4 = com.google.android.apps.gsa.assistant.shared.g.b(r3, r4, r9, r11)
            dagger.a r9 = r0.f32584O
            java.lang.Object r9 = r9.mo27525b()
            com.google.android.apps.gsa.shared.logger.b.i r9 = (com.google.android.apps.gsa.shared.logger.p7051b.C89859i) r9
            com.google.android.apps.gsa.shared.logger.b.f r11 = new com.google.android.apps.gsa.shared.logger.b.f
            r11.<init>()
            com.google.android.apps.gsa.shared.logger.b.ae r12 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.OPA_ANDROID_STARTUP_ASSIST_GESTURE
            r11.f246201a = r12
            com.google.android.apps.gsa.assist.a.a r12 = r0.f32610g
            long r12 = r12.f32327a
            java.lang.String r12 = java.lang.Long.toString(r12)
            r11.mo83701c(r10, r12)
            java.lang.Object r12 = r4.f156631a
            j$.time.Duration r12 = (p3186j$.time.Duration) r12
            long r12 = r12.toNanos()
            r11.f246204d = r12
            com.google.common.o.cb r12 = com.google.common.p4552o.C59687cb.f160034bf
            com.google.protobuf.bn r12 = r12.createBuilder()
            com.google.common.o.aj r12 = (com.google.common.p4552o.C59582aj) r12
            java.lang.Object r4 = r4.f156632b
            com.google.common.o.a.r r4 = (com.google.common.p4552o.p4553a.C59562r) r4
            r12.copyOnWrite()
            com.google.protobuf.bv r13 = r12.instance
            com.google.common.o.cb r13 = (com.google.common.p4552o.C59687cb) r13
            int r4 = r4.f158049e
            r13.f160081aS = r4
            int r4 = r13.f160123d
            r4 = r4 | 4096(0x1000, float:5.74E-42)
            r13.f160123d = r4
            com.google.protobuf.bv r4 = r12.build()
            com.google.common.o.cb r4 = (com.google.common.p4552o.C59687cb) r4
            r11.f246203c = r4
            com.google.android.apps.gsa.shared.logger.b.g r4 = r11.mo83699a()
            r9.mo74236a(r4)
            dagger.a r4 = r0.f32584O
            java.lang.Object r4 = r4.mo27525b()
            com.google.android.apps.gsa.shared.logger.b.i r4 = (com.google.android.apps.gsa.shared.logger.p7051b.C89859i) r4
            com.google.android.apps.gsa.shared.logger.b.f r9 = new com.google.android.apps.gsa.shared.logger.b.f
            r9.<init>()
            com.google.android.apps.gsa.shared.logger.b.ae r11 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.OPA_ANDROID_STARTUP_ON_SHOW
            r9.f246201a = r11
            com.google.android.apps.gsa.assist.a.a r11 = r0.f32610g
            long r11 = r11.f32327a
            java.lang.String r11 = java.lang.Long.toString(r11)
            r9.mo83701c(r10, r11)
            r9.f246204d = r6
            com.google.android.apps.gsa.shared.logger.b.g r9 = r9.mo83699a()
            r4.mo74236a(r9)
            com.google.common.base.ax r4 = r0.f32587R
            boolean r4 = r4.mo56113h()
            if (r4 == 0) goto L_0x036c
            com.google.common.base.ax r4 = r0.f32587R
            java.lang.Object r4 = r4.mo56107c()
            com.google.android.apps.gsa.shared.logger.i.b r4 = (com.google.android.apps.gsa.shared.logger.p7064i.C89922b) r4
            java.util.concurrent.TimeUnit r9 = java.util.concurrent.TimeUnit.NANOSECONDS
            long r11 = r9.toMillis(r6)
            r4.mo83765i(r11)
        L_0x036c:
            com.google.android.libraries.search.logging.appflows.startup.a.e r4 = r0.f32588S
            j$.time.Duration r9 = p3186j$.time.Duration.ofNanos(r6)
            r4.mo41632f(r9)
        L_0x0375:
            android.content.Intent r4 = r0.m23888l(r3)
            r9 = 6
            if (r4 == 0) goto L_0x03a3
            java.lang.String r11 = "extra_interactor_source_activity"
            boolean r12 = r4.hasExtra(r11)
            if (r12 == 0) goto L_0x03a3
            r12 = 21
            int r4 = r4.getIntExtra(r11, r12)
            com.google.ai.b.nu r4 = com.google.p375ai.p378b.C7891nu.m22887a(r4)
            if (r4 != 0) goto L_0x0392
            com.google.ai.b.nu r4 = com.google.p375ai.p378b.C7891nu.SCREEN_ASSIST_OPT_IN
        L_0x0392:
            com.google.android.apps.gsa.search.shared.service.b.um r11 = com.google.android.apps.gsa.search.shared.service.p6935b.C88244um.ATTACH_WEBVIEW
            int r4 = r4.ordinal()
            r11 = 26
            if (r4 == r11) goto L_0x03a4
            r2 = 27
            if (r4 == r2) goto L_0x03a1
            goto L_0x03a3
        L_0x03a1:
            r2 = 6
            goto L_0x03a4
        L_0x03a3:
            r2 = 1
        L_0x03a4:
            r0.f32605aj = r2
            if (r8 == 0) goto L_0x0549
            boolean r2 = r0.f32616m
            if (r2 == 0) goto L_0x03ad
            return
        L_0x03ad:
            com.google.android.apps.gsa.search.core.i.t r2 = r0.f32572C
            com.google.android.apps.gsa.shared.m.d r4 = com.google.android.apps.gsa.shared.p7066m.C90029ch.f248200N
            boolean r2 = r2.mo79746e(r4)
            if (r2 == 0) goto L_0x03c1
            android.content.Context r2 = r0.f32606c
            boolean r2 = com.google.android.apps.gsa.shared.util.C90731ao.m148192b(r2)
            if (r2 == 0) goto L_0x03c1
            r2 = 1
            goto L_0x03c2
        L_0x03c1:
            r2 = 0
        L_0x03c2:
            com.google.android.apps.gsa.search.core.i.t r4 = r0.f32572C
            com.google.android.apps.gsa.shared.m.d r8 = com.google.android.apps.gsa.shared.p7066m.C90029ch.f248200N
            boolean r4 = r4.mo79746e(r8)
            if (r4 != 0) goto L_0x03d6
            android.content.Context r4 = r0.f32606c
            boolean r4 = com.google.android.apps.gsa.shared.util.C90731ao.m148191a(r4)
            if (r4 == 0) goto L_0x03d6
            r4 = 1
            goto L_0x03d7
        L_0x03d6:
            r4 = 0
        L_0x03d7:
            if (r2 != 0) goto L_0x0507
            if (r4 == 0) goto L_0x03dd
            goto L_0x0507
        L_0x03dd:
            boolean r2 = r0.f32599ad
            if (r2 == 0) goto L_0x04ec
            java.lang.String r2 = "launched_on"
            boolean r4 = r3.containsKey(r2)
            if (r4 != 0) goto L_0x0408
            r4 = r16
            android.os.Parcelable r4 = r3.getParcelable(r4)
            android.content.Intent r4 = (android.content.Intent) r4
            if (r4 == 0) goto L_0x03ff
            boolean r6 = r4.hasExtra(r2)
            if (r6 == 0) goto L_0x03ff
            r6 = 0
            int r4 = r4.getIntExtra(r2, r6)
            goto L_0x0405
        L_0x03ff:
            com.google.android.apps.gsa.search.core.l.a r4 = r0.f32583N
            int r4 = com.google.android.apps.gsa.opa.C83583an.m133152g(r4)
        L_0x0405:
            r3.putInt(r2, r4)
        L_0x0408:
            r2 = 3
            r0.m23897u(r2)
            com.google.android.apps.gsa.search.core.l.a r4 = r0.f32583N
            com.google.android.apps.gsa.search.core.l.j r4 = r4.f232820b
            java.lang.String r4 = r4.mo79804a()
            int r6 = com.google.android.apps.gsa.search.shared.p6930h.C87566i.m142309h(r3)
            r7 = 2
            if (r6 != r7) goto L_0x041d
            r7 = 1
            goto L_0x041e
        L_0x041d:
            r7 = 0
        L_0x041e:
            com.google.android.apps.gsa.search.core.i.t r8 = r0.f32572C
            com.google.android.apps.gsa.shared.m.d r9 = com.google.android.apps.gsa.shared.p7066m.C90014bt.f247449hP
            boolean r8 = r8.mo79746e(r9)
            if (r8 == 0) goto L_0x0431
            boolean r8 = r19.m23895s()
            if (r8 == 0) goto L_0x042f
            goto L_0x0431
        L_0x042f:
            r8 = 0
            goto L_0x044b
        L_0x0431:
            boolean r8 = r0.f32600ae
            if (r8 != 0) goto L_0x0441
            com.google.android.apps.gsa.assist.f.a.b r8 = r0.f32582M
            r8.mo17667c()
            com.google.android.apps.gsa.assist.f.a.b r8 = r0.f32582M
            r9 = 0
            r8.mo17668d(r9)
            goto L_0x042f
        L_0x0441:
            boolean r8 = r0.f32601af
            if (r8 != 0) goto L_0x042f
            com.google.android.apps.gsa.assist.f.a.b r8 = r0.f32582M
            r8.mo17667c()
            goto L_0x042f
        L_0x044b:
            r0.f32601af = r8
            com.google.android.apps.gsa.opa.af r9 = r0.f32598ac
            if (r9 != 0) goto L_0x0460
            com.google.android.apps.gsa.opa.ae r9 = r0.f32581L
            com.google.android.apps.gsa.shared.util.t.c r10 = new com.google.android.apps.gsa.shared.util.t.c
            android.content.Context r11 = r0.f32606c
            r10.<init>(r11)
            com.google.android.apps.gsa.opa.af r9 = r9.mo76907a(r0, r10)
            r0.f32598ac = r9
        L_0x0460:
            r9 = 1
            if (r7 == 0) goto L_0x0466
            r0.m23893q(r9)
        L_0x0466:
            if (r5 == 0) goto L_0x04de
            if (r7 == 0) goto L_0x046b
            goto L_0x0470
        L_0x046b:
            if (r6 != r9) goto L_0x046f
            r2 = 2
            goto L_0x0470
        L_0x046f:
            r2 = 1
        L_0x0470:
            com.google.android.apps.gsa.assist.a.a r5 = r0.f32610g
            if (r2 == r9) goto L_0x0478
            r6 = 2
            if (r2 != r6) goto L_0x04de
            r2 = 2
        L_0x0478:
            r6 = 724(0x2d4, float:1.015E-42)
            long r9 = r5.f32327a
            com.google.common.o.uf r5 = com.google.android.apps.gsa.sidekick.shared.p7253n.C91876a.m150547a(r6, r9)
            com.google.protobuf.bn r5 = r5.toBuilder()
            com.google.common.o.tz r5 = (com.google.common.p4552o.C60548tz) r5
            com.google.protobuf.bv r6 = r5.instance
            com.google.common.o.uf r6 = (com.google.common.p4552o.C60555uf) r6
            com.google.common.o.amj r6 = r6.f164183bk
            if (r6 != 0) goto L_0x0490
            com.google.common.o.amj r6 = com.google.common.p4552o.amj.f159149e
        L_0x0490:
            com.google.protobuf.bn r6 = r6.toBuilder()
            com.google.common.o.amh r6 = (com.google.common.p4552o.amh) r6
            r6.copyOnWrite()
            com.google.protobuf.bv r7 = r6.instance
            com.google.common.o.amj r7 = (com.google.common.p4552o.amj) r7
            r9 = 2
            r7.f159152b = r9
            int r10 = r7.f159151a
            r11 = 1
            r10 = r10 | r11
            r7.f159151a = r10
            if (r2 != r9) goto L_0x04aa
            r11 = 1
            goto L_0x04ab
        L_0x04aa:
            r11 = 0
        L_0x04ab:
            r6.copyOnWrite()
            com.google.protobuf.bv r2 = r6.instance
            com.google.common.o.amj r2 = (com.google.common.p4552o.amj) r2
            int r7 = r2.f159151a
            r7 = r7 | 8
            r2.f159151a = r7
            r2.f159154d = r11
            r5.copyOnWrite()
            com.google.protobuf.bv r2 = r5.instance
            com.google.common.o.uf r2 = (com.google.common.p4552o.C60555uf) r2
            com.google.protobuf.bv r6 = r6.build()
            com.google.common.o.amj r6 = (com.google.common.p4552o.amj) r6
            r6.getClass()
            r2.f164183bk = r6
            int r6 = r2.f164252g
            r7 = 32768(0x8000, float:4.5918E-41)
            r6 = r6 | r7
            r2.f164252g = r6
            com.google.protobuf.bv r2 = r5.build()
            com.google.common.o.uf r2 = (com.google.common.p4552o.C60555uf) r2
            r5 = 0
            com.google.android.apps.gsa.shared.logger.C89949q.m146525j(r2, r5, r5, r5)
        L_0x04de:
            java.lang.String r2 = "android.intent.extra.ASSIST_PACKAGE"
            r3.putString(r2, r4)
            com.google.android.apps.gsa.opa.af r2 = r0.f32598ac
            r2.getClass()
            r2.mo76908a(r3, r1)
            goto L_0x054c
        L_0x04ec:
            r1 = 4
            r0.m23897u(r1)
            android.content.Context r1 = r0.f32606c
            java.lang.String r2 = "and.gsa.assist.layer"
            android.content.Intent r1 = com.google.android.apps.gsa.shared.p7025bh.p7026a.C89429a.m145443a(r1, r2)
            r2 = 268435456(0x10000000, float:2.5243549E-29)
            android.content.Intent r1 = r1.setFlags(r2)
            android.content.Context r2 = r0.f32606c
            r2.startActivity(r1)
            r19.mo17604h()
            goto L_0x054c
        L_0x0507:
            r0.m23897u(r9)
            com.google.android.apps.gsa.search.core.i.t r1 = r0.f32572C
            com.google.android.apps.gsa.shared.m.d r3 = com.google.android.apps.gsa.shared.p7066m.C90029ch.f248262aw
            boolean r1 = r1.mo79746e(r3)
            if (r1 == 0) goto L_0x0517
            r19.mo17601g()
        L_0x0517:
            if (r2 == 0) goto L_0x0523
            com.google.android.apps.gsa.shared.util.c.bz r1 = r0.f32609f
            com.google.android.apps.gsa.assist.bp r2 = new com.google.android.apps.gsa.assist.bp
            r2.<init>(r0)
            r1.mo85151p(r2)
        L_0x0523:
            com.google.android.apps.gsa.shared.logger.b.f r1 = new com.google.android.apps.gsa.shared.logger.b.f
            r1.<init>()
            com.google.android.apps.gsa.shared.logger.b.ae r2 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.OPA_ACTIVITY_CANCEL_DUE_TO_PHONE_COMMUNICATION
            r1.f246201a = r2
            com.google.android.apps.gsa.assist.a.a r2 = r0.f32610g
            long r2 = r2.f32327a
            java.lang.String r2 = java.lang.Long.toString(r2)
            r1.mo83701c(r10, r2)
            r1.f246204d = r6
            com.google.android.apps.gsa.shared.logger.b.g r1 = r1.mo83699a()
            dagger.a r2 = r0.f32584O
            java.lang.Object r2 = r2.mo27525b()
            com.google.android.apps.gsa.shared.logger.b.i r2 = (com.google.android.apps.gsa.shared.logger.p7051b.C89859i) r2
            r2.mo74236a(r1)
            return
        L_0x0549:
            r0.m23891o(r3, r1)
        L_0x054c:
            r1 = 1
            r0.f32622s = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.assist.C9397cb.onShow(android.os.Bundle, int):void");
    }
}
