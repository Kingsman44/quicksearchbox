package com.google.p4129b.p4130a.p4131a.p4132a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.b.a.a.a.at */
/* compiled from: PG */
public final class C54676at extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C54676at f143522c;

    /* renamed from: d */
    private static volatile C63010eb f143523d;

    /* renamed from: a */
    public int f143524a = 0;

    /* renamed from: b */
    public Object f143525b;

    static {
        C54676at atVar = new C54676at();
        f143522c = atVar;
        C62942bv.registerDefaultInstance(C54676at.class, atVar);
    }

    private C54676at() {
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
                return newMessageInfo(f143522c, "\u0000\u0003\u0001\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u00015\u0000\u0002:\u0000\u0003:\u0000", new Object[]{"b", "a"});
            case 3:
                return new C54676at();
            case 4:
                return new C54675as();
            case 5:
                return f143522c;
            case 6:
                C63010eb ebVar = f143523d;
                if (ebVar == null) {
                    synchronized (C54676at.class) {
                        ebVar = f143523d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f143522c);
                            f143523d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
