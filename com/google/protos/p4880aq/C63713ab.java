package com.google.protos.p4880aq;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.protos.aq.ab */
/* compiled from: PG */
public final class C63713ab extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C63713ab f172258c;

    /* renamed from: d */
    private static volatile C63010eb f172259d;

    /* renamed from: a */
    public int f172260a = 0;

    /* renamed from: b */
    public Object f172261b;

    static {
        C63713ab abVar = new C63713ab();
        f172258c = abVar;
        C62942bv.registerDefaultInstance(C63713ab.class, abVar);
    }

    private C63713ab() {
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
                return newMessageInfo(f172258c, "\u0001\u0005\u0001\u0000\u0001\u0005\u0005\u0000\u0000\u0000\u0001့\u0000\u0002ံ\u0000\u0003ျ\u0000\u0004်\u0000\u0005ဳ\u0000", new Object[]{"b", "a"});
            case 3:
                return new C63713ab();
            case 4:
                return new C63712aa();
            case 5:
                return f172258c;
            case 6:
                C63010eb ebVar = f172259d;
                if (ebVar == null) {
                    synchronized (C63713ab.class) {
                        ebVar = f172259d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f172258c);
                            f172259d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
