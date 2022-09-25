package com.google.android.libraries.assistant.auto.tng.assistant.p725c.p870d.p871a;

import android.content.res.Resources;
import com.google.android.libraries.assistant.auto.tng.assistant.p725c.p726a.p755g.C12154a;
import com.google.android.libraries.assistant.auto.tng.assistant.p725c.p726a.p755g.p757b.C12171c;
import com.google.android.libraries.assistant.auto.tng.assistant.p725c.p726a.p755g.p757b.C12173e;
import com.google.android.libraries.assistant.auto.tng.assistant.p725c.p726a.p755g.p757b.C12174f;
import com.google.apps.tiktok.p3674l.p3676b.C47380k;
import com.google.common.p4526f.C59052c;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60930r;
import com.google.speech.p5224k.p5225a.C67187ae;
import com.google.speech.p5224k.p5225a.C67190ah;
import p5535j.p5536a.p5543b.C70967n;

/* renamed from: com.google.android.libraries.assistant.auto.tng.assistant.c.d.a.n */
/* compiled from: PG */
public final /* synthetic */ class C12944n implements C60930r {

    /* renamed from: a */
    public final /* synthetic */ C12945o f40290a;

    /* renamed from: b */
    public final /* synthetic */ C60870cx f40291b;

    /* renamed from: c */
    public final /* synthetic */ C60870cx f40292c;

    /* renamed from: d */
    public final /* synthetic */ C47380k f40293d;

    /* renamed from: e */
    public final /* synthetic */ String f40294e;

    /* renamed from: f */
    public final /* synthetic */ Throwable f40295f;

    /* renamed from: g */
    public final /* synthetic */ int f40296g;

    public /* synthetic */ C12944n(C12945o oVar, C60870cx cxVar, C60870cx cxVar2, C47380k kVar, String str, Throwable th, int i) {
        this.f40290a = oVar;
        this.f40291b = cxVar;
        this.f40292c = cxVar2;
        this.f40293d = kVar;
        this.f40294e = str;
        this.f40295f = th;
        this.f40296g = i;
    }

    /* renamed from: a */
    public final C60870cx mo18058a() {
        C12945o oVar = this.f40290a;
        C60870cx cxVar = this.f40291b;
        C60870cx cxVar2 = this.f40292c;
        C47380k kVar = this.f40293d;
        String str = this.f40294e;
        Throwable th = this.f40295f;
        int i = this.f40296g;
        String str2 = (String) C60856cj.m92909r(cxVar);
        String a = C12945o.m29188a(kVar.f123107d, (Resources) C60856cj.m92909r(cxVar2), str2, str);
        ((C59052c) ((C59052c) ((C59052c) C12945o.f40297a.mo56224b()).mo56382g(th)).mo56372aa(44539)).mo56354G("Starting audio playback for the failure: %s in mode: %s", a, C12173e.m28082a(i));
        C67187ae aeVar = (C67187ae) C67190ah.f182619q.createBuilder();
        aeVar.copyOnWrite();
        C67190ah ahVar = (C67190ah) aeVar.instance;
        a.getClass();
        ahVar.f182622a |= 1;
        ahVar.f182625d = a;
        aeVar.copyOnWrite();
        C67190ah ahVar2 = (C67190ah) aeVar.instance;
        str2.getClass();
        ahVar2.f182622a |= 8192;
        ahVar2.f182632k = str2;
        C67190ah ahVar3 = (C67190ah) aeVar.build();
        C12154a aVar = oVar.f40300d;
        C12171c cVar = (C12171c) C12174f.f38872d.createBuilder();
        cVar.copyOnWrite();
        C12174f fVar = (C12174f) cVar.instance;
        ahVar3.getClass();
        fVar.f38875b = ahVar3;
        fVar.f38874a |= 1;
        cVar.copyOnWrite();
        C12174f fVar2 = (C12174f) cVar.instance;
        fVar2.f38876c = i - 1;
        fVar2.f38874a |= 2;
        return aVar.mo20461b((C12174f) cVar.build(), C70967n.ERROR_PUNT).mo20381a();
    }
}
