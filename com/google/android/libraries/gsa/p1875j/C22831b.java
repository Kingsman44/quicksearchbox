package com.google.android.libraries.gsa.p1875j;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.gsa.j.b */
/* compiled from: PG */
public final class C22831b extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C22831b f62860b;

    /* renamed from: c */
    private static volatile C63010eb f62861c;

    /* renamed from: a */
    public C62971cq f62862a = emptyProtobufList();

    static {
        C22831b bVar = new C22831b();
        f62860b = bVar;
        C62942bv.registerDefaultInstance(C22831b.class, bVar);
    }

    private C22831b() {
    }

    /* renamed from: a */
    public final void mo28197a() {
        C62971cq cqVar = this.f62862a;
        if (!cqVar.mo58948c()) {
            this.f62862a = C62942bv.mutableCopy(cqVar);
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
                return newMessageInfo(f62860b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"a", C22845p.class});
            case 3:
                return new C22831b();
            case 4:
                return new C22830a();
            case 5:
                return f62860b;
            case 6:
                C63010eb ebVar = f62861c;
                if (ebVar == null) {
                    synchronized (C22831b.class) {
                        ebVar = f62861c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f62860b);
                            f62861c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
