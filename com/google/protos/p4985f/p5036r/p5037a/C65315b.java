package com.google.protos.p4985f.p5036r.p5037a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63088z;

/* renamed from: com.google.protos.f.r.a.b */
/* compiled from: PG */
public final class C65315b extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C65315b f176648a;

    /* renamed from: b */
    private static volatile C63010eb f176649b;

    static {
        C65315b bVar = new C65315b();
        f176648a = bVar;
        C62942bv.registerDefaultInstance(C65315b.class, bVar);
    }

    private C65315b() {
        C63088z zVar = C63088z.f170246b;
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
                return newMessageInfo(f176648a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C65315b();
            case 4:
                return new C65314a();
            case 5:
                return f176648a;
            case 6:
                C63010eb ebVar = f176649b;
                if (ebVar == null) {
                    synchronized (C65315b.class) {
                        ebVar = f176649b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f176648a);
                            f176649b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
