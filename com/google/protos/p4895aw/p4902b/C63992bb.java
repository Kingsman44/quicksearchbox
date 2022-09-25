package com.google.protos.p4895aw.p4902b;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63088z;

/* renamed from: com.google.protos.aw.b.bb */
/* compiled from: PG */
public final class C63992bb extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C63992bb f173057b;

    /* renamed from: d */
    private static volatile C63010eb f173058d;

    /* renamed from: a */
    public long f173059a;

    /* renamed from: c */
    private int f173060c;

    static {
        C63992bb bbVar = new C63992bb();
        f173057b = bbVar;
        C62942bv.registerDefaultInstance(C63992bb.class, bbVar);
    }

    private C63992bb() {
        C63088z zVar = C63088z.f170246b;
        emptyProtobufList();
        emptyProtobufList();
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
                return newMessageInfo(f173057b, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဂ\u0000", new Object[]{C45240c.f118157a, "a"});
            case 3:
                return new C63992bb();
            case 4:
                return new C63991ba();
            case 5:
                return f173057b;
            case 6:
                C63010eb ebVar = f173058d;
                if (ebVar == null) {
                    synchronized (C63992bb.class) {
                        ebVar = f173058d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f173057b);
                            f173058d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
