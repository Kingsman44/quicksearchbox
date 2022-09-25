package com.google.assistant.p4008y.p4013d;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.y.d.d */
/* compiled from: PG */
public final class C53652d extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C53652d f140817c;

    /* renamed from: d */
    private static volatile C63010eb f140818d;

    /* renamed from: a */
    public int f140819a;

    /* renamed from: b */
    public boolean f140820b;

    static {
        C53652d dVar = new C53652d();
        f140817c = dVar;
        C62942bv.registerDefaultInstance(C53652d.class, dVar);
    }

    private C53652d() {
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
                return newMessageInfo(f140817c, "\u0001\u0001\u0000\u0001\u0004\u0004\u0001\u0000\u0000\u0000\u0004ဇ\u0000", new Object[]{"a", "b"});
            case 3:
                return new C53652d();
            case 4:
                return new C53651c();
            case 5:
                return f140817c;
            case 6:
                C63010eb ebVar = f140818d;
                if (ebVar == null) {
                    synchronized (C53652d.class) {
                        ebVar = f140818d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f140817c);
                            f140818d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
