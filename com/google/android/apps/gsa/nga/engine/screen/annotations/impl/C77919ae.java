package com.google.android.apps.gsa.nga.engine.screen.annotations.impl;

import com.google.android.apps.gsa.nga.d.a.p;
import com.google.android.apps.gsa.nga.d.a.r;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.protobuf.C62921ba;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62974ct;
import p3186j$.util.Optional;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.gsa.nga.engine.screen.annotations.impl.ae */
/* compiled from: PG */
public final /* synthetic */ class C77919ae implements Function {

    /* renamed from: a */
    public final /* synthetic */ p f214648a;

    /* renamed from: b */
    public final /* synthetic */ long f214649b;

    public /* synthetic */ C77919ae(p pVar, long j) {
        this.f214648a = pVar;
        this.f214649b = j;
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        p pVar = this.f214648a;
        try {
            byte[] nativeAnnotate = NativeScreenAnnotator.nativeAnnotate(((NativeScreenAnnotator) obj).f214628b, this.f214649b, pVar.toByteArray());
            if (nativeAnnotate != null) {
                return Optional.m71637of(C62942bv.parseFrom((C62942bv) r.b, nativeAnnotate, C62921ba.m95368a()));
            }
            throw new C62974ct("Unable to parse native response: null returned.");
        } catch (C62974ct e) {
            ((C58970a) ((C58970a) ((C58970a) NativeScreenAnnotator.f214627a.mo56225c()).mo56382g(e)).mo56372aa(4517)).mo56386p("Failure parsing from native code.");
            return Optional.empty();
        }
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
