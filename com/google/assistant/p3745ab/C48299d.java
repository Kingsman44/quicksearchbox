package com.google.assistant.p3745ab;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.ab.d */
/* compiled from: PG */
public final class C48299d extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C48299d f124920b;

    /* renamed from: c */
    private static volatile C63010eb f124921c;

    /* renamed from: a */
    public C48322f f124922a;

    static {
        C48299d dVar = new C48299d();
        f124920b = dVar;
        C62942bv.registerDefaultInstance(C48299d.class, dVar);
    }

    private C48299d() {
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
                return newMessageInfo(f124920b, "\u0000\u0001\u0000\u0000\u0002\u0002\u0001\u0000\u0000\u0000\u0002\t", new Object[]{"a"});
            case 3:
                return new C48299d();
            case 4:
                return new C48270c();
            case 5:
                return f124920b;
            case 6:
                C63010eb ebVar = f124921c;
                if (ebVar == null) {
                    synchronized (C48299d.class) {
                        ebVar = f124921c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f124920b);
                            f124921c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
