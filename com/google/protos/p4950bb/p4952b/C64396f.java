package com.google.protos.p4950bb.p4952b;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.p4176bh.p4177a.C55767b;
import com.google.p4176bh.p4177a.C55773h;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.protos.bb.b.f */
/* compiled from: PG */
public final class C64396f extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C64396f f174652a;

    /* renamed from: g */
    private static volatile C63010eb f174653g;

    /* renamed from: b */
    private int f174654b;

    /* renamed from: c */
    private C64394d f174655c;

    /* renamed from: d */
    private C55773h f174656d;

    /* renamed from: e */
    private C55767b f174657e;

    /* renamed from: f */
    private byte f174658f = 2;

    static {
        C64396f fVar = new C64396f();
        f174652a = fVar;
        C62942bv.registerDefaultInstance(C64396f.class, fVar);
    }

    private C64396f() {
        emptyProtobufList();
        C62942bv.emptyProtobufList();
        emptyProtobufList();
        C62942bv.emptyProtobufList();
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f174658f);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f174658f = b;
                return null;
            case 2:
                return newMessageInfo(f174652a, "\u0001\u0003\u0000\u0001\u0001\u0011\u0003\u0000\u0000\u0003\u0001ᐉ\u0001\u0003ᐉ\u0003\u0011ᐉ\u0000", new Object[]{"b", "d", "e", C45240c.f118157a});
            case 3:
                return new C64396f();
            case 4:
                return new C64395e();
            case 5:
                return f174652a;
            case 6:
                C63010eb ebVar = f174653g;
                if (ebVar == null) {
                    synchronized (C64396f.class) {
                        ebVar = f174653g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f174652a);
                            f174653g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
