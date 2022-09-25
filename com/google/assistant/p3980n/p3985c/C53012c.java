package com.google.assistant.p3980n.p3985c;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62937bq;
import com.google.protobuf.C62938br;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.n.c.c */
/* compiled from: PG */
public final class C53012c extends C62937bq implements C62938br {

    /* renamed from: c */
    public static final C53012c f138954c;

    /* renamed from: e */
    private static volatile C63010eb f138955e;

    /* renamed from: a */
    public int f138956a;

    /* renamed from: b */
    public boolean f138957b;

    /* renamed from: d */
    private byte f138958d = 2;

    static {
        C53012c cVar = new C53012c();
        f138954c = cVar;
        C62942bv.registerDefaultInstance(C53012c.class, cVar);
    }

    private C53012c() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f138958d);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f138958d = b;
                return null;
            case 2:
                return newMessageInfo(f138954c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဇ\u0000", new Object[]{"a", "b"});
            case 3:
                return new C53012c();
            case 4:
                return new C53011b();
            case 5:
                return f138954c;
            case 6:
                C63010eb ebVar = f138955e;
                if (ebVar == null) {
                    synchronized (C53012c.class) {
                        ebVar = f138955e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f138954c);
                            f138955e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
