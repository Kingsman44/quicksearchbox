package com.google.common.p4552o.p4553a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.common.o.a.af */
/* compiled from: PG */
public final class C59455af extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C59455af f157715c;

    /* renamed from: d */
    private static volatile C63010eb f157716d;

    /* renamed from: a */
    public int f157717a;

    /* renamed from: b */
    public C59457ah f157718b;

    static {
        C59455af afVar = new C59455af();
        f157715c = afVar;
        C62942bv.registerDefaultInstance(C59455af.class, afVar);
    }

    private C59455af() {
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
                return newMessageInfo(f157715c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"a", "b"});
            case 3:
                return new C59455af();
            case 4:
                return new C59454ae();
            case 5:
                return f157715c;
            case 6:
                C63010eb ebVar = f157716d;
                if (ebVar == null) {
                    synchronized (C59455af.class) {
                        ebVar = f157716d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f157715c);
                            f157716d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
