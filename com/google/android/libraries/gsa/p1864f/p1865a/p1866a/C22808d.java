package com.google.android.libraries.gsa.p1864f.p1865a.p1866a;

import com.google.android.libraries.gsa.p1864f.p1865a.C22811d;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.gsa.f.a.a.d */
/* compiled from: PG */
public final class C22808d extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C22808d f62799d;

    /* renamed from: f */
    private static volatile C63010eb f62800f;

    /* renamed from: a */
    public C62971cq f62801a = emptyProtobufList();

    /* renamed from: b */
    public C62971cq f62802b = emptyProtobufList();

    /* renamed from: c */
    public C62971cq f62803c = emptyProtobufList();

    /* renamed from: e */
    private byte f62804e = 2;

    static {
        C22808d dVar = new C22808d();
        f62799d = dVar;
        C62942bv.registerDefaultInstance(C22808d.class, dVar);
    }

    private C22808d() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f62804e);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f62804e = b;
                return null;
            case 2:
                return newMessageInfo(f62799d, "\u0001\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0003\u0003\u0001Л\u0002Л\u0003Л", new Object[]{"a", C22811d.class, "b", C22806b.class, C45240c.f118157a, C22806b.class});
            case 3:
                return new C22808d();
            case 4:
                return new C22807c();
            case 5:
                return f62799d;
            case 6:
                C63010eb ebVar = f62800f;
                if (ebVar == null) {
                    synchronized (C22808d.class) {
                        ebVar = f62800f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f62799d);
                            f62800f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
