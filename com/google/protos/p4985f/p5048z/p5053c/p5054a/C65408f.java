package com.google.protos.p4985f.p5048z.p5053c.p5054a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.protos.f.z.c.a.f */
/* compiled from: PG */
public final class C65408f extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C65408f f177826c;

    /* renamed from: d */
    private static volatile C63010eb f177827d;

    /* renamed from: a */
    public int f177828a;

    /* renamed from: b */
    public int f177829b;

    static {
        C65408f fVar = new C65408f();
        f177826c = fVar;
        C62942bv.registerDefaultInstance(C65408f.class, fVar);
    }

    private C65408f() {
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
                return newMessageInfo(f177826c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဌ\u0000", new Object[]{"a", "b", C65407e.f177825a});
            case 3:
                return new C65408f();
            case 4:
                return new C65406d();
            case 5:
                return f177826c;
            case 6:
                C63010eb ebVar = f177827d;
                if (ebVar == null) {
                    synchronized (C65408f.class) {
                        ebVar = f177827d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f177826c);
                            f177827d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
