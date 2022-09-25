package com.google.common.p4552o;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.common.o.abh */
/* compiled from: PG */
public final class abh extends C62942bv implements C63001dt {

    /* renamed from: f */
    public static final abh f158201f;

    /* renamed from: g */
    private static volatile C63010eb f158202g;

    /* renamed from: a */
    public int f158203a;

    /* renamed from: b */
    public int f158204b;

    /* renamed from: c */
    public int f158205c;

    /* renamed from: d */
    public int f158206d;

    /* renamed from: e */
    public int f158207e;

    static {
        abh abh = new abh();
        f158201f = abh;
        C62942bv.registerDefaultInstance(abh.class, abh);
    }

    private abh() {
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
                return newMessageInfo(f158201f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001\u0003င\u0002\u0004င\u0003", new Object[]{"a", "b", C45240c.f118157a, "d", "e"});
            case 3:
                return new abh();
            case 4:
                return new abg();
            case 5:
                return f158201f;
            case 6:
                C63010eb ebVar = f158202g;
                if (ebVar == null) {
                    synchronized (abh.class) {
                        ebVar = f158202g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f158201f);
                            f158202g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
