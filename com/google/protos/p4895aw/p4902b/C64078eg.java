package com.google.protos.p4895aw.p4902b;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.protos.aw.b.eg */
/* compiled from: PG */
public final class C64078eg extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C64078eg f173228c;

    /* renamed from: d */
    private static volatile C63010eb f173229d;

    /* renamed from: a */
    public int f173230a;

    /* renamed from: b */
    public boolean f173231b;

    static {
        C64078eg egVar = new C64078eg();
        f173228c = egVar;
        C62942bv.registerDefaultInstance(C64078eg.class, egVar);
    }

    private C64078eg() {
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
                return newMessageInfo(f173228c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဇ\u0000", new Object[]{"a", "b"});
            case 3:
                return new C64078eg();
            case 4:
                return new C64077ef();
            case 5:
                return f173228c;
            case 6:
                C63010eb ebVar = f173229d;
                if (ebVar == null) {
                    synchronized (C64078eg.class) {
                        ebVar = f173229d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f173228c);
                            f173229d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
