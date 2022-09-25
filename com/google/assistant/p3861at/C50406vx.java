package com.google.assistant.p3861at;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.at.vx */
/* compiled from: PG */
public final class C50406vx extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C50406vx f131197c;

    /* renamed from: d */
    private static volatile C63010eb f131198d;

    /* renamed from: a */
    public int f131199a;

    /* renamed from: b */
    public C50413wd f131200b;

    static {
        C50406vx vxVar = new C50406vx();
        f131197c = vxVar;
        C62942bv.registerDefaultInstance(C50406vx.class, vxVar);
    }

    private C50406vx() {
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
                return newMessageInfo(f131197c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"a", "b"});
            case 3:
                return new C50406vx();
            case 4:
                return new C50405vw();
            case 5:
                return f131197c;
            case 6:
                C63010eb ebVar = f131198d;
                if (ebVar == null) {
                    synchronized (C50406vx.class) {
                        ebVar = f131198d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f131197c);
                            f131198d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
