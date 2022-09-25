package com.google.speech.p5218j;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.speech.j.fc */
/* compiled from: PG */
public final class C66940fc extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C66940fc f181950c;

    /* renamed from: d */
    private static volatile C63010eb f181951d;

    /* renamed from: a */
    public int f181952a = 0;

    /* renamed from: b */
    public Object f181953b;

    static {
        C66940fc fcVar = new C66940fc();
        f181950c = fcVar;
        C62942bv.registerDefaultInstance(C66940fc.class, fcVar);
    }

    private C66940fc() {
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
                return newMessageInfo(f181950c, "\u0001\u0002\u0001\u0000\u0007\b\u0002\u0000\u0000\u0000\u0007ဿ\u0000\bြ\u0000", new Object[]{"b", "a", C66948fk.m97390b(), C66768ai.class});
            case 3:
                return new C66940fc();
            case 4:
                return new C66939fb();
            case 5:
                return f181950c;
            case 6:
                C63010eb ebVar = f181951d;
                if (ebVar == null) {
                    synchronized (C66940fc.class) {
                        ebVar = f181951d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f181950c);
                            f181951d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
