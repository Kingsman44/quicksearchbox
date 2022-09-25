package com.google.p4283bv.p4354e.p4356b.p4358b.p4360b;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.bv.e.b.b.b.ap */
/* compiled from: PG */
public final class C57132ap extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C57132ap f152500c;

    /* renamed from: e */
    private static volatile C63010eb f152501e;

    /* renamed from: a */
    public float f152502a;

    /* renamed from: b */
    public float f152503b;

    /* renamed from: d */
    private int f152504d;

    static {
        C57132ap apVar = new C57132ap();
        f152500c = apVar;
        C62942bv.registerDefaultInstance(C57132ap.class, apVar);
    }

    private C57132ap() {
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
                return newMessageInfo(f152500c, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ခ\u0000\u0002ခ\u0001", new Object[]{"d", "a", "b"});
            case 3:
                return new C57132ap();
            case 4:
                return new C57131ao();
            case 5:
                return f152500c;
            case 6:
                C63010eb ebVar = f152501e;
                if (ebVar == null) {
                    synchronized (C57132ap.class) {
                        ebVar = f152501e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f152500c);
                            f152501e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
