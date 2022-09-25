package com.google.android.apps.search.assistant.surfaces.voice.titan.p9752ui.p9769h;

import com.google.android.apps.search.assistant.surfaces.voice.p9785ui.common.p9793c.C129024a;
import com.google.android.apps.search.assistant.surfaces.voice.titan.p9752ui.p9759d.p9760a.C128848e;
import com.google.android.apps.search.assistant.surfaces.voice.titan.p9752ui.p9761e.C128849a;
import com.google.android.apps.search.assistant.surfaces.voice.titan.p9752ui.p9772j.C128932a;
import com.google.android.apps.search.assistant.surfaces.voice.titan.p9752ui.p9779m.p9782b.C128961j;
import com.google.apps.tiktok.account.AccountId;
import com.google.apps.tiktok.concurrent.futuresmixin.C46439e;
import com.google.apps.tiktok.concurrent.futuresmixin.C46440f;
import com.google.apps.tiktok.dataservice.local.C46855i;
import com.google.apps.tiktok.media.C47449e;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59094n;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.titan.ui.h.am */
/* compiled from: PG */
public final class C128893am implements C128880a {

    /* renamed from: a */
    public static final C59071e f354223a = C59071e.m91331h();

    /* renamed from: b */
    public final AccountId f354224b;

    /* renamed from: c */
    public final C128887ag f354225c;

    /* renamed from: d */
    public final C46855i f354226d;

    /* renamed from: e */
    public final C46439e f354227e;

    /* renamed from: f */
    public final C47449e f354228f;

    /* renamed from: g */
    public final C128849a f354229g;

    /* renamed from: h */
    public final C129024a f354230h;

    /* renamed from: i */
    public final C128905c f354231i;

    /* renamed from: j */
    public final C128932a f354232j;

    /* renamed from: k */
    public final C128848e f354233k;

    /* renamed from: com.google.android.apps.search.assistant.surfaces.voice.titan.ui.h.am$a */
    /* compiled from: PG */
    final class C128894a implements C46440f {

        /* renamed from: a */
        public static final C128894a f354234a = new C128894a();

        private C128894a() {
        }

        /* renamed from: a */
        public final /* synthetic */ void mo18066a(Object obj, Throwable th) {
            Void voidR = (Void) obj;
            C59052c cVar = (C59052c) ((C59052c) C128893am.f354223a.mo56226d()).mo56382g(th);
            cVar.mo56379ah(new C59094n(38058));
            cVar.mo56386p("openKeyboardCallback onFailure");
        }

        /* renamed from: c */
        public final /* bridge */ /* synthetic */ void mo18067c(Object obj, Object obj2) {
            Void voidR = (Void) obj;
            Void voidR2 = (Void) obj2;
        }

        /* renamed from: i */
        public final /* synthetic */ void mo18068i(Object obj) {
        }
    }

    public C128893am(AccountId accountId, C128887ag agVar, C128961j jVar, C46855i iVar, C46439e eVar, C47449e eVar2, C128849a aVar, C128848e eVar3, C129024a aVar2, C128905c cVar, C128932a aVar3) {
        C69664n.m101061g(accountId, "accountId");
        C69664n.m101061g(jVar, "transcriptionFragmentProvider");
        C69664n.m101061g(iVar, "localSubscriptionMixin");
        C69664n.m101061g(eVar, "mixin");
        C69664n.m101061g(eVar2, "imageManager");
        C69664n.m101061g(aVar, "voicePlateDataService");
        this.f354224b = accountId;
        this.f354225c = agVar;
        this.f354226d = iVar;
        this.f354227e = eVar;
        this.f354228f = eVar2;
        this.f354229g = aVar;
        this.f354233k = eVar3;
        this.f354230h = aVar2;
        this.f354231i = cVar;
        this.f354232j = aVar3;
    }

    /* renamed from: a */
    public final void mo108720a(C128920q qVar) {
        this.f354231i.f354247b = qVar;
    }
}
