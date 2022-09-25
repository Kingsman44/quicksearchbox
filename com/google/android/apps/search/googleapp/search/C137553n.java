package com.google.android.apps.search.googleapp.search;

import android.app.Activity;
import android.app.assist.AssistContent;
import android.content.Context;
import android.net.Uri;
import android.support.p031v4.app.C0154a;
import android.support.p031v4.app.C0192bk;
import android.support.p031v4.app.Fragment;
import android.support.p031v4.app.FragmentManager;
import android.view.View;
import android.widget.TextView;
import androidx.activity.result.C0816c;
import androidx.navigation.C3896q;
import com.evernote.android.state.BuildConfig;
import com.google.android.apps.gsa.shared.logger.p7051b.C89849ae;
import com.google.android.apps.gsa.shared.logger.p7051b.C89859i;
import com.google.android.apps.search.googleapp.activity.C133416bc;
import com.google.android.apps.search.googleapp.activity.C133423bj;
import com.google.android.apps.search.googleapp.activity.GoogleAppActivity;
import com.google.android.apps.search.googleapp.activity.p10137b.C133411h;
import com.google.android.apps.search.googleapp.p10117aa.p10119b.C133110a;
import com.google.android.apps.search.googleapp.p10117aa.p10120c.C133116a;
import com.google.android.apps.search.googleapp.p10117aa.p10121d.C133118a;
import com.google.android.apps.search.googleapp.p10310h.C136135p;
import com.google.android.apps.search.googleapp.p10335j.C136374e;
import com.google.android.apps.search.googleapp.p10516t.p10521e.C139704d;
import com.google.android.apps.search.googleapp.p10516t.p10521e.C139705e;
import com.google.android.apps.search.googleapp.p10516t.p10522f.C139708c;
import com.google.android.apps.search.googleapp.p10527u.C139761b;
import com.google.android.apps.search.googleapp.p10527u.C139768i;
import com.google.android.apps.search.googleapp.p10527u.C139775p;
import com.google.android.apps.search.googleapp.p10527u.C139779t;
import com.google.android.apps.search.googleapp.search.p10406c.C137401b;
import com.google.android.apps.search.googleapp.search.p10409e.C137413b;
import com.google.android.apps.search.googleapp.search.p10409e.C137416e;
import com.google.android.apps.search.googleapp.search.p10409e.C137418g;
import com.google.android.apps.search.googleapp.search.p10409e.C137421j;
import com.google.android.apps.search.googleapp.search.p10410f.C137447w;
import com.google.android.apps.search.googleapp.search.p10415i.C137484ad;
import com.google.android.apps.search.googleapp.search.p10415i.C137485ae;
import com.google.android.apps.search.googleapp.search.p10420k.C137543b;
import com.google.android.apps.search.googleapp.search.p10420k.p10421a.C137542d;
import com.google.android.apps.search.googleapp.search.srp.C137699ab;
import com.google.android.apps.search.googleapp.search.srp.C137711an;
import com.google.android.apps.search.googleapp.search.srp.error.C137824w;
import com.google.android.apps.search.googleapp.search.srp.error.C137825x;
import com.google.android.apps.search.googleapp.search.srp.external.C137830c;
import com.google.android.apps.search.googleapp.search.srp.p10435e.C137770au;
import com.google.android.apps.search.googleapp.search.srp.p10437g.C137852a;
import com.google.android.apps.search.googleapp.search.suggest.C138127i;
import com.google.android.apps.search.googleapp.search.suggest.p10449b.C138057n;
import com.google.android.apps.search.googleapp.search.suggest.p10464ui.C138546aa;
import com.google.android.apps.search.googleapp.search.suggest.p10464ui.C138551af;
import com.google.android.apps.search.googleapp.search.suggest.p10464ui.C138552ag;
import com.google.android.apps.search.googleapp.search.suggest.p10464ui.C138558am;
import com.google.android.apps.search.googleapp.search.voicesearch.C138705aj;
import com.google.android.apps.search.googleapp.search.voicesearch.C138711ao;
import com.google.android.apps.search.googleapp.search.voicesearch.C138713aq;
import com.google.android.apps.search.googleapp.search.voicesearch.C138859r;
import com.google.android.apps.search.googleapp.search.voicesearch.logoview.LogoView;
import com.google.android.apps.search.googleapp.search.voicesearch.p10469c.C138728b;
import com.google.android.apps.search.googleapp.search.voicesearch.p10469c.C138767d;
import com.google.android.apps.search.googleapp.search.voicesearch.p10469c.C138772i;
import com.google.android.apps.search.googleapp.search.voicesearch.p10469c.C138784u;
import com.google.android.apps.search.googleapp.search.voicesearch.p10469c.C138787x;
import com.google.android.apps.search.googleapp.search.voicesearch.p10469c.C138788y;
import com.google.android.apps.search.googleapp.startup.appinteractive.C139684f;
import com.google.android.apps.search.googleapp.urlhandler.C139795f;
import com.google.android.apps.search.googleapp.urlhandler.optimizer.C139846f;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.logging.p2185ve.C28306ab;
import com.google.android.libraries.logging.p2185ve.C28485y;
import com.google.android.libraries.p1730f.C21370a;
import com.google.android.libraries.search.logging.p3034a.C38768q;
import com.google.android.libraries.search.logging.p3042e.C39190a;
import com.google.android.libraries.search.p2871b.p2872a.p2876d.C37182a;
import com.google.android.libraries.search.p2871b.p2895i.C37258g;
import com.google.android.libraries.search.p3025k.C38553h;
import com.google.android.libraries.web.base.C43264o;
import com.google.android.libraries.web.base.C43265p;
import com.google.android.libraries.web.base.C43266q;
import com.google.android.libraries.web.base.WebConfig;
import com.google.android.libraries.web.contrib.errorpage.p3373a.C43508a;
import com.google.android.libraries.web.contrib.errorpage.p3373a.C43512b;
import com.google.android.libraries.web.contrib.errorpage.p3373a.C43513c;
import com.google.apps.tiktok.account.AccountId;
import com.google.apps.tiktok.contrib.p3629c.C46485f;
import com.google.apps.tiktok.dataservice.C46792di;
import com.google.apps.tiktok.dataservice.C46801dp;
import com.google.apps.tiktok.inject.p3659d.C47243l;
import com.google.apps.tiktok.inject.p3660e.p3661a.C47247a;
import com.google.apps.tiktok.p3674l.p3679c.C47392e;
import com.google.apps.tiktok.tracing.C47558bi;
import com.google.apps.tiktok.tracing.C47831fm;
import com.google.common.base.C58838bb;
import com.google.common.p4522b.C58495hd;
import com.google.common.p4522b.C58729pv;
import com.google.common.p4522b.C58759qy;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.p4526f.p4527a.C58974d;
import com.google.common.p4552o.aod;
import com.google.common.p4552o.apd;
import com.google.p395al.p417d.p418a.C8575bc;
import com.google.protobuf.C62912at;
import dagger.hilt.android.internal.managers.C68324h;
import java.util.ArrayDeque;
import java.util.Collections;
import java.util.Deque;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
import p3186j$.time.Duration;
import p3186j$.util.Optional;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.googleapp.search.n */
/* compiled from: PG */
public final class C137553n implements C139768i, C139761b, C133416bc, C133423bj {

    /* renamed from: a */
    public static final C58974d f374108a = C58974d.m91135i("SearchFragment");

    /* renamed from: A */
    public C137770au f374109A;

    /* renamed from: B */
    public C138127i f374110B;

    /* renamed from: C */
    public C0816c f374111C;

    /* renamed from: D */
    public C3896q f374112D;

    /* renamed from: E */
    public Deque f374113E = new ArrayDeque();

    /* renamed from: F */
    public C137421j f374114F;

    /* renamed from: G */
    public boolean f374115G;

    /* renamed from: H */
    public int f374116H;

    /* renamed from: I */
    public final C38553h f374117I;

    /* renamed from: J */
    private final AccountId f374118J;

    /* renamed from: K */
    private final C137401b f374119K;

    /* renamed from: L */
    private final AtomicReference f374120L;

    /* renamed from: M */
    private final C21370a f374121M;

    /* renamed from: N */
    private final Context f374122N;

    /* renamed from: O */
    private final C38768q f374123O;

    /* renamed from: P */
    private final C133411h f374124P;

    /* renamed from: Q */
    private final C137852a f374125Q;

    /* renamed from: R */
    private final C137485ae f374126R;

    /* renamed from: S */
    private final C133118a f374127S;

    /* renamed from: T */
    private final C133110a f374128T;

    /* renamed from: U */
    private final WebConfig f374129U;

    /* renamed from: V */
    private final boolean f374130V;

    /* renamed from: W */
    private final boolean f374131W;

    /* renamed from: X */
    private final int f374132X;

    /* renamed from: b */
    public final C46485f f374133b;

    /* renamed from: c */
    public final Activity f374134c;

    /* renamed from: d */
    public final C89859i f374135d;

    /* renamed from: e */
    public final C139684f f374136e;

    /* renamed from: f */
    public final C137447w f374137f;

    /* renamed from: g */
    public final SearchFragment f374138g;

    /* renamed from: h */
    public final C137411e f374139h;

    /* renamed from: i */
    public final C46801dp f374140i;

    /* renamed from: j */
    public final C136374e f374141j;

    /* renamed from: k */
    public final C139795f f374142k;

    /* renamed from: l */
    public final C139846f f374143l;

    /* renamed from: m */
    public final C138728b f374144m;

    /* renamed from: n */
    public final C28306ab f374145n;

    /* renamed from: o */
    public final C138767d f374146o;

    /* renamed from: p */
    public final C138772i f374147p;

    /* renamed from: q */
    public final C139708c f374148q;

    /* renamed from: r */
    public final boolean f374149r;

    /* renamed from: s */
    public final boolean f374150s;

    /* renamed from: t */
    public final boolean f374151t;

    /* renamed from: u */
    public final boolean f374152u;

    /* renamed from: v */
    public final boolean f374153v;

    /* renamed from: w */
    public final boolean f374154w;

    /* renamed from: x */
    public final C0192bk f374155x = new C137552m(this);

    /* renamed from: y */
    public boolean f374156y;

    /* renamed from: z */
    public String f374157z;

    /* renamed from: com.google.android.apps.search.googleapp.search.n$a */
    /* compiled from: PG */
    final class C137554a implements C46792di {

        /* renamed from: a */
        private final C137553n f374158a;

        /* renamed from: b */
        private final C138772i f374159b;

        /* renamed from: c */
        private final boolean f374160c;

        /* renamed from: d */
        private final boolean f374161d;

        /* renamed from: e */
        private final C138728b f374162e;

        /* renamed from: f */
        private final boolean f374163f;

        public C137554a(C137553n nVar, C138772i iVar, boolean z, boolean z2, C138728b bVar, boolean z3) {
            this.f374158a = nVar;
            this.f374159b = iVar;
            this.f374160c = z;
            this.f374161d = z2;
            this.f374162e = bVar;
            this.f374163f = z3;
        }

        /* renamed from: a */
        public final void mo18077a(Throwable th) {
        }

        /* renamed from: b */
        public final /* bridge */ /* synthetic */ void mo18078b(Object obj) {
            C137421j jVar;
            C138788y yVar = (C138788y) obj;
            C138772i iVar = this.f374159b;
            iVar.getClass();
            int b = C138787x.m225440b(yVar.f377534b);
            if (b == 0) {
                b = 1;
            }
            int i = b - 2;
            if (i != 4) {
                if (i != 5) {
                    if (i == 8) {
                        this.f374158a.mo113825z(2);
                        C137699ab l = this.f374158a.mo113811l();
                        l.getClass();
                        C137711an a = l.mo17754z();
                        if (a.f374546A.mo112951a()) {
                            a.mo113917f();
                            if (a.f374554I) {
                                ((C137543b) a.f374550E.mo5768a()).mo113805b(C137542d.f374085g);
                            } else {
                                a.f374555J.mo50381d(C62912at.f169862a, C137542d.f374085g);
                            }
                            C43513c cVar = a.f374588g;
                            C43508a aVar = (C43508a) C43512b.f113627a.createBuilder();
                            aVar.mo58885m(C137825x.f374971a, C137824w.ERROR_VOICE_SEARCH_NO_CONNECTIVITY);
                            cVar.mo46578a((C43512b) aVar.build());
                            a.mo113920j();
                            return;
                        }
                        return;
                    } else if (i != 9) {
                        return;
                    }
                } else if (this.f374160c) {
                    iVar.mo114524c();
                    Activity activity = this.f374158a.f374134c;
                    if (activity instanceof GoogleAppActivity) {
                        ((GoogleAppActivity) activity).mo17754z().mo111122k(false);
                        return;
                    }
                    return;
                }
                this.f374158a.mo113815p();
                return;
            }
            if (this.f374163f) {
                this.f374158a.mo113818s();
            }
            String str = yVar.f377535c;
            String str2 = null;
            if (!str.isEmpty()) {
                this.f374162e.mo114503a();
                C137553n nVar = this.f374158a;
                if ((yVar.f377533a & 1) != 0) {
                    str2 = yVar.f377538f;
                }
                Duration ofMillis = Duration.ofMillis(yVar.f377536d);
                C137416e eVar = (C137416e) C137418g.f373767r.createBuilder();
                eVar.copyOnWrite();
                C137418g gVar = (C137418g) eVar.instance;
                gVar.f373769a |= 32;
                gVar.f373776h = true;
                if (!ofMillis.isZero()) {
                    long millis = ofMillis.toMillis();
                    eVar.copyOnWrite();
                    C137418g gVar2 = (C137418g) eVar.instance;
                    gVar2.f373769a = 4 | gVar2.f373769a;
                    gVar2.f373772d = millis;
                }
                eVar.copyOnWrite();
                C137418g gVar3 = (C137418g) eVar.instance;
                str.getClass();
                gVar3.f373769a |= 1;
                gVar3.f373770b = str;
                if (str2 != null) {
                    eVar.copyOnWrite();
                    C137418g gVar4 = (C137418g) eVar.instance;
                    gVar4.f373769a |= 8192;
                    gVar4.f373783o = str2;
                }
                nVar.mo113809A((C137418g) eVar.build(), C58495hd.m89900n("inm", "vs"), 8);
                this.f374159b.f377461e = true;
                return;
            }
            if (!this.f374161d || ((jVar = this.f374158a.f374114F) != null && jVar.f373792b)) {
                C138772i iVar2 = this.f374159b;
                int i2 = iVar2.f377462f;
                if (i2 == 0) {
                    throw null;
                } else if (i2 != 4) {
                    int i3 = iVar2.f377462f;
                    if (i3 == 0) {
                        throw null;
                    } else if (i3 != 3) {
                        int i4 = iVar2.f377462f;
                        if (i4 == 0) {
                            throw null;
                        } else if (i4 != 5) {
                            int i5 = iVar2.f377462f;
                            if (i5 == 0) {
                                throw null;
                            } else if (i5 == 6) {
                                return;
                            }
                        } else {
                            return;
                        }
                    } else {
                        return;
                    }
                } else {
                    return;
                }
            }
            this.f374158a.mo113815p();
        }

        /* renamed from: c */
        public final /* synthetic */ void mo18079c() {
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x00a8  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C137553n(android.content.Context r7, com.google.android.apps.search.googleapp.search.C137411e r8, com.google.android.apps.gsa.shared.logger.p7051b.C89859i r9, boolean r10, boolean r11, boolean r12, boolean r13, java.lang.String r14, boolean r15, boolean r16, boolean r17, boolean r18, com.google.android.libraries.search.logging.p3034a.C38768q r19, java.util.concurrent.atomic.AtomicReference r20, com.google.android.libraries.web.base.WebConfig r21, com.google.apps.tiktok.account.AccountId r22, com.google.apps.tiktok.contrib.p3629c.C46485f r23, android.app.Activity r24, com.google.android.apps.search.googleapp.search.p10406c.C137401b r25, com.google.android.libraries.p1730f.C21370a r26, com.google.android.apps.search.googleapp.startup.appinteractive.C139684f r27, com.google.android.libraries.search.p3025k.C38553h r28, com.google.android.apps.search.googleapp.activity.p10137b.C133411h r29, com.google.android.apps.search.googleapp.search.srp.p10437g.C137852a r30, com.google.android.apps.search.googleapp.search.p10410f.C137447w r31, com.google.android.apps.search.googleapp.search.SearchFragment r32, com.google.android.apps.search.googleapp.search.p10415i.C137485ae r33, com.google.apps.tiktok.dataservice.C46801dp r34, com.google.android.apps.search.googleapp.p10117aa.p10121d.C133118a r35, com.google.android.apps.search.googleapp.p10117aa.p10119b.C133110a r36, com.google.android.apps.search.googleapp.p10335j.C136374e r37, com.google.android.apps.search.googleapp.urlhandler.C139795f r38, com.google.android.apps.search.googleapp.urlhandler.optimizer.C139846f r39, com.google.android.apps.search.googleapp.search.voicesearch.p10469c.C138728b r40, com.google.android.libraries.logging.p2185ve.C28306ab r41, com.google.android.apps.search.googleapp.search.voicesearch.p10469c.C138767d r42, com.google.android.apps.search.googleapp.search.voicesearch.p10469c.C138772i r43, com.google.android.apps.search.googleapp.p10516t.p10522f.C139708c r44) {
        /*
            r6 = this;
            r0 = r6
            r1 = r14
            r6.<init>()
            com.google.android.apps.search.googleapp.search.m r2 = new com.google.android.apps.search.googleapp.search.m
            r2.<init>(r6)
            r0.f374155x = r2
            java.util.ArrayDeque r2 = new java.util.ArrayDeque
            r2.<init>()
            r0.f374113E = r2
            r2 = 1
            r0.f374116H = r2
            r3 = r22
            r0.f374118J = r3
            r3 = r23
            r0.f374133b = r3
            r3 = r24
            r0.f374134c = r3
            r3 = r9
            r0.f374135d = r3
            r3 = r25
            r0.f374119K = r3
            r3 = r11
            r0.f374149r = r3
            r3 = r26
            r0.f374121M = r3
            r3 = r7
            r0.f374122N = r3
            r3 = r27
            r0.f374136e = r3
            r3 = r15
            r0.f374150s = r3
            r3 = r10
            r0.f374151t = r3
            r3 = r16
            r0.f374152u = r3
            r3 = r17
            r0.f374153v = r3
            r3 = r19
            r0.f374123O = r3
            r3 = r28
            r0.f374117I = r3
            r3 = r29
            r0.f374124P = r3
            r3 = r30
            r0.f374125Q = r3
            r3 = r20
            r0.f374120L = r3
            r3 = r12
            r0.f374130V = r3
            r3 = r31
            r0.f374137f = r3
            r3 = r32
            r0.f374138g = r3
            r3 = r8
            r0.f374139h = r3
            r3 = r21
            r0.f374129U = r3
            r3 = r13
            r0.f374131W = r3
            r3 = r18
            r0.f374154w = r3
            int r3 = r14.hashCode()
            r4 = -1780277554(0xffffffff95e31ece, float:-9.173317E-26)
            r5 = 2
            if (r3 == r4) goto L_0x009b
            r4 = 912574104(0x3664c698, float:3.4090244E-6)
            if (r3 == r4) goto L_0x0091
            r4 = 912646970(0x3665e33a, float:3.4255922E-6)
            if (r3 == r4) goto L_0x0087
            goto L_0x00a5
        L_0x0087:
            java.lang.String r3 = "SHOW_NONE"
            boolean r1 = r14.equals(r3)
            if (r1 == 0) goto L_0x00a5
            r1 = 0
            goto L_0x00a6
        L_0x0091:
            java.lang.String r3 = "SHOW_LAST"
            boolean r1 = r14.equals(r3)
            if (r1 == 0) goto L_0x00a5
            r1 = 2
            goto L_0x00a6
        L_0x009b:
            java.lang.String r3 = "SHOW_FIRST"
            boolean r1 = r14.equals(r3)
            if (r1 == 0) goto L_0x00a5
            r1 = 1
            goto L_0x00a6
        L_0x00a5:
            r1 = -1
        L_0x00a6:
            if (r1 == 0) goto L_0x00b5
            if (r1 == r2) goto L_0x00b4
            if (r1 != r5) goto L_0x00ae
            r2 = 3
            goto L_0x00b5
        L_0x00ae:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            r1.<init>()
            throw r1
        L_0x00b4:
            r2 = 2
        L_0x00b5:
            r0.f374132X = r2
            r1 = r33
            r0.f374126R = r1
            r1 = r34
            r0.f374140i = r1
            r1 = r35
            r0.f374127S = r1
            r1 = r36
            r0.f374128T = r1
            r1 = r37
            r0.f374141j = r1
            r1 = r38
            r0.f374142k = r1
            r1 = r39
            r0.f374143l = r1
            r1 = r40
            r0.f374144m = r1
            r1 = r41
            r0.f374145n = r1
            r1 = r42
            r0.f374146o = r1
            r1 = r43
            r0.f374147p = r1
            r1 = r44
            r0.f374148q = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.search.googleapp.search.C137553n.<init>(android.content.Context, com.google.android.apps.search.googleapp.search.e, com.google.android.apps.gsa.shared.logger.b.i, boolean, boolean, boolean, boolean, java.lang.String, boolean, boolean, boolean, boolean, com.google.android.libraries.search.logging.a.q, java.util.concurrent.atomic.AtomicReference, com.google.android.libraries.web.base.WebConfig, com.google.apps.tiktok.account.AccountId, com.google.apps.tiktok.contrib.c.f, android.app.Activity, com.google.android.apps.search.googleapp.search.c.b, com.google.android.libraries.f.a, com.google.android.apps.search.googleapp.startup.appinteractive.f, com.google.android.libraries.search.k.h, com.google.android.apps.search.googleapp.activity.b.h, com.google.android.apps.search.googleapp.search.srp.g.a, com.google.android.apps.search.googleapp.search.f.w, com.google.android.apps.search.googleapp.search.SearchFragment, com.google.android.apps.search.googleapp.search.i.ae, com.google.apps.tiktok.dataservice.dp, com.google.android.apps.search.googleapp.aa.d.a, com.google.android.apps.search.googleapp.aa.b.a, com.google.android.apps.search.googleapp.j.e, com.google.android.apps.search.googleapp.urlhandler.f, com.google.android.apps.search.googleapp.urlhandler.optimizer.f, com.google.android.apps.search.googleapp.search.voicesearch.c.b, com.google.android.libraries.logging.ve.ab, com.google.android.apps.search.googleapp.search.voicesearch.c.d, com.google.android.apps.search.googleapp.search.voicesearch.c.i, com.google.android.apps.search.googleapp.t.f.c):void");
    }

    /* renamed from: C */
    private final void m223433C(String str) {
        C138546aa m = mo113812m();
        m.getClass();
        m.mo17754z().mo114331i(C139704d.SRP_BACKPRESS, true);
        m.mo17754z().mo114332j(str, false);
    }

    /* renamed from: D */
    private final boolean m223434D() {
        if (this.f374113E.isEmpty()) {
            return false;
        }
        int b = C137393ac.m223236b((String) this.f374113E.pop());
        m223435E(b);
        if (this.f374132X != 1 && b == 3) {
            Fragment c = this.f374138g.getChildFragmentManager().f634a.mo671c("SUGGESTIONS");
            c.getClass();
            ((C138546aa) c).mo17754z().mo114326d().mo114406h();
        }
        return true;
    }

    /* renamed from: E */
    private final void m223435E(int i) {
        int i2 = i - 1;
        if (i2 == 1) {
            mo113817r();
        } else if (i2 == 2) {
            mo113818s();
        } else if (i2 == 3 && mo113813n() == null) {
            if (this.f374152u) {
                C47558bi a = C47831fm.m85006a("SearchFragmentPeer#maybeAttachVoiceSearchFragment");
                try {
                    C43264o a2 = C43265p.m76349a(this.f374118J, this.f374129U);
                    C0154a aVar = new C0154a(this.f374138g.getChildFragmentManager());
                    aVar.mo511h(R.id.googleapp_search_top_level_destination_container, a2, "VOICE", 1);
                    aVar.mo515l(a2);
                    aVar.mo509f();
                    C43266q f = a2.mo17754z();
                    AccountId accountId = this.f374118J;
                    accountId.getClass();
                    f.mo46380b(C138711ao.m225292f(accountId));
                    a.close();
                } catch (Throwable th) {
                    C137422f.m223281a(th, th);
                }
            } else {
                C47558bi a3 = C47831fm.m85006a("SearchFragmentPeer#maybeAttachVoiceSearchFragment");
                try {
                    AccountId accountId2 = this.f374118J;
                    accountId2.getClass();
                    C138711ao f2 = C138711ao.m225292f(accountId2);
                    C0154a aVar2 = new C0154a(this.f374138g.getChildFragmentManager());
                    aVar2.mo511h(R.id.googleapp_search_top_level_destination_container, f2, "VOICE", 1);
                    aVar2.mo515l(f2);
                    aVar2.mo509f();
                    a3.close();
                } catch (Throwable th2) {
                    C137422f.m223281a(th, th2);
                }
            }
        }
        C0154a aVar3 = new C0154a(this.f374138g.getChildFragmentManager());
        int[] iArr = {1, 2, 3, 4};
        int i3 = 0;
        while (i3 < 4) {
            int i4 = iArr[i3];
            FragmentManager childFragmentManager = this.f374138g.getChildFragmentManager();
            String a4 = C137393ac.m223235a(i4);
            if (i4 != 0) {
                Fragment c = childFragmentManager.f634a.mo671c(a4);
                if (c != null) {
                    if (i == i4) {
                        aVar3.mo519p(c);
                        this.f374116H = i;
                    } else {
                        aVar3.mo515l(c);
                        if (i4 == 3) {
                            ((C138546aa) c).mo17754z().mo114326d().mo114407i();
                        }
                    }
                }
                i3++;
            } else {
                throw null;
            }
        }
        aVar3.mo509f();
        this.f374124P.mo111132a(mo111227j());
        return;
        throw th;
        throw th;
    }

    /* renamed from: k */
    public static SearchFragment m223436k(AccountId accountId, C137411e eVar) {
        SearchFragment searchFragment = new SearchFragment();
        C68324h.m98669f(searchFragment);
        C47247a.m84047b(searchFragment, accountId);
        C47243l.m84039a(searchFragment, eVar);
        return searchFragment;
    }

    /* JADX WARNING: Removed duplicated region for block: B:39:0x0119  */
    /* JADX WARNING: Removed duplicated region for block: B:45:? A[RETURN, SYNTHETIC] */
    /* renamed from: A */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo113809A(com.google.android.apps.search.googleapp.search.p10409e.C137418g r9, java.util.Map r10, int r11) {
        /*
            r8 = this;
            r8.mo113817r()
            com.google.android.apps.search.googleapp.search.srp.ab r0 = r8.mo113811l()
            r0.getClass()
            int r1 = r9.f373769a
            r2 = 1
            r1 = r1 & r2
            if (r1 == 0) goto L_0x0020
            java.lang.String r1 = r9.f373770b
            android.net.Uri r1 = com.google.android.libraries.search.p3096r.C39905a.m69320a(r1)
            if (r1 == 0) goto L_0x0020
            boolean r1 = r0.isStateSaved()
            if (r1 != 0) goto L_0x001f
            goto L_0x0020
        L_0x001f:
            return
        L_0x0020:
            com.google.android.apps.search.googleapp.search.srp.an r0 = r0.mo17754z()
            com.google.android.apps.search.googleapp.search.srp.r r1 = r0.mo113914b()
            r3 = 0
            r1.mo114018c(r3)
            com.google.android.apps.search.googleapp.j.e r1 = r0.f374546A
            boolean r1 = r1.mo112951a()
            r4 = 8
            if (r1 != 0) goto L_0x003d
            if (r11 == r4) goto L_0x0039
            goto L_0x003d
        L_0x0039:
            r11 = 8
            r1 = 0
            goto L_0x003e
        L_0x003d:
            r1 = 1
        L_0x003e:
            java.lang.String r5 = "onNewTextSearch should not get called when TNG:VS is off and trigger type is VOICE_SEARCH."
            com.google.common.base.C58838bb.m90869d(r1, r5)
            com.google.android.apps.search.googleapp.search.k.e r1 = r0.f374600s
            android.content.Context r5 = r0.f374585d
            boolean r5 = com.google.android.apps.search.googleapp.p10165d.C133933a.m217248a(r5)
            com.google.android.apps.search.googleapp.search.k.a.d r9 = r1.mo113806a(r9, r5, r11, r10)
            boolean r10 = r0.f374553H
            if (r10 == 0) goto L_0x0060
            com.google.android.libraries.web.coordinator.c r10 = r0.f374549D
            java.lang.Object r10 = r10.mo5768a()
            com.google.android.apps.search.googleapp.search.j.j r10 = (com.google.android.apps.search.googleapp.search.p10418j.C137536j) r10
            boolean r10 = r10.mo113803b()
            goto L_0x0070
        L_0x0060:
            j$.util.Optional r10 = r0.f374559N
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r2)
            java.lang.Object r10 = r10.orElse(r1)
            java.lang.Boolean r10 = (java.lang.Boolean) r10
            boolean r10 = r10.booleanValue()
        L_0x0070:
            r1 = 2
            if (r10 == 0) goto L_0x00b3
            int r10 = r9.f374088b
            int r10 = com.google.android.apps.search.googleapp.search.p10420k.p10421a.C137540b.m223424a(r10)
            if (r10 != 0) goto L_0x007c
            goto L_0x007f
        L_0x007c:
            if (r10 != r4) goto L_0x007f
            goto L_0x00b3
        L_0x007f:
            com.google.android.apps.search.googleapp.search.e.g r10 = r9.f374092f
            if (r10 != 0) goto L_0x0085
            com.google.android.apps.search.googleapp.search.e.g r10 = com.google.android.apps.search.googleapp.search.p10409e.C137418g.f373767r
        L_0x0085:
            java.lang.String r10 = r10.f373770b
            android.net.Uri r10 = com.google.android.libraries.search.p3096r.C39905a.m69320a(r10)
            if (r10 == 0) goto L_0x00b3
            com.google.android.apps.search.googleapp.search.h.d r4 = r0.f374593l
            r4.mo113762c(r9, r3)
            com.google.android.apps.search.googleapp.search.h.b r4 = r0.f374591j
            r4.mo113755f(r9, r3)
            com.google.android.apps.search.googleapp.search.srp.external.h r4 = r0.f374589h
            com.google.android.apps.search.googleapp.urlhandler.q r5 = com.google.android.apps.search.googleapp.urlhandler.C139851q.SUGGEST
            r4.mo113990a(r10, r5, r3, r2)
            com.google.android.apps.search.googleapp.search.h.d r10 = r0.f374593l
            com.google.common.o.to r2 = com.google.common.p4552o.C60537to.NEW_EXTERNAL_ACTIVITY_SENTINEL
            r10.mo113765f(r9, r2)
            com.google.android.apps.search.googleapp.search.h.b r10 = r0.f374591j
            j.a.c.c.m r2 = p5535j.p5536a.p5545c.p5548c.C71159m.f189831i
            com.google.protobuf.bn r2 = r2.createBuilder()
            j.a.c.c.g r2 = (p5535j.p5536a.p5545c.p5548c.C71153g) r2
            r10.mo113758i(r9, r1, r2)
            goto L_0x0113
        L_0x00b3:
            com.google.android.apps.search.googleapp.search.srp.d.a r10 = r0.f374595n
            com.google.android.apps.search.googleapp.search.e.g r4 = r9.f374092f
            if (r4 != 0) goto L_0x00bb
            com.google.android.apps.search.googleapp.search.e.g r4 = com.google.android.apps.search.googleapp.search.p10409e.C137418g.f373767r
        L_0x00bb:
            java.lang.String r4 = r4.f373770b
            java.lang.String r5 = "query"
            p5462h.p5473f.p5475b.C69664n.m101061g(r4, r5)
            android.content.Context r5 = r10.f374708a
            android.content.res.Resources r5 = r5.getResources()
            r6 = 2130903098(0x7f03003a, float:1.7413004E38)
            java.lang.String[] r5 = r5.getStringArray(r6)
            java.lang.String r6 = "context.resources.getStr…e_app_trigger_array\n    )"
            p5462h.p5473f.p5475b.C69664n.m101060f(r5, r6)
            java.lang.Object[] r5 = (java.lang.Object[]) r5
            int r6 = r5.length
        L_0x00d7:
            if (r3 >= r6) goto L_0x0110
            r7 = r5[r3]
            java.lang.String r7 = (java.lang.String) r7
            boolean r7 = p5462h.p5483m.C69764m.m101228g(r7, r4, r2)
            if (r7 == 0) goto L_0x010d
            android.content.Intent r9 = new android.content.Intent
            r9.<init>()
            java.lang.String r2 = "com.google.android.gms"
            android.content.Intent r9 = r9.setPackage(r2)
            java.lang.String r2 = "com.google.android.gms.settings.SMART_DEVICE_DISCOVERY"
            android.content.Intent r9 = r9.setAction(r2)
            java.lang.String r2 = "android.intent.extra.REFERRER_NAME"
            java.lang.String r3 = "android-app://com.google.android.googlequicksearchbox/https/www.google.com"
            android.content.Intent r9 = r9.putExtra(r2, r3)
            r2 = 268435456(0x10000000, float:2.5243549E-29)
            android.content.Intent r9 = r9.setFlags(r2)
            java.lang.String r2 = "Intent()\n      .setPacka…s(FLAG_ACTIVITY_NEW_TASK)"
            p5462h.p5473f.p5475b.C69664n.m101060f(r9, r2)
            android.content.Context r10 = r10.f374708a
            r10.startActivity(r9)
            goto L_0x0113
        L_0x010d:
            int r3 = r3 + 1
            goto L_0x00d7
        L_0x0110:
            r0.mo113921k(r9)
        L_0x0113:
            boolean r9 = r0.mo113923m()
            if (r9 == 0) goto L_0x012c
            r8.mo113825z(r1)
            if (r11 != r1) goto L_0x012c
            android.app.Activity r9 = r8.f374134c
            int r10 = com.google.android.libraries.logging.p2185ve.C28485y.f77298f
            r10 = 16908290(0x1020002, float:2.3877235E-38)
            android.view.View r9 = r9.findViewById(r10)
            com.google.android.libraries.logging.p2185ve.C28306ab.m52931g(r9)
        L_0x012c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.search.googleapp.search.C137553n.mo113809A(com.google.android.apps.search.googleapp.search.e.g, java.util.Map, int):void");
    }

    /* renamed from: B */
    public final void mo113810B(String str, Map map, int i) {
        Duration ofMillis = Duration.ofMillis(this.f374121M.mo26871c());
        mo113817r();
        C137699ab l = mo113811l();
        l.getClass();
        C137416e eVar = (C137416e) C137418g.f373767r.createBuilder();
        eVar.copyOnWrite();
        C137418g gVar = (C137418g) eVar.instance;
        str.getClass();
        gVar.f373769a |= 1;
        gVar.f373770b = str;
        C137418g gVar2 = l.mo17754z().mo113913a().f374092f;
        if (gVar2 == null) {
            gVar2 = C137418g.f373767r;
        }
        String str2 = gVar2.f373771c;
        eVar.copyOnWrite();
        C137418g gVar3 = (C137418g) eVar.instance;
        str2.getClass();
        gVar3.f373769a |= 2;
        gVar3.f373771c = str2;
        long millis = ofMillis.toMillis();
        eVar.copyOnWrite();
        C137418g gVar4 = (C137418g) eVar.instance;
        gVar4.f373769a |= 4;
        gVar4.f373772d = millis;
        mo113809A((C137418g) eVar.build(), map, i);
    }

    /* renamed from: F */
    public final void mo111140F(boolean z) {
        C137699ab l = mo113811l();
        if (l != null) {
            C137711an a = l.mo17754z();
            if (z && C137830c.m224075c(a.f374557L)) {
                C137830c.m224074b(a.f374557L);
                a.f374584c.mo113908a();
            }
        }
    }

    /* renamed from: a */
    public final void mo111136a(AssistContent assistContent) {
        C137699ab l = mo113811l();
        if (l != null) {
            String str = l.mo17754z().f374551F.mo46468a().f113329b;
            if (!str.isEmpty()) {
                assistContent.setWebUri(Uri.parse(str));
            }
        }
    }

    /* renamed from: b */
    public final void mo111219b(C139779t tVar) {
        this.f374146o.mo114521d(4);
        if (tVar != C139779t.SEARCH) {
            mo113816q();
        } else if (!mo113822w()) {
            mo113825z(3);
            Activity activity = this.f374134c;
            int i = C28485y.f77298f;
            C28306ab.m52931g(activity.findViewById(16908290));
            C138546aa m = mo113812m();
            m.getClass();
            C138558am a = m.mo17754z();
            a.mo114331i(C139704d.SEARCH_RESULTS, true);
            C137699ab l = mo113811l();
            if (l != null) {
                C137711an a2 = l.mo17754z();
                C137418g gVar = l.mo17754z().mo113913a().f374092f;
                if (gVar == null) {
                    gVar = C137418g.f373767r;
                }
                a.f376854A.mo114317f(gVar.f373771c);
                C8575bc e = a2.mo113916e();
                if (e != null) {
                    a.f376854A.mo114318g(e);
                }
                a.mo114332j(gVar.f373770b, false);
                return;
            }
            a.mo114332j(BuildConfig.FLAVOR, false);
        }
    }

    /* renamed from: c */
    public final void mo111220c(C139775p pVar) {
        C137418g gVar;
        this.f374156y = true;
        if (pVar.f379890a == 1) {
            gVar = (C137418g) pVar.f379891b;
        } else {
            gVar = C137418g.f373767r;
        }
        if (this.f374128T.mo110979b()) {
            if ((gVar.f373769a & 256) != 0) {
                this.f374120L.set(gVar.f373778j);
            } else {
                this.f374120L.set(C133116a.m216079a());
                C133118a aVar = this.f374127S;
                aVar.mo110983c();
                aVar.f362914b.mo19974a(C37182a.f97775aG);
                aVar.f362915c = true;
            }
        }
        mo113819t(gVar);
    }

    /* renamed from: e */
    public final void mo111222e() {
        C58838bb.m90883r(mo111226i());
        while (true) {
            int i = this.f374116H;
            if (i == 0) {
                throw null;
            } else if (i == 2) {
                return;
            } else {
                if (!this.f374130V || i != 3) {
                    C58838bb.m90883r(m223434D());
                } else {
                    return;
                }
            }
        }
    }

    /* renamed from: f */
    public final /* synthetic */ boolean mo111223f() {
        return false;
    }

    /* renamed from: g */
    public final boolean mo111224g() {
        C137699ab l;
        C138546aa m;
        boolean z = !this.f374113E.isEmpty() && "SUGGESTIONS".equals(this.f374113E.peek());
        this.f374146o.mo114521d(2);
        if (mo113822w() && (m = mo113812m()) != null) {
            C138558am a = m.mo17754z();
            if (a.f376854A.mo114313b() != C139704d.WIDGET) {
                apd b = a.f376868i.mo114113b(a.f376854A.mo114315d(), aod.ABANDONMENT);
                C138057n nVar = a.f376873n;
                nVar.f375633d = false;
                nVar.f375630a.mo114103a(b, Duration.ofNanos(nVar.f375631b.mo26872d()), "AGA");
                a.f376864e.mo114047c(a.f376868i.mo114115d(Optional.empty()), aod.ABANDONMENT);
            }
        }
        if (this.f374116H == 2 && (l = mo113811l()) != null) {
            this.f374123O.mo41592d(new C58759qy(C39190a.SRP_TO_SUGGEST_LE));
            C137418g gVar = l.mo17754z().mo113913a().f374092f;
            if (gVar == null) {
                gVar = C137418g.f373767r;
            }
            String str = gVar.f373770b;
            if (l.mo17754z().mo111224g()) {
                if (this.f374132X != 3 || !z) {
                    return true;
                }
                m223433C(str);
                return m223434D();
            } else if (this.f374132X != 1 && z && this.f374113E.size() == 1) {
                if (true == this.f374131W) {
                    str = BuildConfig.FLAVOR;
                }
                m223433C(str);
                C43264o oVar = (C43264o) this.f374138g.getChildFragmentManager().f634a.mo671c("SEARCH_RESULTS");
                if (oVar != null) {
                    C0154a aVar = new C0154a(this.f374138g.getChildFragmentManager());
                    aVar.mo516m(oVar);
                    aVar.mo509f();
                }
            }
        }
        return m223434D();
    }

    /* renamed from: h */
    public final boolean mo111225h() {
        C138546aa m;
        if (!mo113822w() || (m = mo113812m()) == null) {
            return false;
        }
        C139704d b = m.mo17754z().f376854A.mo114313b();
        if (b == C139704d.WIDGET || C139705e.m227143a(b)) {
            return true;
        }
        return false;
    }

    /* renamed from: i */
    public final boolean mo111226i() {
        C137699ab l = mo113811l();
        return (l != null && l.mo17754z().mo113923m()) || (mo113812m() != null && this.f374130V);
    }

    /* renamed from: j */
    public final boolean mo111227j() {
        return this.f374116H == 2;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: l */
    public final C137699ab mo113811l() {
        SearchFragment searchFragment = this.f374138g;
        searchFragment.getClass();
        if (!searchFragment.isAdded()) {
            ((C58970a) ((C58970a) f374108a.mo56226d()).mo56372aa(40967)).mo56386p("search fragment is not attached to the activity yet!");
            return null;
        }
        C43264o oVar = (C43264o) searchFragment.getChildFragmentManager().f634a.mo671c("SEARCH_RESULTS");
        if (oVar == null) {
            return null;
        }
        return (C137699ab) oVar.mo17754z().mo46379a();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: n */
    public final C138711ao mo113813n() {
        SearchFragment searchFragment = this.f374138g;
        searchFragment.getClass();
        FragmentManager childFragmentManager = searchFragment.getChildFragmentManager();
        if (!this.f374152u) {
            return (C138711ao) childFragmentManager.f634a.mo671c("VOICE");
        }
        C43264o oVar = (C43264o) childFragmentManager.f634a.mo671c("VOICE");
        if (oVar == null) {
            return null;
        }
        return (C138711ao) oVar.mo17754z().mo46379a();
    }

    /* renamed from: o */
    public final C47392e mo113814o(String str, String str2, C139704d dVar) {
        C137699ab l;
        C8575bc e;
        if (dVar == C139704d.VOICE_SEARCH) {
            this.f374146o.mo114521d(8);
        } else {
            this.f374146o.mo114521d(4);
        }
        mo113825z(3);
        Activity activity = this.f374134c;
        int i = C28485y.f77298f;
        C28306ab.m52931g(activity.findViewById(16908290));
        C138546aa m = mo113812m();
        m.getClass();
        C138558am a = m.mo17754z();
        a.f376854A.mo114317f(str2);
        a.mo114331i(dVar, true);
        if (!(dVar != C139704d.SEARCH_RESULTS || (l = mo113811l()) == null || (e = l.mo17754z().mo113916e()) == null)) {
            a.f376854A.mo114318g(e);
        }
        a.mo114332j(str, false);
        return C47392e.f123115a;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: p */
    public final void mo113815p() {
        if (!m223434D()) {
            Activity activity = this.f374134c;
            if (activity instanceof GoogleAppActivity) {
                ((GoogleAppActivity) activity).mo17754z().mo111122k(true);
            }
        }
    }

    /* renamed from: q */
    public final void mo113816q() {
        this.f374156y = false;
        C138546aa m = mo113812m();
        if (m != null) {
            m.mo17754z().mo114326d().mo114407i();
        }
        if (mo113823x()) {
            mo113825z(3);
        }
    }

    /* renamed from: r */
    public final void mo113817r() {
        if (mo113811l() == null) {
            C47558bi a = C47831fm.m85006a("SearchFragmentPeer#attachSearchResultsFragment");
            try {
                C43264o a2 = C43265p.m76349a(this.f374118J, this.f374129U);
                C0154a aVar = new C0154a(this.f374138g.getChildFragmentManager());
                aVar.mo511h(R.id.googleapp_search_top_level_destination_container, a2, "SEARCH_RESULTS", 1);
                aVar.mo515l(a2);
                aVar.mo509f();
                a2.mo17754z().mo46380b(C137711an.m223821c(this.f374118J));
                if (!(this.f374157z == null || this.f374109A == null || this.f374110B == null)) {
                    C137711an a3 = ((C137699ab) a2.mo17754z().mo46379a()).mo17754z();
                    String str = this.f374157z;
                    str.getClass();
                    C138127i iVar = this.f374110B;
                    iVar.getClass();
                    Map unmodifiableMap = Collections.unmodifiableMap(iVar.f375807a);
                    C137770au auVar = this.f374109A;
                    auVar.getClass();
                    a3.mo113924n(str, unmodifiableMap, auVar);
                    this.f374157z = null;
                    this.f374110B = null;
                    this.f374109A = null;
                }
                a.close();
                return;
            } catch (Throwable th) {
                C137422f.m223281a(th, th);
            }
        } else {
            return;
        }
        throw th;
    }

    /* renamed from: s */
    public final void mo113818s() {
        C138546aa m = mo113812m();
        if (m == null) {
            C47558bi a = C47831fm.m85006a("SearchFragmentPeer#attachSuggestionsFragment");
            try {
                C138551af afVar = (C138551af) C138552ag.f376842f.createBuilder();
                C139704d a2 = C139704d.m227141a(this.f374139h.f373758b);
                if (a2 == null) {
                    a2 = C139704d.UNKNOWN;
                }
                afVar.copyOnWrite();
                C138552ag agVar = (C138552ag) afVar.instance;
                agVar.f376845b = a2.f379715p;
                agVar.f376844a |= 1;
                boolean z = this.f374117I.f101930a;
                afVar.copyOnWrite();
                C138552ag agVar2 = (C138552ag) afVar.instance;
                agVar2.f376844a |= 2;
                agVar2.f376846c = z;
                C137411e eVar = this.f374139h;
                if ((eVar.f373757a & 2) != 0) {
                    C136135p pVar = eVar.f373759c;
                    if (pVar == null) {
                        pVar = C136135p.f370764b;
                    }
                    afVar.copyOnWrite();
                    C138552ag agVar3 = (C138552ag) afVar.instance;
                    pVar.getClass();
                    agVar3.f376847d = pVar;
                    agVar3.f376844a |= 4;
                }
                C137411e eVar2 = this.f374139h;
                if ((eVar2.f373757a & 16) != 0) {
                    String str = eVar2.f373762f;
                    afVar.copyOnWrite();
                    C138552ag agVar4 = (C138552ag) afVar.instance;
                    str.getClass();
                    agVar4.f376844a |= 8;
                    agVar4.f376848e = str;
                }
                AccountId accountId = this.f374118J;
                C138546aa aaVar = new C138546aa();
                C68324h.m98669f(aaVar);
                C47247a.m84047b(aaVar, accountId);
                C47243l.m84039a(aaVar, (C138552ag) afVar.build());
                C0154a aVar = new C0154a(this.f374138g.getChildFragmentManager());
                aVar.mo511h(R.id.googleapp_search_top_level_destination_container, aaVar, "SUGGESTIONS", 1);
                aVar.mo515l(aaVar);
                aVar.mo509f();
                a.close();
                m = aaVar;
            } catch (Throwable th) {
                C137422f.m223281a(th, th);
            }
        }
        m.mo17754z().f376859F = new C137451g(this);
        return;
        throw th;
    }

    /* renamed from: t */
    public final void mo113819t(C137418g gVar) {
        C137421j jVar;
        if (this.f374153v) {
            if ((gVar.f373769a & 32768) != 0) {
                jVar = gVar.f373785q;
                if (jVar == null) {
                    jVar = C137421j.f373789c;
                }
            } else {
                jVar = null;
            }
            this.f374114F = jVar;
        }
        int a = C137413b.m223275a(gVar.f373779k);
        if (a == 0 || a != 7 || this.f374119K.mo113708a(gVar.f373783o) == null) {
            int i = gVar.f373769a;
            if (((i & 1) == 0 && ((i & 16) == 0 || !this.f374125Q.mo114007a(Uri.parse(gVar.f373775g)))) || !gVar.f373777i) {
                int i2 = 1;
                if (gVar.f373776h) {
                    int a2 = C137413b.m223275a(gVar.f373779k);
                    if (a2 != 0) {
                        i2 = a2;
                    }
                    int i3 = i2 - 1;
                    if (i3 == 2) {
                        this.f374135d.mo83702b(C89849ae.QSB_MIC_TAP);
                        if ((gVar.f373769a & 4096) != 0) {
                            C139708c cVar = this.f374148q;
                            Duration ofMillis = Duration.ofMillis(gVar.f373782n);
                            C69664n.m101061g(ofMillis, "elapsedTime");
                            cVar.f379734a.set(Optional.m71637of(C37182a.f97863bp));
                            cVar.mo115176c(C37182a.f97863bp.mo40811d(ofMillis.toNanos()));
                        }
                    } else if (i3 == 3) {
                        this.f374135d.mo83702b(C89849ae.VOICE_SEARCH_ICON_SHORTCUT_TAP);
                        if ((gVar.f373769a & 4096) != 0) {
                            C139708c cVar2 = this.f374148q;
                            Duration ofMillis2 = Duration.ofMillis(gVar.f373782n);
                            C69664n.m101061g(ofMillis2, "elapsedTime");
                            cVar2.f379734a.set(Optional.m71637of(C37182a.f97934dG));
                            cVar2.mo115176c(C37182a.f97934dG.mo40811d(ofMillis2.toNanos()));
                        }
                    } else if (i3 == 4) {
                        this.f374135d.mo83702b(C89849ae.QEA_VOICE_ENTRY);
                        if ((gVar.f373769a & 4096) != 0) {
                            C139708c cVar3 = this.f374148q;
                            Duration ofMillis3 = Duration.ofMillis(gVar.f373782n);
                            C69664n.m101061g(ofMillis3, "elapsedTime");
                            cVar3.f379734a.set(Optional.m71637of(C37182a.f97865br));
                            cVar3.mo115176c(C37182a.f97865br.mo40811d(ofMillis3.toNanos()));
                        }
                    } else if (i3 == 5) {
                        this.f374135d.mo83702b(C89849ae.MINUS_ONE_SEARCH_BOX_MIC_TAP);
                        if ((gVar.f373769a & 4096) != 0) {
                            C139708c cVar4 = this.f374148q;
                            Duration ofMillis4 = Duration.ofMillis(gVar.f373782n);
                            C69664n.m101061g(ofMillis4, "elapsedTime");
                            cVar4.f379734a.set(Optional.m71637of(C37182a.f97935dH));
                            cVar4.mo115176c(C37182a.f97935dH.mo40811d(ofMillis4.toNanos()));
                        }
                    } else if (i3 == 7) {
                        this.f374135d.mo83702b(C89849ae.VOICE_SEARCH_ICON_TAP);
                        if ((gVar.f373769a & 4096) != 0) {
                            C139708c cVar5 = this.f374148q;
                            Duration ofMillis5 = Duration.ofMillis(gVar.f373782n);
                            C69664n.m101061g(ofMillis5, "elapsedTime");
                            cVar5.f379734a.set(Optional.m71637of(C37182a.f97939dL));
                            cVar5.mo115176c(C37182a.f97939dL.mo40811d(ofMillis5.toNanos()));
                        }
                    }
                    mo113821v(gVar);
                    return;
                }
                mo113825z(3);
                if (!gVar.f373770b.isEmpty()) {
                    C138546aa m = mo113812m();
                    m.getClass();
                    m.mo17754z().mo114332j(gVar.f373770b, false);
                } else if ((this.f374139h.f373757a & 16) != 0) {
                    C138546aa m2 = mo113812m();
                    m2.getClass();
                    m2.mo17754z().mo114332j(this.f374139h.f373762f, true);
                } else {
                    C138546aa m3 = mo113812m();
                    m3.getClass();
                    m3.mo17754z().mo114332j(BuildConfig.FLAVOR, false);
                }
            } else {
                mo113817r();
                mo113809A(gVar, C58729pv.f156485a, 7);
            }
        } else {
            mo113809A(gVar, C58729pv.f156485a, 11);
        }
    }

    /* renamed from: u */
    public final void mo113820u() {
        C138711ao n = mo113813n();
        if (n != null && !mo113823x()) {
            C138713aq j = n.mo17754z();
            if (j.f377283e) {
                C138705aj a = j.mo114495b().mo17754z();
                View view = a.f377245j.getView();
                if (view != null) {
                    a.mo114481f();
                    ((LogoView) view.findViewById(R.id.googleapp_logo_view)).mo114549f(2);
                    ((TextView) view.findViewById(R.id.googleapp_sbt_error_text)).setVisibility(8);
                    a.mo114479d();
                }
            } else {
                C138859r a2 = j.mo114494a().mo17754z();
                View view2 = a2.f377709k.getView();
                if (view2 != null) {
                    a2.mo114607f();
                    ((LogoView) view2.findViewById(R.id.googleapp_logo_view)).mo114549f(2);
                    ((TextView) view2.findViewById(R.id.googleapp_voice_results_text)).setText(R.string.listening_text);
                    a2.f377693B = false;
                }
            }
        }
        mo113825z(4);
    }

    /* renamed from: v */
    public final void mo113821v(C137418g gVar) {
        C58838bb.m90883r(this.f374141j.mo112951a());
        if (this.f374122N.checkSelfPermission("android.permission.RECORD_AUDIO") == 0) {
            C138772i iVar = this.f374147p;
            int a = C137413b.m223275a(gVar.f373779k);
            if (a == 0) {
                a = 1;
            }
            iVar.mo114524c();
            iVar.f377462f = a;
            if (gVar.f373784p) {
                C138767d dVar = this.f374146o;
                C138784u a2 = dVar.f377449b.mo114528a(false);
                dVar.f377448a.f377459c = a2;
                a2.mo20121a();
            } else {
                this.f374146o.mo114519b(false);
            }
            mo113820u();
            C138711ao n = mo113813n();
            n.getClass();
            C138713aq j = n.mo17754z();
            if (!j.f377283e) {
                C138859r a3 = j.mo114494a().mo17754z();
                if (a3.f377723y) {
                    a3.f377710l.mo50788b(a3.f377700b.mo104001d(), "voice_language_settings_key");
                }
                View view = a3.f377709k.getView();
                view.getClass();
                ((TextView) view.findViewById(R.id.googleapp_voice_results_text)).setMaxLines(2);
            }
            this.f374135d.mo83702b(C89849ae.TNG_VOICE_SEARCH_UI_SHOWN);
            C139708c cVar = this.f374148q;
            C37258g gVar2 = C37182a.f97866bs;
            C69664n.m101060f(gVar2, "GOOGLEAPP_VOICE_SEARCH_UI_SHOWN");
            cVar.mo115177d(gVar2);
            return;
        }
        C0816c cVar2 = this.f374111C;
        cVar2.getClass();
        cVar2.mo526b("android.permission.RECORD_AUDIO");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: w */
    public final boolean mo113822w() {
        return this.f374116H == 3;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: x */
    public final boolean mo113823x() {
        return this.f374116H == 4;
    }

    /* renamed from: y */
    public final boolean mo113824y(String str, C138127i iVar, C137770au auVar) {
        C137699ab l = mo113811l();
        if (l != null) {
            boolean n = l.mo17754z().mo113924n(str, Collections.unmodifiableMap(iVar.f375807a), auVar);
            this.f374157z = null;
            this.f374110B = null;
            this.f374109A = null;
            return n;
        }
        boolean c = this.f374126R.mo113781c(C137484ad.m223375c(str, BuildConfig.FLAVOR));
        this.f374157z = str;
        this.f374110B = iVar;
        this.f374109A = auVar;
        return c;
    }

    /* renamed from: z */
    public final void mo113825z(int i) {
        int i2 = this.f374116H;
        m223435E(i);
        if (i2 == 0) {
            throw null;
        } else if (i2 != i && i2 != 1 && i2 != 4) {
            if (this.f374132X == 3 && i == 3) {
                Deque<String> deque = this.f374113E;
                ArrayDeque arrayDeque = new ArrayDeque();
                for (String str : deque) {
                    if (!"SUGGESTIONS".equals(str) && !str.equals(arrayDeque.peekLast())) {
                        arrayDeque.addLast(str);
                    }
                }
                this.f374113E = arrayDeque;
                i = 3;
            }
            if (this.f374113E.isEmpty() || !C137393ac.m223235a(i2).equals(this.f374113E.peek())) {
                this.f374113E.push(C137393ac.m223235a(i2));
            }
            boolean z = false;
            if ("SUGGESTIONS".equals(this.f374113E.peek()) && i == 2) {
                z = true;
            }
            int i3 = this.f374132X;
            if (i3 != 3 && z) {
                if (i3 == 1 || this.f374113E.size() > 1) {
                    this.f374113E.pop();
                }
                while (!this.f374113E.isEmpty() && C137393ac.m223235a(i).equals(this.f374113E.peek())) {
                    this.f374113E.pop();
                }
            }
        }
    }

    /* renamed from: d */
    public final void mo111221d() {
        this.f374156y = true;
        if (!mo113823x()) {
            int i = this.f374116H;
            if (i == 0) {
                throw null;
            } else if (i != 2) {
                mo113825z(3);
            }
        }
        if (mo113822w() && !mo113823x()) {
            C138546aa m = mo113812m();
            m.getClass();
            m.mo17754z().mo114326d().mo114406h();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: m */
    public final C138546aa mo113812m() {
        SearchFragment searchFragment = this.f374138g;
        searchFragment.getClass();
        return (C138546aa) searchFragment.getChildFragmentManager().f634a.mo671c("SUGGESTIONS");
    }
}
