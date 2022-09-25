package com.google.android.apps.search.googleapp.tabs.manager;

import com.google.android.apps.search.googleapp.p10117aa.C133103au;
import com.google.android.apps.search.googleapp.p10117aa.C133125j;
import com.google.android.apps.search.googleapp.p10117aa.C133129n;
import com.google.android.apps.search.googleapp.p10117aa.p10121d.C133118a;
import com.google.android.apps.search.googleapp.tabs.manager.p10524a.C139717d;
import com.google.android.apps.search.googleapp.tabs.manager.p10525b.C139732a;
import com.google.android.apps.search.googleapp.tabs.manager.p10525b.C139733b;
import com.google.android.libraries.search.p2871b.C37215b;
import com.google.android.libraries.search.p2871b.p2872a.p2876d.C37182a;
import com.google.android.libraries.search.p2871b.p2895i.C37258g;
import com.google.apps.tiktok.concurrent.C46459k;
import com.google.apps.tiktok.concurrent.futuresmixin.C46436b;
import com.google.apps.tiktok.concurrent.futuresmixin.C46438d;
import com.google.apps.tiktok.concurrent.futuresmixin.C46439e;
import com.google.apps.tiktok.p3674l.p3679c.C47388b;
import com.google.apps.tiktok.p3674l.p3679c.C47391d;
import com.google.apps.tiktok.p3674l.p3679c.C47392e;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import com.google.protobuf.C62940bt;
import p3186j$.util.Optional;
import p5535j.p5536a.p5545c.p5554e.C71164a;
import p5535j.p5536a.p5545c.p5554e.C71165b;

/* renamed from: com.google.android.apps.search.googleapp.tabs.manager.ag */
/* compiled from: PG */
final class C139725ag implements C47391d {

    /* renamed from: a */
    final /* synthetic */ C139720ac f379800a;

    public C139725ag(C139720ac acVar) {
        this.f379800a = acVar;
    }

    /* renamed from: a */
    public final /* synthetic */ C47392e mo18069a(C47388b bVar) {
        C139720ac acVar = this.f379800a;
        C133125j a = ((C139717d) bVar).mo115193a();
        C133103au auVar = acVar.f379773f;
        C60870cx a2 = auVar.f362876b.mo46039a(new C133129n(auVar, a.f362925e), C60826bg.f164896a);
        auVar.f362879e.mo50787a(a2, C133103au.f362875a);
        C46459k.m82829b(a2, "Failed to close tab", new Object[0]);
        boolean z = a.f362928h;
        if (z) {
            C46439e eVar = acVar.f379778k;
            C139733b bVar2 = acVar.f379777j;
            String str = a.f362925e;
            eVar.mo50445g(new C46438d(C60922j.m93044g(bVar2.f379821b.mo112358a(), C47810es.m84963c(new C139732a(bVar2, str)), bVar2.f379820a)), new C46436b(a.f362923c), acVar.f379791x);
        } else {
            acVar.mo115197k(Optional.m71637of(a));
        }
        C133118a aVar = acVar.f379782o;
        aVar.mo110983c();
        C37215b bVar3 = aVar.f362914b;
        C37258g gVar = C37182a.f97777aI;
        C62940bt btVar = C71165b.f189855f;
        C71164a aVar2 = (C71164a) C71165b.f189854e.createBuilder();
        aVar2.copyOnWrite();
        C71165b bVar4 = (C71165b) aVar2.instance;
        bVar4.f189857a |= 4;
        bVar4.f189860d = z;
        bVar3.mo19974a(gVar.mo40812e(btVar, (C71165b) aVar2.build()));
        aVar.f362915c = true;
        return C47392e.f123115a;
    }
}
