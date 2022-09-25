package com.google.android.apps.gsa.staticplugins.p7885e;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Bundle;
import com.google.android.apps.gsa.p6427o.C83559c;
import com.google.android.apps.gsa.p8852u.C118575h;
import com.google.android.apps.gsa.p8883x.C118826c;
import com.google.android.apps.gsa.search.core.google.C85923cq;
import com.google.android.apps.gsa.search.core.google.gaia.p6800c.p6801a.C86034c;
import com.google.android.apps.gsa.search.core.p6507ag.p6508a.C84474e;
import com.google.android.apps.gsa.search.core.p6519al.p6526ac.C84624a;
import com.google.android.apps.gsa.search.core.p6519al.p6731f.C85465a;
import com.google.android.apps.gsa.search.core.p6786e.C85765a;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.search.core.service.C86610af;
import com.google.android.apps.gsa.search.core.service.p6856h.C86734a;
import com.google.android.apps.gsa.search.shared.p6919a.C87395c;
import com.google.android.apps.gsa.search.shared.service.C87684al;
import com.google.android.apps.gsa.search.shared.service.ServiceEventData;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88153rc;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88155re;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88175ry;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88177s;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88178sa;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88204t;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88231u;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88244um;
import com.google.android.apps.gsa.shared.logger.p7051b.C89849ae;
import com.google.android.apps.gsa.shared.logger.p7051b.C89859i;
import com.google.android.apps.gsa.shared.logger.p7061g.C89917a;
import com.google.android.apps.gsa.shared.p7009b.C89336a;
import com.google.android.apps.gsa.shared.p7066m.C90084ei;
import com.google.android.apps.gsa.shared.p7066m.C90110fh;
import com.google.android.apps.gsa.shared.util.C90719ac;
import com.google.android.apps.gsa.shared.util.p7184t.C91097g;
import com.google.android.apps.search.googleapp.googleappbrowser.p10260a.C135458d;
import com.google.android.apps.search.googleapp.googleappbrowser.p10260a.C135459e;
import com.google.android.apps.search.googleapp.googleappbrowser.p10260a.C135461g;
import com.google.android.apps.search.googleapp.googleappbrowser.p10260a.C135462h;
import com.google.android.apps.search.googleapp.stampviewer.p10488b.C139338t;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.android.libraries.gsa.util.p1935a.C23336a;
import com.google.android.libraries.p1703d.C20644ah;
import com.google.android.libraries.p1703d.C20645ai;
import com.google.android.libraries.p1703d.C20656l;
import com.google.common.base.C58833ax;
import com.google.common.p4522b.C58422el;
import com.google.common.p4552o.C60494rz;
import com.google.common.p4575r.C60757n;
import com.google.common.p4580v.C60950i;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import java.net.URISyntaxException;
import java.util.Arrays;
import p3186j$.time.Instant;

/* renamed from: com.google.android.apps.gsa.staticplugins.e.e */
/* compiled from: PG */
public final class C100329e extends C86734a implements C85465a {

    /* renamed from: a */
    public final C91097g f280567a;

    /* renamed from: b */
    public final C139338t f280568b;

    /* renamed from: c */
    public final Context f280569c;

    /* renamed from: f */
    private final C85765a f280570f;

    /* renamed from: g */
    private final C100325a f280571g;

    /* renamed from: h */
    private final C100326b f280572h;

    /* renamed from: i */
    private final C84624a f280573i;

    /* renamed from: j */
    private final SharedPreferences f280574j;

    /* renamed from: k */
    private final C86124t f280575k;

    /* renamed from: l */
    private final C84474e f280576l;

    /* renamed from: m */
    private final C86610af f280577m;

    /* renamed from: n */
    private final C85923cq f280578n;

    /* renamed from: o */
    private final C89859i f280579o;

    /* renamed from: p */
    private final C86034c f280580p;

    /* renamed from: q */
    private final C22871g f280581q;

    /* renamed from: r */
    private final C83559c f280582r;

    /* renamed from: s */
    private final C89336a f280583s;

    /* renamed from: t */
    private final C60950i f280584t;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C100329e(Context context, C85765a aVar, C100325a aVar2, C100326b bVar, C84624a aVar3, C91097g gVar, SharedPreferences sharedPreferences, C86124t tVar, C84474e eVar, C86610af afVar, C85923cq cqVar, C89859i iVar, C86034c cVar, C22871g gVar2, C83559c cVar2, C89336a aVar4, C139338t tVar2, C60950i iVar2) {
        super(C118575h.WORKER_AMP, "amp");
        this.f280569c = context;
        this.f280570f = aVar;
        this.f280571g = aVar2;
        this.f280572h = bVar;
        this.f280573i = aVar3;
        this.f280567a = gVar;
        this.f280574j = sharedPreferences;
        this.f280575k = tVar;
        this.f280576l = eVar;
        this.f280577m = afVar;
        this.f280578n = cqVar;
        this.f280579o = iVar;
        this.f280580p = cVar;
        this.f280581q = gVar2;
        this.f280582r = cVar2;
        this.f280583s = aVar4;
        this.f280568b = tVar2;
        this.f280584t = iVar2;
    }

    /* renamed from: g */
    public static final long m166304g(C88153rc rcVar) {
        long j;
        C58833ax b = C89917a.m146441b(Uri.parse(rcVar.f238301e));
        if ((rcVar.f238297a & 32) != 0) {
            j = rcVar.f238303g;
        } else {
            j = C90719ac.f253778a.f253779b.nextLong();
        }
        return ((Long) b.mo56109e(Long.valueOf(j))).longValue();
    }

    /* renamed from: h */
    private final long m166305h() {
        return (long) this.f280574j.getInt("amp_custom_tabs_private_api_version", 0);
    }

    /* renamed from: i */
    private final Uri m166306i() {
        return Uri.parse("android-app://com.google.android.googlequicksearchbox/https/".concat(String.valueOf(this.f280578n.mo83211i())));
    }

    /* renamed from: j */
    private final void m166307j(Uri uri) {
        Bundle bundle = new Bundle();
        bundle.putParcelable("android.intent.extra.REFERRER", m166306i());
        C20644ah f = C20645ai.m38752f();
        C20656l lVar = (C20656l) f;
        lVar.f57917a = uri;
        lVar.f57919c = bundle;
        f.mo25595b(true);
        f.mo25596c(true);
        this.f280573i.mo78394n(f.mo25594a());
    }

    /* renamed from: k */
    private final boolean m166308k() {
        if (m166309l()) {
            return this.f280576l.mo78085aC();
        }
        long h = m166305h();
        if (!this.f280574j.getBoolean("use_custom_tabs", true) || h < 7) {
            return false;
        }
        return true;
    }

    /* renamed from: l */
    private final boolean m166309l() {
        if (!this.f280582r.f227865c.mo76896a()) {
            return false;
        }
        return this.f280582r.mo76893d(this.f280583s.mo79659F());
    }

    /* renamed from: m */
    private final C60870cx m166310m(C58833ax axVar, String str, String str2, int i, long j, boolean z, boolean z2) {
        Intent intent;
        C135461g gVar;
        boolean z3 = false;
        if (axVar.mo56113h() && ((m166309l() && !this.f280576l.mo78085aC()) || this.f280575k.mo79746e(C90110fh.f250719y) || this.f280576l.mo78107au())) {
            z3 = true;
        }
        if (z3) {
            try {
                axVar.mo56107c();
                intent = C23336a.m43768a((String) axVar.mo56107c());
            } catch (URISyntaxException e) {
                return C60856cj.m92899h(e);
            }
        } else {
            intent = C23336a.m43768a(str);
        }
        intent.putExtra("com.google.android.apps.gsa.customtabs.SOURCE", (i == 3 ? C60494rz.AMP_NOW : C60494rz.AMP).f163762v);
        C135459e eVar = (C135459e) C135462h.f369059n.createBuilder();
        if (i == 3) {
            gVar = C135461g.AMP_NOW;
        } else {
            gVar = C135461g.AMP;
        }
        eVar.copyOnWrite();
        C135462h hVar = (C135462h) eVar.instance;
        hVar.f369064d = gVar.f369058p;
        hVar.f369061a |= 4;
        C135458d.m219649b((C135462h) eVar.build(), intent);
        intent.putExtra("com.google.android.apps.gsa.shared.logger.RESULT_CLICK_ID", j);
        intent.putExtra("android.intent.extra.REFERRER", m166306i());
        if (m166308k() && !z3) {
            intent.putExtra(true != z2 ? "com.google.android.apps.gsa.customtabs.PREFERRED_URL" : "com.google.android.apps.gsa.customtabs.PREFERRED_REDIRECT_ENDPOINT", str2).putExtra("com.google.android.apps.gsa.customtabs.AMP_HEADER", z).putExtra("com.google.android.search.core.extra.EXTRA_STAY_BOUND_TO_SERVICE_AFTER_INTENT_LAUNCH", true);
        }
        if (!this.f280567a.mo65089a(intent)) {
            return C60856cj.m92899h(new IllegalArgumentException("Could not start intent."));
        }
        return C60856cj.m92900i(C118826c.f331422a);
    }

    /* renamed from: b */
    public final C60870cx mo78990b(C88155re reVar) {
        String str;
        long j;
        if (reVar.f238311c.size() == 0) {
            return C60856cj.m92899h(new IllegalArgumentException("At least one AMP url is required."));
        }
        int a = C87395c.m141391a(reVar.f238314f);
        if (a != 0 && a == 2) {
            this.f280579o.mo83702b(C89849ae.SRP_RESULT_CLICK_AMP);
        }
        if (reVar.f238310b.isEmpty()) {
            str = Integer.toString(Arrays.hashCode(reVar.f238311c.toArray(new String[0])));
        } else {
            str = reVar.f238310b;
        }
        String str2 = str;
        int c = C60757n.m92742c(reVar.f238312d, 0, reVar.f238311c.size() - 1);
        String uri = this.f280572h.mo91890b((String) reVar.f238311c.get(c), reVar.f238316h).toString();
        String uri2 = this.f280572h.mo91889a(str2, reVar.f238311c, Integer.valueOf(c), reVar.f238313e, reVar.f238316h).toString();
        if ((reVar.f238309a & 32) != 0) {
            j = reVar.f238315g;
        } else {
            j = C90719ac.f253778a.f253779b.nextLong();
        }
        long j2 = j;
        C58833ax k = C58833ax.m90834k((String) reVar.f238311c.get(c));
        int a2 = C87395c.m141391a(reVar.f238314f);
        return m166310m(k, uri, uri2, a2 == 0 ? 1 : a2, j2, true, false);
    }

    /* renamed from: c */
    public final C60870cx mo78991c(C88175ry ryVar) {
        Uri uri;
        if (!m166308k()) {
            return C60856cj.m92898g();
        }
        if (C100325a.m166296d(ryVar.f238365c)) {
            uri = this.f280571g.mo91887b(Uri.parse(ryVar.f238365c), C58422el.f156033a);
        } else {
            if ((ryVar.f238363a & 1) != 0) {
                Uri parse = Uri.parse(ryVar.f238364b);
                if (parse.isAbsolute()) {
                    C100325a aVar = this.f280571g;
                    uri = aVar.mo91887b(aVar.mo91886a(parse), C58422el.f156033a);
                }
            }
            String str = ryVar.f238364b;
            String str2 = ryVar.f238365c;
            return C60856cj.m92899h(new IllegalArgumentException("No valid URI found in event data.\nAMP url: " + str + "\nCDN url: " + str2));
        }
        m166307j(uri);
        return C60856cj.m92900i(C118826c.f331422a);
    }

    /* renamed from: d */
    public final C60870cx mo78992d(C88178sa saVar) {
        if (!m166308k()) {
            return C60856cj.m92898g();
        }
        m166307j(this.f280572h.mo91889a(saVar.f238371a, saVar.f238372b, (Integer) null, saVar.f238373c, saVar.f238374d));
        return C60856cj.m92900i(C118826c.f331422a);
    }

    /* renamed from: e */
    public final C60870cx mo78993e(long j) {
        C88204t tVar = (C88204t) C88231u.f238474c.createBuilder();
        boolean k = m166308k();
        tVar.copyOnWrite();
        C88231u uVar = (C88231u) tVar.instance;
        uVar.f238476a |= 1;
        uVar.f238477b = k;
        C87684al alVar = new C87684al(C88244um.AMP_VIEWER_SUPPORT_RESPONSE);
        alVar.mo81965b(C88177s.f238367a, (C88231u) tVar.build());
        ServiceEventData a = alVar.mo81964a();
        boolean z = ((C88231u) tVar.instance).f238477b;
        if (this.f280577m.mo80229j(j, a)) {
            return C60856cj.m92900i(C118826c.f331422a);
        }
        return C60856cj.m92899h(new IllegalArgumentException("Client with id " + j + " does not exist."));
    }

    /* JADX WARNING: Removed duplicated region for block: B:26:0x0088  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x008a  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0093  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0095  */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.common.util.concurrent.C60870cx mo91891f(com.google.android.apps.gsa.search.shared.service.p6935b.C88153rc r12, p3186j$.time.Instant r13) {
        /*
            r11 = this;
            java.lang.String r0 = r12.f238299c
            boolean r0 = com.google.android.apps.gsa.staticplugins.p7885e.C100325a.m166296d(r0)
            r1 = 1
            if (r0 == 0) goto L_0x001b
            com.google.android.apps.gsa.staticplugins.e.a r0 = r11.f280571g
            java.lang.String r2 = r12.f238299c
            android.net.Uri r2 = android.net.Uri.parse(r2)
            android.net.Uri r13 = r0.mo91888c(r2, r13)
            java.lang.String r13 = r13.toString()
        L_0x0019:
            r5 = r13
            goto L_0x003b
        L_0x001b:
            int r0 = r12.f238297a
            r0 = r0 & r1
            if (r0 == 0) goto L_0x00a0
            java.lang.String r0 = r12.f238298b
            android.net.Uri r0 = android.net.Uri.parse(r0)
            boolean r2 = r0.isAbsolute()
            if (r2 == 0) goto L_0x00a0
            com.google.android.apps.gsa.staticplugins.e.a r2 = r11.f280571g
            android.net.Uri r0 = r2.mo91886a(r0)
            android.net.Uri r13 = r2.mo91888c(r0, r13)
            java.lang.String r13 = r13.toString()
            goto L_0x0019
        L_0x003b:
            int r13 = r12.f238297a
            r13 = r13 & r1
            if (r13 == 0) goto L_0x0047
            java.lang.String r13 = r12.f238298b
            com.google.common.base.ax r13 = com.google.common.base.C58833ax.m90834k(r13)
            goto L_0x004d
        L_0x0047:
            com.google.android.apps.gsa.search.core.e.a r13 = r11.f280570f
            com.google.common.base.ax r13 = r13.mo79421a(r5)
        L_0x004d:
            r3 = r13
            int r13 = r12.f238297a
            r13 = r13 & 8
            r0 = 0
            if (r13 == 0) goto L_0x0057
            r10 = 1
            goto L_0x0058
        L_0x0057:
            r10 = 0
        L_0x0058:
            if (r10 == 0) goto L_0x005e
            java.lang.String r13 = r12.f238301e
        L_0x005c:
            r4 = r13
            goto L_0x0078
        L_0x005e:
            boolean r13 = r3.mo56113h()
            if (r13 == 0) goto L_0x0077
            com.google.android.apps.gsa.staticplugins.e.b r13 = r11.f280572h
            java.lang.Object r2 = r3.mo56107c()
            java.lang.String r2 = (java.lang.String) r2
            boolean r4 = r12.f238304h
            android.net.Uri r13 = r13.mo91890b(r2, r4)
            java.lang.String r13 = r13.toString()
            goto L_0x005c
        L_0x0077:
            r4 = r5
        L_0x0078:
            long r6 = r11.m166305h()
            com.google.android.apps.gsa.search.core.i.t r13 = r11.f280575k
            com.google.android.apps.gsa.shared.m.f r2 = com.google.android.apps.gsa.shared.p7066m.C90110fh.f250625aW
            long r8 = r13.mo79743a(r2)
            int r13 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r13 >= 0) goto L_0x008a
            r9 = 1
            goto L_0x008b
        L_0x008a:
            r9 = 0
        L_0x008b:
            int r13 = r12.f238302f
            int r13 = com.google.android.apps.gsa.search.shared.p6919a.C87395c.m141391a(r13)
            if (r13 != 0) goto L_0x0095
            r6 = 1
            goto L_0x0096
        L_0x0095:
            r6 = r13
        L_0x0096:
            long r7 = m166304g(r12)
            r2 = r11
            com.google.common.util.concurrent.cx r12 = r2.m166310m(r3, r4, r5, r6, r7, r9, r10)
            return r12
        L_0x00a0:
            java.lang.IllegalArgumentException r13 = new java.lang.IllegalArgumentException
            java.lang.String r0 = r12.f238298b
            java.lang.String r12 = r12.f238299c
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "No valid URI found in event data.\nAMP url: "
            r1.<init>(r2)
            r1.append(r0)
            java.lang.String r0 = "\nCDN url: "
            r1.append(r0)
            r1.append(r12)
            java.lang.String r12 = r1.toString()
            r13.<init>(r12)
            com.google.common.util.concurrent.cx r12 = com.google.common.util.concurrent.C60856cj.m92899h(r13)
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.staticplugins.p7885e.C100329e.mo91891f(com.google.android.apps.gsa.search.shared.service.b.rc, j$.time.Instant):com.google.common.util.concurrent.cx");
    }

    /* renamed from: o */
    public final boolean mo20306o() {
        return false;
    }

    /* renamed from: a */
    public final C60870cx mo78989a(C88153rc rcVar) {
        boolean z;
        int a = C87395c.m141391a(rcVar.f238302f);
        if (a != 0 && a == 2) {
            this.f280579o.mo83702b(C89849ae.SRP_RESULT_CLICK_AMP);
        }
        Instant a2 = this.f280584t.mo57444a();
        int a3 = C87395c.m141391a(rcVar.f238302f);
        if (a3 == 0) {
            a3 = 1;
        }
        int i = a3 - 1;
        if (i != 1) {
            if (i == 2) {
                z = this.f280575k.mo79746e(C90084ei.f250094a);
            }
            return mo91891f(rcVar, a2);
        }
        z = this.f280575k.mo79746e(C90084ei.f250095b);
        if (z && rcVar.f238304h) {
            int i2 = rcVar.f238297a;
            if (!((i2 & 1) == 0 || (2 & i2) == 0)) {
                return this.f280581q.mo28210j(this.f280580p.mo79697b(), "AmpWorker getCurrentAccountId", new C100327c(this, rcVar, a2, this.f280575k.mo79746e(C90084ei.f250096c)));
            }
        }
        return mo91891f(rcVar, a2);
    }
}
