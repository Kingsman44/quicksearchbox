package com.google.android.p10713e;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.e.b */
/* compiled from: PG */
public final class C142536b extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C142536b f386772a;

    /* renamed from: b */
    private static volatile C63010eb f386773b;

    static {
        C142536b bVar = new C142536b();
        f386772a = bVar;
        C62942bv.registerDefaultInstance(C142536b.class, bVar);
    }

    private C142536b() {
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
                return newMessageInfo(f386772a, "\u0000\u0000", (Object[]) null);
            case 3:
                return new C142536b();
            case 4:
                return new C142535a();
            case 5:
                return f386772a;
            case 6:
                C63010eb ebVar = f386773b;
                if (ebVar == null) {
                    synchronized (C142536b.class) {
                        ebVar = f386773b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f386772a);
                            f386773b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
