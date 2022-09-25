package com.google.p4281bu.p4282a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.bu.a.bc */
/* compiled from: PG */
public final class C56519bc extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C56519bc f150939c;

    /* renamed from: d */
    private static volatile C63010eb f150940d;

    /* renamed from: a */
    public C56540bx f150941a;

    /* renamed from: b */
    public C56563ct f150942b;

    static {
        C56519bc bcVar = new C56519bc();
        f150939c = bcVar;
        C62942bv.registerDefaultInstance(C56519bc.class, bcVar);
    }

    private C56519bc() {
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
                return newMessageInfo(f150939c, "\u0000\u0002\u0000\u0000\u0002\u0003\u0002\u0000\u0000\u0000\u0002\t\u0003\t", new Object[]{"a", "b"});
            case 3:
                return new C56519bc();
            case 4:
                return new C56518bb();
            case 5:
                return f150939c;
            case 6:
                C63010eb ebVar = f150940d;
                if (ebVar == null) {
                    synchronized (C56519bc.class) {
                        ebVar = f150940d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f150939c);
                            f150940d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
