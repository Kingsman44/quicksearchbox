package com.google.android.apps.search.assistant.surfaces.voice.p9539d.p9542c.p9562n;

import android.content.Context;
import com.google.android.apps.gsa.p8867w.p8875e.C118784a;
import com.google.android.apps.search.assistant.platform.p9141h.p9154e.C121059e;
import com.google.android.apps.search.assistant.surfaces.voice.lockscreen.p9690a.p9691a.C128242c;
import com.google.android.apps.search.assistant.surfaces.voice.p9539d.C127369n;
import com.google.android.apps.search.assistant.surfaces.voice.p9539d.p9575d.C127289i;
import com.google.android.apps.search.assistant.surfaces.voice.p9663i.p9667c.C127947i;
import com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32788aj;
import com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32796ar;
import com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32798at;
import com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32810be;
import com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32835cc;
import com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32836cd;
import com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32838cf;
import com.google.android.libraries.search.assistant.p2585i.C33476a;
import com.google.android.libraries.search.p2871b.C37215b;
import com.google.apps.tiktok.account.AccountId;
import com.google.apps.tiktok.account.data.p3611a.C46128f;
import com.google.assistant.p3897e.p3917i.p3918a.C51334dw;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60870cx;
import dagger.C68214a;
import kotlinx.coroutines.C71422aw;
import kotlinx.coroutines.C71424ay;
import kotlinx.coroutines.p5578d.C71663i;
import p3186j$.util.Optional;
import p5462h.p5466c.C69577g;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.d.c.n.d */
/* compiled from: PG */
public final class C127245d implements C127369n {

    /* renamed from: a */
    public static final C33476a f350398a = new C33476a("assistant.api.params.DeviceProperties", C51334dw.f133658ab);

    /* renamed from: b */
    public static final C32836cd f350399b;

    /* renamed from: c */
    public static final C59071e f350400c = C59071e.m91331h();

    /* renamed from: d */
    public final Context f350401d;

    /* renamed from: e */
    public final C68214a f350402e;

    /* renamed from: f */
    public final AccountId f350403f;

    /* renamed from: g */
    public final C46128f f350404g;

    /* renamed from: h */
    public final C68214a f350405h;

    /* renamed from: i */
    public final C121059e f350406i;

    /* renamed from: j */
    public final Optional f350407j;

    /* renamed from: k */
    public final C127947i f350408k;

    /* renamed from: l */
    public final C68214a f350409l;

    /* renamed from: m */
    public final C37215b f350410m;

    /* renamed from: n */
    public final C118784a f350411n;

    /* renamed from: o */
    public final C128242c f350412o;

    /* renamed from: p */
    private final C71422aw f350413p;

    static {
        C32835cc ccVar = (C32835cc) C32836cd.f88040e.createBuilder();
        C69664n.m101060f(ccVar, "newBuilder()");
        C32838cf a = C69664n.m101061g(ccVar, "builder");
        a.mo38320c();
        C32788aj ajVar = (C32788aj) C32796ar.f87973c.createBuilder();
        C69664n.m101060f(ajVar, "newBuilder()");
        C32798at a2 = C69664n.m101061g(ajVar, "builder");
        a2.mo38300c("asst.device.properties");
        a.mo38319b(a2.mo38298a());
        f350399b = a.mo38318a();
    }

    public C127245d(Context context, C68214a aVar, AccountId accountId, C46128f fVar, C68214a aVar2, C121059e eVar, C128242c cVar, C118784a aVar3, Optional optional, C127947i iVar, C68214a aVar4, C37215b bVar, C71422aw awVar) {
        C69664n.m101061g(context, "context");
        C69664n.m101061g(aVar, "assistantEligibilityChecker");
        C69664n.m101061g(accountId, "accountId");
        C69664n.m101061g(fVar, "gcoreAccountName");
        C69664n.m101061g(aVar2, "assistantConsentStatus");
        C69664n.m101061g(eVar, "lockscreenSettingDataService");
        C69664n.m101061g(aVar3, "assistantAccountMode");
        C69664n.m101061g(optional, "connectedDockInfoOptional");
        C69664n.m101061g(aVar4, "devicePropertiesFetcher");
        C69664n.m101061g(bVar, "appFlowLogger");
        C69664n.m101061g(awVar, "futureScope");
        this.f350401d = context;
        this.f350402e = aVar;
        this.f350403f = accountId;
        this.f350404g = fVar;
        this.f350405h = aVar2;
        this.f350406i = eVar;
        this.f350412o = cVar;
        this.f350411n = aVar3;
        this.f350407j = optional;
        this.f350408k = iVar;
        this.f350409l = aVar4;
        this.f350410m = bVar;
        this.f350413p = awVar;
    }

    /* renamed from: a */
    public final C60870cx mo107986a(C127289i iVar, C32810be beVar) {
        C69664n.m101061g(iVar, "queryContext");
        C69664n.m101061g(beVar, "request");
        return C71663i.m104692e(this.f350413p, (C71424ay) null, new C127242a(this, iVar, (C69577g) null), 3);
    }
}
