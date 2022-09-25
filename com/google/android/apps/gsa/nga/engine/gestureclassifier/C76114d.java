package com.google.android.apps.gsa.nga.engine.gestureclassifier;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.nga.engine.gestureclassifier.d */
/* compiled from: PG */
public final class C76114d extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C76114d f211013d;

    /* renamed from: f */
    private static volatile C63010eb f211014f;

    /* renamed from: a */
    public int f211015a;

    /* renamed from: b */
    public C62971cq f211016b = emptyProtobufList();

    /* renamed from: c */
    public int f211017c;

    /* renamed from: e */
    private byte f211018e = 2;

    static {
        C76114d dVar = new C76114d();
        f211013d = dVar;
        C62942bv.registerDefaultInstance(C76114d.class, dVar);
    }

    private C76114d() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f211018e);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f211018e = b;
                return null;
            case 2:
                return newMessageInfo(f211013d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0001\u0001Л\u0002ဌ\u0000", new Object[]{"a", "b", C76118h.class, C45240c.f118157a, C76112b.f211012a});
            case 3:
                return new C76114d();
            case 4:
                return new C76111a();
            case 5:
                return f211013d;
            case 6:
                C63010eb ebVar = f211014f;
                if (ebVar == null) {
                    synchronized (C76114d.class) {
                        ebVar = f211014f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f211013d);
                            f211014f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
