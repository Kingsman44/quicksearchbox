package org.tensorflow.p5650a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: org.tensorflow.a.f */
/* compiled from: PG */
public final class C72646f extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C72646f f193215c;

    /* renamed from: d */
    private static volatile C63010eb f193216d;

    /* renamed from: a */
    public int f193217a = 0;

    /* renamed from: b */
    public Object f193218b;

    static {
        C72646f fVar = new C72646f();
        f193215c = fVar;
        C62942bv.registerDefaultInstance(C72646f.class, fVar);
    }

    private C72646f() {
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
                return newMessageInfo(f193215c, "\u0000\u0003\u0001\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000\u0003<\u0000", new Object[]{"b", "a", C72642b.class, C72656p.class, C72658r.class});
            case 3:
                return new C72646f();
            case 4:
                return new C72645e();
            case 5:
                return f193215c;
            case 6:
                C63010eb ebVar = f193216d;
                if (ebVar == null) {
                    synchronized (C72646f.class) {
                        ebVar = f193216d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f193215c);
                            f193216d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
