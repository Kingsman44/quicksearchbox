package com.google.protos.p4985f.p5021l;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.speech.p5208h.C66676j;
import com.google.speech.p5208h.C66678l;

/* renamed from: com.google.protos.f.l.b */
/* compiled from: PG */
public final class C64951b extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C64951b f175899d;

    /* renamed from: e */
    private static volatile C63010eb f175900e;

    /* renamed from: a */
    public int f175901a;

    /* renamed from: b */
    public C66678l f175902b;

    /* renamed from: c */
    public C66676j f175903c;

    static {
        C64951b bVar = new C64951b();
        f175899d = bVar;
        C62942bv.registerDefaultInstance(C64951b.class, bVar);
    }

    private C64951b() {
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
                return newMessageInfo(f175899d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C64951b();
            case 4:
                return new C64950a();
            case 5:
                return f175899d;
            case 6:
                C63010eb ebVar = f175900e;
                if (ebVar == null) {
                    synchronized (C64951b.class) {
                        ebVar = f175900e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f175899d);
                            f175900e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
