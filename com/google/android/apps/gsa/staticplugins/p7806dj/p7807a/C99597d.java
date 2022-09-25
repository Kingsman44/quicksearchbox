package com.google.android.apps.gsa.staticplugins.p7806dj.p7807a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.staticplugins.dj.a.d */
/* compiled from: PG */
public final class C99597d extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C99597d f278723b;

    /* renamed from: c */
    private static volatile C63010eb f278724c;

    /* renamed from: a */
    public C62971cq f278725a = emptyProtobufList();

    static {
        C99597d dVar = new C99597d();
        f278723b = dVar;
        C62942bv.registerDefaultInstance(C99597d.class, dVar);
    }

    private C99597d() {
    }

    /* renamed from: a */
    public final void mo91498a() {
        C62971cq cqVar = this.f278725a;
        if (!cqVar.mo58948c()) {
            this.f278725a = C62942bv.mutableCopy(cqVar);
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
                return newMessageInfo(f278723b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"a", C99596c.class});
            case 3:
                return new C99597d();
            case 4:
                return new C99594a();
            case 5:
                return f278723b;
            case 6:
                C63010eb ebVar = f278724c;
                if (ebVar == null) {
                    synchronized (C99597d.class) {
                        ebVar = f278724c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f278723b);
                            f278724c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
