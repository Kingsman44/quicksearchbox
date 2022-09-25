package com.google.p4242bp.p4266g;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.bp.g.f */
/* compiled from: PG */
public final class C56356f extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C56356f f150299a;

    /* renamed from: c */
    private static volatile C63010eb f150300c;

    /* renamed from: b */
    private byte f150301b = 2;

    static {
        C56356f fVar = new C56356f();
        f150299a = fVar;
        C62942bv.registerDefaultInstance(C56356f.class, fVar);
    }

    private C56356f() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f150301b);
            case 1:
                this.f150301b = obj == null ? (byte) 0 : 1;
                return null;
            case 2:
                return newMessageInfo(f150299a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C56356f();
            case 4:
                return new C56355e();
            case 5:
                return f150299a;
            case 6:
                C63010eb ebVar = f150300c;
                if (ebVar == null) {
                    synchronized (C56356f.class) {
                        ebVar = f150300c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f150299a);
                            f150300c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
