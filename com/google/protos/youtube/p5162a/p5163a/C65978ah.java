package com.google.protos.youtube.p5162a.p5163a;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.protos.youtube.a.a.ah */
/* compiled from: PG */
public final class C65978ah extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C65978ah f179448d;

    /* renamed from: e */
    private static volatile C63010eb f179449e;

    /* renamed from: a */
    public int f179450a;

    /* renamed from: b */
    public boolean f179451b;

    /* renamed from: c */
    public boolean f179452c;

    static {
        C65978ah ahVar = new C65978ah();
        f179448d = ahVar;
        C62942bv.registerDefaultInstance(C65978ah.class, ahVar);
    }

    private C65978ah() {
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
                return newMessageInfo(f179448d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဇ\u0001", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C65978ah();
            case 4:
                return new C65977ag();
            case 5:
                return f179448d;
            case 6:
                C63010eb ebVar = f179449e;
                if (ebVar == null) {
                    synchronized (C65978ah.class) {
                        ebVar = f179449e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f179448d);
                            f179449e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
