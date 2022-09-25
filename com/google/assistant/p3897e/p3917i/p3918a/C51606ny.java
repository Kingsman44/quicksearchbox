package com.google.assistant.p3897e.p3917i.p3918a;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.e.i.a.ny */
/* compiled from: PG */
public final class C51606ny extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C51606ny f134497d;

    /* renamed from: e */
    private static volatile C63010eb f134498e;

    /* renamed from: a */
    public int f134499a;

    /* renamed from: b */
    public C62971cq f134500b = emptyProtobufList();

    /* renamed from: c */
    public int f134501c;

    static {
        C51606ny nyVar = new C51606ny();
        f134497d = nyVar;
        C62942bv.registerDefaultInstance(C51606ny.class, nyVar);
    }

    private C51606ny() {
    }

    /* renamed from: a */
    public final void mo53662a() {
        C62971cq cqVar = this.f134500b;
        if (!cqVar.mo58948c()) {
            this.f134500b = C62942bv.mutableCopy(cqVar);
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
                return newMessageInfo(f134497d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001b\u0002ဌ\u0000", new Object[]{"a", "b", C51602nu.class, C45240c.f118157a, C51605nx.m86247b()});
            case 3:
                return new C51606ny();
            case 4:
                return new C51603nv();
            case 5:
                return f134497d;
            case 6:
                C63010eb ebVar = f134498e;
                if (ebVar == null) {
                    synchronized (C51606ny.class) {
                        ebVar = f134498e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f134497d);
                            f134498e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
