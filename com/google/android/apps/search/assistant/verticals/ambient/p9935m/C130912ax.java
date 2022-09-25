package com.google.android.apps.search.assistant.verticals.ambient.p9935m;

import android.content.Context;
import android.content.pm.PackageManager;
import android.provider.Settings;
import com.google.android.apps.search.assistant.verticals.ambient.p9953q.p9954a.C131177b;
import com.google.android.apps.search.assistant.verticals.ambient.p9953q.p9957d.p9960c.C131215a;
import com.google.android.libraries.p1635au.C19567d;
import com.google.android.libraries.p1635au.C19569f;
import com.google.android.libraries.search.logging.p3041d.C39141kp;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47638k;
import com.google.assistant.p3886c.C50794cr;
import com.google.assistant.p3886c.C50818do;
import com.google.assistant.p3886c.C50819dp;
import com.google.assistant.p3886c.C50832eb;
import com.google.assistant.p3886c.C50835g;
import com.google.common.base.C58817ah;
import com.google.common.base.C58837ba;
import com.google.common.base.C58869cf;
import com.google.common.p4522b.C58528ij;
import com.google.common.p4522b.C58557jl;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4575r.C60757n;
import com.google.common.p4580v.C60950i;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60887da;
import p3186j$.time.Duration;
import p3186j$.time.Instant;

/* renamed from: com.google.android.apps.search.assistant.verticals.ambient.m.ax */
/* compiled from: PG */
public final class C130912ax implements C130895ag {

    /* renamed from: a */
    public static final C59071e f358209a = C59071e.m91332i("com.google.android.apps.search.assistant.verticals.ambient.m.ax");

    /* renamed from: e */
    private static final C58869cf f358210e = C58869cf.m90937c(C58837ba.m90854c("\\."));

    /* renamed from: f */
    private static final C58528ij f358211f = C58528ij.m90015O("Not trying to bind", "Permission not granted", "Profile not available", "Lost connection to other profile", "No profile available", "Unexpected checked exception", "Could not access other profile", "Synchronous calls can only be used when there is a connection holder", "Cross-profile calls are not supported on this version of Android", "Error when writing result of future", "Error passing bundle for call", "Error fetching bundle for response");

    /* renamed from: b */
    public final C39141kp f358212b;

    /* renamed from: c */
    public final String f358213c;

    /* renamed from: d */
    public final Context f358214d;

    /* renamed from: g */
    private final C60950i f358215g;

    /* renamed from: h */
    private final C60887da f358216h;

    /* renamed from: i */
    private final C131215a f358217i;

    public C130912ax(C39141kp kpVar, String str, C60950i iVar, C131215a aVar, Context context, C60887da daVar) {
        this.f358212b = kpVar;
        this.f358213c = m213350aM(str);
        this.f358215g = iVar;
        this.f358217i = aVar;
        this.f358214d = context;
        this.f358216h = daVar;
    }

    /* renamed from: aL */
    public static String m213349aL(Context context) {
        try {
            return context.getPackageManager().getPackageInfo("com.google.android.as", 0).versionName;
        } catch (PackageManager.NameNotFoundException unused) {
            return "UNKNOWN";
        }
    }

    /* renamed from: aM */
    private static String m213350aM(String str) {
        try {
            C58869cf cfVar = f358210e;
            return String.format("%s.%s", new Object[]{Integer.valueOf(Integer.parseInt((String) C58557jl.m90128i(cfVar.mo56153g(str), 0))), Integer.valueOf(Integer.parseInt((String) C58557jl.m90128i(cfVar.mo56153g(str), 1)))});
        } catch (IndexOutOfBoundsException | NumberFormatException unused) {
            return "UNKNOWN";
        }
    }

    /* renamed from: aN */
    private static String m213351aN(int i) {
        C50832eb ebVar = C50832eb.UNDEFINED;
        int i2 = i - 1;
        if (i2 != 1) {
            return i2 != 2 ? "EXIT" : "ONGOING";
        }
        return "ENTER";
    }

    /* renamed from: A */
    public final void mo109865A() {
        C39141kp kpVar = this.f358212b;
        ((C19567d) kpVar.f102908bm.mo6453a()).mo24822a(1, this.f358213c);
    }

    /* renamed from: B */
    public final void mo109866B(String str, int i, boolean z) {
        C39141kp kpVar = this.f358212b;
        ((C19567d) kpVar.f102912bq.mo6453a()).mo24822a(1, this.f358213c, str, Integer.valueOf(i), Boolean.valueOf(z));
    }

    /* renamed from: C */
    public final void mo109867C(String str) {
        C39141kp kpVar = this.f358212b;
        ((C19567d) kpVar.f102914bs.mo6453a()).mo24822a(1, this.f358213c, str);
    }

    /* renamed from: D */
    public final void mo109868D(String str, String str2, String str3, String str4) {
        C39141kp kpVar = this.f358212b;
        ((C19567d) kpVar.f102917bv.mo6453a()).mo24822a(1, this.f358213c, str, str2, str3, str4);
    }

    /* renamed from: E */
    public final void mo109869E(String str) {
        C39141kp kpVar = this.f358212b;
        ((C19567d) kpVar.f102920by.mo6453a()).mo24822a(1, this.f358213c, str);
    }

    /* renamed from: F */
    public final void mo109870F(String str) {
        C39141kp kpVar = this.f358212b;
        ((C19567d) kpVar.f102921bz.mo6453a()).mo24822a(1, this.f358213c, str);
    }

    /* renamed from: G */
    public final void mo109871G(String str) {
        C39141kp kpVar = this.f358212b;
        ((C19567d) kpVar.f102871bB.mo6453a()).mo24822a(1, this.f358213c, str);
    }

    /* renamed from: H */
    public final void mo109872H(boolean z, String str) {
        ((C19567d) this.f358212b.f102873bD.mo6453a()).mo24822a(1, Boolean.valueOf(z), str);
    }

    /* renamed from: I */
    public final void mo109873I() {
        ((C19567d) this.f358212b.f102874bE.mo6453a()).mo24822a(1, new Object[0]);
    }

    /* renamed from: J */
    public final void mo109874J(String str) {
        ((C19567d) this.f358212b.f102875bF.mo6453a()).mo24822a(1, str);
    }

    /* renamed from: K */
    public final void mo109875K(boolean z) {
        ((C19567d) this.f358212b.f102876bG.mo6453a()).mo24822a(1, Boolean.valueOf(z));
    }

    /* renamed from: L */
    public final void mo109876L(String str) {
        ((C19567d) this.f358212b.f102877bH.mo6453a()).mo24822a(1, str);
    }

    /* renamed from: M */
    public final void mo109877M(boolean z) {
        ((C19567d) this.f358212b.f102894bY.mo6453a()).mo24822a(1, Boolean.valueOf(z));
    }

    /* renamed from: N */
    public final void mo109878N(String str) {
        ((C19567d) this.f358212b.f102950cb.mo6453a()).mo24822a(1, str);
    }

    /* renamed from: O */
    public final void mo109879O(String str) {
        ((C19567d) this.f358212b.f102951cc.mo6453a()).mo24822a(1, str);
    }

    /* renamed from: P */
    public final void mo109880P(String str) {
        C39141kp kpVar = this.f358212b;
        ((C19567d) kpVar.f102953ce.mo6453a()).mo24822a(1, this.f358213c, str);
    }

    /* renamed from: Q */
    public final void mo109881Q(boolean z) {
        C39141kp kpVar = this.f358212b;
        ((C19567d) kpVar.f102954cf.mo6453a()).mo24822a(1, this.f358213c, Boolean.valueOf(z));
    }

    /* renamed from: R */
    public final void mo109882R(int i) {
        ((C19567d) this.f358212b.f102956ch.mo6453a()).mo24822a(1, Integer.valueOf(i));
    }

    /* renamed from: S */
    public final void mo109883S() {
        C39141kp kpVar = this.f358212b;
        ((C19567d) kpVar.f102959ck.mo6453a()).mo24822a(1, this.f358213c);
    }

    /* renamed from: T */
    public final void mo109884T(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6) {
        C39141kp kpVar = this.f358212b;
        ((C19567d) kpVar.f102966cr.mo6453a()).mo24822a(1, Boolean.valueOf(z), Boolean.valueOf(z2), this.f358213c, Boolean.valueOf(z3), Boolean.valueOf(z4), Boolean.valueOf(z5), Boolean.valueOf(z6));
    }

    /* renamed from: U */
    public final void mo109885U(String str) {
        ((C19567d) this.f358212b.f102905bj.mo6453a()).mo24822a(1, str);
    }

    /* renamed from: V */
    public final void mo109886V() {
        ((C19567d) this.f358212b.f102902bg.mo6453a()).mo24822a(1, new Object[0]);
    }

    /* renamed from: W */
    public final void mo109887W(String str) {
        ((C19567d) this.f358212b.f102903bh.mo6453a()).mo24822a(1, str);
    }

    /* renamed from: X */
    public final void mo109888X() {
        ((C19567d) this.f358212b.f102904bi.mo6453a()).mo24822a(1, new Object[0]);
    }

    /* renamed from: Y */
    public final void mo109889Y(C50794cr crVar, String str) {
        C39141kp kpVar = this.f358212b;
        ((C19567d) kpVar.f102960cl.mo6453a()).mo24822a(1, this.f358213c, "UNDEF", crVar.name(), str);
        if (crVar == C50794cr.TIPS) {
            this.f358212b.mo41704s("UPDATE_ACTION_FOR_DATA_TYPE_100002_CLIENT_TYPE_23");
        } else if (crVar == C50794cr.CALENDAR) {
            this.f358212b.mo41704s("UPDATE_ACTION_FOR_DATA_TYPE_100003_CLIENT_TYPE_23");
        } else if (crVar == C50794cr.WEATHER) {
            this.f358212b.mo41704s("UPDATE_ACTION_FOR_DATA_TYPE_1_CLIENT_TYPE_23");
        }
    }

    /* renamed from: Z */
    public final void mo109890Z(C50794cr crVar) {
        C39141kp kpVar = this.f358212b;
        ((C19567d) kpVar.f102911bp.mo6453a()).mo24822a(1, this.f358213c, "UNDEF", crVar.name());
    }

    /* renamed from: a */
    public final C60870cx mo109891a() {
        return C47638k.m84751b(this.f358217i.mo110117a(new C130901am(this)), this.f358217i.mo110117a(new C130900al(this)), this.f358217i.mo110117a(new C130907as(this)), this.f358217i.mo110117a(new C130903ao(this)), this.f358217i.mo110117a(new C130902an(this)), this.f358217i.mo110117a(new C130898aj(this)), this.f358217i.mo110117a(new C130896ah(this))).mo51520a(C130904ap.f358197a, this.f358216h);
    }

    /* renamed from: aA */
    public final void mo109892aA(Duration duration, String str) {
        Object[] objArr = {str};
        ((C19569f) this.f358212b.f102872bC.mo6453a()).mo24824b((double) duration.toMillis(), objArr);
    }

    /* renamed from: aB */
    public final void mo109893aB(long j, String str) {
        ((C19569f) this.f358212b.f102870bA.mo6453a()).mo24824b((double) j, str);
    }

    /* renamed from: aC */
    public final void mo109894aC(long j) {
        C39141kp kpVar = this.f358212b;
        ((C19569f) kpVar.f102928cF.mo6453a()).mo24824b((double) j, this.f358213c);
    }

    /* renamed from: aD */
    public final void mo109895aD(C131177b bVar, String str, int i) {
        C39141kp kpVar = this.f358212b;
        ((C19569f) kpVar.f102961cm.mo6453a()).mo24824b((double) i, this.f358213c, m213349aL(this.f358214d), bVar.name(), str);
    }

    /* renamed from: aE */
    public final void mo109896aE(boolean z, boolean z2, boolean z3, boolean z4, Instant instant, long j) {
        long hours = Duration.between(instant, this.f358215g.mo57444a()).toHours();
        if (hours < 0) {
            hours = -1;
        }
        if (hours > 24) {
            hours = 24;
        }
        ((C19569f) this.f358212b.f102931cI.mo6453a()).mo24824b((double) j, this.f358213c, Boolean.valueOf(z), Boolean.valueOf(z2), Boolean.valueOf(z3), Boolean.valueOf(z4), Integer.valueOf((int) hours));
    }

    /* renamed from: aF */
    public final void mo109897aF(int i, Duration duration, boolean z, boolean z2) {
        C39141kp kpVar = this.f358212b;
        ((C19569f) kpVar.f102930cH.mo6453a()).mo24824b((double) i, Integer.valueOf((int) duration.toHours()), Boolean.valueOf(z), Boolean.valueOf(z2));
    }

    /* renamed from: aG */
    public final void mo109898aG() {
        C39141kp kpVar = this.f358212b;
        ((C19567d) kpVar.f102900be.mo6453a()).mo24822a(1, this.f358213c, "DUPLICATE_TTL_MERGED_WITH_CALENDAR_CARD");
    }

    /* renamed from: aH */
    public final void mo109899aH(String str, Duration duration) {
        int i;
        try {
            i = Settings.Secure.getInt(this.f358214d.getContentResolver(), "doze_always_on");
        } catch (Settings.SettingNotFoundException e) {
            ((C59052c) ((C59052c) f358209a.mo56226d()).mo56372aa(39008)).mo56389s("AOD setting not found %s", e.getMessage());
            i = -1;
        }
        C39141kp kpVar = this.f358212b;
        long millis = duration.toMillis();
        ((C19569f) kpVar.f102901bf.mo6453a()).mo24824b((double) millis, this.f358213c, "blue_chip_tng", str, Integer.valueOf(i), "PCP");
    }

    /* renamed from: aI */
    public final void mo109900aI(int i, int i2) {
        boolean z = false;
        this.f358212b.mo41667A(this.f358213c, C50835g.m85969a(i), Math.min(10, i2), false);
        if (i2 > 0) {
            z = true;
        }
        this.f358217i.mo110117a(new C130908at(i, z));
    }

    /* renamed from: aJ */
    public final void mo109901aJ(long j, int i) {
        C39141kp kpVar = this.f358212b;
        ((C19569f) kpVar.f102909bn.mo6453a()).mo24824b((double) j, this.f358213c, m213351aN(i));
    }

    /* renamed from: aK */
    public final void mo109902aK(long j, int i) {
        C39141kp kpVar = this.f358212b;
        ((C19569f) kpVar.f102910bo.mo6453a()).mo24824b((double) j, this.f358213c, m213351aN(i));
    }

    /* renamed from: aa */
    public final void mo109903aa(boolean z) {
        ((C19567d) this.f358212b.f102934cL.mo6453a()).mo24822a(1, Boolean.valueOf(z));
    }

    /* renamed from: ab */
    public final void mo109904ab() {
        ((C19567d) this.f358212b.f102929cG.mo6453a()).mo24822a(1, new Object[0]);
    }

    /* renamed from: ac */
    public final void mo109905ac() {
        ((C19567d) this.f358212b.f102933cK.mo6453a()).mo24822a(1, new Object[0]);
    }

    /* renamed from: ad */
    public final void mo109906ad(boolean z, boolean z2, boolean z3, boolean z4) {
        C39141kp kpVar = this.f358212b;
        ((C19567d) kpVar.f102967cs.mo6453a()).mo24822a(1, this.f358213c, Boolean.valueOf(z), Boolean.valueOf(z2), Boolean.valueOf(z3), Boolean.valueOf(z4));
    }

    /* renamed from: ae */
    public final void mo109907ae(int i) {
        ((C19567d) this.f358212b.f102974cz.mo6453a()).mo24822a(1, Integer.valueOf(i));
    }

    /* renamed from: af */
    public final void mo109908af(int i) {
        ((C19567d) this.f358212b.f102924cB.mo6453a()).mo24822a(1, Integer.valueOf(i));
    }

    /* renamed from: ag */
    public final void mo109909ag() {
        ((C19567d) this.f358212b.f102927cE.mo6453a()).mo24822a(1, new Object[0]);
    }

    /* renamed from: ah */
    public final void mo109910ah(boolean z) {
        C39141kp kpVar = this.f358212b;
        ((C19567d) kpVar.f102932cJ.mo6453a()).mo24822a(1, this.f358213c, Boolean.valueOf(z));
    }

    /* renamed from: ai */
    public final void mo109911ai(boolean z, boolean z2) {
        ((C19567d) this.f358212b.f102937cO.mo6453a()).mo24822a(1, Boolean.valueOf(z), Boolean.valueOf(z2));
    }

    /* renamed from: aj */
    public final void mo109912aj(boolean z, int i) {
        ((C19567d) this.f358212b.f102935cM.mo6453a()).mo24822a(1, Boolean.valueOf(z), Integer.valueOf(i));
    }

    /* renamed from: ak */
    public final void mo109913ak(String str, boolean z, String str2) {
        ((C19567d) this.f358212b.f102936cN.mo6453a()).mo24822a(1, str, Boolean.valueOf(z), str2);
    }

    /* renamed from: al */
    public final void mo109914al(long j, boolean z, boolean z2) {
        int i;
        try {
            i = Settings.Secure.getInt(this.f358214d.getContentResolver(), "doze_always_on");
        } catch (Settings.SettingNotFoundException e) {
            ((C59052c) ((C59052c) f358209a.mo56226d()).mo56372aa(39006)).mo56389s("AOD setting not found %s", e.getMessage());
            i = -1;
        }
        ((C19569f) this.f358212b.f102898bc.mo6453a()).mo24824b((double) j, Boolean.valueOf(z), Integer.valueOf(i), Boolean.valueOf(z2));
    }

    /* renamed from: am */
    public final void mo109915am(C50819dp dpVar, String str) {
        int i = 0;
        for (C50818do doVar : dpVar.f132332a) {
            C50794cr a = C50794cr.m85938a(doVar.f132315l);
            if (a == null) {
                a = C50794cr.UNDEFINED;
            }
            if (a != C50794cr.UNDEFINED) {
                i++;
            }
        }
        ((C19569f) this.f358212b.f102897bb.mo6453a()).mo24824b((double) i, new Object[0]);
        for (C50818do doVar2 : dpVar.f132332a) {
            C50794cr a2 = C50794cr.m85938a(doVar2.f132315l);
            if (a2 == null) {
                a2 = C50794cr.UNDEFINED;
            }
            this.f358212b.mo41670D(this.f358213c, a2.name(), false, str);
            this.f358217i.mo110117a(new C130905aq(a2));
        }
    }

    /* renamed from: an */
    public final void mo109916an(String str, C131177b bVar, String str2) {
        String str3 = str;
        this.f358212b.mo41671E(this.f358213c, m213349aL(this.f358214d), str3, bVar.name(), false, Settings.Secure.getInt(this.f358214d.getContentResolver(), "content_capture_enabled", -1), str2);
        this.f358217i.mo110117a(new C130906ar(bVar, str2));
    }

    /* renamed from: ao */
    public final void mo109917ao(String str) {
        C39141kp kpVar = this.f358212b;
        ((C19567d) kpVar.f102899bd.mo6453a()).mo24822a(1, this.f358213c, str);
    }

    /* renamed from: ap */
    public final void mo109918ap(Duration duration, String str) {
        Object[] objArr = {str};
        ((C19569f) this.f358212b.f102881bL.mo6453a()).mo24824b((double) duration.toHours(), objArr);
    }

    /* renamed from: aq */
    public final void mo109919aq(Duration duration) {
        ((C19569f) this.f358212b.f102884bO.mo6453a()).mo24824b((double) duration.toHours(), new Object[0]);
    }

    /* renamed from: ar */
    public final void mo109920ar(double d, double d2, double d3, String str) {
        this.f358212b.mo41681O(d, "FIRST", str);
        this.f358212b.mo41681O(d2, "SECOND", str);
        this.f358212b.mo41681O(d3, "THIRD", str);
    }

    /* renamed from: as */
    public final void mo109921as(long j) {
        C39141kp kpVar = this.f358212b;
        ((C19569f) kpVar.f102963co.mo6453a()).mo24824b((double) j, this.f358213c);
    }

    /* renamed from: at */
    public final void mo109922at(long j) {
        C39141kp kpVar = this.f358212b;
        ((C19569f) kpVar.f102957ci.mo6453a()).mo24824b((double) j, this.f358213c);
    }

    /* renamed from: au */
    public final void mo109923au(long j, boolean z) {
        C39141kp kpVar = this.f358212b;
        ((C19569f) kpVar.f102958cj.mo6453a()).mo24824b((double) j, Boolean.valueOf(z), this.f358213c);
    }

    /* renamed from: av */
    public final void mo109924av(Duration duration) {
        ((C19569f) this.f358212b.f102913br.mo6453a()).mo24824b((double) duration.toSeconds(), new Object[0]);
    }

    /* renamed from: aw */
    public final void mo109925aw(Duration duration) {
        ((C19569f) this.f358212b.f102915bt.mo6453a()).mo24824b((double) duration.toSeconds(), new Object[0]);
    }

    /* renamed from: ax */
    public final void mo109926ax(Duration duration, String str, String str2, String str3) {
        Object[] objArr = {str, str2, str3};
        ((C19569f) this.f358212b.f102916bu.mo6453a()).mo24824b((double) duration.toSeconds(), objArr);
    }

    /* renamed from: ay */
    public final void mo109927ay(Duration duration) {
        ((C19569f) this.f358212b.f102918bw.mo6453a()).mo24824b((double) duration.toSeconds(), new Object[0]);
    }

    /* renamed from: az */
    public final void mo109928az(double d) {
        ((C19569f) this.f358212b.f102919bx.mo6453a()).mo24824b(d, new Object[0]);
    }

    /* renamed from: b */
    public final void mo109929b(int i, String str) {
        ((C19567d) this.f358212b.f102968ct.mo6453a()).mo24822a(1, Integer.valueOf(i), str);
    }

    /* renamed from: c */
    public final void mo109930c(int i) {
        ((C19567d) this.f358212b.f102969cu.mo6453a()).mo24822a(1, Integer.valueOf(i));
    }

    /* renamed from: d */
    public final void mo109931d(int i, Duration duration) {
        C39141kp kpVar = this.f358212b;
        ((C19567d) kpVar.f102970cv.mo6453a()).mo24822a(1, Integer.valueOf(i), Integer.valueOf((int) duration.toHours()));
    }

    /* renamed from: e */
    public final void mo109932e(int i) {
        ((C19567d) this.f358212b.f102972cx.mo6453a()).mo24822a(1, Integer.valueOf(i));
    }

    /* renamed from: f */
    public final void mo109933f() {
        ((C19567d) this.f358212b.f102971cw.mo6453a()).mo24822a(1, new Object[0]);
    }

    /* renamed from: g */
    public final void mo109934g(int i, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        ((C19567d) this.f358212b.f102973cy.mo6453a()).mo24822a(1, Integer.valueOf(i), Boolean.valueOf(z), Boolean.valueOf(z2), Boolean.valueOf(z3), Boolean.valueOf(z4), Boolean.valueOf(z5));
    }

    /* renamed from: h */
    public final void mo109935h(int i) {
        ((C19567d) this.f358212b.f102923cA.mo6453a()).mo24822a(1, Integer.valueOf(i));
    }

    /* renamed from: i */
    public final void mo109936i(Duration duration) {
        C39141kp kpVar = this.f358212b;
        ((C19567d) kpVar.f102878bI.mo6453a()).mo24822a(1, this.f358213c, Integer.valueOf(C60757n.m92748i(Math.min(duration.toDays(), 50))));
    }

    /* renamed from: j */
    public final void mo109937j(int i, int i2) {
        this.f358212b.mo41695j(this.f358213c, Math.min(10, i), Math.min(10, i2), false);
        this.f358217i.mo110117a(new C130909au(i, i2));
    }

    /* renamed from: k */
    public final void mo109938k(String str, boolean z) {
        C39141kp kpVar = this.f358212b;
        ((C19567d) kpVar.f102879bJ.mo6453a()).mo24822a(1, this.f358213c, str, Boolean.valueOf(z));
        this.f358217i.mo110117a(new C130910av(str, z));
    }

    /* renamed from: l */
    public final void mo109939l(boolean z) {
        ((C19567d) this.f358212b.f102895bZ.mo6453a()).mo24822a(1, Boolean.valueOf(z));
    }

    /* renamed from: m */
    public final void mo109940m(String str) {
        ((C19567d) this.f358212b.f102949ca.mo6453a()).mo24822a(1, str);
    }

    /* renamed from: n */
    public final void mo109941n() {
        ((C19567d) this.f358212b.f102925cC.mo6453a()).mo24822a(1, new Object[0]);
    }

    /* renamed from: o */
    public final void mo109942o(boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        ((C19567d) this.f358212b.f102926cD.mo6453a()).mo24822a(1, Boolean.valueOf(z), Boolean.valueOf(z2), Boolean.valueOf(z3), Boolean.valueOf(z4), Boolean.valueOf(z5));
    }

    /* renamed from: p */
    public final void mo109943p(C50794cr crVar, String str) {
        C39141kp kpVar = this.f358212b;
        ((C19567d) kpVar.f102952cd.mo6453a()).mo24822a(1, this.f358213c, "UNDEF", crVar.name(), str);
        if (crVar == C50794cr.TIPS) {
            this.f358212b.mo41704s("IMPRESSION_FOR_DATA_TYPE_100002_CLIENT_TYPE_23");
        } else if (crVar == C50794cr.CALENDAR) {
            this.f358212b.mo41704s("IMPRESSION_FOR_DATA_TYPE_100003_CLIENT_TYPE_23");
        } else if (crVar == C50794cr.WEATHER) {
            this.f358212b.mo41704s("IMPRESSION_FOR_DATA_TYPE_1_CLIENT_TYPE_23");
        }
    }

    /* renamed from: q */
    public final void mo109944q() {
        this.f358212b.mo41673G(this.f358213c, "error", false);
        this.f358217i.mo110117a(C130899ak.f358192a);
    }

    /* renamed from: r */
    public final void mo109945r(boolean z, boolean z2) {
        C58817ah ahVar;
        this.f358212b.mo41674H(this.f358213c, true != z ? "CSL" : "FLP", true != z2 ? "background" : "foreground", false);
        if (z && z2) {
            ahVar = C130911aw.f358208a;
        } else if (z || z2) {
            ((C59052c) ((C59052c) f358209a.mo56226d()).mo56372aa(39007)).mo56358K("Combination isFlp %s, isForeground %s not supported", z, z2);
            return;
        } else {
            ahVar = C130897ai.f358190a;
        }
        this.f358217i.mo110117a(ahVar);
    }

    /* renamed from: s */
    public final void mo109946s(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7) {
        ((C19567d) this.f358212b.f102888bS.mo6453a()).mo24822a(1, Boolean.valueOf(z), Boolean.valueOf(z2), Boolean.valueOf(z3), Boolean.valueOf(z4), Boolean.valueOf(z5), Boolean.valueOf(z6), Boolean.valueOf(z7));
    }

    /* renamed from: t */
    public final void mo109947t(boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        ((C19567d) this.f358212b.f102887bR.mo6453a()).mo24822a(1, Boolean.valueOf(z), Boolean.valueOf(z2), Boolean.valueOf(z3), Boolean.valueOf(z4), Boolean.valueOf(z5));
    }

    /* renamed from: u */
    public final void mo109948u() {
        C39141kp kpVar = this.f358212b;
        ((C19567d) kpVar.f102896ba.mo6453a()).mo24822a(1, this.f358213c);
    }

    /* renamed from: v */
    public final void mo109949v(String str) {
        ((C19567d) this.f358212b.f102962cn.mo6453a()).mo24822a(1, str);
    }

    /* renamed from: w */
    public final void mo109950w() {
        C39141kp kpVar = this.f358212b;
        ((C19567d) kpVar.f102964cp.mo6453a()).mo24822a(1, this.f358213c);
    }

    /* renamed from: x */
    public final void mo109951x(String str) {
        ((C19567d) this.f358212b.f102965cq.mo6453a()).mo24822a(1, str);
    }

    /* renamed from: y */
    public final void mo109952y(String str, String str2, String str3) {
        C39141kp kpVar = this.f358212b;
        ((C19567d) kpVar.f102906bk.mo6453a()).mo24822a(1, this.f358213c, str, str2, str3);
    }

    /* renamed from: z */
    public final void mo109953z(String str) {
        if (true != f358211f.contains(str)) {
            str = "Unknown reason";
        }
        C39141kp kpVar = this.f358212b;
        ((C19567d) kpVar.f102907bl.mo6453a()).mo24822a(1, this.f358213c, str);
    }
}
