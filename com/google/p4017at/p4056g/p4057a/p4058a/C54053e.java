package com.google.p4017at.p4056g.p4057a.p4058a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.at.g.a.a.e */
/* compiled from: PG */
public final class C54053e extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C54053e f141812c;

    /* renamed from: d */
    private static volatile C63010eb f141813d;

    /* renamed from: a */
    public int f141814a;

    /* renamed from: b */
    public boolean f141815b;

    static {
        C54053e eVar = new C54053e();
        f141812c = eVar;
        C62942bv.registerDefaultInstance(C54053e.class, eVar);
    }

    private C54053e() {
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
                return newMessageInfo(f141812c, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0004\u0002\u0007", new Object[]{"a", "b"});
            case 3:
                return new C54053e();
            case 4:
                return new C54046d();
            case 5:
                return f141812c;
            case 6:
                C63010eb ebVar = f141813d;
                if (ebVar == null) {
                    synchronized (C54053e.class) {
                        ebVar = f141813d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f141812c);
                            f141813d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
