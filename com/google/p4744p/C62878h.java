package com.google.p4744p;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.p.h */
/* compiled from: PG */
public final class C62878h extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C62878h f169773c;

    /* renamed from: d */
    private static volatile C63010eb f169774d;

    /* renamed from: a */
    public C62880j f169775a;

    /* renamed from: b */
    public C62971cq f169776b = emptyProtobufList();

    static {
        C62878h hVar = new C62878h();
        f169773c = hVar;
        C62942bv.registerDefaultInstance(C62878h.class, hVar);
    }

    private C62878h() {
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
                return newMessageInfo(f169773c, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\t\u0002\u001b", new Object[]{"a", "b", C62872b.class});
            case 3:
                return new C62878h();
            case 4:
                return new C62877g();
            case 5:
                return f169773c;
            case 6:
                C63010eb ebVar = f169774d;
                if (ebVar == null) {
                    synchronized (C62878h.class) {
                        ebVar = f169774d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f169773c);
                            f169774d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
