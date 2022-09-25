package com.google.lens.p4705i.p4706a;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.lens.i.a.w */
/* compiled from: PG */
public final class C62392w extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C62392w f168423d;

    /* renamed from: e */
    private static volatile C63010eb f168424e;

    /* renamed from: a */
    public C62971cq f168425a = C62942bv.emptyProtobufList();

    /* renamed from: b */
    public C62971cq f168426b = C62942bv.emptyProtobufList();

    /* renamed from: c */
    public boolean f168427c;

    static {
        C62392w wVar = new C62392w();
        f168423d = wVar;
        C62942bv.registerDefaultInstance(C62392w.class, wVar);
    }

    private C62392w() {
        C62942bv.emptyProtobufList();
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
                return newMessageInfo(f168423d, "\u0000\u0003\u0000\u0000\u0001\u0004\u0003\u0000\u0002\u0000\u0001Ț\u0002Ț\u0004\u0007", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C62392w();
            case 4:
                return new C62391v();
            case 5:
                return f168423d;
            case 6:
                C63010eb ebVar = f168424e;
                if (ebVar == null) {
                    synchronized (C62392w.class) {
                        ebVar = f168424e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f168423d);
                            f168424e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
