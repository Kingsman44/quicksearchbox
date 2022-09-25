package com.google.android.apps.gsa.staticplugins.opa;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.media.AudioDeviceCallback;
import android.os.Bundle;
import android.os.SystemClock;
import android.support.p033v7.app.C0395p;
import android.support.p033v7.app.C0401v;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import androidx.annotation.C0826b;
import androidx.core.p094f.C1894g;
import androidx.core.p094f.C1897j;
import androidx.lifecycle.C2384o;
import androidx.lifecycle.C2391v;
import com.google.android.apps.gsa.assist.p501a.C9321i;
import com.google.android.apps.gsa.assistant.shared.C73912w;
import com.google.android.apps.gsa.assistant.shared.l.e;
import com.google.android.apps.gsa.assistant.shared.p.m;
import com.google.android.apps.gsa.nga.api.a.bf;
import com.google.android.apps.gsa.nga.shared.p6417x.C83361k;
import com.google.android.apps.gsa.nga.shared.p6417x.C83363m;
import com.google.android.apps.gsa.p6482q.p6483a.C84235h;
import com.google.android.apps.gsa.search.core.p6513aj.C84516aa;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.search.shared.actions.C87422j;
import com.google.android.apps.gsa.search.shared.actions.C87423k;
import com.google.android.apps.gsa.search.shared.p6928f.C87546b;
import com.google.android.apps.gsa.search.shared.p6930h.C87564g;
import com.google.android.apps.gsa.search.shared.p6930h.C87566i;
import com.google.android.apps.gsa.search.shared.p6930h.C87571n;
import com.google.android.apps.gsa.search.shared.service.C88489j;
import com.google.android.apps.gsa.search.shared.service.p6935b.C87739bu;
import com.google.android.apps.gsa.search.shared.service.p6935b.C87934j;
import com.google.android.apps.gsa.search.shared.service.p6935b.C87961k;
import com.google.android.apps.gsa.search.shared.service.p6935b.C87988l;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88079oj;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88134qk;
import com.google.android.apps.gsa.shared.logger.C89838ab;
import com.google.android.apps.gsa.shared.logger.p7051b.C89849ae;
import com.google.android.apps.gsa.shared.logger.p7051b.C89856f;
import com.google.android.apps.gsa.shared.logger.p7051b.C89859i;
import com.google.android.apps.gsa.shared.p6976ag.p6982e.C89143o;
import com.google.android.apps.gsa.shared.p6983ah.C89150g;
import com.google.android.apps.gsa.shared.p7066m.C90014bt;
import com.google.android.apps.gsa.shared.p7066m.C90016bv;
import com.google.android.apps.gsa.shared.p7066m.C90029ch;
import com.google.android.apps.gsa.shared.p7066m.C90044cw;
import com.google.android.apps.gsa.shared.p7066m.C90063do;
import com.google.android.apps.gsa.shared.p7066m.C90065dq;
import com.google.android.apps.gsa.shared.p7130s.p7131a.C90476a;
import com.google.android.apps.gsa.shared.p7148ui.p7155g.C90685b;
import com.google.android.apps.gsa.shared.util.BitFlags;
import com.google.android.apps.gsa.shared.util.debug.C91022f;
import com.google.android.apps.gsa.shared.util.debug.p7163a.C90991b;
import com.google.android.apps.gsa.shared.util.debug.p7163a.C91006f;
import com.google.android.apps.gsa.shared.util.debug.p7166b.C91018d;
import com.google.android.apps.gsa.shared.util.p7158b.C90752i;
import com.google.android.apps.gsa.shared.util.p7158b.C90755l;
import com.google.android.apps.gsa.shared.util.p7159c.C90873ag;
import com.google.android.apps.gsa.shared.util.p7159c.C90929bz;
import com.google.android.apps.gsa.staticplugins.nga.p8092ui.p8095b.C104149a;
import com.google.android.apps.gsa.staticplugins.opa.chatui.C108303dt;
import com.google.android.apps.gsa.staticplugins.opa.chatui.C108331et;
import com.google.android.apps.gsa.staticplugins.opa.chatui.p8353a.C108198f;
import com.google.android.apps.gsa.staticplugins.opa.chatui.p8353a.C108199g;
import com.google.android.apps.gsa.staticplugins.opa.chatui.p8353a.C108200h;
import com.google.android.apps.gsa.staticplugins.opa.chatui.p8353a.C108202j;
import com.google.android.apps.gsa.staticplugins.opa.greeting.C109100ar;
import com.google.android.apps.gsa.staticplugins.opa.greeting.C109105b;
import com.google.android.apps.gsa.staticplugins.opa.inproducthelp.ChatUiHelpController;
import com.google.android.apps.gsa.staticplugins.opa.p8183ag.C106158g;
import com.google.android.apps.gsa.staticplugins.opa.p8185ah.C106171l;
import com.google.android.apps.gsa.staticplugins.opa.p8189ak.p8202d.p8203a.C106318a;
import com.google.android.apps.gsa.staticplugins.opa.p8282ap.C107144k;
import com.google.android.apps.gsa.staticplugins.opa.p8300as.p8301a.C107460a;
import com.google.android.apps.gsa.staticplugins.opa.p8300as.p8301a.C107502c;
import com.google.android.apps.gsa.staticplugins.opa.p8300as.p8301a.C107503d;
import com.google.android.apps.gsa.staticplugins.opa.p8300as.p8301a.C107504e;
import com.google.android.apps.gsa.staticplugins.opa.p8310av.C107621a;
import com.google.android.apps.gsa.staticplugins.opa.p8313ay.C107656ap;
import com.google.android.apps.gsa.staticplugins.opa.p8313ay.C107659as;
import com.google.android.apps.gsa.staticplugins.opa.p8315az.C107703n;
import com.google.android.apps.gsa.staticplugins.opa.p8315az.C107705p;
import com.google.android.apps.gsa.staticplugins.opa.p8315az.C107709t;
import com.google.android.apps.gsa.staticplugins.opa.p8364g.C109063f;
import com.google.android.apps.gsa.staticplugins.opa.util.C113793bi;
import com.google.android.apps.gsa.staticplugins.opa.util.C113798bn;
import com.google.android.apps.gsa.staticplugins.opa.util.C113854ci;
import com.google.android.apps.gsa.staticplugins.opa.util.C113863cr;
import com.google.android.apps.gsa.staticplugins.opa.valyrian.p8598c.C113988g;
import com.google.android.apps.gsa.staticplugins.opa.valyrian.p8598c.C113989h;
import com.google.android.apps.gsa.staticplugins.opa.zerostate.p8632f.C114735e;
import com.google.android.apps.gsa.staticplugins.opa.zerostate.p8632f.C114737g;
import com.google.android.apps.gsa.staticplugins.opa.zerostate.p8634h.C114748b;
import com.google.android.apps.search.assistant.surfaces.voice.titan.sidepanel.p9743ui.drltranscription.impl.C128686a;
import com.google.android.apps.search.assistant.surfaces.voice.titan.sidepanel.p9743ui.drltranscription.impl.TranscriptionProxyImpl$register$1;
import com.google.android.apps.search.assistant.surfaces.voice.titan.sidepanel.p9743ui.voiceplatevisibility.impl.C128687a;
import com.google.android.apps.search.assistant.surfaces.voice.titan.sidepanel.p9743ui.voiceplatevisibility.impl.VoicePlateVisibilityProxyImpl$register$1;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.android.libraries.gsa.p1876k.C22872h;
import com.google.android.libraries.material.featurehighlight.C28522d;
import com.google.android.libraries.p1635au.C19567d;
import com.google.android.libraries.p1649b.p1653d.C19623a;
import com.google.android.libraries.p1649b.p1655f.C19628b;
import com.google.android.libraries.p1730f.p1731a.C21374d;
import com.google.android.libraries.search.logging.appflows.startup.p3037a.C38802e;
import com.google.android.libraries.search.logging.p3041d.C39141kp;
import com.google.android.play.core.p3534f.C45111s;
import com.google.apps.tiktok.inject.C47266f;
import com.google.apps.tiktok.tracing.C47538ax;
import com.google.apps.tiktok.tracing.C47770dh;
import com.google.common.base.C58833ax;
import com.google.common.base.C58847bk;
import com.google.common.p4522b.C58528ij;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.p4552o.C59582aj;
import com.google.common.p4552o.C59687cb;
import com.google.common.util.concurrent.C60870cx;
import dagger.C68214a;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import p3186j$.time.Duration;
import p5462h.p5473f.p5475b.C69664n;

/* compiled from: PG */
public class OpaActivity extends C0395p implements C109042fl, C109716mu, C28522d, C90991b {

    /* renamed from: Z */
    private static final Duration f295609Z = Duration.ofSeconds(2);

    /* renamed from: aa */
    private static final C58528ij f295610aa = C58528ij.m90012L("client_input", "opa-query", "opa-query-string");

    /* renamed from: ab */
    private static final C58528ij f295611ab = C58528ij.m90012L(C89849ae.OPA_ACTIVITY_DISMISS_AUTO_TIMER, C89849ae.OPA_ACTIVITY_DISMISS_OTHER, C89849ae.OPA_ACTIVITY_DISMISS_RELAUNCH);

    /* renamed from: ac */
    private static final C58528ij f295612ac = C58528ij.m90013M(C89849ae.OPA_ACTIVITY_DISMISS_CLICK_OUT, C89849ae.OPA_ACTIVITY_DISMISS_DRAG, C89849ae.OPA_ACTIVITY_DISMISS_FLING, C89849ae.OPA_ACTIVITY_DISMISS_HOME);

    /* renamed from: ad */
    private static long f295613ad = -1;

    /* renamed from: j */
    public static final C59071e f295614j = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.opa.OpaActivity");

    /* renamed from: A */
    public C58833ax f295615A;

    /* renamed from: B */
    public C68214a f295616B;

    /* renamed from: C */
    public C58833ax f295617C;

    /* renamed from: D */
    public C38802e f295618D;

    /* renamed from: E */
    public C109714ms f295619E;

    /* renamed from: F */
    public C89150g f295620F;

    /* renamed from: G */
    public boolean f295621G;

    /* renamed from: H */
    public C108202j f295622H;

    /* renamed from: I */
    public C106171l f295623I;

    /* renamed from: J */
    public C87571n f295624J;

    /* renamed from: K */
    public C114748b f295625K;

    /* renamed from: L */
    public C109063f f295626L;

    /* renamed from: M */
    public C107621a f295627M;

    /* renamed from: N */
    public C68214a f295628N;

    /* renamed from: O */
    public C68214a f295629O;

    /* renamed from: P */
    public boolean f295630P;

    /* renamed from: Q */
    public C89143o f295631Q;

    /* renamed from: R */
    public C39141kp f295632R;

    /* renamed from: S */
    public C47770dh f295633S;

    /* renamed from: T */
    public C109452ly f295634T;

    /* renamed from: U */
    public boolean f295635U = false;

    /* renamed from: V */
    public boolean f295636V;

    /* renamed from: W */
    C60870cx f295637W = null;

    /* renamed from: X */
    public C104149a f295638X;

    /* renamed from: Y */
    public C106318a f295639Y;

    /* renamed from: ae */
    private final C83363m f295640ae = new C83363m();

    /* renamed from: af */
    private C109444lq f295641af;

    /* renamed from: ag */
    private Map f295642ag;

    /* renamed from: ah */
    private boolean f295643ah = true;

    /* renamed from: ai */
    private boolean f295644ai = false;

    /* renamed from: aj */
    private boolean f295645aj = false;

    /* renamed from: ak */
    private boolean f295646ak = false;

    /* renamed from: al */
    private boolean f295647al = false;

    /* renamed from: am */
    private Bundle f295648am;

    /* renamed from: an */
    private Bundle f295649an;

    /* renamed from: ao */
    private long f295650ao;

    /* renamed from: ap */
    private boolean f295651ap;

    /* renamed from: aq */
    private boolean f295652aq;

    /* renamed from: ar */
    private boolean f295653ar;

    /* renamed from: as */
    private boolean f295654as;

    /* renamed from: at */
    private boolean f295655at;

    /* renamed from: au */
    private boolean f295656au;

    /* renamed from: k */
    AtomicBoolean f295657k = new AtomicBoolean(true);

    /* renamed from: l */
    public C22871g f295658l;

    /* renamed from: m */
    public C68214a f295659m;

    /* renamed from: n */
    public C109453lz f295660n;

    /* renamed from: o */
    public C9321i f295661o;

    /* renamed from: p */
    public C84516aa f295662p;

    /* renamed from: q */
    public C86124t f295663q;

    /* renamed from: r */
    public C68214a f295664r;

    /* renamed from: s */
    public C90929bz f295665s;

    /* renamed from: t */
    public C22871g f295666t;

    /* renamed from: u */
    public C113863cr f295667u;

    /* renamed from: v */
    public C68214a f295668v;

    /* renamed from: w */
    public C114735e f295669w;

    /* renamed from: x */
    public C58833ax f295670x;

    /* renamed from: y */
    public C58833ax f295671y;

    /* renamed from: z */
    public C68214a f295672z;

    /* renamed from: com.google.android.apps.gsa.staticplugins.opa.OpaActivity$a */
    /* compiled from: PG */
    public interface C105906a {
        /* renamed from: aP */
        C109445lr mo95168aP();

        /* renamed from: ay */
        C86124t mo95169ay();
    }

    /* renamed from: com.google.android.apps.gsa.staticplugins.opa.OpaActivity$b */
    /* compiled from: PG */
    public interface C105907b {
        /* renamed from: qz */
        void mo95170qz(C109443lp lpVar);
    }

    /* renamed from: D */
    private final Bundle m176442D(Intent intent) {
        long j;
        Bundle B = C87566i.m142227B(intent);
        this.f295648am = B;
        this.f295649an = B;
        this.f295647al = true;
        C58976aa aaVar = C58975e.f156826a;
        Bundle bundle = this.f295649an;
        if (bundle != null && C87566i.m142319r(bundle) == 0) {
            C107709t tVar = this.f295634T.f304825l;
            if (tVar.f299726c) {
                j = ((C107703n) ((C107705p) tVar.f299725b.mo27525b()).f299712a.mo27525b()).mo96222a();
            } else {
                j = tVar.f299724a.mo98047a().f237001q;
            }
            bundle.putLong("HandoverId", j);
        }
        if (this.f295650ao == 0) {
            this.f295650ao = C87566i.m142314m(this.f295649an);
        }
        if (C87566i.m142316o(this.f295649an) != 0) {
            this.f295667u.f315277a = C87566i.m142316o(this.f295649an);
        }
        return this.f295649an;
    }

    /* renamed from: E */
    private final String m176443E(Intent intent) {
        if (intent == null) {
            return null;
        }
        String M = C87566i.m142238M(intent.getExtras());
        if (C87566i.m142287ak(this.f295649an)) {
            return null;
        }
        return M;
    }

    /* renamed from: F */
    private final void m176444F() {
        if (this.f295656au) {
            C0401v.m1321C();
        } else {
            mo1322k().mo1191s(1);
        }
    }

    /* renamed from: G */
    private static void m176445G(Bundle bundle, C91006f fVar) {
        for (String str : bundle.keySet()) {
            Object obj = bundle.get(str);
            if (obj instanceof Bundle) {
                C91006f e = fVar.mo85281e((Object) null);
                e.mo85291r(str);
                m176445G((Bundle) obj, e);
            } else if (obj instanceof C90991b) {
                fVar.mo85289p(str, (C90991b) obj);
            } else {
                fVar.mo85279c(str).mo85276a(f295610aa.contains(str) ? C90752i.m148234h(obj) : C90752i.m148231e(obj));
            }
        }
    }

    /* renamed from: H */
    private final void m176446H() {
        if (this.f295637W != null) {
            C58976aa aaVar = C58975e.f156826a;
            this.f295637W.cancel(false);
            this.f295637W = null;
        }
    }

    /* renamed from: I */
    private final void m176447I(C89849ae aeVar) {
        C58976aa aaVar = C58975e.f156826a;
        if (!this.f295655at) {
            this.f295655at = true;
            ((C89859i) this.f295668v.mo27525b()).mo83702b(aeVar);
            if (this.f295663q.mo79746e(C90063do.f249517ey)) {
                this.f295634T.f304827n.f303238X.mo96107F();
            }
            if (((C58833ax) this.f295659m.mo27525b()).mo56113h()) {
                new C90873ag(((C84235h) ((C58833ax) this.f295659m.mo27525b()).mo56107c()).mo77714d(aeVar), this.f295658l, "cache OPA cancellation signal", C109435lh.f304763a).mo85223a(C109436li.f304764a);
            }
        }
    }

    /* renamed from: J */
    private final void m176448J(boolean z) {
        C22872h.m42744d(C0826b.class);
        this.f295636V = z;
        C22871g gVar = this.f295666t;
        gVar.mo28212l("setRetainInRecents:" + z, new C109434lg(this));
    }

    /* renamed from: K */
    private final boolean m176449K() {
        C109452ly lyVar = this.f295634T;
        return lyVar != null && lyVar.mo97836n();
    }

    /* renamed from: L */
    private final boolean m176450L() {
        boolean z = false;
        if (this.f295663q.mo79746e(C90014bt.f247393gM) && C87566i.m142298av(this.f295649an) && !this.f295623I.mo95342f()) {
            C58976aa aaVar = C58975e.f156826a;
            return false;
        } else if (C87566i.m142257aE(this.f295649an)) {
            return true;
        } else {
            boolean z2 = C87566i.m142298av(this.f295649an) && this.f295662p.mo78228b() && this.f295646ak && !this.f295647al;
            boolean ac = C87566i.m142279ac(this.f295649an);
            if (this.f295643ah) {
                C58976aa aaVar2 = C58975e.f156826a;
                return false;
            }
            if (!z2) {
                if (ac) {
                    if (!this.f295645aj) {
                        C58976aa aaVar3 = C58975e.f156826a;
                        return false;
                    } else if (C87566i.m142298av(this.f295649an)) {
                        C58976aa aaVar4 = C58975e.f156826a;
                    }
                }
                if (!C87566i.m142282af(this.f295649an) && !C87566i.m142297au(this.f295649an) && !C87566i.m142294ar(this.f295649an) && !C87566i.m142298av(this.f295649an) && !C87566i.m142296at(this.f295649an) && !C87566i.m142302az(this.f295649an)) {
                    z = true;
                }
                C58976aa aaVar5 = C58975e.f156826a;
                return z;
            }
            return true;
        }
    }

    /* renamed from: A */
    public final void mo95148A(int i, int i2, Intent intent, Bundle bundle) {
        if (i == 0) {
            Bundle bundle2 = this.f295649an;
            if (bundle2 != null) {
                bundle2.putInt("requested_mic_state", 4);
            }
            i = 0;
        }
        this.f295634T.mo95148A(i, i2, intent, bundle);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: B */
    public final void mo95149B() {
        this.f295634T.mo97837p();
    }

    /* renamed from: C */
    public final boolean mo95150C() {
        if (this.f295652aq || !C87566i.m142298av(this.f295649an)) {
            boolean z = ((bf) ((C83361k) this.f295639Y.f296619a).f227199b.get()).g;
            C58976aa aaVar = C58975e.f156826a;
            return z;
        }
        C58976aa aaVar2 = C58975e.f156826a;
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0008, code lost:
        r3 = ((com.google.android.apps.gsa.staticplugins.opa.C109258hw) r1.f303912g.mo6453a()).mo34068a(r3);
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.libraries.material.featurehighlight.C28521c mo34068a(java.lang.String r3) {
        /*
            r2 = this;
            com.google.android.apps.gsa.staticplugins.opa.ly r0 = r2.f295634T
            com.google.android.apps.gsa.staticplugins.opa.fj r0 = r0.f304827n
            com.google.android.apps.gsa.staticplugins.opa.h r1 = r0.f303236V
            if (r1 == 0) goto L_0x0017
            com.google.common.base.cr r1 = r1.f303912g
            java.lang.Object r1 = r1.mo6453a()
            com.google.android.apps.gsa.staticplugins.opa.hw r1 = (com.google.android.apps.gsa.staticplugins.opa.C109258hw) r1
            com.google.android.libraries.material.featurehighlight.c r3 = r1.mo34068a(r3)
            if (r3 == 0) goto L_0x0017
            return r3
        L_0x0017:
            com.google.android.libraries.material.featurehighlight.c r3 = r0.f303215A
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.staticplugins.opa.OpaActivity.mo34068a(java.lang.String):com.google.android.libraries.material.featurehighlight.c");
    }

    /* access modifiers changed from: protected */
    public final void attachBaseContext(Context context) {
        try {
            C105906a aVar = (C105906a) C47266f.m84076a(context, C105906a.class);
            if (aVar.mo95169ay().mo79746e(C90044cw.f248748w)) {
                Configuration configuration = new Configuration(context.getResources().getConfiguration());
                configuration.setLocale(C1897j.m5167d(C1894g.m5157a(aVar.mo95168aP().mo65322a().getConfiguration())).f5774b.f5775a.get(0));
                super.attachBaseContext(context.createConfigurationContext(configuration));
            } else {
                super.attachBaseContext(context);
            }
        } catch (IllegalStateException unused) {
            super.attachBaseContext(context);
        }
        C90476a aVar2 = C91018d.f254254a;
        C45111s sVar = (C45111s) C45111s.f117782a.get();
        if (sVar == null) {
            if (getApplicationContext() != null) {
                C45111s.m80290c(getApplicationContext(), false);
            }
            C45111s.m80290c(this, false);
            return;
        }
        sVar.f117784c.mo48914c(this, sVar.mo48943a());
    }

    /* renamed from: b */
    public final void mo95151b() {
        mo95167z(C89849ae.OPA_ACTIVITY_DISMISS_OTHER);
    }

    /* renamed from: c */
    public final void mo95152c(int i) {
        C58976aa aaVar = C58975e.f156826a;
        if (i > 0) {
            m176446H();
            this.f295637W = this.f295666t.mo28208h("dismissOpaOnNoUserInteraction", (long) i, new C109437lj(this));
        }
    }

    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        C58976aa aaVar = C58975e.f156826a;
        C109452ly lyVar = this.f295634T;
        if (lyVar.f304833t != C88134qk.UNINITIALIZED) {
            C109040fj fjVar = lyVar.f304827n;
            if (fjVar.f303302bI) {
                fjVar.f303301bH = false;
            }
            int actionMasked = motionEvent.getActionMasked();
            if ((actionMasked == 1 || actionMasked == 3) && C109040fj.m181378bx(fjVar.f303450o)) {
                if (fjVar.f303371cc && fjVar.f303370cb && C109040fj.m181378bx(fjVar.f303450o) && fjVar.f303449n.getVisibility() == 8) {
                    C59104x b = C109040fj.f303210a.mo56224b();
                    b.mo56378ag(C58975e.f156826a, "ChatUiController");
                    ((C59052c) ((C59052c) b).mo56372aa(22689)).mo56386p("Scrim click dismiss invisible activity");
                    fjVar.f303448m.mo28212l("OPA_ACTIVITY_DISMISS_CLICK_OUT", new C108134ch(fjVar));
                }
                C113989h hVar = (C113989h) ((C113988g) fjVar.f303450o).mo100833bf().mo56107c();
                hVar.mo100849bK(motionEvent, motionEvent, 0.0f, 0.0f);
                hVar.mo100902dF(motionEvent, motionEvent);
            }
            fjVar.f303291ay.f6015a.f6014a.onTouchEvent(motionEvent);
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    /* renamed from: e */
    public final void mo95154e() {
        m176448J(true);
    }

    public final void finish() {
        C109452ly lyVar = this.f295634T;
        if (lyVar != null) {
            lyVar.f304827n.mo97515bg(new C109433lf(this));
            return;
        }
        super.finish();
        if (m176449K()) {
            overridePendingTransition(R.anim.use_bottom_z_order_without_animation, R.anim.fade_out_tapas);
        }
    }

    public final void finishAndRemoveTask() {
        C109452ly lyVar = this.f295634T;
        if (lyVar != null) {
            lyVar.f304827n.mo97515bg(new C109438lk(this));
            return;
        }
        super.finishAndRemoveTask();
    }

    /* renamed from: gS */
    public final void mo17602gS(C91006f fVar) {
        fVar.mo85291r("OpaActivity");
        fVar.mo85286m(this.f295634T);
        fVar.mo85279c("darkmodeEnabled").mo85276a(C90752i.m148228b(Boolean.valueOf(this.f295656au)));
        fVar.mo85279c("themeName").mo85276a(C90752i.m148229c(getTheme().getResources().toString()));
        C91006f e = fVar.mo85281e((Object) null);
        e.mo85291r("mostRecentIntentExtras");
        Bundle bundle = this.f295648am;
        if (bundle != null) {
            m176445G(bundle, e);
        }
        C91006f e2 = fVar.mo85281e((Object) null);
        e2.mo85291r("savedState");
        Bundle bundle2 = this.f295649an;
        if (bundle2 != null) {
            m176445G(bundle2, e2);
        }
    }

    /* renamed from: jv */
    public final void mo95157jv() {
        Method method;
        C58976aa aaVar = C58975e.f156826a;
        if (!C90685b.m148054b(this, this.f295663q)) {
            this.f295654as = true;
            Class[] clsArr = new Class[0];
            Object[] objArr = new Object[0];
            try {
                if (this.f295642ag == null) {
                    this.f295642ag = new HashMap();
                }
                if (this.f295642ag.containsKey("convertFromTranslucent")) {
                    method = (Method) this.f295642ag.get("convertFromTranslucent");
                } else {
                    method = getClass().getMethod("convertFromTranslucent", clsArr);
                    this.f295642ag.put("convertFromTranslucent", method);
                }
                method.invoke(this, objArr);
            } catch (NoSuchMethodException e) {
                C59104x d = f295614j.mo56226d();
                d.mo56378ag(C58975e.f156826a, "OpaActivity");
                ((C59052c) ((C59052c) ((C59052c) d).mo56382g(e)).mo56372aa(22880)).mo56389s("Unable to find method %s", "convertFromTranslucent");
                int i = C90755l.f253831a;
            } catch (IllegalAccessException e2) {
                C59104x d2 = f295614j.mo56226d();
                d2.mo56378ag(C58975e.f156826a, "OpaActivity");
                ((C59052c) ((C59052c) ((C59052c) d2).mo56382g(e2)).mo56372aa(22881)).mo56389s("Not allowed to method %s", "convertFromTranslucent");
                int i2 = C90755l.f253831a;
            } catch (InvocationTargetException e3) {
                C59104x d3 = f295614j.mo56226d();
                d3.mo56378ag(C58975e.f156826a, "OpaActivity");
                ((C59052c) ((C59052c) ((C59052c) d3).mo56382g(e3)).mo56372aa(22882)).mo56389s("Unable to invoke method %s", "convertFromTranslucent");
                int i3 = C90755l.f253831a;
            } catch (RuntimeException e4) {
                C59104x d4 = f295614j.mo56226d();
                d4.mo56378ag(C58975e.f156826a, "OpaActivity");
                ((C59052c) ((C59052c) ((C59052c) d4).mo56382g(e4)).mo56372aa(22883)).mo56389s("Runtime error in calling method %s", "convertFromTranslucent");
                int i4 = C90755l.f253831a;
            }
        }
    }

    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        this.f295641af.mo85356g(i, i2, intent, this.f295634T.mo97827a());
    }

    /* JADX WARNING: Removed duplicated region for block: B:26:0x0097  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x009a  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00b3  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00b7  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00c0  */
    /* JADX WARNING: Removed duplicated region for block: B:39:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onBackPressed() {
        /*
            r6 = this;
            com.google.android.apps.gsa.staticplugins.opa.ly r0 = r6.f295634T
            com.google.android.apps.gsa.search.shared.service.b.qk r1 = r0.f304833t
            com.google.android.apps.gsa.search.shared.service.b.qk r2 = com.google.android.apps.gsa.search.shared.service.p6935b.C88134qk.MODE_CHAT
            r3 = 0
            r4 = 1
            if (r1 != r2) goto L_0x0023
            com.google.android.apps.gsa.staticplugins.opa.fj r1 = r0.f304827n
            com.google.android.apps.gsa.staticplugins.opa.b r1 = r1.f303237W
            boolean r1 = r1.mo96244e()
            if (r1 == 0) goto L_0x0023
            com.google.android.apps.gsa.search.shared.ui.actions.h r0 = r0.f304828o
            com.google.android.apps.gsa.staticplugins.immersiveactions.n r0 = (com.google.android.apps.gsa.staticplugins.immersiveactions.C102424n) r0
            com.google.android.apps.gsa.staticplugins.immersiveactions.aj r0 = r0.f285852a
            com.google.android.apps.gsa.search.shared.ui.actions.a r0 = r0.f285819f
            if (r0 == 0) goto L_0x0088
            boolean r3 = r0.mo82063z()
            goto L_0x0088
        L_0x0023:
            com.google.android.apps.gsa.search.core.i.t r1 = r0.f304818e
            com.google.android.apps.gsa.shared.m.d r2 = com.google.android.apps.gsa.shared.p7066m.C90014bt.f247357fd
            boolean r1 = r1.mo79746e(r2)
            if (r1 == 0) goto L_0x003a
            android.os.Bundle r1 = r0.f304836w
            com.google.android.apps.gsa.shared.search.QueryTriggerType r1 = com.google.android.apps.gsa.search.shared.p6930h.C87566i.m142232G(r1)
            com.google.android.apps.gsa.shared.search.QueryTriggerType r2 = com.google.android.apps.gsa.shared.search.QueryTriggerType.OPA_HQ_SUGGESTION_CHIP
            if (r1 != r2) goto L_0x003a
            com.google.common.f.aa r0 = com.google.common.p4526f.p4527a.C58975e.f156826a
            goto L_0x008a
        L_0x003a:
            com.google.android.apps.gsa.staticplugins.opa.fj r0 = r0.f304827n
            com.google.android.apps.gsa.staticplugins.opa.v.t r1 = r0.f303320ba
            com.google.common.f.aa r2 = com.google.common.p4526f.p4527a.C58975e.f156826a
            com.google.android.apps.gsa.shared.logger.b.ae r2 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.OPA_ENDSTATE_CANCEL_BACK_PRESSED
            com.google.common.base.b r5 = com.google.common.base.C58836b.f156633a
            r1.mo100764h(r2, r5, r5, r5)
            com.google.android.apps.gsa.staticplugins.opa.ap.k r1 = r0.f303240Z
            com.google.android.apps.gsa.staticplugins.opa.ao.a r2 = r1.f298232k
            r2.mo95793b()
            com.google.android.apps.gsa.staticplugins.opa.imageviewer.g r2 = r1.f298227f
            boolean r2 = r2.mo97744a()
            if (r2 == 0) goto L_0x0058
        L_0x0056:
            r3 = 1
            goto L_0x0088
        L_0x0058:
            com.google.android.apps.gsa.staticplugins.opa.ap.w r2 = r1.f298228g
            com.google.android.apps.gsa.staticplugins.opa.ff r5 = r1.f298233l
            boolean r2 = r2.mo95818m(r5)
            if (r2 == 0) goto L_0x0063
            goto L_0x0056
        L_0x0063:
            boolean r1 = r1.mo95806l()
            if (r1 == 0) goto L_0x006a
            goto L_0x0056
        L_0x006a:
            com.google.android.apps.gsa.staticplugins.opa.chatui.ba r1 = r0.f303450o
            boolean r1 = com.google.android.apps.gsa.staticplugins.opa.C109040fj.m181378bx(r1)
            if (r1 != 0) goto L_0x0073
            goto L_0x0088
        L_0x0073:
            com.google.android.apps.gsa.staticplugins.opa.chatui.ba r0 = r0.f303450o
            com.google.android.apps.gsa.staticplugins.opa.valyrian.c.g r0 = (com.google.android.apps.gsa.staticplugins.opa.valyrian.p8598c.C113988g) r0
            com.google.common.base.ax r0 = r0.mo100833bf()
            java.lang.Object r0 = r0.mo56107c()
            com.google.android.apps.gsa.staticplugins.opa.valyrian.c.h r0 = (com.google.android.apps.gsa.staticplugins.opa.valyrian.p8598c.C113989h) r0
            boolean r0 = r0.mo100914ds()
            if (r0 == 0) goto L_0x0088
            goto L_0x0056
        L_0x0088:
            if (r3 != 0) goto L_0x00c9
        L_0x008a:
            com.google.android.apps.gsa.shared.ah.g r0 = r6.f295620F
            r0.mo83138l()
            com.google.android.apps.gsa.staticplugins.opa.ly r0 = r6.f295634T
            boolean r0 = r0.mo97836n()
            if (r0 == 0) goto L_0x009a
            com.google.android.apps.gsa.shared.logger.b.ae r0 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.OPA_ACTIVITY_DISMISS_BACK_FROM_TAPAS
            goto L_0x009c
        L_0x009a:
            com.google.android.apps.gsa.shared.logger.b.ae r0 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.OPA_ACTIVITY_DISMISS_BACK
        L_0x009c:
            r6.m176447I(r0)
            com.google.android.apps.gsa.search.core.i.t r0 = r6.f295663q
            com.google.android.apps.gsa.shared.m.d r1 = com.google.android.apps.gsa.shared.p7066m.C90014bt.f247778na
            boolean r0 = r0.mo79746e(r1)
            if (r0 == 0) goto L_0x00b7
            com.google.android.apps.gsa.search.core.i.t r0 = r6.f295663q
            com.google.android.apps.gsa.shared.m.d r1 = com.google.android.apps.gsa.shared.p7066m.C90029ch.f248201O
            boolean r0 = r0.mo79746e(r1)
            if (r0 == 0) goto L_0x00b7
            r6.moveTaskToBack(r4)
            goto L_0x00bc
        L_0x00b7:
            androidx.activity.OnBackPressedDispatcher r0 = r6.f2707h
            r0.mo3340c()
        L_0x00bc:
            boolean r0 = r6.f295621G
            if (r0 == 0) goto L_0x00c9
            r0 = 2130772185(0x7f0100d9, float:1.7147481E38)
            r1 = 2130772167(0x7f0100c7, float:1.7147445E38)
            r6.overridePendingTransition(r0, r1)
        L_0x00c9:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.staticplugins.opa.OpaActivity.onBackPressed():void");
    }

    public final void onConfigurationChanged(Configuration configuration) {
        C59104x b = f295614j.mo56224b();
        b.mo56378ag(C58975e.f156826a, "OpaActivity");
        ((C59052c) ((C59052c) b).mo56372aa(22890)).mo56386p("onConfigurationChanged");
        super.onConfigurationChanged(configuration);
        m176444F();
        C109452ly lyVar = this.f295634T;
        lyVar.mo97829g();
        C109040fj fjVar = lyVar.f304827n;
        if (fjVar.f303455t.mo79746e(C90029ch.f248258as)) {
            fjVar.mo97465aa(configuration);
            fjVar.f303449n.getViewTreeObserver().addOnGlobalLayoutListener(new C108131ce(fjVar));
        }
        if (fjVar.f303262aV.mo95240v()) {
            fjVar.f303262aV.mo95232n(configuration);
        }
        fjVar.mo97512bd(false);
        if (fjVar.mo97528bv() && !fjVar.f303455t.mo79746e(C90029ch.f248258as)) {
            fjVar.mo97465aa(configuration);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:100:0x0818 A[Catch:{ all -> 0x0a12 }, LOOP:1: B:98:0x0814->B:100:0x0818, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:103:0x086a A[Catch:{ all -> 0x0a12 }] */
    /* JADX WARNING: Removed duplicated region for block: B:106:0x0897 A[Catch:{ all -> 0x0a12 }] */
    /* JADX WARNING: Removed duplicated region for block: B:111:0x08d7 A[Catch:{ all -> 0x0a12 }] */
    /* JADX WARNING: Removed duplicated region for block: B:112:0x08dc A[Catch:{ all -> 0x0a12 }] */
    /* JADX WARNING: Removed duplicated region for block: B:117:0x08f9 A[Catch:{ all -> 0x0a12 }] */
    /* JADX WARNING: Removed duplicated region for block: B:118:0x08fb A[Catch:{ all -> 0x0a12 }] */
    /* JADX WARNING: Removed duplicated region for block: B:123:0x0910 A[Catch:{ all -> 0x0a12 }] */
    /* JADX WARNING: Removed duplicated region for block: B:124:0x0917 A[Catch:{ all -> 0x0a12 }] */
    /* JADX WARNING: Removed duplicated region for block: B:134:0x0946 A[Catch:{ all -> 0x0a12 }] */
    /* JADX WARNING: Removed duplicated region for block: B:135:0x0947 A[Catch:{ all -> 0x0a12 }] */
    /* JADX WARNING: Removed duplicated region for block: B:139:0x0960 A[Catch:{ all -> 0x0a12 }] */
    /* JADX WARNING: Removed duplicated region for block: B:143:0x0975 A[Catch:{ all -> 0x0a12 }] */
    /* JADX WARNING: Removed duplicated region for block: B:146:0x09ab A[Catch:{ all -> 0x0a12 }] */
    /* JADX WARNING: Removed duplicated region for block: B:149:0x09c0 A[Catch:{ all -> 0x0a12 }] */
    /* JADX WARNING: Removed duplicated region for block: B:157:0x0a0e  */
    /* JADX WARNING: Removed duplicated region for block: B:165:0x0a1d A[SYNTHETIC, Splitter:B:165:0x0a1d] */
    /* JADX WARNING: Removed duplicated region for block: B:174:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x04a6  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x0723 A[Catch:{ all -> 0x0a12 }] */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x0772 A[Catch:{ all -> 0x0a12 }] */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x07ba A[Catch:{ all -> 0x0a12 }] */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x07bf  */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x07c4 A[SYNTHETIC, Splitter:B:86:0x07c4] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onCreate(android.os.Bundle r58) {
        /*
            r57 = this;
            r15 = r57
            com.google.android.apps.gsa.e.f r0 = com.google.android.apps.gsa.e.f.ai
            com.google.android.apps.gsa.p5846e.C74504a.m120462a(r0)
            long r0 = com.google.android.libraries.p1730f.p1731a.C21374d.m40426a()
            j$.time.Duration r0 = p3186j$.time.Duration.ofNanos(r0)
            com.google.common.f.e r1 = f295614j
            com.google.common.f.x r1 = r1.mo56224b()
            com.google.common.f.aa r2 = com.google.common.p4526f.p4527a.C58975e.f156826a
            java.lang.String r3 = "OpaActivity"
            r1.mo56378ag(r2, r3)
            r2 = 22893(0x596d, float:3.208E-41)
            java.lang.String r3 = "onCreate"
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r1).mo56372aa(r2)).mo56386p(r3)
            r1 = 31
            com.google.android.apps.gsa.shared.logger.C89838ab.m146266j(r1)
            r14 = 0
            r15.f295655at = r14
            super.onCreate(r58)
            com.google.android.apps.gsa.staticplugins.opa.lq r1 = new com.google.android.apps.gsa.staticplugins.opa.lq
            r1.<init>(r15)
            r15.f295641af = r1
            com.google.android.apps.gsa.staticplugins.opa.lp r1 = new com.google.android.apps.gsa.staticplugins.opa.lp
            r1.<init>(r15)
            com.google.android.apps.gsa.binaries.satin.app.afc r2 = r1.f304772b
            if (r2 != 0) goto L_0x004b
            android.content.Context r2 = r1.f304771a
            java.lang.Class<com.google.android.apps.gsa.staticplugins.opa.OpaActivity$b> r4 = com.google.android.apps.gsa.staticplugins.opa.OpaActivity.C105907b.class
            java.lang.Object r2 = com.google.apps.tiktok.inject.C47266f.m84076a(r2, r4)
            com.google.android.apps.gsa.staticplugins.opa.OpaActivity$b r2 = (com.google.android.apps.gsa.staticplugins.opa.OpaActivity.C105907b) r2
            r2.mo95170qz(r1)
        L_0x004b:
            com.google.android.apps.gsa.binaries.satin.app.afc r1 = r1.f304772b
            r1.f195597b = r15
            com.google.android.apps.gsa.staticplugins.opa.lq r2 = r15.f295641af
            r2.getClass()
            r1.f195599d = r2
            r1.f195600e = r2
            r1.f195598c = r15
            android.support.v4.app.am r2 = r1.f195597b
            java.lang.Class<android.support.v4.app.am> r4 = android.support.p031v4.app.C0167am.class
            dagger.p5294a.C68225k.m98529a(r2, r4)
            com.google.android.apps.gsa.staticplugins.opa.valyrian.c.a r2 = r1.f195598c
            java.lang.Class<com.google.android.apps.gsa.staticplugins.opa.valyrian.c.a> r4 = com.google.android.apps.gsa.staticplugins.opa.valyrian.p8598c.C113982a.class
            dagger.p5294a.C68225k.m98529a(r2, r4)
            com.google.android.apps.gsa.shared.util.t.g r2 = r1.f195599d
            java.lang.Class<com.google.android.apps.gsa.shared.util.t.g> r4 = com.google.android.apps.gsa.shared.util.p7184t.C91097g.class
            dagger.p5294a.C68225k.m98529a(r2, r4)
            com.google.android.apps.gsa.shared.util.permissions.f r2 = r1.f195600e
            java.lang.Class<com.google.android.apps.gsa.shared.util.permissions.f> r4 = com.google.android.apps.gsa.shared.util.permissions.C91079f.class
            dagger.p5294a.C68225k.m98529a(r2, r4)
            com.google.android.apps.gsa.binaries.satin.app.afe r2 = new com.google.android.apps.gsa.binaries.satin.app.afe
            com.google.android.apps.gsa.binaries.satin.app.aqy r6 = r1.f195596a
            com.google.android.libraries.elements.d.d.o r7 = new com.google.android.libraries.elements.d.d.o
            r7.<init>()
            android.support.v4.app.am r8 = r1.f195597b
            com.google.android.apps.gsa.staticplugins.opa.valyrian.c.a r9 = r1.f195598c
            com.google.android.apps.gsa.shared.util.t.g r10 = r1.f195599d
            r5 = r2
            r5.<init>(r6, r7, r8, r9, r10)
            com.google.android.apps.gsa.binaries.satin.app.aqy r1 = r2.f195627a
            g.a.a r1 = r1.aW
            java.lang.Object r1 = r1.mo17428b()
            com.google.android.libraries.gsa.k.g r1 = (com.google.android.libraries.gsa.p1876k.C22871g) r1
            r15.f295658l = r1
            g.a.a r1 = r2.f195680b
            dagger.a r1 = dagger.p5294a.C68219e.m98518a(r1)
            r15.f295659m = r1
            com.google.android.apps.gsa.staticplugins.opa.lz r1 = new com.google.android.apps.gsa.staticplugins.opa.lz
            r16 = r1
            g.a.a r4 = r2.f195733c
            r17 = r4
            g.a.a r4 = r2.f195614N
            r18 = r4
            g.a.a r4 = r2.f195615O
            r19 = r4
            g.a.a r4 = r2.f195621U
            g.a.a r20 = dagger.p5294a.C68226l.m98533a(r4)
            com.google.android.apps.gsa.binaries.satin.app.aqy r4 = r2.f195627a
            com.google.android.apps.gsa.binaries.satin.app.ars r5 = r4.b
            g.a.a r5 = r5.f200184em
            r21 = r5
            com.google.android.apps.gsa.binaries.satin.app.asp r4 = r4.a
            g.a.a r5 = r4.f202006C
            r22 = r5
            g.a.a r4 = r4.f202651bB
            g.a.a r23 = dagger.p5294a.C68226l.m98533a(r4)
            com.google.android.apps.gsa.binaries.satin.app.aqy r4 = r2.f195627a
            com.google.android.apps.gsa.binaries.satin.app.asp r5 = r4.a
            g.a.a r5 = r5.f203126k
            r24 = r5
            g.a.a r5 = r2.f195623W
            r25 = r5
            g.a.a r4 = r4.cK
            g.a.a r26 = dagger.p5294a.C68226l.m98533a(r4)
            g.a.a r4 = r2.f195624X
            r27 = r4
            g.a.a r4 = r2.f195786d
            r28 = r4
            com.google.android.apps.gsa.binaries.satin.app.aqy r4 = r2.f195627a
            com.google.android.apps.gsa.binaries.satin.app.asp r4 = r4.a
            g.a.a r5 = r4.f202764dI
            r29 = r5
            g.a.a r5 = r2.f195930g
            r30 = r5
            g.a.a r5 = r4.f202324I
            r31 = r5
            g.a.a r5 = r4.f202218G
            r32 = r5
            g.a.a r5 = r4.f202762dG
            r33 = r5
            g.a.a r4 = r4.f202165F
            g.a.a r34 = dagger.p5294a.C68226l.m98533a(r4)
            com.google.android.apps.gsa.binaries.satin.app.aqy r4 = r2.f195627a
            com.google.android.apps.gsa.binaries.satin.app.asp r4 = r4.a
            g.a.a r4 = r4.f202803dv
            g.a.a r35 = dagger.p5294a.C68226l.m98533a(r4)
            g.a.a r4 = r2.f195940q
            r36 = r4
            com.google.android.apps.gsa.binaries.satin.app.aqy r4 = r2.f195627a
            com.google.android.apps.gsa.binaries.satin.app.ars r4 = r4.b
            g.a.a r5 = r4.f200167eV
            r37 = r5
            g.a.a r5 = r4.f200118dZ
            r38 = r5
            g.a.a r4 = r4.f199958aY
            g.a.a r39 = dagger.p5294a.C68226l.m98533a(r4)
            g.a.a r4 = r2.f195625Y
            r40 = r4
            com.google.android.apps.gsa.binaries.satin.app.aqy r4 = r2.f195627a
            com.google.android.apps.gsa.binaries.satin.app.asp r4 = r4.a
            g.a.a r4 = r4.f202586Q
            g.a.a r41 = dagger.p5294a.C68226l.m98533a(r4)
            g.a.a r4 = r2.f195949z
            g.a.a r42 = dagger.p5294a.C68226l.m98533a(r4)
            g.a.a r4 = r2.f195609I
            g.a.a r43 = dagger.p5294a.C68226l.m98533a(r4)
            g.a.a r4 = r2.f195943t
            r44 = r4
            com.google.android.apps.gsa.binaries.satin.app.aqy r4 = r2.f195627a
            com.google.android.apps.gsa.binaries.satin.app.asp r4 = r4.a
            g.a.a r4 = r4.f202864fC
            r45 = r4
            g.a.a r4 = r2.f195942s
            g.a.a r46 = dagger.p5294a.C68226l.m98533a(r4)
            g.a.a r4 = r2.f195936m
            g.a.a r47 = dagger.p5294a.C68226l.m98533a(r4)
            com.google.android.apps.gsa.binaries.satin.app.aqy r4 = r2.f195627a
            com.google.android.apps.gsa.binaries.satin.app.ars r5 = r4.b
            g.a.a r5 = r5.f200183el
            r48 = r5
            g.a.a r4 = r4.aU
            g.a.a r49 = dagger.p5294a.C68226l.m98533a(r4)
            g.a.a r4 = r2.f195626Z
            g.a.a r50 = dagger.p5294a.C68226l.m98533a(r4)
            com.google.android.apps.gsa.binaries.satin.app.aqy r4 = r2.f195627a
            com.google.android.apps.gsa.binaries.satin.app.asp r4 = r4.a
            g.a.a r4 = r4.f203158kf
            g.a.a r51 = dagger.p5294a.C68226l.m98533a(r4)
            com.google.android.apps.gsa.binaries.satin.app.aqy r4 = r2.f195627a
            com.google.android.apps.gsa.binaries.satin.app.asp r5 = r4.a
            g.a.a r5 = r5.f202862fA
            r52 = r5
            g.a.a r5 = r4.hJ
            r53 = r5
            g.a.a r5 = r4.i
            r54 = r5
            com.google.android.apps.gsa.binaries.satin.app.ars r4 = r4.b
            g.a.a r4 = r4.f200168eW
            r55 = r4
            r16.<init>(r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43, r44, r45, r46, r47, r48, r49, r50, r51, r52, r53, r54, r55)
            r15.f295660n = r1
            com.google.android.apps.gsa.binaries.satin.app.aqy r1 = r2.f195627a
            com.google.android.apps.gsa.binaries.satin.app.asp r1 = r1.a
            g.a.a r1 = r1.f202901fn
            java.lang.Object r1 = r1.mo17428b()
            com.google.android.apps.gsa.assist.a.i r1 = (com.google.android.apps.gsa.assist.p501a.C9321i) r1
            r15.f295661o = r1
            com.google.android.apps.gsa.binaries.satin.app.aqy r1 = r2.f195627a
            com.google.android.apps.gsa.binaries.satin.app.ars r1 = r1.b
            g.a.a r1 = r1.f200031bs
            java.lang.Object r1 = r1.mo17428b()
            com.google.android.apps.gsa.assist.f.a.b r1 = (com.google.android.apps.gsa.assist.p507f.p508a.C9413b) r1
            com.google.android.apps.gsa.binaries.satin.app.aqy r1 = r2.f195627a
            g.a.a r1 = r1.cK
            java.lang.Object r1 = r1.mo17428b()
            com.google.android.apps.gsa.search.core.aj.aa r1 = (com.google.android.apps.gsa.search.core.p6513aj.C84516aa) r1
            r15.f295662p = r1
            com.google.android.apps.gsa.binaries.satin.app.aqy r1 = r2.f195627a
            com.google.android.apps.gsa.binaries.satin.app.asp r1 = r1.a
            g.a.a r1 = r1.f202006C
            java.lang.Object r1 = r1.mo17428b()
            com.google.android.apps.gsa.search.core.i.t r1 = (com.google.android.apps.gsa.search.core.p6805i.C86124t) r1
            r15.f295663q = r1
            com.google.android.apps.gsa.binaries.satin.app.aqy r1 = r2.f195627a
            com.google.android.apps.gsa.binaries.satin.app.ars r1 = r1.b
            g.a.a r1 = r1.f200015bc
            java.lang.Object r1 = r1.mo17428b()
            com.google.android.apps.gsa.staticplugins.nga.ui.b.a r1 = (com.google.android.apps.gsa.staticplugins.nga.p8092ui.p8095b.C104149a) r1
            r15.f295638X = r1
            com.google.android.apps.gsa.binaries.satin.app.aqy r1 = r2.f195627a
            com.google.android.apps.gsa.binaries.satin.app.asp r1 = r1.a
            g.a.a r1 = r1.f202324I
            dagger.a r1 = dagger.p5294a.C68219e.m98518a(r1)
            r15.f295664r = r1
            com.google.android.apps.gsa.binaries.satin.app.aqy r1 = r2.f195627a
            com.google.android.apps.gsa.binaries.satin.app.asp r1 = r1.a
            g.a.a r1 = r1.f202651bB
            dagger.p5294a.C68219e.m98518a(r1)
            com.google.android.apps.gsa.binaries.satin.app.aqy r1 = r2.f195627a
            com.google.android.apps.gsa.binaries.satin.app.asp r1 = r1.a
            g.a.a r1 = r1.f203444q
            java.lang.Object r1 = r1.mo17428b()
            com.google.android.apps.gsa.shared.util.c.bz r1 = (com.google.android.apps.gsa.shared.util.p7159c.C90929bz) r1
            r15.f295665s = r1
            com.google.android.apps.gsa.binaries.satin.app.aqy r1 = r2.f195627a
            g.a.a r1 = r1.aT
            java.lang.Object r1 = r1.mo17428b()
            com.google.android.libraries.gsa.k.g r1 = (com.google.android.libraries.gsa.p1876k.C22871g) r1
            r15.f295666t = r1
            com.google.android.apps.gsa.binaries.satin.app.aqy r1 = r2.f195627a
            com.google.android.apps.gsa.binaries.satin.app.ars r1 = r1.b
            g.a.a r1 = r1.f200175ed
            java.lang.Object r1 = r1.mo17428b()
            com.google.android.libraries.gcoreclient.p.a.a.a.a r1 = (com.google.android.libraries.gcoreclient.p1784p.p1785a.p1786a.p1787a.C21601a) r1
            com.google.android.apps.gsa.binaries.satin.app.aqy r1 = r2.f195627a
            com.google.android.apps.gsa.binaries.satin.app.ars r1 = r1.b
            g.a.a r1 = r1.f200176ee
            java.lang.Object r1 = r1.mo17428b()
            com.google.android.libraries.gcoreclient.p.a.a.a.c r1 = (com.google.android.libraries.gcoreclient.p1784p.p1785a.p1786a.p1787a.C21603c) r1
            g.a.a r1 = r2.f195605E
            dagger.p5294a.C68219e.m98518a(r1)
            g.a.a r1 = r2.f195930g
            java.lang.Object r1 = r1.mo17428b()
            com.google.android.apps.gsa.staticplugins.opa.util.cr r1 = (com.google.android.apps.gsa.staticplugins.opa.util.C113863cr) r1
            r15.f295667u = r1
            com.google.android.apps.gsa.binaries.satin.app.aqy r1 = r2.f195627a
            com.google.android.apps.gsa.binaries.satin.app.asp r1 = r1.a
            g.a.a r1 = r1.f202586Q
            dagger.a r1 = dagger.p5294a.C68219e.m98518a(r1)
            r15.f295668v = r1
            g.a.a r1 = r2.f195944u
            java.lang.Object r1 = r1.mo17428b()
            com.google.android.apps.gsa.staticplugins.opa.zerostate.f.e r1 = (com.google.android.apps.gsa.staticplugins.opa.zerostate.p8632f.C114735e) r1
            r15.f295669w = r1
            com.google.android.apps.gsa.binaries.satin.app.aqy r1 = r2.f195627a
            com.google.android.apps.gsa.binaries.satin.app.ars r1 = r1.b
            g.a.a r1 = r1.f200251g
            java.lang.Object r1 = r1.mo17428b()
            com.google.common.base.ax r1 = (com.google.common.base.C58833ax) r1
            r15.f295670x = r1
            com.google.android.apps.gsa.binaries.satin.app.aqy r1 = r2.f195627a
            com.google.android.apps.gsa.binaries.satin.app.asp r1 = r1.a
            g.a.a r1 = r1.f202862fA
            java.lang.Object r1 = r1.mo17428b()
            com.google.common.base.ax r1 = (com.google.common.base.C58833ax) r1
            com.google.android.apps.gsa.binaries.satin.app.aqy r1 = r2.f195627a
            g.a.a r1 = r1.ic
            java.lang.Object r1 = r1.mo17428b()
            com.google.android.apps.gsa.assistant.shared.w r1 = (com.google.android.apps.gsa.assistant.shared.C73912w) r1
            com.google.common.base.ax r1 = com.google.common.base.C58833ax.m90834k(r1)
            r15.f295671y = r1
            com.google.android.apps.gsa.binaries.satin.app.aqy r1 = r2.f195627a
            com.google.android.apps.gsa.binaries.satin.app.asp r1 = r1.a
            g.a.a r1 = r1.f202649b
            dagger.a r1 = dagger.p5294a.C68219e.m98518a(r1)
            r15.f295672z = r1
            g.a.a r1 = r2.f195611K
            java.lang.Object r1 = r1.mo17428b()
            com.google.common.base.ax r1 = (com.google.common.base.C58833ax) r1
            r15.f295615A = r1
            g.a.a r1 = r2.f195654aa
            dagger.a r1 = dagger.p5294a.C68219e.m98518a(r1)
            r15.f295616B = r1
            com.google.android.apps.gsa.binaries.satin.app.aqy r1 = r2.f195627a
            com.google.android.apps.gsa.binaries.satin.app.ars r1 = r1.b
            g.a.a r1 = r1.f200017be
            java.lang.Object r1 = r1.mo17428b()
            com.google.common.base.ax r1 = (com.google.common.base.C58833ax) r1
            r15.f295617C = r1
            com.google.android.apps.gsa.binaries.satin.app.aqy r1 = r2.f195627a
            com.google.android.apps.gsa.binaries.satin.app.ars r1 = r1.b
            g.a.a r1 = r1.f200020bh
            java.lang.Object r1 = r1.mo17428b()
            com.google.android.libraries.search.logging.appflows.startup.a.e r1 = (com.google.android.libraries.search.logging.appflows.startup.p3037a.C38802e) r1
            r15.f295618D = r1
            com.google.android.apps.gsa.binaries.satin.app.aqy r1 = r2.f195627a
            g.a.a r1 = r1.fu
            java.lang.Object r1 = r1.mo17428b()
            com.google.android.apps.gsa.staticplugins.opa.ms r1 = (com.google.android.apps.gsa.staticplugins.opa.C109714ms) r1
            r15.f295619E = r1
            com.google.android.apps.gsa.binaries.satin.app.aqy r1 = r2.f195627a
            g.a.a r1 = r1.lb
            java.lang.Object r1 = r1.mo17428b()
            com.google.android.apps.gsa.shared.ah.g r1 = (com.google.android.apps.gsa.shared.p6983ah.C89150g) r1
            r15.f295620F = r1
            g.a.a r1 = r2.f195937n
            java.lang.Object r1 = r1.mo17428b()
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            r15.f295621G = r1
            com.google.android.apps.gsa.binaries.satin.app.aqy r1 = r2.f195627a
            g.a.a r1 = r1.bq
            java.lang.Object r1 = r1.mo17428b()
            com.google.android.apps.gsa.shared.util.v.g r1 = (com.google.android.apps.gsa.shared.util.p7188v.C91142g) r1
            g.a.a r1 = r2.f195657ad
            java.lang.Object r1 = r1.mo17428b()
            com.google.android.apps.gsa.staticplugins.opa.chatui.a.j r1 = (com.google.android.apps.gsa.staticplugins.opa.chatui.p8353a.C108202j) r1
            r15.f295622H = r1
            g.a.a r1 = r2.f195939p
            java.lang.Object r1 = r1.mo17428b()
            com.google.android.apps.gsa.staticplugins.opa.ah.l r1 = (com.google.android.apps.gsa.staticplugins.opa.p8185ah.C106171l) r1
            r15.f295623I = r1
            com.google.android.apps.gsa.binaries.satin.app.aqy r1 = r2.f195627a
            com.google.android.apps.gsa.binaries.satin.app.asp r1 = r1.a
            g.a.a r1 = r1.f202811eC
            java.lang.Object r1 = r1.mo17428b()
            com.google.android.apps.gsa.search.shared.h.n r1 = (com.google.android.apps.gsa.search.shared.p6930h.C87571n) r1
            r15.f295624J = r1
            g.a.a r1 = r2.f195945v
            java.lang.Object r1 = r1.mo17428b()
            com.google.android.apps.gsa.staticplugins.opa.zerostate.j.dc r1 = (com.google.android.apps.gsa.staticplugins.opa.zerostate.p8636j.C114860dc) r1
            g.a.a r1 = r2.f195943t
            java.lang.Object r1 = r1.mo17428b()
            com.google.android.apps.gsa.staticplugins.opa.zerostate.h.b r1 = (com.google.android.apps.gsa.staticplugins.opa.zerostate.p8634h.C114748b) r1
            r15.f295625K = r1
            g.a.a r1 = r2.f195658ae
            java.lang.Object r1 = r1.mo17428b()
            com.google.android.apps.gsa.staticplugins.opa.g.f r1 = (com.google.android.apps.gsa.staticplugins.opa.p8364g.C109063f) r1
            r15.f295626L = r1
            g.a.a r1 = r2.f195613M
            java.lang.Object r1 = r1.mo17428b()
            com.google.android.apps.gsa.staticplugins.opa.av.a r1 = (com.google.android.apps.gsa.staticplugins.opa.p8310av.C107621a) r1
            r15.f295627M = r1
            com.google.android.apps.gsa.binaries.satin.app.aqy r1 = r2.f195627a
            com.google.android.apps.gsa.binaries.satin.app.asp r1 = r1.a
            g.a.a r1 = r1.f203158kf
            dagger.a r1 = dagger.p5294a.C68219e.m98518a(r1)
            r15.f295628N = r1
            com.google.android.apps.gsa.binaries.satin.app.aqy r1 = r2.f195627a
            com.google.android.apps.gsa.binaries.satin.app.ars r1 = r1.b
            g.a.a r1 = r1.f199969aj
            dagger.a r1 = dagger.p5294a.C68219e.m98518a(r1)
            r15.f295629O = r1
            com.google.android.apps.gsa.binaries.satin.app.aqy r1 = r2.f195627a
            com.google.android.apps.gsa.binaries.satin.app.ars r1 = r1.b
            g.a.a r1 = r1.f200149eD
            java.lang.Object r1 = r1.mo17428b()
            com.google.android.apps.gsa.staticplugins.opa.ak.d.a.a r1 = (com.google.android.apps.gsa.staticplugins.opa.p8189ak.p8202d.p8203a.C106318a) r1
            r15.f295639Y = r1
            g.a.a r1 = r2.f195938o
            java.lang.Object r1 = r1.mo17428b()
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            r15.f295630P = r1
            com.google.android.apps.gsa.binaries.satin.app.aqy r1 = r2.f195627a
            com.google.android.apps.gsa.binaries.satin.app.ars r1 = r1.b
            g.a.a r1 = r1.f200108dP
            java.lang.Object r1 = r1.mo17428b()
            com.google.android.apps.gsa.shared.ag.e.o r1 = (com.google.android.apps.gsa.shared.p6976ag.p6982e.C89143o) r1
            r15.f295631Q = r1
            com.google.android.apps.gsa.binaries.satin.app.aqy r1 = r2.f195627a
            g.a.a r1 = r1.v
            java.lang.Object r1 = r1.mo17428b()
            com.google.android.libraries.search.logging.d.kp r1 = (com.google.android.libraries.search.logging.p3041d.C39141kp) r1
            r15.f295632R = r1
            com.google.android.apps.gsa.binaries.satin.app.aqy r1 = r2.f195627a
            com.google.android.apps.gsa.binaries.satin.app.asp r1 = r1.a
            g.a.a r1 = r1.f202593X
            java.lang.Object r1 = r1.mo17428b()
            com.google.apps.tiktok.tracing.dh r1 = (com.google.apps.tiktok.tracing.C47770dh) r1
            r15.f295633S = r1
            com.google.android.libraries.search.logging.d.kp r1 = r15.f295632R
            if (r1 == 0) goto L_0x0383
            com.google.common.base.cr r1 = r1.f102792C
            java.lang.Object r1 = r1.mo6453a()
            com.google.android.libraries.au.d r1 = (com.google.android.libraries.p1635au.C19567d) r1
            r4 = 1
            java.lang.Object[] r2 = new java.lang.Object[r14]
            r1.mo24822a(r4, r2)
        L_0x0383:
            com.google.android.apps.gsa.shared.ag.e.o r1 = r15.f295631Q
            r1.mo27605b()
            com.google.apps.tiktok.tracing.dh r1 = r15.f295633S
            com.google.apps.tiktok.tracing.ax r44 = r1.mo51613c(r3)
            r13 = 1
            r15.f295656au = r13     // Catch:{ all -> 0x0a18 }
            r57.m176444F()     // Catch:{ all -> 0x0a18 }
            com.google.android.apps.gsa.staticplugins.nga.ui.b.a r1 = r15.f295638X     // Catch:{ all -> 0x0a18 }
            boolean r1 = r1.mo93970a()     // Catch:{ all -> 0x0a18 }
            if (r1 == 0) goto L_0x03b8
            r1 = 2132148956(0x7f1602dc, float:1.9939905E38)
            r15.setTheme(r1)     // Catch:{ all -> 0x03b3 }
            boolean r1 = com.google.android.material.p3505b.C44534d.m78715b()     // Catch:{ all -> 0x03b3 }
            if (r1 == 0) goto L_0x03d6
            android.content.res.Resources$Theme r1 = r57.getTheme()     // Catch:{ all -> 0x03b3 }
            r2 = 2132148957(0x7f1602dd, float:1.9939907E38)
            r1.applyStyle(r2, r13)     // Catch:{ all -> 0x03b3 }
            goto L_0x03d6
        L_0x03b3:
            r0 = move-exception
            r2 = r0
            r1 = r15
            goto L_0x0a1b
        L_0x03b8:
            com.google.android.apps.gsa.staticplugins.nga.ui.b.a r1 = r15.f295638X     // Catch:{ all -> 0x0a18 }
            boolean r1 = r1.mo93971b()     // Catch:{ all -> 0x0a18 }
            if (r1 == 0) goto L_0x03d6
            r1 = 2132149689(0x7f1605b9, float:1.9941391E38)
            r15.setTheme(r1)     // Catch:{ all -> 0x03b3 }
            boolean r1 = com.google.android.material.p3505b.C44534d.m78715b()     // Catch:{ all -> 0x03b3 }
            if (r1 == 0) goto L_0x03d6
            android.content.res.Resources$Theme r1 = r57.getTheme()     // Catch:{ all -> 0x03b3 }
            r2 = 2132149690(0x7f1605ba, float:1.9941393E38)
            r1.applyStyle(r2, r13)     // Catch:{ all -> 0x03b3 }
        L_0x03d6:
            dagger.a r1 = r15.f295672z     // Catch:{ all -> 0x0a18 }
            java.lang.Object r1 = r1.mo27525b()     // Catch:{ all -> 0x0a18 }
            com.google.android.apps.gsa.shared.util.debug.f r1 = (com.google.android.apps.gsa.shared.util.debug.C91022f) r1     // Catch:{ all -> 0x0a18 }
            r1.mo85301a(r15)     // Catch:{ all -> 0x0a18 }
            dagger.a r1 = r15.f295668v     // Catch:{ all -> 0x0a18 }
            java.lang.Object r1 = r1.mo27525b()     // Catch:{ all -> 0x0a18 }
            com.google.android.apps.gsa.shared.logger.b.i r1 = (com.google.android.apps.gsa.shared.logger.p7051b.C89859i) r1     // Catch:{ all -> 0x0a18 }
            com.google.android.apps.gsa.shared.logger.b.ae r2 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.OPA_ANDROID_STARTUP_CREATE     // Catch:{ all -> 0x0a18 }
            r1.mo83702b(r2)     // Catch:{ all -> 0x0a18 }
            android.content.Intent r12 = r57.getIntent()     // Catch:{ all -> 0x0a18 }
            android.content.Intent r1 = r57.getIntent()     // Catch:{ all -> 0x0a18 }
            android.os.Bundle r1 = com.google.android.apps.gsa.search.shared.p6930h.C87566i.m142227B(r1)     // Catch:{ all -> 0x0a18 }
            if (r1 == 0) goto L_0x0454
            boolean r2 = com.google.android.apps.gsa.search.shared.p6930h.C87566i.m142270aR(r1)     // Catch:{ all -> 0x03b3 }
            if (r2 == 0) goto L_0x0454
            com.google.android.apps.gsa.search.core.i.t r2 = r15.f295663q     // Catch:{ all -> 0x03b3 }
            com.google.android.apps.gsa.shared.m.d r3 = com.google.android.apps.gsa.shared.p7066m.C90014bt.f247287eM     // Catch:{ all -> 0x03b3 }
            boolean r2 = r2.mo79746e(r3)     // Catch:{ all -> 0x03b3 }
            if (r2 == 0) goto L_0x0454
            com.google.android.apps.gsa.search.shared.h.n r2 = r15.f295624J     // Catch:{ all -> 0x03b3 }
            android.content.Context r3 = r57.getApplicationContext()     // Catch:{ all -> 0x03b3 }
            com.google.assistant.s.a.ih r4 = com.google.assistant.p3994s.p3995a.C53287ih.f139693l     // Catch:{ all -> 0x03b3 }
            com.google.protobuf.bn r4 = r4.createBuilder()     // Catch:{ all -> 0x03b3 }
            com.google.assistant.s.a.hw r4 = (com.google.assistant.p3994s.p3995a.C53275hw) r4     // Catch:{ all -> 0x03b3 }
            r4.copyOnWrite()     // Catch:{ all -> 0x03b3 }
            com.google.protobuf.bv r5 = r4.instance     // Catch:{ all -> 0x03b3 }
            com.google.assistant.s.a.ih r5 = (com.google.assistant.p3994s.p3995a.C53287ih) r5     // Catch:{ all -> 0x03b3 }
            r5.f139698d = r13     // Catch:{ all -> 0x03b3 }
            int r6 = r5.f139695a     // Catch:{ all -> 0x03b3 }
            r6 = r6 | r13
            r5.f139695a = r6     // Catch:{ all -> 0x03b3 }
            r4.copyOnWrite()     // Catch:{ all -> 0x03b3 }
            com.google.protobuf.bv r5 = r4.instance     // Catch:{ all -> 0x03b3 }
            com.google.assistant.s.a.ih r5 = (com.google.assistant.p3994s.p3995a.C53287ih) r5     // Catch:{ all -> 0x03b3 }
            r5.f139702h = r14     // Catch:{ all -> 0x03b3 }
            int r6 = r5.f139695a     // Catch:{ all -> 0x03b3 }
            r6 = r6 | 64
            r5.f139695a = r6     // Catch:{ all -> 0x03b3 }
            r4.copyOnWrite()     // Catch:{ all -> 0x03b3 }
            com.google.protobuf.bv r5 = r4.instance     // Catch:{ all -> 0x03b3 }
            com.google.assistant.s.a.ih r5 = (com.google.assistant.p3994s.p3995a.C53287ih) r5     // Catch:{ all -> 0x03b3 }
            r6 = 40
            r5.f139703i = r6     // Catch:{ all -> 0x03b3 }
            int r6 = r5.f139695a     // Catch:{ all -> 0x03b3 }
            r6 = r6 | 128(0x80, float:1.794E-43)
            r5.f139695a = r6     // Catch:{ all -> 0x03b3 }
            com.google.protobuf.bv r4 = r4.build()     // Catch:{ all -> 0x03b3 }
            com.google.assistant.s.a.ih r4 = (com.google.assistant.p3994s.p3995a.C53287ih) r4     // Catch:{ all -> 0x03b3 }
            r2.mo81699k(r3, r4, r1)     // Catch:{ all -> 0x03b3 }
            r57.finish()     // Catch:{ all -> 0x03b3 }
        L_0x0454:
            android.os.Bundle r1 = com.google.android.apps.gsa.search.shared.p6930h.C87566i.m142227B(r12)     // Catch:{ all -> 0x0a18 }
            boolean r1 = com.google.android.apps.gsa.search.shared.p6930h.C87566i.m142270aR(r1)     // Catch:{ all -> 0x0a18 }
            if (r1 == 0) goto L_0x0463
            com.google.android.apps.gsa.staticplugins.opa.zerostate.f.e r1 = r15.f295669w     // Catch:{ all -> 0x03b3 }
            r1.mo101559g()     // Catch:{ all -> 0x03b3 }
        L_0x0463:
            if (r58 == 0) goto L_0x0467
            r1 = 1
            goto L_0x0468
        L_0x0467:
            r1 = 0
        L_0x0468:
            r15.f295644ai = r1     // Catch:{ all -> 0x0a18 }
            r1 = 3
            r15.setVolumeControlStream(r1)     // Catch:{ all -> 0x0a18 }
            com.google.common.base.ax r1 = r15.f295670x     // Catch:{ all -> 0x0a18 }
            boolean r1 = r1.mo56113h()     // Catch:{ all -> 0x0a18 }
            if (r1 == 0) goto L_0x049c
            com.google.android.apps.gsa.search.core.i.t r1 = r15.f295663q     // Catch:{ all -> 0x03b3 }
            com.google.android.apps.gsa.shared.m.d r2 = com.google.android.apps.gsa.shared.p7066m.C90029ch.f248258as     // Catch:{ all -> 0x03b3 }
            boolean r1 = r1.mo79746e(r2)     // Catch:{ all -> 0x03b3 }
            if (r1 == 0) goto L_0x0484
            boolean r1 = r15.f295630P     // Catch:{ all -> 0x03b3 }
            if (r1 != 0) goto L_0x049c
        L_0x0484:
            com.google.common.base.ax r1 = r15.f295670x     // Catch:{ all -> 0x03b3 }
            java.lang.Object r1 = r1.mo56107c()     // Catch:{ all -> 0x03b3 }
            com.google.android.apps.gsa.staticplugins.opa.bh.a.a r1 = (com.google.android.apps.gsa.staticplugins.opa.p8338bh.p8339a.C108066a) r1     // Catch:{ all -> 0x03b3 }
            com.google.android.apps.gsa.search.shared.ui.b r1 = r1.mo96416a(r15)     // Catch:{ all -> 0x03b3 }
            com.google.common.base.ax r1 = com.google.common.base.C58833ax.m90834k(r1)     // Catch:{ all -> 0x03b3 }
            r2 = r1
            com.google.common.base.bk r2 = (com.google.common.base.C58847bk) r2     // Catch:{ all -> 0x03b3 }
            java.lang.Object r2 = r2.f156646a     // Catch:{ all -> 0x03b3 }
            com.google.android.apps.gsa.search.shared.ui.b r2 = (com.google.android.apps.gsa.search.shared.p6941ui.C88522b) r2     // Catch:{ all -> 0x03b3 }
            goto L_0x049e
        L_0x049c:
            com.google.common.base.b r1 = com.google.common.base.C58836b.f156633a     // Catch:{ all -> 0x0a18 }
        L_0x049e:
            r45 = r1
            android.content.Intent r1 = r57.getIntent()     // Catch:{ all -> 0x0a18 }
            if (r1 == 0) goto L_0x04be
            java.lang.String r1 = "android.intent.action.SEND"
            android.content.Intent r2 = r57.getIntent()     // Catch:{ all -> 0x03b3 }
            java.lang.String r2 = r2.getAction()     // Catch:{ all -> 0x03b3 }
            boolean r1 = r1.equals(r2)     // Catch:{ all -> 0x03b3 }
            if (r1 == 0) goto L_0x04be
            com.google.android.apps.gsa.staticplugins.opa.zerostate.h.b r1 = r15.f295625K     // Catch:{ all -> 0x03b3 }
            android.content.Intent r2 = r57.getIntent()     // Catch:{ all -> 0x03b3 }
            r1.f318452e = r2     // Catch:{ all -> 0x03b3 }
        L_0x04be:
            com.google.android.apps.gsa.staticplugins.opa.lz r1 = r15.f295660n     // Catch:{ all -> 0x0a18 }
            com.google.android.apps.gsa.staticplugins.opa.lq r2 = r15.f295641af     // Catch:{ all -> 0x0a18 }
            android.view.Window r3 = r57.getWindow()     // Catch:{ all -> 0x0a18 }
            android.app.FragmentManager r4 = r57.getFragmentManager()     // Catch:{ all -> 0x0a18 }
            com.google.android.apps.gsa.staticplugins.opa.ly r11 = new com.google.android.apps.gsa.staticplugins.opa.ly     // Catch:{ all -> 0x0a18 }
            r2.getClass()     // Catch:{ all -> 0x0a18 }
            r3.getClass()     // Catch:{ all -> 0x0a18 }
            r4.getClass()     // Catch:{ all -> 0x0a18 }
            g.a.a r4 = r1.f304853a     // Catch:{ all -> 0x0a18 }
            java.lang.Object r4 = r4.mo17428b()     // Catch:{ all -> 0x0a18 }
            r6 = r4
            android.app.Activity r6 = (android.app.Activity) r6     // Catch:{ all -> 0x0a18 }
            r6.getClass()     // Catch:{ all -> 0x0a18 }
            g.a.a r4 = r1.f304854b     // Catch:{ all -> 0x0a18 }
            java.lang.Object r4 = r4.mo17428b()     // Catch:{ all -> 0x0a18 }
            r7 = r4
            com.google.android.apps.gsa.staticplugins.opa.fk r7 = (com.google.android.apps.gsa.staticplugins.opa.C109041fk) r7     // Catch:{ all -> 0x0a18 }
            r7.getClass()     // Catch:{ all -> 0x0a18 }
            g.a.a r4 = r1.f304855c     // Catch:{ all -> 0x0a18 }
            java.lang.Object r4 = r4.mo17428b()     // Catch:{ all -> 0x0a18 }
            r8 = r4
            com.google.common.base.ax r8 = (com.google.common.base.C58833ax) r8     // Catch:{ all -> 0x0a18 }
            r8.getClass()     // Catch:{ all -> 0x0a18 }
            g.a.a r4 = r1.f304856d     // Catch:{ all -> 0x0a18 }
            dagger.a.l r4 = (dagger.p5294a.C68226l) r4     // Catch:{ all -> 0x0a18 }
            g.a.a r4 = r4.f184585a     // Catch:{ all -> 0x0a18 }
            dagger.a r9 = dagger.p5294a.C68219e.m98518a(r4)     // Catch:{ all -> 0x0a18 }
            r9.getClass()     // Catch:{ all -> 0x0a18 }
            g.a.a r4 = r1.f304857e     // Catch:{ all -> 0x0a18 }
            java.lang.Object r4 = r4.mo17428b()     // Catch:{ all -> 0x0a18 }
            r10 = r4
            com.google.android.apps.gsa.staticplugins.opa.nm r10 = (com.google.android.apps.gsa.staticplugins.opa.C109739nm) r10     // Catch:{ all -> 0x0a18 }
            r10.getClass()     // Catch:{ all -> 0x0a18 }
            g.a.a r4 = r1.f304858f     // Catch:{ all -> 0x0a18 }
            java.lang.Object r4 = r4.mo17428b()     // Catch:{ all -> 0x0a18 }
            r16 = r4
            com.google.android.apps.gsa.search.core.i.t r16 = (com.google.android.apps.gsa.search.core.p6805i.C86124t) r16     // Catch:{ all -> 0x0a18 }
            r16.getClass()     // Catch:{ all -> 0x0a18 }
            g.a.a r4 = r1.f304859g     // Catch:{ all -> 0x0a18 }
            dagger.a.l r4 = (dagger.p5294a.C68226l) r4     // Catch:{ all -> 0x0a18 }
            g.a.a r4 = r4.f184585a     // Catch:{ all -> 0x0a18 }
            dagger.a r17 = dagger.p5294a.C68219e.m98518a(r4)     // Catch:{ all -> 0x0a18 }
            r17.getClass()     // Catch:{ all -> 0x0a18 }
            g.a.a r4 = r1.f304860h     // Catch:{ all -> 0x0a18 }
            java.lang.Object r4 = r4.mo17428b()     // Catch:{ all -> 0x0a18 }
            r18 = r4
            android.content.SharedPreferences r18 = (android.content.SharedPreferences) r18     // Catch:{ all -> 0x0a18 }
            r18.getClass()     // Catch:{ all -> 0x0a18 }
            g.a.a r4 = r1.f304861i     // Catch:{ all -> 0x0a18 }
            java.lang.Object r4 = r4.mo17428b()     // Catch:{ all -> 0x0a18 }
            r19 = r4
            com.google.android.apps.gsa.staticplugins.opa.util.y r19 = (com.google.android.apps.gsa.staticplugins.opa.util.C113894y) r19     // Catch:{ all -> 0x0a18 }
            r19.getClass()     // Catch:{ all -> 0x0a18 }
            g.a.a r4 = r1.f304862j     // Catch:{ all -> 0x0a18 }
            dagger.a.l r4 = (dagger.p5294a.C68226l) r4     // Catch:{ all -> 0x0a18 }
            g.a.a r4 = r4.f184585a     // Catch:{ all -> 0x0a18 }
            dagger.a r20 = dagger.p5294a.C68219e.m98518a(r4)     // Catch:{ all -> 0x0a18 }
            r20.getClass()     // Catch:{ all -> 0x0a18 }
            g.a.a r4 = r1.f304863k     // Catch:{ all -> 0x0a18 }
            java.lang.Object r4 = r4.mo17428b()     // Catch:{ all -> 0x0a18 }
            r21 = r4
            com.google.android.apps.gsa.staticplugins.opa.valyrian.ej r21 = (com.google.android.apps.gsa.staticplugins.opa.valyrian.C114074ej) r21     // Catch:{ all -> 0x0a18 }
            r21.getClass()     // Catch:{ all -> 0x0a18 }
            g.a.a r4 = r1.f304864l     // Catch:{ all -> 0x0a18 }
            java.lang.Object r4 = r4.mo17428b()     // Catch:{ all -> 0x0a18 }
            r22 = r4
            com.google.android.apps.gsa.staticplugins.opa.az.t r22 = (com.google.android.apps.gsa.staticplugins.opa.p8315az.C107709t) r22     // Catch:{ all -> 0x0a18 }
            r22.getClass()     // Catch:{ all -> 0x0a18 }
            g.a.a r4 = r1.f304865m     // Catch:{ all -> 0x0a18 }
            java.lang.Object r4 = r4.mo17428b()     // Catch:{ all -> 0x0a18 }
            r23 = r4
            com.google.android.apps.gsa.assist.c.a.a r23 = (com.google.android.apps.gsa.assist.p503c.p504a.C9388a) r23     // Catch:{ all -> 0x0a18 }
            r23.getClass()     // Catch:{ all -> 0x0a18 }
            g.a.a r4 = r1.f304866n     // Catch:{ all -> 0x0a18 }
            java.lang.Object r4 = r4.mo17428b()     // Catch:{ all -> 0x0a18 }
            r24 = r4
            com.google.android.apps.gsa.staticplugins.opa.util.cr r24 = (com.google.android.apps.gsa.staticplugins.opa.util.C113863cr) r24     // Catch:{ all -> 0x0a18 }
            r24.getClass()     // Catch:{ all -> 0x0a18 }
            g.a.a r4 = r1.f304867o     // Catch:{ all -> 0x0a18 }
            java.lang.Object r4 = r4.mo17428b()     // Catch:{ all -> 0x0a18 }
            r25 = r4
            com.google.android.apps.gsa.search.core.google.gaia.o r25 = (com.google.android.apps.gsa.search.core.google.gaia.C86054o) r25     // Catch:{ all -> 0x0a18 }
            r25.getClass()     // Catch:{ all -> 0x0a18 }
            g.a.a r4 = r1.f304868p     // Catch:{ all -> 0x0a18 }
            java.lang.Object r4 = r4.mo17428b()     // Catch:{ all -> 0x0a18 }
            r26 = r4
            com.google.android.apps.gsa.assistant.shared.bm r26 = (com.google.android.apps.gsa.assistant.shared.bm) r26     // Catch:{ all -> 0x0a18 }
            r26.getClass()     // Catch:{ all -> 0x0a18 }
            g.a.a r4 = r1.f304869q     // Catch:{ all -> 0x0a18 }
            java.lang.Object r4 = r4.mo17428b()     // Catch:{ all -> 0x0a18 }
            r27 = r4
            com.google.android.apps.gsa.assistant.shared.bo r27 = (com.google.android.apps.gsa.assistant.shared.bo) r27     // Catch:{ all -> 0x0a18 }
            r27.getClass()     // Catch:{ all -> 0x0a18 }
            g.a.a r4 = r1.f304870r     // Catch:{ all -> 0x0a18 }
            dagger.a.l r4 = (dagger.p5294a.C68226l) r4     // Catch:{ all -> 0x0a18 }
            g.a.a r4 = r4.f184585a     // Catch:{ all -> 0x0a18 }
            dagger.a r28 = dagger.p5294a.C68219e.m98518a(r4)     // Catch:{ all -> 0x0a18 }
            r28.getClass()     // Catch:{ all -> 0x0a18 }
            g.a.a r4 = r1.f304871s     // Catch:{ all -> 0x0a18 }
            dagger.a.l r4 = (dagger.p5294a.C68226l) r4     // Catch:{ all -> 0x0a18 }
            g.a.a r4 = r4.f184585a     // Catch:{ all -> 0x0a18 }
            dagger.a r29 = dagger.p5294a.C68219e.m98518a(r4)     // Catch:{ all -> 0x0a18 }
            r29.getClass()     // Catch:{ all -> 0x0a18 }
            g.a.a r4 = r1.f304872t     // Catch:{ all -> 0x0a18 }
            java.lang.Object r4 = r4.mo17428b()     // Catch:{ all -> 0x0a18 }
            r30 = r4
            com.google.common.base.ax r30 = (com.google.common.base.C58833ax) r30     // Catch:{ all -> 0x0a18 }
            r30.getClass()     // Catch:{ all -> 0x0a18 }
            g.a.a r4 = r1.f304873u     // Catch:{ all -> 0x0a18 }
            java.lang.Object r4 = r4.mo17428b()     // Catch:{ all -> 0x0a18 }
            r31 = r4
            com.google.common.base.ax r31 = (com.google.common.base.C58833ax) r31     // Catch:{ all -> 0x0a18 }
            r31.getClass()     // Catch:{ all -> 0x0a18 }
            g.a.a r4 = r1.f304874v     // Catch:{ all -> 0x0a18 }
            java.lang.Object r4 = r4.mo17428b()     // Catch:{ all -> 0x0a18 }
            r32 = r4
            com.google.android.apps.gsa.staticplugins.opa.ah.o r32 = (com.google.android.apps.gsa.staticplugins.opa.p8185ah.C106174o) r32     // Catch:{ all -> 0x0a18 }
            r32.getClass()     // Catch:{ all -> 0x0a18 }
            g.a.a r4 = r1.f304875w     // Catch:{ all -> 0x0a18 }
            dagger.a.l r4 = (dagger.p5294a.C68226l) r4     // Catch:{ all -> 0x0a18 }
            g.a.a r4 = r4.f184585a     // Catch:{ all -> 0x0a18 }
            dagger.a r33 = dagger.p5294a.C68219e.m98518a(r4)     // Catch:{ all -> 0x0a18 }
            r33.getClass()     // Catch:{ all -> 0x0a18 }
            g.a.a r4 = r1.f304876x     // Catch:{ all -> 0x0a18 }
            java.lang.Object r4 = r4.mo17428b()     // Catch:{ all -> 0x0a18 }
            com.google.android.apps.gsa.staticplugins.opa.iu r4 = (com.google.android.apps.gsa.staticplugins.opa.C109298iu) r4     // Catch:{ all -> 0x0a18 }
            r4.getClass()     // Catch:{ all -> 0x0a18 }
            g.a.a r4 = r1.f304877y     // Catch:{ all -> 0x0a18 }
            dagger.a.l r4 = (dagger.p5294a.C68226l) r4     // Catch:{ all -> 0x0a18 }
            g.a.a r4 = r4.f184585a     // Catch:{ all -> 0x0a18 }
            dagger.a r34 = dagger.p5294a.C68219e.m98518a(r4)     // Catch:{ all -> 0x0a18 }
            r34.getClass()     // Catch:{ all -> 0x0a18 }
            g.a.a r4 = r1.f304878z     // Catch:{ all -> 0x0a18 }
            dagger.a.l r4 = (dagger.p5294a.C68226l) r4     // Catch:{ all -> 0x0a18 }
            g.a.a r4 = r4.f184585a     // Catch:{ all -> 0x0a18 }
            dagger.a r35 = dagger.p5294a.C68219e.m98518a(r4)     // Catch:{ all -> 0x0a18 }
            r35.getClass()     // Catch:{ all -> 0x0a18 }
            g.a.a r4 = r1.f304840A     // Catch:{ all -> 0x0a18 }
            dagger.a.l r4 = (dagger.p5294a.C68226l) r4     // Catch:{ all -> 0x0a18 }
            g.a.a r4 = r4.f184585a     // Catch:{ all -> 0x0a18 }
            dagger.a r36 = dagger.p5294a.C68219e.m98518a(r4)     // Catch:{ all -> 0x0a18 }
            r36.getClass()     // Catch:{ all -> 0x0a18 }
            g.a.a r4 = r1.f304841B     // Catch:{ all -> 0x0a18 }
            java.lang.Object r4 = r4.mo17428b()     // Catch:{ all -> 0x0a18 }
            r37 = r4
            com.google.android.apps.gsa.staticplugins.opa.zerostate.h.b r37 = (com.google.android.apps.gsa.staticplugins.opa.zerostate.p8634h.C114748b) r37     // Catch:{ all -> 0x0a18 }
            r37.getClass()     // Catch:{ all -> 0x0a18 }
            g.a.a r4 = r1.f304842C     // Catch:{ all -> 0x0a18 }
            java.lang.Object r4 = r4.mo17428b()     // Catch:{ all -> 0x0a18 }
            r38 = r4
            com.google.common.base.ax r38 = (com.google.common.base.C58833ax) r38     // Catch:{ all -> 0x0a18 }
            r38.getClass()     // Catch:{ all -> 0x0a18 }
            g.a.a r4 = r1.f304843D     // Catch:{ all -> 0x0a18 }
            dagger.a.l r4 = (dagger.p5294a.C68226l) r4     // Catch:{ all -> 0x0a18 }
            g.a.a r4 = r4.f184585a     // Catch:{ all -> 0x0a18 }
            dagger.a r39 = dagger.p5294a.C68219e.m98518a(r4)     // Catch:{ all -> 0x0a18 }
            r39.getClass()     // Catch:{ all -> 0x0a18 }
            g.a.a r4 = r1.f304844E     // Catch:{ all -> 0x0a18 }
            dagger.a.l r4 = (dagger.p5294a.C68226l) r4     // Catch:{ all -> 0x0a18 }
            g.a.a r4 = r4.f184585a     // Catch:{ all -> 0x0a18 }
            dagger.a r40 = dagger.p5294a.C68219e.m98518a(r4)     // Catch:{ all -> 0x0a18 }
            r40.getClass()     // Catch:{ all -> 0x0a18 }
            g.a.a r4 = r1.f304845F     // Catch:{ all -> 0x0a18 }
            java.lang.Object r4 = r4.mo17428b()     // Catch:{ all -> 0x0a18 }
            r41 = r4
            com.google.android.apps.gsa.staticplugins.opa.errorui.ej r41 = (com.google.android.apps.gsa.staticplugins.opa.errorui.C108934ej) r41     // Catch:{ all -> 0x0a18 }
            r41.getClass()     // Catch:{ all -> 0x0a18 }
            g.a.a r4 = r1.f304846G     // Catch:{ all -> 0x0a18 }
            dagger.a.l r4 = (dagger.p5294a.C68226l) r4     // Catch:{ all -> 0x0a18 }
            g.a.a r4 = r4.f184585a     // Catch:{ all -> 0x0a18 }
            dagger.a r42 = dagger.p5294a.C68219e.m98518a(r4)     // Catch:{ all -> 0x0a18 }
            r42.getClass()     // Catch:{ all -> 0x0a18 }
            g.a.a r4 = r1.f304847H     // Catch:{ all -> 0x0a18 }
            dagger.a.l r4 = (dagger.p5294a.C68226l) r4     // Catch:{ all -> 0x0a18 }
            g.a.a r4 = r4.f184585a     // Catch:{ all -> 0x0a18 }
            dagger.a r43 = dagger.p5294a.C68219e.m98518a(r4)     // Catch:{ all -> 0x0a18 }
            r43.getClass()     // Catch:{ all -> 0x0a18 }
            g.a.a r4 = r1.f304848I     // Catch:{ all -> 0x0a18 }
            dagger.a.l r4 = (dagger.p5294a.C68226l) r4     // Catch:{ all -> 0x0a18 }
            g.a.a r4 = r4.f184585a     // Catch:{ all -> 0x0a18 }
            dagger.a r46 = dagger.p5294a.C68219e.m98518a(r4)     // Catch:{ all -> 0x0a18 }
            r46.getClass()     // Catch:{ all -> 0x0a18 }
            g.a.a r4 = r1.f304849J     // Catch:{ all -> 0x0a18 }
            java.lang.Object r4 = r4.mo17428b()     // Catch:{ all -> 0x0a18 }
            r47 = r4
            com.google.common.base.ax r47 = (com.google.common.base.C58833ax) r47     // Catch:{ all -> 0x0a18 }
            r47.getClass()     // Catch:{ all -> 0x0a18 }
            g.a.a r4 = r1.f304850K     // Catch:{ all -> 0x0a18 }
            java.lang.Object r4 = r4.mo17428b()     // Catch:{ all -> 0x0a18 }
            r48 = r4
            j$.util.Optional r48 = (p3186j$.util.Optional) r48     // Catch:{ all -> 0x0a18 }
            r48.getClass()     // Catch:{ all -> 0x0a18 }
            g.a.a r4 = r1.f304851L     // Catch:{ all -> 0x0a18 }
            java.lang.Object r4 = r4.mo17428b()     // Catch:{ all -> 0x0a18 }
            r49 = r4
            com.google.android.libraries.f.a r49 = (com.google.android.libraries.p1730f.C21370a) r49     // Catch:{ all -> 0x0a18 }
            r49.getClass()     // Catch:{ all -> 0x0a18 }
            g.a.a r1 = r1.f304852M     // Catch:{ all -> 0x0a18 }
            java.lang.Object r1 = r1.mo17428b()     // Catch:{ all -> 0x0a18 }
            r50 = r1
            com.google.android.apps.gsa.assistant.shared.ab r50 = (com.google.android.apps.gsa.assistant.shared.C73799ab) r50     // Catch:{ all -> 0x0a18 }
            r50.getClass()     // Catch:{ all -> 0x0a18 }
            r1 = r11
            r4 = r57
            r5 = r45
            r51 = r0
            r0 = r11
            r11 = r16
            r56 = r12
            r12 = r17
            r13 = r18
            r14 = r19
            r15 = r20
            r16 = r21
            r17 = r22
            r18 = r23
            r19 = r24
            r20 = r25
            r21 = r26
            r22 = r27
            r23 = r28
            r24 = r29
            r25 = r30
            r26 = r31
            r27 = r32
            r28 = r33
            r29 = r34
            r30 = r35
            r31 = r36
            r32 = r37
            r33 = r38
            r34 = r39
            r35 = r40
            r36 = r41
            r37 = r42
            r38 = r43
            r39 = r46
            r40 = r47
            r41 = r48
            r42 = r49
            r43 = r50
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43)     // Catch:{ all -> 0x0a14 }
            r1 = r57
            r1.f295634T = r0     // Catch:{ all -> 0x0a12 }
            boolean r0 = r45.mo56113h()     // Catch:{ all -> 0x0a12 }
            if (r0 == 0) goto L_0x0772
            java.lang.Object r0 = r45.mo56107c()     // Catch:{ all -> 0x0a12 }
            com.google.android.apps.gsa.search.shared.ui.b r0 = (com.google.android.apps.gsa.search.shared.p6941ui.C88522b) r0     // Catch:{ all -> 0x0a12 }
            com.google.android.apps.gsa.staticplugins.opa.ly r2 = r1.f295634T     // Catch:{ all -> 0x0a12 }
            android.widget.FrameLayout r2 = r2.f304829p     // Catch:{ all -> 0x0a12 }
            android.view.View r0 = r0.mo82141c(r2)     // Catch:{ all -> 0x0a12 }
            r2 = 2131100241(0x7f060251, float:1.7812858E38)
            int r2 = androidx.core.content.C1878d.m5128a(r1, r2)     // Catch:{ all -> 0x0a12 }
            r3 = 2131100248(0x7f060258, float:1.7812872E38)
            int r3 = androidx.core.content.C1878d.m5128a(r1, r3)     // Catch:{ all -> 0x0a12 }
            java.lang.Object r4 = r45.mo56107c()     // Catch:{ all -> 0x0a12 }
            com.google.android.apps.gsa.search.shared.ui.b r4 = (com.google.android.apps.gsa.search.shared.p6941ui.C88522b) r4     // Catch:{ all -> 0x0a12 }
            r4.mo82143e(r2)     // Catch:{ all -> 0x0a12 }
            java.lang.Object r2 = r45.mo56107c()     // Catch:{ all -> 0x0a12 }
            com.google.android.apps.gsa.search.shared.ui.b r2 = (com.google.android.apps.gsa.search.shared.p6941ui.C88522b) r2     // Catch:{ all -> 0x0a12 }
            r2.mo82144f(r3)     // Catch:{ all -> 0x0a12 }
            com.google.android.apps.gsa.staticplugins.opa.ll r2 = new com.google.android.apps.gsa.staticplugins.opa.ll     // Catch:{ all -> 0x0a12 }
            r2.<init>(r1)     // Catch:{ all -> 0x0a12 }
            r0.setOnClickListener(r2)     // Catch:{ all -> 0x0a12 }
            com.google.common.base.ax r2 = r1.f295615A     // Catch:{ all -> 0x0a12 }
            boolean r2 = r2.mo56113h()     // Catch:{ all -> 0x0a12 }
            if (r2 == 0) goto L_0x0793
            com.google.common.base.ax r2 = r1.f295615A     // Catch:{ all -> 0x0a12 }
            java.lang.Object r2 = r2.mo56107c()     // Catch:{ all -> 0x0a12 }
            com.google.android.apps.gsa.staticplugins.opa.an.a r2 = (com.google.android.apps.gsa.staticplugins.opa.p8279an.C107126a) r2     // Catch:{ all -> 0x0a12 }
            android.view.LayoutInflater r3 = android.view.LayoutInflater.from(r57)     // Catch:{ all -> 0x0a12 }
            android.view.View r0 = r2.mo95791a(r3, r0)     // Catch:{ all -> 0x0a12 }
            goto L_0x0793
        L_0x0772:
            com.google.common.base.ax r0 = r1.f295615A     // Catch:{ all -> 0x0a12 }
            boolean r0 = r0.mo56113h()     // Catch:{ all -> 0x0a12 }
            if (r0 == 0) goto L_0x078f
            com.google.common.base.ax r0 = r1.f295615A     // Catch:{ all -> 0x0a12 }
            java.lang.Object r0 = r0.mo56107c()     // Catch:{ all -> 0x0a12 }
            com.google.android.apps.gsa.staticplugins.opa.an.a r0 = (com.google.android.apps.gsa.staticplugins.opa.p8279an.C107126a) r0     // Catch:{ all -> 0x0a12 }
            android.view.LayoutInflater r2 = android.view.LayoutInflater.from(r57)     // Catch:{ all -> 0x0a12 }
            com.google.android.apps.gsa.staticplugins.opa.ly r3 = r1.f295634T     // Catch:{ all -> 0x0a12 }
            android.widget.FrameLayout r3 = r3.f304829p     // Catch:{ all -> 0x0a12 }
            android.view.View r0 = r0.mo95791a(r2, r3)     // Catch:{ all -> 0x0a12 }
            goto L_0x0793
        L_0x078f:
            com.google.android.apps.gsa.staticplugins.opa.ly r0 = r1.f295634T     // Catch:{ all -> 0x0a12 }
            android.widget.FrameLayout r0 = r0.f304829p     // Catch:{ all -> 0x0a12 }
        L_0x0793:
            com.google.android.apps.gsa.search.core.i.t r2 = r1.f295663q     // Catch:{ all -> 0x0a12 }
            com.google.android.apps.gsa.shared.m.d r3 = com.google.android.apps.gsa.shared.p7066m.C90014bt.f247818oe     // Catch:{ all -> 0x0a12 }
            boolean r2 = r2.mo79746e(r3)     // Catch:{ all -> 0x0a12 }
            r3 = 0
            if (r2 == 0) goto L_0x08ca
            boolean r2 = r0 instanceof android.view.ViewGroup     // Catch:{ all -> 0x0a12 }
            if (r2 == 0) goto L_0x08ca
            dagger.a r2 = r1.f295616B     // Catch:{ all -> 0x0a12 }
            java.lang.Object r2 = r2.mo27525b()     // Catch:{ all -> 0x0a12 }
            com.google.android.apps.gsa.staticplugins.opa.oi r2 = (com.google.android.apps.gsa.staticplugins.opa.C109763oi) r2     // Catch:{ all -> 0x0a12 }
            r4 = r0
            android.view.ViewGroup r4 = (android.view.ViewGroup) r4     // Catch:{ all -> 0x0a12 }
            android.content.Context r5 = r4.getContext()     // Catch:{ all -> 0x0a12 }
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ all -> 0x0a12 }
            r6.<init>()     // Catch:{ all -> 0x0a12 }
            com.google.android.apps.gsa.search.core.google.gaia.o r2 = r2.f305840a     // Catch:{ all -> 0x0a12 }
            if (r2 == 0) goto L_0x07bf
            java.lang.String[] r2 = r2.mo79685s()     // Catch:{ all -> 0x0a12 }
            goto L_0x07c0
        L_0x07bf:
            r2 = r3
        L_0x07c0:
            java.lang.String r7 = "  "
            if (r2 == 0) goto L_0x07e6
            int r8 = r2.length     // Catch:{ all -> 0x0a12 }
            if (r8 != 0) goto L_0x07c8
            goto L_0x07e6
        L_0x07c8:
            r14 = 0
        L_0x07c9:
            if (r14 >= r8) goto L_0x07e4
            r9 = r2[r14]     // Catch:{ all -> 0x0a12 }
            r6.append(r7)     // Catch:{ all -> 0x0a12 }
            r6.append(r9)     // Catch:{ all -> 0x0a12 }
            java.util.Locale r10 = java.util.Locale.US     // Catch:{ all -> 0x0a12 }
            java.lang.String r9 = r9.toLowerCase(r10)     // Catch:{ all -> 0x0a12 }
            java.lang.String r10 = "@google.com"
            boolean r9 = r9.endsWith(r10)     // Catch:{ all -> 0x0a12 }
            if (r9 != 0) goto L_0x08ca
            int r14 = r14 + 1
            goto L_0x07c9
        L_0x07e4:
            r14 = 1
            goto L_0x07ec
        L_0x07e6:
            java.lang.String r2 = "  YOU MUST LOGIN TO USE THIS APP WITH A LESS PROMINENT WATERMARK"
            r6.append(r2)     // Catch:{ all -> 0x0a12 }
            r14 = 0
        L_0x07ec:
            java.util.Calendar r2 = java.util.Calendar.getInstance()     // Catch:{ all -> 0x0a12 }
            java.text.SimpleDateFormat r8 = new java.text.SimpleDateFormat     // Catch:{ all -> 0x0a12 }
            java.lang.String r9 = "MMM dd hh:mm:ss yyyy"
            java.util.Locale r10 = java.util.Locale.US     // Catch:{ all -> 0x0a12 }
            r8.<init>(r9, r10)     // Catch:{ all -> 0x0a12 }
            java.util.Date r2 = r2.getTime()     // Catch:{ all -> 0x0a12 }
            java.lang.String r2 = r8.format(r2)     // Catch:{ all -> 0x0a12 }
            android.text.SpannableStringBuilder r8 = new android.text.SpannableStringBuilder     // Catch:{ all -> 0x0a12 }
            r8.<init>()     // Catch:{ all -> 0x0a12 }
            r9 = 2
            java.lang.String[] r10 = new java.lang.String[r9]     // Catch:{ all -> 0x0a12 }
            r11 = 0
            r10[r11] = r2     // Catch:{ all -> 0x0a12 }
            java.lang.String r2 = r6.toString()     // Catch:{ all -> 0x0a12 }
            r6 = 1
            r10[r6] = r2     // Catch:{ all -> 0x0a12 }
            r2 = 0
        L_0x0814:
            r12 = 100
            if (r2 >= r12) goto L_0x083c
            android.text.SpannableStringBuilder r12 = new android.text.SpannableStringBuilder     // Catch:{ all -> 0x0a12 }
            r12.<init>()     // Catch:{ all -> 0x0a12 }
            java.util.List r13 = java.util.Arrays.asList(r10)     // Catch:{ all -> 0x0a12 }
            java.util.Collections.shuffle(r13)     // Catch:{ all -> 0x0a12 }
            java.lang.String r13 = "  CONFIDENTIAL  "
            r12.append(r13)     // Catch:{ all -> 0x0a12 }
            r13 = r10[r11]     // Catch:{ all -> 0x0a12 }
            r12.append(r13)     // Catch:{ all -> 0x0a12 }
            r12.append(r7)     // Catch:{ all -> 0x0a12 }
            r13 = r10[r6]     // Catch:{ all -> 0x0a12 }
            r12.append(r13)     // Catch:{ all -> 0x0a12 }
            r8.append(r12)     // Catch:{ all -> 0x0a12 }
            int r2 = r2 + 1
            goto L_0x0814
        L_0x083c:
            android.widget.TextView r2 = new android.widget.TextView     // Catch:{ all -> 0x0a12 }
            r2.<init>(r5)     // Catch:{ all -> 0x0a12 }
            android.view.WindowManager$LayoutParams r7 = new android.view.WindowManager$LayoutParams     // Catch:{ all -> 0x0a12 }
            r16 = -1
            r17 = -1
            r18 = 2
            r19 = 24
            r20 = -3
            r15 = r7
            r15.<init>(r16, r17, r18, r19, r20)     // Catch:{ all -> 0x0a12 }
            android.widget.TextView$BufferType r10 = android.widget.TextView.BufferType.SPANNABLE     // Catch:{ all -> 0x0a12 }
            r2.setText(r8, r10)     // Catch:{ all -> 0x0a12 }
            android.content.res.Resources r5 = r5.getResources()     // Catch:{ all -> 0x0a12 }
            r8 = 2131173114(0x7f071efa, float:1.7960662E38)
            float r8 = r5.getDimension(r8)     // Catch:{ all -> 0x0a12 }
            r10 = 2131173115(0x7f071efb, float:1.7960664E38)
            float r10 = r5.getDimension(r10)     // Catch:{ all -> 0x0a12 }
            if (r6 == r14) goto L_0x086b
            r8 = r10
        L_0x086b:
            r2.setTextSize(r11, r8)     // Catch:{ all -> 0x0a12 }
            android.graphics.Typeface r8 = r2.getTypeface()     // Catch:{ all -> 0x0a12 }
            r2.setTypeface(r8, r6)     // Catch:{ all -> 0x0a12 }
            r8 = 0
            r10 = 1082130432(0x40800000, float:4.0)
            r2.setLineSpacing(r8, r10)     // Catch:{ all -> 0x0a12 }
            r2.setFocusable(r11)     // Catch:{ all -> 0x0a12 }
            r2.setClickable(r11)     // Catch:{ all -> 0x0a12 }
            r2.setImportantForAccessibility(r9)     // Catch:{ all -> 0x0a12 }
            r2.setContentDescription(r3)     // Catch:{ all -> 0x0a12 }
            r8 = 2131104381(0x7f06127d, float:1.7821255E38)
            int r8 = r5.getColor(r8)     // Catch:{ all -> 0x0a12 }
            r9 = 2131104382(0x7f06127e, float:1.7821257E38)
            int r9 = r5.getColor(r9)     // Catch:{ all -> 0x0a12 }
            if (r6 == r14) goto L_0x0898
            r8 = r9
        L_0x0898:
            r2.setTextColor(r8)     // Catch:{ all -> 0x0a12 }
            r2.setLayoutParams(r7)     // Catch:{ all -> 0x0a12 }
            r7 = 1134886912(0x43a50000, float:330.0)
            r2.setRotation(r7)     // Catch:{ all -> 0x0a12 }
            r7 = 2131493259(0x7f0c018b, float:1.8609993E38)
            int r7 = r5.getInteger(r7)     // Catch:{ all -> 0x0a12 }
            r8 = 2131493261(0x7f0c018d, float:1.8609997E38)
            int r8 = r5.getInteger(r8)     // Catch:{ all -> 0x0a12 }
            r9 = 2131493260(0x7f0c018c, float:1.8609995E38)
            int r9 = r5.getInteger(r9)     // Catch:{ all -> 0x0a12 }
            r10 = 2131493258(0x7f0c018a, float:1.8609991E38)
            int r5 = r5.getInteger(r10)     // Catch:{ all -> 0x0a12 }
            r2.layout(r7, r8, r9, r5)     // Catch:{ all -> 0x0a12 }
            android.view.ViewGroupOverlay r4 = r4.getOverlay()     // Catch:{ all -> 0x0a12 }
            r4.add(r2)     // Catch:{ all -> 0x0a12 }
            goto L_0x08cc
        L_0x08ca:
            r6 = 1
            r11 = 0
        L_0x08cc:
            r1.setContentView((android.view.View) r0)     // Catch:{ all -> 0x0a12 }
            r0 = r56
            android.os.Bundle r2 = r1.m176442D(r0)     // Catch:{ all -> 0x0a12 }
            if (r58 != 0) goto L_0x08dc
            java.lang.String r4 = r1.m176443E(r0)     // Catch:{ all -> 0x0a12 }
            goto L_0x08dd
        L_0x08dc:
            r4 = r3
        L_0x08dd:
            com.google.android.apps.gsa.staticplugins.opa.ly r5 = r1.f295634T     // Catch:{ all -> 0x0a12 }
            boolean r7 = r1.f295644ai     // Catch:{ all -> 0x0a12 }
            r7 = r7 ^ r6
            r5.mo97835m(r7, r4)     // Catch:{ all -> 0x0a12 }
            boolean r4 = com.google.android.apps.gsa.search.shared.p6930h.C87566i.m142254aB(r2)     // Catch:{ all -> 0x0a12 }
            if (r4 == 0) goto L_0x08fb
            dagger.a r4 = r1.f295628N     // Catch:{ all -> 0x0a12 }
            java.lang.Object r4 = r4.mo27525b()     // Catch:{ all -> 0x0a12 }
            com.google.android.apps.gsa.staticplugins.opa.tapas.q.cv r4 = (com.google.android.apps.gsa.staticplugins.opa.tapas.p8572q.C113191cv) r4     // Catch:{ all -> 0x0a12 }
            boolean r4 = r4.mo99907c()     // Catch:{ all -> 0x0a12 }
            if (r4 == 0) goto L_0x08fb
            r14 = 1
            goto L_0x08fc
        L_0x08fb:
            r14 = 0
        L_0x08fc:
            com.google.android.apps.gsa.search.core.i.t r4 = r1.f295663q     // Catch:{ all -> 0x0a12 }
            com.google.android.apps.gsa.shared.m.d r5 = com.google.android.apps.gsa.shared.p7066m.C90014bt.f247760nI     // Catch:{ all -> 0x0a12 }
            boolean r4 = r4.mo79746e(r5)     // Catch:{ all -> 0x0a12 }
            if (r4 == 0) goto L_0x0917
            com.google.android.apps.gsa.staticplugins.opa.ly r4 = r1.f295634T     // Catch:{ all -> 0x0a12 }
            com.google.android.apps.gsa.staticplugins.opa.fj r4 = r4.f304827n     // Catch:{ all -> 0x0a12 }
            boolean r4 = r4.mo97491bA(r2)     // Catch:{ all -> 0x0a12 }
            if (r4 == 0) goto L_0x0917
            r2 = 2130772160(0x7f0100c0, float:1.714743E38)
            r1.overridePendingTransition(r2, r11)     // Catch:{ all -> 0x0a12 }
            goto L_0x0930
        L_0x0917:
            if (r14 == 0) goto L_0x0920
            r2 = 2130772027(0x7f01003b, float:1.714716E38)
            r1.overridePendingTransition(r2, r11)     // Catch:{ all -> 0x0a12 }
            goto L_0x0930
        L_0x0920:
            boolean r2 = com.google.android.apps.gsa.search.shared.p6930h.C87566i.m142290an(r2)     // Catch:{ all -> 0x0a12 }
            if (r2 == 0) goto L_0x092a
            r1.overridePendingTransition(r11, r11)     // Catch:{ all -> 0x0a12 }
            goto L_0x0930
        L_0x092a:
            r2 = 2130772162(0x7f0100c2, float:1.7147435E38)
            r1.overridePendingTransition(r2, r11)     // Catch:{ all -> 0x0a12 }
        L_0x0930:
            android.os.Bundle r2 = r1.f295649an     // Catch:{ all -> 0x0a12 }
            boolean r2 = com.google.android.apps.gsa.search.shared.p6930h.C87566i.m142264aL(r2)     // Catch:{ all -> 0x0a12 }
            android.os.Bundle r4 = r1.f295649an     // Catch:{ all -> 0x0a12 }
            boolean r4 = com.google.android.apps.gsa.search.shared.p6930h.C87566i.m142298av(r4)     // Catch:{ all -> 0x0a12 }
            if (r4 == 0) goto L_0x0947
            android.os.Bundle r4 = r1.f295649an     // Catch:{ all -> 0x0a12 }
            boolean r4 = com.google.android.apps.gsa.search.shared.p6930h.C87566i.m142270aR(r4)     // Catch:{ all -> 0x0a12 }
            if (r4 != 0) goto L_0x0947
            goto L_0x094b
        L_0x0947:
            if (r2 != 0) goto L_0x094b
            r14 = 0
            goto L_0x096a
        L_0x094b:
            android.os.Bundle r2 = r1.f295649an     // Catch:{ all -> 0x0a12 }
            com.google.android.apps.gsa.search.shared.h.h r4 = new com.google.android.apps.gsa.search.shared.h.h     // Catch:{ all -> 0x0a12 }
            r4.<init>(r2)     // Catch:{ all -> 0x0a12 }
            r4.f236497A = r6     // Catch:{ all -> 0x0a12 }
            android.os.Bundle r2 = r4.mo81685a()     // Catch:{ all -> 0x0a12 }
            r1.f295649an = r2     // Catch:{ all -> 0x0a12 }
            boolean r2 = com.google.android.apps.gsa.search.shared.p6930h.C87566i.m142290an(r2)     // Catch:{ all -> 0x0a12 }
            if (r2 != 0) goto L_0x0969
            r2 = 2130772159(0x7f0100bf, float:1.7147429E38)
            r4 = 2130771973(0x7f010005, float:1.7147051E38)
            r1.overridePendingTransition(r2, r4)     // Catch:{ all -> 0x0a12 }
        L_0x0969:
            r14 = 1
        L_0x096a:
            r1.m176448J(r14)     // Catch:{ all -> 0x0a12 }
            com.google.common.base.ax r2 = r1.f295617C     // Catch:{ all -> 0x0a12 }
            boolean r2 = r2.mo56113h()     // Catch:{ all -> 0x0a12 }
            if (r2 == 0) goto L_0x0991
            com.google.common.base.ax r2 = r1.f295617C     // Catch:{ all -> 0x0a12 }
            java.lang.Object r2 = r2.mo56107c()     // Catch:{ all -> 0x0a12 }
            r4 = r2
            com.google.android.apps.gsa.shared.logger.i.b r4 = (com.google.android.apps.gsa.shared.logger.p7064i.C89922b) r4     // Catch:{ all -> 0x0a12 }
            com.google.common.o.ty r5 = com.google.common.p4552o.C60547ty.OPA_ACTIVITY     // Catch:{ all -> 0x0a12 }
            java.lang.Class r6 = r57.getClass()     // Catch:{ all -> 0x0a12 }
            com.google.common.base.ax r7 = com.google.common.base.C58833ax.m90834k(r0)     // Catch:{ all -> 0x0a12 }
            long r8 = r51.toMillis()     // Catch:{ all -> 0x0a12 }
            boolean r10 = r1.f295644ai     // Catch:{ all -> 0x0a12 }
            r4.mo83758b(r5, r6, r7, r8, r10)     // Catch:{ all -> 0x0a12 }
        L_0x0991:
            com.google.android.libraries.search.logging.appflows.startup.a.e r0 = r1.f295618D     // Catch:{ all -> 0x0a12 }
            r2 = r51
            r0.mo41627a(r2, r1)     // Catch:{ all -> 0x0a12 }
            com.google.android.apps.gsa.staticplugins.opa.ms r0 = r1.f295619E     // Catch:{ all -> 0x0a12 }
            java.lang.ref.WeakReference r4 = new java.lang.ref.WeakReference     // Catch:{ all -> 0x0a12 }
            r4.<init>(r1)     // Catch:{ all -> 0x0a12 }
            r0.f305672a = r4     // Catch:{ all -> 0x0a12 }
            com.google.android.apps.gsa.staticplugins.opa.g.f r0 = r1.f295626L     // Catch:{ all -> 0x0a12 }
            j$.util.Optional r4 = r0.f303610b     // Catch:{ all -> 0x0a12 }
            boolean r4 = r4.isPresent()     // Catch:{ all -> 0x0a12 }
            if (r4 == 0) goto L_0x09b8
            android.media.AudioManager r4 = r0.f303611c     // Catch:{ all -> 0x0a12 }
            j$.util.Optional r0 = r0.f303610b     // Catch:{ all -> 0x0a12 }
            java.lang.Object r0 = r0.get()     // Catch:{ all -> 0x0a12 }
            android.media.AudioDeviceCallback r0 = (android.media.AudioDeviceCallback) r0     // Catch:{ all -> 0x0a12 }
            r4.registerAudioDeviceCallback(r0, r3)     // Catch:{ all -> 0x0a12 }
        L_0x09b8:
            long r3 = f295613ad     // Catch:{ all -> 0x0a12 }
            r5 = 0
            int r0 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r0 <= 0) goto L_0x09ef
            j$.time.Duration r0 = r2.minusMillis(r3)     // Catch:{ all -> 0x0a12 }
            j$.time.Duration r3 = f295609Z     // Catch:{ all -> 0x0a12 }
            int r0 = r0.compareTo((p3186j$.time.Duration) r3)     // Catch:{ all -> 0x0a12 }
            r2.toMillis()     // Catch:{ all -> 0x0a12 }
            if (r0 >= 0) goto L_0x09ed
            dagger.a r0 = r1.f295629O     // Catch:{ all -> 0x0a12 }
            java.lang.Object r0 = r0.mo27525b()     // Catch:{ all -> 0x0a12 }
            com.google.common.base.ax r0 = (com.google.common.base.C58833ax) r0     // Catch:{ all -> 0x0a12 }
            boolean r2 = r0.mo56113h()     // Catch:{ all -> 0x0a12 }
            if (r2 == 0) goto L_0x09ed
            java.lang.Object r0 = r0.mo56107c()     // Catch:{ all -> 0x0a12 }
            com.google.android.apps.gsa.nga.shared.v.i r0 = (com.google.android.apps.gsa.nga.shared.p6407v.C83305i) r0     // Catch:{ all -> 0x0a12 }
            java.lang.String r2 = "NGA_OPA_SHORT_RECREATION_TIME"
            com.google.android.apps.gsa.nga.shared.v.c.ea r3 = new com.google.android.apps.gsa.nga.shared.v.c.ea     // Catch:{ all -> 0x0a12 }
            r3.<init>(r2)     // Catch:{ all -> 0x0a12 }
            r0.mo75579d(r3)     // Catch:{ all -> 0x0a12 }
        L_0x09ed:
            f295613ad = r5     // Catch:{ all -> 0x0a12 }
        L_0x09ef:
            com.google.android.apps.gsa.nga.shared.x.m r0 = r1.f295640ae     // Catch:{ all -> 0x0a12 }
            com.google.android.apps.gsa.staticplugins.opa.ak.d.a.a r2 = r1.f295639Y     // Catch:{ all -> 0x0a12 }
            com.google.android.apps.gsa.nga.shared.x.g r2 = r2.f296619a     // Catch:{ all -> 0x0a12 }
            com.google.android.apps.gsa.staticplugins.opa.lm r3 = com.google.android.apps.gsa.staticplugins.opa.C109440lm.f304768a     // Catch:{ all -> 0x0a12 }
            com.google.android.apps.gsa.nga.shared.x.h r2 = com.google.android.apps.gsa.nga.shared.p6417x.C83349aj.m132658m(r2, r3)     // Catch:{ all -> 0x0a12 }
            com.google.android.libraries.gsa.k.g r3 = r1.f295666t     // Catch:{ all -> 0x0a12 }
            com.google.android.apps.gsa.staticplugins.opa.ln r4 = new com.google.android.apps.gsa.staticplugins.opa.ln     // Catch:{ all -> 0x0a12 }
            r4.<init>(r1)     // Catch:{ all -> 0x0a12 }
            com.google.android.apps.gsa.nga.shared.x.s r5 = new com.google.android.apps.gsa.nga.shared.x.s     // Catch:{ all -> 0x0a12 }
            java.lang.String r6 = "getIsAssistUiActive"
            r5.<init>(r3, r6, r4)     // Catch:{ all -> 0x0a12 }
            r0.mo76662b(r2, r5)     // Catch:{ all -> 0x0a12 }
            if (r44 == 0) goto L_0x0a11
            r44.close()
        L_0x0a11:
            return
        L_0x0a12:
            r0 = move-exception
            goto L_0x0a1a
        L_0x0a14:
            r0 = move-exception
            r1 = r57
            goto L_0x0a1a
        L_0x0a18:
            r0 = move-exception
            r1 = r15
        L_0x0a1a:
            r2 = r0
        L_0x0a1b:
            if (r44 == 0) goto L_0x0a26
            r44.close()     // Catch:{ all -> 0x0a21 }
            goto L_0x0a26
        L_0x0a21:
            r0 = move-exception
            r3 = r0
            com.google.android.apps.gsa.staticplugins.opa.C109432le.m182115a(r2, r3)
        L_0x0a26:
            goto L_0x0a28
        L_0x0a27:
            throw r2
        L_0x0a28:
            goto L_0x0a27
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.staticplugins.opa.OpaActivity.onCreate(android.os.Bundle):void");
    }

    public final void onDestroy() {
        C109100ar arVar;
        C47538ax c = this.f295633S.mo51613c("onDestroy");
        try {
            f295613ad = SystemClock.elapsedRealtime();
            C59104x b = f295614j.mo56224b();
            b.mo56378ag(C58975e.f156826a, "OpaActivity");
            ((C59052c) ((C59052c) b).mo56372aa(22895)).mo56386p("onDestroy");
            C39141kp kpVar = this.f295632R;
            if (kpVar != null) {
                ((C19567d) kpVar.f102793D.mo6453a()).mo24822a(1, new Object[0]);
            }
            this.f295622H.mo96586a(C108199g.f300956a);
            m176447I(C89849ae.OPA_ACTIVITY_DISMISS_OTHER);
            C109452ly lyVar = this.f295634T;
            if (lyVar != null) {
                lyVar.mo97832j(false);
                C107659as asVar = lyVar.f304837x;
                ((C107656ap) asVar).f299581d.unregisterOnSharedPreferenceChangeListener(asVar);
                m l = ((C107656ap) asVar).mo96183l();
                if (l != null) {
                    l.k();
                }
                C107709t tVar = lyVar.f304825l;
                if (tVar.f299726c) {
                    ((C107705p) tVar.f299725b.mo27525b()).mo96231d();
                } else {
                    tVar.f299724a.mo98047a().mo81933e();
                }
                C107709t tVar2 = lyVar.f304825l;
                if (tVar2.f299726c) {
                    ((C107705p) tVar2.f299725b.mo27525b()).mo96231d();
                } else {
                    tVar2.f299724a.mo98047a().mo81934f();
                }
                ((C113798bn) lyVar.f304794F.mo27525b()).mo24920b();
                C109040fj fjVar = lyVar.f304827n;
                fjVar.f303238X.mo96192t();
                C108303dt dtVar = fjVar.f303231Q;
                if (dtVar != null) {
                    dtVar.mo96749l();
                }
                C109759oe oeVar = fjVar.f303459x;
                if (oeVar != null) {
                    oeVar.mo98096b();
                }
                C109105b bVar = fjVar.f303323bd;
                if (!(bVar == null || (arVar = bVar.f303830g) == null)) {
                    arVar.mo97594j(C89849ae.OPA_FRE_INPUT_PLATE_CLOSED);
                }
                C114735e eVar = (C114735e) fjVar.f303317bX.mo27525b();
                eVar.mo101555c(C89849ae.OPA_ZERO_STATE_CONVERSATION_LOGGING_ON_OPA_ACTIVITY_DESTROY);
                eVar.mo101557e(C89849ae.OPA_ZERO_STATE_FAB_V2_FLOW_OPA_ACTIVITY_DESTROY);
                fjVar.f303270ad.mo100357b();
                ((C114737g) fjVar.f303316bW.mo27525b()).mo101562a();
                fjVar.f303450o.mo95366H();
                C87546b bVar2 = fjVar.f303236V.f303914i;
                if (bVar2 != null) {
                    bVar2.mo77522d();
                }
                if (fjVar.f303311bR) {
                    fjVar.f303311bR = false;
                    new C90873ag((C60870cx) fjVar.f303312bS.mo27525b(), fjVar.f303448m, "No-logging CardFactory destroyer", C107580au.f299300a).mo85223a(C107620av.f299388a);
                }
                if (fjVar.f303262aV.mo95240v()) {
                    fjVar.f303262aV.mo95226h();
                    fjVar.f303253aM.mo76921b();
                }
                if (fjVar.f303371cc) {
                    fjVar.f303376ch.mo83139m(false);
                }
                fjVar.f303376ch.mo83137k(false);
                ((C109467mf) fjVar.f303313bT.mo27525b()).mo97847b(C89849ae.OPA_INPUT_PLATE_CLOSED);
                fjVar.f303376ch.f241687c.mo5679j(fjVar.f303378cj);
                if (fjVar.f303455t.mo79746e(C90016bv.f247856c)) {
                    Iterator it = ((C109258hw) fjVar.f303236V.f303912g.mo6453a()).f304302y.iterator();
                    while (it.hasNext()) {
                        ((Runnable) it.next()).run();
                    }
                }
            }
            C109063f fVar = this.f295626L;
            if (fVar != null && fVar.f303610b.isPresent()) {
                fVar.f303611c.unregisterAudioDeviceCallback((AudioDeviceCallback) fVar.f303610b.get());
            }
            this.f295640ae.mo76661a();
            super.onDestroy();
            this.f295631Q.mo27604a();
            this.f295619E.f305672a = null;
            ((C91022f) this.f295672z.mo27525b()).mo85302b(this);
            if (c != null) {
                c.close();
                return;
            }
            return;
        } catch (Throwable th) {
            C109432le.m182115a(th, th);
        }
        throw th;
    }

    public final void onEnterAnimationComplete() {
        super.onEnterAnimationComplete();
        C109452ly lyVar = this.f295634T;
        C58976aa aaVar = C58975e.f156826a;
        if (lyVar.f304833t != C88134qk.UNINITIALIZED) {
            C109040fj fjVar = lyVar.f304827n;
            if (C109040fj.m181378bx(fjVar.f303450o)) {
                C113989h hVar = (C113989h) ((C113988g) fjVar.f303450o).mo100833bf().mo56107c();
                hVar.mo100854bV();
                if (fjVar.mo97496bF()) {
                    hVar.mo100874cK(false);
                }
            }
        }
    }

    public final void onNewIntent(Intent intent) {
        C109452ly lyVar = this.f295634T;
        if (lyVar == null || lyVar.f304827n.f303460y == null) {
            C58976aa aaVar = C58975e.f156826a;
            this.f295634T.mo97835m(!m176450L(), m176443E(intent));
            if (intent != null && TextUtils.isEmpty(intent.getStringExtra("app_integration_client_package_name"))) {
                intent.putExtra("app_integration_client_package_name", getIntent().getStringExtra("app_integration_client_package_name"));
            }
            setIntent(intent);
            m176442D(intent);
            super.onNewIntent(intent);
            ((C89859i) this.f295668v.mo27525b()).mo83702b(C89849ae.OPA_ANDROID_STARTUP_INTENT);
        }
    }

    public final void onPause() {
        ImageView imageView;
        Bundle bundle;
        Bundle bundle2;
        C47538ax c = this.f295633S.mo51613c("onPause");
        try {
            C59104x b = f295614j.mo56224b();
            b.mo56378ag(C58975e.f156826a, "OpaActivity");
            ((C59052c) ((C59052c) b).mo56372aa(22897)).mo56386p("onPause");
            if (C87566i.m142291ao(this.f295649an) && (bundle2 = this.f295649an) != null) {
                bundle2.remove("assistant_launch_mode");
            }
            this.f295651ap = C87566i.m142298av(this.f295649an);
            this.f295653ar = C87564g.m142223a(this.f295649an) == e.bQ;
            if (this.f295635U && !this.f295662p.mo78228b()) {
                this.f295649an = null;
            } else if (this.f295662p.mo78228b() && (bundle = this.f295649an) != null) {
                bundle.putParcelable("opa-pending-lockscreen-query", C87566i.m142231F(bundle));
                this.f295649an.remove("opa-query-string");
                this.f295649an.remove("opa-query");
            }
            C109452ly lyVar = this.f295634T;
            boolean z = this.f295635U;
            lyVar.mo97831i(C88079oj.PAUSED);
            if (z) {
                if (lyVar.f304827n.f303237W.mo96244e() && !((Boolean) lyVar.f304795G.mo27525b()).booleanValue()) {
                    lyVar.f304828o.mo82120a();
                }
                lyVar.mo97833k(false);
                boolean z2 = lyVar.f304802N;
                if (lyVar.f304818e.mo79746e(C90065dq.f249657d)) {
                    z2 = lyVar.f304803O.f195096a.get();
                }
                if (lyVar.f304801M && !lyVar.f304827n.mo97531bz() && !z2 && C87566i.m142304c(lyVar.f304836w) != 3) {
                    C87961k kVar = (C87961k) C87988l.f237953e.createBuilder();
                    kVar.copyOnWrite();
                    C87988l lVar = (C87988l) kVar.instance;
                    lVar.f237955a |= 1;
                    lVar.f237956b = 1;
                    kVar.copyOnWrite();
                    C87988l lVar2 = (C87988l) kVar.instance;
                    lVar2.f237955a |= 2;
                    lVar2.f237957c = 4;
                    C87422j jVar = (C87422j) C87423k.f236084e.createBuilder();
                    jVar.copyOnWrite();
                    C87423k kVar2 = (C87423k) jVar.instance;
                    kVar2.f236087b = 7;
                    kVar2.f236086a |= 1;
                    C87423k kVar3 = (C87423k) jVar.build();
                    kVar.copyOnWrite();
                    C87988l lVar3 = (C87988l) kVar.instance;
                    kVar3.getClass();
                    lVar3.f237958d = kVar3;
                    lVar3.f237955a |= 4;
                    C88489j jVar2 = new C88489j(C87739bu.ACTION_USER_INTERACTION);
                    jVar2.mo82014b(C87934j.f237849a, (C87988l) kVar.build());
                    lyVar.f304825l.mo81937i(jVar2.mo82013a());
                }
                if (!((C84516aa) lyVar.f304835v.mo27525b()).mo78230d()) {
                    lyVar.f304825l.mo81937i(new C88489j(C87739bu.STOP_SPEAKING).mo82013a());
                }
            }
            if (lyVar.f304833t != C88134qk.UNINITIALIZED) {
                C109040fj fjVar = lyVar.f304827n;
                fjVar.f303218D.mo96344a(1);
                if (((C58833ax) fjVar.f303285as.mo27525b()).mo56113h()) {
                    ((com.google.android.apps.gsa.assistant.shared.e) ((C58833ax) fjVar.f303285as.mo27525b()).mo56107c()).a(fjVar.f303346c, fjVar.f303259aS);
                }
                fjVar.f303270ad.mo100357b();
                C106158g gVar = fjVar.f303269ac;
                if (!(gVar == null || (imageView = gVar.f296272g) == null)) {
                    imageView.setOnClickListener((View.OnClickListener) null);
                }
                if (!fjVar.f303238X.mo96131aD()) {
                    fjVar.f303238X.mo96151ac(false);
                }
                if (fjVar.f303459x.mo98101h()) {
                    C109759oe oeVar = fjVar.f303459x;
                    if (oeVar.mo98100g()) {
                        oeVar.f305821m = 5;
                        oeVar.f305811c.mo97461aW();
                        oeVar.mo98096b();
                    }
                }
                C109105b bVar = fjVar.f303323bd;
                C60870cx cxVar = bVar.f303829f;
                if (cxVar != null) {
                    cxVar.cancel(true);
                    bVar.f303829f = null;
                }
                if (!bVar.mo97613e()) {
                    bVar.f303836m = 5;
                }
                bVar.f303834k = false;
                bVar.f303835l = false;
                C109100ar arVar = bVar.f303830g;
                if (arVar != null) {
                    arVar.f303744I = false;
                    arVar.f303745J = false;
                }
                ((C114737g) fjVar.f303316bW.mo27525b()).mo101563b();
                ChatUiHelpController chatUiHelpController = fjVar.f303460y;
                if (chatUiHelpController != null) {
                    chatUiHelpController.mo97747c();
                }
                if (fjVar.f303262aV.mo95240v()) {
                    fjVar.f303262aV.mo95233o();
                }
                fjVar.f303450o.mo95360B();
                C107144k kVar4 = fjVar.f303240Z;
                kVar4.f298228g.mo95818m(kVar4.f298233l);
                C113854ci ciVar = (C113854ci) fjVar.f303252aL.mo27525b();
                long d = ciVar.f315269b.mo26872d();
                synchronized (ciVar.f315270c) {
                    BitFlags bitFlags = ciVar.f315271d;
                    if (bitFlags.mo85050d()) {
                        long j = ciVar.f315272e;
                        bitFlags.mo85054g();
                        ciVar.f315272e = 0;
                        C59582aj ajVar = (C59582aj) C59687cb.f160034bf.createBuilder();
                        ajVar.copyOnWrite();
                        C59687cb cbVar = (C59687cb) ajVar.instance;
                        cbVar.f160062a |= 1073741824;
                        cbVar.f160036A = j;
                        C89856f fVar = new C89856f();
                        fVar.f246201a = C89849ae.OPA_ANDROID_STARTUP_INTERRUPTED;
                        fVar.f246203c = (C59687cb) ajVar.build();
                        fVar.f246204d = d;
                        ((C89859i) ciVar.f315268a.mo27525b()).mo74236a(fVar.mo83699a());
                    }
                }
                ((C113793bi) fjVar.f303325bf.mo27525b()).f315157c.mo5679j(fjVar.f303377ci);
                ((C113798bn) fjVar.f303258aR.mo27525b()).mo24921c(new C19623a(3), (C19628b) null);
                ((C114735e) fjVar.f303317bX.mo27525b()).mo101556d(C89849ae.OPA_ANDROID_ZERO_STATE_USER_EXIT);
                fjVar.f303301bH = false;
                fjVar.f303329bj.mo96473f(fjVar.f303454s);
            }
            m l = ((C107656ap) lyVar.f304837x).mo96183l();
            if (l != null) {
                l.l();
            }
            super.onPause();
            this.f295657k.set(true);
            this.f295661o.mo17528e();
            if (c != null) {
                c.close();
            }
        } catch (Throwable th) {
            Throwable th2 = th;
            if (c != null) {
                try {
                    c.close();
                } catch (Throwable th3) {
                    C109432le.m182115a(th2, th3);
                }
            }
            throw th2;
        }
    }

    public final void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        super.onRequestPermissionsResult(i, strArr, iArr);
        this.f295641af.f304773e.mo85347b(i, strArr, iArr);
    }

    /* JADX WARNING: Removed duplicated region for block: B:129:0x035a A[Catch:{ all -> 0x06c5 }] */
    /* JADX WARNING: Removed duplicated region for block: B:139:0x039f A[Catch:{ all -> 0x06c5 }] */
    /* JADX WARNING: Removed duplicated region for block: B:142:0x03d1 A[Catch:{ all -> 0x06c5 }] */
    /* JADX WARNING: Removed duplicated region for block: B:149:0x03f5 A[Catch:{ all -> 0x06c5 }] */
    /* JADX WARNING: Removed duplicated region for block: B:152:0x0442 A[Catch:{ all -> 0x06c5 }] */
    /* JADX WARNING: Removed duplicated region for block: B:155:0x044e A[Catch:{ all -> 0x06c5 }] */
    /* JADX WARNING: Removed duplicated region for block: B:156:0x045b A[Catch:{ all -> 0x06c5 }] */
    /* JADX WARNING: Removed duplicated region for block: B:158:0x0467 A[Catch:{ all -> 0x06c5 }] */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0062 A[Catch:{ all -> 0x06c7 }] */
    /* JADX WARNING: Removed duplicated region for block: B:179:0x0509 A[Catch:{ all -> 0x06c5 }] */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0064 A[Catch:{ all -> 0x06c7 }] */
    /* JADX WARNING: Removed duplicated region for block: B:182:0x0514 A[Catch:{ all -> 0x06c5 }] */
    /* JADX WARNING: Removed duplicated region for block: B:191:0x0536 A[Catch:{ all -> 0x06c5 }] */
    /* JADX WARNING: Removed duplicated region for block: B:200:0x05ab A[Catch:{ all -> 0x06c5 }] */
    /* JADX WARNING: Removed duplicated region for block: B:211:0x05fb A[Catch:{ all -> 0x06c5 }] */
    /* JADX WARNING: Removed duplicated region for block: B:214:0x0676 A[Catch:{ all -> 0x06c5 }] */
    /* JADX WARNING: Removed duplicated region for block: B:222:0x06c1  */
    /* JADX WARNING: Removed duplicated region for block: B:228:0x06cd A[SYNTHETIC, Splitter:B:228:0x06cd] */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x00a5 A[SYNTHETIC, Splitter:B:22:0x00a5] */
    /* JADX WARNING: Removed duplicated region for block: B:234:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00c9 A[SYNTHETIC, Splitter:B:30:0x00c9] */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00ef A[Catch:{ all -> 0x0027 }] */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00f1 A[Catch:{ all -> 0x0027 }] */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x00ff A[Catch:{ all -> 0x0027 }] */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x0110 A[Catch:{ all -> 0x06c7 }] */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x0112 A[Catch:{ all -> 0x06c7 }] */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x0120 A[Catch:{ all -> 0x06c7 }] */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x0122 A[Catch:{ all -> 0x06c7 }] */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x0133 A[SYNTHETIC, Splitter:B:59:0x0133] */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x01fb A[SYNTHETIC, Splitter:B:81:0x01fb] */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x020e A[Catch:{ all -> 0x06c7 }] */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x020f A[Catch:{ all -> 0x06c7 }] */
    /* JADX WARNING: Removed duplicated region for block: B:99:0x0266 A[Catch:{ all -> 0x06c7 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onResume() {
        /*
            r18 = this;
            r1 = r18
            java.lang.String r2 = "opa_query_commit_id"
            com.google.apps.tiktok.tracing.dh r3 = r1.f295633S
            java.lang.String r4 = "onResume"
            com.google.apps.tiktok.tracing.ax r3 = r3.mo51613c(r4)
            r4 = 31
            com.google.android.apps.gsa.shared.logger.C89838ab.m146266j(r4)     // Catch:{ all -> 0x06c7 }
            r18.m176444F()     // Catch:{ all -> 0x06c7 }
            boolean r4 = r1.f295635U     // Catch:{ all -> 0x06c7 }
            boolean r5 = r18.hasWindowFocus()     // Catch:{ all -> 0x06c7 }
            r6 = 0
            r7 = 1
            if (r5 != 0) goto L_0x002d
            boolean r5 = r18.mo95150C()     // Catch:{ all -> 0x0027 }
            if (r5 == 0) goto L_0x0025
            goto L_0x002d
        L_0x0025:
            r5 = 0
            goto L_0x002e
        L_0x0027:
            r0 = move-exception
            r2 = r0
            r17 = r3
            goto L_0x06cb
        L_0x002d:
            r5 = 1
        L_0x002e:
            r4 = r4 | r5
            r1.f295635U = r4     // Catch:{ all -> 0x06c7 }
            com.google.common.f.e r4 = f295614j     // Catch:{ all -> 0x06c7 }
            com.google.common.f.x r4 = r4.mo56224b()     // Catch:{ all -> 0x06c7 }
            com.google.common.f.aa r5 = com.google.common.p4526f.p4527a.C58975e.f156826a     // Catch:{ all -> 0x06c7 }
            java.lang.String r8 = "OpaActivity"
            r4.mo56378ag(r5, r8)     // Catch:{ all -> 0x06c7 }
            java.lang.String r5 = "onResume, intent: %s"
            android.content.Intent r8 = r18.getIntent()     // Catch:{ all -> 0x06c7 }
            r9 = 22900(0x5974, float:3.209E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r4).mo56372aa(r9)).mo56389s(r5, r8)     // Catch:{ all -> 0x06c7 }
            com.google.android.apps.gsa.staticplugins.opa.ly r4 = r1.f295634T     // Catch:{ all -> 0x06c7 }
            android.os.Bundle r5 = r1.f295649an     // Catch:{ all -> 0x06c7 }
            com.google.android.apps.gsa.search.shared.h.h r8 = new com.google.android.apps.gsa.search.shared.h.h     // Catch:{ all -> 0x06c7 }
            r8.<init>(r5)     // Catch:{ all -> 0x06c7 }
            boolean r5 = r18.m176450L()     // Catch:{ all -> 0x06c7 }
            r8.f236559e = r5     // Catch:{ all -> 0x06c7 }
            android.os.Bundle r5 = r1.f295649an     // Catch:{ all -> 0x06c7 }
            int r5 = com.google.android.apps.gsa.search.shared.p6930h.C87567j.m142328a(r5)     // Catch:{ all -> 0x06c7 }
            r9 = 4
            r10 = 3
            if (r5 != r9) goto L_0x0064
            r5 = 3
            goto L_0x0069
        L_0x0064:
            boolean r9 = r1.f295644ai     // Catch:{ all -> 0x06c7 }
            if (r9 == 0) goto L_0x0069
            r5 = 1
        L_0x0069:
            r8.f236560f = r5     // Catch:{ all -> 0x06c7 }
            long r11 = r1.f295650ao     // Catch:{ all -> 0x06c7 }
            r8.f236576v = r11     // Catch:{ all -> 0x06c7 }
            android.content.Intent r5 = r18.getIntent()     // Catch:{ all -> 0x06c7 }
            android.os.Bundle r5 = r5.getExtras()     // Catch:{ all -> 0x06c7 }
            boolean r5 = com.google.android.apps.gsa.search.shared.p6930h.C87566i.m142290an(r5)     // Catch:{ all -> 0x06c7 }
            r8.f236537ah = r5     // Catch:{ all -> 0x06c7 }
            android.content.Intent r5 = r18.getIntent()     // Catch:{ all -> 0x06c7 }
            android.os.Bundle r5 = r5.getExtras()     // Catch:{ all -> 0x06c7 }
            java.lang.String r5 = com.google.android.apps.gsa.search.shared.p6930h.C87566i.m142234I(r5)     // Catch:{ all -> 0x06c7 }
            r8.f236521Y = r5     // Catch:{ all -> 0x06c7 }
            android.os.Bundle r5 = r8.mo81685a()     // Catch:{ all -> 0x06c7 }
            com.google.android.apps.gsa.staticplugins.opa.zerostate.h.b r8 = r4.f304796H     // Catch:{ all -> 0x06c7 }
            com.google.android.apps.gsa.assistant.shared.l.e r9 = com.google.android.apps.gsa.search.shared.p6930h.C87564g.m142223a(r5)     // Catch:{ all -> 0x06c7 }
            r8.f318448a = r9     // Catch:{ all -> 0x06c7 }
            r4.f304836w = r5     // Catch:{ all -> 0x06c7 }
            r4.f304801M = r7     // Catch:{ all -> 0x06c7 }
            com.google.android.apps.gsa.search.core.i.t r8 = r4.f304818e     // Catch:{ all -> 0x06c7 }
            com.google.android.apps.gsa.shared.m.d r9 = com.google.android.apps.gsa.shared.p7066m.C90029ch.f248278bl     // Catch:{ all -> 0x06c7 }
            boolean r8 = r8.mo79746e(r9)     // Catch:{ all -> 0x06c7 }
            if (r8 != 0) goto L_0x00b9
            com.google.android.apps.gsa.search.core.i.t r8 = r4.f304818e     // Catch:{ all -> 0x0027 }
            com.google.android.apps.gsa.shared.m.d r9 = com.google.android.apps.gsa.shared.p7066m.C90065dq.f249657d     // Catch:{ all -> 0x0027 }
            boolean r8 = r8.mo79746e(r9)     // Catch:{ all -> 0x0027 }
            if (r8 == 0) goto L_0x00b7
            com.google.android.apps.gsa.assistant.shared.ab r8 = r4.f304803O     // Catch:{ all -> 0x0027 }
            java.util.concurrent.atomic.AtomicBoolean r8 = r8.f195096a     // Catch:{ all -> 0x0027 }
            r8.set(r6)     // Catch:{ all -> 0x0027 }
            goto L_0x00b9
        L_0x00b7:
            r4.f304802N = r6     // Catch:{ all -> 0x0027 }
        L_0x00b9:
            com.google.android.apps.gsa.search.shared.service.b.oj r8 = com.google.android.apps.gsa.search.shared.service.p6935b.C88079oj.RESUMED     // Catch:{ all -> 0x06c7 }
            r4.mo97831i(r8)     // Catch:{ all -> 0x06c7 }
            r4.mo97829g()     // Catch:{ all -> 0x06c7 }
            com.google.common.base.ax r8 = r4.f304832s     // Catch:{ all -> 0x06c7 }
            boolean r8 = r8.mo56113h()     // Catch:{ all -> 0x06c7 }
            if (r8 == 0) goto L_0x0106
            com.google.common.base.ax r8 = r4.f304832s     // Catch:{ all -> 0x0027 }
            java.lang.Object r8 = r8.mo56107c()     // Catch:{ all -> 0x0027 }
            com.google.android.apps.gsa.staticplugins.opa.ah.l r8 = (com.google.android.apps.gsa.staticplugins.opa.p8185ah.C106171l) r8     // Catch:{ all -> 0x0027 }
            android.app.Activity r9 = r4.f304815b     // Catch:{ all -> 0x0027 }
            boolean r11 = com.google.android.apps.gsa.search.shared.p6930h.C87566i.m142260aH(r5)     // Catch:{ all -> 0x0027 }
            if (r11 != 0) goto L_0x00e2
            boolean r11 = com.google.android.apps.gsa.search.shared.p6930h.C87566i.m142298av(r5)     // Catch:{ all -> 0x0027 }
            if (r11 == 0) goto L_0x00e0
            goto L_0x00e2
        L_0x00e0:
            r11 = 0
            goto L_0x00e3
        L_0x00e2:
            r11 = 1
        L_0x00e3:
            r8.f296306d = r11     // Catch:{ all -> 0x0027 }
            if (r11 == 0) goto L_0x00f1
            com.google.android.apps.gsa.search.core.aj.aa r11 = r8.f296304b     // Catch:{ all -> 0x0027 }
            boolean r11 = r11.mo78228b()     // Catch:{ all -> 0x0027 }
            if (r11 == 0) goto L_0x00f1
            r11 = 1
            goto L_0x00f2
        L_0x00f1:
            r11 = 0
        L_0x00f2:
            android.view.Window r9 = r9.getWindow()     // Catch:{ all -> 0x0027 }
            com.google.android.apps.gsa.staticplugins.opa.p8185ah.C106171l.m176834d(r11, r9)     // Catch:{ all -> 0x0027 }
            com.google.android.apps.gsa.staticplugins.opa.ah.o r9 = r8.f296310h     // Catch:{ all -> 0x0027 }
            r9.f296314a = r11     // Catch:{ all -> 0x0027 }
            if (r11 == 0) goto L_0x0106
            com.google.android.apps.gsa.search.core.aj.aa r8 = r8.f296304b     // Catch:{ all -> 0x0027 }
            android.app.KeyguardManager r8 = r8.f230023b     // Catch:{ all -> 0x0027 }
            r8.isDeviceLocked()     // Catch:{ all -> 0x0027 }
        L_0x0106:
            com.google.android.apps.gsa.assistant.shared.bo r8 = r4.f304839z     // Catch:{ all -> 0x06c7 }
            com.google.android.apps.gsa.assistant.shared.l.e r9 = com.google.android.apps.gsa.search.shared.p6930h.C87564g.m142223a(r5)     // Catch:{ all -> 0x06c7 }
            com.google.android.apps.gsa.assistant.shared.l.e r11 = com.google.android.apps.gsa.assistant.shared.l.e.bG     // Catch:{ all -> 0x06c7 }
            if (r9 != r11) goto L_0x0112
            r9 = 1
            goto L_0x0113
        L_0x0112:
            r9 = 0
        L_0x0113:
            r8.g(r9)     // Catch:{ all -> 0x06c7 }
            long r8 = com.google.android.apps.gsa.search.shared.p6930h.C87566i.m142319r(r5)     // Catch:{ all -> 0x06c7 }
            r11 = 0
            int r13 = (r8 > r11 ? 1 : (r8 == r11 ? 0 : -1))
            if (r13 == 0) goto L_0x0122
            r8 = 1
            goto L_0x0123
        L_0x0122:
            r8 = 0
        L_0x0123:
            com.google.android.apps.gsa.assistant.shared.bm r9 = r4.f304838y     // Catch:{ all -> 0x06c7 }
            boolean r9 = r9.n()     // Catch:{ all -> 0x06c7 }
            java.lang.String r13 = "opa_force_hotword_enrollment"
            java.lang.String r14 = "opa_upgrade_show_value_prop"
            java.lang.String r15 = "opa_show_screen_search_upgrade_card"
            java.lang.String r11 = "opa_upgrade_launch_count"
            if (r9 == 0) goto L_0x01f3
            android.content.SharedPreferences r9 = r4.f304819f     // Catch:{ all -> 0x0027 }
            int r9 = r9.getInt(r11, r6)     // Catch:{ all -> 0x0027 }
            android.content.SharedPreferences r12 = r4.f304819f     // Catch:{ all -> 0x0027 }
            android.content.SharedPreferences$Editor r12 = r12.edit()     // Catch:{ all -> 0x0027 }
            int r9 = r9 + r7
            android.content.SharedPreferences$Editor r9 = r12.putInt(r11, r9)     // Catch:{ all -> 0x0027 }
            r9.apply()     // Catch:{ all -> 0x0027 }
            com.google.android.apps.gsa.assistant.shared.bm r9 = r4.f304838y     // Catch:{ all -> 0x0027 }
            boolean r9 = r9.m()     // Catch:{ all -> 0x0027 }
            if (r9 != 0) goto L_0x01f3
            dagger.a r9 = r4.f304817d     // Catch:{ all -> 0x0027 }
            java.lang.Object r9 = r9.mo27525b()     // Catch:{ all -> 0x0027 }
            com.google.android.apps.gsa.shared.m.b.f r9 = (com.google.android.apps.gsa.shared.p7066m.p7068b.C89994f) r9     // Catch:{ all -> 0x0027 }
            java.lang.String r9 = r9.mo83885ae()     // Catch:{ all -> 0x0027 }
            com.google.android.apps.gsa.assist.c.a.a r12 = r4.f304822i     // Catch:{ all -> 0x0027 }
            boolean r12 = r12.mo17583e()     // Catch:{ all -> 0x0027 }
            if (r12 == 0) goto L_0x0171
            android.content.SharedPreferences r12 = r4.f304819f     // Catch:{ all -> 0x0027 }
            android.content.SharedPreferences$Editor r12 = r12.edit()     // Catch:{ all -> 0x0027 }
            android.content.SharedPreferences$Editor r12 = r12.putBoolean(r15, r7)     // Catch:{ all -> 0x0027 }
            r12.apply()     // Catch:{ all -> 0x0027 }
            goto L_0x017e
        L_0x0171:
            com.google.android.apps.gsa.assist.c.a.a r12 = r4.f304822i     // Catch:{ all -> 0x0027 }
            boolean r12 = r12.mo17585g()     // Catch:{ all -> 0x0027 }
            if (r12 == 0) goto L_0x017e
            com.google.android.apps.gsa.assist.c.a.a r12 = r4.f304822i     // Catch:{ all -> 0x0027 }
            r12.mo17581c()     // Catch:{ all -> 0x0027 }
        L_0x017e:
            com.google.android.apps.gsa.search.core.google.gaia.o r12 = r4.f304824k     // Catch:{ all -> 0x0027 }
            android.accounts.Account r12 = r12.mo79668a()     // Catch:{ all -> 0x0027 }
            if (r12 == 0) goto L_0x01a3
            dagger.a r6 = r4.f304789A     // Catch:{ all -> 0x0027 }
            java.lang.Object r6 = r6.mo27525b()     // Catch:{ all -> 0x0027 }
            com.google.android.apps.gsa.assistant.shared.bg r6 = (com.google.android.apps.gsa.assistant.shared.bg) r6     // Catch:{ all -> 0x0027 }
            java.lang.String r12 = r12.name     // Catch:{ all -> 0x0027 }
            boolean r6 = r6.c(r12)     // Catch:{ all -> 0x0027 }
            if (r6 != 0) goto L_0x01a3
            android.content.SharedPreferences r6 = r4.f304819f     // Catch:{ all -> 0x0027 }
            android.content.SharedPreferences$Editor r6 = r6.edit()     // Catch:{ all -> 0x0027 }
            android.content.SharedPreferences$Editor r6 = r6.putBoolean(r14, r7)     // Catch:{ all -> 0x0027 }
            r6.apply()     // Catch:{ all -> 0x0027 }
        L_0x01a3:
            com.google.android.apps.gsa.assistant.shared.bm r6 = r4.f304838y     // Catch:{ all -> 0x0027 }
            r6.h()     // Catch:{ all -> 0x0027 }
            dagger.a r6 = r4.f304790B     // Catch:{ all -> 0x0027 }
            java.lang.Object r6 = r6.mo27525b()     // Catch:{ all -> 0x0027 }
            com.google.android.apps.gsa.speech.microdetection.a r6 = (com.google.android.apps.gsa.speech.microdetection.C92486a) r6     // Catch:{ all -> 0x0027 }
            boolean r6 = r6.mo87243q(r9)     // Catch:{ all -> 0x0027 }
            if (r6 != 0) goto L_0x01f3
            java.util.Locale r6 = java.util.Locale.getDefault()     // Catch:{ all -> 0x0027 }
            java.lang.String r6 = r6.toLanguageTag()     // Catch:{ all -> 0x0027 }
            dagger.a r9 = r4.f304792D     // Catch:{ all -> 0x0027 }
            java.lang.Object r9 = r9.mo27525b()     // Catch:{ all -> 0x0027 }
            com.google.android.apps.gsa.search.core.aj.s r9 = (com.google.android.apps.gsa.search.core.p6513aj.C84559s) r9     // Catch:{ all -> 0x0027 }
            java.lang.String r12 = "OpaController "
            java.lang.String r7 = java.lang.String.valueOf(r6)     // Catch:{ all -> 0x0027 }
            java.lang.String r7 = r12.concat(r7)     // Catch:{ all -> 0x0027 }
            com.google.android.apps.gsa.shared.speech.dumper.EventForDump r7 = com.google.android.apps.gsa.shared.speech.dumper.EventForDump.m147676e(r10, r7)     // Catch:{ all -> 0x0027 }
            r9.mo78312c(r6, r7)     // Catch:{ all -> 0x0027 }
            dagger.a r6 = r4.f304790B     // Catch:{ all -> 0x0027 }
            java.lang.Object r6 = r6.mo27525b()     // Catch:{ all -> 0x0027 }
            com.google.android.apps.gsa.speech.microdetection.a r6 = (com.google.android.apps.gsa.speech.microdetection.C92486a) r6     // Catch:{ all -> 0x0027 }
            boolean r6 = r6.mo87249w()     // Catch:{ all -> 0x0027 }
            if (r6 == 0) goto L_0x01f3
            android.content.SharedPreferences r6 = r4.f304819f     // Catch:{ all -> 0x0027 }
            android.content.SharedPreferences$Editor r6 = r6.edit()     // Catch:{ all -> 0x0027 }
            r7 = 1
            android.content.SharedPreferences$Editor r6 = r6.putBoolean(r13, r7)     // Catch:{ all -> 0x0027 }
            r6.apply()     // Catch:{ all -> 0x0027 }
        L_0x01f3:
            com.google.common.base.ax r6 = r4.f304791C     // Catch:{ all -> 0x06c7 }
            boolean r6 = r6.mo56113h()     // Catch:{ all -> 0x06c7 }
            if (r6 == 0) goto L_0x0206
            com.google.common.base.ax r6 = r4.f304791C     // Catch:{ all -> 0x0027 }
            java.lang.Object r6 = r6.mo56107c()     // Catch:{ all -> 0x0027 }
            com.google.android.apps.gsa.shared.t.a.a r6 = (com.google.android.apps.gsa.shared.p7144t.p7145a.C90610a) r6     // Catch:{ all -> 0x0027 }
            r6.mo84759a()     // Catch:{ all -> 0x0027 }
        L_0x0206:
            com.google.android.apps.gsa.staticplugins.opa.util.y r6 = r4.f304821h     // Catch:{ all -> 0x06c7 }
            boolean r7 = com.google.android.apps.gsa.search.shared.p6930h.C87566i.m142297au(r5)     // Catch:{ all -> 0x06c7 }
            if (r7 != 0) goto L_0x020f
            goto L_0x025c
        L_0x020f:
            dagger.a r7 = r6.f315345b     // Catch:{ all -> 0x06c7 }
            java.lang.Object r7 = r7.mo27525b()     // Catch:{ all -> 0x06c7 }
            com.google.android.apps.gsa.staticplugins.opa.ba.c r7 = (com.google.android.apps.gsa.staticplugins.opa.p8317ba.C107719c) r7     // Catch:{ all -> 0x06c7 }
            com.google.common.base.cr r7 = r7.f299750c     // Catch:{ all -> 0x06c7 }
            java.lang.Object r7 = r7.mo6453a()     // Catch:{ all -> 0x06c7 }
            com.google.android.apps.gsa.opa.h.k r7 = (com.google.android.apps.gsa.opa.p6447h.C83705k) r7     // Catch:{ all -> 0x06c7 }
            boolean r7 = r7.mo77030c()     // Catch:{ all -> 0x06c7 }
            if (r7 != 0) goto L_0x025c
            com.google.android.libraries.f.a r7 = r6.f315346c     // Catch:{ all -> 0x0027 }
            long r9 = r7.mo26871c()     // Catch:{ all -> 0x0027 }
            com.google.android.apps.gsa.shared.speech.HotwordResultMetadata r7 = com.google.android.apps.gsa.shared.speech.HotwordResultMetadata.m147625s(r5)     // Catch:{ all -> 0x0027 }
            if (r7 == 0) goto L_0x025c
            long r16 = r7.mo84604g()     // Catch:{ all -> 0x0027 }
            long r9 = r9 - r16
            com.google.android.apps.gsa.search.core.i.t r6 = r6.f315344a     // Catch:{ all -> 0x0027 }
            com.google.android.apps.gsa.shared.m.f r7 = com.google.android.apps.gsa.shared.p7066m.C90082eg.f250035cs     // Catch:{ all -> 0x0027 }
            long r6 = r6.mo79743a(r7)     // Catch:{ all -> 0x0027 }
            int r12 = (r9 > r6 ? 1 : (r9 == r6 ? 0 : -1))
            if (r12 <= 0) goto L_0x025c
            com.google.android.apps.gsa.staticplugins.opa.fl r2 = r4.f304820g     // Catch:{ all -> 0x0027 }
            r2.mo95151b()     // Catch:{ all -> 0x0027 }
            dagger.a r2 = r4.f304793E     // Catch:{ all -> 0x0027 }
            java.lang.Object r2 = r2.mo27525b()     // Catch:{ all -> 0x0027 }
            com.google.android.apps.gsa.shared.logger.b.i r2 = (com.google.android.apps.gsa.shared.logger.p7051b.C89859i) r2     // Catch:{ all -> 0x0027 }
            com.google.android.apps.gsa.shared.logger.b.ae r6 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.OPA_ANDROID_STARTUP_EXPIRED_HOTWORD_TRIGGER     // Catch:{ all -> 0x0027 }
            r2.mo83702b(r6)     // Catch:{ all -> 0x0027 }
            r4.mo97828e(r5)     // Catch:{ all -> 0x0027 }
            r17 = r3
            goto L_0x067f
        L_0x025c:
            com.google.android.apps.gsa.search.core.i.t r6 = r4.f304818e     // Catch:{ all -> 0x06c7 }
            com.google.android.apps.gsa.shared.m.d r7 = com.google.android.apps.gsa.shared.p7066m.C90014bt.f247692lu     // Catch:{ all -> 0x06c7 }
            boolean r6 = r6.mo79746e(r7)     // Catch:{ all -> 0x06c7 }
            if (r6 == 0) goto L_0x035a
            com.google.android.apps.gsa.staticplugins.opa.nm r6 = r4.f304816c     // Catch:{ all -> 0x06c7 }
            com.google.android.apps.gsa.staticplugins.opa.errorui.StartupConfig r9 = r6.mo98060a(r5)     // Catch:{ all -> 0x06c7 }
            com.google.android.apps.gsa.staticplugins.opa.errorui.ej r10 = r6.f305735a     // Catch:{ all -> 0x06c7 }
            com.google.common.base.ax r10 = r10.mo97286c(r9)     // Catch:{ all -> 0x06c7 }
            boolean r10 = com.google.android.apps.gsa.staticplugins.opa.C109739nm.m182716d(r5, r10)     // Catch:{ all -> 0x06c7 }
            if (r10 == 0) goto L_0x02cd
            android.content.Intent r10 = com.google.android.apps.gsa.search.shared.p6930h.C87566i.m142323v(r5)     // Catch:{ all -> 0x06c7 }
            if (r10 == 0) goto L_0x0285
            com.google.common.base.ax r6 = com.google.common.base.C58833ax.m90834k(r10)     // Catch:{ all -> 0x0027 }
            r17 = r3
            goto L_0x02d1
        L_0x0285:
            android.os.Bundle r10 = new android.os.Bundle     // Catch:{ all -> 0x06c7 }
            r10.<init>()     // Catch:{ all -> 0x06c7 }
            java.lang.String r12 = "opa_startup_seq:config"
            r10.putParcelable(r12, r9)     // Catch:{ all -> 0x06c7 }
            com.google.android.apps.gsa.opaonboarding.am r9 = com.google.android.apps.gsa.opaonboarding.C83880an.m133553o()     // Catch:{ all -> 0x06c7 }
            r12 = r9
            com.google.android.apps.gsa.opaonboarding.g r12 = (com.google.android.apps.gsa.opaonboarding.C83940g) r12     // Catch:{ all -> 0x06c7 }
            java.lang.String r7 = "opa_startup_seq"
            r12.f228605a = r7     // Catch:{ all -> 0x06c7 }
            com.google.android.apps.gsa.opaonboarding.e r7 = new com.google.android.apps.gsa.opaonboarding.e     // Catch:{ all -> 0x06c7 }
            r17 = r3
            r3 = 0
            r12 = 0
            r7.<init>(r3, r12, r12)     // Catch:{ all -> 0x06c5 }
            r3 = r9
            com.google.android.apps.gsa.opaonboarding.g r3 = (com.google.android.apps.gsa.opaonboarding.C83940g) r3     // Catch:{ all -> 0x06c5 }
            r3.f228607c = r7     // Catch:{ all -> 0x06c5 }
            r3 = r9
            com.google.android.apps.gsa.opaonboarding.g r3 = (com.google.android.apps.gsa.opaonboarding.C83940g) r3     // Catch:{ all -> 0x06c5 }
            r3.f228606b = r10     // Catch:{ all -> 0x06c5 }
            com.google.android.apps.gsa.staticplugins.opa.errorui.n r3 = r6.f305736b     // Catch:{ all -> 0x06c5 }
            com.google.android.apps.gsa.assistant.shared.l.e r6 = com.google.android.apps.gsa.search.shared.p6930h.C87564g.m142223a(r5)     // Catch:{ all -> 0x06c5 }
            com.google.common.o.a.w r3 = r3.mo97354a(r6)     // Catch:{ all -> 0x06c5 }
            r9.mo77222b(r3)     // Catch:{ all -> 0x06c5 }
            com.google.android.apps.gsa.opaonboarding.an r3 = r9.mo77221a()     // Catch:{ all -> 0x06c5 }
            android.content.Intent r3 = r3.mo77240n()     // Catch:{ all -> 0x06c5 }
            r6 = 8388608(0x800000, float:1.17549435E-38)
            android.content.Intent r3 = r3.addFlags(r6)     // Catch:{ all -> 0x06c5 }
            com.google.common.base.ax r6 = com.google.common.base.C58833ax.m90834k(r3)     // Catch:{ all -> 0x06c5 }
            goto L_0x02d1
        L_0x02cd:
            r17 = r3
            com.google.common.base.b r6 = com.google.common.base.C58836b.f156633a     // Catch:{ all -> 0x06c5 }
        L_0x02d1:
            boolean r3 = r6.mo56113h()     // Catch:{ all -> 0x06c5 }
            if (r3 == 0) goto L_0x02f2
            java.lang.Object r2 = r6.mo56107c()     // Catch:{ all -> 0x06c5 }
            android.content.Intent r2 = (android.content.Intent) r2     // Catch:{ all -> 0x06c5 }
            r4.mo97834l(r8, r2)     // Catch:{ all -> 0x06c5 }
            dagger.a r2 = r4.f304793E     // Catch:{ all -> 0x06c5 }
            java.lang.Object r2 = r2.mo27525b()     // Catch:{ all -> 0x06c5 }
            com.google.android.apps.gsa.shared.logger.b.i r2 = (com.google.android.apps.gsa.shared.logger.p7051b.C89859i) r2     // Catch:{ all -> 0x06c5 }
            com.google.android.apps.gsa.shared.logger.b.ae r3 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.OPA_ANDROID_STARTUP_REDIRECT_TO_ONBOARDING     // Catch:{ all -> 0x06c5 }
            r2.mo83702b(r3)     // Catch:{ all -> 0x06c5 }
        L_0x02ed:
            r4.mo97828e(r5)     // Catch:{ all -> 0x06c5 }
            goto L_0x067f
        L_0x02f2:
            com.google.android.apps.gsa.staticplugins.opa.nm r3 = r4.f304816c     // Catch:{ all -> 0x06c5 }
            com.google.android.apps.gsa.staticplugins.opa.errorui.StartupConfig r3 = r3.mo98060a(r5)     // Catch:{ all -> 0x06c5 }
            com.google.android.apps.gsa.assistant.shared.bm r6 = r4.f304838y     // Catch:{ all -> 0x06c5 }
            boolean r6 = r6.j()     // Catch:{ all -> 0x06c5 }
            if (r6 != 0) goto L_0x0331
            com.google.android.apps.gsa.staticplugins.opa.errorui.ej r6 = r4.f304797I     // Catch:{ all -> 0x06c5 }
            boolean r3 = r6.mo97288f(r3)     // Catch:{ all -> 0x06c5 }
            if (r3 != 0) goto L_0x032b
            com.google.android.apps.gsa.staticplugins.opa.nm r3 = r4.f304816c     // Catch:{ all -> 0x06c5 }
            com.google.common.base.ax r3 = r3.mo98062c(r5)     // Catch:{ all -> 0x06c5 }
            boolean r6 = r3.mo56113h()     // Catch:{ all -> 0x06c5 }
            if (r6 == 0) goto L_0x032b
            java.lang.Object r2 = r3.mo56107c()     // Catch:{ all -> 0x06c5 }
            android.content.Intent r2 = (android.content.Intent) r2     // Catch:{ all -> 0x06c5 }
            r4.mo97834l(r8, r2)     // Catch:{ all -> 0x06c5 }
            dagger.a r2 = r4.f304793E     // Catch:{ all -> 0x06c5 }
            java.lang.Object r2 = r2.mo27525b()     // Catch:{ all -> 0x06c5 }
            com.google.android.apps.gsa.shared.logger.b.i r2 = (com.google.android.apps.gsa.shared.logger.p7051b.C89859i) r2     // Catch:{ all -> 0x06c5 }
            com.google.android.apps.gsa.shared.logger.b.ae r3 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.OPA_ANDROID_STARTUP_REDIRECT_TO_ONBOARDING     // Catch:{ all -> 0x06c5 }
            r2.mo83702b(r3)     // Catch:{ all -> 0x06c5 }
            goto L_0x02ed
        L_0x032b:
            com.google.android.apps.gsa.assistant.shared.bm r3 = r4.f304838y     // Catch:{ all -> 0x06c5 }
            r3.f()     // Catch:{ all -> 0x06c5 }
            goto L_0x0380
        L_0x0331:
            boolean r3 = r3.mo97188g()     // Catch:{ all -> 0x06c5 }
            if (r3 == 0) goto L_0x0380
            com.google.android.apps.gsa.staticplugins.opa.nm r3 = r4.f304816c     // Catch:{ all -> 0x06c5 }
            com.google.common.base.ax r3 = r3.mo98062c(r5)     // Catch:{ all -> 0x06c5 }
            boolean r6 = r3.mo56113h()     // Catch:{ all -> 0x06c5 }
            if (r6 == 0) goto L_0x0380
            java.lang.Object r2 = r3.mo56107c()     // Catch:{ all -> 0x06c5 }
            android.content.Intent r2 = (android.content.Intent) r2     // Catch:{ all -> 0x06c5 }
            r4.mo97834l(r8, r2)     // Catch:{ all -> 0x06c5 }
            dagger.a r2 = r4.f304793E     // Catch:{ all -> 0x06c5 }
            java.lang.Object r2 = r2.mo27525b()     // Catch:{ all -> 0x06c5 }
            com.google.android.apps.gsa.shared.logger.b.i r2 = (com.google.android.apps.gsa.shared.logger.p7051b.C89859i) r2     // Catch:{ all -> 0x06c5 }
            com.google.android.apps.gsa.shared.logger.b.ae r3 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.OPA_ANDROID_STARTUP_REDIRECT_TO_ONBOARDING     // Catch:{ all -> 0x06c5 }
            r2.mo83702b(r3)     // Catch:{ all -> 0x06c5 }
            goto L_0x02ed
        L_0x035a:
            r17 = r3
            com.google.android.apps.gsa.staticplugins.opa.nm r3 = r4.f304816c     // Catch:{ all -> 0x06c5 }
            com.google.common.base.ax r3 = r3.mo98061b(r5)     // Catch:{ all -> 0x06c5 }
            boolean r6 = r3.mo56113h()     // Catch:{ all -> 0x06c5 }
            if (r6 == 0) goto L_0x0380
            java.lang.Object r2 = r3.mo56107c()     // Catch:{ all -> 0x06c5 }
            android.content.Intent r2 = (android.content.Intent) r2     // Catch:{ all -> 0x06c5 }
            r4.mo97834l(r8, r2)     // Catch:{ all -> 0x06c5 }
            dagger.a r2 = r4.f304793E     // Catch:{ all -> 0x06c5 }
            java.lang.Object r2 = r2.mo27525b()     // Catch:{ all -> 0x06c5 }
            com.google.android.apps.gsa.shared.logger.b.i r2 = (com.google.android.apps.gsa.shared.logger.p7051b.C89859i) r2     // Catch:{ all -> 0x06c5 }
            com.google.android.apps.gsa.shared.logger.b.ae r3 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.OPA_ANDROID_STARTUP_REDIRECT_TO_ONBOARDING     // Catch:{ all -> 0x06c5 }
            r2.mo83702b(r3)     // Catch:{ all -> 0x06c5 }
            goto L_0x02ed
        L_0x0380:
            com.google.android.apps.gsa.search.core.i.t r3 = r4.f304818e     // Catch:{ all -> 0x06c5 }
            com.google.android.apps.gsa.shared.m.d r6 = com.google.android.apps.gsa.shared.p7066m.C90014bt.f247692lu     // Catch:{ all -> 0x06c5 }
            boolean r3 = r3.mo79746e(r6)     // Catch:{ all -> 0x06c5 }
            if (r3 != 0) goto L_0x0397
            com.google.android.apps.gsa.assistant.shared.bm r3 = r4.f304838y     // Catch:{ all -> 0x06c5 }
            boolean r3 = r3.j()     // Catch:{ all -> 0x06c5 }
            if (r3 != 0) goto L_0x0397
            com.google.android.apps.gsa.assistant.shared.bm r3 = r4.f304838y     // Catch:{ all -> 0x06c5 }
            r3.f()     // Catch:{ all -> 0x06c5 }
        L_0x0397:
            com.google.android.apps.gsa.assistant.shared.bm r3 = r4.f304838y     // Catch:{ all -> 0x06c5 }
            boolean r3 = r3.l()     // Catch:{ all -> 0x06c5 }
            if (r3 != 0) goto L_0x03d1
            com.google.android.apps.gsa.assistant.shared.bm r3 = r4.f304838y     // Catch:{ all -> 0x06c5 }
            r3.g()     // Catch:{ all -> 0x06c5 }
            android.content.SharedPreferences r3 = r4.f304819f     // Catch:{ all -> 0x06c5 }
            android.content.SharedPreferences$Editor r3 = r3.edit()     // Catch:{ all -> 0x06c5 }
            android.content.SharedPreferences$Editor r3 = r3.remove(r11)     // Catch:{ all -> 0x06c5 }
            android.content.SharedPreferences$Editor r3 = r3.remove(r14)     // Catch:{ all -> 0x06c5 }
            android.content.SharedPreferences$Editor r3 = r3.remove(r15)     // Catch:{ all -> 0x06c5 }
            java.lang.String r6 = "opa_email_optin_seen_count"
            android.content.SharedPreferences$Editor r3 = r3.remove(r6)     // Catch:{ all -> 0x06c5 }
            android.content.SharedPreferences$Editor r3 = r3.remove(r13)     // Catch:{ all -> 0x06c5 }
            r3.apply()     // Catch:{ all -> 0x06c5 }
            com.google.android.apps.gsa.assistant.shared.bo r3 = r4.f304839z     // Catch:{ all -> 0x06c5 }
            boolean r3 = r3.r()     // Catch:{ all -> 0x06c5 }
            if (r3 == 0) goto L_0x03e4
            com.google.android.apps.gsa.assistant.shared.bo r3 = r4.f304839z     // Catch:{ all -> 0x06c5 }
            r3.m()     // Catch:{ all -> 0x06c5 }
            goto L_0x03e4
        L_0x03d1:
            boolean r3 = com.google.android.apps.gsa.search.shared.p6930h.C87566i.m142282af(r5)     // Catch:{ all -> 0x06c5 }
            if (r3 == 0) goto L_0x03e4
            com.google.android.apps.gsa.assistant.shared.bo r3 = r4.f304839z     // Catch:{ all -> 0x06c5 }
            boolean r3 = r3.p()     // Catch:{ all -> 0x06c5 }
            if (r3 != 0) goto L_0x03e4
            com.google.android.apps.gsa.assistant.shared.bo r3 = r4.f304839z     // Catch:{ all -> 0x06c5 }
            r3.n()     // Catch:{ all -> 0x06c5 }
        L_0x03e4:
            boolean r3 = com.google.android.apps.gsa.search.shared.p6930h.C87566i.m142279ac(r5)     // Catch:{ all -> 0x06c5 }
            long r6 = com.google.android.apps.gsa.search.shared.p6930h.C87566i.m142315n(r5)     // Catch:{ all -> 0x06c5 }
            r4.f304834u = r6     // Catch:{ all -> 0x06c5 }
            boolean r6 = com.google.android.apps.gsa.search.shared.p6930h.C87566i.m142257aE(r5)     // Catch:{ all -> 0x06c5 }
            r7 = 2
            if (r6 != 0) goto L_0x043c
            r4.mo97729o(r7)     // Catch:{ all -> 0x06c5 }
            com.google.android.apps.gsa.staticplugins.opa.fj r6 = r4.f304827n     // Catch:{ all -> 0x06c5 }
            android.view.View r6 = r6.mo97536h()     // Catch:{ all -> 0x06c5 }
            r8 = 0
            r6.setVisibility(r8)     // Catch:{ all -> 0x06c5 }
            com.google.android.apps.gsa.search.shared.service.b.qk r6 = com.google.android.apps.gsa.search.shared.service.p6935b.C88134qk.MODE_CHAT     // Catch:{ all -> 0x06c5 }
            r4.f304833t = r6     // Catch:{ all -> 0x06c5 }
            com.google.android.apps.gsa.staticplugins.opa.az.t r6 = r4.f304825l     // Catch:{ all -> 0x06c5 }
            com.google.android.apps.gsa.search.shared.service.j r8 = new com.google.android.apps.gsa.search.shared.service.j     // Catch:{ all -> 0x06c5 }
            com.google.android.apps.gsa.search.shared.service.b.bu r9 = com.google.android.apps.gsa.search.shared.service.p6935b.C87739bu.OPA_UI_MODE     // Catch:{ all -> 0x06c5 }
            r8.<init>((com.google.android.apps.gsa.search.shared.service.p6935b.C87739bu) r9)     // Catch:{ all -> 0x06c5 }
            com.google.protobuf.bt r9 = com.google.android.apps.gsa.search.shared.service.p6935b.C88131qh.f238245a     // Catch:{ all -> 0x06c5 }
            com.google.android.apps.gsa.search.shared.service.b.ql r10 = com.google.android.apps.gsa.search.shared.service.p6935b.C88135ql.f238252c     // Catch:{ all -> 0x06c5 }
            com.google.protobuf.bn r10 = r10.createBuilder()     // Catch:{ all -> 0x06c5 }
            com.google.android.apps.gsa.search.shared.service.b.qi r10 = (com.google.android.apps.gsa.search.shared.service.p6935b.C88132qi) r10     // Catch:{ all -> 0x06c5 }
            com.google.android.apps.gsa.search.shared.service.b.qk r11 = r4.f304833t     // Catch:{ all -> 0x06c5 }
            r10.copyOnWrite()     // Catch:{ all -> 0x06c5 }
            com.google.protobuf.bv r12 = r10.instance     // Catch:{ all -> 0x06c5 }
            com.google.android.apps.gsa.search.shared.service.b.ql r12 = (com.google.android.apps.gsa.search.shared.service.p6935b.C88135ql) r12     // Catch:{ all -> 0x06c5 }
            int r11 = r11.f238251d     // Catch:{ all -> 0x06c5 }
            r12.f238255b = r11     // Catch:{ all -> 0x06c5 }
            int r11 = r12.f238254a     // Catch:{ all -> 0x06c5 }
            r13 = 1
            r11 = r11 | r13
            r12.f238254a = r11     // Catch:{ all -> 0x06c5 }
            com.google.protobuf.bv r10 = r10.build()     // Catch:{ all -> 0x06c5 }
            com.google.android.apps.gsa.search.shared.service.b.ql r10 = (com.google.android.apps.gsa.search.shared.service.p6935b.C88135ql) r10     // Catch:{ all -> 0x06c5 }
            r8.mo82014b(r9, r10)     // Catch:{ all -> 0x06c5 }
            com.google.android.apps.gsa.search.shared.service.ClientEventData r8 = r8.mo82013a()     // Catch:{ all -> 0x06c5 }
            r6.mo81937i(r8)     // Catch:{ all -> 0x06c5 }
        L_0x043c:
            boolean r6 = com.google.android.apps.gsa.search.shared.p6930h.C87566i.m142262aJ(r5)     // Catch:{ all -> 0x06c5 }
            if (r6 == 0) goto L_0x0448
            com.google.android.apps.gsa.staticplugins.opa.fj r6 = r4.f304827n     // Catch:{ all -> 0x06c5 }
            r8 = 1
            r6.mo97510bb(r8, r8)     // Catch:{ all -> 0x06c5 }
        L_0x0448:
            com.google.android.apps.gsa.staticplugins.opa.az.t r6 = r4.f304825l     // Catch:{ all -> 0x06c5 }
            boolean r8 = r6.f299726c     // Catch:{ all -> 0x06c5 }
            if (r8 == 0) goto L_0x045b
            dagger.a r6 = r6.f299725b     // Catch:{ all -> 0x06c5 }
            java.lang.Object r6 = r6.mo27525b()     // Catch:{ all -> 0x06c5 }
            com.google.android.apps.gsa.staticplugins.opa.az.p r6 = (com.google.android.apps.gsa.staticplugins.opa.p8315az.C107705p) r6     // Catch:{ all -> 0x06c5 }
            boolean r6 = r6.mo96238k()     // Catch:{ all -> 0x06c5 }
            goto L_0x0465
        L_0x045b:
            com.google.android.apps.gsa.staticplugins.opa.mv r6 = r6.f299724a     // Catch:{ all -> 0x06c5 }
            com.google.android.apps.gsa.search.shared.service.aa r6 = r6.mo98047a()     // Catch:{ all -> 0x06c5 }
            boolean r6 = r6.mo81953y()     // Catch:{ all -> 0x06c5 }
        L_0x0465:
            if (r6 != 0) goto L_0x0503
            long r8 = com.google.android.apps.gsa.search.shared.p6930h.C87566i.m142319r(r5)     // Catch:{ all -> 0x06c5 }
            java.lang.String r6 = "OpaController"
            if (r3 != 0) goto L_0x04a3
            r10 = 0
            int r3 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r3 != 0) goto L_0x04a3
            com.google.common.f.e r3 = com.google.android.apps.gsa.staticplugins.opa.C109452ly.f304788a     // Catch:{ all -> 0x06c5 }
            com.google.common.f.x r3 = r3.mo56224b()     // Catch:{ all -> 0x06c5 }
            com.google.common.f.aa r8 = com.google.common.p4526f.p4527a.C58975e.f156826a     // Catch:{ all -> 0x06c5 }
            r3.mo56378ag(r8, r6)     // Catch:{ all -> 0x06c5 }
            java.lang.String r6 = "Starting session with NO_SESSION handover for contact"
            r8 = 22952(0x59a8, float:3.2163E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r3).mo56372aa(r8)).mo56386p(r6)     // Catch:{ all -> 0x06c5 }
            com.google.android.apps.gsa.staticplugins.opa.az.t r3 = r4.f304825l     // Catch:{ all -> 0x06c5 }
            boolean r6 = r3.f299726c     // Catch:{ all -> 0x06c5 }
            if (r6 == 0) goto L_0x0499
            dagger.a r3 = r3.f299725b     // Catch:{ all -> 0x06c5 }
            java.lang.Object r3 = r3.mo27525b()     // Catch:{ all -> 0x06c5 }
            com.google.android.apps.gsa.staticplugins.opa.az.p r3 = (com.google.android.apps.gsa.staticplugins.opa.p8315az.C107705p) r3     // Catch:{ all -> 0x06c5 }
            r3.mo96235h()     // Catch:{ all -> 0x06c5 }
            goto L_0x0503
        L_0x0499:
            com.google.android.apps.gsa.staticplugins.opa.mv r3 = r3.f299724a     // Catch:{ all -> 0x06c5 }
            com.google.android.apps.gsa.search.shared.service.aa r3 = r3.mo98047a()     // Catch:{ all -> 0x06c5 }
            r3.mo81944p()     // Catch:{ all -> 0x06c5 }
            goto L_0x0503
        L_0x04a3:
            r10 = 0
            int r3 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r3 == 0) goto L_0x04e8
            r10 = 1
            int r3 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r3 == 0) goto L_0x04e8
            com.google.common.f.e r3 = com.google.android.apps.gsa.staticplugins.opa.C109452ly.f304788a     // Catch:{ all -> 0x06c5 }
            com.google.common.f.x r3 = r3.mo56224b()     // Catch:{ all -> 0x06c5 }
            com.google.common.f.aa r10 = com.google.common.p4526f.p4527a.C58975e.f156826a     // Catch:{ all -> 0x06c5 }
            r3.mo56378ag(r10, r6)     // Catch:{ all -> 0x06c5 }
            com.google.common.f.c r3 = (com.google.common.p4526f.C59052c) r3     // Catch:{ all -> 0x06c5 }
            r6 = 22951(0x59a7, float:3.2161E-41)
            com.google.common.f.x r3 = r3.mo56372aa(r6)     // Catch:{ all -> 0x06c5 }
            com.google.common.f.c r3 = (com.google.common.p4526f.C59052c) r3     // Catch:{ all -> 0x06c5 }
            java.lang.String r6 = "Starting session with handover ID: %d"
            r3.mo56388r(r6, r8)     // Catch:{ all -> 0x06c5 }
            com.google.android.apps.gsa.staticplugins.opa.az.t r3 = r4.f304825l     // Catch:{ all -> 0x06c5 }
            boolean r6 = r3.f299726c     // Catch:{ all -> 0x06c5 }
            if (r6 == 0) goto L_0x04db
            dagger.a r3 = r3.f299725b     // Catch:{ all -> 0x06c5 }
            java.lang.Object r3 = r3.mo27525b()     // Catch:{ all -> 0x06c5 }
            com.google.android.apps.gsa.staticplugins.opa.az.p r3 = (com.google.android.apps.gsa.staticplugins.opa.p8315az.C107705p) r3     // Catch:{ all -> 0x06c5 }
            r3.mo96235h()     // Catch:{ all -> 0x06c5 }
            goto L_0x0503
        L_0x04db:
            com.google.android.apps.gsa.staticplugins.opa.mv r3 = r3.f299724a     // Catch:{ all -> 0x06c5 }
            com.google.android.apps.gsa.search.shared.service.aa r3 = r3.mo98047a()     // Catch:{ all -> 0x06c5 }
            com.google.android.apps.gsa.search.shared.service.c.b.bb r6 = com.google.android.apps.gsa.search.shared.service.p6936c.p6938b.C88431bb.f239082a     // Catch:{ all -> 0x06c5 }
            r10 = 0
            r3.mo81946r(r8, r10, r6)     // Catch:{ all -> 0x06c5 }
            goto L_0x0503
        L_0x04e8:
            android.os.Bundle r3 = com.google.android.apps.gsa.search.shared.p6930h.C87566i.m142228C(r5)     // Catch:{ all -> 0x06c5 }
            com.google.common.f.e r8 = com.google.android.apps.gsa.staticplugins.opa.C109452ly.f304788a     // Catch:{ all -> 0x06c5 }
            com.google.common.f.x r8 = r8.mo56224b()     // Catch:{ all -> 0x06c5 }
            com.google.common.f.aa r9 = com.google.common.p4526f.p4527a.C58975e.f156826a     // Catch:{ all -> 0x06c5 }
            r8.mo56378ag(r9, r6)     // Catch:{ all -> 0x06c5 }
            java.lang.String r6 = "Starting new session with session context %s"
            r9 = 22950(0x59a6, float:3.216E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r8).mo56372aa(r9)).mo56389s(r6, r3)     // Catch:{ all -> 0x06c5 }
            com.google.android.apps.gsa.staticplugins.opa.az.t r6 = r4.f304825l     // Catch:{ all -> 0x06c5 }
            r6.mo96239a(r3)     // Catch:{ all -> 0x06c5 }
        L_0x0503:
            com.google.android.apps.gsa.search.shared.service.b.qk r3 = r4.f304833t     // Catch:{ all -> 0x06c5 }
            com.google.android.apps.gsa.search.shared.service.b.qk r6 = com.google.android.apps.gsa.search.shared.service.p6935b.C88134qk.UNINITIALIZED     // Catch:{ all -> 0x06c5 }
            if (r3 == r6) goto L_0x050e
            com.google.android.apps.gsa.staticplugins.opa.fj r3 = r4.f304827n     // Catch:{ all -> 0x06c5 }
            r3.mo97480ap(r5)     // Catch:{ all -> 0x06c5 }
        L_0x050e:
            int r3 = com.google.android.apps.gsa.search.shared.p6930h.C87566i.m142306e(r5)     // Catch:{ all -> 0x06c5 }
            if (r3 == r7) goto L_0x0518
            r3 = 1
            r4.mo97833k(r3)     // Catch:{ all -> 0x06c5 }
        L_0x0518:
            android.content.SharedPreferences r3 = r4.f304819f     // Catch:{ all -> 0x06c5 }
            r8 = 0
            long r10 = r3.getLong(r2, r8)     // Catch:{ all -> 0x06c5 }
            long r12 = com.google.android.apps.gsa.search.shared.p6930h.C87566i.m142317p(r5)     // Catch:{ all -> 0x06c5 }
            int r3 = (r10 > r8 ? 1 : (r10 == r8 ? 0 : -1))
            if (r3 == 0) goto L_0x0530
            int r3 = (r12 > r8 ? 1 : (r12 == r8 ? 0 : -1))
            if (r3 == 0) goto L_0x0530
            int r3 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r3 == 0) goto L_0x05f3
        L_0x0530:
            byte[] r3 = com.google.android.apps.gsa.search.shared.p6930h.C87566i.m142274aV(r5)     // Catch:{ all -> 0x06c5 }
            if (r3 == 0) goto L_0x05ab
            com.google.android.apps.gsa.search.shared.service.b.oy r6 = com.google.android.apps.gsa.search.shared.service.p6935b.C88094oy.f238174g     // Catch:{ all -> 0x06c5 }
            com.google.protobuf.bn r6 = r6.createBuilder()     // Catch:{ all -> 0x06c5 }
            com.google.android.apps.gsa.search.shared.service.b.ox r6 = (com.google.android.apps.gsa.search.shared.service.p6935b.C88093ox) r6     // Catch:{ all -> 0x06c5 }
            com.google.protobuf.z r3 = com.google.protobuf.C63088z.m96139A(r3)     // Catch:{ all -> 0x06c5 }
            r6.copyOnWrite()     // Catch:{ all -> 0x06c5 }
            com.google.protobuf.bv r8 = r6.instance     // Catch:{ all -> 0x06c5 }
            com.google.android.apps.gsa.search.shared.service.b.oy r8 = (com.google.android.apps.gsa.search.shared.service.p6935b.C88094oy) r8     // Catch:{ all -> 0x06c5 }
            int r9 = r8.f238176a     // Catch:{ all -> 0x06c5 }
            r10 = 1
            r9 = r9 | r10
            r8.f238176a = r9     // Catch:{ all -> 0x06c5 }
            r8.f238177b = r3     // Catch:{ all -> 0x06c5 }
            com.google.assistant.e.f.d r3 = com.google.android.apps.gsa.search.shared.p6930h.C87566i.m142233H(r5)     // Catch:{ all -> 0x06c5 }
            com.google.assistant.e.f.d r8 = com.google.assistant.p3897e.p3912f.C51209d.UNKNOWN_SOURCE     // Catch:{ all -> 0x06c5 }
            if (r3 == r8) goto L_0x056a
            r6.copyOnWrite()     // Catch:{ all -> 0x06c5 }
            com.google.protobuf.bv r8 = r6.instance     // Catch:{ all -> 0x06c5 }
            com.google.android.apps.gsa.search.shared.service.b.oy r8 = (com.google.android.apps.gsa.search.shared.service.p6935b.C88094oy) r8     // Catch:{ all -> 0x06c5 }
            int r3 = r3.f133323n     // Catch:{ all -> 0x06c5 }
            r8.f238181f = r3     // Catch:{ all -> 0x06c5 }
            int r3 = r8.f238176a     // Catch:{ all -> 0x06c5 }
            r3 = r3 | 16
            r8.f238176a = r3     // Catch:{ all -> 0x06c5 }
        L_0x056a:
            com.google.android.apps.gsa.search.shared.service.j r3 = new com.google.android.apps.gsa.search.shared.service.j     // Catch:{ all -> 0x06c5 }
            com.google.android.apps.gsa.search.shared.service.b.bu r8 = com.google.android.apps.gsa.search.shared.service.p6935b.C87739bu.OPA_CLIENT_INPUT     // Catch:{ all -> 0x06c5 }
            r3.<init>((com.google.android.apps.gsa.search.shared.service.p6935b.C87739bu) r8)     // Catch:{ all -> 0x06c5 }
            com.google.protobuf.bt r8 = com.google.android.apps.gsa.search.shared.service.p6935b.C88092ow.f238173a     // Catch:{ all -> 0x06c5 }
            com.google.protobuf.bv r6 = r6.build()     // Catch:{ all -> 0x06c5 }
            com.google.android.apps.gsa.search.shared.service.b.oy r6 = (com.google.android.apps.gsa.search.shared.service.p6935b.C88094oy) r6     // Catch:{ all -> 0x06c5 }
            r3.mo82014b(r8, r6)     // Catch:{ all -> 0x06c5 }
            com.google.android.apps.gsa.staticplugins.opa.az.t r6 = r4.f304825l     // Catch:{ all -> 0x06c5 }
            com.google.android.apps.gsa.search.shared.service.ClientEventData r3 = r3.mo82013a()     // Catch:{ all -> 0x06c5 }
            r6.mo81937i(r3)     // Catch:{ all -> 0x06c5 }
            java.lang.String r3 = com.google.android.apps.gsa.search.shared.p6930h.C87566i.m142242Q(r5)     // Catch:{ all -> 0x06c5 }
            boolean r6 = com.google.android.apps.gsa.search.shared.p6930h.C87566i.m142253aA(r5)     // Catch:{ all -> 0x06c5 }
            if (r3 == 0) goto L_0x059b
            com.google.android.apps.gsa.staticplugins.opa.fj r8 = r4.f304827n     // Catch:{ all -> 0x06c5 }
            r8.mo97451aM(r3, r6)     // Catch:{ all -> 0x06c5 }
            com.google.android.apps.gsa.staticplugins.opa.fj r3 = r4.f304827n     // Catch:{ all -> 0x06c5 }
            r6 = 0
            r3.mo97452aN(r6)     // Catch:{ all -> 0x06c5 }
            goto L_0x05e6
        L_0x059b:
            if (r6 == 0) goto L_0x05a4
            com.google.android.apps.gsa.staticplugins.opa.fj r3 = r4.f304827n     // Catch:{ all -> 0x06c5 }
            r6 = 1
            r3.mo97452aN(r6)     // Catch:{ all -> 0x06c5 }
            goto L_0x05e6
        L_0x05a4:
            com.google.android.apps.gsa.staticplugins.opa.fj r3 = r4.f304827n     // Catch:{ all -> 0x06c5 }
            r6 = 0
            r3.mo97452aN(r6)     // Catch:{ all -> 0x06c5 }
            goto L_0x05e6
        L_0x05ab:
            com.google.android.apps.gsa.shared.search.Query r3 = com.google.android.apps.gsa.search.shared.p6930h.C87566i.m142231F(r5)     // Catch:{ all -> 0x06c5 }
            if (r3 == 0) goto L_0x05e6
            com.google.android.apps.gsa.staticplugins.opa.az.t r6 = r4.f304825l     // Catch:{ all -> 0x06c5 }
            com.google.android.apps.gsa.search.shared.service.j r8 = new com.google.android.apps.gsa.search.shared.service.j     // Catch:{ all -> 0x06c5 }
            com.google.android.apps.gsa.search.shared.service.b.bu r9 = com.google.android.apps.gsa.search.shared.service.p6935b.C87739bu.QUERY_COMMIT     // Catch:{ all -> 0x06c5 }
            r8.<init>((com.google.android.apps.gsa.search.shared.service.p6935b.C87739bu) r9)     // Catch:{ all -> 0x06c5 }
            r8.mo82015c(r3)     // Catch:{ all -> 0x06c5 }
            com.google.android.apps.gsa.search.shared.service.ClientEventData r8 = r8.mo82013a()     // Catch:{ all -> 0x06c5 }
            r6.mo81937i(r8)     // Catch:{ all -> 0x06c5 }
            java.lang.String r6 = "android.opa.extra.SHOULD_ADD_USER_BUBBLE"
            boolean r6 = r3.mo84363bw(r6)     // Catch:{ all -> 0x06c5 }
            if (r6 == 0) goto L_0x05d5
            com.google.android.apps.gsa.staticplugins.opa.fj r6 = r4.f304827n     // Catch:{ all -> 0x06c5 }
            java.lang.CharSequence r8 = r3.f252768g     // Catch:{ all -> 0x06c5 }
            r9 = 0
            r10 = 1
            r6.mo97543p(r8, r10, r9)     // Catch:{ all -> 0x06c5 }
        L_0x05d5:
            java.lang.String r3 = r3.f252769h     // Catch:{ all -> 0x06c5 }
            if (r3 == 0) goto L_0x05e6
            dagger.a r3 = r4.f304793E     // Catch:{ all -> 0x06c5 }
            java.lang.Object r3 = r3.mo27525b()     // Catch:{ all -> 0x06c5 }
            com.google.android.apps.gsa.shared.logger.b.i r3 = (com.google.android.apps.gsa.shared.logger.p7051b.C89859i) r3     // Catch:{ all -> 0x06c5 }
            com.google.android.apps.gsa.shared.logger.b.ae r6 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.NOW_PLAYING_SOUND_SEARCH_START     // Catch:{ all -> 0x06c5 }
            r3.mo83702b(r6)     // Catch:{ all -> 0x06c5 }
        L_0x05e6:
            android.content.SharedPreferences r3 = r4.f304819f     // Catch:{ all -> 0x06c5 }
            android.content.SharedPreferences$Editor r3 = r3.edit()     // Catch:{ all -> 0x06c5 }
            android.content.SharedPreferences$Editor r2 = r3.putLong(r2, r12)     // Catch:{ all -> 0x06c5 }
            r2.apply()     // Catch:{ all -> 0x06c5 }
        L_0x05f3:
            android.widget.FrameLayout r2 = r4.f304829p     // Catch:{ all -> 0x06c5 }
            com.google.android.libraries.logging.j r2 = com.google.android.libraries.logging.C28295m.m52915a(r2)     // Catch:{ all -> 0x06c5 }
            if (r2 == 0) goto L_0x05ff
            r3 = 1
            r2.mo33794h(r3)     // Catch:{ all -> 0x06c5 }
        L_0x05ff:
            com.google.common.o.uf r2 = com.google.common.p4552o.C60555uf.f164065cO     // Catch:{ all -> 0x06c5 }
            com.google.protobuf.bn r2 = r2.createBuilder()     // Catch:{ all -> 0x06c5 }
            com.google.common.o.tz r2 = (com.google.common.p4552o.C60548tz) r2     // Catch:{ all -> 0x06c5 }
            r2.copyOnWrite()     // Catch:{ all -> 0x06c5 }
            com.google.protobuf.bv r3 = r2.instance     // Catch:{ all -> 0x06c5 }
            com.google.common.o.uf r3 = (com.google.common.p4552o.C60555uf) r3     // Catch:{ all -> 0x06c5 }
            int r6 = r3.f164093a     // Catch:{ all -> 0x06c5 }
            r6 = r6 | r7
            r3.f164093a = r6     // Catch:{ all -> 0x06c5 }
            r6 = 472(0x1d8, float:6.61E-43)
            r3.f164258m = r6     // Catch:{ all -> 0x06c5 }
            com.google.common.o.a.u r3 = com.google.common.p4552o.p4553a.C59565u.f158051f     // Catch:{ all -> 0x06c5 }
            com.google.protobuf.bn r3 = r3.createBuilder()     // Catch:{ all -> 0x06c5 }
            com.google.common.o.a.p r3 = (com.google.common.p4552o.p4553a.C59560p) r3     // Catch:{ all -> 0x06c5 }
            com.google.android.apps.gsa.assistant.shared.l.e r8 = com.google.android.apps.gsa.search.shared.p6930h.C87564g.m142223a(r5)     // Catch:{ all -> 0x06c5 }
            r3.copyOnWrite()     // Catch:{ all -> 0x06c5 }
            com.google.protobuf.bv r9 = r3.instance     // Catch:{ all -> 0x06c5 }
            com.google.common.o.a.u r9 = (com.google.common.p4552o.p4553a.C59565u) r9     // Catch:{ all -> 0x06c5 }
            int r8 = r8.ca     // Catch:{ all -> 0x06c5 }
            r9.f158054b = r8     // Catch:{ all -> 0x06c5 }
            int r8 = r9.f158053a     // Catch:{ all -> 0x06c5 }
            r7 = r7 | r8
            r9.f158053a = r7     // Catch:{ all -> 0x06c5 }
            r2.copyOnWrite()     // Catch:{ all -> 0x06c5 }
            com.google.protobuf.bv r7 = r2.instance     // Catch:{ all -> 0x06c5 }
            com.google.common.o.uf r7 = (com.google.common.p4552o.C60555uf) r7     // Catch:{ all -> 0x06c5 }
            com.google.protobuf.bv r3 = r3.build()     // Catch:{ all -> 0x06c5 }
            com.google.common.o.a.u r3 = (com.google.common.p4552o.p4553a.C59565u) r3     // Catch:{ all -> 0x06c5 }
            r3.getClass()     // Catch:{ all -> 0x06c5 }
            r7.f164174bb = r3     // Catch:{ all -> 0x06c5 }
            int r3 = r7.f164251f     // Catch:{ all -> 0x06c5 }
            r8 = 33554432(0x2000000, float:9.403955E-38)
            r3 = r3 | r8
            r7.f164251f = r3     // Catch:{ all -> 0x06c5 }
            com.google.protobuf.bv r2 = r2.build()     // Catch:{ all -> 0x06c5 }
            r12 = r2
            com.google.common.o.uf r12 = (com.google.common.p4552o.C60555uf) r12     // Catch:{ all -> 0x06c5 }
            android.widget.FrameLayout r2 = r4.f304829p     // Catch:{ all -> 0x06c5 }
            com.google.android.libraries.logging.k r2 = com.google.android.apps.gsa.staticplugins.opa.C109452ly.m182133b(r2)     // Catch:{ all -> 0x06c5 }
            com.google.common.o.oe r13 = com.google.android.libraries.logging.C28285c.m52875b(r2, r6)     // Catch:{ all -> 0x06c5 }
            com.google.android.apps.gsa.staticplugins.opa.util.cr r7 = r4.f304823j     // Catch:{ all -> 0x06c5 }
            r8 = 0
            long r10 = r4.f304834u     // Catch:{ all -> 0x06c5 }
            r7.mo100722b(r8, r10, r12, r13)     // Catch:{ all -> 0x06c5 }
            com.google.android.apps.gsa.staticplugins.opa.ay.as r2 = r4.f304837x     // Catch:{ all -> 0x06c5 }
            r3 = r2
            com.google.android.apps.gsa.staticplugins.opa.ay.ap r3 = (com.google.android.apps.gsa.staticplugins.opa.p8313ay.C107656ap) r3     // Catch:{ all -> 0x06c5 }
            r3.f299513V = r5     // Catch:{ all -> 0x06c5 }
            r3 = r2
            com.google.android.apps.gsa.staticplugins.opa.ay.ap r3 = (com.google.android.apps.gsa.staticplugins.opa.p8313ay.C107656ap) r3     // Catch:{ all -> 0x06c5 }
            com.google.android.apps.gsa.assistant.shared.p.m r3 = r3.mo96183l()     // Catch:{ all -> 0x06c5 }
            if (r3 == 0) goto L_0x02ed
            com.google.android.apps.gsa.staticplugins.opa.ay.ap r2 = (com.google.android.apps.gsa.staticplugins.opa.p8313ay.C107656ap) r2     // Catch:{ all -> 0x06c5 }
            android.os.Bundle r2 = r2.f299513V     // Catch:{ all -> 0x06c5 }
            r3.m(r2)     // Catch:{ all -> 0x06c5 }
            goto L_0x02ed
        L_0x067f:
            boolean r2 = r1.f295646ak     // Catch:{ all -> 0x06c5 }
            boolean r3 = r1.f295645aj     // Catch:{ all -> 0x06c5 }
            r2 = r2 | r3
            r1.f295646ak = r2     // Catch:{ all -> 0x06c5 }
            r2 = 0
            r1.f295647al = r2     // Catch:{ all -> 0x06c5 }
            r1.f295645aj = r2     // Catch:{ all -> 0x06c5 }
            r1.f295643ah = r2     // Catch:{ all -> 0x06c5 }
            super.onResume()     // Catch:{ all -> 0x06c5 }
            java.util.concurrent.atomic.AtomicBoolean r3 = r1.f295657k     // Catch:{ all -> 0x06c5 }
            r3.set(r2)     // Catch:{ all -> 0x06c5 }
            com.google.android.apps.gsa.staticplugins.opa.lo r2 = new com.google.android.apps.gsa.staticplugins.opa.lo     // Catch:{ all -> 0x06c5 }
            r2.<init>(r1)     // Catch:{ all -> 0x06c5 }
            com.google.android.apps.gsa.shared.util.c.bz r3 = r1.f295665s     // Catch:{ all -> 0x06c5 }
            com.google.android.apps.gsa.p6484r.C84251f.m134339a(r2, r3)     // Catch:{ all -> 0x06c5 }
            com.google.android.apps.gsa.search.core.aj.aa r2 = r1.f295662p     // Catch:{ all -> 0x06c5 }
            boolean r2 = r2.mo78230d()     // Catch:{ all -> 0x06c5 }
            if (r2 != 0) goto L_0x06bc
            boolean r2 = r1.f295644ai     // Catch:{ all -> 0x06c5 }
            if (r2 != 0) goto L_0x06bc
            android.view.Window r2 = r18.getWindow()     // Catch:{ all -> 0x06c5 }
            r3 = 2097152(0x200000, float:2.938736E-39)
            r2.addFlags(r3)     // Catch:{ all -> 0x06c5 }
            com.google.android.apps.gsa.search.core.aj.aa r2 = r1.f295662p     // Catch:{ all -> 0x06c5 }
            r3 = 268435482(0x1000001a, float:2.5243627E-29)
            r2.mo78231e(r3)     // Catch:{ all -> 0x06c5 }
        L_0x06bc:
            r2 = 0
            r1.f295644ai = r2     // Catch:{ all -> 0x06c5 }
            if (r17 == 0) goto L_0x06c4
            r17.close()
        L_0x06c4:
            return
        L_0x06c5:
            r0 = move-exception
            goto L_0x06ca
        L_0x06c7:
            r0 = move-exception
            r17 = r3
        L_0x06ca:
            r2 = r0
        L_0x06cb:
            if (r17 == 0) goto L_0x06d6
            r17.close()     // Catch:{ all -> 0x06d1 }
            goto L_0x06d6
        L_0x06d1:
            r0 = move-exception
            r3 = r0
            com.google.android.apps.gsa.staticplugins.opa.C109432le.m182115a(r2, r3)
        L_0x06d6:
            goto L_0x06d8
        L_0x06d7:
            throw r2
        L_0x06d8:
            goto L_0x06d7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.staticplugins.opa.OpaActivity.onResume():void");
    }

    public final void onStart() {
        C47538ax c = this.f295633S.mo51613c("onStart");
        try {
            Duration ofNanos = Duration.ofNanos(C21374d.m40426a());
            C59104x b = f295614j.mo56224b();
            b.mo56378ag(C58975e.f156826a, "OpaActivity");
            ((C59052c) ((C59052c) b).mo56372aa(22902)).mo56389s("onStart, intent: %s", getIntent());
            C89838ab.m146266j(31);
            super.onStart();
            this.f295618D.mo41628b(ofNanos, this);
            ((C73912w) ((C58847bk) this.f295671y).f156646a).mo65446b();
            this.f295622H.mo96586a(C108200h.f300957a);
            C109452ly lyVar = this.f295634T;
            C109040fj fjVar = lyVar.f304827n;
            if (fjVar.f303371cc) {
                Activity activity = fjVar.f303441f;
                C108801ee eeVar = fjVar.f303350cD;
                C69664n.m101061g(activity, "activity");
                C69664n.m101061g(eeVar, "callback");
                C2384o lifecycle = ((C2391v) activity).getLifecycle();
                C69664n.m101060f(lifecycle, "activity as LifecycleOwner).lifecycle");
                lifecycle.mo5790b(new TranscriptionProxyImpl$register$1((C128686a) fjVar.f303388ct.mo27525b(), eeVar, lifecycle));
            }
            if (fjVar.mo97528bv() && fjVar.f303455t.mo79746e(C90029ch.f248305t)) {
                Activity activity2 = fjVar.f303441f;
                C108780dn dnVar = fjVar.f303349cC;
                C69664n.m101061g(activity2, "activity");
                C69664n.m101061g(dnVar, "callback");
                C2384o lifecycle2 = ((C2391v) activity2).getLifecycle();
                C69664n.m101060f(lifecycle2, "activity as LifecycleOwner).lifecycle");
                lifecycle2.mo5790b(new VoicePlateVisibilityProxyImpl$register$1(dnVar, (C128687a) fjVar.f303387cs.mo27525b(), lifecycle2));
            }
            C108331et etVar = (C108331et) fjVar.f303382cn.mo27525b();
            etVar.mo96793b(etVar.f301345d, 0);
            if (lyVar.f304818e.mo79746e(C90029ch.f248278bl)) {
                if (lyVar.f304818e.mo79746e(C90065dq.f249657d)) {
                    lyVar.f304803O.f195096a.set(false);
                } else {
                    lyVar.f304802N = false;
                }
            }
            lyVar.mo97832j(true);
            if (c != null) {
                c.close();
                return;
            }
            return;
        } catch (Throwable th) {
            C109432le.m182115a(th, th);
        }
        throw th;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:48:0x00db, code lost:
        if (r1 != 4) goto L_0x00dd;
     */
    /* JADX WARNING: Removed duplicated region for block: B:123:0x02ff A[Catch:{ all -> 0x038a, all -> 0x0391 }] */
    /* JADX WARNING: Removed duplicated region for block: B:126:0x0332 A[Catch:{ all -> 0x038a, all -> 0x0391 }] */
    /* JADX WARNING: Removed duplicated region for block: B:134:0x036a A[Catch:{ all -> 0x038a, all -> 0x0391 }] */
    /* JADX WARNING: Removed duplicated region for block: B:137:0x0378 A[Catch:{ all -> 0x038a, all -> 0x0391 }] */
    /* JADX WARNING: Removed duplicated region for block: B:142:0x0386  */
    /* JADX WARNING: Removed duplicated region for block: B:151:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x00f4 A[Catch:{ all -> 0x038a, all -> 0x0391 }] */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x0118 A[Catch:{ all -> 0x038a, all -> 0x0391 }] */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x0124 A[SYNTHETIC, Splitter:B:68:0x0124] */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x0137 A[Catch:{ all -> 0x038a, all -> 0x0391 }] */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x01b2 A[Catch:{ all -> 0x038a, all -> 0x0391 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onStop() {
        /*
            r14 = this;
            com.google.apps.tiktok.tracing.dh r0 = r14.f295633S
            java.lang.String r1 = "onStop"
            com.google.apps.tiktok.tracing.ax r0 = r0.mo51613c(r1)
            com.google.common.base.ax r2 = r14.f295617C     // Catch:{ all -> 0x038a }
            boolean r2 = r2.mo56113h()     // Catch:{ all -> 0x038a }
            if (r2 == 0) goto L_0x001d
            com.google.common.base.ax r2 = r14.f295617C     // Catch:{ all -> 0x038a }
            java.lang.Object r2 = r2.mo56107c()     // Catch:{ all -> 0x038a }
            com.google.android.apps.gsa.shared.logger.i.b r2 = (com.google.android.apps.gsa.shared.logger.p7064i.C89922b) r2     // Catch:{ all -> 0x038a }
            com.google.common.o.bv r3 = com.google.common.p4552o.C59668bv.STARTUP_CANCEL_ACTIVITY_STOPPED     // Catch:{ all -> 0x038a }
            r2.mo83761e(r3)     // Catch:{ all -> 0x038a }
        L_0x001d:
            com.google.common.base.ax r2 = r14.f295671y     // Catch:{ all -> 0x038a }
            com.google.common.base.bk r2 = (com.google.common.base.C58847bk) r2     // Catch:{ all -> 0x038a }
            java.lang.Object r2 = r2.f156646a     // Catch:{ all -> 0x038a }
            com.google.android.apps.gsa.assistant.shared.w r2 = (com.google.android.apps.gsa.assistant.shared.C73912w) r2     // Catch:{ all -> 0x038a }
            r2.mo65447c()     // Catch:{ all -> 0x038a }
            com.google.android.apps.gsa.staticplugins.opa.chatui.a.j r2 = r14.f295622H     // Catch:{ all -> 0x038a }
            com.google.android.apps.gsa.staticplugins.opa.chatui.a.e r3 = com.google.android.apps.gsa.staticplugins.opa.chatui.p8353a.C108197e.f300954a     // Catch:{ all -> 0x038a }
            r2.mo96586a(r3)     // Catch:{ all -> 0x038a }
            com.google.common.f.e r2 = f295614j     // Catch:{ all -> 0x038a }
            com.google.common.f.x r2 = r2.mo56224b()     // Catch:{ all -> 0x038a }
            com.google.common.f.aa r3 = com.google.common.p4526f.p4527a.C58975e.f156826a     // Catch:{ all -> 0x038a }
            java.lang.String r4 = "OpaActivity"
            r2.mo56378ag(r3, r4)     // Catch:{ all -> 0x038a }
            r3 = 22903(0x5977, float:3.2094E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r2).mo56372aa(r3)).mo56386p(r1)     // Catch:{ all -> 0x038a }
            r14.m176446H()     // Catch:{ all -> 0x038a }
            android.content.Intent r1 = r14.getIntent()     // Catch:{ all -> 0x038a }
            android.os.Bundle r1 = r1.getExtras()     // Catch:{ all -> 0x038a }
            boolean r1 = com.google.android.apps.gsa.search.shared.p6930h.C87566i.m142266aN(r1)     // Catch:{ all -> 0x038a }
            r2 = 3
            r3 = 1
            r4 = 0
            if (r1 != 0) goto L_0x00df
            boolean r1 = r14.f295630P     // Catch:{ all -> 0x038a }
            if (r1 == 0) goto L_0x0092
            com.google.android.apps.gsa.search.core.i.t r1 = r14.f295663q     // Catch:{ all -> 0x038a }
            com.google.android.apps.gsa.shared.m.d r5 = com.google.android.apps.gsa.shared.p7066m.C90066dr.f249699v     // Catch:{ all -> 0x038a }
            boolean r1 = r1.mo79746e(r5)     // Catch:{ all -> 0x038a }
            if (r1 != 0) goto L_0x006d
            com.google.android.apps.gsa.search.core.i.t r1 = r14.f295663q     // Catch:{ all -> 0x038a }
            com.google.android.apps.gsa.shared.m.d r5 = com.google.android.apps.gsa.shared.p7066m.C90066dr.f249701x     // Catch:{ all -> 0x038a }
            boolean r1 = r1.mo79746e(r5)     // Catch:{ all -> 0x038a }
            if (r1 == 0) goto L_0x0092
        L_0x006d:
            boolean r1 = r14.f295651ap     // Catch:{ all -> 0x038a }
            if (r1 == 0) goto L_0x00a3
            boolean r1 = r14.f295635U     // Catch:{ all -> 0x038a }
            if (r1 == 0) goto L_0x00a3
            boolean r1 = r14.f295654as     // Catch:{ all -> 0x038a }
            if (r1 != 0) goto L_0x00a3
            com.google.android.apps.gsa.staticplugins.opa.ah.l r1 = r14.f295623I     // Catch:{ all -> 0x038a }
            boolean r5 = r1.f296308f     // Catch:{ all -> 0x038a }
            com.google.android.apps.gsa.search.core.aj.aa r1 = r1.f296304b     // Catch:{ all -> 0x038a }
            boolean r1 = r1.mo78228b()     // Catch:{ all -> 0x038a }
            if (r1 != 0) goto L_0x00df
            com.google.android.apps.gsa.staticplugins.opa.ah.l r1 = r14.f295623I     // Catch:{ all -> 0x038a }
            com.google.android.apps.gsa.search.core.aj.aa r1 = r1.f296304b     // Catch:{ all -> 0x038a }
            android.app.KeyguardManager r1 = r1.f230023b     // Catch:{ all -> 0x038a }
            boolean r1 = r1.isDeviceLocked()     // Catch:{ all -> 0x038a }
            if (r1 == 0) goto L_0x00a3
            goto L_0x00df
        L_0x0092:
            boolean r1 = r14.f295651ap     // Catch:{ all -> 0x038a }
            if (r1 == 0) goto L_0x00a3
            boolean r1 = r14.f295635U     // Catch:{ all -> 0x038a }
            if (r1 == 0) goto L_0x00a3
            boolean r1 = r14.f295654as     // Catch:{ all -> 0x038a }
            if (r1 != 0) goto L_0x00a3
            com.google.android.apps.gsa.staticplugins.opa.ah.l r1 = r14.f295623I     // Catch:{ all -> 0x038a }
            boolean r1 = r1.f296308f     // Catch:{ all -> 0x038a }
            goto L_0x00df
        L_0x00a3:
            com.google.android.apps.gsa.search.core.i.t r1 = r14.f295663q     // Catch:{ all -> 0x038a }
            com.google.android.apps.gsa.shared.m.d r5 = com.google.android.apps.gsa.shared.p7066m.C90014bt.f247562jW     // Catch:{ all -> 0x038a }
            boolean r1 = r1.mo79746e(r5)     // Catch:{ all -> 0x038a }
            if (r1 == 0) goto L_0x00dd
            boolean r1 = r14.f295635U     // Catch:{ all -> 0x038a }
            if (r1 == 0) goto L_0x00dd
            android.view.Window r1 = r14.getWindow()     // Catch:{ all -> 0x038a }
            if (r1 != 0) goto L_0x00b8
            goto L_0x00dd
        L_0x00b8:
            android.view.Window r1 = r14.getWindow()     // Catch:{ all -> 0x038a }
            android.view.View r1 = r1.getDecorView()     // Catch:{ all -> 0x038a }
            if (r1 != 0) goto L_0x00c3
            goto L_0x00dd
        L_0x00c3:
            android.view.Window r1 = r14.getWindow()     // Catch:{ all -> 0x038a }
            android.view.View r1 = r1.getDecorView()     // Catch:{ all -> 0x038a }
            android.view.Display r1 = r1.getDisplay()     // Catch:{ all -> 0x038a }
            if (r1 != 0) goto L_0x00d2
            goto L_0x00dd
        L_0x00d2:
            int r1 = r1.getState()     // Catch:{ all -> 0x038a }
            if (r1 == r3) goto L_0x00df
            if (r1 == r2) goto L_0x00df
            r5 = 4
            if (r1 == r5) goto L_0x00df
        L_0x00dd:
            r1 = 0
            goto L_0x00e0
        L_0x00df:
            r1 = 1
        L_0x00e0:
            boolean r5 = r14.f295635U     // Catch:{ all -> 0x038a }
            r6 = 0
            if (r5 == 0) goto L_0x00eb
            android.os.Bundle r7 = r14.f295649an     // Catch:{ all -> 0x038a }
            if (r7 == 0) goto L_0x00eb
            r14.f295649an = r6     // Catch:{ all -> 0x038a }
        L_0x00eb:
            com.google.android.apps.gsa.staticplugins.opa.ly r7 = r14.f295634T     // Catch:{ all -> 0x038a }
            com.google.android.apps.gsa.search.shared.service.b.oj r8 = com.google.android.apps.gsa.search.shared.service.p6935b.C88079oj.STOPPED     // Catch:{ all -> 0x038a }
            r7.mo97831i(r8)     // Catch:{ all -> 0x038a }
            if (r5 != 0) goto L_0x010c
            android.os.Bundle r5 = r7.f304836w     // Catch:{ all -> 0x038a }
            boolean r5 = com.google.android.apps.gsa.search.shared.p6930h.C87566i.m142297au(r5)     // Catch:{ all -> 0x038a }
            if (r5 != 0) goto L_0x036d
            dagger.a r5 = r7.f304835v     // Catch:{ all -> 0x038a }
            java.lang.Object r5 = r5.mo27525b()     // Catch:{ all -> 0x038a }
            com.google.android.apps.gsa.search.core.aj.aa r5 = (com.google.android.apps.gsa.search.core.p6513aj.C84516aa) r5     // Catch:{ all -> 0x038a }
            boolean r5 = r5.mo78228b()     // Catch:{ all -> 0x038a }
            if (r5 == 0) goto L_0x010c
            goto L_0x036d
        L_0x010c:
            boolean r5 = r7.f304802N     // Catch:{ all -> 0x038a }
            com.google.android.apps.gsa.search.core.i.t r8 = r7.f304818e     // Catch:{ all -> 0x038a }
            com.google.android.apps.gsa.shared.m.d r9 = com.google.android.apps.gsa.shared.p7066m.C90065dq.f249657d     // Catch:{ all -> 0x038a }
            boolean r8 = r8.mo79746e(r9)     // Catch:{ all -> 0x038a }
            if (r8 == 0) goto L_0x0120
            com.google.android.apps.gsa.assistant.shared.ab r5 = r7.f304803O     // Catch:{ all -> 0x038a }
            java.util.concurrent.atomic.AtomicBoolean r5 = r5.f195096a     // Catch:{ all -> 0x038a }
            boolean r5 = r5.get()     // Catch:{ all -> 0x038a }
        L_0x0120:
            java.lang.String r8 = "OpaController"
            if (r5 == 0) goto L_0x0137
            com.google.common.f.e r5 = com.google.android.apps.gsa.staticplugins.opa.C109452ly.f304788a     // Catch:{ all -> 0x038a }
            com.google.common.f.x r5 = r5.mo56224b()     // Catch:{ all -> 0x038a }
            com.google.common.f.aa r9 = com.google.common.p4526f.p4527a.C58975e.f156826a     // Catch:{ all -> 0x038a }
            r5.mo56378ag(r9, r8)     // Catch:{ all -> 0x038a }
            java.lang.String r8 = "opa goes in background as new app is starting, keep current conversation"
            r9 = 22948(0x59a4, float:3.2157E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r5).mo56372aa(r9)).mo56386p(r8)     // Catch:{ all -> 0x038a }
            goto L_0x01a9
        L_0x0137:
            com.google.android.apps.gsa.staticplugins.opa.fj r5 = r7.f304827n     // Catch:{ all -> 0x038a }
            boolean r5 = r5.mo97531bz()     // Catch:{ all -> 0x038a }
            if (r5 == 0) goto L_0x0152
            com.google.common.f.e r5 = com.google.android.apps.gsa.staticplugins.opa.C109452ly.f304788a     // Catch:{ all -> 0x038a }
            com.google.common.f.x r5 = r5.mo56224b()     // Catch:{ all -> 0x038a }
            com.google.common.f.aa r9 = com.google.common.p4526f.p4527a.C58975e.f156826a     // Catch:{ all -> 0x038a }
            r5.mo56378ag(r9, r8)     // Catch:{ all -> 0x038a }
            java.lang.String r8 = "opa decides to keep current conversation"
            r9 = 22947(0x59a3, float:3.2156E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r5).mo56372aa(r9)).mo56386p(r8)     // Catch:{ all -> 0x038a }
            goto L_0x01a9
        L_0x0152:
            com.google.android.apps.gsa.staticplugins.opa.az.t r5 = r7.f304825l     // Catch:{ all -> 0x038a }
            com.google.android.apps.gsa.search.shared.service.j r9 = new com.google.android.apps.gsa.search.shared.service.j     // Catch:{ all -> 0x038a }
            com.google.android.apps.gsa.search.shared.service.b.bu r10 = com.google.android.apps.gsa.search.shared.service.p6935b.C87739bu.STOP_SPEAKING     // Catch:{ all -> 0x038a }
            r9.<init>((com.google.android.apps.gsa.search.shared.service.p6935b.C87739bu) r10)     // Catch:{ all -> 0x038a }
            com.google.android.apps.gsa.search.shared.service.ClientEventData r9 = r9.mo82013a()     // Catch:{ all -> 0x038a }
            r5.mo81937i(r9)     // Catch:{ all -> 0x038a }
            com.google.android.apps.gsa.search.shared.service.b.ou r5 = com.google.android.apps.gsa.search.shared.service.p6935b.C88090ou.DEFAULT     // Catch:{ all -> 0x038a }
            com.google.common.f.e r9 = com.google.android.apps.gsa.staticplugins.opa.C109452ly.f304788a     // Catch:{ all -> 0x038a }
            com.google.common.f.x r9 = r9.mo56224b()     // Catch:{ all -> 0x038a }
            com.google.common.f.aa r10 = com.google.common.p4526f.p4527a.C58975e.f156826a     // Catch:{ all -> 0x038a }
            r9.mo56378ag(r10, r8)     // Catch:{ all -> 0x038a }
            java.lang.String r8 = "Cancelling conversation, cancellationMode: %s"
            r10 = 22925(0x598d, float:3.2125E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r9).mo56372aa(r10)).mo56389s(r8, r5)     // Catch:{ all -> 0x038a }
            com.google.android.apps.gsa.search.shared.service.b.ov r8 = com.google.android.apps.gsa.search.shared.service.p6935b.C88091ov.f238169c     // Catch:{ all -> 0x038a }
            com.google.protobuf.bn r8 = r8.createBuilder()     // Catch:{ all -> 0x038a }
            com.google.android.apps.gsa.search.shared.service.b.os r8 = (com.google.android.apps.gsa.search.shared.service.p6935b.C88088os) r8     // Catch:{ all -> 0x038a }
            r8.copyOnWrite()     // Catch:{ all -> 0x038a }
            com.google.protobuf.bv r9 = r8.instance     // Catch:{ all -> 0x038a }
            com.google.android.apps.gsa.search.shared.service.b.ov r9 = (com.google.android.apps.gsa.search.shared.service.p6935b.C88091ov) r9     // Catch:{ all -> 0x038a }
            int r5 = r5.f238168d     // Catch:{ all -> 0x038a }
            r9.f238172b = r5     // Catch:{ all -> 0x038a }
            int r5 = r9.f238171a     // Catch:{ all -> 0x038a }
            r5 = r5 | r3
            r9.f238171a = r5     // Catch:{ all -> 0x038a }
            com.google.protobuf.bv r5 = r8.build()     // Catch:{ all -> 0x038a }
            com.google.android.apps.gsa.search.shared.service.b.ov r5 = (com.google.android.apps.gsa.search.shared.service.p6935b.C88091ov) r5     // Catch:{ all -> 0x038a }
            com.google.android.apps.gsa.staticplugins.opa.az.t r8 = r7.f304825l     // Catch:{ all -> 0x038a }
            com.google.android.apps.gsa.search.shared.service.j r9 = new com.google.android.apps.gsa.search.shared.service.j     // Catch:{ all -> 0x038a }
            com.google.android.apps.gsa.search.shared.service.b.bu r10 = com.google.android.apps.gsa.search.shared.service.p6935b.C87739bu.OPA_CANCEL_CONVERSATION     // Catch:{ all -> 0x038a }
            r9.<init>((com.google.android.apps.gsa.search.shared.service.p6935b.C87739bu) r10)     // Catch:{ all -> 0x038a }
            com.google.protobuf.bt r10 = com.google.android.apps.gsa.search.shared.service.p6935b.C88087or.f238162a     // Catch:{ all -> 0x038a }
            r9.mo82014b(r10, r5)     // Catch:{ all -> 0x038a }
            com.google.android.apps.gsa.search.shared.service.ClientEventData r5 = r9.mo82013a()     // Catch:{ all -> 0x038a }
            r8.mo81937i(r5)     // Catch:{ all -> 0x038a }
        L_0x01a9:
            r7.mo97830h(r4, r4)     // Catch:{ all -> 0x038a }
            com.google.android.apps.gsa.search.shared.service.b.qk r5 = r7.f304833t     // Catch:{ all -> 0x038a }
            com.google.android.apps.gsa.search.shared.service.b.qk r8 = com.google.android.apps.gsa.search.shared.service.p6935b.C88134qk.UNINITIALIZED     // Catch:{ all -> 0x038a }
            if (r5 == r8) goto L_0x02f7
            com.google.android.apps.gsa.staticplugins.opa.fj r5 = r7.f304827n     // Catch:{ all -> 0x038a }
            boolean r8 = r5.f303298bE     // Catch:{ all -> 0x038a }
            int r8 = r5.f303372cd     // Catch:{ all -> 0x038a }
            com.google.android.apps.gsa.search.core.i.t r8 = r5.f303455t     // Catch:{ all -> 0x038a }
            com.google.android.apps.gsa.shared.m.d r9 = com.google.android.apps.gsa.shared.p7066m.C90014bt.f247208cn     // Catch:{ all -> 0x038a }
            boolean r8 = r8.mo79746e(r9)     // Catch:{ all -> 0x038a }
            if (r8 == 0) goto L_0x01e5
            boolean r8 = r5.f303371cc     // Catch:{ all -> 0x038a }
            if (r8 != 0) goto L_0x01e5
            boolean r8 = r5.f303298bE     // Catch:{ all -> 0x038a }
            if (r8 == 0) goto L_0x01e5
            dagger.a r8 = r5.f303251aK     // Catch:{ all -> 0x038a }
            java.lang.Object r8 = r8.mo27525b()     // Catch:{ all -> 0x038a }
            android.content.SharedPreferences r8 = (android.content.SharedPreferences) r8     // Catch:{ all -> 0x038a }
            android.content.SharedPreferences$Editor r8 = r8.edit()     // Catch:{ all -> 0x038a }
            java.lang.String r9 = "opa_last_stop_timestamp"
            com.google.android.libraries.f.a r10 = r5.f303440e     // Catch:{ all -> 0x038a }
            long r10 = r10.mo26870b()     // Catch:{ all -> 0x038a }
            android.content.SharedPreferences$Editor r8 = r8.putLong(r9, r10)     // Catch:{ all -> 0x038a }
            r8.apply()     // Catch:{ all -> 0x038a }
        L_0x01e5:
            com.google.android.apps.gsa.staticplugins.opa.chatui.ba r8 = r5.f303450o     // Catch:{ all -> 0x038a }
            r8.mo95388aD()     // Catch:{ all -> 0x038a }
            com.google.android.apps.gsa.staticplugins.opa.ay.as r8 = r5.f303238X     // Catch:{ all -> 0x038a }
            r8.mo96165aq(r4)     // Catch:{ all -> 0x038a }
            com.google.android.apps.gsa.staticplugins.opa.ey r8 = com.google.android.apps.gsa.staticplugins.opa.C109026ey.MODE_HIDDEN     // Catch:{ all -> 0x038a }
            r5.mo97463aY(r8)     // Catch:{ all -> 0x038a }
            com.google.android.apps.gsa.staticplugins.opa.chatui.ba r8 = r5.f303450o     // Catch:{ all -> 0x038a }
            r9 = 2
            r8.mo95434w(r9)     // Catch:{ all -> 0x038a }
            android.widget.FrameLayout r8 = r5.f303230P     // Catch:{ all -> 0x038a }
            java.lang.String r9 = "opa-logo-view-transition"
            r8.setTransitionName(r9)     // Catch:{ all -> 0x038a }
            com.google.android.apps.gsa.staticplugins.opa.chatui.dt r8 = r5.f303231Q     // Catch:{ all -> 0x038a }
            if (r8 == 0) goto L_0x0208
            r8.mo96753p()     // Catch:{ all -> 0x038a }
        L_0x0208:
            com.google.android.apps.gsa.staticplugins.opa.translator.offline.g r8 = r5.f303270ad     // Catch:{ all -> 0x038a }
            r8.mo100357b()     // Catch:{ all -> 0x038a }
            java.util.concurrent.atomic.AtomicReference r8 = r5.f303233S     // Catch:{ all -> 0x038a }
            r8.set(r6)     // Catch:{ all -> 0x038a }
            com.google.android.apps.gsa.staticplugins.opa.nl r6 = r5.f303255aO     // Catch:{ all -> 0x038a }
            r6.mo98057a()     // Catch:{ all -> 0x038a }
            com.google.android.apps.gsa.staticplugins.opa.samson.a.b.a r6 = r5.f303265aY     // Catch:{ all -> 0x038a }
            if (r6 == 0) goto L_0x021e
            r6.mo98291a()     // Catch:{ all -> 0x038a }
        L_0x021e:
            com.google.common.b.gu r6 = com.google.common.p4522b.C58485gu.m89845m()     // Catch:{ all -> 0x038a }
            r5.mo97482ar(r6)     // Catch:{ all -> 0x038a }
            com.google.android.apps.gsa.staticplugins.opa.v.t r6 = r5.f303320ba     // Catch:{ all -> 0x038a }
            r6.f315400j = r4     // Catch:{ all -> 0x038a }
            java.lang.Boolean r8 = r6.mo100759a()     // Catch:{ all -> 0x038a }
            boolean r8 = r8.booleanValue()     // Catch:{ all -> 0x038a }
            if (r8 == 0) goto L_0x023d
            boolean r8 = r6.mo100771o()     // Catch:{ all -> 0x038a }
            if (r8 != 0) goto L_0x023d
            r6.mo100760b()     // Catch:{ all -> 0x038a }
            goto L_0x028b
        L_0x023d:
            java.util.Map r8 = r6.f315394d     // Catch:{ all -> 0x038a }
            com.google.android.apps.gsa.staticplugins.opa.v.q r9 = com.google.android.apps.gsa.staticplugins.opa.p8595v.C113913q.DELTA_RECEIVED     // Catch:{ all -> 0x038a }
            boolean r8 = r8.containsKey(r9)     // Catch:{ all -> 0x038a }
            if (r8 == 0) goto L_0x025d
            java.util.Map r8 = r6.f315394d     // Catch:{ all -> 0x038a }
            com.google.android.apps.gsa.staticplugins.opa.v.q r9 = com.google.android.apps.gsa.staticplugins.opa.p8595v.C113913q.ACTIVITY_STOPPED     // Catch:{ all -> 0x038a }
            com.google.android.libraries.f.a r6 = r6.f315392b     // Catch:{ all -> 0x038a }
            long r10 = r6.mo26872d()     // Catch:{ all -> 0x038a }
            java.lang.Long r6 = java.lang.Long.valueOf(r10)     // Catch:{ all -> 0x038a }
            com.google.common.base.ax r6 = com.google.common.base.C58833ax.m90834k(r6)     // Catch:{ all -> 0x038a }
            r8.put(r9, r6)     // Catch:{ all -> 0x038a }
            goto L_0x028b
        L_0x025d:
            com.google.common.base.ax r8 = r6.f315395e     // Catch:{ all -> 0x038a }
            r8.mo56113h()     // Catch:{ all -> 0x038a }
            com.google.common.base.ax r8 = r6.f315395e     // Catch:{ all -> 0x038a }
            boolean r8 = r8.mo56113h()     // Catch:{ all -> 0x038a }
            if (r8 == 0) goto L_0x0286
            com.google.android.apps.gsa.staticplugins.opa.v.x r8 = r6.f315397g     // Catch:{ all -> 0x038a }
            com.google.common.base.ax r9 = r6.f315395e     // Catch:{ all -> 0x038a }
            java.lang.Object r9 = r9.mo56107c()     // Catch:{ all -> 0x038a }
            com.google.android.apps.gsa.shared.search.Query r9 = (com.google.android.apps.gsa.shared.search.Query) r9     // Catch:{ all -> 0x038a }
            long r9 = r9.f252749G     // Catch:{ all -> 0x038a }
            com.google.android.apps.gsa.staticplugins.opa.v.w r11 = com.google.android.apps.gsa.staticplugins.opa.p8595v.C113919w.GRAPH_FAILURE     // Catch:{ all -> 0x038a }
            boolean r8 = r8.mo100775d(r9, r11)     // Catch:{ all -> 0x038a }
            if (r8 == 0) goto L_0x0286
            com.google.android.apps.gsa.shared.logger.b.ae r8 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.OPA_ENDSTATE_FAILURE_GRAPH_FAILURE     // Catch:{ all -> 0x038a }
            com.google.common.base.b r9 = com.google.common.base.C58836b.f156633a     // Catch:{ all -> 0x038a }
        L_0x0282:
            r6.mo100764h(r8, r9, r9, r9)     // Catch:{ all -> 0x038a }
            goto L_0x028b
        L_0x0286:
            com.google.android.apps.gsa.shared.logger.b.ae r8 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.OPA_ENDSTATE_CANCEL_ACTIVITY_STOP     // Catch:{ all -> 0x038a }
            com.google.common.base.b r9 = com.google.common.base.C58836b.f156633a     // Catch:{ all -> 0x038a }
            goto L_0x0282
        L_0x028b:
            com.google.android.apps.gsa.shared.ah.g r6 = r5.f303376ch     // Catch:{ all -> 0x038a }
            r6.mo83140n(r4)     // Catch:{ all -> 0x038a }
            com.google.android.apps.gsa.shared.ah.g r6 = r5.f303376ch     // Catch:{ all -> 0x038a }
            r6.mo83137k(r4)     // Catch:{ all -> 0x038a }
            boolean r6 = r5.f303298bE     // Catch:{ all -> 0x038a }
            if (r6 != 0) goto L_0x02ae
            int r6 = r5.f303372cd     // Catch:{ all -> 0x038a }
            if (r6 == 0) goto L_0x02ae
            com.google.android.apps.gsa.search.core.i.t r6 = r5.f303455t     // Catch:{ all -> 0x038a }
            com.google.android.apps.gsa.shared.m.d r8 = com.google.android.apps.gsa.shared.p7066m.C90014bt.f247790nm     // Catch:{ all -> 0x038a }
            boolean r6 = r6.mo79746e(r8)     // Catch:{ all -> 0x038a }
            if (r6 == 0) goto L_0x02ae
            com.google.android.apps.gsa.staticplugins.opa.fl r6 = r5.f303444i     // Catch:{ all -> 0x038a }
            com.google.android.apps.gsa.shared.logger.b.ae r8 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.OPA_ACTIVITY_DISMISS_OTHER     // Catch:{ all -> 0x038a }
            r6.mo95167z(r8)     // Catch:{ all -> 0x038a }
        L_0x02ae:
            dagger.a r6 = r5.f303382cn     // Catch:{ all -> 0x038a }
            java.lang.Object r6 = r6.mo27525b()     // Catch:{ all -> 0x038a }
            com.google.android.apps.gsa.staticplugins.opa.chatui.et r6 = (com.google.android.apps.gsa.staticplugins.opa.chatui.C108331et) r6     // Catch:{ all -> 0x038a }
            android.media.session.MediaController r8 = r6.f301347f     // Catch:{ all -> 0x038a }
            if (r8 == 0) goto L_0x02bf
            r8.unregisterCallback(r6)     // Catch:{ all -> 0x038a }
            r6.f301348g = r4     // Catch:{ all -> 0x038a }
        L_0x02bf:
            com.google.android.apps.gsa.search.core.i.t r6 = r5.f303455t     // Catch:{ all -> 0x038a }
            com.google.android.apps.gsa.shared.m.d r8 = com.google.android.apps.gsa.shared.p7066m.C90014bt.f247369fp     // Catch:{ all -> 0x038a }
            boolean r6 = r6.mo79746e(r8)     // Catch:{ all -> 0x038a }
            if (r6 == 0) goto L_0x02f7
            com.google.common.base.ax r6 = r5.f303369ca     // Catch:{ all -> 0x038a }
            boolean r6 = r6.mo56113h()     // Catch:{ all -> 0x038a }
            if (r6 == 0) goto L_0x02f7
            com.google.common.base.ax r6 = r5.f303369ca     // Catch:{ all -> 0x038a }
            java.lang.Object r6 = r6.mo56107c()     // Catch:{ all -> 0x038a }
            com.google.android.apps.gsa.assistant.shared.be r6 = (com.google.android.apps.gsa.assistant.shared.be) r6     // Catch:{ all -> 0x038a }
            android.os.Bundle r8 = r5.f303442g     // Catch:{ all -> 0x038a }
            java.lang.String r8 = com.google.android.apps.gsa.search.shared.p6930h.C87566i.m142234I(r8)     // Catch:{ all -> 0x038a }
            android.os.Bundle r9 = r5.f303442g     // Catch:{ all -> 0x038a }
            byte[] r9 = com.google.android.apps.gsa.search.shared.p6930h.C87566i.m142273aU(r9)     // Catch:{ all -> 0x038a }
            boolean r6 = r6.h(r8, r9)     // Catch:{ all -> 0x038a }
            if (r6 == 0) goto L_0x02f7
            com.google.android.apps.gsa.staticplugins.opa.fl r6 = r5.f303444i     // Catch:{ all -> 0x038a }
            com.google.android.apps.gsa.shared.logger.b.ae r8 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.OPA_ACTIVITY_DISMISS_OTHER     // Catch:{ all -> 0x038a }
            r6.mo95167z(r8)     // Catch:{ all -> 0x038a }
            android.app.Activity r5 = r5.f303441f     // Catch:{ all -> 0x038a }
            r5.finish()     // Catch:{ all -> 0x038a }
        L_0x02f7:
            com.google.common.base.ax r5 = r7.f304832s     // Catch:{ all -> 0x038a }
            boolean r5 = r5.mo56113h()     // Catch:{ all -> 0x038a }
            if (r5 == 0) goto L_0x0313
            com.google.common.base.ax r5 = r7.f304832s     // Catch:{ all -> 0x038a }
            java.lang.Object r5 = r5.mo56107c()     // Catch:{ all -> 0x038a }
            com.google.android.apps.gsa.staticplugins.opa.ah.l r5 = (com.google.android.apps.gsa.staticplugins.opa.p8185ah.C106171l) r5     // Catch:{ all -> 0x038a }
            android.app.Activity r6 = r7.f304815b     // Catch:{ all -> 0x038a }
            android.view.Window r6 = r6.getWindow()     // Catch:{ all -> 0x038a }
            com.google.android.apps.gsa.staticplugins.opa.p8185ah.C106171l.m176834d(r4, r6)     // Catch:{ all -> 0x038a }
            r5.mo95335b()     // Catch:{ all -> 0x038a }
        L_0x0313:
            com.google.android.apps.gsa.staticplugins.opa.util.cr r8 = r7.f304823j     // Catch:{ all -> 0x038a }
            long r11 = r7.f304834u     // Catch:{ all -> 0x038a }
            android.widget.FrameLayout r5 = r7.f304829p     // Catch:{ all -> 0x038a }
            com.google.android.libraries.logging.k r6 = com.google.android.libraries.logging.C28295m.m52916b(r5)     // Catch:{ all -> 0x038a }
            com.google.common.o.oe r13 = com.google.android.libraries.logging.C28285c.m52881h(r2, r6, r5)     // Catch:{ all -> 0x038a }
            r9 = 0
            r8.mo100721a(r9, r11, r13)     // Catch:{ all -> 0x038a }
            boolean r2 = r7.f304802N     // Catch:{ all -> 0x038a }
            com.google.android.apps.gsa.search.core.i.t r5 = r7.f304818e     // Catch:{ all -> 0x038a }
            com.google.android.apps.gsa.shared.m.d r6 = com.google.android.apps.gsa.shared.p7066m.C90065dq.f249657d     // Catch:{ all -> 0x038a }
            boolean r5 = r5.mo79746e(r6)     // Catch:{ all -> 0x038a }
            if (r5 == 0) goto L_0x033a
            com.google.android.apps.gsa.assistant.shared.ab r2 = r7.f304803O     // Catch:{ all -> 0x038a }
            java.util.concurrent.atomic.AtomicBoolean r2 = r2.f195096a     // Catch:{ all -> 0x038a }
            boolean r2 = r2.get()     // Catch:{ all -> 0x038a }
        L_0x033a:
            com.google.android.apps.gsa.search.core.i.t r5 = r7.f304818e     // Catch:{ all -> 0x038a }
            com.google.android.apps.gsa.shared.m.d r6 = com.google.android.apps.gsa.shared.p7066m.C90066dr.f249666I     // Catch:{ all -> 0x038a }
            boolean r5 = r5.mo79746e(r6)     // Catch:{ all -> 0x038a }
            if (r5 == 0) goto L_0x035b
            if (r2 == 0) goto L_0x035b
            dagger.a r2 = r7.f304798J     // Catch:{ all -> 0x038a }
            java.lang.Object r2 = r2.mo27525b()     // Catch:{ all -> 0x038a }
            com.google.android.libraries.gsa.k.g r2 = (com.google.android.libraries.gsa.p1876k.C22871g) r2     // Catch:{ all -> 0x038a }
            com.google.android.apps.gsa.staticplugins.opa.lu r5 = new com.google.android.apps.gsa.staticplugins.opa.lu     // Catch:{ all -> 0x038a }
            r5.<init>(r7)     // Catch:{ all -> 0x038a }
            java.lang.String r6 = "Stop Service Client"
            r8 = 1000(0x3e8, double:4.94E-321)
            r2.mo28204d(r6, r8, r5)     // Catch:{ all -> 0x038a }
            goto L_0x0360
        L_0x035b:
            com.google.android.apps.gsa.staticplugins.opa.az.t r2 = r7.f304825l     // Catch:{ all -> 0x038a }
            r2.mo96240b()     // Catch:{ all -> 0x038a }
        L_0x0360:
            com.google.android.apps.gsa.staticplugins.opa.ay.as r2 = r7.f304837x     // Catch:{ all -> 0x038a }
            com.google.android.apps.gsa.staticplugins.opa.ay.ap r2 = (com.google.android.apps.gsa.staticplugins.opa.p8313ay.C107656ap) r2     // Catch:{ all -> 0x038a }
            com.google.android.apps.gsa.assistant.shared.p.m r2 = r2.mo96183l()     // Catch:{ all -> 0x038a }
            if (r2 == 0) goto L_0x036d
            r2.n()     // Catch:{ all -> 0x038a }
        L_0x036d:
            r14.f295645aj = r3     // Catch:{ all -> 0x038a }
            r14.f295646ak = r4     // Catch:{ all -> 0x038a }
            r14.f295635U = r4     // Catch:{ all -> 0x038a }
            super.onStop()     // Catch:{ all -> 0x038a }
            if (r1 == 0) goto L_0x0384
            boolean r1 = r14.f295653ar     // Catch:{ all -> 0x038a }
            if (r1 == 0) goto L_0x0381
            com.google.android.apps.gsa.staticplugins.opa.av.a r1 = r14.f295627M     // Catch:{ all -> 0x038a }
            r1.mo96079f()     // Catch:{ all -> 0x038a }
        L_0x0381:
            r14.finish()     // Catch:{ all -> 0x038a }
        L_0x0384:
            if (r0 == 0) goto L_0x0389
            r0.close()
        L_0x0389:
            return
        L_0x038a:
            r1 = move-exception
            if (r0 == 0) goto L_0x0395
            r0.close()     // Catch:{ all -> 0x0391 }
            goto L_0x0395
        L_0x0391:
            r0 = move-exception
            com.google.android.apps.gsa.staticplugins.opa.C109432le.m182115a(r1, r0)
        L_0x0395:
            goto L_0x0397
        L_0x0396:
            throw r1
        L_0x0397:
            goto L_0x0396
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.staticplugins.opa.OpaActivity.onStop():void");
    }

    public final void onTopResumedActivityChanged(boolean z) {
        C109452ly lyVar = this.f295634T;
        if (z) {
            lyVar.f304825l.mo81937i(new C88489j(C87739bu.TOP_RESUMED_ACTIVTIY).mo82013a());
        }
    }

    public final void onUserInteraction() {
        C58976aa aaVar = C58975e.f156826a;
        m176446H();
        super.onUserInteraction();
    }

    /* access modifiers changed from: protected */
    public final void onUserLeaveHint() {
        super.onUserLeaveHint();
        C58976aa aaVar = C58975e.f156826a;
        boolean z = true;
        this.f295652aq = true;
        boolean z2 = this.f295635U;
        if (!hasWindowFocus() && !mo95150C()) {
            z = false;
        }
        this.f295635U = z | z2;
        m176447I(C89849ae.OPA_ACTIVITY_DISMISS_HOME);
        this.f295622H.mo96586a(C108198f.f300955a);
    }

    public final void onWindowFocusChanged(boolean z) {
        C58976aa aaVar = C58975e.f156826a;
        this.f295635U = z | this.f295635U;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: v */
    public final /* synthetic */ void mo95163v() {
        super.finish();
        if (m176449K()) {
            overridePendingTransition(R.anim.use_bottom_z_order_without_animation, R.anim.fade_out_tapas);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: w */
    public final /* synthetic */ void mo95164w() {
        super.finishAndRemoveTask();
    }

    /* renamed from: x */
    public final void mo95165x(C89849ae aeVar) {
        m176447I(aeVar);
        if (this.f295653ar) {
            this.f295627M.mo96079f();
        }
        if (!this.f295663q.mo79746e(C90014bt.f247778na) || ((!this.f295663q.mo79746e(C90029ch.f248201O) && !this.f295663q.mo79746e(C90029ch.f248199M)) || !(aeVar == C89849ae.OPA_ACTIVITY_DISMISS_CLICK_OUT || aeVar == C89849ae.OPA_ACTIVITY_DISMISS_DRAG || aeVar == C89849ae.OPA_ACTIVITY_DISMISS_FLING))) {
            finish();
        } else {
            moveTaskToBack(true);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: y */
    public final void mo95166y(Intent intent) {
        if (intent.getBooleanExtra("extra_opa_keep_conversation_alive_on_stop", false) || intent.getBooleanExtra("extra_accl_intent", false)) {
            this.f295634T.mo97837p();
        }
    }

    /* renamed from: z */
    public final void mo95167z(C89849ae aeVar) {
        C59104x b = f295614j.mo56224b();
        b.mo56378ag(C58975e.f156826a, "OpaActivity");
        ((C59052c) ((C59052c) b).mo56372aa(22898)).mo56389s("onQuitEventWithReason %s", aeVar);
        boolean z = true;
        if (!f295611ab.contains(aeVar)) {
            C109452ly lyVar = this.f295634T;
            if (lyVar != null) {
                C109040fj fjVar = lyVar.f304827n;
                C107503d dVar = (C107503d) C107504e.f299115c.createBuilder();
                C107502c cVar = C107502c.OPA_UI_DISMISS_CLIENT_EVENT;
                dVar.copyOnWrite();
                C107504e eVar = (C107504e) dVar.instance;
                eVar.f299118b = cVar.f299114n;
                eVar.f299117a |= 1;
                C88489j jVar = new C88489j(C87739bu.OPA_SESSION_CLIENT_EVENT);
                jVar.mo82014b(C107460a.f299029a, (C107504e) dVar.build());
                fjVar.f303454s.mo96219b(jVar.mo82013a());
            }
            this.f295620F.mo83138l();
        }
        if (f295612ac.contains(aeVar)) {
            this.f295652aq = true;
            boolean z2 = this.f295635U;
            if (!hasWindowFocus() && !mo95150C()) {
                z = false;
            }
            this.f295635U = z2 | z;
        }
        mo95165x(aeVar);
    }
}
