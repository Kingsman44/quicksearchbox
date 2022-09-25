package com.google.android.libraries.assistant.pcp.p1578m;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.assistant.pcp.m.u */
/* compiled from: PG */
public final class C18991u extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C18991u f53360b;

    /* renamed from: d */
    private static volatile C63010eb f53361d;

    /* renamed from: a */
    public C18989s f53362a;

    /* renamed from: c */
    private int f53363c;

    static {
        C18991u uVar = new C18991u();
        f53360b = uVar;
        C62942bv.registerDefaultInstance(C18991u.class, uVar);
    }

    private C18991u() {
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
                return newMessageInfo(f53360b, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{C45240c.f118157a, "a"});
            case 3:
                return new C18991u();
            case 4:
                return new C18990t();
            case 5:
                return f53360b;
            case 6:
                C63010eb ebVar = f53361d;
                if (ebVar == null) {
                    synchronized (C18991u.class) {
                        ebVar = f53361d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f53360b);
                            f53361d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
