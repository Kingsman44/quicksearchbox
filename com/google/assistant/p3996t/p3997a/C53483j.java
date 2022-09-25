package com.google.assistant.p3996t.p3997a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.t.a.j */
/* compiled from: PG */
public final class C53483j extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C53483j f140361b;

    /* renamed from: c */
    private static volatile C63010eb f140362c;

    /* renamed from: a */
    public C62971cq f140363a = emptyProtobufList();

    static {
        C53483j jVar = new C53483j();
        f140361b = jVar;
        C62942bv.registerDefaultInstance(C53483j.class, jVar);
    }

    private C53483j() {
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
                return newMessageInfo(f140361b, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"a", C53485l.class});
            case 3:
                return new C53483j();
            case 4:
                return new C53482i();
            case 5:
                return f140361b;
            case 6:
                C63010eb ebVar = f140362c;
                if (ebVar == null) {
                    synchronized (C53483j.class) {
                        ebVar = f140362c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f140361b);
                            f140362c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
