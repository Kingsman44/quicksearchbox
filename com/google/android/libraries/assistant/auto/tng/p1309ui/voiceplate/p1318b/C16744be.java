package com.google.android.libraries.assistant.auto.tng.p1309ui.voiceplate.p1318b;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.assistant.auto.tng.ui.voiceplate.b.be */
/* compiled from: PG */
public final class C16744be extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C16744be f48963e;

    /* renamed from: g */
    private static volatile C63010eb f48964g;

    /* renamed from: a */
    public int f48965a;

    /* renamed from: b */
    public C16770t f48966b;

    /* renamed from: c */
    public boolean f48967c;

    /* renamed from: d */
    public C16748bi f48968d;

    /* renamed from: f */
    private byte f48969f = 2;

    static {
        C16744be beVar = new C16744be();
        f48963e = beVar;
        C62942bv.registerDefaultInstance(C16744be.class, beVar);
    }

    private C16744be() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f48969f);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f48969f = b;
                return null;
            case 2:
                return newMessageInfo(f48963e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0001\u0001ᐉ\u0000\u0002ဇ\u0001\u0003ဉ\u0002", new Object[]{"a", "b", C45240c.f118157a, "d"});
            case 3:
                return new C16744be();
            case 4:
                return new C16743bd();
            case 5:
                return f48963e;
            case 6:
                C63010eb ebVar = f48964g;
                if (ebVar == null) {
                    synchronized (C16744be.class) {
                        ebVar = f48964g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f48963e);
                            f48964g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
