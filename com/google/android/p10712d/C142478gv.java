package com.google.android.p10712d;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.d.gv */
/* compiled from: PG */
public final class C142478gv extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C142478gv f386650c;

    /* renamed from: d */
    private static volatile C63010eb f386651d;

    /* renamed from: a */
    public C142482gz f386652a;

    /* renamed from: b */
    public long f386653b;

    static {
        C142478gv gvVar = new C142478gv();
        f386650c = gvVar;
        C62942bv.registerDefaultInstance(C142478gv.class, gvVar);
    }

    private C142478gv() {
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
                return newMessageInfo(f386650c, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\t\u0002\u0003", new Object[]{"a", "b"});
            case 3:
                return new C142478gv();
            case 4:
                return new C142477gu();
            case 5:
                return f386650c;
            case 6:
                C63010eb ebVar = f386651d;
                if (ebVar == null) {
                    synchronized (C142478gv.class) {
                        ebVar = f386651d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f386650c);
                            f386651d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
