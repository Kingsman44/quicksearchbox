package com.google.common.p4552o;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.common.o.mg */
/* compiled from: PG */
public final class C60266mg extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C60266mg f163051c;

    /* renamed from: d */
    private static volatile C63010eb f163052d;

    /* renamed from: a */
    public int f163053a;

    /* renamed from: b */
    public C60305nr f163054b;

    static {
        C60266mg mgVar = new C60266mg();
        f163051c = mgVar;
        C62942bv.registerDefaultInstance(C60266mg.class, mgVar);
    }

    private C60266mg() {
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
                return newMessageInfo(f163051c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"a", "b"});
            case 3:
                return new C60266mg();
            case 4:
                return new C60265mf();
            case 5:
                return f163051c;
            case 6:
                C63010eb ebVar = f163052d;
                if (ebVar == null) {
                    synchronized (C60266mg.class) {
                        ebVar = f163052d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f163051c);
                            f163052d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
