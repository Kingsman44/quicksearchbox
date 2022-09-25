package com.google.android.gms.auth.p10743b.p10744a;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.gms.auth.b.a.n */
/* compiled from: PG */
public final class C142900n extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C142900n f387729d;

    /* renamed from: f */
    private static volatile C63010eb f387730f;

    /* renamed from: a */
    public int f387731a;

    /* renamed from: b */
    public C62971cq f387732b = emptyProtobufList();

    /* renamed from: c */
    public C62971cq f387733c;

    /* renamed from: e */
    private int f387734e;

    static {
        C142900n nVar = new C142900n();
        f387729d = nVar;
        C62942bv.registerDefaultInstance(C142900n.class, nVar);
    }

    private C142900n() {
        emptyProtobufList();
        this.f387733c = emptyProtobufList();
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
                return newMessageInfo(f387729d, "\u0001\u0003\u0000\u0001\u0001\u0004\u0003\u0000\u0002\u0000\u0001ဌ\u0000\u0002\u001b\u0004\u001b", new Object[]{"e", "a", C142898l.f387728a, "b", C142890d.class, C45240c.f118157a, C142897k.class});
            case 3:
                return new C142900n();
            case 4:
                return new C142893g();
            case 5:
                return f387729d;
            case 6:
                C63010eb ebVar = f387730f;
                if (ebVar == null) {
                    synchronized (C142900n.class) {
                        ebVar = f387730f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f387729d);
                            f387730f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
