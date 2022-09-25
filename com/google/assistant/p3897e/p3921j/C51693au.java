package com.google.assistant.p3897e.p3921j;

import com.google.assistant.p3897e.p3902c.p3907c.C51100gj;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.e.j.au */
/* compiled from: PG */
public final class C51693au extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C51693au f135615c;

    /* renamed from: d */
    private static volatile C63010eb f135616d;

    /* renamed from: a */
    public int f135617a;

    /* renamed from: b */
    public C51100gj f135618b;

    static {
        C51693au auVar = new C51693au();
        f135615c = auVar;
        C62942bv.registerDefaultInstance(C51693au.class, auVar);
    }

    private C51693au() {
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
                return newMessageInfo(f135615c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"a", "b"});
            case 3:
                return new C51693au();
            case 4:
                return new C51692at();
            case 5:
                return f135615c;
            case 6:
                C63010eb ebVar = f135616d;
                if (ebVar == null) {
                    synchronized (C51693au.class) {
                        ebVar = f135616d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f135615c);
                            f135616d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
