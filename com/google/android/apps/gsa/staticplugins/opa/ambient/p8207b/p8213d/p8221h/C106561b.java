package com.google.android.apps.gsa.staticplugins.opa.ambient.p8207b.p8213d.p8221h;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.assistant.p4016z.C53738w;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.ambient.b.d.h.b */
/* compiled from: PG */
public final class C106561b extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C106561b f297135b;

    /* renamed from: e */
    private static volatile C63010eb f297136e;

    /* renamed from: a */
    public C53738w f297137a;

    /* renamed from: c */
    private int f297138c;

    /* renamed from: d */
    private byte f297139d = 2;

    static {
        C106561b bVar = new C106561b();
        f297135b = bVar;
        C62942bv.registerDefaultInstance(C106561b.class, bVar);
    }

    private C106561b() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f297139d);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f297139d = b;
                return null;
            case 2:
                return newMessageInfo(f297135b, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{C45240c.f118157a, "a"});
            case 3:
                return new C106561b();
            case 4:
                return new C106560a();
            case 5:
                return f297135b;
            case 6:
                C63010eb ebVar = f297136e;
                if (ebVar == null) {
                    synchronized (C106561b.class) {
                        ebVar = f297136e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f297135b);
                            f297136e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
