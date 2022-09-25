package com.google.assistant.p3897e.p3902c.p3903a.p3904a;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.e.c.a.a.r */
/* compiled from: PG */
public final class C50915r extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C50915r f132558d;

    /* renamed from: e */
    private static volatile C63010eb f132559e;

    /* renamed from: a */
    public int f132560a;

    /* renamed from: b */
    public C62971cq f132561b = emptyProtobufList();

    /* renamed from: c */
    public C50894ab f132562c;

    static {
        C50915r rVar = new C50915r();
        f132558d = rVar;
        C62942bv.registerDefaultInstance(C50915r.class, rVar);
    }

    private C50915r() {
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
                return newMessageInfo(f132558d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001b\u0002ဉ\u0000", new Object[]{"a", "b", C50898af.class, C45240c.f118157a});
            case 3:
                return new C50915r();
            case 4:
                return new C50914q();
            case 5:
                return f132558d;
            case 6:
                C63010eb ebVar = f132559e;
                if (ebVar == null) {
                    synchronized (C50915r.class) {
                        ebVar = f132559e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f132558d);
                            f132559e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
