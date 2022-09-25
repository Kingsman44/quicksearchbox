package com.google.android.apps.p489g;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.p375ai.p378b.C7669fo;
import com.google.p375ai.p378b.C7973qv;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.g.d */
/* compiled from: PG */
public final class C9136d extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C9136d f31448d;

    /* renamed from: f */
    private static volatile C63010eb f31449f;

    /* renamed from: a */
    public int f31450a;

    /* renamed from: b */
    public C7669fo f31451b;

    /* renamed from: c */
    public C7973qv f31452c;

    /* renamed from: e */
    private byte f31453e = 2;

    static {
        C9136d dVar = new C9136d();
        f31448d = dVar;
        C62942bv.registerDefaultInstance(C9136d.class, dVar);
    }

    private C9136d() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f31453e);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f31453e = b;
                return null;
            case 2:
                return newMessageInfo(f31448d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0001\u0001ဉ\u0000\u0002ᐉ\u0001", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C9136d();
            case 4:
                return new C9127c();
            case 5:
                return f31448d;
            case 6:
                C63010eb ebVar = f31449f;
                if (ebVar == null) {
                    synchronized (C9136d.class) {
                        ebVar = f31449f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f31448d);
                            f31449f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
