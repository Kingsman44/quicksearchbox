package com.google.p4222bl.p4223a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.bl.a.u */
/* compiled from: PG */
public final class C56107u extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C56107u f149458c;

    /* renamed from: d */
    private static volatile C63010eb f149459d;

    /* renamed from: a */
    public int f149460a = 0;

    /* renamed from: b */
    public Object f149461b;

    static {
        C56107u uVar = new C56107u();
        f149458c = uVar;
        C62942bv.registerDefaultInstance(C56107u.class, uVar);
    }

    private C56107u() {
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
                return newMessageInfo(f149458c, "\u0000\u0002\u0001\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000", new Object[]{"b", "a", C56100n.class, C56102p.class});
            case 3:
                return new C56107u();
            case 4:
                return new C56106t();
            case 5:
                return f149458c;
            case 6:
                C63010eb ebVar = f149459d;
                if (ebVar == null) {
                    synchronized (C56107u.class) {
                        ebVar = f149459d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f149458c);
                            f149459d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
