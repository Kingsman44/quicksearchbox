package com.google.p427am.p432b.p433a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62961ch;
import com.google.protobuf.C62962ci;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.am.b.a.au */
/* compiled from: PG */
public final class C8642au extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C62962ci f29922c = new C8637ap();

    /* renamed from: e */
    public static final C62962ci f29923e = new C8638aq();

    /* renamed from: f */
    public static final C8642au f29924f;

    /* renamed from: g */
    private static volatile C63010eb f29925g;

    /* renamed from: a */
    public int f29926a;

    /* renamed from: b */
    public C62961ch f29927b = emptyIntList();

    /* renamed from: d */
    public C62961ch f29928d = emptyIntList();

    static {
        C8642au auVar = new C8642au();
        f29924f = auVar;
        C62942bv.registerDefaultInstance(C8642au.class, auVar);
    }

    private C8642au() {
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
                return newMessageInfo(f29924f, "\u0000\u0003\u0000\u0000\u0001\u0004\u0003\u0000\u0002\u0000\u0001\f\u0003,\u0004,", new Object[]{"a", "b", "d"});
            case 3:
                return new C8642au();
            case 4:
                return new C8639ar();
            case 5:
                return f29924f;
            case 6:
                C63010eb ebVar = f29925g;
                if (ebVar == null) {
                    synchronized (C8642au.class) {
                        ebVar = f29925g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f29924f);
                            f29925g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
