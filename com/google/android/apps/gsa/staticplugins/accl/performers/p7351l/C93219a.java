package com.google.android.apps.gsa.staticplugins.accl.performers.p7351l;

import android.content.Context;
import android.content.Intent;
import com.google.android.apps.search.assistant.verticals.contextdebug.p10038a.C132026a;
import com.google.apps.tiktok.account.AccountId;
import com.google.apps.tiktok.account.api.controller.C45963aa;
import com.google.assistant.p3863av.p3867b.p3868a.p3869a.C50540h;
import com.google.assistant.p3897e.p3921j.C51810dz;
import com.google.assistant.p3897e.p3921j.C52070ec;
import com.google.assistant.p3897e.p3921j.C52233kd;
import com.google.assistant.p3897e.p3921j.C52235kf;
import com.google.assistant.p3897e.p3921j.C52236kg;
import com.google.assistant.p3897e.p3921j.p3926e.C51827ao;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62942bv;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.google.android.apps.gsa.staticplugins.accl.performers.l.a */
/* compiled from: PG */
public final /* synthetic */ class C93219a implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C93220b f259965a;

    /* renamed from: b */
    public final /* synthetic */ C51827ao f259966b;

    public /* synthetic */ C93219a(C93220b bVar, C51827ao aoVar) {
        this.f259965a = bVar;
        this.f259966b = aoVar;
    }

    public final C60870cx apply(Object obj) {
        Object obj2;
        C93220b bVar = this.f259965a;
        C51827ao aoVar = this.f259966b;
        AccountId accountId = (AccountId) obj;
        C132026a aVar = bVar.f259967a;
        C62940bt r2 = C62942bv.checkIsLite(C50540h.f131535i);
        aoVar.mo58887l(r2);
        if (!aoVar.f169962ag.mo58857o(r2.f169971d)) {
            C51810dz dzVar = (C51810dz) C52070ec.f136651d.createBuilder();
            C52233kd kdVar = (C52233kd) C52236kg.f137089d.createBuilder();
            C52235kf kfVar = C52235kf.INVALID_ARGUMENT;
            kdVar.copyOnWrite();
            C52236kg kgVar = (C52236kg) kdVar.instance;
            kgVar.f137092b = kfVar.f137088t;
            kgVar.f137091a |= 1;
            dzVar.copyOnWrite();
            C52070ec ecVar = (C52070ec) dzVar.instance;
            C52236kg kgVar2 = (C52236kg) kdVar.build();
            kgVar2.getClass();
            ecVar.f136654b = kgVar2;
            ecVar.f136653a |= 1;
            return C60856cj.m92900i((C52070ec) dzVar.build());
        }
        C62940bt r22 = C62942bv.checkIsLite(C50540h.f131535i);
        aoVar.mo58887l(r22);
        Object l = aoVar.f169962ag.mo58854l(r22.f169971d);
        if (l == null) {
            obj2 = r22.f169969b;
        } else {
            obj2 = r22.mo58889c(l);
        }
        AtomicReference atomicReference = aVar.f360382b;
        HashMap hashMap = new HashMap();
        hashMap.put(accountId, (C50540h) obj2);
        atomicReference.set(hashMap);
        Intent addFlags = new Intent().setClassName(aVar.f360381a, "com.google.android.apps.search.assistant.verticals.contextdebug.ContextDebugActivity").addFlags(268435456);
        Context context = aVar.f360381a;
        C45963aa.m82131a(addFlags, accountId);
        context.startActivity(addFlags);
        C51810dz dzVar2 = (C51810dz) C52070ec.f136651d.createBuilder();
        C52233kd kdVar2 = (C52233kd) C52236kg.f137089d.createBuilder();
        C52235kf kfVar2 = C52235kf.OK;
        kdVar2.copyOnWrite();
        C52236kg kgVar3 = (C52236kg) kdVar2.instance;
        kgVar3.f137092b = kfVar2.f137088t;
        kgVar3.f137091a |= 1;
        dzVar2.copyOnWrite();
        C52070ec ecVar2 = (C52070ec) dzVar2.instance;
        C52236kg kgVar4 = (C52236kg) kdVar2.build();
        kgVar4.getClass();
        ecVar2.f136654b = kgVar4;
        ecVar2.f136653a |= 1;
        return C60856cj.m92900i((C52070ec) dzVar2.build());
    }
}
