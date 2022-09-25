package com.google.assistant.p3897e.p3921j.p3924c;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.e.j.c.o */
/* compiled from: PG */
public final class C51744o extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C51744o f135751c;

    /* renamed from: d */
    private static volatile C63010eb f135752d;

    /* renamed from: a */
    public int f135753a = 0;

    /* renamed from: b */
    public Object f135754b;

    static {
        C51744o oVar = new C51744o();
        f135751c = oVar;
        C62942bv.registerDefaultInstance(C51744o.class, oVar);
    }

    private C51744o() {
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
                return newMessageInfo(f135751c, "\u0001\u0002\u0001\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001ျ\u0000\u0002ျ\u0000", new Object[]{"b", "a"});
            case 3:
                return new C51744o();
            case 4:
                return new C51743n();
            case 5:
                return f135751c;
            case 6:
                C63010eb ebVar = f135752d;
                if (ebVar == null) {
                    synchronized (C51744o.class) {
                        ebVar = f135752d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f135751c);
                            f135752d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
