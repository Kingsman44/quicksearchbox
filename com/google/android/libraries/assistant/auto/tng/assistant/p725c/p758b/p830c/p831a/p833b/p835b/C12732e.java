package com.google.android.libraries.assistant.auto.tng.assistant.p725c.p758b.p830c.p831a.p833b.p835b;

import com.google.android.libraries.assistant.auto.tng.assistant.p725c.p726a.p755g.p757b.C12171c;
import com.google.android.libraries.assistant.auto.tng.assistant.p725c.p726a.p755g.p757b.C12174f;
import com.google.android.libraries.gsa.conversation.clientop.p1841b.C22402a;
import com.google.assistant.p3897e.p3921j.C52235kf;
import com.google.common.base.C58817ah;
import com.google.speech.p5224k.p5225a.C67187ae;
import com.google.speech.p5224k.p5225a.C67190ah;
import p5535j.p5536a.p5543b.C70967n;

/* renamed from: com.google.android.libraries.assistant.auto.tng.assistant.c.b.c.a.b.b.e */
/* compiled from: PG */
public final /* synthetic */ class C12732e implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ C12733f f39838a;

    /* renamed from: b */
    public final /* synthetic */ String f39839b;

    public /* synthetic */ C12732e(C12733f fVar, String str) {
        this.f39838a = fVar;
        this.f39839b = str;
    }

    public final Object apply(Object obj) {
        C12733f fVar = this.f39838a;
        String str = this.f39839b;
        String str2 = (String) obj;
        C12171c cVar = (C12171c) C12174f.f38872d.createBuilder();
        C67187ae aeVar = (C67187ae) C67190ah.f182619q.createBuilder();
        aeVar.copyOnWrite();
        C67190ah ahVar = (C67190ah) aeVar.instance;
        str.getClass();
        ahVar.f182622a |= 1;
        ahVar.f182625d = str;
        aeVar.copyOnWrite();
        C67190ah ahVar2 = (C67190ah) aeVar.instance;
        str2.getClass();
        ahVar2.f182622a |= 8192;
        ahVar2.f182632k = str2;
        C67190ah ahVar3 = (C67190ah) aeVar.build();
        cVar.copyOnWrite();
        C12174f fVar2 = (C12174f) cVar.instance;
        ahVar3.getClass();
        fVar2.f38875b = ahVar3;
        fVar2.f38874a |= 1;
        fVar.f39841b.mo20461b((C12174f) cVar.build(), C70967n.DEVICE_PERMISSION);
        return C22402a.m41822b(C52235kf.ABORTED, "Permission has not been granted");
    }
}
