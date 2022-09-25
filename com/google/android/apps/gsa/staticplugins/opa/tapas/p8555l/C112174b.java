package com.google.android.apps.gsa.staticplugins.opa.tapas.p8555l;

import com.google.android.apps.gsa.nga.engine.p6262y.p6271e.p6272a.C80018o;
import com.google.assistant.p3781ad.p3789d.C48582b;
import com.google.assistant.p3781ad.p3789d.C48746d;
import com.google.p4140ba.p4141a.p4145b.p4146a.C54815ah;
import com.google.p4140ba.p4141a.p4145b.p4146a.C54816ai;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.l.b */
/* compiled from: PG */
class C112174b implements Function {
    /* renamed from: a */
    public final C54816ai apply(C80018o oVar) {
        C54815ah ahVar = (C54815ah) C54816ai.f143818i.createBuilder();
        int i = 1;
        if ((oVar.f219585a & 1) != 0) {
            mo99459b(oVar, ahVar);
        }
        if ((oVar.f219585a & 2) != 0) {
            C48582b a = C48582b.m85243a(oVar.f219587c);
            if (a == null) {
                a = C48582b.UNKNOWN_ACTION;
            }
            ahVar.copyOnWrite();
            C54816ai aiVar = (C54816ai) ahVar.instance;
            aiVar.f143822c = a.f125574q;
            aiVar.f143820a |= 2;
        }
        if ((oVar.f219585a & 4) != 0) {
            int a2 = C48746d.m85277a(oVar.f219588d);
            if (a2 != 0) {
                i = a2;
            }
            ahVar.copyOnWrite();
            C54816ai aiVar2 = (C54816ai) ahVar.instance;
            aiVar2.f143823d = i - 1;
            aiVar2.f143820a |= 4;
        }
        if ((oVar.f219585a & 8) != 0) {
            String str = oVar.f219589e;
            ahVar.copyOnWrite();
            C54816ai aiVar3 = (C54816ai) ahVar.instance;
            str.getClass();
            aiVar3.f143820a |= 8;
            aiVar3.f143824e = str;
        }
        if ((oVar.f219585a & 16) != 0) {
            long j = oVar.f219590f;
            ahVar.copyOnWrite();
            C54816ai aiVar4 = (C54816ai) ahVar.instance;
            aiVar4.f143820a |= 16;
            aiVar4.f143825f = j;
        }
        if ((oVar.f219585a & 32) != 0) {
            String str2 = oVar.f219591g;
            ahVar.copyOnWrite();
            C54816ai aiVar5 = (C54816ai) ahVar.instance;
            str2.getClass();
            aiVar5.f143820a |= 32;
            aiVar5.f143826g = str2;
        }
        if ((oVar.f219585a & 64) != 0) {
            int i2 = oVar.f219592h;
            ahVar.copyOnWrite();
            C54816ai aiVar6 = (C54816ai) ahVar.instance;
            aiVar6.f143820a |= 64;
            aiVar6.f143827h = i2;
        }
        return (C54816ai) ahVar.build();
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    /* renamed from: b */
    public void mo99459b(C80018o oVar, C54815ah ahVar) {
        throw null;
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
