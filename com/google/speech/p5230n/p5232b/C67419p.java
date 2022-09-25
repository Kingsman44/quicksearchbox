package com.google.speech.p5230n.p5232b;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.speech.n.b.p */
/* compiled from: PG */
public final class C67419p extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C67419p f183229a;

    /* renamed from: b */
    private static volatile C63010eb f183230b;

    static {
        C67419p pVar = new C67419p();
        f183229a = pVar;
        C62942bv.registerDefaultInstance(C67419p.class, pVar);
    }

    private C67419p() {
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
                return newMessageInfo(f183229a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C67419p();
            case 4:
                return new C67418o();
            case 5:
                return f183229a;
            case 6:
                C63010eb ebVar = f183230b;
                if (ebVar == null) {
                    synchronized (C67419p.class) {
                        ebVar = f183230b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f183229a);
                            f183230b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
