package com.google.android.apps.gsa.sidekick.shared.p7238g;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.p375ai.p378b.C7718hj;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.sidekick.shared.g.f */
/* compiled from: PG */
public final class C91736f extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C91736f f255855d;

    /* renamed from: f */
    private static volatile C63010eb f255856f;

    /* renamed from: a */
    public int f255857a;

    /* renamed from: b */
    public C7718hj f255858b;

    /* renamed from: c */
    public C7718hj f255859c;

    /* renamed from: e */
    private byte f255860e = 2;

    static {
        C91736f fVar = new C91736f();
        f255855d = fVar;
        C62942bv.registerDefaultInstance(C91736f.class, fVar);
    }

    private C91736f() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f255860e);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f255860e = b;
                return null;
            case 2:
                return newMessageInfo(f255855d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0002\u0001ᐉ\u0000\u0002ᐉ\u0001", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C91736f();
            case 4:
                return new C91735e();
            case 5:
                return f255855d;
            case 6:
                C63010eb ebVar = f255856f;
                if (ebVar == null) {
                    synchronized (C91736f.class) {
                        ebVar = f255856f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f255855d);
                            f255856f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
