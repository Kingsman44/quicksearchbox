package com.google.android.apps.gsa.nga.engine.p6262y.p6267c.p6268a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.nga.engine.y.c.a.w */
/* compiled from: PG */
public final class C79922w extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C79922w f219063c;

    /* renamed from: e */
    private static volatile C63010eb f219064e;

    /* renamed from: a */
    public int f219065a;

    /* renamed from: b */
    public C79920u f219066b;

    /* renamed from: d */
    private byte f219067d = 2;

    static {
        C79922w wVar = new C79922w();
        f219063c = wVar;
        C62942bv.registerDefaultInstance(C79922w.class, wVar);
    }

    private C79922w() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f219067d);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f219067d = b;
                return null;
            case 2:
                return newMessageInfo(f219063c, "\u0001\u0001\u0000\u0001\u0003\u0003\u0001\u0000\u0000\u0000\u0003ဉ\u0001", new Object[]{"a", "b"});
            case 3:
                return new C79922w();
            case 4:
                return new C79921v();
            case 5:
                return f219063c;
            case 6:
                C63010eb ebVar = f219064e;
                if (ebVar == null) {
                    synchronized (C79922w.class) {
                        ebVar = f219064e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f219063c);
                            f219064e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
