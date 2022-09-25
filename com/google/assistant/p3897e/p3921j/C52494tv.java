package com.google.assistant.p3897e.p3921j;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.e.j.tv */
/* compiled from: PG */
public final class C52494tv extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C52494tv f137809c;

    /* renamed from: d */
    private static volatile C63010eb f137810d;

    /* renamed from: a */
    public int f137811a;

    /* renamed from: b */
    public long f137812b;

    static {
        C52494tv tvVar = new C52494tv();
        f137809c = tvVar;
        C62942bv.registerDefaultInstance(C52494tv.class, tvVar);
    }

    private C52494tv() {
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
                return newMessageInfo(f137809c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဂ\u0000", new Object[]{"a", "b"});
            case 3:
                return new C52494tv();
            case 4:
                return new C52493tu();
            case 5:
                return f137809c;
            case 6:
                C63010eb ebVar = f137810d;
                if (ebVar == null) {
                    synchronized (C52494tv.class) {
                        ebVar = f137810d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f137809c);
                            f137810d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
