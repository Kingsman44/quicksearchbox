package com.google.p4281bu.p4282a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.bu.a.cr */
/* compiled from: PG */
public final class C56561cr extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C56561cr f151028c;

    /* renamed from: d */
    private static volatile C63010eb f151029d;

    /* renamed from: a */
    public C56560cq f151030a;

    /* renamed from: b */
    public C56558co f151031b;

    static {
        C56561cr crVar = new C56561cr();
        f151028c = crVar;
        C62942bv.registerDefaultInstance(C56561cr.class, crVar);
    }

    private C56561cr() {
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
                return newMessageInfo(f151028c, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\t\u0002\t", new Object[]{"a", "b"});
            case 3:
                return new C56561cr();
            case 4:
                return new C56554ck();
            case 5:
                return f151028c;
            case 6:
                C63010eb ebVar = f151029d;
                if (ebVar == null) {
                    synchronized (C56561cr.class) {
                        ebVar = f151029d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f151028c);
                            f151029d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
