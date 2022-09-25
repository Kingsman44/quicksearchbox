package com.google.android.apps.p489g.p494d;

import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.g.d.av */
/* compiled from: PG */
public final class C9159av extends C62942bv implements C63001dt {

    /* renamed from: g */
    public static final C9159av f31613g;

    /* renamed from: i */
    private static volatile C63010eb f31614i;

    /* renamed from: a */
    public int f31615a;

    /* renamed from: b */
    public C62971cq f31616b = emptyProtobufList();

    /* renamed from: c */
    public int f31617c;

    /* renamed from: d */
    public int f31618d;

    /* renamed from: e */
    public boolean f31619e;

    /* renamed from: f */
    public boolean f31620f;

    /* renamed from: h */
    private byte f31621h = 2;

    static {
        C9159av avVar = new C9159av();
        f31613g = avVar;
        C62942bv.registerDefaultInstance(C9159av.class, avVar);
    }

    private C9159av() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f31621h);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f31621h = b;
                return null;
            case 2:
                return newMessageInfo(f31613g, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0001\u0001\u0001Л\u0002င\u0000\u0003င\u0001\u0004ဇ\u0002\u0005ဇ\u0003", new Object[]{"a", "b", C9278v.class, C45240c.f118157a, "d", "e", C10662f.f35572a});
            case 3:
                return new C9159av();
            case 4:
                return new C9158au();
            case 5:
                return f31613g;
            case 6:
                C63010eb ebVar = f31614i;
                if (ebVar == null) {
                    synchronized (C9159av.class) {
                        ebVar = f31614i;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f31613g);
                            f31614i = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
