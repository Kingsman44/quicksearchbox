package com.google.p4242bp.p4257f.p4262c.p4263a;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.bp.f.c.a.d */
/* compiled from: PG */
public final class C56333d extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C56333d f150154d;

    /* renamed from: e */
    private static volatile C63010eb f150155e;

    /* renamed from: a */
    public int f150156a;

    /* renamed from: b */
    public C56331b f150157b;

    /* renamed from: c */
    public C56331b f150158c;

    static {
        C56333d dVar = new C56333d();
        f150154d = dVar;
        C62942bv.registerDefaultInstance(C56333d.class, dVar);
    }

    private C56333d() {
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
                return newMessageInfo(f150154d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C56333d();
            case 4:
                return new C56332c();
            case 5:
                return f150154d;
            case 6:
                C63010eb ebVar = f150155e;
                if (ebVar == null) {
                    synchronized (C56333d.class) {
                        ebVar = f150155e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f150154d);
                            f150155e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
