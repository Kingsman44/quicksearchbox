package com.google.android.libraries.gsa.p1864f.p1865a.p1866a;

import com.google.android.libraries.gsa.p1864f.p1865a.C22811d;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.gsa.f.a.a.b */
/* compiled from: PG */
public final class C22806b extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C22806b f62793d;

    /* renamed from: f */
    private static volatile C63010eb f62794f;

    /* renamed from: a */
    public int f62795a;

    /* renamed from: b */
    public C62971cq f62796b = emptyProtobufList();

    /* renamed from: c */
    public int f62797c;

    /* renamed from: e */
    private byte f62798e = 2;

    static {
        C22806b bVar = new C22806b();
        f62793d = bVar;
        C62942bv.registerDefaultInstance(C22806b.class, bVar);
    }

    private C22806b() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f62798e);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f62798e = b;
                return null;
            case 2:
                return newMessageInfo(f62793d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0001\u0001Л\u0002င\u0000", new Object[]{"a", "b", C22811d.class, C45240c.f118157a});
            case 3:
                return new C22806b();
            case 4:
                return new C22805a();
            case 5:
                return f62793d;
            case 6:
                C63010eb ebVar = f62794f;
                if (ebVar == null) {
                    synchronized (C22806b.class) {
                        ebVar = f62794f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f62793d);
                            f62794f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
