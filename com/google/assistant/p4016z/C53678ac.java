package com.google.assistant.p4016z;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.z.ac */
/* compiled from: PG */
public final class C53678ac extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C53678ac f140899c;

    /* renamed from: d */
    private static volatile C63010eb f140900d;

    /* renamed from: a */
    public int f140901a;

    /* renamed from: b */
    public C53738w f140902b;

    static {
        C53678ac acVar = new C53678ac();
        f140899c = acVar;
        C62942bv.registerDefaultInstance(C53678ac.class, acVar);
    }

    private C53678ac() {
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
                return newMessageInfo(f140899c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"a", "b"});
            case 3:
                return new C53678ac();
            case 4:
                return new C53677ab();
            case 5:
                return f140899c;
            case 6:
                C63010eb ebVar = f140900d;
                if (ebVar == null) {
                    synchronized (C53678ac.class) {
                        ebVar = f140900d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f140899c);
                            f140900d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
