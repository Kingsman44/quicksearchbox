package com.google.android.apps.gsa.opa.smartspace.p6455d;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.opa.smartspace.d.x */
/* compiled from: PG */
public final class C83781x extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C83781x f228356c;

    /* renamed from: d */
    private static volatile C63010eb f228357d;

    /* renamed from: a */
    public C62971cq f228358a = emptyProtobufList();

    /* renamed from: b */
    public C62971cq f228359b = emptyProtobufList();

    static {
        C83781x xVar = new C83781x();
        f228356c = xVar;
        C62942bv.registerDefaultInstance(C83781x.class, xVar);
    }

    private C83781x() {
    }

    /* renamed from: a */
    public final void mo77099a() {
        C62971cq cqVar = this.f228358a;
        if (!cqVar.mo58948c()) {
            this.f228358a = C62942bv.mutableCopy(cqVar);
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
                return newMessageInfo(f228356c, "\u0001\u0002\u0000\u0000\u0003\u0004\u0002\u0000\u0002\u0000\u0003\u001b\u0004\u001b", new Object[]{"a", C83778u.class, "b", C83780w.class});
            case 3:
                return new C83781x();
            case 4:
                return new C83774q();
            case 5:
                return f228356c;
            case 6:
                C63010eb ebVar = f228357d;
                if (ebVar == null) {
                    synchronized (C83781x.class) {
                        ebVar = f228357d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f228356c);
                            f228357d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
