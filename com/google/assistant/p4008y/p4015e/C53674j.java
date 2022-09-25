package com.google.assistant.p4008y.p4015e;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.assistant.p3897e.p3921j.C52081en;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.y.e.j */
/* compiled from: PG */
public final class C53674j extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C53674j f140884b;

    /* renamed from: e */
    private static volatile C63010eb f140885e;

    /* renamed from: a */
    public C62971cq f140886a = emptyProtobufList();

    /* renamed from: c */
    private int f140887c;

    /* renamed from: d */
    private C52081en f140888d;

    static {
        C53674j jVar = new C53674j();
        f140884b = jVar;
        C62942bv.registerDefaultInstance(C53674j.class, jVar);
    }

    private C53674j() {
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
                return newMessageInfo(f140884b, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001ဉ\u0000\u0002\u001b", new Object[]{C45240c.f118157a, "d", "a", C53672h.class});
            case 3:
                return new C53674j();
            case 4:
                return new C53673i();
            case 5:
                return f140884b;
            case 6:
                C63010eb ebVar = f140885e;
                if (ebVar == null) {
                    synchronized (C53674j.class) {
                        ebVar = f140885e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f140884b);
                            f140885e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
