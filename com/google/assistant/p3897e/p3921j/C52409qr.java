package com.google.assistant.p3897e.p3921j;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.e.j.qr */
/* compiled from: PG */
public final class C52409qr extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C52409qr f137528b;

    /* renamed from: d */
    private static volatile C63010eb f137529d;

    /* renamed from: a */
    public String f137530a = BuildConfig.FLAVOR;

    /* renamed from: c */
    private int f137531c;

    static {
        C52409qr qrVar = new C52409qr();
        f137528b = qrVar;
        C62942bv.registerDefaultInstance(C52409qr.class, qrVar);
    }

    private C52409qr() {
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
                return newMessageInfo(f137528b, "\u0001\u0001\u0000\u0001\u0002\u0002\u0001\u0000\u0000\u0000\u0002ဈ\u0001", new Object[]{C45240c.f118157a, "a"});
            case 3:
                return new C52409qr();
            case 4:
                return new C52408qq();
            case 5:
                return f137528b;
            case 6:
                C63010eb ebVar = f137529d;
                if (ebVar == null) {
                    synchronized (C52409qr.class) {
                        ebVar = f137529d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f137528b);
                            f137529d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
