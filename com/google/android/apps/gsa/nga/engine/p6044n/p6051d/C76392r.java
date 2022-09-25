package com.google.android.apps.gsa.nga.engine.p6044n.p6051d;

import com.google.assistant.p3897e.p3921j.C52090ew;
import com.google.assistant.p3897e.p3921j.C52230ka;
import com.google.assistant.p3897e.p3921j.C52231kb;
import com.google.assistant.p3897e.p3921j.C52232kc;
import p3186j$.util.function.BiConsumer;

/* renamed from: com.google.android.apps.gsa.nga.engine.n.d.r */
/* compiled from: PG */
public final /* synthetic */ class C76392r implements BiConsumer {

    /* renamed from: a */
    public final /* synthetic */ C52090ew f211533a;

    public /* synthetic */ C76392r(C52090ew ewVar) {
        this.f211533a = ewVar;
    }

    public final void accept(Object obj, Object obj2) {
        C52090ew ewVar = this.f211533a;
        String str = (String) obj;
        C52230ka kaVar = (C52230ka) obj2;
        C52231kb kbVar = (C52231kb) C52232kc.f137062d.createBuilder();
        kbVar.copyOnWrite();
        C52232kc kcVar = (C52232kc) kbVar.instance;
        str.getClass();
        kcVar.f137064a |= 1;
        kcVar.f137065b = str;
        kbVar.copyOnWrite();
        C52232kc kcVar2 = (C52232kc) kbVar.instance;
        kaVar.getClass();
        kcVar2.f137066c = kaVar;
        kcVar2.f137064a |= 2;
        ewVar.mo53791d(kbVar);
    }

    public final /* synthetic */ BiConsumer andThen(BiConsumer biConsumer) {
        return BiConsumer.CC.$default$andThen(this, biConsumer);
    }
}
