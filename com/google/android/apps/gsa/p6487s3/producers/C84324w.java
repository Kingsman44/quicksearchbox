package com.google.android.apps.gsa.p6487s3.producers;

import com.google.android.apps.gsa.search.core.google.p6795e.C85977a;
import com.google.android.apps.gsa.search.core.p6809l.C86159h;
import com.google.android.apps.gsa.shared.logger.p7054d.C89885b;
import com.google.android.apps.gsa.shared.util.p7159c.C90882ap;
import com.google.assistant.p3897e.p3917i.p3918a.C51610ob;
import com.google.assistant.p3897e.p3917i.p3918a.C51611oc;
import com.google.assistant.p3897e.p3921j.C52090ew;
import com.google.assistant.p3897e.p3921j.C52091ex;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.knowledge.p4671b.C61817j;
import com.google.knowledge.p4671b.C61818k;

/* renamed from: com.google.android.apps.gsa.s3.producers.w */
/* compiled from: PG */
final class C84324w extends C90882ap {

    /* renamed from: a */
    final /* synthetic */ C86159h f229486a;

    /* renamed from: b */
    final /* synthetic */ C85977a f229487b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C84324w(C86159h hVar, C85977a aVar) {
        super("maybeUpdateTransactionsParams", 16);
        this.f229486a = hVar;
        this.f229487b = aVar;
    }

    public final /* synthetic */ Object apply(Object obj) {
        byte[] bArr = (byte[]) obj;
        C61817j jVar = (C61817j) this.f229486a.mo79795e(false).toBuilder();
        if (bArr == null || bArr.length == 0) {
            C59104x c = C84327z.f229493a.mo56225c();
            c.mo56378ag(C58975e.f156826a, "S3RequestUpdatesSchdlr");
            ((C59052c) ((C59052c) c).mo56372aa(7252)).mo56386p("Wallet client token is null or of length 0");
            return (C61818k) jVar.build();
        }
        C58976aa aaVar = C58975e.f156826a;
        C52091ex exVar = ((C61818k) jVar.instance).f167015o;
        if (exVar == null) {
            exVar = C52091ex.f136710b;
        }
        C52090ew ewVar = (C52090ew) exVar.toBuilder();
        C85977a aVar = this.f229487b;
        C51610ob obVar = (C51610ob) C51611oc.f134505d.createBuilder();
        aVar.mo79634e(obVar);
        C85977a.m138226d(obVar, bArr);
        ewVar.mo53792e(C85977a.m138225a((C51611oc) obVar.build()));
        jVar.copyOnWrite();
        C61818k kVar = (C61818k) jVar.instance;
        C52091ex exVar2 = (C52091ex) ewVar.build();
        exVar2.getClass();
        kVar.f167015o = exVar2;
        kVar.f167001a |= C89885b.HTTP_VALUE;
        return (C61818k) jVar.build();
    }
}
