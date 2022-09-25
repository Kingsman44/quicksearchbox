package com.google.protos.p4985f.p4986a;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.protos.f.a.ag */
/* compiled from: PG */
public final class C64653ag extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C64653ag f175248e;

    /* renamed from: f */
    private static volatile C63010eb f175249f;

    /* renamed from: a */
    public int f175250a;

    /* renamed from: b */
    public int f175251b;

    /* renamed from: c */
    public double f175252c;

    /* renamed from: d */
    public int f175253d;

    static {
        C64653ag agVar = new C64653ag();
        f175248e = agVar;
        C62942bv.registerDefaultInstance(C64653ag.class, agVar);
    }

    private C64653ag() {
        emptyProtobufList();
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
                return newMessageInfo(f175248e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဌ\u0000\u0002က\u0001\u0003င\u0002", new Object[]{"a", "b", C64690bq.f175352a, C45240c.f118157a, "d"});
            case 3:
                return new C64653ag();
            case 4:
                return new C64652af();
            case 5:
                return f175248e;
            case 6:
                C63010eb ebVar = f175249f;
                if (ebVar == null) {
                    synchronized (C64653ag.class) {
                        ebVar = f175249f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f175248e);
                            f175249f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
