package com.google.assistant.p3897e.p3917i.p3918a;

import com.google.common.p4552o.p4566l.C60218r;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.e.i.a.jp */
/* compiled from: PG */
public final class C51489jp extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C51489jp f134155c;

    /* renamed from: e */
    private static volatile C63010eb f134156e;

    /* renamed from: a */
    public int f134157a;

    /* renamed from: b */
    public C60218r f134158b;

    /* renamed from: d */
    private byte f134159d = 2;

    static {
        C51489jp jpVar = new C51489jp();
        f134155c = jpVar;
        C62942bv.registerDefaultInstance(C51489jp.class, jpVar);
    }

    private C51489jp() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f134159d);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f134159d = b;
                return null;
            case 2:
                return newMessageInfo(f134155c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001ᐉ\u0000", new Object[]{"a", "b"});
            case 3:
                return new C51489jp();
            case 4:
                return new C51488jo();
            case 5:
                return f134155c;
            case 6:
                C63010eb ebVar = f134156e;
                if (ebVar == null) {
                    synchronized (C51489jp.class) {
                        ebVar = f134156e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f134155c);
                            f134156e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
