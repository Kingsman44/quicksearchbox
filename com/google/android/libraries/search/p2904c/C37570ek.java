package com.google.android.libraries.search.p2904c;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.search.c.ek */
/* compiled from: PG */
public final class C37570ek extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C37570ek f99836e;

    /* renamed from: g */
    private static volatile C63010eb f99837g;

    /* renamed from: a */
    public int f99838a;

    /* renamed from: b */
    public int f99839b = 0;

    /* renamed from: c */
    public Object f99840c;

    /* renamed from: d */
    public long f99841d;

    /* renamed from: f */
    private byte f99842f = 2;

    static {
        C37570ek ekVar = new C37570ek();
        f99836e = ekVar;
        C62942bv.registerDefaultInstance(C37570ek.class, ekVar);
    }

    private C37570ek() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f99842f);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f99842f = b;
                return null;
            case 2:
                return newMessageInfo(f99836e, "\u0001\u0004\u0001\u0001\u0001\u0004\u0004\u0000\u0000\u0001\u0001ဂ\u0000\u0002ᐼ\u0000\u0003ြ\u0000\u0004ြ\u0000", new Object[]{C45240c.f118157a, "b", "a", "d", C37592fd.class, C37598fj.class, C37595fg.class});
            case 3:
                return new C37570ek();
            case 4:
                return new C37568ei();
            case 5:
                return f99836e;
            case 6:
                C63010eb ebVar = f99837g;
                if (ebVar == null) {
                    synchronized (C37570ek.class) {
                        ebVar = f99837g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f99836e);
                            f99837g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
