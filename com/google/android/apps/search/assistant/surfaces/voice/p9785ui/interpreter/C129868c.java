package com.google.android.apps.search.assistant.surfaces.voice.p9785ui.interpreter;

import com.google.android.apps.search.assistant.surfaces.voice.controller.p9532ui.actions.C127118j;
import com.google.android.apps.search.assistant.surfaces.voice.controller.p9532ui.p9534b.C127120a;
import com.google.android.apps.search.assistant.surfaces.voice.p9785ui.common.p9793c.C129024a;
import com.google.android.apps.search.assistant.surfaces.voice.p9785ui.host.C129566ah;
import com.google.android.apps.search.assistant.surfaces.voice.p9785ui.interpreter.p9856a.C129855b;
import com.google.android.apps.search.assistant.surfaces.voice.p9785ui.interpreter.p9856a.C129856c;
import com.google.android.libraries.p1730f.C21370a;
import com.google.apps.tiktok.account.AccountId;
import com.google.apps.tiktok.concurrent.futuresmixin.C46439e;
import com.google.apps.tiktok.concurrent.futuresmixin.C46440f;
import com.google.apps.tiktok.dataservice.local.C46855i;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59094n;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.ui.interpreter.c */
/* compiled from: PG */
public final class C129868c {

    /* renamed from: a */
    public static final C59071e f356274a = C59071e.m91331h();

    /* renamed from: b */
    public final AccountId f356275b;

    /* renamed from: c */
    public final C129566ah f356276c;

    /* renamed from: d */
    public final C127120a f356277d;

    /* renamed from: e */
    public final C129857b f356278e;

    /* renamed from: f */
    public final C46439e f356279f;

    /* renamed from: g */
    public final C46855i f356280g;

    /* renamed from: h */
    public final C127118j f356281h;

    /* renamed from: i */
    public final C21370a f356282i;

    /* renamed from: j */
    public final C129024a f356283j;

    /* renamed from: k */
    public final C129856c f356284k = new C129856c();

    /* renamed from: l */
    public final C129870b f356285l = new C129870b();

    /* renamed from: m */
    public final C129869a f356286m = new C129869a();

    /* renamed from: n */
    public final C129855b f356287n;

    /* renamed from: com.google.android.apps.search.assistant.surfaces.voice.ui.interpreter.c$a */
    /* compiled from: PG */
    public final class C129869a implements C46440f {
        /* renamed from: a */
        public final /* synthetic */ void mo18066a(Object obj, Throwable th) {
            Void voidR = (Void) obj;
            C59052c cVar = (C59052c) ((C59052c) C129868c.f356274a.mo56225c()).mo56382g(th);
            cVar.mo56379ah(new C59094n(38566));
            cVar.mo56386p("Failed to start interaction for ui.TAP_EXIT_LANG_TRANSLATOR ClientInput");
        }

        /* renamed from: c */
        public final /* synthetic */ void mo18067c(Object obj, Object obj2) {
            Void voidR = (Void) obj;
            Void voidR2 = (Void) obj2;
            C59052c cVar = (C59052c) C129868c.f356274a.mo56224b();
            cVar.mo56379ah(new C59094n(38567));
            cVar.mo56386p("ui.TAP_EXIT_LANG_TRANSLATOR ClientInput Succeeded.");
        }

        /* renamed from: i */
        public final /* synthetic */ void mo18068i(Object obj) {
        }
    }

    /* renamed from: com.google.android.apps.search.assistant.surfaces.voice.ui.interpreter.c$b */
    /* compiled from: PG */
    public final class C129870b implements C46440f {
        /* renamed from: a */
        public final /* synthetic */ void mo18066a(Object obj, Throwable th) {
            Void voidR = (Void) obj;
            C59052c cVar = (C59052c) ((C59052c) C129868c.f356274a.mo56225c()).mo56382g(th);
            cVar.mo56379ah(new C59094n(38568));
            cVar.mo56386p("Stop interaction failed.");
        }

        /* renamed from: c */
        public final /* synthetic */ void mo18067c(Object obj, Object obj2) {
            Void voidR = (Void) obj;
            Void voidR2 = (Void) obj2;
            C59052c cVar = (C59052c) C129868c.f356274a.mo56224b();
            cVar.mo56379ah(new C59094n(38569));
            cVar.mo56386p("Stop interaction succeeded.");
        }

        /* renamed from: i */
        public final /* synthetic */ void mo18068i(Object obj) {
        }
    }

    public C129868c(AccountId accountId, C129566ah ahVar, C127120a aVar, C129857b bVar, C129855b bVar2, C46439e eVar, C46855i iVar, C127118j jVar, C21370a aVar2, C129024a aVar3) {
        C69664n.m101061g(accountId, "accountId");
        C69664n.m101061g(eVar, "futuresMixin");
        C69664n.m101061g(iVar, "subscriptionMixin");
        C69664n.m101061g(aVar2, "clock");
        this.f356275b = accountId;
        this.f356276c = ahVar;
        this.f356277d = aVar;
        this.f356278e = bVar;
        this.f356287n = bVar2;
        this.f356279f = eVar;
        this.f356280g = iVar;
        this.f356281h = jVar;
        this.f356282i = aVar2;
        this.f356283j = aVar3;
    }
}
