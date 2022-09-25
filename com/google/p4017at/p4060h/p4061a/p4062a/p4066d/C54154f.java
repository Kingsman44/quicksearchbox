package com.google.p4017at.p4060h.p4061a.p4062a.p4066d;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.at.h.a.a.d.f */
/* compiled from: PG */
public final class C54154f extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C54154f f142115b;

    /* renamed from: c */
    private static volatile C63010eb f142116c;

    /* renamed from: a */
    public C62971cq f142117a = emptyProtobufList();

    static {
        C54154f fVar = new C54154f();
        f142115b = fVar;
        C62942bv.registerDefaultInstance(C54154f.class, fVar);
    }

    private C54154f() {
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
                return newMessageInfo(f142115b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"a", C54153e.class});
            case 3:
                return new C54154f();
            case 4:
                return new C54145a();
            case 5:
                return f142115b;
            case 6:
                C63010eb ebVar = f142116c;
                if (ebVar == null) {
                    synchronized (C54154f.class) {
                        ebVar = f142116c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f142115b);
                            f142116c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
