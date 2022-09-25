package com.google.p5238v.p5239a.p5255j;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.v.a.j.j */
/* compiled from: PG */
public final class C67770j extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C67770j f183863c;

    /* renamed from: d */
    private static volatile C63010eb f183864d;

    /* renamed from: a */
    public C67780t f183865a;

    /* renamed from: b */
    public C67705ch f183866b;

    static {
        C67770j jVar = new C67770j();
        f183863c = jVar;
        C62942bv.registerDefaultInstance(C67770j.class, jVar);
    }

    private C67770j() {
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
                return newMessageInfo(f183863c, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\t\u0002\t", new Object[]{"a", "b"});
            case 3:
                return new C67770j();
            case 4:
                return new C67769i();
            case 5:
                return f183863c;
            case 6:
                C63010eb ebVar = f183864d;
                if (ebVar == null) {
                    synchronized (C67770j.class) {
                        ebVar = f183864d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f183863c);
                            f183864d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
