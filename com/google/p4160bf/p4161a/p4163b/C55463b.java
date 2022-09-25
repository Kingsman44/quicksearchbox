package com.google.p4160bf.p4161a.p4163b;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63088z;

/* renamed from: com.google.bf.a.b.b */
/* compiled from: PG */
public final class C55463b extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C55463b f146320a;

    /* renamed from: b */
    private static volatile C63010eb f146321b;

    static {
        C55463b bVar = new C55463b();
        f146320a = bVar;
        C62942bv.registerDefaultInstance(C55463b.class, bVar);
    }

    private C55463b() {
        C63088z zVar = C63088z.f170246b;
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
                return newMessageInfo(f146320a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C55463b();
            case 4:
                return new C55436a();
            case 5:
                return f146320a;
            case 6:
                C63010eb ebVar = f146321b;
                if (ebVar == null) {
                    synchronized (C55463b.class) {
                        ebVar = f146321b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f146320a);
                            f146321b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
