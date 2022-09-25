package com.google.protos.p4985f.p4988b.p4990b.p4991a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.protos.f.b.b.a.b */
/* compiled from: PG */
public final class C64723b extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C64723b f175443b;

    /* renamed from: c */
    private static volatile C63010eb f175444c;

    /* renamed from: a */
    public int f175445a;

    static {
        C64723b bVar = new C64723b();
        f175443b = bVar;
        C62942bv.registerDefaultInstance(C64723b.class, bVar);
    }

    private C64723b() {
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
                return newMessageInfo(f175443b, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\f", new Object[]{"a"});
            case 3:
                return new C64723b();
            case 4:
                return new C64722a();
            case 5:
                return f175443b;
            case 6:
                C63010eb ebVar = f175444c;
                if (ebVar == null) {
                    synchronized (C64723b.class) {
                        ebVar = f175444c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f175443b);
                            f175444c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
