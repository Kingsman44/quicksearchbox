package com.google.android.libraries.assistant.p1525l.p1526a.p1527a;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.assistant.l.a.a.d */
/* compiled from: PG */
public final class C18409d extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C18409d f52243b;

    /* renamed from: d */
    private static volatile C63010eb f52244d;

    /* renamed from: a */
    public boolean f52245a;

    /* renamed from: c */
    private int f52246c;

    static {
        C18409d dVar = new C18409d();
        f52243b = dVar;
        C62942bv.registerDefaultInstance(C18409d.class, dVar);
    }

    private C18409d() {
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
                return newMessageInfo(f52243b, "\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဇ\u0000", new Object[]{C45240c.f118157a, "a"});
            case 3:
                return new C18409d();
            case 4:
                return new C18408c();
            case 5:
                return f52243b;
            case 6:
                C63010eb ebVar = f52244d;
                if (ebVar == null) {
                    synchronized (C18409d.class) {
                        ebVar = f52244d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f52243b);
                            f52244d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
