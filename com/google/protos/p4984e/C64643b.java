package com.google.protos.p4984e;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.protos.e.b */
/* compiled from: PG */
public final class C64643b extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C64643b f175228a;

    /* renamed from: b */
    private static volatile C63010eb f175229b;

    static {
        C64643b bVar = new C64643b();
        f175228a = bVar;
        C62942bv.registerDefaultInstance(C64643b.class, bVar);
    }

    private C64643b() {
        emptyFloatList();
        emptyProtobufList();
        emptyIntList();
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
                return newMessageInfo(f175228a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C64643b();
            case 4:
                return new C64642a();
            case 5:
                return f175228a;
            case 6:
                C63010eb ebVar = f175229b;
                if (ebVar == null) {
                    synchronized (C64643b.class) {
                        ebVar = f175229b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f175228a);
                            f175229b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
