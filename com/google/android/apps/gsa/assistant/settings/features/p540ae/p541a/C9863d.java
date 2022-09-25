package com.google.android.apps.gsa.assistant.settings.features.p540ae.p541a;

import com.google.assistant.p3861at.C50264qq;
import com.google.assistant.p3861at.C50266qs;
import com.google.assistant.p3861at.C50286rl;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.gsa.assistant.settings.features.ae.a.d */
/* compiled from: PG */
public final /* synthetic */ class C9863d implements Function {

    /* renamed from: a */
    public static final /* synthetic */ C9863d f33896a = new C9863d();

    private /* synthetic */ C9863d() {
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        int i = C9885z.f33925f;
        C50266qs qsVar = ((C50264qq) obj).f130715e;
        if (qsVar == null) {
            qsVar = C50266qs.f130716c;
        }
        if (qsVar.f130718a != 1) {
            return C50286rl.PAGE_ID_UNSPECIFIED;
        }
        C50286rl a = C50286rl.m85798a(((Integer) qsVar.f130719b).intValue());
        if (a == null) {
            return C50286rl.PAGE_ID_UNSPECIFIED;
        }
        return a;
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
