package com.google.android.apps.gsa.staticplugins.opa.smartspace;

import com.google.android.apps.gsa.opa.smartspace.C83729aa;
import com.google.android.apps.gsa.opa.smartspace.C83739ak;
import com.google.assistant.p3886c.C50788cl;
import com.google.assistant.p3886c.C50789cm;
import com.google.assistant.p3886c.C50794cr;
import com.google.assistant.p3886c.p3888b.C50731p;
import com.google.assistant.p3886c.p3888b.C50733r;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.smartspace.s */
/* compiled from: PG */
public final /* synthetic */ class C110926s implements Function {

    /* renamed from: a */
    public final /* synthetic */ C83739ak f309013a;

    public /* synthetic */ C110926s(C83739ak akVar) {
        this.f309013a = akVar;
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        C83739ak akVar = this.f309013a;
        C83729aa aaVar = (C83729aa) obj;
        C50788cl clVar = (C50788cl) C50789cm.f132161f.createBuilder();
        String str = aaVar.f228212b;
        clVar.copyOnWrite();
        C50789cm cmVar = (C50789cm) clVar.instance;
        str.getClass();
        cmVar.f132163a |= 1;
        cmVar.f132164b = str;
        String str2 = aaVar.f228213c;
        C50794cr a = C50794cr.m85938a(akVar.f228239h);
        if (a == null) {
            a = C50794cr.UNDEFINED;
        }
        C50733r c = C110927t.m184684c(str2, a, C50731p.START_ACTIVITY);
        clVar.copyOnWrite();
        C50789cm cmVar2 = (C50789cm) clVar.instance;
        c.getClass();
        cmVar2.f132165c = c;
        cmVar2.f132163a |= 2;
        return (C50789cm) clVar.build();
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
