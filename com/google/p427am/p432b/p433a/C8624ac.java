package com.google.p427am.p432b.p433a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.am.b.a.ac */
/* compiled from: PG */
public final class C8624ac extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C8624ac f29887b;

    /* renamed from: c */
    private static volatile C63010eb f29888c;

    /* renamed from: a */
    public int f29889a;

    static {
        C8624ac acVar = new C8624ac();
        f29887b = acVar;
        C62942bv.registerDefaultInstance(C8624ac.class, acVar);
    }

    private C8624ac() {
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
                return newMessageInfo(f29887b, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\f", new Object[]{"a"});
            case 3:
                return new C8624ac();
            case 4:
                return new C8622aa();
            case 5:
                return f29887b;
            case 6:
                C63010eb ebVar = f29888c;
                if (ebVar == null) {
                    synchronized (C8624ac.class) {
                        ebVar = f29888c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f29887b);
                            f29888c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
