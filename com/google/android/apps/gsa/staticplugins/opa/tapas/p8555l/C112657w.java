package com.google.android.apps.gsa.staticplugins.opa.tapas.p8555l;

import com.google.android.apps.gsa.nga.engine.p6262y.p6271e.p6272a.C79927ab;
import com.google.p4140ba.p4141a.p4145b.p4146a.C54832ay;
import com.google.p4140ba.p4141a.p4145b.p4146a.C54833az;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.l.w */
/* compiled from: PG */
class C112657w implements Function {
    /* renamed from: a */
    public final C54833az apply(C79927ab abVar) {
        C54832ay ayVar = (C54832ay) C54833az.f143884j.createBuilder();
        if ((abVar.f219076a & 1) != 0) {
            float f = abVar.f219077b;
            ayVar.copyOnWrite();
            C54833az azVar = (C54833az) ayVar.instance;
            azVar.f143886a |= 1;
            azVar.f143887b = f;
        }
        if ((abVar.f219076a & 2) != 0) {
            float f2 = abVar.f219078c;
            ayVar.copyOnWrite();
            C54833az azVar2 = (C54833az) ayVar.instance;
            azVar2.f143886a |= 2;
            azVar2.f143888c = f2;
        }
        if ((abVar.f219076a & 4) != 0) {
            float f3 = abVar.f219079d;
            ayVar.copyOnWrite();
            C54833az azVar3 = (C54833az) ayVar.instance;
            azVar3.f143886a |= 4;
            azVar3.f143889d = f3;
        }
        if ((abVar.f219076a & 8) != 0) {
            float f4 = abVar.f219080e;
            ayVar.copyOnWrite();
            C54833az azVar4 = (C54833az) ayVar.instance;
            azVar4.f143886a |= 8;
            azVar4.f143890e = f4;
        }
        if ((abVar.f219076a & 16) != 0) {
            float f5 = abVar.f219081f;
            ayVar.copyOnWrite();
            C54833az azVar5 = (C54833az) ayVar.instance;
            azVar5.f143886a |= 16;
            azVar5.f143891f = f5;
        }
        if ((abVar.f219076a & 32) != 0) {
            float f6 = abVar.f219082g;
            ayVar.copyOnWrite();
            C54833az azVar6 = (C54833az) ayVar.instance;
            azVar6.f143886a |= 32;
            azVar6.f143892g = f6;
        }
        if ((abVar.f219076a & 64) != 0) {
            float f7 = abVar.f219083h;
            ayVar.copyOnWrite();
            C54833az azVar7 = (C54833az) ayVar.instance;
            azVar7.f143886a |= 64;
            azVar7.f143893h = f7;
        }
        if ((abVar.f219076a & 128) != 0) {
            float f8 = abVar.f219084i;
            ayVar.copyOnWrite();
            C54833az azVar8 = (C54833az) ayVar.instance;
            azVar8.f143886a |= 128;
            azVar8.f143894i = f8;
        }
        return (C54833az) ayVar.build();
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
