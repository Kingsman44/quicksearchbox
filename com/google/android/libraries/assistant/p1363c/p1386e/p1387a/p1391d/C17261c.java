package com.google.android.libraries.assistant.p1363c.p1386e.p1387a.p1391d;

import com.google.apps.tiktok.p3644h.C47103a;
import com.google.speech.p5208h.C66591bq;
import com.google.speech.p5208h.C66592br;
import com.google.speech.p5208h.C66614cl;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.libraries.assistant.c.e.a.d.c */
/* compiled from: PG */
public final /* synthetic */ class C17261c implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ C17264f f50038a;

    /* renamed from: b */
    public final /* synthetic */ C66614cl f50039b;

    public /* synthetic */ C17261c(C17264f fVar, C66614cl clVar) {
        this.f50038a = fVar;
        this.f50039b = clVar;
    }

    public final void accept(Object obj) {
        C17264f fVar = this.f50038a;
        C66614cl clVar = this.f50039b;
        C66591bq bqVar = (C66591bq) C66592br.f181140e.createBuilder();
        String str = fVar.f50046e;
        bqVar.copyOnWrite();
        C66592br brVar = (C66592br) bqVar.instance;
        str.getClass();
        brVar.f181142a |= 4;
        brVar.f181144c = str;
        bqVar.copyOnWrite();
        C66592br brVar2 = (C66592br) bqVar.instance;
        brVar2.f181142a |= 2;
        brVar2.f181143b = true;
        String str2 = ((C47103a) obj).f122701a;
        bqVar.copyOnWrite();
        C66592br brVar3 = (C66592br) bqVar.instance;
        str2.getClass();
        brVar3.f181142a |= 8;
        brVar3.f181145d = str2;
        clVar.mo59689c((C66592br) bqVar.build());
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}
