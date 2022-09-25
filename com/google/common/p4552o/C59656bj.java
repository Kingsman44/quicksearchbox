package com.google.common.p4552o;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.common.o.bj */
/* compiled from: PG */
public final class C59656bj extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C59656bj f159967d;

    /* renamed from: e */
    private static volatile C63010eb f159968e;

    /* renamed from: a */
    public int f159969a;

    /* renamed from: b */
    public aac f159970b;

    /* renamed from: c */
    public adm f159971c;

    static {
        C59656bj bjVar = new C59656bj();
        f159967d = bjVar;
        C62942bv.registerDefaultInstance(C59656bj.class, bjVar);
    }

    private C59656bj() {
        C62942bv.emptyProtobufList();
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
                return newMessageInfo(f159967d, "\u0001\u0002\u0000\u0001\u0006\u000b\u0002\u0000\u0000\u0000\u0006ဉ\u0005\u000bဉ\t", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C59656bj();
            case 4:
                return new C59655bi();
            case 5:
                return f159967d;
            case 6:
                C63010eb ebVar = f159968e;
                if (ebVar == null) {
                    synchronized (C59656bj.class) {
                        ebVar = f159968e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f159967d);
                            f159968e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
