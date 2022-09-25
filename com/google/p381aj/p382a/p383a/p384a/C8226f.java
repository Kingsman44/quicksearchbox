package com.google.p381aj.p382a.p383a.p384a;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.aj.a.a.a.f */
/* compiled from: PG */
public final class C8226f extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C8226f f28880a;

    /* renamed from: g */
    private static volatile C63010eb f28881g;

    /* renamed from: b */
    private int f28882b;

    /* renamed from: c */
    private int f28883c;

    /* renamed from: d */
    private C8242v f28884d;

    /* renamed from: e */
    private C8242v f28885e;

    /* renamed from: f */
    private byte f28886f = 2;

    static {
        C8226f fVar = new C8226f();
        f28880a = fVar;
        C62942bv.registerDefaultInstance(C8226f.class, fVar);
    }

    private C8226f() {
        emptyProtobufList();
        emptyProtobufList();
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f28886f);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f28886f = b;
                return null;
            case 2:
                return newMessageInfo(f28880a, "\u0001\u0003\u0000\u0001\u0001\u0004\u0003\u0000\u0000\u0003\u0001ᔄ\u0000\u0003ᐉ\u0002\u0004ᐉ\u0003", new Object[]{"b", C45240c.f118157a, "d", "e"});
            case 3:
                return new C8226f();
            case 4:
                return new C8225e();
            case 5:
                return f28880a;
            case 6:
                C63010eb ebVar = f28881g;
                if (ebVar == null) {
                    synchronized (C8226f.class) {
                        ebVar = f28881g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f28880a);
                            f28881g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
