package com.google.assistant.p3897e.p3902c.p3903a.p3904a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.e.c.a.a.x */
/* compiled from: PG */
public final class C50921x extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C50921x f132569c;

    /* renamed from: d */
    private static volatile C63010eb f132570d;

    /* renamed from: a */
    public int f132571a;

    /* renamed from: b */
    public C50919v f132572b;

    static {
        C50921x xVar = new C50921x();
        f132569c = xVar;
        C62942bv.registerDefaultInstance(C50921x.class, xVar);
    }

    private C50921x() {
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
                return newMessageInfo(f132569c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"a", "b"});
            case 3:
                return new C50921x();
            case 4:
                return new C50920w();
            case 5:
                return f132569c;
            case 6:
                C63010eb ebVar = f132570d;
                if (ebVar == null) {
                    synchronized (C50921x.class) {
                        ebVar = f132570d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f132569c);
                            f132570d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
