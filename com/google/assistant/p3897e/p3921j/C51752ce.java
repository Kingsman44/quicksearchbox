package com.google.assistant.p3897e.p3921j;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.e.j.ce */
/* compiled from: PG */
public final class C51752ce extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C51752ce f135774c;

    /* renamed from: d */
    private static volatile C63010eb f135775d;

    /* renamed from: a */
    public int f135776a;

    /* renamed from: b */
    public boolean f135777b;

    static {
        C51752ce ceVar = new C51752ce();
        f135774c = ceVar;
        C62942bv.registerDefaultInstance(C51752ce.class, ceVar);
    }

    private C51752ce() {
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
                return newMessageInfo(f135774c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဇ\u0000", new Object[]{"a", "b"});
            case 3:
                return new C51752ce();
            case 4:
                return new C51751cd();
            case 5:
                return f135774c;
            case 6:
                C63010eb ebVar = f135775d;
                if (ebVar == null) {
                    synchronized (C51752ce.class) {
                        ebVar = f135775d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f135774c);
                            f135775d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
