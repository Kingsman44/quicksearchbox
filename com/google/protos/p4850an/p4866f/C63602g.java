package com.google.protos.p4850an.p4866f;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.protos.an.f.g */
/* compiled from: PG */
public final class C63602g extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C63602g f172028a;

    /* renamed from: b */
    private static volatile C63010eb f172029b;

    static {
        C63602g gVar = new C63602g();
        f172028a = gVar;
        C62942bv.registerDefaultInstance(C63602g.class, gVar);
    }

    private C63602g() {
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
                return newMessageInfo(f172028a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C63602g();
            case 4:
                return new C63601f();
            case 5:
                return f172028a;
            case 6:
                C63010eb ebVar = f172029b;
                if (ebVar == null) {
                    synchronized (C63602g.class) {
                        ebVar = f172029b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f172028a);
                            f172029b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
