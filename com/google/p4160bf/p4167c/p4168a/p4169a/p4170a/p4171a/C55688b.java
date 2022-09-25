package com.google.p4160bf.p4167c.p4168a.p4169a.p4170a.p4171a;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.bf.c.a.a.a.a.b */
/* compiled from: PG */
public final class C55688b extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C55688b f146919b;

    /* renamed from: d */
    private static volatile C63010eb f146920d;

    /* renamed from: a */
    public boolean f146921a;

    /* renamed from: c */
    private int f146922c;

    static {
        C55688b bVar = new C55688b();
        f146919b = bVar;
        C62942bv.registerDefaultInstance(C55688b.class, bVar);
    }

    private C55688b() {
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
                return newMessageInfo(f146919b, "\u0001\u0001\u0000\u0001\u0003\u0003\u0001\u0000\u0000\u0000\u0003ဇ\u0001", new Object[]{C45240c.f118157a, "a"});
            case 3:
                return new C55688b();
            case 4:
                return new C55687a();
            case 5:
                return f146919b;
            case 6:
                C63010eb ebVar = f146920d;
                if (ebVar == null) {
                    synchronized (C55688b.class) {
                        ebVar = f146920d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f146919b);
                            f146920d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
