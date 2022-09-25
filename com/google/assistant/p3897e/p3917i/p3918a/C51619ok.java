package com.google.assistant.p3897e.p3917i.p3918a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.e.i.a.ok */
/* compiled from: PG */
public final class C51619ok extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C51619ok f134530c;

    /* renamed from: d */
    private static volatile C63010eb f134531d;

    /* renamed from: a */
    public int f134532a;

    /* renamed from: b */
    public int f134533b;

    static {
        C51619ok okVar = new C51619ok();
        f134530c = okVar;
        C62942bv.registerDefaultInstance(C51619ok.class, okVar);
    }

    private C51619ok() {
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
                return newMessageInfo(f134530c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဌ\u0000", new Object[]{"a", "b", C51618oj.m86253b()});
            case 3:
                return new C51619ok();
            case 4:
                return new C51616oh();
            case 5:
                return f134530c;
            case 6:
                C63010eb ebVar = f134531d;
                if (ebVar == null) {
                    synchronized (C51619ok.class) {
                        ebVar = f134531d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f134530c);
                            f134531d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
