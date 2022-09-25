package com.google.p4017at.p4060h.p4073d.p4074a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.at.h.d.a.ab */
/* compiled from: PG */
public final class C54213ab extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C54213ab f142280c;

    /* renamed from: d */
    private static volatile C63010eb f142281d;

    /* renamed from: a */
    public int f142282a;

    /* renamed from: b */
    public int f142283b;

    static {
        C54213ab abVar = new C54213ab();
        f142280c = abVar;
        C62942bv.registerDefaultInstance(C54213ab.class, abVar);
    }

    private C54213ab() {
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
                return newMessageInfo(f142280c, "\u0001\u0001\u0000\u0001\u0006\u0006\u0001\u0000\u0000\u0000\u0006င\u0005", new Object[]{"a", "b"});
            case 3:
                return new C54213ab();
            case 4:
                return new C54212aa();
            case 5:
                return f142280c;
            case 6:
                C63010eb ebVar = f142281d;
                if (ebVar == null) {
                    synchronized (C54213ab.class) {
                        ebVar = f142281d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f142280c);
                            f142281d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
