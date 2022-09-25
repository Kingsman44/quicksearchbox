package com.google.android.apps.gsa.assistant.settings.devices.bisto;

import android.accounts.Account;
import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import androidx.preference.C4023s;
import androidx.preference.EditTextPreference;
import androidx.preference.Preference;
import androidx.preference.PreferenceCategory;
import androidx.preference.SwitchPreferenceCompat;
import com.google.android.apps.gsa.assistant.handoff.AssistantHandoffActivity;
import com.google.android.apps.gsa.assistant.p510b.p511a.C9439b;
import com.google.android.apps.gsa.assistant.settings.devices.shared.C9730c;
import com.google.android.apps.gsa.assistant.settings.shared.ImageHeader;
import com.google.android.apps.gsa.h.s.aa;
import com.google.android.apps.gsa.h.s.ac;
import com.google.android.apps.gsa.h.s.af;
import com.google.android.apps.gsa.h.s.q;
import com.google.android.apps.gsa.h.s.s;
import com.google.android.apps.gsa.p5855h.p5861s.C74542ab;
import com.google.android.apps.gsa.p5855h.p5861s.C74543ad;
import com.google.android.apps.gsa.p5855h.p5861s.C74544ae;
import com.google.android.apps.gsa.p5855h.p5861s.C74553r;
import com.google.android.apps.gsa.p5855h.p5861s.C74554t;
import com.google.android.apps.gsa.p5855h.p5861s.C74555u;
import com.google.android.apps.gsa.search.core.google.gaia.C86054o;
import com.google.android.apps.gsa.search.shared.service.C88489j;
import com.google.android.apps.gsa.search.shared.service.p6935b.C87739bu;
import com.google.android.apps.gsa.search.shared.service.p6940d.C88483e;
import com.google.android.apps.gsa.shared.bisto.C89651f;
import com.google.android.apps.gsa.shared.bisto.C89656k;
import com.google.android.apps.gsa.shared.bisto.p7028a.C89492cd;
import com.google.android.apps.gsa.shared.bisto.p7028a.C89495cg;
import com.google.android.apps.gsa.shared.bisto.p7029b.C89635f;
import com.google.android.apps.gsa.shared.bisto.p7029b.C89636g;
import com.google.android.apps.gsa.shared.bisto.p7029b.C89637h;
import com.google.android.apps.gsa.shared.bisto.p7029b.C89638i;
import com.google.android.apps.gsa.shared.bisto.p7029b.C89643n;
import com.google.android.apps.gsa.shared.p7066m.C90021c;
import com.google.android.apps.gsa.shared.p7066m.C90122ft;
import com.google.android.apps.gsa.shared.p7129r.C90465g;
import com.google.android.apps.gsa.shared.util.C90732ap;
import com.google.android.apps.gsa.shared.util.p7159c.C90873ag;
import com.google.android.apps.gsa.shared.util.p7184t.C91097g;
import com.google.android.apps.gsa.shared.util.p7188v.C91142g;
import com.google.android.apps.search.assistant.surfaces.bisto.p9384a.p9386b.C124521b;
import com.google.android.apps.search.assistant.surfaces.bisto.p9384a.p9386b.C124525f;
import com.google.android.apps.search.assistant.surfaces.bisto.p9384a.p9386b.C124526g;
import com.google.android.apps.search.assistant.surfaces.bisto.p9384a.p9386b.C124528i;
import com.google.android.apps.search.assistant.surfaces.bisto.p9390c.p9392b.C124548d;
import com.google.android.apps.search.assistant.surfaces.bisto.p9390c.p9392b.C124551g;
import com.google.android.apps.search.assistant.surfaces.bisto.p9390c.p9392b.p9393a.C124542a;
import com.google.android.apps.search.assistant.surfaces.bisto.p9403d.C124613af;
import com.google.android.apps.search.assistant.surfaces.bisto.p9403d.C124629av;
import com.google.android.apps.search.assistant.surfaces.bisto.p9403d.C124633az;
import com.google.android.apps.search.assistant.surfaces.bisto.p9403d.C124636bb;
import com.google.android.apps.search.assistant.surfaces.bisto.p9403d.C124646bl;
import com.google.android.apps.search.assistant.surfaces.bisto.p9403d.C124650bp;
import com.google.android.apps.search.assistant.surfaces.bisto.p9403d.C124657bw;
import com.google.android.apps.search.assistant.surfaces.bisto.p9403d.C124707e;
import com.google.android.apps.search.assistant.surfaces.bisto.p9403d.C124711i;
import com.google.android.apps.search.assistant.surfaces.bisto.p9403d.C124715m;
import com.google.android.apps.search.assistant.surfaces.bisto.p9403d.C124719q;
import com.google.android.apps.search.assistant.surfaces.bisto.p9403d.C124721s;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.assistant.p1535p.C18509a;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.android.libraries.search.assistant.p2786t.p2801d.p2802a.C36619a;
import com.google.android.p10712d.C142320az;
import com.google.android.p10712d.C142324bc;
import com.google.android.p10712d.C142328bg;
import com.google.android.p10712d.C142340bs;
import com.google.android.p10712d.C142346by;
import com.google.android.p10712d.C142355cg;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.base.C58837ba;
import com.google.common.p4522b.C58495hd;
import com.google.common.p4522b.C58528ij;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.p4552o.C60105ky;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import dagger.C68214a;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CancellationException;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.apps.gsa.assistant.settings.devices.bisto.ck */
/* compiled from: PG */
public final class C9619ck extends C9730c implements C4023s, C89495cg {

    /* renamed from: i */
    public static final C59071e f33236i = C59071e.m91332i("com.google.android.apps.gsa.assistant.settings.devices.bisto.ck");

    /* renamed from: A */
    public C60870cx f33237A;

    /* renamed from: B */
    public C60870cx f33238B;

    /* renamed from: C */
    public final C89635f f33239C;

    /* renamed from: D */
    public boolean f33240D = false;

    /* renamed from: E */
    private final C91142g f33241E;

    /* renamed from: F */
    private final C68214a f33242F;

    /* renamed from: G */
    private final C88483e f33243G;

    /* renamed from: H */
    private final C69464a f33244H;

    /* renamed from: I */
    private SwitchPreferenceCompat f33245I;

    /* renamed from: J */
    private PreferenceCategory f33246J;

    /* renamed from: K */
    private Preference f33247K;

    /* renamed from: L */
    private Preference f33248L;

    /* renamed from: M */
    private Preference f33249M;

    /* renamed from: N */
    private Preference f33250N;

    /* renamed from: O */
    private Preference f33251O;

    /* renamed from: P */
    private Preference f33252P;

    /* renamed from: Q */
    private Preference f33253Q;

    /* renamed from: R */
    private ImageHeader f33254R;

    /* renamed from: S */
    private Preference f33255S;

    /* renamed from: T */
    private Preference f33256T;

    /* renamed from: U */
    private Preference f33257U;

    /* renamed from: V */
    private Preference f33258V;

    /* renamed from: W */
    private Preference f33259W;

    /* renamed from: X */
    private Preference f33260X;

    /* renamed from: Y */
    private Preference f33261Y;

    /* renamed from: Z */
    private SwitchPreferenceCompat f33262Z;

    /* renamed from: aa */
    private SwitchPreferenceCompat f33263aa;

    /* renamed from: ab */
    private VoiceMatchSwitchPreferences f33264ab;

    /* renamed from: ac */
    private SwitchPreferenceCompat f33265ac;

    /* renamed from: ad */
    private VoiceMatchLearnMorePreferencesBase f33266ad;

    /* renamed from: ae */
    private Preference f33267ae;

    /* renamed from: af */
    private Preference f33268af;

    /* renamed from: ag */
    private Preference f33269ag;

    /* renamed from: ah */
    private Preference f33270ah;

    /* renamed from: ai */
    private Preference f33271ai;

    /* renamed from: aj */
    private EditTextPreference f33272aj;

    /* renamed from: ak */
    private C60870cx f33273ak;

    /* renamed from: al */
    private String f33274al;

    /* renamed from: am */
    private boolean f33275am = false;

    /* renamed from: j */
    public final C90465g f33276j;

    /* renamed from: k */
    public final C89492cd f33277k;

    /* renamed from: l */
    public final C22871g f33278l;

    /* renamed from: m */
    public final C124528i f33279m;

    /* renamed from: n */
    public final C90021c f33280n;

    /* renamed from: o */
    public final C86054o f33281o;

    /* renamed from: p */
    public final C68214a f33282p;

    /* renamed from: q */
    public PersonalResultsSwitchPreference f33283q;

    /* renamed from: r */
    public final C89656k f33284r;

    /* renamed from: s */
    public final Handler f33285s = new Handler(Looper.getMainLooper());

    /* renamed from: t */
    public String f33286t;

    /* renamed from: u */
    public BroadcastReceiver f33287u;

    /* renamed from: v */
    public Runnable f33288v;

    /* renamed from: w */
    public boolean f33289w;

    /* renamed from: x */
    public C124548d f33290x;

    /* renamed from: y */
    public C142324bc f33291y = C142324bc.f386113s;

    /* renamed from: z */
    public int f33292z = 1;

    public C9619ck(C88483e eVar, C89492cd cdVar, C91142g gVar, C68214a aVar, C90465g gVar2, String str, C22871g gVar3, C69464a aVar2, C89656k kVar, C124528i iVar, C90021c cVar, C86054o oVar, C89635f fVar, C68214a aVar3) {
        this.f33243G = eVar;
        this.f33277k = cdVar;
        this.f33241E = gVar;
        this.f33242F = aVar;
        this.f33286t = str;
        this.f33276j = gVar2;
        this.f33278l = gVar3;
        this.f33244H = aVar2;
        this.f33284r = kVar;
        this.f33279m = iVar;
        this.f33280n = cVar;
        this.f33290x = C124542a.m204020a();
        this.f33281o = oVar;
        this.f33239C = fVar;
        this.f33282p = aVar3;
    }

    /* renamed from: R */
    public static boolean m24301R(C124548d dVar) {
        if ("wired".equals(dVar.mo106475P())) {
            C58976aa aaVar = C58975e.f156826a;
            return false;
        } else if (!C124633az.OOBE_FINISHED.equals(dVar.mo106520r())) {
            C58976aa aaVar2 = C58975e.f156826a;
            return true;
        } else if (C124636bb.OPA_ENABLED.equals(dVar.mo106521s())) {
            return false;
        } else {
            C58976aa aaVar3 = C58975e.f156826a;
            return true;
        }
    }

    /* renamed from: U */
    private static C58833ax m24302U(C142324bc bcVar) {
        C142346by byVar = bcVar.f386120f;
        if (byVar == null) {
            byVar = C142346by.f386219m;
        }
        C142328bg bgVar = byVar.f386222b;
        if (bgVar == null) {
            bgVar = C142328bg.f386139f;
        }
        if (bgVar.f386142b.size() == 0) {
            return C58836b.f156633a;
        }
        if ((bgVar.f386141a & 1) != 0) {
            return C58833ax.m90834k(bgVar);
        }
        C59104x c = f33236i.mo56225c();
        c.mo56378ag(C58975e.f156826a, "DevIdBistoSCntrl");
        ((C59052c) ((C59052c) c).mo56372aa(372)).mo56386p("Hero image contains images, but lacks image description");
        return C58836b.f156633a;
    }

    /* renamed from: V */
    private final void m24303V(PreferenceCategory preferenceCategory, Map map, Context context) {
        for (String str : ((C58495hd) map).keySet()) {
            C89637h hVar = (C89637h) map.get(str);
            SwitchPreferenceCompat switchPreferenceCompat = new SwitchPreferenceCompat(context);
            switchPreferenceCompat.mo8343J(str);
            switchPreferenceCompat.mo8347N(hVar.mo83509b());
            switchPreferenceCompat.mo8329n(hVar.mo83508a());
            switchPreferenceCompat.mo8391j(this.f33241E.mo85406k(str, false));
            switchPreferenceCompat.f12742n = this;
            preferenceCategory.mo8379af(switchPreferenceCompat);
        }
    }

    /* renamed from: W */
    private final void m24304W() {
        C89651f.m145940a(this.f33243G, new C88489j(C87739bu.BISTO_STARTUP_PREF_CHANGED).mo82013a());
    }

    /* renamed from: X */
    private static void m24305X(Preference preference, Runnable runnable) {
        preference.f12743o = new C9584bc(runnable);
    }

    /* renamed from: Y */
    private final void m24306Y() {
        String str;
        if (this.f33254R != null && !this.f33291y.equals(C142324bc.f386113s)) {
            C142346by byVar = this.f33291y.f386120f;
            if (byVar == null) {
                byVar = C142346by.f386219m;
            }
            if (!byVar.f386232l) {
                ImageHeader imageHeader = this.f33254R;
                C124548d dVar = this.f33290x;
                C58833ax U = m24302U(this.f33291y);
                String str2 = null;
                if (U.mo56113h()) {
                    str = (String) ((C142328bg) U.mo56107c()).f386142b.get(0);
                } else if (dVar.mo106514l().equals(C124721s.APOLLO)) {
                    int b = dVar.mo106502b();
                    if (!(b == 0 || b == 1)) {
                        if (b == 2) {
                            str = "https://www.gstatic.com/bisto/oobe/b10/header-473082-apollo-white.png";
                        } else if (b != 3) {
                            C58976aa aaVar = C58975e.f156826a;
                        } else {
                            str = "https://www.gstatic.com/bisto/oobe/b10/header-369012-apollo-denim.png";
                        }
                    }
                    str = "https://www.gstatic.com/bisto/oobe/b10/header-173145-apollo-black.png";
                } else {
                    str = null;
                }
                if (str == null || str.equals(this.f33274al)) {
                    imageHeader.mo8348O(true);
                    return;
                }
                this.f33274al = str;
                mo17803n(str, 0, new C9574at(imageHeader));
                C58833ax U2 = m24302U(this.f33291y);
                if (U2.mo56113h()) {
                    C142328bg bgVar = (C142328bg) U2.mo56107c();
                    if ((bgVar.f386141a & 1) != 0) {
                        C142355cg cgVar = bgVar.f386143c;
                        if (cgVar == null) {
                            cgVar = C142355cg.f386263b;
                        }
                        str2 = C124525f.m203989e(cgVar);
                    }
                }
                if (str2 != null) {
                    imageHeader.f195005a = str2;
                    imageHeader.mo8317e();
                }
            }
        }
    }

    /* renamed from: Z */
    private final void m24307Z(Preference preference, String str) {
        if (preference != null) {
            if (str == null) {
                preference.f12749u = null;
                preference.mo8348O(false);
                return;
            }
            preference.f12749u = new Intent(this.f32988d, AssistantHandoffActivity.class).putExtra("uri", str);
            preference.mo8348O(true);
        }
    }

    /* renamed from: aa */
    private final boolean m24308aa() {
        return this.f33290x.mo106514l().equals(C124721s.APOLLO);
    }

    /* renamed from: ab */
    private final boolean m24309ab() {
        return mo17906O() && this.f33290x.mo106497ak();
    }

    /* renamed from: ac */
    private final boolean m24310ac() {
        return this.f33284r.mo83555j(6);
    }

    /* renamed from: G */
    public final void mo17898G() {
        Activity fX = mo17794fX();
        if (fX != null) {
            C18509a aVar = (C18509a) this.f33244H.mo17428b();
            aVar.mo24024f("main_menu");
            fX.startActivityForResult(aVar.mo24020b().mo24031a(), 0);
        }
    }

    /* renamed from: H */
    public final void mo17899H(String str) {
        try {
            Context context = this.f32988d;
            context.startActivity(C90732ap.m148195a(context, str));
        } catch (ActivityNotFoundException e) {
            C59104x d = f33236i.mo56226d();
            d.mo56378ag(C58975e.f156826a, "DevIdBistoSCntrl");
            ((C59052c) ((C59052c) ((C59052c) d).mo56382g(e)).mo56372aa(389)).mo56386p("Failed to launch Play Store");
        }
    }

    /* renamed from: I */
    public final void mo17900I() {
        String str = this.f33286t;
        if (str == null) {
            C58976aa aaVar = C58975e.f156826a;
            mo17898G();
            return;
        }
        C60870cx o = this.f33277k.mo83409o(str);
        String F = this.f33281o.mo79659F();
        if (F != null) {
            o = this.f33278l.mo28206f(o, "check-for-DUSI", C124551g.class, new C9575au(this, F, str));
        }
        C60870cx b = this.f33239C.mo83518b(str);
        C60870cx i = this.f33278l.mo28209i(C60856cj.m92897f(o, b), "updateUi", new C9589bh(this, o, b));
        this.f33273ak = i;
        C90873ag agVar = new C90873ag(i, this.f33278l, "getdeviceinfo", C9590bi.f33198a);
        agVar.mo85224b(C124551g.class, new C9591bj(this));
        agVar.mo85224b(CancellationException.class, C9592bk.f33200a);
        agVar.mo85223a(new C9593bl(this, str));
    }

    /* renamed from: J */
    public final void mo17901J() {
        ac acVar;
        q f = C74553r.m120558f();
        if (m24309ab() && this.f33290x.mo106484Y()) {
            C58976aa aaVar = C58975e.f156826a;
            f.e(true);
            f.f(this.f33240D);
            C142340bs bsVar = this.f33291y.f386119e;
            if (bsVar == null) {
                bsVar = C142340bs.f386174C;
            }
            f.d(bsVar.f386177B);
        }
        C74554t i = C74555u.m120572i();
        i.mo70868b(s.a);
        C74543ad d = C74544ae.m120523d();
        d.mo70851c(af.f);
        d.mo70850b(f.a());
        i.mo70872f(d.mo70849a());
        i.mo70869c(C9439b.BISTO_ONBOARDING);
        aa c = C74542ab.m120516c();
        if (this.f33280n.mo79746e(C90122ft.f250870i)) {
            acVar = ac.b;
        } else {
            acVar = ac.a;
        }
        c.c(acVar);
        i.mo70871e(c.a());
        Intent h = i.mo70882h();
        C91097g f2 = mo17793f();
        if (h != null && f2 != null) {
            f2.mo65090b(h, new C9582ba(this));
        }
    }

    /* renamed from: K */
    public final void mo17902K() {
        VoiceMatchSwitchPreferences voiceMatchSwitchPreferences = this.f33264ab;
        if (voiceMatchSwitchPreferences != null) {
            voiceMatchSwitchPreferences.mo8361ab();
            this.f33264ab.mo8391j(false);
        }
    }

    /* renamed from: L */
    public final void mo17903L() {
        this.f33289w = false;
        Runnable runnable = this.f33288v;
        if (runnable != null) {
            this.f33285s.removeCallbacks(runnable);
            this.f33288v = null;
        }
        BroadcastReceiver broadcastReceiver = this.f33287u;
        if (broadcastReceiver != null) {
            this.f32988d.unregisterReceiver(broadcastReceiver);
            this.f33287u = null;
        }
    }

    /* renamed from: N */
    public final boolean mo17905N() {
        return this.f33290x.mo106512j().equals(C124715m.FULLY_CONNECTED) || this.f33290x.mo106512j().equals(C124715m.DATA_ONLY);
    }

    /* renamed from: O */
    public final boolean mo17906O() {
        return this.f33290x.mo106513k() == C124719q.GACS_DEVICE;
    }

    /* renamed from: P */
    public final boolean mo17907P(String str) {
        Intent launchIntentForPackage = this.f32988d.getPackageManager().getLaunchIntentForPackage(str);
        if (launchIntentForPackage == null) {
            return false;
        }
        launchIntentForPackage.putExtra("key_device_id", this.f33286t);
        try {
            this.f32988d.startActivity(launchIntentForPackage);
            return true;
        } catch (ActivityNotFoundException unused) {
            return false;
        }
    }

    /* renamed from: Q */
    public final boolean mo17908Q() {
        String str = this.f33286t;
        if (str != null) {
            try {
                this.f32988d.startActivity(C89636g.m145895a(this.f32988d, str, this.f33290x.mo106481V(), 0, C60105ky.ANDROID_OOBE_NOTIFICATION_TRADITIONAL));
                return true;
            } catch (ActivityNotFoundException unused) {
            }
        }
        return false;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo8472a(androidx.preference.Preference r11, java.lang.Object r12) {
        /*
            r10 = this;
            java.lang.String r11 = r11.f12748t
            int r0 = r11.hashCode()
            r1 = 5
            r2 = 2
            r3 = 6
            r4 = 3
            r5 = 4
            r6 = 1
            r7 = 0
            switch(r0) {
                case -626042776: goto L_0x004d;
                case -334349812: goto L_0x0043;
                case 227442896: goto L_0x0039;
                case 540547261: goto L_0x002f;
                case 1083715537: goto L_0x0025;
                case 1277492901: goto L_0x001b;
                case 1390221748: goto L_0x0011;
                default: goto L_0x0010;
            }
        L_0x0010:
            goto L_0x0057
        L_0x0011:
            java.lang.String r0 = "bistoStartSound"
            boolean r0 = r11.equals(r0)
            if (r0 == 0) goto L_0x0057
            r0 = 4
            goto L_0x0058
        L_0x001b:
            java.lang.String r0 = "bistoDiagnostics"
            boolean r0 = r11.equals(r0)
            if (r0 == 0) goto L_0x0057
            r0 = 1
            goto L_0x0058
        L_0x0025:
            java.lang.String r0 = "bistoHotwordEnablement"
            boolean r0 = r11.equals(r0)
            if (r0 == 0) goto L_0x0057
            r0 = 5
            goto L_0x0058
        L_0x002f:
            java.lang.String r0 = "bistoScreenLocked"
            boolean r0 = r11.equals(r0)
            if (r0 == 0) goto L_0x0057
            r0 = 2
            goto L_0x0058
        L_0x0039:
            java.lang.String r0 = "bistoCustomQuery"
            boolean r0 = r11.equals(r0)
            if (r0 == 0) goto L_0x0057
            r0 = 6
            goto L_0x0058
        L_0x0043:
            java.lang.String r0 = "bistoHfpOutput"
            boolean r0 = r11.equals(r0)
            if (r0 == 0) goto L_0x0057
            r0 = 3
            goto L_0x0058
        L_0x004d:
            java.lang.String r0 = "bistoOpaEnabled"
            boolean r0 = r11.equals(r0)
            if (r0 == 0) goto L_0x0057
            r0 = 0
            goto L_0x0058
        L_0x0057:
            r0 = -1
        L_0x0058:
            java.lang.String r8 = "Device ID is null"
            java.lang.String r9 = "DevIdBistoSCntrl"
            switch(r0) {
                case 0: goto L_0x02a4;
                case 1: goto L_0x0283;
                case 2: goto L_0x025d;
                case 3: goto L_0x0231;
                case 4: goto L_0x0205;
                case 5: goto L_0x0098;
                case 6: goto L_0x0077;
                default: goto L_0x005f;
            }
        L_0x005f:
            java.lang.Boolean r12 = (java.lang.Boolean) r12
            boolean r12 = r12.booleanValue()
            com.google.common.b.hd r0 = com.google.android.apps.gsa.shared.bisto.p7029b.C89638i.f242713a
            boolean r0 = r0.containsKey(r11)
            if (r0 != 0) goto L_0x030a
            com.google.common.b.hd r0 = com.google.android.apps.gsa.shared.bisto.p7029b.C89638i.f242714b
            boolean r0 = r0.containsKey(r11)
            if (r0 == 0) goto L_0x02f7
            goto L_0x030a
        L_0x0077:
            java.lang.String r12 = (java.lang.String) r12
            com.google.common.f.aa r11 = com.google.common.p4526f.p4527a.C58975e.f156826a
            java.lang.String r11 = r10.f33286t
            if (r11 == 0) goto L_0x0086
            com.google.android.apps.gsa.shared.bisto.a.cd r0 = r10.f33277k
            r0.mo83369K(r11, r12)
            goto L_0x0321
        L_0x0086:
            com.google.common.f.e r11 = f33236i
            com.google.common.f.x r11 = r11.mo56225c()
            com.google.common.f.aa r12 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r11.mo56378ag(r12, r9)
            r12 = 438(0x1b6, float:6.14E-43)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r11).mo56372aa(r12)).mo56386p(r8)
            goto L_0x0321
        L_0x0098:
            java.lang.Boolean r12 = (java.lang.Boolean) r12
            boolean r11 = r12.booleanValue()
            java.lang.String r12 = r10.f33286t
            if (r12 != 0) goto L_0x00b4
            com.google.common.f.e r11 = f33236i
            com.google.common.f.x r11 = r11.mo56225c()
            com.google.common.f.aa r12 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r11.mo56378ag(r12, r9)
            r12 = 436(0x1b4, float:6.11E-43)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r11).mo56372aa(r12)).mo56386p(r8)
            goto L_0x0321
        L_0x00b4:
            com.google.android.apps.gsa.assistant.settings.devices.bisto.VoiceMatchSwitchPreferences r12 = r10.f33264ab
            if (r12 == 0) goto L_0x0321
            com.google.android.apps.gsa.assistant.settings.devices.bisto.VoiceMatchLearnMorePreferencesBase r0 = r10.f33266ad
            if (r0 == 0) goto L_0x0321
            if (r11 != 0) goto L_0x00dc
            r12.mo8391j(r7)
            com.google.android.apps.gsa.shared.bisto.a.cd r11 = r10.f33277k
            java.lang.String r12 = r10.f33286t
            com.google.android.apps.search.assistant.surfaces.bisto.d.ah r0 = com.google.android.apps.search.assistant.surfaces.bisto.p9403d.C124615ah.HOTWORD_CONSENT_SENT
            r11.mo83390af(r12, r0)
            com.google.android.apps.gsa.shared.bisto.a.cd r11 = r10.f33277k
            java.lang.String r12 = r10.f33286t
            r11.mo83374P(r12)
            r10.f33292z = r5
            com.google.android.apps.search.assistant.surfaces.bisto.a.b.i r11 = r10.f33279m
            java.lang.String r12 = r10.f33286t
            r11.mo90176d(r12, r7)
            goto L_0x0321
        L_0x00dc:
            com.google.common.f.e r11 = f33236i
            com.google.common.f.x r12 = r11.mo56224b()
            com.google.common.f.aa r0 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r12.mo56378ag(r0, r9)
            com.google.common.f.c r12 = (com.google.common.p4526f.C59052c) r12
            r0 = 374(0x176, float:5.24E-43)
            com.google.common.f.x r12 = r12.mo56372aa(r0)
            com.google.common.f.c r12 = (com.google.common.p4526f.C59052c) r12
            java.lang.String r0 = "Hotword availability=%d"
            int r8 = r10.f33292z
            r12.mo56387q(r0, r8)
            int r12 = r10.f33292z
            if (r12 == 0) goto L_0x01e5
            if (r12 == r2) goto L_0x017e
            if (r12 == r4) goto L_0x017e
            if (r12 == r5) goto L_0x0154
            if (r12 == r1) goto L_0x012e
            if (r12 == r3) goto L_0x017e
            com.google.common.f.x r11 = r11.mo56225c()
            com.google.common.f.aa r12 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r11.mo56378ag(r12, r9)
            java.lang.String r12 = "Device unsupported, toggle should not be shown in this case."
            r0 = 375(0x177, float:5.25E-43)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r11).mo56372aa(r0)).mo56386p(r12)
            com.google.android.apps.gsa.assistant.settings.devices.bisto.VoiceMatchSwitchPreferences r11 = r10.f33264ab
            r11.mo8361ab()
            com.google.android.apps.gsa.assistant.settings.devices.bisto.VoiceMatchSwitchPreferences r11 = r10.f33264ab
            r11.mo8348O(r7)
            com.google.android.apps.gsa.assistant.settings.devices.bisto.VoiceMatchSwitchPreferences r11 = r10.f33264ab
            r11.mo8391j(r7)
            com.google.android.apps.search.assistant.surfaces.bisto.a.b.i r11 = r10.f33279m
            java.lang.String r12 = r10.f33286t
            r11.mo90176d(r12, r7)
            goto L_0x0321
        L_0x012e:
            com.google.common.f.x r11 = r11.mo56224b()
            com.google.common.f.aa r12 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r11.mo56378ag(r12, r9)
            java.lang.String r12 = "Hotword disabled needs speaker id enrollment"
            r0 = 378(0x17a, float:5.3E-43)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r11).mo56372aa(r0)).mo56386p(r12)
            com.google.android.apps.gsa.assistant.settings.devices.bisto.VoiceMatchSwitchPreferences r11 = r10.f33264ab
            r11.mo8361ab()
            com.google.android.apps.gsa.assistant.settings.devices.bisto.VoiceMatchSwitchPreferences r11 = r10.f33264ab
            r11.mo8391j(r7)
            com.google.android.apps.search.assistant.surfaces.bisto.a.b.i r11 = r10.f33279m
            java.lang.String r12 = r10.f33286t
            r11.mo90176d(r12, r7)
            r10.mo17901J()
            goto L_0x0321
        L_0x0154:
            com.google.common.f.x r11 = r11.mo56224b()
            com.google.common.f.aa r12 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r11.mo56378ag(r12, r9)
            com.google.common.f.c r11 = (com.google.common.p4526f.C59052c) r11
            r12 = 377(0x179, float:5.28E-43)
            com.google.common.f.x r11 = r11.mo56372aa(r12)
            com.google.common.f.c r11 = (com.google.common.p4526f.C59052c) r11
            java.lang.String r12 = "Hotword enabled setting change: %b for %s"
            java.lang.String r0 = r10.f33286t
            r11.mo56357J(r12, r6, r0)
            com.google.android.apps.gsa.assistant.settings.devices.bisto.VoiceMatchSwitchPreferences r11 = r10.f33264ab
            r11.mo8391j(r6)
            r10.f33292z = r7
            com.google.android.apps.search.assistant.surfaces.bisto.a.b.i r11 = r10.f33279m
            java.lang.String r12 = r10.f33286t
            r11.mo90176d(r12, r6)
            goto L_0x0321
        L_0x017e:
            com.google.android.apps.gsa.assistant.settings.devices.bisto.VoiceMatchSwitchPreferences r11 = r10.f33264ab
            r11.mo8361ab()
            com.google.android.apps.gsa.assistant.settings.devices.bisto.VoiceMatchSwitchPreferences r11 = r10.f33264ab
            r11.mo8391j(r7)
            com.google.android.apps.search.assistant.surfaces.bisto.a.b.i r11 = r10.f33279m
            java.lang.String r12 = r10.f33286t
            r11.mo90176d(r12, r7)
            android.app.Activity r11 = r10.mo17794fX()
            if (r11 == 0) goto L_0x0321
            android.support.v7.app.l r12 = new android.support.v7.app.l
            r12.<init>(r11)
            r0 = 2132085438(0x7f150abe, float:1.9811075E38)
            r12.mo1307l(r0)
            r0 = 2132085437(0x7f150abd, float:1.9811073E38)
            r12.mo1300f(r0)
            com.google.android.apps.gsa.assistant.settings.devices.bisto.bm r0 = new com.google.android.apps.gsa.assistant.settings.devices.bisto.bm
            r0.<init>(r10)
            android.support.v7.app.i r1 = r12.f1347a
            r1.f1335p = r0
            com.google.android.apps.gsa.assistant.settings.devices.bisto.bx r0 = new com.google.android.apps.gsa.assistant.settings.devices.bisto.bx
            r0.<init>(r10)
            r1 = 2132084698(0x7f1507da, float:1.9809574E38)
            r12.setNegativeButton(r1, r0)
            com.google.android.apps.gsa.assistant.settings.devices.bisto.cd r0 = new com.google.android.apps.gsa.assistant.settings.devices.bisto.cd
            r0.<init>(r10, r11)
            r11 = 2132084934(0x7f1508c6, float:1.9810053E38)
            android.support.v7.app.l r11 = r12.setPositiveButton(r11, r0)
            android.support.v7.app.m r11 = r11.create()
            r11.show()
            android.support.v7.app.v r11 = r11.mo1197b()
            r12 = 16908299(0x102000b, float:2.387726E-38)
            android.view.View r11 = r11.mo1177e(r12)
            android.widget.TextView r11 = (android.widget.TextView) r11
            if (r11 == 0) goto L_0x0321
            android.text.method.MovementMethod r12 = android.text.method.LinkMovementMethod.getInstance()
            r11.setMovementMethod(r12)
            goto L_0x0321
        L_0x01e5:
            com.google.common.f.x r11 = r11.mo56225c()
            com.google.common.f.aa r12 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r11.mo56378ag(r12, r9)
            java.lang.String r12 = "Hotword enabled set to false, shouldn't happen. "
            r0 = 376(0x178, float:5.27E-43)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r11).mo56372aa(r0)).mo56386p(r12)
            com.google.android.apps.gsa.assistant.settings.devices.bisto.VoiceMatchSwitchPreferences r11 = r10.f33264ab
            r11.mo8391j(r6)
            r10.f33292z = r7
            com.google.android.apps.search.assistant.surfaces.bisto.a.b.i r11 = r10.f33279m
            java.lang.String r12 = r10.f33286t
            r11.mo90176d(r12, r6)
            goto L_0x0321
        L_0x0205:
            java.lang.Boolean r12 = (java.lang.Boolean) r12
            boolean r11 = r12.booleanValue()
            com.google.common.f.aa r12 = com.google.common.p4526f.p4527a.C58975e.f156826a
            java.lang.String r12 = r10.f33286t
            if (r12 == 0) goto L_0x021f
            com.google.android.apps.gsa.shared.bisto.a.cd r0 = r10.f33277k
            if (r11 == 0) goto L_0x0218
            com.google.android.apps.search.assistant.surfaces.bisto.d.bl r11 = com.google.android.apps.search.assistant.surfaces.bisto.p9403d.C124646bl.SOUND_ENABLED
            goto L_0x021a
        L_0x0218:
            com.google.android.apps.search.assistant.surfaces.bisto.d.bl r11 = com.google.android.apps.search.assistant.surfaces.bisto.p9403d.C124646bl.SOUND_DISABLED
        L_0x021a:
            r0.mo83397am(r12, r11)
            goto L_0x0321
        L_0x021f:
            com.google.common.f.e r11 = f33236i
            com.google.common.f.x r11 = r11.mo56225c()
            com.google.common.f.aa r12 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r11.mo56378ag(r12, r9)
            r12 = 435(0x1b3, float:6.1E-43)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r11).mo56372aa(r12)).mo56386p(r8)
            goto L_0x0321
        L_0x0231:
            java.lang.Boolean r12 = (java.lang.Boolean) r12
            boolean r11 = r12.booleanValue()
            com.google.common.f.aa r12 = com.google.common.p4526f.p4527a.C58975e.f156826a
            java.lang.String r12 = r10.f33286t
            if (r12 == 0) goto L_0x024b
            com.google.android.apps.gsa.shared.bisto.a.cd r0 = r10.f33277k
            if (r11 == 0) goto L_0x0244
            com.google.android.apps.search.assistant.surfaces.bisto.d.af r11 = com.google.android.apps.search.assistant.surfaces.bisto.p9403d.C124613af.HFP_USED
            goto L_0x0246
        L_0x0244:
            com.google.android.apps.search.assistant.surfaces.bisto.d.af r11 = com.google.android.apps.search.assistant.surfaces.bisto.p9403d.C124613af.HFP_NOT_USED
        L_0x0246:
            r0.mo83388ad(r12, r11)
            goto L_0x0321
        L_0x024b:
            com.google.common.f.e r11 = f33236i
            com.google.common.f.x r11 = r11.mo56225c()
            com.google.common.f.aa r12 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r11.mo56378ag(r12, r9)
            r12 = 433(0x1b1, float:6.07E-43)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r11).mo56372aa(r12)).mo56386p(r8)
            goto L_0x0321
        L_0x025d:
            java.lang.Boolean r12 = (java.lang.Boolean) r12
            boolean r11 = r12.booleanValue()
            com.google.common.f.aa r12 = com.google.common.p4526f.p4527a.C58975e.f156826a
            java.lang.String r12 = r10.f33286t
            if (r12 == 0) goto L_0x0271
            com.google.android.apps.gsa.shared.bisto.a.cd r0 = r10.f33277k
            r11 = r11 ^ r6
            r0.mo83371M(r12, r11)
            goto L_0x0321
        L_0x0271:
            com.google.common.f.e r11 = f33236i
            com.google.common.f.x r11 = r11.mo56225c()
            com.google.common.f.aa r12 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r11.mo56378ag(r12, r9)
            r12 = 431(0x1af, float:6.04E-43)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r11).mo56372aa(r12)).mo56386p(r8)
            goto L_0x0321
        L_0x0283:
            java.lang.Boolean r12 = (java.lang.Boolean) r12
            boolean r11 = r12.booleanValue()
            com.google.common.f.aa r12 = com.google.common.p4526f.p4527a.C58975e.f156826a
            dagger.a r12 = r10.f33242F
            java.lang.Object r12 = r12.mo27525b()
            com.google.android.apps.gsa.search.core.aj.as r12 = (com.google.android.apps.gsa.search.core.p6513aj.C84534as) r12
            com.google.android.apps.gsa.search.core.aj.ar r12 = r12.mo78241a()
            java.lang.String r0 = "key_send_diagnostics"
            r12.mo78237c(r0, r11)
            r12.mo78236b()
            r10.m24304W()
            goto L_0x0321
        L_0x02a4:
            java.lang.Boolean r12 = (java.lang.Boolean) r12
            boolean r11 = r12.booleanValue()
            com.google.common.f.aa r12 = com.google.common.p4526f.p4527a.C58975e.f156826a
            java.lang.String r12 = r10.f33286t
            if (r12 == 0) goto L_0x02e6
            if (r11 != 0) goto L_0x02df
            dagger.a r11 = r10.f33282p
            java.lang.Object r11 = r11.mo27525b()
            com.google.android.apps.search.assistant.surfaces.bisto.d.ch r11 = (com.google.android.apps.search.assistant.surfaces.bisto.p9403d.C124669ch) r11
            com.google.android.apps.search.assistant.surfaces.bisto.d.ct r12 = com.google.android.apps.search.assistant.surfaces.bisto.p9403d.C124681ct.f343972c
            com.google.protobuf.bn r12 = r12.createBuilder()
            com.google.android.apps.search.assistant.surfaces.bisto.d.cs r12 = (com.google.android.apps.search.assistant.surfaces.bisto.p9403d.C124680cs) r12
            java.lang.String r0 = r10.f33286t
            r12.copyOnWrite()
            com.google.protobuf.bv r1 = r12.instance
            com.google.android.apps.search.assistant.surfaces.bisto.d.ct r1 = (com.google.android.apps.search.assistant.surfaces.bisto.p9403d.C124681ct) r1
            r0.getClass()
            int r2 = r1.f343974a
            r2 = r2 | r6
            r1.f343974a = r2
            r1.f343975b = r0
            com.google.protobuf.bv r12 = r12.build()
            com.google.android.apps.search.assistant.surfaces.bisto.d.ct r12 = (com.google.android.apps.search.assistant.surfaces.bisto.p9403d.C124681ct) r12
            r11.mo106580b(r12)
            goto L_0x0321
        L_0x02df:
            android.content.Context r11 = r10.f32988d
            r0 = 0
            com.google.android.apps.gsa.shared.bisto.p7029b.C89636g.m145900f(r11, r12, r0)
            goto L_0x0321
        L_0x02e6:
            com.google.common.f.e r11 = f33236i
            com.google.common.f.x r11 = r11.mo56225c()
            com.google.common.f.aa r12 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r11.mo56378ag(r12, r9)
            r12 = 428(0x1ac, float:6.0E-43)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r11).mo56372aa(r12)).mo56386p(r8)
            goto L_0x0321
        L_0x02f7:
            com.google.common.f.e r12 = f33236i
            com.google.common.f.x r12 = r12.mo56225c()
            com.google.common.f.aa r0 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r12.mo56378ag(r0, r9)
            java.lang.String r0 = "Unknown preference: %s"
            r1 = 426(0x1aa, float:5.97E-43)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r12).mo56372aa(r1)).mo56389s(r0, r11)
            goto L_0x0321
        L_0x030a:
            com.google.common.f.aa r0 = com.google.common.p4526f.p4527a.C58975e.f156826a
            dagger.a r0 = r10.f33242F
            java.lang.Object r0 = r0.mo27525b()
            com.google.android.apps.gsa.search.core.aj.as r0 = (com.google.android.apps.gsa.search.core.p6513aj.C84534as) r0
            com.google.android.apps.gsa.search.core.aj.ar r0 = r0.mo78241a()
            r0.mo78237c(r11, r12)
            r0.mo78236b()
            r10.m24304W()
        L_0x0321:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.assistant.settings.devices.bisto.C9619ck.mo8472a(androidx.preference.Preference, java.lang.Object):boolean");
    }

    /* renamed from: b */
    public final String mo17909b() {
        C142346by byVar = this.f33291y.f386120f;
        if (byVar == null) {
            byVar = C142346by.f386219m;
        }
        C142320az azVar = byVar.f386226f;
        if (azVar == null) {
            azVar = C142320az.f386099j;
        }
        return C58837ba.m90856e(azVar.f386103c);
    }

    /* renamed from: fW */
    public final void mo17874fW(String str, Set set, long j, C124548d dVar) {
        C58976aa aaVar = C58975e.f156826a;
        if (str.equals(this.f33286t)) {
            this.f33290x = dVar;
            if (m24301R(dVar)) {
                mo17898G();
            } else {
                mo17904M();
            }
        }
    }

    /* renamed from: o */
    public final void mo17804o(Bundle bundle) {
        super.mo17994S(mo17792e());
        if (m24310ac()) {
            Context context = mo17792e().f12738j;
            PreferenceCategory preferenceCategory = new PreferenceCategory(context);
            preferenceCategory.mo8347N("Debug Settings");
            mo17792e().mo8379af(preferenceCategory);
            m24303V(preferenceCategory, C89638i.f242714b, context);
            if (m24310ac()) {
                m24303V(preferenceCategory, C89638i.f242713a, context);
                Preference preference = new Preference(context);
                preference.f12719E = R.layout.preference_widget_next;
                preference.mo8347N("OTA extended control");
                preference.f12743o = new C9586be(this);
                preferenceCategory.mo8379af(preference);
            }
        }
    }

    /* renamed from: q */
    public final void mo17806q() {
        C60870cx cxVar = this.f33273ak;
        if (cxVar != null && !cxVar.isDone()) {
            this.f33273ak.cancel(false);
        }
        C60870cx cxVar2 = this.f33237A;
        if (cxVar2 != null && !cxVar2.isDone()) {
            this.f33237A.cancel(false);
        }
        C60870cx cxVar3 = this.f33238B;
        if (cxVar3 != null && !cxVar3.isDone()) {
            this.f33238B.cancel(false);
        }
        mo17800k();
    }

    /* renamed from: s */
    public final void mo17808s() {
        mo17900I();
        C60870cx cxVar = this.f33273ak;
        if (cxVar != null && !cxVar.isDone()) {
            mo17790D(false);
        }
    }

    /* renamed from: u */
    public final void mo17810u() {
        this.f33277k.mo83360B(C58528ij.m90015O(0, 3, 12, 4, 6, 5, 9, 15, 24, 26, 31, 36), this);
    }

    /* renamed from: v */
    public final void mo17811v() {
        C58976aa aaVar = C58975e.f156826a;
        if (!this.f33289w) {
            mo17903L();
        }
        this.f33277k.mo83379U(this);
    }

    /* renamed from: M */
    public final void mo17904M() {
        boolean z;
        VoiceMatchLearnMorePreferencesBase voiceMatchLearnMorePreferencesBase;
        String str;
        String str2;
        boolean z2 = true;
        if (this.f33245I != null) {
            if ("wired".equals(this.f33286t)) {
                this.f33245I.mo8348O(true);
                boolean equals = C124636bb.OPA_ENABLED.equals(this.f33290x.mo106521s());
                if (!this.f33275am) {
                    this.f33245I.mo8391j(equals);
                    this.f33275am = true;
                }
                PreferenceCategory preferenceCategory = this.f33246J;
                if (preferenceCategory != null) {
                    preferenceCategory.mo8348O(equals);
                }
            } else {
                this.f33245I.mo8348O(false);
            }
        }
        if (!(this.f33250N == null || this.f33249M == null || this.f33251O == null)) {
            if (mo17906O()) {
                this.f33250N.mo8348O(false);
                this.f33249M.mo8348O(false);
                this.f33251O.mo8348O(false);
            } else if (!C124526g.m203993a(this.f33290x)) {
                this.f33250N.mo8348O(true);
                this.f33249M.mo8348O(false);
                this.f33251O.mo8348O(false);
            } else {
                this.f33250N.mo8348O(false);
                boolean z3 = !(m24308aa() && this.f33290x.mo106509h().equals(C124711i.BUTTON_ACTION_NEXT_TRACK));
                C58976aa aaVar = C58975e.f156826a;
                if (C36619a.m65148d(this.f32988d)) {
                    this.f33249M.mo8348O(false);
                    this.f33251O.mo8348O(true);
                    this.f33251O.mo8339F(z3);
                } else {
                    this.f33249M.mo8348O(z3);
                    this.f33251O.mo8348O(false);
                }
            }
        }
        if (this.f33252P != null) {
            if (m24308aa()) {
                this.f33252P.mo8348O(true);
                if (this.f33252P != null) {
                    C124715m mVar = C124715m.UNKNOWN_CONNECTIVITY_STATUS;
                    C124657bw bwVar = C124657bw.UNKNOWN_USER_OTA_STATE;
                    C124711i iVar = C124711i.BUTTON_ACTION_UNKNOWN;
                    if (this.f33290x.mo106509h().ordinal() != 2) {
                        str2 = mo17795g(R.string.bisto_device_double_tap_assistant_mode);
                    } else {
                        str2 = mo17795g(R.string.bisto_device_double_tap_next_mode);
                    }
                    this.f33252P.mo8329n(str2);
                }
            } else {
                this.f33252P.mo8348O(false);
            }
        }
        C142346by byVar = this.f33291y.f386120f;
        if (byVar == null) {
            byVar = C142346by.f386219m;
        }
        m24307Z(this.f33259W, C58837ba.m90856e(byVar.f386223c));
        C142346by byVar2 = this.f33291y.f386120f;
        if (byVar2 == null) {
            byVar2 = C142346by.f386219m;
        }
        m24307Z(this.f33260X, C58837ba.m90856e(byVar2.f386229i));
        C142346by byVar3 = this.f33291y.f386120f;
        if (byVar3 == null) {
            byVar3 = C142346by.f386219m;
        }
        m24307Z(this.f33247K, C58837ba.m90856e(byVar3.f386224d));
        if (this.f33261Y != null) {
            C142346by byVar4 = this.f33291y.f386120f;
            if (byVar4 == null) {
                byVar4 = C142346by.f386219m;
            }
            m24307Z(this.f33261Y, C58837ba.m90856e(byVar4.f386225e));
        }
        m24306Y();
        if (this.f33257U != null) {
            if (C124521b.m203981d(this.f33290x.mo106481V(), this.f33291y)) {
                this.f33257U.mo8348O(false);
            } else if (this.f33290x.mo106514l().equals(C124721s.WIRED)) {
                this.f33257U.mo8348O(false);
            } else {
                this.f33257U.mo8348O(true);
                String M = this.f33290x.mo106472M();
                if (M == null) {
                    C58976aa aaVar2 = C58975e.f156826a;
                    this.f33257U.mo8329n(this.f32988d.getString(R.string.bisto_unknown));
                    this.f33257U.f12719E = R.layout.preference_widget_empty;
                } else {
                    if (this.f33290x.mo106478S() != null) {
                        M = M + "#" + this.f33290x.mo106478S();
                    }
                    C124715m mVar2 = C124715m.UNKNOWN_CONNECTIVITY_STATUS;
                    C124657bw bwVar2 = C124657bw.UNKNOWN_USER_OTA_STATE;
                    C124711i iVar2 = C124711i.BUTTON_ACTION_UNKNOWN;
                    int ordinal = this.f33290x.mo106523u().ordinal();
                    if (ordinal == 3) {
                        C58976aa aaVar3 = C58975e.f156826a;
                        if (mo17905N()) {
                            this.f33257U.mo8329n(this.f32988d.getString(R.string.bisto_device_firmware_version_available, new Object[]{M}));
                            this.f33257U.f12719E = R.layout.preference_widget_warning;
                        } else {
                            this.f33257U.mo8329n(this.f32988d.getString(R.string.bisto_device_firmware_version_available_disconnected, new Object[]{M}));
                            this.f33257U.f12719E = R.layout.preference_widget_empty;
                        }
                    } else if (ordinal != 4) {
                        C58976aa aaVar4 = C58975e.f156826a;
                        this.f33257U.mo8329n(this.f32988d.getString(R.string.bisto_device_firmware_version_up_to_date, new Object[]{M}));
                        this.f33257U.f12719E = R.layout.preference_widget_empty;
                    } else {
                        C58976aa aaVar5 = C58975e.f156826a;
                        if (this.f33290x.mo106500an() == 2) {
                            this.f33257U.mo8329n(this.f32988d.getString(R.string.bisto_device_firmware_version_up_to_date, new Object[]{M}));
                            this.f33257U.f12719E = R.layout.preference_widget_empty;
                        } else {
                            C124629av q = this.f33290x.mo106519q();
                            if (q.f343828o.size() > 0) {
                                str = C58837ba.m90856e(((C124650bp) q.f343828o.get(0)).f343894c);
                            } else {
                                str = C58837ba.m90856e(q.f343815b);
                            }
                            this.f33257U.mo8329n(this.f32988d.getString(str == null ? R.string.bisto_device_firmware_version_applying_unknown : R.string.bisto_device_firmware_version_applying, new Object[]{str}));
                            this.f33257U.f12719E = R.layout.preference_widget_applying;
                        }
                    }
                }
            }
        }
        if (this.f33256T != null) {
            C142355cg cgVar = this.f33291y.f386117c;
            if (cgVar == null) {
                cgVar = C142355cg.f386263b;
            }
            String e = C58837ba.m90856e(C124525f.m203989e(cgVar));
            if (e == null) {
                C142324bc bcVar = this.f33291y;
                int i = bcVar.f386115a;
                if ((i & 8) != 0 && (i & 2) != 0) {
                    C142355cg cgVar2 = bcVar.f386118d;
                    if (cgVar2 == null) {
                        cgVar2 = C142355cg.f386263b;
                    }
                    String e2 = C124525f.m203989e(cgVar2);
                    C142355cg cgVar3 = this.f33291y.f386116b;
                    if (cgVar3 == null) {
                        cgVar3 = C142355cg.f386263b;
                    }
                    e = e2 + " " + C124525f.m203989e(cgVar3);
                } else if ((2 & i) != 0) {
                    C142355cg cgVar4 = bcVar.f386116b;
                    if (cgVar4 == null) {
                        cgVar4 = C142355cg.f386263b;
                    }
                    e = C124525f.m203989e(cgVar4);
                }
            }
            if (e != null) {
                this.f33256T.mo8348O(true);
                this.f33256T.mo8329n(e);
            } else {
                this.f33256T.mo8348O(false);
            }
        }
        if (this.f33262Z != null && C124707e.INPUT_ONLY_MODE.equals(this.f33290x.mo106508g())) {
            this.f33262Z.mo8348O(true);
            this.f33262Z.mo8391j(C124613af.HFP_USED.equals(this.f33290x.mo106515m()));
        }
        boolean z4 = this.f33290x.mo106497ak() && !mo17906O();
        SwitchPreferenceCompat switchPreferenceCompat = this.f33263aa;
        if (switchPreferenceCompat != null) {
            switchPreferenceCompat.mo8348O(z4);
            this.f33263aa.mo8391j(!C124646bl.SOUND_DISABLED.equals(this.f33290x.mo106522t()));
        }
        Preference preference = this.f33267ae;
        if (preference != null) {
            preference.mo8348O(C124719q.CAR_ACCESSORY.equals(this.f33290x.mo106513k()) && C124707e.INPUT_ONLY_MODE.equals(this.f33290x.mo106508g()));
        }
        C59071e eVar = f33236i;
        C59104x b = eVar.mo56224b();
        b.mo56378ag(C58975e.f156826a, "DevIdBistoSCntrl");
        ((C59052c) ((C59052c) b).mo56372aa(413)).mo56386p("#updateHotwordPreference");
        if (!(this.f33264ab == null || (voiceMatchLearnMorePreferencesBase = this.f33266ad) == null)) {
            voiceMatchLearnMorePreferencesBase.mo8348O(false);
            if (!C89643n.m145920e(this.f33290x) || this.f33290x.mo106513k().equals(C124719q.CAR_ACCESSORY)) {
                this.f33264ab.mo8348O(false);
            } else if (m24309ab()) {
                this.f33264ab.mo8348O(false);
                if (mo17905N()) {
                    this.f33266ad.mo8348O(true);
                    if (this.f33292z == 4) {
                        this.f33240D = false;
                        this.f33266ad.mo8346M(R.string.bisto_hotword_enable_pref_title);
                        this.f33266ad.mo8345L(R.string.bisto_hotword_speaker_id_pref_summary);
                    } else {
                        this.f33240D = true;
                        this.f33266ad.mo8346M(R.string.voice_match_retrain_model_title);
                        this.f33266ad.mo8345L(R.string.voice_match_retrain_model_summary);
                    }
                }
            } else {
                int i2 = this.f33292z;
                if (i2 == 0) {
                    C59104x b2 = eVar.mo56224b();
                    b2.mo56378ag(C58975e.f156826a, "DevIdBistoSCntrl");
                    ((C59052c) ((C59052c) b2).mo56372aa(416)).mo56386p("Hotword: Available");
                    this.f33264ab.mo8348O(true);
                    this.f33264ab.mo8391j(true);
                } else if (i2 == 5) {
                    C59104x b3 = eVar.mo56224b();
                    b3.mo56378ag(C58975e.f156826a, "DevIdBistoSCntrl");
                    ((C59052c) ((C59052c) b3).mo56372aa(415)).mo56386p("Hotword: Unavailable, needs speaker id enrollment");
                    this.f33266ad.mo8348O(true);
                    this.f33264ab.mo8348O(false);
                } else {
                    C59104x b4 = eVar.mo56224b();
                    b4.mo56378ag(C58975e.f156826a, "DevIdBistoSCntrl");
                    ((C59052c) ((C59052c) b4).mo56372aa(414)).mo56386p("Hotword: Unavailable");
                    this.f33264ab.mo8348O(true);
                    this.f33264ab.mo8391j(false);
                }
            }
        }
        if (this.f33283q != null) {
            if (!mo17906O()) {
                this.f33283q.mo8348O(false);
            } else {
                this.f33283q.mo8348O(true);
                C124548d dVar = this.f33290x;
                if (!dVar.mo106484Y()) {
                    z = dVar.mo106488ab();
                } else {
                    Account a = this.f33281o.mo79668a();
                    if (a == null || C58837ba.m90859h(a.name)) {
                        C59104x d = eVar.mo56226d();
                        d.mo56378ag(C58975e.f156826a, "DevIdBistoSCntrl");
                        ((C59052c) ((C59052c) d).mo56372aa(418)).mo56386p("No account");
                        z = dVar.mo106488ab();
                    } else {
                        z = dVar.mo106517o(a).f343766d;
                    }
                }
                this.f33283q.mo8391j(z);
            }
        }
        if (this.f33272aj == null) {
            C59104x b5 = eVar.mo56224b();
            b5.mo56378ag(C58975e.f156826a, "DevIdBistoSCntrl");
            ((C59052c) ((C59052c) b5).mo56372aa(407)).mo56386p("Custom Text Query Preference is null");
        } else if (!this.f33284r.mo83555j(93) || mo17906O()) {
            this.f33272aj.mo8339F(false);
            this.f33272aj.mo8348O(false);
        } else {
            this.f33272aj.mo8339F(true);
            this.f33272aj.mo8348O(true);
            this.f33272aj.mo8347N("Custom Gesture Query");
            C124548d dVar2 = this.f33290x;
            if (dVar2 != null) {
                this.f33272aj.mo8323j(dVar2.mo106473N());
            }
        }
        C142346by byVar5 = this.f33291y.f386120f;
        if (byVar5 == null) {
            byVar5 = C142346by.f386219m;
        }
        m24307Z(this.f33268af, C58837ba.m90856e(byVar5.f386230j));
        Preference preference2 = this.f33269ag;
        if (preference2 != null) {
            preference2.mo8348O(true);
        }
        Preference preference3 = this.f33270ah;
        if (preference3 != null) {
            preference3.mo8348O(true);
        }
        Preference preference4 = this.f33271ai;
        if (preference4 != null) {
            preference4.mo8348O(true);
        }
        String str3 = null;
        if (this.f33253Q != null) {
            String b6 = mo17909b();
            C142346by byVar6 = this.f33291y.f386120f;
            if (byVar6 == null) {
                byVar6 = C142346by.f386219m;
            }
            C142320az azVar = byVar6.f386226f;
            if (azVar == null) {
                azVar = C142320az.f386099j;
            }
            C142355cg cgVar5 = azVar.f386104d;
            if (cgVar5 == null) {
                cgVar5 = C142355cg.f386263b;
            }
            String e3 = C58837ba.m90856e(C124525f.m203990f(cgVar5.f386265a));
            if (e3 == null) {
                C142346by byVar7 = this.f33291y.f386120f;
                if (byVar7 == null) {
                    byVar7 = C142346by.f386219m;
                }
                C142320az azVar2 = byVar7.f386226f;
                if (azVar2 == null) {
                    azVar2 = C142320az.f386099j;
                }
                String e4 = C58837ba.m90856e(azVar2.f386102b);
                e3 = e4 != null ? this.f32988d.getString(R.string.bisto_device_generic_oem_partner_app_setting_title, new Object[]{e4}) : null;
            }
            C142346by byVar8 = this.f33291y.f386120f;
            if (byVar8 == null) {
                byVar8 = C142346by.f386219m;
            }
            C142320az azVar3 = byVar8.f386226f;
            if (azVar3 == null) {
                azVar3 = C142320az.f386099j;
            }
            C142355cg cgVar6 = azVar3.f386105e;
            if (cgVar6 == null) {
                cgVar6 = C142355cg.f386263b;
            }
            String e5 = C58837ba.m90856e(C124525f.m203990f(cgVar6.f386265a));
            if (e5 == null) {
                e5 = this.f32988d.getString(R.string.bisto_device_oem_partner_app_summary);
            }
            if (b6 == null || e3 == null) {
                this.f33253Q.mo8348O(false);
            } else {
                this.f33253Q.mo8347N(e3);
                this.f33253Q.mo8329n(e5);
                this.f33253Q.mo8348O(true);
            }
        }
        if (this.f33255S != null) {
            C124715m j = this.f33290x.mo106512j();
            C124715m mVar3 = C124715m.UNKNOWN_CONNECTIVITY_STATUS;
            C124657bw bwVar3 = C124657bw.UNKNOWN_USER_OTA_STATE;
            C124711i iVar3 = C124711i.BUTTON_ACTION_UNKNOWN;
            switch (j.ordinal()) {
                case 1:
                case 3:
                case 5:
                    str3 = this.f32988d.getString(R.string.bisto_connectivity_disconnected);
                    break;
                case 2:
                case 6:
                    str3 = this.f32988d.getString(R.string.bisto_connectivity_assistant_disconnected);
                    break;
                case 4:
                    str3 = this.f32988d.getString(R.string.bisto_connectivity_audio_and_data);
                    break;
            }
            this.f33255S.mo8348O(true);
            Preference preference5 = this.f33255S;
            if (str3 == null) {
                str3 = this.f32988d.getString(R.string.bisto_unknown);
            }
            preference5.mo8329n(str3);
        }
        if (this.f33265ac != null) {
            if (mo17906O()) {
                this.f33265ac.mo8348O(false);
            } else {
                this.f33265ac.mo8391j(!this.f33290x.mo106483X());
            }
        }
        Preference preference6 = this.f33258V;
        if (preference6 != null) {
            if ("wired".equals(this.f33286t)) {
                z2 = false;
            } else {
                if (!C124721s.WIRED.equals(this.f33290x.mo106514l())) {
                    if (!C124719q.GACS_DEVICE.equals(this.f33290x.mo106513k())) {
                        z2 = mo17905N();
                    }
                }
            }
            preference6.mo8348O(z2);
        }
        Preference preference7 = this.f33248L;
        if (preference7 != null) {
            preference7.mo8348O("wired".equals(this.f33286t));
        }
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* renamed from: F */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo17862F(androidx.preference.Preference r5) {
        /*
            r4 = this;
            java.lang.String r0 = r5.f12748t
            if (r0 != 0) goto L_0x0005
            return
        L_0x0005:
            int r1 = r0.hashCode()
            r2 = 1
            r3 = 0
            switch(r1) {
                case -1920479091: goto L_0x0174;
                case -1811058850: goto L_0x0169;
                case -1557503210: goto L_0x015e;
                case -1534066155: goto L_0x0153;
                case -1514998329: goto L_0x0148;
                case -1417423225: goto L_0x013d;
                case -1206426097: goto L_0x0132;
                case -774094755: goto L_0x0128;
                case -626042776: goto L_0x011e;
                case -431018815: goto L_0x0113;
                case -334349812: goto L_0x0107;
                case -315940760: goto L_0x00fb;
                case -8548338: goto L_0x00f0;
                case 82318168: goto L_0x00e4;
                case 212140368: goto L_0x00d8;
                case 227442896: goto L_0x00cc;
                case 468121519: goto L_0x00c1;
                case 476332026: goto L_0x00b6;
                case 540547261: goto L_0x00ab;
                case 719320606: goto L_0x00a0;
                case 1048672716: goto L_0x0094;
                case 1071599382: goto L_0x0088;
                case 1083715537: goto L_0x007c;
                case 1128122913: goto L_0x0070;
                case 1153886999: goto L_0x0064;
                case 1277492901: goto L_0x0058;
                case 1290012227: goto L_0x004c;
                case 1356833382: goto L_0x0040;
                case 1390221748: goto L_0x0034;
                case 1513724144: goto L_0x0028;
                case 1783643467: goto L_0x001c;
                case 1896010510: goto L_0x0010;
                default: goto L_0x000e;
            }
        L_0x000e:
            goto L_0x017f
        L_0x0010:
            java.lang.String r1 = "bistoAudioOutputOptions"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x017f
            r0 = 10
            goto L_0x0180
        L_0x001c:
            java.lang.String r1 = "bistoDoubleTap"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x017f
            r0 = 12
            goto L_0x0180
        L_0x0028:
            java.lang.String r1 = "oemPartnerApp"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x017f
            r0 = 15
            goto L_0x0180
        L_0x0034:
            java.lang.String r1 = "bistoStartSound"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x017f
            r0 = 9
            goto L_0x0180
        L_0x0040:
            java.lang.String r1 = "bistoSupportCategory"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x017f
            r0 = 26
            goto L_0x0180
        L_0x004c:
            java.lang.String r1 = "bistoInformationCategory"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x017f
            r0 = 25
            goto L_0x0180
        L_0x0058:
            java.lang.String r1 = "bistoDiagnostics"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x017f
            r0 = 11
            goto L_0x0180
        L_0x0064:
            java.lang.String r1 = "bistoConnectionStatus"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x017f
            r0 = 21
            goto L_0x0180
        L_0x0070:
            java.lang.String r1 = "bistoRemoveDevice"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x017f
            r0 = 24
            goto L_0x0180
        L_0x007c:
            java.lang.String r1 = "bistoHotwordEnablement"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x017f
            r0 = 27
            goto L_0x0180
        L_0x0088:
            java.lang.String r1 = "bistoNotificationAccess"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x017f
            r0 = 13
            goto L_0x0180
        L_0x0094:
            java.lang.String r1 = "bistoWellness"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x017f
            r0 = 31
            goto L_0x0180
        L_0x00a0:
            java.lang.String r1 = "bistoDeviceSettingsCategory"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x017f
            r0 = 2
            goto L_0x0180
        L_0x00ab:
            java.lang.String r1 = "bistoScreenLocked"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x017f
            r0 = 7
            goto L_0x0180
        L_0x00b6:
            java.lang.String r1 = "bistoNotificationsExtended"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x017f
            r0 = 6
            goto L_0x0180
        L_0x00c1:
            java.lang.String r1 = "bistoDeviceDiagnostics"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x017f
            r0 = 3
            goto L_0x0180
        L_0x00cc:
            java.lang.String r1 = "bistoCustomQuery"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x017f
            r0 = 30
            goto L_0x0180
        L_0x00d8:
            java.lang.String r1 = "bistoNotificationAccessForGuestures"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x017f
            r0 = 14
            goto L_0x0180
        L_0x00e4:
            java.lang.String r1 = "bistoUserManual"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x017f
            r0 = 17
            goto L_0x0180
        L_0x00f0:
            java.lang.String r1 = "bistoTutorials"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x017f
            r0 = 4
            goto L_0x0180
        L_0x00fb:
            java.lang.String r1 = "bistoHelp"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x017f
            r0 = 16
            goto L_0x0180
        L_0x0107:
            java.lang.String r1 = "bistoHfpOutput"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x017f
            r0 = 8
            goto L_0x0180
        L_0x0113:
            java.lang.String r1 = "bistoImageHeader"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x017f
            r0 = 0
            goto L_0x0180
        L_0x011e:
            java.lang.String r1 = "bistoOpaEnabled"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x017f
            r0 = 1
            goto L_0x0180
        L_0x0128:
            java.lang.String r1 = "bistoLaunchOobe"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x017f
            r0 = 5
            goto L_0x0180
        L_0x0132:
            java.lang.String r1 = "bistoPersonalResults"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x017f
            r0 = 29
            goto L_0x0180
        L_0x013d:
            java.lang.String r1 = "bistoSafetyInfo"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x017f
            r0 = 20
            goto L_0x0180
        L_0x0148:
            java.lang.String r1 = "bistoMakeAndModel"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x017f
            r0 = 22
            goto L_0x0180
        L_0x0153:
            java.lang.String r1 = "bistoLeaveFeedback"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x017f
            r0 = 18
            goto L_0x0180
        L_0x015e:
            java.lang.String r1 = "bistoFirmwareVersion"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x017f
            r0 = 23
            goto L_0x0180
        L_0x0169:
            java.lang.String r1 = "bistoOpenSourceLicenses"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x017f
            r0 = 19
            goto L_0x0180
        L_0x0174:
            java.lang.String r1 = "bistoHotwordEnablementSpeakerIdEnrollment"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x017f
            r0 = 28
            goto L_0x0180
        L_0x017f:
            r0 = -1
        L_0x0180:
            switch(r0) {
                case 0: goto L_0x02e1;
                case 1: goto L_0x02d9;
                case 2: goto L_0x02d4;
                case 3: goto L_0x02b4;
                case 4: goto L_0x02aa;
                case 5: goto L_0x02a0;
                case 6: goto L_0x0296;
                case 7: goto L_0x0283;
                case 8: goto L_0x027b;
                case 9: goto L_0x0273;
                case 10: goto L_0x0269;
                case 11: goto L_0x0256;
                case 12: goto L_0x0248;
                case 13: goto L_0x023a;
                case 14: goto L_0x022c;
                case 15: goto L_0x021e;
                case 16: goto L_0x0214;
                case 17: goto L_0x020a;
                case 18: goto L_0x01ff;
                case 19: goto L_0x01f4;
                case 20: goto L_0x01ea;
                case 21: goto L_0x01e7;
                case 22: goto L_0x01e4;
                case 23: goto L_0x01d9;
                case 24: goto L_0x01ce;
                case 25: goto L_0x02d3;
                case 26: goto L_0x02d3;
                case 27: goto L_0x01c6;
                case 28: goto L_0x01b8;
                case 29: goto L_0x01aa;
                case 30: goto L_0x01a2;
                case 31: goto L_0x0198;
                default: goto L_0x0183;
            }
        L_0x0183:
            com.google.common.f.e r0 = f33236i
            com.google.common.f.x r0 = r0.mo56226d()
            com.google.common.f.aa r1 = com.google.common.p4526f.p4527a.C58975e.f156826a
            java.lang.String r2 = "DevIdBistoSCntrl"
            r0.mo56378ag(r1, r2)
            java.lang.String r1 = "unknown preference: %s"
            r2 = 373(0x175, float:5.23E-43)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r0).mo56372aa(r2)).mo56389s(r1, r5)
            return
        L_0x0198:
            r4.f33268af = r5
            com.google.android.apps.gsa.assistant.settings.devices.bisto.aw r0 = new com.google.android.apps.gsa.assistant.settings.devices.bisto.aw
            r0.<init>(r4)
            r5.f12743o = r0
            return
        L_0x01a2:
            r0 = r5
            androidx.preference.EditTextPreference r0 = (androidx.preference.EditTextPreference) r0
            r4.f33272aj = r0
            r5.f12742n = r4
            return
        L_0x01aa:
            r0 = r5
            com.google.android.apps.gsa.assistant.settings.devices.bisto.PersonalResultsSwitchPreference r0 = (com.google.android.apps.gsa.assistant.settings.devices.bisto.PersonalResultsSwitchPreference) r0
            r4.f33283q = r0
            com.google.android.apps.gsa.assistant.settings.devices.bisto.br r0 = new com.google.android.apps.gsa.assistant.settings.devices.bisto.br
            r0.<init>(r4)
            m24305X(r5, r0)
            return
        L_0x01b8:
            r0 = r5
            com.google.android.apps.gsa.assistant.settings.devices.bisto.VoiceMatchLearnMorePreferencesBase r0 = (com.google.android.apps.gsa.assistant.settings.devices.bisto.VoiceMatchLearnMorePreferencesBase) r0
            r4.f33266ad = r0
            com.google.android.apps.gsa.assistant.settings.devices.bisto.bq r0 = new com.google.android.apps.gsa.assistant.settings.devices.bisto.bq
            r0.<init>(r4)
            m24305X(r5, r0)
            return
        L_0x01c6:
            r0 = r5
            com.google.android.apps.gsa.assistant.settings.devices.bisto.VoiceMatchSwitchPreferences r0 = (com.google.android.apps.gsa.assistant.settings.devices.bisto.VoiceMatchSwitchPreferences) r0
            r4.f33264ab = r0
            r5.f12742n = r4
            return
        L_0x01ce:
            r4.f33258V = r5
            com.google.android.apps.gsa.assistant.settings.devices.bisto.bp r0 = new com.google.android.apps.gsa.assistant.settings.devices.bisto.bp
            r0.<init>(r4)
            m24305X(r5, r0)
            return
        L_0x01d9:
            com.google.android.apps.gsa.assistant.settings.devices.bisto.bo r0 = new com.google.android.apps.gsa.assistant.settings.devices.bisto.bo
            r0.<init>(r4)
            m24305X(r5, r0)
            r4.f33257U = r5
            return
        L_0x01e4:
            r4.f33256T = r5
            return
        L_0x01e7:
            r4.f33255S = r5
            return
        L_0x01ea:
            r4.f33261Y = r5
            com.google.android.apps.gsa.assistant.settings.devices.bisto.aw r0 = new com.google.android.apps.gsa.assistant.settings.devices.bisto.aw
            r0.<init>(r4)
            r5.f12743o = r0
            return
        L_0x01f4:
            r4.f33271ai = r5
            com.google.android.apps.gsa.assistant.settings.devices.bisto.cb r0 = new com.google.android.apps.gsa.assistant.settings.devices.bisto.cb
            r0.<init>(r4)
            m24305X(r5, r0)
            return
        L_0x01ff:
            r4.f33270ah = r5
            com.google.android.apps.gsa.assistant.settings.devices.bisto.ca r0 = new com.google.android.apps.gsa.assistant.settings.devices.bisto.ca
            r0.<init>(r4)
            m24305X(r5, r0)
            return
        L_0x020a:
            r4.f33260X = r5
            com.google.android.apps.gsa.assistant.settings.devices.bisto.aw r0 = new com.google.android.apps.gsa.assistant.settings.devices.bisto.aw
            r0.<init>(r4)
            r5.f12743o = r0
            return
        L_0x0214:
            r4.f33259W = r5
            com.google.android.apps.gsa.assistant.settings.devices.bisto.aw r0 = new com.google.android.apps.gsa.assistant.settings.devices.bisto.aw
            r0.<init>(r4)
            r5.f12743o = r0
            return
        L_0x021e:
            com.google.android.apps.gsa.assistant.settings.devices.bisto.bz r0 = new com.google.android.apps.gsa.assistant.settings.devices.bisto.bz
            r0.<init>(r4)
            m24305X(r5, r0)
            r4.f33253Q = r5
            r5.mo8348O(r3)
            return
        L_0x022c:
            r4.f33250N = r5
            r5.mo8348O(r3)
            com.google.android.apps.gsa.assistant.settings.devices.bisto.by r0 = new com.google.android.apps.gsa.assistant.settings.devices.bisto.by
            r0.<init>(r4)
            m24305X(r5, r0)
            return
        L_0x023a:
            r4.f33249M = r5
            r5.mo8348O(r3)
            com.google.android.apps.gsa.assistant.settings.devices.bisto.bw r0 = new com.google.android.apps.gsa.assistant.settings.devices.bisto.bw
            r0.<init>(r4)
            m24305X(r5, r0)
            return
        L_0x0248:
            r4.f33252P = r5
            r5.mo8348O(r3)
            com.google.android.apps.gsa.assistant.settings.devices.bisto.bv r0 = new com.google.android.apps.gsa.assistant.settings.devices.bisto.bv
            r0.<init>(r4)
            m24305X(r5, r0)
            return
        L_0x0256:
            r4.f33269ag = r5
            r0 = r5
            androidx.preference.TwoStatePreference r0 = (androidx.preference.TwoStatePreference) r0
            com.google.android.apps.gsa.shared.util.v.g r1 = r4.f33241E
            java.lang.String r2 = "key_send_diagnostics"
            boolean r1 = r1.mo85406k(r2, r3)
            r0.mo8391j(r1)
            r5.f12742n = r4
            return
        L_0x0269:
            r4.f33267ae = r5
            com.google.android.apps.gsa.assistant.settings.devices.bisto.bu r0 = new com.google.android.apps.gsa.assistant.settings.devices.bisto.bu
            r0.<init>(r4)
            r5.f12743o = r0
            return
        L_0x0273:
            r0 = r5
            androidx.preference.SwitchPreferenceCompat r0 = (androidx.preference.SwitchPreferenceCompat) r0
            r4.f33263aa = r0
            r5.f12742n = r4
            return
        L_0x027b:
            r0 = r5
            androidx.preference.SwitchPreferenceCompat r0 = (androidx.preference.SwitchPreferenceCompat) r0
            r4.f33262Z = r0
            r5.f12742n = r4
            return
        L_0x0283:
            r0 = r5
            androidx.preference.SwitchPreferenceCompat r0 = (androidx.preference.SwitchPreferenceCompat) r0
            r4.f33265ac = r0
            r5.f12742n = r4
            com.google.android.apps.gsa.shared.bisto.k r0 = r4.f33284r
            boolean r0 = r0.mo83561p()
            if (r0 == 0) goto L_0x02d3
            r5.mo8348O(r3)
            return
        L_0x0296:
            r4.f33251O = r5
            com.google.android.apps.gsa.assistant.settings.devices.bisto.bt r0 = new com.google.android.apps.gsa.assistant.settings.devices.bisto.bt
            r0.<init>(r4)
            r5.f12743o = r0
            return
        L_0x02a0:
            r4.f33248L = r5
            com.google.android.apps.gsa.assistant.settings.devices.bisto.bs r0 = new com.google.android.apps.gsa.assistant.settings.devices.bisto.bs
            r0.<init>(r4)
            r5.f12743o = r0
            return
        L_0x02aa:
            r4.f33247K = r5
            com.google.android.apps.gsa.assistant.settings.devices.bisto.aw r0 = new com.google.android.apps.gsa.assistant.settings.devices.bisto.aw
            r0.<init>(r4)
            r5.f12743o = r0
            return
        L_0x02b4:
            androidx.preference.PreferenceScreen r0 = r4.mo17792e()
            android.content.Context r0 = r0.f12738j
            r5.mo8348O(r3)
            android.content.ContentResolver r0 = r0.getContentResolver()
            java.lang.String r1 = "development_settings_enabled"
            int r0 = android.provider.Settings.Global.getInt(r0, r1, r3)
            if (r0 != r2) goto L_0x02d3
            r5.mo8348O(r2)
            com.google.android.apps.gsa.assistant.settings.devices.bisto.bn r0 = new com.google.android.apps.gsa.assistant.settings.devices.bisto.bn
            r0.<init>(r4)
            r5.f12743o = r0
        L_0x02d3:
            return
        L_0x02d4:
            androidx.preference.PreferenceCategory r5 = (androidx.preference.PreferenceCategory) r5
            r4.f33246J = r5
            return
        L_0x02d9:
            r0 = r5
            androidx.preference.SwitchPreferenceCompat r0 = (androidx.preference.SwitchPreferenceCompat) r0
            r4.f33245I = r0
            r5.f12742n = r4
            return
        L_0x02e1:
            com.google.android.apps.gsa.assistant.settings.shared.ImageHeader r5 = (com.google.android.apps.gsa.assistant.settings.shared.ImageHeader) r5
            r4.f33254R = r5
            r4.m24306Y()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.assistant.settings.devices.bisto.C9619ck.mo17862F(androidx.preference.Preference):void");
    }
}
