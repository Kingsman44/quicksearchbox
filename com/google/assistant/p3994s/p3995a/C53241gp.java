package com.google.assistant.p3994s.p3995a;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.s.a.gp */
/* compiled from: PG */
public final class C53241gp extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C53241gp f139541d;

    /* renamed from: e */
    private static volatile C63010eb f139542e;

    /* renamed from: a */
    public int f139543a;

    /* renamed from: b */
    public float f139544b;

    /* renamed from: c */
    public float f139545c;

    static {
        C53241gp gpVar = new C53241gp();
        f139541d = gpVar;
        C62942bv.registerDefaultInstance(C53241gp.class, gpVar);
    }

    private C53241gp() {
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
                return newMessageInfo(f139541d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ခ\u0000\u0002ခ\u0001", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C53241gp();
            case 4:
                return new C53240go();
            case 5:
                return f139541d;
            case 6:
                C63010eb ebVar = f139542e;
                if (ebVar == null) {
                    synchronized (C53241gp.class) {
                        ebVar = f139542e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f139541d);
                            f139542e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
