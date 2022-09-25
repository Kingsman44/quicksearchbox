package com.google.p4017at.p4082j.p4083a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.at.j.a.cf */
/* compiled from: PG */
public final class C54380cf extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C54380cf f142839c;

    /* renamed from: d */
    private static volatile C63010eb f142840d;

    /* renamed from: a */
    public long f142841a;

    /* renamed from: b */
    public C62971cq f142842b = emptyProtobufList();

    static {
        C54380cf cfVar = new C54380cf();
        f142839c = cfVar;
        C62942bv.registerDefaultInstance(C54380cf.class, cfVar);
    }

    private C54380cf() {
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
                return newMessageInfo(f142839c, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u0002\u0002\u001b", new Object[]{"a", "b", C54455t.class});
            case 3:
                return new C54380cf();
            case 4:
                return new C54379ce();
            case 5:
                return f142839c;
            case 6:
                C63010eb ebVar = f142840d;
                if (ebVar == null) {
                    synchronized (C54380cf.class) {
                        ebVar = f142840d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f142839c);
                            f142840d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
