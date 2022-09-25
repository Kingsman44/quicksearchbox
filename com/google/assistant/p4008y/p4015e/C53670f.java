package com.google.assistant.p4008y.p4015e;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62910ar;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63088z;

/* renamed from: com.google.assistant.y.e.f */
/* compiled from: PG */
public final class C53670f extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C53670f f140873d;

    /* renamed from: e */
    private static volatile C63010eb f140874e;

    /* renamed from: a */
    public int f140875a;

    /* renamed from: b */
    public C62971cq f140876b = emptyProtobufList();

    /* renamed from: c */
    public C62910ar f140877c;

    static {
        C53670f fVar = new C53670f();
        f140873d = fVar;
        C62942bv.registerDefaultInstance(C53670f.class, fVar);
    }

    private C53670f() {
        emptyProtobufList();
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
                return newMessageInfo(f140873d, "\u0001\u0002\u0000\u0001\u0001\u0004\u0002\u0000\u0001\u0000\u0001\u001b\u0004ဉ\u0001", new Object[]{"a", "b", C53674j.class, C45240c.f118157a});
            case 3:
                return new C53670f();
            case 4:
                return new C53669e();
            case 5:
                return f140873d;
            case 6:
                C63010eb ebVar = f140874e;
                if (ebVar == null) {
                    synchronized (C53670f.class) {
                        ebVar = f140874e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f140873d);
                            f140874e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
