package com.google.assistant.p3897e.p3902c.p3907c;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.e.c.c.hd */
/* compiled from: PG */
public final class C51121hd extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C51121hd f133066c;

    /* renamed from: f */
    private static volatile C63010eb f133067f;

    /* renamed from: a */
    public C51119hb f133068a;

    /* renamed from: b */
    public C51123hf f133069b;

    /* renamed from: d */
    private int f133070d;

    /* renamed from: e */
    private byte f133071e = 2;

    static {
        C51121hd hdVar = new C51121hd();
        f133066c = hdVar;
        C62942bv.registerDefaultInstance(C51121hd.class, hdVar);
    }

    private C51121hd() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f133071e);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f133071e = b;
                return null;
            case 2:
                return newMessageInfo(f133066c, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0001\u0001ᐉ\u0000\u0002ဉ\u0001", new Object[]{"d", "a", "b"});
            case 3:
                return new C51121hd();
            case 4:
                return new C51120hc();
            case 5:
                return f133066c;
            case 6:
                C63010eb ebVar = f133067f;
                if (ebVar == null) {
                    synchronized (C51121hd.class) {
                        ebVar = f133067f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f133066c);
                            f133067f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
