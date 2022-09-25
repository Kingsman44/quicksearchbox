package com.google.android.apps.gsa.staticplugins.opa.smartspace.p8461l;

import android.graphics.Bitmap;
import com.google.android.apps.gsa.opa.smartspace.C83741am;
import com.google.android.apps.gsa.smartspace.C92113i;
import com.google.assistant.p3886c.C50794cr;
import com.google.assistant.p3886c.C50818do;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.smartspace.l.v */
/* compiled from: PG */
public final /* synthetic */ class C110786v implements Function {

    /* renamed from: a */
    public final /* synthetic */ C110764bi f308688a;

    /* renamed from: b */
    public final /* synthetic */ C50818do f308689b;

    public /* synthetic */ C110786v(C110764bi biVar, C50818do doVar) {
        this.f308688a = biVar;
        this.f308689b = doVar;
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        C110764bi biVar = this.f308688a;
        C50818do doVar = this.f308689b;
        C83741am amVar = (C83741am) obj;
        C50818do doVar2 = amVar.f228252c;
        if (doVar2 == null) {
            doVar2 = C50818do.f132293H;
        }
        C50818do doVar3 = amVar.f228252c;
        if (doVar3 == null) {
            doVar3 = C50818do.f132293H;
        }
        Bitmap a = biVar.mo98865a(doVar3);
        C50818do doVar4 = amVar.f228252c;
        if (doVar4 == null) {
            doVar4 = C50818do.f132293H;
        }
        C50794cr a2 = C50794cr.m85938a(doVar4.f132315l);
        if (a2 == null) {
            a2 = C50794cr.UNDEFINED;
        }
        C50794cr a3 = C50794cr.m85938a(doVar.f132315l);
        if (a3 == null) {
            a3 = C50794cr.UNDEFINED;
        }
        boolean z = false;
        if (a2 == a3) {
            C50818do doVar5 = amVar.f228252c;
            if (doVar5 == null) {
                doVar5 = C50818do.f132293H;
            }
            if (doVar5.f132307d == doVar.f132307d) {
                z = true;
            }
        }
        return new C92113i(doVar2, a, z);
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
