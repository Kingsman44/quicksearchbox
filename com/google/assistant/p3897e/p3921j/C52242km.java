package com.google.assistant.p3897e.p3921j;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.e.j.km */
/* compiled from: PG */
public final class C52242km extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C52242km f137107c;

    /* renamed from: d */
    private static volatile C63010eb f137108d;

    /* renamed from: a */
    public int f137109a;

    /* renamed from: b */
    public boolean f137110b;

    static {
        C52242km kmVar = new C52242km();
        f137107c = kmVar;
        C62942bv.registerDefaultInstance(C52242km.class, kmVar);
    }

    private C52242km() {
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
                return newMessageInfo(f137107c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဇ\u0000", new Object[]{"a", "b"});
            case 3:
                return new C52242km();
            case 4:
                return new C52241kl();
            case 5:
                return f137107c;
            case 6:
                C63010eb ebVar = f137108d;
                if (ebVar == null) {
                    synchronized (C52242km.class) {
                        ebVar = f137108d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f137107c);
                            f137108d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
