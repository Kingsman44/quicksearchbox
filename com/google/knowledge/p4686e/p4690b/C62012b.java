package com.google.knowledge.p4686e.p4690b;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.p381aj.p382a.p383a.p384a.C8242v;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.knowledge.e.b.b */
/* compiled from: PG */
public final class C62012b extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C62012b f167567a;

    /* renamed from: e */
    private static volatile C63010eb f167568e;

    /* renamed from: b */
    private int f167569b;

    /* renamed from: c */
    private C8242v f167570c;

    /* renamed from: d */
    private byte f167571d = 2;

    static {
        C62012b bVar = new C62012b();
        f167567a = bVar;
        C62942bv.registerDefaultInstance(C62012b.class, bVar);
    }

    private C62012b() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f167571d);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f167571d = b;
                return null;
            case 2:
                return newMessageInfo(f167567a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001ᐉ\u0000", new Object[]{"b", C45240c.f118157a});
            case 3:
                return new C62012b();
            case 4:
                return new C62011a();
            case 5:
                return f167567a;
            case 6:
                C63010eb ebVar = f167568e;
                if (ebVar == null) {
                    synchronized (C62012b.class) {
                        ebVar = f167568e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f167567a);
                            f167568e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
