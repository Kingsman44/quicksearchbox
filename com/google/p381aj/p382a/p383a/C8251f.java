package com.google.p381aj.p382a.p383a;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.p381aj.p382a.p383a.p384a.C8242v;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.aj.a.a.f */
/* compiled from: PG */
public final class C8251f extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C8251f f28980a;

    /* renamed from: g */
    private static volatile C63010eb f28981g;

    /* renamed from: b */
    private int f28982b;

    /* renamed from: c */
    private C8242v f28983c;

    /* renamed from: d */
    private C8242v f28984d;

    /* renamed from: e */
    private C8242v f28985e;

    /* renamed from: f */
    private byte f28986f = 2;

    static {
        C8251f fVar = new C8251f();
        f28980a = fVar;
        C62942bv.registerDefaultInstance(C8251f.class, fVar);
    }

    private C8251f() {
        emptyProtobufList();
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f28986f);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f28986f = b;
                return null;
            case 2:
                return newMessageInfo(f28980a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0003\u0001ᐉ\u0000\u0002ᐉ\u0001\u0003ᐉ\u0002", new Object[]{"b", C45240c.f118157a, "d", "e"});
            case 3:
                return new C8251f();
            case 4:
                return new C8250e();
            case 5:
                return f28980a;
            case 6:
                C63010eb ebVar = f28981g;
                if (ebVar == null) {
                    synchronized (C8251f.class) {
                        ebVar = f28981g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f28980a);
                            f28981g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
