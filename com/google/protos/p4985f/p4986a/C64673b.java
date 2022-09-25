package com.google.protos.p4985f.p4986a;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.protos.f.a.b */
/* compiled from: PG */
public final class C64673b extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C64673b f175301d;

    /* renamed from: e */
    private static volatile C63010eb f175302e;

    /* renamed from: a */
    public int f175303a;

    /* renamed from: b */
    public boolean f175304b;

    /* renamed from: c */
    public int f175305c;

    static {
        C64673b bVar = new C64673b();
        f175301d = bVar;
        C62942bv.registerDefaultInstance(C64673b.class, bVar);
    }

    private C64673b() {
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
                return newMessageInfo(f175301d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဌ\u0001", new Object[]{"a", "b", C45240c.f118157a, C64693c.f175358a});
            case 3:
                return new C64673b();
            case 4:
                return new C64644a();
            case 5:
                return f175301d;
            case 6:
                C63010eb ebVar = f175302e;
                if (ebVar == null) {
                    synchronized (C64673b.class) {
                        ebVar = f175302e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f175301d);
                            f175302e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
