package com.google.p4691l.p4692a.p4693a;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.knowledge.p4682d.C61998i;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.l.a.a.d */
/* compiled from: PG */
public final class C62016d extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C62016d f167577a;

    /* renamed from: e */
    private static volatile C63010eb f167578e;

    /* renamed from: b */
    private int f167579b;

    /* renamed from: c */
    private C61998i f167580c;

    /* renamed from: d */
    private byte f167581d = 2;

    static {
        C62016d dVar = new C62016d();
        f167577a = dVar;
        C62942bv.registerDefaultInstance(C62016d.class, dVar);
    }

    private C62016d() {
        emptyIntList();
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f167581d);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f167581d = b;
                return null;
            case 2:
                return newMessageInfo(f167577a, "\u0001\u0001\u0000\u0001\u0006\u0006\u0001\u0000\u0000\u0001\u0006ᐉ\u0003", new Object[]{"b", C45240c.f118157a});
            case 3:
                return new C62016d();
            case 4:
                return new C62015c();
            case 5:
                return f167577a;
            case 6:
                C63010eb ebVar = f167578e;
                if (ebVar == null) {
                    synchronized (C62016d.class) {
                        ebVar = f167578e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f167577a);
                            f167578e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
