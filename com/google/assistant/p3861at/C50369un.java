package com.google.assistant.p3861at;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.at.un */
/* compiled from: PG */
public final class C50369un extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C50369un f131116c;

    /* renamed from: d */
    private static volatile C63010eb f131117d;

    /* renamed from: a */
    public int f131118a;

    /* renamed from: b */
    public aem f131119b;

    static {
        C50369un unVar = new C50369un();
        f131116c = unVar;
        C62942bv.registerDefaultInstance(C50369un.class, unVar);
    }

    private C50369un() {
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
                return newMessageInfo(f131116c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"a", "b"});
            case 3:
                return new C50369un();
            case 4:
                return new C50368um();
            case 5:
                return f131116c;
            case 6:
                C63010eb ebVar = f131117d;
                if (ebVar == null) {
                    synchronized (C50369un.class) {
                        ebVar = f131117d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f131116c);
                            f131117d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
