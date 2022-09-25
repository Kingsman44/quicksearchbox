package com.google.android.apps.gsa.shared.speech.dumper;

import com.google.android.apps.gsa.shared.util.debug.p7163a.p7165b.C90999h;
import com.google.common.base.C58817ah;
import com.google.protobuf.C62940bt;

/* renamed from: com.google.android.apps.gsa.shared.speech.dumper.ai */
/* compiled from: PG */
public final /* synthetic */ class C90546ai implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ long f253130a;

    /* renamed from: b */
    public final /* synthetic */ String f253131b;

    /* renamed from: c */
    public final /* synthetic */ String f253132c;

    public /* synthetic */ C90546ai(long j, String str, String str2) {
        this.f253130a = j;
        this.f253131b = str;
        this.f253132c = str2;
    }

    public final Object apply(Object obj) {
        long j = this.f253130a;
        String str = this.f253131b;
        String str2 = this.f253132c;
        C62940bt btVar = C90555h.f253154a;
        C90553f fVar = (C90553f) C90554g.f253148e.createBuilder();
        fVar.copyOnWrite();
        C90554g gVar = (C90554g) fVar.instance;
        gVar.f253150a |= 1;
        gVar.f253151b = j;
        fVar.copyOnWrite();
        C90554g gVar2 = (C90554g) fVar.instance;
        str.getClass();
        gVar2.f253150a |= 2;
        gVar2.f253152c = str;
        fVar.copyOnWrite();
        C90554g gVar3 = (C90554g) fVar.instance;
        gVar3.f253150a |= 4;
        gVar3.f253153d = str2;
        ((C90999h) obj).mo58885m(btVar, (C90554g) fVar.build());
        return null;
    }
}
