package com.google.protos.p4963bf.p4964a.p4965a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.protos.bf.a.a.aa */
/* compiled from: PG */
public final class C64552aa extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C64552aa f175054a;

    /* renamed from: b */
    private static volatile C63010eb f175055b;

    static {
        C64552aa aaVar = new C64552aa();
        f175054a = aaVar;
        C62942bv.registerDefaultInstance(C64552aa.class, aaVar);
    }

    private C64552aa() {
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
                return newMessageInfo(f175054a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C64552aa();
            case 4:
                return new C64621z();
            case 5:
                return f175054a;
            case 6:
                C63010eb ebVar = f175055b;
                if (ebVar == null) {
                    synchronized (C64552aa.class) {
                        ebVar = f175055b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f175054a);
                            f175055b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
