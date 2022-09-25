package com.google.assistant.p3897e.p3921j;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.e.j.fo */
/* compiled from: PG */
public final class C52109fo extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C52109fo f136747c;

    /* renamed from: d */
    private static volatile C63010eb f136748d;

    /* renamed from: a */
    public int f136749a;

    /* renamed from: b */
    public boolean f136750b;

    static {
        C52109fo foVar = new C52109fo();
        f136747c = foVar;
        C62942bv.registerDefaultInstance(C52109fo.class, foVar);
    }

    private C52109fo() {
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
                return newMessageInfo(f136747c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဇ\u0000", new Object[]{"a", "b"});
            case 3:
                return new C52109fo();
            case 4:
                return new C52108fn();
            case 5:
                return f136747c;
            case 6:
                C63010eb ebVar = f136748d;
                if (ebVar == null) {
                    synchronized (C52109fo.class) {
                        ebVar = f136748d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f136747c);
                            f136748d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
