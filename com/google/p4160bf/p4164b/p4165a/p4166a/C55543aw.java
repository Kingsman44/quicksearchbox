package com.google.p4160bf.p4164b.p4165a.p4166a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.bf.b.a.a.aw */
/* compiled from: PG */
public final class C55543aw extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C55543aw f146565c;

    /* renamed from: d */
    private static volatile C63010eb f146566d;

    /* renamed from: a */
    public int f146567a;

    /* renamed from: b */
    public int f146568b;

    static {
        C55543aw awVar = new C55543aw();
        f146565c = awVar;
        C62942bv.registerDefaultInstance(C55543aw.class, awVar);
    }

    private C55543aw() {
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
                return newMessageInfo(f146565c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001င\u0000", new Object[]{"a", "b"});
            case 3:
                return new C55543aw();
            case 4:
                return new C55542av();
            case 5:
                return f146565c;
            case 6:
                C63010eb ebVar = f146566d;
                if (ebVar == null) {
                    synchronized (C55543aw.class) {
                        ebVar = f146566d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f146565c);
                            f146566d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
