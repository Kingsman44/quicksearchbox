package com.google.android.libraries.assistant.auto.tng.morris.p1071e;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.assistant.auto.tng.morris.e.de */
/* compiled from: PG */
public final class C14275de extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C14275de f43177e;

    /* renamed from: f */
    private static volatile C63010eb f43178f;

    /* renamed from: a */
    public int f43179a;

    /* renamed from: b */
    public int f43180b;

    /* renamed from: c */
    public int f43181c;

    /* renamed from: d */
    public int f43182d;

    static {
        C14275de deVar = new C14275de();
        f43177e = deVar;
        C62942bv.registerDefaultInstance(C14275de.class, deVar);
    }

    private C14275de() {
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
                return newMessageInfo(f43177e, "\u0000\u0004\u0000\u0000\u0001\u0005\u0004\u0000\u0000\u0000\u0001\f\u0002\f\u0003\f\u0005\f", new Object[]{"a", "b", C45240c.f118157a, "d"});
            case 3:
                return new C14275de();
            case 4:
                return new C14274dd();
            case 5:
                return f43177e;
            case 6:
                C63010eb ebVar = f43178f;
                if (ebVar == null) {
                    synchronized (C14275de.class) {
                        ebVar = f43178f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f43177e);
                            f43178f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
