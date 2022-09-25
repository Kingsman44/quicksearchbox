package com.google.p395al.p396a.p397a;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.al.a.a.d */
/* compiled from: PG */
public final class C8414d extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C8414d f29268a;

    /* renamed from: e */
    private static volatile C63010eb f29269e;

    /* renamed from: b */
    private int f29270b;

    /* renamed from: c */
    private C8413c f29271c;

    /* renamed from: d */
    private byte f29272d = 2;

    static {
        C8414d dVar = new C8414d();
        f29268a = dVar;
        C62942bv.registerDefaultInstance(C8414d.class, dVar);
    }

    private C8414d() {
        emptyProtobufList();
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f29272d);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f29272d = b;
                return null;
            case 2:
                return newMessageInfo(f29268a, "\u0001\u0001\u0000\u0001\u0004\u0004\u0001\u0000\u0000\u0001\u0004ᐉ\u0001", new Object[]{"b", C45240c.f118157a});
            case 3:
                return new C8414d();
            case 4:
                return new C8411a();
            case 5:
                return f29268a;
            case 6:
                C63010eb ebVar = f29269e;
                if (ebVar == null) {
                    synchronized (C8414d.class) {
                        ebVar = f29269e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f29268a);
                            f29269e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
