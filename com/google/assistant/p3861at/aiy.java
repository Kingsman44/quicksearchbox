package com.google.assistant.p3861at;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.at.aiy */
/* compiled from: PG */
public final class aiy extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final aiy f129441c;

    /* renamed from: e */
    private static volatile C63010eb f129442e;

    /* renamed from: a */
    public int f129443a = 0;

    /* renamed from: b */
    public Object f129444b;

    /* renamed from: d */
    private byte f129445d = 2;

    static {
        aiy aiy = new aiy();
        f129441c = aiy;
        C62942bv.registerDefaultInstance(aiy.class, aiy);
    }

    private aiy() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f129445d);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f129445d = b;
                return null;
            case 2:
                return newMessageInfo(f129441c, "\u0001\u0004\u0001\u0000\u0001\u0004\u0004\u0000\u0000\u0002\u0001ᐼ\u0000\u0002ြ\u0000\u0003ᐼ\u0000\u0004ြ\u0000", new Object[]{"b", "a", ahd.class, agv.class, aiu.class, aiw.class});
            case 3:
                return new aiy();
            case 4:
                return new aix();
            case 5:
                return f129441c;
            case 6:
                C63010eb ebVar = f129442e;
                if (ebVar == null) {
                    synchronized (aiy.class) {
                        ebVar = f129442e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f129441c);
                            f129442e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
