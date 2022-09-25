package com.google.android.apps.gsa.staticplugins.opa;

import android.content.SharedPreferences;
import android.content.res.Resources;
import android.net.Uri;
import com.google.android.apps.gsa.assistant.shared.C73841bf;
import com.google.android.apps.gsa.assistant.shared.bm;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.search.shared.actions.util.TtsRequest;
import com.google.android.apps.gsa.search.shared.service.C87682aj;
import com.google.android.apps.gsa.shared.logger.C89949q;
import com.google.android.apps.gsa.shared.p6968aa.C89037bh;
import com.google.android.apps.gsa.shared.p6968aa.C89062r;
import com.google.android.apps.gsa.shared.p7066m.C90014bt;
import com.google.android.apps.gsa.shared.p7066m.C90113fk;
import com.google.android.apps.gsa.shared.util.p7159c.C90877ak;
import com.google.android.apps.gsa.shared.util.p7184t.C91097g;
import com.google.android.apps.gsa.staticplugins.opa.chatui.C108230ba;
import com.google.android.apps.gsa.staticplugins.opa.chatui.C108262cf;
import com.google.android.apps.gsa.staticplugins.opa.chatui.C108263cg;
import com.google.android.apps.gsa.staticplugins.opa.chatui.C108390gy;
import com.google.android.apps.gsa.staticplugins.opa.p8315az.C107698i;
import com.google.android.apps.gsa.staticplugins.opa.util.C113869cx;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.common.base.C58838bb;
import com.google.common.p4526f.C59071e;
import com.google.common.p4552o.C60321oe;
import com.google.common.p4552o.C60548tz;
import com.google.common.p4552o.C60555uf;
import com.google.common.util.concurrent.C60870cx;
import com.google.protos.p4816ai.p4818b.C63196b;
import com.google.speech.p5224k.p5225a.C67190ah;
import com.google.speech.p5230n.p5232b.C67395ak;
import com.google.speech.p5230n.p5232b.C67396al;
import com.google.speech.p5230n.p5232b.C67397am;
import com.google.speech.p5230n.p5232b.C67398an;
import com.google.speech.p5230n.p5232b.C67399ao;
import com.google.speech.p5230n.p5232b.C67400ap;
import com.google.speech.p5230n.p5232b.C67401aq;
import com.google.speech.p5230n.p5232b.C67402ar;
import dagger.C68214a;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.oe */
/* compiled from: PG */
final class C109759oe implements C109762oh, C87682aj {

    /* renamed from: a */
    public static final C59071e f305809a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.opa.oe");

    /* renamed from: b */
    public final C108230ba f305810b;

    /* renamed from: c */
    public final C109740nn f305811c;

    /* renamed from: d */
    public final C86124t f305812d;

    /* renamed from: e */
    public final bm f305813e;

    /* renamed from: f */
    public final C68214a f305814f;

    /* renamed from: g */
    public final C22871g f305815g;

    /* renamed from: h */
    public final C113869cx f305816h;

    /* renamed from: i */
    public final C109733ng f305817i;

    /* renamed from: j */
    List f305818j;

    /* renamed from: k */
    C60870cx f305819k;

    /* renamed from: l */
    public final C68214a f305820l;

    /* renamed from: m */
    public int f305821m = 1;

    /* renamed from: n */
    private final SharedPreferences f305822n;

    /* renamed from: o */
    private final C68214a f305823o;

    /* renamed from: p */
    private final C68214a f305824p;

    /* renamed from: q */
    private final C109758od[] f305825q;

    /* renamed from: r */
    private int f305826r = 0;

    /* renamed from: s */
    private final boolean f305827s;

    /* renamed from: t */
    private boolean f305828t;

    /* renamed from: u */
    private final C108515cv f305829u;

    public C109759oe(C108230ba baVar, C109740nn nnVar, C108515cv cvVar, C91097g gVar, C86124t tVar, SharedPreferences sharedPreferences, bm bmVar, C68214a aVar, C22871g gVar2, C113869cx cxVar, C68214a aVar2, C109734nh nhVar, C68214a aVar3, C68214a aVar4) {
        this.f305810b = baVar;
        this.f305811c = nnVar;
        this.f305829u = cvVar;
        this.f305812d = tVar;
        this.f305822n = sharedPreferences;
        this.f305813e = bmVar;
        this.f305823o = aVar3;
        this.f305824p = aVar;
        this.f305815g = gVar2;
        this.f305816h = cxVar;
        this.f305814f = aVar2;
        this.f305817i = nhVar.mo98054a(baVar, gVar);
        this.f305827s = m182772n((C89037bh) aVar.mo27525b());
        Resources a = ((C73841bf) aVar3.mo27525b()).mo65322a();
        this.f305825q = new C109758od[]{new C109758od(a.getString(R.string.opa_warm_welcome_greeting_0), "Nexus_WarmWelcome_Initial_WithReprompt_Part1_MM"), new C109758od(a.getString(R.string.opa_warm_welcome_greeting_1), "Nexus_WarmWelcome_Initial_WithReprompt_Part2_MM_alt"), new C109758od(a.getString(R.string.opa_warm_welcome_greeting_2), "Nexus_WarmWelcome_Initial_WithReprompt_Part3Help_MM")};
        this.f305820l = aVar4;
    }

    /* renamed from: j */
    private static C67402ar m182768j(String str, String str2) {
        C67395ak akVar = (C67395ak) C67396al.f183177c.createBuilder();
        akVar.copyOnWrite();
        C67396al alVar = (C67396al) akVar.instance;
        alVar.f183179a |= 1;
        alVar.f183180b = str2;
        C67396al alVar2 = (C67396al) akVar.build();
        C67397am amVar = (C67397am) C67398an.f183181d.createBuilder();
        amVar.copyOnWrite();
        C67398an anVar = (C67398an) amVar.instance;
        anVar.f183183a = 1;
        anVar.f183184b = str;
        amVar.copyOnWrite();
        C67398an anVar2 = (C67398an) amVar.instance;
        alVar2.getClass();
        anVar2.mo59846a();
        anVar2.f183185c.add(alVar2);
        C67398an anVar3 = (C67398an) amVar.build();
        C67399ao aoVar = (C67399ao) C67400ap.f183187c.createBuilder();
        aoVar.copyOnWrite();
        C67400ap apVar = (C67400ap) aoVar.instance;
        anVar3.getClass();
        apVar.mo59847a();
        apVar.f183189a.add(anVar3);
        C67401aq aqVar = (C67401aq) C67402ar.f183192d.createBuilder();
        aqVar.mo59848a((C67400ap) aoVar.build());
        return (C67402ar) aqVar.build();
    }

    /* renamed from: k */
    private final void m182769k() {
        this.f305819k = this.f305815g.mo28208h("Thinking bubble", (long) ((int) this.f305812d.mo79743a(C90113fk.f250725a)), new C109746nt(this));
    }

    /* renamed from: l */
    private final void m182770l() {
        C108262cf cfVar;
        C58838bb.m90883r(this.f305826r < 3);
        C109758od[] odVarArr = this.f305825q;
        int i = this.f305826r;
        C109758od odVar = odVarArr[i];
        if (i == 0) {
            cfVar = C108263cg.m179950B(this.f305812d);
        } else if (!this.f305828t) {
            cfVar = new C108262cf(false);
        } else {
            cfVar = new C108262cf();
        }
        cfVar.f301174d = odVar.f305807a;
        this.f305810b.mo95430s(cfVar);
        this.f305810b.mo95411av();
        if (this.f305826r == 2) {
            C60548tz tzVar = (C60548tz) C60555uf.f164065cO.createBuilder();
            tzVar.copyOnWrite();
            C60555uf ufVar = (C60555uf) tzVar.instance;
            ufVar.f164093a |= 2;
            ufVar.f164258m = 820;
            C89949q.m146525j((C60555uf) tzVar.build(), (C60321oe) null, (C63196b) null, (String) null);
            this.f305818j = new ArrayList();
            Resources a = ((C73841bf) this.f305823o.mo27525b()).mo65322a();
            for (String gyVar : Arrays.asList(new String[]{a.getString(R.string.opa_warm_welcome_suggestion_0), a.getString(R.string.opa_warm_welcome_suggestion_1), a.getString(R.string.opa_warm_welcome_suggestion_2), a.getString(R.string.opa_warm_welcome_suggestion_4)})) {
                this.f305818j.add(new C108390gy(0, gyVar, (String) null));
            }
            this.f305810b.mo95406aq(this.f305818j, false, 3, true);
            this.f305817i.mo98053a(true);
            this.f305810b.mo95411av();
        }
        this.f305826r++;
    }

    /* renamed from: m */
    private final void m182771m(int i) {
        this.f305821m = 2;
        this.f305810b.mo95387aC();
        C109758od odVar = this.f305825q[i];
        if (this.f305828t) {
            m182769k();
            this.f305811c.mo97489ay(new TtsRequest((C67190ah) null, (List) null, m182768j(odVar.f305807a, odVar.f305808b), (Uri) null, false));
            this.f305829u.mo96954b();
            return;
        }
        this.f305829u.mo96954b();
        mo98098e();
    }

    /* renamed from: n */
    private static boolean m182772n(C89037bh bhVar) {
        return ((C89062r) C90877ak.m148475i(bhVar.mo27378c(), C89062r.f241369a)).mo83040a();
    }

    /* renamed from: a */
    public final List mo98095a() {
        return this.f305818j;
    }

    /* renamed from: b */
    public final void mo98096b() {
        C60870cx cxVar = this.f305819k;
        if (cxVar != null) {
            cxVar.cancel(false);
            this.f305819k = null;
        }
    }

    /* renamed from: d */
    public final void mo98097d() {
        this.f305821m = 4;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public final void mo98098e() {
        if (mo98100g()) {
            while (this.f305826r < 3) {
                m182770l();
            }
            this.f305821m = 4;
            this.f305829u.mo96953a();
        }
    }

    /* renamed from: f */
    public final void mo98099f(boolean z) {
        this.f305828t = z;
        int i = this.f305821m;
        if (i == 1 || i == 4) {
            C60548tz tzVar = (C60548tz) C60555uf.f164065cO.createBuilder();
            tzVar.copyOnWrite();
            C60555uf ufVar = (C60555uf) tzVar.instance;
            ufVar.f164093a |= 2;
            ufVar.f164258m = 819;
            C89949q.m146525j((C60555uf) tzVar.build(), (C60321oe) null, (C63196b) null, (String) null);
            this.f305826r = 0;
            this.f305822n.edit().putInt("opa_warm_welcome_launch_count", this.f305822n.getInt("opa_warm_welcome_launch_count", 0) + 1).apply();
            m182771m(this.f305826r);
            return;
        }
        int i2 = this.f305826r;
        if (i2 < 3) {
            m182771m(i2);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x001f, code lost:
        if (r1 == 3) goto L_0x0021;
     */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x005e  */
    /* JADX WARNING: Removed duplicated region for block: B:32:? A[RETURN, SYNTHETIC] */
    /* renamed from: fM */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo19965fM(com.google.android.apps.gsa.search.shared.service.ServiceEventData r12) {
        /*
            r11 = this;
            com.google.android.apps.gsa.search.shared.service.b.uo r0 = r12.f236959a
            int r0 = r0.f238699b
            com.google.android.apps.gsa.search.shared.service.b.um r0 = com.google.android.apps.gsa.search.shared.service.p6935b.C88244um.m142794a(r0)
            if (r0 != 0) goto L_0x000c
            com.google.android.apps.gsa.search.shared.service.b.um r0 = com.google.android.apps.gsa.search.shared.service.p6935b.C88244um.ATTACH_WEBVIEW
        L_0x000c:
            int r1 = r11.f305821m
            r2 = 2
            r3 = 3
            if (r1 != r2) goto L_0x001f
            com.google.android.apps.gsa.search.shared.service.b.um r1 = com.google.android.apps.gsa.search.shared.service.p6935b.C88244um.TTS_PLAYBACK_STARTED
            if (r0 != r1) goto L_0x005a
            r11.mo98096b()
            r11.m182770l()
            r11.f305821m = r3
            goto L_0x0021
        L_0x001f:
            if (r1 != r3) goto L_0x005a
        L_0x0021:
            com.google.android.apps.gsa.search.shared.service.b.um r1 = com.google.android.apps.gsa.search.shared.service.p6935b.C88244um.TTS_PLAYBACK_DONE
            if (r0 != r1) goto L_0x005a
            int r1 = r11.f305826r
            if (r1 >= r3) goto L_0x004e
            r11.f305821m = r2
            com.google.android.apps.gsa.staticplugins.opa.od[] r2 = r11.f305825q
            r1 = r2[r1]
            com.google.android.apps.gsa.staticplugins.opa.chatui.ba r2 = r11.f305810b
            r2.mo95387aC()
            r11.m182769k()
            com.google.android.apps.gsa.staticplugins.opa.nn r2 = r11.f305811c
            com.google.android.apps.gsa.search.shared.actions.util.TtsRequest r10 = new com.google.android.apps.gsa.search.shared.actions.util.TtsRequest
            r5 = 0
            r6 = 0
            java.lang.String r4 = r1.f305807a
            java.lang.String r1 = r1.f305808b
            com.google.speech.n.b.ar r7 = m182768j(r4, r1)
            r8 = 0
            r9 = 0
            r4 = r10
            r4.<init>(r5, r6, r7, r8, r9)
            r2.mo97489ay(r10)
        L_0x004e:
            int r1 = r11.f305826r
            if (r1 != r3) goto L_0x005a
            r1 = 4
            r11.f305821m = r1
            com.google.android.apps.gsa.staticplugins.opa.cv r1 = r11.f305829u
            r1.mo96953a()
        L_0x005a:
            com.google.android.apps.gsa.search.shared.service.b.um r1 = com.google.android.apps.gsa.search.shared.service.p6935b.C88244um.OPA_SESSION_SERVICE_EVENT
            if (r0 != r1) goto L_0x00a8
            com.google.protobuf.bt r0 = com.google.android.apps.gsa.staticplugins.opa.p8300as.p8303b.C107505a.f299120a
            com.google.android.apps.gsa.search.shared.service.b.uo r1 = r12.f236959a
            com.google.protobuf.bt r0 = com.google.protobuf.C62942bv.checkIsLite(r0)
            r1.mo58887l(r0)
            com.google.protobuf.bf r1 = r1.f169962ag
            com.google.protobuf.bs r0 = r0.f169971d
            boolean r0 = r1.mo58857o(r0)
            if (r0 == 0) goto L_0x00a8
            com.google.protobuf.bt r0 = com.google.android.apps.gsa.staticplugins.opa.p8300as.p8303b.C107505a.f299120a
            java.lang.Object r12 = r12.mo81918e(r0)
            com.google.android.apps.gsa.staticplugins.opa.as.b.e r12 = (com.google.android.apps.gsa.staticplugins.opa.p8300as.p8303b.C107556e) r12
            int r0 = r12.f299213b
            int r0 = com.google.android.apps.gsa.staticplugins.opa.p8300as.p8303b.C107554c.m178398a(r0)
            if (r0 != 0) goto L_0x0084
            goto L_0x00a8
        L_0x0084:
            if (r0 != r3) goto L_0x00a8
            com.google.protobuf.bt r0 = com.google.android.apps.gsa.staticplugins.opa.p8300as.p8303b.p8304a.C107546y.f299196a
            com.google.protobuf.bt r0 = com.google.protobuf.C62942bv.checkIsLite(r0)
            r12.mo58887l(r0)
            com.google.protobuf.bf r12 = r12.f169962ag
            com.google.protobuf.bs r1 = r0.f169971d
            java.lang.Object r12 = r12.mo58854l(r1)
            if (r12 != 0) goto L_0x009c
            java.lang.Object r12 = r0.f169969b
            goto L_0x00a0
        L_0x009c:
            java.lang.Object r12 = r0.mo58889c(r12)
        L_0x00a0:
            com.google.android.apps.gsa.staticplugins.opa.as.b.a.aa r12 = (com.google.android.apps.gsa.staticplugins.opa.p8300as.p8303b.p8304a.C107507aa) r12
            com.google.assistant.y.b.e r12 = r12.f299125b
            if (r12 != 0) goto L_0x00a8
            com.google.assistant.y.b.e r12 = com.google.assistant.p4008y.p4010b.C53623e.f140744c
        L_0x00a8:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.staticplugins.opa.C109759oe.mo19965fM(com.google.android.apps.gsa.search.shared.service.ServiceEventData):void");
    }

    /* renamed from: g */
    public final boolean mo98100g() {
        int i = this.f305821m;
        return i == 2 || i == 3 || i == 5;
    }

    /* renamed from: h */
    public final boolean mo98101h() {
        if (this.f305821m == 4 || !this.f305827s || !m182772n((C89037bh) this.f305824p.mo27525b()) || !this.f305812d.mo79746e(C90113fk.f250726b) || ((long) this.f305822n.getInt("opa_warm_welcome_launch_count", 0)) >= this.f305812d.mo79743a(C90014bt.f247589jx)) {
            return false;
        }
        if ((!this.f305812d.mo79746e(C90014bt.f247590jy) || this.f305822n.getInt("opa_warm_welcome_launch_count", 0) != 0) && this.f305813e.t() && !this.f305822n.getBoolean("assistant_response_received", false)) {
            return true;
        }
        return false;
    }

    /* renamed from: i */
    public final C60870cx mo98102i(C109040fj fjVar, int i, C107698i iVar) {
        return this.f305815g.mo28209i(((C89037bh) this.f305824p.mo27525b()).mo27378c(), "getConnectivityInfo", new C109745ns(this, i, iVar, fjVar));
    }
}
