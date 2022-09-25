package com.google.assistant.p3897e.p3917i.p3918a;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.e.i.a.jb */
/* compiled from: PG */
public final class C51475jb extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C51475jb f134125d;

    /* renamed from: e */
    private static volatile C63010eb f134126e;

    /* renamed from: a */
    public int f134127a;

    /* renamed from: b */
    public int f134128b;

    /* renamed from: c */
    public boolean f134129c;

    static {
        C51475jb jbVar = new C51475jb();
        f134125d = jbVar;
        C62942bv.registerDefaultInstance(C51475jb.class, jbVar);
    }

    private C51475jb() {
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
                return newMessageInfo(f134125d, "\u0001\u0002\u0000\u0001\u0001\u0003\u0002\u0000\u0000\u0000\u0001ဌ\u0000\u0003ဇ\u0002", new Object[]{"a", "b", C51474ja.m86197b(), C45240c.f118157a});
            case 3:
                return new C51475jb();
            case 4:
                return new C51471iy();
            case 5:
                return f134125d;
            case 6:
                C63010eb ebVar = f134126e;
                if (ebVar == null) {
                    synchronized (C51475jb.class) {
                        ebVar = f134126e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f134125d);
                            f134126e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
