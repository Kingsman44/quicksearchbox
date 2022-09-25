package com.google.assistant.p3897e.p3921j.p3926e;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.assistant.p3897e.p3902c.p3907c.C51016dg;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.e.j.e.am */
/* compiled from: PG */
public final class C51825am extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C51825am f135965b;

    /* renamed from: f */
    private static volatile C63010eb f135966f;

    /* renamed from: a */
    public C51016dg f135967a;

    /* renamed from: c */
    private int f135968c;

    /* renamed from: d */
    private C51016dg f135969d;

    /* renamed from: e */
    private byte f135970e = 2;

    static {
        C51825am amVar = new C51825am();
        f135965b = amVar;
        C62942bv.registerDefaultInstance(C51825am.class, amVar);
    }

    private C51825am() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f135970e);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f135970e = b;
                return null;
            case 2:
                return newMessageInfo(f135965b, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0002\u0001ᐉ\u0000\u0002ᐉ\u0001", new Object[]{C45240c.f118157a, "a", "d"});
            case 3:
                return new C51825am();
            case 4:
                return new C51824al();
            case 5:
                return f135965b;
            case 6:
                C63010eb ebVar = f135966f;
                if (ebVar == null) {
                    synchronized (C51825am.class) {
                        ebVar = f135966f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f135965b);
                            f135966f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
