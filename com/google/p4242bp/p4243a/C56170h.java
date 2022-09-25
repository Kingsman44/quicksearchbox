package com.google.p4242bp.p4243a;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.bp.a.h */
/* compiled from: PG */
public final class C56170h extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C56170h f149659a;

    /* renamed from: e */
    private static volatile C63010eb f149660e;

    /* renamed from: b */
    private int f149661b;

    /* renamed from: c */
    private C56169g f149662c;

    /* renamed from: d */
    private byte f149663d = 2;

    static {
        C56170h hVar = new C56170h();
        f149659a = hVar;
        C62942bv.registerDefaultInstance(C56170h.class, hVar);
    }

    private C56170h() {
        emptyProtobufList();
        emptyProtobufList();
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f149663d);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f149663d = b;
                return null;
            case 2:
                return newMessageInfo(f149659a, "\u0001\u0001\u0000\u0001\u0005\u0005\u0001\u0000\u0000\u0001\u0005ᐉ\u0012", new Object[]{"b", C45240c.f118157a});
            case 3:
                return new C56170h();
            case 4:
                return new C56155c();
            case 5:
                return f149659a;
            case 6:
                C63010eb ebVar = f149660e;
                if (ebVar == null) {
                    synchronized (C56170h.class) {
                        ebVar = f149660e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f149659a);
                            f149660e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
