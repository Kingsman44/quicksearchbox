package com.google.p375ai.p378b;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.ai.b.en */
/* compiled from: PG */
public final class C7641en extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C7641en f26395d;

    /* renamed from: e */
    private static volatile C63010eb f26396e;

    /* renamed from: a */
    public int f26397a;

    /* renamed from: b */
    public C62971cq f26398b = C62942bv.emptyProtobufList();

    /* renamed from: c */
    public int f26399c;

    static {
        C7641en enVar = new C7641en();
        f26395d = enVar;
        C62942bv.registerDefaultInstance(C7641en.class, enVar);
    }

    private C7641en() {
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
                return newMessageInfo(f26395d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001a\u0002င\u0000", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C7641en();
            case 4:
                return new C7640em();
            case 5:
                return f26395d;
            case 6:
                C63010eb ebVar = f26396e;
                if (ebVar == null) {
                    synchronized (C7641en.class) {
                        ebVar = f26396e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f26395d);
                            f26396e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
