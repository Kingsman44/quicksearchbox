package com.google.assistant.p3739a.p3740a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.a.a.cb */
/* compiled from: PG */
public final class C48095cb extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C48095cb f124463b;

    /* renamed from: c */
    private static volatile C63010eb f124464c;

    /* renamed from: a */
    public long f124465a;

    static {
        C48095cb cbVar = new C48095cb();
        f124463b = cbVar;
        C62942bv.registerDefaultInstance(C48095cb.class, cbVar);
    }

    private C48095cb() {
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
                return newMessageInfo(f124463b, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0002", new Object[]{"a"});
            case 3:
                return new C48095cb();
            case 4:
                return new C48094ca();
            case 5:
                return f124463b;
            case 6:
                C63010eb ebVar = f124464c;
                if (ebVar == null) {
                    synchronized (C48095cb.class) {
                        ebVar = f124464c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f124463b);
                            f124464c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
