package com.google.p395al.p417d.p418a;

import com.google.p395al.p398b.p399a.p400a.C8419c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.al.d.a.ao */
/* compiled from: PG */
public final class C8535ao extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C8535ao f29615c;

    /* renamed from: d */
    private static volatile C63010eb f29616d;

    /* renamed from: a */
    public int f29617a;

    /* renamed from: b */
    public C8419c f29618b;

    static {
        C8535ao aoVar = new C8535ao();
        f29615c = aoVar;
        C62942bv.registerDefaultInstance(C8535ao.class, aoVar);
    }

    private C8535ao() {
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
                return newMessageInfo(f29615c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"a", "b"});
            case 3:
                return new C8535ao();
            case 4:
                return new C8534an();
            case 5:
                return f29615c;
            case 6:
                C63010eb ebVar = f29616d;
                if (ebVar == null) {
                    synchronized (C8535ao.class) {
                        ebVar = f29616d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f29615c);
                            f29616d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
