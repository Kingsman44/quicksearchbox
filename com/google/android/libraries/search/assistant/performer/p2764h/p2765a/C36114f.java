package com.google.android.libraries.search.assistant.performer.p2764h.p2765a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.search.assistant.performer.h.a.f */
/* compiled from: PG */
public final class C36114f extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C36114f f94447b;

    /* renamed from: c */
    private static volatile C63010eb f94448c;

    /* renamed from: a */
    public C62971cq f94449a = C62942bv.emptyProtobufList();

    static {
        C36114f fVar = new C36114f();
        f94447b = fVar;
        C62942bv.registerDefaultInstance(C36114f.class, fVar);
    }

    private C36114f() {
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
                return newMessageInfo(f94447b, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001Ț", new Object[]{"a"});
            case 3:
                return new C36114f();
            case 4:
                return new C36113e();
            case 5:
                return f94447b;
            case 6:
                C63010eb ebVar = f94448c;
                if (ebVar == null) {
                    synchronized (C36114f.class) {
                        ebVar = f94448c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f94447b);
                            f94448c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
