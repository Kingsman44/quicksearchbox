package com.google.assistant.p3897e.p3921j.p3926e;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.e.j.e.in */
/* compiled from: PG */
public final class C52042in extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C52042in f136592c;

    /* renamed from: e */
    private static volatile C63010eb f136593e;

    /* renamed from: a */
    public int f136594a = 0;

    /* renamed from: b */
    public Object f136595b;

    /* renamed from: d */
    private byte f136596d = 2;

    static {
        C52042in inVar = new C52042in();
        f136592c = inVar;
        C62942bv.registerDefaultInstance(C52042in.class, inVar);
    }

    private C52042in() {
    }

    /* renamed from: a */
    public static C63010eb m86473a() {
        return f136592c.getParserForType();
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f136596d);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f136596d = b;
                return null;
            case 2:
                return newMessageInfo(f136592c, "\u0001\u0002\u0001\u0000\u0002\u0003\u0002\u0000\u0000\u0001\u0002ᐼ\u0000\u0003ြ\u0000", new Object[]{"b", "a", C52040il.class, C52038ij.class});
            case 3:
                return new C52042in();
            case 4:
                return new C52041im();
            case 5:
                return f136592c;
            case 6:
                C63010eb ebVar = f136593e;
                if (ebVar == null) {
                    synchronized (C52042in.class) {
                        ebVar = f136593e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f136592c);
                            f136593e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
