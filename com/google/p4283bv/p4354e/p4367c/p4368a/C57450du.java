package com.google.p4283bv.p4354e.p4367c.p4368a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.bv.e.c.a.du */
/* compiled from: PG */
public final class C57450du extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C57450du f153462c;

    /* renamed from: d */
    private static volatile C63010eb f153463d;

    /* renamed from: a */
    public int f153464a;

    /* renamed from: b */
    public int f153465b;

    static {
        C57450du duVar = new C57450du();
        f153462c = duVar;
        C62942bv.registerDefaultInstance(C57450du.class, duVar);
    }

    private C57450du() {
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
                return newMessageInfo(f153462c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001င\u0000", new Object[]{"a", "b"});
            case 3:
                return new C57450du();
            case 4:
                return new C57449dt();
            case 5:
                return f153462c;
            case 6:
                C63010eb ebVar = f153463d;
                if (ebVar == null) {
                    synchronized (C57450du.class) {
                        ebVar = f153463d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f153462c);
                            f153463d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
