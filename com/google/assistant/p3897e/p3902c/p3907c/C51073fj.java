package com.google.assistant.p3897e.p3902c.p3907c;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.assistant.p3897e.p3921j.C52353op;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.e.c.c.fj */
/* compiled from: PG */
public final class C51073fj extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C51073fj f132977d;

    /* renamed from: e */
    private static volatile C63010eb f132978e;

    /* renamed from: a */
    public int f132979a;

    /* renamed from: b */
    public C52353op f132980b;

    /* renamed from: c */
    public int f132981c;

    static {
        C51073fj fjVar = new C51073fj();
        f132977d = fjVar;
        C62942bv.registerDefaultInstance(C51073fj.class, fjVar);
    }

    private C51073fj() {
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
                return newMessageInfo(f132977d, "\u0001\u0002\u0000\u0001\u0003\u0005\u0002\u0000\u0000\u0000\u0003ဉ\u0002\u0005ဌ\u0004", new Object[]{"a", "b", C45240c.f118157a, C51072fi.f132976a});
            case 3:
                return new C51073fj();
            case 4:
                return new C51071fh();
            case 5:
                return f132977d;
            case 6:
                C63010eb ebVar = f132978e;
                if (ebVar == null) {
                    synchronized (C51073fj.class) {
                        ebVar = f132978e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f132977d);
                            f132978e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
