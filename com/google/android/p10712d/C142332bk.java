package com.google.android.p10712d;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.d.bk */
/* compiled from: PG */
public final class C142332bk extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C142332bk f386155b;

    /* renamed from: c */
    private static volatile C63010eb f386156c;

    /* renamed from: a */
    public C62971cq f386157a = emptyProtobufList();

    static {
        C142332bk bkVar = new C142332bk();
        f386155b = bkVar;
        C62942bv.registerDefaultInstance(C142332bk.class, bkVar);
    }

    private C142332bk() {
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
                return newMessageInfo(f386155b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"a", C142349ca.class});
            case 3:
                return new C142332bk();
            case 4:
                return new C142331bj();
            case 5:
                return f386155b;
            case 6:
                C63010eb ebVar = f386156c;
                if (ebVar == null) {
                    synchronized (C142332bk.class) {
                        ebVar = f386156c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f386155b);
                            f386156c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
