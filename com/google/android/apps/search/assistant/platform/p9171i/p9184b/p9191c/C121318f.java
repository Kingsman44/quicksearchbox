package com.google.android.apps.search.assistant.platform.p9171i.p9184b.p9191c;

import com.google.p4500cm.p4501a.p4506b.p4507a.C58148f;
import com.google.protobuf.C62921ba;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62974ct;
import java.nio.ByteBuffer;
import p3186j$.util.Optional;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.search.assistant.platform.i.b.c.f */
/* compiled from: PG */
public final /* synthetic */ class C121318f implements Function {

    /* renamed from: a */
    public static final /* synthetic */ C121318f f336907a = new C121318f();

    private /* synthetic */ C121318f() {
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        try {
            return Optional.ofNullable((C58148f) C62942bv.parseFrom((C62942bv) C58148f.f155452f, (ByteBuffer) obj, C62921ba.m95368a()));
        } catch (C62974ct unused) {
            return Optional.empty();
        }
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
