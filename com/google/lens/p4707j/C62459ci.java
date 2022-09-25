package com.google.lens.p4707j;

import com.google.lens.p4699e.C62231l;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.lens.j.ci */
/* compiled from: PG */
public final class C62459ci extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C62459ci f168655c;

    /* renamed from: d */
    private static volatile C63010eb f168656d;

    /* renamed from: a */
    public int f168657a;

    /* renamed from: b */
    public C62231l f168658b;

    static {
        C62459ci ciVar = new C62459ci();
        f168655c = ciVar;
        C62942bv.registerDefaultInstance(C62459ci.class, ciVar);
    }

    private C62459ci() {
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
                return newMessageInfo(f168655c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"a", "b"});
            case 3:
                return new C62459ci();
            case 4:
                return new C62458ch();
            case 5:
                return f168655c;
            case 6:
                C63010eb ebVar = f168656d;
                if (ebVar == null) {
                    synchronized (C62459ci.class) {
                        ebVar = f168656d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f168655c);
                            f168656d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
