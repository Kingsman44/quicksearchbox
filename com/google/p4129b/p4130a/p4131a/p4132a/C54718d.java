package com.google.p4129b.p4130a.p4131a.p4132a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62961ch;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.b.a.a.a.d */
/* compiled from: PG */
public final class C54718d extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C54718d f143611b;

    /* renamed from: c */
    private static volatile C63010eb f143612c;

    /* renamed from: a */
    public C62961ch f143613a = emptyIntList();

    static {
        C54718d dVar = new C54718d();
        f143611b = dVar;
        C62942bv.registerDefaultInstance(C54718d.class, dVar);
    }

    private C54718d() {
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
                return newMessageInfo(f143611b, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001,", new Object[]{"a"});
            case 3:
                return new C54718d();
            case 4:
                return new C54710c();
            case 5:
                return f143611b;
            case 6:
                C63010eb ebVar = f143612c;
                if (ebVar == null) {
                    synchronized (C54718d.class) {
                        ebVar = f143612c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f143611b);
                            f143612c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
