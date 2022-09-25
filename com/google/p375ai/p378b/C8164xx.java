package com.google.p375ai.p378b;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.ai.b.xx */
/* compiled from: PG */
public final class C8164xx extends C62942bv implements C63001dt {

    /* renamed from: f */
    public static final C8164xx f28688f;

    /* renamed from: h */
    private static volatile C63010eb f28689h;

    /* renamed from: a */
    public int f28690a;

    /* renamed from: b */
    public C8139wz f28691b;

    /* renamed from: c */
    public C7931pg f28692c;

    /* renamed from: d */
    public C8032t f28693d;

    /* renamed from: e */
    public C8098vl f28694e;

    /* renamed from: g */
    private byte f28695g = 2;

    static {
        C8164xx xxVar = new C8164xx();
        f28688f = xxVar;
        C62942bv.registerDefaultInstance(C8164xx.class, xxVar);
    }

    private C8164xx() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f28695g);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f28695g = b;
                return null;
            case 2:
                return newMessageInfo(f28688f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0002\u0001ဉ\u0000\u0002ဉ\u0001\u0003ᐉ\u0002\u0004ᐉ\u0003", new Object[]{"a", "b", C45240c.f118157a, "d", "e"});
            case 3:
                return new C8164xx();
            case 4:
                return new C8163xw();
            case 5:
                return f28688f;
            case 6:
                C63010eb ebVar = f28689h;
                if (ebVar == null) {
                    synchronized (C8164xx.class) {
                        ebVar = f28689h;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f28688f);
                            f28689h = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
