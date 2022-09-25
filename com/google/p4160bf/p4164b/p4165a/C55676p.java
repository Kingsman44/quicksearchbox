package com.google.p4160bf.p4164b.p4165a;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.bf.b.a.p */
/* compiled from: PG */
public final class C55676p extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C55676p f146895d;

    /* renamed from: e */
    private static volatile C63010eb f146896e;

    /* renamed from: a */
    public int f146897a;

    /* renamed from: b */
    public C55657cm f146898b;

    /* renamed from: c */
    public C55653ci f146899c;

    static {
        C55676p pVar = new C55676p();
        f146895d = pVar;
        C62942bv.registerDefaultInstance(C55676p.class, pVar);
    }

    private C55676p() {
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
                return newMessageInfo(f146895d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C55676p();
            case 4:
                return new C55675o();
            case 5:
                return f146895d;
            case 6:
                C63010eb ebVar = f146896e;
                if (ebVar == null) {
                    synchronized (C55676p.class) {
                        ebVar = f146896e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f146895d);
                            f146896e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
