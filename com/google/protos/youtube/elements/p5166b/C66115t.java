package com.google.protos.youtube.elements.p5166b;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.protos.youtube.elements.b.t */
/* compiled from: PG */
public final class C66115t extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C66115t f179793d;

    /* renamed from: f */
    private static volatile C63010eb f179794f;

    /* renamed from: a */
    public int f179795a;

    /* renamed from: b */
    public C62971cq f179796b = emptyProtobufList();

    /* renamed from: c */
    public C66103h f179797c;

    /* renamed from: e */
    private byte f179798e = 2;

    static {
        C66115t tVar = new C66115t();
        f179793d = tVar;
        C62942bv.registerDefaultInstance(C66115t.class, tVar);
    }

    private C66115t() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f179798e);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f179798e = b;
                return null;
            case 2:
                return newMessageInfo(f179793d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0001\u0001Л\u0002ဉ\u0000", new Object[]{"a", "b", C66113r.class, C45240c.f118157a});
            case 3:
                return new C66115t();
            case 4:
                return new C66114s();
            case 5:
                return f179793d;
            case 6:
                C63010eb ebVar = f179794f;
                if (ebVar == null) {
                    synchronized (C66115t.class) {
                        ebVar = f179794f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f179793d);
                            f179794f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
