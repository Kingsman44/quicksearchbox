package org.tensorflow.p5651b;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63088z;

/* renamed from: org.tensorflow.b.c */
/* compiled from: PG */
public final class C72663c extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C72663c f193237d;

    /* renamed from: e */
    private static volatile C63010eb f193238e;

    /* renamed from: a */
    public int f193239a;

    /* renamed from: b */
    public C63088z f193240b = C63088z.f170246b;

    /* renamed from: c */
    public C62971cq f193241c;

    static {
        C72663c cVar = new C72663c();
        f193237d = cVar;
        C62942bv.registerDefaultInstance(C72663c.class, cVar);
    }

    private C72663c() {
        emptyIntList();
        emptyFloatList();
        emptyDoubleList();
        emptyIntList();
        this.f193241c = emptyProtobufList();
        emptyFloatList();
        emptyLongList();
        emptyBooleanList();
        emptyDoubleList();
        emptyProtobufList();
        emptyProtobufList();
        emptyIntList();
        emptyLongList();
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
                return newMessageInfo(f193237d, "\u0000\u0003\u0000\u0000\u0001\b\u0003\u0000\u0001\u0000\u0001\f\u0004\n\b\u001c", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C72663c();
            case 4:
                return new C72662b();
            case 5:
                return f193237d;
            case 6:
                C63010eb ebVar = f193238e;
                if (ebVar == null) {
                    synchronized (C72663c.class) {
                        ebVar = f193238e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f193237d);
                            f193238e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
