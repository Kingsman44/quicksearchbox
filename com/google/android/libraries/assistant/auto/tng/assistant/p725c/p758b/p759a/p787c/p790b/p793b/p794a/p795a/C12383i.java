package com.google.android.libraries.assistant.auto.tng.assistant.p725c.p758b.p759a.p787c.p790b.p793b.p794a.p795a;

import com.google.android.libraries.assistant.auto.tng.assistant.p725c.p726a.p743f.p744a.p745a.C12115d;
import com.google.common.base.C58817ah;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C63088z;
import com.google.speech.p5208h.C66606cd;
import com.google.speech.p5208h.C66607ce;
import com.google.speech.p5208h.C66675i;
import com.google.speech.p5208h.C66676j;

/* renamed from: com.google.android.libraries.assistant.auto.tng.assistant.c.b.a.c.b.b.a.a.i */
/* compiled from: PG */
public final /* synthetic */ class C12383i implements C58817ah {

    /* renamed from: a */
    public static final /* synthetic */ C12383i f39221a = new C12383i();

    private /* synthetic */ C12383i() {
    }

    public final Object apply(Object obj) {
        byte[] N = ((C12115d) obj).f38736b.mo59174N();
        int length = N.length;
        C66606cd cdVar = (C66606cd) C66607ce.f181191f.createBuilder();
        C62940bt btVar = C66676j.f181379d;
        C66675i iVar = (C66675i) C66676j.f181378c.createBuilder();
        C63088z D = C63088z.m96142D(N, 0, length);
        iVar.copyOnWrite();
        C66676j jVar = (C66676j) iVar.instance;
        jVar.f181382a |= 1;
        jVar.f181383b = D;
        cdVar.mo58885m(btVar, (C66676j) iVar.build());
        return (C66607ce) cdVar.build();
    }
}
