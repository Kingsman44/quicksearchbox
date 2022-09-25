package com.google.android.apps.gsa.staticplugins.paymentsauth.p8670c;

import android.accounts.Account;
import android.content.Intent;
import android.os.Parcelable;
import com.google.android.apps.gsa.search.core.google.gaia.C86054o;
import com.google.android.apps.gsa.search.core.p6519al.p6644cf.C85084a;
import com.google.android.apps.gsa.search.core.p6519al.p6753q.C85552a;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.search.core.p6884y.C87290c;
import com.google.android.apps.gsa.shared.p6984ai.p6985a.C89164c;
import com.google.android.apps.gsa.shared.p6984ai.p6985a.C89165d;
import com.google.android.apps.gsa.shared.p6984ai.p6985a.C89167f;
import com.google.android.apps.gsa.shared.p6984ai.p6985a.C89168g;
import com.google.android.apps.gsa.shared.p6984ai.p6985a.C89171j;
import com.google.android.apps.gsa.shared.p6984ai.p6985a.C89173l;
import com.google.android.apps.gsa.shared.p7066m.C90014bt;
import com.google.android.apps.gsa.shared.util.debug.C91032p;
import com.google.android.apps.gsa.shared.util.p7159c.C90873ag;
import com.google.android.apps.gsa.staticplugins.paymentsauth.p8669b.C115957b;
import com.google.android.apps.gsa.staticplugins.paymentsauth.p8671d.C115976b;
import com.google.android.libraries.gsa.monet.service.C23052c;
import com.google.android.libraries.gsa.monet.service.C23056g;
import com.google.android.libraries.gsa.monet.shared.ProtoParcelable;
import com.google.android.libraries.gsa.monet.tools.model.shared.p1924b.C23251a;
import com.google.android.libraries.gsa.monet.tools.p1917d.p1918a.C23245b;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.base.C58838bb;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60870cx;
import com.google.protobuf.C62921ba;
import dagger.C68214a;

/* renamed from: com.google.android.apps.gsa.staticplugins.paymentsauth.c.p */
/* compiled from: PG */
public final class C115973p extends C23056g {

    /* renamed from: a */
    public static final C59071e f321587a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.paymentsauth.c.p");

    /* renamed from: b */
    public final C115976b f321588b;

    /* renamed from: c */
    public final C22871g f321589c;

    /* renamed from: d */
    public final C85084a f321590d;

    /* renamed from: e */
    public final C85552a f321591e;

    /* renamed from: f */
    public C58833ax f321592f;

    /* renamed from: g */
    public boolean f321593g = false;

    /* renamed from: h */
    C58833ax f321594h;

    /* renamed from: i */
    public final C87290c f321595i;

    /* renamed from: j */
    private final C68214a f321596j;

    /* renamed from: k */
    private final C86124t f321597k;

    public C115973p(C23052c cVar, C115976b bVar, C68214a aVar, C22871g gVar, C85084a aVar2, C85552a aVar3, C87290c cVar2, C86124t tVar) {
        super(cVar);
        C58836b bVar2 = C58836b.f156633a;
        this.f321592f = bVar2;
        this.f321594h = bVar2;
        this.f321588b = bVar;
        this.f321596j = aVar;
        this.f321589c = gVar;
        this.f321590d = aVar2;
        this.f321591e = aVar3;
        this.f321595i = cVar2;
        this.f321597k = tVar;
    }

    /* renamed from: N */
    public final void mo28493N(String str, String str2, Parcelable parcelable) {
        if (!"CLICK".equals(str)) {
            return;
        }
        if ("AUTHORIZE_BUTTON".equals(str2)) {
            C58838bb.m90883r(parcelable instanceof ProtoParcelable);
            C115957b bVar = (C115957b) C23245b.m43557b((ProtoParcelable) parcelable, C115957b.f321524c.getParserForType(), C62921ba.m95368a(), true);
            bVar.getClass();
            Account w = ((C86054o) this.f321596j.mo27525b()).mo79689w((String) ((C23251a) this.f321588b.mo102375b()).f63720e);
            if (w == null) {
                ((C59052c) ((C59052c) f321587a.mo56225c()).mo56372aa(30219)).mo56386p("Account is null, can't do reauth");
                mo102387e();
                return;
            }
            new C90873ag(((C86054o) this.f321596j.mo27525b()).mo79671e("oauth2:https://www.googleapis.com/auth/accounts.reauth", w, new C91032p()), this.f321589c, "call reauth worker", new C115971n(this, w, bVar)).mo85223a(new C115972o(this));
        } else if ("CANCEL_BUTTON".equals(str2)) {
            C89168g gVar = (C89168g) C89171j.f241759f.createBuilder();
            gVar.copyOnWrite();
            C89171j jVar = (C89171j) gVar.instance;
            jVar.f241762b = 3;
            jVar.f241761a = 1 | jVar.f241761a;
            C89167f fVar = C89167f.PASSWORD;
            gVar.copyOnWrite();
            C89171j jVar2 = (C89171j) gVar.instance;
            jVar2.f241763c = fVar.f241757d;
            jVar2.f241761a |= 2;
            C89171j jVar3 = (C89171j) gVar.build();
            Intent intent = new Intent();
            if (this.f321592f.mo56113h()) {
                intent.putExtra("com.google.android.apps.gsa.staticplugins.paymentsauth.EXTRA_PROTO_STRING_AUTHENTICATION_REQUEST_CLIENT_INPUT_NAME", (String) this.f321592f.mo56107c());
            }
            intent.putExtra("com.google.android.apps.gsa.staticplugins.paymentsauth.EXTRA_PROTO_PARCELABLE_AUTHENTICATION_RESULTS", C23245b.m43556a(jVar3));
            this.f321595i.mo80936b(0, intent);
        } else if ("FINGERPRINT_CHECKBOX_CHECKED".equals(str2)) {
            ((C23251a) this.f321588b.mo102378e()).mo28730f(true, false);
        } else if ("FINGERPRINT_CHECKBOX_UNCHECKED".equals(str2)) {
            ((C23251a) this.f321588b.mo102378e()).mo28730f(false, false);
        }
    }

    /* renamed from: e */
    public final void mo102387e() {
        ((C23251a) this.f321588b.mo102383j()).mo28730f(true, false);
    }

    /* renamed from: iD */
    public final void mo28439iD(ProtoParcelable protoParcelable) {
        ((C23251a) this.f321588b.mo102376c()).mo28730f(Boolean.valueOf(this.f321597k.mo79746e(C90014bt.f247537iy)), false);
        C89165d dVar = (C89165d) C23245b.m43557b(protoParcelable, C89165d.f241737n.getParserForType(), C62921ba.m95368a(), true);
        if (dVar == null) {
            ((C59052c) ((C59052c) f321587a.mo56225c()).mo56372aa(30222)).mo56386p("Invalid proto sent to controller");
            return;
        }
        if ((dVar.f241739a & 256) != 0) {
            this.f321592f = C58833ax.m90834k(dVar.f241748j);
        }
        if ((dVar.f241739a & 2) != 0) {
            ((C23251a) this.f321588b.mo102375b()).mo28730f(dVar.f241741c, false);
            if (this.f321597k.mo79746e(C90014bt.f247537iy)) {
                if ((dVar.f241739a & 8) != 0) {
                    ((C23251a) this.f321588b.mo102380g()).mo28730f(C58833ax.m90834k(dVar.f241743e), false);
                }
                if ((dVar.f241739a & 16) != 0) {
                    ((C23251a) this.f321588b.mo102384k()).mo28730f(C58833ax.m90834k(dVar.f241744f), false);
                }
            } else if ((dVar.f241739a & 32) != 0) {
                C89173l lVar = dVar.f241745g;
                if (lVar == null) {
                    lVar = C89173l.f241766d;
                }
                if ((lVar.f241768a & 1) != 0) {
                    ((C23251a) this.f321588b.mo102380g()).mo28730f(C58833ax.m90834k(lVar.f241769b), false);
                }
                if ((lVar.f241768a & 2) != 0) {
                    ((C23251a) this.f321588b.mo102384k()).mo28730f(C58833ax.m90834k(lVar.f241770c), false);
                }
            }
            if ((dVar.f241739a & 4) != 0) {
                ((C23251a) this.f321588b.mo102385l()).mo28730f(C58833ax.m90834k(dVar.f241742d), false);
            }
            if (dVar.f241750l) {
                ((C23251a) this.f321588b.mo102377d()).mo28730f(false, false);
            } else if (!this.f321594h.mo56113h()) {
                C58833ax k = C58833ax.m90834k(this.f321591e.mo79061a());
                this.f321594h = k;
                new C90873ag((C60870cx) k.mo56107c(), this.f321589c, "call fingerprint availability", new C115967j(this)).mo85223a(new C115968k(this));
            }
            if ((dVar.f241739a & 2048) != 0) {
                C23251a aVar = (C23251a) this.f321588b.mo102379f();
                C89164c a = C89164c.m145043a(dVar.f241751m);
                if (a == null) {
                    a = C89164c.UNKNOWN_REASON;
                }
                aVar.mo28730f(Integer.valueOf(a.f241736f), false);
            }
            if ((dVar.f241739a & 128) != 0) {
                ((C23251a) this.f321588b.mo102381h()).mo28730f(C58833ax.m90834k(dVar.f241747i), false);
            }
            if ((dVar.f241739a & 512) != 0) {
                ((C23251a) this.f321588b.mo102382i()).mo28730f(C58833ax.m90834k(dVar.f241749k), false);
                return;
            }
            return;
        }
        ((C59052c) ((C59052c) f321587a.mo56225c()).mo56372aa(30221)).mo56386p("Account name is required for authentication");
    }

    /* renamed from: iW */
    public final void mo28499iW() {
        this.f321593g = true;
    }
}
