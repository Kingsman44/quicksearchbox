package com.google.p4283bv.p4284a.p4285a;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.bv.a.a.b */
/* compiled from: PG */
public final class C56602b extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C56602b f151119a;

    /* renamed from: e */
    private static volatile C63010eb f151120e;

    /* renamed from: b */
    private int f151121b;

    /* renamed from: c */
    private C56606f f151122c;

    /* renamed from: d */
    private byte f151123d = 2;

    static {
        C56602b bVar = new C56602b();
        f151119a = bVar;
        C62942bv.registerDefaultInstance(C56602b.class, bVar);
    }

    private C56602b() {
        emptyProtobufList();
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f151123d);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f151123d = b;
                return null;
            case 2:
                return newMessageInfo(f151119a, "\u0001\u0001\u0000\u0001\u0002\u0002\u0001\u0000\u0000\u0001\u0002ᐉ\u0000", new Object[]{"b", C45240c.f118157a});
            case 3:
                return new C56602b();
            case 4:
                return new C56601a();
            case 5:
                return f151119a;
            case 6:
                C63010eb ebVar = f151120e;
                if (ebVar == null) {
                    synchronized (C56602b.class) {
                        ebVar = f151120e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f151119a);
                            f151120e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
