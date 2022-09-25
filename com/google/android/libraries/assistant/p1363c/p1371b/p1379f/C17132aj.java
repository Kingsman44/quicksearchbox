package com.google.android.libraries.assistant.p1363c.p1371b.p1379f;

import com.google.assistant.p3793ae.p3794a.C48773e;
import com.google.common.p4526f.C59052c;
import java.util.Locale;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.libraries.assistant.c.b.f.aj */
/* compiled from: PG */
public final /* synthetic */ class C17132aj implements Function {

    /* renamed from: a */
    public final /* synthetic */ Locale f49816a;

    /* renamed from: b */
    public final /* synthetic */ String f49817b;

    public /* synthetic */ C17132aj(Locale locale, String str) {
        this.f49816a = locale;
        this.f49817b = str;
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        Locale locale = this.f49816a;
        String str = this.f49817b;
        C48773e eVar = (C48773e) obj;
        String str2 = eVar.f126201b;
        boolean z = false;
        if (!C17161x.m34313b(str2)) {
            ((C59052c) ((C59052c) C17136an.f49821a.mo56224b()).mo56372aa(42629)).mo56354G("Incorrect locale \"%s\" provided for group: %s", str2, eVar.f126200a);
        } else if (C17161x.m34312a(str2, locale).isPresent() && C17136an.m34280o(eVar, str)) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
