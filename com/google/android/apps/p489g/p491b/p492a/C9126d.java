package com.google.android.apps.p489g.p491b.p492a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.g.b.a.d */
/* compiled from: PG */
public final class C9126d extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C9126d f31412c;

    /* renamed from: d */
    private static volatile C63010eb f31413d;

    /* renamed from: a */
    public int f31414a;

    /* renamed from: b */
    public int f31415b;

    static {
        C9126d dVar = new C9126d();
        f31412c = dVar;
        C62942bv.registerDefaultInstance(C9126d.class, dVar);
    }

    private C9126d() {
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
                return newMessageInfo(f31412c, "\u0001\u0001\u0000\u0001((\u0001\u0000\u0000\u0000(င\u0000", new Object[]{"a", "b"});
            case 3:
                return new C9126d();
            case 4:
                return new C9125c();
            case 5:
                return f31412c;
            case 6:
                C63010eb ebVar = f31413d;
                if (ebVar == null) {
                    synchronized (C9126d.class) {
                        ebVar = f31413d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f31412c);
                            f31413d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
