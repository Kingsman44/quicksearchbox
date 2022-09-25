package com.google.android.libraries.assistant.pcp.p1578m;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.assistant.pcp.m.ak */
/* compiled from: PG */
public final class C18970ak extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C18970ak f53294c;

    /* renamed from: d */
    private static volatile C63010eb f53295d;

    /* renamed from: a */
    public int f53296a = 0;

    /* renamed from: b */
    public Object f53297b;

    static {
        C18970ak akVar = new C18970ak();
        f53294c = akVar;
        C62942bv.registerDefaultInstance(C18970ak.class, akVar);
    }

    private C18970ak() {
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
                return newMessageInfo(f53294c, "\u0001\u0002\u0001\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001ြ\u0000\u0002်\u0000", new Object[]{"b", "a", C18966ag.class});
            case 3:
                return new C18970ak();
            case 4:
                return new C18969aj();
            case 5:
                return f53294c;
            case 6:
                C63010eb ebVar = f53295d;
                if (ebVar == null) {
                    synchronized (C18970ak.class) {
                        ebVar = f53295d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f53294c);
                            f53295d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
