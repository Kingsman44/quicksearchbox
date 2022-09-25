package com.google.assistant.p3897e.p3921j.p3922a;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.e.j.a.w */
/* compiled from: PG */
public final class C51665w extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C51665w f134610d;

    /* renamed from: e */
    private static volatile C63010eb f134611e;

    /* renamed from: a */
    public int f134612a;

    /* renamed from: b */
    public int f134613b;

    /* renamed from: c */
    public int f134614c;

    static {
        C51665w wVar = new C51665w();
        f134610d = wVar;
        C62942bv.registerDefaultInstance(C51665w.class, wVar);
    }

    private C51665w() {
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
                return newMessageInfo(f134610d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဋ\u0000\u0002ဋ\u0001", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C51665w();
            case 4:
                return new C51664v();
            case 5:
                return f134610d;
            case 6:
                C63010eb ebVar = f134611e;
                if (ebVar == null) {
                    synchronized (C51665w.class) {
                        ebVar = f134611e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f134610d);
                            f134611e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
