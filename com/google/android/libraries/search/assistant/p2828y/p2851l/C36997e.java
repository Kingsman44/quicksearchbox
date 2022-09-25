package com.google.android.libraries.search.assistant.p2828y.p2851l;

import android.content.ComponentName;
import com.google.assistant.p3897e.p3917i.p3918a.C51376fk;
import com.google.assistant.p3897e.p3917i.p3918a.C51379fn;
import com.google.knowledge.p4671b.C61789ah;
import com.google.knowledge.p4671b.C61790ai;
import com.google.knowledge.p4671b.C61812e;
import com.google.knowledge.p4671b.C61814g;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.libraries.search.assistant.y.l.e */
/* compiled from: PG */
public final /* synthetic */ class C36997e implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ C51376fk f96357a;

    public /* synthetic */ C36997e(C51376fk fkVar) {
        this.f96357a = fkVar;
    }

    public final void accept(Object obj) {
        C51376fk fkVar = this.f96357a;
        ComponentName componentName = (ComponentName) obj;
        C61789ah ahVar = (C61789ah) C61790ai.f166898o.createBuilder();
        C61812e eVar = (C61812e) C61814g.f166984j.createBuilder();
        String packageName = componentName.getPackageName();
        eVar.copyOnWrite();
        C61814g gVar = (C61814g) eVar.instance;
        packageName.getClass();
        gVar.f166986a |= 1;
        gVar.f166987b = packageName;
        String className = componentName.getClassName();
        eVar.copyOnWrite();
        C61814g gVar2 = (C61814g) eVar.instance;
        className.getClass();
        gVar2.f166986a |= 2;
        gVar2.f166988c = className;
        ahVar.copyOnWrite();
        C61790ai aiVar = (C61790ai) ahVar.instance;
        C61814g gVar3 = (C61814g) eVar.build();
        gVar3.getClass();
        aiVar.f166903d = gVar3;
        aiVar.f166900a |= 16;
        fkVar.copyOnWrite();
        C51379fn fnVar = (C51379fn) fkVar.instance;
        C61790ai aiVar2 = (C61790ai) ahVar.build();
        C51379fn fnVar2 = C51379fn.f133814i;
        aiVar2.getClass();
        fnVar.f133817b = aiVar2;
        fnVar.f133816a |= 1;
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}
