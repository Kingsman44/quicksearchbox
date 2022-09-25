package com.google.speech.p5207g;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.speech.g.f */
/* compiled from: PG */
public final class C66508f extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C66508f f180877d;

    /* renamed from: e */
    private static volatile C63010eb f180878e;

    /* renamed from: a */
    public int f180879a;

    /* renamed from: b */
    public C62971cq f180880b = C62942bv.emptyProtobufList();

    /* renamed from: c */
    public boolean f180881c;

    static {
        C66508f fVar = new C66508f();
        f180877d = fVar;
        C62942bv.registerDefaultInstance(C66508f.class, fVar);
    }

    private C66508f() {
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
                return newMessageInfo(f180877d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001a\u0002ဇ\u0000", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C66508f();
            case 4:
                return new C66507e();
            case 5:
                return f180877d;
            case 6:
                C63010eb ebVar = f180878e;
                if (ebVar == null) {
                    synchronized (C66508f.class) {
                        ebVar = f180878e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f180877d);
                            f180878e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
