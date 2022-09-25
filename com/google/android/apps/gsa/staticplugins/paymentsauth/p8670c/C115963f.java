package com.google.android.apps.gsa.staticplugins.paymentsauth.p8670c;

import android.content.Context;
import android.content.Intent;
import android.os.Parcelable;
import com.google.android.apps.gsa.search.core.p6519al.p6753q.C85552a;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.search.core.p6884y.C87290c;
import com.google.android.apps.gsa.shared.p6984ai.p6985a.C89162a;
import com.google.android.apps.gsa.shared.p6984ai.p6985a.C89164c;
import com.google.android.apps.gsa.shared.p6984ai.p6985a.C89165d;
import com.google.android.apps.gsa.shared.p6984ai.p6985a.C89167f;
import com.google.android.apps.gsa.shared.p6984ai.p6985a.C89168g;
import com.google.android.apps.gsa.shared.p6984ai.p6985a.C89171j;
import com.google.android.apps.gsa.shared.p6984ai.p6985a.C89172k;
import com.google.android.apps.gsa.shared.p6984ai.p6985a.C89173l;
import com.google.android.apps.gsa.shared.p7066m.C90014bt;
import com.google.android.apps.gsa.staticplugins.paymentsauth.p8668a.C115954c;
import com.google.android.apps.gsa.staticplugins.paymentsauth.p8671d.C115975a;
import com.google.android.libraries.gsa.monet.internal.service.C23028x;
import com.google.android.libraries.gsa.monet.service.C23052c;
import com.google.android.libraries.gsa.monet.service.C23056g;
import com.google.android.libraries.gsa.monet.service.C23058i;
import com.google.android.libraries.gsa.monet.shared.ProtoParcelable;
import com.google.android.libraries.gsa.monet.tools.children.p1912a.C23186f;
import com.google.android.libraries.gsa.monet.tools.model.shared.p1924b.C23251a;
import com.google.android.libraries.gsa.monet.tools.p1917d.p1918a.C23245b;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.protobuf.C62921ba;

/* renamed from: com.google.android.apps.gsa.staticplugins.paymentsauth.c.f */
/* compiled from: PG */
public final class C115963f extends C23056g implements C115954c {

    /* renamed from: a */
    public static final C59071e f321533a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.paymentsauth.c.f");

    /* renamed from: b */
    public final C115975a f321534b;

    /* renamed from: c */
    public final C22871g f321535c;

    /* renamed from: d */
    public final C85552a f321536d;

    /* renamed from: e */
    public final Context f321537e;

    /* renamed from: f */
    public C58833ax f321538f;

    /* renamed from: g */
    public C58833ax f321539g;

    /* renamed from: h */
    public boolean f321540h = false;

    /* renamed from: i */
    public final C87290c f321541i;

    /* renamed from: j */
    private final C23058i f321542j;

    /* renamed from: k */
    private final C86124t f321543k;

    public C115963f(C23052c cVar, C115975a aVar, C23058i iVar, C22871g gVar, C85552a aVar2, C87290c cVar2, C86124t tVar, Context context) {
        super(cVar);
        C58836b bVar = C58836b.f156633a;
        this.f321538f = bVar;
        this.f321539g = bVar;
        this.f321534b = aVar;
        this.f321542j = iVar;
        this.f321535c = gVar;
        this.f321536d = aVar2;
        this.f321541i = cVar2;
        this.f321543k = tVar;
        this.f321537e = context;
    }

    /* renamed from: i */
    private final void m192202i() {
        this.f321535c.mo28211k(this.f321536d.mo79061a(), "Checking biometric availability", new C115959b(this));
    }

    /* renamed from: N */
    public final void mo28493N(String str, String str2, Parcelable parcelable) {
        C58976aa aaVar = C58975e.f156826a;
        if ("CLICK".equals(str)) {
            if ("SWITCH_TO_PASSWORD_BUTTON".equals(str2)) {
                mo102363h(true, C58836b.f156633a);
            }
            if ("CANCEL_BUTTON".equals(str2)) {
                mo102362f();
            }
        }
    }

    /* renamed from: b */
    public final void mo102359b() {
        C59104x d = f321533a.mo56226d();
        d.mo56378ag(C58975e.f156826a, "AuthController");
        ((C59052c) ((C59052c) d).mo56372aa(30205)).mo56386p("onBiometricAuthenticationError");
        mo102363h(true, C58833ax.m90834k(C89164c.UNKNOWN_REASON));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0008, code lost:
        r0 = (com.google.android.apps.gsa.staticplugins.paymentsauth.p8668a.C115955d) r2.f321539g.mo56107c();
     */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo102361e() {
        /*
            r2 = this;
            com.google.common.base.ax r0 = r2.f321539g
            boolean r0 = r0.mo56113h()
            if (r0 == 0) goto L_0x001f
            com.google.common.base.ax r0 = r2.f321539g
            java.lang.Object r0 = r0.mo56107c()
            com.google.android.apps.gsa.staticplugins.paymentsauth.a.d r0 = (com.google.android.apps.gsa.staticplugins.paymentsauth.p8668a.C115955d) r0
            android.os.CancellationSignal r1 = r0.f321523g
            if (r1 == 0) goto L_0x001f
            boolean r1 = r1.isCanceled()
            if (r1 != 0) goto L_0x001f
            android.os.CancellationSignal r0 = r0.f321523g
            r0.cancel()
        L_0x001f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.staticplugins.paymentsauth.p8670c.C115963f.mo102361e():void");
    }

    /* renamed from: f */
    public final void mo102362f() {
        C89167f fVar;
        C89168g gVar = (C89168g) C89171j.f241759f.createBuilder();
        gVar.copyOnWrite();
        C89171j jVar = (C89171j) gVar.instance;
        jVar.f241762b = 3;
        jVar.f241761a |= 1;
        if (((Boolean) ((C23251a) this.f321534b.mo102372j()).f63720e).booleanValue()) {
            fVar = C89167f.PASSWORD;
        } else {
            fVar = C89167f.FINGERPRINT;
        }
        gVar.copyOnWrite();
        C89171j jVar2 = (C89171j) gVar.instance;
        jVar2.f241763c = fVar.f241757d;
        jVar2.f241761a |= 2;
        C89171j jVar3 = (C89171j) gVar.build();
        Intent intent = new Intent();
        if (this.f321538f.mo56113h()) {
            intent.putExtra("com.google.android.apps.gsa.staticplugins.paymentsauth.EXTRA_PROTO_STRING_AUTHENTICATION_REQUEST_CLIENT_INPUT_NAME", (String) this.f321538f.mo56107c());
        }
        intent.putExtra("com.google.android.apps.gsa.staticplugins.paymentsauth.EXTRA_PROTO_PARCELABLE_AUTHENTICATION_RESULTS", C23245b.m43556a(jVar3));
        this.f321541i.mo80936b(0, intent);
    }

    /* renamed from: h */
    public final void mo102363h(boolean z, C58833ax axVar) {
        C89162a aVar = (C89162a) C89165d.f241737n.createBuilder();
        aVar.copyOnWrite();
        C89165d dVar = (C89165d) aVar.instance;
        dVar.f241739a |= 1024;
        dVar.f241750l = z;
        if (this.f321538f.mo56113h()) {
            String str = (String) this.f321538f.mo56107c();
            aVar.copyOnWrite();
            C89165d dVar2 = (C89165d) aVar.instance;
            str.getClass();
            dVar2.f241739a |= 256;
            dVar2.f241748j = str;
        }
        if (axVar.mo56113h()) {
            aVar.copyOnWrite();
            C89165d dVar3 = (C89165d) aVar.instance;
            dVar3.f241751m = ((C89164c) axVar.mo56107c()).f241736f;
            dVar3.f241739a |= 2048;
        }
        if (!((String) ((C23251a) this.f321534b.mo102365c()).f63720e).isEmpty()) {
            String str2 = (String) ((C23251a) this.f321534b.mo102365c()).f63720e;
            aVar.copyOnWrite();
            C89165d dVar4 = (C89165d) aVar.instance;
            str2.getClass();
            dVar4.f241739a |= 2;
            dVar4.f241741c = str2;
        }
        if (((C58833ax) ((C23251a) this.f321534b.mo102374l()).f63720e).mo56113h()) {
            String str3 = (String) ((C58833ax) ((C23251a) this.f321534b.mo102374l()).f63720e).mo56107c();
            aVar.copyOnWrite();
            C89165d dVar5 = (C89165d) aVar.instance;
            str3.getClass();
            dVar5.f241739a |= 4;
            dVar5.f241742d = str3;
        }
        if (((C58833ax) ((C23251a) this.f321534b.mo102367e()).f63720e).mo56113h()) {
            String str4 = (String) ((C58833ax) ((C23251a) this.f321534b.mo102367e()).f63720e).mo56107c();
            aVar.copyOnWrite();
            C89165d dVar6 = (C89165d) aVar.instance;
            str4.getClass();
            dVar6.f241739a |= 64;
            dVar6.f241746h = str4;
        }
        if (((C58833ax) ((C23251a) this.f321534b.mo102370h()).f63720e).mo56113h()) {
            String str5 = (String) ((C58833ax) ((C23251a) this.f321534b.mo102370h()).f63720e).mo56107c();
            aVar.copyOnWrite();
            C89165d dVar7 = (C89165d) aVar.instance;
            str5.getClass();
            dVar7.f241739a |= 128;
            dVar7.f241747i = str5;
        }
        if (((C58833ax) ((C23251a) this.f321534b.mo102371i()).f63720e).mo56113h()) {
            String str6 = (String) ((C58833ax) ((C23251a) this.f321534b.mo102371i()).f63720e).mo56107c();
            aVar.copyOnWrite();
            C89165d dVar8 = (C89165d) aVar.instance;
            str6.getClass();
            dVar8.f241739a |= 512;
            dVar8.f241749k = str6;
        }
        if (this.f321543k.mo79746e(C90014bt.f247537iy)) {
            if (((C58833ax) ((C23251a) this.f321534b.mo102368f()).f63720e).mo56113h()) {
                String str7 = (String) ((C58833ax) ((C23251a) this.f321534b.mo102368f()).f63720e).mo56107c();
                aVar.copyOnWrite();
                C89165d dVar9 = (C89165d) aVar.instance;
                str7.getClass();
                dVar9.f241739a |= 8;
                dVar9.f241743e = str7;
            }
            if (((C58833ax) ((C23251a) this.f321534b.mo102373k()).f63720e).mo56113h()) {
                String str8 = (String) ((C58833ax) ((C23251a) this.f321534b.mo102373k()).f63720e).mo56107c();
                aVar.copyOnWrite();
                C89165d dVar10 = (C89165d) aVar.instance;
                str8.getClass();
                dVar10.f241739a |= 16;
                dVar10.f241744f = str8;
            }
        } else if (!((C58833ax) ((C23251a) this.f321534b.mo102368f()).f63720e).mo56113h() || !((C58833ax) ((C23251a) this.f321534b.mo102373k()).f63720e).mo56113h() || ((String) ((C58833ax) ((C23251a) this.f321534b.mo102368f()).f63720e).mo56107c()).isEmpty() || ((String) ((C58833ax) ((C23251a) this.f321534b.mo102373k()).f63720e).mo56107c()).isEmpty()) {
            C59104x c = f321533a.mo56225c();
            c.mo56378ag(C58975e.f156826a, "AuthController");
            ((C59052c) ((C59052c) c).mo56372aa(30211)).mo56386p("Order summary data is incomplete.");
        } else {
            C89172k kVar = (C89172k) C89173l.f241766d.createBuilder();
            String str9 = (String) ((C58833ax) ((C23251a) this.f321534b.mo102368f()).f63720e).mo56107c();
            kVar.copyOnWrite();
            C89173l lVar = (C89173l) kVar.instance;
            str9.getClass();
            lVar.f241768a |= 1;
            lVar.f241769b = str9;
            String str10 = (String) ((C58833ax) ((C23251a) this.f321534b.mo102373k()).f63720e).mo56107c();
            kVar.copyOnWrite();
            C89173l lVar2 = (C89173l) kVar.instance;
            str10.getClass();
            lVar2.f241768a |= 2;
            lVar2.f241770c = str10;
            C89173l lVar3 = (C89173l) kVar.build();
            aVar.copyOnWrite();
            C89165d dVar11 = (C89165d) aVar.instance;
            lVar3.getClass();
            dVar11.f241745g = lVar3;
            dVar11.f241739a |= 32;
        }
        ((C23186f) this.f321534b.mo102364b()).mo28624e("password", C23245b.m43556a((C89165d) aVar.build()));
        ((C23251a) this.f321534b.mo102372j()).mo28730f(true, false);
        mo102361e();
    }

    /* renamed from: iA */
    public final boolean mo28438iA() {
        return true;
    }

    /* renamed from: iB */
    public final void mo28497iB(C23028x xVar) {
        if (((C23186f) this.f321534b.mo102364b()).mo28635p(xVar)) {
            ((C23186f) this.f321534b.mo102364b()).mo28634o(xVar);
        } else {
            m192202i();
        }
    }

    /* renamed from: iD */
    public final void mo28439iD(ProtoParcelable protoParcelable) {
        C89165d dVar = (C89165d) C23245b.m43557b(protoParcelable, C89165d.f241737n.getParserForType(), C62921ba.m95368a(), true);
        if (dVar == null) {
            C59104x c = f321533a.mo56225c();
            c.mo56378ag(C58975e.f156826a, "AuthController");
            ((C59052c) ((C59052c) c).mo56372aa(30208)).mo56386p("Invalid proto sent to controller");
            return;
        }
        if ((dVar.f241739a & 256) != 0) {
            this.f321538f = C58833ax.m90834k(dVar.f241748j);
        }
        if ((dVar.f241739a & 2) != 0) {
            ((C23251a) this.f321534b.mo102369g()).mo28730f(true, false);
            ((C23251a) this.f321534b.mo102365c()).mo28730f(dVar.f241741c, false);
            if (this.f321543k.mo79746e(C90014bt.f247537iy)) {
                if ((dVar.f241739a & 8) != 0) {
                    ((C23251a) this.f321534b.mo102368f()).mo28730f(C58833ax.m90834k(dVar.f241743e), false);
                }
                if ((dVar.f241739a & 16) != 0) {
                    ((C23251a) this.f321534b.mo102373k()).mo28730f(C58833ax.m90834k(dVar.f241744f), false);
                }
            } else if ((dVar.f241739a & 32) != 0) {
                C89173l lVar = dVar.f241745g;
                if (lVar == null) {
                    lVar = C89173l.f241766d;
                }
                if ((lVar.f241768a & 1) != 0) {
                    ((C23251a) this.f321534b.mo102368f()).mo28730f(C58833ax.m90834k(lVar.f241769b), false);
                }
                if ((lVar.f241768a & 2) != 0) {
                    ((C23251a) this.f321534b.mo102373k()).mo28730f(C58833ax.m90834k(lVar.f241770c), false);
                }
            }
            if ((dVar.f241739a & 4) != 0) {
                ((C23251a) this.f321534b.mo102374l()).mo28730f(C58833ax.m90834k(dVar.f241742d), false);
            }
            if ((dVar.f241739a & 64) != 0) {
                ((C23251a) this.f321534b.mo102367e()).mo28730f(C58833ax.m90834k(dVar.f241746h), false);
            }
            if (this.f321543k.mo79746e(C90014bt.f247537iy)) {
                ((C23251a) this.f321534b.mo102366d()).mo28730f(Boolean.valueOf(!dVar.f241750l), false);
            }
            if ((dVar.f241739a & 128) != 0) {
                ((C23251a) this.f321534b.mo102370h()).mo28730f(C58833ax.m90834k(dVar.f241747i), false);
            }
            if ((dVar.f241739a & 512) != 0) {
                ((C23251a) this.f321534b.mo102371i()).mo28730f(C58833ax.m90834k(dVar.f241749k), false);
            }
            this.f321542j.mo28500a(this.f63405W, new C115958a(this));
            if (!dVar.f241740b) {
                m192202i();
            } else if (this.f321543k.mo79746e(C90014bt.f247537iy)) {
                mo102363h(!((Boolean) ((C23251a) this.f321534b.mo102366d()).f63720e).booleanValue(), C58836b.f156633a);
            } else {
                mo102363h(false, C58836b.f156633a);
            }
        } else {
            C59104x c2 = f321533a.mo56225c();
            c2.mo56378ag(C58975e.f156826a, "AuthController");
            ((C59052c) ((C59052c) c2).mo56372aa(30207)).mo56386p("Account name is required for authentication");
        }
    }

    /* renamed from: iW */
    public final void mo28499iW() {
        mo102361e();
        this.f321540h = true;
    }
}
