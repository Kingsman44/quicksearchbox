package com.google.assistant.p3897e.p3921j;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.e.j.kz */
/* compiled from: PG */
public final class C52255kz extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C52255kz f137134c;

    /* renamed from: d */
    private static volatile C63010eb f137135d;

    /* renamed from: a */
    public int f137136a;

    /* renamed from: b */
    public boolean f137137b;

    static {
        C52255kz kzVar = new C52255kz();
        f137134c = kzVar;
        C62942bv.registerDefaultInstance(C52255kz.class, kzVar);
    }

    private C52255kz() {
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
                return newMessageInfo(f137134c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဇ\u0000", new Object[]{"a", "b"});
            case 3:
                return new C52255kz();
            case 4:
                return new C52254ky();
            case 5:
                return f137134c;
            case 6:
                C63010eb ebVar = f137135d;
                if (ebVar == null) {
                    synchronized (C52255kz.class) {
                        ebVar = f137135d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f137134c);
                            f137135d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
