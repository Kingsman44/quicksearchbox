package com.google.protos.p4985f.p4986a;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.protos.f.a.bs */
/* compiled from: PG */
public final class C64692bs extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C64692bs f175353d;

    /* renamed from: e */
    private static volatile C63010eb f175354e;

    /* renamed from: a */
    public int f175355a;

    /* renamed from: b */
    public C62971cq f175356b = emptyProtobufList();

    /* renamed from: c */
    public long f175357c;

    static {
        C64692bs bsVar = new C64692bs();
        f175353d = bsVar;
        C62942bv.registerDefaultInstance(C64692bs.class, bsVar);
    }

    private C64692bs() {
        emptyProtobufList();
    }

    /* renamed from: a */
    public final void mo59295a() {
        C62971cq cqVar = this.f175356b;
        if (!cqVar.mo58948c()) {
            this.f175356b = C62942bv.mutableCopy(cqVar);
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
                return newMessageInfo(f175353d, "\u0001\u0002\u0000\u0001\u0001\u0006\u0002\u0000\u0001\u0000\u0001\u001b\u0006ဂ\u0003", new Object[]{"a", "b", C64689bp.class, C45240c.f118157a});
            case 3:
                return new C64692bs();
            case 4:
                return new C64691br();
            case 5:
                return f175353d;
            case 6:
                C63010eb ebVar = f175354e;
                if (ebVar == null) {
                    synchronized (C64692bs.class) {
                        ebVar = f175354e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f175353d);
                            f175354e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
