package com.google.p4152bb.p4153a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.bb.a.cg */
/* compiled from: PG */
public final class C55003cg extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C55003cg f144710c;

    /* renamed from: d */
    private static volatile C63010eb f144711d;

    /* renamed from: a */
    public int f144712a;

    /* renamed from: b */
    public int f144713b;

    static {
        C55003cg cgVar = new C55003cg();
        f144710c = cgVar;
        C62942bv.registerDefaultInstance(C55003cg.class, cgVar);
    }

    private C55003cg() {
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
                return newMessageInfo(f144710c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဌ\u0000", new Object[]{"a", "b", C55000cd.f144709a});
            case 3:
                return new C55003cg();
            case 4:
                return new C55002cf();
            case 5:
                return f144710c;
            case 6:
                C63010eb ebVar = f144711d;
                if (ebVar == null) {
                    synchronized (C55003cg.class) {
                        ebVar = f144711d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f144710c);
                            f144711d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
