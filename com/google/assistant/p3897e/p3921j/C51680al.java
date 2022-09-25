package com.google.assistant.p3897e.p3921j;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.e.j.al */
/* compiled from: PG */
public final class C51680al extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C51680al f135302c;

    /* renamed from: d */
    private static volatile C63010eb f135303d;

    /* renamed from: a */
    public int f135304a;

    /* renamed from: b */
    public C52081en f135305b;

    static {
        C51680al alVar = new C51680al();
        f135302c = alVar;
        C62942bv.registerDefaultInstance(C51680al.class, alVar);
    }

    private C51680al() {
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
                return newMessageInfo(f135302c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"a", "b"});
            case 3:
                return new C51680al();
            case 4:
                return new C51679ak();
            case 5:
                return f135302c;
            case 6:
                C63010eb ebVar = f135303d;
                if (ebVar == null) {
                    synchronized (C51680al.class) {
                        ebVar = f135303d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f135302c);
                            f135303d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
