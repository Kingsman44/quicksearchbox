package com.google.p375ai.p378b;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.ai.b.di */
/* compiled from: PG */
public final class C7609di extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C7609di f26297c;

    /* renamed from: d */
    private static volatile C63010eb f26298d;

    /* renamed from: a */
    public int f26299a = 0;

    /* renamed from: b */
    public Object f26300b;

    static {
        C7609di diVar = new C7609di();
        f26297c = diVar;
        C62942bv.registerDefaultInstance(C7609di.class, diVar);
    }

    private C7609di() {
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
                return newMessageInfo(f26297c, "\u0001\u0002\u0001\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001ျ\u0000\u0002ျ\u0000", new Object[]{"b", "a"});
            case 3:
                return new C7609di();
            case 4:
                return new C7608dh();
            case 5:
                return f26297c;
            case 6:
                C63010eb ebVar = f26298d;
                if (ebVar == null) {
                    synchronized (C7609di.class) {
                        ebVar = f26298d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f26297c);
                            f26298d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
