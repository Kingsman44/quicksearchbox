package com.google.protos.p4895aw.p4902b;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.protos.aw.b.al */
/* compiled from: PG */
public final class C63975al extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C63975al f173015c;

    /* renamed from: d */
    private static volatile C63010eb f173016d;

    /* renamed from: a */
    public int f173017a;

    /* renamed from: b */
    public long f173018b;

    static {
        C63975al alVar = new C63975al();
        f173015c = alVar;
        C62942bv.registerDefaultInstance(C63975al.class, alVar);
    }

    private C63975al() {
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
                return newMessageInfo(f173015c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဂ\u0000", new Object[]{"a", "b"});
            case 3:
                return new C63975al();
            case 4:
                return new C63974ak();
            case 5:
                return f173015c;
            case 6:
                C63010eb ebVar = f173016d;
                if (ebVar == null) {
                    synchronized (C63975al.class) {
                        ebVar = f173016d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f173015c);
                            f173016d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
