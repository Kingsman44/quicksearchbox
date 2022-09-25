package com.google.p5277z.p5281b;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.z.b.f */
/* compiled from: PG */
public final class C67985f extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C67985f f184222a;

    /* renamed from: b */
    private static volatile C63010eb f184223b;

    static {
        C67985f fVar = new C67985f();
        f184222a = fVar;
        C62942bv.registerDefaultInstance(C67985f.class, fVar);
    }

    private C67985f() {
        emptyProtobufList();
        C62942bv.emptyProtobufList();
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        switch (buVar.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return newMessageInfo(f184222a, "\u0000\u0000", (Object[]) null);
            case 3:
                return new C67985f();
            case 4:
                return new C67984e();
            case 5:
                return f184222a;
            case 6:
                C63010eb ebVar = f184223b;
                if (ebVar == null) {
                    synchronized (C67985f.class) {
                        ebVar = f184223b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f184222a);
                            f184223b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
