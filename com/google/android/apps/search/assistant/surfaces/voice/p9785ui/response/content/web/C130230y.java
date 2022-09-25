package com.google.android.apps.search.assistant.surfaces.voice.p9785ui.response.content.web;

import android.content.Intent;
import android.net.Uri;
import com.google.android.apps.search.assistant.surfaces.voice.assistantintentstarter.p9504a.C126879a;
import com.google.android.apps.search.assistant.surfaces.voice.p9785ui.common.p9793c.C129024a;
import com.google.android.libraries.search.p2871b.C37215b;
import com.google.android.libraries.search.p2871b.p2872a.p2874b.C37176a;
import com.google.android.libraries.search.silk.web.uimodes.C40946j;
import com.google.android.libraries.web.base.C43262m;
import com.google.android.libraries.web.contrib.requestblock.RequestBlockMixin;
import com.google.android.libraries.web.p3353c.C43367l;
import com.google.apps.tiktok.account.AccountId;
import com.google.apps.tiktok.concurrent.futuresmixin.C46438d;
import com.google.apps.tiktok.concurrent.futuresmixin.C46439e;
import com.google.apps.tiktok.concurrent.futuresmixin.C46440f;
import com.google.apps.tiktok.dataservice.local.C46855i;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.net.p4726a.p4727a.C62722b;
import java.net.URISyntaxException;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.ui.response.content.web.y */
/* compiled from: PG */
public final class C130230y {

    /* renamed from: a */
    public static final C59071e f357000a = C59071e.m91332i("com.google.android.apps.search.assistant.surfaces.voice.ui.response.content.web.y");

    /* renamed from: b */
    public final AccountId f357001b;

    /* renamed from: c */
    public final C126879a f357002c;

    /* renamed from: d */
    public final C130193a f357003d;

    /* renamed from: e */
    public final RequestBlockMixin f357004e;

    /* renamed from: f */
    public final C46855i f357005f;

    /* renamed from: g */
    public final C130219n f357006g;

    /* renamed from: h */
    public final C130222q f357007h;

    /* renamed from: i */
    public final C130198ae f357008i;

    /* renamed from: j */
    public final C43262m f357009j;

    /* renamed from: k */
    public final C46439e f357010k;

    /* renamed from: l */
    public final C130231a f357011l = new C130231a();

    /* renamed from: m */
    public final C40946j f357012m;

    /* renamed from: n */
    public final boolean f357013n;

    /* renamed from: o */
    public final boolean f357014o;

    /* renamed from: p */
    public final boolean f357015p;

    /* renamed from: q */
    public final C37215b f357016q;

    /* renamed from: r */
    public final C129024a f357017r;

    /* renamed from: com.google.android.apps.search.assistant.surfaces.voice.ui.response.content.web.y$a */
    /* compiled from: PG */
    final class C130231a implements C46440f {
        /* renamed from: a */
        public final /* bridge */ /* synthetic */ void mo18066a(Object obj, Throwable th) {
            Void voidR = (Void) obj;
            ((C59052c) ((C59052c) ((C59052c) C130230y.f357000a.mo56225c()).mo56382g(th)).mo56372aa(38774)).mo56386p("TNG:MA webview Failed to start another non-Assistant Activity.");
        }

        /* renamed from: c */
        public final /* bridge */ /* synthetic */ void mo18067c(Object obj, Object obj2) {
            Void voidR = (Void) obj;
            Void voidR2 = (Void) obj2;
        }

        /* renamed from: i */
        public final /* bridge */ /* synthetic */ void mo18068i(Object obj) {
            Void voidR = (Void) obj;
        }
    }

    public C130230y(AccountId accountId, C126879a aVar, C37215b bVar, C130193a aVar2, C46439e eVar, RequestBlockMixin requestBlockMixin, C46855i iVar, C40946j jVar, C130219n nVar, C130222q qVar, C130198ae aeVar, C43262m mVar, C129024a aVar3, boolean z, boolean z2, boolean z3) {
        this.f357001b = accountId;
        this.f357002c = aVar;
        this.f357016q = bVar;
        this.f357003d = aVar2;
        this.f357007h = qVar;
        this.f357010k = eVar;
        this.f357004e = requestBlockMixin;
        this.f357006g = nVar;
        this.f357008i = aeVar;
        this.f357009j = mVar;
        this.f357005f = iVar;
        this.f357012m = jVar;
        this.f357017r = aVar3;
        this.f357013n = z;
        this.f357014o = z2;
        this.f357015p = z3;
    }

    /* renamed from: a */
    public final void mo109583a(C43367l lVar) {
        Intent intent;
        String str = lVar.f113296b;
        try {
            intent = Intent.parseUri(str, 3);
        } catch (URISyntaxException unused) {
            Intent intent2 = new Intent("android.intent.action.VIEW");
            intent2.setData(Uri.parse(str));
            intent = intent2;
        }
        intent.addFlags(268435456);
        this.f357016q.mo19974a(C37176a.f97260iG.mo40805c(C62722b.OK));
        C46439e eVar = this.f357010k;
        C46438d b = C46438d.m82810b(this.f357002c.mo20101f(intent));
        eVar.mo50428h(b.f121541a, (Object) null, this.f357011l);
    }

    /* renamed from: b */
    public final void mo109584b(C43367l lVar) {
        String queryParameter = Uri.parse(lVar.f113296b).getQueryParameter("q");
        Intent intent = new Intent();
        intent.setPackage("com.google.android.googlequicksearchbox");
        intent.setAction("com.google.android.googlequicksearchbox.GOOGLE_SEARCH");
        intent.putExtra("query", queryParameter);
        intent.addFlags(268435456);
        this.f357016q.mo19974a(C37176a.f97259iF.mo40805c(C62722b.OK));
        C46439e eVar = this.f357010k;
        C46438d b = C46438d.m82810b(this.f357002c.mo20101f(intent));
        eVar.mo50428h(b.f121541a, (Object) null, this.f357011l);
    }
}
