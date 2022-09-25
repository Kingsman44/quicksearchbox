package com.google.assistant.p3879aw.p3881b;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.aw.b.l */
/* compiled from: PG */
public final class C50609l extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C50609l f131675b;

    /* renamed from: d */
    private static volatile C63010eb f131676d;

    /* renamed from: a */
    public C50613p f131677a;

    /* renamed from: c */
    private int f131678c;

    static {
        C50609l lVar = new C50609l();
        f131675b = lVar;
        C62942bv.registerDefaultInstance(C50609l.class, lVar);
    }

    private C50609l() {
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
                return newMessageInfo(f131675b, "\u0001\u0001\u0000\u0001\u0002\u0002\u0001\u0000\u0000\u0000\u0002ဉ\u0001", new Object[]{C45240c.f118157a, "a"});
            case 3:
                return new C50609l();
            case 4:
                return new C50608k();
            case 5:
                return f131675b;
            case 6:
                C63010eb ebVar = f131676d;
                if (ebVar == null) {
                    synchronized (C50609l.class) {
                        ebVar = f131676d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f131675b);
                            f131676d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
