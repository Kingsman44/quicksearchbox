package com.google.protos.p4985f.p5030q;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.protos.f.q.im */
/* compiled from: PG */
public final class C65287im extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C65287im f176602c;

    /* renamed from: e */
    private static volatile C63010eb f176603e;

    /* renamed from: a */
    public C62971cq f176604a = C62942bv.emptyProtobufList();

    /* renamed from: b */
    public C65161dv f176605b;

    /* renamed from: d */
    private int f176606d;

    static {
        C65287im imVar = new C65287im();
        f176602c = imVar;
        C62942bv.registerDefaultInstance(C65287im.class, imVar);
    }

    private C65287im() {
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
                return newMessageInfo(f176602c, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001a\u0002ဉ\u0000", new Object[]{"d", "a", "b"});
            case 3:
                return new C65287im();
            case 4:
                return new C65286il();
            case 5:
                return f176602c;
            case 6:
                C63010eb ebVar = f176603e;
                if (ebVar == null) {
                    synchronized (C65287im.class) {
                        ebVar = f176603e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f176602c);
                            f176603e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
