package com.google.android.apps.gsa.staticplugins.opa.p8189ak.p8192b.p8193a.p8194a;

import com.google.android.apps.gsa.nga.shared.p6407v.p6411d.C82895ek;
import com.google.android.apps.gsa.nga.shared.p6407v.p6411d.C82897em;
import com.google.android.apps.gsa.nga.shared.p6407v.p6411d.C82898en;
import com.google.android.libraries.gsa.conversation.p1855h.C22715s;
import com.google.assistant.p3897e.p3921j.C52236kg;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.ak.b.a.a.f */
/* compiled from: PG */
public final /* synthetic */ class C106211f implements Function {

    /* renamed from: a */
    public static final /* synthetic */ C106211f f296410a = new C106211f();

    private /* synthetic */ C106211f() {
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        C22715s sVar = (C22715s) obj;
        C106213h hVar = C106215j.f296412a;
        C82895ek ekVar = (C82895ek) C82898en.f226124g.createBuilder();
        String e = sVar.mo27850e();
        ekVar.copyOnWrite();
        C82898en enVar = (C82898en) ekVar.instance;
        e.getClass();
        enVar.f226126a |= 1;
        enVar.f226127b = e;
        C52236kg kgVar = sVar.mo27849d().f136654b;
        if (kgVar == null) {
            kgVar = C52236kg.f137089d;
        }
        ekVar.copyOnWrite();
        C82898en enVar2 = (C82898en) ekVar.instance;
        kgVar.getClass();
        enVar2.f226128c = kgVar;
        enVar2.f226126a |= 2;
        C82897em a = C106215j.f296412a.apply(sVar.mo27848c());
        ekVar.copyOnWrite();
        C82898en enVar3 = (C82898en) ekVar.instance;
        enVar3.f226129d = a.f226123f;
        enVar3.f226126a |= 4;
        long b = sVar.mo27847b();
        ekVar.copyOnWrite();
        C82898en enVar4 = (C82898en) ekVar.instance;
        enVar4.f226126a |= 8;
        enVar4.f226130e = b;
        long a2 = sVar.mo27846a();
        ekVar.copyOnWrite();
        C82898en enVar5 = (C82898en) ekVar.instance;
        enVar5.f226126a |= 16;
        enVar5.f226131f = a2;
        return (C82898en) ekVar.build();
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
