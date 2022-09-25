package com.google.protos.p4963bf.p4964a.p4965a;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.protos.bf.a.a.bk */
/* compiled from: PG */
public final class C64589bk extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C64589bk f175115e;

    /* renamed from: g */
    private static volatile C63010eb f175116g;

    /* renamed from: a */
    public int f175117a;

    /* renamed from: b */
    public int f175118b = 0;

    /* renamed from: c */
    public Object f175119c;

    /* renamed from: d */
    public int f175120d = 4;

    /* renamed from: f */
    private byte f175121f = 2;

    static {
        C64589bk bkVar = new C64589bk();
        f175115e = bkVar;
        C62942bv.registerDefaultInstance(C64589bk.class, bkVar);
    }

    private C64589bk() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f175121f);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f175121f = b;
                return null;
            case 2:
                return newMessageInfo(f175115e, "\u0001\u0003\u0001\u0001\u0001\u0003\u0003\u0000\u0000\u0001\u0001ဌ\u0000\u0002ြ\u0000\u0003ᐼ\u0000", new Object[]{C45240c.f118157a, "b", "a", "d", C64588bj.f175114a, C64585bg.class, C64587bi.class});
            case 3:
                return new C64589bk();
            case 4:
                return new C64579ba();
            case 5:
                return f175115e;
            case 6:
                C63010eb ebVar = f175116g;
                if (ebVar == null) {
                    synchronized (C64589bk.class) {
                        ebVar = f175116g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f175115e);
                            f175116g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
