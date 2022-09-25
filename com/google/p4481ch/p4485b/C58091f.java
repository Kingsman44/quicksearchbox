package com.google.p4481ch.p4485b;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.p381aj.p382a.p383a.p384a.C8242v;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.ch.b.f */
/* compiled from: PG */
public final class C58091f extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C58091f f155277a;

    /* renamed from: e */
    private static volatile C63010eb f155278e;

    /* renamed from: b */
    private int f155279b;

    /* renamed from: c */
    private C8242v f155280c;

    /* renamed from: d */
    private byte f155281d = 2;

    static {
        C58091f fVar = new C58091f();
        f155277a = fVar;
        C62942bv.registerDefaultInstance(C58091f.class, fVar);
    }

    private C58091f() {
        C62942bv.emptyProtobufList();
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f155281d);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f155281d = b;
                return null;
            case 2:
                return newMessageInfo(f155277a, "\u0001\u0001\u0000\u0001\b\b\u0001\u0000\u0000\u0001\bᐉ\u0006", new Object[]{"b", C45240c.f118157a});
            case 3:
                return new C58091f();
            case 4:
                return new C58090e();
            case 5:
                return f155277a;
            case 6:
                C63010eb ebVar = f155278e;
                if (ebVar == null) {
                    synchronized (C58091f.class) {
                        ebVar = f155278e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f155277a);
                            f155278e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
