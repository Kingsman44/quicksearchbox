package com.google.android.apps.gsa.staticplugins.opa.valyrian;

import com.google.android.apps.gsa.staticplugins.opa.chatui.C108253bx;
import com.google.assistant.p3897e.p3921j.alf;
import com.google.assistant.p3897e.p3921j.p3922a.C51647e;
import com.google.assistant.p3897e.p3921j.p3922a.C51648f;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.valyrian.h */
/* compiled from: PG */
public final /* synthetic */ class C114079h implements Function {

    /* renamed from: a */
    public static final /* synthetic */ C114079h f316084a = new C114079h();

    private /* synthetic */ C114079h() {
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        C51648f fVar = (C51648f) obj;
        String str = fVar.f134583b;
        int a = C51647e.m86262a(fVar.f134584c);
        if (a == 0) {
            a = 1;
        }
        String str2 = fVar.f134585d;
        alf alf = fVar.f134586e;
        if (alf == null) {
            alf = alf.f135314d;
        }
        return new C108253bx(str, a, str2, alf);
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
