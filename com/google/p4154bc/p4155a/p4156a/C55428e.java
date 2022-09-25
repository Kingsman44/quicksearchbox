package com.google.p4154bc.p4155a.p4156a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.bc.a.a.e */
/* compiled from: PG */
public final class C55428e extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C55428e f146245c;

    /* renamed from: d */
    private static volatile C63010eb f146246d;

    /* renamed from: a */
    public int f146247a;

    /* renamed from: b */
    public C55427d f146248b;

    static {
        C55428e eVar = new C55428e();
        f146245c = eVar;
        C62942bv.registerDefaultInstance(C55428e.class, eVar);
    }

    private C55428e() {
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
                return newMessageInfo(f146245c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"a", "b"});
            case 3:
                return new C55428e();
            case 4:
                return new C55424a();
            case 5:
                return f146245c;
            case 6:
                C63010eb ebVar = f146246d;
                if (ebVar == null) {
                    synchronized (C55428e.class) {
                        ebVar = f146246d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f146245c);
                            f146246d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
