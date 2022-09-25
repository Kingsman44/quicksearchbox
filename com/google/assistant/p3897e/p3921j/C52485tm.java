package com.google.assistant.p3897e.p3921j;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.e.j.tm */
/* compiled from: PG */
public final class C52485tm extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C52485tm f137770c;

    /* renamed from: d */
    private static volatile C63010eb f137771d;

    /* renamed from: a */
    public int f137772a;

    /* renamed from: b */
    public C52460so f137773b;

    static {
        C52485tm tmVar = new C52485tm();
        f137770c = tmVar;
        C62942bv.registerDefaultInstance(C52485tm.class, tmVar);
    }

    private C52485tm() {
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
                return newMessageInfo(f137770c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"a", "b"});
            case 3:
                return new C52485tm();
            case 4:
                return new C52484tl();
            case 5:
                return f137770c;
            case 6:
                C63010eb ebVar = f137771d;
                if (ebVar == null) {
                    synchronized (C52485tm.class) {
                        ebVar = f137771d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f137770c);
                            f137771d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
