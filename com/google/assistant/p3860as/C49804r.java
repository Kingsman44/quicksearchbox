package com.google.assistant.p3860as;

import com.google.p4479cg.C58081m;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.as.r */
/* compiled from: PG */
public final class C49804r extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C49804r f128648c;

    /* renamed from: e */
    private static volatile C63010eb f128649e;

    /* renamed from: a */
    public C58081m f128650a;

    /* renamed from: b */
    public double f128651b;

    /* renamed from: d */
    private int f128652d;

    static {
        C49804r rVar = new C49804r();
        f128648c = rVar;
        C62942bv.registerDefaultInstance(C49804r.class, rVar);
    }

    private C49804r() {
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
                return newMessageInfo(f128648c, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002က\u0001", new Object[]{"d", "a", "b"});
            case 3:
                return new C49804r();
            case 4:
                return new C49803q();
            case 5:
                return f128648c;
            case 6:
                C63010eb ebVar = f128649e;
                if (ebVar == null) {
                    synchronized (C49804r.class) {
                        ebVar = f128649e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f128648c);
                            f128649e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
