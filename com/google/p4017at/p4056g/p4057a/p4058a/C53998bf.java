package com.google.p4017at.p4056g.p4057a.p4058a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.at.g.a.a.bf */
/* compiled from: PG */
public final class C53998bf extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C53998bf f141664c;

    /* renamed from: d */
    private static volatile C63010eb f141665d;

    /* renamed from: a */
    public int f141666a = 0;

    /* renamed from: b */
    public Object f141667b;

    static {
        C53998bf bfVar = new C53998bf();
        f141664c = bfVar;
        C62942bv.registerDefaultInstance(C53998bf.class, bfVar);
    }

    private C53998bf() {
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
                return newMessageInfo(f141664c, "\u0000\u0002\u0001\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000", new Object[]{"b", "a", C53997be.class, C53995bc.class});
            case 3:
                return new C53998bf();
            case 4:
                return new C53993ba();
            case 5:
                return f141664c;
            case 6:
                C63010eb ebVar = f141665d;
                if (ebVar == null) {
                    synchronized (C53998bf.class) {
                        ebVar = f141665d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f141664c);
                            f141665d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
