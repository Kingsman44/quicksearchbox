package com.google.android.apps.gsa.staticplugins.accl.performers;

import com.google.android.libraries.assistant.p1533o.C18450am;
import com.google.android.libraries.assistant.p1533o.C18451an;
import com.google.android.libraries.assistant.p1533o.C18452ao;
import com.google.android.libraries.assistant.p1533o.C18454aq;
import com.google.android.libraries.assistant.p1533o.C18502t;
import com.google.android.libraries.assistant.p1533o.C18503u;
import com.google.apps.tiktok.account.AccountId;
import com.google.common.base.C58833ax;
import com.google.common.p4526f.C59052c;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;
import com.google.protobuf.C62972cr;
import com.google.protobuf.C63088z;
import p5488io.grpc.p5533i.C70862aj;

/* renamed from: com.google.android.apps.gsa.staticplugins.accl.performers.bk */
/* compiled from: PG */
public final /* synthetic */ class C92907bk implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C92915bs f259189a;

    /* renamed from: b */
    public final /* synthetic */ AccountId f259190b;

    /* renamed from: c */
    public final /* synthetic */ String f259191c;

    /* renamed from: d */
    public final /* synthetic */ C63088z f259192d;

    /* renamed from: e */
    public final /* synthetic */ C63088z f259193e;

    public /* synthetic */ C92907bk(C92915bs bsVar, AccountId accountId, String str, C63088z zVar, C63088z zVar2) {
        this.f259189a = bsVar;
        this.f259190b = accountId;
        this.f259191c = str;
        this.f259192d = zVar;
        this.f259193e = zVar2;
    }

    public final C60870cx apply(Object obj) {
        C92915bs bsVar = this.f259189a;
        AccountId accountId = this.f259190b;
        String str = this.f259191c;
        C63088z zVar = this.f259192d;
        C63088z zVar2 = this.f259193e;
        C70862aj e = bsVar.mo87479e(accountId);
        e.mo20123c(bsVar.mo87477b(str, (C58833ax) obj));
        C18452ao aoVar = (C18452ao) C18454aq.f52369c.createBuilder();
        C18502t tVar = (C18502t) C18503u.f52450f.createBuilder();
        C18450am amVar = (C18450am) C18451an.f52363e.createBuilder();
        amVar.copyOnWrite();
        C18451an anVar = (C18451an) amVar.instance;
        C18451an.checkByteStringIsUtf8(zVar);
        anVar.mo23992a();
        anVar.f52365a.add(zVar.mo59170I(C62972cr.f170009a));
        tVar.copyOnWrite();
        C18451an anVar2 = (C18451an) amVar.build();
        anVar2.getClass();
        ((C18503u) tVar.instance).f52452a = anVar2;
        aoVar.copyOnWrite();
        C18454aq aqVar = (C18454aq) aoVar.instance;
        C18503u uVar = (C18503u) tVar.build();
        uVar.getClass();
        aqVar.f52372b = uVar;
        aqVar.f52371a = 1;
        e.mo20123c((C18454aq) aoVar.build());
        e.mo20123c(C92915bs.m152965c(zVar2));
        e.mo20121a();
        ((C59052c) ((C59052c) C92915bs.f259214a.mo56224b()).mo56372aa(13130)).mo56386p("SRP HTML streaming to TNG:GA finished successfully.");
        return C92915bs.f62144n;
    }
}
