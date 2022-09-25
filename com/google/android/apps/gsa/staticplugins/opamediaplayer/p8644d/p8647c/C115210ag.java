package com.google.android.apps.gsa.staticplugins.opamediaplayer.p8644d.p8647c;

import android.app.NotificationChannel;
import android.content.Context;
import androidx.core.app.C1793aj;
import androidx.core.app.C1794ak;
import androidx.core.app.C1800aq;
import com.evernote.android.state.BuildConfig;
import com.google.android.apps.gsa.p6486s.C84275o;
import com.google.android.apps.gsa.search.core.p6519al.p6694dd.C85349r;
import com.google.android.apps.gsa.search.core.p6519al.p6694dd.C85350s;
import com.google.android.apps.gsa.shared.logger.p7054d.C89885b;
import com.google.android.libraries.search.p2871b.C37215b;
import com.google.android.libraries.search.p2871b.p2872a.p2876d.C37182a;
import com.google.android.libraries.search.p2871b.p2895i.C37259h;
import com.google.assistant.p3897e.p3921j.C52174hz;
import com.google.assistant.p3897e.p3921j.C52176ia;
import com.google.assistant.p3897e.p3921j.C52568wo;
import com.google.assistant.p3897e.p3921j.C52582xb;
import com.google.assistant.p3897e.p3921j.C52583xc;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60838bs;
import com.google.common.util.concurrent.C60846c;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import com.google.net.p4726a.p4727a.C62722b;
import com.google.protobuf.C62910ar;
import com.google.protobuf.p4750c.C62948a;
import java.util.UUID;
import p5535j.p5536a.p5561h.C71177a;
import p5535j.p5536a.p5561h.C71179c;

/* renamed from: com.google.android.apps.gsa.staticplugins.opamediaplayer.d.c.ag */
/* compiled from: PG */
public final class C115210ag implements C115308dx {

    /* renamed from: a */
    public static final C59071e f319721a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.opamediaplayer.d.c.ag");

    /* renamed from: b */
    public final C37215b f319722b;

    /* renamed from: c */
    public final C85350s f319723c;

    /* renamed from: d */
    public final C115315ed f319724d;

    /* renamed from: e */
    public final C85349r f319725e;

    /* renamed from: f */
    public long f319726f;

    /* renamed from: g */
    public C58833ax f319727g = C58836b.f156633a;

    /* renamed from: h */
    public boolean f319728h = true;

    /* renamed from: i */
    private boolean f319729i = false;

    /* renamed from: j */
    private boolean f319730j = false;

    /* renamed from: k */
    private C52582xb f319731k = C52582xb.UNKNOWN_TRIGGER_TYPE;

    /* renamed from: l */
    private boolean f319732l;

    /* renamed from: m */
    private String f319733m;

    /* renamed from: n */
    private final Context f319734n;

    public C115210ag(C37215b bVar, C85350s sVar, C115315ed edVar, C85349r rVar, Context context) {
        this.f319722b = bVar;
        this.f319723c = sVar;
        this.f319724d = edVar;
        this.f319733m = BuildConfig.FLAVOR;
        this.f319725e = rVar;
        this.f319734n = context;
    }

    /* renamed from: e */
    private final C60870cx m191001e(C84275o oVar) {
        C60870cx cxVar;
        NotificationChannel a;
        C71177a aVar = (C71177a) C71179c.f189893s.createBuilder();
        C62910ar j = C62948a.m95459j(oVar.mo77798d());
        aVar.copyOnWrite();
        C71179c cVar = (C71179c) aVar.instance;
        j.getClass();
        cVar.f189897b = j;
        boolean z = true;
        cVar.f189896a |= 1;
        String str = this.f319733m;
        aVar.copyOnWrite();
        C71179c cVar2 = (C71179c) aVar.instance;
        str.getClass();
        cVar2.f189896a |= 4;
        cVar2.f189898c = str;
        C52582xb xbVar = this.f319731k;
        aVar.copyOnWrite();
        C71179c cVar3 = (C71179c) aVar.instance;
        cVar3.f189902g = xbVar.f138062i;
        cVar3.f189896a |= 64;
        boolean z2 = this.f319732l;
        aVar.copyOnWrite();
        C71179c cVar4 = (C71179c) aVar.instance;
        cVar4.f189896a |= 4096;
        cVar4.f189908m = z2;
        C1800aq aqVar = new C1800aq(this.f319734n);
        if (!C1793aj.m4937b(aqVar.f5622a) || (a = C1794ak.m4938a(aqVar.f5622a, "com.google.android.apps.gsa.plugins.podcastplayer.channel")) == null || a.getImportance() == 0) {
            z = false;
        }
        aVar.copyOnWrite();
        C71179c cVar5 = (C71179c) aVar.instance;
        cVar5.f189896a |= 65536;
        cVar5.f189912q = z;
        C58833ax i = oVar.mo77803i();
        if (i.mo56113h()) {
            int intValue = ((Integer) i.mo56107c()).intValue();
            aVar.copyOnWrite();
            C71179c cVar6 = (C71179c) aVar.instance;
            cVar6.f189896a |= 256;
            cVar6.f189904i = intValue;
        }
        C58833ax k = oVar.mo77805k();
        if (k.mo56113h()) {
            int intValue2 = ((Integer) k.mo56107c()).intValue();
            aVar.copyOnWrite();
            C71179c cVar7 = (C71179c) aVar.instance;
            cVar7.f189896a |= 512;
            cVar7.f189905j = intValue2;
        }
        if (oVar.mo77804j().mo56113h()) {
            int intValue3 = ((Integer) oVar.mo77804j().mo56109e(0)).intValue();
            aVar.copyOnWrite();
            C71179c cVar8 = (C71179c) aVar.instance;
            cVar8.f189896a |= C89885b.S3REQUEST_VALUE;
            cVar8.f189913r = intValue3;
        }
        if (this.f319727g.mo56113h()) {
            String str2 = (String) this.f319727g.mo56107c();
            aVar.copyOnWrite();
            C71179c cVar9 = (C71179c) aVar.instance;
            str2.getClass();
            cVar9.f189896a |= 128;
            cVar9.f189903h = str2;
            cxVar = C60856cj.m92900i(aVar);
        } else {
            cxVar = C60846c.m92878g(C60838bs.m92859i(C60922j.m93044g(this.f319723c.mo78868c(), new C115388x(this, aVar), C60826bg.f164896a)), Exception.class, new C115389y(aVar), C60826bg.f164896a);
        }
        C60870cx h = C60922j.m93045h(cxVar, new C115207ad(this), C60826bg.f164896a);
        return C60922j.m93045h(h, new C115390z(this, h), C60826bg.f164896a);
    }

    /* renamed from: f */
    private final void m191002f(C84275o oVar) {
        C37259h hVar;
        if (this.f319729i) {
            C62722b bVar = oVar.mo77810p() ? C62722b.INTERNAL : C62722b.OK;
            if (oVar.mo77811q()) {
                hVar = C37182a.f98250t.mo40806d();
            } else {
                hVar = C37182a.f98249s.mo40806d();
            }
            m191004h(hVar, bVar, oVar);
            this.f319729i = false;
        }
    }

    /* renamed from: g */
    private final void m191003g(C62722b bVar, C84275o oVar) {
        C60856cj.m92911t(m191001e(oVar), new C115209af(this, bVar, oVar), C60826bg.f164896a);
    }

    /* renamed from: h */
    private final void m191004h(C37259h hVar, C62722b bVar, C84275o oVar) {
        C60856cj.m92911t(m191001e(oVar), new C115208ae(this, hVar, bVar, oVar), C60826bg.f164896a);
    }

    /* renamed from: a */
    public final void mo101893a(C52174hz hzVar) {
        C52583xc xcVar;
        this.f319733m = UUID.randomUUID().toString();
        C52568wo woVar = hzVar.f136897d;
        if (woVar == null) {
            woVar = C52568wo.f137992v;
        }
        if (woVar.f137996c == 26) {
            xcVar = (C52583xc) woVar.f137997d;
        } else {
            xcVar = C52583xc.f138063o;
        }
        C52582xb a = C52582xb.m86658a(xcVar.f138076l);
        if (a == null) {
            a = C52582xb.UNKNOWN_TRIGGER_TYPE;
        }
        this.f319731k = a;
        this.f319732l = xcVar.f138077m;
        this.f319728h = true;
    }

    /* renamed from: b */
    public final /* synthetic */ void mo101894b(C52174hz hzVar) {
    }

    /* renamed from: c */
    public final /* synthetic */ void mo101895c(C52176ia iaVar) {
    }

    /* renamed from: d */
    public final void mo101896d(C84275o oVar) {
        if (oVar.mo77814t()) {
            if (!this.f319729i) {
                this.f319726f = oVar.mo77801g();
                this.f319722b.mo19974a(C37182a.f98248r);
                this.f319729i = true;
                if (this.f319730j) {
                    m191003g(C62722b.OK, oVar);
                    this.f319730j = false;
                }
            }
        } else if (oVar.mo77812r()) {
            if (!this.f319730j) {
                this.f319722b.mo19974a(C37182a.f98252v);
                this.f319730j = true;
            }
            if (this.f319729i) {
                m191004h(C37182a.f98251u.mo40806d(), C62722b.OK, oVar);
                this.f319729i = false;
            }
        } else if (oVar.mo77810p()) {
            if (this.f319730j) {
                m191003g(C62722b.INTERNAL, oVar);
                this.f319730j = false;
                return;
            }
            m191002f(oVar);
        } else if (oVar.mo77813s()) {
            m191002f(oVar);
        }
    }
}
