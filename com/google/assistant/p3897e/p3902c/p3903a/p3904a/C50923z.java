package com.google.assistant.p3897e.p3902c.p3903a.p3904a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.e.c.a.a.z */
/* compiled from: PG */
public final class C50923z extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C50923z f132573c;

    /* renamed from: d */
    private static volatile C63010eb f132574d;

    /* renamed from: a */
    public int f132575a = 0;

    /* renamed from: b */
    public Object f132576b;

    static {
        C50923z zVar = new C50923z();
        f132573c = zVar;
        C62942bv.registerDefaultInstance(C50923z.class, zVar);
    }

    private C50923z() {
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
                return newMessageInfo(f132573c, "\u0001\u0002\u0001\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001ြ\u0000\u0002ြ\u0000", new Object[]{"b", "a", C50921x.class, C50901d.class});
            case 3:
                return new C50923z();
            case 4:
                return new C50922y();
            case 5:
                return f132573c;
            case 6:
                C63010eb ebVar = f132574d;
                if (ebVar == null) {
                    synchronized (C50923z.class) {
                        ebVar = f132574d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f132573c);
                            f132574d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
