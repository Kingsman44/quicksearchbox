package com.google.p4152bb.p4153a;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.bb.a.px */
/* compiled from: PG */
public final class C55371px extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C55371px f145907d;

    /* renamed from: f */
    private static volatile C63010eb f145908f;

    /* renamed from: a */
    public int f145909a;

    /* renamed from: b */
    public int f145910b;

    /* renamed from: c */
    public int f145911c;

    /* renamed from: e */
    private byte f145912e = 2;

    static {
        C55371px pxVar = new C55371px();
        f145907d = pxVar;
        C62942bv.registerDefaultInstance(C55371px.class, pxVar);
    }

    private C55371px() {
        emptyProtobufList();
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f145912e);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f145912e = b;
                return null;
            case 2:
                return newMessageInfo(f145907d, "\u0001\u0002\u0000\u0001\u0001\u0003\u0002\u0000\u0000\u0000\u0001င\u0000\u0003ဌ\u0002", new Object[]{"a", "b", C45240c.f118157a, C55370pw.m87679b()});
            case 3:
                return new C55371px();
            case 4:
                return new C55368pu();
            case 5:
                return f145907d;
            case 6:
                C63010eb ebVar = f145908f;
                if (ebVar == null) {
                    synchronized (C55371px.class) {
                        ebVar = f145908f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f145907d);
                            f145908f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
