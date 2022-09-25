package com.google.assistant.p3803ag.p3809c;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.ag.c.gy */
/* compiled from: PG */
public final class C49113gy extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C49113gy f127022c;

    /* renamed from: e */
    private static volatile C63010eb f127023e;

    /* renamed from: a */
    public int f127024a;

    /* renamed from: b */
    public C49042eh f127025b;

    /* renamed from: d */
    private byte f127026d = 2;

    static {
        C49113gy gyVar = new C49113gy();
        f127022c = gyVar;
        C62942bv.registerDefaultInstance(C49113gy.class, gyVar);
    }

    private C49113gy() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f127026d);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f127026d = b;
                return null;
            case 2:
                return newMessageInfo(f127022c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001ᐉ\u0000", new Object[]{"a", "b"});
            case 3:
                return new C49113gy();
            case 4:
                return new C49112gx();
            case 5:
                return f127022c;
            case 6:
                C63010eb ebVar = f127023e;
                if (ebVar == null) {
                    synchronized (C49113gy.class) {
                        ebVar = f127023e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f127022c);
                            f127023e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
