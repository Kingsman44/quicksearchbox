package com.google.android.apps.gsa.search.core.google.p6795e;

import com.google.android.apps.gsa.assistant.settings.features.payments.bv;
import com.google.android.apps.gsa.search.core.google.gaia.C86054o;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.shared.p7066m.C90014bt;
import com.google.android.apps.gsa.shared.p7144t.p7145a.C90610a;
import com.google.android.apps.gsa.shared.search.Query;
import com.google.android.apps.gsa.shared.util.p7158b.C90748e;
import com.google.android.apps.gsa.shared.util.p7159c.C90877ak;
import com.google.assistant.p3897e.p3917i.p3918a.C51610ob;
import com.google.assistant.p3897e.p3917i.p3918a.C51611oc;
import com.google.assistant.p3897e.p3917i.p3918a.C51613oe;
import com.google.assistant.p3897e.p3917i.p3918a.C51614of;
import com.google.assistant.p3897e.p3917i.p3918a.C51615og;
import com.google.assistant.p3897e.p3921j.C52228jz;
import com.google.assistant.p3897e.p3921j.C52230ka;
import com.google.assistant.p3897e.p3921j.C52231kb;
import com.google.assistant.p3897e.p3921j.C52232kc;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.protobuf.C63088z;
import dagger.C68214a;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* renamed from: com.google.android.apps.gsa.search.core.google.e.a */
/* compiled from: PG */
public final class C85977a {

    /* renamed from: a */
    public static final C59071e f232484a = C59071e.m91332i("com.google.android.apps.gsa.search.core.google.e.a");

    /* renamed from: b */
    public final C68214a f232485b;

    /* renamed from: c */
    private final C86124t f232486c;

    /* renamed from: d */
    private final C68214a f232487d;

    /* renamed from: e */
    private final C68214a f232488e;

    public C85977a(C86124t tVar, C68214a aVar, C68214a aVar2, C68214a aVar3) {
        this.f232486c = tVar;
        this.f232488e = aVar2;
        this.f232487d = aVar;
        this.f232485b = aVar3;
    }

    /* renamed from: a */
    public static C52232kc m138225a(C51611oc ocVar) {
        C52231kb kbVar = (C52231kb) C52232kc.f137062d.createBuilder();
        kbVar.copyOnWrite();
        C52232kc kcVar = (C52232kc) kbVar.instance;
        kcVar.f137064a |= 1;
        kcVar.f137065b = "asst.transactions.params";
        C52228jz jzVar = (C52228jz) C52230ka.f137057d.createBuilder();
        jzVar.copyOnWrite();
        C52230ka kaVar = (C52230ka) jzVar.instance;
        kaVar.f137059a |= 1;
        kaVar.f137060b = "assistant.api.params.TransactionsParams";
        C63088z byteString = ocVar.toByteString();
        jzVar.copyOnWrite();
        C52230ka kaVar2 = (C52230ka) jzVar.instance;
        byteString.getClass();
        kaVar2.f137059a |= 2;
        kaVar2.f137061c = byteString;
        C52230ka kaVar3 = (C52230ka) jzVar.build();
        kbVar.copyOnWrite();
        C52232kc kcVar2 = (C52232kc) kbVar.instance;
        kaVar3.getClass();
        kcVar2.f137066c = kaVar3;
        kcVar2.f137064a |= 2;
        return (C52232kc) kbVar.build();
    }

    /* renamed from: d */
    public static void m138226d(C51610ob obVar, byte[] bArr) {
        C58976aa aaVar = C58975e.f156826a;
        int length = bArr.length;
        C63088z A = C63088z.m96139A(bArr);
        obVar.copyOnWrite();
        C51611oc ocVar = (C51611oc) obVar.instance;
        C51611oc ocVar2 = C51611oc.f134505d;
        ocVar.f134507a |= 2;
        ocVar.f134509c = A;
    }

    /* renamed from: b */
    public final C52232kc mo79632b(Query query) {
        C51610ob obVar = (C51610ob) C51611oc.f134505d.createBuilder();
        mo79634e(obVar);
        C58833ax c = mo79633c(query);
        if (c.mo56113h()) {
            m138226d(obVar, (byte[]) c.mo56107c());
        }
        return m138225a((C51611oc) obVar.build());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final C58833ax mo79633c(Query query) {
        C90748e.m148224b();
        C58836b bVar = C58836b.f156633a;
        if (!mo79635f()) {
            return bVar;
        }
        C60870cx a = ((C90610a) ((C58833ax) this.f232485b.mo27525b()).mo56107c()).mo84759a();
        if (a.isDone()) {
            try {
                return C58833ax.m90834k((byte[]) C60856cj.m92909r(a));
            } catch (ExecutionException e) {
                C59104x c = f232484a.mo56225c();
                c.mo56378ag(C58975e.f156826a, "TransactionsProtoFiller");
                ((C59052c) ((C59052c) ((C59052c) c).mo56382g(e)).mo56372aa(8181)).mo56386p("Client token done future failed");
                return bVar;
            }
        } else if (query.mo84393cZ() && this.f232486c.mo79746e(C90014bt.f247817od)) {
            try {
                return C58833ax.m90834k((byte[]) C90877ak.m148473g(a, 200, TimeUnit.MILLISECONDS));
            } catch (InterruptedException | ExecutionException | TimeoutException e2) {
                C59104x c2 = f232484a.mo56225c();
                c2.mo56378ag(C58975e.f156826a, "TransactionsProtoFiller");
                ((C59052c) ((C59052c) ((C59052c) c2).mo56382g(e2)).mo56372aa(8180)).mo56386p("Failed to add a Wallet client token to AssistantRequest for typed query");
                return bVar;
            }
        } else if (!query.mo84374cG()) {
            return bVar;
        } else {
            try {
                return C58833ax.m90834k((byte[]) C90877ak.m148473g(a, 200, TimeUnit.MILLISECONDS));
            } catch (InterruptedException | ExecutionException | TimeoutException e3) {
                C59104x c3 = f232484a.mo56225c();
                c3.mo56378ag(C58975e.f156826a, "TransactionsProtoFiller");
                ((C59052c) ((C59052c) ((C59052c) c3).mo56382g(e3)).mo56372aa(8179)).mo56386p("Failed to add a Wallet client token to AssistantRequestfor notification announcement");
                return bVar;
            }
        }
    }

    /* renamed from: e */
    public final void mo79634e(C51610ob obVar) {
        C51613oe oeVar;
        String F = ((C86054o) this.f232487d.mo27525b()).mo79659F();
        if (F != null) {
            C51614of ofVar = (C51614of) C51615og.f134516c.createBuilder();
            String a = ((bv) this.f232488e.mo27525b()).a(F);
            if ("FINGERPRINT".equals(a)) {
                oeVar = C51613oe.FINGERPRINT;
            } else {
                if (!"PASSWORD".equals(a)) {
                    C59104x c = f232484a.mo56225c();
                    c.mo56378ag(C58975e.f156826a, "TransactionsProtoFiller");
                    ((C59052c) ((C59052c) c).mo56372aa(8178)).mo56389s("Unknown AuthMechanism retrieved. %s", a);
                }
                oeVar = C51613oe.PASSWORD;
            }
            ofVar.copyOnWrite();
            C51615og ogVar = (C51615og) ofVar.instance;
            ogVar.f134519b = oeVar.f134515d;
            ogVar.f134518a |= 2;
            C51615og ogVar2 = (C51615og) ofVar.build();
            obVar.copyOnWrite();
            C51611oc ocVar = (C51611oc) obVar.instance;
            C51611oc ocVar2 = C51611oc.f134505d;
            ogVar2.getClass();
            ocVar.f134508b = ogVar2;
            ocVar.f134507a |= 1;
        }
    }

    /* renamed from: f */
    public final boolean mo79635f() {
        return ((C58833ax) this.f232485b.mo27525b()).mo56113h();
    }
}
