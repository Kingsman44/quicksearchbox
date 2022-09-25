package com.google.p4500cm.p4501a.p4502a.p4503a.p4504a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63088z;

/* renamed from: com.google.cm.a.a.a.a.b */
/* compiled from: PG */
public final class C58138b extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C58138b f155425c;

    /* renamed from: d */
    private static volatile C63010eb f155426d;

    /* renamed from: a */
    public int f155427a;

    /* renamed from: b */
    public C63088z f155428b = C63088z.f170246b;

    static {
        C58138b bVar = new C58138b();
        f155425c = bVar;
        C62942bv.registerDefaultInstance(C58138b.class, bVar);
    }

    private C58138b() {
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
                return newMessageInfo(f155425c, "\u0001\u0001\u0000\u0001\u0004\u0004\u0001\u0000\u0000\u0000\u0004ည\u0003", new Object[]{"a", "b"});
            case 3:
                return new C58138b();
            case 4:
                return new C58137a();
            case 5:
                return f155425c;
            case 6:
                C63010eb ebVar = f155426d;
                if (ebVar == null) {
                    synchronized (C58138b.class) {
                        ebVar = f155426d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f155425c);
                            f155426d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
