package com.google.android.libraries.p11016ak.p11019c.p11020a;

import com.google.android.libraries.p11016ak.C147732n;
import com.google.android.libraries.p11016ak.C147734p;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60916ec;
import com.google.protobuf.C62910ar;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.libraries.ak.c.a.e */
/* compiled from: PG */
public final /* synthetic */ class C147641e implements Function {

    /* renamed from: a */
    public static final /* synthetic */ C147641e f398482a = new C147641e();

    private /* synthetic */ C147641e() {
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        try {
            C147732n nVar = ((C147734p) ((C60870cx) ((Map.Entry) obj).getValue()).get()).f398653a;
            if (nVar == null) {
                nVar = C147732n.f398646d;
            }
            C62910ar arVar = nVar.f398650c;
            return arVar == null ? C62910ar.f169858c : arVar;
        } catch (InterruptedException | ExecutionException e) {
            throw new C60916ec(e);
        }
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
