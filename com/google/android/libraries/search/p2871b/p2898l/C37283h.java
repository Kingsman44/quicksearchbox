package com.google.android.libraries.search.p2871b.p2898l;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.search.b.l.h */
/* compiled from: PG */
public final class C37283h extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C37283h f99078b;

    /* renamed from: d */
    private static volatile C63010eb f99079d;

    /* renamed from: a */
    public C62971cq f99080a = emptyProtobufList();

    /* renamed from: c */
    private byte f99081c = 2;

    static {
        C37283h hVar = new C37283h();
        f99078b = hVar;
        C62942bv.registerDefaultInstance(C37283h.class, hVar);
    }

    private C37283h() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f99081c);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f99081c = b;
                return null;
            case 2:
                return newMessageInfo(f99078b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0001Л", new Object[]{"a", C37281f.class});
            case 3:
                return new C37283h();
            case 4:
                return new C37282g();
            case 5:
                return f99078b;
            case 6:
                C63010eb ebVar = f99079d;
                if (ebVar == null) {
                    synchronized (C37283h.class) {
                        ebVar = f99079d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f99078b);
                            f99079d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
