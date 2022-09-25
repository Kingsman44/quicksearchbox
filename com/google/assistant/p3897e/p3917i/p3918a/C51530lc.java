package com.google.assistant.p3897e.p3917i.p3918a;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.e.i.a.lc */
/* compiled from: PG */
public final class C51530lc extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C51530lc f134283b;

    /* renamed from: e */
    private static volatile C63010eb f134284e;

    /* renamed from: a */
    public C51532le f134285a;

    /* renamed from: c */
    private int f134286c;

    /* renamed from: d */
    private byte f134287d = 2;

    static {
        C51530lc lcVar = new C51530lc();
        f134283b = lcVar;
        C62942bv.registerDefaultInstance(C51530lc.class, lcVar);
    }

    private C51530lc() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f134287d);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f134287d = b;
                return null;
            case 2:
                return newMessageInfo(f134283b, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001ᐉ\u0000", new Object[]{C45240c.f118157a, "a"});
            case 3:
                return new C51530lc();
            case 4:
                return new C51529lb();
            case 5:
                return f134283b;
            case 6:
                C63010eb ebVar = f134284e;
                if (ebVar == null) {
                    synchronized (C51530lc.class) {
                        ebVar = f134284e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f134283b);
                            f134284e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
