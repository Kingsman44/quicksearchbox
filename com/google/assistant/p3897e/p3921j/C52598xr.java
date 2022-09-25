package com.google.assistant.p3897e.p3921j;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.assistant.p3897e.p3902c.p3907c.C51098gh;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.e.j.xr */
/* compiled from: PG */
public final class C52598xr extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C52598xr f138103d;

    /* renamed from: f */
    private static volatile C63010eb f138104f;

    /* renamed from: a */
    public int f138105a;

    /* renamed from: b */
    public C52568wo f138106b;

    /* renamed from: c */
    public C51098gh f138107c;

    /* renamed from: e */
    private byte f138108e = 2;

    static {
        C52598xr xrVar = new C52598xr();
        f138103d = xrVar;
        C62942bv.registerDefaultInstance(C52598xr.class, xrVar);
    }

    private C52598xr() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f138108e);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f138108e = b;
                return null;
            case 2:
                return newMessageInfo(f138103d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0001\u0001ᐉ\u0000\u0002ဉ\u0001", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C52598xr();
            case 4:
                return new C52597xq();
            case 5:
                return f138103d;
            case 6:
                C63010eb ebVar = f138104f;
                if (ebVar == null) {
                    synchronized (C52598xr.class) {
                        ebVar = f138104f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f138103d);
                            f138104f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
