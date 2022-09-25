package com.google.android.libraries.search.assistant.invocation.p2655o.p2656a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62937bq;
import com.google.protobuf.C62938br;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.search.assistant.invocation.o.a.bj */
/* compiled from: PG */
public final class C34047bj extends C62937bq implements C62938br {

    /* renamed from: a */
    public static final C34047bj f90746a;

    /* renamed from: c */
    private static volatile C63010eb f90747c;

    /* renamed from: b */
    private byte f90748b = 2;

    static {
        C34047bj bjVar = new C34047bj();
        f90746a = bjVar;
        C62942bv.registerDefaultInstance(C34047bj.class, bjVar);
    }

    private C34047bj() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f90748b);
            case 1:
                this.f90748b = obj == null ? (byte) 0 : 1;
                return null;
            case 2:
                return newMessageInfo(f90746a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C34047bj();
            case 4:
                return new C34046bi();
            case 5:
                return f90746a;
            case 6:
                C63010eb ebVar = f90747c;
                if (ebVar == null) {
                    synchronized (C34047bj.class) {
                        ebVar = f90747c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f90746a);
                            f90747c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
