package com.google.android.apps.gsa.nga.engine.p6056o.p6077e.p6090d;

import com.google.android.apps.gsa.nga.engine.p5913am.p5939u.C74965n;
import com.google.android.apps.gsa.nga.engine.p6056o.C77419m;
import com.google.android.apps.gsa.nga.shared.p6407v.C83320io;
import java.util.Locale;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.gsa.nga.engine.o.e.d.av */
/* compiled from: PG */
public final /* synthetic */ class C77023av implements Function {

    /* renamed from: a */
    public final /* synthetic */ C77027az f212581a;

    /* renamed from: b */
    public final /* synthetic */ C74965n f212582b;

    public /* synthetic */ C77023av(C77027az azVar, C74965n nVar) {
        this.f212581a = azVar;
        this.f212582b = nVar;
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        C77027az azVar = this.f212581a;
        C74965n nVar = this.f212582b;
        String str = (String) obj;
        Locale q = nVar.mo71342q();
        C83320io k = nVar.mo71336k();
        if (!azVar.f212603i.mo71722b()) {
            return C77419m.m124184a(str, q);
        }
        String str2 = azVar.f212602h.a(str, k).c;
        if (str2.isEmpty()) {
            return C77419m.m124184a(str, q);
        }
        return str2.endsWith(",") ? String.valueOf(str2.substring(0, str2.length() - 1)).concat(".") : str2;
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
