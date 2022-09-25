package com.google.p4653i.p4654a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.i.a.aq */
/* compiled from: PG */
public final class C61676aq extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C61676aq f166619c;

    /* renamed from: e */
    private static volatile C63010eb f166620e;

    /* renamed from: a */
    public int f166621a;

    /* renamed from: b */
    public C61710t f166622b;

    /* renamed from: d */
    private byte f166623d = 2;

    static {
        C61676aq aqVar = new C61676aq();
        f166619c = aqVar;
        C62942bv.registerDefaultInstance(C61676aq.class, aqVar);
    }

    private C61676aq() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f166623d);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f166623d = b;
                return null;
            case 2:
                return newMessageInfo(f166619c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001ᐉ\u0000", new Object[]{"a", "b"});
            case 3:
                return new C61676aq();
            case 4:
                return new C61675ap();
            case 5:
                return f166619c;
            case 6:
                C63010eb ebVar = f166620e;
                if (ebVar == null) {
                    synchronized (C61676aq.class) {
                        ebVar = f166620e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f166619c);
                            f166620e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
