package com.google.android.apps.gsa.search.core.state.p6872d;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.evernote.android.state.BuildConfig;
import com.google.android.apps.gsa.assist.p501a.C9325m;
import com.google.android.apps.gsa.p8883x.C118826c;
import com.google.android.apps.gsa.search.core.p6513aj.C84516aa;
import com.google.android.apps.gsa.search.core.p6519al.p6592bi.C84855a;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.search.core.state.C86898ct;
import com.google.android.apps.gsa.search.core.state.p6864a.C86794i;
import com.google.android.apps.gsa.search.core.state.p6864a.C86798m;
import com.google.android.apps.gsa.search.shared.service.ClientEventData;
import com.google.android.apps.gsa.search.shared.service.p6935b.C87739bu;
import com.google.android.apps.gsa.shared.logger.p7051b.C89849ae;
import com.google.android.apps.gsa.shared.logger.p7051b.C89859i;
import com.google.android.apps.gsa.shared.logger.p7064i.C89922b;
import com.google.android.apps.gsa.shared.p7066m.C90014bt;
import com.google.android.apps.gsa.shared.p7066m.C90021c;
import com.google.android.apps.gsa.shared.p7066m.C90082eg;
import com.google.android.apps.gsa.shared.p7066m.p7068b.C89994f;
import com.google.android.apps.gsa.shared.p7130s.p7131a.C90476a;
import com.google.android.apps.gsa.shared.search.C90507o;
import com.google.android.apps.gsa.shared.speech.HotwordDetectedEventData;
import com.google.android.apps.gsa.shared.speech.dumper.C90547aj;
import com.google.android.apps.gsa.shared.speech.dumper.C90548ak;
import com.google.android.apps.gsa.shared.speech.hotword.HotwordResult;
import com.google.android.apps.gsa.shared.util.BitFlags;
import com.google.android.apps.gsa.shared.util.C91123v;
import com.google.android.apps.gsa.shared.util.debug.p7163a.C91006f;
import com.google.android.apps.gsa.shared.util.debug.p7166b.C91018d;
import com.google.android.apps.gsa.shared.util.p7158b.C90752i;
import com.google.android.apps.gsa.shared.util.p7159c.C90875ai;
import com.google.android.apps.gsa.speech.microdetection.C92530c;
import com.google.android.apps.gsa.speech.microdetection.C92532d;
import com.google.android.apps.gsa.speech.microdetection.p7303a.C92487a;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.android.libraries.p1730f.C21370a;
import com.google.android.libraries.search.logging.appflows.startup.p3037a.C38802e;
import com.google.common.base.C58833ax;
import com.google.common.base.C58837ba;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60870cx;
import dagger.C68214a;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import p3186j$.time.Duration;

/* renamed from: com.google.android.apps.gsa.search.core.state.d.be */
/* compiled from: PG */
public final class C86938be extends C86898ct implements C86798m {

    /* renamed from: a */
    public static final C59071e f234771a = C59071e.m91332i("com.google.android.apps.gsa.search.core.state.d.be");

    /* renamed from: A */
    private boolean f234772A = false;

    /* renamed from: E */
    private boolean f234773E;

    /* renamed from: F */
    private C92487a f234774F = C92487a.f258105a;

    /* renamed from: G */
    private boolean f234775G;

    /* renamed from: H */
    private boolean f234776H;

    /* renamed from: I */
    private boolean f234777I;

    /* renamed from: L */
    private boolean f234778L;

    /* renamed from: M */
    private boolean f234779M;

    /* renamed from: N */
    private boolean f234780N;

    /* renamed from: O */
    private final C86794i f234781O;

    /* renamed from: P */
    private C60870cx f234782P = C118826c.f331423b;

    /* renamed from: Q */
    private C60870cx f234783Q;

    /* renamed from: R */
    private C60870cx f234784R;

    /* renamed from: S */
    private C60870cx f234785S;

    /* renamed from: T */
    private boolean f234786T;

    /* renamed from: U */
    private final C91123v f234787U;

    /* renamed from: b */
    public final C68214a f234788b;

    /* renamed from: c */
    public final C86124t f234789c;

    /* renamed from: d */
    public final C21370a f234790d;

    /* renamed from: e */
    public final BitFlags f234791e = new BitFlags(getClass(), "FLAG_", 0);

    /* renamed from: f */
    public final SharedPreferences f234792f;

    /* renamed from: g */
    public final C68214a f234793g;

    /* renamed from: h */
    public final C22871g f234794h;

    /* renamed from: i */
    public final C9325m f234795i;

    /* renamed from: j */
    public final Context f234796j;

    /* renamed from: k */
    public final C84855a f234797k;

    /* renamed from: l */
    boolean f234798l;

    /* renamed from: m */
    public boolean f234799m;

    /* renamed from: n */
    public final BroadcastReceiver f234800n;

    /* renamed from: o */
    public final BroadcastReceiver f234801o;

    /* renamed from: p */
    private final C68214a f234802p;

    /* renamed from: q */
    private final C68214a f234803q;

    /* renamed from: r */
    private final Set f234804r;

    /* renamed from: s */
    private final C84516aa f234805s;

    /* renamed from: t */
    private final C68214a f234806t;

    /* renamed from: u */
    private final C58833ax f234807u;

    /* renamed from: v */
    private final C38802e f234808v;

    /* renamed from: w */
    private final C58833ax f234809w;

    /* renamed from: x */
    private final C68214a f234810x;

    /* renamed from: y */
    private final C68214a f234811y;

    /* renamed from: z */
    private C92530c f234812z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C86938be(C68214a aVar, C68214a aVar2, C86124t tVar, C21370a aVar3, SharedPreferences sharedPreferences, C68214a aVar4, C68214a aVar5, C84855a aVar6, C84516aa aaVar, C68214a aVar7, C68214a aVar8, C22871g gVar, C58833ax axVar, C38802e eVar, C86794i iVar, C68214a aVar9, C58833ax axVar2, Context context, C68214a aVar10, C9325m mVar, C91123v vVar) {
        super(aVar, 17);
        C22871g gVar2 = gVar;
        C68214a aVar11 = aVar;
        C60870cx cxVar = C118826c.f331423b;
        this.f234783Q = cxVar;
        this.f234784R = cxVar;
        this.f234785S = cxVar;
        this.f234800n = new C86932az(this);
        this.f234801o = new C86936bc(this);
        this.f234802p = aVar2;
        this.f234789c = tVar;
        this.f234790d = aVar3;
        this.f234807u = axVar;
        this.f234808v = eVar;
        this.f234804r = new HashSet();
        this.f234792f = sharedPreferences;
        this.f234793g = aVar4;
        this.f234812z = new C92530c();
        this.f234788b = aVar5;
        this.f234797k = aVar6;
        this.f234776H = sharedPreferences.getBoolean("key_opa_eligible", false);
        this.f234777I = sharedPreferences.getBoolean("opa_chat_ui_seen", false);
        this.f234805s = aaVar;
        this.f234781O = iVar;
        this.f234803q = aVar7;
        this.f234806t = aVar8;
        this.f234794h = gVar2;
        this.f234811y = aVar9;
        this.f234809w = axVar2;
        this.f234796j = context;
        this.f234810x = aVar10;
        this.f234795i = mVar;
        this.f234787U = vVar;
        gVar2.mo28212l("MicroDetectionState#registerBroadcastReceivers", new C86927au(this));
    }

    /* renamed from: S */
    private final void m140238S() {
        C86937bd.m140237a(new C86930ax(this));
    }

    /* renamed from: T */
    private final void m140239T(C60870cx cxVar, String str) {
        if (cxVar.isDone()) {
            m140238S();
            super.mo80591ar();
            return;
        }
        C90875ai.m148465b(new C86928av(this), cxVar, this.f234794h, str).mo85223a(new C86929aw(this));
        m140238S();
        super.mo80591ar();
    }

    /* renamed from: U */
    private final boolean m140240U() {
        return !this.f234784R.isDone();
    }

    /* renamed from: V */
    private final boolean m140241V() {
        return !this.f234785S.isDone();
    }

    /* renamed from: A */
    public final C92530c mo80488A() {
        return this.f234812z;
    }

    /* renamed from: B */
    public final String mo80489B() {
        C58976aa aaVar = C58975e.f156826a;
        if (((C89994f) this.f234788b.mo27525b()).mo83834w()) {
            return "Hey Google";
        }
        C92487a aVar = this.f234774F;
        return TextUtils.isEmpty(aVar.f258108d) ? "Ok Google" : aVar.f258108d;
    }

    /* renamed from: C */
    public final boolean mo80490C() {
        return !this.f234774F.mo87253a();
    }

    /* renamed from: D */
    public final boolean mo80491D() {
        if (!mo80490C()) {
            C58976aa aaVar = C58975e.f156826a;
            return false;
        } else if (!mo80586N()) {
            C58976aa aaVar2 = C58975e.f156826a;
            return false;
        } else if (mo80587O()) {
            C58976aa aaVar3 = C58975e.f156826a;
            return false;
        } else if (mo80588P()) {
            C58976aa aaVar4 = C58975e.f156826a;
            return false;
        } else if (!this.f234774F.mo87254b()) {
            C58976aa aaVar5 = C58975e.f156826a;
            return false;
        } else {
            C58976aa aaVar6 = C58975e.f156826a;
            return true;
        }
    }

    /* renamed from: E */
    public final boolean mo80492E() {
        return false;
    }

    /* renamed from: F */
    public final boolean mo80493F() {
        if (mo80589Q()) {
            C58976aa aaVar = C58975e.f156826a;
            return false;
        } else if (!TextUtils.isEmpty(this.f234774F.f258108d)) {
            return true;
        } else {
            return false;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: G */
    public final /* synthetic */ void mo80579G() {
        C58976aa aaVar = C58975e.f156826a;
        int i = 0;
        boolean z = this.f234774F.f258107c == 0 && !this.f234798l;
        boolean z2 = this.f234772A;
        if (z2 || z) {
            int i2 = true != z2 ? 1 : 2;
            this.f234798l = true;
            this.f234772A = false;
            if (!mo80581I()) {
                m140238S();
                super.mo80591ar();
            }
            i = i2;
        }
        if (i == 0) {
            this.f234797k.mo78551u();
        } else {
            this.f234797k.mo78543k(i);
        }
    }

    /* renamed from: H */
    public final void mo80580H(boolean z) {
        C58976aa aaVar = C58975e.f156826a;
        if (this.f234791e.mo85055h(2048, !z)) {
            m140238S();
            super.mo80591ar();
        }
    }

    /* renamed from: I */
    public final boolean mo80581I() {
        return this.f234772A || m140241V() || m140240U() || !this.f234782P.isDone() || !this.f234783Q.isDone();
    }

    /* renamed from: J */
    public final boolean mo80582J() {
        return BitFlags.m148144f(this.f234791e.f253762b, 1);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: K */
    public final boolean mo80583K() {
        return ((C86964p) this.f234803q.mo27525b()).f234897a;
    }

    /* renamed from: L */
    public final boolean mo80584L() {
        return !BitFlags.m148144f(this.f234791e.f253762b, 16) && mo80585M();
    }

    /* renamed from: M */
    public final boolean mo80585M() {
        return this.f234792f.contains("spoken-language-bcp-47") && this.f234774F.mo87254b();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: N */
    public final boolean mo80586N() {
        return this.f234791e.mo85052e(14);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: O */
    public final boolean mo80587O() {
        return this.f234791e.mo85052e(96);
    }

    /* access modifiers changed from: protected */
    /* renamed from: P */
    public final boolean mo80588P() {
        boolean e = this.f234791e.mo85052e(3840);
        if (e) {
            C58976aa aaVar = C58975e.f156826a;
        }
        return e;
    }

    /* renamed from: Q */
    public final boolean mo80589Q() {
        if (!this.f234776H) {
            return false;
        }
        if (this.f234789c.mo79746e(C90014bt.f247421go)) {
            C58976aa aaVar = C58975e.f156826a;
            return false;
        } else if (!this.f234789c.mo79746e(C90014bt.f247422gp)) {
            C58976aa aaVar2 = C58975e.f156826a;
            return true;
        } else if (this.f234777I) {
            C58976aa aaVar3 = C58975e.f156826a;
            return true;
        } else {
            C58976aa aaVar4 = C58975e.f156826a;
            return false;
        }
    }

    /* renamed from: R */
    public final boolean mo80590R(C86962n nVar) {
        if (this.f234773E && this.f234789c.mo79746e(C90082eg.f249952bO)) {
            boolean z = this.f234775G;
            int i = nVar.f234890c;
            if (!((C86962n) this.f234802p.mo27525b()).f234888a || !(i == 2 || i == 4)) {
                this.f234775G = false;
            } else if (mo80585M()) {
                this.f234775G = true;
            }
            C58976aa aaVar = C58975e.f156826a;
            if (z != this.f234775G) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    public final void mo80466a(boolean z) {
        int i = true != z ? 32 : 64;
        C58976aa aaVar = C58975e.f156826a;
        this.f234791e.mo85049c(1, (long) i);
        this.f234812z.mo87304f();
        this.f234797k.mo78546n();
        this.f234797k.mo78544l(false);
        m140238S();
        super.mo80591ar();
    }

    /* renamed from: ag */
    public final C87739bu[] mo80403ag() {
        return new C87739bu[]{C87739bu.HOTWORD_DETECTED_IN_INTERACTOR, C87739bu.HOTWORD_REJECTED_AFTER_DSP_TRIGGERED, C87739bu.VOICE_ASSIST_FROM_KEYGUARD_TRIGGERED, C87739bu.HOTWORD_TRIGGERED_ON_DSP};
    }

    /* renamed from: ar */
    public final void mo80591ar() {
        m140238S();
        super.mo80591ar();
    }

    /* renamed from: c */
    public final void mo80467c() {
        C58976aa aaVar = C58975e.f156826a;
        this.f234791e.mo85049c(15, 0);
        this.f234812z.mo87304f();
        this.f234797k.mo78544l(false);
        m140238S();
        super.mo80591ar();
    }

    /* renamed from: e */
    public final void mo80468e(HotwordResult hotwordResult) {
        C58976aa aaVar = C58975e.f156826a;
        this.f234812z.mo87304f();
        m140238S();
        super.mo80591ar();
        this.f234797k.mo78545m(hotwordResult);
    }

    /* renamed from: g */
    public final void mo80469g(C92487a aVar) {
        boolean z;
        C58976aa aaVar = C58975e.f156826a;
        if (!aVar.equals(this.f234774F)) {
            this.f234774F = aVar;
            z = true;
        } else {
            z = false;
        }
        if (this.f234774F.mo87254b() && this.f234798l) {
            this.f234798l = false;
        } else if (!z) {
            return;
        }
        m140238S();
        super.mo80591ar();
    }

    /* renamed from: gS */
    public final void mo17602gS(C91006f fVar) {
        String str;
        fVar.mo85291r("MicroDetectionState");
        fVar.mo85279c("flags").mo85276a(C90752i.m148229c(this.f234791e.mo85048b()));
        ArrayList arrayList = new ArrayList();
        if (mo80582J()) {
            arrayList.add("active");
        }
        if (mo80490C()) {
            arrayList.add("enabled");
        }
        if (mo80584L()) {
            arrayList.add("available");
        }
        if (mo80585M()) {
            arrayList.add("availableForLocale");
        }
        if (this.f234772A) {
            arrayList.add("force update data manager");
        }
        if (this.f234798l) {
            arrayList.add("data manager initializing");
        }
        fVar.mo85292s(C90752i.m148229c(arrayList.toString()));
        fVar.mo85279c("Hotword Phrase").mo85276a(C90752i.m148229c(((C89994f) this.f234788b.mo27525b()).mo83830s()));
        fVar.mo85279c("current detection mode").mo85276a(C90752i.m148229c(String.valueOf(this.f234812z)));
        fVar.mo85279c("model info").mo85276a(C90752i.m148229c(String.valueOf(this.f234774F)));
        fVar.mo85279c("hotword stats").mo85276a(C90752i.m148229c(String.valueOf(this.f234793g.mo27525b())));
        fVar.mo85279c("pausing packages").mo85276a(C90752i.m148229c(String.valueOf(this.f234804r)));
        fVar.mo85279c("always_on_hotword_suppressed").mo85276a(C90752i.m148228b(Boolean.valueOf(this.f234792f.getBoolean("always_on_hotword_suppressed", false))));
        if (m140241V()) {
            fVar.mo85292s(C90752i.m148229c("PendingHotwordEventData = true"));
        }
        if (m140240U()) {
            fVar.mo85292s(C90752i.m148229c("DspHotwordRejectedEventData = true"));
        }
        C90548ak akVar = (C90548ak) this.f234806t.mo27525b();
        if (((C90021c) akVar.f253135b.mo27525b()).mo79746e(C90082eg.f250011cU)) {
            akVar.f253134a.mo85271g(fVar, "Tracker Events:", new C90547aj(), false);
            str = BuildConfig.FLAVOR;
        } else {
            StringBuilder sb = new StringBuilder();
            for (Map.Entry entry : akVar.f253136c.entrySet()) {
                sb.append((String) entry.getKey());
                sb.append(": [");
                sb.append(entry.getValue());
                sb.append("]\n");
            }
            str = sb.toString();
        }
        fVar.mo85278b("\nTracker Events: ".concat(str));
        C89994f fVar2 = (C89994f) this.f234788b.mo27525b();
        fVar.mo85279c("Always On Enabled").mo85276a(C90752i.m148228b(Boolean.valueOf(fVar2.mo83817f())));
        fVar.mo85284k("Hotword Phrase", fVar2.mo83830s());
        C84516aa aaVar = this.f234805s;
        C90476a aVar = C91018d.f254254a;
        String str2 = "Yes";
        String str3 = true != aaVar.f230023b.isKeyguardSecure() ? "No" : str2;
        C58976aa aaVar2 = C58975e.f156826a;
        fVar.mo85284k("Secure Keyguard Enabled", str3);
        boolean m = ((C89994f) this.f234788b.mo27525b()).mo83824m(fVar2.mo83882ab());
        String string = this.f234792f.getString("HotwordEverywhereEnabledAnytime", (String) null);
        if (string != null) {
            fVar.mo85284k("HotwordEverywhereEnabledAnytime", string);
        }
        if (!m && !((C89994f) this.f234788b.mo27525b()).mo83817f()) {
            if (true != mo80582J()) {
                str2 = "No";
            }
            fVar.mo85284k("Hotword Running", str2);
        } else if (string == null) {
            Date date = new Date();
            this.f234792f.edit().putString("HotwordEverywhereEnabledAnytime", date.toString()).apply();
            fVar.mo85284k("HotwordEverywhereEnabledAnytime", date.toString());
        }
        fVar.mo85284k("Hotword Detection Setting Enabled", String.valueOf(((C89994f) this.f234788b.mo27525b()).mo83819h()));
    }

    /* renamed from: h */
    public final void mo80470h() {
        C58976aa aaVar = C58975e.f156826a;
        if (this.f234791e.mo85049c(96, 1)) {
            this.f234797k.mo78544l(true);
        }
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* renamed from: hl */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo80592hl(java.lang.String r10) {
        /*
            r9 = this;
            int r0 = r10.hashCode()
            r1 = 5
            r2 = 4
            r3 = 3
            r4 = 2
            r5 = 1
            java.lang.String r6 = "key_opa_eligible"
            java.lang.String r7 = "opa_chat_ui_seen"
            r8 = 0
            switch(r0) {
                case -1674632771: goto L_0x0040;
                case -574728546: goto L_0x0038;
                case -240387386: goto L_0x002e;
                case 357273206: goto L_0x0026;
                case 1567966759: goto L_0x001c;
                case 2130978923: goto L_0x0012;
                default: goto L_0x0011;
            }
        L_0x0011:
            goto L_0x004a
        L_0x0012:
            java.lang.String r0 = "spoken-language-bcp-47"
            boolean r10 = r10.equals(r0)
            if (r10 == 0) goto L_0x004a
            r10 = 1
            goto L_0x004b
        L_0x001c:
            java.lang.String r0 = "google_account"
            boolean r10 = r10.equals(r0)
            if (r10 == 0) goto L_0x004a
            r10 = 0
            goto L_0x004b
        L_0x0026:
            boolean r10 = r10.equals(r6)
            if (r10 == 0) goto L_0x004a
            r10 = 2
            goto L_0x004b
        L_0x002e:
            java.lang.String r0 = "GSAPrefs.hotword_enabled"
            boolean r10 = r10.equals(r0)
            if (r10 == 0) goto L_0x004a
            r10 = 4
            goto L_0x004b
        L_0x0038:
            boolean r10 = r10.equals(r7)
            if (r10 == 0) goto L_0x004a
            r10 = 3
            goto L_0x004b
        L_0x0040:
            java.lang.String r0 = "hotwordDetector"
            boolean r10 = r10.equals(r0)
            if (r10 == 0) goto L_0x004a
            r10 = 5
            goto L_0x004b
        L_0x004a:
            r10 = -1
        L_0x004b:
            if (r10 == 0) goto L_0x0098
            if (r10 == r5) goto L_0x008c
            if (r10 == r4) goto L_0x007b
            if (r10 == r3) goto L_0x006a
            if (r10 == r2) goto L_0x0061
            if (r10 == r1) goto L_0x0058
            return
        L_0x0058:
            com.google.common.f.aa r10 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r9.m140238S()
            super.mo80591ar()
            return
        L_0x0061:
            com.google.common.f.aa r10 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r9.m140238S()
            super.mo80591ar()
            return
        L_0x006a:
            com.google.common.f.aa r10 = com.google.common.p4526f.p4527a.C58975e.f156826a
            android.content.SharedPreferences r10 = r9.f234792f
            boolean r10 = r10.getBoolean(r7, r8)
            r9.f234777I = r10
            r9.m140238S()
            super.mo80591ar()
            return
        L_0x007b:
            com.google.common.f.aa r10 = com.google.common.p4526f.p4527a.C58975e.f156826a
            android.content.SharedPreferences r10 = r9.f234792f
            boolean r10 = r10.getBoolean(r6, r8)
            r9.f234776H = r10
            r9.m140238S()
            super.mo80591ar()
            return
        L_0x008c:
            dagger.a r10 = r9.f234811y
            java.lang.Object r10 = r10.mo27525b()
            com.google.android.apps.gsa.search.core.al.at.a r10 = (com.google.android.apps.gsa.search.core.p6519al.p6560at.C84734a) r10
            r10.mo78450c()
            return
        L_0x0098:
            dagger.a r10 = r9.f234811y
            java.lang.Object r10 = r10.mo27525b()
            com.google.android.apps.gsa.search.core.al.at.a r10 = (com.google.android.apps.gsa.search.core.p6519al.p6560at.C84734a) r10
            r10.mo78449b()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.search.core.state.p6872d.C86938be.mo80592hl(java.lang.String):void");
    }

    /* renamed from: hp */
    public final String[] mo80593hp() {
        return new String[]{C90507o.f253011a, "GSAPrefs.hotword_enabled", "always_on_hotword_suppressed", "spoken-language-bcp-47", "hotwordDetector", "key_opa_eligible", "opa_chat_ui_seen"};
    }

    /* renamed from: hr */
    public final void mo80408hr(long j, ClientEventData clientEventData) {
        C58976aa aaVar = C58975e.f156826a;
        C87739bu buVar = C87739bu.UNKNOWN;
        C87739bu a = C87739bu.m142761a(clientEventData.f236955a.f237480b);
        if (a == null) {
            a = C87739bu.UNKNOWN;
        }
        int ordinal = a.ordinal();
        if (ordinal == 28) {
            ((C89859i) this.f234810x.mo27525b()).mo83702b(C89849ae.STATE_RECEIVED_HOTWORD_FROM_INTERACTOR);
            Duration ofNanos = Duration.ofNanos(this.f234790d.mo26872d());
            if (this.f234807u.mo56113h()) {
                ((C89922b) this.f234807u.mo56107c()).mo83765i(ofNanos.toMillis());
            }
            this.f234808v.mo41632f(ofNanos);
            C60870cx e = this.f234797k.mo78537e((HotwordDetectedEventData) clientEventData.mo81912b(HotwordDetectedEventData.class));
            this.f234785S = e;
            m140239T(e, "onHotwordDetectedInInteractor");
        } else if (ordinal == 29) {
            C60870cx f = this.f234797k.mo78538f((HotwordResult) clientEventData.mo81912b(HotwordResult.class));
            this.f234784R = f;
            m140239T(f, "onHotwordRejectedAfterDsp");
        } else if (ordinal == 68) {
            C60870cx h = this.f234797k.mo78540h();
            this.f234782P = h;
            m140239T(h, "onVoiceAssistTriggerFromKeyguard");
        } else if (ordinal == 69) {
            ((C89859i) this.f234810x.mo27525b()).mo83702b(C89849ae.STATE_RECEIVED_HOTWORD_FROM_INTERACTOR_FOR_NOTE4);
            C60870cx g = this.f234797k.mo78539g();
            this.f234783Q = g;
            m140239T(g, "onHotwordTriggeredOnDsp");
        }
    }

    /* renamed from: i */
    public final void mo80471i(boolean z) {
        this.f234773E = z;
        mo80590R((C86962n) this.f234802p.mo27525b());
        m140238S();
        super.mo80591ar();
    }

    /* renamed from: j */
    public final void mo80472j() {
        if (!this.f234772A) {
            this.f234772A = true;
            m140238S();
            super.mo80591ar();
        }
    }

    /* renamed from: k */
    public final void mo80473k(boolean z) {
        if (this.f234791e.mo85055h(16, !z)) {
            m140238S();
            super.mo80591ar();
        }
    }

    /* renamed from: m */
    public final void mo80474m(boolean z) {
        if (this.f234791e.mo85055h(2, z)) {
            m140238S();
            super.mo80591ar();
        }
    }

    /* renamed from: n */
    public final void mo80475n(boolean z) {
        if (this.f234791e.mo85055h(8, z)) {
            m140238S();
            super.mo80591ar();
        }
    }

    /* renamed from: o */
    public final void mo80476o(boolean z) {
        this.f234780N = z;
        m140238S();
        super.mo80591ar();
    }

    /* renamed from: p */
    public final void mo80477p(boolean z) {
        this.f234778L = z;
        m140238S();
        super.mo80591ar();
    }

    /* renamed from: q */
    public final void mo80478q(boolean z) {
        if (this.f234791e.mo85055h(4096, !z)) {
            C59104x b = f234771a.mo56224b();
            b.mo56378ag(C58975e.f156826a, "MicroDetectionState");
            ((C59052c) ((C59052c) b).mo56372aa(9169)).mo56389s("Updating hotword opa ineligibility to %b", Boolean.valueOf(z));
            m140238S();
            super.mo80591ar();
        }
    }

    /* renamed from: r */
    public final void mo80479r(boolean z) {
        this.f234779M = z;
        m140238S();
        super.mo80591ar();
    }

    /* renamed from: s */
    public final void mo80480s(boolean z) {
        this.f234799m = z;
    }

    /* renamed from: t */
    public final void mo80481t(boolean z) {
        if (this.f234786T != z) {
            this.f234786T = z;
            m140238S();
            super.mo80591ar();
        }
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        if (mo80582J()) {
            arrayList.add("active");
        }
        if (mo80490C()) {
            arrayList.add("enabled");
        }
        if (mo80584L()) {
            arrayList.add("hotwordAvailable");
        }
        if (mo80585M()) {
            arrayList.add("hotwordAvailableForLocale");
        }
        arrayList.add("mCurrentDetectionMode=".concat(String.valueOf(String.valueOf(this.f234812z))));
        arrayList.add("mHotwordStats=".concat(String.valueOf(String.valueOf(this.f234793g.mo27525b()))));
        boolean z = this.f234798l;
        arrayList.add("mIsDataManagerInitializing=" + z);
        arrayList.add("mModelInfo=".concat(String.valueOf(String.valueOf(this.f234774F))));
        int a = ((C92532d) this.f234793g.mo27525b()).mo85077a();
        arrayList.add("mHotwordStatsTotal=" + a);
        arrayList.add("mPausingPackageNames=".concat(String.valueOf(String.valueOf(this.f234804r))));
        boolean z2 = this.f234772A;
        arrayList.add("mForceUpdateDataManager=" + z2);
        arrayList.add("mVoiceUnlockPaused=false");
        boolean K = mo80583K();
        arrayList.add("mConnectedToCar=" + K);
        String obj = arrayList.toString();
        String b = this.f234791e.mo85048b();
        return "MicroDetectionState(state=" + obj + ", flags=" + b + ")";
    }

    /* renamed from: u */
    public final boolean mo80482u() {
        return !BitFlags.m148144f(this.f234791e.f253762b, 4096);
    }

    /* renamed from: v */
    public final boolean mo80483v() {
        return this.f234778L;
    }

    /* renamed from: w */
    public final boolean mo80484w() {
        return this.f234779M;
    }

    /* renamed from: x */
    public final boolean mo80485x(boolean z, String str) {
        boolean z2;
        C58976aa aaVar = C58975e.f156826a;
        if (C58837ba.m90859h(str)) {
            C59104x d = f234771a.mo56226d();
            d.mo56378ag(C58975e.f156826a, "MicroDetectionState");
            ((C59052c) ((C59052c) d).mo56372aa(9179)).mo56386p("No package name specified");
            return false;
        }
        if (z) {
            this.f234804r.add(str);
            z2 = this.f234791e.mo85049c(0, 1024);
        } else {
            this.f234804r.remove(str);
            if (this.f234804r.isEmpty()) {
                z2 = this.f234791e.mo85049c(1024, 0);
            }
            return false;
        }
        if (z2) {
            m140238S();
            super.mo80591ar();
            return true;
        }
        return false;
    }

    /* JADX WARNING: Removed duplicated region for block: B:53:0x00de  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x00e4  */
    /* renamed from: y */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo80486y(boolean r11) {
        /*
            r10 = this;
            com.google.common.f.aa r0 = com.google.common.p4526f.p4527a.C58975e.f156826a
            com.google.android.apps.gsa.speech.microdetection.c r0 = new com.google.android.apps.gsa.speech.microdetection.c
            com.google.android.apps.gsa.speech.microdetection.c r1 = r10.f234812z
            r0.<init>(r1)
            com.google.android.apps.gsa.assist.a.m r1 = r10.f234795i
            boolean r1 = r1.mo17534a()
            boolean r2 = r10.mo80588P()
            r3 = 0
            r4 = 1
            if (r2 != 0) goto L_0x007f
            com.google.android.apps.gsa.shared.util.BitFlags r2 = r10.f234791e
            long r5 = r2.f253762b
            r7 = 64
            boolean r2 = com.google.android.apps.gsa.shared.util.BitFlags.m148144f(r5, r7)
            if (r2 != 0) goto L_0x007f
            com.google.common.base.ax r2 = r10.f234809w
            boolean r2 = r2.mo56113h()
            if (r2 == 0) goto L_0x003b
            com.google.common.base.ax r2 = r10.f234809w
            java.lang.Object r2 = r2.mo56107c()
            com.google.android.apps.gsa.assistant.shared.bd r2 = (com.google.android.apps.gsa.assistant.shared.bd) r2
            boolean r2 = r2.q()
            if (r2 == 0) goto L_0x003b
            r2 = 1
            goto L_0x003c
        L_0x003b:
            r2 = 0
        L_0x003c:
            com.google.android.apps.gsa.search.core.state.a.i r5 = r10.f234781O
            boolean r5 = r5.mo80452c()
            if (r5 != 0) goto L_0x0062
            if (r2 != 0) goto L_0x0062
            boolean r2 = r10.f234778L
            if (r2 != 0) goto L_0x0062
            boolean r2 = r10.f234779M
            if (r2 == 0) goto L_0x004f
            goto L_0x0062
        L_0x004f:
            dagger.a r2 = r10.f234788b
            java.lang.Object r2 = r2.mo27525b()
            com.google.android.apps.gsa.shared.m.b.f r2 = (com.google.android.apps.gsa.shared.p7066m.p7068b.C89994f) r2
            boolean r2 = r2.mo83819h()
            if (r2 != 0) goto L_0x0062
            boolean r2 = r10.f234780N
            if (r2 != 0) goto L_0x0062
            goto L_0x007f
        L_0x0062:
            if (r1 != 0) goto L_0x0070
            boolean r1 = r10.f234780N
            if (r1 != 0) goto L_0x0070
            com.google.android.apps.gsa.shared.util.v r1 = r10.f234787U
            boolean r1 = r1.mo85393e()
            if (r1 == 0) goto L_0x007f
        L_0x0070:
            com.google.android.apps.gsa.shared.util.BitFlags r1 = r10.f234791e
            long r1 = r1.f253762b
            r5 = 4096(0x1000, double:2.0237E-320)
            boolean r1 = com.google.android.apps.gsa.shared.util.BitFlags.m148144f(r1, r5)
            if (r1 == 0) goto L_0x007d
            goto L_0x007f
        L_0x007d:
            r1 = 0
            goto L_0x0080
        L_0x007f:
            r1 = 1
        L_0x0080:
            com.google.common.f.e r2 = f234771a
            com.google.common.f.x r5 = r2.mo56224b()
            com.google.common.f.aa r6 = com.google.common.p4526f.p4527a.C58975e.f156826a
            java.lang.String r7 = "MicroDetectionState"
            r5.mo56378ag(r6, r7)
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r1)
            r8 = 9200(0x23f0, float:1.2892E-41)
            java.lang.String r9 = "Should stop hotword detection immediately - %b"
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r5).mo56372aa(r8)).mo56389s(r9, r6)
            boolean r5 = r10.f234775G
            if (r5 == 0) goto L_0x00a0
            if (r1 != 0) goto L_0x00a0
            r5 = 1
            goto L_0x00a1
        L_0x00a0:
            r5 = 0
        L_0x00a1:
            boolean r6 = r10.f234798l
            if (r6 != 0) goto L_0x0186
            if (r1 != 0) goto L_0x0186
            if (r11 != 0) goto L_0x0186
            dagger.a r11 = r10.f234802p
            java.lang.Object r11 = r11.mo27525b()
            com.google.android.apps.gsa.search.core.state.d.n r11 = (com.google.android.apps.gsa.search.core.state.p6872d.C86962n) r11
            int r11 = r11.f234890c
            dagger.a r1 = r10.f234802p
            java.lang.Object r1 = r1.mo27525b()
            com.google.android.apps.gsa.search.core.state.d.n r1 = (com.google.android.apps.gsa.search.core.state.p6872d.C86962n) r1
            boolean r1 = r1.f234888a
            if (r1 == 0) goto L_0x00c6
            if (r11 == r4) goto L_0x0186
            r1 = 3
            if (r11 != r1) goto L_0x00c6
            goto L_0x0186
        L_0x00c6:
            boolean r11 = r10.mo80490C()
            if (r11 == 0) goto L_0x0186
            if (r5 != 0) goto L_0x00da
            boolean r11 = r10.mo80584L()
            if (r11 == 0) goto L_0x0186
            boolean r11 = r10.mo80586N()
            if (r11 == 0) goto L_0x0186
        L_0x00da:
            boolean r11 = r10.f234775G
            if (r11 == 0) goto L_0x00e4
            boolean r11 = r0.mo87303e()
            goto L_0x019b
        L_0x00e4:
            com.google.android.apps.gsa.shared.util.BitFlags r11 = r10.f234791e
            r4 = 12
            boolean r11 = r11.mo85052e(r4)
            if (r11 != 0) goto L_0x013a
            boolean r11 = r10.f234780N
            if (r11 != 0) goto L_0x013a
            r10.mo80583K()
            com.google.android.apps.gsa.search.core.i.t r11 = r10.f234789c
            com.google.android.apps.gsa.shared.m.d r1 = com.google.android.apps.gsa.shared.p7066m.C90120fr.f250857x
            boolean r11 = r11.mo79746e(r1)
            if (r11 == 0) goto L_0x013a
            dagger.a r11 = r10.f234788b
            java.lang.Object r11 = r11.mo27525b()
            com.google.android.apps.gsa.shared.m.b.f r11 = (com.google.android.apps.gsa.shared.p7066m.p7068b.C89994f) r11
            boolean r11 = r11.mo83819h()
            if (r11 == 0) goto L_0x013a
            dagger.a r11 = r10.f234788b
            java.lang.Object r11 = r11.mo27525b()
            com.google.android.apps.gsa.shared.m.b.f r11 = (com.google.android.apps.gsa.shared.p7066m.p7068b.C89994f) r11
            boolean r11 = r11.mo83817f()
            if (r11 == 0) goto L_0x013a
            android.content.SharedPreferences r11 = r10.f234792f
            java.lang.String r1 = "always_on_hotword_suppressed"
            boolean r11 = r11.getBoolean(r1, r3)
            if (r11 != 0) goto L_0x013a
            com.google.common.f.x r11 = r2.mo56224b()
            com.google.common.f.aa r1 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r11.mo56378ag(r1, r7)
            java.lang.String r1 = "Keep running DSP hotword"
            r2 = 9203(0x23f3, float:1.2896E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r11).mo56372aa(r2)).mo56386p(r1)
            boolean r11 = r0.mo87304f()
            goto L_0x019b
        L_0x013a:
            dagger.a r11 = r10.f234788b
            java.lang.Object r11 = r11.mo27525b()
            com.google.android.apps.gsa.shared.m.b.f r11 = (com.google.android.apps.gsa.shared.p7066m.p7068b.C89994f) r11
            com.google.android.apps.gsa.search.core.i.t r1 = r10.f234789c
            com.google.android.apps.gsa.shared.m.d r3 = com.google.android.apps.gsa.shared.p7066m.C90120fr.f250857x
            boolean r1 = r1.mo79746e(r3)
            if (r1 == 0) goto L_0x0181
            com.google.android.apps.gsa.shared.util.BitFlags r1 = r10.f234791e
            boolean r1 = r1.mo85052e(r4)
            if (r1 != 0) goto L_0x0181
            boolean r1 = r10.f234780N
            if (r1 != 0) goto L_0x0181
            boolean r1 = r10.f234778L
            if (r1 != 0) goto L_0x0181
            java.lang.String r1 = r11.mo83882ab()
            boolean r1 = r11.mo83824m(r1)
            if (r1 == 0) goto L_0x0181
            boolean r11 = r11.mo83819h()
            if (r11 == 0) goto L_0x0181
            com.google.common.f.x r11 = r2.mo56224b()
            com.google.common.f.aa r1 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r11.mo56378ag(r1, r7)
            java.lang.String r1 = "Keep running hotword in interactor process"
            r2 = 9202(0x23f2, float:1.2895E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r11).mo56372aa(r2)).mo56386p(r1)
            boolean r11 = r0.mo87304f()
            goto L_0x019b
        L_0x0181:
            boolean r11 = r0.mo87305g()
            goto L_0x019b
        L_0x0186:
            com.google.android.apps.gsa.shared.util.BitFlags r11 = r10.f234791e
            r1 = 1
            r4 = 0
            boolean r11 = r11.mo85049c(r1, r4)
            if (r11 == 0) goto L_0x0197
            com.google.android.apps.gsa.search.core.al.bi.a r11 = r10.f234797k
            r11.mo78544l(r3)
        L_0x0197:
            boolean r11 = r0.mo87304f()
        L_0x019b:
            r10.f234812z = r0
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.search.core.state.p6872d.C86938be.mo80486y(boolean):boolean");
    }

    /* renamed from: z */
    public final void mo80487z() {
        this.f234798l = true;
    }
}
