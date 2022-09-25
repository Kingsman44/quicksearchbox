package com.google.p4126az.p4127a.p4128a;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.az.a.a.b */
/* compiled from: PG */
public final class C54648b extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C54648b f143476a;

    /* renamed from: e */
    private static volatile C63010eb f143477e;

    /* renamed from: b */
    private int f143478b;

    /* renamed from: c */
    private int f143479c;

    /* renamed from: d */
    private byte f143480d = 2;

    static {
        C54648b bVar = new C54648b();
        f143476a = bVar;
        C62942bv.registerDefaultInstance(C54648b.class, bVar);
    }

    private C54648b() {
        emptyProtobufList();
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f143480d);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f143480d = b;
                return null;
            case 2:
                return newMessageInfo(f143476a, "\u0001\u0001\u0000\u0001\u0002\u0002\u0001\u0000\u0000\u0001\u0002ᔄ\u0000", new Object[]{"b", C45240c.f118157a});
            case 3:
                return new C54648b();
            case 4:
                return new C54647a();
            case 5:
                return f143476a;
            case 6:
                C63010eb ebVar = f143477e;
                if (ebVar == null) {
                    synchronized (C54648b.class) {
                        ebVar = f143477e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f143476a);
                            f143477e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
