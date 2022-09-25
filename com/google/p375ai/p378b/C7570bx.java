package com.google.p375ai.p378b;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.ai.b.bx */
/* compiled from: PG */
public final class C7570bx extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C7570bx f26172c;

    /* renamed from: d */
    private static volatile C63010eb f26173d;

    /* renamed from: a */
    public int f26174a;

    /* renamed from: b */
    public C7785jw f26175b;

    static {
        C7570bx bxVar = new C7570bx();
        f26172c = bxVar;
        C62942bv.registerDefaultInstance(C7570bx.class, bxVar);
    }

    private C7570bx() {
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
                return newMessageInfo(f26172c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"a", "b"});
            case 3:
                return new C7570bx();
            case 4:
                return new C7569bw();
            case 5:
                return f26172c;
            case 6:
                C63010eb ebVar = f26173d;
                if (ebVar == null) {
                    synchronized (C7570bx.class) {
                        ebVar = f26173d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f26172c);
                            f26173d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
