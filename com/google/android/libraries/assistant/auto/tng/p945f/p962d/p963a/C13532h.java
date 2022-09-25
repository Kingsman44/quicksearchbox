package com.google.android.libraries.assistant.auto.tng.p945f.p962d.p963a;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.assistant.auto.tng.f.d.a.h */
/* compiled from: PG */
public final class C13532h extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C13532h f41482d;

    /* renamed from: e */
    private static volatile C63010eb f41483e;

    /* renamed from: a */
    public int f41484a;

    /* renamed from: b */
    public C62971cq f41485b = C62942bv.emptyProtobufList();

    /* renamed from: c */
    public int f41486c;

    static {
        C13532h hVar = new C13532h();
        f41482d = hVar;
        C62942bv.registerDefaultInstance(C13532h.class, hVar);
    }

    private C13532h() {
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
                return newMessageInfo(f41482d, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001Ț\u0002င\u0000", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C13532h();
            case 4:
                return new C13531g();
            case 5:
                return f41482d;
            case 6:
                C63010eb ebVar = f41483e;
                if (ebVar == null) {
                    synchronized (C13532h.class) {
                        ebVar = f41483e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f41482d);
                            f41483e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
