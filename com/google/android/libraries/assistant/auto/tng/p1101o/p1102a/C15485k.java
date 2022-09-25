package com.google.android.libraries.assistant.auto.tng.p1101o.p1102a;

import com.google.common.p4522b.C58370cn;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4552o.C59754ek;
import com.google.common.p4552o.C59755el;
import com.google.protobuf.C62947c;
import java.util.List;
import p3186j$.util.DesugarArrays;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.libraries.assistant.auto.tng.o.a.k */
/* compiled from: PG */
public final /* synthetic */ class C15485k implements Function {

    /* renamed from: a */
    public static final /* synthetic */ C15485k f46432a = new C15485k();

    private /* synthetic */ C15485k() {
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        Throwable th = (Throwable) obj;
        C59754ek ekVar = (C59754ek) C59755el.f161455d.createBuilder();
        String simpleName = th.getClass().getSimpleName();
        ekVar.copyOnWrite();
        C59755el elVar = (C59755el) ekVar.instance;
        simpleName.getClass();
        elVar.f161457a |= 1;
        elVar.f161458b = simpleName;
        ekVar.copyOnWrite();
        C59755el elVar2 = (C59755el) ekVar.instance;
        elVar2.mo57055a();
        C62947c.addAll((Iterable) (C58485gu) DesugarArrays.stream((T[]) th.getStackTrace()).map(C15486l.f46433a).collect(C58370cn.f155946a), (List) elVar2.f161459c);
        return (C59755el) ekVar.build();
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
