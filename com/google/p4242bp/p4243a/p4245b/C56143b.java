package com.google.p4242bp.p4243a.p4245b;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.p4152bb.p4153a.C54946ad;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.bp.a.b.b */
/* compiled from: PG */
public final class C56143b extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C56143b f149574d;

    /* renamed from: f */
    private static volatile C63010eb f149575f;

    /* renamed from: a */
    public int f149576a;

    /* renamed from: b */
    public C54946ad f149577b;

    /* renamed from: c */
    public int f149578c;

    /* renamed from: e */
    private byte f149579e = 2;

    static {
        C56143b bVar = new C56143b();
        f149574d = bVar;
        C62942bv.registerDefaultInstance(C56143b.class, bVar);
    }

    private C56143b() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f149579e);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f149579e = b;
                return null;
            case 2:
                return newMessageInfo(f149574d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0001\u0001ᐉ\u0000\u0002ဌ\u0001", new Object[]{"a", "b", C45240c.f118157a, C56149h.f149610a});
            case 3:
                return new C56143b();
            case 4:
                return new C56142a();
            case 5:
                return f149574d;
            case 6:
                C63010eb ebVar = f149575f;
                if (ebVar == null) {
                    synchronized (C56143b.class) {
                        ebVar = f149575f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f149574d);
                            f149575f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
