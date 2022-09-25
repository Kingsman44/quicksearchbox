package com.google.android.apps.gsa.opa.p6443g.p6445b;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.opa.g.b.j */
/* compiled from: PG */
public final class C83691j extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C83691j f228128b;

    /* renamed from: d */
    private static volatile C63010eb f228129d;

    /* renamed from: a */
    public C62971cq f228130a = emptyProtobufList();

    /* renamed from: c */
    private byte f228131c = 2;

    static {
        C83691j jVar = new C83691j();
        f228128b = jVar;
        C62942bv.registerDefaultInstance(C83691j.class, jVar);
    }

    private C83691j() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f228131c);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f228131c = b;
                return null;
            case 2:
                return newMessageInfo(f228128b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0001Л", new Object[]{"a", C83689h.class});
            case 3:
                return new C83691j();
            case 4:
                return new C83690i();
            case 5:
                return f228128b;
            case 6:
                C63010eb ebVar = f228129d;
                if (ebVar == null) {
                    synchronized (C83691j.class) {
                        ebVar = f228129d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f228128b);
                            f228129d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
