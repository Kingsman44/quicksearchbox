package com.google.android.apps.gsa.staticplugins.opa.smartspace.crossprofile;

import android.content.Intent;
import android.os.Build;
import com.evernote.android.state.BuildConfig;
import com.google.android.apps.gsa.opa.p6429a.p6431b.C83564a;
import com.google.android.apps.gsa.opa.smartspace.C83740al;
import com.google.android.apps.gsa.opa.smartspace.C83741am;
import com.google.android.apps.gsa.opa.smartspace.C83794j;
import com.google.android.apps.gsa.opa.smartspace.C83800p;
import com.google.android.apps.gsa.opa.smartspace.C83809y;
import com.google.android.apps.gsa.opa.smartspace.crossprofile.C83754b;
import com.google.android.apps.gsa.opa.smartspace.p6456e.C83783a;
import com.google.android.apps.gsa.opa.smartspace.p6458g.C83791c;
import com.google.android.apps.gsa.shared.logger.p7054d.C89885b;
import com.google.android.apps.gsa.shared.p7195y.C91189au;
import com.google.android.apps.search.assistant.verticals.ambient.p9935m.C130895ag;
import com.google.android.enterprise.connectedapps.C142570e;
import com.google.android.enterprise.connectedapps.C142574h;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.assistant.p3886c.C50790cn;
import com.google.assistant.p3886c.C50818do;
import com.google.assistant.p3886c.p3888b.C50732q;
import com.google.assistant.p3886c.p3888b.C50733r;
import com.google.common.android.p4521a.C58274c;
import com.google.common.base.C58872ci;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.p4526f.p4527a.C58974d;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import com.google.common.util.concurrent.SettableFuture;
import java.net.URISyntaxException;
import java.util.ArrayList;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.smartspace.crossprofile.v */
/* compiled from: PG */
public final class C110656v {

    /* renamed from: a */
    public final C83794j f308342a;

    /* renamed from: b */
    public final C83791c f308343b;

    /* renamed from: c */
    public final C22871g f308344c;

    /* renamed from: d */
    public final C58974d f308345d;

    /* renamed from: e */
    public final C91189au f308346e;

    /* renamed from: f */
    public final C130895ag f308347f;

    /* renamed from: g */
    public final C110630cf f308348g;

    /* renamed from: h */
    public final C83754b f308349h;

    /* renamed from: i */
    private final C110567a f308350i;

    /* renamed from: j */
    private final C83783a f308351j;

    public C110656v(C83794j jVar, C83791c cVar, C110630cf cfVar, C110567a aVar, C83783a aVar2, C83754b bVar, C22871g gVar, C91189au auVar, C83564a aVar3, C130895ag agVar) {
        this.f308342a = jVar;
        this.f308343b = cVar;
        this.f308348g = cfVar;
        this.f308350i = aVar;
        this.f308351j = aVar2;
        this.f308349h = bVar;
        this.f308344c = gVar;
        this.f308346e = auVar;
        this.f308345d = aVar3.mo76900a("CPDataMediator");
        this.f308347f = agVar;
    }

    /* renamed from: a */
    public final C83741am mo98830a(C83741am amVar) {
        C50818do doVar = amVar.f228252c;
        if (doVar == null) {
            doVar = C50818do.f132293H;
        }
        try {
            C50733r rVar = doVar.f132316m;
            if (rVar == null) {
                rVar = C50733r.f132021d;
            }
            Intent parseUri = Intent.parseUri(rVar.f132025c, 1);
            if (!parseUri.getBooleanExtra("com.google.android.apps.gsa.smartspace.extra.SMARTSPACE_IS_WORK_PROFILE", false)) {
                parseUri.putExtra("com.google.android.apps.gsa.smartspace.extra.SMARTSPACE_IS_WORK_PROFILE", true);
            } else if (doVar.f132322s) {
                return amVar;
            }
            C83740al alVar = (C83740al) amVar.toBuilder();
            C50790cn cnVar = (C50790cn) doVar.toBuilder();
            cnVar.copyOnWrite();
            C50818do doVar2 = (C50818do) cnVar.instance;
            doVar2.f132304a |= C89885b.S3REQUEST_VALUE;
            doVar2.f132322s = true;
            C50733r rVar2 = doVar.f132316m;
            if (rVar2 == null) {
                rVar2 = C50733r.f132021d;
            }
            C50732q qVar = (C50732q) rVar2.toBuilder();
            String uri = parseUri.toUri(1);
            qVar.copyOnWrite();
            C50733r rVar3 = (C50733r) qVar.instance;
            uri.getClass();
            rVar3.f132023a |= 2;
            rVar3.f132025c = uri;
            cnVar.copyOnWrite();
            C50818do doVar3 = (C50818do) cnVar.instance;
            C50733r rVar4 = (C50733r) qVar.build();
            rVar4.getClass();
            doVar3.f132316m = rVar4;
            doVar3.f132304a |= 2048;
            alVar.copyOnWrite();
            C83741am amVar2 = (C83741am) alVar.instance;
            C50818do doVar4 = (C50818do) cnVar.build();
            doVar4.getClass();
            amVar2.f228252c = doVar4;
            amVar2.f228250a |= 4;
            return (C83741am) alVar.build();
        } catch (URISyntaxException e) {
            C58970a aVar = (C58970a) ((C58970a) ((C58970a) this.f308345d.mo56225c()).mo56382g(e)).mo56372aa(26597);
            C50733r rVar5 = doVar.f132316m;
            if (rVar5 == null) {
                rVar5 = C50733r.f132021d;
            }
            aVar.mo56389s("Invalid intent '%s' found in Smartspace card.", rVar5.f132025c);
            return amVar;
        }
    }

    /* renamed from: b */
    public final C60870cx mo98831b(C83800p pVar) {
        C60870cx cxVar;
        C60870cx cxVar2;
        C58872ci d = C58872ci.m90947d(C58274c.f155808a);
        C60870cx a = this.f308348g.mo98823b().f308352a.mo98796a();
        C60870cx d2 = this.f308348g.mo98823b().f308352a.mo98799d();
        if (this.f308342a.mo77172j()) {
            cxVar = this.f308351j.mo77104c();
        } else {
            cxVar = C60856cj.m92900i(new ArrayList());
        }
        C142570e i = this.f308349h.mo117178i();
        if (!this.f308342a.mo77183v() || !C142574h.m231177a(i.f386862c) || !this.f308349h.mo117175b().mo117165q()) {
            cxVar2 = C60922j.m93044g(C60856cj.m92907p(a, d2, cxVar), new C110650p(this, d, pVar), C60826bg.f164896a);
        } else {
            String h = this.f308342a.mo77170h();
            String str = Build.MANUFACTURER;
            this.f308347f.mo109952y(h, str, "CROSS_PROFILE_CALL");
            SettableFuture settableFuture = new SettableFuture();
            C60856cj.m92911t(this.f308348g.mo98822a().mo98777b(), new C110655u(this, h, str, settableFuture), C60826bg.f164896a);
            this.f308349h.mo117181e(this.f308350i);
            cxVar2 = C60922j.m93044g(C60856cj.m92907p(a, settableFuture, d2, cxVar), new C110649o(this, d, pVar), C60826bg.f164896a);
        }
        if (!this.f308342a.mo77184w()) {
            return this.f308344c.mo28210j(cxVar2, BuildConfig.FLAVOR, new C110651q(this, d));
        }
        return this.f308344c.mo28210j(cxVar2, BuildConfig.FLAVOR, new C110652r(this, d));
    }

    /* renamed from: c */
    public final C60870cx mo98832c(String str) {
        return C60856cj.m92893b(this.f308348g.mo98823b().mo98779d(str), this.f308348g.mo98822a().mo98779d(str)).mo57334a(C110648n.f308325a, C60826bg.f164896a);
    }

    /* renamed from: d */
    public final C60870cx mo98833d(String str, C83809y yVar, long j, boolean z) {
        if (z) {
            return this.f308348g.mo98822a().mo98780e(str, yVar, j);
        }
        return this.f308348g.mo98823b().mo98780e(str, yVar, j);
    }
}
