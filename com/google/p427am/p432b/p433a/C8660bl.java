package com.google.p427am.p432b.p433a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.am.b.a.bl */
/* compiled from: PG */
public final class C8660bl extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C8660bl f29961c;

    /* renamed from: d */
    private static volatile C63010eb f29962d;

    /* renamed from: a */
    public C8680j f29963a;

    /* renamed from: b */
    public C62971cq f29964b = emptyProtobufList();

    static {
        C8660bl blVar = new C8660bl();
        f29961c = blVar;
        C62942bv.registerDefaultInstance(C8660bl.class, blVar);
    }

    private C8660bl() {
    }

    /* renamed from: a */
    public final void mo17210a() {
        C62971cq cqVar = this.f29964b;
        if (!cqVar.mo58948c()) {
            this.f29964b = C62942bv.mutableCopy(cqVar);
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
                return newMessageInfo(f29961c, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\t\u0002\u001b", new Object[]{"a", "b", C8675e.class});
            case 3:
                return new C8660bl();
            case 4:
                return new C8659bk();
            case 5:
                return f29961c;
            case 6:
                C63010eb ebVar = f29962d;
                if (ebVar == null) {
                    synchronized (C8660bl.class) {
                        ebVar = f29962d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f29961c);
                            f29962d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
