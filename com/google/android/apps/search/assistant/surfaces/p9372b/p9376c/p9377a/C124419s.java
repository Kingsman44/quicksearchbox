package com.google.android.apps.search.assistant.surfaces.p9372b.p9376c.p9377a;

import com.google.android.apps.gsa.p8867w.p8875e.C118784a;
import com.google.android.apps.gsa.p8867w.p8875e.C118786c;
import com.google.android.apps.search.assistant.platform.p9141h.p9148c.C121011a;
import com.google.android.libraries.search.assistant.p2517f.p2518a.p2519a.C32597b;
import com.google.android.libraries.search.assistant.p2517f.p2518a.p2519a.C32601f;
import com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32788aj;
import com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32796ar;
import com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32810be;
import com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32835cc;
import com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32836cd;
import com.google.android.libraries.search.assistant.p2585i.C33476a;
import com.google.android.libraries.search.assistant.p2828y.p2850k.C36982a;
import com.google.android.libraries.search.assistant.p2828y.p2850k.C36991j;
import com.google.android.libraries.search.p3047m.p3050b.C39226b;
import com.google.apps.tiktok.account.AccountId;
import com.google.apps.tiktok.account.data.p3611a.C46128f;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47638k;
import com.google.assistant.p3897e.p3917i.p3918a.C51300cp;
import com.google.assistant.p3897e.p3917i.p3918a.C51313db;
import com.google.assistant.p3897e.p3917i.p3918a.C51319dh;
import com.google.assistant.p3897e.p3917i.p3918a.C51331dt;
import com.google.assistant.p3897e.p3917i.p3918a.C51333dv;
import com.google.assistant.p3897e.p3917i.p3918a.C51334dw;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60870cx;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.apps.search.assistant.surfaces.b.c.a.s */
/* compiled from: PG */
public final class C124419s implements C32597b {

    /* renamed from: a */
    public static final C59071e f343384a = C59071e.m91332i("com.google.android.apps.search.assistant.surfaces.b.c.a.s");

    /* renamed from: b */
    public static final C33476a f343385b = new C33476a("assistant.api.params.DeviceProperties", C51334dw.f133658ab);

    /* renamed from: f */
    private static final C32836cd f343386f;

    /* renamed from: c */
    public final Executor f343387c;

    /* renamed from: d */
    public final C118786c f343388d;

    /* renamed from: e */
    public final C118784a f343389e;

    /* renamed from: g */
    private final C36991j f343390g;

    /* renamed from: h */
    private final AccountId f343391h;

    /* renamed from: i */
    private final C46128f f343392i;

    /* renamed from: j */
    private final C121011a f343393j;

    static {
        C32835cc ccVar = (C32835cc) C32836cd.f88040e.createBuilder();
        ccVar.copyOnWrite();
        C32836cd cdVar = (C32836cd) ccVar.instance;
        cdVar.f88042a |= 2;
        cdVar.f88044c = true;
        C32788aj ajVar = (C32788aj) C32796ar.f87973c.createBuilder();
        ajVar.copyOnWrite();
        C32796ar arVar = (C32796ar) ajVar.instance;
        arVar.f87975a = 1;
        arVar.f87976b = "asst.device.properties";
        ccVar.copyOnWrite();
        C32836cd cdVar2 = (C32836cd) ccVar.instance;
        C32796ar arVar2 = (C32796ar) ajVar.build();
        arVar2.getClass();
        cdVar2.f88043b = arVar2;
        cdVar2.f88042a |= 1;
        f343386f = (C32836cd) ccVar.build();
    }

    public C124419s(C36991j jVar, AccountId accountId, C46128f fVar, C121011a aVar, C118786c cVar, C118784a aVar2, Executor executor) {
        this.f343390g = jVar;
        this.f343391h = accountId;
        this.f343392i = fVar;
        this.f343393j = aVar;
        this.f343388d = cVar;
        this.f343389e = aVar2;
        this.f343387c = executor;
    }

    /* renamed from: c */
    public final /* synthetic */ C32601f mo38173c() {
        return null;
    }

    /* renamed from: d */
    public final C32836cd mo38174d() {
        return f343386f;
    }

    /* renamed from: e */
    public final C60870cx mo38175e(C32810be beVar) {
        ((C59052c) ((C59052c) f343384a.mo56224b()).mo56372aa(37034)).mo56386p("Starting fetching device properties");
        C60870cx b = this.f343392i.mo50215b(this.f343391h);
        C60870cx b2 = this.f343393j.mo104232b();
        C36991j jVar = this.f343390g;
        C36982a aVar = new C36982a();
        aVar.mo40512d(C51313db.OPA);
        aVar.mo40516h(C51333dv.UNKNOWN_USER_CREDENTIAL_STATUS);
        aVar.mo40510b(C51300cp.UNSPECIFIED_ASSISTANT_ON_LOCKSCREEN);
        aVar.mo40513e(C51319dh.DEFAULT);
        aVar.mo40515g(C51331dt.UNKNOWN_TRIGGER_TRUST_LEVEL);
        aVar.mo40514f();
        aVar.mo40511c(C39226b.TAG_ASSISTANT_MOBILE_ASSISTANT);
        C60870cx a = jVar.mo40520a(aVar.mo40509a());
        return C47638k.m84751b(a, b, b2).mo51521b(new C124417q(this, b, b2, a), this.f343387c);
    }
}
