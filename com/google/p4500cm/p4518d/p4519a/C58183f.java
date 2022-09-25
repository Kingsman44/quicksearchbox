package com.google.p4500cm.p4518d.p4519a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.cm.d.a.f */
/* compiled from: PG */
public final class C58183f extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C58183f f155559c;

    /* renamed from: d */
    private static volatile C63010eb f155560d;

    /* renamed from: a */
    public int f155561a;

    /* renamed from: b */
    public double f155562b;

    static {
        C58183f fVar = new C58183f();
        f155559c = fVar;
        C62942bv.registerDefaultInstance(C58183f.class, fVar);
    }

    private C58183f() {
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
                return newMessageInfo(f155559c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001က\u0000", new Object[]{"a", "b"});
            case 3:
                return new C58183f();
            case 4:
                return new C58182e();
            case 5:
                return f155559c;
            case 6:
                C63010eb ebVar = f155560d;
                if (ebVar == null) {
                    synchronized (C58183f.class) {
                        ebVar = f155560d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f155559c);
                            f155560d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
