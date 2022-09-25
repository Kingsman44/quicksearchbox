package com.google.android.apps.search.googleapp.launcher.minusone;

import android.os.Build;
import android.support.p031v4.app.C0154a;
import android.support.p031v4.app.Fragment;
import android.view.View;
import android.widget.ImageButton;
import com.google.android.apps.gsa.h.a.b;
import com.google.android.apps.gsa.h.j.a;
import com.google.android.apps.gsa.h.j.c;
import com.google.android.apps.search.googleapp.accounts.p10126ui.C133252d;
import com.google.android.apps.search.googleapp.accounts.p10126ui.C133339g;
import com.google.android.apps.search.googleapp.accounts.p10126ui.p10128b.C133231n;
import com.google.android.apps.search.googleapp.discover.feedback.p10185a.C134268c;
import com.google.android.apps.search.googleapp.discover.feedback.p10185a.C134284d;
import com.google.android.apps.search.googleapp.discover.feedback.p10185a.C134286f;
import com.google.android.apps.search.googleapp.discover.feedback.p10185a.C134296p;
import com.google.android.apps.search.googleapp.discover.feedback.p10185a.C134297q;
import com.google.android.apps.search.googleapp.discover.feedback.p10185a.p10188c.C134270b;
import com.google.android.apps.search.googleapp.discover.streamui.C134714d;
import com.google.android.apps.search.googleapp.discover.streamui.C134720e;
import com.google.android.apps.search.googleapp.discover.streamui.C134744f;
import com.google.android.apps.search.googleapp.launcher.minusone.p10354b.C136593a;
import com.google.android.apps.search.googleapp.launcher.p10341b.p10344c.C136455h;
import com.google.android.apps.search.googleapp.launcher.p10341b.p10347e.C136463a;
import com.google.android.apps.search.googleapp.launcher.p10341b.p10348f.C136467c;
import com.google.android.apps.search.googleapp.launcher.p10341b.p10348f.C136469e;
import com.google.android.apps.search.googleapp.launcher.p10341b.p10348f.C136472h;
import com.google.android.apps.search.googleapp.launcher.p10341b.p10351i.C136532j;
import com.google.android.apps.search.googleapp.p10257g.p10258a.C135408y;
import com.google.android.apps.search.googleapp.promomanager.p10372b.C136969bx;
import com.google.android.apps.search.googleapp.promomanager.p10377f.C137119m;
import com.google.android.apps.search.googleapp.promomanager.p10377f.C137120n;
import com.google.android.apps.search.googleapp.search.p10409e.C137419h;
import com.google.android.apps.search.googleapp.startup.appinteractive.C139680b;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.p1730f.C21370a;
import com.google.android.libraries.social.populous.android.C42181t;
import com.google.apps.tiktok.account.AccountId;
import com.google.apps.tiktok.concurrent.futuresmixin.C46439e;
import com.google.apps.tiktok.concurrent.futuresmixin.C46440f;
import com.google.apps.tiktok.dataservice.C46792di;
import com.google.apps.tiktok.dataservice.C46801dp;
import com.google.apps.tiktok.inject.C47231d;
import com.google.apps.tiktok.lifecycle.flow.C47426f;
import com.google.apps.tiktok.lifecycle.flow.C47429i;
import com.google.common.base.C58890d;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59094n;
import com.google.common.util.concurrent.C60866ct;
import com.google.p337aa.p338a.C6610l;
import com.google.protobuf.C62921ba;
import com.google.protobuf.contrib.android.ProtoParsers;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import p3186j$.time.Instant;
import p3186j$.util.Optional;
import p5462h.p5463a.C69540x;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.googleapp.launcher.minusone.i */
/* compiled from: PG */
public final class C136652i implements C136472h, C134270b {

    /* renamed from: a */
    public static final C59071e f371977a = C59071e.m91331h();

    /* renamed from: A */
    public final View.OnLayoutChangeListener f371978A;

    /* renamed from: B */
    public C136532j f371979B;

    /* renamed from: C */
    private final a f371980C;

    /* renamed from: D */
    private final C21370a f371981D;

    /* renamed from: E */
    private final boolean f371982E;

    /* renamed from: b */
    public final AccountId f371983b;

    /* renamed from: c */
    public final b f371984c;

    /* renamed from: d */
    public final C136463a f371985d;

    /* renamed from: e */
    public final com.google.android.apps.gsa.h.p.a f371986e;

    /* renamed from: f */
    public final C136467c f371987f;

    /* renamed from: g */
    public final C136648e f371988g;

    /* renamed from: h */
    public final C134714d f371989h;

    /* renamed from: i */
    public final Optional f371990i;

    /* renamed from: j */
    public final C139680b f371991j;

    /* renamed from: k */
    public final C46439e f371992k;

    /* renamed from: l */
    public final C135408y f371993l;

    /* renamed from: m */
    public final boolean f371994m;

    /* renamed from: n */
    public final C46801dp f371995n;

    /* renamed from: o */
    public final int f371996o;

    /* renamed from: p */
    public final boolean f371997p;

    /* renamed from: q */
    public final boolean f371998q;

    /* renamed from: r */
    public final C136969bx f371999r;

    /* renamed from: s */
    public final boolean f372000s;

    /* renamed from: t */
    public final C137419h f372001t;

    /* renamed from: u */
    public final boolean f372002u;

    /* renamed from: v */
    public final C137119m f372003v;

    /* renamed from: w */
    public final C136580ao f372004w;

    /* renamed from: x */
    public boolean f372005x;

    /* renamed from: y */
    public final C136654a f372006y;

    /* renamed from: z */
    public final C1366531 f372007z;

    /* renamed from: com.google.android.apps.search.googleapp.launcher.minusone.i$a */
    /* compiled from: PG */
    final class C136654a implements C46440f {

        /* renamed from: a */
        private final a f372009a;

        public C136654a(a aVar) {
            this.f372009a = aVar;
        }

        /* renamed from: a */
        public final /* synthetic */ void mo18066a(Object obj, Throwable th) {
            Void voidR = (Void) obj;
            C59052c cVar = (C59052c) ((C59052c) C136652i.f371977a.mo56225c()).mo56382g(th);
            cVar.mo56379ah(new C59094n(40714));
            cVar.mo56386p("Failed to create an intent");
        }

        /* renamed from: c */
        public final /* bridge */ /* synthetic */ void mo18067c(Object obj, Object obj2) {
            Void voidR = (Void) obj;
            ProtoParsers.ParcelableProto parcelableProto = (ProtoParsers.ParcelableProto) obj2;
            C69664n.m101061g(parcelableProto, "options");
            this.f372009a.mo41490e(parcelableProto.mo58938a(c.d, C62921ba.m95368a()));
        }

        /* renamed from: i */
        public final /* bridge */ /* synthetic */ void mo18068i(Object obj) {
            Void voidR = (Void) obj;
        }
    }

    public C136652i(AccountId accountId, b bVar, C136463a aVar, a aVar2, com.google.android.apps.gsa.h.p.a aVar3, C21370a aVar4, C136467c cVar, C136648e eVar, C134714d dVar, C136581ap apVar, Optional optional, C139680b bVar2, C46439e eVar2, C135408y yVar, boolean z, C46801dp dpVar, int i, boolean z2, boolean z3, C137120n nVar, C136969bx bxVar, boolean z4, boolean z5, C47429i iVar, C137419h hVar, boolean z6) {
        C136580ao aoVar;
        AccountId accountId2 = accountId;
        a aVar5 = aVar2;
        C21370a aVar6 = aVar4;
        C136467c cVar2 = cVar;
        C136581ap apVar2 = apVar;
        Optional optional2 = optional;
        C139680b bVar3 = bVar2;
        C46439e eVar3 = eVar2;
        C135408y yVar2 = yVar;
        boolean z7 = z;
        C46801dp dpVar2 = dpVar;
        C136969bx bxVar2 = bxVar;
        boolean z8 = z5;
        C69664n.m101061g(accountId2, "accountId");
        C69664n.m101061g(aVar6, "clock");
        C69664n.m101061g(optional2, "devBadgeViewCreatorOptional");
        C69664n.m101061g(bVar3, "criticalStartupUiInteractivePublisher");
        C69664n.m101061g(eVar3, "futuresMixin");
        C69664n.m101061g(yVar2, "doodleStatusDataService");
        C69664n.m101061g(dpVar2, "subscriptionMixin");
        C69664n.m101061g(bxVar2, "promoManagerDataService");
        this.f371983b = accountId2;
        this.f371984c = bVar;
        this.f371985d = aVar;
        this.f371980C = aVar5;
        this.f371986e = aVar3;
        this.f371981D = aVar6;
        this.f371987f = cVar2;
        this.f371988g = eVar;
        this.f371989h = dVar;
        this.f371990i = optional2;
        this.f371991j = bVar3;
        this.f371992k = eVar3;
        this.f371993l = yVar2;
        this.f371994m = z7;
        this.f371995n = dpVar2;
        this.f371996o = i;
        this.f371997p = z2;
        this.f371998q = z3;
        this.f371999r = bxVar2;
        this.f371982E = z4;
        this.f372000s = z8;
        this.f372001t = hVar;
        this.f372002u = z6;
        this.f372003v = nVar.mo113538a(R.id.googleapp_minus_one_promotion_container);
        boolean z9 = cVar2.f371549c;
        C136455h hVar2 = cVar2.f371550d;
        hVar2 = hVar2 == null ? C136455h.f371506d : hVar2;
        if (C136593a.f371846a.contains(Long.valueOf(apVar2.f371821b.f371848b))) {
            long j = apVar2.f371821b.f371848b;
            aoVar = (j == 1 || j == 2) ? new C136610bq(apVar2.f371820a, z7, apVar2.f371822c) : j == 3 ? new C136636cn(apVar2.f371820a, hVar2, z7, apVar2.f371822c) : new C136607bn(apVar2.f371820a, z7, apVar2.f371822c);
        } else {
            aoVar = C136581ap.m221977a() ? ((Build.VERSION.SDK_INT < 31 || (!C58890d.m90990e("GOOGLE", Build.MANUFACTURER) && !C58890d.m90990e("GOOGLE", Build.BRAND))) && (!C136581ap.m221977a() || !C136593a.m221995a())) ? (hVar2.f371508a & 1) != 0 ? new C136636cn(apVar2.f371820a, hVar2, z7, apVar2.f371822c) : new C136607bn(apVar2.f371820a, z7, apVar2.f371822c) : new C136610bq(apVar2.f371820a, z7, apVar2.f371822c) : (hVar2.f371508a & 1) != 0 ? new C136635cm(apVar2.f371820a, hVar2) : z9 ? new C136620bz(apVar2.f371820a) : new C136606bm(apVar2.f371820a);
        }
        this.f372004w = aoVar;
        this.f372006y = new C136654a(aVar5);
        this.f372007z = new C46792di() {
            /* renamed from: a */
            public final void mo18077a(Throwable th) {
                C69664n.m101061g(th, C42181t.f110467a);
            }

            /* renamed from: b */
            public final /* bridge */ /* synthetic */ void mo18078b(Object obj) {
                C6610l lVar = (C6610l) obj;
                C69664n.m101061g(lVar, "doodleDataImage");
                C136652i.this.mo113308g(lVar);
            }

            /* renamed from: c */
            public final /* synthetic */ void mo18079c() {
            }
        };
        this.f371978A = new C136656k(this);
        if (z8) {
            C47426f.m84293a(iVar.mo51262a(yVar2.f368919c), new C136650g(this));
        }
    }

    /* renamed from: q */
    private final C133252d m222187q() {
        return (C133252d) mo113306b().getChildFragmentManager().f634a.mo671c("GoogleApp_AccountDiscFragment");
    }

    /* renamed from: a */
    public final C134286f mo111669a() {
        C134284d dVar = new C134284d();
        List list = dVar.f365788a;
        C134296p pVar = C134296p.NOT_SENSITIVE_OR_PII;
        C69664n.m101061g(pVar, "sensitivity");
        ArrayList arrayList = new ArrayList();
        C136469e a = C136469e.m221780a(this.f371987f.f371548b);
        if (a == null) {
            a = C136469e.TNG_MINUS_ONE;
        }
        C69664n.m101060f(a, "minusOneFragmentArgs.minusOneType");
        C134297q.m217879c("MinusOneType", a, pVar, arrayList);
        C134297q.m217881e("SearchBoxEnabled", this.f371987f.f371549c, pVar, arrayList);
        C69540x.m100811r(list, arrayList);
        return C134268c.m217846a("GoogleAppMinusOneFragmentPeer", dVar);
    }

    /* renamed from: b */
    public final Fragment mo113306b() {
        Fragment b = this.f371988g.getChildFragmentManager().f634a.mo670b(R.id.googleapp_header_container);
        C69664n.m101058d(b);
        return b;
    }

    /* renamed from: c */
    public final C134744f mo113307c() {
        Fragment b = this.f371988g.getChildFragmentManager().f634a.mo670b(R.id.googleapp_minus_one_discover);
        C69664n.m101058d(b);
        Object z = ((C47231d) b).mo17754z();
        C69664n.m101060f(z, "fragment.childFragmentMa…entPeer>)\n        .peer()");
        return (C134744f) z;
    }

    /* renamed from: d */
    public final Optional mo113066d() {
        Optional map = Optional.ofNullable(mo113307c()).map(new C136655j(Instant.ofEpochMilli(this.f371981D.mo26870b())));
        C69664n.m101060f(map, "val currentTime = Instan…nTime, currentTime)\n    }");
        return map;
    }

    /* renamed from: e */
    public final void mo113067e(PrintWriter printWriter, String str) {
        C69664n.m101061g(printWriter, "writer");
        C136467c cVar = this.f371987f;
        boolean z = false;
        if ((cVar.f371547a & 4) != 0) {
            C136455h hVar = cVar.f371550d;
            if (hVar == null) {
                hVar = C136455h.f371506d;
            }
            if ((hVar.f371508a & 1) != 0) {
                z = true;
            }
        }
        printWriter.println("         isSharedMinusoneEnabled: " + z);
        boolean z2 = this.f371987f.f371549c;
        printWriter.println("         isSearchBoxEnabled: " + z2);
        boolean z3 = this.f371987f.f371551e;
        printWriter.println("         isDoodleEnabled: " + z3);
        this.f372004w.mo113243c(printWriter, "         ", mo113306b());
    }

    /* renamed from: f */
    public final void mo113068f(boolean z) {
        C134744f c = mo113307c();
        if (c != null) {
            c.mo111952f(z);
        }
    }

    /* renamed from: g */
    public final void mo113308g(C6610l lVar) {
        View view = this.f371988g.getView();
        if (view != null) {
            this.f372004w.mo113245e(view, lVar);
        }
    }

    /* renamed from: h */
    public final void mo113069h() {
        if (this.f372005x) {
            this.f372005x = false;
            C134744f c = mo113307c();
            if (c != null) {
                c.mo111954h();
            }
            if (this.f371997p) {
                this.f372003v.mo113537d();
            }
        }
    }

    /* renamed from: i */
    public final void mo113070i() {
        if (!this.f372005x) {
            this.f372005x = true;
            C134744f c = mo113307c();
            if (c != null) {
                c.mo111953g(true);
                c.mo111955i();
            }
            if (this.f371997p) {
                this.f371999r.mo113461r();
            }
        }
    }

    /* renamed from: j */
    public final void mo113071j() {
        C133252d q;
        if (this.f371982E && (q = m222187q()) != null) {
            C133339g b = q.mo17754z();
            if (b.f363339q) {
                b.f363344v.f363162c = false;
                b.f363345w.mo50787a(C60866ct.f164955a, C133231n.f363124e);
                Fragment c = b.f363324b.getChildFragmentManager().f634a.mo671c("RestrictedAccountLogoutDialogFragment");
                if (c != null) {
                    C0154a aVar = new C0154a(b.f363324b.getChildFragmentManager());
                    aVar.mo516m(c);
                    aVar.mo509f();
                }
            }
        }
    }

    /* renamed from: k */
    public final void mo113072k() {
        C133252d q;
        if (this.f371982E && (q = m222187q()) != null) {
            C133339g b = q.mo17754z();
            if (b.f363339q) {
                b.f363344v.f363162c = true;
                b.f363345w.mo50787a(C60866ct.f164955a, C133231n.f363124e);
            }
        }
    }

    /* renamed from: l */
    public final void mo113073l(float f) {
        mo113307c().mo111953g(false);
        this.f372004w.mo113246f(f, mo113306b());
        if (f == 0.0f) {
            mo113307c().mo111956j(C134720e.MINUS_ONE_OVERLAY_CLOSED);
        }
    }

    /* renamed from: m */
    public final void mo113078m(C136455h hVar) {
        C69664n.m101061g(hVar, "sharedMinusOneArgs");
        Fragment b = mo113306b();
        if (b instanceof C136624cb) {
            C136626cd a = ((C136624cb) b).mo17754z();
            C136626cd.m222091a((ImageButton) a.f371917c.requireView().findViewById(R.id.googleapp_oem_partner_button), a.f371917c, hVar);
            a.f371921g = hVar;
        } else if (b instanceof C136630ch) {
            C136632cj a2 = ((C136630ch) b).mo17754z();
            a2.f371933g = hVar;
            C136632cj.m222102c((ImageButton) a2.f371930d.requireView().findViewById(R.id.googleapp_oem_partner_button), a2.f371930d, hVar);
        }
    }

    /* renamed from: n */
    public final boolean mo113074n() {
        return this.f372005x;
    }

    /* renamed from: o */
    public final boolean mo113075o() {
        C134744f c = mo113307c();
        if (c != null) {
            return c.mo111960n();
        }
        return false;
    }

    /* renamed from: p */
    public final void mo113076p(C136532j jVar) {
        this.f371979B = jVar;
    }
}
