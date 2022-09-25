package com.google.android.apps.p489g.p494d;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.p375ai.p378b.C8011sf;
import com.google.p375ai.p378b.C8150xj;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.g.d.ax */
/* compiled from: PG */
public final class C9161ax extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C9161ax f31622d;

    /* renamed from: f */
    private static volatile C63010eb f31623f;

    /* renamed from: a */
    public int f31624a;

    /* renamed from: b */
    public C8011sf f31625b;

    /* renamed from: c */
    public C8150xj f31626c;

    /* renamed from: e */
    private byte f31627e = 2;

    static {
        C9161ax axVar = new C9161ax();
        f31622d = axVar;
        C62942bv.registerDefaultInstance(C9161ax.class, axVar);
    }

    private C9161ax() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f31627e);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f31627e = b;
                return null;
            case 2:
                return newMessageInfo(f31622d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0001\u0001ᐉ\u0000\u0002ဉ\u0001", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C9161ax();
            case 4:
                return new C9160aw();
            case 5:
                return f31622d;
            case 6:
                C63010eb ebVar = f31623f;
                if (ebVar == null) {
                    synchronized (C9161ax.class) {
                        ebVar = f31623f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f31622d);
                            f31623f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
