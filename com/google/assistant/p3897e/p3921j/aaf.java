package com.google.assistant.p3897e.p3921j;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.e.j.aaf */
/* compiled from: PG */
public final class aaf extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final aaf f134626c;

    /* renamed from: e */
    private static volatile C63010eb f134627e;

    /* renamed from: a */
    public C52395qd f134628a;

    /* renamed from: b */
    public C52395qd f134629b;

    /* renamed from: d */
    private int f134630d;

    static {
        aaf aaf = new aaf();
        f134626c = aaf;
        C62942bv.registerDefaultInstance(aaf.class, aaf);
    }

    private aaf() {
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
                return newMessageInfo(f134626c, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001", new Object[]{"d", "a", "b"});
            case 3:
                return new aaf();
            case 4:
                return new aae();
            case 5:
                return f134626c;
            case 6:
                C63010eb ebVar = f134627e;
                if (ebVar == null) {
                    synchronized (aaf.class) {
                        ebVar = f134627e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f134626c);
                            f134627e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
