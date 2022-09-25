package com.google.p381aj.p382a.p383a.p384a;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.aj.a.a.a.j */
/* compiled from: PG */
public final class C8230j extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C8230j f28892a;

    /* renamed from: e */
    private static volatile C63010eb f28893e;

    /* renamed from: b */
    private int f28894b;

    /* renamed from: c */
    private C8232l f28895c;

    /* renamed from: d */
    private byte f28896d = 2;

    static {
        C8230j jVar = new C8230j();
        f28892a = jVar;
        C62942bv.registerDefaultInstance(C8230j.class, jVar);
    }

    private C8230j() {
        emptyProtobufList();
        emptyProtobufList();
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f28896d);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f28896d = b;
                return null;
            case 2:
                return newMessageInfo(f28892a, "\u0001\u0001\u0000\u0001\u0004\u0004\u0001\u0000\u0000\u0001\u0004ᐉ\u0003", new Object[]{"b", C45240c.f118157a});
            case 3:
                return new C8230j();
            case 4:
                return new C8229i();
            case 5:
                return f28892a;
            case 6:
                C63010eb ebVar = f28893e;
                if (ebVar == null) {
                    synchronized (C8230j.class) {
                        ebVar = f28893e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f28892a);
                            f28893e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
