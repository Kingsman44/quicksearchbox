package com.google.android.libraries.assistant.auto.tng.assistant.p725c.p726a.p755g.p756a;

import com.google.android.libraries.assistant.p1363c.p1398g.p1402b.p1403a.C17361a;
import com.google.android.libraries.assistant.p1363c.p1398g.p1436k.C17487aw;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.p4526f.C59052c;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import com.google.common.util.concurrent.C60931s;
import com.google.speech.p5224k.p5225a.C67190ah;
import p5535j.p5536a.p5543b.C70967n;

/* renamed from: com.google.android.libraries.assistant.auto.tng.assistant.c.a.g.a.c */
/* compiled from: PG */
public final /* synthetic */ class C12157c implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C12167m f38831a;

    /* renamed from: b */
    public final /* synthetic */ C60870cx f38832b;

    /* renamed from: c */
    public final /* synthetic */ C67190ah f38833c;

    /* renamed from: d */
    public final /* synthetic */ C70967n f38834d;

    /* renamed from: e */
    public final /* synthetic */ C17361a f38835e;

    public /* synthetic */ C12157c(C12167m mVar, C60870cx cxVar, C67190ah ahVar, C17361a aVar, C70967n nVar) {
        this.f38831a = mVar;
        this.f38832b = cxVar;
        this.f38833c = ahVar;
        this.f38835e = aVar;
        this.f38834d = nVar;
    }

    public final C60870cx apply(Object obj) {
        C12167m mVar = this.f38831a;
        C60870cx cxVar = this.f38832b;
        C67190ah ahVar = this.f38833c;
        C17361a aVar = this.f38835e;
        C70967n nVar = this.f38834d;
        if (((C17487aw) obj).f50493a == 1) {
            ((C59052c) ((C59052c) C12167m.f38855a.mo56224b()).mo56372aa(44081)).mo56386p("TTS online synthesis succeeded.");
            C12155a aVar2 = new C12155a(mVar);
            return C60922j.m93044g(cxVar, C47810es.m84963c(aVar2), mVar.f38856b);
        }
        ((C59052c) ((C59052c) C12167m.f38855a.mo56224b()).mo56372aa(44080)).mo56386p("TTS online synthesis failed, fall back to offline.");
        return mVar.mo20465d(ahVar, aVar, nVar);
    }
}
