package com.google.p4281bu.p4282a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.bu.a.m */
/* compiled from: PG */
public final class C56587m extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C56587m f151083b;

    /* renamed from: c */
    private static volatile C63010eb f151084c;

    /* renamed from: a */
    public C62971cq f151085a = emptyProtobufList();

    static {
        C56587m mVar = new C56587m();
        f151083b = mVar;
        C62942bv.registerDefaultInstance(C56587m.class, mVar);
    }

    private C56587m() {
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
                return newMessageInfo(f151083b, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"a", C56585k.class});
            case 3:
                return new C56587m();
            case 4:
                return new C56586l();
            case 5:
                return f151083b;
            case 6:
                C63010eb ebVar = f151084c;
                if (ebVar == null) {
                    synchronized (C56587m.class) {
                        ebVar = f151084c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f151083b);
                            f151084c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
