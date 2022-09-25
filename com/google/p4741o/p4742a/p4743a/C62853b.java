package com.google.p4741o.p4742a.p4743a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.o.a.a.b */
/* compiled from: PG */
public final class C62853b extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C62853b f169733c;

    /* renamed from: d */
    private static volatile C63010eb f169734d;

    /* renamed from: a */
    public C62865n f169735a;

    /* renamed from: b */
    public C62971cq f169736b = emptyProtobufList();

    static {
        C62853b bVar = new C62853b();
        f169733c = bVar;
        C62942bv.registerDefaultInstance(C62853b.class, bVar);
    }

    private C62853b() {
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
                return newMessageInfo(f169733c, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\t\u0002\u001b", new Object[]{"a", "b", C62863l.class});
            case 3:
                return new C62853b();
            case 4:
                return new C62852a();
            case 5:
                return f169733c;
            case 6:
                C63010eb ebVar = f169734d;
                if (ebVar == null) {
                    synchronized (C62853b.class) {
                        ebVar = f169734d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f169733c);
                            f169734d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
