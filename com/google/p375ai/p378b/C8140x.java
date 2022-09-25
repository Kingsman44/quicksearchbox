package com.google.p375ai.p378b;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.ai.b.x */
/* compiled from: PG */
public final class C8140x extends C62942bv implements C63001dt {

    /* renamed from: f */
    public static final C8140x f28619f;

    /* renamed from: h */
    private static volatile C63010eb f28620h;

    /* renamed from: a */
    public int f28621a;

    /* renamed from: b */
    public C62971cq f28622b = emptyProtobufList();

    /* renamed from: c */
    public C7838lv f28623c;

    /* renamed from: d */
    public C8194z f28624d;

    /* renamed from: e */
    public C8194z f28625e;

    /* renamed from: g */
    private byte f28626g = 2;

    static {
        C8140x xVar = new C8140x();
        f28619f = xVar;
        C62942bv.registerDefaultInstance(C8140x.class, xVar);
    }

    private C8140x() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f28626g);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f28626g = b;
                return null;
            case 2:
                return newMessageInfo(f28619f, "\u0001\u0004\u0000\u0001\u0001\u0007\u0004\u0000\u0001\u0002\u0001\u001b\u0002ဉ\u0001\u0006ᐉ\u0002\u0007ᐉ\u0003", new Object[]{"a", "b", C7818lb.class, C45240c.f118157a, "d", "e"});
            case 3:
                return new C8140x();
            case 4:
                return new C8113w();
            case 5:
                return f28619f;
            case 6:
                C63010eb ebVar = f28620h;
                if (ebVar == null) {
                    synchronized (C8140x.class) {
                        ebVar = f28620h;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f28619f);
                            f28620h = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
