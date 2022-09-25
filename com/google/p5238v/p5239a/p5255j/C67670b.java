package com.google.p5238v.p5239a.p5255j;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63088z;

/* renamed from: com.google.v.a.j.b */
/* compiled from: PG */
public final class C67670b extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C67670b f183635d;

    /* renamed from: e */
    private static volatile C63010eb f183636e;

    /* renamed from: a */
    public int f183637a;

    /* renamed from: b */
    public C63088z f183638b = C63088z.f170246b;

    /* renamed from: c */
    public C67766f f183639c;

    static {
        C67670b bVar = new C67670b();
        f183635d = bVar;
        C62942bv.registerDefaultInstance(C67670b.class, bVar);
    }

    private C67670b() {
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
                return newMessageInfo(f183635d, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002\n\u0003\t", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C67670b();
            case 4:
                return new C67643a();
            case 5:
                return f183635d;
            case 6:
                C63010eb ebVar = f183636e;
                if (ebVar == null) {
                    synchronized (C67670b.class) {
                        ebVar = f183636e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f183635d);
                            f183636e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
