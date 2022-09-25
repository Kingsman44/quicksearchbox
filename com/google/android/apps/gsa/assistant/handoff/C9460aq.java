package com.google.android.apps.gsa.assistant.handoff;

import android.content.Context;
import android.content.Intent;
import com.google.android.apps.gsa.assistant.settings.features.payments.bv;
import com.google.android.apps.gsa.shared.monet.p7116h.C90332a;
import com.google.android.apps.gsa.shared.monet.p7116h.C90334c;
import com.google.android.apps.gsa.shared.p6984ai.C89161a;
import com.google.android.apps.gsa.shared.p6984ai.C89174b;
import com.google.android.apps.gsa.shared.p6984ai.C89175c;
import com.google.android.apps.gsa.shared.p6984ai.C89176d;
import com.google.android.apps.gsa.shared.p6984ai.C89177e;
import com.google.android.apps.gsa.shared.p6984ai.C89178f;
import com.google.android.apps.gsa.shared.p6984ai.C89179g;
import com.google.android.apps.gsa.shared.p6984ai.C89180h;
import com.google.android.apps.gsa.shared.p6984ai.C89181i;
import com.google.android.apps.gsa.shared.p6984ai.p6985a.C89162a;
import com.google.android.apps.gsa.shared.p6984ai.p6985a.C89165d;
import com.google.android.apps.gsa.shared.p6984ai.p6985a.C89167f;
import com.google.android.apps.gsa.shared.p6984ai.p6985a.C89170i;
import com.google.android.apps.gsa.shared.p6984ai.p6985a.C89171j;
import com.google.android.apps.gsa.shared.p6984ai.p6985a.C89172k;
import com.google.android.apps.gsa.shared.p6984ai.p6985a.C89173l;
import com.google.android.apps.gsa.shared.p7066m.C90014bt;
import com.google.android.apps.gsa.shared.p7066m.C90021c;
import com.google.android.apps.gsa.shared.util.C90730an;
import com.google.android.libraries.gsa.monet.shared.C23129y;
import com.google.android.libraries.gsa.monet.shared.ProtoParcelable;
import com.google.android.libraries.gsa.monet.tools.p1917d.p1918a.C23245b;
import com.google.assistant.p3862au.C50520d;
import com.google.assistant.p3862au.C50522f;
import com.google.assistant.p3897e.p3921j.any;
import com.google.assistant.p3897e.p3921j.anz;
import com.google.assistant.p3897e.p3921j.aoa;
import com.google.assistant.p3897e.p3921j.aoj;
import com.google.assistant.p3897e.p3921j.aol;
import com.google.assistant.p3897e.p3921j.aom;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.base.C58847bk;
import com.google.common.p4522b.C58495hd;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.protobuf.C62921ba;
import com.google.protobuf.C63062g;
import com.google.protobuf.C63070h;
import com.google.protobuf.C63088z;
import dagger.C68214a;
import p3186j$.util.Objects;

/* renamed from: com.google.android.apps.gsa.assistant.handoff.aq */
/* compiled from: PG */
public final class C9460aq extends C9444aa {

    /* renamed from: a */
    private static final C59071e f32885a = C59071e.m91332i("com.google.android.apps.gsa.assistant.handoff.aq");

    /* renamed from: b */
    private static final C9493z f32886b = C9493z.PAYMENTS_AUTH_ACTIVITY;

    /* renamed from: e */
    private final C90021c f32887e;

    /* renamed from: f */
    private final C68214a f32888f;

    public C9460aq(C68214a aVar, C90021c cVar) {
        super(f32886b);
        this.f32887e = cVar;
        this.f32888f = aVar;
    }

    /* renamed from: a */
    public final C9448ae mo17685a(int i, Intent intent) {
        C58833ax axVar;
        C58833ax axVar2;
        int a;
        if (intent == null) {
            ((C59052c) ((C59052c) f32885a.mo56225c()).mo56372aa(276)).mo56386p("No valid data to submit handoff results.");
            return C9448ae.m23970d(i);
        }
        C50520d dVar = (C50520d) C50522f.f131501d.createBuilder();
        C58833ax axVar3 = f32886b.f32952k;
        C58833ax k = intent.hasExtra("com.google.android.apps.gsa.staticplugins.paymentsauth.EXTRA_PROTO_PARCELABLE_AUTHENTICATION_RESULTS") ? C58833ax.m90834k((ProtoParcelable) intent.getParcelableExtra("com.google.android.apps.gsa.staticplugins.paymentsauth.EXTRA_PROTO_PARCELABLE_AUTHENTICATION_RESULTS")) : C58836b.f156633a;
        if (!k.mo56113h()) {
            ((C59052c) ((C59052c) C89181i.f241788a.mo56225c()).mo56372aa(11005)).mo56389s("Incomplete data to generate AuthenticationInput, data: %s", k.mo56111f());
            axVar = C58836b.f156633a;
        } else {
            C89171j jVar = (C89171j) C23245b.m43557b((ProtoParcelable) k.mo56107c(), C89171j.f241759f.getParserForType(), C62921ba.m95368a(), true);
            if (jVar == null) {
                ((C59052c) ((C59052c) C89181i.f241788a.mo56225c()).mo56372aa(11004)).mo56386p("AuthenticationOutputData is null.");
                axVar = C58836b.f156633a;
            } else {
                anz anz = (anz) aoa.f135475f.createBuilder();
                int a2 = C89170i.m145047a(jVar.f241762b);
                if (a2 == 0) {
                    a2 = 1;
                }
                C89167f fVar = C89167f.UNKNOWN_MECHANISM;
                int i2 = a2 - 1;
                if (i2 == 1) {
                    aoj aoj = (aoj) aom.f135503c.createBuilder();
                    aoj.copyOnWrite();
                    aom aom = (aom) aoj.instance;
                    aom.f135506b = 1;
                    aom.f135505a |= 1;
                    anz.copyOnWrite();
                    aoa aoa = (aoa) anz.instance;
                    aom aom2 = (aom) aoj.build();
                    aom2.getClass();
                    aoa.f135478b = aom2;
                    aoa.f135477a |= 1;
                } else if (i2 == 2) {
                    aoj aoj2 = (aoj) aom.f135503c.createBuilder();
                    aoj2.copyOnWrite();
                    aom aom3 = (aom) aoj2.instance;
                    aom3.f135506b = 2;
                    aom3.f135505a |= 1;
                    anz.copyOnWrite();
                    aoa aoa2 = (aoa) anz.instance;
                    aom aom4 = (aom) aoj2.build();
                    aom4.getClass();
                    aoa2.f135478b = aom4;
                    aoa2.f135477a |= 1;
                } else if (i2 != 3) {
                    aoj aoj3 = (aoj) aom.f135503c.createBuilder();
                    aoj3.copyOnWrite();
                    aom aom5 = (aom) aoj3.instance;
                    aom5.f135506b = 3;
                    aom5.f135505a |= 1;
                    anz.copyOnWrite();
                    aoa aoa3 = (aoa) anz.instance;
                    aom aom6 = (aom) aoj3.build();
                    aom6.getClass();
                    aoa3.f135478b = aom6;
                    aoa3.f135477a |= 1;
                } else {
                    aoj aoj4 = (aoj) aom.f135503c.createBuilder();
                    aoj4.copyOnWrite();
                    aom aom7 = (aom) aoj4.instance;
                    aom7.f135506b = 4;
                    aom7.f135505a |= 1;
                    anz.copyOnWrite();
                    aoa aoa4 = (aoa) anz.instance;
                    aom aom8 = (aom) aoj4.build();
                    aom8.getClass();
                    aoa4.f135478b = aom8;
                    aoa4.f135477a |= 1;
                }
                if ((jVar.f241761a & 2) != 0) {
                    C89167f a3 = C89167f.m145045a(jVar.f241763c);
                    if (a3 == null) {
                        a3 = C89167f.UNKNOWN_MECHANISM;
                    }
                    int ordinal = a3.ordinal();
                    if (ordinal == 1) {
                        anz.copyOnWrite();
                        aoa aoa5 = (aoa) anz.instance;
                        aoa5.f135479c = 1;
                        aoa5.f135477a |= 2;
                    } else if (ordinal != 2) {
                        anz.copyOnWrite();
                        aoa aoa6 = (aoa) anz.instance;
                        aoa6.f135479c = 0;
                        aoa6.f135477a |= 2;
                    } else {
                        anz.copyOnWrite();
                        aoa aoa7 = (aoa) anz.instance;
                        aoa7.f135479c = 2;
                        aoa7.f135477a |= 2;
                    }
                }
                if ((jVar.f241761a & 8) != 0) {
                    String str = jVar.f241765e;
                    anz.copyOnWrite();
                    aoa aoa8 = (aoa) anz.instance;
                    str.getClass();
                    aoa8.f135477a |= 8;
                    aoa8.f135481e = str;
                }
                if ((jVar.f241761a & 4) != 0) {
                    C89167f a4 = C89167f.m145045a(jVar.f241764d);
                    if (a4 == null) {
                        a4 = C89167f.UNKNOWN_MECHANISM;
                    }
                    int ordinal2 = a4.ordinal();
                    if (ordinal2 == 1) {
                        anz.copyOnWrite();
                        aoa aoa9 = (aoa) anz.instance;
                        aoa9.f135480d = 1;
                        aoa9.f135477a |= 4;
                    } else if (ordinal2 != 2) {
                        anz.copyOnWrite();
                        aoa aoa10 = (aoa) anz.instance;
                        aoa10.f135480d = 0;
                        aoa10.f135477a |= 4;
                    } else {
                        anz.copyOnWrite();
                        aoa aoa11 = (aoa) anz.instance;
                        aoa11.f135480d = 2;
                        aoa11.f135477a |= 4;
                    }
                }
                axVar = C58833ax.m90834k((aoa) anz.build());
            }
        }
        if (!axVar.mo56113h()) {
            ((C59052c) ((C59052c) f32885a.mo56225c()).mo56372aa(274)).mo56386p("No valid AuthenticationInputParam to submit handoff results.");
            return C9448ae.m23970d(i);
        }
        aoa aoa12 = (aoa) axVar.mo56107c();
        aom aom9 = aoa12.f135478b;
        if (aom9 == null) {
            aom9 = aom.f135503c;
        }
        if ((aom9.f135505a & 1) != 0) {
            aom aom10 = aoa12.f135478b;
            if (aom10 == null) {
                aom10 = aom.f135503c;
            }
            int a5 = aol.m86353a(aom10.f135506b);
            if (a5 != 0 && a5 == 2) {
                int i3 = aoa12.f135477a;
                if (!((i3 & 8) == 0 || (i3 & 4) == 0 || (a = any.m86352a(aoa12.f135480d)) == 0 || a != 2)) {
                    ((bv) this.f32888f.mo27525b()).b(aoa12.f135481e, "FINGERPRINT");
                }
            }
        }
        if (intent.hasExtra("com.google.android.apps.gsa.staticplugins.paymentsauth.EXTRA_PROTO_STRING_AUTHENTICATION_REQUEST_CLIENT_INPUT_NAME")) {
            axVar2 = C58833ax.m90834k(intent.getStringExtra("com.google.android.apps.gsa.staticplugins.paymentsauth.EXTRA_PROTO_STRING_AUTHENTICATION_REQUEST_CLIENT_INPUT_NAME"));
        } else {
            axVar2 = C58836b.f156633a;
        }
        if (axVar2.mo56113h()) {
            String str2 = (String) axVar2.mo56107c();
            dVar.copyOnWrite();
            str2.getClass();
            ((C50522f) dVar.instance).f131504b = str2;
        } else {
            dVar.copyOnWrite();
            ((C50522f) dVar.instance).f131504b = (String) ((C58847bk) axVar3).f156646a;
        }
        C63062g gVar = (C63062g) C63070h.f170215c.createBuilder();
        gVar.copyOnWrite();
        ((C63070h) gVar.instance).f170217a = "type.googleapis.com/assistant.api.client_input.AuthenticationInputParam";
        C63088z byteString = aoa12.toByteString();
        gVar.copyOnWrite();
        byteString.getClass();
        ((C63070h) gVar.instance).f170218b = byteString;
        dVar.mo53403a(C58495hd.m89900n("transactions_input_params", (C63070h) gVar.build()));
        return new C9477j(i, C58836b.f156633a, C58833ax.m90834k((C50522f) dVar.build()));
    }

    /* renamed from: b */
    public final C58833ax mo17686b(Context context, C9447ad adVar) {
        if (!this.f32887e.mo79746e(C90014bt.f247536ix)) {
            ((C59052c) ((C59052c) f32885a.mo56226d()).mo56372aa(282)).mo56386p("Handoff activity for payments auth is disabled with a flag");
            return C58836b.f156633a;
        } else if (!adVar.mo17691e("assistant-transactions", "authentication")) {
            return C58836b.f156633a;
        } else {
            C58833ax b = adVar.mo17688b("client_input_name", "client_input_name");
            C58833ax b2 = adVar.mo17687a().mo56106b(C9446ac.f32862a);
            if (!b2.mo56113h()) {
                ((C59052c) ((C59052c) f32885a.mo56225c()).mo56372aa(281)).mo56386p("Invalid account name");
                return C58836b.f156633a;
            }
            C58833ax b3 = adVar.mo17688b("title", "title");
            C58833ax b4 = adVar.mo17688b("header", "header");
            C58833ax b5 = adVar.mo17688b("sub_header", "sub_header");
            C58833ax b6 = adVar.mo17688b("fingerprint_hint", "fingerprint_hint");
            if (!this.f32887e.mo79746e(C90014bt.f247537iy)) {
                if (!b3.mo56113h()) {
                    ((C59052c) ((C59052c) f32885a.mo56226d()).mo56372aa(280)).mo56389s("Missing parameter: %s", "title");
                }
                if (!b4.mo56113h()) {
                    ((C59052c) ((C59052c) f32885a.mo56225c()).mo56372aa(279)).mo56389s("Missing parameter: %s", "header");
                    return C58836b.f156633a;
                } else if (!b5.mo56113h()) {
                    ((C59052c) ((C59052c) f32885a.mo56225c()).mo56372aa(278)).mo56389s("Missing parameter: %s", "sub_header");
                    return C58836b.f156633a;
                } else if (!b6.mo56113h()) {
                    ((C59052c) ((C59052c) f32885a.mo56226d()).mo56372aa(277)).mo56389s("Missing parameter: %s", "fingerprint_hint");
                }
            }
            C58833ax b7 = adVar.mo17688b("legal_text", "legal_text");
            C58833ax b8 = adVar.mo17688b("pw_max_try_error", "pw_max_try_error");
            C89167f fVar = adVar.mo17690d("use_fingerprint") ? C89167f.FINGERPRINT : C89167f.PASSWORD;
            C89180h hVar = new C89180h(this.f32887e);
            hVar.f241778b = C58833ax.m90834k((String) b2.mo56107c());
            hVar.f241779c = C58833ax.m90834k(fVar);
            if (this.f32887e.mo79746e(C90014bt.f247537iy)) {
                hVar.f241784h = adVar.mo17690d("enable_fingerprint_for_future_approvals_checkbox");
                Objects.requireNonNull(hVar);
                C90730an.m148190c(b4, new C9453aj(hVar));
                Objects.requireNonNull(hVar);
                C90730an.m148190c(b5, new C9454ak(hVar));
            } else {
                hVar.f241781e = C58833ax.m90833j((String) b4.mo56107c());
                hVar.f241782f = C58833ax.m90833j((String) b5.mo56107c());
            }
            Objects.requireNonNull(hVar);
            C90730an.m148190c(b, new C9455al(hVar));
            Objects.requireNonNull(hVar);
            C90730an.m148190c(b3, new C9456am(hVar));
            Objects.requireNonNull(hVar);
            C90730an.m148190c(b6, new C9457an(hVar));
            Objects.requireNonNull(hVar);
            C90730an.m148190c(b7, new C9458ao(hVar));
            Objects.requireNonNull(hVar);
            C90730an.m148190c(b8, new C9459ap(hVar));
            if (hVar.f241787k.mo79746e(C90014bt.f247537iy)) {
                if (!hVar.f241778b.mo56113h() || !hVar.f241779c.mo56113h()) {
                    throw new IllegalStateException("PaymentsAuth Intent required arguments must not be null.");
                }
            } else if (!hVar.f241778b.mo56113h() || !hVar.f241779c.mo56113h() || !hVar.f241781e.mo56113h() || !hVar.f241782f.mo56113h()) {
                throw new IllegalStateException("PaymentsAuth Intent required arguments must not be null.");
            }
            C89162a aVar = (C89162a) C89165d.f241737n.createBuilder();
            String str = (String) hVar.f241778b.mo56107c();
            aVar.copyOnWrite();
            C89165d dVar = (C89165d) aVar.instance;
            str.getClass();
            dVar.f241739a |= 2;
            dVar.f241741c = str;
            boolean equals = C89167f.PASSWORD.equals(hVar.f241779c.mo56107c());
            aVar.copyOnWrite();
            C89165d dVar2 = (C89165d) aVar.instance;
            dVar2.f241739a |= 1;
            dVar2.f241740b = equals;
            if (hVar.f241787k.mo79746e(C90014bt.f247537iy)) {
                C58833ax axVar = hVar.f241781e;
                Objects.requireNonNull(aVar);
                C90730an.m148190c(axVar, new C89161a(aVar));
                C58833ax axVar2 = hVar.f241782f;
                Objects.requireNonNull(aVar);
                C90730an.m148190c(axVar2, new C89174b(aVar));
                boolean z = hVar.f241784h;
                aVar.copyOnWrite();
                C89165d dVar3 = (C89165d) aVar.instance;
                dVar3.f241739a |= 1024;
                dVar3.f241750l = !z;
            } else {
                C89172k kVar = (C89172k) C89173l.f241766d.createBuilder();
                String str2 = (String) hVar.f241781e.mo56107c();
                kVar.copyOnWrite();
                C89173l lVar = (C89173l) kVar.instance;
                str2.getClass();
                lVar.f241768a |= 1;
                lVar.f241769b = str2;
                String str3 = (String) hVar.f241782f.mo56107c();
                kVar.copyOnWrite();
                C89173l lVar2 = (C89173l) kVar.instance;
                str3.getClass();
                lVar2.f241768a |= 2;
                lVar2.f241770c = str3;
                C89173l lVar3 = (C89173l) kVar.build();
                aVar.copyOnWrite();
                C89165d dVar4 = (C89165d) aVar.instance;
                lVar3.getClass();
                dVar4.f241745g = lVar3;
                dVar4.f241739a |= 32;
            }
            C58833ax axVar3 = hVar.f241777a;
            Objects.requireNonNull(aVar);
            C90730an.m148190c(axVar3, new C89175c(aVar));
            C58833ax axVar4 = hVar.f241780d;
            Objects.requireNonNull(aVar);
            C90730an.m148190c(axVar4, new C89176d(aVar));
            C58833ax axVar5 = hVar.f241783g;
            Objects.requireNonNull(aVar);
            C90730an.m148190c(axVar5, new C89177e(aVar));
            C58833ax axVar6 = hVar.f241785i;
            Objects.requireNonNull(aVar);
            C90730an.m148190c(axVar6, new C89178f(aVar));
            C58833ax axVar7 = hVar.f241786j;
            Objects.requireNonNull(aVar);
            C90730an.m148190c(axVar7, new C89179g(aVar));
            Intent a = C90334c.m146886a(C90332a.DEFAULT.f252281i, new C23129y("payments_auth", "authentication"), C23245b.m43556a((C89165d) aVar.build()));
            a.setClassName("com.google.android.googlequicksearchbox", "com.google.android.apps.gsa.monet.paymentsauth.PaymentsAuthActivity");
            return C58833ax.m90834k(a);
        }
    }
}
