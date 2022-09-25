package com.google.android.apps.search.googleapp.discover.p10214s;

import com.google.p4283bv.p4380j.p4385b.p4386a.p4392b.p4396b.p4399b.C57711j;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.search.googleapp.discover.s.ao */
/* compiled from: PG */
public final class C134550ao extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C134550ao f366417b;

    /* renamed from: c */
    private static volatile C63010eb f366418c;

    /* renamed from: a */
    public C62971cq f366419a = emptyProtobufList();

    static {
        C134550ao aoVar = new C134550ao();
        f366417b = aoVar;
        C62942bv.registerDefaultInstance(C134550ao.class, aoVar);
    }

    private C134550ao() {
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
                return newMessageInfo(f366417b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"a", C57711j.class});
            case 3:
                return new C134550ao();
            case 4:
                return new C134549an();
            case 5:
                return f366417b;
            case 6:
                C63010eb ebVar = f366418c;
                if (ebVar == null) {
                    synchronized (C134550ao.class) {
                        ebVar = f366418c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f366417b);
                            f366418c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
