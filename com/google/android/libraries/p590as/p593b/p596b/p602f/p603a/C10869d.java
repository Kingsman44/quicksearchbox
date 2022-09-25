package com.google.android.libraries.p590as.p593b.p596b.p602f.p603a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.as.b.b.f.a.d */
/* compiled from: PG */
public final class C10869d extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C10869d f35934b;

    /* renamed from: c */
    private static volatile C63010eb f35935c;

    /* renamed from: a */
    public C62971cq f35936a = emptyProtobufList();

    static {
        C10869d dVar = new C10869d();
        f35934b = dVar;
        C62942bv.registerDefaultInstance(C10869d.class, dVar);
    }

    private C10869d() {
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
                return newMessageInfo(f35934b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"a", C10871f.class});
            case 3:
                return new C10869d();
            case 4:
                return new C10868c();
            case 5:
                return f35934b;
            case 6:
                C63010eb ebVar = f35935c;
                if (ebVar == null) {
                    synchronized (C10869d.class) {
                        ebVar = f35935c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f35934b);
                            f35935c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
