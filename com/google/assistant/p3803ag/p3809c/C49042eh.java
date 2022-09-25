package com.google.assistant.p3803ag.p3809c;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.assistant.p3897e.p3917i.p3918a.C51334dw;
import com.google.assistant.p3897e.p3921j.C51715bm;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.ag.c.eh */
/* compiled from: PG */
public final class C49042eh extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C49042eh f126842d;

    /* renamed from: f */
    private static volatile C63010eb f126843f;

    /* renamed from: a */
    public int f126844a;

    /* renamed from: b */
    public C51715bm f126845b;

    /* renamed from: c */
    public C51334dw f126846c;

    /* renamed from: e */
    private byte f126847e = 2;

    static {
        C49042eh ehVar = new C49042eh();
        f126842d = ehVar;
        C62942bv.registerDefaultInstance(C49042eh.class, ehVar);
    }

    private C49042eh() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f126847e);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f126847e = b;
                return null;
            case 2:
                return newMessageInfo(f126842d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0002\u0001ᐉ\u0000\u0002ᐉ\u0001", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C49042eh();
            case 4:
                return new C49041eg();
            case 5:
                return f126842d;
            case 6:
                C63010eb ebVar = f126843f;
                if (ebVar == null) {
                    synchronized (C49042eh.class) {
                        ebVar = f126843f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f126842d);
                            f126843f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
