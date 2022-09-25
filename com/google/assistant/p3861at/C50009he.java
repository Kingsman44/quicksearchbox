package com.google.assistant.p3861at;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.at.he */
/* compiled from: PG */
public final class C50009he extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C50009he f130009d;

    /* renamed from: f */
    private static volatile C63010eb f130010f;

    /* renamed from: a */
    public boolean f130011a;

    /* renamed from: b */
    public boolean f130012b;

    /* renamed from: c */
    public C62971cq f130013c = emptyProtobufList();

    /* renamed from: e */
    private int f130014e;

    static {
        C50009he heVar = new C50009he();
        f130009d = heVar;
        C62942bv.registerDefaultInstance(C50009he.class, heVar);
    }

    private C50009he() {
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
                return newMessageInfo(f130009d, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001ဇ\u0000\u0002ဇ\u0001\u0003\u001b", new Object[]{"e", "a", "b", C45240c.f118157a, C50008hd.class});
            case 3:
                return new C50009he();
            case 4:
                return new C50006hb();
            case 5:
                return f130009d;
            case 6:
                C63010eb ebVar = f130010f;
                if (ebVar == null) {
                    synchronized (C50009he.class) {
                        ebVar = f130010f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f130009d);
                            f130010f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
