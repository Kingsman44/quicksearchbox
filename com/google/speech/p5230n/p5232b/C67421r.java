package com.google.speech.p5230n.p5232b;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.speech.n.b.r */
/* compiled from: PG */
public final class C67421r extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C67421r f183231a;

    /* renamed from: b */
    private static volatile C63010eb f183232b;

    static {
        C67421r rVar = new C67421r();
        f183231a = rVar;
        C62942bv.registerDefaultInstance(C67421r.class, rVar);
    }

    private C67421r() {
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
                return newMessageInfo(f183231a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C67421r();
            case 4:
                return new C67420q();
            case 5:
                return f183231a;
            case 6:
                C63010eb ebVar = f183232b;
                if (ebVar == null) {
                    synchronized (C67421r.class) {
                        ebVar = f183232b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f183231a);
                            f183232b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
