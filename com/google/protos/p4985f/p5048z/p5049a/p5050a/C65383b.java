package com.google.protos.p4985f.p5048z.p5049a.p5050a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protos.p5127o.C65682h;

/* renamed from: com.google.protos.f.z.a.a.b */
/* compiled from: PG */
public final class C65383b extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C65383b f177790c;

    /* renamed from: d */
    private static volatile C63010eb f177791d;

    /* renamed from: a */
    public int f177792a;

    /* renamed from: b */
    public C65682h f177793b;

    static {
        C65383b bVar = new C65383b();
        f177790c = bVar;
        C62942bv.registerDefaultInstance(C65383b.class, bVar);
    }

    private C65383b() {
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
                return newMessageInfo(f177790c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"a", "b"});
            case 3:
                return new C65383b();
            case 4:
                return new C65382a();
            case 5:
                return f177790c;
            case 6:
                C63010eb ebVar = f177791d;
                if (ebVar == null) {
                    synchronized (C65383b.class) {
                        ebVar = f177791d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f177790c);
                            f177791d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
