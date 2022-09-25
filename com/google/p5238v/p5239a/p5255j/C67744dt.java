package com.google.p5238v.p5239a.p5255j;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

@Deprecated
/* renamed from: com.google.v.a.j.dt */
/* compiled from: PG */
public final class C67744dt extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C67744dt f183797a;

    /* renamed from: b */
    private static volatile C63010eb f183798b;

    static {
        C67744dt dtVar = new C67744dt();
        f183797a = dtVar;
        C62942bv.registerDefaultInstance(C67744dt.class, dtVar);
    }

    private C67744dt() {
        emptyProtobufList();
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
                return newMessageInfo(f183797a, "\u0000\u0000", (Object[]) null);
            case 3:
                return new C67744dt();
            case 4:
                return new C67743ds();
            case 5:
                return f183797a;
            case 6:
                C63010eb ebVar = f183798b;
                if (ebVar == null) {
                    synchronized (C67744dt.class) {
                        ebVar = f183798b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f183797a);
                            f183798b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
