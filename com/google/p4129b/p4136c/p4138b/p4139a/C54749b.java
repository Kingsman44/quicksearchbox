package com.google.p4129b.p4136c.p4138b.p4139a;

import com.google.p4129b.p4136c.p4138b.C54752d;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.b.c.b.a.b */
/* compiled from: PG */
public final class C54749b extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C54749b f143659a;

    /* renamed from: c */
    private static volatile C63010eb f143660c;

    /* renamed from: b */
    private C54752d f143661b;

    static {
        C54749b bVar = new C54749b();
        f143659a = bVar;
        C62942bv.registerDefaultInstance(C54749b.class, bVar);
    }

    private C54749b() {
        emptyProtobufList();
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
                return newMessageInfo(f143659a, "\u0000\u0001\u0000\u0000\u0003\u0003\u0001\u0000\u0000\u0000\u0003\t", new Object[]{"b"});
            case 3:
                return new C54749b();
            case 4:
                return new C54748a();
            case 5:
                return f143659a;
            case 6:
                C63010eb ebVar = f143660c;
                if (ebVar == null) {
                    synchronized (C54749b.class) {
                        ebVar = f143660c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f143659a);
                            f143660c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
