package com.google.android.apps.gsa.staticplugins.bisto.p7479ae;

import android.app.AppOpsManager;
import android.content.Context;
import android.os.Build;
import android.os.Process;
import com.google.android.apps.gsa.search.core.p6816p.C86253h;
import com.google.android.apps.gsa.search.shared.actions.SearchError;
import com.google.android.apps.gsa.search.shared.service.C87682aj;
import com.google.android.apps.gsa.search.shared.service.ServiceEventData;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88244um;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88356yq;
import com.google.android.apps.gsa.shared.bisto.C89656k;
import com.google.android.apps.gsa.shared.bisto.C89687z;
import com.google.android.apps.gsa.shared.util.C90719ac;
import com.google.android.apps.gsa.shared.util.p7158b.C90755l;
import com.google.android.apps.gsa.staticplugins.bisto.C95458i;
import com.google.android.apps.gsa.staticplugins.bisto.p7485c.C95214aa;
import com.google.android.apps.gsa.staticplugins.bisto.p7485c.C95239o;
import com.google.android.apps.gsa.staticplugins.bisto.p7485c.C95241q;
import com.google.android.apps.gsa.staticplugins.bisto.p7488f.C95288a;
import com.google.android.apps.gsa.staticplugins.bisto.p7488f.C95293ae;
import com.google.android.apps.gsa.staticplugins.bisto.p7488f.C95294af;
import com.google.android.apps.gsa.staticplugins.bisto.p7488f.C95295ag;
import com.google.android.apps.gsa.staticplugins.bisto.p7488f.C95307m;
import com.google.android.apps.gsa.staticplugins.bisto.p7489g.C95355bf;
import com.google.android.apps.gsa.staticplugins.bisto.p7489g.C95373bx;
import com.google.android.apps.gsa.staticplugins.bisto.p7490h.C95457c;
import com.google.android.apps.gsa.staticplugins.bisto.p7514p.C95832d;
import com.google.android.apps.gsa.staticplugins.bisto.p7516r.C95850a;
import com.google.android.apps.gsa.staticplugins.bisto.p7516r.C95853d;
import com.google.android.apps.gsa.staticplugins.bisto.p7520u.p7527c.C96053d;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.android.libraries.p1730f.C21370a;
import com.google.android.libraries.search.logging.p3043f.C39191a;
import com.google.android.libraries.search.p3047m.p3050b.C39226b;
import com.google.android.libraries.search.p3047m.p3050b.C39227c;
import com.google.common.p4522b.C58490gz;
import com.google.common.p4522b.C58495hd;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.p4552o.C60232lf;
import com.google.common.p4552o.C60234lh;
import com.google.common.p4552o.C60276mq;
import com.google.common.p4552o.C60278ms;
import com.google.common.p4552o.C60298nk;
import com.google.common.p4552o.C60300nm;
import dagger.C68214a;

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.ae.bg */
/* compiled from: PG */
public final class C95097bg implements AutoCloseable, C87682aj, C89687z {

    /* renamed from: a */
    public static final C59071e f266015a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.bisto.ae.bg");

    /* renamed from: b */
    public static final C88244um[] f266016b = {C88244um.BISTO_SET_FINAL_RECOGNIZED_TEXT, C88244um.BISTO_UPDATE_RECOGNIZED_TEXT, C88244um.TTS_RESULT_EVENT, C88244um.BISTO_TTS_RESULT_EVENT, C88244um.BISTO_NOTIFY_COMPLETED_CONVERSATION, C88244um.BISTO_NOTIFY_REQUEST_FOLLOW_ON, C88244um.START_ACTIVITY, C88244um.BISTO_VOICE_SEARCH_DONE, C88244um.BISTO_NO_SPEECH_DETECTED, C88244um.BISTO_FORCE_CLOSE, C88244um.NOTIFY_MEDIA_CONTROL, C88244um.NOTIFY_DEVICE_SELECTION_SUPPRESSION, C88244um.BISTO_CUSTOM_DEVICE_ACTION, C88244um.BISTO_PR_REQUEST_PERMISSION};

    /* renamed from: A */
    public boolean f266017A;

    /* renamed from: B */
    public boolean f266018B;

    /* renamed from: C */
    public boolean f266019C;

    /* renamed from: D */
    public C86253h f266020D;

    /* renamed from: E */
    public boolean f266021E;

    /* renamed from: F */
    public C88356yq f266022F;

    /* renamed from: G */
    public SearchError f266023G;

    /* renamed from: H */
    public C95294af f266024H;

    /* renamed from: I */
    public long f266025I;

    /* renamed from: J */
    public C95127t f266026J;

    /* renamed from: K */
    public long f266027K = 0;

    /* renamed from: L */
    public boolean f266028L;

    /* renamed from: M */
    public C95095be f266029M;

    /* renamed from: N */
    private final C58495hd f266030N;

    /* renamed from: c */
    public final Context f266031c;

    /* renamed from: d */
    public final C22871g f266032d;

    /* renamed from: e */
    public final C21370a f266033e;

    /* renamed from: f */
    public final C95133z f266034f;

    /* renamed from: g */
    public final C95853d f266035g;

    /* renamed from: h */
    public final C95293ae f266036h;

    /* renamed from: i */
    public final C95241q f266037i;

    /* renamed from: j */
    public final C95295ag f266038j;

    /* renamed from: k */
    public final C89656k f266039k;

    /* renamed from: l */
    public final C95099bi f266040l;

    /* renamed from: m */
    public final C95307m f266041m;

    /* renamed from: n */
    public final C95239o f266042n;

    /* renamed from: o */
    public final C96053d f266043o;

    /* renamed from: p */
    public final C95355bf f266044p;

    /* renamed from: q */
    public final C95214aa f266045q;

    /* renamed from: r */
    public final C95458i f266046r;

    /* renamed from: s */
    public final C95373bx f266047s;

    /* renamed from: t */
    public final C68214a f266048t;

    /* renamed from: u */
    public final AppOpsManager f266049u;

    /* renamed from: v */
    public C95288a f266050v;

    /* renamed from: w */
    public int f266051w;

    /* renamed from: x */
    public C95832d f266052x;

    /* renamed from: y */
    public boolean f266053y;

    /* renamed from: z */
    public boolean f266054z;

    public C95097bg(Context context, C22871g gVar, C21370a aVar, C95133z zVar, C95853d dVar, C95293ae aeVar, C95241q qVar, C95295ag agVar, C89656k kVar, C95099bi biVar, C95307m mVar, C95239o oVar, C96053d dVar2, C95355bf bfVar, C95214aa aaVar, C95373bx bxVar, C95458i iVar, C68214a aVar2, C95850a aVar3) {
        C95458i iVar2 = iVar;
        this.f266031c = context;
        this.f266032d = gVar;
        this.f266033e = aVar;
        this.f266034f = zVar;
        this.f266035g = dVar;
        this.f266036h = aeVar;
        this.f266037i = qVar;
        this.f266038j = agVar;
        this.f266039k = kVar;
        this.f266040l = biVar;
        this.f266041m = mVar;
        this.f266042n = oVar;
        this.f266043o = dVar2;
        this.f266044p = bfVar;
        this.f266045q = aaVar;
        this.f266046r = iVar2;
        this.f266047s = bxVar;
        this.f266048t = aVar2;
        if (Build.VERSION.SDK_INT >= 31) {
            this.f266049u = (AppOpsManager) context.getSystemService("appops");
        } else {
            this.f266049u = null;
        }
        C58490gz gzVar = new C58490gz(4);
        gzVar.mo55429h("IDLE", new C95087ax(this));
        gzVar.mo55429h("LISTENING", new C95088ay(this));
        gzVar.mo55429h("FETCHING", new C95086aw(this));
        gzVar.mo55429h("NO_SPEECH_DETECTED", new C95089az(this));
        gzVar.mo55429h("QUERY_FAILED", new C95093bc(this));
        gzVar.mo55429h("RUNNING_ACTION", new C95096bf(this));
        gzVar.mo55429h("PLAYING_TTS_RESPONSE", new C95092bb(this));
        gzVar.mo55429h("AUDIO_DELAY_COMPENSATION", new C95082as(this));
        gzVar.mo55429h("DONE", new C95084au(this));
        C58495hd f = gzVar.mo55427f(false);
        this.f266030N = f;
        C95095be beVar = (C95095be) f.get("IDLE");
        beVar.getClass();
        this.f266029M = beVar;
        iVar2.mo83462h(this);
        C58976aa aaVar2 = C58975e.f156826a;
        aVar3.f268408a.add(this);
    }

    /* renamed from: a */
    public final void mo89014a() {
        C59104x b = f266015a.mo56224b();
        b.mo56378ag(C58975e.f156826a, "QueryHandler");
        ((C59052c) ((C59052c) b).mo56372aa(18041)).mo56386p("cancelQuery()");
        this.f266017A = false;
        this.f266029M.mo89006d();
    }

    /* renamed from: b */
    public final void mo89015b() {
        if (this.f266025I != 0) {
            long b = this.f266033e.mo26870b() - this.f266025I;
            C58976aa aaVar = C58975e.f156826a;
            C95307m mVar = this.f266041m;
            if (b >= 2147483647L || b < 0) {
                C59104x d = C95130w.f266147a.mo56226d();
                d.mo56378ag(C58975e.f156826a, "GsaDialogUtil");
                ((C59052c) ((C59052c) d).mo56372aa(17953)).mo56388r("Invalid latency msec: %d", b);
                int i = C90755l.f253831a;
            } else {
                C60276mq mqVar = (C60276mq) C60278ms.f163077d.createBuilder();
                mqVar.copyOnWrite();
                C60278ms msVar = (C60278ms) mqVar.instance;
                msVar.f163080b = 1;
                msVar.f163079a = 1 | msVar.f163079a;
                mqVar.copyOnWrite();
                C60278ms msVar2 = (C60278ms) mqVar.instance;
                msVar2.f163079a |= 2;
                msVar2.f163081c = (int) b;
                C60278ms msVar3 = (C60278ms) mqVar.build();
                C60298nk nkVar = (C60298nk) C60300nm.f163138H.createBuilder();
                nkVar.copyOnWrite();
                C60300nm nmVar = (C60300nm) nkVar.instance;
                msVar3.getClass();
                nmVar.f163154h = msVar3;
                nmVar.f163147a |= 65536;
                mVar.mo83545c(nkVar);
            }
            this.f266025I = 0;
        }
        C95294af afVar = this.f266024H;
        if (afVar != null) {
            afVar.mo89220a(C95457c.f267108h);
            this.f266024H = null;
        }
    }

    public final void close() {
        this.f266046r.mo83474t(this);
        this.f266032d.mo28212l("removeMicIcon", new C95076am(this));
    }

    /* renamed from: d */
    public final void mo89017d() {
        long nextLong;
        do {
            nextLong = C90719ac.f253778a.f253779b.nextLong();
            this.f266027K = nextLong;
        } while (nextLong == 0);
        mo89021i(2);
    }

    /* renamed from: e */
    public final void mo89018e(String str) {
        this.f266029M.mo89004is();
        C95095be beVar = (C95095be) this.f266030N.get(str);
        beVar.getClass();
        this.f266029M = beVar;
        beVar.mo89003a();
    }

    /* renamed from: f */
    public final void mo89019f() {
        if (Build.VERSION.SDK_INT >= 31 && this.f266049u != null && this.f266028L) {
            C58976aa aaVar = C58975e.f156826a;
            this.f266028L = false;
            this.f266049u.finishOp("android:record_audio", Process.myUid(), this.f266031c.getPackageName(), C39227c.m68658b(C39226b.TAG_CLASSIC_ASSISTANT_BISTO));
        }
    }

    /* renamed from: fM */
    public final void mo19965fM(ServiceEventData serviceEventData) {
        this.f266032d.mo28212l("on-event", new C95078ao(this, serviceEventData));
    }

    /* renamed from: g */
    public final void mo83589g() {
        if (!this.f266029M.f266012d.equals("IDLE")) {
            mo89014a();
        }
    }

    /* renamed from: h */
    public final boolean mo89020h() {
        return !this.f266029M.f266012d.equals("IDLE");
    }

    /* renamed from: i */
    public final void mo89021i(int i) {
        if (this.f266027K != 0) {
            C95307m mVar = this.f266041m;
            C60298nk nkVar = (C60298nk) C60300nm.f163138H.createBuilder();
            C60232lf lfVar = (C60232lf) C60234lh.f162963e.createBuilder();
            lfVar.copyOnWrite();
            C60234lh lhVar = (C60234lh) lfVar.instance;
            lhVar.f162966b = i - 1;
            lhVar.f162965a |= 1;
            String b = C39191a.m68623b(this.f266027K);
            lfVar.copyOnWrite();
            C60234lh lhVar2 = (C60234lh) lfVar.instance;
            b.getClass();
            lhVar2.f162965a |= 2;
            lhVar2.f162967c = b;
            long b2 = this.f266033e.mo26870b();
            lfVar.copyOnWrite();
            C60234lh lhVar3 = (C60234lh) lfVar.instance;
            lhVar3.f162965a |= 4;
            lhVar3.f162968d = b2;
            nkVar.copyOnWrite();
            C60300nm nmVar = (C60300nm) nkVar.instance;
            C60234lh lhVar4 = (C60234lh) lfVar.build();
            lhVar4.getClass();
            nmVar.f163143D = lhVar4;
            nmVar.f163148b |= 4096;
            mVar.mo83545c(nkVar);
        }
    }
}
