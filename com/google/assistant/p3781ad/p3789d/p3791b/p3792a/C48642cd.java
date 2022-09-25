package com.google.assistant.p3781ad.p3789d.p3791b.p3792a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.ad.d.b.a.cd */
/* compiled from: PG */
public final class C48642cd extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C48642cd f125720b;

    /* renamed from: c */
    private static volatile C63010eb f125721c;

    /* renamed from: a */
    public C48603as f125722a;

    static {
        C48642cd cdVar = new C48642cd();
        f125720b = cdVar;
        C62942bv.registerDefaultInstance(C48642cd.class, cdVar);
    }

    private C48642cd() {
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
                return newMessageInfo(f125720b, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\t", new Object[]{"a"});
            case 3:
                return new C48642cd();
            case 4:
                return new C48641cc();
            case 5:
                return f125720b;
            case 6:
                C63010eb ebVar = f125721c;
                if (ebVar == null) {
                    synchronized (C48642cd.class) {
                        ebVar = f125721c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f125720b);
                            f125721c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
