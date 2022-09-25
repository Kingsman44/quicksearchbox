package com.google.protos.p4850an.p4855d.p4858c;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.protos.an.d.c.f */
/* compiled from: PG */
public final class C63533f extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C63533f f171842d;

    /* renamed from: f */
    private static volatile C63010eb f171843f;

    /* renamed from: a */
    public int f171844a;

    /* renamed from: b */
    public C62971cq f171845b = emptyProtobufList();

    /* renamed from: c */
    public C63537j f171846c;

    /* renamed from: e */
    private byte f171847e = 2;

    static {
        C63533f fVar = new C63533f();
        f171842d = fVar;
        C62942bv.registerDefaultInstance(C63533f.class, fVar);
    }

    private C63533f() {
        emptyProtobufList();
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f171847e);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f171847e = b;
                return null;
            case 2:
                return newMessageInfo(f171842d, "\u0001\u0002\u0000\u0001\u0001\u000b\u0002\u0000\u0001\u0001\u0001Л\u000bဉ\b", new Object[]{"a", "b", C63535h.class, C45240c.f118157a});
            case 3:
                return new C63533f();
            case 4:
                return new C63532e();
            case 5:
                return f171842d;
            case 6:
                C63010eb ebVar = f171843f;
                if (ebVar == null) {
                    synchronized (C63533f.class) {
                        ebVar = f171843f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f171842d);
                            f171843f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
