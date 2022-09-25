package com.google.android.apps.gsa.staticplugins.paymentsauth.p8670c;

import android.content.Intent;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88199sv;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88200sw;
import com.google.android.apps.gsa.shared.p6984ai.p6985a.C89167f;
import com.google.android.apps.gsa.shared.p6984ai.p6985a.C89168g;
import com.google.android.apps.gsa.shared.p6984ai.p6985a.C89171j;
import com.google.android.apps.gsa.shared.util.p7159c.C90877ak;
import com.google.android.apps.gsa.shared.util.p7159c.C90919bp;
import com.google.android.libraries.gsa.monet.tools.model.shared.p1924b.C23251a;
import com.google.android.libraries.gsa.monet.tools.p1917d.p1918a.C23245b;
import com.google.common.p4526f.C59052c;
import java.util.concurrent.ExecutionException;

/* renamed from: com.google.android.apps.gsa.staticplugins.paymentsauth.c.l */
/* compiled from: PG */
public final /* synthetic */ class C115969l implements C90919bp {

    /* renamed from: a */
    public final /* synthetic */ C115973p f321581a;

    public /* synthetic */ C115969l(C115973p pVar) {
        this.f321581a = pVar;
    }

    /* renamed from: a */
    public final void mo17870a(Object obj) {
        C115973p pVar = this.f321581a;
        C88200sw swVar = (C88200sw) obj;
        if (!pVar.f321593g) {
            if (swVar == null) {
                ((C59052c) ((C59052c) C115973p.f321587a.mo56225c()).mo56372aa(30217)).mo56386p("Reauth result is null");
                pVar.mo102387e();
                return;
            }
            int a = C88199sv.m142791a(swVar.f238421b);
            if (a == 0) {
                a = 1;
            }
            int i = a - 1;
            if (i == 1) {
                C89168g gVar = (C89168g) C89171j.f241759f.createBuilder();
                gVar.copyOnWrite();
                C89171j jVar = (C89171j) gVar.instance;
                jVar.f241762b = 1;
                jVar.f241761a = 1 | jVar.f241761a;
                C89167f fVar = C89167f.PASSWORD;
                gVar.copyOnWrite();
                C89171j jVar2 = (C89171j) gVar.instance;
                jVar2.f241763c = fVar.f241757d;
                jVar2.f241761a |= 2;
                if (!((String) ((C23251a) pVar.f321588b.mo102375b()).f63720e).isEmpty()) {
                    String str = (String) ((C23251a) pVar.f321588b.mo102375b()).f63720e;
                    gVar.copyOnWrite();
                    C89171j jVar3 = (C89171j) gVar.instance;
                    str.getClass();
                    jVar3.f241761a |= 8;
                    jVar3.f241765e = str;
                }
                if (((Boolean) ((C23251a) pVar.f321588b.mo102378e()).f63720e).booleanValue()) {
                    C89167f fVar2 = C89167f.FINGERPRINT;
                    gVar.copyOnWrite();
                    C89171j jVar4 = (C89171j) gVar.instance;
                    jVar4.f241764d = fVar2.f241757d;
                    jVar4.f241761a |= 4;
                }
                if (((Integer) ((C23251a) pVar.f321588b.mo102379f()).f63720e).intValue() == 3) {
                    try {
                        C90877ak.m148472f(pVar.f321591e.mo79063c());
                    } catch (InterruptedException | ExecutionException e) {
                        ((C59052c) ((C59052c) ((C59052c) C115973p.f321587a.mo56225c()).mo56382g(e)).mo56372aa(30220)).mo56386p("Exception resetting biometric/fingerprint key.");
                    }
                }
                Intent intent = new Intent();
                if (pVar.f321592f.mo56113h()) {
                    intent.putExtra("com.google.android.apps.gsa.staticplugins.paymentsauth.EXTRA_PROTO_STRING_AUTHENTICATION_REQUEST_CLIENT_INPUT_NAME", (String) pVar.f321592f.mo56107c());
                }
                intent.putExtra("com.google.android.apps.gsa.staticplugins.paymentsauth.EXTRA_PROTO_PARCELABLE_AUTHENTICATION_RESULTS", C23245b.m43556a((C89171j) gVar.build()));
                pVar.f321595i.mo80936b(-1, intent);
            } else if (i != 2) {
                pVar.mo102387e();
            } else {
                ((C23251a) pVar.f321588b.mo102386m()).mo28730f(Integer.valueOf(((Integer) ((C23251a) pVar.f321588b.mo102386m()).f63720e).intValue() + 1), false);
                if (((Integer) ((C23251a) pVar.f321588b.mo102386m()).f63720e).intValue() >= 5) {
                    C89168g gVar2 = (C89168g) C89171j.f241759f.createBuilder();
                    gVar2.copyOnWrite();
                    C89171j jVar5 = (C89171j) gVar2.instance;
                    jVar5.f241762b = 2;
                    jVar5.f241761a = 1 | jVar5.f241761a;
                    C89167f fVar3 = C89167f.PASSWORD;
                    gVar2.copyOnWrite();
                    C89171j jVar6 = (C89171j) gVar2.instance;
                    jVar6.f241763c = fVar3.f241757d;
                    jVar6.f241761a |= 2;
                    C89171j jVar7 = (C89171j) gVar2.build();
                    Intent intent2 = new Intent();
                    if (pVar.f321592f.mo56113h()) {
                        intent2.putExtra("com.google.android.apps.gsa.staticplugins.paymentsauth.EXTRA_PROTO_STRING_AUTHENTICATION_REQUEST_CLIENT_INPUT_NAME", (String) pVar.f321592f.mo56107c());
                    }
                    intent2.putExtra("com.google.android.apps.gsa.staticplugins.paymentsauth.EXTRA_PROTO_PARCELABLE_AUTHENTICATION_RESULTS", C23245b.m43556a(jVar7));
                    pVar.f321595i.mo80936b(0, intent2);
                }
            }
        }
    }
}
