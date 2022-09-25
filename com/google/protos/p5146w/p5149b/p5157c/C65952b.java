package com.google.protos.p5146w.p5149b.p5157c;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protos.p5146w.p5147a.p5148a.C65930h;

/* renamed from: com.google.protos.w.b.c.b */
/* compiled from: PG */
public final class C65952b extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C65952b f179381b;

    /* renamed from: d */
    private static volatile C63010eb f179382d;

    /* renamed from: a */
    public C62971cq f179383a = emptyProtobufList();

    /* renamed from: c */
    private byte f179384c = 2;

    static {
        C65952b bVar = new C65952b();
        f179381b = bVar;
        C62942bv.registerDefaultInstance(C65952b.class, bVar);
    }

    private C65952b() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f179384c);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f179384c = b;
                return null;
            case 2:
                return newMessageInfo(f179381b, "\u0001\u0001\u0000\u0000\u0002\u0002\u0001\u0000\u0001\u0001\u0002Л", new Object[]{"a", C65930h.class});
            case 3:
                return new C65952b();
            case 4:
                return new C65947a();
            case 5:
                return f179381b;
            case 6:
                C63010eb ebVar = f179382d;
                if (ebVar == null) {
                    synchronized (C65952b.class) {
                        ebVar = f179382d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f179381b);
                            f179382d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
