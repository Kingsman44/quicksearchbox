package com.google.android.libraries.micore.learning.p2258a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.micore.learning.a.r */
/* compiled from: PG */
public final class C29708r extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C29708r f80465b;

    /* renamed from: c */
    private static volatile C63010eb f80466c;

    /* renamed from: a */
    public C62971cq f80467a = emptyProtobufList();

    static {
        C29708r rVar = new C29708r();
        f80465b = rVar;
        C62942bv.registerDefaultInstance(C29708r.class, rVar);
    }

    private C29708r() {
    }

    /* renamed from: a */
    public final void mo34849a() {
        C62971cq cqVar = this.f80467a;
        if (!cqVar.mo58948c()) {
            this.f80467a = C62942bv.mutableCopy(cqVar);
        }
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
                return newMessageInfo(f80465b, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"a", C29706p.class});
            case 3:
                return new C29708r();
            case 4:
                return new C29707q();
            case 5:
                return f80465b;
            case 6:
                C63010eb ebVar = f80466c;
                if (ebVar == null) {
                    synchronized (C29708r.class) {
                        ebVar = f80466c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f80465b);
                            f80466c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
