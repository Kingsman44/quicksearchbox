package com.google.protos.p4953bc.p4955b;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.protos.bc.b.b */
/* compiled from: PG */
public final class C64432b extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C64432b f174790a;

    /* renamed from: e */
    private static volatile C63010eb f174791e;

    /* renamed from: b */
    private int f174792b;

    /* renamed from: c */
    private C64434d f174793c;

    /* renamed from: d */
    private byte f174794d = 2;

    static {
        C64432b bVar = new C64432b();
        f174790a = bVar;
        C62942bv.registerDefaultInstance(C64432b.class, bVar);
    }

    private C64432b() {
        C62942bv.emptyProtobufList();
        emptyProtobufList();
        emptyProtobufList();
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f174794d);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f174794d = b;
                return null;
            case 2:
                return newMessageInfo(f174790a, "\u0001\u0001\u0000\u0001\u0003\u0003\u0001\u0000\u0000\u0001\u0003ᔉ\u0002", new Object[]{"b", C45240c.f118157a});
            case 3:
                return new C64432b();
            case 4:
                return new C64409a();
            case 5:
                return f174790a;
            case 6:
                C63010eb ebVar = f174791e;
                if (ebVar == null) {
                    synchronized (C64432b.class) {
                        ebVar = f174791e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f174790a);
                            f174791e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
