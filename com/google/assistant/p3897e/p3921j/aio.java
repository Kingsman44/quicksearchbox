package com.google.assistant.p3897e.p3921j;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.e.j.aio */
/* compiled from: PG */
public final class aio extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final aio f135185d;

    /* renamed from: e */
    private static volatile C63010eb f135186e;

    /* renamed from: a */
    public int f135187a;

    /* renamed from: b */
    public boolean f135188b;

    /* renamed from: c */
    public boolean f135189c;

    static {
        aio aio = new aio();
        f135185d = aio;
        C62942bv.registerDefaultInstance(aio.class, aio);
    }

    private aio() {
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
                return newMessageInfo(f135185d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဇ\u0001", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new aio();
            case 4:
                return new ain();
            case 5:
                return f135185d;
            case 6:
                C63010eb ebVar = f135186e;
                if (ebVar == null) {
                    synchronized (aio.class) {
                        ebVar = f135186e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f135185d);
                            f135186e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
