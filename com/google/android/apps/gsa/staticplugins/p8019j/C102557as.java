package com.google.android.apps.gsa.staticplugins.p8019j;

import com.google.android.libraries.assistant.p1533o.C18490h;
import com.google.speech.p5208h.C66559ap;
import com.google.speech.p5208h.C66560aq;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.gsa.staticplugins.j.as */
/* compiled from: PG */
public final /* synthetic */ class C102557as implements Function {

    /* renamed from: a */
    public static final /* synthetic */ C102557as f286239a = new C102557as();

    private /* synthetic */ C102557as() {
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        C18490h hVar = (C18490h) obj;
        C66559ap apVar = (C66559ap) C66560aq.f181048d.createBuilder();
        String str = hVar.f52431a;
        apVar.copyOnWrite();
        C66560aq aqVar = (C66560aq) apVar.instance;
        str.getClass();
        aqVar.f181050a |= 1;
        aqVar.f181051b = str;
        String str2 = hVar.f52432b;
        apVar.copyOnWrite();
        C66560aq aqVar2 = (C66560aq) apVar.instance;
        str2.getClass();
        aqVar2.f181050a |= 2;
        aqVar2.f181052c = str2;
        return (C66560aq) apVar.build();
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
