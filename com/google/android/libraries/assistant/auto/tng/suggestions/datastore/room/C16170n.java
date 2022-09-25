package com.google.android.libraries.assistant.auto.tng.suggestions.datastore.room;

import com.google.android.libraries.assistant.auto.tng.suggestions.p1263k.C16333ag;
import com.google.common.p4537i.C59294s;

/* renamed from: com.google.android.libraries.assistant.auto.tng.suggestions.datastore.room.n */
/* compiled from: PG */
public abstract class C16170n {
    /* renamed from: h */
    public static C16170n m33197h(String str, String str2, String str3, String str4, C16169m mVar, Long l, C16333ag agVar) {
        C16064a aVar = new C16064a();
        aVar.mo22677c(str);
        aVar.mo22676b(str2);
        aVar.f47529b = str3;
        aVar.mo22678d(str4);
        aVar.mo22680f(mVar);
        aVar.f47530c = l;
        aVar.mo22679e(agVar);
        return aVar.mo22675a();
    }

    /* renamed from: i */
    public static final String m33198i(String str, String str2, C16169m mVar) {
        String valueOf = String.valueOf(mVar);
        return C59294s.m92134d().mo56760b(str + "|" + str2 + "|" + valueOf).toString();
    }

    /* renamed from: a */
    public abstract C16169m mo22746a();

    /* renamed from: b */
    public abstract C16333ag mo22747b();

    /* renamed from: c */
    public abstract Long mo22748c();

    /* renamed from: d */
    public abstract String mo22749d();

    /* renamed from: e */
    public abstract String mo22750e();

    /* renamed from: f */
    public abstract String mo22752f();

    /* renamed from: g */
    public abstract String mo22753g();

    public final String toString() {
        String f = mo22752f();
        String e = mo22750e();
        String g = mo22753g();
        String valueOf = String.valueOf(mo22746a());
        return "CS{" + f + "|" + e + "|" + g + "|" + valueOf + "}";
    }
}
